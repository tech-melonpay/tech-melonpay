package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes2.dex */
public class HC256Engine implements StreamCipher {
    private boolean initialised;
    private byte[] iv;
    private byte[] key;

    /* renamed from: p, reason: collision with root package name */
    private int[] f24968p = new int[1024];

    /* renamed from: q, reason: collision with root package name */
    private int[] f24969q = new int[1024];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private byte getByte() {
        if (this.idx == 0) {
            int step = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (step & 255);
            bArr[1] = (byte) ((step >> 8) & 255);
            bArr[2] = (byte) ((step >> 16) & 255);
            bArr[3] = (byte) ((step >> 24) & 255);
        }
        byte[] bArr2 = this.buf;
        int i = this.idx;
        byte b9 = bArr2[i];
        this.idx = 3 & (i + 1);
        return b9;
    }

    private void init() {
        byte[] bArr = this.key;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.iv.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.key;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.key = bArr2;
        }
        byte[] bArr4 = this.iv;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.iv;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.iv = bArr5;
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[2560];
        for (int i = 0; i < 32; i++) {
            int i9 = i >> 2;
            iArr[i9] = iArr[i9] | ((this.key[i] & 255) << ((i & 3) * 8));
        }
        for (int i10 = 0; i10 < 32; i10++) {
            int i11 = (i10 >> 2) + 8;
            iArr[i11] = iArr[i11] | ((this.iv[i10] & 255) << ((i10 & 3) * 8));
        }
        for (int i12 = 16; i12 < 2560; i12++) {
            int i13 = iArr[i12 - 2];
            int i14 = iArr[i12 - 15];
            iArr[i12] = ((i13 >>> 10) ^ (rotateRight(i13, 17) ^ rotateRight(i13, 19))) + iArr[i12 - 7] + ((i14 >>> 3) ^ (rotateRight(i14, 7) ^ rotateRight(i14, 18))) + iArr[i12 - 16] + i12;
        }
        System.arraycopy(iArr, 512, this.f24968p, 0, 1024);
        System.arraycopy(iArr, 1536, this.f24969q, 0, 1024);
        for (int i15 = 0; i15 < 4096; i15++) {
            step();
        }
        this.cnt = 0;
    }

    private static int rotateRight(int i, int i9) {
        return (i << (-i9)) | (i >>> i9);
    }

    private int step() {
        int i;
        int i9;
        int i10 = this.cnt;
        int i11 = i10 & 1023;
        if (i10 < 1024) {
            int[] iArr = this.f24968p;
            int i12 = iArr[(i11 - 3) & 1023];
            int i13 = iArr[(i11 - 1023) & 1023];
            int i14 = iArr[i11];
            int rotateRight = iArr[(i11 - 10) & 1023] + (rotateRight(i13, 23) ^ rotateRight(i12, 10));
            int[] iArr2 = this.f24969q;
            iArr[i11] = rotateRight + iArr2[(i12 ^ i13) & 1023] + i14;
            int[] iArr3 = this.f24968p;
            int i15 = iArr3[(i11 - 12) & 1023];
            i = iArr2[i15 & 255] + iArr2[((i15 >> 8) & 255) + 256] + iArr2[((i15 >> 16) & 255) + 512] + iArr2[((i15 >> 24) & 255) + 768];
            i9 = iArr3[i11];
        } else {
            int[] iArr4 = this.f24969q;
            int i16 = iArr4[(i11 - 3) & 1023];
            int i17 = iArr4[(i11 - 1023) & 1023];
            int i18 = iArr4[i11];
            int rotateRight2 = iArr4[(i11 - 10) & 1023] + (rotateRight(i17, 23) ^ rotateRight(i16, 10));
            int[] iArr5 = this.f24968p;
            iArr4[i11] = rotateRight2 + iArr5[(i16 ^ i17) & 1023] + i18;
            int[] iArr6 = this.f24969q;
            int i19 = iArr6[(i11 - 12) & 1023];
            i = iArr5[i19 & 255] + iArr5[((i19 >> 8) & 255) + 256] + iArr5[((i19 >> 16) & 255) + 512] + iArr5[((i19 >> 24) & 255) + 768];
            i9 = iArr6[i11];
        }
        int i20 = i9 ^ i;
        this.cnt = (this.cnt + 1) & 2047;
        return i20;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-256";
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
            bArr2[i10 + i11] = (byte) (bArr[i + i11] ^ getByte());
        }
        return i9;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b9) {
        return (byte) (b9 ^ getByte());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        CipherParameters cipherParameters2;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.iv = parametersWithIV.getIV();
            cipherParameters2 = parametersWithIV.getParameters();
        } else {
            this.iv = new byte[0];
            cipherParameters2 = cipherParameters;
        }
        if (!(cipherParameters2 instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("Invalid parameter passed to HC256 init - ", cipherParameters));
        }
        this.key = ((KeyParameter) cipherParameters2).getKey();
        init();
        this.initialised = true;
    }
}
