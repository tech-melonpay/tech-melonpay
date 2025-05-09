package org.bouncycastle.jsse.provider;

import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;

/* loaded from: classes.dex */
class ImportX509TrustManager_5 extends BCX509ExtendedTrustManager implements ImportX509TrustManager {
    final X509TrustManager x509TrustManager;

    public ImportX509TrustManager_5(X509TrustManager x509TrustManager) {
        this.x509TrustManager = x509TrustManager;
    }

    private static X509Certificate[] checkChain(X509Certificate[] x509CertificateArr) {
        if (x509CertificateArr == null || x509CertificateArr.length < 1) {
            throw new IllegalArgumentException("'chain' must be a chain of at least one certificate");
        }
        return x509CertificateArr;
    }

    private static X509Certificate[] copyChain(X509Certificate[] x509CertificateArr) {
        return (X509Certificate[]) checkChain(x509CertificateArr).clone();
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.x509TrustManager.checkClientTrusted(checkChain(x509CertificateArr), str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.x509TrustManager.checkServerTrusted(checkChain(x509CertificateArr), str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.x509TrustManager.getAcceptedIssuers();
    }

    @Override // org.bouncycastle.jsse.provider.ImportX509TrustManager
    public X509TrustManager unwrap() {
        return this.x509TrustManager;
    }

    @Override // org.bouncycastle.jsse.BCX509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        this.x509TrustManager.checkClientTrusted(copyChain(x509CertificateArr), str);
        ProvX509TrustManager.checkExtendedTrust(x509CertificateArr, str, socket, false);
    }

    @Override // org.bouncycastle.jsse.BCX509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        this.x509TrustManager.checkServerTrusted(copyChain(x509CertificateArr), str);
        ProvX509TrustManager.checkExtendedTrust(x509CertificateArr, str, socket, true);
    }

    @Override // org.bouncycastle.jsse.BCX509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        this.x509TrustManager.checkClientTrusted(copyChain(x509CertificateArr), str);
        ProvX509TrustManager.checkExtendedTrust(x509CertificateArr, str, sSLEngine, false);
    }

    @Override // org.bouncycastle.jsse.BCX509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        this.x509TrustManager.checkServerTrusted(copyChain(x509CertificateArr), str);
        ProvX509TrustManager.checkExtendedTrust(x509CertificateArr, str, sSLEngine, true);
    }
}
