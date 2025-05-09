package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: ra.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1184t extends d0<Double, double[], C1183s> {

    /* renamed from: c, reason: collision with root package name */
    public static final C1184t f26434c = new C1184t(C1185u.f26437a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        C1183s c1183s = (C1183s) obj;
        double s10 = interfaceC1142b.s(this.f26388b, i);
        c1183s.b(c1183s.d() + 1);
        double[] dArr = c1183s.f26430a;
        int i9 = c1183s.f26431b;
        c1183s.f26431b = i9 + 1;
        dArr[i9] = s10;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        C1183s c1183s = new C1183s();
        c1183s.f26430a = dArr;
        c1183s.f26431b = dArr.length;
        c1183s.b(10);
        return c1183s;
    }

    @Override // ra.d0
    public final double[] j() {
        return new double[0];
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, double[] dArr, int i) {
        double[] dArr2 = dArr;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.j(this.f26388b, i9, dArr2[i9]);
        }
    }
}
