package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes3.dex */
public final class BigEndianConversions {
    private BigEndianConversions() {
    }

    public static void I2OSP(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) (i >>> 24);
        bArr[i9 + 1] = (byte) (i >>> 16);
        bArr[i9 + 2] = (byte) (i >>> 8);
        bArr[i9 + 3] = (byte) i;
    }

    public static int OS2IP(byte[] bArr) {
        if (bArr.length > 4) {
            throw new ArithmeticException("invalid input length");
        }
        if (bArr.length == 0) {
            return 0;
        }
        int i = 0;
        for (int i9 = 0; i9 < bArr.length; i9++) {
            i |= (bArr[i9] & 255) << (((bArr.length - 1) - i9) * 8);
        }
        return i;
    }

    public static long OS2LIP(byte[] bArr, int i) {
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((255 & bArr[i + 4]) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    public static byte[] toByteArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length << 2];
        for (int i = 0; i < iArr.length; i++) {
            I2OSP(iArr[i], bArr, i << 2);
        }
        return bArr;
    }

    public static int[] toIntArray(byte[] bArr) {
        int length = (bArr.length + 3) / 4;
        int length2 = bArr.length & 3;
        int[] iArr = new int[length];
        int i = 0;
        int i9 = 0;
        while (i <= length - 2) {
            iArr[i] = OS2IP(bArr, i9);
            i++;
            i9 += 4;
        }
        int i10 = length - 1;
        if (length2 != 0) {
            iArr[i10] = OS2IP(bArr, i9, length2);
        } else {
            iArr[i10] = OS2IP(bArr, i9);
        }
        return iArr;
    }

    public static void I2OSP(int i, byte[] bArr, int i9, int i10) {
        int i11 = i10 - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            bArr[i9 + i12] = (byte) (i >>> ((i11 - i12) * 8));
        }
    }

    public static int OS2IP(byte[] bArr, int i) {
        int i9 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        return (bArr[i + 3] & 255) | i9 | ((bArr[i + 2] & 255) << 8);
    }

    public static byte[] toByteArray(int[] iArr, int i) {
        int length = iArr.length;
        byte[] bArr = new byte[i];
        int i9 = 0;
        int i10 = 0;
        while (i9 <= length - 2) {
            I2OSP(iArr[i9], bArr, i10);
            i9++;
            i10 += 4;
        }
        I2OSP(iArr[length - 1], bArr, i10, i - i10);
        return bArr;
    }

    public static void I2OSP(long j10, byte[] bArr, int i) {
        bArr[i] = (byte) (j10 >>> 56);
        bArr[i + 1] = (byte) (j10 >>> 48);
        bArr[i + 2] = (byte) (j10 >>> 40);
        bArr[i + 3] = (byte) (j10 >>> 32);
        bArr[i + 4] = (byte) (j10 >>> 24);
        bArr[i + 5] = (byte) (j10 >>> 16);
        bArr[i + 6] = (byte) (j10 >>> 8);
        bArr[i + 7] = (byte) j10;
    }

    public static int OS2IP(byte[] bArr, int i, int i9) {
        if (bArr.length == 0 || bArr.length < (i + i9) - 1) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 |= (bArr[i + i11] & 255) << (((i9 - i11) - 1) * 8);
        }
        return i10;
    }

    public static byte[] I2OSP(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    public static byte[] I2OSP(int i, int i9) {
        if (i < 0) {
            return null;
        }
        int ceilLog256 = IntegerFunctions.ceilLog256(i);
        if (ceilLog256 > i9) {
            throw new ArithmeticException("Cannot encode given integer into specified number of octets.");
        }
        byte[] bArr = new byte[i9];
        int i10 = i9 - 1;
        for (int i11 = i10; i11 >= i9 - ceilLog256; i11--) {
            bArr[i11] = (byte) (i >>> ((i10 - i11) * 8));
        }
        return bArr;
    }

    public static byte[] I2OSP(long j10) {
        return new byte[]{(byte) (j10 >>> 56), (byte) (j10 >>> 48), (byte) (j10 >>> 40), (byte) (j10 >>> 32), (byte) (j10 >>> 24), (byte) (j10 >>> 16), (byte) (j10 >>> 8), (byte) j10};
    }
}
