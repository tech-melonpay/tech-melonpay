package n3;

import com.google.gson.reflect.TypeToken;
import n3.p;
import r3.C1149a;
import x4.C1589a;

/* compiled from: TreeTypeAdapter.java */
/* loaded from: classes.dex */
public final class n<T> extends m<T> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.p<T> f24158a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.k<T> f24159b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.g f24160c;

    /* renamed from: d, reason: collision with root package name */
    public final TypeToken<T> f24161d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.gson.s f24162e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24163f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.google.gson.r<T> f24164g;

    /* compiled from: TreeTypeAdapter.java */
    public final class a {
    }

    /* compiled from: TreeTypeAdapter.java */
    public static final class b implements com.google.gson.s {

        /* renamed from: a, reason: collision with root package name */
        public final TypeToken<?> f24165a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f24166b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<?> f24167c = null;

        /* renamed from: d, reason: collision with root package name */
        public final com.google.gson.p<?> f24168d;

        /* renamed from: e, reason: collision with root package name */
        public final com.google.gson.k<?> f24169e;

        public b(C1589a c1589a, TypeToken typeToken, boolean z10) {
            this.f24168d = c1589a;
            this.f24169e = c1589a;
            this.f24165a = typeToken;
            this.f24166b = z10;
        }

        @Override // com.google.gson.s
        public final <T> com.google.gson.r<T> a(com.google.gson.g gVar, TypeToken<T> typeToken) {
            TypeToken<?> typeToken2 = this.f24165a;
            if (typeToken2 == null ? !this.f24167c.isAssignableFrom(typeToken.getRawType()) : !(typeToken2.equals(typeToken) || (this.f24166b && typeToken2.getType() == typeToken.getRawType()))) {
                return null;
            }
            return new n(this.f24168d, this.f24169e, gVar, typeToken, this, true);
        }
    }

    public n(com.google.gson.p<T> pVar, com.google.gson.k<T> kVar, com.google.gson.g gVar, TypeToken<T> typeToken, com.google.gson.s sVar, boolean z10) {
        this.f24158a = pVar;
        this.f24159b = kVar;
        this.f24160c = gVar;
        this.f24161d = typeToken;
        this.f24162e = sVar;
        this.f24163f = z10;
    }

    @Override // com.google.gson.r
    public final T a(C1149a c1149a) {
        com.google.gson.k<T> kVar = this.f24159b;
        if (kVar == null) {
            return d().a(c1149a);
        }
        com.google.gson.l z10 = j3.e.z(c1149a);
        if (this.f24163f) {
            z10.getClass();
            if (z10 instanceof com.google.gson.m) {
                return null;
            }
        }
        this.f24161d.getType();
        return (T) kVar.a(z10);
    }

    @Override // com.google.gson.r
    public final void b(r3.b bVar, T t3) {
        com.google.gson.p<T> pVar = this.f24158a;
        if (pVar == null) {
            d().b(bVar, t3);
            return;
        }
        if (this.f24163f && t3 == null) {
            bVar.E();
            return;
        }
        this.f24161d.getType();
        com.google.gson.l b9 = pVar.b(t3);
        p.f24174B.getClass();
        p.t.d(b9, bVar);
    }

    @Override // n3.m
    public final com.google.gson.r<T> c() {
        return this.f24158a != null ? this : d();
    }

    public final com.google.gson.r<T> d() {
        com.google.gson.r<T> rVar = this.f24164g;
        if (rVar != null) {
            return rVar;
        }
        com.google.gson.r<T> e10 = this.f24160c.e(this.f24162e, this.f24161d);
        this.f24164g = e10;
        return e10;
    }
}
