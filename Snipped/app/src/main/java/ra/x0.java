package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class x0 extends d0<O9.n, O9.o, w0> {

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f26453c = new x0(y0.f26455a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((O9.o) obj).f3031a.length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        w0 w0Var = (w0) obj;
        short A10 = interfaceC1142b.g(this.f26388b, i).A();
        w0Var.b(w0Var.d() + 1);
        short[] sArr = w0Var.f26449a;
        int i9 = w0Var.f26450b;
        w0Var.f26450b = i9 + 1;
        sArr[i9] = A10;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        short[] sArr = ((O9.o) obj).f3031a;
        w0 w0Var = new w0();
        w0Var.f26449a = sArr;
        w0Var.f26450b = sArr.length;
        w0Var.b(10);
        return w0Var;
    }

    @Override // ra.d0
    public final O9.o j() {
        return new O9.o(new short[0]);
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, O9.o oVar, int i) {
        short[] sArr = oVar.f3031a;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.A(this.f26388b, i9).h(sArr[i9]);
        }
    }
}
