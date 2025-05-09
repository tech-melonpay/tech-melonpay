package org.bouncycastle.crypto.engines;

import android.R;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;

/* loaded from: classes2.dex */
public class DESEngine implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private int[] workingKey = null;
    private static final short[] bytebit = {128, 64, 32, 16, 8, 4, 2, 1};
    private static final int[] bigbyte = {8388608, 4194304, PKIFailureInfo.badSenderNonce, PKIFailureInfo.badCertTemplate, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
    private static final byte[] pc1 = {56, ISO7816.INS_DECREASE, 40, ISO7816.INS_VERIFY, 24, 16, 8, 0, 57, 49, 41, 33, 25, 17, 9, 1, 58, ISO7816.INS_INCREASE, ISO7816.INS_PSO, ISO7816.INS_MSE, 26, 18, 10, 2, 59, 51, 43, 35, 62, 54, 46, 38, PassportService.SFI_COM, 22, 14, 6, 61, 53, 45, 37, 29, 21, PassportService.SFI_DG13, 5, 60, ISO7816.INS_DECREASE_STAMPED, ISO7816.INS_UNBLOCK_CHV, ISO7816.INS_CHANGE_CHV, 28, 20, PassportService.SFI_DG12, 4, 27, 19, PassportService.SFI_DG11, 3};
    private static final byte[] totrot = {1, 2, 4, 6, 8, 10, PassportService.SFI_DG12, 14, PassportService.SFI_DG15, 17, 19, 21, 23, 25, 27, 28};
    private static final byte[] pc2 = {PassportService.SFI_DG13, 16, 10, 23, 0, 4, 2, 27, 14, 5, 20, 9, 22, 18, PassportService.SFI_DG11, 3, 25, 7, PassportService.SFI_DG15, 6, 26, 19, PassportService.SFI_DG12, 1, 40, 51, PassportService.SFI_COM, ISO7816.INS_CHANGE_CHV, 46, 54, 29, 39, ISO7816.INS_INCREASE, ISO7816.INS_UNBLOCK_CHV, ISO7816.INS_VERIFY, 47, 43, ISO7816.INS_DECREASE, 38, 55, 33, ISO7816.INS_DECREASE_STAMPED, 45, 41, 49, 35, 28, 31};
    private static final int[] SP1 = {R.attr.transitionName, 0, 65536, R.attr.fillColor, R.attr.manageSpaceActivity, 66564, 4, 65536, 1024, R.attr.transitionName, R.attr.fillColor, 1024, 16778244, R.attr.manageSpaceActivity, 16777216, 4, 1028, 16778240, 16778240, 66560, 66560, R.attr.theme, R.attr.theme, 16778244, 65540, 16777220, 16777220, 65540, 0, 1028, 66564, 16777216, 65536, R.attr.fillColor, 4, R.attr.theme, R.attr.transitionName, 16777216, 16777216, 1024, R.attr.manageSpaceActivity, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, R.attr.fillColor, 65540, R.attr.theme, 16778244, 16777220, 1028, 66564, R.attr.transitionName, 1028, 16778240, 16778240, 0, 65540, 66560, 0, R.attr.manageSpaceActivity};
    private static final int[] SP2 = {-2146402272, -2147450880, 32768, 1081376, PKIFailureInfo.badCertTemplate, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, Integer.MIN_VALUE, -2147450880, PKIFailureInfo.badCertTemplate, 32, -2146435040, 1081344, 1048608, -2147450848, 0, Integer.MIN_VALUE, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, PKIFailureInfo.badCertTemplate, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, Integer.MIN_VALUE, 32800, -2146402304, PKIFailureInfo.badCertTemplate, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, Integer.MIN_VALUE, -2146435040, -2146402272, 1081344};
    private static final int[] SP3 = {520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584};
    private static final int[] SP4 = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928};
    private static final int[] SP5 = {256, 34078976, 34078720, 1107296512, 524288, 256, 1073741824, 34078720, 1074266368, 524288, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, 524288, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, 524288, 0, 1074266112, 34078976, 1073742080};
    private static final int[] SP6 = {536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, PKIFailureInfo.duplicateCertReq, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, PKIFailureInfo.duplicateCertReq, 4194320, 536887312};
    private static final int[] SP7 = {PKIFailureInfo.badSenderNonce, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, PKIFailureInfo.badSenderNonce, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, PKIFailureInfo.badSenderNonce, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, PKIFailureInfo.badSenderNonce, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};
    private static final int[] SP8 = {268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};

    public void desFunc(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i9) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, i);
        int bigEndianToInt2 = Pack.bigEndianToInt(bArr, i + 4);
        int i10 = ((bigEndianToInt >>> 4) ^ bigEndianToInt2) & 252645135;
        int i11 = bigEndianToInt2 ^ i10;
        int i12 = bigEndianToInt ^ (i10 << 4);
        int i13 = ((i12 >>> 16) ^ i11) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        int i14 = i11 ^ i13;
        int i15 = i12 ^ (i13 << 16);
        int i16 = ((i14 >>> 2) ^ i15) & 858993459;
        int i17 = i15 ^ i16;
        int i18 = i14 ^ (i16 << 2);
        int i19 = ((i18 >>> 8) ^ i17) & 16711935;
        int i20 = i17 ^ i19;
        int i21 = i18 ^ (i19 << 8);
        int i22 = (i21 >>> 31) | (i21 << 1);
        int i23 = (i20 ^ i22) & (-1431655766);
        int i24 = i20 ^ i23;
        int i25 = i22 ^ i23;
        int i26 = (i24 >>> 31) | (i24 << 1);
        for (int i27 = 0; i27 < 8; i27++) {
            int i28 = i27 * 4;
            int i29 = ((i25 << 28) | (i25 >>> 4)) ^ iArr[i28];
            int[] iArr2 = SP7;
            int i30 = iArr2[i29 & 63];
            int[] iArr3 = SP5;
            int i31 = i30 | iArr3[(i29 >>> 8) & 63];
            int[] iArr4 = SP3;
            int i32 = i31 | iArr4[(i29 >>> 16) & 63];
            int[] iArr5 = SP1;
            int i33 = iArr5[(i29 >>> 24) & 63] | i32;
            int i34 = iArr[i28 + 1] ^ i25;
            int[] iArr6 = SP8;
            int i35 = i33 | iArr6[i34 & 63];
            int[] iArr7 = SP6;
            int i36 = i35 | iArr7[(i34 >>> 8) & 63];
            int[] iArr8 = SP4;
            int i37 = i36 | iArr8[(i34 >>> 16) & 63];
            int[] iArr9 = SP2;
            i26 ^= i37 | iArr9[(i34 >>> 24) & 63];
            int i38 = ((i26 << 28) | (i26 >>> 4)) ^ iArr[i28 + 2];
            int i39 = iArr5[(i38 >>> 24) & 63] | iArr2[i38 & 63] | iArr3[(i38 >>> 8) & 63] | iArr4[(i38 >>> 16) & 63];
            int i40 = iArr[i28 + 3] ^ i26;
            i25 ^= (((i39 | iArr6[i40 & 63]) | iArr7[(i40 >>> 8) & 63]) | iArr8[(i40 >>> 16) & 63]) | iArr9[(i40 >>> 24) & 63];
        }
        int i41 = (i25 >>> 1) | (i25 << 31);
        int i42 = (i26 ^ i41) & (-1431655766);
        int i43 = i26 ^ i42;
        int i44 = i41 ^ i42;
        int i45 = (i43 >>> 1) | (i43 << 31);
        int i46 = ((i45 >>> 8) ^ i44) & 16711935;
        int i47 = i44 ^ i46;
        int i48 = i45 ^ (i46 << 8);
        int i49 = ((i48 >>> 2) ^ i47) & 858993459;
        int i50 = i47 ^ i49;
        int i51 = i48 ^ (i49 << 2);
        int i52 = ((i50 >>> 16) ^ i51) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        int i53 = i51 ^ i52;
        int i54 = i50 ^ (i52 << 16);
        int i55 = ((i54 >>> 4) ^ i53) & 252645135;
        Pack.intToBigEndian(i54 ^ (i55 << 4), bArr2, i9);
        Pack.intToBigEndian(i53 ^ i55, bArr2, i9 + 4);
    }

    public int[] generateWorkingKey(boolean z10, byte[] bArr) {
        int i;
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i9 = 0;
        while (true) {
            boolean z11 = true;
            if (i9 >= 56) {
                break;
            }
            byte b9 = pc1[i9];
            if ((bytebit[b9 & 7] & bArr[b9 >>> 3]) == 0) {
                z11 = false;
            }
            zArr[i9] = z11;
            i9++;
        }
        for (int i10 = 0; i10 < 16; i10++) {
            int i11 = z10 ? i10 << 1 : (15 - i10) << 1;
            int i12 = i11 + 1;
            iArr[i12] = 0;
            iArr[i11] = 0;
            int i13 = 0;
            while (true) {
                if (i13 >= 28) {
                    break;
                }
                int i14 = totrot[i10] + i13;
                if (i14 < 28) {
                    zArr2[i13] = zArr[i14];
                } else {
                    zArr2[i13] = zArr[i14 - 28];
                }
                i13++;
            }
            for (i = 28; i < 56; i++) {
                int i15 = totrot[i10] + i;
                if (i15 < 56) {
                    zArr2[i] = zArr[i15];
                } else {
                    zArr2[i] = zArr[i15 - 28];
                }
            }
            for (int i16 = 0; i16 < 24; i16++) {
                byte[] bArr2 = pc2;
                if (zArr2[bArr2[i16]]) {
                    iArr[i11] = iArr[i11] | bigbyte[i16];
                }
                if (zArr2[bArr2[i16 + 24]]) {
                    iArr[i12] = iArr[i12] | bigbyte[i16];
                }
            }
        }
        for (int i17 = 0; i17 != 32; i17 += 2) {
            int i18 = iArr[i17];
            int i19 = i17 + 1;
            int i20 = iArr[i19];
            iArr[i17] = ((16515072 & i20) >>> 10) | ((i18 & 16515072) << 6) | ((i18 & 4032) << 10) | ((i20 & 4032) >>> 6);
            iArr[i19] = ((i18 & 63) << 16) | ((i18 & 258048) << 12) | ((258048 & i20) >>> 4) | (i20 & 63);
        }
        return iArr;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to DES init - ", cipherParameters));
        }
        KeyParameter keyParameter = (KeyParameter) cipherParameters;
        if (keyParameter.getKey().length > 8) {
            throw new IllegalArgumentException("DES key too long - should be 8 bytes");
        }
        this.workingKey = generateWorkingKey(z10, keyParameter.getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("DES engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        desFunc(iArr, bArr, i, bArr2, i9);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
