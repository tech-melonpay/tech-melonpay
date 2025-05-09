package org.bouncycastle.crypto.macs;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.tls.CipherSuite;
import org.jmrtd.PassportService;

/* loaded from: classes2.dex */
public class GOST28147Mac implements Mac {
    private int blockSize = 8;
    private int macSize = 4;
    private boolean firstStep = true;
    private int[] workingKey = null;
    private byte[] macIV = null;
    private byte[] S = {9, 6, 3, 2, 8, PassportService.SFI_DG11, 1, 7, 10, 4, 14, PassportService.SFI_DG15, PassportService.SFI_DG12, 0, PassportService.SFI_DG13, 5, 3, 7, 14, 9, 8, 10, PassportService.SFI_DG15, 0, 5, 2, 6, PassportService.SFI_DG12, PassportService.SFI_DG11, 4, PassportService.SFI_DG13, 1, 14, 4, 6, 2, PassportService.SFI_DG11, 3, PassportService.SFI_DG13, 8, PassportService.SFI_DG12, PassportService.SFI_DG15, 5, 10, 0, 7, 1, 9, 14, 7, 10, PassportService.SFI_DG12, PassportService.SFI_DG13, 1, 3, 9, 0, 2, PassportService.SFI_DG11, 4, PassportService.SFI_DG15, 8, 5, 6, PassportService.SFI_DG11, 5, 1, 9, 8, PassportService.SFI_DG13, PassportService.SFI_DG15, 0, 14, 4, 2, 3, PassportService.SFI_DG12, 7, 10, 6, 3, 10, PassportService.SFI_DG13, PassportService.SFI_DG12, 1, 2, 0, PassportService.SFI_DG11, 7, 5, 9, 4, 8, PassportService.SFI_DG15, 14, 6, 1, PassportService.SFI_DG13, 2, 9, 7, 10, 6, 0, 8, PassportService.SFI_DG12, 4, 5, PassportService.SFI_DG15, 3, PassportService.SFI_DG11, 14, PassportService.SFI_DG11, 10, PassportService.SFI_DG15, 5, 0, PassportService.SFI_DG12, 14, 8, 6, 2, 3, 9, 1, 7, PassportService.SFI_DG13, 4};
    private byte[] mac = new byte[8];
    private byte[] buf = new byte[8];
    private int bufOff = 0;

