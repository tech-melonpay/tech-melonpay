package org.bouncycastle.crypto.engines;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public final class TwofishEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int GF256_FDBK = 361;
    private static final int GF256_FDBK_2 = 180;
    private static final int GF256_FDBK_4 = 90;
    private static final int INPUT_WHITEN = 0;
    private static final int MAX_KEY_BITS = 256;
    private static final int MAX_ROUNDS = 16;
    private static final int OUTPUT_WHITEN = 4;

    /* renamed from: P, reason: collision with root package name */
    private static final byte[][] f24984P = {new byte[]{-87, 103, ISO7816.INS_READ_RECORD2, -24, 4, -3, -93, 118, -102, -110, ISOFileInfo.DATA_BYTES1, 120, ISO7816.INS_DELETE_FILE, -35, -47, 56, PassportService.SFI_DG13, -58, 53, -104, 24, -9, -20, 108, 67, 117, 55, 38, -6, 19, -108, 72, -14, ISO7816.INS_WRITE_BINARY, ISOFileInfo.SECURITY_ATTR_EXP, ISO7816.INS_DECREASE, -124, 84, -33, 35, 25, 91, 61, 89, -13, -82, -94, -126, 99, 1, ISOFileInfo.FILE_IDENTIFIER, 46, -39, 81, -101, 124, -90, -21, ISOFileInfo.f24319A5, -66, 22, PassportService.SFI_DG12, -29, 97, ISO7816.INS_GET_RESPONSE, ISOFileInfo.SECURITY_ATTR_COMPACT, 58, -11, 115, ISO7816.INS_UNBLOCK_CHV, 37, PassportService.SFI_DG11, -69, 78, -119, 107, 83, 106, ISO7816.INS_READ_BINARY_STAMPED, -15, -31, -26, -67, 69, ISO7816.INS_APPEND_RECORD, -12, ISO7816.INS_READ_RECORD_STAMPED, 102, -52, -107, 3, 86, -44, 28, PassportService.SFI_COM, -41, -5, -61, ISOFileInfo.CHANNEL_SECURITY, -75, -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, ISOFileInfo.FCP_BYTE, 113, ISOFileInfo.DATA_BYTES2, 121, 9, -83, ISO7816.INS_CHANGE_CHV, -51, -7, ISO7816.INS_LOAD_KEY_FILE, -27, -59, -71, 77, ISO7816.INS_REHABILITATE_CHV, 8, -122, -25, ISOFileInfo.f24317A1, 29, -86, -19, 6, ISO7816.INS_MANAGE_CHANNEL, -78, ISO7816.INS_WRITE_RECORD, 65, 123, ISOFileInfo.f24316A0, 17, 49, ISO7816.INS_ENVELOPE, 39, -112, ISO7816.INS_VERIFY, -10, 96, -1, -106, 92, ISO7816.INS_READ_BINARY2, ISOFileInfo.AB, -98, -100, 82, 27, 95, -109, 10, -17, -111, ISOFileInfo.PROP_INFO, 73, -18, 45, 79, -113, 59, 71, ISOFileInfo.FCI_EXT, 109, 70, ISO7816.INS_UPDATE_BINARY, 62, 105, ISOFileInfo.FMD_BYTE, ISO7816.INS_PSO, -50, -53, 47, -4, -105, 5, 122, -84, Byte.MAX_VALUE, -43, 26, 75, 14, -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, -72, ISO7816.INS_PUT_DATA, ISO7816.INS_READ_BINARY, 23, 85, 31, ISOFileInfo.LCS_BYTE, 125, 87, -57, ISOFileInfo.ENV_TEMP_EF, 116, -73, -60, -97, 114, 126, 21, ISO7816.INS_MSE, 18, 88, 7, -103, ISO7816.INS_DECREASE_STAMPED, 110, 80, -34, 104, 101, PSSSigner.TRAILER_IMPLICIT, -37, -8, -56, -88, 43, 64, ISO7816.INS_UPDATE_RECORD, -2, ISO7816.INS_INCREASE, -92, ISO7816.INS_GET_DATA, 16, 33, -16, -45, 93, PassportService.SFI_DG15, 0, ISOFileInfo.FCI_BYTE, -99, 54, CVCAFile.CAR_TAG, 74, 94, -63, ISO7816.INS_CREATE_FILE}, new byte[]{117, -13, -58, -12, -37, 123, -5, -56, 74, -45, -26, 107, 69, 125, -24, 75, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_INCREASE, ISO7816.INS_LOAD_KEY_FILE, -3, 55, 113, -15, -31, ISO7816.INS_DECREASE, PassportService.SFI_DG15, -8, 27, ISOFileInfo.FCI_EXT, -6, 6, 63, 94, -70, -82, 91, ISOFileInfo.LCS_BYTE, 0, PSSSigner.TRAILER_IMPLICIT, -99, 109, -63, ISO7816.INS_READ_BINARY2, 14, ISOFileInfo.DATA_BYTES1, 93, ISO7816.INS_WRITE_RECORD, -43, ISOFileInfo.f24316A0, -124, 7, 20, -75, -112, ISO7816.INS_UNBLOCK_CHV, -93, -78, 115, 76, 84, -110, 116, 54, 81, 56, ISO7816.INS_READ_BINARY, -67, 90, -4, 96, ISOFileInfo.FCP_BYTE, -106, 108, CVCAFile.CAR_TAG, -9, 16, 124, 40, 39, ISOFileInfo.SECURITY_ATTR_COMPACT, 19, -107, -100, -57, ISO7816.INS_CHANGE_CHV, 70, 59, ISO7816.INS_MANAGE_CHANNEL, ISO7816.INS_GET_DATA, -29, ISOFileInfo.PROP_INFO, -53, 17, ISO7816.INS_WRITE_BINARY, -109, -72, -90, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_VERIFY, -1, -97, 119, -61, -52, 3, ISOFileInfo.FCI_BYTE, 8, -65, 64, -25, 43, ISO7816.INS_APPEND_RECORD, 121, PassportService.SFI_DG12, -86, -126, 65, 58, -22, -71, ISO7816.INS_DELETE_FILE, -102, -92, -105, 126, ISO7816.INS_PUT_DATA, 122, 23, 102, -108, ISOFileInfo.f24317A1, 29, 61, -16, -34, ISO7816.INS_READ_RECORD2, PassportService.SFI_DG11, 114, -89, 28, -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, ISO7816.INS_PSO, 73, ISOFileInfo.DATA_BYTES2, -120, -18, 33, -60, 26, -21, -39, -59, 57, -103, -51, -83, 49, ISOFileInfo.SECURITY_ATTR_EXP, 1, 24, 35, -35, 31, 78, 45, -7, 72, 79, -14, 101, ISOFileInfo.CHANNEL_SECURITY, 120, 92, 88, 25, ISOFileInfo.ENV_TEMP_EF, -27, -104, 87, 103, Byte.MAX_VALUE, 5, ISOFileInfo.FMD_BYTE, -81, 99, ISO7816.INS_READ_RECORD_STAMPED, -2, -11, -73, 60, ISOFileInfo.f24319A5, -50, -23, 104, ISO7816.INS_REHABILITATE_CHV, ISO7816.INS_CREATE_FILE, 77, 67, 105, 41, 46, -84, 21, 89, -88, 10, -98, 110, 71, -33, ISO7816.INS_DECREASE_STAMPED, 53, 106, -49, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_MSE, -55, ISO7816.INS_GET_RESPONSE, -101, -119, -44, -19, ISOFileInfo.AB, 18, -94, PassportService.SFI_DG13, 82, -69, 2, 47, -87, -41, 97, PassportService.SFI_COM, ISO7816.INS_READ_BINARY_STAMPED, 80, 4, -10, ISO7816.INS_ENVELOPE, 22, 37, -122, 86, 85, 9, -66, -111}};
    private static final int P_00 = 1;
    private static final int P_01 = 0;
    private static final int P_02 = 0;
    private static final int P_03 = 1;
    private static final int P_04 = 1;
    private static final int P_10 = 0;
    private static final int P_11 = 0;
    private static final int P_12 = 1;
    private static final int P_13 = 1;
    private static final int P_14 = 0;
    private static final int P_20 = 1;
    private static final int P_21 = 1;
    private static final int P_22 = 0;
    private static final int P_23 = 0;
    private static final int P_24 = 0;
    private static final int P_30 = 0;
    private static final int P_31 = 1;
    private static final int P_32 = 1;
    private static final int P_33 = 0;
    private static final int P_34 = 1;
    private static final int ROUNDS = 16;
    private static final int ROUND_SUBKEYS = 8;
    private static final int RS_GF_FDBK = 333;
    private static final int SK_BUMP = 16843009;
    private static final int SK_ROTL = 9;
    private static final int SK_STEP = 33686018;
    private static final int TOTAL_SUBKEYS = 40;
    private int[] gSBox;
    private int[] gSubKeys;
    private boolean encrypting = false;
    private int[] gMDS0 = new int[256];
    private int[] gMDS1 = new int[256];
    private int[] gMDS2 = new int[256];
    private int[] gMDS3 = new int[256];
    private int k64Cnt = 0;
    private byte[] workingKey = null;

    public TwofishEngine() {
        for (int i = 0; i < 256; i++) {
            byte[][] bArr = f24984P;
            int i9 = bArr[0][i] & 255;
            int Mx_X = Mx_X(i9) & 255;
            int Mx_Y = Mx_Y(i9) & 255;
            int i10 = bArr[1][i] & 255;
            int[] iArr = {i9, i10};
            int[] iArr2 = {Mx_X, Mx_X(i10) & 255};
            int[] iArr3 = {Mx_Y, Mx_Y(i10) & 255};
            int[] iArr4 = this.gMDS0;
            int i11 = iArr[1] | (iArr2[1] << 8);
            int i12 = iArr3[1];
            iArr4[i] = i11 | (i12 << 16) | (i12 << 24);
            int[] iArr5 = this.gMDS1;
            int i13 = iArr3[0];
            iArr5[i] = i13 | (i13 << 8) | (iArr2[0] << 16) | (iArr[0] << 24);
            int[] iArr6 = this.gMDS2;
            int i14 = iArr2[1];
            int i15 = iArr3[1];
            iArr6[i] = (iArr[1] << 16) | i14 | (i15 << 8) | (i15 << 24);
            int[] iArr7 = this.gMDS3;
            int i16 = iArr2[0];
            iArr7[i] = (iArr3[0] << 16) | (iArr[0] << 8) | i16 | (i16 << 24);
        }
    }

    private int F32(int i, int[] iArr) {
        int i9;
        int i10;
        int b02 = b0(i);
        int b12 = b1(i);
        int b22 = b2(i);
        int b32 = b3(i);
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = this.k64Cnt & 3;
        if (i15 != 0) {
            if (i15 == 1) {
                int[] iArr2 = this.gMDS0;
                byte[][] bArr = f24984P;
                i9 = (iArr2[(bArr[0][b02] & 255) ^ b0(i11)] ^ this.gMDS1[(bArr[0][b12] & 255) ^ b1(i11)]) ^ this.gMDS2[(bArr[1][b22] & 255) ^ b2(i11)];
                i10 = this.gMDS3[(bArr[1][b32] & 255) ^ b3(i11)];
                return i9 ^ i10;
            }
            if (i15 != 2) {
                if (i15 != 3) {
                    return 0;
                }
            }
            int[] iArr3 = this.gMDS0;
            byte[][] bArr2 = f24984P;
            byte[] bArr3 = bArr2[0];
            i9 = (iArr3[(bArr3[(bArr3[b02] & 255) ^ b0(i12)] & 255) ^ b0(i11)] ^ this.gMDS1[(bArr2[0][(bArr2[1][b12] & 255) ^ b1(i12)] & 255) ^ b1(i11)]) ^ this.gMDS2[(bArr2[1][(bArr2[0][b22] & 255) ^ b2(i12)] & 255) ^ b2(i11)];
            int[] iArr4 = this.gMDS3;
            byte[] bArr4 = bArr2[1];
            i10 = iArr4[(bArr4[(bArr4[b32] & 255) ^ b3(i12)] & 255) ^ b3(i11)];
            return i9 ^ i10;
        }
        byte[][] bArr5 = f24984P;
        b02 = (bArr5[1][b02] & 255) ^ b0(i14);
        b12 = (bArr5[0][b12] & 255) ^ b1(i14);
        b22 = (bArr5[0][b22] & 255) ^ b2(i14);
        b32 = (bArr5[1][b32] & 255) ^ b3(i14);
        byte[][] bArr6 = f24984P;
        b02 = (bArr6[1][b02] & 255) ^ b0(i13);
        b12 = (bArr6[1][b12] & 255) ^ b1(i13);
        b22 = (bArr6[0][b22] & 255) ^ b2(i13);
        b32 = (bArr6[0][b32] & 255) ^ b3(i13);
        int[] iArr32 = this.gMDS0;
        byte[][] bArr22 = f24984P;
        byte[] bArr32 = bArr22[0];
        i9 = (iArr32[(bArr32[(bArr32[b02] & 255) ^ b0(i12)] & 255) ^ b0(i11)] ^ this.gMDS1[(bArr22[0][(bArr22[1][b12] & 255) ^ b1(i12)] & 255) ^ b1(i11)]) ^ this.gMDS2[(bArr22[1][(bArr22[0][b22] & 255) ^ b2(i12)] & 255) ^ b2(i11)];
        int[] iArr42 = this.gMDS3;
        byte[] bArr42 = bArr22[1];
        i10 = iArr42[(bArr42[(bArr42[b32] & 255) ^ b3(i12)] & 255) ^ b3(i11)];
        return i9 ^ i10;
    }

    private int Fe32_0(int i) {
        int[] iArr = this.gSBox;
        return iArr[(((i >>> 24) & 255) * 2) + SignatureScheme.rsa_pkcs1_sha1] ^ ((iArr[(i & 255) * 2] ^ iArr[(((i >>> 8) & 255) * 2) + 1]) ^ iArr[(((i >>> 16) & 255) * 2) + 512]);
    }

    private int Fe32_3(int i) {
        int[] iArr = this.gSBox;
        return iArr[(((i >>> 16) & 255) * 2) + SignatureScheme.rsa_pkcs1_sha1] ^ ((iArr[((i >>> 24) & 255) * 2] ^ iArr[((i & 255) * 2) + 1]) ^ iArr[(((i >>> 8) & 255) * 2) + 512]);
    }

    private int LFSR1(int i) {
        return ((i & 1) != 0 ? 180 : 0) ^ (i >> 1);
    }

    private int LFSR2(int i) {
        return ((i >> 2) ^ ((i & 2) != 0 ? 180 : 0)) ^ ((i & 1) != 0 ? 90 : 0);
    }

    private int Mx_X(int i) {
        return i ^ LFSR2(i);
    }

    private int Mx_Y(int i) {
        return LFSR2(i) ^ (LFSR1(i) ^ i);
    }

    private int RS_MDS_Encode(int i, int i9) {
        for (int i10 = 0; i10 < 4; i10++) {
            i9 = RS_rem(i9);
        }
        int i11 = i ^ i9;
        for (int i12 = 0; i12 < 4; i12++) {
            i11 = RS_rem(i11);
        }
        return i11;
    }

    private int RS_rem(int i) {
        int i9 = i >>> 24;
        int i10 = i9 & 255;
        int i11 = ((i10 << 1) ^ ((i9 & 128) != 0 ? RS_GF_FDBK : 0)) & 255;
        int i12 = ((i10 >>> 1) ^ ((i9 & 1) != 0 ? 166 : 0)) ^ i11;
        return ((((i << 8) ^ (i12 << 24)) ^ (i11 << 16)) ^ (i12 << 8)) ^ i10;
    }

    private int b0(int i) {
        return i & 255;
    }

    private int b1(int i) {
        return (i >>> 8) & 255;
    }

    private int b2(int i) {
        return (i >>> 16) & 255;
    }

    private int b3(int i) {
        return (i >>> 24) & 255;
    }

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i) ^ this.gSubKeys[4];
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4) ^ this.gSubKeys[5];
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8) ^ this.gSubKeys[6];
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12) ^ this.gSubKeys[7];
        int i10 = 39;
        for (int i11 = 0; i11 < 16; i11 += 2) {
            int Fe32_0 = Fe32_0(littleEndianToInt);
            int Fe32_3 = Fe32_3(littleEndianToInt2);
            int i12 = littleEndianToInt4 ^ (((Fe32_3 * 2) + Fe32_0) + this.gSubKeys[i10]);
            littleEndianToInt3 = Integers.rotateLeft(littleEndianToInt3, 1) ^ ((Fe32_0 + Fe32_3) + this.gSubKeys[i10 - 1]);
            littleEndianToInt4 = Integers.rotateRight(i12, 1);
            int Fe32_02 = Fe32_0(littleEndianToInt3);
            int Fe32_32 = Fe32_3(littleEndianToInt4);
            int i13 = i10 - 3;
            int i14 = littleEndianToInt2 ^ (((Fe32_32 * 2) + Fe32_02) + this.gSubKeys[i10 - 2]);
            i10 -= 4;
            littleEndianToInt = Integers.rotateLeft(littleEndianToInt, 1) ^ ((Fe32_02 + Fe32_32) + this.gSubKeys[i13]);
            littleEndianToInt2 = Integers.rotateRight(i14, 1);
        }
        Pack.intToLittleEndian(littleEndianToInt3 ^ this.gSubKeys[0], bArr2, i9);
        Pack.intToLittleEndian(littleEndianToInt4 ^ this.gSubKeys[1], bArr2, i9 + 4);
        Pack.intToLittleEndian(this.gSubKeys[2] ^ littleEndianToInt, bArr2, i9 + 8);
        Pack.intToLittleEndian(this.gSubKeys[3] ^ littleEndianToInt2, bArr2, i9 + 12);
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i) ^ this.gSubKeys[0];
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4) ^ this.gSubKeys[1];
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8) ^ this.gSubKeys[2];
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12) ^ this.gSubKeys[3];
        int i10 = 8;
        for (int i11 = 0; i11 < 16; i11 += 2) {
            int Fe32_0 = Fe32_0(littleEndianToInt);
            int Fe32_3 = Fe32_3(littleEndianToInt2);
            littleEndianToInt3 = Integers.rotateRight(littleEndianToInt3 ^ ((Fe32_0 + Fe32_3) + this.gSubKeys[i10]), 1);
            littleEndianToInt4 = Integers.rotateLeft(littleEndianToInt4, 1) ^ (((Fe32_3 * 2) + Fe32_0) + this.gSubKeys[i10 + 1]);
            int Fe32_02 = Fe32_0(littleEndianToInt3);
            int Fe32_32 = Fe32_3(littleEndianToInt4);
            int i12 = i10 + 3;
            littleEndianToInt = Integers.rotateRight(littleEndianToInt ^ ((Fe32_02 + Fe32_32) + this.gSubKeys[i10 + 2]), 1);
            i10 += 4;
            littleEndianToInt2 = Integers.rotateLeft(littleEndianToInt2, 1) ^ (((Fe32_32 * 2) + Fe32_02) + this.gSubKeys[i12]);
        }
        Pack.intToLittleEndian(this.gSubKeys[4] ^ littleEndianToInt3, bArr2, i9);
        Pack.intToLittleEndian(littleEndianToInt4 ^ this.gSubKeys[5], bArr2, i9 + 4);
        Pack.intToLittleEndian(this.gSubKeys[6] ^ littleEndianToInt, bArr2, i9 + 8);
        Pack.intToLittleEndian(this.gSubKeys[7] ^ littleEndianToInt2, bArr2, i9 + 12);
    }

    private void setKey(byte[] bArr) {
        int b02;
        int b12;
        int b22;
        int b32;
        int i;
        int i9;
        int i10;
        int i11;
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        this.gSubKeys = new int[40];
        for (int i12 = 0; i12 < this.k64Cnt; i12++) {
            int i13 = i12 * 8;
            iArr[i12] = Pack.littleEndianToInt(bArr, i13);
            int littleEndianToInt = Pack.littleEndianToInt(bArr, i13 + 4);
            iArr2[i12] = littleEndianToInt;
            iArr3[(this.k64Cnt - 1) - i12] = RS_MDS_Encode(iArr[i12], littleEndianToInt);
        }
        for (int i14 = 0; i14 < 20; i14++) {
            int i15 = SK_STEP * i14;
            int F32 = F32(i15, iArr);
            int rotateLeft = Integers.rotateLeft(F32(i15 + 16843009, iArr2), 8);
            int i16 = F32 + rotateLeft;
            int[] iArr4 = this.gSubKeys;
            int i17 = i14 * 2;
            iArr4[i17] = i16;
            int i18 = i16 + rotateLeft;
            iArr4[i17 + 1] = (i18 << 9) | (i18 >>> 23);
        }
        int i19 = iArr3[0];
        int i20 = iArr3[1];
        int i21 = 2;
        int i22 = iArr3[2];
        int i23 = iArr3[3];
        this.gSBox = new int[1024];
        int i24 = 0;
        while (i24 < 256) {
            int i25 = this.k64Cnt & 3;
            if (i25 != 0) {
                if (i25 == 1) {
                    int[] iArr5 = this.gSBox;
                    int i26 = i24 * 2;
                    int[] iArr6 = this.gMDS0;
                    byte[][] bArr2 = f24984P;
                    iArr5[i26] = iArr6[(bArr2[0][i24] & 255) ^ b0(i19)];
                    this.gSBox[i26 + 1] = this.gMDS1[(bArr2[0][i24] & 255) ^ b1(i19)];
                    this.gSBox[i26 + 512] = this.gMDS2[(bArr2[1][i24] & 255) ^ b2(i19)];
                    this.gSBox[i26 + SignatureScheme.rsa_pkcs1_sha1] = this.gMDS3[(bArr2[1][i24] & 255) ^ b3(i19)];
                } else if (i25 == i21) {
                    i11 = i24;
                    i10 = i11;
                    i9 = i10;
                    i = i9;
                    int[] iArr7 = this.gSBox;
                    int i27 = i24 * 2;
                    int[] iArr8 = this.gMDS0;
                    byte[][] bArr3 = f24984P;
                    byte[] bArr4 = bArr3[0];
                    iArr7[i27] = iArr8[(bArr4[(bArr4[i10] & 255) ^ b0(i20)] & 255) ^ b0(i19)];
                    this.gSBox[i27 + 1] = this.gMDS1[(bArr3[0][(bArr3[1][i9] & 255) ^ b1(i20)] & 255) ^ b1(i19)];
                    this.gSBox[i27 + 512] = this.gMDS2[(bArr3[1][(bArr3[0][i] & 255) ^ b2(i20)] & 255) ^ b2(i19)];
                    int[] iArr9 = this.gSBox;
                    int i28 = i27 + SignatureScheme.rsa_pkcs1_sha1;
                    int[] iArr10 = this.gMDS3;
                    byte[] bArr5 = bArr3[1];
                    iArr9[i28] = iArr10[(bArr5[(bArr5[i11] & 255) ^ b3(i20)] & 255) ^ b3(i19)];
                } else if (i25 == 3) {
                    b32 = i24;
                    b02 = b32;
                    b12 = b02;
                    b22 = b12;
                }
                i24++;
                i21 = 2;
            } else {
                byte[][] bArr6 = f24984P;
                b02 = (bArr6[1][i24] & 255) ^ b0(i23);
                b12 = (bArr6[0][i24] & 255) ^ b1(i23);
                b22 = (bArr6[0][i24] & 255) ^ b2(i23);
                b32 = (bArr6[1][i24] & 255) ^ b3(i23);
            }
            byte[][] bArr7 = f24984P;
            i10 = (bArr7[1][b02] & 255) ^ b0(i22);
            i9 = (bArr7[1][b12] & 255) ^ b1(i22);
            i = (bArr7[0][b22] & 255) ^ b2(i22);
            i11 = (bArr7[0][b32] & 255) ^ b3(i22);
            int[] iArr72 = this.gSBox;
            int i272 = i24 * 2;
            int[] iArr82 = this.gMDS0;
            byte[][] bArr32 = f24984P;
            byte[] bArr42 = bArr32[0];
            iArr72[i272] = iArr82[(bArr42[(bArr42[i10] & 255) ^ b0(i20)] & 255) ^ b0(i19)];
            this.gSBox[i272 + 1] = this.gMDS1[(bArr32[0][(bArr32[1][i9] & 255) ^ b1(i20)] & 255) ^ b1(i19)];
            this.gSBox[i272 + 512] = this.gMDS2[(bArr32[1][(bArr32[0][i] & 255) ^ b2(i20)] & 255) ^ b2(i19)];
            int[] iArr92 = this.gSBox;
            int i282 = i272 + SignatureScheme.rsa_pkcs1_sha1;
            int[] iArr102 = this.gMDS3;
            byte[] bArr52 = bArr32[1];
            iArr92[i282] = iArr102[(bArr52[(bArr52[i11] & 255) ^ b3(i20)] & 255) ^ b3(i19)];
            i24++;
            i21 = 2;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Twofish";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to Twofish init - ", cipherParameters));
        }
        this.encrypting = z10;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        int length = key.length * 8;
        if (length != 128 && length != 192 && length != 256) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        this.k64Cnt = key.length / 8;
        setKey(key);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (this.workingKey == null) {
            throw new IllegalStateException("Twofish not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i9);
            return 16;
        }
        decryptBlock(bArr, i, bArr2, i9);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.workingKey;
        if (bArr != null) {
            setKey(bArr);
        }
    }
}
