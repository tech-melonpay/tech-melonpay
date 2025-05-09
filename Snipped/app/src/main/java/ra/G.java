package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class G extends d0<Integer, int[], F> {

    /* renamed from: c, reason: collision with root package name */
    public static final G f26352c = new G(H.f26353a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        F f10 = (F) obj;
        int d10 = interfaceC1142b.d(this.f26388b, i);
        f10.b(f10.d() + 1);
        int[] iArr = f10.f26350a;
        int i9 = f10.f26351b;
        f10.f26351b = i9 + 1;
        iArr[i9] = d10;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        F f10 = new F();
        f10.f26350a = iArr;
        f10.f26351b = iArr.length;
        f10.b(10);
        return f10;
    }

    @Override // ra.d0
    public final int[] j() {
        return new int[0];
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, int[] iArr, int i) {
        int[] iArr2 = iArr;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.m(i9, iArr2[i9], this.f26388b);
        }
    }
}
