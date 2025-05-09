package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes2.dex */
public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private byte[] engineState = null;

    /* renamed from: x, reason: collision with root package name */
    private int f24974x = 0;

    /* renamed from: y, reason: collision with root package name */
    private int f24975y = 0;
    private byte[] workingKey = null;

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        this.f24974x = 0;
        this.f24975y = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.engineState[i] = (byte) i;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = bArr[i9] & 255;
            byte[] bArr2 = this.engineState;
            byte b9 = bArr2[i11];
            i10 = (i12 + b9 + i10) & 255;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b9;
            i9 = (i9 + 1) % bArr.length;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to RC4 init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        setKey(key);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        if (i + i9 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i10 + i9 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = (this.f24974x + 1) & 255;
            this.f24974x = i12;
            byte[] bArr3 = this.engineState;
            byte b9 = bArr3[i12];
            int i13 = (this.f24975y + b9) & 255;
            this.f24975y = i13;
            bArr3[i12] = bArr3[i13];
            bArr3[i13] = b9;
            bArr2[i11 + i10] = (byte) (bArr3[(bArr3[i12] + b9) & 255] ^ bArr[i11 + i]);
        }
        return i9;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b9) {
        int i = (this.f24974x + 1) & 255;
        this.f24974x = i;
        byte[] bArr = this.engineState;
        byte b10 = bArr[i];
        int i9 = (this.f24975y + b10) & 255;
        this.f24975y = i9;
        bArr[i] = bArr[i9];
        bArr[i9] = b10;
        return (byte) (b9 ^ bArr[(bArr[i] + b10) & 255]);
    }
}
