package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes.dex */
public final class f0 extends d0<e0, e0> {
    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final void a(int i, int i9, Object obj) {
        ((e0) obj).b((i << 3) | 5, Integer.valueOf(i9));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final void b(long j10, int i, Object obj) {
        ((e0) obj).b((i << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final void c(int i, Object obj, Object obj2) {
        ((e0) obj).b((i << 3) | 3, (e0) obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final void d(e0 e0Var, int i, ByteString byteString) {
        e0Var.b((i << 3) | 2, byteString);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final void e(long j10, int i, Object obj) {
        ((e0) obj).b(i << 3, Long.valueOf(j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final e0 f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        e0 e0Var = generatedMessageLite.unknownFields;
        if (e0Var != e0.f10210f) {
            return e0Var;
        }
        e0 e0Var2 = new e0();
        generatedMessageLite.unknownFields = e0Var2;
        return e0Var2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final e0 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final int h(e0 e0Var) {
        return e0Var.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final int i(e0 e0Var) {
        e0 e0Var2 = e0Var;
        int i = e0Var2.f10214d;
        if (i != -1) {
            return i;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < e0Var2.f10211a; i10++) {
            int i11 = e0Var2.f10212b[i10] >>> 3;
            i9 += CodedOutputStream.O(3, (ByteString) e0Var2.f10213c[i10]) + CodedOutputStream.h0(2, i11) + (CodedOutputStream.g0(1) * 2);
        }
        e0Var2.f10214d = i9;
        return i9;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final void j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f10215e = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final e0 k(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        e0 e0Var2 = (e0) obj2;
        if (e0Var2.equals(e0.f10210f)) {
            return e0Var;
        }
        int i = e0Var.f10211a + e0Var2.f10211a;
        int[] copyOf = Arrays.copyOf(e0Var.f10212b, i);
        System.arraycopy(e0Var2.f10212b, 0, copyOf, e0Var.f10211a, e0Var2.f10211a);
        Object[] copyOf2 = Arrays.copyOf(e0Var.f10213c, i);
        System.arraycopy(e0Var2.f10213c, 0, copyOf2, e0Var.f10211a, e0Var2.f10211a);
        return new e0(i, copyOf, copyOf2, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final e0 m() {
        return new e0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final void n(Object obj, e0 e0Var) {
        ((GeneratedMessageLite) obj).unknownFields = e0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final void o(Object obj, e0 e0Var) {
        ((GeneratedMessageLite) obj).unknownFields = e0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final e0 p(Object obj) {
        e0 e0Var = (e0) obj;
        e0Var.f10215e = false;
        return e0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final void q(Object obj, C0663j c0663j) {
        e0 e0Var = (e0) obj;
        e0Var.getClass();
        c0663j.getClass();
        for (int i = 0; i < e0Var.f10211a; i++) {
            c0663j.l(e0Var.f10212b[i] >>> 3, e0Var.f10213c[i]);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final void r(Object obj, C0663j c0663j) {
        ((e0) obj).c(c0663j);
    }
}
