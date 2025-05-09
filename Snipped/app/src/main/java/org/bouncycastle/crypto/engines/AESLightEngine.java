package org.bouncycastle.crypto.engines;

import androidx.recyclerview.widget.u;
import java.lang.reflect.Array;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StatelessProcessing;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class AESLightEngine implements BlockCipher, StatelessProcessing {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: m1, reason: collision with root package name */
    private static final int f24936m1 = -2139062144;
    private static final int m2 = 2139062143;

    /* renamed from: m3, reason: collision with root package name */
    private static final int f24937m3 = 27;

    /* renamed from: m4, reason: collision with root package name */
    private static final int f24938m4 = -1061109568;

    /* renamed from: m5, reason: collision with root package name */
    private static final int f24939m5 = 1061109567;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;
    private static final byte[] S = {99, 124, 119, 123, -14, 107, ISOFileInfo.FCI_BYTE, -59, ISO7816.INS_DECREASE, 1, 103, 43, -2, -41, ISOFileInfo.AB, 118, ISO7816.INS_GET_DATA, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, ISO7816.INS_GET_RESPONSE, -73, -3, -109, 38, 54, 63, -9, -52, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.f24319A5, -27, -15, 113, ISO7816.INS_LOAD_KEY_FILE, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ISOFileInfo.DATA_BYTES1, ISO7816.INS_APPEND_RECORD, -21, 39, -78, 117, 9, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_UNBLOCK_CHV, 26, 27, 110, 90, ISOFileInfo.f24316A0, 82, 59, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_READ_RECORD2, 41, -29, 47, -124, 83, -47, 0, -19, ISO7816.INS_VERIFY, -4, ISO7816.INS_READ_BINARY2, 91, 106, -53, -66, 57, 74, 76, 88, -49, ISO7816.INS_WRITE_BINARY, -17, -86, -5, 67, 77, 51, ISOFileInfo.PROP_INFO, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_PUT_DATA, 33, 16, -1, -13, ISO7816.INS_WRITE_RECORD, -51, PassportService.SFI_DG12, 19, -20, 95, -105, ISO7816.INS_REHABILITATE_CHV, 23, -60, -89, 126, 61, ISOFileInfo.FMD_BYTE, 93, 25, 115, 96, ISOFileInfo.DATA_BYTES2, 79, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_MSE, ISO7816.INS_PSO, -112, -120, 70, -18, -72, 20, -34, 94, PassportService.SFI_DG11, -37, ISO7816.INS_CREATE_FILE, ISO7816.INS_INCREASE, 58, 10, 73, 6, ISO7816.INS_CHANGE_CHV, 92, ISO7816.INS_ENVELOPE, -45, -84, ISOFileInfo.FCP_BYTE, -111, -107, ISO7816.INS_DELETE_FILE, 121, -25, -56, 55, 109, ISOFileInfo.ENV_TEMP_EF, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, ISO7816.INS_READ_BINARY_STAMPED, -58, -24, -35, 116, 31, 75, -67, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ISOFileInfo.CHANNEL_SECURITY, -108, -101, PassportService.SFI_COM, ISOFileInfo.FCI_EXT, -23, -50, 85, 40, -33, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.f24317A1, -119, PassportService.SFI_DG13, -65, -26, CVCAFile.CAR_TAG, 104, 65, -103, 45, PassportService.SFI_DG15, ISO7816.INS_READ_BINARY, 84, -69, 22};
    private static final byte[] Si = {82, 9, 106, -43, ISO7816.INS_DECREASE, 54, ISOFileInfo.f24319A5, 56, -65, 64, -93, -98, ISOFileInfo.DATA_BYTES2, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, ISOFileInfo.FCI_EXT, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.CHANNEL_SECURITY, 67, ISO7816.INS_REHABILITATE_CHV, -60, -34, -23, -53, 84, 123, -108, ISO7816.INS_INCREASE, -90, ISO7816.INS_ENVELOPE, 35, 61, -18, 76, -107, PassportService.SFI_DG11, CVCAFile.CAR_TAG, -6, -61, 78, 8, 46, ISOFileInfo.f24317A1, 102, 40, -39, ISO7816.INS_CHANGE_CHV, -78, 118, 91, -94, 73, 109, ISOFileInfo.SECURITY_ATTR_EXP, -47, 37, 114, -8, -10, ISOFileInfo.FMD_BYTE, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, ISO7816.INS_READ_RECORD_STAMPED, -110, 108, ISO7816.INS_MANAGE_CHANNEL, 72, 80, -3, -19, -71, ISO7816.INS_PUT_DATA, 94, 21, 70, 87, -89, ISOFileInfo.ENV_TEMP_EF, -99, -124, -112, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.AB, 0, ISOFileInfo.SECURITY_ATTR_COMPACT, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, ISO7816.INS_DELETE_FILE, 88, 5, -72, ISO7816.INS_READ_RECORD2, 69, 6, ISO7816.INS_WRITE_BINARY, ISO7816.INS_UNBLOCK_CHV, PassportService.SFI_COM, -113, ISO7816.INS_GET_DATA, 63, PassportService.SFI_DG15, 2, -63, -81, -67, 3, 1, 19, ISOFileInfo.LCS_BYTE, 107, 58, -111, 17, 65, 79, 103, ISO7816.INS_UPDATE_RECORD, -22, -105, -14, -49, -50, -16, ISO7816.INS_READ_BINARY_STAMPED, -26, 115, -106, -84, 116, ISO7816.INS_MSE, -25, -83, 53, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, ISOFileInfo.FCI_BYTE, -73, ISOFileInfo.FCP_BYTE, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, ISO7816.INS_WRITE_RECORD, 121, ISO7816.INS_VERIFY, -102, -37, ISO7816.INS_GET_RESPONSE, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, ISO7816.INS_READ_BINARY2, 18, 16, 89, 39, ISOFileInfo.DATA_BYTES1, -20, 95, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, PassportService.SFI_DG13, 45, -27, 122, -97, -109, -55, -100, -17, ISOFileInfo.f24316A0, ISO7816.INS_CREATE_FILE, 59, 77, -82, ISO7816.INS_PSO, -11, ISO7816.INS_READ_BINARY, -56, -21, -69, 60, ISOFileInfo.FILE_IDENTIFIER, 83, -103, 97, 23, 43, 4, 126, -70, 119, ISO7816.INS_UPDATE_BINARY, 38, -31, 105, 20, 99, 85, 33, PassportService.SFI_DG12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 125, u.d.DEFAULT_SWIPE_ANIMATION_DURATION, 239, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 145};

    private static int FFmulX(int i) {
        return (((i & f24936m1) >>> 7) * 27) ^ ((m2 & i) << 1);
    }

    private static int FFmulX2(int i) {
        int i9 = (f24939m5 & i) << 2;
        int i10 = i & f24938m4;
        int i11 = i10 ^ (i10 >>> 1);
        return (i11 >>> 5) ^ (i9 ^ (i11 >>> 2));
    }

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9, int[][] iArr) {
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        int i10 = this.ROUNDS;
        int[] iArr2 = iArr[i10];
        char c2 = 0;
        int i11 = littleEndianToInt ^ iArr2[0];
        int i12 = 1;
        int i13 = littleEndianToInt2 ^ iArr2[1];
        int i14 = littleEndianToInt3 ^ iArr2[2];
        int i15 = i10 - 1;
        int i16 = littleEndianToInt4 ^ iArr2[3];
        while (true) {
            byte[] bArr3 = Si;
            if (i15 <= i12) {
                int inv_mcol = inv_mcol((((bArr3[i11 & 255] & 255) ^ ((bArr3[(i16 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i14 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i13 >> 24) & 255] << 24)) ^ iArr[i15][0];
                int inv_mcol2 = inv_mcol((((bArr3[i13 & 255] & 255) ^ ((bArr3[(i11 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i16 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i14 >> 24) & 255] << 24)) ^ iArr[i15][1];
                int inv_mcol3 = inv_mcol((((bArr3[i14 & 255] & 255) ^ ((bArr3[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i11 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i16 >> 24) & 255] << 24)) ^ iArr[i15][2];
                int inv_mcol4 = inv_mcol((((bArr3[i16 & 255] & 255) ^ ((bArr3[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i11 >> 24) & 255] << 24)) ^ iArr[i15][3];
                int i17 = (((bArr3[inv_mcol & 255] & 255) ^ ((bArr3[(inv_mcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(inv_mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr3[(inv_mcol2 >> 24) & 255] << 24);
                int[] iArr3 = iArr[0];
                int i18 = i17 ^ iArr3[0];
                int i19 = ((((bArr3[inv_mcol2 & 255] & 255) ^ ((bArr3[(inv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr3[(inv_mcol4 >> 16) & 255] & 255) << 16)) ^ (bArr3[(inv_mcol3 >> 24) & 255] << 24)) ^ iArr3[1];
                int i20 = ((((bArr3[inv_mcol3 & 255] & 255) ^ ((bArr3[(inv_mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(inv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr3[(inv_mcol4 >> 24) & 255] << 24)) ^ iArr3[2];
                int i21 = ((((bArr3[inv_mcol4 & 255] & 255) ^ ((bArr3[(inv_mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(inv_mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr3[(inv_mcol >> 24) & 255] << 24)) ^ iArr3[3];
                Pack.intToLittleEndian(i18, bArr2, i9);
                Pack.intToLittleEndian(i19, bArr2, i9 + 4);
                Pack.intToLittleEndian(i20, bArr2, i9 + 8);
                Pack.intToLittleEndian(i21, bArr2, i9 + 12);
                return;
            }
            int inv_mcol5 = inv_mcol((((bArr3[i11 & 255] & 255) ^ ((bArr3[(i16 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i14 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i13 >> 24) & 255] << 24)) ^ iArr[i15][c2];
            int inv_mcol6 = inv_mcol((((bArr3[i13 & 255] & 255) ^ ((bArr3[(i11 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i16 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i14 >> 24) & 255] << 24)) ^ iArr[i15][i12];
            int inv_mcol7 = inv_mcol(((((bArr3[(i13 >> 8) & 255] & 255) << 8) ^ (bArr3[i14 & 255] & 255)) ^ ((bArr3[(i11 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i16 >> 24) & 255] << 24)) ^ iArr[i15][2];
            int inv_mcol8 = inv_mcol((((bArr3[i16 & 255] & 255) ^ ((bArr3[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i11 >> 24) & 255] << 24));
            int i22 = i15 - 1;
            int i23 = inv_mcol8 ^ iArr[i15][3];
            int inv_mcol9 = inv_mcol((((bArr3[inv_mcol5 & 255] & 255) ^ ((bArr3[(i23 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(inv_mcol7 >> 16) & 255] & 255) << 16)) ^ (bArr3[(inv_mcol6 >> 24) & 255] << 24)) ^ iArr[i22][c2];
            int inv_mcol10 = inv_mcol((((bArr3[inv_mcol6 & 255] & 255) ^ ((bArr3[(inv_mcol5 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i23 >> 16) & 255] & 255) << 16)) ^ (bArr3[(inv_mcol7 >> 24) & 255] << 24)) ^ iArr[i22][1];
            int inv_mcol11 = inv_mcol(((((bArr3[(inv_mcol6 >> 8) & 255] & 255) << 8) ^ (bArr3[inv_mcol7 & 255] & 255)) ^ ((bArr3[(inv_mcol5 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i23 >> 24) & 255] << 24)) ^ iArr[i22][2];
            i15 -= 2;
            i16 = inv_mcol((((bArr3[i23 & 255] & 255) ^ ((bArr3[(inv_mcol7 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(inv_mcol6 >> 16) & 255] & 255) << 16)) ^ (bArr3[(inv_mcol5 >> 24) & 255] << 24)) ^ iArr[i22][3];
            i11 = inv_mcol9;
            i13 = inv_mcol10;
            i14 = inv_mcol11;
            c2 = 0;
            i12 = 1;
        }
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9, int[][] iArr) {
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        char c2 = 0;
        int[] iArr2 = iArr[0];
        int i10 = littleEndianToInt ^ iArr2[0];
        int i11 = littleEndianToInt2 ^ iArr2[1];
        int i12 = littleEndianToInt3 ^ iArr2[2];
        int i13 = littleEndianToInt4 ^ iArr2[3];
        int i14 = 1;
        for (int i15 = 1; i14 < this.ROUNDS - i15; i15 = 1) {
            byte[] bArr3 = S;
            int mcol = mcol((((bArr3[i10 & 255] & 255) ^ ((bArr3[(i11 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i12 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i13 >> 24) & 255] << 24)) ^ iArr[i14][c2];
            int mcol2 = mcol((((bArr3[i11 & 255] & 255) ^ ((bArr3[(i12 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i10 >> 24) & 255] << 24)) ^ iArr[i14][i15];
            int mcol3 = mcol(((((bArr3[(i13 >> 8) & 255] & 255) << 8) ^ (bArr3[i12 & 255] & 255)) ^ ((bArr3[(i10 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i11 >> 24) & 255] << 24)) ^ iArr[i14][2];
            int mcol4 = mcol((((bArr3[i13 & 255] & 255) ^ ((bArr3[(i10 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i11 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i12 >> 24) & 255] << 24));
            int i16 = i14 + 1;
            int i17 = mcol4 ^ iArr[i14][3];
            int mcol5 = mcol((((bArr3[mcol & 255] & 255) ^ ((bArr3[(mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i17 >> 24) & 255] << 24)) ^ iArr[i16][c2];
            int mcol6 = mcol((((bArr3[mcol2 & 255] & 255) ^ ((bArr3[(mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i17 >> 16) & 255] & 255) << 16)) ^ (bArr3[(mcol >> 24) & 255] << 24)) ^ iArr[i16][1];
            int mcol7 = mcol(((((bArr3[(i17 >> 8) & 255] & 255) << 8) ^ (bArr3[mcol3 & 255] & 255)) ^ ((bArr3[(mcol >> 16) & 255] & 255) << 16)) ^ (bArr3[(mcol2 >> 24) & 255] << 24)) ^ iArr[i16][2];
            i14 += 2;
            i13 = mcol((((bArr3[i17 & 255] & 255) ^ ((bArr3[(mcol >> 8) & 255] & 255) << 8)) ^ ((bArr3[(mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr3[(mcol3 >> 24) & 255] << 24)) ^ iArr[i16][3];
            i10 = mcol5;
            i11 = mcol6;
            i12 = mcol7;
            c2 = 0;
        }
        byte[] bArr4 = S;
        int mcol8 = mcol((((bArr4[i10 & 255] & 255) ^ ((bArr4[(i11 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i13 >> 24) & 255] << 24)) ^ iArr[i14][0];
        int mcol9 = mcol((((bArr4[i11 & 255] & 255) ^ ((bArr4[(i12 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i10 >> 24) & 255] << 24)) ^ iArr[i14][1];
        int mcol10 = mcol((((bArr4[i12 & 255] & 255) ^ ((bArr4[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i10 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i11 >> 24) & 255] << 24)) ^ iArr[i14][2];
        int mcol11 = mcol((((bArr4[i13 & 255] & 255) ^ ((bArr4[(i10 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i12 >> 24) & 255] << 24)) ^ iArr[i14][3];
        int i18 = (((bArr4[mcol8 & 255] & 255) ^ ((bArr4[(mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr4[(mcol11 >> 24) & 255] << 24);
        int[] iArr3 = iArr[i14 + 1];
        int i19 = i18 ^ iArr3[0];
        int i20 = ((((bArr4[mcol9 & 255] & 255) ^ ((bArr4[(mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(mcol8 >> 24) & 255] << 24)) ^ iArr3[1];
        int i21 = iArr3[2] ^ ((((bArr4[mcol10 & 255] & 255) ^ ((bArr4[(mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(mcol8 >> 16) & 255] & 255) << 16)) ^ (bArr4[(mcol9 >> 24) & 255] << 24));
        int i22 = ((((bArr4[mcol11 & 255] & 255) ^ ((bArr4[(mcol8 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr4[(mcol10 >> 24) & 255] << 24)) ^ iArr3[3];
        Pack.intToLittleEndian(i19, bArr2, i9);
        Pack.intToLittleEndian(i20, bArr2, i9 + 4);
        Pack.intToLittleEndian(i21, bArr2, i9 + 8);
        Pack.intToLittleEndian(i22, bArr2, i9 + 12);
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z10) {
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length >>> 2;
        this.ROUNDS = i + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i + 7, 4);
        int i9 = 8;
        char c2 = 3;
        if (i == 4) {
            int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt2;
            int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt3;
            int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt4;
            for (int i10 = 1; i10 <= 10; i10++) {
                littleEndianToInt ^= subWord(shift(littleEndianToInt4, 8)) ^ rcon[i10 - 1];
                int[] iArr2 = iArr[i10];
                iArr2[0] = littleEndianToInt;
                littleEndianToInt2 ^= littleEndianToInt;
                iArr2[1] = littleEndianToInt2;
                littleEndianToInt3 ^= littleEndianToInt2;
                iArr2[2] = littleEndianToInt3;
                littleEndianToInt4 ^= littleEndianToInt3;
                iArr2[3] = littleEndianToInt4;
            }
        } else if (i == 6) {
            int littleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt5;
            int littleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt6;
            int littleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt7;
            int littleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt8;
            int littleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            int littleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            int i11 = 1;
            int i12 = 1;
            while (true) {
                int[] iArr3 = iArr[i11];
                iArr3[0] = littleEndianToInt9;
                iArr3[1] = littleEndianToInt10;
                int subWord = littleEndianToInt5 ^ (subWord(shift(littleEndianToInt10, 8)) ^ i12);
                int[] iArr4 = iArr[i11];
                iArr4[2] = subWord;
                int i13 = littleEndianToInt6 ^ subWord;
                iArr4[3] = i13;
                int i14 = littleEndianToInt7 ^ i13;
                int[] iArr5 = iArr[i11 + 1];
                iArr5[0] = i14;
                int i15 = littleEndianToInt8 ^ i14;
                iArr5[1] = i15;
                int i16 = littleEndianToInt9 ^ i15;
                iArr5[2] = i16;
                int i17 = littleEndianToInt10 ^ i16;
                iArr5[3] = i17;
                int subWord2 = subWord(shift(i17, 8)) ^ (i12 << 1);
                i12 <<= 2;
                littleEndianToInt5 = subWord ^ subWord2;
                int[] iArr6 = iArr[i11 + 2];
                iArr6[0] = littleEndianToInt5;
                littleEndianToInt6 = i13 ^ littleEndianToInt5;
                iArr6[1] = littleEndianToInt6;
                littleEndianToInt7 = i14 ^ littleEndianToInt6;
                iArr6[2] = littleEndianToInt7;
                littleEndianToInt8 = i15 ^ littleEndianToInt7;
                iArr6[3] = littleEndianToInt8;
                i11 += 3;
                if (i11 >= 13) {
                    break;
                }
                littleEndianToInt9 = i16 ^ littleEndianToInt8;
                littleEndianToInt10 = i17 ^ littleEndianToInt9;
            }
        } else {
            if (i != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int littleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt11;
            int littleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt12;
            int littleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt13;
            int littleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt14;
            int littleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = littleEndianToInt15;
            int littleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = littleEndianToInt16;
            int littleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = littleEndianToInt17;
            int littleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = littleEndianToInt18;
            int i18 = 2;
            int i19 = 1;
            while (true) {
                int subWord3 = subWord(shift(littleEndianToInt18, i9)) ^ i19;
                i19 <<= 1;
                littleEndianToInt11 ^= subWord3;
                int[] iArr7 = iArr[i18];
                iArr7[0] = littleEndianToInt11;
                littleEndianToInt12 ^= littleEndianToInt11;
                iArr7[1] = littleEndianToInt12;
                littleEndianToInt13 ^= littleEndianToInt12;
                iArr7[2] = littleEndianToInt13;
                littleEndianToInt14 ^= littleEndianToInt13;
                iArr7[c2] = littleEndianToInt14;
                int i20 = i18 + 1;
                if (i20 >= 15) {
                    break;
                }
                littleEndianToInt15 ^= subWord(littleEndianToInt14);
                int[] iArr8 = iArr[i20];
                iArr8[0] = littleEndianToInt15;
                littleEndianToInt16 ^= littleEndianToInt15;
                iArr8[1] = littleEndianToInt16;
                littleEndianToInt17 ^= littleEndianToInt16;
                iArr8[2] = littleEndianToInt17;
                littleEndianToInt18 ^= littleEndianToInt17;
                iArr8[3] = littleEndianToInt18;
                i18 += 2;
                i9 = 8;
                c2 = 3;
            }
        }
        if (!z10) {
            for (int i21 = 1; i21 < this.ROUNDS; i21++) {
                for (int i22 = 0; i22 < 4; i22++) {
                    int[] iArr9 = iArr[i21];
                    iArr9[i22] = inv_mcol(iArr9[i22]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i) {
        int shift = shift(i, 8) ^ i;
        int FFmulX = i ^ FFmulX(shift);
        int FFmulX2 = shift ^ FFmulX2(FFmulX);
        return FFmulX ^ (FFmulX2 ^ shift(FFmulX2, 16));
    }

    private static int mcol(int i) {
        int shift = shift(i, 8);
        int i9 = i ^ shift;
        return FFmulX(i9) ^ (shift ^ shift(i9, 16));
    }

    private static int shift(int i, int i9) {
        return (i << (-i9)) | (i >>> i9);
    }

    private static int subWord(int i) {
        byte[] bArr = S;
        return (bArr[(i >> 24) & 255] << 24) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to AES init - ", cipherParameters));
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z10);
        this.forEncryption = z10;
    }

    @Override // org.bouncycastle.crypto.StatelessProcessing
    public BlockCipher newInstance() {
        return new AESLightEngine();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 > bArr2.length - 16) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i, bArr2, i9, iArr);
        } else {
            decryptBlock(bArr, i, bArr2, i9, iArr);
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
