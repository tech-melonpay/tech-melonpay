package I5;

import java.util.List;
import ka.C0969n;

/* compiled from: StatisticDomain.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f1868a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1869b;

    /* compiled from: StatisticDomain.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C0022a f1870a;

        /* renamed from: b, reason: collision with root package name */
        public final C0022a f1871b;

        /* compiled from: StatisticDomain.kt */
        /* renamed from: I5.p$a$a, reason: collision with other inner class name */
        public static final class C0022a {

            /* renamed from: a, reason: collision with root package name */
            public final String f1872a;

            public C0022a(String str) {
                this.f1872a = str;
            }

            public final String a() {
                String str = this.f1872a;
                if (str == null) {
                    return ".00";
                }
                List r02 = C0969n.r0(str, new String[]{"."});
                if (r02.size() < 2) {
                    return ".00";
                }
                String str2 = (String) r02.get(1);
                return str2.length() == 0 ? ".00" : str2.length() == 1 ? ".0".concat(str2) : ".".concat(str2);
            }

            public final String b() {
                return D9.b.p((String) C0969n.r0(this.f1872a, new String[]{"."}).get(0));
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0022a) && kotlin.jvm.internal.f.b(this.f1872a, ((C0022a) obj).f1872a);
            }

            public final int hashCode() {
                return this.f1872a.hashCode();
            }

            public final String toString() {
                return androidx.camera.core.impl.utils.a.n(new StringBuilder("ValueTotalTransactionDomain(value="), this.f1872a, ")");
            }
        }

        public a(C0022a c0022a, C0022a c0022a2) {
            this.f1870a = c0022a;
            this.f1871b = c0022a2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f1870a, aVar.f1870a) && kotlin.jvm.internal.f.b(this.f1871b, aVar.f1871b);
        }

        public final int hashCode() {
            return this.f1871b.f1872a.hashCode() + (this.f1870a.f1872a.hashCode() * 31);
        }

        public final String toString() {
            return "ReportDomain(incoming=" + this.f1870a + ", outgoing=" + this.f1871b + ")";
        }
    }

    public p(String str, a aVar) {
        this.f1868a = str;
        this.f1869b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.f.b(this.f1868a, pVar.f1868a) && kotlin.jvm.internal.f.b(this.f1869b, pVar.f1869b);
    }

    public final int hashCode() {
        return this.f1869b.hashCode() + (this.f1868a.hashCode() * 31);
    }

    public final String toString() {
        return "StatisticDomain(period=" + this.f1868a + ", reportDomain=" + this.f1869b + ")";
    }
}
