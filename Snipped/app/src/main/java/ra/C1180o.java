package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* renamed from: ra.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1180o extends d0<Character, char[], C1179n> {

    /* renamed from: c, reason: collision with root package name */
    public static final C1180o f26420c = new C1180o(C1181p.f26422a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        C1179n c1179n = (C1179n) obj;
        char u6 = interfaceC1142b.u(this.f26388b, i);
        c1179n.b(c1179n.d() + 1);
        char[] cArr = c1179n.f26416a;
        int i9 = c1179n.f26417b;
        c1179n.f26417b = i9 + 1;
        cArr[i9] = u6;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        C1179n c1179n = new C1179n();
        c1179n.f26416a = cArr;
        c1179n.f26417b = cArr.length;
        c1179n.b(10);
        return c1179n;
    }

    @Override // ra.d0
    public final char[] j() {
        return new char[0];
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, char[] cArr, int i) {
        char[] cArr2 = cArr;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.d(this.f26388b, i9, cArr2[i9]);
        }
    }
}
