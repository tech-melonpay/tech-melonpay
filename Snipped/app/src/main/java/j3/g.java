package j3;

/* compiled from: ChaCha20.java */
/* loaded from: classes.dex */
public final class g extends h {
    @Override // j3.h
    public final int[] c(int i, int[] iArr) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = this.f22484a;
        int[] iArr4 = h.f22483c;
        System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
        System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // j3.h
    public final int f() {
        return 12;
    }
}
