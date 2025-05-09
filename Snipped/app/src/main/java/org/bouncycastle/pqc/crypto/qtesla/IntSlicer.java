package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes3.dex */
final class IntSlicer {
    private int base;
    private final int[] values;

    public IntSlicer(int[] iArr, int i) {
        this.values = iArr;
        this.base = i;
    }

    public final int at(int i) {
        return this.values[this.base + i];
    }

    public final IntSlicer copy() {
        return new IntSlicer(this.values, this.base);
    }

    public final IntSlicer from(int i) {
        return new IntSlicer(this.values, this.base + i);
    }

    public final void incBase(int i) {
        this.base += i;
    }

    public final int at(int i, int i9) {
        this.values[this.base + i] = i9;
        return i9;
    }

    public final int at(int i, long j10) {
        int[] iArr = this.values;
        int i9 = this.base + i;
        int i10 = (int) j10;
        iArr[i9] = i10;
        return i10;
    }
}
