package org.bouncycastle.jsse.provider;

import C.v;
import java.security.Principal;
import java.security.PrivateKey;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.tls.AbstractTlsClient;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.CertificateRequest;
import org.bouncycastle.tls.CertificateStatusRequest;
import org.bouncycastle.tls.DefaultTlsClient;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.ServerName;
import org.bouncycastle.tls.TlsAuthentication;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsDHGroupVerifier;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsServerCertificate;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaDefaultTlsCredentialedSigner;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.IPAddress;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes.dex */
class ProvTlsClient extends DefaultTlsClient implements ProvTlsPeer {
    private static final Logger LOG = Logger.getLogger(ProvTlsClient.class.getName());
    private static final boolean provEnableSNIExtension = PropertyUtils.getBooleanSystemProperty("jsse.enableSNIExtension", true);
    protected boolean handshakeComplete;
    protected final ProvTlsManager manager;
    protected final ProvSSLParameters sslParameters;
    protected ProvSSLSession sslSession;

    public ProvTlsClient(ProvTlsManager provTlsManager, ProvSSLParameters provSSLParameters) {
        super(provTlsManager.getContextData().getCrypto());
        this.sslSession = null;
        this.handshakeComplete = false;
        this.manager = provTlsManager;
        this.sslParameters = provSSLParameters.copyForConnection();
    }

    @Override // org.bouncycastle.tls.TlsClient
    public TlsAuthentication getAuthentication() {
        return new TlsAuthentication() { // from class: org.bouncycastle.jsse.provider.ProvTlsClient.1
            @Override // org.bouncycastle.tls.TlsAuthentication
            public TlsCredentials getClientCredentials(CertificateRequest certificateRequest) {
                Principal[] principalArr;
                int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(((AbstractTlsClient) ProvTlsClient.this).context.getSecurityParametersHandshake().getCipherSuite());
                if (keyExchangeAlgorithm != 1 && keyExchangeAlgorithm != 3 && keyExchangeAlgorithm != 5 && keyExchangeAlgorithm != 17 && keyExchangeAlgorithm != 19) {
                    throw new TlsFatalAlert((short) 80);
                }
                short[] certificateTypes = certificateRequest.getCertificateTypes();
                if (certificateTypes == null || certificateTypes.length == 0) {
                    return null;
                }
                String[] strArr = new String[certificateTypes.length];
                for (int i = 0; i < certificateTypes.length; i++) {
                    strArr[i] = JsseUtils.getAuthTypeClient(certificateTypes[i]);
                }
                Vector certificateAuthorities = certificateRequest.getCertificateAuthorities();
                if (certificateAuthorities == null || certificateAuthorities.size() <= 0) {
                    principalArr = null;
                } else {
                    Set<X500Principal> x500Principals = JsseUtils.toX500Principals((X500Name[]) certificateAuthorities.toArray(new X500Name[certificateAuthorities.size()]));
                    principalArr = (Principal[]) x500Principals.toArray(new Principal[x500Principals.size()]);
                }
                String chooseClientAlias = ProvTlsClient.this.manager.chooseClientAlias(strArr, principalArr);
                if (chooseClientAlias == null) {
                    return null;
                }
                TlsCrypto crypto = ProvTlsClient.this.getCrypto();
                if (!(crypto instanceof JcaTlsCrypto)) {
                    throw new UnsupportedOperationException();
                }
                X509ExtendedKeyManager x509KeyManager = ProvTlsClient.this.manager.getContextData().getX509KeyManager();
                PrivateKey privateKey = x509KeyManager.getPrivateKey(chooseClientAlias);
                Certificate certificateMessage = JsseUtils.getCertificateMessage(crypto, x509KeyManager.getCertificateChain(chooseClientAlias));
                if (privateKey == null || certificateMessage.isEmpty()) {
                    return null;
                }
                if (keyExchangeAlgorithm != 1 && keyExchangeAlgorithm != 3 && keyExchangeAlgorithm != 5 && keyExchangeAlgorithm != 17 && keyExchangeAlgorithm != 19) {
                    throw new TlsFatalAlert((short) 80);
                }
                return new JcaDefaultTlsCredentialedSigner(new TlsCryptoParameters(((AbstractTlsClient) ProvTlsClient.this).context), (JcaTlsCrypto) crypto, privateKey, certificateMessage, TlsUtils.chooseSignatureAndHashAlgorithm(((AbstractTlsClient) ProvTlsClient.this).context, ((AbstractTlsClient) ProvTlsClient.this).context.getSecurityParametersHandshake().getClientSigAlgs(), certificateMessage.getCertificateAt(0).getLegacySignatureAlgorithm()));
            }

            @Override // org.bouncycastle.tls.TlsAuthentication
            public void notifyServerCertificate(TlsServerCertificate tlsServerCertificate) {
                if (tlsServerCertificate == null || tlsServerCertificate.getCertificate() == null || tlsServerCertificate.getCertificate().isEmpty()) {
                    throw new TlsFatalAlert((short) 40);
                }
                ProvTlsClient.this.manager.checkServerTrusted(JsseUtils.getX509CertificateChain(ProvTlsClient.this.getCrypto(), tlsServerCertificate.getCertificate()), JsseUtils.getAuthTypeServer(TlsUtils.getKeyExchangeAlgorithm(((AbstractTlsClient) ProvTlsClient.this).context.getSecurityParametersHandshake().getCipherSuite())));
            }
        };
    }

