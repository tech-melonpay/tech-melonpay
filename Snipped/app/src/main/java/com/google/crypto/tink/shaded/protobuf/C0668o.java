package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668o extends AbstractC0667n<GeneratedMessageLite.d> {
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0667n
    public final void a(Map.Entry entry) {
        ((GeneratedMessageLite.d) entry.getKey()).getClass();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0667n
    public final GeneratedMessageLite.e b(C0666m c0666m, I i, int i9) {
        c0666m.getClass();
        return c0666m.f10252a.get(new C0666m.a(i, i9));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0667n
    public final C0670q<GeneratedMessageLite.d> c(Object obj) {
        return ((GeneratedMessageLite.c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0667n
    public final C0670q<GeneratedMessageLite.d> d(Object obj) {
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) obj;
        C0670q<GeneratedMessageLite.d> c0670q = cVar.extensions;
        if (c0670q.f10259b) {
            cVar.extensions = c0670q.clone();
        }
        return cVar.extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0667n
    public final boolean e(I i) {
        return i instanceof GeneratedMessageLite.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0667n
    public final void f(Object obj) {
        C0670q<GeneratedMessageLite.d> c0670q = ((GeneratedMessageLite.c) obj).extensions;
        if (c0670q.f10259b) {
            return;
        }
        c0670q.f10258a.g();
        c0670q.f10259b = true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0667n
    public final Object g(Object obj) {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0667n
    public final void h(Object obj) {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0667n
    public final void i(Object obj) {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0667n
    public final void j(Map.Entry entry) {
        ((GeneratedMessageLite.d) entry.getKey()).getClass();
        throw null;
    }
}
