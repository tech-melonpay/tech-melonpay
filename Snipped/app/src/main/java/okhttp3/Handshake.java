package okhttp3;

import ca.InterfaceC0635a;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import okhttp3.TlsVersion;

/* compiled from: Handshake.kt */
/* loaded from: classes2.dex */
public final class Handshake {

    /* renamed from: a, reason: collision with root package name */
    public final TlsVersion f24411a;

    /* renamed from: b, reason: collision with root package name */
    public final d f24412b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Certificate> f24413c;

    /* renamed from: d, reason: collision with root package name */
    public final O9.f f24414d;

    /* compiled from: Handshake.kt */
    public static final class Companion {
        public static Handshake a(SSLSession sSLSession) {
            final List list;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (kotlin.jvm.internal.f.b(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || kotlin.jvm.internal.f.b(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            d b9 = d.f24487b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (kotlin.jvm.internal.f.b("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion a10 = TlsVersion.a.a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                list = peerCertificates != null ? wa.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : EmptyList.f23104a;
            } catch (SSLPeerUnverifiedException unused) {
                list = EmptyList.f23104a;
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new Handshake(a10, b9, localCertificates != null ? wa.b.k(Arrays.copyOf(localCertificates, localCertificates.length)) : EmptyList.f23104a, new InterfaceC0635a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // ca.InterfaceC0635a
                public final List<? extends Certificate> invoke() {
                    return list;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, d dVar, List<? extends Certificate> list, final InterfaceC0635a<? extends List<? extends Certificate>> interfaceC0635a) {
        this.f24411a = tlsVersion;
        this.f24412b = dVar;
        this.f24413c = list;
        this.f24414d = kotlin.a.a(new InterfaceC0635a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$peerCertificates$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final List<? extends Certificate> invoke() {
                try {
                    return interfaceC0635a.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.f23104a;
                }
            }
        });
    }

    public final List<Certificate> a() {
        return (List) this.f24414d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f24411a == this.f24411a && kotlin.jvm.internal.f.b(handshake.f24412b, this.f24412b) && kotlin.jvm.internal.f.b(handshake.a(), a()) && kotlin.jvm.internal.f.b(handshake.f24413c, this.f24413c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f24413c.hashCode() + ((a().hashCode() + ((this.f24412b.hashCode() + ((this.f24411a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> a10 = a();
        ArrayList arrayList = new ArrayList(P9.n.u(a10, 10));
        for (Certificate certificate : a10) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f24411a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f24412b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f24413c;
        ArrayList arrayList2 = new ArrayList(P9.n.u(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
