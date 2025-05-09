package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* compiled from: GeneratedMessageInfoFactory.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671s implements H {

    /* renamed from: a, reason: collision with root package name */
    public static final C0671s f10263a = new C0671s();

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final G a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (G) GeneratedMessageLite.l(cls.asSubclass(GeneratedMessageLite.class)).k(GeneratedMessageLite.MethodToInvoke.f10110c);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public final boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
