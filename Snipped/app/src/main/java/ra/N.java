package ra;

import qa.InterfaceC1142b;
import qa.InterfaceC1143c;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes2.dex */
public final class N extends d0<Long, long[], M> {

    /* renamed from: c, reason: collision with root package name */
    public static final N f26363c = new N(O.f26364a);

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // ra.r, ra.AbstractC1166a
    public final void f(InterfaceC1142b interfaceC1142b, int i, Object obj, boolean z10) {
        M m2 = (M) obj;
        long h9 = interfaceC1142b.h(this.f26388b, i);
        m2.b(m2.d() + 1);
        long[] jArr = m2.f26361a;
        int i9 = m2.f26362b;
        m2.f26362b = i9 + 1;
        jArr[i9] = h9;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        M m2 = new M();
        m2.f26361a = jArr;
        m2.f26362b = jArr.length;
        m2.b(10);
        return m2;
    }

    @Override // ra.d0
    public final long[] j() {
        return new long[0];
    }

    @Override // ra.d0
    public final void k(InterfaceC1143c interfaceC1143c, long[] jArr, int i) {
        long[] jArr2 = jArr;
        for (int i9 = 0; i9 < i; i9++) {
            interfaceC1143c.t(this.f26388b, i9, jArr2[i9]);
        }
    }
}
