package okhttp3;

import P9.s;
import ca.InterfaceC0635a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* compiled from: CertificatePinner.kt */
/* loaded from: classes2.dex */
public final class CertificatePinner {

    /* renamed from: c, reason: collision with root package name */
    public static final CertificatePinner f24405c = new CertificatePinner(s.g0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set<b> f24406a;

    /* renamed from: b, reason: collision with root package name */
    public final Ha.c f24407b;

    /* compiled from: CertificatePinner.kt */
    public static final class a {
        public static String a(X509Certificate x509Certificate) {
            if (!(x509Certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + ByteString.a.d(x509Certificate.getPublicKey().getEncoded()).c("SHA-256").a();
        }
    }

    /* compiled from: CertificatePinner.kt */
    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            if (!kotlin.jvm.internal.f.b(null, null)) {
                return false;
            }
            bVar.getClass();
            if (!kotlin.jvm.internal.f.b(null, null)) {
                return false;
            }
            bVar.getClass();
            return kotlin.jvm.internal.f.b(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set<b> set, Ha.c cVar) {
        this.f24406a = set;
        this.f24407b = cVar;
    }

    public final void a(final String str, final List<? extends Certificate> list) {
        b(str, new InterfaceC0635a<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final List<? extends X509Certificate> invoke() {
                Ha.c cVar = CertificatePinner.this.f24407b;
                List<Certificate> list2 = list;
                if (cVar != null) {
                    list2 = cVar.G(str, list2);
                }
                List<Certificate> list3 = list2;
                ArrayList arrayList = new ArrayList(P9.n.u(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            }
        });
    }

    public final void b(String str, InterfaceC0635a<? extends List<? extends X509Certificate>> interfaceC0635a) {
        Set<b> set = this.f24406a;
        EmptyList emptyList = EmptyList.f23104a;
        Iterator<T> it = set.iterator();
        if (it.hasNext()) {
            ((b) it.next()).getClass();
            throw null;
        }
        emptyList.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (kotlin.jvm.internal.f.b(certificatePinner.f24406a, this.f24406a) && kotlin.jvm.internal.f.b(certificatePinner.f24407b, this.f24407b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f24406a.hashCode() + 1517) * 41;
        Ha.c cVar = this.f24407b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
