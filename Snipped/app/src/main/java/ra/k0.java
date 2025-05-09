package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class k0 extends d0<Short, short[], j0> {

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f26410c = new k0(l0.f26411a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        j0 j0Var = (j0) obj;
        short m2 = interfaceC1142b.m(this.f26388b, i);
        j0Var.b(j0Var.d() + 1);
        short[] sArr = j0Var.f26407a;
        int i9 = j0Var.f26408b;
        j0Var.f26408b = i9 + 1;
        sArr[i9] = m2;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        j0 j0Var = new j0();
        j0Var.f26407a = sArr;
        j0Var.f26408b = sArr.length;
        j0Var.b(10);
        return j0Var;
    }

    @Override // ra.d0
    public final short[] j() {
        return new short[0];
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, short[] sArr, int i) {
        short[] sArr2 = sArr;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.o(this.f26388b, i9, sArr2[i9]);
        }
    }
}
