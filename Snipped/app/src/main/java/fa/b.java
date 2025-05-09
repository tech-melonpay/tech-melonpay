package Fa;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: AndroidCertificateChainCleaner.kt */
/* loaded from: classes2.dex */
public final class b extends Ha.c {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f1285a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f1286b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f1285a = x509TrustManager;
        this.f1286b = x509TrustManagerExtensions;
    }

    @Override // Ha.c
    public final List G(String str, List list) {
        try {
            return this.f1286b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f1285a == this.f1285a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1285a);
    }
}
