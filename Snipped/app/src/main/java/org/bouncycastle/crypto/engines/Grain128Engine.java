package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public class Grain128Engine implements StreamCipher {
    private static final int STATE_SIZE = 4;
    private int index = 4;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 3) {
            oneRound();
            this.index = 0;
        }
        byte[] bArr = this.out;
        int i = this.index;
        this.index = i + 1;
        return bArr[i];
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i9 = iArr[1];
        int i10 = (i >>> 2) | (i9 << 30);
        int i11 = (i >>> 12) | (i9 << 20);
        int i12 = (i >>> 15) | (i9 << 17);
        int i13 = iArr[2];
        int i14 = (i9 >>> 4) | (i13 << 28);
        int i15 = (i9 >>> 13) | (i13 << 19);
        int i16 = iArr[3];
        int i17 = (i13 >>> 9) | (i16 << 23);
        int i18 = (i13 >>> 25) | (i16 << 7);
        int i19 = (i16 << 1) | (i13 >>> 31);
        int[] iArr2 = this.lfsr;
        int i20 = iArr2[0];
        int i21 = iArr2[1];
        int i22 = (i20 >>> 8) | (i21 << 24);
        int i23 = (i20 >>> 13) | (i21 << 19);
        int i24 = (i20 >>> 20) | (i21 << 12);
        int i25 = iArr2[2];
        int i26 = iArr2[3];
        int i27 = i23 & i24;
        return ((((((((((i19 & i11) & ((i26 << 1) | (i25 >>> 31))) ^ (((i27 ^ (i11 & i22)) ^ (i19 & ((i21 >>> 10) | (i25 << 22)))) ^ (((i21 >>> 28) | (i25 << 4)) & ((i25 >>> 15) | (i26 << 17))))) ^ ((i25 >>> 29) | (i26 << 3))) ^ i10) ^ i12) ^ i14) ^ i15) ^ i13) ^ i17) ^ i18;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i = iArr[0];
        int i9 = iArr[1];
        int i10 = (i >>> 7) | (i9 << 25);
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = (i11 >>> 6) | (i12 << 26);
        return i12 ^ ((((i ^ i10) ^ ((i9 >>> 6) | (i11 << 26))) ^ i13) ^ ((i11 >>> 17) | (i12 << 15)));
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i9 = iArr[1];
        int i10 = (i >>> 3) | (i9 << 29);
        int i11 = (i >>> 11) | (i9 << 21);
        int i12 = (i >>> 13) | (i9 << 19);
        int i13 = (i >>> 17) | (i9 << 15);
        int i14 = (i >>> 18) | (i9 << 14);
        int i15 = (i >>> 26) | (i9 << 6);
        int i16 = (i >>> 27) | (i9 << 5);
        int i17 = iArr[2];
        int i18 = (i9 >>> 8) | (i17 << 24);
        int i19 = (i9 >>> 16) | (i17 << 16);
        int i20 = (i9 >>> 24) | (i17 << 8);
        int i21 = (i9 >>> 27) | (i17 << 5);
        int i22 = (i9 >>> 29) | (i17 << 3);
        int i23 = iArr[3];
        return (((((((i23 ^ (((i ^ i15) ^ i20) ^ ((i17 >>> 27) | (i23 << 5)))) ^ (i10 & ((i17 >>> 3) | (i23 << 29)))) ^ (i11 & i12)) ^ (i13 & i14)) ^ (i16 & i21)) ^ (i18 & i19)) ^ (i22 & ((i17 >>> 1) | (i23 << 31)))) ^ (((i17 >>> 4) | (i23 << 28)) & ((i17 >>> 20) | (i23 << 12)));
    }

    private void initGrain() {
        for (int i = 0; i < 8; i++) {
            this.output = getOutput();
            this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) ^ this.output);
            this.lfsr = shift(this.lfsr, getOutputLFSR() ^ this.output);
        }
        this.initialised = true;
    }

    private void oneRound() {
        int output = getOutput();
        this.output = output;
        byte[] bArr = this.out;
        bArr[0] = (byte) output;
        bArr[1] = (byte) (output >> 8);
        bArr[2] = (byte) (output >> 16);
        bArr[3] = (byte) (output >> 24);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        int i = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.nfsr;
            if (i >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.workingKey;
            int i10 = i9 + 3;
            int i11 = i9 + 2;
            int i12 = i9 + 1;
            iArr[i] = (bArr3[i9] & 255) | (bArr3[i10] << 24) | ((bArr3[i11] << 16) & 16711680) | ((bArr3[i12] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB);
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i] = (bArr4[i9] & 255) | (bArr4[i10] << 24) | ((bArr4[i11] << 16) & 16711680) | ((bArr4[i12] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB);
            i9 += 4;
            i++;
        }
    }

    private int[] shift(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 12) {
            throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        this.workingIV = new byte[keyParameter.getKey().length];
        this.workingKey = new byte[keyParameter.getKey().length];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.out = new byte[4];
        System.arraycopy(iv, 0, this.workingIV, 0, iv.length);
        System.arraycopy(keyParameter.getKey(), 0, this.workingKey, 0, keyParameter.getKey().length);
        reset();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i + i9 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i10 + i9 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i11 = 0; i11 < i9; i11++) {
            bArr2[i10 + i11] = (byte) (bArr[i + i11] ^ getKeyStream());
        }
        return i9;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 4;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b9) {
        if (this.initialised) {
            return (byte) (b9 ^ getKeyStream());
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}
