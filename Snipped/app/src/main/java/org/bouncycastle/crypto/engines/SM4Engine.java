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
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class SM4Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private final int[] X = new int[4];
    private int[] rk;
    private static final byte[] Sbox = {ISO7816.INS_UPDATE_BINARY, -112, -23, -2, -52, -31, 61, -73, 22, ISO7816.INS_READ_RECORD_STAMPED, 20, ISO7816.INS_ENVELOPE, 40, -5, ISO7816.INS_UNBLOCK_CHV, 5, 43, 103, -102, 118, ISO7816.INS_PSO, -66, 4, -61, -86, ISO7816.INS_REHABILITATE_CHV, 19, 38, 73, -122, 6, -103, -100, CVCAFile.CAR_TAG, 80, -12, -111, -17, -104, 122, 51, 84, PassportService.SFI_DG11, 67, -19, -49, -84, ISOFileInfo.FCP_BYTE, ISO7816.INS_DELETE_FILE, ISO7816.INS_READ_RECORD2, 28, -87, -55, 8, -24, -107, ISOFileInfo.DATA_BYTES1, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, ISOFileInfo.FILE_IDENTIFIER, 89, 60, 25, -26, ISOFileInfo.PROP_INFO, 79, -88, 104, 107, ISOFileInfo.DATA_BYTES2, -78, 113, ISOFileInfo.FMD_BYTE, ISO7816.INS_PUT_DATA, ISOFileInfo.SECURITY_ATTR_EXP, -8, -21, PassportService.SFI_DG15, 75, ISO7816.INS_MANAGE_CHANNEL, 86, -99, 53, PassportService.SFI_COM, ISO7816.INS_CHANGE_CHV, 14, 94, 99, 88, -47, -94, 37, ISO7816.INS_MSE, 124, 59, 1, 33, 120, ISOFileInfo.FCI_EXT, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, ISOFileInfo.f24316A0, -60, -56, -98, -22, -65, ISOFileInfo.LCS_BYTE, ISO7816.INS_WRITE_RECORD, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, ISOFileInfo.f24317A1, ISO7816.INS_CREATE_FILE, -82, 93, -92, -101, ISO7816.INS_DECREASE_STAMPED, 26, 85, -83, -109, ISO7816.INS_INCREASE, ISO7816.INS_DECREASE, -11, ISOFileInfo.SECURITY_ATTR_COMPACT, ISO7816.INS_READ_BINARY2, -29, 29, -10, ISO7816.INS_APPEND_RECORD, 46, -126, 102, ISO7816.INS_GET_DATA, 96, ISO7816.INS_GET_RESPONSE, 41, 35, ISOFileInfo.AB, PassportService.SFI_DG13, 83, 78, ISOFileInfo.FCI_BYTE, -43, -37, 55, 69, -34, -3, ISOFileInfo.CHANNEL_SECURITY, 47, 3, -1, 106, 114, 109, 108, 91, 81, ISOFileInfo.ENV_TEMP_EF, 27, -81, -110, -69, -35, PSSSigner.TRAILER_IMPLICIT, Byte.MAX_VALUE, 17, -39, 92, 65, 31, 16, 90, ISO7816.INS_LOAD_KEY_FILE, 10, -63, 49, -120, ISOFileInfo.f24319A5, -51, 123, -67, 45, 116, ISO7816.INS_WRITE_BINARY, 18, -72, -27, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_READ_BINARY, -119, 105, -105, 74, PassportService.SFI_DG12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, ISO7816.INS_UPDATE_RECORD, 77, ISO7816.INS_VERIFY, 121, -18, 95, 62, -41, -53, 57, 72};
    private static final int[] CK = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};
    private static final int[] FK = {-1548633402, 1453994832, 1736282519, -1301273892};

    private int F0(int[] iArr, int i) {
        return T((iArr[3] ^ (iArr[1] ^ iArr[2])) ^ i) ^ iArr[0];
    }

    private int F1(int[] iArr, int i) {
        return T((iArr[0] ^ (iArr[2] ^ iArr[3])) ^ i) ^ iArr[1];
    }

    private int F2(int[] iArr, int i) {
        return T((iArr[1] ^ (iArr[3] ^ iArr[0])) ^ i) ^ iArr[2];
    }

    private int F3(int[] iArr, int i) {
        return T((iArr[2] ^ (iArr[0] ^ iArr[1])) ^ i) ^ iArr[3];
    }

    private int L(int i) {
        return rotateLeft(i, 24) ^ (((rotateLeft(i, 2) ^ i) ^ rotateLeft(i, 10)) ^ rotateLeft(i, 18));
    }

    private int L_ap(int i) {
        return rotateLeft(i, 23) ^ (rotateLeft(i, 13) ^ i);
    }

    private int T(int i) {
        return L(tau(i));
    }

    private int T_ap(int i) {
        return L_ap(tau(i));
    }

    private int[] expandKey(boolean z10, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {Pack.bigEndianToInt(bArr, 0), Pack.bigEndianToInt(bArr, 4), Pack.bigEndianToInt(bArr, 8), Pack.bigEndianToInt(bArr, 12)};
        int i = iArr2[0];
        int[] iArr3 = FK;
        int[] iArr4 = {i ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z10) {
            int i9 = iArr4[0];
            int i10 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr5 = CK;
            int T_ap = i9 ^ T_ap(i10 ^ iArr5[0]);
            iArr[0] = T_ap;
            int T_ap2 = T_ap((T_ap ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[1] = T_ap2;
            int T_ap3 = T_ap((T_ap2 ^ (iArr4[3] ^ iArr[0])) ^ iArr5[2]) ^ iArr4[2];
            iArr[2] = T_ap3;
            iArr[3] = T_ap((T_ap3 ^ (iArr[0] ^ iArr[1])) ^ iArr5[3]) ^ iArr4[3];
            for (int i11 = 4; i11 < 32; i11++) {
                iArr[i11] = iArr[i11 - 4] ^ T_ap(((iArr[i11 - 3] ^ iArr[i11 - 2]) ^ iArr[i11 - 1]) ^ CK[i11]);
            }
        } else {
            int i12 = iArr4[0];
            int i13 = (iArr4[1] ^ iArr4[2]) ^ iArr4[3];
            int[] iArr6 = CK;
            int T_ap4 = i12 ^ T_ap(i13 ^ iArr6[0]);
            iArr[31] = T_ap4;
            int T_ap5 = T_ap((T_ap4 ^ (iArr4[2] ^ iArr4[3])) ^ iArr6[1]) ^ iArr4[1];
            iArr[30] = T_ap5;
            int T_ap6 = T_ap((T_ap5 ^ (iArr4[3] ^ iArr[31])) ^ iArr6[2]) ^ iArr4[2];
            iArr[29] = T_ap6;
            iArr[28] = T_ap((T_ap6 ^ (iArr[31] ^ iArr[30])) ^ iArr6[3]) ^ iArr4[3];
            for (int i14 = 27; i14 >= 0; i14--) {
                iArr[i14] = iArr[i14 + 4] ^ T_ap(((iArr[i14 + 3] ^ iArr[i14 + 2]) ^ iArr[i14 + 1]) ^ CK[31 - i14]);
            }
        }
        return iArr;
    }

    private int rotateLeft(int i, int i9) {
        return (i >>> (-i9)) | (i << i9);
    }

    private int tau(int i) {
        byte[] bArr = Sbox;
        return (bArr[i & 255] & 255) | ((bArr[(i >> 24) & 255] & 255) << 24) | ((bArr[(i >> 16) & 255] & 255) << 16) | ((bArr[(i >> 8) & 255] & 255) << 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to SM4 init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("SM4 requires a 128 bit key");
        }
        this.rk = expandKey(z10, key);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (this.rk == null) {
            throw new IllegalStateException("SM4 not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        this.X[0] = Pack.bigEndianToInt(bArr, i);
        this.X[1] = Pack.bigEndianToInt(bArr, i + 4);
        this.X[2] = Pack.bigEndianToInt(bArr, i + 8);
        this.X[3] = Pack.bigEndianToInt(bArr, i + 12);
        for (int i10 = 0; i10 < 32; i10 += 4) {
            int[] iArr = this.X;
            iArr[0] = F0(iArr, this.rk[i10]);
            int[] iArr2 = this.X;
            iArr2[1] = F1(iArr2, this.rk[i10 + 1]);
            int[] iArr3 = this.X;
            iArr3[2] = F2(iArr3, this.rk[i10 + 2]);
            int[] iArr4 = this.X;
            iArr4[3] = F3(iArr4, this.rk[i10 + 3]);
        }
        Pack.intToBigEndian(this.X[3], bArr2, i9);
        Pack.intToBigEndian(this.X[2], bArr2, i9 + 4);
        Pack.intToBigEndian(this.X[1], bArr2, i9 + 8);
        Pack.intToBigEndian(this.X[0], bArr2, i9 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