    @Override // org.bouncycastle.tls.AbstractTlsClient
    public CertificateStatusRequest getCertificateStatusRequest() {
        return null;
    }

    @Override // org.bouncycastle.tls.AbstractTlsClient, org.bouncycastle.tls.TlsClient
    public TlsDHGroupVerifier getDHGroupVerifier() {
        return new ProvDHGroupVerifier();
    }

    @Override // org.bouncycastle.tls.AbstractTlsClient
    public Vector getProtocolNames() {
        return JsseUtils.getProtocolNames(this.sslParameters.getApplicationProtocols());
    }

    @Override // org.bouncycastle.tls.AbstractTlsClient
    public Vector getSNIServerNames() {
        String peerHostSNI;
        if (!provEnableSNIExtension) {
            return null;
        }
        List<BCSNIServerName> serverNames = this.sslParameters.getServerNames();
        if (serverNames == null && (peerHostSNI = this.manager.getPeerHostSNI()) != null && peerHostSNI.indexOf(46) > 0 && !IPAddress.isValid(peerHostSNI)) {
            try {
                serverNames = Collections.singletonList(new BCSNIHostName(peerHostSNI));
            } catch (RuntimeException unused) {
                LOG.fine("Failed to add peer host as default SNI host_name: ".concat(peerHostSNI));
            }
        }
        if (serverNames == null || serverNames.isEmpty()) {
            return null;
        }
        Vector vector = new Vector(serverNames.size());
        for (BCSNIServerName bCSNIServerName : serverNames) {
            vector.addElement(new ServerName((short) bCSNIServerName.getType(), bCSNIServerName.getEncoded()));
        }
        return vector;
    }

    @Override // org.bouncycastle.tls.AbstractTlsClient, org.bouncycastle.tls.TlsClient
    public TlsSession getSessionToResume() {
        TlsSession tlsSession;
        ProvSSLSession sessionImpl = this.manager.getContextData().getClientSessionContext().getSessionImpl(this.manager.getPeerHost(), this.manager.getPeerPort());
        if (sessionImpl != null && (tlsSession = sessionImpl.getTlsSession()) != null && isResumable(sessionImpl)) {
            this.sslSession = sessionImpl;
            return tlsSession;
        }
        if (this.manager.getEnableSessionCreation()) {
            return null;
        }
        throw new IllegalStateException("No resumable sessions and session creation is disabled");
    }

    @Override // org.bouncycastle.tls.DefaultTlsClient, org.bouncycastle.tls.AbstractTlsPeer
    public int[] getSupportedCipherSuites() {
        return this.manager.getContext().getActiveCipherSuites(getCrypto(), this.sslParameters, getProtocolVersions());
    }

    @Override // org.bouncycastle.tls.AbstractTlsClient
    public Vector getSupportedGroups(Vector vector) {
        return SupportedGroups.getClientSupportedGroups(getCrypto(), this.manager.getContext().isFips(), vector);
    }

