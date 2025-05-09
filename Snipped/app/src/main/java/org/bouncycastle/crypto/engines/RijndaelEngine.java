package org.bouncycastle.crypto.engines;

import androidx.recyclerview.widget.u;
import java.lang.reflect.Array;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.tls.CipherSuite;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class RijndaelEngine implements BlockCipher {
    private static final int MAXKC = 64;
    private static final int MAXROUNDS = 14;

    /* renamed from: A0, reason: collision with root package name */
    private long f24976A0;

    /* renamed from: A1, reason: collision with root package name */
    private long f24977A1;

    /* renamed from: A2, reason: collision with root package name */
    private long f24978A2;

    /* renamed from: A3, reason: collision with root package name */
    private long f24979A3;
    private int BC;
    private long BC_MASK;
    private int ROUNDS;
    private int blockBits;
    private boolean forEncryption;
    private byte[] shifts0SC;
    private byte[] shifts1SC;
    private long[][] workingKey;
    private static final byte[] logtable = {0, 0, 25, 1, ISO7816.INS_INCREASE, 2, 26, -58, 75, -57, 27, 104, 51, -18, -33, 3, ISOFileInfo.FMD_BYTE, 4, ISO7816.INS_CREATE_FILE, 14, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.DATA_BYTES2, -17, 76, 113, 8, -56, -8, 105, 28, -63, 125, ISO7816.INS_ENVELOPE, 29, -75, -7, -71, 39, 106, 77, ISO7816.INS_DELETE_FILE, -90, 114, -102, -55, 9, 120, 101, 47, ISOFileInfo.LCS_BYTE, 5, 33, PassportService.SFI_DG15, -31, ISO7816.INS_CHANGE_CHV, 18, -16, -126, 69, 53, -109, ISO7816.INS_PUT_DATA, ISOFileInfo.CHANNEL_SECURITY, -106, -113, -37, -67, 54, ISO7816.INS_WRITE_BINARY, -50, -108, 19, 92, ISO7816.INS_WRITE_RECORD, -15, 64, 70, ISOFileInfo.FILE_IDENTIFIER, 56, 102, -35, -3, ISO7816.INS_DECREASE, -65, 6, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.FCP_BYTE, ISO7816.INS_READ_RECORD2, 37, ISO7816.INS_APPEND_RECORD, -104, ISO7816.INS_MSE, -120, -111, 16, 126, 110, 72, -61, -93, ISO7816.INS_READ_RECORD_STAMPED, PassportService.SFI_COM, CVCAFile.CAR_TAG, 58, 107, 40, 84, -6, ISOFileInfo.PROP_INFO, 61, -70, 43, 121, 10, 21, -101, -97, 94, ISO7816.INS_GET_DATA, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, 80, -12, -22, ISO7816.INS_UPDATE_BINARY, 116, 79, -82, -23, -43, -25, -26, -83, -24, ISO7816.INS_UNBLOCK_CHV, -41, 117, 122, -21, 22, PassportService.SFI_DG11, -11, 89, -53, 95, ISO7816.INS_READ_BINARY, -100, -87, 81, ISOFileInfo.f24316A0, Byte.MAX_VALUE, PassportService.SFI_DG12, -10, ISOFileInfo.FCI_BYTE, 23, -60, 73, -20, ISO7816.INS_LOAD_KEY_FILE, 67, 31, 45, -92, 118, 123, -73, -52, -69, 62, 90, -5, 96, ISO7816.INS_READ_BINARY2, -122, 59, 82, ISOFileInfo.f24317A1, 108, -86, 85, 41, -99, -105, -78, ISOFileInfo.FCI_EXT, -112, 97, -66, ISO7816.INS_UPDATE_RECORD, -4, PSSSigner.TRAILER_IMPLICIT, -107, -49, -51, 55, 63, 91, -47, 83, 57, -124, 60, 65, -94, 109, 71, 20, ISO7816.INS_PSO, -98, 93, 86, -14, -45, ISOFileInfo.AB, ISO7816.INS_REHABILITATE_CHV, 17, -110, -39, 35, ISO7816.INS_VERIFY, 46, -119, ISO7816.INS_READ_BINARY_STAMPED, 124, -72, 38, 119, -103, -29, ISOFileInfo.f24319A5, 103, 74, -19, -34, -59, 49, -2, 24, PassportService.SFI_DG13, 99, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.DATA_BYTES1, ISO7816.INS_GET_RESPONSE, -9, ISO7816.INS_MANAGE_CHANNEL, 7};
    private static final byte[] aLogtable = {0, 3, 5, PassportService.SFI_DG15, 17, 51, 85, -1, 26, 46, 114, -106, ISOFileInfo.f24317A1, -8, 19, 53, 95, -31, 56, 72, ISO7816.INS_LOAD_KEY_FILE, 115, -107, -92, -9, 2, 6, 10, PassportService.SFI_COM, ISO7816.INS_MSE, 102, -86, -27, ISO7816.INS_DECREASE_STAMPED, 92, ISO7816.INS_DELETE_FILE, 55, 89, -21, 38, 106, -66, -39, ISO7816.INS_MANAGE_CHANNEL, -112, ISOFileInfo.AB, -26, 49, 83, -11, 4, PassportService.SFI_DG12, 20, 60, ISO7816.INS_REHABILITATE_CHV, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, ISO7816.INS_CREATE_FILE, 59, 77, -41, ISOFileInfo.FCP_BYTE, -90, -15, 8, 24, 40, 120, -120, ISOFileInfo.FILE_IDENTIFIER, -98, -71, ISO7816.INS_WRITE_BINARY, 107, -67, ISO7816.INS_UPDATE_RECORD, Byte.MAX_VALUE, ISOFileInfo.DATA_BYTES2, -104, ISO7816.INS_READ_RECORD2, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, ISO7816.INS_DECREASE, 80, -16, PassportService.SFI_DG11, 29, 39, 105, -69, ISO7816.INS_UPDATE_BINARY, 97, -93, -2, 25, 43, 125, ISOFileInfo.FCI_EXT, -110, -83, -20, 47, 113, -109, -82, -23, ISO7816.INS_VERIFY, 96, ISOFileInfo.f24316A0, -5, 22, 58, 78, ISO7816.INS_WRITE_RECORD, 109, -73, ISO7816.INS_ENVELOPE, 93, -25, ISO7816.INS_INCREASE, 86, -6, 21, 63, 65, -61, 94, ISO7816.INS_APPEND_RECORD, 61, 71, -55, 64, ISO7816.INS_GET_RESPONSE, 91, -19, ISO7816.INS_UNBLOCK_CHV, 116, -100, -65, ISO7816.INS_PUT_DATA, 117, -97, -70, -43, ISOFileInfo.FMD_BYTE, -84, -17, ISO7816.INS_PSO, 126, -126, -99, PSSSigner.TRAILER_IMPLICIT, -33, 122, ISOFileInfo.CHANNEL_SECURITY, -119, ISOFileInfo.DATA_BYTES1, -101, ISO7816.INS_READ_RECORD_STAMPED, -63, 88, -24, 35, 101, -81, -22, 37, ISOFileInfo.FCI_BYTE, ISO7816.INS_READ_BINARY2, -56, 67, -59, 84, -4, 31, 33, 99, ISOFileInfo.f24319A5, -12, 7, 9, 27, 45, 119, -103, ISO7816.INS_READ_BINARY, -53, 70, ISO7816.INS_GET_DATA, 69, -49, 74, -34, 121, ISOFileInfo.SECURITY_ATTR_EXP, -122, -111, -88, -29, 62, CVCAFile.CAR_TAG, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_COMPACT, -113, ISOFileInfo.LCS_BYTE, ISOFileInfo.PROP_INFO, -108, -89, -14, PassportService.SFI_DG13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, ISO7816.INS_CHANGE_CHV, 108, ISO7816.INS_READ_BINARY_STAMPED, -57, 82, -10, 1, 3, 5, PassportService.SFI_DG15, 17, 51, 85, -1, 26, 46, 114, -106, ISOFileInfo.f24317A1, -8, 19, 53, 95, -31, 56, 72, ISO7816.INS_LOAD_KEY_FILE, 115, -107, -92, -9, 2, 6, 10, PassportService.SFI_COM, ISO7816.INS_MSE, 102, -86, -27, ISO7816.INS_DECREASE_STAMPED, 92, ISO7816.INS_DELETE_FILE, 55, 89, -21, 38, 106, -66, -39, ISO7816.INS_MANAGE_CHANNEL, -112, ISOFileInfo.AB, -26, 49, 83, -11, 4, PassportService.SFI_DG12, 20, 60, ISO7816.INS_REHABILITATE_CHV, -52, 79, -47, 104, -72, -45, 110, -78, -51, 76, -44, 103, -87, ISO7816.INS_CREATE_FILE, 59, 77, -41, ISOFileInfo.FCP_BYTE, -90, -15, 8, 24, 40, 120, -120, ISOFileInfo.FILE_IDENTIFIER, -98, -71, ISO7816.INS_WRITE_BINARY, 107, -67, ISO7816.INS_UPDATE_RECORD, Byte.MAX_VALUE, ISOFileInfo.DATA_BYTES2, -104, ISO7816.INS_READ_RECORD2, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, ISO7816.INS_DECREASE, 80, -16, PassportService.SFI_DG11, 29, 39, 105, -69, ISO7816.INS_UPDATE_BINARY, 97, -93, -2, 25, 43, 125, ISOFileInfo.FCI_EXT, -110, -83, -20, 47, 113, -109, -82, -23, ISO7816.INS_VERIFY, 96, ISOFileInfo.f24316A0, -5, 22, 58, 78, ISO7816.INS_WRITE_RECORD, 109, -73, ISO7816.INS_ENVELOPE, 93, -25, ISO7816.INS_INCREASE, 86, -6, 21, 63, 65, -61, 94, ISO7816.INS_APPEND_RECORD, 61, 71, -55, 64, ISO7816.INS_GET_RESPONSE, 91, -19, ISO7816.INS_UNBLOCK_CHV, 116, -100, -65, ISO7816.INS_PUT_DATA, 117, -97, -70, -43, ISOFileInfo.FMD_BYTE, -84, -17, ISO7816.INS_PSO, 126, -126, -99, PSSSigner.TRAILER_IMPLICIT, -33, 122, ISOFileInfo.CHANNEL_SECURITY, -119, ISOFileInfo.DATA_BYTES1, -101, ISO7816.INS_READ_RECORD_STAMPED, -63, 88, -24, 35, 101, -81, -22, 37, ISOFileInfo.FCI_BYTE, ISO7816.INS_READ_BINARY2, -56, 67, -59, 84, -4, 31, 33, 99, ISOFileInfo.f24319A5, -12, 7, 9, 27, 45, 119, -103, ISO7816.INS_READ_BINARY, -53, 70, ISO7816.INS_GET_DATA, 69, -49, 74, -34, 121, ISOFileInfo.SECURITY_ATTR_EXP, -122, -111, -88, -29, 62, CVCAFile.CAR_TAG, -58, 81, -13, 14, 18, 54, 90, -18, 41, 123, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.SECURITY_ATTR_COMPACT, -113, ISOFileInfo.LCS_BYTE, ISOFileInfo.PROP_INFO, -108, -89, -14, PassportService.SFI_DG13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, ISO7816.INS_CHANGE_CHV, 108, ISO7816.INS_READ_BINARY_STAMPED, -57, 82, -10, 1};
    private static final byte[] S = {99, 124, 119, 123, -14, 107, ISOFileInfo.FCI_BYTE, -59, ISO7816.INS_DECREASE, 1, 103, 43, -2, -41, ISOFileInfo.AB, 118, ISO7816.INS_GET_DATA, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, ISO7816.INS_GET_RESPONSE, -73, -3, -109, 38, 54, 63, -9, -52, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.f24319A5, -27, -15, 113, ISO7816.INS_LOAD_KEY_FILE, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ISOFileInfo.DATA_BYTES1, ISO7816.INS_APPEND_RECORD, -21, 39, -78, 117, 9, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_UNBLOCK_CHV, 26, 27, 110, 90, ISOFileInfo.f24316A0, 82, 59, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_READ_RECORD2, 41, -29, 47, -124, 83, -47, 0, -19, ISO7816.INS_VERIFY, -4, ISO7816.INS_READ_BINARY2, 91, 106, -53, -66, 57, 74, 76, 88, -49, ISO7816.INS_WRITE_BINARY, -17, -86, -5, 67, 77, 51, ISOFileInfo.PROP_INFO, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_PUT_DATA, 33, 16, -1, -13, ISO7816.INS_WRITE_RECORD, -51, PassportService.SFI_DG12, 19, -20, 95, -105, ISO7816.INS_REHABILITATE_CHV, 23, -60, -89, 126, 61, ISOFileInfo.FMD_BYTE, 93, 25, 115, 96, ISOFileInfo.DATA_BYTES2, 79, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_MSE, ISO7816.INS_PSO, -112, -120, 70, -18, -72, 20, -34, 94, PassportService.SFI_DG11, -37, ISO7816.INS_CREATE_FILE, ISO7816.INS_INCREASE, 58, 10, 73, 6, ISO7816.INS_CHANGE_CHV, 92, ISO7816.INS_ENVELOPE, -45, -84, ISOFileInfo.FCP_BYTE, -111, -107, ISO7816.INS_DELETE_FILE, 121, -25, -56, 55, 109, ISOFileInfo.ENV_TEMP_EF, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, ISO7816.INS_READ_BINARY_STAMPED, -58, -24, -35, 116, 31, 75, -67, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ISOFileInfo.CHANNEL_SECURITY, -108, -101, PassportService.SFI_COM, ISOFileInfo.FCI_EXT, -23, -50, 85, 40, -33, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.f24317A1, -119, PassportService.SFI_DG13, -65, -26, CVCAFile.CAR_TAG, 104, 65, -103, 45, PassportService.SFI_DG15, ISO7816.INS_READ_BINARY, 84, -69, 22};
    private static final byte[] Si = {82, 9, 106, -43, ISO7816.INS_DECREASE, 54, ISOFileInfo.f24319A5, 56, -65, 64, -93, -98, ISOFileInfo.DATA_BYTES2, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, ISOFileInfo.FCI_EXT, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.CHANNEL_SECURITY, 67, ISO7816.INS_REHABILITATE_CHV, -60, -34, -23, -53, 84, 123, -108, ISO7816.INS_INCREASE, -90, ISO7816.INS_ENVELOPE, 35, 61, -18, 76, -107, PassportService.SFI_DG11, CVCAFile.CAR_TAG, -6, -61, 78, 8, 46, ISOFileInfo.f24317A1, 102, 40, -39, ISO7816.INS_CHANGE_CHV, -78, 118, 91, -94, 73, 109, ISOFileInfo.SECURITY_ATTR_EXP, -47, 37, 114, -8, -10, ISOFileInfo.FMD_BYTE, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, ISO7816.INS_READ_RECORD_STAMPED, -110, 108, ISO7816.INS_MANAGE_CHANNEL, 72, 80, -3, -19, -71, ISO7816.INS_PUT_DATA, 94, 21, 70, 87, -89, ISOFileInfo.ENV_TEMP_EF, -99, -124, -112, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.AB, 0, ISOFileInfo.SECURITY_ATTR_COMPACT, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, ISO7816.INS_DELETE_FILE, 88, 5, -72, ISO7816.INS_READ_RECORD2, 69, 6, ISO7816.INS_WRITE_BINARY, ISO7816.INS_UNBLOCK_CHV, PassportService.SFI_COM, -113, ISO7816.INS_GET_DATA, 63, PassportService.SFI_DG15, 2, -63, -81, -67, 3, 1, 19, ISOFileInfo.LCS_BYTE, 107, 58, -111, 17, 65, 79, 103, ISO7816.INS_UPDATE_RECORD, -22, -105, -14, -49, -50, -16, ISO7816.INS_READ_BINARY_STAMPED, -26, 115, -106, -84, 116, ISO7816.INS_MSE, -25, -83, 53, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, ISOFileInfo.FCI_BYTE, -73, ISOFileInfo.FCP_BYTE, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, ISO7816.INS_WRITE_RECORD, 121, ISO7816.INS_VERIFY, -102, -37, ISO7816.INS_GET_RESPONSE, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, ISO7816.INS_READ_BINARY2, 18, 16, 89, 39, ISOFileInfo.DATA_BYTES1, -20, 95, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, PassportService.SFI_DG13, 45, -27, 122, -97, -109, -55, -100, -17, ISOFileInfo.f24316A0, ISO7816.INS_CREATE_FILE, 59, 77, -82, ISO7816.INS_PSO, -11, ISO7816.INS_READ_BINARY, -56, -21, -69, 60, ISOFileInfo.FILE_IDENTIFIER, 83, -103, 97, 23, 43, 4, 126, -70, 119, ISO7816.INS_UPDATE_BINARY, 38, -31, 105, 20, 99, 85, 33, PassportService.SFI_DG12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 125, u.d.DEFAULT_SWIPE_ANIMATION_DURATION, 239, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 145};
    static byte[][] shifts0 = {new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, ISO7816.INS_VERIFY}, new byte[]{0, 8, 24, ISO7816.INS_VERIFY}};
    static byte[][] shifts1 = {new byte[]{0, 24, 16, 8}, new byte[]{0, ISO7816.INS_VERIFY, 24, 16}, new byte[]{0, 40, ISO7816.INS_VERIFY, 24}, new byte[]{0, ISO7816.INS_DECREASE, 40, 24}, new byte[]{0, 56, 40, ISO7816.INS_VERIFY}};

    public RijndaelEngine() {
        this(128);
    }

    private void InvMixColumn() {
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        for (int i = 0; i < this.BC; i += 8) {
            int i9 = (int) ((this.f24976A0 >> i) & 255);
            int i10 = (int) ((this.f24977A1 >> i) & 255);
            int i11 = (int) ((this.f24978A2 >> i) & 255);
            long j14 = j12;
            int i12 = (int) ((this.f24979A3 >> i) & 255);
            int i13 = -1;
            int i14 = i9 != 0 ? logtable[i9 & 255] & 255 : -1;
            int i15 = i10 != 0 ? logtable[i10 & 255] & 255 : -1;
            int i16 = i11 != 0 ? logtable[i11 & 255] & 255 : -1;
            if (i12 != 0) {
                i13 = logtable[i12 & 255] & 255;
            }
            j10 |= ((((mul0xe(i14) ^ mul0xb(i15)) ^ mul0xd(i16)) ^ mul0x9(i13)) & 255) << i;
            j13 |= ((((mul0xe(i15) ^ mul0xb(i16)) ^ mul0xd(i13)) ^ mul0x9(i14)) & 255) << i;
            j11 |= ((((mul0xe(i16) ^ mul0xb(i13)) ^ mul0xd(i14)) ^ mul0x9(i15)) & 255) << i;
            j12 = (((((mul0xe(i13) ^ mul0xb(i14)) ^ mul0xd(i15)) ^ mul0x9(i16)) & 255) << i) | j14;
        }
        this.f24976A0 = j10;
        this.f24977A1 = j13;
        this.f24978A2 = j11;
        this.f24979A3 = j12;
    }

    private void KeyAddition(long[] jArr) {
        this.f24976A0 ^= jArr[0];
        this.f24977A1 ^= jArr[1];
        this.f24978A2 ^= jArr[2];
        this.f24979A3 ^= jArr[3];
    }

    private void MixColumn() {
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        for (int i = 0; i < this.BC; i += 8) {
            int i9 = (int) ((this.f24976A0 >> i) & 255);
            int i10 = (int) ((this.f24977A1 >> i) & 255);
            int i11 = (int) ((this.f24978A2 >> i) & 255);
            long j14 = j12;
            int i12 = (int) ((this.f24979A3 >> i) & 255);
            j10 |= ((((mul0x2(i9) ^ mul0x3(i10)) ^ i11) ^ i12) & 255) << i;
            j13 |= ((((mul0x2(i10) ^ mul0x3(i11)) ^ i12) ^ i9) & 255) << i;
            j11 |= ((((mul0x2(i11) ^ mul0x3(i12)) ^ i9) ^ i10) & 255) << i;
            j12 = (((((mul0x2(i12) ^ mul0x3(i9)) ^ i10) ^ i11) & 255) << i) | j14;
        }
        this.f24976A0 = j10;
        this.f24977A1 = j13;
        this.f24978A2 = j11;
        this.f24979A3 = j12;
    }

    private void ShiftRow(byte[] bArr) {
        this.f24977A1 = shift(this.f24977A1, bArr[1]);
        this.f24978A2 = shift(this.f24978A2, bArr[2]);
        this.f24979A3 = shift(this.f24979A3, bArr[3]);
    }

    private void Substitution(byte[] bArr) {
        this.f24976A0 = applyS(this.f24976A0, bArr);
        this.f24977A1 = applyS(this.f24977A1, bArr);
        this.f24978A2 = applyS(this.f24978A2, bArr);
        this.f24979A3 = applyS(this.f24979A3, bArr);
    }

    private long applyS(long j10, byte[] bArr) {
        long j11 = 0;
        for (int i = 0; i < this.BC; i += 8) {
            j11 |= (bArr[(int) ((j10 >> i) & 255)] & 255) << i;
        }
        return j11;
    }

    private void decryptBlock(long[][] jArr) {
        KeyAddition(jArr[this.ROUNDS]);
        Substitution(Si);
        ShiftRow(this.shifts1SC);
        for (int i = this.ROUNDS - 1; i > 0; i--) {
            KeyAddition(jArr[i]);
            InvMixColumn();
            Substitution(Si);
            ShiftRow(this.shifts1SC);
        }
        KeyAddition(jArr[0]);
    }

    private void encryptBlock(long[][] jArr) {
        KeyAddition(jArr[0]);
        for (int i = 1; i < this.ROUNDS; i++) {
            Substitution(S);
            ShiftRow(this.shifts0SC);
            MixColumn();
            KeyAddition(jArr[i]);
        }
        Substitution(S);
        ShiftRow(this.shifts0SC);
        KeyAddition(jArr[this.ROUNDS]);
    }

    private long[][] generateWorkingKey(byte[] bArr) {
        int i;
        int i9;
        int i10;
        int i11 = 8;
        int length = bArr.length * 8;
        int i12 = 1;
        int i13 = 0;
        int i14 = 4;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 64);
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 15, 4);
        if (length == 128) {
            i = 4;
        } else if (length == 160) {
            i = 5;
        } else if (length == 192) {
            i = 6;
        } else if (length == 224) {
            i = 7;
        } else {
            if (length != 256) {
                throw new IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
            }
            i = 8;
        }
        this.ROUNDS = length >= this.blockBits ? i + 6 : (this.BC / 8) + 6;
        int i15 = 0;
        int i16 = 0;
        while (i15 < bArr.length) {
            bArr2[i15 % 4][i15 / 4] = bArr[i16];
            i15++;
            i16++;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < i && i18 < (this.BC / 8) * (this.ROUNDS + 1)) {
            int i19 = i13;
            while (i19 < i14) {
                int i20 = this.BC;
                long[] jArr2 = jArr[i18 / (i20 / 8)];
                jArr2[i19] = ((bArr2[i19][i17] & 255) << ((i18 * 8) % i20)) | jArr2[i19];
                i19++;
                i14 = 4;
            }
            i17++;
            i18++;
            i13 = 0;
            i14 = 4;
        }
        int i21 = 0;
        while (i18 < (this.BC / i11) * (this.ROUNDS + i12)) {
            int i22 = 0;
            for (int i23 = 4; i22 < i23; i23 = 4) {
                byte[] bArr3 = bArr2[i22];
                i22++;
                bArr3[0] = (byte) (S[bArr2[i22 % 4][i - 1] & 255] ^ bArr3[0]);
            }
            byte[] bArr4 = bArr2[0];
            int i24 = i21 + 1;
            bArr4[0] = (byte) (rcon[i21] ^ bArr4[0]);
            if (i <= 6) {
                for (int i25 = i12; i25 < i; i25++) {
                    for (int i26 = 0; i26 < 4; i26++) {
                        byte[] bArr5 = bArr2[i26];
                        bArr5[i25] = (byte) (bArr5[i25] ^ bArr5[i25 - 1]);
                    }
                }
            } else {
                int i27 = i12;
                while (true) {
                    i9 = 4;
                    i10 = 0;
                    if (i27 >= 4) {
                        break;
                    }
                    while (i10 < i9) {
                        byte[] bArr6 = bArr2[i10];
                        bArr6[i27] = (byte) (bArr6[i27] ^ bArr6[i27 - 1]);
                        i10++;
                        i9 = 4;
                    }
                    i27++;
                }
                while (i10 < 4) {
                    byte[] bArr7 = bArr2[i10];
                    bArr7[4] = (byte) (bArr7[4] ^ S[bArr7[3] & 255]);
                    i10++;
                }
                int i28 = 5;
                while (i28 < i) {
                    int i29 = 0;
                    while (i29 < i9) {
                        byte[] bArr8 = bArr2[i29];
                        bArr8[i28] = (byte) (bArr8[i28] ^ bArr8[i28 - 1]);
                        i29++;
                        i9 = 4;
                    }
                    i28++;
                    i9 = 4;
                }
            }
            int i30 = 0;
            while (i30 < i && i18 < (this.BC / i11) * (this.ROUNDS + i12)) {
                for (int i31 = 0; i31 < 4; i31++) {
                    int i32 = this.BC;
                    long[] jArr3 = jArr[i18 / (i32 / 8)];
                    jArr3[i31] = ((bArr2[i31][i30] & 255) << ((i18 * 8) % i32)) | jArr3[i31];
                }
                i30++;
                i18++;
                i11 = 8;
                i12 = 1;
            }
            i21 = i24;
            i11 = 8;
            i12 = 1;
        }
        return jArr;
    }

    private byte mul0x2(int i) {
        if (i != 0) {
            return aLogtable[(logtable[i] & 255) + 25];
        }
        return (byte) 0;
    }

    private byte mul0x3(int i) {
        if (i != 0) {
            return aLogtable[(logtable[i] & 255) + 1];
        }
        return (byte) 0;
    }

    private byte mul0x9(int i) {
        if (i >= 0) {
            return aLogtable[i + 199];
        }
        return (byte) 0;
    }

    private byte mul0xb(int i) {
        if (i >= 0) {
            return aLogtable[i + 104];
        }
        return (byte) 0;
    }

    private byte mul0xd(int i) {
        if (i >= 0) {
            return aLogtable[i + 238];
        }
        return (byte) 0;
    }

    private byte mul0xe(int i) {
        if (i >= 0) {
            return aLogtable[i + PassportService.DEFAULT_MAX_BLOCKSIZE];
        }
        return (byte) 0;
    }

    private void packBlock(byte[] bArr, int i) {
        for (int i9 = 0; i9 != this.BC; i9 += 8) {
            bArr[i] = (byte) (this.f24976A0 >> i9);
            bArr[i + 1] = (byte) (this.f24977A1 >> i9);
            int i10 = i + 3;
            bArr[i + 2] = (byte) (this.f24978A2 >> i9);
            i += 4;
            bArr[i10] = (byte) (this.f24979A3 >> i9);
        }
    }

    private long shift(long j10, int i) {
        return ((j10 << (this.BC - i)) | (j10 >>> i)) & this.BC_MASK;
    }

    private void unpackBlock(byte[] bArr, int i) {
        this.f24976A0 = bArr[i] & 255;
        this.f24977A1 = bArr[i + 1] & 255;
        int i9 = i + 3;
        this.f24978A2 = bArr[i + 2] & 255;
        int i10 = i + 4;
        this.f24979A3 = bArr[i9] & 255;
        for (int i11 = 8; i11 != this.BC; i11 += 8) {
            this.f24976A0 |= (bArr[i10] & 255) << i11;
            this.f24977A1 |= (bArr[i10 + 1] & 255) << i11;
            int i12 = i10 + 3;
            this.f24978A2 |= (bArr[i10 + 2] & 255) << i11;
            i10 += 4;
            this.f24979A3 |= (bArr[i12] & 255) << i11;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Rijndael";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.BC / 2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to Rijndael init - ", cipherParameters));
        }
        this.workingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey());
        this.forEncryption = z10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (this.workingKey == null) {
            throw new IllegalStateException("Rijndael engine not initialised");
        }
        int i10 = this.BC;
        if ((i10 / 2) + i > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if ((i10 / 2) + i9 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        boolean z10 = this.forEncryption;
        unpackBlock(bArr, i);
        long[][] jArr = this.workingKey;
        if (z10) {
            encryptBlock(jArr);
        } else {
            decryptBlock(jArr);
        }
        packBlock(bArr2, i9);
        return this.BC / 2;
    }

    public RijndaelEngine(int i) {
        if (i == 128) {
            this.BC = 32;
            this.BC_MASK = BodyPartID.bodyIdMax;
            this.shifts0SC = shifts0[0];
            this.shifts1SC = shifts1[0];
        } else if (i == 160) {
            this.BC = 40;
            this.BC_MASK = 1099511627775L;
            this.shifts0SC = shifts0[1];
            this.shifts1SC = shifts1[1];
        } else if (i == 192) {
            this.BC = 48;
            this.BC_MASK = 281474976710655L;
            this.shifts0SC = shifts0[2];
            this.shifts1SC = shifts1[2];
        } else if (i == 224) {
            this.BC = 56;
            this.BC_MASK = 72057594037927935L;
            this.shifts0SC = shifts0[3];
            this.shifts1SC = shifts1[3];
        } else {
            if (i != 256) {
                throw new IllegalArgumentException("unknown blocksize to Rijndael");
            }
            this.BC = 64;
            this.BC_MASK = -1L;
            this.shifts0SC = shifts0[4];
            this.shifts1SC = shifts1[4];
        }
        this.blockBits = i;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
