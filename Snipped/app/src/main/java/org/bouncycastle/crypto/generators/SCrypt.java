package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.engines.Salsa20Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SCrypt {
    private SCrypt() {
    }

    private static void BlockMix(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = i * 2; i11 > 0; i11--) {
            Xor(iArr2, iArr, i9, iArr3);
            Salsa20Engine.salsaCore(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i10, 16);
            i10 = (length + i9) - i10;
            i9 += 16;
        }
    }

    private static void Clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    private static void ClearAll(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            Clear(iArr2);
        }
    }

    private static byte[] MFcrypt(byte[] bArr, byte[] bArr2, int i, int i9, int i10, int i11) {
        int i12 = i9 * 128;
        byte[] SingleIterationPBKDF2 = SingleIterationPBKDF2(bArr, bArr2, i10 * i12);
        int[] iArr = null;
        try {
            int length = SingleIterationPBKDF2.length >>> 2;
            iArr = new int[length];
            Pack.littleEndianToInt(SingleIterationPBKDF2, 0, iArr);
            int i13 = 0;
            for (int i14 = i * i9; i - i13 > 2 && i14 > 1024; i14 >>>= 1) {
                i13++;
            }
            int i15 = i12 >>> 2;
            for (int i16 = 0; i16 < length; i16 += i15) {
                SMix(iArr, i16, i, i13, i9);
            }
            Pack.intToLittleEndian(iArr, SingleIterationPBKDF2, 0);
            byte[] SingleIterationPBKDF22 = SingleIterationPBKDF2(bArr, SingleIterationPBKDF2, i11);
            Clear(SingleIterationPBKDF2);
            Clear(iArr);
            return SingleIterationPBKDF22;
        } catch (Throwable th) {
            Clear(SingleIterationPBKDF2);
            Clear(iArr);
            throw th;
        }
    }

    private static void SMix(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = i9 >>> i10;
        int i13 = 1 << i10;
        int i14 = i12 - 1;
        int numberOfTrailingZeros = Integers.numberOfTrailingZeros(i9) - i10;
        int i15 = i11 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i15];
        int[] iArr5 = new int[i15];
        int[][] iArr6 = new int[i13][];
        try {
            System.arraycopy(iArr, i, iArr5, 0, i15);
            int i16 = 0;
            while (i16 < i13) {
                int[] iArr7 = new int[i12 * i15];
                iArr6[i16] = iArr7;
                int i17 = i13;
                int i18 = 0;
                int i19 = 0;
                while (i19 < i12) {
                    System.arraycopy(iArr5, 0, iArr7, i18, i15);
                    int i20 = i18 + i15;
                    BlockMix(iArr5, iArr2, iArr3, iArr4, i11);
                    System.arraycopy(iArr4, 0, iArr7, i20, i15);
                    i18 = i20 + i15;
                    BlockMix(iArr4, iArr2, iArr3, iArr5, i11);
                    i19 += 2;
                    i12 = i12;
                }
                i16++;
                i13 = i17;
            }
            int i21 = i9 - 1;
            for (int i22 = 0; i22 < i9; i22++) {
                int i23 = iArr5[i15 - 16] & i21;
                System.arraycopy(iArr6[i23 >>> numberOfTrailingZeros], (i23 & i14) * i15, iArr4, 0, i15);
                Xor(iArr4, iArr5, 0, iArr4);
                BlockMix(iArr4, iArr2, iArr3, iArr5, i11);
            }
            System.arraycopy(iArr5, 0, iArr, i, i15);
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th) {
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th;
        }
    }

    private static byte[] SingleIterationPBKDF2(byte[] bArr, byte[] bArr2, int i) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA256Digest());
        pKCS5S2ParametersGenerator.init(bArr, bArr2, 1);
        return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedMacParameters(i * 8)).getKey();
    }

    private static void Xor(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i + length];
        }
    }

    public static byte[] generate(byte[] bArr, byte[] bArr2, int i, int i9, int i10, int i11) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        if (i <= 1 || !isPowerOf2(i)) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
        }
        if (i9 == 1 && i >= 65536) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
        }
        if (i9 < 1) {
            throw new IllegalArgumentException("Block size r must be >= 1.");
        }
        int i12 = Integer.MAX_VALUE / (i9 * 1024);
        if (i10 >= 1 && i10 <= i12) {
            if (i11 >= 1) {
                return MFcrypt(bArr, bArr2, i, i9, i10, i11);
            }
            throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
        }
        throw new IllegalArgumentException("Parallelisation parameter p must be >= 1 and <= " + i12 + " (based on block size r of " + i9 + ")");
    }

    private static boolean isPowerOf2(int i) {
        return (i & (i + (-1))) == 0;
    }

    private static void Clear(int[] iArr) {
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }
}
