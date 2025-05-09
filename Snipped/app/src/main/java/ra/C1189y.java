package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: ra.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1189y extends d0<Float, float[], C1188x> {

    /* renamed from: c, reason: collision with root package name */
    public static final C1189y f26454c = new C1189y(C1190z.f26457a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        C1188x c1188x = (C1188x) obj;
        float j10 = interfaceC1142b.j(this.f26388b, i);
        c1188x.b(c1188x.d() + 1);
        float[] fArr = c1188x.f26451a;
        int i9 = c1188x.f26452b;
        c1188x.f26452b = i9 + 1;
        fArr[i9] = j10;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        C1188x c1188x = new C1188x();
        c1188x.f26451a = fArr;
        c1188x.f26452b = fArr.length;
        c1188x.b(10);
        return c1188x;
    }

    @Override // ra.d0
    public final float[] j() {
        return new float[0];
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, float[] fArr, int i) {
        float[] fArr2 = fArr;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.n(this.f26388b, i9, fArr2[i9]);
        }
    }
}
