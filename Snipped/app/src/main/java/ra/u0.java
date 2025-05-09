package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class u0 extends d0<O9.k, O9.l, t0> {

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f26439c = new u0(v0.f26442a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((O9.l) obj).f3026a.length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        t0 t0Var = (t0) obj;
        long r8 = interfaceC1142b.g(this.f26388b, i).r();
        t0Var.b(t0Var.d() + 1);
        long[] jArr = t0Var.f26435a;
        int i9 = t0Var.f26436b;
        t0Var.f26436b = i9 + 1;
        jArr[i9] = r8;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        long[] jArr = ((O9.l) obj).f3026a;
        t0 t0Var = new t0();
        t0Var.f26435a = jArr;
        t0Var.f26436b = jArr.length;
        t0Var.b(10);
        return t0Var;
    }

    @Override // ra.d0
    public final O9.l j() {
        return new O9.l(new long[0]);
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, O9.l lVar, int i) {
        long[] jArr = lVar.f3026a;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.A(this.f26388b, i9).B(jArr[i9]);
        }
    }
}
