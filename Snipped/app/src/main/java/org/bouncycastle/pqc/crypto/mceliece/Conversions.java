package org.bouncycastle.pqc.crypto.mceliece;

import java.math.BigInteger;
import org.bouncycastle.pqc.math.linearalgebra.BigIntUtils;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions;

/* loaded from: classes3.dex */
final class Conversions {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private Conversions() {
    }

    public static byte[] decode(int i, int i9, GF2Vector gF2Vector) {
        if (gF2Vector.getLength() != i || gF2Vector.getHammingWeight() != i9) {
            throw new IllegalArgumentException("vector has wrong length or hamming weight");
        }
        int[] vecArray = gF2Vector.getVecArray();
        BigInteger binomial = IntegerFunctions.binomial(i, i9);
        BigInteger bigInteger = ZERO;
        int i10 = i;
        for (int i11 = 0; i11 < i; i11++) {
            binomial = binomial.multiply(BigInteger.valueOf(i10 - i9)).divide(BigInteger.valueOf(i10));
            i10--;
            if ((vecArray[i11 >> 5] & (1 << (i11 & 31))) != 0) {
                bigInteger = bigInteger.add(binomial);
                int i12 = i9 - 1;
                binomial = i10 == i12 ? ONE : binomial.multiply(BigInteger.valueOf(i9)).divide(BigInteger.valueOf(i10 - i12));
                i9 = i12;
            }
        }
        return BigIntUtils.toMinimalByteArray(bigInteger);
    }

    public static GF2Vector encode(int i, int i9, byte[] bArr) {
        if (i < i9) {
            throw new IllegalArgumentException("n < t");
        }
        BigInteger binomial = IntegerFunctions.binomial(i, i9);
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(binomial) >= 0) {
            throw new IllegalArgumentException("Encoded number too large.");
        }
        GF2Vector gF2Vector = new GF2Vector(i);
        int i10 = i;
        for (int i11 = 0; i11 < i; i11++) {
            binomial = binomial.multiply(BigInteger.valueOf(i10 - i9)).divide(BigInteger.valueOf(i10));
            i10--;
            if (binomial.compareTo(bigInteger) <= 0) {
                gF2Vector.setBit(i11);
                bigInteger = bigInteger.subtract(binomial);
                int i12 = i9 - 1;
                binomial = i10 == i12 ? ONE : binomial.multiply(BigInteger.valueOf(i9)).divide(BigInteger.valueOf(i10 - i12));
                i9 = i12;
            }
        }
        return gF2Vector;
    }

    public static byte[] signConversion(int i, int i9, byte[] bArr) {
        if (i < i9) {
            throw new IllegalArgumentException("n < t");
        }
        BigInteger binomial = IntegerFunctions.binomial(i, i9);
        int bitLength = binomial.bitLength() - 1;
        int i10 = bitLength >> 3;
        int i11 = bitLength & 7;
        int i12 = 8;
        if (i11 == 0) {
            i10--;
            i11 = 8;
        }
        int i13 = i >> 3;
        int i14 = i & 7;
        if (i14 == 0) {
            i13--;
        } else {
            i12 = i14;
        }
        int i15 = i13 + 1;
        byte[] bArr2 = new byte[i15];
        if (bArr.length < i15) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            for (int length = bArr.length; length < i15; length++) {
                bArr2[length] = 0;
            }
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, i13);
            bArr2[i13] = (byte) (bArr[i13] & ((1 << i12) - 1));
        }
        BigInteger bigInteger = ZERO;
        int i16 = i;
        for (int i17 = 0; i17 < i; i17++) {
            binomial = binomial.multiply(new BigInteger(Integer.toString(i16 - i9))).divide(new BigInteger(Integer.toString(i16)));
            i16--;
            if (((byte) (bArr2[i17 >>> 3] & (1 << (i17 & 7)))) != 0) {
                bigInteger = bigInteger.add(binomial);
                int i18 = i9 - 1;
                binomial = i16 == i18 ? ONE : binomial.multiply(new BigInteger(Integer.toString(i9))).divide(new BigInteger(Integer.toString(i16 - i18)));
                i9 = i18;
            }
        }
        int i19 = i10 + 1;
        byte[] bArr3 = new byte[i19];
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i19) {
            System.arraycopy(byteArray, 0, bArr3, 0, byteArray.length);
            for (int length2 = byteArray.length; length2 < i19; length2++) {
                bArr3[length2] = 0;
            }
        } else {
            System.arraycopy(byteArray, 0, bArr3, 0, i10);
            bArr3[i10] = (byte) (((1 << i11) - 1) & byteArray[i10]);
        }
        return bArr3;
    }
}
