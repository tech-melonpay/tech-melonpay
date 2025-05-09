package n3;

import java.lang.reflect.Type;
import r3.C1149a;

/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* loaded from: classes.dex */
public final class o<T> extends com.google.gson.r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.g f24170a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.r<T> f24171b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f24172c;

    public o(com.google.gson.g gVar, com.google.gson.r<T> rVar, Type type) {
        this.f24170a = gVar;
        this.f24171b = rVar;
        this.f24172c = type;
    }

    @Override // com.google.gson.r
    public final T a(C1149a c1149a) {
        return this.f24171b.a(c1149a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if ((r1 instanceof n3.k.b) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(r3.b r5, T r6) {
        /*
            r4 = this;
            java.lang.reflect.Type r0 = r4.f24172c
            if (r6 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r6.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            com.google.gson.r<T> r2 = r4.f24171b
            if (r1 == r0) goto L3c
            com.google.gson.g r0 = r4.f24170a
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.r r0 = r0.d(r1)
            boolean r1 = r0 instanceof n3.k.b
            if (r1 != 0) goto L25
            goto L3b
        L25:
            r1 = r2
        L26:
            boolean r3 = r1 instanceof n3.m
            if (r3 == 0) goto L36
            r3 = r1
            n3.m r3 = (n3.m) r3
            com.google.gson.r r3 = r3.c()
            if (r3 != r1) goto L34
            goto L36
        L34:
            r1 = r3
            goto L26
        L36:
            boolean r1 = r1 instanceof n3.k.b
            if (r1 != 0) goto L3b
            goto L3c
        L3b:
            r2 = r0
        L3c:
            r2.b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.o.b(r3.b, java.lang.Object):void");
    }
}
