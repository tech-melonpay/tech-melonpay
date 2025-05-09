package org.bouncycastle.crypto.fpe;

import com.google.android.gms.measurement.internal.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
class SP80038G {
    protected static final int BLOCK_SIZE = 16;
    static final String FF1_DISABLED = "org.bouncycastle.fpe.disable_ff1";
    static final String FPE_DISABLED = "org.bouncycastle.fpe.disable";
    protected static final double LOG2 = Math.log(2.0d);
    protected static final double TWO_TO_96 = Math.pow(2.0d, 96.0d);

    public static BigInteger[] calculateModUV(BigInteger bigInteger, int i, int i9) {
        BigInteger pow = bigInteger.pow(i);
        BigInteger[] bigIntegerArr = {pow, pow};
        if (i9 != i) {
            bigIntegerArr[1] = pow.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    public static byte[] calculateP_FF1(int i, byte b9, int i9, int i10) {
        byte[] bArr = {1, 2, 1, 0, (byte) (i >> 8), (byte) i, 10, b9, 0, 0, 0, 0, 0, 0, 0, 0};
        Pack.intToBigEndian(i9, bArr, 8);
        Pack.intToBigEndian(i10, bArr, 12);
        return bArr;
    }

    public static byte[] calculateTweak64_FF3_1(byte[] bArr) {
        byte b9 = bArr[0];
        byte b10 = bArr[1];
        byte b11 = bArr[2];
        byte b12 = bArr[3];
        return new byte[]{b9, b10, b11, (byte) (b12 & 240), bArr[4], bArr[5], bArr[6], (byte) (b12 << 4)};
    }

    public static BigInteger calculateY_FF1(BlockCipher blockCipher, BigInteger bigInteger, byte[] bArr, int i, int i9, int i10, byte[] bArr2, short[] sArr) {
        int length = bArr.length;
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(num(bigInteger, sArr));
        int i11 = ((-(length + i + 1)) & 15) + length;
        int i12 = i11 + 1 + i;
        byte[] bArr3 = new byte[i12];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        bArr3[i11] = (byte) i10;
        System.arraycopy(asUnsignedByteArray, 0, bArr3, i12 - asUnsignedByteArray.length, asUnsignedByteArray.length);
        byte[] prf = prf(blockCipher, Arrays.concatenate(bArr2, bArr3));
        if (i9 > 16) {
            int i13 = (i9 + 15) / 16;
            byte[] bArr4 = new byte[i13 * 16];
            System.arraycopy(prf, 0, bArr4, 0, 16);
            byte[] bArr5 = new byte[4];
            for (int i14 = 1; i14 < i13; i14++) {
                int i15 = i14 * 16;
                System.arraycopy(prf, 0, bArr4, i15, 16);
                Pack.intToBigEndian(i14, bArr5, 0);
                xor(bArr5, 0, bArr4, i15 + 12, 4);
                blockCipher.processBlock(bArr4, i15, bArr4, i15);
            }
            prf = bArr4;
        }
        return num(prf, 0, i9);
    }

    public static BigInteger calculateY_FF3(BlockCipher blockCipher, BigInteger bigInteger, byte[] bArr, int i, int i9, short[] sArr) {
        byte[] bArr2 = new byte[16];
        Pack.intToBigEndian(i9, bArr2, 0);
        xor(bArr, i, bArr2, 0, 4);
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(num(bigInteger, sArr));
        if (16 - asUnsignedByteArray.length < 4) {
            throw new IllegalStateException("input out of range");
        }
        System.arraycopy(asUnsignedByteArray, 0, bArr2, 16 - asUnsignedByteArray.length, asUnsignedByteArray.length);
        rev(bArr2);
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        rev(bArr2);
        return num(bArr2, 0, 16);
    }

    public static void checkArgs(BlockCipher blockCipher, boolean z10, int i, byte[] bArr, int i9, int i10) {
        checkCipher(blockCipher);
        if (i < 2 || i > 256) {
            throw new IllegalArgumentException();
        }
        checkData(z10, i, bArr, i9, i10);
    }

    public static void checkCipher(BlockCipher blockCipher) {
        if (16 != blockCipher.getBlockSize()) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkData(boolean z10, int i, byte[] bArr, int i9, int i10) {
        checkLength(z10, i, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            if ((bArr[i9 + i11] & 255) >= i) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    private static void checkLength(boolean z10, int i, int i9) {
        int floor;
        if (i9 >= 2) {
            double d10 = i;
            if (Math.pow(d10, i9) >= 1000000.0d) {
                if (!z10 && i9 > (floor = ((int) Math.floor(Math.log(TWO_TO_96) / Math.log(d10))) * 2)) {
                    throw new IllegalArgumentException(a.g(floor, "maximum input length is "));
                }
                return;
            }
        }
        throw new IllegalArgumentException("input too short");
    }

    public static short[] decFF1(BlockCipher blockCipher, int i, byte[] bArr, int i9, int i10, int i11, short[] sArr, short[] sArr2) {
        int length = bArr.length;
        int ceil = (((int) Math.ceil((Math.log(i) * i11) / LOG2)) + 7) / 8;
        int i12 = (((ceil + 3) / 4) * 4) + 4;
        byte[] calculateP_FF1 = calculateP_FF1(i, (byte) i10, i9, length);
        BigInteger valueOf = BigInteger.valueOf(i);
        BigInteger[] calculateModUV = calculateModUV(valueOf, i10, i11);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i13 = i10;
        int i14 = 9;
        while (i14 >= 0) {
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            i13 = i9 - i13;
            str(valueOf, num(valueOf, sArr5).subtract(calculateY_FF1(blockCipher, valueOf, bArr, ceil, i12, i14, calculateP_FF1, sArr4)).mod(calculateModUV[i14 & 1]), i13, sArr5, 0);
            i14--;
            sArr3 = sArr5;
        }
        return Arrays.concatenate(sArr3, sArr4);
    }

    private static short[] decFF3_1(BlockCipher blockCipher, int i, byte[] bArr, int i9, int i10, int i11, short[] sArr, short[] sArr2) {
        BigInteger valueOf = BigInteger.valueOf(i);
        int i12 = i11;
        BigInteger[] calculateModUV = calculateModUV(valueOf, i10, i12);
        rev(sArr);
        rev(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i13 = 7;
        while (i13 >= 0) {
            int i14 = i9 - i12;
            int i15 = i13 & 1;
            str(valueOf, num(valueOf, sArr4).subtract(calculateY_FF3(blockCipher, valueOf, bArr, 4 - (i15 * 4), i13, sArr3)).mod(calculateModUV[1 - i15]), i14, sArr4, 0);
            i13--;
            i12 = i14;
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            sArr3 = sArr5;
        }
        rev(sArr3);
        rev(sArr4);
        return Arrays.concatenate(sArr3, sArr4);
    }

    public static byte[] decryptFF1(BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i9, int i10) {
        checkArgs(blockCipher, true, i, bArr2, i9, i10);
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        return toByte(decFF1(blockCipher, i, bArr, i10, i11, i12, toShort(bArr2, i9, i11), toShort(bArr2, i9 + i11, i12)));
    }

    public static short[] decryptFF1w(BlockCipher blockCipher, int i, byte[] bArr, short[] sArr, int i9, int i10) {
        checkArgs(blockCipher, true, i, sArr, i9, i10);
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        short[] sArr2 = new short[i11];
        short[] sArr3 = new short[i12];
        System.arraycopy(sArr, i9, sArr2, 0, i11);
        System.arraycopy(sArr, i9 + i11, sArr3, 0, i12);
        return decFF1(blockCipher, i, bArr, i10, i11, i12, sArr2, sArr3);
    }

    public static byte[] decryptFF3(BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i9, int i10) {
        checkArgs(blockCipher, false, i, bArr2, i9, i10);
        if (bArr.length == 8) {
            return implDecryptFF3(blockCipher, i, bArr, bArr2, i9, i10);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] decryptFF3_1(BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i9, int i10) {
        checkArgs(blockCipher, false, i, bArr2, i9, i10);
        if (bArr.length == 7) {
            return implDecryptFF3(blockCipher, i, calculateTweak64_FF3_1(bArr), bArr2, i9, i10);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    public static short[] decryptFF3_1w(BlockCipher blockCipher, int i, byte[] bArr, short[] sArr, int i9, int i10) {
        checkArgs(blockCipher, false, i, sArr, i9, i10);
        if (bArr.length == 7) {
            return implDecryptFF3w(blockCipher, i, calculateTweak64_FF3_1(bArr), sArr, i9, i10);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    private static short[] encFF1(BlockCipher blockCipher, int i, byte[] bArr, int i9, int i10, int i11, short[] sArr, short[] sArr2) {
        int length = bArr.length;
        int ceil = (((int) Math.ceil((Math.log(i) * i11) / LOG2)) + 7) / 8;
        int i12 = (((ceil + 3) / 4) * 4) + 4;
        byte[] calculateP_FF1 = calculateP_FF1(i, (byte) i10, i9, length);
        BigInteger valueOf = BigInteger.valueOf(i);
        BigInteger[] calculateModUV = calculateModUV(valueOf, i10, i11);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i13 = i11;
        int i14 = 0;
        while (i14 < 10) {
            int i15 = i14;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            int i16 = i9 - i13;
            str(valueOf, num(valueOf, sArr5).add(calculateY_FF1(blockCipher, valueOf, bArr, ceil, i12, i14, calculateP_FF1, sArr3)).mod(calculateModUV[i15 & 1]), i16, sArr5, 0);
            i14 = i15 + 1;
            i13 = i16;
            sArr4 = sArr5;
        }
        return Arrays.concatenate(sArr3, sArr4);
    }

    private static short[] encFF3_1(BlockCipher blockCipher, int i, byte[] bArr, int i9, int i10, int i11, short[] sArr, short[] sArr2) {
        BigInteger valueOf = BigInteger.valueOf(i);
        int i12 = i10;
        BigInteger[] calculateModUV = calculateModUV(valueOf, i12, i11);
        rev(sArr);
        rev(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i13 = 0;
        while (i13 < 8) {
            i12 = i9 - i12;
            int i14 = i13 & 1;
            str(valueOf, num(valueOf, sArr3).add(calculateY_FF3(blockCipher, valueOf, bArr, 4 - (i14 * 4), i13, sArr4)).mod(calculateModUV[1 - i14]), i12, sArr3, 0);
            i13++;
            short[] sArr5 = sArr4;
            sArr4 = sArr3;
            sArr3 = sArr5;
        }
        rev(sArr3);
        rev(sArr4);
        return Arrays.concatenate(sArr3, sArr4);
    }

    public static byte[] encryptFF1(BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i9, int i10) {
        checkArgs(blockCipher, true, i, bArr2, i9, i10);
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        return toByte(encFF1(blockCipher, i, bArr, i10, i11, i12, toShort(bArr2, i9, i11), toShort(bArr2, i9 + i11, i12)));
    }

    public static short[] encryptFF1w(BlockCipher blockCipher, int i, byte[] bArr, short[] sArr, int i9, int i10) {
        checkArgs(blockCipher, true, i, sArr, i9, i10);
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        short[] sArr2 = new short[i11];
        short[] sArr3 = new short[i12];
        System.arraycopy(sArr, i9, sArr2, 0, i11);
        System.arraycopy(sArr, i9 + i11, sArr3, 0, i12);
        return encFF1(blockCipher, i, bArr, i10, i11, i12, sArr2, sArr3);
    }

    public static byte[] encryptFF3(BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i9, int i10) {
        checkArgs(blockCipher, false, i, bArr2, i9, i10);
        if (bArr.length == 8) {
            return implEncryptFF3(blockCipher, i, bArr, bArr2, i9, i10);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] encryptFF3_1(BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i9, int i10) {
        checkArgs(blockCipher, false, i, bArr2, i9, i10);
        if (bArr.length == 7) {
            return encryptFF3(blockCipher, i, calculateTweak64_FF3_1(bArr), bArr2, i9, i10);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    public static short[] encryptFF3_1w(BlockCipher blockCipher, int i, byte[] bArr, short[] sArr, int i9, int i10) {
        checkArgs(blockCipher, false, i, sArr, i9, i10);
        if (bArr.length == 7) {
            return encryptFF3w(blockCipher, i, calculateTweak64_FF3_1(bArr), sArr, i9, i10);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    public static short[] encryptFF3w(BlockCipher blockCipher, int i, byte[] bArr, short[] sArr, int i9, int i10) {
        checkArgs(blockCipher, false, i, sArr, i9, i10);
        if (bArr.length == 8) {
            return implEncryptFF3w(blockCipher, i, bArr, sArr, i9, i10);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] implDecryptFF3(BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i9, int i10) {
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        return toByte(decFF3_1(blockCipher, i, bArr, i10, i11, i12, toShort(bArr2, i9, i12), toShort(bArr2, i9 + i12, i11)));
    }

    public static short[] implDecryptFF3w(BlockCipher blockCipher, int i, byte[] bArr, short[] sArr, int i9, int i10) {
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        short[] sArr2 = new short[i12];
        short[] sArr3 = new short[i11];
        System.arraycopy(sArr, i9, sArr2, 0, i12);
        System.arraycopy(sArr, i9 + i12, sArr3, 0, i11);
        return decFF3_1(blockCipher, i, bArr, i10, i11, i12, sArr2, sArr3);
    }

    public static byte[] implEncryptFF3(BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i9, int i10) {
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        return toByte(encFF3_1(blockCipher, i, bArr, i10, i11, i12, toShort(bArr2, i9, i12), toShort(bArr2, i9 + i12, i11)));
    }

    public static short[] implEncryptFF3w(BlockCipher blockCipher, int i, byte[] bArr, short[] sArr, int i9, int i10) {
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        short[] sArr2 = new short[i12];
        short[] sArr3 = new short[i11];
        System.arraycopy(sArr, i9, sArr2, 0, i12);
        System.arraycopy(sArr, i9 + i12, sArr3, 0, i11);
        return encFF3_1(blockCipher, i, bArr, i10, i11, i12, sArr2, sArr3);
    }

    public static BigInteger num(BigInteger bigInteger, short[] sArr) {
        BigInteger bigInteger2 = BigIntegers.ZERO;
        for (short s10 : sArr) {
            bigInteger2 = bigInteger2.multiply(bigInteger).add(BigInteger.valueOf(s10 & 65535));
        }
        return bigInteger2;
    }

    public static byte[] prf(BlockCipher blockCipher, byte[] bArr) {
        if (bArr.length % 16 != 0) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length / 16;
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < length; i++) {
            xor(bArr, i * 16, bArr2, 0, 16);
            blockCipher.processBlock(bArr2, 0, bArr2, 0);
        }
        return bArr2;
    }

    public static void rev(byte[] bArr) {
        int length = bArr.length / 2;
        int length2 = bArr.length - 1;
        for (int i = 0; i < length; i++) {
            byte b9 = bArr[i];
            int i9 = length2 - i;
            bArr[i] = bArr[i9];
            bArr[i9] = b9;
        }
    }

    public static void str(BigInteger bigInteger, BigInteger bigInteger2, int i, short[] sArr, int i9) {
        if (bigInteger2.signum() < 0) {
            throw new IllegalArgumentException();
        }
        for (int i10 = 1; i10 <= i; i10++) {
            BigInteger[] divideAndRemainder = bigInteger2.divideAndRemainder(bigInteger);
            sArr[(i9 + i) - i10] = (short) divideAndRemainder[1].intValue();
            bigInteger2 = divideAndRemainder[0];
        }
        if (bigInteger2.signum() != 0) {
            throw new IllegalArgumentException();
        }
    }

    private static byte[] toByte(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    private static short[] toShort(byte[] bArr, int i, int i9) {
        short[] sArr = new short[i9];
        for (int i10 = 0; i10 != i9; i10++) {
            sArr[i10] = (short) (bArr[i + i10] & 255);
        }
        return sArr;
    }

    public static void xor(byte[] bArr, int i, byte[] bArr2, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i9 + i11;
            bArr2[i12] = (byte) (bArr2[i12] ^ bArr[i + i11]);
        }
    }

    public static void checkArgs(BlockCipher blockCipher, boolean z10, int i, short[] sArr, int i9, int i10) {
        checkCipher(blockCipher);
        if (i < 2 || i > 65536) {
            throw new IllegalArgumentException();
        }
        checkData(z10, i, sArr, i9, i10);
    }

    public static void checkData(boolean z10, int i, short[] sArr, int i9, int i10) {
        checkLength(z10, i, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            if ((sArr[i9 + i11] & 65535) >= i) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    public static BigInteger num(byte[] bArr, int i, int i9) {
        return new BigInteger(1, Arrays.copyOfRange(bArr, i, i9 + i));
    }

    public static void rev(short[] sArr) {
        int length = sArr.length / 2;
        int length2 = sArr.length - 1;
        for (int i = 0; i < length; i++) {
            short s10 = sArr[i];
            int i9 = length2 - i;
            sArr[i] = sArr[i9];
            sArr[i9] = s10;
        }
    }
}
