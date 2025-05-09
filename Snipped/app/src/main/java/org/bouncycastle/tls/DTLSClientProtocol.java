package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.tls.SessionParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class DTLSClientProtocol extends DTLSProtocol {

    public static class ClientHandshakeState {
        TlsClient client = null;
        TlsClientContextImpl clientContext = null;
        TlsSession tlsSession = null;
        SessionParameters sessionParameters = null;
        SessionParameters.Builder sessionParametersBuilder = null;
        int[] offeredCipherSuites = null;
        Hashtable clientExtensions = null;
        Hashtable serverExtensions = null;
        boolean resumedSession = false;
        boolean allowCertificateStatus = false;
        boolean expectSessionTicket = false;
        Hashtable clientAgreements = null;
        TlsKeyExchange keyExchange = null;
        TlsAuthentication authentication = null;
        CertificateStatus certificateStatus = null;
        CertificateRequest certificateRequest = null;
        TlsCredentials clientCredentials = null;
        TlsHeartbeat heartbeat = null;
        short heartbeatPolicy = 2;
    }

    public static byte[] patchClientHelloWithCookie(byte[] bArr, byte[] bArr2) {
        short readUint8 = TlsUtils.readUint8(bArr, 34);
        int i = 35 + readUint8;
        int i9 = readUint8 + 36;
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, i);
        TlsUtils.checkUint8(bArr2.length);
        TlsUtils.writeUint8(bArr2.length, bArr3, i);
        System.arraycopy(bArr2, 0, bArr3, i9, bArr2.length);
        System.arraycopy(bArr, i9, bArr3, bArr2.length + i9, bArr.length - i9);
        return bArr3;
    }

    public void abortClientHandshake(ClientHandshakeState clientHandshakeState, DTLSRecordLayer dTLSRecordLayer, short s10) {
        dTLSRecordLayer.fail(s10);
        invalidateSession(clientHandshakeState);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.bouncycastle.tls.DTLSTransport clientHandshake(org.bouncycastle.tls.DTLSClientProtocol.ClientHandshakeState r22, org.bouncycastle.tls.DTLSRecordLayer r23) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tls.DTLSClientProtocol.clientHandshake(org.bouncycastle.tls.DTLSClientProtocol$ClientHandshakeState, org.bouncycastle.tls.DTLSRecordLayer):org.bouncycastle.tls.DTLSTransport");
    }

    public DTLSTransport connect(TlsClient tlsClient, DatagramTransport datagramTransport) {
        SessionParameters exportSessionParameters;
        if (tlsClient == null) {
            throw new IllegalArgumentException("'client' cannot be null");
        }
        if (datagramTransport == null) {
            throw new IllegalArgumentException("'transport' cannot be null");
        }
        ClientHandshakeState clientHandshakeState = new ClientHandshakeState();
        clientHandshakeState.client = tlsClient;
        TlsClientContextImpl tlsClientContextImpl = new TlsClientContextImpl(tlsClient.getCrypto());
        clientHandshakeState.clientContext = tlsClientContextImpl;
        tlsClient.init(tlsClientContextImpl);
        clientHandshakeState.clientContext.handshakeBeginning(tlsClient);
        SecurityParameters securityParametersHandshake = clientHandshakeState.clientContext.getSecurityParametersHandshake();
        securityParametersHandshake.extendedPadding = tlsClient.shouldUseExtendedPadding();
        TlsSession sessionToResume = clientHandshakeState.client.getSessionToResume();
        if (sessionToResume != null && sessionToResume.isResumable() && (exportSessionParameters = sessionToResume.exportSessionParameters()) != null && exportSessionParameters.isExtendedMasterSecret()) {
            clientHandshakeState.tlsSession = sessionToResume;
            clientHandshakeState.sessionParameters = exportSessionParameters;
        }
        DTLSRecordLayer dTLSRecordLayer = new DTLSRecordLayer(clientHandshakeState.clientContext, clientHandshakeState.client, datagramTransport);
        tlsClient.notifyCloseHandle(dTLSRecordLayer);
        try {
            try {
                try {
                    return clientHandshake(clientHandshakeState, dTLSRecordLayer);
                } catch (IOException e10) {
                    abortClientHandshake(clientHandshakeState, dTLSRecordLayer, (short) 80);
                    throw e10;
                } catch (RuntimeException e11) {
                    abortClientHandshake(clientHandshakeState, dTLSRecordLayer, (short) 80);
                    throw new TlsFatalAlert((short) 80, e11);
                }
            } catch (TlsFatalAlert e12) {
                abortClientHandshake(clientHandshakeState, dTLSRecordLayer, e12.getAlertDescription());
                throw e12;
            }
        } finally {
            securityParametersHandshake.clear();
        }
    }

    public byte[] generateCertificateVerify(ClientHandshakeState clientHandshakeState, DigitallySigned digitallySigned) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        digitallySigned.encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generateClientHello(ClientHandshakeState clientHandshakeState) {
        byte[] bArr;
        ProtocolVersion protocolVersion;
        SessionParameters sessionParameters;
        TlsClientContextImpl tlsClientContextImpl = clientHandshakeState.clientContext;
        SecurityParameters securityParametersHandshake = tlsClientContextImpl.getSecurityParametersHandshake();
        tlsClientContextImpl.setClientSupportedVersions(clientHandshakeState.client.getProtocolVersions());
        ProtocolVersion latestDTLS = ProtocolVersion.getLatestDTLS(tlsClientContextImpl.getClientSupportedVersions());
        if (latestDTLS == null || !ProtocolVersion.DTLSv10.isEqualOrEarlierVersionOf(latestDTLS)) {
            throw new TlsFatalAlert((short) 80);
        }
        tlsClientContextImpl.setClientVersion(latestDTLS);
        byte[] bArr2 = TlsUtils.EMPTY_BYTES;
        TlsSession tlsSession = clientHandshakeState.tlsSession;
        if (tlsSession == null || (bArr = tlsSession.getSessionID()) == null || bArr.length > 32) {
            bArr = bArr2;
        }
        boolean isFallback = clientHandshakeState.client.isFallback();
        clientHandshakeState.offeredCipherSuites = clientHandshakeState.client.getCipherSuites();
        byte[] bArr3 = (bArr.length <= 0 || (sessionParameters = clientHandshakeState.sessionParameters) == null || (sessionParameters.isExtendedMasterSecret() && Arrays.contains(clientHandshakeState.offeredCipherSuites, clientHandshakeState.sessionParameters.getCipherSuite()) && clientHandshakeState.sessionParameters.getCompressionAlgorithm() == 0)) ? bArr : bArr2;
        clientHandshakeState.clientExtensions = TlsExtensionsUtils.ensureExtensionsInitialised(clientHandshakeState.client.getClientExtensions());
        ProtocolVersion protocolVersion2 = ProtocolVersion.DTLSv12;
        if (latestDTLS.isLaterVersionOf(protocolVersion2)) {
            TlsExtensionsUtils.addSupportedVersionsExtensionClient(clientHandshakeState.clientExtensions, tlsClientContextImpl.getClientSupportedVersions());
            protocolVersion = protocolVersion2;
        } else {
            protocolVersion = latestDTLS;
        }
        securityParametersHandshake.clientServerNames = TlsExtensionsUtils.getServerNameExtensionClient(clientHandshakeState.clientExtensions);
        if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(latestDTLS)) {
            securityParametersHandshake.clientSigAlgs = TlsExtensionsUtils.getSignatureAlgorithmsExtension(clientHandshakeState.clientExtensions);
            securityParametersHandshake.clientSigAlgsCert = TlsExtensionsUtils.getSignatureAlgorithmsCertExtension(clientHandshakeState.clientExtensions);
        }
        securityParametersHandshake.clientSupportedGroups = TlsExtensionsUtils.getSupportedGroupsExtension(clientHandshakeState.clientExtensions);
        clientHandshakeState.clientAgreements = TlsUtils.addEarlyKeySharesToClientHello(clientHandshakeState.clientContext, clientHandshakeState.client, clientHandshakeState.clientExtensions);
        TlsExtensionsUtils.addExtendedMasterSecretExtension(clientHandshakeState.clientExtensions);
        securityParametersHandshake.clientRandom = TlsProtocol.createRandomBlock(clientHandshakeState.client.shouldUseGMTUnixTime(), clientHandshakeState.clientContext);
        boolean z10 = TlsUtils.getExtensionData(clientHandshakeState.clientExtensions, TlsProtocol.EXT_RenegotiationInfo) == null;
        boolean z11 = !Arrays.contains(clientHandshakeState.offeredCipherSuites, 255);
        if (z10 && z11) {
            clientHandshakeState.offeredCipherSuites = Arrays.append(clientHandshakeState.offeredCipherSuites, 255);
        }
        if (isFallback && !Arrays.contains(clientHandshakeState.offeredCipherSuites, CipherSuite.TLS_FALLBACK_SCSV)) {
            clientHandshakeState.offeredCipherSuites = Arrays.append(clientHandshakeState.offeredCipherSuites, CipherSuite.TLS_FALLBACK_SCSV);
        }
        clientHandshakeState.heartbeat = clientHandshakeState.client.getHeartbeat();
        short heartbeatPolicy = clientHandshakeState.client.getHeartbeatPolicy();
        clientHandshakeState.heartbeatPolicy = heartbeatPolicy;
        if (clientHandshakeState.heartbeat != null || 1 == heartbeatPolicy) {
            TlsExtensionsUtils.addHeartbeatExtension(clientHandshakeState.clientExtensions, new HeartbeatExtension(heartbeatPolicy));
        }
        ClientHello clientHello = new ClientHello(protocolVersion, securityParametersHandshake.getClientRandom(), bArr3, bArr2, clientHandshakeState.offeredCipherSuites, clientHandshakeState.clientExtensions);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        clientHello.encode(clientHandshakeState.clientContext, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generateClientKeyExchange(ClientHandshakeState clientHandshakeState) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        clientHandshakeState.keyExchange.generateClientKeyExchange(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public void invalidateSession(ClientHandshakeState clientHandshakeState) {
        SessionParameters sessionParameters = clientHandshakeState.sessionParameters;
        if (sessionParameters != null) {
            sessionParameters.clear();
            clientHandshakeState.sessionParameters = null;
        }
        TlsSession tlsSession = clientHandshakeState.tlsSession;
        if (tlsSession != null) {
            tlsSession.invalidate();
            clientHandshakeState.tlsSession = null;
        }
    }

    public void processCertificateRequest(ClientHandshakeState clientHandshakeState, byte[] bArr) {
        if (clientHandshakeState.authentication == null) {
            throw new TlsFatalAlert((short) 40);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        clientHandshakeState.certificateRequest = CertificateRequest.parse(clientHandshakeState.clientContext, byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        clientHandshakeState.certificateRequest = TlsUtils.validateCertificateRequest(clientHandshakeState.certificateRequest, clientHandshakeState.keyExchange);
    }

    public void processCertificateStatus(ClientHandshakeState clientHandshakeState, byte[] bArr) {
        if (!clientHandshakeState.allowCertificateStatus) {
            throw new TlsFatalAlert((short) 10);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        clientHandshakeState.certificateStatus = CertificateStatus.parse(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
    }

    public byte[] processHelloVerifyRequest(ClientHandshakeState clientHandshakeState, byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ProtocolVersion readVersion = TlsUtils.readVersion(byteArrayInputStream);
        byte[] readOpaque8 = TlsUtils.readOpaque8(byteArrayInputStream, 0, ProtocolVersion.DTLSv12.isEqualOrEarlierVersionOf(readVersion) ? 255 : 32);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        if (readVersion.isEqualOrEarlierVersionOf(clientHandshakeState.clientContext.getClientVersion())) {
            return readOpaque8;
        }
        throw new TlsFatalAlert((short) 47);
    }

    public void processNewSessionTicket(ClientHandshakeState clientHandshakeState, byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        NewSessionTicket parse = NewSessionTicket.parse(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        clientHandshakeState.client.notifyNewSessionTicket(parse);
    }

    public void processServerCertificate(ClientHandshakeState clientHandshakeState, byte[] bArr) {
        TlsUtils.receiveServerCertificate(clientHandshakeState.clientContext, new ByteArrayInputStream(bArr));
        TlsAuthentication authentication = clientHandshakeState.client.getAuthentication();
        clientHandshakeState.authentication = authentication;
        if (authentication == null) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public void processServerHello(ClientHandshakeState clientHandshakeState, byte[] bArr) {
        TlsSession tlsSession;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ProtocolVersion readVersion = TlsUtils.readVersion(byteArrayInputStream);
        byte[] readFully = TlsUtils.readFully(32, byteArrayInputStream);
        boolean z10 = false;
        byte[] readOpaque8 = TlsUtils.readOpaque8(byteArrayInputStream, 0, 32);
        int readUint16 = TlsUtils.readUint16(byteArrayInputStream);
        short readUint8 = TlsUtils.readUint8(byteArrayInputStream);
        clientHandshakeState.serverExtensions = TlsProtocol.readExtensions(byteArrayInputStream);
        SecurityParameters securityParametersHandshake = clientHandshakeState.clientContext.getSecurityParametersHandshake();
        reportServerVersion(clientHandshakeState, readVersion);
        if (!clientHandshakeState.clientContext.getClientVersion().equals(readVersion)) {
            TlsUtils.checkDowngradeMarker(readVersion, readFully);
        }
        securityParametersHandshake.serverRandom = readFully;
        securityParametersHandshake.sessionID = readOpaque8;
        clientHandshakeState.client.notifySessionID(readOpaque8);
        clientHandshakeState.resumedSession = readOpaque8.length > 0 && (tlsSession = clientHandshakeState.tlsSession) != null && Arrays.areEqual(readOpaque8, tlsSession.getSessionID());
        if (!Arrays.contains(clientHandshakeState.offeredCipherSuites, readUint16) || readUint16 == 0 || CipherSuite.isSCSV(readUint16) || !TlsUtils.isValidCipherSuiteForVersion(readUint16, clientHandshakeState.clientContext.getServerVersion())) {
            throw new TlsFatalAlert((short) 47);
        }
        securityParametersHandshake.cipherSuite = DTLSProtocol.validateSelectedCipherSuite(readUint16, (short) 47);
        clientHandshakeState.client.notifySelectedCipherSuite(readUint16);
        if (readUint8 != 0) {
            throw new TlsFatalAlert((short) 47);
        }
        securityParametersHandshake.extendedMasterSecret = TlsExtensionsUtils.hasExtendedMasterSecretExtension(clientHandshakeState.serverExtensions);
        if (!securityParametersHandshake.isExtendedMasterSecret() && (clientHandshakeState.resumedSession || clientHandshakeState.client.requiresExtendedMasterSecret())) {
            throw new TlsFatalAlert((short) 40);
        }
        Hashtable hashtable = clientHandshakeState.serverExtensions;
        if (hashtable != null) {
            Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                Integer num = (Integer) keys.nextElement();
                if (!num.equals(TlsProtocol.EXT_RenegotiationInfo) && TlsUtils.getExtensionData(clientHandshakeState.clientExtensions, num) == null) {
                    throw new TlsFatalAlert(AlertDescription.unsupported_extension);
                }
            }
        }
        byte[] extensionData = TlsUtils.getExtensionData(clientHandshakeState.serverExtensions, TlsProtocol.EXT_RenegotiationInfo);
        if (extensionData != null) {
            securityParametersHandshake.secureRenegotiation = true;
            if (!Arrays.constantTimeAreEqual(extensionData, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES))) {
                throw new TlsFatalAlert((short) 40);
            }
        }
        clientHandshakeState.client.notifySecureRenegotiation(securityParametersHandshake.isSecureRenegotiation());
        securityParametersHandshake.applicationProtocol = TlsExtensionsUtils.getALPNExtensionServer(clientHandshakeState.serverExtensions);
        securityParametersHandshake.applicationProtocolSet = true;
        HeartbeatExtension heartbeatExtension = TlsExtensionsUtils.getHeartbeatExtension(clientHandshakeState.serverExtensions);
        Hashtable hashtable2 = null;
        if (heartbeatExtension == null) {
            clientHandshakeState.heartbeat = null;
            clientHandshakeState.heartbeatPolicy = (short) 2;
        } else if (1 != heartbeatExtension.getMode()) {
            clientHandshakeState.heartbeat = null;
        }
        Hashtable hashtable3 = clientHandshakeState.clientExtensions;
        Hashtable hashtable4 = clientHandshakeState.serverExtensions;
        if (!clientHandshakeState.resumedSession) {
            hashtable2 = hashtable3;
        } else {
            if (securityParametersHandshake.getCipherSuite() != clientHandshakeState.sessionParameters.getCipherSuite() || clientHandshakeState.sessionParameters.getCompressionAlgorithm() != 0 || !readVersion.equals(clientHandshakeState.sessionParameters.getNegotiatedVersion())) {
                throw new TlsFatalAlert((short) 47);
            }
            hashtable4 = clientHandshakeState.sessionParameters.readServerExtensions();
        }
        if (hashtable4 != null && !hashtable4.isEmpty()) {
            boolean hasEncryptThenMACExtension = TlsExtensionsUtils.hasEncryptThenMACExtension(hashtable4);
            if (hasEncryptThenMACExtension && !TlsUtils.isBlockCipherSuite(securityParametersHandshake.getCipherSuite())) {
                throw new TlsFatalAlert((short) 47);
            }
            securityParametersHandshake.encryptThenMAC = hasEncryptThenMACExtension;
            securityParametersHandshake.maxFragmentLength = DTLSProtocol.evaluateMaxFragmentLengthExtension(clientHandshakeState.resumedSession, hashtable2, hashtable4, (short) 47);
            securityParametersHandshake.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(hashtable4);
            clientHandshakeState.allowCertificateStatus = !clientHandshakeState.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(hashtable4, TlsExtensionsUtils.EXT_status_request, (short) 47);
            if (!clientHandshakeState.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(hashtable4, TlsProtocol.EXT_SessionTicket, (short) 47)) {
                z10 = true;
            }
            clientHandshakeState.expectSessionTicket = z10;
        }
        if (hashtable2 != null) {
            clientHandshakeState.client.processServerExtensions(hashtable4);
        }
        securityParametersHandshake.prfAlgorithm = TlsProtocol.getPRFAlgorithm(clientHandshakeState.clientContext, securityParametersHandshake.getCipherSuite());
        securityParametersHandshake.verifyDataLength = 12;
    }

    public void processServerKeyExchange(ClientHandshakeState clientHandshakeState, byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        clientHandshakeState.keyExchange.processServerKeyExchange(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
    }

    public void processServerSupplementalData(ClientHandshakeState clientHandshakeState, byte[] bArr) {
        clientHandshakeState.client.processServerSupplementalData(TlsProtocol.readSupplementalDataMessage(new ByteArrayInputStream(bArr)));
    }

    public void reportServerVersion(ClientHandshakeState clientHandshakeState, ProtocolVersion protocolVersion) {
        TlsClientContextImpl tlsClientContextImpl = clientHandshakeState.clientContext;
        ProtocolVersion serverVersion = tlsClientContextImpl.getServerVersion();
        if (serverVersion != null) {
            if (!serverVersion.equals(protocolVersion)) {
                throw new TlsFatalAlert((short) 47);
            }
        } else {
            if (!ProtocolVersion.DTLSv10.isEqualOrEarlierVersionOf(protocolVersion)) {
                throw new TlsFatalAlert((short) 47);
            }
            if (!ProtocolVersion.contains(tlsClientContextImpl.getClientSupportedVersions(), protocolVersion)) {
                throw new TlsFatalAlert((short) 70);
            }
            tlsClientContextImpl.getSecurityParametersHandshake().negotiatedVersion = protocolVersion;
            clientHandshakeState.client.notifyServerVersion(protocolVersion);
        }
    }
}
