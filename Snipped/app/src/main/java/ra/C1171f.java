package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: ra.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1171f extends d0<Boolean, boolean[], C1170e> {

    /* renamed from: c, reason: collision with root package name */
    public static final C1171f f26393c = new C1171f(C1172g.f26395a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        C1170e c1170e = (C1170e) obj;
        boolean w2 = interfaceC1142b.w(this.f26388b, i);
        c1170e.b(c1170e.d() + 1);
        boolean[] zArr = c1170e.f26389a;
        int i9 = c1170e.f26390b;
        c1170e.f26390b = i9 + 1;
        zArr[i9] = w2;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        C1170e c1170e = new C1170e();
        c1170e.f26389a = zArr;
        c1170e.f26390b = zArr.length;
        c1170e.b(10);
        return c1170e;
    }

    @Override // ra.d0
    public final boolean[] j() {
        return new boolean[0];
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, boolean[] zArr, int i) {
        boolean[] zArr2 = zArr;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.v(this.f26388b, i9, zArr2[i9]);
        }
    }
}
