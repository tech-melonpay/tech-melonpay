package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;
import s3.b;

/* loaded from: classes2.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;
    private long[] kw;

    /* renamed from: t, reason: collision with root package name */
    private long[] f24982t;

    public static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f24983t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            int i = 1;
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = jArr[8];
            long j19 = jArr[9];
            long j20 = jArr[10];
            long j21 = jArr[11];
            long j22 = jArr[12];
            long j23 = jArr[13];
            long j24 = jArr[14];
            long j25 = jArr[15];
            int i9 = 19;
            while (i9 >= i) {
                int i10 = iArr[i9];
                int i11 = iArr2[i9];
                int i12 = i10 + 1;
                long j26 = j10 - jArr3[i12];
                int i13 = i10 + 2;
                long j27 = j11 - jArr3[i13];
                int i14 = i10 + 3;
                long j28 = j12 - jArr3[i14];
                int i15 = i10 + 4;
                long j29 = j13 - jArr3[i15];
                int i16 = i10 + 5;
                long j30 = j14 - jArr3[i16];
                int i17 = i10 + 6;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j31 = j15 - jArr3[i17];
                int i18 = i10 + 7;
                long j32 = j16 - jArr3[i18];
                int i19 = i10 + 8;
                long j33 = j17 - jArr3[i19];
                int i20 = i10 + 9;
                long j34 = j18 - jArr3[i20];
                int i21 = i10 + 10;
                long j35 = j19 - jArr3[i21];
                int i22 = i10 + 11;
                long j36 = j20 - jArr3[i22];
                int i23 = i10 + 12;
                long j37 = j21 - jArr3[i23];
                int i24 = i10 + 13;
                long j38 = j22 - jArr3[i24];
                int i25 = i10 + 14;
                int i26 = i11 + 1;
                long j39 = j23 - (jArr3[i25] + jArr4[i26]);
                int i27 = i10 + 15;
                long j40 = j24 - (jArr3[i27] + jArr4[i11 + 2]);
                long[] jArr5 = jArr3;
                long j41 = i9;
                long xorRotr = ThreefishEngine.xorRotr(j25 - ((jArr3[i10 + 16] + j41) + 1), 9, j26);
                long j42 = j26 - xorRotr;
                long xorRotr2 = ThreefishEngine.xorRotr(j37, 48, j28);
                long j43 = j28 - xorRotr2;
                long xorRotr3 = ThreefishEngine.xorRotr(j39, 35, j32);
                long j44 = j32 - xorRotr3;
                long[] jArr6 = jArr4;
                long xorRotr4 = ThreefishEngine.xorRotr(j35, 52, j30);
                long j45 = j30 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(j27, 23, j40);
                long j46 = j40 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(j31, 31, j34);
                long j47 = j34 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(j29, 37, j36);
                long j48 = j36 - xorRotr7;
                long xorRotr8 = ThreefishEngine.xorRotr(j33, 20, j38);
                long j49 = j38 - xorRotr8;
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr8, 31, j42);
                long j50 = j42 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(xorRotr6, 44, j43);
                long j51 = j43 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr7, 47, j45);
                long j52 = j45 - xorRotr11;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr5, 46, j44);
                long j53 = j44 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr, 19, j49);
                long j54 = j49 - xorRotr13;
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr3, 42, j46);
                long j55 = j46 - xorRotr14;
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr2, 44, j47);
                long j56 = j47 - xorRotr15;
                long xorRotr16 = ThreefishEngine.xorRotr(xorRotr4, 25, j48);
                long j57 = j48 - xorRotr16;
                long xorRotr17 = ThreefishEngine.xorRotr(xorRotr16, 16, j50);
                long j58 = j50 - xorRotr17;
                long xorRotr18 = ThreefishEngine.xorRotr(xorRotr14, 34, j51);
                long j59 = j51 - xorRotr18;
                long xorRotr19 = ThreefishEngine.xorRotr(xorRotr15, 56, j53);
                long j60 = j53 - xorRotr19;
                long xorRotr20 = ThreefishEngine.xorRotr(xorRotr13, 51, j52);
                long j61 = j52 - xorRotr20;
                long xorRotr21 = ThreefishEngine.xorRotr(xorRotr9, 4, j57);
                long j62 = j57 - xorRotr21;
                long xorRotr22 = ThreefishEngine.xorRotr(xorRotr11, 53, j54);
                long j63 = j54 - xorRotr22;
                long xorRotr23 = ThreefishEngine.xorRotr(xorRotr10, 42, j55);
                long j64 = j55 - xorRotr23;
                long xorRotr24 = ThreefishEngine.xorRotr(xorRotr12, 41, j56);
                long j65 = j56 - xorRotr24;
                long xorRotr25 = ThreefishEngine.xorRotr(xorRotr24, 41, j58);
                long xorRotr26 = ThreefishEngine.xorRotr(xorRotr22, 9, j59);
                long xorRotr27 = ThreefishEngine.xorRotr(xorRotr23, 37, j61);
                long j66 = j61 - xorRotr27;
                long xorRotr28 = ThreefishEngine.xorRotr(xorRotr21, 31, j60);
                long j67 = j60 - xorRotr28;
                long xorRotr29 = ThreefishEngine.xorRotr(xorRotr17, 12, j65);
                long j68 = j65 - xorRotr29;
                long xorRotr30 = ThreefishEngine.xorRotr(xorRotr19, 47, j62);
                long j69 = j62 - xorRotr30;
                long xorRotr31 = ThreefishEngine.xorRotr(xorRotr18, 44, j63);
                long j70 = j63 - xorRotr31;
                long xorRotr32 = ThreefishEngine.xorRotr(xorRotr20, 30, j64);
                long j71 = j64 - xorRotr32;
                long j72 = (j58 - xorRotr25) - jArr5[i10];
                long j73 = xorRotr25 - jArr5[i12];
                long j74 = (j59 - xorRotr26) - jArr5[i13];
                long j75 = xorRotr26 - jArr5[i14];
                long j76 = j66 - jArr5[i15];
                long j77 = xorRotr27 - jArr5[i16];
                long j78 = j67 - jArr5[i17];
                long j79 = xorRotr28 - jArr5[i18];
                long j80 = j68 - jArr5[i19];
                long j81 = xorRotr29 - jArr5[i20];
                long j82 = j69 - jArr5[i21];
                long j83 = xorRotr30 - jArr5[i22];
                long j84 = j70 - jArr5[i23];
                long j85 = xorRotr31 - (jArr5[i24] + jArr6[i11]);
                long j86 = j71 - (jArr5[i25] + jArr6[i26]);
                long xorRotr33 = ThreefishEngine.xorRotr(xorRotr32 - (jArr5[i27] + j41), 5, j72);
                long j87 = j72 - xorRotr33;
                long xorRotr34 = ThreefishEngine.xorRotr(j83, 20, j74);
                long j88 = j74 - xorRotr34;
                long xorRotr35 = ThreefishEngine.xorRotr(j85, 48, j78);
                long j89 = j78 - xorRotr35;
                long xorRotr36 = ThreefishEngine.xorRotr(j81, 41, j76);
                long j90 = j76 - xorRotr36;
                long xorRotr37 = ThreefishEngine.xorRotr(j73, 47, j86);
                long j91 = j86 - xorRotr37;
                long xorRotr38 = ThreefishEngine.xorRotr(j77, 28, j80);
                long j92 = j80 - xorRotr38;
                long xorRotr39 = ThreefishEngine.xorRotr(j75, 16, j82);
                long j93 = j82 - xorRotr39;
                long xorRotr40 = ThreefishEngine.xorRotr(j79, 25, j84);
                long j94 = j84 - xorRotr40;
                long xorRotr41 = ThreefishEngine.xorRotr(xorRotr40, 33, j87);
                long j95 = j87 - xorRotr41;
                long xorRotr42 = ThreefishEngine.xorRotr(xorRotr38, 4, j88);
                long j96 = j88 - xorRotr42;
                long xorRotr43 = ThreefishEngine.xorRotr(xorRotr39, 51, j90);
                long j97 = j90 - xorRotr43;
                long xorRotr44 = ThreefishEngine.xorRotr(xorRotr37, 13, j89);
                long j98 = j89 - xorRotr44;
                long xorRotr45 = ThreefishEngine.xorRotr(xorRotr33, 34, j94);
                long j99 = j94 - xorRotr45;
                long xorRotr46 = ThreefishEngine.xorRotr(xorRotr35, 41, j91);
                long j100 = j91 - xorRotr46;
                long xorRotr47 = ThreefishEngine.xorRotr(xorRotr34, 59, j92);
                long j101 = j92 - xorRotr47;
                long xorRotr48 = ThreefishEngine.xorRotr(xorRotr36, 17, j93);
                long j102 = j93 - xorRotr48;
                long xorRotr49 = ThreefishEngine.xorRotr(xorRotr48, 38, j95);
                long j103 = j95 - xorRotr49;
                long xorRotr50 = ThreefishEngine.xorRotr(xorRotr46, 19, j96);
                long j104 = j96 - xorRotr50;
                long xorRotr51 = ThreefishEngine.xorRotr(xorRotr47, 10, j98);
                long j105 = j98 - xorRotr51;
                long xorRotr52 = ThreefishEngine.xorRotr(xorRotr45, 55, j97);
                long j106 = j97 - xorRotr52;
                long xorRotr53 = ThreefishEngine.xorRotr(xorRotr41, 49, j102);
                long j107 = j102 - xorRotr53;
                long xorRotr54 = ThreefishEngine.xorRotr(xorRotr43, 18, j99);
                long j108 = j99 - xorRotr54;
                long xorRotr55 = ThreefishEngine.xorRotr(xorRotr42, 23, j100);
                long j109 = j100 - xorRotr55;
                long xorRotr56 = ThreefishEngine.xorRotr(xorRotr44, 52, j101);
                long j110 = j101 - xorRotr56;
                long xorRotr57 = ThreefishEngine.xorRotr(xorRotr56, 24, j103);
                long j111 = j103 - xorRotr57;
                long xorRotr58 = ThreefishEngine.xorRotr(xorRotr54, 13, j104);
                j12 = j104 - xorRotr58;
                long xorRotr59 = ThreefishEngine.xorRotr(xorRotr55, 8, j106);
                long j112 = j106 - xorRotr59;
                long xorRotr60 = ThreefishEngine.xorRotr(xorRotr53, 47, j105);
                long j113 = j105 - xorRotr60;
                long xorRotr61 = ThreefishEngine.xorRotr(xorRotr49, 8, j110);
                long j114 = j110 - xorRotr61;
                long xorRotr62 = ThreefishEngine.xorRotr(xorRotr51, 17, j107);
                long j115 = j107 - xorRotr62;
                long xorRotr63 = ThreefishEngine.xorRotr(xorRotr50, 22, j108);
                j22 = j108 - xorRotr63;
                j25 = ThreefishEngine.xorRotr(xorRotr52, 37, j109);
                j24 = j109 - j25;
                j21 = xorRotr62;
                j19 = xorRotr61;
                iArr = iArr3;
                iArr2 = iArr4;
                jArr4 = jArr6;
                jArr3 = jArr5;
                j23 = xorRotr63;
                j18 = j114;
                i = 1;
                i9 -= 2;
                j11 = xorRotr57;
                j13 = xorRotr58;
                j20 = j115;
                j17 = xorRotr60;
                j14 = j112;
                j15 = xorRotr59;
                j16 = j113;
                j10 = j111;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            long j116 = j10 - jArr7[0];
            long j117 = j11 - jArr7[1];
            long j118 = j12 - jArr7[2];
            long j119 = j13 - jArr7[3];
            long j120 = j14 - jArr7[4];
            long j121 = j15 - jArr7[5];
            long j122 = j16 - jArr7[6];
            long j123 = j17 - jArr7[7];
            long j124 = j18 - jArr7[8];
            long j125 = j19 - jArr7[9];
            long j126 = j20 - jArr7[10];
            long j127 = j21 - jArr7[11];
            long j128 = j22 - jArr7[12];
            long j129 = j23 - (jArr7[13] + jArr8[0]);
            long j130 = j24 - (jArr7[14] + jArr8[1]);
            long j131 = j25 - jArr7[15];
            jArr2[0] = j116;
            jArr2[1] = j117;
            jArr2[2] = j118;
            jArr2[3] = j119;
            jArr2[4] = j120;
            jArr2[5] = j121;
            jArr2[6] = j122;
            jArr2[7] = j123;
            jArr2[8] = j124;
            jArr2[9] = j125;
            jArr2[10] = j126;
            jArr2[11] = j127;
            jArr2[12] = j128;
            jArr2[13] = j129;
            jArr2[14] = j130;
            jArr2[15] = j131;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f24983t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            int i = 1;
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = jArr[8];
            long j19 = jArr[9];
            long j20 = jArr[10];
            long j21 = jArr[11];
            long j22 = jArr[12];
            long j23 = jArr[13];
            long j24 = jArr[14];
            long j25 = jArr[15];
            long j26 = j10 + jArr3[0];
            long j27 = j11 + jArr3[1];
            long j28 = j12 + jArr3[2];
            long j29 = j13 + jArr3[3];
            long j30 = j14 + jArr3[4];
            long j31 = j15 + jArr3[5];
            long j32 = j16 + jArr3[6];
            long j33 = j17 + jArr3[7];
            long j34 = j18 + jArr3[8];
            long j35 = j19 + jArr3[9];
            long j36 = j20 + jArr3[10];
            long j37 = j21 + jArr3[11];
            long j38 = j22 + jArr3[12];
            long j39 = jArr3[13] + jArr4[0] + j23;
            long j40 = jArr3[14] + jArr4[1] + j24;
            long j41 = j29;
            long j42 = j31;
            long j43 = j33;
            long j44 = j35;
            long j45 = j37;
            long j46 = j25 + jArr3[15];
            long j47 = j39;
            while (i < 20) {
                int i9 = iArr[i];
                int i10 = iArr2[i];
                long j48 = j26 + j27;
                long rotlXor = ThreefishEngine.rotlXor(j27, 24, j48);
                long j49 = j28 + j41;
                long rotlXor2 = ThreefishEngine.rotlXor(j41, 13, j49);
                long[] jArr5 = jArr3;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j50 = j42;
                long j51 = j30 + j50;
                long rotlXor3 = ThreefishEngine.rotlXor(j50, 8, j51);
                int i11 = i;
                long j52 = j43;
                long j53 = j32 + j52;
                long rotlXor4 = ThreefishEngine.rotlXor(j52, 47, j53);
                long[] jArr6 = jArr4;
                long j54 = j44;
                long j55 = j34 + j54;
                long rotlXor5 = ThreefishEngine.rotlXor(j54, 8, j55);
                long j56 = j45;
                long j57 = j36 + j56;
                long rotlXor6 = ThreefishEngine.rotlXor(j56, 17, j57);
                long j58 = j47;
                long j59 = j38 + j58;
                long rotlXor7 = ThreefishEngine.rotlXor(j58, 22, j59);
                long j60 = j46;
                long j61 = j40 + j60;
                long rotlXor8 = ThreefishEngine.rotlXor(j60, 37, j61);
                long j62 = j48 + rotlXor5;
                long rotlXor9 = ThreefishEngine.rotlXor(rotlXor5, 38, j62);
                long j63 = j49 + rotlXor7;
                long rotlXor10 = ThreefishEngine.rotlXor(rotlXor7, 19, j63);
                long j64 = j53 + rotlXor6;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor6, 10, j64);
                long j65 = j51 + rotlXor8;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor8, 55, j65);
                long j66 = j57 + rotlXor4;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor4, 49, j66);
                long j67 = j59 + rotlXor2;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor2, 18, j67);
                long j68 = j61 + rotlXor3;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor3, 23, j68);
                long j69 = j55 + rotlXor;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor, 52, j69);
                long j70 = j62 + rotlXor13;
                long rotlXor17 = ThreefishEngine.rotlXor(rotlXor13, 33, j70);
                long j71 = j63 + rotlXor15;
                long rotlXor18 = ThreefishEngine.rotlXor(rotlXor15, 4, j71);
                long j72 = j65 + rotlXor14;
                long rotlXor19 = ThreefishEngine.rotlXor(rotlXor14, 51, j72);
                long j73 = j64 + rotlXor16;
                long rotlXor20 = ThreefishEngine.rotlXor(rotlXor16, 13, j73);
                long j74 = j67 + rotlXor12;
                long rotlXor21 = ThreefishEngine.rotlXor(rotlXor12, 34, j74);
                long j75 = j68 + rotlXor10;
                long rotlXor22 = ThreefishEngine.rotlXor(rotlXor10, 41, j75);
                long j76 = j69 + rotlXor11;
                long rotlXor23 = ThreefishEngine.rotlXor(rotlXor11, 59, j76);
                long j77 = j66 + rotlXor9;
                long rotlXor24 = ThreefishEngine.rotlXor(rotlXor9, 17, j77);
                long j78 = j70 + rotlXor21;
                long rotlXor25 = ThreefishEngine.rotlXor(rotlXor21, 5, j78);
                long j79 = j71 + rotlXor23;
                long rotlXor26 = ThreefishEngine.rotlXor(rotlXor23, 20, j79);
                long j80 = j73 + rotlXor22;
                long rotlXor27 = ThreefishEngine.rotlXor(rotlXor22, 48, j80);
                long j81 = j72 + rotlXor24;
                long rotlXor28 = ThreefishEngine.rotlXor(rotlXor24, 41, j81);
                long j82 = j75 + rotlXor20;
                long rotlXor29 = ThreefishEngine.rotlXor(rotlXor20, 47, j82);
                long j83 = j76 + rotlXor18;
                long rotlXor30 = ThreefishEngine.rotlXor(rotlXor18, 28, j83);
                long j84 = j77 + rotlXor19;
                long rotlXor31 = ThreefishEngine.rotlXor(rotlXor19, 16, j84);
                long j85 = j74 + rotlXor17;
                long rotlXor32 = ThreefishEngine.rotlXor(rotlXor17, 25, j85);
                long j86 = j78 + jArr5[i9];
                int i12 = i9 + 1;
                long j87 = rotlXor29 + jArr5[i12];
                int i13 = i9 + 2;
                long j88 = j79 + jArr5[i13];
                int i14 = i9 + 3;
                long j89 = rotlXor31 + jArr5[i14];
                int i15 = i9 + 4;
                long j90 = j81 + jArr5[i15];
                int i16 = i9 + 5;
                long j91 = rotlXor30 + jArr5[i16];
                int i17 = i9 + 6;
                long j92 = j80 + jArr5[i17];
                int i18 = i9 + 7;
                long j93 = rotlXor32 + jArr5[i18];
                int i19 = i9 + 8;
                long j94 = j83 + jArr5[i19];
                int i20 = i9 + 9;
                long j95 = rotlXor28 + jArr5[i20];
                int i21 = i9 + 10;
                long j96 = j84 + jArr5[i21];
                int i22 = i9 + 11;
                long j97 = rotlXor26 + jArr5[i22];
                int i23 = i9 + 12;
                long j98 = j85 + jArr5[i23];
                int i24 = i9 + 13;
                long j99 = jArr5[i24] + jArr6[i10] + rotlXor27;
                int i25 = i9 + 14;
                int i26 = i10 + 1;
                long j100 = jArr5[i25] + jArr6[i26] + j82;
                int i27 = i9 + 15;
                long j101 = i11;
                long j102 = jArr5[i27] + j101 + rotlXor25;
                long j103 = j86 + j87;
                long rotlXor33 = ThreefishEngine.rotlXor(j87, 41, j103);
                long j104 = j88 + j89;
                long rotlXor34 = ThreefishEngine.rotlXor(j89, 9, j104);
                long j105 = j90 + j91;
                long rotlXor35 = ThreefishEngine.rotlXor(j91, 37, j105);
                long j106 = j92 + j93;
                long rotlXor36 = ThreefishEngine.rotlXor(j93, 31, j106);
                long j107 = j94 + j95;
                long rotlXor37 = ThreefishEngine.rotlXor(j95, 12, j107);
                long j108 = j96 + j97;
                long rotlXor38 = ThreefishEngine.rotlXor(j97, 47, j108);
                long j109 = j98 + j99;
                long rotlXor39 = ThreefishEngine.rotlXor(j99, 44, j109);
                long j110 = j100 + j102;
                long rotlXor40 = ThreefishEngine.rotlXor(j102, 30, j110);
                long j111 = j103 + rotlXor37;
                long rotlXor41 = ThreefishEngine.rotlXor(rotlXor37, 16, j111);
                long j112 = j104 + rotlXor39;
                long rotlXor42 = ThreefishEngine.rotlXor(rotlXor39, 34, j112);
                long j113 = j106 + rotlXor38;
                long rotlXor43 = ThreefishEngine.rotlXor(rotlXor38, 56, j113);
                long j114 = j105 + rotlXor40;
                long rotlXor44 = ThreefishEngine.rotlXor(rotlXor40, 51, j114);
                long j115 = j108 + rotlXor36;
                long rotlXor45 = ThreefishEngine.rotlXor(rotlXor36, 4, j115);
                long j116 = j109 + rotlXor34;
                long rotlXor46 = ThreefishEngine.rotlXor(rotlXor34, 53, j116);
                long j117 = j110 + rotlXor35;
                long rotlXor47 = ThreefishEngine.rotlXor(rotlXor35, 42, j117);
                long j118 = j107 + rotlXor33;
                long rotlXor48 = ThreefishEngine.rotlXor(rotlXor33, 41, j118);
                long j119 = j111 + rotlXor45;
                long rotlXor49 = ThreefishEngine.rotlXor(rotlXor45, 31, j119);
                long j120 = j112 + rotlXor47;
                long rotlXor50 = ThreefishEngine.rotlXor(rotlXor47, 44, j120);
                long j121 = j114 + rotlXor46;
                long rotlXor51 = ThreefishEngine.rotlXor(rotlXor46, 47, j121);
                long j122 = j113 + rotlXor48;
                long rotlXor52 = ThreefishEngine.rotlXor(rotlXor48, 46, j122);
                long j123 = j116 + rotlXor44;
                long rotlXor53 = ThreefishEngine.rotlXor(rotlXor44, 19, j123);
                long j124 = j117 + rotlXor42;
                long rotlXor54 = ThreefishEngine.rotlXor(rotlXor42, 42, j124);
                long j125 = j118 + rotlXor43;
                long rotlXor55 = ThreefishEngine.rotlXor(rotlXor43, 44, j125);
                long j126 = j115 + rotlXor41;
                long rotlXor56 = ThreefishEngine.rotlXor(rotlXor41, 25, j126);
                long j127 = j119 + rotlXor53;
                long rotlXor57 = ThreefishEngine.rotlXor(rotlXor53, 9, j127);
                long j128 = j120 + rotlXor55;
                long rotlXor58 = ThreefishEngine.rotlXor(rotlXor55, 48, j128);
                long j129 = j122 + rotlXor54;
                long rotlXor59 = ThreefishEngine.rotlXor(rotlXor54, 35, j129);
                long j130 = j121 + rotlXor56;
                long rotlXor60 = ThreefishEngine.rotlXor(rotlXor56, 52, j130);
                long j131 = j124 + rotlXor52;
                long rotlXor61 = ThreefishEngine.rotlXor(rotlXor52, 23, j131);
                long j132 = j125 + rotlXor50;
                long rotlXor62 = ThreefishEngine.rotlXor(rotlXor50, 31, j132);
                long j133 = j126 + rotlXor51;
                long rotlXor63 = ThreefishEngine.rotlXor(rotlXor51, 37, j133);
                long j134 = j123 + rotlXor49;
                long rotlXor64 = ThreefishEngine.rotlXor(rotlXor49, 20, j134);
                long j135 = j127 + jArr5[i12];
                long j136 = rotlXor61 + jArr5[i13];
                long j137 = j128 + jArr5[i14];
                long j138 = rotlXor63 + jArr5[i15];
                long j139 = j130 + jArr5[i16];
                long j140 = rotlXor62 + jArr5[i17];
                long j141 = j129 + jArr5[i18];
                j43 = rotlXor64 + jArr5[i19];
                j34 = j132 + jArr5[i20];
                long j142 = rotlXor60 + jArr5[i21];
                j36 = j133 + jArr5[i22];
                j45 = rotlXor58 + jArr5[i23];
                j38 = j134 + jArr5[i24];
                j47 = jArr5[i25] + jArr6[i26] + rotlXor59;
                j40 = jArr5[i27] + jArr6[i10 + 2] + j131;
                j46 = jArr5[i9 + 16] + j101 + 1 + rotlXor57;
                j44 = j142;
                j42 = j140;
                j32 = j141;
                iArr = iArr3;
                jArr4 = jArr6;
                j30 = j139;
                j41 = j138;
                iArr2 = iArr4;
                jArr3 = jArr5;
                i = i11 + 2;
                j27 = j136;
                j26 = j135;
                j28 = j137;
            }
            jArr2[0] = j26;
            jArr2[1] = j27;
            jArr2[2] = j28;
            jArr2[3] = j41;
            jArr2[4] = j30;
            jArr2[5] = j42;
            jArr2[6] = j32;
            jArr2[7] = j43;
            jArr2[8] = j34;
            jArr2[9] = j44;
            jArr2[10] = j36;
            jArr2[11] = j45;
            jArr2[12] = j38;
            jArr2[13] = j47;
            jArr2[14] = j40;
            jArr2[15] = j46;
        }
    }

    public static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f24983t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            boolean z10 = false;
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            int i = 17;
            for (int i9 = 1; i >= i9; i9 = 1) {
                int i10 = iArr[i];
                int i11 = iArr2[i];
                int i12 = i10 + 1;
                long j14 = j10 - jArr3[i12];
                int i13 = i10 + 2;
                int i14 = i11 + 1;
                long j15 = j11 - (jArr3[i13] + jArr4[i14]);
                int i15 = i10 + 3;
                long j16 = j12 - (jArr3[i15] + jArr4[i11 + 2]);
                long j17 = i;
                long xorRotr = ThreefishEngine.xorRotr(j13 - ((jArr3[i10 + 4] + j17) + 1), 32, j14);
                long j18 = j14 - xorRotr;
                int[] iArr3 = iArr;
                long xorRotr2 = ThreefishEngine.xorRotr(j15, 32, j16);
                long j19 = j16 - xorRotr2;
                long xorRotr3 = ThreefishEngine.xorRotr(xorRotr2, 58, j18);
                long j20 = j18 - xorRotr3;
                long xorRotr4 = ThreefishEngine.xorRotr(xorRotr, 22, j19);
                long j21 = j19 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(xorRotr4, 46, j20);
                long j22 = j20 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(xorRotr3, 12, j21);
                long j23 = j21 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(xorRotr6, 25, j22);
                long xorRotr8 = ThreefishEngine.xorRotr(xorRotr5, 33, j23);
                long j24 = (j22 - xorRotr7) - jArr3[i10];
                long j25 = xorRotr7 - (jArr3[i12] + jArr4[i11]);
                long j26 = (j23 - xorRotr8) - (jArr3[i13] + jArr4[i14]);
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr8 - (jArr3[i15] + j17), 5, j24);
                long j27 = j24 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(j25, 37, j26);
                long j28 = j26 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr10, 23, j27);
                long j29 = j27 - xorRotr11;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr9, 40, j28);
                long j30 = j28 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr12, 52, j29);
                long j31 = j29 - xorRotr13;
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr11, 57, j30);
                long j32 = j30 - xorRotr14;
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr14, 14, j31);
                j10 = j31 - xorRotr15;
                j13 = ThreefishEngine.xorRotr(xorRotr13, 16, j32);
                j12 = j32 - j13;
                i -= 2;
                j11 = xorRotr15;
                iArr = iArr3;
                iArr2 = iArr2;
                z10 = false;
            }
            boolean z11 = z10;
            long j33 = j10 - jArr3[z11 ? 1 : 0];
            long j34 = j11 - (jArr3[1] + jArr4[z11 ? 1 : 0]);
            long j35 = j12 - (jArr3[2] + jArr4[1]);
            long j36 = j13 - jArr3[3];
            jArr2[z11 ? 1 : 0] = j33;
            jArr2[1] = j34;
            jArr2[2] = j35;
            jArr2[3] = j36;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f24983t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = j10 + jArr3[0];
            long j15 = jArr3[1] + jArr4[0] + j11;
            long j16 = jArr3[2] + jArr4[1] + j12;
            int i = 1;
            long j17 = j13 + jArr3[3];
            long j18 = j15;
            while (i < 18) {
                int i9 = iArr[i];
                int i10 = iArr2[i];
                long j19 = j14 + j18;
                long rotlXor = ThreefishEngine.rotlXor(j18, 14, j19);
                long j20 = j16 + j17;
                long rotlXor2 = ThreefishEngine.rotlXor(j17, 16, j20);
                long j21 = j19 + rotlXor2;
                long rotlXor3 = ThreefishEngine.rotlXor(rotlXor2, 52, j21);
                long j22 = j20 + rotlXor;
                long rotlXor4 = ThreefishEngine.rotlXor(rotlXor, 57, j22);
                long j23 = j21 + rotlXor4;
                long rotlXor5 = ThreefishEngine.rotlXor(rotlXor4, 23, j23);
                long j24 = j22 + rotlXor3;
                long rotlXor6 = ThreefishEngine.rotlXor(rotlXor3, 40, j24);
                long j25 = j23 + rotlXor6;
                long rotlXor7 = ThreefishEngine.rotlXor(rotlXor6, 5, j25);
                long j26 = j24 + rotlXor5;
                long rotlXor8 = ThreefishEngine.rotlXor(rotlXor5, 37, j26);
                long j27 = j25 + jArr3[i9];
                int i11 = i9 + 1;
                long j28 = jArr3[i11] + jArr4[i10] + rotlXor8;
                int i12 = i9 + 2;
                int i13 = i10 + 1;
                long j29 = jArr3[i12] + jArr4[i13] + j26;
                int i14 = i9 + 3;
                int[] iArr3 = iArr;
                long j30 = i;
                long j31 = jArr3[i14] + j30 + rotlXor7;
                long j32 = j27 + j28;
                long rotlXor9 = ThreefishEngine.rotlXor(j28, 25, j32);
                long j33 = j29 + j31;
                long rotlXor10 = ThreefishEngine.rotlXor(j31, 33, j33);
                long j34 = j32 + rotlXor10;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor10, 46, j34);
                long j35 = j33 + rotlXor9;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor9, 12, j35);
                long j36 = j34 + rotlXor12;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor12, 58, j36);
                long j37 = j35 + rotlXor11;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor11, 22, j37);
                long j38 = j36 + rotlXor14;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor14, 32, j38);
                long j39 = j37 + rotlXor13;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor13, 32, j39);
                j14 = j38 + jArr3[i11];
                j18 = rotlXor16 + jArr3[i12] + jArr4[i13];
                long j40 = j39 + jArr3[i14] + jArr4[i10 + 2];
                j17 = jArr3[i9 + 4] + j30 + 1 + rotlXor15;
                i += 2;
                j16 = j40;
                iArr = iArr3;
                iArr2 = iArr2;
            }
            jArr2[0] = j14;
            jArr2[1] = j18;
            jArr2[2] = j16;
            jArr2[3] = j17;
        }
    }

    public static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        public Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f24983t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            boolean z10 = false;
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            int i = 17;
            for (int i9 = 1; i >= i9; i9 = 1) {
                int i10 = iArr[i];
                int i11 = iArr2[i];
                int i12 = i10 + 1;
                long j18 = j10 - jArr3[i12];
                int i13 = i10 + 2;
                long j19 = j11 - jArr3[i13];
                int i14 = i10 + 3;
                long j20 = j12 - jArr3[i14];
                int i15 = i10 + 4;
                long j21 = j13 - jArr3[i15];
                int i16 = i10 + 5;
                long j22 = j14 - jArr3[i16];
                int i17 = i10 + 6;
                int i18 = i11 + 1;
                long j23 = j15 - (jArr3[i17] + jArr4[i18]);
                int i19 = i10 + 7;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j24 = j16 - (jArr3[i19] + jArr4[i11 + 2]);
                long[] jArr5 = jArr3;
                long j25 = i;
                long j26 = j17 - ((jArr3[i10 + 8] + j25) + 1);
                int i20 = i;
                long xorRotr = ThreefishEngine.xorRotr(j19, 8, j24);
                long j27 = j24 - xorRotr;
                long xorRotr2 = ThreefishEngine.xorRotr(j26, 35, j18);
                long j28 = j18 - xorRotr2;
                long xorRotr3 = ThreefishEngine.xorRotr(j23, 56, j20);
                long j29 = j20 - xorRotr3;
                long xorRotr4 = ThreefishEngine.xorRotr(j21, 22, j22);
                long j30 = j22 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(xorRotr, 25, j30);
                long j31 = j30 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(xorRotr4, 29, j27);
                long j32 = j27 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(xorRotr3, 39, j28);
                long j33 = j28 - xorRotr7;
                long xorRotr8 = ThreefishEngine.xorRotr(xorRotr2, 43, j29);
                long j34 = j29 - xorRotr8;
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr5, 13, j34);
                long j35 = j34 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(xorRotr8, 50, j31);
                long j36 = j31 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr7, 10, j32);
                long j37 = j32 - xorRotr11;
                long[] jArr6 = jArr4;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr6, 17, j33);
                long j38 = j33 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr9, 39, j38);
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr12, 30, j35);
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr11, 34, j36);
                long xorRotr16 = ThreefishEngine.xorRotr(xorRotr10, 24, j37);
                long j39 = (j38 - xorRotr13) - jArr5[i10];
                long j40 = xorRotr13 - jArr5[i12];
                long j41 = (j35 - xorRotr14) - jArr5[i13];
                long j42 = xorRotr14 - jArr5[i14];
                long j43 = (j36 - xorRotr15) - jArr5[i15];
                long j44 = xorRotr15 - (jArr5[i16] + jArr6[i11]);
                long j45 = (j37 - xorRotr16) - (jArr5[i17] + jArr6[i18]);
                long j46 = xorRotr16 - (jArr5[i19] + j25);
                long xorRotr17 = ThreefishEngine.xorRotr(j40, 44, j45);
                long j47 = j45 - xorRotr17;
                long xorRotr18 = ThreefishEngine.xorRotr(j46, 9, j39);
                long j48 = j39 - xorRotr18;
                long xorRotr19 = ThreefishEngine.xorRotr(j44, 54, j41);
                long j49 = j41 - xorRotr19;
                long xorRotr20 = ThreefishEngine.xorRotr(j42, 56, j43);
                long j50 = j43 - xorRotr20;
                long xorRotr21 = ThreefishEngine.xorRotr(xorRotr17, 17, j50);
                long j51 = j50 - xorRotr21;
                long xorRotr22 = ThreefishEngine.xorRotr(xorRotr20, 49, j47);
                long j52 = j47 - xorRotr22;
                long xorRotr23 = ThreefishEngine.xorRotr(xorRotr19, 36, j48);
                long j53 = j48 - xorRotr23;
                long xorRotr24 = ThreefishEngine.xorRotr(xorRotr18, 39, j49);
                long j54 = j49 - xorRotr24;
                long xorRotr25 = ThreefishEngine.xorRotr(xorRotr21, 33, j54);
                long j55 = j54 - xorRotr25;
                long xorRotr26 = ThreefishEngine.xorRotr(xorRotr24, 27, j51);
                long j56 = j51 - xorRotr26;
                long xorRotr27 = ThreefishEngine.xorRotr(xorRotr23, 14, j52);
                long j57 = j52 - xorRotr27;
                long xorRotr28 = ThreefishEngine.xorRotr(xorRotr22, 42, j53);
                long j58 = j53 - xorRotr28;
                long xorRotr29 = ThreefishEngine.xorRotr(xorRotr25, 46, j58);
                j10 = j58 - xorRotr29;
                j13 = ThreefishEngine.xorRotr(xorRotr28, 36, j55);
                j15 = ThreefishEngine.xorRotr(xorRotr27, 19, j56);
                j17 = ThreefishEngine.xorRotr(xorRotr26, 37, j57);
                j16 = j57 - j17;
                i = i20 - 2;
                j14 = j56 - j15;
                j12 = j55 - j13;
                j11 = xorRotr29;
                iArr = iArr3;
                jArr4 = jArr6;
                iArr2 = iArr4;
                jArr3 = jArr5;
                z10 = false;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            boolean z11 = z10;
            long j59 = j10 - jArr7[z11 ? 1 : 0];
            long j60 = j11 - jArr7[1];
            long j61 = j12 - jArr7[2];
            long j62 = j13 - jArr7[3];
            long j63 = j14 - jArr7[4];
            long j64 = j15 - (jArr7[5] + jArr8[z11 ? 1 : 0]);
            long j65 = j16 - (jArr7[6] + jArr8[1]);
            long j66 = j17 - jArr7[7];
            jArr2[z11 ? 1 : 0] = j59;
            jArr2[1] = j60;
            jArr2[2] = j61;
            jArr2[3] = j62;
            jArr2[4] = j63;
            jArr2[5] = j64;
            jArr2[6] = j65;
            jArr2[7] = j66;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f24983t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = j10 + jArr3[0];
            long j19 = j11 + jArr3[1];
            long j20 = j12 + jArr3[2];
            long j21 = j13 + jArr3[3];
            long j22 = j14 + jArr3[4];
            long j23 = jArr3[5] + jArr4[0] + j15;
            long j24 = jArr3[6] + jArr4[1] + j16;
            int i = 1;
            long j25 = j21;
            long j26 = j17 + jArr3[7];
            long j27 = j23;
            while (i < 18) {
                int i9 = iArr[i];
                int i10 = iArr2[i];
                long j28 = j18 + j19;
                long rotlXor = ThreefishEngine.rotlXor(j19, 46, j28);
                long j29 = j20 + j25;
                long rotlXor2 = ThreefishEngine.rotlXor(j25, 36, j29);
                int[] iArr3 = iArr2;
                long j30 = j27;
                int[] iArr4 = iArr;
                long j31 = j22 + j30;
                long rotlXor3 = ThreefishEngine.rotlXor(j30, 19, j31);
                long[] jArr5 = jArr3;
                long j32 = j26;
                long j33 = j24 + j32;
                long rotlXor4 = ThreefishEngine.rotlXor(j32, 37, j33);
                int i11 = i;
                long j34 = j29 + rotlXor;
                long rotlXor5 = ThreefishEngine.rotlXor(rotlXor, 33, j34);
                long j35 = j31 + rotlXor4;
                long rotlXor6 = ThreefishEngine.rotlXor(rotlXor4, 27, j35);
                long j36 = j33 + rotlXor3;
                long rotlXor7 = ThreefishEngine.rotlXor(rotlXor3, 14, j36);
                long j37 = j28 + rotlXor2;
                long rotlXor8 = ThreefishEngine.rotlXor(rotlXor2, 42, j37);
                long j38 = j35 + rotlXor5;
                long rotlXor9 = ThreefishEngine.rotlXor(rotlXor5, 17, j38);
                long j39 = j36 + rotlXor8;
                long rotlXor10 = ThreefishEngine.rotlXor(rotlXor8, 49, j39);
                long j40 = j37 + rotlXor7;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor7, 36, j40);
                long j41 = j34 + rotlXor6;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor6, 39, j41);
                long j42 = j39 + rotlXor9;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor9, 44, j42);
                long j43 = j40 + rotlXor12;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor12, 9, j43);
                long j44 = j41 + rotlXor11;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor11, 54, j44);
                long j45 = j38 + rotlXor10;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor10, 56, j45);
                long j46 = j43 + jArr5[i9];
                int i12 = i9 + 1;
                long j47 = rotlXor13 + jArr5[i12];
                int i13 = i9 + 2;
                long j48 = j44 + jArr5[i13];
                int i14 = i9 + 3;
                long j49 = rotlXor16 + jArr5[i14];
                int i15 = i9 + 4;
                long j50 = j45 + jArr5[i15];
                int i16 = i9 + 5;
                long j51 = jArr5[i16] + jArr4[i10] + rotlXor15;
                int i17 = i9 + 6;
                int i18 = i10 + 1;
                long j52 = jArr5[i17] + jArr4[i18] + j42;
                int i19 = i9 + 7;
                long[] jArr6 = jArr4;
                long j53 = i11;
                long j54 = jArr5[i19] + j53 + rotlXor14;
                long j55 = j46 + j47;
                long rotlXor17 = ThreefishEngine.rotlXor(j47, 39, j55);
                long j56 = j48 + j49;
                long rotlXor18 = ThreefishEngine.rotlXor(j49, 30, j56);
                long j57 = j50 + j51;
                long rotlXor19 = ThreefishEngine.rotlXor(j51, 34, j57);
                long j58 = j52 + j54;
                long rotlXor20 = ThreefishEngine.rotlXor(j54, 24, j58);
                long j59 = j56 + rotlXor17;
                long rotlXor21 = ThreefishEngine.rotlXor(rotlXor17, 13, j59);
                long j60 = j57 + rotlXor20;
                long rotlXor22 = ThreefishEngine.rotlXor(rotlXor20, 50, j60);
                long j61 = j58 + rotlXor19;
                long rotlXor23 = ThreefishEngine.rotlXor(rotlXor19, 10, j61);
                long j62 = j55 + rotlXor18;
                long rotlXor24 = ThreefishEngine.rotlXor(rotlXor18, 17, j62);
                long j63 = j60 + rotlXor21;
                long rotlXor25 = ThreefishEngine.rotlXor(rotlXor21, 25, j63);
                long j64 = j61 + rotlXor24;
                long rotlXor26 = ThreefishEngine.rotlXor(rotlXor24, 29, j64);
                long j65 = j62 + rotlXor23;
                long rotlXor27 = ThreefishEngine.rotlXor(rotlXor23, 39, j65);
                long j66 = j59 + rotlXor22;
                long rotlXor28 = ThreefishEngine.rotlXor(rotlXor22, 43, j66);
                long j67 = j64 + rotlXor25;
                long rotlXor29 = ThreefishEngine.rotlXor(rotlXor25, 8, j67);
                long j68 = j65 + rotlXor28;
                long rotlXor30 = ThreefishEngine.rotlXor(rotlXor28, 35, j68);
                long j69 = j66 + rotlXor27;
                long rotlXor31 = ThreefishEngine.rotlXor(rotlXor27, 56, j69);
                long j70 = j63 + rotlXor26;
                long rotlXor32 = ThreefishEngine.rotlXor(rotlXor26, 22, j70);
                long j71 = j68 + jArr5[i12];
                j19 = rotlXor29 + jArr5[i13];
                long j72 = j69 + jArr5[i14];
                long j73 = rotlXor32 + jArr5[i15];
                long j74 = j70 + jArr5[i16];
                long j75 = jArr5[i17] + jArr6[i18] + rotlXor31;
                long j76 = jArr5[i19] + jArr6[i10 + 2] + j67;
                j26 = jArr5[i9 + 8] + j53 + 1 + rotlXor30;
                j24 = j76;
                j22 = j74;
                iArr2 = iArr3;
                jArr3 = jArr5;
                i = i11 + 2;
                j25 = j73;
                j18 = j71;
                iArr = iArr4;
                jArr4 = jArr6;
                j27 = j75;
                j20 = j72;
            }
            jArr2[0] = j18;
            jArr2[1] = j19;
            jArr2[2] = j20;
            jArr2[3] = j25;
            jArr2[4] = j22;
            jArr2[5] = j27;
            jArr2[6] = j24;
            jArr2[7] = j26;
        }
    }

    public static abstract class ThreefishCipher {
        protected final long[] kw;

        /* renamed from: t, reason: collision with root package name */
        protected final long[] f24983t;

        public ThreefishCipher(long[] jArr, long[] jArr2) {
            this.kw = jArr;
            this.f24983t = jArr2;
        }

        public abstract void decryptBlock(long[] jArr, long[] jArr2);

        public abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i >= iArr2.length) {
                return;
            }
            MOD17[i] = i % 17;
            iArr2[i] = i % 9;
            MOD5[i] = i % 5;
            MOD3[i] = i % 3;
            i++;
        }
    }

    public ThreefishEngine(int i) {
        ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.f24982t = jArr;
        int i9 = i / 8;
        this.blocksizeBytes = i9;
        int i10 = i9 / 8;
        this.blocksizeWords = i10;
        this.currentBlock = new long[i10];
        long[] jArr2 = new long[(i10 * 2) + 1];
        this.kw = jArr2;
        if (i == 256) {
            threefish256Cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i == 512) {
            threefish256Cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            threefish256Cipher = new Threefish1024Cipher(jArr2, jArr);
        }
        this.cipher = threefish256Cipher;
    }

    public static long bytesToWord(byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static long rotlXor(long j10, int i, long j11) {
        return ((j10 >>> (-i)) | (j10 << i)) ^ j11;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException(b.m(new StringBuilder("Threefish key must be same size as block ("), this.blocksizeWords, " words)"));
        }
        long j10 = C_240;
        int i = 0;
        while (true) {
            int i9 = this.blocksizeWords;
            if (i >= i9) {
                long[] jArr2 = this.kw;
                jArr2[i9] = j10;
                System.arraycopy(jArr2, 0, jArr2, i9 + 1, i9);
                return;
            } else {
                long[] jArr3 = this.kw;
                long j11 = jArr[i];
                jArr3[i] = j11;
                j10 ^= j11;
                i++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.f24982t;
        long j10 = jArr[0];
        jArr2[0] = j10;
        long j11 = jArr[1];
        jArr2[1] = j11;
        jArr2[2] = j10 ^ j11;
        jArr2[3] = j10;
        jArr2[4] = j11;
    }

    public static void wordToBytes(long j10, byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        bArr[i] = (byte) j10;
        bArr[i + 1] = (byte) (j10 >> 8);
        bArr[i + 2] = (byte) (j10 >> 16);
        bArr[i + 3] = (byte) (j10 >> 24);
        bArr[i + 4] = (byte) (j10 >> 32);
        bArr[i + 5] = (byte) (j10 >> 40);
        bArr[i + 6] = (byte) (j10 >> 48);
        bArr[i + 7] = (byte) (j10 >> 56);
    }

    public static long xorRotr(long j10, int i, long j11) {
        long j12 = j10 ^ j11;
        return (j12 << (-i)) | (j12 >>> i);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        byte[] key;
        byte[] bArr;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            bArr = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(a.h("Invalid parameter passed to Threefish init - ", cipherParameters));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            bArr = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException(b.m(new StringBuilder("Threefish key must be same size as block ("), this.blocksizeBytes, " bytes)"));
            }
            int i = this.blocksizeWords;
            jArr = new long[i];
            for (int i9 = 0; i9 < i; i9++) {
                jArr[i9] = bytesToWord(key, i9 * 8);
            }
        }
        if (bArr != null) {
            if (bArr.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{bytesToWord(bArr, 0), bytesToWord(bArr, 8)};
        }
        init(z10, jArr, jArr2);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int i10 = this.blocksizeBytes;
        if (i + i10 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i10 + i9 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.blocksizeBytes; i12 += 8) {
            this.currentBlock[i12 >> 3] = bytesToWord(bArr, i + i12);
        }
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        while (true) {
            int i13 = this.blocksizeBytes;
            if (i11 >= i13) {
                return i13;
            }
            wordToBytes(this.currentBlock[i11 >> 3], bArr2, i9 + i11);
            i11 += 8;
        }
    }

    public int processBlock(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.kw;
        int i = this.blocksizeWords;
        if (jArr3[i] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i) {
            throw new DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            this.cipher.encryptBlock(jArr, jArr2);
        } else {
            this.cipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }

    public void init(boolean z10, long[] jArr, long[] jArr2) {
        this.forEncryption = z10;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
