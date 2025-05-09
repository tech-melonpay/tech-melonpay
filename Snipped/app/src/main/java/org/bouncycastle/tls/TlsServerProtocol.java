package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.TlsProtocol;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class TlsServerProtocol extends TlsProtocol {
    protected CertificateRequest certificateRequest;
    protected TlsKeyExchange keyExchange;
    protected TlsHandshakeHash prepareFinishHash;
    protected TlsCredentials serverCredentials;
    protected TlsServer tlsServer;
    TlsServerContextImpl tlsServerContext;

    public TlsServerProtocol() {
        this.tlsServer = null;
        this.tlsServerContext = null;
        this.keyExchange = null;
        this.serverCredentials = null;
        this.certificateRequest = null;
        this.prepareFinishHash = null;
    }

    public void accept(TlsServer tlsServer) {
        if (tlsServer == null) {
            throw new IllegalArgumentException("'tlsServer' cannot be null");
        }
        if (this.tlsServer != null) {
            throw new IllegalStateException("'accept' can only be called once");
        }
        this.tlsServer = tlsServer;
        TlsServerContextImpl tlsServerContextImpl = new TlsServerContextImpl(tlsServer.getCrypto());
        this.tlsServerContext = tlsServerContextImpl;
        this.tlsServer.init(tlsServerContextImpl);
        this.recordStream.init(this.tlsServerContext);
        tlsServer.notifyCloseHandle(this);
        beginHandshake(false);
        if (this.blocking) {
            blockForHandshake();
        }
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public void cleanupHandshake() {
        super.cleanupHandshake();
        this.keyExchange = null;
        this.serverCredentials = null;
        this.certificateRequest = null;
        this.prepareFinishHash = null;
    }

    public boolean expectCertificateVerifyMessage() {
        Certificate peerCertificate = this.tlsServerContext.getSecurityParametersHandshake().getPeerCertificate();
        return (peerCertificate == null || peerCertificate.isEmpty() || !this.keyExchange.requiresCertificateVerify()) ? false : true;
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public TlsContext getContext() {
        return this.tlsServerContext;
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public AbstractTlsContext getContextAdmin() {
        return this.tlsServerContext;
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public TlsPeer getPeer() {
        return this.tlsServer;
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public void handleAlertWarningMessage(short s10) {
        super.handleAlertWarningMessage(s10);
        if (s10 == 41) {
            throw new TlsFatalAlert((short) 10);
        }
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public void handleHandshakeMessage(short s10, ByteArrayInputStream byteArrayInputStream) {
        CertificateStatus certificateStatus;
        Certificate certificate = null;
        if (s10 == 1) {
            short s11 = this.connection_state;
            if (s11 != 0) {
                if (s11 != 16) {
                    throw new TlsFatalAlert((short) 10);
                }
                if (!handleRenegotiation()) {
                    return;
                }
            }
            SecurityParameters securityParametersHandshake = this.tlsServerContext.getSecurityParametersHandshake();
            receiveClientHelloMessage(byteArrayInputStream);
            this.connection_state = (short) 1;
            invalidateSession();
            securityParametersHandshake.sessionID = TlsUtils.EMPTY_BYTES;
            this.tlsSession = TlsUtils.importSession(securityParametersHandshake.getSessionID(), null);
            this.sessionParameters = null;
            sendServerHelloMessage();
            this.connection_state = (short) 2;
            this.recordStream.notifyHelloComplete();
            Vector serverSupplementalData = this.tlsServer.getServerSupplementalData();
            if (serverSupplementalData != null) {
                sendSupplementalDataMessage(serverSupplementalData);
            }
            this.connection_state = (short) 3;
            this.keyExchange = TlsUtils.initKeyExchangeServer(this.tlsServerContext, this.tlsServer);
            this.serverCredentials = TlsProtocol.validateCredentials(this.tlsServer.getCredentials());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            TlsCredentials tlsCredentials = this.serverCredentials;
            if (tlsCredentials == null) {
                this.keyExchange.skipServerCredentials();
            } else {
                this.keyExchange.processServerCredentials(tlsCredentials);
                certificate = this.serverCredentials.getCertificate();
                sendCertificateMessage(certificate, byteArrayOutputStream);
            }
            securityParametersHandshake.tlsServerEndPoint = byteArrayOutputStream.toByteArray();
            this.connection_state = (short) 4;
            if (certificate == null || certificate.isEmpty()) {
                this.allowCertificateStatus = false;
            }
            if (this.allowCertificateStatus && (certificateStatus = this.tlsServer.getCertificateStatus()) != null) {
                sendCertificateStatusMessage(certificateStatus);
            }
            this.connection_state = (short) 5;
            byte[] generateServerKeyExchange = this.keyExchange.generateServerKeyExchange();
            if (generateServerKeyExchange != null) {
                sendServerKeyExchangeMessage(generateServerKeyExchange);
            }
            this.connection_state = (short) 6;
            if (this.serverCredentials != null) {
                CertificateRequest certificateRequest = this.tlsServer.getCertificateRequest();
                this.certificateRequest = certificateRequest;
                if (certificateRequest != null) {
                    if (TlsUtils.isTLSv12(getContext()) != (this.certificateRequest.getSupportedSignatureAlgorithms() != null)) {
                        throw new TlsFatalAlert((short) 80);
                    }
                    CertificateRequest validateCertificateRequest = TlsUtils.validateCertificateRequest(this.certificateRequest, this.keyExchange);
                    this.certificateRequest = validateCertificateRequest;
                    sendCertificateRequestMessage(validateCertificateRequest);
                    TlsUtils.trackHashAlgorithms(this.recordStream.getHandshakeHash(), this.certificateRequest.getSupportedSignatureAlgorithms());
                }
            }
            this.connection_state = (short) 7;
            sendServerHelloDoneMessage();
            this.connection_state = (short) 8;
            TlsUtils.sealHandshakeHash(getContext(), this.recordStream.getHandshakeHash(), false);
            return;
        }
        if (s10 == 11) {
            short s12 = this.connection_state;
            if (s12 == 8) {
                this.tlsServer.processClientSupplementalData(null);
            } else if (s12 != 9) {
                throw new TlsFatalAlert((short) 10);
            }
            if (this.certificateRequest == null) {
                throw new TlsFatalAlert((short) 10);
            }
            receiveCertificateMessage(byteArrayInputStream);
            this.connection_state = (short) 10;
            return;
        }
        if (s10 == 20) {
            short s13 = this.connection_state;
            if (s13 != 11) {
                if (s13 != 12) {
                    throw new TlsFatalAlert((short) 10);
                }
            } else if (expectCertificateVerifyMessage()) {
                throw new TlsFatalAlert((short) 10);
            }
            processFinishedMessage(byteArrayInputStream);
            this.connection_state = (short) 13;
            if (this.expectSessionTicket) {
                sendNewSessionTicketMessage(this.tlsServer.getNewSessionTicket());
            }
            this.connection_state = (short) 14;
            sendChangeCipherSpecMessage();
            sendFinishedMessage();
            this.connection_state = (short) 15;
            completeHandshake();
            return;
        }
        if (s10 == 23) {
            if (this.connection_state != 8) {
                throw new TlsFatalAlert((short) 10);
            }
            this.tlsServer.processClientSupplementalData(TlsProtocol.readSupplementalDataMessage(byteArrayInputStream));
            this.connection_state = (short) 9;
            return;
        }
        if (s10 == 15) {
            if (this.connection_state != 11) {
                throw new TlsFatalAlert((short) 10);
            }
            if (!expectCertificateVerifyMessage()) {
                throw new TlsFatalAlert((short) 10);
            }
            receiveCertificateVerifyMessage(byteArrayInputStream);
            this.connection_state = (short) 12;
            return;
        }
        if (s10 != 16) {
            throw new TlsFatalAlert((short) 10);
        }
        switch (this.connection_state) {
            case 8:
                this.tlsServer.processClientSupplementalData(null);
            case 9:
                if (this.certificateRequest == null) {
                    this.keyExchange.skipClientCredentials();
                } else {
                    if (TlsUtils.isTLSv12(getContext())) {
                        throw new TlsFatalAlert((short) 10);
                    }
                    notifyClientCertificate(Certificate.EMPTY_CHAIN);
                }
            case 10:
                receiveClientKeyExchangeMessage(byteArrayInputStream);
                this.connection_state = (short) 11;
                return;
            default:
                throw new TlsFatalAlert((short) 10);
        }
    }

    public void notifyClientCertificate(Certificate certificate) {
        TlsUtils.processClientCertificate(this.tlsServerContext, certificate, this.certificateRequest, this.keyExchange, this.tlsServer);
    }

    public void receiveCertificateMessage(ByteArrayInputStream byteArrayInputStream) {
        Certificate parse = Certificate.parse(getContext(), byteArrayInputStream, null);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        notifyClientCertificate(parse);
    }

    public void receiveCertificateVerifyMessage(ByteArrayInputStream byteArrayInputStream) {
        if (this.certificateRequest == null) {
            throw new IllegalStateException();
        }
        DigitallySigned parse = DigitallySigned.parse(this.tlsServerContext, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        TlsUtils.verifyCertificateVerify(this.tlsServerContext, this.certificateRequest, parse, this.prepareFinishHash);
    }

    public void receiveClientHelloMessage(ByteArrayInputStream byteArrayInputStream) {
        RecordStream recordStream = this.recordStream;
        ProtocolVersion protocolVersion = ProtocolVersion.TLSv10;
        recordStream.setWriteVersion(protocolVersion);
        ClientHello parse = ClientHello.parse(byteArrayInputStream, null);
        ProtocolVersion clientVersion = parse.getClientVersion();
        this.offeredCipherSuites = parse.getCipherSuites();
        this.clientExtensions = parse.getExtensions();
        SecurityParameters securityParametersHandshake = this.tlsServerContext.getSecurityParametersHandshake();
        this.tlsServerContext.setClientSupportedVersions(TlsExtensionsUtils.getSupportedVersionsExtensionClient(this.clientExtensions));
        if (this.tlsServerContext.getClientSupportedVersions() == null) {
            ProtocolVersion protocolVersion2 = ProtocolVersion.TLSv12;
            if (clientVersion.isLaterVersionOf(protocolVersion2)) {
                clientVersion = protocolVersion2;
            }
            this.tlsServerContext.setClientSupportedVersions(clientVersion.downTo(protocolVersion));
        } else {
            clientVersion = ProtocolVersion.getLatestTLS(this.tlsServerContext.getClientSupportedVersions());
        }
        if (clientVersion == null || !protocolVersion.isEqualOrEarlierVersionOf(clientVersion)) {
            throw new TlsFatalAlert((short) 47);
        }
        if (!securityParametersHandshake.isRenegotiating()) {
            this.tlsServerContext.setClientVersion(clientVersion);
        } else if (!clientVersion.equals(this.tlsServerContext.getClientVersion()) && !clientVersion.equals(this.tlsServerContext.getServerVersion())) {
            throw new TlsFatalAlert((short) 47);
        }
        this.tlsServer.notifyClientVersion(this.tlsServerContext.getClientVersion());
        securityParametersHandshake.clientRandom = parse.getRandom();
        this.tlsServer.notifyFallback(Arrays.contains(this.offeredCipherSuites, CipherSuite.TLS_FALLBACK_SCSV));
        this.tlsServer.notifyOfferedCipherSuites(this.offeredCipherSuites);
        securityParametersHandshake.extendedMasterSecret = TlsExtensionsUtils.hasExtendedMasterSecretExtension(this.clientExtensions);
        if (!securityParametersHandshake.isExtendedMasterSecret() && (this.resumedSession || this.tlsServer.requiresExtendedMasterSecret())) {
            throw new TlsFatalAlert((short) 40);
        }
        byte[] extensionData = TlsUtils.getExtensionData(this.clientExtensions, TlsProtocol.EXT_RenegotiationInfo);
        if (!securityParametersHandshake.isRenegotiating()) {
            if (Arrays.contains(this.offeredCipherSuites, 255)) {
                securityParametersHandshake.secureRenegotiation = true;
            }
            if (extensionData != null) {
                securityParametersHandshake.secureRenegotiation = true;
                if (!Arrays.constantTimeAreEqual(extensionData, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES))) {
                    throw new TlsFatalAlert((short) 40);
                }
            }
        } else {
            if (!securityParametersHandshake.isSecureRenegotiation()) {
                throw new TlsFatalAlert((short) 80);
            }
            if (Arrays.contains(this.offeredCipherSuites, 255)) {
                throw new TlsFatalAlert((short) 40);
            }
            if (extensionData == null) {
                throw new TlsFatalAlert((short) 40);
            }
            if (!Arrays.constantTimeAreEqual(extensionData, TlsProtocol.createRenegotiationInfo(this.tlsServerContext.getSecurityParametersConnection().getPeerVerifyData()))) {
                throw new TlsFatalAlert((short) 40);
            }
        }
        this.tlsServer.notifySecureRenegotiation(securityParametersHandshake.isSecureRenegotiation());
        Hashtable hashtable = this.clientExtensions;
        if (hashtable != null) {
            TlsExtensionsUtils.getPaddingExtension(hashtable);
            securityParametersHandshake.clientServerNames = TlsExtensionsUtils.getServerNameExtensionClient(this.clientExtensions);
            if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(clientVersion)) {
                securityParametersHandshake.clientSigAlgs = TlsExtensionsUtils.getSignatureAlgorithmsExtension(this.clientExtensions);
                securityParametersHandshake.clientSigAlgsCert = TlsExtensionsUtils.getSignatureAlgorithmsCertExtension(this.clientExtensions);
            }
            securityParametersHandshake.clientSupportedGroups = TlsExtensionsUtils.getSupportedGroupsExtension(this.clientExtensions);
            this.tlsServer.processClientExtensions(this.clientExtensions);
        }
    }

    public void receiveClientKeyExchangeMessage(ByteArrayInputStream byteArrayInputStream) {
        this.keyExchange.processClientKeyExchange(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        this.prepareFinishHash = this.recordStream.prepareToFinish();
        this.tlsServerContext.getSecurityParametersHandshake().sessionHash = TlsUtils.getCurrentPRFHash(this.prepareFinishHash);
        TlsProtocol.establishMasterSecret(getContext(), this.keyExchange);
        this.recordStream.setPendingConnectionState(TlsUtils.initCipher(getContext()));
    }

    public void sendCertificateRequestMessage(CertificateRequest certificateRequest) {
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 13);
        certificateRequest.encode(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    public void sendCertificateStatusMessage(CertificateStatus certificateStatus) {
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 22);
        certificateStatus.encode(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    public void sendHelloRequestMessage() {
        byte[] bArr = new byte[4];
        TlsUtils.writeUint8((short) 0, bArr, 0);
        TlsUtils.writeUint24(0, bArr, 1);
        writeHandshakeMessage(bArr, 0, 4);
    }

    public void sendNewSessionTicketMessage(NewSessionTicket newSessionTicket) {
        if (newSessionTicket == null) {
            throw new TlsFatalAlert((short) 80);
        }
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 4);
        newSessionTicket.encode(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    public void sendServerHelloDoneMessage() {
        byte[] bArr = new byte[4];
        TlsUtils.writeUint8((short) 14, bArr, 0);
        TlsUtils.writeUint24(0, bArr, 1);
        writeHandshakeMessage(bArr, 0, 4);
    }

    public void sendServerHelloMessage() {
        ProtocolVersion serverVersion;
        SecurityParameters securityParametersHandshake = this.tlsServerContext.getSecurityParametersHandshake();
        if (!securityParametersHandshake.isRenegotiating()) {
            serverVersion = this.tlsServer.getServerVersion();
            if (serverVersion != null && !serverVersion.isEarlierVersionOf(ProtocolVersion.TLSv10)) {
                ProtocolVersion protocolVersion = ProtocolVersion.TLSv12;
                if (!serverVersion.isLaterVersionOf(protocolVersion) && ProtocolVersion.contains(this.tlsServerContext.getClientSupportedVersions(), serverVersion)) {
                    if (!serverVersion.isLaterVersionOf(protocolVersion)) {
                        protocolVersion = serverVersion;
                    }
                    this.recordStream.setWriteVersion(protocolVersion);
                    securityParametersHandshake.negotiatedVersion = serverVersion;
                }
            }
            throw new TlsFatalAlert((short) 80);
        }
        serverVersion = this.tlsServerContext.getServerVersion();
        securityParametersHandshake.serverRandom = TlsProtocol.createRandomBlock(this.tlsServer.shouldUseGMTUnixTime(), this.tlsServerContext);
        if (!serverVersion.equals(ProtocolVersion.getLatestTLS(this.tlsServer.getProtocolVersions()))) {
            TlsUtils.writeDowngradeMarker(serverVersion, securityParametersHandshake.getServerRandom());
        }
        int selectedCipherSuite = this.tlsServer.getSelectedCipherSuite();
        if (!Arrays.contains(this.offeredCipherSuites, selectedCipherSuite) || selectedCipherSuite == 0 || CipherSuite.isSCSV(selectedCipherSuite) || !TlsUtils.isValidCipherSuiteForVersion(selectedCipherSuite, this.tlsServerContext.getServerVersion())) {
            throw new TlsFatalAlert((short) 80);
        }
        securityParametersHandshake.cipherSuite = selectedCipherSuite;
        this.serverExtensions = TlsExtensionsUtils.ensureExtensionsInitialised(this.tlsServer.getServerExtensions());
        ProtocolVersion protocolVersion2 = ProtocolVersion.TLSv12;
        if (serverVersion.isLaterVersionOf(protocolVersion2)) {
            TlsExtensionsUtils.addSupportedVersionsExtensionServer(this.serverExtensions, serverVersion);
            serverVersion = protocolVersion2;
        }
        if (securityParametersHandshake.isRenegotiating()) {
            if (!securityParametersHandshake.isSecureRenegotiation()) {
                throw new TlsFatalAlert((short) 80);
            }
            SecurityParameters securityParametersConnection = this.tlsServerContext.getSecurityParametersConnection();
            this.serverExtensions.put(TlsProtocol.EXT_RenegotiationInfo, TlsProtocol.createRenegotiationInfo(TlsUtils.concat(securityParametersConnection.getPeerVerifyData(), securityParametersConnection.getLocalVerifyData())));
        } else if (securityParametersHandshake.isSecureRenegotiation()) {
            Hashtable hashtable = this.serverExtensions;
            Integer num = TlsProtocol.EXT_RenegotiationInfo;
            if (TlsUtils.getExtensionData(hashtable, num) == null) {
                this.serverExtensions.put(num, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES));
            }
        }
        if (securityParametersHandshake.isExtendedMasterSecret()) {
            TlsExtensionsUtils.addExtendedMasterSecretExtension(this.serverExtensions);
        }
        securityParametersHandshake.applicationProtocol = TlsExtensionsUtils.getALPNExtensionServer(this.serverExtensions);
        securityParametersHandshake.applicationProtocolSet = true;
        if (!this.serverExtensions.isEmpty()) {
            securityParametersHandshake.encryptThenMAC = TlsExtensionsUtils.hasEncryptThenMACExtension(this.serverExtensions);
            securityParametersHandshake.maxFragmentLength = processMaxFragmentLengthExtension(this.clientExtensions, this.serverExtensions, (short) 80);
            securityParametersHandshake.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(this.serverExtensions);
            this.allowCertificateStatus = !this.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(this.serverExtensions, TlsExtensionsUtils.EXT_status_request, (short) 80);
            this.expectSessionTicket = !this.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(this.serverExtensions, TlsProtocol.EXT_SessionTicket, (short) 80);
        }
        securityParametersHandshake.prfAlgorithm = TlsProtocol.getPRFAlgorithm(this.tlsServerContext, securityParametersHandshake.getCipherSuite());
        securityParametersHandshake.verifyDataLength = 12;
        applyMaxFragmentLengthExtension();
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 2);
        TlsUtils.writeVersion(serverVersion, handshakeMessage);
        handshakeMessage.write(securityParametersHandshake.getServerRandom());
        TlsUtils.writeOpaque8(this.tlsSession.getSessionID(), handshakeMessage);
        TlsUtils.writeUint16(securityParametersHandshake.getCipherSuite(), handshakeMessage);
        TlsUtils.writeUint8((short) 0, (OutputStream) handshakeMessage);
        TlsProtocol.writeExtensions(handshakeMessage, this.serverExtensions);
        handshakeMessage.writeToRecordStream();
    }

    public void sendServerKeyExchangeMessage(byte[] bArr) {
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage((short) 12, bArr.length);
        handshakeMessage.write(bArr);
        handshakeMessage.writeToRecordStream();
    }

    public TlsServerProtocol(InputStream inputStream, OutputStream outputStream) {
        super(inputStream, outputStream);
        this.tlsServer = null;
        this.tlsServerContext = null;
        this.keyExchange = null;
        this.serverCredentials = null;
        this.certificateRequest = null;
        this.prepareFinishHash = null;
    }
}
