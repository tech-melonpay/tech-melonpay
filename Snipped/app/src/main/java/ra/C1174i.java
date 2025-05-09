package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: ra.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1174i extends d0<Byte, byte[], C1173h> {

    /* renamed from: c, reason: collision with root package name */
    public static final C1174i f26404c = new C1174i(C1175j.f26405a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        C1173h c1173h = (C1173h) obj;
        byte k3 = interfaceC1142b.k(this.f26388b, i);
        c1173h.b(c1173h.d() + 1);
        byte[] bArr = c1173h.f26399a;
        int i9 = c1173h.f26400b;
        c1173h.f26400b = i9 + 1;
        bArr[i9] = k3;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        C1173h c1173h = new C1173h();
        c1173h.f26399a = bArr;
        c1173h.f26400b = bArr.length;
        c1173h.b(10);
        return c1173h;
    }

    @Override // ra.d0
    public final byte[] j() {
        return new byte[0];
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.E(this.f26388b, i9, bArr2[i9]);
        }
    }
}
