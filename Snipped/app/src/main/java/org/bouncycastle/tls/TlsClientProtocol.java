package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.TlsProtocol;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class TlsClientProtocol extends TlsProtocol {
    protected TlsAuthentication authentication;
    protected CertificateRequest certificateRequest;
    protected CertificateStatus certificateStatus;
    protected Hashtable clientAgreements;
    protected TlsKeyExchange keyExchange;
    protected TlsClient tlsClient;
    TlsClientContextImpl tlsClientContext;

    public TlsClientProtocol() {
        this.tlsClient = null;
        this.tlsClientContext = null;
        this.clientAgreements = null;
        this.keyExchange = null;
        this.authentication = null;
        this.certificateStatus = null;
        this.certificateRequest = null;
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public void beginHandshake(boolean z10) {
        SessionParameters exportSessionParameters;
        super.beginHandshake(z10);
        TlsSession sessionToResume = this.tlsClient.getSessionToResume();
        if (sessionToResume != null && sessionToResume.isResumable() && (exportSessionParameters = sessionToResume.exportSessionParameters()) != null && exportSessionParameters.isExtendedMasterSecret()) {
            this.tlsSession = sessionToResume;
            this.sessionParameters = exportSessionParameters;
        }
        sendClientHelloMessage();
        this.connection_state = (short) 1;
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public void cleanupHandshake() {
        super.cleanupHandshake();
        this.keyExchange = null;
        this.authentication = null;
        this.certificateStatus = null;
        this.certificateRequest = null;
    }

    public void connect(TlsClient tlsClient) {
        if (tlsClient == null) {
            throw new IllegalArgumentException("'tlsClient' cannot be null");
        }
        if (this.tlsClient != null) {
            throw new IllegalStateException("'connect' can only be called once");
        }
        this.tlsClient = tlsClient;
        TlsClientContextImpl tlsClientContextImpl = new TlsClientContextImpl(tlsClient.getCrypto());
        this.tlsClientContext = tlsClientContextImpl;
        this.tlsClient.init(tlsClientContextImpl);
        this.recordStream.init(this.tlsClientContext);
        tlsClient.notifyCloseHandle(this);
        beginHandshake(false);
        if (this.blocking) {
            blockForHandshake();
        }
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public TlsContext getContext() {
        return this.tlsClientContext;
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public AbstractTlsContext getContextAdmin() {
        return this.tlsClientContext;
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public TlsPeer getPeer() {
        return this.tlsClient;
    }

    @Override // org.bouncycastle.tls.TlsProtocol
    public void handleHandshakeMessage(short s10, ByteArrayInputStream byteArrayInputStream) {
        Certificate certificate;
        TlsCredentialedSigner tlsCredentialedSigner;
        TlsStreamSigner tlsStreamSigner;
        if (this.resumedSession) {
            if (s10 != 20 || this.connection_state != 2) {
                throw new TlsFatalAlert((short) 10);
            }
            processFinishedMessage(byteArrayInputStream);
            this.connection_state = (short) 15;
            sendChangeCipherSpecMessage();
            sendFinishedMessage();
            this.connection_state = (short) 13;
            completeHandshake();
            return;
        }
        if (s10 == 0) {
            TlsProtocol.assertEmpty(byteArrayInputStream);
            if (this.connection_state == 16) {
                handleRenegotiation();
                return;
            }
            return;
        }
        TlsStreamSigner tlsStreamSigner2 = null;
        if (s10 == 2) {
            if (this.connection_state != 1) {
                throw new TlsFatalAlert((short) 10);
            }
            receiveServerHelloMessage(byteArrayInputStream);
            this.connection_state = (short) 2;
            this.recordStream.notifyHelloComplete();
            applyMaxFragmentLengthExtension();
            SecurityParameters securityParametersHandshake = this.tlsClientContext.getSecurityParametersHandshake();
            if (this.resumedSession) {
                securityParametersHandshake.masterSecret = this.tlsClientContext.getCrypto().adoptSecret(this.sessionParameters.getMasterSecret());
                this.recordStream.setPendingConnectionState(TlsUtils.initCipher(getContext()));
                return;
            } else {
                invalidateSession();
                this.tlsSession = TlsUtils.importSession(securityParametersHandshake.getSessionID(), null);
                this.sessionParameters = null;
                return;
            }
        }
        short s11 = 14;
        if (s10 != 4) {
            if (s10 == 20) {
                short s12 = this.connection_state;
                if (s12 != 13) {
                    if (s12 != 14) {
                        throw new TlsFatalAlert((short) 10);
                    }
                } else if (this.expectSessionTicket) {
                    throw new TlsFatalAlert((short) 10);
                }
                processFinishedMessage(byteArrayInputStream);
                this.connection_state = (short) 15;
                completeHandshake();
                return;
            }
            if (s10 == 22) {
                if (this.connection_state != 4) {
                    throw new TlsFatalAlert((short) 10);
                }
                if (!this.allowCertificateStatus) {
                    throw new TlsFatalAlert((short) 10);
                }
                this.certificateStatus = CertificateStatus.parse(byteArrayInputStream);
                TlsProtocol.assertEmpty(byteArrayInputStream);
                this.connection_state = (short) 5;
                return;
            }
            if (s10 == 23) {
                if (this.connection_state != 2) {
                    throw new TlsFatalAlert((short) 10);
                }
                handleSupplementalData(TlsProtocol.readSupplementalDataMessage(byteArrayInputStream));
                return;
            }
            s11 = 6;
            switch (s10) {
                case 11:
                    short s13 = this.connection_state;
                    if (s13 == 2) {
                        handleSupplementalData(null);
                    } else if (s13 != 3) {
                        throw new TlsFatalAlert((short) 10);
                    }
                    TlsUtils.receiveServerCertificate(this.tlsClientContext, byteArrayInputStream);
                    TlsAuthentication authentication = this.tlsClient.getAuthentication();
                    this.authentication = authentication;
                    if (authentication == null) {
                        throw new TlsFatalAlert((short) 80);
                    }
                    this.connection_state = (short) 4;
                    return;
                case 12:
                    short s14 = this.connection_state;
                    if (s14 == 2) {
                        handleSupplementalData(null);
                    } else if (s14 != 3) {
                        if (s14 != 4 && s14 != 5) {
                            throw new TlsFatalAlert((short) 10);
                        }
                        handleServerCertificate();
                        this.keyExchange.processServerKeyExchange(byteArrayInputStream);
                        TlsProtocol.assertEmpty(byteArrayInputStream);
                        break;
                    }
                    this.authentication = null;
                    handleServerCertificate();
                    this.keyExchange.processServerKeyExchange(byteArrayInputStream);
                    TlsProtocol.assertEmpty(byteArrayInputStream);
                case 13:
                    short s15 = this.connection_state;
                    if (s15 == 4 || s15 == 5) {
                        handleServerCertificate();
                        this.keyExchange.skipServerKeyExchange();
                    } else if (s15 != 6) {
                        throw new TlsFatalAlert((short) 10);
                    }
                    if (this.authentication == null) {
                        throw new TlsFatalAlert((short) 40);
                    }
                    this.certificateRequest = CertificateRequest.parse(getContext(), byteArrayInputStream);
                    TlsProtocol.assertEmpty(byteArrayInputStream);
                    this.certificateRequest = TlsUtils.validateCertificateRequest(this.certificateRequest, this.keyExchange);
                    TlsUtils.trackHashAlgorithms(this.recordStream.getHandshakeHash(), this.certificateRequest.getSupportedSignatureAlgorithms());
                    this.connection_state = (short) 7;
                    return;
                case 14:
                    switch (this.connection_state) {
                        case 2:
                            handleSupplementalData(null);
                        case 3:
                            this.authentication = null;
                        case 4:
                        case 5:
                            handleServerCertificate();
                            this.keyExchange.skipServerKeyExchange();
                        case 6:
                        case 7:
                            TlsProtocol.assertEmpty(byteArrayInputStream);
                            this.connection_state = (short) 8;
                            Vector clientSupplementalData = this.tlsClient.getClientSupplementalData();
                            if (clientSupplementalData != null) {
                                sendSupplementalDataMessage(clientSupplementalData);
                            }
                            this.connection_state = (short) 9;
                            CertificateRequest certificateRequest = this.certificateRequest;
                            if (certificateRequest == null) {
                                this.keyExchange.skipClientCredentials();
                                tlsCredentialedSigner = null;
                            } else {
                                TlsCredentials validateCredentials = TlsProtocol.validateCredentials(this.authentication.getClientCredentials(certificateRequest));
                                if (validateCredentials == null) {
                                    this.keyExchange.skipClientCredentials();
                                    tlsCredentialedSigner = null;
                                    certificate = null;
                                    tlsStreamSigner = null;
                                } else {
                                    this.keyExchange.processClientCredentials(validateCredentials);
                                    certificate = validateCredentials.getCertificate();
                                    if (validateCredentials instanceof TlsCredentialedSigner) {
                                        tlsCredentialedSigner = (TlsCredentialedSigner) validateCredentials;
                                        tlsStreamSigner = tlsCredentialedSigner.getStreamSigner();
                                    } else {
                                        tlsCredentialedSigner = null;
                                        tlsStreamSigner = null;
                                    }
                                }
                                sendCertificateMessage(certificate, null);
                                tlsStreamSigner2 = tlsStreamSigner;
                            }
                            this.connection_state = (short) 10;
                            TlsUtils.sealHandshakeHash(getContext(), this.recordStream.getHandshakeHash(), tlsStreamSigner2 != null);
                            sendClientKeyExchangeMessage();
                            this.connection_state = (short) 11;
                            TlsHandshakeHash prepareToFinish = this.recordStream.prepareToFinish();
                            this.tlsClientContext.getSecurityParametersHandshake().sessionHash = TlsUtils.getCurrentPRFHash(prepareToFinish);
                            TlsProtocol.establishMasterSecret(getContext(), this.keyExchange);
                            this.recordStream.setPendingConnectionState(TlsUtils.initCipher(getContext()));
                            if (tlsCredentialedSigner != null) {
                                sendCertificateVerifyMessage(TlsUtils.generateCertificateVerify(getContext(), tlsCredentialedSigner, tlsStreamSigner2, prepareToFinish));
                                this.connection_state = (short) 12;
                            }
                            sendChangeCipherSpecMessage();
                            sendFinishedMessage();
                            this.connection_state = (short) 13;
                            return;
                        default:
                            throw new TlsFatalAlert((short) 10);
                    }
                default:
                    throw new TlsFatalAlert((short) 10);
            }
        } else {
            if (this.connection_state != 13) {
                throw new TlsFatalAlert((short) 10);
            }
            if (!this.expectSessionTicket) {
                throw new TlsFatalAlert((short) 10);
            }
            invalidateSession();
            receiveNewSessionTicketMessage(byteArrayInputStream);
        }
        this.connection_state = s11;
    }

    public void handleServerCertificate() {
        TlsUtils.processServerCertificate(this.tlsClientContext, this.tlsClient, this.certificateStatus, this.keyExchange, this.authentication, this.clientExtensions, this.serverExtensions);
    }

    public void handleSupplementalData(Vector vector) {
        this.tlsClient.processServerSupplementalData(vector);
        this.connection_state = (short) 3;
        this.keyExchange = TlsUtils.initKeyExchangeClient(this.tlsClientContext, this.tlsClient);
    }

    public void receiveNewSessionTicketMessage(ByteArrayInputStream byteArrayInputStream) {
        NewSessionTicket parse = NewSessionTicket.parse(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        this.tlsClient.notifyNewSessionTicket(parse);
    }

    public void receiveServerHelloMessage(ByteArrayInputStream byteArrayInputStream) {
        TlsSession tlsSession;
        ProtocolVersion readVersion = TlsUtils.readVersion(byteArrayInputStream);
        byte[] readFully = TlsUtils.readFully(32, byteArrayInputStream);
        boolean z10 = false;
        byte[] readOpaque8 = TlsUtils.readOpaque8(byteArrayInputStream, 0, 32);
        int readUint16 = TlsUtils.readUint16(byteArrayInputStream);
        short readUint8 = TlsUtils.readUint8(byteArrayInputStream);
        this.serverExtensions = TlsProtocol.readExtensions(byteArrayInputStream);
        SecurityParameters securityParametersHandshake = this.tlsClientContext.getSecurityParametersHandshake();
        if (securityParametersHandshake.isRenegotiating()) {
            if (!readVersion.equals(this.tlsClientContext.getServerVersion())) {
                throw new TlsFatalAlert((short) 47);
            }
        } else {
            if (!ProtocolVersion.TLSv10.isEqualOrEarlierVersionOf(readVersion)) {
                throw new TlsFatalAlert((short) 47);
            }
            if (!ProtocolVersion.contains(this.tlsClientContext.getClientSupportedVersions(), readVersion)) {
                throw new TlsFatalAlert((short) 70);
            }
            ProtocolVersion protocolVersion = ProtocolVersion.TLSv12;
            if (!readVersion.isLaterVersionOf(protocolVersion)) {
                protocolVersion = readVersion;
            }
            this.recordStream.setWriteVersion(protocolVersion);
            securityParametersHandshake.negotiatedVersion = readVersion;
        }
        this.tlsClient.notifyServerVersion(readVersion);
        if (!this.tlsClientContext.getClientVersion().equals(readVersion)) {
            TlsUtils.checkDowngradeMarker(readVersion, readFully);
        }
        securityParametersHandshake.serverRandom = readFully;
        securityParametersHandshake.sessionID = readOpaque8;
        this.tlsClient.notifySessionID(readOpaque8);
        this.resumedSession = readOpaque8.length > 0 && (tlsSession = this.tlsSession) != null && Arrays.areEqual(readOpaque8, tlsSession.getSessionID());
        if (!Arrays.contains(this.offeredCipherSuites, readUint16) || readUint16 == 0 || CipherSuite.isSCSV(readUint16) || !TlsUtils.isValidCipherSuiteForVersion(readUint16, this.tlsClientContext.getServerVersion())) {
            throw new TlsFatalAlert((short) 47);
        }
        securityParametersHandshake.cipherSuite = readUint16;
        this.tlsClient.notifySelectedCipherSuite(readUint16);
        if (readUint8 != 0) {
            throw new TlsFatalAlert((short) 47);
        }
        securityParametersHandshake.extendedMasterSecret = TlsExtensionsUtils.hasExtendedMasterSecretExtension(this.serverExtensions);
        if (!securityParametersHandshake.isExtendedMasterSecret() && (this.resumedSession || this.tlsClient.requiresExtendedMasterSecret())) {
            throw new TlsFatalAlert((short) 40);
        }
        Hashtable hashtable = this.serverExtensions;
        if (hashtable != null) {
            Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                Integer num = (Integer) keys.nextElement();
                if (!num.equals(TlsProtocol.EXT_RenegotiationInfo) && TlsUtils.getExtensionData(this.clientExtensions, num) == null) {
                    throw new TlsFatalAlert(AlertDescription.unsupported_extension);
                }
            }
        }
        byte[] extensionData = TlsUtils.getExtensionData(this.serverExtensions, TlsProtocol.EXT_RenegotiationInfo);
        if (securityParametersHandshake.isRenegotiating()) {
            if (!securityParametersHandshake.isSecureRenegotiation()) {
                throw new TlsFatalAlert((short) 80);
            }
            if (extensionData == null) {
                throw new TlsFatalAlert((short) 40);
            }
            SecurityParameters securityParametersConnection = this.tlsClientContext.getSecurityParametersConnection();
            if (!Arrays.constantTimeAreEqual(extensionData, TlsProtocol.createRenegotiationInfo(TlsUtils.concat(securityParametersConnection.getLocalVerifyData(), securityParametersConnection.getPeerVerifyData())))) {
                throw new TlsFatalAlert((short) 40);
            }
        } else if (extensionData == null) {
            securityParametersHandshake.secureRenegotiation = false;
        } else {
            securityParametersHandshake.secureRenegotiation = true;
            if (!Arrays.constantTimeAreEqual(extensionData, TlsProtocol.createRenegotiationInfo(TlsUtils.EMPTY_BYTES))) {
                throw new TlsFatalAlert((short) 40);
            }
        }
        this.tlsClient.notifySecureRenegotiation(securityParametersHandshake.isSecureRenegotiation());
        securityParametersHandshake.applicationProtocol = TlsExtensionsUtils.getALPNExtensionServer(this.serverExtensions);
        securityParametersHandshake.applicationProtocolSet = true;
        Hashtable hashtable2 = this.clientExtensions;
        Hashtable hashtable3 = this.serverExtensions;
        if (this.resumedSession) {
            if (securityParametersHandshake.getCipherSuite() != this.sessionParameters.getCipherSuite() || this.sessionParameters.getCompressionAlgorithm() != 0 || !readVersion.equals(this.sessionParameters.getNegotiatedVersion())) {
                throw new TlsFatalAlert((short) 47);
            }
            hashtable3 = this.sessionParameters.readServerExtensions();
            hashtable2 = null;
        }
        if (hashtable3 != null && !hashtable3.isEmpty()) {
            boolean hasEncryptThenMACExtension = TlsExtensionsUtils.hasEncryptThenMACExtension(hashtable3);
            if (hasEncryptThenMACExtension && !TlsUtils.isBlockCipherSuite(securityParametersHandshake.getCipherSuite())) {
                throw new TlsFatalAlert((short) 47);
            }
            securityParametersHandshake.encryptThenMAC = hasEncryptThenMACExtension;
            securityParametersHandshake.maxFragmentLength = processMaxFragmentLengthExtension(hashtable2, hashtable3, (short) 47);
            securityParametersHandshake.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(hashtable3);
            this.allowCertificateStatus = !this.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(hashtable3, TlsExtensionsUtils.EXT_status_request, (short) 47);
            if (!this.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(hashtable3, TlsProtocol.EXT_SessionTicket, (short) 47)) {
                z10 = true;
            }
            this.expectSessionTicket = z10;
        }
        if (hashtable2 != null) {
            this.tlsClient.processServerExtensions(hashtable3);
        }
        securityParametersHandshake.prfAlgorithm = TlsProtocol.getPRFAlgorithm(this.tlsClientContext, securityParametersHandshake.getCipherSuite());
        securityParametersHandshake.verifyDataLength = 12;
    }

    public void sendCertificateVerifyMessage(DigitallySigned digitallySigned) {
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 15);
        digitallySigned.encode(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    public void sendClientHelloMessage() {
        ProtocolVersion latestTLS;
        byte[] bArr;
        ProtocolVersion protocolVersion;
        SessionParameters sessionParameters;
        SecurityParameters securityParametersHandshake = this.tlsClientContext.getSecurityParametersHandshake();
        if (securityParametersHandshake.isRenegotiating()) {
            latestTLS = this.tlsClientContext.getClientVersion();
        } else {
            RecordStream recordStream = this.recordStream;
            ProtocolVersion protocolVersion2 = ProtocolVersion.TLSv10;
            recordStream.setWriteVersion(protocolVersion2);
            this.tlsClientContext.setClientSupportedVersions(this.tlsClient.getProtocolVersions());
            latestTLS = ProtocolVersion.getLatestTLS(this.tlsClientContext.getClientSupportedVersions());
            if (latestTLS == null || latestTLS.isEarlierVersionOf(protocolVersion2) || latestTLS.isLaterVersionOf(ProtocolVersion.TLSv12)) {
                throw new TlsFatalAlert((short) 80);
            }
            this.tlsClientContext.setClientVersion(latestTLS);
        }
        byte[] bArr2 = TlsUtils.EMPTY_BYTES;
        TlsSession tlsSession = this.tlsSession;
        if (tlsSession == null || (bArr = tlsSession.getSessionID()) == null || bArr.length > 32) {
            bArr = bArr2;
        }
        boolean isFallback = this.tlsClient.isFallback();
        this.offeredCipherSuites = this.tlsClient.getCipherSuites();
        byte[] bArr3 = (bArr.length <= 0 || (sessionParameters = this.sessionParameters) == null || (sessionParameters.isExtendedMasterSecret() && Arrays.contains(this.offeredCipherSuites, this.sessionParameters.getCipherSuite()) && this.sessionParameters.getCompressionAlgorithm() == 0)) ? bArr : bArr2;
        this.clientExtensions = TlsExtensionsUtils.ensureExtensionsInitialised(this.tlsClient.getClientExtensions());
        ProtocolVersion protocolVersion3 = ProtocolVersion.TLSv12;
        if (latestTLS.isLaterVersionOf(protocolVersion3)) {
            TlsExtensionsUtils.addSupportedVersionsExtensionClient(this.clientExtensions, this.tlsClientContext.getClientSupportedVersions());
            protocolVersion = protocolVersion3;
        } else {
            protocolVersion = latestTLS;
        }
        securityParametersHandshake.clientServerNames = TlsExtensionsUtils.getServerNameExtensionClient(this.clientExtensions);
        if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(latestTLS)) {
            securityParametersHandshake.clientSigAlgs = TlsExtensionsUtils.getSignatureAlgorithmsExtension(this.clientExtensions);
            securityParametersHandshake.clientSigAlgsCert = TlsExtensionsUtils.getSignatureAlgorithmsCertExtension(this.clientExtensions);
        }
        securityParametersHandshake.clientSupportedGroups = TlsExtensionsUtils.getSupportedGroupsExtension(this.clientExtensions);
        this.clientAgreements = TlsUtils.addEarlyKeySharesToClientHello(this.tlsClientContext, this.tlsClient, this.clientExtensions);
        TlsExtensionsUtils.addExtendedMasterSecretExtension(this.clientExtensions);
        securityParametersHandshake.clientRandom = TlsProtocol.createRandomBlock(this.tlsClient.shouldUseGMTUnixTime(), this.tlsClientContext);
        if (!securityParametersHandshake.isRenegotiating()) {
            boolean z10 = TlsUtils.getExtensionData(this.clientExtensions, TlsProtocol.EXT_RenegotiationInfo) == null;
            boolean z11 = !Arrays.contains(this.offeredCipherSuites, 255);
            if (z10 && z11) {
                this.offeredCipherSuites = Arrays.append(this.offeredCipherSuites, 255);
            }
        } else {
            if (!securityParametersHandshake.isSecureRenegotiation()) {
                throw new TlsFatalAlert((short) 80);
            }
            this.clientExtensions.put(TlsProtocol.EXT_RenegotiationInfo, TlsProtocol.createRenegotiationInfo(this.tlsClientContext.getSecurityParametersConnection().getLocalVerifyData()));
        }
        if (isFallback && !Arrays.contains(this.offeredCipherSuites, CipherSuite.TLS_FALLBACK_SCSV)) {
            this.offeredCipherSuites = Arrays.append(this.offeredCipherSuites, CipherSuite.TLS_FALLBACK_SCSV);
        }
        ClientHello clientHello = new ClientHello(protocolVersion, securityParametersHandshake.getClientRandom(), bArr3, null, this.offeredCipherSuites, this.clientExtensions);
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 1);
        clientHello.encode(this.tlsClientContext, handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    public void sendClientKeyExchangeMessage() {
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 16);
        this.keyExchange.generateClientKeyExchange(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    public TlsClientProtocol(InputStream inputStream, OutputStream outputStream) {
        super(inputStream, outputStream);
        this.tlsClient = null;
        this.tlsClientContext = null;
        this.clientAgreements = null;
        this.keyExchange = null;
        this.authentication = null;
        this.certificateStatus = null;
        this.certificateRequest = null;
    }
}
