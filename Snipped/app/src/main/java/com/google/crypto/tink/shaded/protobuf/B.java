package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: b, reason: collision with root package name */
    public static final a f10081b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final H f10082a;

    /* compiled from: ManifestSchemaFactory.java */
    public class a implements H {
        @Override // com.google.crypto.tink.shaded.protobuf.H
        public final G a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.H
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    public static class b implements H {

        /* renamed from: a, reason: collision with root package name */
        public H[] f10083a;

        @Override // com.google.crypto.tink.shaded.protobuf.H
        public final G a(Class<?> cls) {
            for (H h9 : this.f10083a) {
                if (h9.b(cls)) {
                    return h9.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.H
        public final boolean b(Class<?> cls) {
            for (H h9 : this.f10083a) {
                if (h9.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public B() {
        H h9;
        try {
            h9 = (H) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            h9 = f10081b;
        }
        H[] hArr = {C0671s.f10263a, h9};
        b bVar = new b();
        bVar.f10083a = hArr;
        Charset charset = C0673u.f10266a;
        this.f10082a = bVar;
    }
}
