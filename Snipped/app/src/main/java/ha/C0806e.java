package ha;

/* compiled from: PrimitiveRanges.kt */
/* renamed from: ha.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0806e extends C0804c implements InterfaceC0803b<Integer> {

    /* renamed from: d, reason: collision with root package name */
    public static final C0806e f21233d = new C0806e(1, 0, 1);

    @Override // ha.InterfaceC0803b
    public final Integer c() {
        return Integer.valueOf(this.f21226a);
    }

    @Override // ha.InterfaceC0803b
    public final Integer e() {
        return Integer.valueOf(this.f21227b);
    }

    @Override // ha.C0804c
    public final boolean equals(Object obj) {
        if (obj instanceof C0806e) {
            if (!isEmpty() || !((C0806e) obj).isEmpty()) {
                C0806e c0806e = (C0806e) obj;
                if (this.f21226a == c0806e.f21226a) {
                    if (this.f21227b == c0806e.f21227b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // ha.C0804c
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f21226a * 31) + this.f21227b;
    }

    @Override // ha.C0804c, ha.InterfaceC0803b
    public final boolean isEmpty() {
        return this.f21226a > this.f21227b;
    }

    @Override // ha.C0804c
    public final String toString() {
        return this.f21226a + ".." + this.f21227b;
    }
}
