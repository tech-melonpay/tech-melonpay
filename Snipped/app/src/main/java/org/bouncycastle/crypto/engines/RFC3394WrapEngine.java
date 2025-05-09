package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class RFC3394WrapEngine implements Wrapper {
    private BlockCipher engine;
    private boolean forWrapping;
    private byte[] iv;
    private KeyParameter param;
    private boolean wrapCipherMode;

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.forWrapping = z10;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            return;
        }
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.iv = parametersWithIV.getIV();
            this.param = (KeyParameter) parametersWithIV.getParameters();
            if (this.iv.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i9) {
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i10 = i9 / 8;
        if (i10 * 8 != i9) {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = this.iv;
        byte[] bArr3 = new byte[i9 - bArr2.length];
        byte[] bArr4 = new byte[bArr2.length];
        byte[] bArr5 = new byte[bArr2.length + 8];
        System.arraycopy(bArr, i, bArr4, 0, bArr2.length);
        byte[] bArr6 = this.iv;
        System.arraycopy(bArr, i + bArr6.length, bArr3, 0, i9 - bArr6.length);
        this.engine.init(!this.wrapCipherMode, this.param);
        int i11 = i10 - 1;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = i11; i13 >= 1; i13--) {
                System.arraycopy(bArr4, 0, bArr5, 0, this.iv.length);
                int i14 = (i13 - 1) * 8;
                System.arraycopy(bArr3, i14, bArr5, this.iv.length, 8);
                int i15 = (i11 * i12) + i13;
                int i16 = 1;
                while (i15 != 0) {
                    int length = this.iv.length - i16;
                    bArr5[length] = (byte) (((byte) i15) ^ bArr5[length]);
                    i15 >>>= 8;
                    i16++;
                }
                this.engine.processBlock(bArr5, 0, bArr5, 0);
                System.arraycopy(bArr5, 0, bArr4, 0, 8);
                System.arraycopy(bArr5, 8, bArr3, i14, 8);
            }
        }
        if (Arrays.constantTimeAreEqual(bArr4, this.iv)) {
            return bArr3;
        }
        throw new InvalidCipherTextException("checksum failed");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i9) {
        if (!this.forWrapping) {
            throw new IllegalStateException("not set for wrapping");
        }
        int i10 = i9 / 8;
        if (i10 * 8 != i9) {
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        byte[] bArr2 = this.iv;
        byte[] bArr3 = new byte[bArr2.length + i9];
        byte[] bArr4 = new byte[bArr2.length + 8];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, this.iv.length, i9);
        this.engine.init(this.wrapCipherMode, this.param);
        for (int i11 = 0; i11 != 6; i11++) {
            for (int i12 = 1; i12 <= i10; i12++) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.iv.length);
                int i13 = i12 * 8;
                System.arraycopy(bArr3, i13, bArr4, this.iv.length, 8);
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                int i14 = (i10 * i11) + i12;
                int i15 = 1;
                while (i14 != 0) {
                    int length = this.iv.length - i15;
                    bArr4[length] = (byte) (((byte) i14) ^ bArr4[length]);
                    i14 >>>= 8;
                    i15++;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr3, i13, 8);
            }
        }
        return bArr3;
    }

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z10) {
        this.iv = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.engine = blockCipher;
        this.wrapCipherMode = !z10;
    }
}
