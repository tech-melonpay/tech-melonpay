package J5;

import com.luminary.business.domain.entity.REQUESTS;
import java.util.List;
import java.util.NoSuchElementException;
import r5.C1150a;

/* compiled from: Failure.kt */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: Failure.kt */
    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2147a;

        /* renamed from: b, reason: collision with root package name */
        public final C1150a f2148b;

        public a(int i, C1150a c1150a) {
            this.f2147a = i;
            this.f2148b = c1150a;
        }

        @Override // J5.b
        public final int a() {
            return this.f2147a;
        }

        @Override // J5.b
        public final String b() {
            String a10;
            C1150a.c f10;
            String a11;
            String e10;
            C1150a c1150a = this.f2148b;
            C1150a.C0465a a12 = c1150a.a();
            if (a12 != null && (e10 = a12.e()) != null) {
                return e10;
            }
            C1150a.C0465a a13 = c1150a.a();
            if (a13 != null && (f10 = a13.f()) != null && (a11 = f10.a()) != null) {
                return a11;
            }
            List<C1150a.b> b9 = c1150a.b();
            if (b9 != null) {
                for (C1150a.b bVar : b9) {
                    String a14 = bVar.a();
                    if (!(a14 == null || a14.length() == 0)) {
                        if (bVar != null && (a10 = bVar.a()) != null) {
                            return a10;
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            return "";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2147a == aVar.f2147a && kotlin.jvm.internal.f.b(this.f2148b, aVar.f2148b);
        }

        public final int hashCode() {
            return this.f2148b.hashCode() + (Integer.hashCode(this.f2147a) * 31);
        }

        @Override // J5.b
        public final String toString() {
            return "ErrorResponse(responseCode=" + this.f2147a + ", error=" + this.f2148b + ")";
        }
    }

    /* compiled from: Failure.kt */
    /* renamed from: J5.b$b, reason: collision with other inner class name */
    public static final class C0027b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2149a;

        /* renamed from: b, reason: collision with root package name */
        public final r5.b f2150b;

        public C0027b(int i, r5.b bVar) {
            this.f2149a = i;
            this.f2150b = bVar;
        }

        @Override // J5.b
        public final int a() {
            return this.f2149a;
        }

        @Override // J5.b
        public final String b() {
            String a10;
            r5.b bVar = this.f2150b;
            String c2 = bVar.c();
            if (c2 != null) {
                return c2;
            }
            List<C1150a.b> b9 = bVar.b();
            if (b9 != null) {
                for (C1150a.b bVar2 : b9) {
                    String a11 = bVar2.a();
                    if (!(a11 == null || a11.length() == 0)) {
                        if (bVar2 != null && (a10 = bVar2.a()) != null) {
                            return a10;
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            return "";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0027b)) {
                return false;
            }
            C0027b c0027b = (C0027b) obj;
            return this.f2149a == c0027b.f2149a && kotlin.jvm.internal.f.b(this.f2150b, c0027b.f2150b);
        }

        public final int hashCode() {
            return this.f2150b.hashCode() + (Integer.hashCode(this.f2149a) * 31);
        }

        @Override // J5.b
        public final String toString() {
            return "ErrorResponseSimple(responseCode=" + this.f2149a + ", error=" + this.f2150b + ")";
        }
    }

    /* compiled from: Failure.kt */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f2151a;

        public c(String str) {
            this.f2151a = str;
        }

        @Override // J5.b
        public final int a() {
            return 0;
        }

        @Override // J5.b
        public final String b() {
            return this.f2151a;
        }
    }

    /* compiled from: Failure.kt */
    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2152a;

        public d(int i) {
            this.f2152a = i;
        }

        @Override // J5.b
        public final int a() {
            return this.f2152a;
        }

        @Override // J5.b
        public final String b() {
            return "Network error";
        }
    }

    /* compiled from: Failure.kt */
    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2153a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2154b;

        /* renamed from: c, reason: collision with root package name */
        public String f2155c;

        public e(int i, String str) {
            this.f2153a = i;
            this.f2154b = str;
            REQUESTS[] requestsArr = REQUESTS.f10692a;
            this.f2155c = "";
        }

        @Override // J5.b
        public final int a() {
            return this.f2153a;
        }

        @Override // J5.b
        public final String b() {
            return "";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f2153a == eVar.f2153a && kotlin.jvm.internal.f.b(this.f2154b, eVar.f2154b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f2153a) * 31;
            String str = this.f2154b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // J5.b
        public final String toString() {
            return "TfaLoginResponse(responseCode=" + this.f2153a + ", token=" + this.f2154b + ")";
        }
    }

    /* compiled from: Failure.kt */
    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2156a;

        /* renamed from: b, reason: collision with root package name */
        public final r5.c f2157b;

        /* renamed from: c, reason: collision with root package name */
        public String f2158c;

        public f(int i, r5.c cVar) {
            this.f2156a = i;
            this.f2157b = cVar;
            REQUESTS[] requestsArr = REQUESTS.f10692a;
            this.f2158c = "";
        }

        @Override // J5.b
        public final int a() {
            return this.f2156a;
        }

        @Override // J5.b
        public final String b() {
            return "";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f2156a == fVar.f2156a && kotlin.jvm.internal.f.b(this.f2157b, fVar.f2157b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f2156a) * 31;
            r5.c cVar = this.f2157b;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        @Override // J5.b
        public final String toString() {
            return "TfaResponse(responseCode=" + this.f2156a + ", error=" + this.f2157b + ")";
        }
    }

    public abstract int a();

    public abstract String b();

    public String toString() {
        return b();
    }
}
