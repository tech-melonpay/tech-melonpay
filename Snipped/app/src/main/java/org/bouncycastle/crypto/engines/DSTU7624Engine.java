package org.bouncycastle.crypto.engines;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class DSTU7624Engine implements BlockCipher {
    private static final int ROUNDS_128 = 10;
    private static final int ROUNDS_256 = 14;
    private static final int ROUNDS_512 = 18;

    /* renamed from: S0, reason: collision with root package name */
    private static final byte[] f24957S0 = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, ISOFileInfo.FCI_EXT, -107, 23, -16, ISO7816.INS_LOAD_KEY_FILE, 9, 109, -13, 29, -53, -55, 77, ISO7816.INS_UNBLOCK_CHV, -81, 121, ISO7816.INS_CREATE_FILE, -105, -3, ISOFileInfo.FCI_BYTE, 75, 69, 57, 62, -35, -93, 79, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_READ_RECORD_STAMPED, -102, 14, 31, -65, 21, -31, 73, ISO7816.INS_WRITE_RECORD, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, ISOFileInfo.f24317A1, ISO7816.INS_UPDATE_RECORD, -14, ISOFileInfo.FILE_IDENTIFIER, 55, CVCAFile.CAR_TAG, ISO7816.INS_DELETE_FILE, 122, ISO7816.INS_INCREASE, -100, -52, ISOFileInfo.AB, 74, -113, 110, 4, 39, 46, -25, ISO7816.INS_APPEND_RECORD, 90, -106, 22, 35, 43, ISO7816.INS_ENVELOPE, 101, 102, PassportService.SFI_DG15, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, ISO7816.INS_DECREASE_STAMPED, 72, -4, -73, 106, -120, ISOFileInfo.f24319A5, 83, -122, -7, 91, -37, 56, 123, -61, PassportService.SFI_COM, ISO7816.INS_MSE, 51, ISO7816.INS_CHANGE_CHV, 40, 54, -57, -78, 59, ISOFileInfo.CHANNEL_SECURITY, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, ISO7816.INS_PUT_DATA, 24, 70, -51, 125, 33, ISO7816.INS_READ_BINARY, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, ISO7816.INS_MANAGE_CHANNEL, 103, 64, -75, -34, 93, ISO7816.INS_DECREASE, -111, ISO7816.INS_READ_BINARY2, 120, 17, 1, -27, 0, 104, -104, ISOFileInfo.f24316A0, -59, 2, -90, 116, 45, PassportService.SFI_DG11, -94, 118, ISO7816.INS_READ_RECORD2, -66, -50, -67, -82, -23, ISOFileInfo.LCS_BYTE, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, ISOFileInfo.SECURITY_ATTR_COMPACT, 53, 3, -44, Byte.MAX_VALUE, -5, 5, -63, 94, -112, ISO7816.INS_VERIFY, 61, -126, -9, -22, 10, PassportService.SFI_DG13, 126, -8, 80, 26, -60, 7, 87, -72, 60, ISOFileInfo.FCP_BYTE, -29, -56, -84, 82, ISOFileInfo.FMD_BYTE, 16, ISO7816.INS_WRITE_BINARY, -39, 19, PassportService.SFI_DG12, 18, 41, 81, -71, -49, ISO7816.INS_UPDATE_BINARY, 115, ISOFileInfo.ENV_TEMP_EF, ISOFileInfo.DATA_BYTES2, 84, ISO7816.INS_GET_RESPONSE, -19, 78, ISO7816.INS_REHABILITATE_CHV, -89, ISO7816.INS_PSO, ISOFileInfo.PROP_INFO, 37, -26, ISO7816.INS_GET_DATA, 124, ISOFileInfo.SECURITY_ATTR_EXP, 86, ISOFileInfo.DATA_BYTES1};

    /* renamed from: S1, reason: collision with root package name */
    private static final byte[] f24958S1 = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, ISO7816.INS_UPDATE_BINARY, -78, ISO7816.INS_WRITE_RECORD, -112, 23, -8, CVCAFile.CAR_TAG, 21, 86, ISO7816.INS_READ_BINARY_STAMPED, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, ISOFileInfo.ENV_TEMP_EF, 49, -10, ISOFileInfo.FMD_BYTE, 88, -98, -12, ISO7816.INS_MSE, -86, 117, PassportService.SFI_DG15, 2, ISO7816.INS_READ_BINARY2, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, ISO7816.INS_REHABILITATE_CHV, 62, -97, 20, -56, -82, 84, 16, ISO7816.INS_LOAD_KEY_FILE, PSSSigner.TRAILER_IMPLICIT, 26, 107, 105, -13, -67, 51, ISOFileInfo.AB, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, ISOFileInfo.CHANNEL_SECURITY, 91, -52, 60, 25, ISOFileInfo.f24317A1, ISOFileInfo.DATA_BYTES2, 73, 123, -39, ISOFileInfo.FCI_BYTE, 55, 96, ISO7816.INS_GET_DATA, -25, 43, 72, -3, -106, 69, -4, 65, 18, PassportService.SFI_DG13, 121, -27, -119, ISOFileInfo.SECURITY_ATTR_COMPACT, -29, ISO7816.INS_VERIFY, ISO7816.INS_DECREASE, ISO7816.INS_UPDATE_RECORD, -73, 108, 74, -75, 63, -105, -44, ISOFileInfo.FCP_BYTE, 45, 6, -92, ISOFileInfo.f24319A5, ISOFileInfo.FILE_IDENTIFIER, 95, ISO7816.INS_PSO, ISO7816.INS_PUT_DATA, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, PassportService.SFI_DG11, -113, -99, 106, 7, -71, ISO7816.INS_READ_BINARY, -104, 24, ISO7816.INS_INCREASE, 113, 75, -17, 59, ISO7816.INS_MANAGE_CHANNEL, ISOFileInfo.f24316A0, ISO7816.INS_DELETE_FILE, 64, -1, -61, -87, -26, 120, -7, ISOFileInfo.SECURITY_ATTR_EXP, 70, ISOFileInfo.DATA_BYTES1, PassportService.SFI_COM, 56, -31, -72, -88, ISO7816.INS_CREATE_FILE, PassportService.SFI_DG12, 35, 118, 29, 37, ISO7816.INS_CHANGE_CHV, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, 82, -14, -126, 80, 122, 47, 116, 83, ISO7816.INS_READ_RECORD2, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, ISO7816.INS_UNBLOCK_CHV, -35, ISO7816.INS_WRITE_BINARY, ISOFileInfo.FCI_EXT, -66, 94, -90, -20, 4, -58, 3, ISO7816.INS_DECREASE_STAMPED, -5, -37, 89, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_ENVELOPE, 1, -16, 90, -19, -89, 102, 33, Byte.MAX_VALUE, ISOFileInfo.LCS_BYTE, 39, -57, ISO7816.INS_GET_RESPONSE, 41, -41};

    /* renamed from: S2, reason: collision with root package name */
    private static final byte[] f24959S2 = {-109, -39, -102, -75, -104, ISO7816.INS_MSE, 69, -4, -70, 106, -33, 2, -97, ISO7816.INS_UPDATE_RECORD, 81, 89, 74, 23, 43, ISO7816.INS_ENVELOPE, -108, -12, -69, -93, ISOFileInfo.FCP_BYTE, ISO7816.INS_DELETE_FILE, 113, -44, -51, ISO7816.INS_MANAGE_CHANNEL, 22, -31, 73, 60, ISO7816.INS_GET_RESPONSE, ISO7816.INS_LOAD_KEY_FILE, 92, -101, -83, ISOFileInfo.PROP_INFO, 83, ISOFileInfo.f24317A1, 122, -56, 45, ISO7816.INS_CREATE_FILE, -47, 114, -90, ISO7816.INS_UNBLOCK_CHV, -60, -29, 118, 120, -73, ISO7816.INS_READ_BINARY_STAMPED, 9, 59, 14, 65, 76, -34, -78, -112, 37, ISOFileInfo.f24319A5, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, ISO7816.INS_WRITE_BINARY, 123, 24, -105, -45, 54, -26, 72, 86, ISOFileInfo.DATA_BYTES2, -113, 119, -52, -100, -71, ISO7816.INS_APPEND_RECORD, -84, -72, 47, 21, -92, 124, ISO7816.INS_PUT_DATA, 56, PassportService.SFI_COM, PassportService.SFI_DG11, 5, ISO7816.INS_UPDATE_BINARY, 20, 110, 108, 126, 102, -3, ISO7816.INS_READ_BINARY2, -27, 96, -81, 94, 51, ISOFileInfo.FCI_EXT, -55, -16, 93, 109, 63, -120, ISOFileInfo.ENV_TEMP_EF, -57, -9, 29, -23, -20, -19, ISOFileInfo.DATA_BYTES1, 41, 39, -49, -103, -88, 80, PassportService.SFI_DG15, 55, ISO7816.INS_CHANGE_CHV, 40, ISO7816.INS_DECREASE, -107, ISO7816.INS_WRITE_RECORD, 62, 91, 64, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_READ_RECORD2, 105, 87, 31, 7, 28, ISOFileInfo.LCS_BYTE, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_VERIFY, -21, -50, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.AB, -18, 49, -94, 115, -7, ISO7816.INS_GET_DATA, 58, 26, -5, PassportService.SFI_DG13, -63, -2, -6, -14, ISOFileInfo.FCI_BYTE, -67, -106, -35, 67, 82, ISO7816.INS_READ_RECORD_STAMPED, 8, -13, -82, -66, 25, -119, ISO7816.INS_INCREASE, 38, ISO7816.INS_READ_BINARY, -22, 75, ISOFileInfo.FMD_BYTE, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, ISO7816.INS_PSO, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, Byte.MAX_VALUE, -59, -89, -25, 97, 90, 6, 70, ISO7816.INS_REHABILITATE_CHV, CVCAFile.CAR_TAG, 4, ISOFileInfo.f24316A0, -37, 57, -122, 84, -86, ISOFileInfo.SECURITY_ATTR_COMPACT, ISO7816.INS_DECREASE_STAMPED, 33, ISOFileInfo.SECURITY_ATTR_EXP, -8, PassportService.SFI_DG12, 116, 103};

    /* renamed from: S3, reason: collision with root package name */
    private static final byte[] f24960S3 = {104, ISOFileInfo.ENV_TEMP_EF, ISO7816.INS_GET_DATA, 77, 115, 75, 78, ISO7816.INS_PSO, -44, 82, 38, ISO7816.INS_READ_RECORD2, 84, PassportService.SFI_COM, 25, 31, ISO7816.INS_MSE, 3, 70, 61, 45, 74, 83, ISOFileInfo.FILE_IDENTIFIER, 19, ISOFileInfo.LCS_BYTE, -73, -43, 37, 121, -11, -67, 88, 47, PassportService.SFI_DG13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, ISO7816.INS_MANAGE_CHANNEL, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, ISO7816.INS_WRITE_RECORD, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, ISO7816.INS_UPDATE_BINARY, ISOFileInfo.PROP_INFO, 35, -49, ISO7816.INS_INCREASE, -103, 49, 20, -82, -18, -56, 72, -45, ISO7816.INS_DECREASE, ISOFileInfo.f24317A1, -110, 65, ISO7816.INS_READ_BINARY2, 24, -60, ISO7816.INS_UNBLOCK_CHV, 113, 114, ISO7816.INS_REHABILITATE_CHV, 21, -3, 55, -66, 95, -86, -101, -120, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.AB, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, ISOFileInfo.FCP_BYTE, PassportService.SFI_DG12, ISO7816.INS_CHANGE_CHV, -90, -88, -20, 103, ISO7816.INS_VERIFY, -37, 124, 40, -35, -84, 91, ISO7816.INS_DECREASE_STAMPED, 126, 16, -15, 123, -113, 99, ISOFileInfo.f24316A0, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, ISO7816.INS_READ_RECORD_STAMPED, -41, 41, ISO7816.INS_ENVELOPE, -21, ISO7816.INS_GET_RESPONSE, -92, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.SECURITY_ATTR_COMPACT, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, ISO7816.INS_DELETE_FILE, -39, -71, ISO7816.INS_WRITE_BINARY, CVCAFile.CAR_TAG, -57, 108, -112, 0, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.FCI_BYTE, 80, 1, -59, ISO7816.INS_PUT_DATA, 71, 63, -51, 105, -94, ISO7816.INS_APPEND_RECORD, 122, -89, -58, -109, PassportService.SFI_DG15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, ISO7816.INS_READ_BINARY, -126, -9, -2, -99, ISOFileInfo.FCI_EXT, 92, ISOFileInfo.DATA_BYTES2, 53, -34, ISO7816.INS_READ_BINARY_STAMPED, ISOFileInfo.f24319A5, -4, ISOFileInfo.DATA_BYTES1, -17, -53, -69, 107, 118, -70, 90, 125, 120, PassportService.SFI_DG11, -107, -29, -83, 116, -104, 59, 54, ISOFileInfo.FMD_BYTE, 109, ISO7816.INS_UPDATE_RECORD, -16, 89, -87, 76, 23, Byte.MAX_VALUE, -111, -72, -55, 87, 27, ISO7816.INS_CREATE_FILE, 97};

    /* renamed from: T0, reason: collision with root package name */
    private static final byte[] f24961T0 = {-92, -94, -87, -59, 78, -55, 3, -39, 126, PassportService.SFI_DG15, ISO7816.INS_WRITE_RECORD, -83, -25, -45, 39, 91, -29, ISOFileInfo.f24317A1, -24, -26, 124, ISO7816.INS_PSO, 85, PassportService.SFI_DG12, -122, 57, -41, ISOFileInfo.ENV_TEMP_EF, -72, 18, ISOFileInfo.FCI_BYTE, 40, -51, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, 86, 114, -7, -65, 79, 115, -23, -9, 87, 22, -84, 80, ISO7816.INS_GET_RESPONSE, -99, -73, 71, 113, 96, -60, 116, 67, 108, 31, -109, 119, ISO7816.INS_UPDATE_RECORD, -50, ISO7816.INS_VERIFY, ISOFileInfo.SECURITY_ATTR_COMPACT, -103, 95, ISO7816.INS_REHABILITATE_CHV, 1, -11, PassportService.SFI_COM, ISOFileInfo.FCI_EXT, 94, 97, ISO7816.INS_UNBLOCK_CHV, 75, 29, ISOFileInfo.DATA_BYTES2, 21, -12, 35, ISO7816.INS_UPDATE_BINARY, -22, -31, 103, -15, Byte.MAX_VALUE, -2, ISO7816.INS_PUT_DATA, 60, 7, 83, 106, -124, -100, -53, 2, ISOFileInfo.FILE_IDENTIFIER, 51, -35, 53, ISO7816.INS_APPEND_RECORD, 89, 90, -104, ISOFileInfo.f24319A5, -110, ISOFileInfo.FMD_BYTE, 4, 6, 16, 77, 28, -105, 8, 49, -18, ISOFileInfo.AB, 5, -81, 121, ISOFileInfo.f24316A0, 24, 70, 109, -4, -119, -44, -57, -1, -16, -49, CVCAFile.CAR_TAG, -111, -8, 104, 10, 101, ISOFileInfo.CHANNEL_SECURITY, ISO7816.INS_READ_RECORD_STAMPED, -3, -61, -17, 120, 76, -52, -98, ISO7816.INS_DECREASE, 46, PSSSigner.TRAILER_IMPLICIT, PassportService.SFI_DG11, 84, 26, -90, -69, 38, ISOFileInfo.DATA_BYTES1, 72, -108, ISO7816.INS_INCREASE, 125, -89, 63, -82, ISO7816.INS_MSE, 61, 102, -86, -10, 0, 93, -67, 74, ISO7816.INS_CREATE_FILE, 59, ISO7816.INS_READ_BINARY_STAMPED, 23, ISOFileInfo.SECURITY_ATTR_EXP, -97, 118, ISO7816.INS_READ_BINARY, ISO7816.INS_CHANGE_CHV, -102, 37, 99, -37, -21, 122, 62, 92, ISO7816.INS_READ_RECORD2, ISO7816.INS_READ_BINARY2, 41, -14, ISO7816.INS_GET_DATA, 88, 110, ISO7816.INS_LOAD_KEY_FILE, -88, 47, 117, -33, 20, -5, 19, 73, -120, -78, -20, ISO7816.INS_DELETE_FILE, ISO7816.INS_DECREASE_STAMPED, 45, -106, -58, 58, -19, -107, 14, -27, ISOFileInfo.PROP_INFO, 107, 64, 33, -101, 9, 25, 43, 82, -34, 69, -93, -6, 81, ISO7816.INS_ENVELOPE, -75, -47, -112, -71, -13, 55, -63, PassportService.SFI_DG13, -70, 65, 17, 56, 123, -66, ISO7816.INS_WRITE_BINARY, -43, 105, 54, -56, ISOFileInfo.FCP_BYTE, 27, -126, -113};

    /* renamed from: T1, reason: collision with root package name */
    private static final byte[] f24962T1 = {ISOFileInfo.FILE_IDENTIFIER, -14, ISO7816.INS_PSO, -21, -23, -65, 123, -100, ISO7816.INS_DECREASE_STAMPED, -106, ISOFileInfo.ENV_TEMP_EF, -104, -71, 105, ISOFileInfo.SECURITY_ATTR_COMPACT, 41, 61, -120, 104, 6, 57, 17, 76, 14, ISOFileInfo.f24316A0, 86, 64, -110, 21, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD2, ISO7816.INS_UPDATE_RECORD, ISOFileInfo.FCI_BYTE, -8, 38, -70, -66, -67, 49, -5, -61, -2, ISOFileInfo.DATA_BYTES1, 97, -31, 122, ISO7816.INS_INCREASE, ISO7816.INS_WRITE_RECORD, ISO7816.INS_MANAGE_CHANNEL, ISO7816.INS_VERIFY, ISOFileInfo.f24317A1, 69, -20, -39, 26, 93, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_LOAD_KEY_FILE, 9, ISOFileInfo.f24319A5, 85, ISOFileInfo.CHANNEL_SECURITY, 55, 118, -87, 103, 16, 23, 54, 101, ISO7816.INS_READ_BINARY2, -107, ISOFileInfo.FCP_BYTE, 89, 116, -93, 80, 47, 75, -56, ISO7816.INS_WRITE_BINARY, -113, -51, -44, 60, -122, 18, 29, 35, -17, -12, 83, 25, 53, -26, Byte.MAX_VALUE, 94, ISO7816.INS_UPDATE_BINARY, 121, 81, ISO7816.INS_MSE, 20, -9, PassportService.SFI_COM, 74, CVCAFile.CAR_TAG, -101, 65, 115, 45, -63, 92, -90, -94, ISO7816.INS_CREATE_FILE, 46, -45, 40, -69, -55, -82, 106, -47, 90, ISO7816.INS_DECREASE, -112, -124, -7, -78, 88, -49, 126, -59, -53, -105, ISO7816.INS_DELETE_FILE, 22, 108, -6, ISO7816.INS_READ_BINARY, 109, 31, 82, -103, PassportService.SFI_DG13, 78, 3, -111, ISO7816.INS_ENVELOPE, 77, ISOFileInfo.FMD_BYTE, 119, -97, -35, -60, 73, ISOFileInfo.LCS_BYTE, -102, ISO7816.INS_CHANGE_CHV, 56, -89, 87, ISOFileInfo.PROP_INFO, -57, 124, 125, -25, -10, -73, -84, 39, 70, -34, -33, 59, -41, -98, 43, PassportService.SFI_DG11, -43, 19, 117, -16, 114, ISO7816.INS_READ_RECORD_STAMPED, -99, 27, 1, 63, ISO7816.INS_REHABILITATE_CHV, -27, ISOFileInfo.FCI_EXT, -3, 7, -15, ISOFileInfo.AB, -108, 24, -22, -4, 58, -126, 95, 5, 84, -37, 0, ISOFileInfo.SECURITY_ATTR_EXP, -29, 72, PassportService.SFI_DG12, ISO7816.INS_GET_DATA, 120, -119, 10, -1, 62, 91, ISOFileInfo.DATA_BYTES2, -18, 113, ISO7816.INS_APPEND_RECORD, ISO7816.INS_PUT_DATA, ISO7816.INS_UNBLOCK_CHV, -72, -75, -52, 110, -88, 107, -83, 96, -58, 8, 4, 2, -24, -11, 79, -92, -13, ISO7816.INS_GET_RESPONSE, -50, 67, 37, 28, 33, 51, PassportService.SFI_DG15, -81, 71, -19, 102, 99, -109, -86};

    /* renamed from: T2, reason: collision with root package name */
    private static final byte[] f24963T2 = {69, -44, PassportService.SFI_DG11, 67, -15, 114, -19, -92, ISO7816.INS_ENVELOPE, 56, -26, 113, -3, ISO7816.INS_READ_RECORD_STAMPED, 58, -107, 80, ISO7816.INS_REHABILITATE_CHV, 75, ISO7816.INS_APPEND_RECORD, 116, 107, PassportService.SFI_COM, 17, 90, -58, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.f24319A5, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, -93, -88, -6, 5, -39, -105, 64, -55, -112, -104, -113, ISO7816.INS_UPDATE_RECORD, 18, 49, ISO7816.INS_UNBLOCK_CHV, 71, 106, -103, -82, -56, Byte.MAX_VALUE, -7, 79, 93, -106, ISOFileInfo.FCI_BYTE, -12, ISO7816.INS_READ_RECORD2, 57, 33, ISO7816.INS_PUT_DATA, -100, ISOFileInfo.PROP_INFO, -98, 59, -16, -65, -17, 6, -18, -27, 95, ISO7816.INS_VERIFY, 16, -52, 60, 84, 74, 82, -108, 14, ISO7816.INS_GET_RESPONSE, 40, -10, 86, 96, -94, -29, PassportService.SFI_DG15, -20, -99, ISO7816.INS_CHANGE_CHV, ISOFileInfo.FILE_IDENTIFIER, 126, -43, 124, -21, 24, -41, -51, -35, 120, -1, -37, ISOFileInfo.f24317A1, 9, ISO7816.INS_WRITE_BINARY, 118, -124, 117, -69, 29, 26, 47, ISO7816.INS_READ_BINARY, -2, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_DECREASE_STAMPED, 99, 53, ISO7816.INS_WRITE_RECORD, ISO7816.INS_PSO, 89, 109, 77, 119, -25, ISOFileInfo.CHANNEL_SECURITY, 97, -49, -97, -50, 39, -11, ISOFileInfo.DATA_BYTES1, -122, -57, -90, -5, -8, ISOFileInfo.FCI_EXT, ISOFileInfo.AB, ISOFileInfo.FCP_BYTE, 63, -33, 72, 0, 20, -102, -67, 91, 4, -110, 2, 37, 101, 76, 83, PassportService.SFI_DG12, -14, 41, -81, 23, 108, 65, ISO7816.INS_DECREASE, -23, -109, 85, -9, -84, 104, 38, -60, 125, ISO7816.INS_GET_DATA, 122, 62, ISOFileInfo.f24316A0, 55, 3, -63, 54, 105, 102, 8, 22, -89, PSSSigner.TRAILER_IMPLICIT, -59, -45, ISO7816.INS_MSE, -73, 19, 70, ISO7816.INS_INCREASE, -24, 87, -120, 43, ISOFileInfo.DATA_BYTES2, -78, 78, ISOFileInfo.FMD_BYTE, 28, -86, -111, 88, 46, -101, 92, 27, 81, 115, CVCAFile.CAR_TAG, 35, 1, 110, -13, PassportService.SFI_DG13, -66, 61, 10, 45, 31, 103, 51, 25, 123, 94, -22, -34, ISOFileInfo.SECURITY_ATTR_EXP, -53, -87, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.ENV_TEMP_EF, -83, 73, -126, ISO7816.INS_DELETE_FILE, -70, -61, 21, -47, ISO7816.INS_CREATE_FILE, -119, -4, ISO7816.INS_READ_BINARY2, -71, -75, 7, 121, -72, -31};

    /* renamed from: T3, reason: collision with root package name */
    private static final byte[] f24964T3 = {-78, ISO7816.INS_READ_RECORD_STAMPED, 35, 17, -89, -120, -59, -90, 57, -113, -60, -24, 115, ISO7816.INS_MSE, 67, -61, -126, 39, -51, 24, 81, ISOFileInfo.FCP_BYTE, 45, -9, 92, 14, 59, -3, ISO7816.INS_GET_DATA, -101, PassportService.SFI_DG13, PassportService.SFI_DG15, 121, ISOFileInfo.SECURITY_ATTR_COMPACT, 16, 76, 116, 28, 10, ISOFileInfo.CHANNEL_SECURITY, 124, -108, 7, -57, 94, 20, ISOFileInfo.f24317A1, 33, 87, 80, 78, -87, ISOFileInfo.DATA_BYTES1, -39, -17, ISOFileInfo.FMD_BYTE, 65, -49, 60, -18, 46, 19, 41, -70, ISO7816.INS_DECREASE_STAMPED, 90, -82, ISOFileInfo.LCS_BYTE, 97, 51, 18, -71, 85, -88, 21, 5, -10, 3, 6, 73, -75, 37, 9, 22, PassportService.SFI_DG12, ISO7816.INS_PSO, 56, -4, ISO7816.INS_VERIFY, -12, -27, Byte.MAX_VALUE, -41, 49, 43, 102, ISOFileInfo.FCI_BYTE, -1, 114, -122, -16, -93, 47, 120, 0, PSSSigner.TRAILER_IMPLICIT, -52, ISO7816.INS_APPEND_RECORD, ISO7816.INS_READ_BINARY, -15, CVCAFile.CAR_TAG, ISO7816.INS_READ_BINARY_STAMPED, ISO7816.INS_DECREASE, 95, 96, 4, -20, ISOFileInfo.f24319A5, -29, ISOFileInfo.SECURITY_ATTR_EXP, -25, 29, -65, -124, 123, -26, ISOFileInfo.DATA_BYTES2, -8, -34, ISO7816.INS_LOAD_KEY_FILE, ISO7816.INS_WRITE_RECORD, 23, -50, 75, 71, ISO7816.INS_UPDATE_BINARY, 105, 108, 25, -103, -102, 1, ISO7816.INS_READ_RECORD2, ISOFileInfo.PROP_INFO, ISO7816.INS_READ_BINARY2, -7, 89, ISO7816.INS_ENVELOPE, 55, -23, -56, ISOFileInfo.f24316A0, -19, 79, -119, 104, 109, -43, 38, -111, ISOFileInfo.FCI_EXT, 88, -67, -55, -104, ISO7816.INS_UPDATE_RECORD, 117, ISO7816.INS_GET_RESPONSE, 118, -11, 103, 107, 126, -21, 82, -53, -47, 91, -97, PassportService.SFI_DG11, -37, 64, -110, 26, -6, -84, ISO7816.INS_DELETE_FILE, -31, 113, 31, 101, ISOFileInfo.ENV_TEMP_EF, -105, -98, -107, -112, 93, -73, -63, -81, 84, -5, 2, ISO7816.INS_CREATE_FILE, 53, -69, 58, 77, -83, ISO7816.INS_UNBLOCK_CHV, 61, 86, 8, 27, 74, -109, 106, ISOFileInfo.AB, -72, 122, -14, 125, ISO7816.INS_PUT_DATA, 63, -2, 62, -66, -22, -86, ISO7816.INS_REHABILITATE_CHV, -58, ISO7816.INS_WRITE_BINARY, 54, 72, ISO7816.INS_MANAGE_CHANNEL, -106, 119, ISO7816.INS_CHANGE_CHV, 83, -33, -13, ISOFileInfo.FILE_IDENTIFIER, 40, ISO7816.INS_INCREASE, 69, PassportService.SFI_COM, -92, -45, -94, 70, 110, -100, -35, 99, -44, -99};
    private boolean forEncryption;
    private long[] internalState;
    private long[][] roundKeys;
    private int roundsAmount;
    private int wordsInBlock;
    private int wordsInKey;
    private long[] workingKey;

    public DSTU7624Engine(int i) {
        if (i != 128 && i != 256 && i != 512) {
            throw new IllegalArgumentException("unsupported block length: only 128/256/512 are allowed");
        }
        int i9 = i >>> 6;
        this.wordsInBlock = i9;
        this.internalState = new long[i9];
    }

    private void addRoundKey(int i) {
        long[] jArr = this.roundKeys[i];
        for (int i9 = 0; i9 < this.wordsInBlock; i9++) {
            long[] jArr2 = this.internalState;
            jArr2[i9] = jArr2[i9] + jArr[i9];
        }
    }

    private void decryptBlock_128(byte[] bArr, int i, byte[] bArr2, int i9) {
        long littleEndianToLong = Pack.littleEndianToLong(bArr, i);
        long littleEndianToLong2 = Pack.littleEndianToLong(bArr, i + 8);
        long[][] jArr = this.roundKeys;
        int i10 = this.roundsAmount;
        long[] jArr2 = jArr[i10];
        long j10 = littleEndianToLong - jArr2[0];
        long j11 = littleEndianToLong2 - jArr2[1];
        while (true) {
            long mixColumnInv = mixColumnInv(j10);
            long mixColumnInv2 = mixColumnInv(j11);
            int i11 = (int) mixColumnInv;
            int i12 = (int) (mixColumnInv >>> 32);
            int i13 = (int) mixColumnInv2;
            int i14 = (int) (mixColumnInv2 >>> 32);
            byte[] bArr3 = f24961T0;
            byte b9 = bArr3[i11 & 255];
            byte[] bArr4 = f24962T1;
            byte b10 = bArr4[(i11 >>> 8) & 255];
            byte[] bArr5 = f24963T2;
            byte b11 = bArr5[(i11 >>> 16) & 255];
            byte[] bArr6 = f24964T3;
            int i15 = (bArr6[i11 >>> 24] << 24) | ((b11 & 255) << 16) | (b9 & 255) | ((b10 & 255) << 8);
            byte b12 = bArr3[i14 & 255];
            byte b13 = bArr4[(i14 >>> 8) & 255];
            byte b14 = bArr5[(i14 >>> 16) & 255];
            long j12 = (((bArr6[i14 >>> 24] << 24) | (((b12 & 255) | ((b13 & 255) << 8)) | ((b14 & 255) << 16))) << 32) | (i15 & BodyPartID.bodyIdMax);
            int i16 = (bArr6[i13 >>> 24] << 24) | (bArr3[i13 & 255] & 255) | ((bArr4[(i13 >>> 8) & 255] & 255) << 8) | ((bArr5[(i13 >>> 16) & 255] & 255) << 16);
            byte b15 = bArr3[i12 & 255];
            byte b16 = bArr4[(i12 >>> 8) & 255];
            byte b17 = bArr5[(i12 >>> 16) & 255];
            long j13 = (i16 & BodyPartID.bodyIdMax) | (((bArr6[i12 >>> 24] << 24) | (((b15 & 255) | ((b16 & 255) << 8)) | ((b17 & 255) << 16))) << 32);
            i10--;
            if (i10 == 0) {
                long[] jArr3 = this.roundKeys[0];
                long j14 = j12 - jArr3[0];
                long j15 = j13 - jArr3[1];
                Pack.longToLittleEndian(j14, bArr2, i9);
                Pack.longToLittleEndian(j15, bArr2, i9 + 8);
                return;
            }
            long[] jArr4 = this.roundKeys[i10];
            long j16 = j12 ^ jArr4[0];
            j11 = j13 ^ jArr4[1];
            j10 = j16;
        }
    }

    private void encryptBlock_128(byte[] bArr, int i, byte[] bArr2, int i9) {
        long littleEndianToLong = Pack.littleEndianToLong(bArr, i);
        long littleEndianToLong2 = Pack.littleEndianToLong(bArr, i + 8);
        long[] jArr = this.roundKeys[0];
        long j10 = littleEndianToLong + jArr[0];
        long j11 = littleEndianToLong2 + jArr[1];
        int i10 = 0;
        while (true) {
            int i11 = (int) j10;
            int i12 = (int) (j10 >>> 32);
            int i13 = (int) j11;
            int i14 = (int) (j11 >>> 32);
            byte[] bArr3 = f24957S0;
            byte b9 = bArr3[i11 & 255];
            byte[] bArr4 = f24958S1;
            byte b10 = bArr4[(i11 >>> 8) & 255];
            byte[] bArr5 = f24959S2;
            byte b11 = bArr5[(i11 >>> 16) & 255];
            byte[] bArr6 = f24960S3;
            int i15 = ((b11 & 255) << 16) | (b9 & 255) | ((b10 & 255) << 8) | (bArr6[i11 >>> 24] << 24);
            byte b12 = bArr3[i14 & 255];
            byte b13 = bArr4[(i14 >>> 8) & 255];
            byte b14 = bArr5[(i14 >>> 16) & 255];
            long j12 = (((bArr6[i14 >>> 24] << 24) | (((b12 & 255) | ((b13 & 255) << 8)) | ((b14 & 255) << 16))) << 32) | (i15 & BodyPartID.bodyIdMax);
            int i16 = (bArr6[i13 >>> 24] << 24) | (bArr3[i13 & 255] & 255) | ((bArr4[(i13 >>> 8) & 255] & 255) << 8) | ((bArr5[(i13 >>> 16) & 255] & 255) << 16);
            byte b15 = bArr3[i12 & 255];
            byte b16 = bArr4[(i12 >>> 8) & 255];
            byte b17 = bArr5[(i12 >>> 16) & 255];
            long j13 = (i16 & BodyPartID.bodyIdMax) | (((bArr6[i12 >>> 24] << 24) | (((b15 & 255) | ((b16 & 255) << 8)) | ((b17 & 255) << 16))) << 32);
            long mixColumn = mixColumn(j12);
            long mixColumn2 = mixColumn(j13);
            i10++;
            int i17 = this.roundsAmount;
            if (i10 == i17) {
                long[] jArr2 = this.roundKeys[i17];
                long j14 = mixColumn + jArr2[0];
                long j15 = mixColumn2 + jArr2[1];
                Pack.longToLittleEndian(j14, bArr2, i9);
                Pack.longToLittleEndian(j15, bArr2, i9 + 8);
                return;
            }
            long[] jArr3 = this.roundKeys[i10];
            long j16 = mixColumn ^ jArr3[0];
            j11 = mixColumn2 ^ jArr3[1];
            j10 = j16;
        }
    }

    private void invShiftRows() {
        int i = this.wordsInBlock;
        if (i == 2) {
            long[] jArr = this.internalState;
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = (-4294967296L) & (j10 ^ j11);
            jArr[0] = j10 ^ j12;
            jArr[1] = j12 ^ j11;
            return;
        }
        if (i == 4) {
            long[] jArr2 = this.internalState;
            long j13 = jArr2[0];
            long j14 = jArr2[1];
            long j15 = jArr2[2];
            long j16 = jArr2[3];
            long j17 = (j13 ^ j14) & (-281470681808896L);
            long j18 = j13 ^ j17;
            long j19 = j14 ^ j17;
            long j20 = (j15 ^ j16) & (-281470681808896L);
            long j21 = j15 ^ j20;
            long j22 = j16 ^ j20;
            long j23 = (j18 ^ j21) & (-4294967296L);
            long j24 = j18 ^ j23;
            long j25 = (j19 ^ j22) & 281474976645120L;
            jArr2[0] = j24;
            jArr2[1] = j19 ^ j25;
            jArr2[2] = j21 ^ j23;
            jArr2[3] = j25 ^ j22;
            return;
        }
        if (i != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long[] jArr3 = this.internalState;
        long j26 = jArr3[0];
        long j27 = jArr3[1];
        long j28 = jArr3[2];
        long j29 = jArr3[3];
        long j30 = jArr3[4];
        long j31 = jArr3[5];
        long j32 = jArr3[6];
        long j33 = jArr3[7];
        long j34 = (j26 ^ j27) & (-71777214294589696L);
        long j35 = j26 ^ j34;
        long j36 = j27 ^ j34;
        long j37 = (j28 ^ j29) & (-71777214294589696L);
        long j38 = j28 ^ j37;
        long j39 = j29 ^ j37;
        long j40 = (j30 ^ j31) & (-71777214294589696L);
        long j41 = j30 ^ j40;
        long j42 = j31 ^ j40;
        long j43 = (j32 ^ j33) & (-71777214294589696L);
        long j44 = j32 ^ j43;
        long j45 = j33 ^ j43;
        long j46 = (j35 ^ j38) & (-281470681808896L);
        long j47 = j35 ^ j46;
        long j48 = j38 ^ j46;
        long j49 = (j36 ^ j39) & 72056494543077120L;
        long j50 = j36 ^ j49;
        long j51 = j39 ^ j49;
        long j52 = (j41 ^ j44) & (-281470681808896L);
        long j53 = j41 ^ j52;
        long j54 = j44 ^ j52;
        long j55 = (j42 ^ j45) & 72056494543077120L;
        long j56 = j42 ^ j55;
        long j57 = j45 ^ j55;
        long j58 = (j47 ^ j53) & (-4294967296L);
        long j59 = j47 ^ j58;
        long j60 = j53 ^ j58;
        long j61 = (j50 ^ j56) & 72057594021150720L;
        long j62 = j50 ^ j61;
        long j63 = (j48 ^ j54) & 281474976645120L;
        long j64 = j48 ^ j63;
        long j65 = j63 ^ j54;
        long j66 = (j51 ^ j57) & 1099511627520L;
        jArr3[0] = j59;
        jArr3[1] = j62;
        jArr3[2] = j64;
        jArr3[3] = j51 ^ j66;
        jArr3[4] = j60;
        jArr3[5] = j56 ^ j61;
        jArr3[6] = j65;
        jArr3[7] = j57 ^ j66;
    }

    private void invSubBytes() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
            long j10 = jArr[i];
            int i9 = (int) j10;
            int i10 = (int) (j10 >>> 32);
            byte[] bArr = f24961T0;
            byte b9 = bArr[i9 & 255];
            byte[] bArr2 = f24962T1;
            byte b10 = bArr2[(i9 >>> 8) & 255];
            byte[] bArr3 = f24963T2;
            byte b11 = bArr3[(i9 >>> 16) & 255];
            int i11 = (f24964T3[i9 >>> 24] << 24) | (b9 & 255) | ((b10 & 255) << 8) | ((b11 & 255) << 16);
            byte b12 = bArr[i10 & 255];
            byte b13 = bArr2[(i10 >>> 8) & 255];
            byte b14 = bArr3[(i10 >>> 16) & 255];
            jArr[i] = (i11 & BodyPartID.bodyIdMax) | (((r11[i10 >>> 24] << 24) | (((b12 & 255) | ((b13 & 255) << 8)) | ((b14 & 255) << 16))) << 32);
        }
    }

    private static long mixColumn(long j10) {
        long mulX = mulX(j10);
        long rotate = rotate(8, j10) ^ j10;
        long rotate2 = (rotate ^ rotate(16, rotate)) ^ rotate(48, j10);
        return ((rotate(32, mulX2((j10 ^ rotate2) ^ mulX)) ^ rotate2) ^ rotate(40, mulX)) ^ rotate(48, mulX);
    }

    private static long mixColumnInv(long j10) {
        long rotate = rotate(8, j10) ^ j10;
        long rotate2 = (rotate ^ rotate(32, rotate)) ^ rotate(48, j10);
        long j11 = rotate2 ^ j10;
        long rotate3 = rotate(48, j10);
        long rotate4 = rotate(56, j10);
        long mulX = mulX(j11 ^ rotate4) ^ rotate(56, j11);
        long mulX2 = mulX(rotate(40, mulX(mulX) ^ j10) ^ (rotate(16, j11) ^ j10)) ^ (j11 ^ rotate3);
        return mulX(rotate(40, ((j10 ^ rotate(32, j11)) ^ rotate4) ^ mulX(((rotate3 ^ (rotate(24, j10) ^ j11)) ^ rotate4) ^ mulX(mulX(mulX2) ^ rotate(16, rotate2))))) ^ rotate2;
    }

    private void mixColumns() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
            jArr[i] = mixColumn(jArr[i]);
        }
    }

    private void mixColumnsInv() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
            jArr[i] = mixColumnInv(jArr[i]);
        }
    }

    private static long mulX(long j10) {
        return (((j10 & (-9187201950435737472L)) >>> 7) * 29) ^ ((9187201950435737471L & j10) << 1);
    }

    private static long mulX2(long j10) {
        return (((j10 & 4629771061636907072L) >>> 6) * 29) ^ (((4557430888798830399L & j10) << 2) ^ ((((-9187201950435737472L) & j10) >>> 6) * 29));
    }

    private static long rotate(int i, long j10) {
        return (j10 << (-i)) | (j10 >>> i);
    }

    private void rotateLeft(long[] jArr, long[] jArr2) {
        int i = this.wordsInBlock;
        if (i == 2) {
            long j10 = jArr[0];
            long j11 = jArr[1];
            jArr2[0] = (j10 >>> 56) | (j11 << 8);
            jArr2[1] = (j10 << 8) | (j11 >>> 56);
            return;
        }
        if (i == 4) {
            long j12 = jArr[0];
            long j13 = jArr[1];
            long j14 = jArr[2];
            long j15 = jArr[3];
            jArr2[0] = (j13 >>> 24) | (j14 << 40);
            jArr2[1] = (j14 >>> 24) | (j15 << 40);
            jArr2[2] = (j15 >>> 24) | (j12 << 40);
            jArr2[3] = (j12 >>> 24) | (j13 << 40);
            return;
        }
        if (i != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long j16 = jArr[0];
        long j17 = jArr[1];
        long j18 = jArr[2];
        long j19 = jArr[3];
        long j20 = jArr[4];
        long j21 = jArr[5];
        long j22 = jArr[6];
        long j23 = jArr[7];
        jArr2[0] = (j18 >>> 24) | (j19 << 40);
        jArr2[1] = (j19 >>> 24) | (j20 << 40);
        jArr2[2] = (j20 >>> 24) | (j21 << 40);
        jArr2[3] = (j21 >>> 24) | (j22 << 40);
        jArr2[4] = (j22 >>> 24) | (j23 << 40);
        jArr2[5] = (j23 >>> 24) | (j16 << 40);
        jArr2[6] = (j16 >>> 24) | (j17 << 40);
        jArr2[7] = (j17 >>> 24) | (j18 << 40);
    }

    private void shiftRows() {
        int i = this.wordsInBlock;
        if (i == 2) {
            long[] jArr = this.internalState;
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = (-4294967296L) & (j10 ^ j11);
            jArr[0] = j10 ^ j12;
            jArr[1] = j12 ^ j11;
            return;
        }
        if (i == 4) {
            long[] jArr2 = this.internalState;
            long j13 = jArr2[0];
            long j14 = jArr2[1];
            long j15 = jArr2[2];
            long j16 = jArr2[3];
            long j17 = (j13 ^ j15) & (-4294967296L);
            long j18 = j13 ^ j17;
            long j19 = j15 ^ j17;
            long j20 = (j14 ^ j16) & 281474976645120L;
            long j21 = j14 ^ j20;
            long j22 = j16 ^ j20;
            long j23 = (j18 ^ j21) & (-281470681808896L);
            long j24 = (j19 ^ j22) & (-281470681808896L);
            jArr2[0] = j18 ^ j23;
            jArr2[1] = j21 ^ j23;
            jArr2[2] = j19 ^ j24;
            jArr2[3] = j22 ^ j24;
            return;
        }
        if (i != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        }
        long[] jArr3 = this.internalState;
        long j25 = jArr3[0];
        long j26 = jArr3[1];
        long j27 = jArr3[2];
        long j28 = jArr3[3];
        long j29 = jArr3[4];
        long j30 = jArr3[5];
        long j31 = jArr3[6];
        long j32 = jArr3[7];
        long j33 = (j25 ^ j29) & (-4294967296L);
        long j34 = j25 ^ j33;
        long j35 = j29 ^ j33;
        long j36 = (j26 ^ j30) & 72057594021150720L;
        long j37 = j26 ^ j36;
        long j38 = j30 ^ j36;
        long j39 = (j27 ^ j31) & 281474976645120L;
        long j40 = j27 ^ j39;
        long j41 = j31 ^ j39;
        long j42 = (j28 ^ j32) & 1099511627520L;
        long j43 = j28 ^ j42;
        long j44 = j32 ^ j42;
        long j45 = (j34 ^ j40) & (-281470681808896L);
        long j46 = j34 ^ j45;
        long j47 = j40 ^ j45;
        long j48 = (j37 ^ j43) & 72056494543077120L;
        long j49 = j37 ^ j48;
        long j50 = j43 ^ j48;
        long j51 = (j35 ^ j41) & (-281470681808896L);
        long j52 = j35 ^ j51;
        long j53 = j41 ^ j51;
        long j54 = (j38 ^ j44) & 72056494543077120L;
        long j55 = j38 ^ j54;
        long j56 = j44 ^ j54;
        long j57 = (j46 ^ j49) & (-71777214294589696L);
        long j58 = j46 ^ j57;
        long j59 = j49 ^ j57;
        long j60 = (j47 ^ j50) & (-71777214294589696L);
        long j61 = j47 ^ j60;
        long j62 = j50 ^ j60;
        long j63 = (j52 ^ j55) & (-71777214294589696L);
        long j64 = j52 ^ j63;
        long j65 = j55 ^ j63;
        long j66 = (j53 ^ j56) & (-71777214294589696L);
        jArr3[0] = j58;
        jArr3[1] = j59;
        jArr3[2] = j61;
        jArr3[3] = j62;
        jArr3[4] = j64;
        jArr3[5] = j65;
        jArr3[6] = j53 ^ j66;
        jArr3[7] = j56 ^ j66;
    }

    private void subBytes() {
        for (int i = 0; i < this.wordsInBlock; i++) {
            long[] jArr = this.internalState;
            long j10 = jArr[i];
            int i9 = (int) j10;
            int i10 = (int) (j10 >>> 32);
            byte[] bArr = f24957S0;
            byte b9 = bArr[i9 & 255];
            byte[] bArr2 = f24958S1;
            byte b10 = bArr2[(i9 >>> 8) & 255];
            byte[] bArr3 = f24959S2;
            byte b11 = bArr3[(i9 >>> 16) & 255];
            int i11 = (f24960S3[i9 >>> 24] << 24) | (b9 & 255) | ((b10 & 255) << 8) | ((b11 & 255) << 16);
            byte b12 = bArr[i10 & 255];
            byte b13 = bArr2[(i10 >>> 8) & 255];
            byte b14 = bArr3[(i10 >>> 16) & 255];
            jArr[i] = (i11 & BodyPartID.bodyIdMax) | (((r11[i10 >>> 24] << 24) | (((b12 & 255) | ((b13 & 255) << 8)) | ((b14 & 255) << 16))) << 32);
        }
    }

    private void subRoundKey(int i) {
        long[] jArr = this.roundKeys[i];
        for (int i9 = 0; i9 < this.wordsInBlock; i9++) {
            long[] jArr2 = this.internalState;
            jArr2[i9] = jArr2[i9] - jArr[i9];
        }
    }

    private void workingKeyExpandEven(long[] jArr, long[] jArr2) {
        int i;
        int i9;
        int i10 = this.wordsInKey;
        long[] jArr3 = new long[i10];
        long[] jArr4 = new long[this.wordsInBlock];
        System.arraycopy(jArr, 0, jArr3, 0, i10);
        long j10 = 281479271743489L;
        int i11 = 0;
        while (true) {
            for (int i12 = 0; i12 < this.wordsInBlock; i12++) {
                jArr4[i12] = jArr2[i12] + j10;
            }
            for (int i13 = 0; i13 < this.wordsInBlock; i13++) {
                this.internalState[i13] = jArr3[i13] + jArr4[i13];
            }
            subBytes();
            shiftRows();
            mixColumns();
            for (int i14 = 0; i14 < this.wordsInBlock; i14++) {
                long[] jArr5 = this.internalState;
                jArr5[i14] = jArr5[i14] ^ jArr4[i14];
            }
            subBytes();
            shiftRows();
            mixColumns();
            int i15 = 0;
            while (true) {
                i = this.wordsInBlock;
                if (i15 >= i) {
                    break;
                }
                long[] jArr6 = this.internalState;
                jArr6[i15] = jArr6[i15] + jArr4[i15];
                i15++;
            }
            System.arraycopy(this.internalState, 0, this.roundKeys[i11], 0, i);
            if (this.roundsAmount == i11) {
                return;
            }
            if (this.wordsInBlock != this.wordsInKey) {
                i11 += 2;
                j10 <<= 1;
                for (int i16 = 0; i16 < this.wordsInBlock; i16++) {
                    jArr4[i16] = jArr2[i16] + j10;
                }
                int i17 = 0;
                while (true) {
                    int i18 = this.wordsInBlock;
                    if (i17 >= i18) {
                        break;
                    }
                    this.internalState[i17] = jArr3[i18 + i17] + jArr4[i17];
                    i17++;
                }
                subBytes();
                shiftRows();
                mixColumns();
                for (int i19 = 0; i19 < this.wordsInBlock; i19++) {
                    long[] jArr7 = this.internalState;
                    jArr7[i19] = jArr7[i19] ^ jArr4[i19];
                }
                subBytes();
                shiftRows();
                mixColumns();
                int i20 = 0;
                while (true) {
                    i9 = this.wordsInBlock;
                    if (i20 >= i9) {
                        break;
                    }
                    long[] jArr8 = this.internalState;
                    jArr8[i20] = jArr8[i20] + jArr4[i20];
                    i20++;
                }
                System.arraycopy(this.internalState, 0, this.roundKeys[i11], 0, i9);
                if (this.roundsAmount == i11) {
                    return;
                }
            }
            i11 += 2;
            j10 <<= 1;
            long j11 = jArr3[0];
            for (int i21 = 1; i21 < i10; i21++) {
                jArr3[i21 - 1] = jArr3[i21];
            }
            jArr3[i10 - 1] = j11;
        }
    }

    private void workingKeyExpandKT(long[] jArr, long[] jArr2) {
        int i = this.wordsInBlock;
        long[] jArr3 = new long[i];
        long[] jArr4 = new long[i];
        long[] jArr5 = new long[i];
        this.internalState = jArr5;
        long j10 = jArr5[0];
        int i9 = this.wordsInKey;
        jArr5[0] = j10 + i + i9 + 1;
        System.arraycopy(jArr, 0, jArr3, 0, i);
        if (i == i9) {
            System.arraycopy(jArr, 0, jArr4, 0, i);
        } else {
            int i10 = this.wordsInBlock;
            System.arraycopy(jArr, i10, jArr4, 0, i10);
        }
        int i11 = 0;
        while (true) {
            long[] jArr6 = this.internalState;
            if (i11 >= jArr6.length) {
                break;
            }
            jArr6[i11] = jArr6[i11] + jArr3[i11];
            i11++;
        }
        subBytes();
        shiftRows();
        mixColumns();
        int i12 = 0;
        while (true) {
            long[] jArr7 = this.internalState;
            if (i12 >= jArr7.length) {
                break;
            }
            jArr7[i12] = jArr7[i12] ^ jArr4[i12];
            i12++;
        }
        subBytes();
        shiftRows();
        mixColumns();
        int i13 = 0;
        while (true) {
            long[] jArr8 = this.internalState;
            if (i13 >= jArr8.length) {
                subBytes();
                shiftRows();
                mixColumns();
                System.arraycopy(this.internalState, 0, jArr2, 0, this.wordsInBlock);
                return;
            }
            jArr8[i13] = jArr8[i13] + jArr3[i13];
            i13++;
        }
    }

    private void workingKeyExpandOdd() {
        for (int i = 1; i < this.roundsAmount; i += 2) {
            long[][] jArr = this.roundKeys;
            rotateLeft(jArr[i - 1], jArr[i]);
        }
    }

    private void xorRoundKey(int i) {
        long[] jArr = this.roundKeys[i];
        for (int i9 = 0; i9 < this.wordsInBlock; i9++) {
            long[] jArr2 = this.internalState;
            jArr2[i9] = jArr2[i9] ^ jArr[i9];
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DSTU7624";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.wordsInBlock << 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[LOOP:0: B:21:0x0057->B:23:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[EDGE_INSN: B:24:0x0065->B:25:0x0065 BREAK  A[LOOP:0: B:21:0x0057->B:23:0x005c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @Override // org.bouncycastle.crypto.BlockCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(boolean r5, org.bouncycastle.crypto.CipherParameters r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof org.bouncycastle.crypto.params.KeyParameter
            if (r0 == 0) goto L8d
            r4.forEncryption = r5
            org.bouncycastle.crypto.params.KeyParameter r6 = (org.bouncycastle.crypto.params.KeyParameter) r6
            byte[] r5 = r6.getKey()
            int r6 = r5.length
            int r6 = r6 << 3
            int r0 = r4.wordsInBlock
            int r0 = r0 << 6
            r1 = 512(0x200, float:7.17E-43)
            r2 = 256(0x100, float:3.59E-43)
            r3 = 128(0x80, float:1.8E-43)
            if (r6 == r3) goto L28
            if (r6 == r2) goto L28
            if (r6 != r1) goto L20
            goto L28
        L20:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "unsupported key length: only 128/256/512 are allowed"
            r5.<init>(r6)
            throw r5
        L28:
            if (r6 == r0) goto L37
            int r0 = r0 * 2
            if (r6 != r0) goto L2f
            goto L37
        L2f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unsupported key length"
            r5.<init>(r6)
            throw r5
        L37:
            if (r6 == r3) goto L46
            if (r6 == r2) goto L43
            if (r6 == r1) goto L3e
            goto L49
        L3e:
            r0 = 18
        L40:
            r4.roundsAmount = r0
            goto L49
        L43:
            r0 = 14
            goto L40
        L46:
            r0 = 10
            goto L40
        L49:
            int r0 = r6 >>> 6
            r4.wordsInKey = r0
            int r0 = r4.roundsAmount
            int r0 = r0 + 1
            long[][] r0 = new long[r0][]
            r4.roundKeys = r0
            r0 = 0
            r1 = r0
        L57:
            long[][] r2 = r4.roundKeys
            int r3 = r2.length
            if (r1 >= r3) goto L65
            int r3 = r4.wordsInBlock
            long[] r3 = new long[r3]
            r2[r1] = r3
            int r1 = r1 + 1
            goto L57
        L65:
            int r1 = r4.wordsInKey
            long[] r1 = new long[r1]
            r4.workingKey = r1
            int r2 = r5.length
            int r6 = r6 >>> 3
            if (r2 != r6) goto L85
            org.bouncycastle.util.Pack.littleEndianToLong(r5, r0, r1)
            int r5 = r4.wordsInBlock
            long[] r5 = new long[r5]
            long[] r6 = r4.workingKey
            r4.workingKeyExpandKT(r6, r5)
            long[] r6 = r4.workingKey
            r4.workingKeyExpandEven(r6, r5)
            r4.workingKeyExpandOdd()
            return
        L85:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid key parameter passed to DSTU7624Engine init"
            r5.<init>(r6)
            throw r5
        L8d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid parameter passed to DSTU7624Engine init"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.DSTU7624Engine.init(boolean, org.bouncycastle.crypto.CipherParameters):void");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int i10;
        if (this.workingKey == null) {
            throw new IllegalStateException("DSTU7624Engine not initialised");
        }
        if (getBlockSize() + i > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (getBlockSize() + i9 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i11 = 0;
        if (this.forEncryption) {
            if (this.wordsInBlock != 2) {
                Pack.littleEndianToLong(bArr, i, this.internalState);
                addRoundKey(0);
                while (true) {
                    subBytes();
                    shiftRows();
                    mixColumns();
                    i11++;
                    i10 = this.roundsAmount;
                    if (i11 == i10) {
                        break;
                    }
                    xorRoundKey(i11);
                }
                addRoundKey(i10);
                Pack.longToLittleEndian(this.internalState, bArr2, i9);
            } else {
                encryptBlock_128(bArr, i, bArr2, i9);
            }
        } else if (this.wordsInBlock != 2) {
            Pack.littleEndianToLong(bArr, i, this.internalState);
            subRoundKey(this.roundsAmount);
            int i12 = this.roundsAmount;
            while (true) {
                mixColumnsInv();
                invShiftRows();
                invSubBytes();
                i12--;
                if (i12 == 0) {
                    break;
                }
                xorRoundKey(i12);
            }
            subRoundKey(0);
            Pack.longToLittleEndian(this.internalState, bArr2, i9);
        } else {
            decryptBlock_128(bArr, i, bArr2, i9);
        }
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.internalState, 0L);
    }
}
