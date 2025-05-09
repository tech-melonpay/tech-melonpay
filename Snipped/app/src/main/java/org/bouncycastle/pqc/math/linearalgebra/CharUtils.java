package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes3.dex */
public final class CharUtils {
    private CharUtils() {
    }

    public static char[] clone(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    public static boolean equals(char[] cArr, char[] cArr2) {
        if (cArr.length != cArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = cArr.length - 1; length >= 0; length--) {
            z10 &= cArr[length] == cArr2[length];
        }
        return z10;
    }

    public static byte[] toByteArray(char[] cArr) {
        byte[] bArr = new byte[cArr.length];
        for (int length = cArr.length - 1; length >= 0; length--) {
            bArr[length] = (byte) cArr[length];
        }
        return bArr;
    }

    public static byte[] toByteArrayForPBE(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < cArr.length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        int i9 = length * 2;
        byte[] bArr2 = new byte[i9 + 2];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr2[i11] = 0;
            bArr2[i11 + 1] = bArr[i10];
        }
        bArr2[i9] = 0;
        bArr2[i9 + 1] = 0;
        return bArr2;
    }
}
