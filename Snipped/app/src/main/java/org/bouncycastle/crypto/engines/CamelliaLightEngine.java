package org.bouncycastle.crypto.engines;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StatelessProcessing;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class CamelliaLightEngine implements BlockCipher, StatelessProcessing {
    private static final int BLOCK_SIZE = 16;
    private static final int MASK8 = 255;
    private boolean _keyis128;
    private boolean initialized;
    private static final int[] SIGMA = {-1600231809, 1003262091, -1233459112, 1286239154, -957401297, -380665154, 1426019237, -237801700, 283453434, -563598051, -1336506174, -1276722691};
    private static final byte[] SBOX1 = {ISO7816.INS_MANAGE_CHANNEL, -126, ISO7816.INS_UNBLOCK_CHV, -20, ISO7816.INS_READ_RECORD2, 39, ISO7816.INS_GET_RESPONSE, -27, ISO7816.INS_DELETE_FILE, ISOFileInfo.PROP_INFO, 87, 53, -22, PassportService.SFI_DG12, -82, 65, 35, -17, 107, -109, 69, 25, ISOFileInfo.f24319A5, 33, -19, 14, 79, 78, 29, 101, -110, -67, -122, -72, -81, -113, 124, -21, 31, -50, 62, ISO7816.INS_DECREASE, ISO7816.INS_UPDATE_RECORD, 95, 94, -59, PassportService.SFI_DG11, 26, -90, -31, 57, ISO7816.INS_GET_DATA, -43, 71, 93, 61, -39, 1, 90, ISO7816.INS_UPDATE_BINARY, 81, 86, 108, 77, ISOFileInfo.SECURITY_ATTR_EXP, PassportService.SFI_DG13, -102, 102, -5, -52, ISO7816.INS_READ_BINARY, 45, 116, 18, 43, ISO7816.INS_VERIFY, -16, ISO7816.INS_READ_BINARY2, -124, -103, -33, 76, -53, ISO7816.INS_ENVELOPE, ISO7816.INS_DECREASE_STAMPED, 126, 118, 5, 109, -73, -87, 49, -47, 23, 4, -41, 20, 88, 58, 97, -34, 27, 17, 28, ISO7816.INS_INCREASE, PassportService.SFI_DG15, -100, 22, 83, 24, -14, ISO7816.INS_MSE, -2, ISO7816.INS_REHABILITATE_CHV, -49, -78, -61, -75, 122, -111, ISO7816.INS_CHANGE_CHV, 8, -24, -88, 96, -4, 105, 80, -86, ISO7816.INS_WRITE_BINARY, ISOFileInfo.f24316A0, 125, ISOFileInfo.f24317A1, -119, ISOFileInfo.FCP_BYTE, -105, 84, 91, PassportService.SFI_COM, -107, ISO7816.INS_CREATE_FILE, -1, ISOFileInfo.FMD_BYTE, ISO7816.INS_WRITE_RECORD, 16, -60, 0, 72, -93, -9, 117, -37, ISOFileInfo.LCS_BYTE, 3, -26, ISO7816.INS_PUT_DATA, 9, 63, -35, -108, ISOFileInfo.FCI_EXT, 92, ISOFileInfo.FILE_IDENTIFIER, 2, -51, 74, -112, 51, 115, 103, -10, -13, -99, Byte.MAX_VALUE, -65, ISO7816.INS_APPEND_RECORD, 82, -101, ISO7816.INS_LOAD_KEY_FILE, 38, -56, 55, -58, 59, ISOFileInfo.DATA_BYTES2, -106, ISOFileInfo.FCI_BYTE, 75, 19, -66, 99, 46, -23, 121, -89, ISOFileInfo.SECURITY_ATTR_COMPACT, -97, 110, PSSSigner.TRAILER_IMPLICIT, ISOFileInfo.CHANNEL_SECURITY, 41, -11, -7, ISO7816.INS_READ_RECORD_STAMPED, 47, -3, ISO7816.INS_READ_BINARY_STAMPED, 89, 120, -104, 6, 106, -25, 70, 113, -70, -44, 37, ISOFileInfo.AB, CVCAFile.CAR_TAG, -120, -94, ISOFileInfo.ENV_TEMP_EF, -6, 114, 7, -71, 85, -8, -18, -84, 10, 54, 73, ISO7816.INS_PSO, 104, 60, 56, -15, -92, 64, 40, -45, 123, -69, -55, 67, -63, 21, -29, -83, -12, 119, -57, ISOFileInfo.DATA_BYTES1, -98};
    private int[] subkey = new int[96];
    private int[] kw = new int[8];
    private int[] ke = new int[12];

    private int bytes2int(byte[] bArr, int i) {
        int i9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i9 = (i9 << 8) + (bArr[i10 + i] & 255);
        }
        return i9;
    }

    private void camelliaF2(int[] iArr, int[] iArr2, int i) {
        int i9 = iArr[0] ^ iArr2[i];
        int sbox4 = sbox4(i9 & 255) | (sbox3((i9 >>> 8) & 255) << 8) | (sbox2((i9 >>> 16) & 255) << 16);
        byte[] bArr = SBOX1;
        int i10 = ((bArr[(i9 >>> 24) & 255] & 255) << 24) | sbox4;
        int i11 = iArr[1] ^ iArr2[i + 1];
        int leftRotate = leftRotate((sbox2((i11 >>> 24) & 255) << 24) | (bArr[i11 & 255] & 255) | (sbox4((i11 >>> 8) & 255) << 8) | (sbox3((i11 >>> 16) & 255) << 16), 8);
        int i12 = i10 ^ leftRotate;
        int leftRotate2 = leftRotate(leftRotate, 8) ^ i12;
        int rightRotate = rightRotate(i12, 8) ^ leftRotate2;
        iArr[2] = (leftRotate(leftRotate2, 16) ^ rightRotate) ^ iArr[2];
        iArr[3] = leftRotate(rightRotate, 8) ^ iArr[3];
        int i13 = iArr[2] ^ iArr2[i + 2];
        int sbox42 = ((bArr[(i13 >>> 24) & 255] & 255) << 24) | sbox4(i13 & 255) | (sbox3((i13 >>> 8) & 255) << 8) | (sbox2((i13 >>> 16) & 255) << 16);
        int i14 = iArr2[i + 3] ^ iArr[3];
        int leftRotate3 = leftRotate((sbox2((i14 >>> 24) & 255) << 24) | (bArr[i14 & 255] & 255) | (sbox4((i14 >>> 8) & 255) << 8) | (sbox3((i14 >>> 16) & 255) << 16), 8);
        int i15 = sbox42 ^ leftRotate3;
        int leftRotate4 = leftRotate(leftRotate3, 8) ^ i15;
        int rightRotate2 = rightRotate(i15, 8) ^ leftRotate4;
        iArr[0] = (leftRotate(leftRotate4, 16) ^ rightRotate2) ^ iArr[0];
        iArr[1] = iArr[1] ^ leftRotate(rightRotate2, 8);
    }

    private void camelliaFLs(int[] iArr, int[] iArr2, int i) {
        int leftRotate = iArr[1] ^ leftRotate(iArr[0] & iArr2[i], 1);
        iArr[1] = leftRotate;
        iArr[0] = (leftRotate | iArr2[i + 1]) ^ iArr[0];
        int i9 = iArr[2];
        int i10 = iArr2[i + 3];
        int i11 = iArr[3];
        int i12 = i9 ^ (i10 | i11);
        iArr[2] = i12;
        iArr[3] = leftRotate(iArr2[i + 2] & i12, 1) ^ i11;
    }

    private static void decroldq(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11 = i10 + 2;
        int i12 = i9 + 1;
        int i13 = 32 - i;
        iArr2[i11] = (iArr[i9] << i) | (iArr[i12] >>> i13);
        int i14 = i10 + 3;
        int i15 = i9 + 2;
        iArr2[i14] = (iArr[i12] << i) | (iArr[i15] >>> i13);
        int i16 = i9 + 3;
        iArr2[i10] = (iArr[i15] << i) | (iArr[i16] >>> i13);
        int i17 = i10 + 1;
        iArr2[i17] = (iArr[i16] << i) | (iArr[i9] >>> i13);
        iArr[i9] = iArr2[i11];
        iArr[i12] = iArr2[i14];
        iArr[i15] = iArr2[i10];
        iArr[i16] = iArr2[i17];
    }

    private static void decroldqo32(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11 = i10 + 2;
        int i12 = i9 + 1;
        int i13 = i - 32;
        int i14 = i9 + 2;
        int i15 = 64 - i;
        iArr2[i11] = (iArr[i12] << i13) | (iArr[i14] >>> i15);
        int i16 = i10 + 3;
        int i17 = i9 + 3;
        iArr2[i16] = (iArr[i14] << i13) | (iArr[i17] >>> i15);
        iArr2[i10] = (iArr[i17] << i13) | (iArr[i9] >>> i15);
        int i18 = i10 + 1;
        iArr2[i18] = (iArr[i12] >>> i15) | (iArr[i9] << i13);
        iArr[i9] = iArr2[i11];
        iArr[i12] = iArr2[i16];
        iArr[i14] = iArr2[i10];
        iArr[i17] = iArr2[i18];
    }

    private void int2bytes(int i, byte[] bArr, int i9) {
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[(3 - i10) + i9] = (byte) i;
            i >>>= 8;
        }
    }

    private byte lRot8(byte b9, int i) {
        return (byte) (((b9 & 255) >>> (8 - i)) | (b9 << i));
    }

    private static int leftRotate(int i, int i9) {
        return (i << i9) + (i >>> (32 - i9));
    }

    private int processBlock128(byte[] bArr, int i, byte[] bArr2, int i9) {
        int[] iArr = new int[4];
        for (int i10 = 0; i10 < 4; i10++) {
            iArr[i10] = bytes2int(bArr, (i10 * 4) + i) ^ this.kw[i10];
        }
        camelliaF2(iArr, this.subkey, 0);
        camelliaF2(iArr, this.subkey, 4);
        camelliaF2(iArr, this.subkey, 8);
        camelliaFLs(iArr, this.ke, 0);
        camelliaF2(iArr, this.subkey, 12);
        camelliaF2(iArr, this.subkey, 16);
        camelliaF2(iArr, this.subkey, 20);
        camelliaFLs(iArr, this.ke, 4);
        camelliaF2(iArr, this.subkey, 24);
        camelliaF2(iArr, this.subkey, 28);
        camelliaF2(iArr, this.subkey, 32);
        int i11 = iArr[2];
        int[] iArr2 = this.kw;
        int i12 = iArr2[4] ^ i11;
        iArr[2] = i12;
        iArr[3] = iArr[3] ^ iArr2[5];
        iArr[0] = iArr[0] ^ iArr2[6];
        iArr[1] = iArr2[7] ^ iArr[1];
        int2bytes(i12, bArr2, i9);
        int2bytes(iArr[3], bArr2, i9 + 4);
        int2bytes(iArr[0], bArr2, i9 + 8);
        int2bytes(iArr[1], bArr2, i9 + 12);
        return 16;
    }

    private int processBlock192or256(byte[] bArr, int i, byte[] bArr2, int i9) {
        int[] iArr = new int[4];
        for (int i10 = 0; i10 < 4; i10++) {
            iArr[i10] = bytes2int(bArr, (i10 * 4) + i) ^ this.kw[i10];
        }
        camelliaF2(iArr, this.subkey, 0);
        camelliaF2(iArr, this.subkey, 4);
        camelliaF2(iArr, this.subkey, 8);
        camelliaFLs(iArr, this.ke, 0);
        camelliaF2(iArr, this.subkey, 12);
        camelliaF2(iArr, this.subkey, 16);
        camelliaF2(iArr, this.subkey, 20);
        camelliaFLs(iArr, this.ke, 4);
        camelliaF2(iArr, this.subkey, 24);
        camelliaF2(iArr, this.subkey, 28);
        camelliaF2(iArr, this.subkey, 32);
        camelliaFLs(iArr, this.ke, 8);
        camelliaF2(iArr, this.subkey, 36);
        camelliaF2(iArr, this.subkey, 40);
        camelliaF2(iArr, this.subkey, 44);
        int i11 = iArr[2];
        int[] iArr2 = this.kw;
        int i12 = i11 ^ iArr2[4];
        iArr[2] = i12;
        iArr[3] = iArr[3] ^ iArr2[5];
        iArr[0] = iArr[0] ^ iArr2[6];
        iArr[1] = iArr2[7] ^ iArr[1];
        int2bytes(i12, bArr2, i9);
        int2bytes(iArr[3], bArr2, i9 + 4);
        int2bytes(iArr[0], bArr2, i9 + 8);
        int2bytes(iArr[1], bArr2, i9 + 12);
        return 16;
    }

    private static int rightRotate(int i, int i9) {
        return (i >>> i9) + (i << (32 - i9));
    }

    private static void roldq(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11 = i9 + 1;
        int i12 = 32 - i;
        iArr2[i10] = (iArr[i9] << i) | (iArr[i11] >>> i12);
        int i13 = i10 + 1;
        int i14 = i9 + 2;
        iArr2[i13] = (iArr[i11] << i) | (iArr[i14] >>> i12);
        int i15 = i10 + 2;
        int i16 = i9 + 3;
        iArr2[i15] = (iArr[i14] << i) | (iArr[i16] >>> i12);
        int i17 = i10 + 3;
        iArr2[i17] = (iArr[i16] << i) | (iArr[i9] >>> i12);
        iArr[i9] = iArr2[i10];
        iArr[i11] = iArr2[i13];
        iArr[i14] = iArr2[i15];
        iArr[i16] = iArr2[i17];
    }

    private static void roldqo32(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11 = i9 + 1;
        int i12 = i - 32;
        int i13 = i9 + 2;
        int i14 = 64 - i;
        iArr2[i10] = (iArr[i11] << i12) | (iArr[i13] >>> i14);
        int i15 = i10 + 1;
        int i16 = i9 + 3;
        iArr2[i15] = (iArr[i13] << i12) | (iArr[i16] >>> i14);
        int i17 = i10 + 2;
        iArr2[i17] = (iArr[i16] << i12) | (iArr[i9] >>> i14);
        int i18 = i10 + 3;
        iArr2[i18] = (iArr[i11] >>> i14) | (iArr[i9] << i12);
        iArr[i9] = iArr2[i10];
        iArr[i11] = iArr2[i15];
        iArr[i13] = iArr2[i17];
        iArr[i16] = iArr2[i18];
    }

    private int sbox2(int i) {
        return lRot8(SBOX1[i], 1) & 255;
    }

    private int sbox3(int i) {
        return lRot8(SBOX1[i], 7) & 255;
    }

    private int sbox4(int i) {
        return SBOX1[lRot8((byte) i, 1) & 255] & 255;
    }

    private void setKey(boolean z10, byte[] bArr) {
        int[] iArr = new int[8];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        int length = bArr.length;
        if (length != 16) {
            if (length == 24) {
                iArr[0] = bytes2int(bArr, 0);
                iArr[1] = bytes2int(bArr, 4);
                iArr[2] = bytes2int(bArr, 8);
                iArr[3] = bytes2int(bArr, 12);
                iArr[4] = bytes2int(bArr, 16);
                int bytes2int = bytes2int(bArr, 20);
                iArr[5] = bytes2int;
                iArr[6] = ~iArr[4];
                iArr[7] = ~bytes2int;
            } else {
                if (length != 32) {
                    throw new IllegalArgumentException("key sizes are only 16/24/32 bytes.");
                }
                iArr[0] = bytes2int(bArr, 0);
                iArr[1] = bytes2int(bArr, 4);
                iArr[2] = bytes2int(bArr, 8);
                iArr[3] = bytes2int(bArr, 12);
                iArr[4] = bytes2int(bArr, 16);
                iArr[5] = bytes2int(bArr, 20);
                iArr[6] = bytes2int(bArr, 24);
                iArr[7] = bytes2int(bArr, 28);
            }
            this._keyis128 = false;
        } else {
            this._keyis128 = true;
            iArr[0] = bytes2int(bArr, 0);
            iArr[1] = bytes2int(bArr, 4);
            iArr[2] = bytes2int(bArr, 8);
            iArr[3] = bytes2int(bArr, 12);
            iArr[7] = 0;
            iArr[6] = 0;
            iArr[5] = 0;
            iArr[4] = 0;
        }
        for (int i = 0; i < 4; i++) {
            iArr2[i] = iArr[i] ^ iArr[i + 4];
        }
        camelliaF2(iArr2, SIGMA, 0);
        for (int i9 = 0; i9 < 4; i9++) {
            iArr2[i9] = iArr2[i9] ^ iArr[i9];
        }
        camelliaF2(iArr2, SIGMA, 4);
        if (this._keyis128) {
            int[] iArr5 = this.kw;
            if (z10) {
                iArr5[0] = iArr[0];
                iArr5[1] = iArr[1];
                iArr5[2] = iArr[2];
                iArr5[3] = iArr[3];
                roldq(15, iArr, 0, this.subkey, 4);
                roldq(30, iArr, 0, this.subkey, 12);
                roldq(15, iArr, 0, iArr4, 0);
                int[] iArr6 = this.subkey;
                iArr6[18] = iArr4[2];
                iArr6[19] = iArr4[3];
                roldq(17, iArr, 0, this.ke, 4);
                roldq(17, iArr, 0, this.subkey, 24);
                roldq(17, iArr, 0, this.subkey, 32);
                int[] iArr7 = this.subkey;
                iArr7[0] = iArr2[0];
                iArr7[1] = iArr2[1];
                iArr7[2] = iArr2[2];
                iArr7[3] = iArr2[3];
                roldq(15, iArr2, 0, iArr7, 8);
                roldq(15, iArr2, 0, this.ke, 0);
                roldq(15, iArr2, 0, iArr4, 0);
                int[] iArr8 = this.subkey;
                iArr8[16] = iArr4[0];
                iArr8[17] = iArr4[1];
                roldq(15, iArr2, 0, iArr8, 20);
                roldqo32(34, iArr2, 0, this.subkey, 28);
                roldq(17, iArr2, 0, this.kw, 4);
                return;
            }
            iArr5[4] = iArr[0];
            iArr5[5] = iArr[1];
            iArr5[6] = iArr[2];
            iArr5[7] = iArr[3];
            decroldq(15, iArr, 0, this.subkey, 28);
            decroldq(30, iArr, 0, this.subkey, 20);
            decroldq(15, iArr, 0, iArr4, 0);
            int[] iArr9 = this.subkey;
            iArr9[16] = iArr4[0];
            iArr9[17] = iArr4[1];
            decroldq(17, iArr, 0, this.ke, 0);
            decroldq(17, iArr, 0, this.subkey, 8);
            decroldq(17, iArr, 0, this.subkey, 0);
            int[] iArr10 = this.subkey;
            iArr10[34] = iArr2[0];
            iArr10[35] = iArr2[1];
            iArr10[32] = iArr2[2];
            iArr10[33] = iArr2[3];
            decroldq(15, iArr2, 0, iArr10, 24);
            decroldq(15, iArr2, 0, this.ke, 4);
            decroldq(15, iArr2, 0, iArr4, 0);
            int[] iArr11 = this.subkey;
            iArr11[18] = iArr4[2];
            iArr11[19] = iArr4[3];
            decroldq(15, iArr2, 0, iArr11, 12);
            decroldqo32(34, iArr2, 0, this.subkey, 4);
            roldq(17, iArr2, 0, this.kw, 0);
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            iArr3[i10] = iArr2[i10] ^ iArr[i10 + 4];
        }
        camelliaF2(iArr3, SIGMA, 8);
        int[] iArr12 = this.kw;
        if (z10) {
            iArr12[0] = iArr[0];
            iArr12[1] = iArr[1];
            iArr12[2] = iArr[2];
            iArr12[3] = iArr[3];
            roldqo32(45, iArr, 0, this.subkey, 16);
            roldq(15, iArr, 0, this.ke, 4);
            roldq(17, iArr, 0, this.subkey, 32);
            roldqo32(34, iArr, 0, this.subkey, 44);
            roldq(15, iArr, 4, this.subkey, 4);
            roldq(15, iArr, 4, this.ke, 0);
            roldq(30, iArr, 4, this.subkey, 24);
            roldqo32(34, iArr, 4, this.subkey, 36);
            roldq(15, iArr2, 0, this.subkey, 8);
            roldq(30, iArr2, 0, this.subkey, 20);
            int[] iArr13 = this.ke;
            iArr13[8] = iArr2[1];
            iArr13[9] = iArr2[2];
            iArr13[10] = iArr2[3];
            iArr13[11] = iArr2[0];
            roldqo32(49, iArr2, 0, this.subkey, 40);
            int[] iArr14 = this.subkey;
            iArr14[0] = iArr3[0];
            iArr14[1] = iArr3[1];
            iArr14[2] = iArr3[2];
            iArr14[3] = iArr3[3];
            roldq(30, iArr3, 0, iArr14, 12);
            roldq(30, iArr3, 0, this.subkey, 28);
            roldqo32(51, iArr3, 0, this.kw, 4);
            return;
        }
        iArr12[4] = iArr[0];
        iArr12[5] = iArr[1];
        iArr12[6] = iArr[2];
        iArr12[7] = iArr[3];
        decroldqo32(45, iArr, 0, this.subkey, 28);
        decroldq(15, iArr, 0, this.ke, 4);
        decroldq(17, iArr, 0, this.subkey, 12);
        decroldqo32(34, iArr, 0, this.subkey, 0);
        decroldq(15, iArr, 4, this.subkey, 40);
        decroldq(15, iArr, 4, this.ke, 8);
        decroldq(30, iArr, 4, this.subkey, 20);
        decroldqo32(34, iArr, 4, this.subkey, 8);
        decroldq(15, iArr2, 0, this.subkey, 36);
        decroldq(30, iArr2, 0, this.subkey, 24);
        int[] iArr15 = this.ke;
        iArr15[2] = iArr2[1];
        iArr15[3] = iArr2[2];
        iArr15[0] = iArr2[3];
        iArr15[1] = iArr2[0];
        decroldqo32(49, iArr2, 0, this.subkey, 4);
        int[] iArr16 = this.subkey;
        iArr16[46] = iArr3[0];
        iArr16[47] = iArr3[1];
        iArr16[44] = iArr3[2];
        iArr16[45] = iArr3[3];
        decroldq(30, iArr3, 0, iArr16, 32);
        decroldq(30, iArr3, 0, this.subkey, 16);
        roldqo32(51, iArr3, 0, this.kw, 0);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Camellia";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        }
        setKey(z10, ((KeyParameter) cipherParameters).getKey());
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.StatelessProcessing
    public BlockCipher newInstance() {
        return new CamelliaLightEngine();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (!this.initialized) {
            throw new IllegalStateException("Camellia is not initialized");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + 16 <= bArr2.length) {
            return this._keyis128 ? processBlock128(bArr, i, bArr2, i9) : processBlock192or256(bArr, i, bArr2, i9);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
