package org.bouncycastle.crypto.engines;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Memoable;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class Zuc128CoreEngine implements StreamCipher, Memoable {
    private final int[] BRC;

    /* renamed from: F, reason: collision with root package name */
    private final int[] f24990F;
    private final int[] LFSR;
    private final byte[] keyStream;
    private int theIndex;
    private int theIterations;
    private Zuc128CoreEngine theResetState;

    /* renamed from: S0, reason: collision with root package name */
    private static final byte[] f24988S0 = {62, 114, 91, 71, ISO7816.INS_GET_DATA, ISO7816.INS_CREATE_FILE, 0, 51, 4, -47, 84, -104, 9, -71, 109, -53, 123, 27, -7, ISO7816.INS_INCREASE, -81, -99, 106, ISOFileInfo.f24319A5, -72, 45, -4, 29, 8, 83, 3, -112, 77, 78, -124, -103, ISO7816.INS_DELETE_FILE, -50, -39, -111, -35, ISO7816.INS_READ_RECORD_STAMPED, ISOFileInfo.PROP_INFO, 72, ISOFileInfo.SECURITY_ATTR_EXP, 41, 110, -84, -51, -63, -8, PassportService.SFI_COM, 115, 67, 105, -58, -75, -67, -3, 57, 99, ISO7816.INS_VERIFY, -44, 56, 118, 125, -78, -89, -49, -19, 87, -59, -13, ISO7816.INS_UNBLOCK_CHV, -69, 20, 33, 6, 85, -101, -29, -17, 94, 49, 79, Byte.MAX_VALUE, 90, -92, PassportService.SFI_DG13, -126, 81, 73, 95, -70, 88, 28, 74, 22, -43, 23, -88, -110, ISO7816.INS_CHANGE_CHV, 31, ISOFileInfo.SECURITY_ATTR_COMPACT, -1, ISO7816.INS_LOAD_KEY_FILE, -82, 46, 1, -45, -83, 59, 75, ISO7816.INS_PUT_DATA, 70, -21, -55, -34, -102, -113, ISOFileInfo.FCI_EXT, -41, 58, ISOFileInfo.DATA_BYTES1, ISOFileInfo.FCI_BYTE, 47, -56, ISO7816.INS_READ_BINARY2, ISO7816.INS_READ_BINARY_STAMPED, 55, -9, 10, ISO7816.INS_MSE, 19, 40, 124, -52, 60, -119, -57, -61, -106, 86, 7, -65, 126, -16, PassportService.SFI_DG11, 43, -105, 82, 53, 65, 121, 97, -90, 76, 16, -2, PSSSigner.TRAILER_IMPLICIT, 38, -107, -120, ISOFileInfo.LCS_BYTE, ISO7816.INS_READ_BINARY, -93, -5, ISO7816.INS_GET_RESPONSE, 24, -108, -14, -31, -27, -23, 93, ISO7816.INS_WRITE_BINARY, ISO7816.INS_UPDATE_RECORD, 17, 102, ISOFileInfo.FMD_BYTE, 92, -20, 89, CVCAFile.CAR_TAG, 117, 18, -11, 116, -100, -86, 35, 14, -122, ISOFileInfo.AB, -66, ISO7816.INS_PSO, 2, -25, 103, -26, ISO7816.INS_REHABILITATE_CHV, -94, 108, ISO7816.INS_ENVELOPE, -109, -97, -15, -10, -6, 54, ISO7816.INS_WRITE_RECORD, 80, 104, -98, ISOFileInfo.FCP_BYTE, 113, 21, 61, ISO7816.INS_UPDATE_BINARY, 64, -60, ISO7816.INS_APPEND_RECORD, PassportService.SFI_DG15, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.FILE_IDENTIFIER, 119, 107, 37, 5, 63, PassportService.SFI_DG12, ISO7816.INS_DECREASE, -22, ISO7816.INS_MANAGE_CHANNEL, -73, ISOFileInfo.f24317A1, -24, -87, 101, ISOFileInfo.ENV_TEMP_EF, 39, 26, -37, ISOFileInfo.DATA_BYTES2, ISO7816.INS_READ_RECORD2, ISOFileInfo.f24316A0, -12, 69, 122, 25, -33, -18, 120, ISO7816.INS_DECREASE_STAMPED, 96};

    /* renamed from: S1, reason: collision with root package name */
    private static final byte[] f24989S1 = {85, ISO7816.INS_ENVELOPE, 99, 113, 59, -56, 71, -122, -97, 60, ISO7816.INS_PUT_DATA, 91, 41, -86, -3, 119, ISOFileInfo.SECURITY_ATTR_COMPACT, -59, -108, PassportService.SFI_DG12, -90, 26, 19, 0, -29, -88, 22, 114, 64, -7, -8, CVCAFile.CAR_TAG, ISO7816.INS_REHABILITATE_CHV, 38, 104, -106, ISOFileInfo.DATA_BYTES2, -39, 69, 62, 16, 118, -58, -89, ISOFileInfo.SECURITY_ATTR_EXP, 57, 67, -31, 58, -75, 86, ISO7816.INS_PSO, ISO7816.INS_GET_RESPONSE, 109, ISO7816.INS_READ_RECORD2, 5, ISO7816.INS_MSE, 102, -65, ISO7816.INS_UPDATE_RECORD, PassportService.SFI_DG11, -6, ISOFileInfo.FCP_BYTE, 72, -35, ISO7816.INS_VERIFY, 17, 6, 54, -55, -63, -49, -10, 39, 82, -69, 105, -11, -44, ISOFileInfo.FCI_EXT, Byte.MAX_VALUE, -124, 76, ISO7816.INS_WRITE_RECORD, -100, 87, -92, PSSSigner.TRAILER_IMPLICIT, 79, -102, -33, -2, ISO7816.INS_UPDATE_BINARY, ISOFileInfo.ENV_TEMP_EF, 122, -21, 43, 83, ISO7816.INS_LOAD_KEY_FILE, 92, ISOFileInfo.f24317A1, 20, 23, -5, 35, -43, 125, ISO7816.INS_DECREASE, 103, 115, 8, 9, -18, -73, ISO7816.INS_MANAGE_CHANNEL, 63, 97, -78, 25, ISOFileInfo.CHANNEL_SECURITY, 78, -27, 75, -109, -113, 93, -37, -87, -83, -15, -82, 46, -53, PassportService.SFI_DG13, -4, -12, 45, 70, 110, 29, -105, -24, -47, -23, 77, 55, ISOFileInfo.f24319A5, 117, 94, ISOFileInfo.FILE_IDENTIFIER, -98, ISOFileInfo.AB, -126, -99, -71, 28, ISO7816.INS_CREATE_FILE, -51, 73, -119, 1, ISO7816.INS_READ_RECORD_STAMPED, -67, 88, ISO7816.INS_CHANGE_CHV, -94, 95, 56, 120, -103, 21, -112, 80, -72, -107, ISO7816.INS_DELETE_FILE, ISO7816.INS_WRITE_BINARY, -111, -57, -50, -19, PassportService.SFI_DG15, ISO7816.INS_READ_BINARY_STAMPED, ISOFileInfo.FCI_BYTE, ISOFileInfo.f24316A0, -52, -16, 2, 74, 121, -61, -34, -93, -17, -22, 81, -26, 107, 24, -20, 27, ISO7816.INS_UNBLOCK_CHV, ISOFileInfo.DATA_BYTES1, -9, 116, -25, -1, 33, 90, 106, 84, PassportService.SFI_COM, 65, 49, -110, 53, -60, 51, 7, 10, -70, 126, 14, ISO7816.INS_DECREASE_STAMPED, -120, ISO7816.INS_READ_BINARY2, -104, 124, -13, 61, 96, 108, 123, ISO7816.INS_GET_DATA, -45, 31, ISO7816.INS_INCREASE, 101, 4, 40, ISOFileInfo.FMD_BYTE, -66, ISOFileInfo.PROP_INFO, -101, 47, 89, ISOFileInfo.LCS_BYTE, -41, ISO7816.INS_READ_BINARY, 37, -84, -81, 18, 3, ISO7816.INS_APPEND_RECORD, -14};
    private static final short[] EK_d = {17623, 9916, 25195, 4958, 22409, 13794, 28981, 2479, 19832, 12051, 27588, 6897, 24102, 15437, 30874, 18348};

    public Zuc128CoreEngine() {
        this.LFSR = new int[16];
        this.f24990F = new int[2];
        this.BRC = new int[4];
        this.keyStream = new byte[4];
    }

    private int AddM(int i, int i9) {
        int i10 = i + i9;
        return (Integer.MAX_VALUE & i10) + (i10 >>> 31);
    }

    private void BitReorganization() {
        int[] iArr = this.BRC;
        int[] iArr2 = this.LFSR;
        iArr[0] = ((iArr2[15] & 2147450880) << 1) | (iArr2[14] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        iArr[1] = ((iArr2[11] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) << 16) | (iArr2[9] >>> 15);
        iArr[2] = ((iArr2[7] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) << 16) | (iArr2[5] >>> 15);
        iArr[3] = (iArr2[0] >>> 15) | ((iArr2[2] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) << 16);
    }

    private static int L1(int i) {
        return ROT(i, 24) ^ (((ROT(i, 2) ^ i) ^ ROT(i, 10)) ^ ROT(i, 18));
    }

    private static int L2(int i) {
        return ROT(i, 30) ^ (((ROT(i, 8) ^ i) ^ ROT(i, 14)) ^ ROT(i, 22));
    }

    private void LFSRWithInitialisationMode(int i) {
        int i9 = this.LFSR[0];
        int AddM = AddM(AddM(AddM(AddM(AddM(AddM(i9, MulByPow2(i9, 8)), MulByPow2(this.LFSR[4], 20)), MulByPow2(this.LFSR[10], 21)), MulByPow2(this.LFSR[13], 17)), MulByPow2(this.LFSR[15], 15)), i);
        int[] iArr = this.LFSR;
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = iArr[5];
        iArr[5] = iArr[6];
        iArr[6] = iArr[7];
        iArr[7] = iArr[8];
        iArr[8] = iArr[9];
        iArr[9] = iArr[10];
        iArr[10] = iArr[11];
        iArr[11] = iArr[12];
        iArr[12] = iArr[13];
        iArr[13] = iArr[14];
        iArr[14] = iArr[15];
        iArr[15] = AddM;
    }

    private void LFSRWithWorkMode() {
        int i = this.LFSR[0];
        int AddM = AddM(AddM(AddM(AddM(AddM(i, MulByPow2(i, 8)), MulByPow2(this.LFSR[4], 20)), MulByPow2(this.LFSR[10], 21)), MulByPow2(this.LFSR[13], 17)), MulByPow2(this.LFSR[15], 15));
        int[] iArr = this.LFSR;
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = iArr[5];
        iArr[5] = iArr[6];
        iArr[6] = iArr[7];
        iArr[7] = iArr[8];
        iArr[8] = iArr[9];
        iArr[9] = iArr[10];
        iArr[10] = iArr[11];
        iArr[11] = iArr[12];
        iArr[12] = iArr[13];
        iArr[13] = iArr[14];
        iArr[14] = iArr[15];
        iArr[15] = AddM;
    }

    private static int MAKEU31(byte b9, short s10, byte b10) {
        return ((b9 & 255) << 23) | ((s10 & 65535) << 8) | (b10 & 255);
    }

    private static int MAKEU32(byte b9, byte b10, byte b11, byte b12) {
        return ((b9 & 255) << 24) | ((b10 & 255) << 16) | ((b11 & 255) << 8) | (b12 & 255);
    }

    private static int MulByPow2(int i, int i9) {
        return ((i >>> (31 - i9)) | (i << i9)) & Integer.MAX_VALUE;
    }

    public static int ROT(int i, int i9) {
        return (i >>> (32 - i9)) | (i << i9);
    }

    public static void encode32be(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) (i >> 24);
        bArr[i9 + 1] = (byte) (i >> 16);
        bArr[i9 + 2] = (byte) (i >> 8);
        bArr[i9 + 3] = (byte) i;
    }

    private void makeKeyStream() {
        encode32be(makeKeyStreamWord(), this.keyStream, 0);
    }

    private void setKeyAndIV(byte[] bArr, byte[] bArr2) {
        setKeyAndIV(this.LFSR, bArr, bArr2);
        int[] iArr = this.f24990F;
        iArr[0] = 0;
        iArr[1] = 0;
        int i = 32;
        while (true) {
            BitReorganization();
            if (i <= 0) {
                F();
                LFSRWithWorkMode();
                return;
            } else {
                LFSRWithInitialisationMode(F() >>> 1);
                i--;
            }
        }
    }

    public int F() {
        int[] iArr = this.BRC;
        int i = iArr[0];
        int[] iArr2 = this.f24990F;
        int i9 = iArr2[0];
        int i10 = iArr2[1];
        int i11 = (i ^ i9) + i10;
        int i12 = i9 + iArr[1];
        int i13 = iArr[2] ^ i10;
        int L12 = L1((i12 << 16) | (i13 >>> 16));
        int L22 = L2((i13 << 16) | (i12 >>> 16));
        int[] iArr3 = this.f24990F;
        byte[] bArr = f24988S0;
        byte b9 = bArr[L12 >>> 24];
        byte[] bArr2 = f24989S1;
        iArr3[0] = MAKEU32(b9, bArr2[(L12 >>> 16) & 255], bArr[(L12 >>> 8) & 255], bArr2[L12 & 255]);
        this.f24990F[1] = MAKEU32(bArr[L22 >>> 24], bArr2[(L22 >>> 16) & 255], bArr[(L22 >>> 8) & 255], bArr2[L22 & 255]);
        return i11;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new Zuc128CoreEngine(this);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Zuc-128";
    }

    public int getMaxIterations() {
        return 2047;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        byte[] bArr;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            bArr = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            bArr = null;
        }
        byte[] key = cipherParameters instanceof KeyParameter ? ((KeyParameter) cipherParameters).getKey() : null;
        this.theIndex = 0;
        this.theIterations = 0;
        setKeyAndIV(key, bArr);
        this.theResetState = (Zuc128CoreEngine) copy();
    }

    public int makeKeyStreamWord() {
        int i = this.theIterations;
        this.theIterations = i + 1;
        if (i >= getMaxIterations()) {
            throw new IllegalStateException("Too much data processed by singleKey/IV");
        }
        BitReorganization();
        int F10 = F() ^ this.BRC[3];
        LFSRWithWorkMode();
        return F10;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        if (this.theResetState == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i + i9 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i10 + i9 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i11 = 0; i11 < i9; i11++) {
            bArr2[i11 + i10] = returnByte(bArr[i11 + i]);
        }
        return i9;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        Zuc128CoreEngine zuc128CoreEngine = this.theResetState;
        if (zuc128CoreEngine != null) {
            reset(zuc128CoreEngine);
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b9) {
        if (this.theIndex == 0) {
            makeKeyStream();
        }
        byte[] bArr = this.keyStream;
        int i = this.theIndex;
        byte b10 = (byte) (b9 ^ bArr[i]);
        this.theIndex = (i + 1) % 4;
        return b10;
    }

    public Zuc128CoreEngine(Zuc128CoreEngine zuc128CoreEngine) {
        this.LFSR = new int[16];
        this.f24990F = new int[2];
        this.BRC = new int[4];
        this.keyStream = new byte[4];
        reset(zuc128CoreEngine);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        Zuc128CoreEngine zuc128CoreEngine = (Zuc128CoreEngine) memoable;
        int[] iArr = zuc128CoreEngine.LFSR;
        int[] iArr2 = this.LFSR;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = zuc128CoreEngine.f24990F;
        int[] iArr4 = this.f24990F;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        int[] iArr5 = zuc128CoreEngine.BRC;
        int[] iArr6 = this.BRC;
        System.arraycopy(iArr5, 0, iArr6, 0, iArr6.length);
        byte[] bArr = zuc128CoreEngine.keyStream;
        byte[] bArr2 = this.keyStream;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.theIndex = zuc128CoreEngine.theIndex;
        this.theIterations = zuc128CoreEngine.theIterations;
        this.theResetState = zuc128CoreEngine;
    }

    public void setKeyAndIV(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException("A key of 16 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("An IV of 16 bytes is needed");
        }
        int[] iArr2 = this.LFSR;
        byte b9 = bArr[0];
        short[] sArr = EK_d;
        iArr2[0] = MAKEU31(b9, sArr[0], bArr2[0]);
        this.LFSR[1] = MAKEU31(bArr[1], sArr[1], bArr2[1]);
        this.LFSR[2] = MAKEU31(bArr[2], sArr[2], bArr2[2]);
        this.LFSR[3] = MAKEU31(bArr[3], sArr[3], bArr2[3]);
        this.LFSR[4] = MAKEU31(bArr[4], sArr[4], bArr2[4]);
        this.LFSR[5] = MAKEU31(bArr[5], sArr[5], bArr2[5]);
        this.LFSR[6] = MAKEU31(bArr[6], sArr[6], bArr2[6]);
        this.LFSR[7] = MAKEU31(bArr[7], sArr[7], bArr2[7]);
        this.LFSR[8] = MAKEU31(bArr[8], sArr[8], bArr2[8]);
        this.LFSR[9] = MAKEU31(bArr[9], sArr[9], bArr2[9]);
        this.LFSR[10] = MAKEU31(bArr[10], sArr[10], bArr2[10]);
        this.LFSR[11] = MAKEU31(bArr[11], sArr[11], bArr2[11]);
        this.LFSR[12] = MAKEU31(bArr[12], sArr[12], bArr2[12]);
        this.LFSR[13] = MAKEU31(bArr[13], sArr[13], bArr2[13]);
        this.LFSR[14] = MAKEU31(bArr[14], sArr[14], bArr2[14]);
        this.LFSR[15] = MAKEU31(bArr[15], sArr[15], bArr2[15]);
    }
}
