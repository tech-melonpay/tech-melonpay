package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class o0 extends d0<O9.g, O9.h, n0> {

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f26421c = new o0(p0.f26424a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((O9.h) obj).f3018a.length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        n0 n0Var = (n0) obj;
        byte z11 = interfaceC1142b.g(this.f26388b, i).z();
        n0Var.b(n0Var.d() + 1);
        byte[] bArr = n0Var.f26418a;
        int i9 = n0Var.f26419b;
        n0Var.f26419b = i9 + 1;
        bArr[i9] = z11;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        byte[] bArr = ((O9.h) obj).f3018a;
        n0 n0Var = new n0();
        n0Var.f26418a = bArr;
        n0Var.f26419b = bArr.length;
        n0Var.b(10);
        return n0Var;
    }

    @Override // ra.d0
    public final O9.h j() {
        return new O9.h(new byte[0]);
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, O9.h hVar, int i) {
        byte[] bArr = hVar.f3018a;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.A(this.f26388b, i9).i(bArr[i9]);
        }
    }
}
