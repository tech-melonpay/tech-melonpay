package org.bouncycastle.crypto.prng;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class VMPCRandomGenerator implements RandomGenerator {

    /* renamed from: n, reason: collision with root package name */
    private byte f25120n = 0;

    /* renamed from: P, reason: collision with root package name */
    private byte[] f25119P = {-69, ISO7816.INS_UNBLOCK_CHV, ISOFileInfo.FCP_BYTE, Byte.MAX_VALUE, -75, -86, -44, PassportService.SFI_DG13, ISOFileInfo.DATA_BYTES2, -2, -78, -126, -53, ISOFileInfo.f24316A0, ISOFileInfo.f24317A1, 8, 24, 113, 86, -24, 73, 2, 16, -60, -34, 53, ISOFileInfo.f24319A5, -20, ISOFileInfo.DATA_BYTES1, 18, -72, 105, ISO7816.INS_PUT_DATA, 47, 117, -52, -94, 9, 54, 3, 97, 45, -3, ISO7816.INS_CREATE_FILE, -35, 5, 67, -112, -83, -56, -31, -81, 87, -101, 76, ISO7816.INS_LOAD_KEY_FILE, 81, -82, 80, ISOFileInfo.PROP_INFO, 60, 10, ISO7816.INS_DELETE_FILE, -13, -100, 38, 35, 83, -55, ISOFileInfo.FILE_IDENTIFIER, -105, 70, ISO7816.INS_READ_BINARY2, -103, ISOFileInfo.FMD_BYTE, 49, 119, -43, 29, ISO7816.INS_UPDATE_BINARY, 120, -67, 94, ISO7816.INS_READ_BINARY, ISOFileInfo.LCS_BYTE, ISO7816.INS_MSE, 56, -8, 104, 43, ISO7816.INS_PSO, -59, -45, -9, PSSSigner.TRAILER_IMPLICIT, ISOFileInfo.FCI_BYTE, -33, 4, -27, -107, 62, 37, -122, -90, PassportService.SFI_DG11, -113, -15, ISO7816.INS_CHANGE_CHV, 14, -41, 64, ISO7816.INS_READ_RECORD2, -49, 126, 6, 21, -102, 77, 28, -93, -37, ISO7816.INS_INCREASE, -110, 88, 17, 39, -12, 89, ISO7816.INS_WRITE_BINARY, 78, 106, 23, 91, -84, -1, 7, ISO7816.INS_GET_RESPONSE, 101, 121, -4, -57, -51, 118, CVCAFile.CAR_TAG, 93, -25, 58, ISO7816.INS_DECREASE_STAMPED, 122, ISO7816.INS_DECREASE, 40, PassportService.SFI_DG15, 115, 1, -7, -47, ISO7816.INS_WRITE_RECORD, 25, -23, -111, -71, 90, -19, 65, 109, ISO7816.INS_READ_BINARY_STAMPED, -61, -98, -65, 99, -6, 31, 51, 96, 71, -119, -16, -106, 26, 95, -109, 61, 55, 75, -39, -88, -63, 27, -10, 57, ISOFileInfo.SECURITY_ATTR_EXP, -73, PassportService.SFI_DG12, ISO7816.INS_VERIFY, -50, -120, 110, ISO7816.INS_READ_RECORD_STAMPED, 116, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.ENV_TEMP_EF, 22, 41, -14, ISOFileInfo.FCI_EXT, -11, -21, ISO7816.INS_MANAGE_CHANNEL, -29, -5, 85, -97, -58, ISO7816.INS_REHABILITATE_CHV, 74, 69, 125, ISO7816.INS_APPEND_RECORD, 107, 92, 108, 102, -87, ISOFileInfo.SECURITY_ATTR_COMPACT, -18, -124, 19, -89, PassportService.SFI_COM, -99, ISO7816.INS_UPDATE_RECORD, 103, 72, -70, 46, -26, -92, ISOFileInfo.AB, 124, -108, 0, 33, -17, -22, -66, ISO7816.INS_GET_DATA, 114, 79, 82, -104, 63, ISO7816.INS_ENVELOPE, 20, 123, 59, 84};

    /* renamed from: s, reason: collision with root package name */
    private byte f25121s = -66;

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j10) {
        addSeedMaterial(Pack.longToBigEndian(j10));
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        for (byte b9 : bArr) {
            byte[] bArr2 = this.f25119P;
            byte b10 = this.f25121s;
            byte b11 = this.f25120n;
            byte b12 = bArr2[(b10 + bArr2[b11 & 255] + b9) & 255];
            this.f25121s = b12;
            byte b13 = bArr2[b11 & 255];
            bArr2[b11 & 255] = bArr2[b12 & 255];
            bArr2[b12 & 255] = b13;
            this.f25120n = (byte) ((b11 + 1) & 255);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i9) {
        synchronized (this.f25119P) {
            int i10 = i9 + i;
            while (i != i10) {
                try {
                    byte[] bArr2 = this.f25119P;
                    byte b9 = this.f25121s;
                    byte b10 = this.f25120n;
                    byte b11 = bArr2[(b9 + bArr2[b10 & 255]) & 255];
                    this.f25121s = b11;
                    bArr[i] = bArr2[(bArr2[bArr2[b11 & 255] & 255] + 1) & 255];
                    byte b12 = bArr2[b10 & 255];
                    bArr2[b10 & 255] = bArr2[b11 & 255];
                    bArr2[b11 & 255] = b12;
                    this.f25120n = (byte) ((b10 + 1) & 255);
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