    @Override // org.bouncycastle.tls.AbstractTlsClient
    public Vector getSupportedSignatureAlgorithms() {
        return JsseUtils.getSupportedSignatureAlgorithms(getCrypto());
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
        JsseSessionParameters jsseSessionParameters = provSSLSession.getJsseSessionParameters();
        String endpointIdentificationAlgorithm = this.sslParameters.getEndpointIdentificationAlgorithm();
        if (endpointIdentificationAlgorithm == null) {
            return true;
        }
        String identificationProtocol = jsseSessionParameters.getIdentificationProtocol();
        if (endpointIdentificationAlgorithm.equalsIgnoreCase(identificationProtocol)) {
            return true;
        }
        LOG.finest("Session not resumed - endpoint ID algorithm mismatch; requested: " + endpointIdentificationAlgorithm + ", session: " + identificationProtocol);
        return false;
    }

    @Override // org.bouncycastle.tls.AbstractTlsPeer, org.bouncycastle.tls.TlsPeer
    public void notifyAlertRaised(short s10, short s11, String str, Throwable th) {
        super.notifyAlertRaised(s10, s11, str, th);
        Level level = s10 == 1 ? Level.FINE : s11 == 80 ? Level.WARNING : Level.INFO;
        Logger logger = LOG;
        if (logger.isLoggable(level)) {
            String alertLogMessage = JsseUtils.getAlertLogMessage("Client raised", s10, s11);
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
            logger.log(level, JsseUtils.getAlertLogMessage("Client received", s10, s11));
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
            this.sslSession = this.manager.getContextData().getClientSessionContext().reportSession(this.manager.getPeerHost(), this.manager.getPeerPort(), session, new JsseSessionParameters(this.sslParameters.getEndpointIdentificationAlgorithm()));
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

    @Override // org.bouncycastle.tls.AbstractTlsClient, org.bouncycastle.tls.TlsClient
    public void notifySelectedCipherSuite(int i) {
        this.manager.getContext().validateNegotiatedCipherSuite(this.sslParameters, i);
        String cipherSuiteName = ProvSSLContextSpi.getCipherSuiteName(i);
        LOG.fine("Client notified of selected cipher suite: " + cipherSuiteName);
        super.notifySelectedCipherSuite(i);
    }

    @Override // org.bouncycastle.tls.AbstractTlsClient, org.bouncycastle.tls.TlsClient
    public void notifyServerVersion(ProtocolVersion protocolVersion) {
        this.manager.getContext().validateNegotiatedProtocol(this.sslParameters, protocolVersion);
        String protocolVersionName = ProvSSLContextSpi.getProtocolVersionName(protocolVersion);
        LOG.fine("Client notified of selected protocol version: " + protocolVersionName);
        super.notifyServerVersion(protocolVersion);
    }

    @Override // org.bouncycastle.tls.AbstractTlsClient, org.bouncycastle.tls.TlsClient
    public void notifySessionID(byte[] bArr) {
        ProvSSLSession provSSLSession;
        boolean z10 = bArr != null && bArr.length > 0 && (provSSLSession = this.sslSession) != null && Arrays.areEqual(bArr, provSSLSession.getId());
        if (z10) {
            LOG.fine("Server resumed session: " + Hex.toHexString(bArr));
        } else {
            if (bArr == null || bArr.length < 1) {
                LOG.fine("Server did not specify a session ID");
            } else {
                LOG.fine("Server specified new session: " + Hex.toHexString(bArr));
            }
            if (!this.manager.getEnableSessionCreation()) {
                throw new IllegalStateException("Server did not resume session and session creation is disabled");
            }
        }
        ProvSSLSessionContext clientSessionContext = this.manager.getContextData().getClientSessionContext();
        String peerHost = this.manager.getPeerHost();
        int peerPort = this.manager.getPeerPort();
        SecurityParameters securityParametersHandshake = this.context.getSecurityParametersHandshake();
        this.manager.notifyHandshakeSession(!z10 ? new ProvSSLSessionHandshake(clientSessionContext, peerHost, peerPort, securityParametersHandshake) : new ProvSSLSessionResumed(clientSessionContext, peerHost, peerPort, securityParametersHandshake, this.sslSession.getTlsSession(), this.sslSession.getJsseSessionParameters()));
    }
}
