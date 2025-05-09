package org.bouncycastle.crypto.digests;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Memoable;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CVCAFile;

/* loaded from: classes2.dex */
public class MD2Digest implements ExtendedDigest, Memoable {
    private static final int DIGEST_LENGTH = 16;
    private static final byte[] S = {41, 46, 67, -55, -94, ISO7816.INS_LOAD_KEY_FILE, 124, 1, 61, 54, 84, ISOFileInfo.f24317A1, -20, -16, 6, 19, ISOFileInfo.FCP_BYTE, -89, 5, -13, ISO7816.INS_GET_RESPONSE, -57, 115, ISOFileInfo.SECURITY_ATTR_COMPACT, -104, -109, 43, -39, PSSSigner.TRAILER_IMPLICIT, 76, -126, ISO7816.INS_GET_DATA, PassportService.SFI_COM, -101, 87, 60, -3, -44, ISO7816.INS_CREATE_FILE, 22, 103, CVCAFile.CAR_TAG, ISOFileInfo.FCI_BYTE, 24, ISOFileInfo.LCS_BYTE, 23, -27, 18, -66, 78, -60, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_PUT_DATA, -98, -34, 73, ISOFileInfo.f24316A0, -5, -11, ISOFileInfo.CHANNEL_SECURITY, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, ISO7816.INS_ENVELOPE, 16, -119, PassportService.SFI_DG11, ISO7816.INS_MSE, 95, 33, ISOFileInfo.DATA_BYTES1, Byte.MAX_VALUE, 93, -102, 90, -112, ISO7816.INS_INCREASE, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, ISO7816.INS_DECREASE, ISO7816.INS_READ_RECORD2, 72, ISOFileInfo.f24319A5, -75, -47, -41, 94, -110, ISO7816.INS_PSO, -84, 86, -86, -58, 79, -72, 56, ISO7816.INS_WRITE_RECORD, -106, -92, 125, ISO7816.INS_READ_RECORD_STAMPED, 118, -4, 107, ISO7816.INS_APPEND_RECORD, -100, 116, 4, -15, 69, -99, ISO7816.INS_MANAGE_CHANNEL, 89, ISOFileInfo.FMD_BYTE, 113, ISOFileInfo.FCI_EXT, ISO7816.INS_VERIFY, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, ISO7816.INS_READ_BINARY, -71, -10, 28, 70, 97, 105, ISO7816.INS_DECREASE_STAMPED, 64, 126, PassportService.SFI_DG15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, ISO7816.INS_UNBLOCK_CHV, 83, PassportService.SFI_DG13, 110, ISOFileInfo.PROP_INFO, 40, -124, 9, -45, -33, -51, -12, 65, ISOFileInfo.DATA_BYTES2, 77, 82, 106, ISO7816.INS_UPDATE_RECORD, 55, -56, 108, -63, ISOFileInfo.AB, -6, ISO7816.INS_CHANGE_CHV, -31, 123, 8, PassportService.SFI_DG12, -67, ISO7816.INS_READ_BINARY2, 74, 120, -120, -107, ISOFileInfo.SECURITY_ATTR_EXP, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, ISO7816.INS_WRITE_BINARY, ISO7816.INS_DELETE_FILE, -90, 119, 114, -8, -21, 117, 75, 10, 49, ISO7816.INS_REHABILITATE_CHV, 80, ISO7816.INS_READ_BINARY_STAMPED, -113, -19, 31, 26, -37, -103, ISOFileInfo.ENV_TEMP_EF, 51, -97, 17, ISOFileInfo.FILE_IDENTIFIER, 20};

    /* renamed from: C, reason: collision with root package name */
    private byte[] f24843C;
    private int COff;

    /* renamed from: M, reason: collision with root package name */
    private byte[] f24844M;
    private byte[] X;
    private int mOff;
    private int xOff;

    public MD2Digest() {
        this.X = new byte[48];
        this.f24844M = new byte[16];
        this.f24843C = new byte[16];
        reset();
    }

    private void copyIn(MD2Digest mD2Digest) {
        byte[] bArr = mD2Digest.X;
        System.arraycopy(bArr, 0, this.X, 0, bArr.length);
        this.xOff = mD2Digest.xOff;
        byte[] bArr2 = mD2Digest.f24844M;
        System.arraycopy(bArr2, 0, this.f24844M, 0, bArr2.length);
        this.mOff = mD2Digest.mOff;
        byte[] bArr3 = mD2Digest.f24843C;
        System.arraycopy(bArr3, 0, this.f24843C, 0, bArr3.length);
        this.COff = mD2Digest.COff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD2Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        int length = this.f24844M.length;
        int i9 = this.mOff;
        byte b9 = (byte) (length - i9);
        while (true) {
            byte[] bArr2 = this.f24844M;
            if (i9 >= bArr2.length) {
                processCheckSum(bArr2);
                processBlock(this.f24844M);
                processBlock(this.f24843C);
                System.arraycopy(this.X, this.xOff, bArr, i, 16);
                reset();
                return 16;
            }
            bArr2[i9] = b9;
            i9++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD2";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    public void processBlock(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.X;
            bArr2[i + 16] = bArr[i];
            bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < 18; i10++) {
            for (int i11 = 0; i11 < 48; i11++) {
                byte[] bArr3 = this.X;
                byte b9 = (byte) (S[i9] ^ bArr3[i11]);
                bArr3[i11] = b9;
                i9 = b9 & 255;
            }
            i9 = (i9 + i10) % 256;
        }
    }

    public void processCheckSum(byte[] bArr) {
        byte b9 = this.f24843C[15];
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.f24843C;
            b9 = (byte) (S[(b9 ^ bArr[i]) & 255] ^ bArr2[i]);
            bArr2[i] = b9;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.xOff = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.X;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.mOff = 0;
        int i9 = 0;
        while (true) {
            byte[] bArr2 = this.f24844M;
            if (i9 == bArr2.length) {
                break;
            }
            bArr2[i9] = 0;
            i9++;
        }
        this.COff = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr3 = this.f24843C;
            if (i10 == bArr3.length) {
                return;
            }
            bArr3[i10] = 0;
            i10++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b9) {
        byte[] bArr = this.f24844M;
        int i = this.mOff;
        int i9 = i + 1;
        this.mOff = i9;
        bArr[i] = b9;
        if (i9 == 16) {
            processCheckSum(bArr);
            processBlock(this.f24844M);
            this.mOff = 0;
        }
    }

    public MD2Digest(MD2Digest mD2Digest) {
        this.X = new byte[48];
        this.f24844M = new byte[16];
        this.f24843C = new byte[16];
        copyIn(mD2Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD2Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i9) {
        while (this.mOff != 0 && i9 > 0) {
            update(bArr[i]);
            i++;
            i9--;
        }
        while (i9 > 16) {
            System.arraycopy(bArr, i, this.f24844M, 0, 16);
            processCheckSum(this.f24844M);
            processBlock(this.f24844M);
            i9 -= 16;
            i += 16;
        }
        while (i9 > 0) {
            update(bArr[i]);
            i++;
            i9--;
        }
    }
}
