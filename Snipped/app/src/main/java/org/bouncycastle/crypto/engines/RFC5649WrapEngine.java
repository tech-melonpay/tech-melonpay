package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class RFC5649WrapEngine implements Wrapper {
    private BlockCipher engine;
    private byte[] extractedAIV = null;
    private boolean forWrapping;
    private byte[] highOrderIV;
    private KeyParameter param;
    private byte[] preIV;

    public RFC5649WrapEngine(BlockCipher blockCipher) {
        byte[] bArr = {-90, 89, 89, -90};
        this.highOrderIV = bArr;
        this.preIV = bArr;
        this.engine = blockCipher;
    }

    private byte[] padPlaintext(byte[] bArr) {
        int length = bArr.length;
        int i = (8 - (length % 8)) % 8;
        byte[] bArr2 = new byte[length + i];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (i != 0) {
            System.arraycopy(new byte[i], 0, bArr2, length, i);
        }
        return bArr2;
    }

    private byte[] rfc3394UnwrapNoIvCheck(byte[] bArr, int i, int i9) {
        int i10 = i9 - 8;
        byte[] bArr2 = new byte[i10];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i, bArr3, 0, 8);
        System.arraycopy(bArr, i + 8, bArr2, 0, i10);
        this.engine.init(false, this.param);
        int i11 = (i9 / 8) - 1;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = i11; i13 >= 1; i13--) {
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                int i14 = (i13 - 1) * 8;
                System.arraycopy(bArr2, i14, bArr4, 8, 8);
                int i15 = (i11 * i12) + i13;
                int i16 = 1;
                while (i15 != 0) {
                    int i17 = 8 - i16;
                    bArr4[i17] = (byte) (((byte) i15) ^ bArr4[i17]);
                    i15 >>>= 8;
                    i16++;
                }
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, i14, 8);
            }
        }
        this.extractedAIV = bArr3;
        return bArr2;
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
            this.preIV = this.highOrderIV;
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.preIV = parametersWithIV.getIV();
            this.param = (KeyParameter) parametersWithIV.getParameters();
            if (this.preIV.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i9) {
        byte[] rfc3394UnwrapNoIvCheck;
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i10 = i9 / 8;
        if (i10 * 8 != i9) {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        if (i10 <= 1) {
            throw new InvalidCipherTextException("unwrap data must be at least 16 bytes");
        }
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i, bArr2, 0, i9);
        byte[] bArr3 = new byte[i9];
        if (i10 == 2) {
            this.engine.init(false, this.param);
            int i11 = 0;
            while (i11 < i9) {
                this.engine.processBlock(bArr2, i11, bArr3, i11);
                i11 += this.engine.getBlockSize();
            }
            byte[] bArr4 = new byte[8];
            this.extractedAIV = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
            byte[] bArr5 = this.extractedAIV;
            int length = i9 - bArr5.length;
            rfc3394UnwrapNoIvCheck = new byte[length];
            System.arraycopy(bArr3, bArr5.length, rfc3394UnwrapNoIvCheck, 0, length);
        } else {
            rfc3394UnwrapNoIvCheck = rfc3394UnwrapNoIvCheck(bArr, i, i9);
        }
        int i12 = 4;
        byte[] bArr6 = new byte[4];
        byte[] bArr7 = new byte[4];
        System.arraycopy(this.extractedAIV, 0, bArr6, 0, 4);
        System.arraycopy(this.extractedAIV, 4, bArr7, 0, 4);
        int bigEndianToInt = Pack.bigEndianToInt(bArr7, 0);
        boolean constantTimeAreEqual = Arrays.constantTimeAreEqual(bArr6, this.preIV);
        int length2 = rfc3394UnwrapNoIvCheck.length;
        if (bigEndianToInt <= length2 - 8) {
            constantTimeAreEqual = false;
        }
        if (bigEndianToInt > length2) {
            constantTimeAreEqual = false;
        }
        int i13 = length2 - bigEndianToInt;
        if (i13 >= 8 || i13 < 0) {
            constantTimeAreEqual = false;
        } else {
            i12 = i13;
        }
        byte[] bArr8 = new byte[i12];
        System.arraycopy(rfc3394UnwrapNoIvCheck, rfc3394UnwrapNoIvCheck.length - i12, bArr8, 0, i12);
        if (!Arrays.constantTimeAreEqual(bArr8, new byte[i12]) || !constantTimeAreEqual) {
            throw new InvalidCipherTextException("checksum failed");
        }
        byte[] bArr9 = new byte[bigEndianToInt];
        System.arraycopy(rfc3394UnwrapNoIvCheck, 0, bArr9, 0, bigEndianToInt);
        return bArr9;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i9) {
        if (!this.forWrapping) {
            throw new IllegalStateException("not set for wrapping");
        }
        byte[] bArr2 = new byte[8];
        byte[] intToBigEndian = Pack.intToBigEndian(i9);
        byte[] bArr3 = this.preIV;
        int i10 = 0;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(intToBigEndian, 0, bArr2, this.preIV.length, intToBigEndian.length);
        byte[] bArr4 = new byte[i9];
        System.arraycopy(bArr, i, bArr4, 0, i9);
        byte[] padPlaintext = padPlaintext(bArr4);
        if (padPlaintext.length != 8) {
            RFC3394WrapEngine rFC3394WrapEngine = new RFC3394WrapEngine(this.engine);
            rFC3394WrapEngine.init(true, new ParametersWithIV(this.param, bArr2));
            return rFC3394WrapEngine.wrap(padPlaintext, 0, padPlaintext.length);
        }
        int length = padPlaintext.length + 8;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, 8);
        System.arraycopy(padPlaintext, 0, bArr5, 8, padPlaintext.length);
        this.engine.init(true, this.param);
        while (i10 < length) {
            this.engine.processBlock(bArr5, i10, bArr5, i10);
            i10 += this.engine.getBlockSize();
        }
        return bArr5;
    }
}
