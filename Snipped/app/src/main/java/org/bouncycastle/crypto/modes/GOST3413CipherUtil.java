package org.bouncycastle.crypto.modes;

import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
class GOST3413CipherUtil {
    public static byte[] LSB(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, bArr.length - i, bArr2, 0, i);
        return bArr2;
    }

    public static byte[] MSB(byte[] bArr, int i) {
        return Arrays.copyOf(bArr, i);
    }

    public static byte[] copyFromInput(byte[] bArr, int i, int i9) {
        if (bArr.length < i + i9) {
            i = bArr.length - i9;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, i9, bArr2, 0, i);
        return bArr2;
    }

    public static byte[] sum(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }
}
