package org.bouncycastle.jsse.provider;

import androidx.camera.core.impl.utils.a;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreParameters;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;

/* loaded from: classes.dex */
class ProvX509TrustManager extends BCX509ExtendedTrustManager {
    private static final Logger LOG = Logger.getLogger(ProvX509TrustManager.class.getName());
    private static final boolean provCheckRevocation = PropertyUtils.getBooleanSystemProperty("com.sun.net.ssl.checkRevocation", false);
    private final PKIXParameters baseParameters;
    private final X509TrustManager exportX509TrustManager;
    private final JcaJceHelper helper;
    private final Set<X509Certificate> trustedCerts;

    public ProvX509TrustManager(JcaJceHelper jcaJceHelper, PKIXParameters pKIXParameters) {
        this.helper = jcaJceHelper;
        this.trustedCerts = getTrustedCerts(pKIXParameters.getTrustAnchors());
        if (pKIXParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) pKIXParameters.clone();
            this.baseParameters = pKIXBuilderParameters;
            pKIXBuilderParameters.setTargetCertConstraints(null);
        } else {
            PKIXBuilderParameters pKIXBuilderParameters2 = new PKIXBuilderParameters(pKIXParameters.getTrustAnchors(), (CertSelector) null);
            this.baseParameters = pKIXBuilderParameters2;
            pKIXBuilderParameters2.setAnyPolicyInhibited(pKIXParameters.isAnyPolicyInhibited());
            pKIXBuilderParameters2.setCertPathCheckers(pKIXParameters.getCertPathCheckers());
            pKIXBuilderParameters2.setCertStores(pKIXParameters.getCertStores());
            pKIXBuilderParameters2.setDate(pKIXParameters.getDate());
            pKIXBuilderParameters2.setExplicitPolicyRequired(pKIXParameters.isExplicitPolicyRequired());
            pKIXBuilderParameters2.setInitialPolicies(pKIXParameters.getInitialPolicies());
            pKIXBuilderParameters2.setPolicyMappingInhibited(pKIXParameters.isPolicyMappingInhibited());
            pKIXBuilderParameters2.setPolicyQualifiersRejected(pKIXParameters.getPolicyQualifiersRejected());
            pKIXBuilderParameters2.setRevocationEnabled(pKIXParameters.isRevocationEnabled());
            pKIXBuilderParameters2.setSigProvider(pKIXParameters.getSigProvider());
        }
        this.exportX509TrustManager = X509TrustManagerUtil.exportX509TrustManager(this);
    }

    private static void checkEndpointID(String str, X509Certificate x509Certificate, String str2) {
        boolean z10;
        String stripSquareBrackets = JsseUtils.stripSquareBrackets(str);
        if (str2.equalsIgnoreCase("HTTPS")) {
            z10 = true;
        } else {
            if (!str2.equalsIgnoreCase("LDAP") && !str2.equalsIgnoreCase("LDAPS")) {
                throw new CertificateException("Unknown endpoint ID algorithm: ".concat(str2));
            }
            z10 = false;
        }
        HostnameUtil.checkHostname(stripSquareBrackets, x509Certificate, z10);
    }

    public static void checkExtendedTrust(X509Certificate[] x509CertificateArr, String str, Socket socket, boolean z10) {
        if ((socket instanceof SSLSocket) && socket.isConnected()) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            checkExtendedTrust(x509CertificateArr, str, z10, getHandshakeSession(sSLSocket), getSSLParameters(sSLSocket));
        }
    }

    private void checkTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket, boolean z10) {
        checkExtendedTrust(validateChain(x509CertificateArr, str, z10), str, socket, z10);
    }

    private CertStoreParameters getCertStoreParameters(X509Certificate x509Certificate, X509Certificate[] x509CertificateArr) {
        ArrayList arrayList = new ArrayList(x509CertificateArr.length);
        arrayList.add(x509Certificate);
        for (int i = 1; i < x509CertificateArr.length; i++) {
            if (!this.trustedCerts.contains(x509CertificateArr[i])) {
                arrayList.add(x509CertificateArr[i]);
            }
        }
        return new CollectionCertStoreParameters(arrayList);
    }

    private static BCExtendedSSLSession getHandshakeSession(SSLEngine sSLEngine) {
        BCExtendedSSLSession importHandshakeSession = SSLEngineUtil.importHandshakeSession(sSLEngine);
        if (importHandshakeSession != null) {
            return importHandshakeSession;
        }
        throw new CertificateException("No handshake session for engine");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if ((r1 instanceof org.bouncycastle.jsse.BCSNIHostName) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        return (org.bouncycastle.jsse.BCSNIHostName) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        return new org.bouncycastle.jsse.BCSNIHostName(r1.getEncoded());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.bouncycastle.jsse.BCSNIHostName getSNIHostName(org.bouncycastle.jsse.BCExtendedSSLSession r3) {
        /*
            java.util.List r3 = r3.getRequestedServerNames()
            r0 = 0
            if (r3 == 0) goto L30
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r3.next()
            org.bouncycastle.jsse.BCSNIServerName r1 = (org.bouncycastle.jsse.BCSNIServerName) r1
            if (r1 == 0) goto Lb
            int r2 = r1.getType()
            if (r2 != 0) goto Lb
            boolean r3 = r1 instanceof org.bouncycastle.jsse.BCSNIHostName
            if (r3 == 0) goto L26
            org.bouncycastle.jsse.BCSNIHostName r1 = (org.bouncycastle.jsse.BCSNIHostName) r1
            return r1
        L26:
            org.bouncycastle.jsse.BCSNIHostName r3 = new org.bouncycastle.jsse.BCSNIHostName     // Catch: java.lang.RuntimeException -> L30
            byte[] r1 = r1.getEncoded()     // Catch: java.lang.RuntimeException -> L30
            r3.<init>(r1)     // Catch: java.lang.RuntimeException -> L30
            return r3
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jsse.provider.ProvX509TrustManager.getSNIHostName(org.bouncycastle.jsse.BCExtendedSSLSession):org.bouncycastle.jsse.BCSNIHostName");
    }

    private static BCSSLParameters getSSLParameters(SSLEngine sSLEngine) {
        BCSSLParameters importSSLParameters = SSLEngineUtil.importSSLParameters(sSLEngine);
        if (importSSLParameters != null) {
            return importSSLParameters;
        }
        throw new CertificateException("No SSL parameters for engine");
    }

    private static X509Certificate getTrustedCert(TrustAnchor trustAnchor) {
        X509Certificate trustedCert = trustAnchor.getTrustedCert();
        if (trustedCert != null) {
            return trustedCert;
        }
        throw new CertificateException("No certificate for TrustAnchor");
    }

    private static Set<X509Certificate> getTrustedCerts(Set<TrustAnchor> set) {
        X509Certificate trustedCert;
        HashSet hashSet = new HashSet(set.size());
        for (TrustAnchor trustAnchor : set) {
            if (trustAnchor != null && (trustedCert = trustAnchor.getTrustedCert()) != null) {
                hashSet.add(trustedCert);
            }
        }
        return hashSet;
    }

    private static X509Certificate[] getTrustedChain(CertPath certPath, TrustAnchor trustAnchor) {
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        X509Certificate[] x509CertificateArr = new X509Certificate[size + 1];
        certificates.toArray(x509CertificateArr);
        x509CertificateArr[size] = getTrustedCert(trustAnchor);
        return x509CertificateArr;
    }

    private X509Certificate[] validateChain(X509Certificate[] x509CertificateArr, String str, boolean z10) {
        if (x509CertificateArr == null || x509CertificateArr.length < 1) {
            throw new IllegalArgumentException("'chain' must be a chain of at least one certificate");
        }
        if (str == null || str.length() < 1) {
            throw new IllegalArgumentException("'authType' must be a non-null, non-empty string");
        }
        X509Certificate x509Certificate = x509CertificateArr[0];
        if (this.trustedCerts.contains(x509Certificate)) {
            return new X509Certificate[]{x509Certificate};
        }
        try {
            Provider provider = this.helper.createCertificateFactory("X.509").getProvider();
            CertStore certStore = CertStore.getInstance("Collection", getCertStoreParameters(x509Certificate, x509CertificateArr), provider);
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setCertificate(x509Certificate);
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) this.baseParameters.clone();
            pKIXBuilderParameters.addCertStore(certStore);
            pKIXBuilderParameters.setTargetCertConstraints(x509CertSelector);
            PKIXCertPathBuilderResult pKIXCertPathBuilderResult = (PKIXCertPathBuilderResult) CertPathBuilder.getInstance("PKIX", provider).build(pKIXBuilderParameters);
            return getTrustedChain(pKIXCertPathBuilderResult.getCertPath(), pKIXCertPathBuilderResult.getTrustAnchor());
        } catch (GeneralSecurityException e10) {
            throw new CertificateException(a.p(e10, new StringBuilder("unable to process certificates: ")), e10);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        checkTrusted(x509CertificateArr, str, (Socket) null, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        checkTrusted(x509CertificateArr, str, (Socket) null, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        Set<X509Certificate> set = this.trustedCerts;
        return (X509Certificate[]) set.toArray(new X509Certificate[set.size()]);
    }

    public X509TrustManager getExportX509TrustManager() {
        return this.exportX509TrustManager;
    }

    public ProvX509TrustManager(JcaJceHelper jcaJceHelper, Set<TrustAnchor> set) {
        this.helper = jcaJceHelper;
        this.trustedCerts = getTrustedCerts(set);
        PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(set, (CertSelector) null);
        this.baseParameters = pKIXBuilderParameters;
        pKIXBuilderParameters.setRevocationEnabled(provCheckRevocation);
        this.exportX509TrustManager = X509TrustManagerUtil.exportX509TrustManager(this);
    }

    private static void checkEndpointID(X509Certificate x509Certificate, String str, boolean z10, BCExtendedSSLSession bCExtendedSSLSession) {
        BCSNIHostName sNIHostName;
        String peerHost = bCExtendedSSLSession.getPeerHost();
        if (z10 && (sNIHostName = getSNIHostName(bCExtendedSSLSession)) != null) {
            String asciiName = sNIHostName.getAsciiName();
            if (!asciiName.equalsIgnoreCase(peerHost)) {
                try {
                    checkEndpointID(asciiName, x509Certificate, str);
                    return;
                } catch (CertificateException e10) {
                    LOG.log(Level.FINE, "Server's endpoint ID did not match the SNI host_name: ".concat(asciiName), (Throwable) e10);
                }
            }
        }
        checkEndpointID(peerHost, x509Certificate, str);
    }

    public static void checkExtendedTrust(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine, boolean z10) {
        if (sSLEngine != null) {
            checkExtendedTrust(x509CertificateArr, str, z10, getHandshakeSession(sSLEngine), getSSLParameters(sSLEngine));
        }
    }

    private void checkTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine, boolean z10) {
        checkExtendedTrust(validateChain(x509CertificateArr, str, z10), str, sSLEngine, z10);
    }

    private static BCExtendedSSLSession getHandshakeSession(SSLSocket sSLSocket) {
        BCExtendedSSLSession importHandshakeSession = SSLSocketUtil.importHandshakeSession(sSLSocket);
        if (importHandshakeSession != null) {
            return importHandshakeSession;
        }
        throw new CertificateException("No handshake session for socket");
    }

    private static BCSSLParameters getSSLParameters(SSLSocket sSLSocket) {
        BCSSLParameters importSSLParameters = SSLSocketUtil.importSSLParameters(sSLSocket);
        if (importSSLParameters != null) {
            return importSSLParameters;
        }
        throw new CertificateException("No SSL parameters for socket");
    }

    @Override // org.bouncycastle.jsse.BCX509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        checkTrusted(x509CertificateArr, str, socket, false);
    }

    @Override // org.bouncycastle.jsse.BCX509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        checkTrusted(x509CertificateArr, str, socket, true);
    }

    private static void checkExtendedTrust(X509Certificate[] x509CertificateArr, String str, boolean z10, BCExtendedSSLSession bCExtendedSSLSession, BCSSLParameters bCSSLParameters) {
        String endpointIdentificationAlgorithm = bCSSLParameters.getEndpointIdentificationAlgorithm();
        if (endpointIdentificationAlgorithm == null || endpointIdentificationAlgorithm.length() <= 0) {
            return;
        }
        checkEndpointID(x509CertificateArr[0], endpointIdentificationAlgorithm, z10, bCExtendedSSLSession);
    }

    @Override // org.bouncycastle.jsse.BCX509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        checkTrusted(x509CertificateArr, str, sSLEngine, false);
    }

    @Override // org.bouncycastle.jsse.BCX509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        checkTrusted(x509CertificateArr, str, sSLEngine, true);
    }
}
