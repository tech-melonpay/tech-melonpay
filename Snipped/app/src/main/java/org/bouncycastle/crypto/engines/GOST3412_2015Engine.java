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
import org.bouncycastle.util.Arrays;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class GOST3412_2015Engine implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    private static final byte[] PI = {-4, -18, -35, 17, -49, 110, 49, 22, -5, -60, -6, ISO7816.INS_PUT_DATA, 35, -59, 4, 77, -23, 119, -16, -37, -109, 46, -103, -70, 23, 54, -15, -69, 20, -51, 95, -63, -7, 24, 101, 90, ISO7816.INS_APPEND_RECORD, 92, -17, 33, ISOFileInfo.DATA_BYTES2, 28, 60, CVCAFile.CAR_TAG, ISOFileInfo.SECURITY_ATTR_EXP, 1, ISOFileInfo.CHANNEL_SECURITY, 79, 5, -124, 2, -82, -29, 106, -113, ISOFileInfo.f24316A0, 6, PassportService.SFI_DG11, -19, -104, Byte.MAX_VALUE, -44, -45, 31, -21, ISO7816.INS_DECREASE_STAMPED, ISO7816.INS_UNBLOCK_CHV, 81, -22, -56, 72, ISOFileInfo.AB, -14, ISO7816.INS_PSO, 104, -94, -3, 58, -50, -52, -75, ISO7816.INS_MANAGE_CHANNEL, 14, 86, 8, PassportService.SFI_DG12, 118, 18, -65, 114, 19, 71, -100, -73, 93, ISOFileInfo.FCI_EXT, 21, ISOFileInfo.f24317A1, -106, 41, 16, 123, -102, -57, -13, -111, 120, ISOFileInfo.FCI_BYTE, -99, -98, -78, ISO7816.INS_READ_BINARY2, ISO7816.INS_INCREASE, 117, 25, 61, -1, 53, ISOFileInfo.LCS_BYTE, 126, 109, 84, -58, ISOFileInfo.DATA_BYTES1, -61, -67, PassportService.SFI_DG13, 87, -33, -11, ISO7816.INS_CHANGE_CHV, -87, 62, -88, 67, -55, -41, 121, ISO7816.INS_UPDATE_BINARY, -10, 124, ISO7816.INS_MSE, -71, 3, ISO7816.INS_CREATE_FILE, PassportService.SFI_DG15, -20, -34, 122, -108, ISO7816.INS_READ_BINARY, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_UPDATE_RECORD, -24, 40, 80, 78, 51, 10, 74, -89, -105, 96, 115, PassportService.SFI_COM, 0, ISOFileInfo.FCP_BYTE, ISO7816.INS_REHABILITATE_CHV, 26, -72, 56, -126, ISOFileInfo.FMD_BYTE, -97, 38, 65, -83, 69, 70, -110, 39, 94, 85, 47, ISOFileInfo.SECURITY_ATTR_COMPACT, -93, ISOFileInfo.f24319A5, 125, 105, -43, -107, 59, 7, 88, ISO7816.INS_READ_RECORD2, 64, -122, -84, 29, -9, ISO7816.INS_DECREASE, 55, 107, ISO7816.INS_DELETE_FILE, -120, -39, -25, -119, -31, 27, ISOFileInfo.FILE_IDENTIFIER, 73, 76, 63, -8, -2, ISOFileInfo.ENV_TEMP_EF, 83, -86, -112, ISO7816.INS_GET_DATA, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.PROP_INFO, 97, ISO7816.INS_VERIFY, 113, 103, -92, 45, 43, 9, 91, -53, -101, 37, ISO7816.INS_WRITE_BINARY, -66, -27, 108, 82, 89, -90, 116, ISO7816.INS_WRITE_RECORD, -26, -12, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_GET_RESPONSE, -47, 102, -81, ISO7816.INS_ENVELOPE, 57, 75, 99, ISO7816.INS_READ_RECORD_STAMPED};
    private static final byte[] inversePI = {ISOFileInfo.f24319A5, 45, ISO7816.INS_INCREASE, -113, 14, ISO7816.INS_DECREASE, 56, ISO7816.INS_GET_RESPONSE, 84, -26, -98, 57, 85, 126, 82, -111, ISOFileInfo.FMD_BYTE, 3, 87, 90, 28, 96, 7, 24, 33, 114, -88, -47, 41, -58, -92, 63, ISO7816.INS_CREATE_FILE, 39, ISOFileInfo.ENV_TEMP_EF, PassportService.SFI_DG12, -126, -22, -82, ISO7816.INS_READ_BINARY_STAMPED, -102, 99, 73, -27, CVCAFile.CAR_TAG, ISO7816.INS_DELETE_FILE, 21, -73, -56, 6, ISO7816.INS_MANAGE_CHANNEL, -99, 65, 117, 25, -55, -86, -4, 77, -65, ISO7816.INS_PSO, 115, -124, -43, -61, -81, 43, -122, -89, ISO7816.INS_READ_BINARY2, -78, 91, 70, -45, -97, -3, -44, PassportService.SFI_DG15, -100, 47, -101, 67, -17, -39, 121, ISO7816.INS_READ_RECORD_STAMPED, 83, Byte.MAX_VALUE, -63, -16, 35, -25, 37, 94, -75, PassportService.SFI_COM, -94, -33, -90, -2, -84, ISO7816.INS_MSE, -7, ISO7816.INS_APPEND_RECORD, 74, PSSSigner.TRAILER_IMPLICIT, 53, ISO7816.INS_GET_DATA, -18, 120, 5, 107, 81, -31, 89, -93, -14, 113, 86, 17, 106, -119, -108, 101, ISOFileInfo.SECURITY_ATTR_COMPACT, -69, 119, 60, 123, 40, ISOFileInfo.AB, ISO7816.INS_WRITE_RECORD, 49, -34, -60, 95, -52, -49, 118, ISO7816.INS_UNBLOCK_CHV, -72, ISO7816.INS_LOAD_KEY_FILE, 46, 54, -37, 105, ISO7816.INS_READ_RECORD2, 20, -107, -66, ISOFileInfo.FCP_BYTE, ISOFileInfo.f24317A1, 59, 22, 102, -23, 92, 108, 109, -83, 55, 97, 75, -71, -29, -70, -15, ISOFileInfo.f24316A0, ISOFileInfo.PROP_INFO, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_PUT_DATA, 71, -59, ISO7816.INS_READ_BINARY, 51, -6, -106, ISOFileInfo.FCI_BYTE, 110, ISO7816.INS_ENVELOPE, -10, 80, -1, 93, -87, ISOFileInfo.CHANNEL_SECURITY, 23, 27, -105, 125, -20, 88, -9, 31, -5, 124, 9, PassportService.SFI_DG13, 122, 103, 69, ISOFileInfo.FCI_EXT, ISO7816.INS_UPDATE_RECORD, -24, 79, 29, 78, 4, -21, -8, -13, 62, 61, -67, ISOFileInfo.LCS_BYTE, -120, -35, -51, PassportService.SFI_DG11, 19, -104, 2, -109, ISOFileInfo.DATA_BYTES1, -112, ISO7816.INS_WRITE_BINARY, ISO7816.INS_CHANGE_CHV, ISO7816.INS_DECREASE_STAMPED, -53, -19, -12, -50, -103, 16, ISO7816.INS_REHABILITATE_CHV, 64, -110, 58, 1, 38, 18, 26, 72, 104, -11, ISOFileInfo.DATA_BYTES2, ISOFileInfo.SECURITY_ATTR_EXP, -57, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_VERIFY, 10, 8, 0, 76, -41, 116};
    private boolean forEncryption;
    private final byte[] lFactors = {-108, ISO7816.INS_VERIFY, ISOFileInfo.PROP_INFO, 16, ISO7816.INS_ENVELOPE, ISO7816.INS_GET_RESPONSE, 1, -5, 1, ISO7816.INS_GET_RESPONSE, ISO7816.INS_ENVELOPE, 16, ISOFileInfo.PROP_INFO, ISO7816.INS_VERIFY, -108, 1};
    private int KEY_LENGTH = 32;
    private int SUB_LENGTH = 32 / 2;
    private byte[][] subKeys = null;
    private byte[][] _gf_mul = init_gf256_mul_table();

    private void C(byte[] bArr, int i) {
        Arrays.clear(bArr);
        bArr[15] = (byte) i;
        L(bArr);
    }

    private void F(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] LSX = LSX(bArr, bArr2);
        X(LSX, bArr3);
        System.arraycopy(bArr2, 0, bArr3, 0, this.SUB_LENGTH);
        System.arraycopy(LSX, 0, bArr2, 0, this.SUB_LENGTH);
    }

    private void GOST3412_2015Func(byte[] bArr, int i, byte[] bArr2, int i9) {
        byte[][] bArr3;
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i, bArr4, 0, 16);
        int i10 = 9;
        if (this.forEncryption) {
            for (int i11 = 0; i11 < 9; i11++) {
                bArr4 = Arrays.copyOf(LSX(this.subKeys[i11], bArr4), 16);
            }
            X(bArr4, this.subKeys[9]);
        } else {
            while (true) {
                bArr3 = this.subKeys;
                if (i10 <= 0) {
                    break;
                }
                bArr4 = Arrays.copyOf(XSL(bArr3[i10], bArr4), 16);
                i10--;
            }
            X(bArr4, bArr3[0]);
        }
        System.arraycopy(bArr4, 0, bArr2, i9, 16);
    }

    private void L(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            R(bArr);
        }
    }

    private byte[] LSX(byte[] bArr, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        X(copyOf, bArr2);
        S(copyOf);
        L(copyOf);
        return copyOf;
    }

    private void R(byte[] bArr) {
        byte l10 = l(bArr);
        System.arraycopy(bArr, 0, bArr, 1, 15);
        bArr[0] = l10;
    }

    private void S(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = PI[unsignedByte(bArr[i])];
        }
    }

    private void X(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    private byte[] XSL(byte[] bArr, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        X(copyOf, bArr2);
        inverseL(copyOf);
        inverseS(copyOf);
        return copyOf;
    }

    private void generateSubKeys(byte[] bArr) {
        int i;
        if (bArr.length != this.KEY_LENGTH) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        this.subKeys = new byte[10][];
        for (int i9 = 0; i9 < 10; i9++) {
            this.subKeys[i9] = new byte[this.SUB_LENGTH];
        }
        int i10 = this.SUB_LENGTH;
        byte[] bArr2 = new byte[i10];
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        while (true) {
            i = this.SUB_LENGTH;
            if (i11 >= i) {
                break;
            }
            byte[][] bArr4 = this.subKeys;
            byte[] bArr5 = bArr4[0];
            byte b9 = bArr[i11];
            bArr2[i11] = b9;
            bArr5[i11] = b9;
            byte[] bArr6 = bArr4[1];
            byte b10 = bArr[i + i11];
            bArr3[i11] = b10;
            bArr6[i11] = b10;
            i11++;
        }
        byte[] bArr7 = new byte[i];
        for (int i12 = 1; i12 < 5; i12++) {
            for (int i13 = 1; i13 <= 8; i13++) {
                C(bArr7, ((i12 - 1) * 8) + i13);
                F(bArr7, bArr2, bArr3);
            }
            int i14 = i12 * 2;
            System.arraycopy(bArr2, 0, this.subKeys[i14], 0, this.SUB_LENGTH);
            System.arraycopy(bArr3, 0, this.subKeys[i14 + 1], 0, this.SUB_LENGTH);
        }
    }

    private static byte[][] init_gf256_mul_table() {
        byte[][] bArr = new byte[256][];
        for (int i = 0; i < 256; i++) {
            bArr[i] = new byte[256];
            for (int i9 = 0; i9 < 256; i9++) {
                bArr[i][i9] = kuz_mul_gf256_slow((byte) i, (byte) i9);
            }
        }
        return bArr;
    }

    private void inverseL(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            inverseR(bArr);
        }
    }

    private void inverseR(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 1, bArr2, 0, 15);
        bArr2[15] = bArr[0];
        byte l10 = l(bArr2);
        System.arraycopy(bArr, 1, bArr, 0, 15);
        bArr[15] = l10;
    }

    private void inverseS(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = inversePI[unsignedByte(bArr[i])];
        }
    }

    private static byte kuz_mul_gf256_slow(byte b9, byte b10) {
        byte b11 = 0;
        for (byte b12 = 0; b12 < 8 && b9 != 0 && b10 != 0; b12 = (byte) (b12 + 1)) {
            if ((b10 & 1) != 0) {
                b11 = (byte) (b11 ^ b9);
            }
            byte b13 = (byte) (b9 & ISOFileInfo.DATA_BYTES1);
            b9 = (byte) (b9 << 1);
            if (b13 != 0) {
                b9 = (byte) (b9 ^ 195);
            }
            b10 = (byte) (b10 >> 1);
        }
        return b11;
    }

    private byte l(byte[] bArr) {
        byte b9 = bArr[15];
        for (int i = 14; i >= 0; i--) {
            b9 = (byte) (b9 ^ this._gf_mul[unsignedByte(bArr[i])][unsignedByte(this.lFactors[i])]);
        }
        return b9;
    }

    private int unsignedByte(byte b9) {
        return b9 & 255;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "GOST3412_2015";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.forEncryption = z10;
            generateSubKeys(((KeyParameter) cipherParameters).getKey());
        } else if (cipherParameters != null) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to GOST3412_2015 init - ", cipherParameters));
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (this.subKeys == null) {
            throw new IllegalStateException("GOST3412_2015 engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        GOST3412_2015Func(bArr, i, bArr2, i9);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
