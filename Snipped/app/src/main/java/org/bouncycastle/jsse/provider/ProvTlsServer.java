package org.bouncycastle.jsse.provider;

import C.v;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.jsse.BCSNIMatcher;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.tls.AlertDescription;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.CertificateRequest;
import org.bouncycastle.tls.DefaultTlsServer;
import org.bouncycastle.tls.ProtocolName;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsExtensionsUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsServerContext;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaDefaultTlsCredentialedSigner;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JceDefaultTlsCredentialedDecryptor;

/* loaded from: classes.dex */
class ProvTlsServer extends DefaultTlsServer implements ProvTlsPeer {
    private static final Logger LOG = Logger.getLogger(ProvTlsServer.class.getName());
    private static final int provEphemeralDHKeySize = PropertyUtils.getIntegerSystemProperty("jdk.tls.ephemeralDHKeySize", 2048, 1024, 8192);
    protected TlsCredentials credentials;
    protected boolean handshakeComplete;
    protected Set<String> keyManagerMissCache;
    protected final ProvTlsManager manager;
    protected BCSNIServerName matchedSNIServerName;
    protected final ProvSSLParameters sslParameters;
    protected ProvSSLSession sslSession;

    public ProvTlsServer(ProvTlsManager provTlsManager, ProvSSLParameters provSSLParameters) {
        super(provTlsManager.getContextData().getCrypto());
        this.sslSession = null;
        this.matchedSNIServerName = null;
        this.keyManagerMissCache = null;
        this.credentials = null;
        this.handshakeComplete = false;
        this.manager = provTlsManager;
        this.sslParameters = provSSLParameters.copyForConnection();
        if (!provTlsManager.getEnableSessionCreation()) {
            throw new SSLException("Session resumption not implemented yet and session creation is disabled");
        }
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public boolean allowCertificateStatus() {
        return false;
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer, org.bouncycastle.tls.TlsServer
    public CertificateRequest getCertificateRequest() {
        Vector vector = null;
        if (!this.sslParameters.getNeedClientAuth() && !this.sslParameters.getWantClientAuth()) {
            return null;
        }
        short[] sArr = {1, 2, 64};
        Vector supportedSignatureAlgorithms = TlsUtils.isSignatureAlgorithmsExtensionAllowed(this.context.getServerVersion()) ? JsseUtils.getSupportedSignatureAlgorithms(getCrypto()) : null;
        HashSet hashSet = new HashSet();
        for (X509Certificate x509Certificate : this.manager.getContextData().getX509TrustManager().getAcceptedIssuers()) {
            hashSet.add(x509Certificate.getSubjectX500Principal());
        }
        if (!hashSet.isEmpty()) {
            vector = new Vector(hashSet.size());
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                vector.addElement(X500Name.getInstance(((X500Principal) it.next()).getEncoded()));
            }
        }
        return new CertificateRequest(sArr, supportedSignatureAlgorithms, vector);
    }

    @Override // org.bouncycastle.tls.DefaultTlsServer, org.bouncycastle.tls.TlsServer
    public TlsCredentials getCredentials() {
        return this.credentials;
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public int getMaximumNegotiableCurveBits() {
        return SupportedGroups.getServerMaximumNegotiableCurveBits(this.manager.getContext().isFips(), this.context.getSecurityParametersHandshake().getClientSupportedGroups());
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public int getMaximumNegotiableFiniteFieldBits() {
        int serverMaximumNegotiableFiniteFieldBits = SupportedGroups.getServerMaximumNegotiableFiniteFieldBits(this.manager.getContext().isFips(), this.context.getSecurityParametersHandshake().getClientSupportedGroups());
        if (serverMaximumNegotiableFiniteFieldBits >= provEphemeralDHKeySize) {
            return serverMaximumNegotiableFiniteFieldBits;
        }
        return 0;
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public Vector getProtocolNames() {
        return JsseUtils.getProtocolNames(this.sslParameters.getApplicationProtocols());
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer, org.bouncycastle.tls.TlsServer
    public int getSelectedCipherSuite() {
        ProvSSLSessionContext serverSessionContext = this.manager.getContextData().getServerSessionContext();
        String peerHost = this.manager.getPeerHost();
        int peerPort = this.manager.getPeerPort();
        SecurityParameters securityParametersHandshake = this.context.getSecurityParametersHandshake();
        ProvSSLSession provSSLSession = this.sslSession;
        this.manager.notifyHandshakeSession(provSSLSession == null ? new ProvSSLSessionHandshake(serverSessionContext, peerHost, peerPort, securityParametersHandshake) : new ProvSSLSessionResumed(serverSessionContext, peerHost, peerPort, securityParametersHandshake, provSSLSession.getTlsSession(), this.sslSession.getJsseSessionParameters()));
        this.keyManagerMissCache = new HashSet();
        int selectedCipherSuite = super.getSelectedCipherSuite();
        String cipherSuiteName = ProvSSLContextSpi.getCipherSuiteName(selectedCipherSuite);
        LOG.fine("Server selected cipher suite: " + cipherSuiteName);
        this.keyManagerMissCache = null;
        return selectedCipherSuite;
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer, org.bouncycastle.tls.TlsServer
    public Hashtable getServerExtensions() {
        super.getServerExtensions();
        if (this.matchedSNIServerName != null) {
            TlsExtensionsUtils.addServerNameExtensionServer(checkServerExtensions());
        }
        return this.serverExtensions;
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer, org.bouncycastle.tls.TlsServer
    public ProtocolVersion getServerVersion() {
        ProtocolVersion serverVersion = super.getServerVersion();
        this.manager.getContext().validateNegotiatedProtocol(this.sslParameters, serverVersion);
        String protocolVersionName = ProvSSLContextSpi.getProtocolVersionName(serverVersion);
        LOG.fine("Server selected protocol version: " + protocolVersionName);
        return serverVersion;
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer, org.bouncycastle.tls.TlsServer
    public TlsSession getSessionToResume(byte[] bArr) {
        TlsSession tlsSession;
        ProvSSLSession sessionImpl = this.manager.getContextData().getServerSessionContext().getSessionImpl(bArr);
        if (sessionImpl != null && (tlsSession = sessionImpl.getTlsSession()) != null && isResumable(sessionImpl)) {
            this.sslSession = sessionImpl;
            return tlsSession;
        }
        if (this.manager.getEnableSessionCreation()) {
            return null;
        }
        throw new IllegalStateException("No resumable sessions and session creation is disabled");
    }

    @Override // org.bouncycastle.tls.DefaultTlsServer, org.bouncycastle.tls.AbstractTlsPeer
    public int[] getSupportedCipherSuites() {
        return this.manager.getContext().getActiveCipherSuites(getCrypto(), this.sslParameters, getProtocolVersions());
    }

    @Override // org.bouncycastle.tls.AbstractTlsPeer
    public ProtocolVersion[] getSupportedVersions() {
        return this.manager.getContext().getActiveProtocolVersions(this.sslParameters);
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsPeer
    public synchronized boolean isHandshakeComplete() {
        return this.handshakeComplete;
    }

    public boolean isResumable(ProvSSLSession provSSLSession) {
        return false;
    }

    @Override // org.bouncycastle.tls.AbstractTlsPeer, org.bouncycastle.tls.TlsPeer
    public void notifyAlertRaised(short s10, short s11, String str, Throwable th) {
        Level level = s10 == 1 ? Level.FINE : s11 == 80 ? Level.WARNING : Level.INFO;
        Logger logger = LOG;
        if (logger.isLoggable(level)) {
            String alertLogMessage = JsseUtils.getAlertLogMessage("Server raised", s10, s11);
            if (str != null) {
                alertLogMessage = v.p(alertLogMessage, ": ", str);
            }
            logger.log(level, alertLogMessage, th);
        }
    }

    @Override // org.bouncycastle.tls.AbstractTlsPeer, org.bouncycastle.tls.TlsPeer
    public void notifyAlertReceived(short s10, short s11) {
        super.notifyAlertReceived(s10, s11);
        Level level = s10 == 1 ? Level.FINE : Level.INFO;
        Logger logger = LOG;
        if (logger.isLoggable(level)) {
            logger.log(level, JsseUtils.getAlertLogMessage("Server received", s10, s11));
        }
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer, org.bouncycastle.tls.TlsServer
    public void notifyClientCertificate(Certificate certificate) {
        if (!this.sslParameters.getNeedClientAuth() && !this.sslParameters.getWantClientAuth()) {
            throw new TlsFatalAlert((short) 80);
        }
        if (certificate != null && !certificate.isEmpty()) {
            this.manager.checkClientTrusted(JsseUtils.getX509CertificateChain(getCrypto(), certificate), JsseUtils.getAuthStringClient(certificate.getCertificateAt(0).getLegacySignatureAlgorithm()));
        } else if (this.sslParameters.getNeedClientAuth()) {
            throw new TlsFatalAlert(TlsUtils.isTLSv13(this.context) ? AlertDescription.certificate_required : (short) 40);
        }
    }

    @Override // org.bouncycastle.tls.AbstractTlsPeer, org.bouncycastle.tls.TlsPeer
    public synchronized void notifyHandshakeComplete() {
        try {
            super.notifyHandshakeComplete();
            this.handshakeComplete = true;
            TlsSession session = this.context.getSession();
            ProvSSLSession provSSLSession = this.sslSession;
            if (provSSLSession != null) {
                if (provSSLSession.getTlsSession() != session) {
                }
                this.manager.notifyHandshakeComplete(new ProvSSLConnection(this.context, this.sslSession));
            }
            this.sslSession = this.manager.getContextData().getServerSessionContext().reportSession(this.manager.getPeerHost(), this.manager.getPeerPort(), session, new JsseSessionParameters(this.sslParameters.getEndpointIdentificationAlgorithm()));
            this.manager.notifyHandshakeComplete(new ProvSSLConnection(this.context, this.sslSession));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.bouncycastle.tls.AbstractTlsPeer, org.bouncycastle.tls.TlsPeer
    public void notifySecureRenegotiation(boolean z10) {
        if (!z10 && !PropertyUtils.getBooleanSystemProperty("sun.security.ssl.allowLegacyHelloMessages", true)) {
            throw new TlsFatalAlert((short) 40);
        }
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public boolean preferLocalCipherSuites() {
        return this.sslParameters.getUseCipherSuitesOrder();
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer, org.bouncycastle.tls.TlsServer
    public void processClientExtensions(Hashtable hashtable) {
        Logger logger;
        String str;
        super.processClientExtensions(hashtable);
        Vector clientServerNames = this.context.getSecurityParametersHandshake().getClientServerNames();
        if (clientServerNames != null) {
            Collection<BCSNIMatcher> sNIMatchers = this.sslParameters.getSNIMatchers();
            if (sNIMatchers == null || sNIMatchers.isEmpty()) {
                logger = LOG;
                str = "Server ignored SNI (no matchers specified)";
            } else {
                BCSNIServerName findMatchingSNIServerName = JsseUtils.findMatchingSNIServerName(clientServerNames, sNIMatchers);
                this.matchedSNIServerName = findMatchingSNIServerName;
                if (findMatchingSNIServerName == null) {
                    throw new TlsFatalAlert(AlertDescription.unrecognized_name);
                }
                logger = LOG;
                str = "Server accepted SNI: " + this.matchedSNIServerName;
            }
            logger.fine(str);
        }
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public boolean selectCipherSuite(int i) {
        if (selectCredentials(i)) {
            this.manager.getContext().validateNegotiatedCipherSuite(this.sslParameters, i);
            return super.selectCipherSuite(i);
        }
        String cipherSuiteName = ProvSSLContextSpi.getCipherSuiteName(i);
        LOG.finer("Server found no credentials for cipher suite: " + cipherSuiteName);
        return false;
    }

    public boolean selectCredentials(int i) {
        TlsCredentials jceDefaultTlsCredentialedDecryptor;
        this.credentials = null;
        int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(i);
        if (keyExchangeAlgorithm != 1 && keyExchangeAlgorithm != 3 && keyExchangeAlgorithm != 5) {
            if (keyExchangeAlgorithm != 11) {
                if (keyExchangeAlgorithm != 17 && keyExchangeAlgorithm != 19) {
                    if (keyExchangeAlgorithm != 20) {
                        return false;
                    }
                }
            }
            return true;
        }
        String authTypeServer = JsseUtils.getAuthTypeServer(keyExchangeAlgorithm);
        if (this.keyManagerMissCache.contains(authTypeServer)) {
            return false;
        }
        String chooseServerAlias = this.manager.chooseServerAlias(authTypeServer, null);
        if (chooseServerAlias != null) {
            TlsCrypto crypto = getCrypto();
            if (!(crypto instanceof JcaTlsCrypto)) {
                throw new UnsupportedOperationException();
            }
            X509ExtendedKeyManager x509KeyManager = this.manager.getContextData().getX509KeyManager();
            PrivateKey privateKey = x509KeyManager.getPrivateKey(chooseServerAlias);
            Certificate certificateMessage = JsseUtils.getCertificateMessage(crypto, x509KeyManager.getCertificateChain(chooseServerAlias));
            if (privateKey != null && JsseUtils.isUsableKeyForServer(keyExchangeAlgorithm, privateKey) && !certificateMessage.isEmpty()) {
                if (keyExchangeAlgorithm == 1) {
                    jceDefaultTlsCredentialedDecryptor = new JceDefaultTlsCredentialedDecryptor((JcaTlsCrypto) crypto, certificateMessage, privateKey);
                } else {
                    if (keyExchangeAlgorithm != 3 && keyExchangeAlgorithm != 5 && keyExchangeAlgorithm != 17 && keyExchangeAlgorithm != 19) {
                        return false;
                    }
                    short legacySignatureAlgorithmServer = TlsUtils.getLegacySignatureAlgorithmServer(keyExchangeAlgorithm);
                    TlsServerContext tlsServerContext = this.context;
                    jceDefaultTlsCredentialedDecryptor = new JcaDefaultTlsCredentialedSigner(new TlsCryptoParameters(this.context), (JcaTlsCrypto) crypto, privateKey, certificateMessage, TlsUtils.chooseSignatureAndHashAlgorithm(tlsServerContext, tlsServerContext.getSecurityParametersHandshake().getClientSigAlgs(), legacySignatureAlgorithmServer));
                }
                this.credentials = jceDefaultTlsCredentialedDecryptor;
                return true;
            }
        }
        this.keyManagerMissCache.add(authTypeServer);
        return false;
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public int selectDH(int i) {
        int max = Math.max(i, provEphemeralDHKeySize);
        int[] clientSupportedGroups = this.context.getSecurityParametersHandshake().getClientSupportedGroups();
        return clientSupportedGroups == null ? selectDHDefault(max) : SupportedGroups.getServerSelectedFiniteField(getCrypto(), this.manager.getContext().isFips(), max, clientSupportedGroups);
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public int selectDHDefault(int i) {
        return SupportedGroups.getServerDefaultDH(this.manager.getContext().isFips(), i);
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public int selectECDH(int i) {
        int[] clientSupportedGroups = this.context.getSecurityParametersHandshake().getClientSupportedGroups();
        return clientSupportedGroups == null ? selectECDHDefault(i) : SupportedGroups.getServerSelectedCurve(getCrypto(), this.manager.getContext().isFips(), i, clientSupportedGroups);
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public int selectECDHDefault(int i) {
        return SupportedGroups.getServerDefaultECDH(this.manager.getContext().isFips(), i);
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public ProtocolName selectProtocolName() {
        if (this.sslParameters.getEngineAPSelector() == null && this.sslParameters.getSocketAPSelector() == null) {
            return super.selectProtocolName();
        }
        List<String> protocolNames = JsseUtils.getProtocolNames(this.clientProtocolNames);
        String selectApplicationProtocol = this.manager.selectApplicationProtocol(Collections.unmodifiableList(protocolNames));
        if (selectApplicationProtocol == null) {
            throw new TlsFatalAlert(AlertDescription.no_application_protocol);
        }
        if (selectApplicationProtocol.length() < 1) {
            return null;
        }
        if (protocolNames.contains(selectApplicationProtocol)) {
            return ProtocolName.asUtf8Encoding(selectApplicationProtocol);
        }
        throw new TlsFatalAlert(AlertDescription.no_application_protocol);
    }

    @Override // org.bouncycastle.tls.AbstractTlsServer
    public boolean shouldSelectProtocolNameEarly() {
        return this.sslParameters.getEngineAPSelector() == null && this.sslParameters.getSocketAPSelector() == null;
    }
}
