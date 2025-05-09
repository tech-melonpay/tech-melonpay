package com.google.crypto.tink.shaded.protobuf;

/* compiled from: CodedOutputStreamWriter.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663j {

    /* renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f10246a;

    public C0663j(CodedOutputStream codedOutputStream) {
        C0673u.a(codedOutputStream, "output");
        this.f10246a = codedOutputStream;
        codedOutputStream.f10092a = this;
    }

    public final void a(int i, boolean z10) {
        this.f10246a.m0(i, z10);
    }

    public final void b(int i, ByteString byteString) {
        this.f10246a.n0(i, byteString);
    }

    public final void c(int i, double d10) {
        CodedOutputStream codedOutputStream = this.f10246a;
        codedOutputStream.getClass();
        codedOutputStream.q0(i, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i, int i9) {
        this.f10246a.s0(i, i9);
    }

    public final void e(int i, int i9) {
        this.f10246a.o0(i, i9);
    }

    public final void f(int i, long j10) {
        this.f10246a.q0(i, j10);
    }

    public final void g(int i, float f10) {
        CodedOutputStream codedOutputStream = this.f10246a;
        codedOutputStream.getClass();
        codedOutputStream.o0(i, Float.floatToRawIntBits(f10));
    }

    public final void h(int i, Object obj, X x9) {
        CodedOutputStream codedOutputStream = this.f10246a;
        codedOutputStream.y0(i, 3);
        x9.d((I) obj, codedOutputStream.f10092a);
        codedOutputStream.y0(i, 4);
    }

    public final void i(int i, int i9) {
        this.f10246a.s0(i, i9);
    }

    public final void j(int i, long j10) {
        this.f10246a.B0(i, j10);
    }

    public final void k(int i, Object obj, X x9) {
        this.f10246a.u0(i, (I) obj, x9);
    }

    public final void l(int i, Object obj) {
        boolean z10 = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f10246a;
        if (z10) {
            codedOutputStream.w0(i, (ByteString) obj);
        } else {
            codedOutputStream.v0(i, (I) obj);
        }
    }

    public final void m(int i, int i9) {
        this.f10246a.o0(i, i9);
    }

    public final void n(int i, long j10) {
        this.f10246a.q0(i, j10);
    }

    public final void o(int i, int i9) {
        this.f10246a.z0(i, (i9 >> 31) ^ (i9 << 1));
    }

    public final void p(int i, long j10) {
        this.f10246a.B0(i, (j10 >> 63) ^ (j10 << 1));
    }

    public final void q(int i, int i9) {
        this.f10246a.z0(i, i9);
    }

    public final void r(int i, long j10) {
        this.f10246a.B0(i, j10);
    }
}