    private byte[] CM5func(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length - i];
        System.arraycopy(bArr, i, bArr3, 0, bArr2.length);
        for (int i9 = 0; i9 != bArr2.length; i9++) {
            bArr3[i9] = (byte) (bArr3[i9] ^ bArr2[i9]);
        }
        return bArr3;
    }

    private int bytesToint(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) + (bArr[i] & 255);
    }

    private int[] generateWorkingKey(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i = 0; i != 8; i++) {
            iArr[i] = bytesToint(bArr, i * 4);
        }
        return iArr;
    }

    private void gost28147MacFunc(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i9) {
        int bytesToint = bytesToint(bArr, i);
        int bytesToint2 = bytesToint(bArr, i + 4);
        for (int i10 = 0; i10 < 2; i10++) {
            int i11 = 0;
            while (i11 < 8) {
                int gost28147_mainStep = bytesToint2 ^ gost28147_mainStep(bytesToint, iArr[i11]);
                i11++;
                int i12 = bytesToint;
                bytesToint = gost28147_mainStep;
                bytesToint2 = i12;
            }
        }
        intTobytes(bytesToint, bArr2, i9);
        intTobytes(bytesToint2, bArr2, i9 + 4);
    }

    private int gost28147_mainStep(int i, int i9) {
        int i10 = i9 + i;
        byte[] bArr = this.S;
        int i11 = bArr[i10 & 15] + (bArr[((i10 >> 4) & 15) + 16] << 4) + (bArr[((i10 >> 8) & 15) + 32] << 8) + (bArr[((i10 >> 12) & 15) + 48] << PassportService.SFI_DG12) + (bArr[((i10 >> 16) & 15) + 64] << 16) + (bArr[((i10 >> 20) & 15) + 80] << 20) + (bArr[((i10 >> 24) & 15) + 96] << 24) + (bArr[((i10 >> 28) & 15) + 112] << 28);
        return (i11 << 11) | (i11 >>> 21);
    }

    private void intTobytes(int i, byte[] bArr, int i9) {
        bArr[i9 + 3] = (byte) (i >>> 24);
        bArr[i9 + 2] = (byte) (i >>> 16);
        bArr[i9 + 1] = (byte) (i >>> 8);
        bArr[i9] = (byte) i;
    }

    private void recursiveInit(CipherParameters cipherParameters) {
        CipherParameters parameters;
        if (cipherParameters == null) {
            return;
        }
        if (cipherParameters instanceof ParametersWithSBox) {
            ParametersWithSBox parametersWithSBox = (ParametersWithSBox) cipherParameters;
            System.arraycopy(parametersWithSBox.getSBox(), 0, this.S, 0, parametersWithSBox.getSBox().length);
            parameters = parametersWithSBox.getParameters();
        } else if (cipherParameters instanceof KeyParameter) {
            this.workingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey());
            parameters = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(a.h("invalid parameter passed to GOST28147 init - ", cipherParameters));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            byte[] bArr = this.mac;
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
            this.macIV = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        }
        recursiveInit(parameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        while (true) {
            int i9 = this.bufOff;
            if (i9 >= this.blockSize) {
                break;
            }
            this.buf[i9] = 0;
            this.bufOff = i9 + 1;
        }
        byte[] bArr2 = this.buf;
        byte[] bArr3 = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
        if (this.firstStep) {
            this.firstStep = false;
        } else {
            bArr3 = CM5func(this.buf, 0, this.mac);
        }
        gost28147MacFunc(this.workingKey, bArr3, 0, this.mac, 0);
        byte[] bArr4 = this.mac;
        int length = bArr4.length / 2;
        int i10 = this.macSize;
        System.arraycopy(bArr4, length - i10, bArr, i, i10);
        reset();
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        reset();
        this.buf = new byte[this.blockSize];
        this.macIV = null;
        recursiveInit(cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i >= bArr.length) {
                this.bufOff = 0;
                this.firstStep = true;
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b9) {
        int i = this.bufOff;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, this.mac.length);
            if (this.firstStep) {
                this.firstStep = false;
                byte[] bArr3 = this.macIV;
                if (bArr3 != null) {
                    bArr2 = CM5func(this.buf, 0, bArr3);
                }
            } else {
                bArr2 = CM5func(this.buf, 0, this.mac);
            }
            gost28147MacFunc(this.workingKey, bArr2, 0, this.mac, 0);
            this.bufOff = 0;
        }
        byte[] bArr4 = this.buf;
        int i9 = this.bufOff;
        this.bufOff = i9 + 1;
        bArr4[i9] = b9;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i10 = this.blockSize;
        int i11 = this.bufOff;
        int i12 = i10 - i11;
        if (i9 > i12) {
            System.arraycopy(bArr, i, this.buf, i11, i12);
            byte[] bArr2 = this.buf;
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
            if (this.firstStep) {
                this.firstStep = false;
                byte[] bArr4 = this.macIV;
                if (bArr4 != null) {
                    bArr3 = CM5func(this.buf, 0, bArr4);
                }
            } else {
                bArr3 = CM5func(this.buf, 0, this.mac);
            }
            gost28147MacFunc(this.workingKey, bArr3, 0, this.mac, 0);
            this.bufOff = 0;
            while (true) {
                i9 -= i12;
                i += i12;
                if (i9 <= this.blockSize) {
                    break;
                }
                gost28147MacFunc(this.workingKey, CM5func(bArr, i, this.mac), 0, this.mac, 0);
                i12 = this.blockSize;
            }
        }
        System.arraycopy(bArr, i, this.buf, this.bufOff, i9);
        this.bufOff += i9;
    }
}
