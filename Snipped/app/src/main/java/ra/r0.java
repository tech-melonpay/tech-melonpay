package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class r0 extends d0<O9.i, O9.j, q0> {

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f26429c = new r0(s0.f26432a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((O9.j) obj).f3022a.length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        q0 q0Var = (q0) obj;
        int n10 = interfaceC1142b.g(this.f26388b, i).n();
        q0Var.b(q0Var.d() + 1);
        int[] iArr = q0Var.f26426a;
        int i9 = q0Var.f26427b;
        q0Var.f26427b = i9 + 1;
        iArr[i9] = n10;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        int[] iArr = ((O9.j) obj).f3022a;
        q0 q0Var = new q0();
        q0Var.f26426a = iArr;
        q0Var.f26427b = iArr.length;
        q0Var.b(10);
        return q0Var;
    }

    @Override // ra.d0
    public final O9.j j() {
        return new O9.j(new int[0]);
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, O9.j jVar, int i) {
        int[] iArr = jVar.f3022a;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.A(this.f26388b, i9).y(iArr[i9]);
        }
    }
}
