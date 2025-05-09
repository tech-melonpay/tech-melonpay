package m3;

import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p3.C1106a;
import r3.C1149a;

/* compiled from: Excluder.java */
/* loaded from: classes.dex */
public final class g implements s, Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final g f23902f = new g();

    /* renamed from: a, reason: collision with root package name */
    public final double f23903a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    public final int f23904b = 136;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23905c = true;

    /* renamed from: d, reason: collision with root package name */
    public final List<com.google.gson.a> f23906d = Collections.emptyList();

    /* renamed from: e, reason: collision with root package name */
    public final List<com.google.gson.a> f23907e = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Excluder.java */
    public class a<T> extends r<T> {

        /* renamed from: a, reason: collision with root package name */
        public volatile r<T> f23908a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f23909b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f23910c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.g f23911d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TypeToken f23912e;

        public a(boolean z10, boolean z11, com.google.gson.g gVar, TypeToken typeToken) {
            this.f23909b = z10;
            this.f23910c = z11;
            this.f23911d = gVar;
            this.f23912e = typeToken;
        }

        @Override // com.google.gson.r
        public final T a(C1149a c1149a) {
            if (this.f23909b) {
                c1149a.t0();
                return null;
            }
            r<T> rVar = this.f23908a;
            if (rVar == null) {
                rVar = this.f23911d.e(g.this, this.f23912e);
                this.f23908a = rVar;
            }
            return rVar.a(c1149a);
        }

        @Override // com.google.gson.r
        public final void b(r3.b bVar, T t3) {
            if (this.f23910c) {
                bVar.E();
                return;
            }
            r<T> rVar = this.f23908a;
            if (rVar == null) {
                rVar = this.f23911d.e(g.this, this.f23912e);
                this.f23908a = rVar;
            }
            rVar.b(bVar, t3);
        }
    }

    @Override // com.google.gson.s
    public final <T> r<T> a(com.google.gson.g gVar, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        boolean b9 = b(rawType, true);
        boolean b10 = b(rawType, false);
        if (b9 || b10) {
            return new a(b10, b9, gVar, typeToken);
        }
        return null;
    }

    public final boolean b(Class<?> cls, boolean z10) {
        double d10 = this.f23903a;
        if (d10 != -1.0d) {
            l3.c cVar = (l3.c) cls.getAnnotation(l3.c.class);
            l3.d dVar = (l3.d) cls.getAnnotation(l3.d.class);
            if ((cVar != null && d10 < cVar.value()) || (dVar != null && d10 >= dVar.value())) {
                return true;
            }
        }
        if (!this.f23905c && cls.isMemberClass()) {
            C1106a.AbstractC0449a abstractC0449a = C1106a.f25612a;
            if (!Modifier.isStatic(cls.getModifiers())) {
                return true;
            }
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            C1106a.AbstractC0449a abstractC0449a2 = C1106a.f25612a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator<com.google.gson.a> it = (z10 ? this.f23906d : this.f23907e).iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (g) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
