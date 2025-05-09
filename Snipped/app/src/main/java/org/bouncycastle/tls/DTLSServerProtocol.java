package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.DTLSReliableHandshake;
import org.bouncycastle.tls.SessionParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class DTLSServerProtocol extends DTLSProtocol {
    protected boolean verifyRequests = true;

    public static class ServerHandshakeState {
        TlsServer server = null;
        TlsServerContextImpl serverContext = null;
        TlsSession tlsSession = null;
        SessionParameters sessionParameters = null;
        SessionParameters.Builder sessionParametersBuilder = null;
        int[] offeredCipherSuites = null;
        Hashtable clientExtensions = null;
        Hashtable serverExtensions = null;
        boolean resumedSession = false;
        boolean allowCertificateStatus = false;
        boolean expectSessionTicket = false;
        TlsKeyExchange keyExchange = null;
        TlsCredentials serverCredentials = null;
        CertificateRequest certificateRequest = null;
        TlsHeartbeat heartbeat = null;
        short heartbeatPolicy = 2;
    }

    public void abortServerHandshake(ServerHandshakeState serverHandshakeState, DTLSRecordLayer dTLSRecordLayer, short s10) {
        dTLSRecordLayer.fail(s10);
        invalidateSession(serverHandshakeState);
    }

    public DTLSTransport accept(TlsServer tlsServer, DatagramTransport datagramTransport) {
        return accept(tlsServer, datagramTransport, null);
    }

    public boolean expectCertificateVerifyMessage(ServerHandshakeState serverHandshakeState) {
        Certificate peerCertificate = serverHandshakeState.serverContext.getSecurityParametersHandshake().getPeerCertificate();
        return (peerCertificate == null || peerCertificate.isEmpty() || !serverHandshakeState.keyExchange.requiresCertificateVerify()) ? false : true;
    }

    public byte[] generateCertificateRequest(ServerHandshakeState serverHandshakeState, CertificateRequest certificateRequest) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        certificateRequest.encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generateCertificateStatus(ServerHandshakeState serverHandshakeState, CertificateStatus certificateStatus) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        certificateStatus.encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generateNewSessionTicket(ServerHandshakeState serverHandshakeState, NewSessionTicket newSessionTicket) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        newSessionTicket.encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generateServerHello(ServerHandshakeState serverHandshakeState, DTLSRecordLayer dTLSRecordLayer) {
        TlsServerContextImpl tlsServerContextImpl = serverHandshakeState.serverContext;
        SecurityParameters securityParametersHandshake = tlsServerContextImpl.getSecurityParametersHandshake();
        ProtocolVersion serverVersion = serverHandshakeState.server.getServerVersion();
        if (serverVersion == null || !ProtocolVersion.DTLSv10.isEqualOrEarlierVersionOf(serverVersion) || !ProtocolVersion.contains(tlsServerContextImpl.getClientSupportedVersions(), serverVersion)) {
            throw new TlsFatalAlert((short) 80);
        }
        securityParametersHandshake.negotiatedVersion = serverVersion;
        securityParametersHandshake.serverRandom = TlsProtocol.createRandomBlock(serverHandshakeState.server.shouldUseGMTUnixTime(), tlsServerContextImpl);
        if (!serverVersion.equals(ProtocolVersion.getLatestDTLS(serverHandshakeState.server.getProtocolVersions()))) {
            TlsUtils.writeDowngradeMarker(serverVersion, securityParametersHandshake.getServerRandom());
        }
        int selectedCipherSuite = serverHandshakeState.server.getSelectedCipherSuite();
        if (!Arrays.contains(serverHandshakeState.offeredCipherSuites, selectedCipherSuite) || selectedCipherSuite == 0 || CipherSuite.isSCSV(selectedCipherSuite) || !TlsUtils.isValidCipherSuiteForVersion(selectedCipherSuite, tlsServerContextImpl.getServerVersion())) {
            throw new TlsFatalAlert((short) 80);
        }
        securityParametersHandshake.cipherSuite = DTLSProtocol.validateSelectedCipherSuite(selectedCipherSuite, (short) 80);
        serverHandshakeState.serverExtensions = TlsExtensionsUtils.ensureExtensionsInitialised(serverHandshakeState.server.getServerExtensions());
        ProtocolVersion protocolVersion = ProtocolVersion.DTLSv12;
        if (serverVersion.isLaterVersionOf(protocolVersion)) {
            TlsExtensionsUtils.addSupportedVersionsExtensionServer(serverHandshakeState.serverExtensions, serverVersion);
            serverVersion = protocolVersion;
        }
        if (securityParametersHandshake.isSecureRenegotiation()) {
            Hashtable hashtable = serverHandshakeState.serverExtensions;
            Integer num = TlsProtocol.EXT_RenegotiationInfo;
            if (TlsUtils.getExtensionData(hashtable, num) == null) {
                serverHandshakeState.serverExtensions.put(num, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES));
            }
        }
        if (securityParametersHandshake.isExtendedMasterSecret()) {
            TlsExtensionsUtils.addExtendedMasterSecretExtension(serverHandshakeState.serverExtensions);
        }
        if (serverHandshakeState.heartbeat != null || 1 == serverHandshakeState.heartbeatPolicy) {
            TlsExtensionsUtils.addHeartbeatExtension(serverHandshakeState.serverExtensions, new HeartbeatExtension(serverHandshakeState.heartbeatPolicy));
        }
        securityParametersHandshake.applicationProtocol = TlsExtensionsUtils.getALPNExtensionServer(serverHandshakeState.serverExtensions);
        securityParametersHandshake.applicationProtocolSet = true;
        if (!serverHandshakeState.serverExtensions.isEmpty()) {
            securityParametersHandshake.encryptThenMAC = TlsExtensionsUtils.hasEncryptThenMACExtension(serverHandshakeState.serverExtensions);
            securityParametersHandshake.maxFragmentLength = DTLSProtocol.evaluateMaxFragmentLengthExtension(serverHandshakeState.resumedSession, serverHandshakeState.clientExtensions, serverHandshakeState.serverExtensions, (short) 80);
            securityParametersHandshake.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(serverHandshakeState.serverExtensions);
            serverHandshakeState.allowCertificateStatus = !serverHandshakeState.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(serverHandshakeState.serverExtensions, TlsExtensionsUtils.EXT_status_request, (short) 80);
            serverHandshakeState.expectSessionTicket = !serverHandshakeState.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(serverHandshakeState.serverExtensions, TlsProtocol.EXT_SessionTicket, (short) 80);
        }
        securityParametersHandshake.prfAlgorithm = TlsProtocol.getPRFAlgorithm(tlsServerContextImpl, securityParametersHandshake.getCipherSuite());
        securityParametersHandshake.verifyDataLength = 12;
        DTLSProtocol.applyMaxFragmentLengthExtension(dTLSRecordLayer, securityParametersHandshake.getMaxFragmentLength());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TlsUtils.writeVersion(serverVersion, byteArrayOutputStream);
        byteArrayOutputStream.write(securityParametersHandshake.getServerRandom());
        TlsUtils.writeOpaque8(serverHandshakeState.tlsSession.getSessionID(), byteArrayOutputStream);
        TlsUtils.writeUint16(securityParametersHandshake.getCipherSuite(), byteArrayOutputStream);
        TlsUtils.writeUint8((short) 0, (OutputStream) byteArrayOutputStream);
        TlsProtocol.writeExtensions(byteArrayOutputStream, serverHandshakeState.serverExtensions);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean getVerifyRequests() {
        return this.verifyRequests;
    }

    public void invalidateSession(ServerHandshakeState serverHandshakeState) {
        SessionParameters sessionParameters = serverHandshakeState.sessionParameters;
        if (sessionParameters != null) {
            sessionParameters.clear();
            serverHandshakeState.sessionParameters = null;
        }
        TlsSession tlsSession = serverHandshakeState.tlsSession;
        if (tlsSession != null) {
            tlsSession.invalidate();
            serverHandshakeState.tlsSession = null;
        }
    }

    public void notifyClientCertificate(ServerHandshakeState serverHandshakeState, Certificate certificate) {
        TlsUtils.processClientCertificate(serverHandshakeState.serverContext, certificate, serverHandshakeState.certificateRequest, serverHandshakeState.keyExchange, serverHandshakeState.server);
    }

    public void processCertificateVerify(ServerHandshakeState serverHandshakeState, byte[] bArr, TlsHandshakeHash tlsHandshakeHash) {
        if (serverHandshakeState.certificateRequest == null) {
            throw new IllegalStateException();
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        TlsServerContextImpl tlsServerContextImpl = serverHandshakeState.serverContext;
        DigitallySigned parse = DigitallySigned.parse(tlsServerContextImpl, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        TlsUtils.verifyCertificateVerify(tlsServerContextImpl, serverHandshakeState.certificateRequest, parse, tlsHandshakeHash);
    }

    public void processClientCertificate(ServerHandshakeState serverHandshakeState, byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        Certificate parse = Certificate.parse(serverHandshakeState.serverContext, byteArrayInputStream, null);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        notifyClientCertificate(serverHandshakeState, parse);
    }

    public void processClientHello(ServerHandshakeState serverHandshakeState, ClientHello clientHello) {
        ProtocolVersion clientVersion = clientHello.getClientVersion();
        serverHandshakeState.offeredCipherSuites = clientHello.getCipherSuites();
        serverHandshakeState.clientExtensions = clientHello.getExtensions();
        TlsServerContextImpl tlsServerContextImpl = serverHandshakeState.serverContext;
        SecurityParameters securityParametersHandshake = tlsServerContextImpl.getSecurityParametersHandshake();
        tlsServerContextImpl.setClientSupportedVersions(TlsExtensionsUtils.getSupportedVersionsExtensionClient(serverHandshakeState.clientExtensions));
        if (tlsServerContextImpl.getClientSupportedVersions() == null) {
            ProtocolVersion protocolVersion = ProtocolVersion.DTLSv12;
            if (clientVersion.isLaterVersionOf(protocolVersion)) {
                clientVersion = protocolVersion;
            }
            tlsServerContextImpl.setClientSupportedVersions(clientVersion.downTo(ProtocolVersion.DTLSv10));
        } else {
            clientVersion = ProtocolVersion.getLatestDTLS(tlsServerContextImpl.getClientSupportedVersions());
        }
        if (clientVersion == null || !ProtocolVersion.DTLSv10.isEqualOrEarlierVersionOf(clientVersion)) {
            throw new TlsFatalAlert((short) 47);
        }
        tlsServerContextImpl.setClientVersion(clientVersion);
        serverHandshakeState.server.notifyClientVersion(tlsServerContextImpl.getClientVersion());
        securityParametersHandshake.clientRandom = clientHello.getRandom();
        serverHandshakeState.server.notifyFallback(Arrays.contains(serverHandshakeState.offeredCipherSuites, CipherSuite.TLS_FALLBACK_SCSV));
        serverHandshakeState.server.notifyOfferedCipherSuites(serverHandshakeState.offeredCipherSuites);
        securityParametersHandshake.extendedMasterSecret = TlsExtensionsUtils.hasExtendedMasterSecretExtension(serverHandshakeState.clientExtensions);
        if (!securityParametersHandshake.isExtendedMasterSecret() && (serverHandshakeState.resumedSession || serverHandshakeState.server.requiresExtendedMasterSecret())) {
            throw new TlsFatalAlert((short) 40);
        }
        if (Arrays.contains(serverHandshakeState.offeredCipherSuites, 255)) {
            securityParametersHandshake.secureRenegotiation = true;
        }
        byte[] extensionData = TlsUtils.getExtensionData(serverHandshakeState.clientExtensions, TlsProtocol.EXT_RenegotiationInfo);
        if (extensionData != null) {
            securityParametersHandshake.secureRenegotiation = true;
            if (!Arrays.constantTimeAreEqual(extensionData, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES))) {
                throw new TlsFatalAlert((short) 40);
            }
        }
        serverHandshakeState.server.notifySecureRenegotiation(securityParametersHandshake.isSecureRenegotiation());
        Hashtable hashtable = serverHandshakeState.clientExtensions;
        if (hashtable != null) {
            TlsExtensionsUtils.getPaddingExtension(hashtable);
            securityParametersHandshake.clientServerNames = TlsExtensionsUtils.getServerNameExtensionClient(serverHandshakeState.clientExtensions);
            if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(clientVersion)) {
                securityParametersHandshake.clientSigAlgs = TlsExtensionsUtils.getSignatureAlgorithmsExtension(serverHandshakeState.clientExtensions);
                securityParametersHandshake.clientSigAlgsCert = TlsExtensionsUtils.getSignatureAlgorithmsCertExtension(serverHandshakeState.clientExtensions);
            }
            securityParametersHandshake.clientSupportedGroups = TlsExtensionsUtils.getSupportedGroupsExtension(serverHandshakeState.clientExtensions);
            HeartbeatExtension heartbeatExtension = TlsExtensionsUtils.getHeartbeatExtension(serverHandshakeState.clientExtensions);
            if (heartbeatExtension != null) {
                if (1 == heartbeatExtension.getMode()) {
                    serverHandshakeState.heartbeat = serverHandshakeState.server.getHeartbeat();
                }
                serverHandshakeState.heartbeatPolicy = serverHandshakeState.server.getHeartbeatPolicy();
            }
            serverHandshakeState.server.processClientExtensions(serverHandshakeState.clientExtensions);
        }
    }

    public void processClientKeyExchange(ServerHandshakeState serverHandshakeState, byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        serverHandshakeState.keyExchange.processClientKeyExchange(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
    }

    public void processClientSupplementalData(ServerHandshakeState serverHandshakeState, byte[] bArr) {
        serverHandshakeState.server.processClientSupplementalData(TlsProtocol.readSupplementalDataMessage(new ByteArrayInputStream(bArr)));
    }

    public DTLSTransport serverHandshake(ServerHandshakeState serverHandshakeState, DTLSRecordLayer dTLSRecordLayer, DTLSRequest dTLSRequest) {
        Certificate certificate;
        CertificateStatus certificateStatus;
        SecurityParameters securityParametersHandshake = serverHandshakeState.serverContext.getSecurityParametersHandshake();
        DTLSReliableHandshake dTLSReliableHandshake = new DTLSReliableHandshake(serverHandshakeState.serverContext, dTLSRecordLayer, serverHandshakeState.server.getHandshakeTimeoutMillis(), dTLSRequest);
        if (dTLSRequest == null) {
            DTLSReliableHandshake.Message receiveMessage = dTLSReliableHandshake.receiveMessage();
            if (receiveMessage.getType() != 1) {
                throw new TlsFatalAlert((short) 10);
            }
            processClientHello(serverHandshakeState, receiveMessage.getBody());
        } else {
            processClientHello(serverHandshakeState, dTLSRequest.getClientHello());
        }
        invalidateSession(serverHandshakeState);
        byte[] bArr = TlsUtils.EMPTY_BYTES;
        securityParametersHandshake.sessionID = bArr;
        serverHandshakeState.tlsSession = TlsUtils.importSession(securityParametersHandshake.getSessionID(), null);
        serverHandshakeState.sessionParameters = null;
        byte[] generateServerHello = generateServerHello(serverHandshakeState, dTLSRecordLayer);
        ProtocolVersion serverVersion = serverHandshakeState.serverContext.getServerVersion();
        dTLSRecordLayer.setReadVersion(serverVersion);
        dTLSRecordLayer.setWriteVersion(serverVersion);
        dTLSReliableHandshake.sendMessage((short) 2, generateServerHello);
        dTLSReliableHandshake.notifyHelloComplete();
        Vector serverSupplementalData = serverHandshakeState.server.getServerSupplementalData();
        if (serverSupplementalData != null) {
            dTLSReliableHandshake.sendMessage((short) 23, DTLSProtocol.generateSupplementalData(serverSupplementalData));
        }
        serverHandshakeState.keyExchange = TlsUtils.initKeyExchangeServer(serverHandshakeState.serverContext, serverHandshakeState.server);
        serverHandshakeState.serverCredentials = TlsProtocol.validateCredentials(serverHandshakeState.server.getCredentials());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TlsCredentials tlsCredentials = serverHandshakeState.serverCredentials;
        if (tlsCredentials == null) {
            serverHandshakeState.keyExchange.skipServerCredentials();
            certificate = null;
        } else {
            serverHandshakeState.keyExchange.processServerCredentials(tlsCredentials);
            certificate = serverHandshakeState.serverCredentials.getCertificate();
            DTLSProtocol.sendCertificateMessage(serverHandshakeState.serverContext, dTLSReliableHandshake, certificate, byteArrayOutputStream);
        }
        securityParametersHandshake.tlsServerEndPoint = byteArrayOutputStream.toByteArray();
        if (certificate == null || certificate.isEmpty()) {
            serverHandshakeState.allowCertificateStatus = false;
        }
        if (serverHandshakeState.allowCertificateStatus && (certificateStatus = serverHandshakeState.server.getCertificateStatus()) != null) {
            dTLSReliableHandshake.sendMessage((short) 22, generateCertificateStatus(serverHandshakeState, certificateStatus));
        }
        byte[] generateServerKeyExchange = serverHandshakeState.keyExchange.generateServerKeyExchange();
        if (generateServerKeyExchange != null) {
            dTLSReliableHandshake.sendMessage((short) 12, generateServerKeyExchange);
        }
        if (serverHandshakeState.serverCredentials != null) {
            CertificateRequest certificateRequest = serverHandshakeState.server.getCertificateRequest();
            serverHandshakeState.certificateRequest = certificateRequest;
            if (certificateRequest != null) {
                if (TlsUtils.isTLSv12(serverHandshakeState.serverContext) != (serverHandshakeState.certificateRequest.getSupportedSignatureAlgorithms() != null)) {
                    throw new TlsFatalAlert((short) 80);
                }
                CertificateRequest validateCertificateRequest = TlsUtils.validateCertificateRequest(serverHandshakeState.certificateRequest, serverHandshakeState.keyExchange);
                serverHandshakeState.certificateRequest = validateCertificateRequest;
                dTLSReliableHandshake.sendMessage((short) 13, generateCertificateRequest(serverHandshakeState, validateCertificateRequest));
                TlsUtils.trackHashAlgorithms(dTLSReliableHandshake.getHandshakeHash(), serverHandshakeState.certificateRequest.getSupportedSignatureAlgorithms());
            }
        }
        dTLSReliableHandshake.sendMessage((short) 14, bArr);
        TlsUtils.sealHandshakeHash(serverHandshakeState.serverContext, dTLSReliableHandshake.getHandshakeHash(), false);
        DTLSReliableHandshake.Message receiveMessage2 = dTLSReliableHandshake.receiveMessage();
        if (receiveMessage2.getType() == 23) {
            processClientSupplementalData(serverHandshakeState, receiveMessage2.getBody());
            receiveMessage2 = dTLSReliableHandshake.receiveMessage();
        } else {
            serverHandshakeState.server.processClientSupplementalData(null);
        }
        if (serverHandshakeState.certificateRequest == null) {
            serverHandshakeState.keyExchange.skipClientCredentials();
        } else if (receiveMessage2.getType() == 11) {
            processClientCertificate(serverHandshakeState, receiveMessage2.getBody());
            receiveMessage2 = dTLSReliableHandshake.receiveMessage();
        } else {
            if (TlsUtils.isTLSv12(serverHandshakeState.serverContext)) {
                throw new TlsFatalAlert((short) 10);
            }
            notifyClientCertificate(serverHandshakeState, Certificate.EMPTY_CHAIN);
        }
        if (receiveMessage2.getType() != 16) {
            throw new TlsFatalAlert((short) 10);
        }
        processClientKeyExchange(serverHandshakeState, receiveMessage2.getBody());
        TlsHandshakeHash prepareToFinish = dTLSReliableHandshake.prepareToFinish();
        securityParametersHandshake.sessionHash = TlsUtils.getCurrentPRFHash(prepareToFinish);
        TlsProtocol.establishMasterSecret(serverHandshakeState.serverContext, serverHandshakeState.keyExchange);
        dTLSRecordLayer.initPendingEpoch(TlsUtils.initCipher(serverHandshakeState.serverContext));
        if (expectCertificateVerifyMessage(serverHandshakeState)) {
            processCertificateVerify(serverHandshakeState, dTLSReliableHandshake.receiveMessageBody((short) 15), prepareToFinish);
        }
        securityParametersHandshake.peerVerifyData = DTLSProtocol.createVerifyData(serverHandshakeState.serverContext, dTLSReliableHandshake, false);
        processFinished(dTLSReliableHandshake.receiveMessageBody((short) 20), securityParametersHandshake.getPeerVerifyData());
        if (serverHandshakeState.expectSessionTicket) {
            dTLSReliableHandshake.sendMessage((short) 4, generateNewSessionTicket(serverHandshakeState, serverHandshakeState.server.getNewSessionTicket()));
        }
        securityParametersHandshake.localVerifyData = DTLSProtocol.createVerifyData(serverHandshakeState.serverContext, dTLSReliableHandshake, true);
        dTLSReliableHandshake.sendMessage((short) 20, securityParametersHandshake.getLocalVerifyData());
        dTLSReliableHandshake.finish();
        serverHandshakeState.sessionParameters = new SessionParameters.Builder().setCipherSuite(securityParametersHandshake.getCipherSuite()).setCompressionAlgorithm(securityParametersHandshake.getCompressionAlgorithm()).setExtendedMasterSecret(securityParametersHandshake.isExtendedMasterSecret()).setLocalCertificate(securityParametersHandshake.getLocalCertificate()).setMasterSecret(serverHandshakeState.serverContext.getCrypto().adoptSecret(securityParametersHandshake.getMasterSecret())).setNegotiatedVersion(securityParametersHandshake.getNegotiatedVersion()).setPeerCertificate(securityParametersHandshake.getPeerCertificate()).setPSKIdentity(securityParametersHandshake.getPSKIdentity()).setSRPIdentity(securityParametersHandshake.getSRPIdentity()).setServerExtensions(serverHandshakeState.serverExtensions).build();
        serverHandshakeState.tlsSession = TlsUtils.importSession(serverHandshakeState.tlsSession.getSessionID(), serverHandshakeState.sessionParameters);
        securityParametersHandshake.tlsUnique = securityParametersHandshake.getPeerVerifyData();
        serverHandshakeState.serverContext.handshakeComplete(serverHandshakeState.server, serverHandshakeState.tlsSession);
        dTLSRecordLayer.initHeartbeat(serverHandshakeState.heartbeat, 1 == serverHandshakeState.heartbeatPolicy);
        return new DTLSTransport(dTLSRecordLayer);
    }

    public void setVerifyRequests(boolean z10) {
        this.verifyRequests = z10;
    }

    public DTLSTransport accept(TlsServer tlsServer, DatagramTransport datagramTransport, DTLSRequest dTLSRequest) {
        if (tlsServer == null) {
            throw new IllegalArgumentException("'server' cannot be null");
        }
        if (datagramTransport == null) {
            throw new IllegalArgumentException("'transport' cannot be null");
        }
        ServerHandshakeState serverHandshakeState = new ServerHandshakeState();
        serverHandshakeState.server = tlsServer;
        TlsServerContextImpl tlsServerContextImpl = new TlsServerContextImpl(tlsServer.getCrypto());
        serverHandshakeState.serverContext = tlsServerContextImpl;
        tlsServer.init(tlsServerContextImpl);
        serverHandshakeState.serverContext.handshakeBeginning(tlsServer);
        SecurityParameters securityParametersHandshake = serverHandshakeState.serverContext.getSecurityParametersHandshake();
        securityParametersHandshake.extendedPadding = tlsServer.shouldUseExtendedPadding();
        DTLSRecordLayer dTLSRecordLayer = new DTLSRecordLayer(serverHandshakeState.serverContext, serverHandshakeState.server, datagramTransport);
        tlsServer.notifyCloseHandle(dTLSRecordLayer);
        try {
            try {
                try {
                    try {
                        return serverHandshake(serverHandshakeState, dTLSRecordLayer, dTLSRequest);
                    } catch (IOException e10) {
                        abortServerHandshake(serverHandshakeState, dTLSRecordLayer, (short) 80);
                        throw e10;
                    }
                } catch (TlsFatalAlert e11) {
                    abortServerHandshake(serverHandshakeState, dTLSRecordLayer, e11.getAlertDescription());
                    throw e11;
                }
            } catch (RuntimeException e12) {
                abortServerHandshake(serverHandshakeState, dTLSRecordLayer, (short) 80);
                throw new TlsFatalAlert((short) 80, e12);
            }
        } finally {
            securityParametersHandshake.clear();
        }
    }

    public void processClientHello(ServerHandshakeState serverHandshakeState, byte[] bArr) {
        processClientHello(serverHandshakeState, ClientHello.parse(new ByteArrayInputStream(bArr), NullOutputStream.INSTANCE));
    }
}
