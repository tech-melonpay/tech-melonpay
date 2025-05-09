package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes2.dex */
public class TEAEngine implements BlockCipher {
    private static final int block_size = 8;
    private static final int d_sum = -957401312;
    private static final int delta = -1640531527;
    private static final int rounds = 32;
    private int _a;
    private int _b;
    private int _c;
    private int _d;
    private boolean _forEncryption;
    private boolean _initialised = false;

    private int bytesToInt(byte[] bArr, int i) {
        int i9 = ((bArr[i + 1] & 255) << 16) | (bArr[i] << 24);
        return (bArr[i + 3] & 255) | i9 | ((bArr[i + 2] & 255) << 8);
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int bytesToInt = bytesToInt(bArr, i);
        int bytesToInt2 = bytesToInt(bArr, i + 4);
        int i10 = d_sum;
        for (int i11 = 0; i11 != 32; i11++) {
            bytesToInt2 -= (((bytesToInt << 4) + this._c) ^ (bytesToInt + i10)) ^ ((bytesToInt >>> 5) + this._d);
            bytesToInt -= (((bytesToInt2 << 4) + this._a) ^ (bytesToInt2 + i10)) ^ ((bytesToInt2 >>> 5) + this._b);
            i10 += 1640531527;
        }
        unpackInt(bytesToInt, bArr2, i9);
        unpackInt(bytesToInt2, bArr2, i9 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int bytesToInt = bytesToInt(bArr, i);
        int bytesToInt2 = bytesToInt(bArr, i + 4);
        int i10 = bytesToInt;
        int i11 = 0;
        for (int i12 = 0; i12 != 32; i12++) {
            i11 -= 1640531527;
            i10 += (((bytesToInt2 << 4) + this._a) ^ (bytesToInt2 + i11)) ^ ((bytesToInt2 >>> 5) + this._b);
            bytesToInt2 += (((i10 << 4) + this._c) ^ (i10 + i11)) ^ ((i10 >>> 5) + this._d);
        }
        unpackInt(i10, bArr2, i9);
        unpackInt(bytesToInt2, bArr2, i9 + 4);
        return 8;
    }

    private void setKey(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        this._a = bytesToInt(bArr, 0);
        this._b = bytesToInt(bArr, 4);
        this._c = bytesToInt(bArr, 8);
        this._d = bytesToInt(bArr, 12);
    }

    private void unpackInt(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) (i >>> 24);
        bArr[i9 + 1] = (byte) (i >>> 16);
        bArr[i9 + 2] = (byte) (i >>> 8);
        bArr[i9 + 3] = (byte) i;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "TEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to TEA init - ", cipherParameters));
        }
        this._forEncryption = z10;
        this._initialised = true;
        setKey(((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + 8 <= bArr2.length) {
            return this._forEncryption ? encryptBlock(bArr, i, bArr2, i9) : decryptBlock(bArr, i, bArr2, i9);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
