package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes2.dex */
public class HC128Engine implements StreamCipher {
    private boolean initialised;
    private byte[] iv;
    private byte[] key;

    /* renamed from: p, reason: collision with root package name */
    private int[] f24966p = new int[512];

    /* renamed from: q, reason: collision with root package name */
    private int[] f24967q = new int[512];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private static int dim(int i, int i9) {
        return mod512(i - i9);
    }

    private static int f1(int i) {
        return (i >>> 3) ^ (rotateRight(i, 7) ^ rotateRight(i, 18));
    }

    private static int f2(int i) {
        return (i >>> 10) ^ (rotateRight(i, 17) ^ rotateRight(i, 19));
    }

    private int g1(int i, int i9, int i10) {
        return (rotateRight(i, 10) ^ rotateRight(i10, 23)) + rotateRight(i9, 8);
    }

    private int g2(int i, int i9, int i10) {
        return (rotateLeft(i, 10) ^ rotateLeft(i10, 23)) + rotateLeft(i9, 8);
    }

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

    private int h1(int i) {
        int[] iArr = this.f24967q;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    private int h2(int i) {
        int[] iArr = this.f24966p;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    private void init() {
        if (this.key.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[1280];
        for (int i = 0; i < 16; i++) {
            int i9 = i >> 2;
            iArr[i9] = ((this.key[i] & 255) << ((i & 3) * 8)) | iArr[i9];
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i10 = 0;
        while (true) {
            byte[] bArr = this.iv;
            if (i10 >= bArr.length || i10 >= 16) {
                break;
            }
            int i11 = (i10 >> 2) + 8;
            iArr[i11] = ((bArr[i10] & 255) << ((i10 & 3) * 8)) | iArr[i11];
            i10++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i12 = 16; i12 < 1280; i12++) {
            iArr[i12] = f2(iArr[i12 - 2]) + iArr[i12 - 7] + f1(iArr[i12 - 15]) + iArr[i12 - 16] + i12;
        }
        System.arraycopy(iArr, 256, this.f24966p, 0, 512);
        System.arraycopy(iArr, 768, this.f24967q, 0, 512);
        for (int i13 = 0; i13 < 512; i13++) {
            this.f24966p[i13] = step();
        }
        for (int i14 = 0; i14 < 512; i14++) {
            this.f24967q[i14] = step();
        }
        this.cnt = 0;
    }

    private static int mod1024(int i) {
        return i & 1023;
    }

    private static int mod512(int i) {
        return i & 511;
    }

    private static int rotateLeft(int i, int i9) {
        return (i >>> (-i9)) | (i << i9);
    }

    private static int rotateRight(int i, int i9) {
        return (i << (-i9)) | (i >>> i9);
    }

    private int step() {
        int h22;
        int i;
        int mod512 = mod512(this.cnt);
        if (this.cnt < 512) {
            int[] iArr = this.f24966p;
            iArr[mod512] = iArr[mod512] + g1(iArr[dim(mod512, 3)], this.f24966p[dim(mod512, 10)], this.f24966p[dim(mod512, 511)]);
            h22 = h1(this.f24966p[dim(mod512, 12)]);
            i = this.f24966p[mod512];
        } else {
            int[] iArr2 = this.f24967q;
            iArr2[mod512] = iArr2[mod512] + g2(iArr2[dim(mod512, 3)], this.f24967q[dim(mod512, 10)], this.f24967q[dim(mod512, 511)]);
            h22 = h2(this.f24967q[dim(mod512, 12)]);
            i = this.f24967q[mod512];
        }
        int i9 = i ^ h22;
        this.cnt = mod1024(this.cnt + 1);
        return i9;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-128";
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
            throw new IllegalArgumentException(a.h("Invalid parameter passed to HC128 init - ", cipherParameters));
        }
        this.key = ((KeyParameter) cipherParameters2).getKey();
        init();
        this.initialised = true;
    }
}
