package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410ValidationParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes2.dex */
public class GOST3410ParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private SecureRandom init_random;
    private int size;
    private int typeproc;

    private int procedure_A(int i, int i9, BigInteger[] bigIntegerArr, int i10) {
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int i11;
        int i12;
        int i13 = i;
        while (true) {
            if (i13 >= 0 && i13 <= 65536) {
                break;
            }
            i13 = this.init_random.nextInt() / 32768;
        }
        int i14 = i9;
        while (true) {
            if (i14 >= 0 && i14 <= 65536 && i14 / 2 != 0) {
                break;
            }
            i14 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Integer.toString(i14));
        BigInteger bigInteger5 = new BigInteger("19381");
        BigInteger bigInteger6 = new BigInteger(Integer.toString(i13));
        int i15 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger6};
        int[] iArr = {i10};
        int i16 = 0;
        int i17 = 0;
        while (iArr[i16] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i17 = i16 + 1;
            iArr[i17] = iArr[i16] / 2;
            i16 = i17;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i17 + 1];
        int i18 = 16;
        bigIntegerArr4[i17] = new BigInteger("8003", 16);
        int i19 = i17 - 1;
        int i20 = 0;
        while (true) {
            if (i20 >= i17) {
                bigInteger = bigIntegerArr3[i15];
                break;
            }
            int i21 = iArr[i19] / i18;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i15, bigIntegerArr5, i15, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i21 + 1];
                System.arraycopy(bigIntegerArr5, i15, bigIntegerArr2, i15, length2);
                int i22 = i15;
                while (i22 < i21) {
                    int i23 = i22 + 1;
                    bigIntegerArr2[i23] = bigIntegerArr2[i22].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i18));
                    i22 = i23;
                }
                BigInteger bigInteger7 = new BigInteger("0");
                for (int i24 = i15; i24 < i21; i24++) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i24].multiply(TWO.pow(i24 * 16)));
                }
                bigIntegerArr2[i15] = bigIntegerArr2[i21];
                BigInteger bigInteger8 = TWO;
                int i25 = i19 + 1;
                BigInteger add = bigInteger8.pow(iArr[i19] - 1).divide(bigIntegerArr4[i25]).add(bigInteger8.pow(iArr[i19] - 1).multiply(bigInteger7).divide(bigIntegerArr4[i25].multiply(bigInteger8.pow(i21 * 16))));
                BigInteger mod = add.mod(bigInteger8);
                BigInteger bigInteger9 = ONE;
                if (mod.compareTo(bigInteger9) == 0) {
                    add = add.add(bigInteger9);
                }
                int i26 = 0;
                while (true) {
                    bigInteger2 = bigInteger4;
                    bigInteger3 = bigInteger5;
                    long j10 = i26;
                    i11 = i17;
                    BigInteger multiply = bigIntegerArr4[i25].multiply(add.add(BigInteger.valueOf(j10)));
                    BigInteger bigInteger10 = ONE;
                    BigInteger add2 = multiply.add(bigInteger10);
                    bigIntegerArr4[i19] = add2;
                    BigInteger bigInteger11 = TWO;
                    i12 = i21;
                    if (add2.compareTo(bigInteger11.pow(iArr[i19])) == 1) {
                        break;
                    }
                    if (bigInteger11.modPow(bigIntegerArr4[i25].multiply(add.add(BigInteger.valueOf(j10))), bigIntegerArr4[i19]).compareTo(bigInteger10) == 0 && bigInteger11.modPow(add.add(BigInteger.valueOf(j10)), bigIntegerArr4[i19]).compareTo(bigInteger10) != 0) {
                        break;
                    }
                    i26 += 2;
                    i17 = i11;
                    bigInteger5 = bigInteger3;
                    bigInteger4 = bigInteger2;
                    i21 = i12;
                }
                i17 = i11;
                bigInteger5 = bigInteger3;
                bigIntegerArr3 = bigIntegerArr2;
                bigInteger4 = bigInteger2;
                i21 = i12;
                i15 = 0;
                i18 = 16;
            }
            i19--;
            if (i19 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[0];
                break;
            }
            i20++;
            i17 = i11;
            bigInteger5 = bigInteger3;
            bigIntegerArr3 = bigIntegerArr2;
            bigInteger4 = bigInteger2;
            i15 = 0;
            i18 = 16;
        }
        return bigInteger.intValue();
    }

    private long procedure_Aa(long j10, long j11, BigInteger[] bigIntegerArr, int i) {
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int i9;
        long j12 = j10;
        while (true) {
            if (j12 >= 0 && j12 <= 4294967296L) {
                break;
            }
            j12 = this.init_random.nextInt() * 2;
        }
        long j13 = j11;
        while (true) {
            if (j13 >= 0 && j13 <= 4294967296L && j13 / 2 != 0) {
                break;
            }
            j13 = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Long.toString(j13));
        BigInteger bigInteger5 = new BigInteger("97781173");
        BigInteger bigInteger6 = new BigInteger(Long.toString(j12));
        int i10 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger6};
        int[] iArr = {i};
        int i11 = 0;
        int i12 = 0;
        while (iArr[i11] >= 33) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i12 = i11 + 1;
            iArr[i12] = iArr[i11] / 2;
            i11 = i12;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i12 + 1];
        bigIntegerArr4[i12] = new BigInteger("8000000B", 16);
        int i13 = i12 - 1;
        int i14 = 0;
        while (true) {
            if (i14 >= i12) {
                bigInteger = bigIntegerArr3[i10];
                break;
            }
            int i15 = 32;
            int i16 = iArr[i13] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i10, bigIntegerArr5, i10, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i16 + 1];
                System.arraycopy(bigIntegerArr5, i10, bigIntegerArr2, i10, length2);
                int i17 = i10;
                while (i17 < i16) {
                    int i18 = i17 + 1;
                    bigIntegerArr2[i18] = bigIntegerArr2[i17].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i15));
                    i17 = i18;
                }
                BigInteger bigInteger7 = new BigInteger("0");
                for (int i19 = i10; i19 < i16; i19++) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i19].multiply(TWO.pow(i19 * 32)));
                }
                bigIntegerArr2[i10] = bigIntegerArr2[i16];
                BigInteger bigInteger8 = TWO;
                int i20 = i13 + 1;
                BigInteger add = bigInteger8.pow(iArr[i13] - 1).divide(bigIntegerArr4[i20]).add(bigInteger8.pow(iArr[i13] - 1).multiply(bigInteger7).divide(bigIntegerArr4[i20].multiply(bigInteger8.pow(i16 * 32))));
                BigInteger mod = add.mod(bigInteger8);
                BigInteger bigInteger9 = ONE;
                if (mod.compareTo(bigInteger9) == 0) {
                    add = add.add(bigInteger9);
                }
                int i21 = 0;
                while (true) {
                    long j14 = i21;
                    bigInteger2 = bigInteger4;
                    BigInteger multiply = bigIntegerArr4[i20].multiply(add.add(BigInteger.valueOf(j14)));
                    BigInteger bigInteger10 = ONE;
                    BigInteger add2 = multiply.add(bigInteger10);
                    bigIntegerArr4[i13] = add2;
                    bigInteger3 = bigInteger5;
                    BigInteger bigInteger11 = TWO;
                    i9 = i12;
                    if (add2.compareTo(bigInteger11.pow(iArr[i13])) == 1) {
                        break;
                    }
                    if (bigInteger11.modPow(bigIntegerArr4[i20].multiply(add.add(BigInteger.valueOf(j14))), bigIntegerArr4[i13]).compareTo(bigInteger10) == 0 && bigInteger11.modPow(add.add(BigInteger.valueOf(j14)), bigIntegerArr4[i13]).compareTo(bigInteger10) != 0) {
                        break;
                    }
                    i21 += 2;
                    bigInteger4 = bigInteger2;
                    i12 = i9;
                    bigInteger5 = bigInteger3;
                }
                bigInteger4 = bigInteger2;
                bigIntegerArr3 = bigIntegerArr2;
                bigInteger5 = bigInteger3;
                i10 = 0;
                i15 = 32;
                i12 = i9;
            }
            i13--;
            if (i13 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[0];
                break;
            }
            i14++;
            bigInteger4 = bigInteger2;
            i12 = i9;
            bigIntegerArr3 = bigIntegerArr2;
            bigInteger5 = bigInteger3;
            i10 = 0;
        }
        return bigInteger.longValue();
    }

    private void procedure_B(int i, int i9, BigInteger[] bigIntegerArr) {
        int i10 = i;
        while (true) {
            if (i10 >= 0 && i10 <= 65536) {
                break;
            } else {
                i10 = this.init_random.nextInt() / 32768;
            }
        }
        int i11 = i9;
        while (true) {
            if (i11 >= 0 && i11 <= 65536 && i11 / 2 != 0) {
                break;
            } else {
                i11 = (this.init_random.nextInt() / 32768) + 1;
            }
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(i11));
        BigInteger bigInteger2 = new BigInteger("19381");
        int procedure_A = procedure_A(i10, i11, bigIntegerArr2, 256);
        int i12 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int procedure_A2 = procedure_A(procedure_A, i11, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(procedure_A2));
        while (true) {
            int i13 = i12;
            while (i13 < 64) {
                int i14 = i13 + 1;
                bigIntegerArr3[i14] = bigIntegerArr3[i13].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i13 = i14;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i15 = i12; i15 < 64; i15++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i15].multiply(TWO.pow(i15 * 16)));
            }
            bigIntegerArr3[i12] = bigIntegerArr3[64];
            BigInteger bigInteger6 = TWO;
            int i16 = 1024;
            BigInteger add = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger mod = add.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (mod.compareTo(bigInteger7) == 0) {
                add = add.add(bigInteger7);
            }
            BigInteger bigInteger8 = add;
            int i17 = i12;
            while (true) {
                long j10 = i17;
                BigInteger multiply = bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j10)));
                BigInteger bigInteger9 = ONE;
                BigInteger add2 = multiply.add(bigInteger9);
                BigInteger bigInteger10 = TWO;
                if (add2.compareTo(bigInteger10.pow(i16)) == 1) {
                    break;
                }
                if (bigInteger10.modPow(bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j10))), add2).compareTo(bigInteger9) == 0 && bigInteger10.modPow(bigInteger3.multiply(bigInteger8.add(BigInteger.valueOf(j10))), add2).compareTo(bigInteger9) != 0) {
                    bigIntegerArr[0] = add2;
                    bigIntegerArr[1] = bigInteger3;
                    return;
                } else {
                    i17 += 2;
                    i16 = 1024;
                }
            }
            i12 = 0;
        }
    }

    private void procedure_Bb(long j10, long j11, BigInteger[] bigIntegerArr) {
        long j12 = j10;
        while (true) {
            if (j12 >= 0 && j12 <= 4294967296L) {
                break;
            } else {
                j12 = this.init_random.nextInt() * 2;
            }
        }
        long j13 = j11;
        while (true) {
            if (j13 >= 0 && j13 <= 4294967296L && j13 / 2 != 0) {
                break;
            } else {
                j13 = (this.init_random.nextInt() * 2) + 1;
            }
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(j13));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long j14 = j13;
        long procedure_Aa = procedure_Aa(j12, j14, bigIntegerArr2, 256);
        int i = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long procedure_Aa2 = procedure_Aa(procedure_Aa, j14, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(procedure_Aa2));
        while (true) {
            int i9 = i;
            while (i9 < 32) {
                int i10 = i9 + 1;
                bigIntegerArr3[i10] = bigIntegerArr3[i9].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                i9 = i10;
            }
            BigInteger bigInteger5 = new BigInteger("0");
            for (int i11 = i; i11 < 32; i11++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i11].multiply(TWO.pow(i11 * 32)));
            }
            bigIntegerArr3[i] = bigIntegerArr3[32];
            BigInteger bigInteger6 = TWO;
            int i12 = 1024;
            BigInteger add = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger mod = add.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (mod.compareTo(bigInteger7) == 0) {
                add = add.add(bigInteger7);
            }
            int i13 = i;
            while (true) {
                long j15 = i13;
                BigInteger multiply = bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j15)));
                BigInteger bigInteger8 = ONE;
                BigInteger add2 = multiply.add(bigInteger8);
                BigInteger bigInteger9 = TWO;
                if (add2.compareTo(bigInteger9.pow(i12)) == 1) {
                    break;
                }
                if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j15))), add2).compareTo(bigInteger8) == 0 && bigInteger9.modPow(bigInteger3.multiply(add.add(BigInteger.valueOf(j15))), add2).compareTo(bigInteger8) != 0) {
                    bigIntegerArr[0] = add2;
                    bigIntegerArr[1] = bigInteger3;
                    return;
                } else {
                    i13 += 2;
                    i12 = 1024;
                }
            }
            i = 0;
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger subtract = bigInteger.subtract(ONE);
        BigInteger divide = subtract.divide(bigInteger2);
        int bitLength = bigInteger.bitLength();
        while (true) {
            BigInteger createRandomBigInteger = BigIntegers.createRandomBigInteger(bitLength, this.init_random);
            BigInteger bigInteger3 = ONE;
            if (createRandomBigInteger.compareTo(bigInteger3) > 0 && createRandomBigInteger.compareTo(subtract) < 0) {
                BigInteger modPow = createRandomBigInteger.modPow(divide, bigInteger);
                if (modPow.compareTo(bigInteger3) != 0) {
                    return modPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        BigInteger[] bigIntegerArr = new BigInteger[2];
        if (this.typeproc == 1) {
            int nextInt = this.init_random.nextInt();
            int nextInt2 = this.init_random.nextInt();
            int i = this.size;
            if (i == 512) {
                procedure_A(nextInt, nextInt2, bigIntegerArr, 512);
            } else {
                if (i != 1024) {
                    throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
                }
                procedure_B(nextInt, nextInt2, bigIntegerArr);
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(nextInt, nextInt2));
        }
        long nextLong = this.init_random.nextLong();
        long nextLong2 = this.init_random.nextLong();
        int i9 = this.size;
        if (i9 == 512) {
            procedure_Aa(nextLong, nextLong2, bigIntegerArr, 512);
        } else {
            if (i9 != 1024) {
                throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
            }
            procedure_Bb(nextLong, nextLong2, bigIntegerArr);
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger3, bigInteger4, procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(nextLong, nextLong2));
    }

    public void init(int i, int i9, SecureRandom secureRandom) {
        this.size = i;
        this.typeproc = i9;
        this.init_random = secureRandom;
    }
}
