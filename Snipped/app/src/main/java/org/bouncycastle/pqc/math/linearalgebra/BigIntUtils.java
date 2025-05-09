package org.bouncycastle.pqc.math.linearalgebra;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class BigIntUtils {
    private BigIntUtils() {
    }

    public static boolean equals(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        if (bigIntegerArr.length != bigIntegerArr2.length) {
            return false;
        }
        int i = 0;
        for (int i9 = 0; i9 < bigIntegerArr.length; i9++) {
            i |= bigIntegerArr[i9].compareTo(bigIntegerArr2[i9]);
        }
        return i == 0;
    }

    public static void fill(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        for (int length = bigIntegerArr.length - 1; length >= 0; length--) {
            bigIntegerArr[length] = bigInteger;
        }
    }

    public static BigInteger[] subArray(BigInteger[] bigIntegerArr, int i, int i9) {
        int i10 = i9 - i;
        BigInteger[] bigIntegerArr2 = new BigInteger[i10];
        System.arraycopy(bigIntegerArr, i, bigIntegerArr2, 0, i10);
        return bigIntegerArr2;
    }

    public static int[] toIntArray(BigInteger[] bigIntegerArr) {
        int[] iArr = new int[bigIntegerArr.length];
        for (int i = 0; i < bigIntegerArr.length; i++) {
            iArr[i] = bigIntegerArr[i].intValue();
        }
        return iArr;
    }

    public static int[] toIntArrayModQ(int i, BigInteger[] bigIntegerArr) {
        BigInteger valueOf = BigInteger.valueOf(i);
        int[] iArr = new int[bigIntegerArr.length];
        for (int i9 = 0; i9 < bigIntegerArr.length; i9++) {
            iArr[i9] = bigIntegerArr[i9].mod(valueOf).intValue();
        }
        return iArr;
    }

    public static byte[] toMinimalByteArray(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 1 || (bigInteger.bitLength() & 7) != 0) {
            return byteArray;
        }
        int bitLength = bigInteger.bitLength() >> 3;
        byte[] bArr = new byte[bitLength];
        System.arraycopy(byteArray, 1, bArr, 0, bitLength);
        return bArr;
    }
}
