package j3;

import java.util.Arrays;

/* compiled from: XChaCha20.java */
/* loaded from: classes.dex */
public final class r extends h {
    @Override // j3.h
    public final int[] c(int i, int[] iArr) {
        if (iArr.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = this.f22484a;
        int[] iArr5 = h.f22483c;
        System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
        System.arraycopy(iArr4, 0, iArr3, iArr5.length, 8);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        h.i(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        int[] copyOf = Arrays.copyOf(iArr3, 8);
        System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
        System.arraycopy(copyOf, 0, iArr2, iArr5.length, 8);
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // j3.h
    public final int f() {
        return 24;
    }
}
