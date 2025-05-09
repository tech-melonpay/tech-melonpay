package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes2.dex */
public class VMPCMac implements Mac {
    private byte[] T;

    /* renamed from: g, reason: collision with root package name */
    private byte f25033g;
    private byte[] workingIV;
    private byte[] workingKey;

    /* renamed from: x1, reason: collision with root package name */
    private byte f25036x1;

    /* renamed from: x2, reason: collision with root package name */
    private byte f25037x2;

    /* renamed from: x3, reason: collision with root package name */
    private byte f25038x3;

    /* renamed from: x4, reason: collision with root package name */
    private byte f25039x4;

    /* renamed from: n, reason: collision with root package name */
    private byte f25034n = 0;

    /* renamed from: P, reason: collision with root package name */
    private byte[] f25032P = null;

    /* renamed from: s, reason: collision with root package name */
    private byte f25035s = 0;

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.f25035s = (byte) 0;
        this.f25032P = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.f25032P[i] = (byte) i;
        }
        for (int i9 = 0; i9 < 768; i9++) {
            byte[] bArr3 = this.f25032P;
            byte b9 = this.f25035s;
            int i10 = i9 & 255;
            byte b10 = bArr3[i10];
            byte b11 = bArr3[(b9 + b10 + bArr[i9 % bArr.length]) & 255];
            this.f25035s = b11;
            bArr3[i10] = bArr3[b11 & 255];
            bArr3[b11 & 255] = b10;
        }
        for (int i11 = 0; i11 < 768; i11++) {
            byte[] bArr4 = this.f25032P;
            byte b12 = this.f25035s;
            int i12 = i11 & 255;
            byte b13 = bArr4[i12];
            byte b14 = bArr4[(b12 + b13 + bArr2[i11 % bArr2.length]) & 255];
            this.f25035s = b14;
            bArr4[i12] = bArr4[b14 & 255];
            bArr4[b14 & 255] = b13;
        }
        this.f25034n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        for (int i9 = 1; i9 < 25; i9++) {
            byte[] bArr2 = this.f25032P;
            byte b9 = this.f25035s;
            byte b10 = this.f25034n;
            byte b11 = bArr2[(b9 + bArr2[b10 & 255]) & 255];
            this.f25035s = b11;
            byte b12 = this.f25039x4;
            byte b13 = this.f25038x3;
            byte b14 = bArr2[(b12 + b13 + i9) & 255];
            this.f25039x4 = b14;
            byte b15 = this.f25037x2;
            byte b16 = bArr2[(b13 + b15 + i9) & 255];
            this.f25038x3 = b16;
            byte b17 = this.f25036x1;
            byte b18 = bArr2[(b15 + b17 + i9) & 255];
            this.f25037x2 = b18;
            byte b19 = bArr2[(b17 + b11 + i9) & 255];
            this.f25036x1 = b19;
            byte[] bArr3 = this.T;
            byte b20 = this.f25033g;
            bArr3[b20 & 31] = (byte) (b19 ^ bArr3[b20 & 31]);
            bArr3[(b20 + 1) & 31] = (byte) (b18 ^ bArr3[(b20 + 1) & 31]);
            bArr3[(b20 + 2) & 31] = (byte) (b16 ^ bArr3[(b20 + 2) & 31]);
            bArr3[(b20 + 3) & 31] = (byte) (b14 ^ bArr3[(b20 + 3) & 31]);
            this.f25033g = (byte) ((b20 + 4) & 31);
            byte b21 = bArr2[b10 & 255];
            bArr2[b10 & 255] = bArr2[b11 & 255];
            bArr2[b11 & 255] = b21;
            this.f25034n = (byte) ((b10 + 1) & 255);
        }
        for (int i10 = 0; i10 < 768; i10++) {
            byte[] bArr4 = this.f25032P;
            byte b22 = this.f25035s;
            int i11 = i10 & 255;
            byte b23 = bArr4[i11];
            byte b24 = bArr4[(b22 + b23 + this.T[i10 & 31]) & 255];
            this.f25035s = b24;
            bArr4[i11] = bArr4[b24 & 255];
            bArr4[b24 & 255] = b23;
        }
        byte[] bArr5 = new byte[20];
        for (int i12 = 0; i12 < 20; i12++) {
            byte[] bArr6 = this.f25032P;
            int i13 = i12 & 255;
            byte b25 = bArr6[(this.f25035s + bArr6[i13]) & 255];
            this.f25035s = b25;
            bArr5[i12] = bArr6[(bArr6[bArr6[b25 & 255] & 255] + 1) & 255];
            byte b26 = bArr6[i13];
            bArr6[i13] = bArr6[b25 & 255];
            bArr6[b25 & 255] = b26;
        }
        System.arraycopy(bArr5, 0, bArr, i, 20);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] iv = parametersWithIV.getIV();
        this.workingIV = iv;
        if (iv == null || iv.length < 1 || iv.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.workingKey = keyParameter.getKey();
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.f25034n = (byte) 0;
        this.f25039x4 = (byte) 0;
        this.f25038x3 = (byte) 0;
        this.f25037x2 = (byte) 0;
        this.f25036x1 = (byte) 0;
        this.f25033g = (byte) 0;
        this.T = new byte[32];
        for (int i = 0; i < 32; i++) {
            this.T[i] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b9) {
        byte[] bArr = this.f25032P;
        byte b10 = this.f25035s;
        byte b11 = this.f25034n;
        byte b12 = bArr[(b10 + bArr[b11 & 255]) & 255];
        this.f25035s = b12;
        byte b13 = (byte) (b9 ^ bArr[(bArr[bArr[b12 & 255] & 255] + 1) & 255]);
        byte b14 = this.f25039x4;
        byte b15 = this.f25038x3;
        byte b16 = bArr[(b14 + b15) & 255];
        this.f25039x4 = b16;
        byte b17 = this.f25037x2;
        byte b18 = bArr[(b15 + b17) & 255];
        this.f25038x3 = b18;
        byte b19 = this.f25036x1;
        byte b20 = bArr[(b17 + b19) & 255];
        this.f25037x2 = b20;
        byte b21 = bArr[(b19 + b12 + b13) & 255];
        this.f25036x1 = b21;
        byte[] bArr2 = this.T;
        byte b22 = this.f25033g;
        bArr2[b22 & 31] = (byte) (b21 ^ bArr2[b22 & 31]);
        bArr2[(b22 + 1) & 31] = (byte) (b20 ^ bArr2[(b22 + 1) & 31]);
        bArr2[(b22 + 2) & 31] = (byte) (b18 ^ bArr2[(b22 + 2) & 31]);
        bArr2[(b22 + 3) & 31] = (byte) (b16 ^ bArr2[(b22 + 3) & 31]);
        this.f25033g = (byte) ((b22 + 4) & 31);
        byte b23 = bArr[b11 & 255];
        bArr[b11 & 255] = bArr[b12 & 255];
        bArr[b12 & 255] = b23;
        this.f25034n = (byte) ((b11 + 1) & 255);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i9) {
        if (i + i9 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i10 = 0; i10 < i9; i10++) {
            update(bArr[i + i10]);
        }
    }
}
