package org.bouncycastle.pqc.math.linearalgebra;

import C.v;
import androidx.camera.core.n;
import java.math.BigInteger;
import java.util.Random;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.util.Arrays;
import org.jmrtd.PassportService;

/* loaded from: classes3.dex */
public class GF2Polynomial {
    private int blocks;
    private int len;
    private int[] value;
    private static Random rand = new Random();
    private static final boolean[] parity = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private static final short[] squaringTable = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, PassportService.EF_DG1, PassportService.EF_DG4, PassportService.EF_DG5, PassportService.EF_DG16, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    private static final int[] bitMask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, PKIFailureInfo.badCertTemplate, PKIFailureInfo.badSenderNonce, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, PKIFailureInfo.duplicateCertReq, 1073741824, Integer.MIN_VALUE, 0};
    private static final int[] reverseRightMask = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, Integer.MAX_VALUE, -1};

    public GF2Polynomial(int i) {
        i = i < 1 ? 1 : i;
        int i9 = ((i - 1) >> 5) + 1;
        this.blocks = i9;
        this.value = new int[i9];
        this.len = i;
    }

    private void doShiftBlocksLeft(int i) {
        int i9 = this.blocks;
        int[] iArr = this.value;
        if (i9 > iArr.length) {
            int[] iArr2 = new int[i9];
            System.arraycopy(iArr, 0, iArr2, i, i9 - i);
            this.value = iArr2;
            return;
        }
        for (int i10 = i9 - 1; i10 >= i; i10--) {
            int[] iArr3 = this.value;
            iArr3[i10] = iArr3[i10 - i];
        }
        for (int i11 = 0; i11 < i; i11++) {
            this.value[i11] = 0;
        }
    }

    private GF2Polynomial karaMult(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len << 1);
        int i = this.len;
        if (i <= 32) {
            gF2Polynomial2.value = mult32(this.value[0], gF2Polynomial.value[0]);
            return gF2Polynomial2;
        }
        if (i <= 64) {
            gF2Polynomial2.value = mult64(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i <= 128) {
            gF2Polynomial2.value = mult128(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i <= 256) {
            gF2Polynomial2.value = mult256(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i <= 512) {
            gF2Polynomial2.value = mult512(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        int i9 = bitMask[IntegerFunctions.floorLog(i - 1)];
        int i10 = ((i9 - 1) >> 5) + 1;
        GF2Polynomial lower = lower(i10);
        GF2Polynomial upper = upper(i10);
        GF2Polynomial lower2 = gF2Polynomial.lower(i10);
        GF2Polynomial upper2 = gF2Polynomial.upper(i10);
        GF2Polynomial karaMult = upper.karaMult(upper2);
        GF2Polynomial karaMult2 = lower.karaMult(lower2);
        lower.addToThis(upper);
        lower2.addToThis(upper2);
        GF2Polynomial karaMult3 = lower.karaMult(lower2);
        gF2Polynomial2.shiftLeftAddThis(karaMult, i9 << 1);
        gF2Polynomial2.shiftLeftAddThis(karaMult, i9);
        gF2Polynomial2.shiftLeftAddThis(karaMult3, i9);
        gF2Polynomial2.shiftLeftAddThis(karaMult2, i9);
        gF2Polynomial2.addToThis(karaMult2);
        return gF2Polynomial2;
    }

    private GF2Polynomial lower(int i) {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(i << 5);
        System.arraycopy(this.value, 0, gF2Polynomial.value, 0, Math.min(i, this.blocks));
        return gF2Polynomial;
    }

    private static int[] mult128(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[2];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(2, iArr.length));
        int[] iArr5 = new int[2];
        if (iArr.length > 2) {
            System.arraycopy(iArr, 2, iArr5, 0, Math.min(2, iArr.length - 2));
        }
        int[] iArr6 = new int[2];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(2, iArr2.length));
        int[] iArr7 = new int[2];
        if (iArr2.length > 2) {
            System.arraycopy(iArr2, 2, iArr7, 0, Math.min(2, iArr2.length - 2));
        }
        if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i = iArr5[0];
            if (i != 0 || iArr7[0] != 0) {
                int[] mult32 = mult32(i, iArr7[0]);
                int i9 = iArr3[5];
                int i10 = mult32[1];
                iArr3[5] = i9 ^ i10;
                int i11 = iArr3[4];
                int i12 = mult32[0];
                iArr3[4] = i11 ^ i12;
                iArr3[3] = iArr3[3] ^ i10;
                iArr3[2] = i12 ^ iArr3[2];
            }
        } else {
            int[] mult64 = mult64(iArr5, iArr7);
            int i13 = iArr3[7];
            int i14 = mult64[3];
            iArr3[7] = i13 ^ i14;
            int i15 = iArr3[6];
            int i16 = mult64[2];
            iArr3[6] = i15 ^ i16;
            int i17 = iArr3[5];
            int i18 = mult64[1];
            iArr3[5] = i17 ^ (i14 ^ i18);
            int i19 = iArr3[4];
            int i20 = mult64[0];
            iArr3[4] = i19 ^ (i20 ^ i16);
            iArr3[3] = iArr3[3] ^ i18;
            iArr3[2] = i20 ^ iArr3[2];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        int i21 = iArr7[0] ^ iArr6[0];
        iArr7[0] = i21;
        int i22 = iArr7[1] ^ iArr6[1];
        iArr7[1] = i22;
        if (iArr5[1] == 0 && i22 == 0) {
            int[] mult322 = mult32(iArr5[0], i21);
            iArr3[3] = iArr3[3] ^ mult322[1];
            iArr3[2] = mult322[0] ^ iArr3[2];
        } else {
            int[] mult642 = mult64(iArr5, iArr7);
            iArr3[5] = iArr3[5] ^ mult642[3];
            iArr3[4] = iArr3[4] ^ mult642[2];
            iArr3[3] = iArr3[3] ^ mult642[1];
            iArr3[2] = mult642[0] ^ iArr3[2];
        }
        if (iArr4[1] == 0 && iArr6[1] == 0) {
            int[] mult323 = mult32(iArr4[0], iArr6[0]);
            int i23 = iArr3[3];
            int i24 = mult323[1];
            iArr3[3] = i23 ^ i24;
            int i25 = iArr3[2];
            int i26 = mult323[0];
            iArr3[2] = i25 ^ i26;
            iArr3[1] = iArr3[1] ^ i24;
            iArr3[0] = i26 ^ iArr3[0];
        } else {
            int[] mult643 = mult64(iArr4, iArr6);
            int i27 = iArr3[5];
            int i28 = mult643[3];
            iArr3[5] = i27 ^ i28;
            int i29 = iArr3[4];
            int i30 = mult643[2];
            iArr3[4] = i29 ^ i30;
            int i31 = iArr3[3];
            int i32 = mult643[1];
            iArr3[3] = i31 ^ (i28 ^ i32);
            int i33 = iArr3[2];
            int i34 = mult643[0];
            iArr3[2] = i33 ^ (i34 ^ i30);
            iArr3[1] = iArr3[1] ^ i32;
            iArr3[0] = i34 ^ iArr3[0];
        }
        return iArr3;
    }

    private static int[] mult256(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[4];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(4, iArr.length));
        int[] iArr5 = new int[4];
        if (iArr.length > 4) {
            System.arraycopy(iArr, 4, iArr5, 0, Math.min(4, iArr.length - 4));
        }
        int[] iArr6 = new int[4];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(4, iArr2.length));
        int[] iArr7 = new int[4];
        if (iArr2.length > 4) {
            System.arraycopy(iArr2, 4, iArr7, 0, Math.min(4, iArr2.length - 4));
        }
        if (iArr5[3] != 0 || iArr5[2] != 0 || iArr7[3] != 0 || iArr7[2] != 0) {
            int[] mult128 = mult128(iArr5, iArr7);
            int i = iArr3[15];
            int i9 = mult128[7];
            iArr3[15] = i ^ i9;
            int i10 = iArr3[14];
            int i11 = mult128[6];
            iArr3[14] = i10 ^ i11;
            int i12 = iArr3[13];
            int i13 = mult128[5];
            iArr3[13] = i12 ^ i13;
            int i14 = iArr3[12];
            int i15 = mult128[4];
            iArr3[12] = i14 ^ i15;
            int i16 = iArr3[11];
            int i17 = mult128[3];
            iArr3[11] = i16 ^ (i17 ^ i9);
            int i18 = iArr3[10];
            int i19 = mult128[2];
            iArr3[10] = i18 ^ (i19 ^ i11);
            int i20 = iArr3[9];
            int i21 = mult128[1];
            iArr3[9] = i20 ^ (i21 ^ i13);
            int i22 = iArr3[8];
            int i23 = mult128[0];
            iArr3[8] = i22 ^ (i23 ^ i15);
            iArr3[7] = iArr3[7] ^ i17;
            iArr3[6] = iArr3[6] ^ i19;
            iArr3[5] = iArr3[5] ^ i21;
            iArr3[4] = i23 ^ iArr3[4];
        } else if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i24 = iArr5[0];
            if (i24 != 0 || iArr7[0] != 0) {
                int[] mult32 = mult32(i24, iArr7[0]);
                int i25 = iArr3[9];
                int i26 = mult32[1];
                iArr3[9] = i25 ^ i26;
                int i27 = iArr3[8];
                int i28 = mult32[0];
                iArr3[8] = i27 ^ i28;
                iArr3[5] = iArr3[5] ^ i26;
                iArr3[4] = i28 ^ iArr3[4];
            }
        } else {
            int[] mult64 = mult64(iArr5, iArr7);
            int i29 = iArr3[11];
            int i30 = mult64[3];
            iArr3[11] = i29 ^ i30;
            int i31 = iArr3[10];
            int i32 = mult64[2];
            iArr3[10] = i31 ^ i32;
            int i33 = iArr3[9];
            int i34 = mult64[1];
            iArr3[9] = i33 ^ i34;
            int i35 = iArr3[8];
            int i36 = mult64[0];
            iArr3[8] = i35 ^ i36;
            iArr3[7] = iArr3[7] ^ i30;
            iArr3[6] = iArr3[6] ^ i32;
            iArr3[5] = iArr3[5] ^ i34;
            iArr3[4] = i36 ^ iArr3[4];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[3] = iArr5[3] ^ iArr4[3];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[3] = iArr7[3] ^ iArr6[3];
        int[] mult1282 = mult128(iArr5, iArr7);
        iArr3[11] = iArr3[11] ^ mult1282[7];
        iArr3[10] = iArr3[10] ^ mult1282[6];
        iArr3[9] = iArr3[9] ^ mult1282[5];
        iArr3[8] = iArr3[8] ^ mult1282[4];
        iArr3[7] = iArr3[7] ^ mult1282[3];
        iArr3[6] = iArr3[6] ^ mult1282[2];
        iArr3[5] = iArr3[5] ^ mult1282[1];
        iArr3[4] = mult1282[0] ^ iArr3[4];
        int[] mult1283 = mult128(iArr4, iArr6);
        int i37 = iArr3[11];
        int i38 = mult1283[7];
        iArr3[11] = i37 ^ i38;
        int i39 = iArr3[10];
        int i40 = mult1283[6];
        iArr3[10] = i39 ^ i40;
        int i41 = iArr3[9];
        int i42 = mult1283[5];
        iArr3[9] = i41 ^ i42;
        int i43 = iArr3[8];
        int i44 = mult1283[4];
        iArr3[8] = i43 ^ i44;
        int i45 = iArr3[7];
        int i46 = mult1283[3];
        iArr3[7] = i45 ^ (i38 ^ i46);
        int i47 = iArr3[6];
        int i48 = mult1283[2];
        iArr3[6] = i47 ^ (i40 ^ i48);
        int i49 = iArr3[5];
        int i50 = mult1283[1];
        iArr3[5] = i49 ^ (i42 ^ i50);
        int i51 = iArr3[4];
        int i52 = mult1283[0];
        iArr3[4] = i51 ^ (i52 ^ i44);
        iArr3[3] = iArr3[3] ^ i46;
        iArr3[2] = iArr3[2] ^ i48;
        iArr3[1] = iArr3[1] ^ i50;
        iArr3[0] = i52 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult32(int i, int i9) {
        int[] iArr = new int[2];
        if (i != 0 && i9 != 0) {
            long j10 = i9 & BodyPartID.bodyIdMax;
            long j11 = 0;
            for (int i10 = 1; i10 <= 32; i10++) {
                if ((bitMask[i10 - 1] & i) != 0) {
                    j11 ^= j10;
                }
                j10 <<= 1;
            }
            iArr[1] = (int) (j11 >>> 32);
            iArr[0] = (int) (j11 & BodyPartID.bodyIdMax);
        }
        return iArr;
    }

    private static int[] mult512(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[32];
        int[] iArr4 = new int[8];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(8, iArr.length));
        int[] iArr5 = new int[8];
        if (iArr.length > 8) {
            System.arraycopy(iArr, 8, iArr5, 0, Math.min(8, iArr.length - 8));
        }
        int[] iArr6 = new int[8];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(8, iArr2.length));
        int[] iArr7 = new int[8];
        if (iArr2.length > 8) {
            System.arraycopy(iArr2, 8, iArr7, 0, Math.min(8, iArr2.length - 8));
        }
        int[] mult256 = mult256(iArr5, iArr7);
        int i = iArr3[31];
        int i9 = mult256[15];
        iArr3[31] = i ^ i9;
        int i10 = iArr3[30];
        int i11 = mult256[14];
        iArr3[30] = i10 ^ i11;
        int i12 = iArr3[29];
        int i13 = mult256[13];
        iArr3[29] = i12 ^ i13;
        int i14 = iArr3[28];
        int i15 = mult256[12];
        iArr3[28] = i14 ^ i15;
        int i16 = iArr3[27];
        int i17 = mult256[11];
        iArr3[27] = i16 ^ i17;
        int i18 = iArr3[26];
        int i19 = mult256[10];
        iArr3[26] = i18 ^ i19;
        int i20 = iArr3[25];
        int i21 = mult256[9];
        iArr3[25] = i20 ^ i21;
        int i22 = iArr3[24];
        int i23 = mult256[8];
        iArr3[24] = i22 ^ i23;
        int i24 = iArr3[23];
        int i25 = mult256[7];
        iArr3[23] = i24 ^ (i25 ^ i9);
        int i26 = iArr3[22];
        int i27 = mult256[6];
        iArr3[22] = i26 ^ (i27 ^ i11);
        int i28 = iArr3[21];
        int i29 = mult256[5];
        iArr3[21] = i28 ^ (i29 ^ i13);
        int i30 = iArr3[20];
        int i31 = mult256[4];
        iArr3[20] = i30 ^ (i31 ^ i15);
        int i32 = iArr3[19];
        int i33 = mult256[3];
        iArr3[19] = i32 ^ (i33 ^ i17);
        int i34 = iArr3[18];
        int i35 = mult256[2];
        iArr3[18] = i34 ^ (i35 ^ i19);
        int i36 = iArr3[17];
        int i37 = mult256[1];
        iArr3[17] = i36 ^ (i37 ^ i21);
        int i38 = iArr3[16];
        int i39 = mult256[0];
        iArr3[16] = i38 ^ (i39 ^ i23);
        iArr3[15] = iArr3[15] ^ i25;
        iArr3[14] = iArr3[14] ^ i27;
        iArr3[13] = iArr3[13] ^ i29;
        iArr3[12] = iArr3[12] ^ i31;
        iArr3[11] = iArr3[11] ^ i33;
        iArr3[10] = iArr3[10] ^ i35;
        iArr3[9] = iArr3[9] ^ i37;
        iArr3[8] = iArr3[8] ^ i39;
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[3] = iArr5[3] ^ iArr4[3];
        iArr5[4] = iArr5[4] ^ iArr4[4];
        iArr5[5] = iArr5[5] ^ iArr4[5];
        iArr5[6] = iArr5[6] ^ iArr4[6];
        iArr5[7] = iArr5[7] ^ iArr4[7];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[3] = iArr7[3] ^ iArr6[3];
        iArr7[4] = iArr7[4] ^ iArr6[4];
        iArr7[5] = iArr7[5] ^ iArr6[5];
        iArr7[6] = iArr7[6] ^ iArr6[6];
        iArr7[7] = iArr7[7] ^ iArr6[7];
        int[] mult2562 = mult256(iArr5, iArr7);
        iArr3[23] = iArr3[23] ^ mult2562[15];
        iArr3[22] = iArr3[22] ^ mult2562[14];
        iArr3[21] = iArr3[21] ^ mult2562[13];
        iArr3[20] = iArr3[20] ^ mult2562[12];
        iArr3[19] = iArr3[19] ^ mult2562[11];
        iArr3[18] = iArr3[18] ^ mult2562[10];
        iArr3[17] = iArr3[17] ^ mult2562[9];
        iArr3[16] = iArr3[16] ^ mult2562[8];
        iArr3[15] = iArr3[15] ^ mult2562[7];
        iArr3[14] = iArr3[14] ^ mult2562[6];
        iArr3[13] = iArr3[13] ^ mult2562[5];
        iArr3[12] = iArr3[12] ^ mult2562[4];
        iArr3[11] = iArr3[11] ^ mult2562[3];
        iArr3[10] = iArr3[10] ^ mult2562[2];
        iArr3[9] = iArr3[9] ^ mult2562[1];
        iArr3[8] = mult2562[0] ^ iArr3[8];
        int[] mult2563 = mult256(iArr4, iArr6);
        int i40 = iArr3[23];
        int i41 = mult2563[15];
        iArr3[23] = i40 ^ i41;
        int i42 = iArr3[22];
        int i43 = mult2563[14];
        iArr3[22] = i42 ^ i43;
        int i44 = iArr3[21];
        int i45 = mult2563[13];
        iArr3[21] = i44 ^ i45;
        int i46 = iArr3[20];
        int i47 = mult2563[12];
        iArr3[20] = i46 ^ i47;
        int i48 = iArr3[19];
        int i49 = mult2563[11];
        iArr3[19] = i48 ^ i49;
        int i50 = iArr3[18];
        int i51 = mult2563[10];
        iArr3[18] = i50 ^ i51;
        int i52 = iArr3[17];
        int i53 = mult2563[9];
        iArr3[17] = i52 ^ i53;
        int i54 = iArr3[16];
        int i55 = mult2563[8];
        iArr3[16] = i54 ^ i55;
        int i56 = iArr3[15];
        int i57 = mult2563[7];
        iArr3[15] = i56 ^ (i41 ^ i57);
        int i58 = iArr3[14];
        int i59 = mult2563[6];
        iArr3[14] = i58 ^ (i43 ^ i59);
        int i60 = iArr3[13];
        int i61 = mult2563[5];
        iArr3[13] = i60 ^ (i45 ^ i61);
        int i62 = iArr3[12];
        int i63 = mult2563[4];
        iArr3[12] = i62 ^ (i47 ^ i63);
        int i64 = iArr3[11];
        int i65 = mult2563[3];
        iArr3[11] = i64 ^ (i49 ^ i65);
        int i66 = iArr3[10];
        int i67 = mult2563[2];
        iArr3[10] = i66 ^ (i67 ^ i51);
        int i68 = iArr3[9];
        int i69 = mult2563[1];
        iArr3[9] = i68 ^ (i69 ^ i53);
        int i70 = iArr3[8];
        int i71 = mult2563[0];
        iArr3[8] = i70 ^ (i71 ^ i55);
        iArr3[7] = iArr3[7] ^ i57;
        iArr3[6] = iArr3[6] ^ i59;
        iArr3[5] = iArr3[5] ^ i61;
        iArr3[4] = iArr3[4] ^ i63;
        iArr3[3] = iArr3[3] ^ i65;
        iArr3[2] = iArr3[2] ^ i67;
        iArr3[1] = iArr3[1] ^ i69;
        iArr3[0] = i71 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult64(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[4];
        int i = iArr[0];
        int i9 = iArr.length > 1 ? iArr[1] : 0;
        int i10 = iArr2[0];
        int i11 = iArr2.length > 1 ? iArr2[1] : 0;
        if (i9 != 0 || i11 != 0) {
            int[] mult32 = mult32(i9, i11);
            int i12 = iArr3[3];
            int i13 = mult32[1];
            iArr3[3] = i12 ^ i13;
            int i14 = iArr3[2];
            int i15 = mult32[0];
            iArr3[2] = i14 ^ (i15 ^ i13);
            iArr3[1] = i15 ^ iArr3[1];
        }
        int[] mult322 = mult32(i9 ^ i, i11 ^ i10);
        iArr3[2] = iArr3[2] ^ mult322[1];
        iArr3[1] = mult322[0] ^ iArr3[1];
        int[] mult323 = mult32(i, i10);
        int i16 = iArr3[2];
        int i17 = mult323[1];
        iArr3[2] = i16 ^ i17;
        int i18 = iArr3[1];
        int i19 = mult323[0];
        iArr3[1] = i18 ^ (i17 ^ i19);
        iArr3[0] = i19 ^ iArr3[0];
        return iArr3;
    }

    private GF2Polynomial upper(int i) {
        int min = Math.min(i, this.blocks - i);
        GF2Polynomial gF2Polynomial = new GF2Polynomial(min << 5);
        if (this.blocks >= i) {
            System.arraycopy(this.value, i, gF2Polynomial.value, 0, min);
        }
        return gF2Polynomial;
    }

    private void zeroUnusedBits() {
        int i = this.len;
        if ((i & 31) != 0) {
            int[] iArr = this.value;
            int i9 = this.blocks - 1;
            iArr[i9] = reverseRightMask[i & 31] & iArr[i9];
        }
    }

    public GF2Polynomial add(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void addToThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.len);
        xorThisBy(gF2Polynomial);
    }

    public void assignAll() {
        for (int i = 0; i < this.blocks; i++) {
            this.value[i] = -1;
        }
        zeroUnusedBits();
    }

    public void assignOne() {
        for (int i = 1; i < this.blocks; i++) {
            this.value[i] = 0;
        }
        this.value[0] = 1;
    }

    public void assignX() {
        for (int i = 1; i < this.blocks; i++) {
            this.value[i] = 0;
        }
        this.value[0] = 2;
    }

    public void assignZero() {
        for (int i = 0; i < this.blocks; i++) {
            this.value[i] = 0;
        }
    }

    public Object clone() {
        return new GF2Polynomial(this);
    }

    public GF2Polynomial[] divide(GF2Polynomial gF2Polynomial) {
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[2];
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i = gF2Polynomial3.len;
        int i9 = gF2Polynomial4.len;
        if (i < i9) {
            gF2PolynomialArr[0] = new GF2Polynomial(0);
            gF2PolynomialArr[1] = gF2Polynomial3;
            return gF2PolynomialArr;
        }
        int i10 = i - i9;
        gF2Polynomial2.expandN(i10 + 1);
        while (i10 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i10));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i10);
            i10 = gF2Polynomial3.len - gF2Polynomial4.len;
        }
        gF2PolynomialArr[0] = gF2Polynomial2;
        gF2PolynomialArr[1] = gF2Polynomial3;
        return gF2PolynomialArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2Polynomial)) {
            return false;
        }
        GF2Polynomial gF2Polynomial = (GF2Polynomial) obj;
        if (this.len != gF2Polynomial.len) {
            return false;
        }
        for (int i = 0; i < this.blocks; i++) {
            if (this.value[i] != gF2Polynomial.value[i]) {
                return false;
            }
        }
        return true;
    }

    public void expandN(int i) {
        if (this.len >= i) {
            return;
        }
        this.len = i;
        int i9 = ((i - 1) >>> 5) + 1;
        int i10 = this.blocks;
        if (i10 >= i9) {
            return;
        }
        int[] iArr = this.value;
        if (iArr.length >= i9) {
            while (i10 < i9) {
                this.value[i10] = 0;
                i10++;
            }
            this.blocks = i9;
            return;
        }
        int[] iArr2 = new int[i9];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        this.blocks = i9;
        this.value = iArr2;
    }

    public GF2Polynomial gcd(GF2Polynomial gF2Polynomial) {
        if (isZero() && gF2Polynomial.isZero()) {
            throw new ArithmeticException("Both operands of gcd equal zero.");
        }
        if (isZero()) {
            return new GF2Polynomial(gF2Polynomial);
        }
        if (gF2Polynomial.isZero()) {
            return new GF2Polynomial(this);
        }
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
        GF2Polynomial gF2Polynomial5 = gF2Polynomial3;
        while (!gF2Polynomial5.isZero()) {
            GF2Polynomial gF2Polynomial6 = gF2Polynomial5;
            gF2Polynomial5 = gF2Polynomial4.remainder(gF2Polynomial5);
            gF2Polynomial4 = gF2Polynomial6;
        }
        return gF2Polynomial4;
    }

    public int getBit(int i) {
        if (i < 0) {
            throw new RuntimeException();
        }
        if (i > this.len - 1) {
            return 0;
        }
        return (bitMask[i & 31] & this.value[i >>> 5]) != 0 ? 1 : 0;
    }

    public int getLength() {
        return this.len;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value) + this.len;
    }

    public GF2Polynomial increase() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.increaseThis();
        return gF2Polynomial;
    }

    public void increaseThis() {
        xorBit(0);
    }

    public boolean isIrreducible() {
        if (isZero()) {
            return false;
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.reduceN();
        int i = gF2Polynomial.len;
        int i9 = i - 1;
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(i, "X");
        for (int i10 = 1; i10 <= (i9 >> 1); i10++) {
            gF2Polynomial2.squareThisPreCalc();
            gF2Polynomial2 = gF2Polynomial2.remainder(gF2Polynomial);
            GF2Polynomial add = gF2Polynomial2.add(new GF2Polynomial(32, "X"));
            if (add.isZero() || !gF2Polynomial.gcd(add).isOne()) {
                return false;
            }
        }
        return true;
    }

    public boolean isOne() {
        for (int i = 1; i < this.blocks; i++) {
            if (this.value[i] != 0) {
                return false;
            }
        }
        return this.value[0] == 1;
    }

    public boolean isZero() {
        if (this.len == 0) {
            return true;
        }
        for (int i = 0; i < this.blocks; i++) {
            if (this.value[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public GF2Polynomial multiply(GF2Polynomial gF2Polynomial) {
        int max = Math.max(this.len, gF2Polynomial.len);
        expandN(max);
        gF2Polynomial.expandN(max);
        return karaMult(gF2Polynomial);
    }

    public GF2Polynomial multiplyClassic(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(Math.max(this.len, gF2Polynomial.len) << 1);
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[32];
        gF2PolynomialArr[0] = new GF2Polynomial(this);
        for (int i = 1; i <= 31; i++) {
            gF2PolynomialArr[i] = gF2PolynomialArr[i - 1].shiftLeft();
        }
        for (int i9 = 0; i9 < gF2Polynomial.blocks; i9++) {
            for (int i10 = 0; i10 <= 31; i10++) {
                if ((gF2Polynomial.value[i9] & bitMask[i10]) != 0) {
                    gF2Polynomial2.xorThisBy(gF2PolynomialArr[i10]);
                }
            }
            for (int i11 = 0; i11 <= 31; i11++) {
                gF2PolynomialArr[i11].shiftBlocksLeft();
            }
        }
        return gF2Polynomial2;
    }

    public GF2Polynomial quotient(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i = gF2Polynomial3.len;
        int i9 = gF2Polynomial4.len;
        if (i < i9) {
            return new GF2Polynomial(0);
        }
        int i10 = i - i9;
        gF2Polynomial2.expandN(i10 + 1);
        while (i10 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i10));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i10);
            i10 = gF2Polynomial3.len - gF2Polynomial4.len;
        }
        return gF2Polynomial2;
    }

    public void randomize() {
        for (int i = 0; i < this.blocks; i++) {
            this.value[i] = rand.nextInt();
        }
        zeroUnusedBits();
    }

    public void reduceN() {
        int i;
        int i9 = this.blocks;
        do {
            i9--;
            i = this.value[i9];
            if (i != 0) {
                break;
            }
        } while (i9 > 0);
        int i10 = 0;
        while (i != 0) {
            i >>>= 1;
            i10++;
        }
        this.len = (i9 << 5) + i10;
        this.blocks = i9 + 1;
    }

    public void reducePentanomial(int i, int[] iArr) {
        GF2Polynomial gF2Polynomial = this;
        int i9 = i >>> 5;
        int i10 = i & 31;
        int i11 = 32 - i10;
        boolean z10 = false;
        int i12 = iArr[0];
        int i13 = (i - i12) >>> 5;
        int i14 = 32 - ((i - i12) & 31);
        int i15 = iArr[1];
        int i16 = (i - i15) >>> 5;
        int i17 = 32 - ((i - i15) & 31);
        int i18 = iArr[2];
        int i19 = (i - i18) >>> 5;
        int i20 = 32 - ((i - i18) & 31);
        int i21 = ((i << 1) - 2) >>> 5;
        while (i21 > i9) {
            int[] iArr2 = gF2Polynomial.value;
            long j10 = iArr2[i21] & BodyPartID.bodyIdMax;
            int i22 = i21 - i9;
            int i23 = i22 - 1;
            int i24 = i9;
            int i25 = i10;
            iArr2[i23] = ((int) (j10 << i11)) ^ iArr2[i23];
            iArr2[i22] = (int) (iArr2[i22] ^ (j10 >>> (32 - i11)));
            int i26 = i21 - i13;
            int i27 = i26 - 1;
            iArr2[i27] = iArr2[i27] ^ ((int) (j10 << i14));
            iArr2[i26] = (int) (iArr2[i26] ^ (j10 >>> (32 - i14)));
            int i28 = i21 - i16;
            int i29 = i28 - 1;
            iArr2[i29] = iArr2[i29] ^ ((int) (j10 << i17));
            iArr2[i28] = (int) (iArr2[i28] ^ (j10 >>> (32 - i17)));
            int i30 = i21 - i19;
            int i31 = i30 - 1;
            iArr2[i31] = iArr2[i31] ^ ((int) (j10 << i20));
            iArr2[i30] = (int) ((j10 >>> (32 - i20)) ^ iArr2[i30]);
            iArr2[i21] = 0;
            i21--;
            z10 = false;
            i9 = i24;
            i10 = i25;
            gF2Polynomial = this;
        }
        int i32 = i9;
        int i33 = i10;
        int[] iArr3 = gF2Polynomial.value;
        long j11 = iArr3[i32] & BodyPartID.bodyIdMax & (BodyPartID.bodyIdMax << i33);
        iArr3[0] = (int) ((j11 >>> (32 - i11)) ^ iArr3[0]);
        int i34 = i32 - i13;
        int i35 = i34 - 1;
        if (i35 >= 0) {
            iArr3[i35] = iArr3[i35] ^ ((int) (j11 << i14));
        }
        iArr3[i34] = (int) (iArr3[i34] ^ (j11 >>> (32 - i14)));
        int i36 = i32 - i16;
        int i37 = i36 - 1;
        if (i37 >= 0) {
            iArr3[i37] = iArr3[i37] ^ ((int) (j11 << i17));
        }
        iArr3[i36] = (int) (iArr3[i36] ^ (j11 >>> (32 - i17)));
        int i38 = i32 - i19;
        int i39 = i38 - 1;
        if (i39 >= 0) {
            iArr3[i39] = iArr3[i39] ^ ((int) (j11 << i20));
        }
        iArr3[i38] = (int) ((j11 >>> (32 - i20)) ^ iArr3[i38]);
        iArr3[i32] = iArr3[i32] & reverseRightMask[i33];
        this.blocks = ((i - 1) >>> 5) + 1;
        this.len = i;
    }

    public void reduceTrinomial(int i, int i9) {
        int i10 = i >>> 5;
        int i11 = i & 31;
        int i12 = 32 - i11;
        int i13 = i - i9;
        int i14 = i13 >>> 5;
        int i15 = 32 - (i13 & 31);
        int i16 = ((i << 1) - 2) >>> 5;
        while (i16 > i10) {
            int[] iArr = this.value;
            long j10 = BodyPartID.bodyIdMax & iArr[i16];
            int i17 = i16 - i10;
            int i18 = i17 - 1;
            int i19 = i10;
            iArr[i18] = ((int) (j10 << i12)) ^ iArr[i18];
            iArr[i17] = (int) (iArr[i17] ^ (j10 >>> (32 - i12)));
            int i20 = i16 - i14;
            int i21 = i20 - 1;
            iArr[i21] = iArr[i21] ^ ((int) (j10 << i15));
            iArr[i20] = (int) ((j10 >>> (32 - i15)) ^ iArr[i20]);
            iArr[i16] = 0;
            i16--;
            i10 = i19;
        }
        int i22 = i10;
        int[] iArr2 = this.value;
        long j11 = (BodyPartID.bodyIdMax << i11) & iArr2[i22] & BodyPartID.bodyIdMax;
        iArr2[0] = (int) (iArr2[0] ^ (j11 >>> (32 - i12)));
        int i23 = i22 - i14;
        int i24 = i23 - 1;
        if (i24 >= 0) {
            iArr2[i24] = iArr2[i24] ^ ((int) (j11 << i15));
        }
        iArr2[i23] = (int) ((j11 >>> (32 - i15)) ^ iArr2[i23]);
        iArr2[i22] = iArr2[i22] & reverseRightMask[i11];
        this.blocks = ((i - 1) >>> 5) + 1;
        this.len = i;
    }

    public GF2Polynomial remainder(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial3.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial2.reduceN();
        gF2Polynomial3.reduceN();
        int i = gF2Polynomial2.len;
        int i9 = gF2Polynomial3.len;
        if (i < i9) {
            return gF2Polynomial2;
        }
        while (true) {
            int i10 = i - i9;
            if (i10 < 0) {
                return gF2Polynomial2;
            }
            gF2Polynomial2.subtractFromThis(gF2Polynomial3.shiftLeft(i10));
            gF2Polynomial2.reduceN();
            i = gF2Polynomial2.len;
            i9 = gF2Polynomial3.len;
        }
    }

    public void resetBit(int i) {
        if (i < 0) {
            throw new RuntimeException();
        }
        if (i > this.len - 1) {
            return;
        }
        int[] iArr = this.value;
        int i9 = i >>> 5;
        iArr[i9] = (~bitMask[i & 31]) & iArr[i9];
    }

    public void setBit(int i) {
        if (i < 0 || i > this.len - 1) {
            throw new RuntimeException();
        }
        int[] iArr = this.value;
        int i9 = i >>> 5;
        iArr[i9] = bitMask[i & 31] | iArr[i9];
    }

    public void shiftBlocksLeft() {
        int i = this.blocks;
        int i9 = i + 1;
        this.blocks = i9;
        this.len += 32;
        int[] iArr = this.value;
        if (i9 > iArr.length) {
            int[] iArr2 = new int[i9];
            System.arraycopy(iArr, 0, iArr2, 1, i);
            this.value = iArr2;
        } else {
            while (i >= 1) {
                int[] iArr3 = this.value;
                iArr3[i] = iArr3[i - 1];
                i--;
            }
            this.value[0] = 0;
        }
    }

    public GF2Polynomial shiftLeft() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len + 1, this.value);
        for (int i = gF2Polynomial.blocks - 1; i >= 1; i--) {
            int[] iArr = gF2Polynomial.value;
            int i9 = iArr[i] << 1;
            iArr[i] = i9;
            iArr[i] = i9 | (iArr[i - 1] >>> 31);
        }
        int[] iArr2 = gF2Polynomial.value;
        iArr2[0] = iArr2[0] << 1;
        return gF2Polynomial;
    }

    public void shiftLeftAddThis(GF2Polynomial gF2Polynomial, int i) {
        int i9;
        if (i == 0) {
            addToThis(gF2Polynomial);
            return;
        }
        expandN(gF2Polynomial.len + i);
        int i10 = i >>> 5;
        for (int i11 = gF2Polynomial.blocks - 1; i11 >= 0; i11--) {
            int i12 = i11 + i10;
            int i13 = i12 + 1;
            if (i13 < this.blocks && (i9 = i & 31) != 0) {
                int[] iArr = this.value;
                iArr[i13] = (gF2Polynomial.value[i11] >>> (32 - i9)) ^ iArr[i13];
            }
            int[] iArr2 = this.value;
            iArr2[i12] = iArr2[i12] ^ (gF2Polynomial.value[i11] << (i & 31));
        }
    }

    public void shiftLeftThis() {
        int i = this.len;
        int i9 = i & 31;
        this.len = i + 1;
        int i10 = this.blocks;
        if (i9 != 0) {
            for (int i11 = i10 - 1; i11 >= 1; i11--) {
                int[] iArr = this.value;
                int i12 = iArr[i11] << 1;
                iArr[i11] = i12;
                iArr[i11] = i12 | (iArr[i11 - 1] >>> 31);
            }
            int[] iArr2 = this.value;
            iArr2[0] = iArr2[0] << 1;
            return;
        }
        int i13 = i10 + 1;
        this.blocks = i13;
        int[] iArr3 = this.value;
        if (i13 > iArr3.length) {
            int[] iArr4 = new int[i13];
            System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            this.value = iArr4;
        }
        for (int i14 = this.blocks - 1; i14 >= 1; i14--) {
            int[] iArr5 = this.value;
            int i15 = i14 - 1;
            iArr5[i14] = iArr5[i14] | (iArr5[i15] >>> 31);
            iArr5[i15] = iArr5[i15] << 1;
        }
    }

    public GF2Polynomial shiftRight() {
        int i;
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len - 1);
        int i9 = 0;
        System.arraycopy(this.value, 0, gF2Polynomial.value, 0, gF2Polynomial.blocks);
        while (true) {
            i = gF2Polynomial.blocks;
            if (i9 > i - 2) {
                break;
            }
            int[] iArr = gF2Polynomial.value;
            int i10 = iArr[i9] >>> 1;
            iArr[i9] = i10;
            int i11 = i9 + 1;
            iArr[i9] = i10 | (iArr[i11] << 31);
            i9 = i11;
        }
        int[] iArr2 = gF2Polynomial.value;
        int i12 = i - 1;
        iArr2[i12] = iArr2[i12] >>> 1;
        if (i < this.blocks) {
            int i13 = i - 1;
            iArr2[i13] = (this.value[i] << 31) | iArr2[i13];
        }
        return gF2Polynomial;
    }

    public void shiftRightThis() {
        int i;
        int i9 = this.len;
        this.len = i9 - 1;
        this.blocks = ((i9 - 2) >>> 5) + 1;
        int i10 = 0;
        while (true) {
            i = this.blocks;
            if (i10 > i - 2) {
                break;
            }
            int[] iArr = this.value;
            int i11 = iArr[i10] >>> 1;
            iArr[i10] = i11;
            int i12 = i10 + 1;
            iArr[i10] = i11 | (iArr[i12] << 31);
            i10 = i12;
        }
        int[] iArr2 = this.value;
        int i13 = i - 1;
        iArr2[i13] = iArr2[i13] >>> 1;
        if ((this.len & 31) == 0) {
            int i14 = i - 1;
            iArr2[i14] = (iArr2[i] << 31) | iArr2[i14];
        }
    }

    public void squareThisBitwise() {
        if (isZero()) {
            return;
        }
        int i = this.blocks;
        int i9 = i << 1;
        int[] iArr = new int[i9];
        for (int i10 = i - 1; i10 >= 0; i10--) {
            int i11 = this.value[i10];
            int i12 = 1;
            for (int i13 = 0; i13 < 16; i13++) {
                if ((i11 & 1) != 0) {
                    int i14 = i10 << 1;
                    iArr[i14] = iArr[i14] | i12;
                }
                if ((65536 & i11) != 0) {
                    int i15 = (i10 << 1) + 1;
                    iArr[i15] = iArr[i15] | i12;
                }
                i12 <<= 2;
                i11 >>>= 1;
            }
        }
        this.value = iArr;
        this.blocks = i9;
        this.len = (this.len << 1) - 1;
    }

    public void squareThisPreCalc() {
        int i;
        int i9;
        if (isZero()) {
            return;
        }
        int length = this.value.length;
        int i10 = this.blocks;
        if (length >= (i10 << 1)) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                int[] iArr = this.value;
                int i12 = i11 << 1;
                short[] sArr = squaringTable;
                int i13 = iArr[i11];
                iArr[i12 + 1] = (sArr[(i13 & (-16777216)) >>> 24] << 16) | sArr[(i13 & 16711680) >>> 16];
                int i14 = iArr[i11];
                iArr[i12] = (sArr[(i14 & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >>> 8] << 16) | sArr[i14 & 255];
            }
            i9 = this.blocks << 1;
        } else {
            int[] iArr2 = new int[i10 << 1];
            int i15 = 0;
            while (true) {
                i = this.blocks;
                if (i15 >= i) {
                    break;
                }
                int i16 = i15 << 1;
                short[] sArr2 = squaringTable;
                int[] iArr3 = this.value;
                int i17 = iArr3[i15];
                iArr2[i16] = (sArr2[(i17 & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >>> 8] << 16) | sArr2[i17 & 255];
                int i18 = iArr3[i15];
                iArr2[i16 + 1] = (sArr2[(i18 & (-16777216)) >>> 24] << 16) | sArr2[(i18 & 16711680) >>> 16];
                i15++;
            }
            this.value = iArr2;
            i9 = i << 1;
        }
        this.blocks = i9;
        this.len = (this.len << 1) - 1;
    }

    public GF2Polynomial subtract(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void subtractFromThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.len);
        xorThisBy(gF2Polynomial);
    }

    public boolean testBit(int i) {
        if (i < 0) {
            throw new RuntimeException();
        }
        if (i > this.len - 1) {
            return false;
        }
        return (bitMask[i & 31] & this.value[i >>> 5]) != 0;
    }

    public byte[] toByteArray() {
        int i = ((this.len - 1) >> 3) + 1;
        int i9 = i & 3;
        byte[] bArr = new byte[i];
        for (int i10 = 0; i10 < (i >> 2); i10++) {
            int i11 = i - (i10 << 2);
            int i12 = this.value[i10];
            bArr[i11 - 1] = (byte) (i12 & 255);
            bArr[i11 - 2] = (byte) ((65280 & i12) >>> 8);
            bArr[i11 - 3] = (byte) ((16711680 & i12) >>> 16);
            bArr[i11 - 4] = (byte) (((-16777216) & i12) >>> 24);
        }
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = ((i9 - i13) - 1) << 3;
            bArr[i13] = (byte) ((this.value[this.blocks - 1] & (255 << i14)) >>> i14);
        }
        return bArr;
    }

    public BigInteger toFlexiBigInt() {
        return (this.len == 0 || isZero()) ? new BigInteger(0, new byte[0]) : new BigInteger(1, toByteArray());
    }

    public int[] toIntegerArray() {
        int i = this.blocks;
        int[] iArr = new int[i];
        System.arraycopy(this.value, 0, iArr, 0, i);
        return iArr;
    }

    public String toString(int i) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String[] strArr = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        String str = new String();
        if (i == 16) {
            for (int i9 = this.blocks - 1; i9 >= 0; i9--) {
                StringBuilder s10 = v.s(str);
                s10.append(cArr[(this.value[i9] >>> 28) & 15]);
                StringBuilder s11 = v.s(s10.toString());
                s11.append(cArr[(this.value[i9] >>> 24) & 15]);
                StringBuilder s12 = v.s(s11.toString());
                s12.append(cArr[(this.value[i9] >>> 20) & 15]);
                StringBuilder s13 = v.s(s12.toString());
                s13.append(cArr[(this.value[i9] >>> 16) & 15]);
                StringBuilder s14 = v.s(s13.toString());
                s14.append(cArr[(this.value[i9] >>> 12) & 15]);
                StringBuilder s15 = v.s(s14.toString());
                s15.append(cArr[(this.value[i9] >>> 8) & 15]);
                StringBuilder s16 = v.s(s15.toString());
                s16.append(cArr[(this.value[i9] >>> 4) & 15]);
                StringBuilder s17 = v.s(s16.toString());
                s17.append(cArr[this.value[i9] & 15]);
                str = v.n(s17.toString(), " ");
            }
        } else {
            for (int i10 = this.blocks - 1; i10 >= 0; i10--) {
                StringBuilder s18 = v.s(str);
                s18.append(strArr[(this.value[i10] >>> 28) & 15]);
                StringBuilder s19 = v.s(s18.toString());
                s19.append(strArr[(this.value[i10] >>> 24) & 15]);
                StringBuilder s20 = v.s(s19.toString());
                s20.append(strArr[(this.value[i10] >>> 20) & 15]);
                StringBuilder s21 = v.s(s20.toString());
                s21.append(strArr[(this.value[i10] >>> 16) & 15]);
                StringBuilder s22 = v.s(s21.toString());
                s22.append(strArr[(this.value[i10] >>> 12) & 15]);
                StringBuilder s23 = v.s(s22.toString());
                s23.append(strArr[(this.value[i10] >>> 8) & 15]);
                StringBuilder s24 = v.s(s23.toString());
                s24.append(strArr[(this.value[i10] >>> 4) & 15]);
                StringBuilder s25 = v.s(s24.toString());
                s25.append(strArr[this.value[i10] & 15]);
                str = v.n(s25.toString(), " ");
            }
        }
        return str;
    }

    public boolean vectorMult(GF2Polynomial gF2Polynomial) {
        if (this.len != gF2Polynomial.len) {
            throw new RuntimeException();
        }
        boolean z10 = false;
        for (int i = 0; i < this.blocks; i++) {
            int i9 = this.value[i] & gF2Polynomial.value[i];
            boolean[] zArr = parity;
            z10 = (((z10 ^ zArr[i9 & 255]) ^ zArr[(i9 >>> 8) & 255]) ^ zArr[(i9 >>> 16) & 255]) ^ zArr[(i9 >>> 24) & 255];
        }
        return z10;
    }

    public GF2Polynomial xor(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2;
        int min = Math.min(this.blocks, gF2Polynomial.blocks);
        int i = 0;
        if (this.len >= gF2Polynomial.len) {
            gF2Polynomial2 = new GF2Polynomial(this);
            while (i < min) {
                int[] iArr = gF2Polynomial2.value;
                iArr[i] = iArr[i] ^ gF2Polynomial.value[i];
                i++;
            }
        } else {
            gF2Polynomial2 = new GF2Polynomial(gF2Polynomial);
            while (i < min) {
                int[] iArr2 = gF2Polynomial2.value;
                iArr2[i] = iArr2[i] ^ this.value[i];
                i++;
            }
        }
        gF2Polynomial2.zeroUnusedBits();
        return gF2Polynomial2;
    }

    public void xorBit(int i) {
        if (i < 0 || i > this.len - 1) {
            throw new RuntimeException();
        }
        int[] iArr = this.value;
        int i9 = i >>> 5;
        iArr[i9] = bitMask[i & 31] ^ iArr[i9];
    }

    public void xorThisBy(GF2Polynomial gF2Polynomial) {
        for (int i = 0; i < Math.min(this.blocks, gF2Polynomial.blocks); i++) {
            int[] iArr = this.value;
            iArr[i] = iArr[i] ^ gF2Polynomial.value[i];
        }
        zeroUnusedBits();
    }

    public GF2Polynomial(int i, String str) {
        i = i < 1 ? 1 : i;
        int i9 = ((i - 1) >> 5) + 1;
        this.blocks = i9;
        this.value = new int[i9];
        this.len = i;
        if (str.equalsIgnoreCase("ZERO")) {
            assignZero();
            return;
        }
        if (str.equalsIgnoreCase("ONE")) {
            assignOne();
            return;
        }
        if (str.equalsIgnoreCase("RANDOM")) {
            randomize();
        } else if (str.equalsIgnoreCase("X")) {
            assignX();
        } else {
            if (!str.equalsIgnoreCase("ALL")) {
                throw new IllegalArgumentException(n.a("Error: GF2Polynomial was called using ", str, " as value!"));
            }
            assignAll();
        }
    }

    public void randomize(Random random) {
        for (int i = 0; i < this.blocks; i++) {
            this.value[i] = random.nextInt();
        }
        zeroUnusedBits();
    }

    public GF2Polynomial shiftLeft(int i) {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len + i, this.value);
        if (i >= 32) {
            gF2Polynomial.doShiftBlocksLeft(i >>> 5);
        }
        int i9 = i & 31;
        if (i9 != 0) {
            for (int i10 = gF2Polynomial.blocks - 1; i10 >= 1; i10--) {
                int[] iArr = gF2Polynomial.value;
                int i11 = iArr[i10] << i9;
                iArr[i10] = i11;
                iArr[i10] = i11 | (iArr[i10 - 1] >>> (32 - i9));
            }
            int[] iArr2 = gF2Polynomial.value;
            iArr2[0] = iArr2[0] << i9;
        }
        return gF2Polynomial;
    }

    public GF2Polynomial(int i, BigInteger bigInteger) {
        i = i < 1 ? 1 : i;
        int i9 = ((i - 1) >> 5) + 1;
        this.blocks = i9;
        this.value = new int[i9];
        this.len = i;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        int length2 = byteArray.length & 3;
        int length3 = (byteArray.length - 1) >> 2;
        for (int i10 = 0; i10 < length2; i10++) {
            int[] iArr = this.value;
            iArr[length3] = iArr[length3] | ((byteArray[i10] & 255) << (((length2 - 1) - i10) << 3));
        }
        for (int i11 = 0; i11 <= ((byteArray.length - 4) >> 2); i11++) {
            int length4 = (byteArray.length - 1) - (i11 << 2);
            int[] iArr2 = this.value;
            int i12 = byteArray[length4] & 255;
            iArr2[i11] = i12;
            int i13 = i12 | ((byteArray[length4 - 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB);
            iArr2[i11] = i13;
            int i14 = i13 | ((byteArray[length4 - 2] << 16) & 16711680);
            iArr2[i11] = i14;
            iArr2[i11] = ((byteArray[length4 - 3] << 24) & (-16777216)) | i14;
        }
        int i15 = this.len;
        if ((i15 & 31) != 0) {
            int[] iArr3 = this.value;
            int i16 = this.blocks - 1;
            iArr3[i16] = reverseRightMask[i15 & 31] & iArr3[i16];
        }
        reduceN();
    }

    public GF2Polynomial(int i, Random random) {
        i = i < 1 ? 1 : i;
        int i9 = ((i - 1) >> 5) + 1;
        this.blocks = i9;
        this.value = new int[i9];
        this.len = i;
        randomize(random);
    }

    public GF2Polynomial(int i, byte[] bArr) {
        int i9;
        i = i < 1 ? 1 : i;
        int i10 = ((i - 1) >> 5) + 1;
        this.blocks = i10;
        this.value = new int[i10];
        this.len = i;
        int min = Math.min(((bArr.length - 1) >> 2) + 1, i10);
        int i11 = 0;
        while (true) {
            i9 = min - 1;
            if (i11 >= i9) {
                break;
            }
            int length = bArr.length - (i11 << 2);
            int[] iArr = this.value;
            int i12 = bArr[length - 1] & 255;
            iArr[i11] = i12;
            int i13 = (65280 & (bArr[length - 2] << 8)) | i12;
            iArr[i11] = i13;
            int i14 = (16711680 & (bArr[length - 3] << 16)) | i13;
            iArr[i11] = i14;
            iArr[i11] = ((bArr[length - 4] << 24) & (-16777216)) | i14;
            i11++;
        }
        int length2 = bArr.length - (i9 << 2);
        int i15 = length2 - 1;
        int[] iArr2 = this.value;
        int i16 = bArr[i15] & 255;
        iArr2[i9] = i16;
        if (i15 > 0) {
            iArr2[i9] = (65280 & (bArr[length2 - 2] << 8)) | i16;
        }
        if (i15 > 1) {
            iArr2[i9] = iArr2[i9] | (16711680 & (bArr[length2 - 3] << 16));
        }
        if (i15 > 2) {
            iArr2[i9] = ((bArr[length2 - 4] << 24) & (-16777216)) | iArr2[i9];
        }
        zeroUnusedBits();
        reduceN();
    }

    public GF2Polynomial(int i, int[] iArr) {
        i = i < 1 ? 1 : i;
        int i9 = ((i - 1) >> 5) + 1;
        this.blocks = i9;
        this.value = new int[i9];
        this.len = i;
        System.arraycopy(iArr, 0, this.value, 0, Math.min(i9, iArr.length));
        zeroUnusedBits();
    }

    public GF2Polynomial(GF2Polynomial gF2Polynomial) {
        this.len = gF2Polynomial.len;
        this.blocks = gF2Polynomial.blocks;
        this.value = IntUtils.clone(gF2Polynomial.value);
    }
}
