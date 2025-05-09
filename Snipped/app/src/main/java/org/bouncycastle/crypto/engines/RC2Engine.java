package org.bouncycastle.crypto.engines;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class RC2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 8;
    private static byte[] piTable = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, ISOFileInfo.f24316A0, ISO7816.INS_LOAD_KEY_FILE, -99, -58, 126, 55, ISOFileInfo.FILE_IDENTIFIER, 43, 118, 83, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.FCP_BYTE, 76, ISOFileInfo.FMD_BYTE, -120, ISO7816.INS_REHABILITATE_CHV, ISOFileInfo.SECURITY_ATTR_EXP, -5, -94, 23, -102, 89, -11, ISOFileInfo.FCI_EXT, ISO7816.INS_READ_RECORD2, 79, 19, 97, 69, 109, ISOFileInfo.ENV_TEMP_EF, 9, ISOFileInfo.DATA_BYTES2, 125, ISO7816.INS_INCREASE, -67, -113, 64, -21, -122, -73, 123, PassportService.SFI_DG11, -16, -107, 33, ISO7816.INS_MSE, 92, 107, 78, -126, 84, ISO7816.INS_UPDATE_BINARY, 101, -109, -50, 96, -78, 28, 115, 86, ISO7816.INS_GET_RESPONSE, 20, -89, ISOFileInfo.SECURITY_ATTR_COMPACT, -15, ISO7816.INS_UPDATE_RECORD, 18, 117, ISO7816.INS_GET_DATA, 31, 59, -66, ISO7816.INS_DELETE_FILE, -47, CVCAFile.CAR_TAG, 61, -44, ISO7816.INS_DECREASE, -93, 60, ISO7816.INS_READ_RECORD_STAMPED, 38, ISOFileInfo.FCI_BYTE, -65, 14, ISO7816.INS_PUT_DATA, 70, 105, 7, 87, 39, -14, 29, -101, PSSSigner.TRAILER_IMPLICIT, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, PassportService.SFI_COM, -41, 8, -24, -22, -34, ISOFileInfo.DATA_BYTES1, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, ISO7816.INS_PSO, -106, 26, ISO7816.INS_WRITE_RECORD, 113, 90, 21, 73, 116, 75, -97, ISO7816.INS_WRITE_BINARY, 94, 4, 24, -92, -20, ISO7816.INS_ENVELOPE, ISO7816.INS_CREATE_FILE, 65, 110, PassportService.SFI_DG15, 81, -53, -52, ISO7816.INS_CHANGE_CHV, -111, -81, 80, ISOFileInfo.f24317A1, -12, ISO7816.INS_MANAGE_CHANNEL, 57, -103, 124, 58, ISOFileInfo.PROP_INFO, 35, -72, ISO7816.INS_READ_BINARY_STAMPED, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, ISOFileInfo.LCS_BYTE, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, ISO7816.INS_UNBLOCK_CHV, 99, 22, 1, 63, 88, ISO7816.INS_APPEND_RECORD, -119, -87, PassportService.SFI_DG13, 56, ISO7816.INS_DECREASE_STAMPED, 27, ISOFileInfo.AB, 51, -1, ISO7816.INS_READ_BINARY, -69, 72, PassportService.SFI_DG12, 95, -71, ISO7816.INS_READ_BINARY2, -51, 46, -59, -13, -37, 71, -27, ISOFileInfo.f24319A5, -100, 119, 10, -90, ISO7816.INS_VERIFY, 104, -2, Byte.MAX_VALUE, -63, -83};
    private boolean encrypting;
    private int[] workingKey;

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int i10 = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int i11 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int i12 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int i13 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
        for (int i14 = 60; i14 >= 44; i14 -= 4) {
            i10 = rotateWordLeft(i10, 11) - ((((~i11) & i13) + (i12 & i11)) + this.workingKey[i14 + 3]);
            i11 = rotateWordLeft(i11, 13) - ((((~i12) & i10) + (i13 & i12)) + this.workingKey[i14 + 2]);
            i12 = rotateWordLeft(i12, 14) - ((((~i13) & i11) + (i10 & i13)) + this.workingKey[i14 + 1]);
            i13 = rotateWordLeft(i13, 15) - ((((~i10) & i12) + (i11 & i10)) + this.workingKey[i14]);
        }
        int[] iArr = this.workingKey;
        int i15 = i10 - iArr[i11 & 63];
        int i16 = i11 - iArr[i12 & 63];
        int i17 = i12 - iArr[i13 & 63];
        int i18 = i13 - iArr[i15 & 63];
        for (int i19 = 40; i19 >= 20; i19 -= 4) {
            i15 = rotateWordLeft(i15, 11) - ((((~i16) & i18) + (i17 & i16)) + this.workingKey[i19 + 3]);
            i16 = rotateWordLeft(i16, 13) - ((((~i17) & i15) + (i18 & i17)) + this.workingKey[i19 + 2]);
            i17 = rotateWordLeft(i17, 14) - ((((~i18) & i16) + (i15 & i18)) + this.workingKey[i19 + 1]);
            i18 = rotateWordLeft(i18, 15) - ((((~i15) & i17) + (i16 & i15)) + this.workingKey[i19]);
        }
        int[] iArr2 = this.workingKey;
        int i20 = i15 - iArr2[i16 & 63];
        int i21 = i16 - iArr2[i17 & 63];
        int i22 = i17 - iArr2[i18 & 63];
        int i23 = i18 - iArr2[i20 & 63];
        for (int i24 = 16; i24 >= 0; i24 -= 4) {
            i20 = rotateWordLeft(i20, 11) - ((((~i21) & i23) + (i22 & i21)) + this.workingKey[i24 + 3]);
            i21 = rotateWordLeft(i21, 13) - ((((~i22) & i20) + (i23 & i22)) + this.workingKey[i24 + 2]);
            i22 = rotateWordLeft(i22, 14) - ((((~i23) & i21) + (i20 & i23)) + this.workingKey[i24 + 1]);
            i23 = rotateWordLeft(i23, 15) - ((((~i20) & i22) + (i21 & i20)) + this.workingKey[i24]);
        }
        bArr2[i9] = (byte) i23;
        bArr2[i9 + 1] = (byte) (i23 >> 8);
        bArr2[i9 + 2] = (byte) i22;
        bArr2[i9 + 3] = (byte) (i22 >> 8);
        bArr2[i9 + 4] = (byte) i21;
        bArr2[i9 + 5] = (byte) (i21 >> 8);
        bArr2[i9 + 6] = (byte) i20;
        bArr2[i9 + 7] = (byte) (i20 >> 8);
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int i10 = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int i11 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int i12 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int i13 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
        for (int i14 = 0; i14 <= 16; i14 += 4) {
            i13 = rotateWordLeft(i13 + ((~i10) & i12) + (i11 & i10) + this.workingKey[i14], 1);
            i12 = rotateWordLeft(i12 + ((~i13) & i11) + (i10 & i13) + this.workingKey[i14 + 1], 2);
            i11 = rotateWordLeft(i11 + ((~i12) & i10) + (i13 & i12) + this.workingKey[i14 + 2], 3);
            i10 = rotateWordLeft(i10 + ((~i11) & i13) + (i12 & i11) + this.workingKey[i14 + 3], 5);
        }
        int[] iArr = this.workingKey;
        int i15 = i13 + iArr[i10 & 63];
        int i16 = i12 + iArr[i15 & 63];
        int i17 = i11 + iArr[i16 & 63];
        int i18 = i10 + iArr[i17 & 63];
        for (int i19 = 20; i19 <= 40; i19 += 4) {
            i15 = rotateWordLeft(i15 + ((~i18) & i16) + (i17 & i18) + this.workingKey[i19], 1);
            i16 = rotateWordLeft(i16 + ((~i15) & i17) + (i18 & i15) + this.workingKey[i19 + 1], 2);
            i17 = rotateWordLeft(i17 + ((~i16) & i18) + (i15 & i16) + this.workingKey[i19 + 2], 3);
            i18 = rotateWordLeft(i18 + ((~i17) & i15) + (i16 & i17) + this.workingKey[i19 + 3], 5);
        }
        int[] iArr2 = this.workingKey;
        int i20 = i15 + iArr2[i18 & 63];
        int i21 = i16 + iArr2[i20 & 63];
        int i22 = i17 + iArr2[i21 & 63];
        int i23 = i18 + iArr2[i22 & 63];
        for (int i24 = 44; i24 < 64; i24 += 4) {
            i20 = rotateWordLeft(i20 + ((~i23) & i21) + (i22 & i23) + this.workingKey[i24], 1);
            i21 = rotateWordLeft(i21 + ((~i20) & i22) + (i23 & i20) + this.workingKey[i24 + 1], 2);
            i22 = rotateWordLeft(i22 + ((~i21) & i23) + (i20 & i21) + this.workingKey[i24 + 2], 3);
            i23 = rotateWordLeft(i23 + ((~i22) & i20) + (i21 & i22) + this.workingKey[i24 + 3], 5);
        }
        bArr2[i9] = (byte) i20;
        bArr2[i9 + 1] = (byte) (i20 >> 8);
        bArr2[i9 + 2] = (byte) i21;
        bArr2[i9 + 3] = (byte) (i21 >> 8);
        bArr2[i9 + 4] = (byte) i22;
        bArr2[i9 + 5] = (byte) (i22 >> 8);
        bArr2[i9 + 6] = (byte) i23;
        bArr2[i9 + 7] = (byte) (i23 >> 8);
    }

    private int[] generateWorkingKey(byte[] bArr, int i) {
        int[] iArr = new int[128];
        for (int i9 = 0; i9 != bArr.length; i9++) {
            iArr[i9] = bArr[i9] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i10 = iArr[length - 1];
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                i10 = piTable[(i10 + iArr[i11]) & 255] & 255;
                int i13 = length + 1;
                iArr[length] = i10;
                if (i13 >= 128) {
                    break;
                }
                length = i13;
                i11 = i12;
            }
        }
        int i14 = (i + 7) >> 3;
        int i15 = 128 - i14;
        int i16 = piTable[(255 >> ((-i) & 7)) & iArr[i15]] & 255;
        iArr[i15] = i16;
        for (int i17 = 127 - i14; i17 >= 0; i17--) {
            i16 = piTable[i16 ^ iArr[i17 + i14]] & 255;
            iArr[i17] = i16;
        }
        int[] iArr2 = new int[64];
        for (int i18 = 0; i18 != 64; i18++) {
            int i19 = i18 * 2;
            iArr2[i18] = iArr[i19] + (iArr[i19 + 1] << 8);
        }
        return iArr2;
    }

    private int rotateWordLeft(int i, int i9) {
        int i10 = i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        return (i10 >> (16 - i9)) | (i10 << i9);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.encrypting = z10;
        if (cipherParameters instanceof RC2Parameters) {
            RC2Parameters rC2Parameters = (RC2Parameters) cipherParameters;
            this.workingKey = generateWorkingKey(rC2Parameters.getKey(), rC2Parameters.getEffectiveKeyBits());
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(a.h("invalid parameter passed to RC2 init - ", cipherParameters));
            }
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.workingKey = generateWorkingKey(key, key.length * 8);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (this.workingKey == null) {
            throw new IllegalStateException("RC2 engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i9);
            return 8;
        }
        decryptBlock(bArr, i, bArr2, i9);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
