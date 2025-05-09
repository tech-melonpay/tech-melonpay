package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0678z;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
public final class T {

    /* renamed from: c, reason: collision with root package name */
    public static final T f10158c = new T();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10160b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final B f10159a = new B();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.crypto.tink.shaded.protobuf.M] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.crypto.tink.shaded.protobuf.M] */
    public final <T> X<T> a(Class<T> cls) {
        L y10;
        L l10;
        Class<?> cls2;
        C0673u.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f10160b;
        X<T> x9 = (X) concurrentHashMap.get(cls);
        if (x9 != null) {
            return x9;
        }
        B b9 = this.f10159a;
        b9.getClass();
        Class<?> cls3 = Y.f10182a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = Y.f10182a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        G a10 = b9.f10082a.a(cls);
        if (a10.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                l10 = new M(Y.f10185d, C0669p.f10255a, a10.b());
            } else {
                d0<?, ?> d0Var = Y.f10183b;
                AbstractC0667n<?> abstractC0667n = C0669p.f10256b;
                if (abstractC0667n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                l10 = new M(d0Var, abstractC0667n, a10.b());
            }
            y10 = l10;
        } else {
            boolean isAssignableFrom = GeneratedMessageLite.class.isAssignableFrom(cls);
            ProtoSyntax protoSyntax = ProtoSyntax.f10155a;
            if (isAssignableFrom) {
                y10 = a10.c() == protoSyntax ? L.y(a10, P.f10154b, AbstractC0678z.f10274b, Y.f10185d, C0669p.f10255a, F.f10097b) : L.y(a10, P.f10154b, AbstractC0678z.f10274b, Y.f10185d, null, F.f10097b);
            } else if (a10.c() == protoSyntax) {
                N n10 = P.f10153a;
                AbstractC0678z.a aVar = AbstractC0678z.f10273a;
                d0<?, ?> d0Var2 = Y.f10183b;
                AbstractC0667n<?> abstractC0667n2 = C0669p.f10256b;
                if (abstractC0667n2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                y10 = L.y(a10, n10, aVar, d0Var2, abstractC0667n2, F.f10096a);
            } else {
                y10 = L.y(a10, P.f10153a, AbstractC0678z.f10273a, Y.f10184c, null, F.f10096a);
            }
        }
        X<T> x10 = (X) concurrentHashMap.putIfAbsent(cls, y10);
        return x10 != null ? x10 : y10;
    }
}
