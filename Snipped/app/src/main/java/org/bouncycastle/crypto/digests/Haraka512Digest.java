package org.bouncycastle.crypto.digests;

import java.lang.reflect.Array;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class Haraka512Digest extends HarakaBase {
    private static byte[][] RC;
    private final byte[] buffer;
    private int off;

    static {
        byte[] bArr = new byte[16];
        // fill-array-data instruction
        bArr[0] = -81;
        bArr[1] = 4;
        bArr[2] = 73;
        bArr[3] = -120;
        bArr[4] = 75;
        bArr[5] = 5;
        bArr[6] = 0;
        bArr[7] = -124;
        bArr[8] = 95;
        bArr[9] = -106;
        bArr[10] = 0;
        bArr[11] = -55;
        bArr[12] = -100;
        bArr[13] = -88;
        bArr[14] = -20;
        bArr[15] = -90;
        RC = new byte[][]{new byte[]{6, -124, ISO7816.INS_MANAGE_CHANNEL, 76, -26, ISO7816.INS_VERIFY, ISO7816.INS_GET_RESPONSE, 10, -78, -59, -2, -16, 117, ISOFileInfo.DATA_BYTES2, 123, -99}, new byte[]{ISOFileInfo.SECURITY_ATTR_EXP, 102, ISO7816.INS_READ_BINARY_STAMPED, -31, -120, -13, ISOFileInfo.f24316A0, 107, ISOFileInfo.FMD_BYTE, PassportService.SFI_DG15, 107, -92, 47, 8, -9, 23}, new byte[]{ISO7816.INS_DECREASE_STAMPED, 2, -34, 45, 83, -14, -124, -104, -49, 2, -99, 96, -97, 2, -111, 20}, new byte[]{14, ISO7816.INS_UPDATE_BINARY, -22, -26, 46, 123, 79, 8, -69, -13, PSSSigner.TRAILER_IMPLICIT, -81, -3, 91, 79, 121}, new byte[]{-53, -49, ISO7816.INS_READ_BINARY, -53, 72, 114, ISO7816.INS_REHABILITATE_CHV, ISOFileInfo.SECURITY_ATTR_EXP, 121, -18, -51, 28, -66, 57, ISO7816.INS_MANAGE_CHANNEL, ISO7816.INS_REHABILITATE_CHV}, new byte[]{126, -22, -51, -18, 110, -112, ISO7816.INS_INCREASE, -73, ISOFileInfo.ENV_TEMP_EF, 83, 53, -19, 43, ISOFileInfo.LCS_BYTE, 5, 123}, new byte[]{103, ISO7816.INS_ENVELOPE, -113, 67, 94, 46, 124, ISO7816.INS_WRITE_BINARY, ISO7816.INS_APPEND_RECORD, 65, 39, 97, ISO7816.INS_PUT_DATA, 79, -17, 27}, new byte[]{41, ISO7816.INS_CHANGE_CHV, -39, ISO7816.INS_READ_BINARY, -81, ISO7816.INS_GET_DATA, -52, 7, 103, 95, -3, ISO7816.INS_APPEND_RECORD, 31, -57, PassportService.SFI_DG11, 59}, new byte[]{ISOFileInfo.AB, 77, 99, -15, -26, -122, Byte.MAX_VALUE, -23, -20, -37, -113, ISO7816.INS_GET_DATA, -71, -44, 101, -18}, new byte[]{28, ISO7816.INS_DECREASE, -65, -124, -44, -73, -51, ISOFileInfo.FMD_BYTE, 91, ISO7816.INS_PSO, 64, 79, -83, 3, 126, 51}, new byte[]{-78, -52, PassportService.SFI_DG11, -71, -108, 23, 35, -65, 105, 2, ISOFileInfo.SECURITY_ATTR_EXP, 46, ISOFileInfo.ENV_TEMP_EF, -10, -104, 0}, new byte[]{-6, 4, 120, -90, -34, ISOFileInfo.FCI_BYTE, 85, 114, 74, -86, -98, -56, 92, -99, 45, ISOFileInfo.LCS_BYTE}, new byte[]{-33, ISO7816.INS_READ_BINARY_STAMPED, -97, 43, 107, 119, ISO7816.INS_PSO, 18, 14, -6, 79, 46, 41, 18, -97, -44}, new byte[]{PassportService.SFI_COM, ISOFileInfo.f24317A1, 3, ISO7816.INS_REHABILITATE_CHV, -12, 73, -94, 54, ISO7816.INS_INCREASE, ISO7816.INS_UPDATE_BINARY, 17, -82, -69, 106, 18, -18}, bArr, new byte[]{33, 2, 94, ISO7816.INS_LOAD_KEY_FILE, -99, 25, -100, 79, 120, -94, -57, -29, 39, -27, -109, -20}, new byte[]{-65, 58, -86, -8, -89, 89, -55, -73, -71, 40, 46, -51, -126, -44, 1, 115}, new byte[]{ISOFileInfo.FCP_BYTE, 96, ISO7816.INS_MANAGE_CHANNEL, PassportService.SFI_DG13, 97, -122, ISO7816.INS_READ_BINARY, 23, 55, -14, -17, -39, 16, ISO7816.INS_DECREASE, 125, 107}, new byte[]{90, ISO7816.INS_GET_DATA, 69, ISO7816.INS_ENVELOPE, 33, ISO7816.INS_DECREASE, 4, 67, ISOFileInfo.DATA_BYTES2, ISO7816.INS_ENVELOPE, -111, 83, -10, -4, -102, -58}, new byte[]{-110, 35, -105, 60, ISO7816.INS_MSE, 107, 104, -69, ISO7816.INS_UNBLOCK_CHV, -81, -110, -24, 54, -47, -108, 58}, new byte[]{-45, -65, -110, 56, ISO7816.INS_MSE, 88, -122, -21, 108, -70, -71, 88, -27, 16, 113, ISO7816.INS_READ_BINARY_STAMPED}, new byte[]{-37, -122, 60, -27, -82, -16, -58, 119, -109, 61, -3, -35, ISO7816.INS_CHANGE_CHV, -31, 18, ISOFileInfo.ENV_TEMP_EF}, new byte[]{-69, 96, ISOFileInfo.FCP_BYTE, 104, -1, -21, ISOFileInfo.f24316A0, -100, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_DELETE_FILE, ISOFileInfo.ENV_TEMP_EF, -29, -53, ISO7816.INS_MSE, 18, ISO7816.INS_READ_BINARY2}, new byte[]{115, 75, -45, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_APPEND_RECORD, ISO7816.INS_DELETE_FILE, -47, -100, 45, -71, 26, 78, -57, 43, -9, 125}, new byte[]{67, -69, 71, -61, 97, ISO7816.INS_DECREASE, 27, 67, 75, 20, 21, -60, ISO7816.INS_UNBLOCK_CHV, ISO7816.INS_READ_RECORD2, -110, 78}, new byte[]{-37, -89, 117, -88, -25, 7, -17, -10, 3, -78, 49, -35, 22, -21, 104, -103}, new byte[]{109, -13, 97, 75, 60, 117, 89, 119, ISOFileInfo.CHANNEL_SECURITY, 94, 35, 2, 126, ISO7816.INS_GET_DATA, 71, ISO7816.INS_UNBLOCK_CHV}, new byte[]{-51, -89, 90, 23, ISO7816.INS_UPDATE_BINARY, -34, 125, 119, 109, 27, -27, -71, -72, -122, 23, -7}, new byte[]{-20, 107, 67, -16, 107, -88, -23, -86, -99, 108, 6, -99, -87, 70, -18, 93}, new byte[]{-53, PassportService.SFI_COM, 105, 80, -7, 87, 51, 43, -94, 83, 17, 89, 59, -13, 39, -63}, new byte[]{ISO7816.INS_UNBLOCK_CHV, -18, PassportService.SFI_DG12, 117, 0, ISO7816.INS_PUT_DATA, 97, -100, ISO7816.INS_DELETE_FILE, -19, 3, 83, 96, 14, ISO7816.INS_WRITE_BINARY, -39}, new byte[]{-16, ISO7816.INS_READ_BINARY2, ISOFileInfo.f24319A5, ISOFileInfo.f24317A1, -106, -23, PassportService.SFI_DG12, ISOFileInfo.AB, ISOFileInfo.DATA_BYTES1, -69, -70, PSSSigner.TRAILER_IMPLICIT, 99, -92, -93, 80}, new byte[]{-82, 61, ISO7816.INS_READ_BINARY2, 2, 94, -106, 41, -120, ISOFileInfo.AB, PassportService.SFI_DG13, -34, ISO7816.INS_DECREASE, -109, ISOFileInfo.ENV_TEMP_EF, ISO7816.INS_GET_DATA, 57}, new byte[]{23, -69, -113, 56, -43, 84, -92, PassportService.SFI_DG11, -120, 20, -13, -88, 46, 117, ISO7816.INS_READ_BINARY_STAMPED, CVCAFile.CAR_TAG}, new byte[]{ISO7816.INS_DECREASE_STAMPED, -69, ISOFileInfo.LCS_BYTE, 91, 95, CVCAFile.CAR_TAG, Byte.MAX_VALUE, -41, -82, ISO7816.INS_READ_RECORD_STAMPED, -73, 121, 54, 10, 22, -10}, new byte[]{38, -10, 82, 65, -53, -27, 84, 56, 67, -50, 89, 24, -1, -70, -81, -34}, new byte[]{76, -23, -102, 84, -71, -13, 2, 106, -94, ISO7816.INS_GET_DATA, -100, -9, ISOFileInfo.FILE_IDENTIFIER, -98, -55, 120}, new byte[]{-82, 81, ISOFileInfo.f24319A5, 26, 27, -33, -9, -66, 64, ISO7816.INS_GET_RESPONSE, 110, 40, ISO7816.INS_MSE, -112, 18, 53}, new byte[]{ISOFileInfo.f24316A0, -63, 97, 60, -70, 126, ISO7816.INS_WRITE_RECORD, 43, -63, 115, PSSSigner.TRAILER_IMPLICIT, PassportService.SFI_DG15, 72, -90, 89, -49}, new byte[]{117, 106, -52, 3, 2, 40, -126, -120, 74, ISO7816.INS_UPDATE_BINARY, -67, -3, -23, -59, -99, ISOFileInfo.f24317A1}};
    }

    public Haraka512Digest() {
        this.buffer = new byte[64];
    }

    private int haraka512256(byte[] bArr, byte[] bArr2, int i) {
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 16);
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 16);
        System.arraycopy(bArr, 0, bArr3[0], 0, 16);
        System.arraycopy(bArr, 16, bArr3[1], 0, 16);
        System.arraycopy(bArr, 32, bArr3[2], 0, 16);
        System.arraycopy(bArr, 48, bArr3[3], 0, 16);
        bArr3[0] = HarakaBase.aesEnc(bArr3[0], RC[0]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], RC[1]);
        bArr3[2] = HarakaBase.aesEnc(bArr3[2], RC[2]);
        bArr3[3] = HarakaBase.aesEnc(bArr3[3], RC[3]);
        bArr3[0] = HarakaBase.aesEnc(bArr3[0], RC[4]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], RC[5]);
        bArr3[2] = HarakaBase.aesEnc(bArr3[2], RC[6]);
        bArr3[3] = HarakaBase.aesEnc(bArr3[3], RC[7]);
        mix512(bArr3, bArr4);
        bArr3[0] = HarakaBase.aesEnc(bArr4[0], RC[8]);
        bArr3[1] = HarakaBase.aesEnc(bArr4[1], RC[9]);
        bArr3[2] = HarakaBase.aesEnc(bArr4[2], RC[10]);
        bArr3[3] = HarakaBase.aesEnc(bArr4[3], RC[11]);
        bArr3[0] = HarakaBase.aesEnc(bArr3[0], RC[12]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], RC[13]);
        bArr3[2] = HarakaBase.aesEnc(bArr3[2], RC[14]);
        bArr3[3] = HarakaBase.aesEnc(bArr3[3], RC[15]);
        mix512(bArr3, bArr4);
        bArr3[0] = HarakaBase.aesEnc(bArr4[0], RC[16]);
        bArr3[1] = HarakaBase.aesEnc(bArr4[1], RC[17]);
        bArr3[2] = HarakaBase.aesEnc(bArr4[2], RC[18]);
        bArr3[3] = HarakaBase.aesEnc(bArr4[3], RC[19]);
        bArr3[0] = HarakaBase.aesEnc(bArr3[0], RC[20]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], RC[21]);
        bArr3[2] = HarakaBase.aesEnc(bArr3[2], RC[22]);
        bArr3[3] = HarakaBase.aesEnc(bArr3[3], RC[23]);
        mix512(bArr3, bArr4);
        bArr3[0] = HarakaBase.aesEnc(bArr4[0], RC[24]);
        bArr3[1] = HarakaBase.aesEnc(bArr4[1], RC[25]);
        bArr3[2] = HarakaBase.aesEnc(bArr4[2], RC[26]);
        bArr3[3] = HarakaBase.aesEnc(bArr4[3], RC[27]);
        bArr3[0] = HarakaBase.aesEnc(bArr3[0], RC[28]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], RC[29]);
        bArr3[2] = HarakaBase.aesEnc(bArr3[2], RC[30]);
        bArr3[3] = HarakaBase.aesEnc(bArr3[3], RC[31]);
        mix512(bArr3, bArr4);
        bArr3[0] = HarakaBase.aesEnc(bArr4[0], RC[32]);
        bArr3[1] = HarakaBase.aesEnc(bArr4[1], RC[33]);
        bArr3[2] = HarakaBase.aesEnc(bArr4[2], RC[34]);
        bArr3[3] = HarakaBase.aesEnc(bArr4[3], RC[35]);
        bArr3[0] = HarakaBase.aesEnc(bArr3[0], RC[36]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], RC[37]);
        bArr3[2] = HarakaBase.aesEnc(bArr3[2], RC[38]);
        bArr3[3] = HarakaBase.aesEnc(bArr3[3], RC[39]);
        mix512(bArr3, bArr4);
        bArr3[0] = HarakaBase.xor(bArr4[0], bArr, 0);
        bArr3[1] = HarakaBase.xor(bArr4[1], bArr, 16);
        bArr3[2] = HarakaBase.xor(bArr4[2], bArr, 32);
        bArr3[3] = HarakaBase.xor(bArr4[3], bArr, 48);
        System.arraycopy(bArr3[0], 8, bArr2, i, 8);
        System.arraycopy(bArr3[1], 8, bArr2, i + 8, 8);
        System.arraycopy(bArr3[2], 0, bArr2, i + 16, 8);
        System.arraycopy(bArr3[3], 0, bArr2, i + 24, 8);
        return 32;
    }

    private void mix512(byte[][] bArr, byte[][] bArr2) {
        System.arraycopy(bArr[0], 12, bArr2[0], 0, 4);
        System.arraycopy(bArr[2], 12, bArr2[0], 4, 4);
        System.arraycopy(bArr[1], 12, bArr2[0], 8, 4);
        System.arraycopy(bArr[3], 12, bArr2[0], 12, 4);
        System.arraycopy(bArr[2], 0, bArr2[1], 0, 4);
        System.arraycopy(bArr[0], 0, bArr2[1], 4, 4);
        System.arraycopy(bArr[3], 0, bArr2[1], 8, 4);
        System.arraycopy(bArr[1], 0, bArr2[1], 12, 4);
        System.arraycopy(bArr[2], 4, bArr2[2], 0, 4);
        System.arraycopy(bArr[0], 4, bArr2[2], 4, 4);
        System.arraycopy(bArr[3], 4, bArr2[2], 8, 4);
        System.arraycopy(bArr[1], 4, bArr2[2], 12, 4);
        System.arraycopy(bArr[0], 8, bArr2[3], 0, 4);
        System.arraycopy(bArr[2], 8, bArr2[3], 4, 4);
        System.arraycopy(bArr[1], 8, bArr2[3], 8, 4);
        System.arraycopy(bArr[3], 8, bArr2[3], 12, 4);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        if (this.off != 64) {
            throw new IllegalStateException("input must be exactly 64 bytes");
        }
        if (bArr.length - i < 32) {
            throw new IllegalArgumentException("output too short to receive digest");
        }
        int haraka512256 = haraka512256(this.buffer, bArr, i);
        reset();
        return haraka512256;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Haraka-512";
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.off = 0;
        Arrays.clear(this.buffer);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b9) {
        int i = this.off;
        if (i + 1 > 64) {
            throw new IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        byte[] bArr = this.buffer;
        this.off = i + 1;
        bArr[i] = b9;
    }

    public Haraka512Digest(Haraka512Digest haraka512Digest) {
        this.buffer = Arrays.clone(haraka512Digest.buffer);
        this.off = haraka512Digest.off;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i9) {
        int i10 = this.off;
        if (i10 + i9 > 64) {
            throw new IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        System.arraycopy(bArr, i, this.buffer, i10, i9);
        this.off += i9;
    }
}
