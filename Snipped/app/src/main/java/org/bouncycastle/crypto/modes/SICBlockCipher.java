package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import s3.b;

/* loaded from: classes2.dex */
public class SICBlockCipher extends StreamBlockCipher implements SkippingStreamCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void adjustCounter(long j10) {
        int i = 5;
        if (j10 >= 0) {
            long j11 = (this.byteCount + j10) / this.blockSize;
            long j12 = j11;
            if (j11 > 255) {
                while (i >= 1) {
                    long j13 = 1 << (i * 8);
                    while (j12 >= j13) {
                        incrementCounterAt(i);
                        j12 -= j13;
                    }
                    i--;
                }
            }
            incrementCounter((int) j12);
            this.byteCount = (int) ((j10 + this.byteCount) - (this.blockSize * j11));
            return;
        }
        long j14 = ((-j10) - this.byteCount) / this.blockSize;
        long j15 = j14;
        if (j14 > 255) {
            while (i >= 1) {
                long j16 = 1 << (i * 8);
                while (j15 > j16) {
                    decrementCounterAt(i);
                    j15 -= j16;
                }
                i--;
            }
        }
        for (long j17 = 0; j17 != j15; j17++) {
            decrementCounterAt(0);
        }
        int i9 = (int) ((this.blockSize * j14) + this.byteCount + j10);
        if (i9 >= 0) {
            this.byteCount = 0;
        } else {
            decrementCounterAt(0);
            this.byteCount = this.blockSize + i9;
        }
    }

    private void checkCounter() {
        if (this.IV.length >= this.blockSize) {
            return;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.IV;
            if (i == bArr.length) {
                return;
            }
            if (this.counter[i] != bArr[i]) {
                throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
            }
            i++;
        }
    }

    private void decrementCounterAt(int i) {
        byte b9;
        int length = this.counter.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b9 = (byte) (r1[length] - 1);
            this.counter[length] = b9;
        } while (b9 == -1);
    }

    private void incrementCounter(int i) {
        byte[] bArr = this.counter;
        byte b9 = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + i);
        if (b9 == 0 || bArr[bArr.length - 1] >= b9) {
            return;
        }
        incrementCounterAt(1);
    }

    private void incrementCounterAt(int i) {
        byte b9;
        int length = this.counter.length - i;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b9 = (byte) (bArr[length] + 1);
            bArr[length] = b9;
        } while (b9 == 0);
    }

    private void incrementCounterChecked() {
        byte b9;
        int length = this.counter.length;
        do {
            length--;
            if (length < 0) {
                break;
            }
            byte[] bArr = this.counter;
            b9 = (byte) (bArr[length] + 1);
            bArr[length] = b9;
        } while (b9 == 0);
        byte[] bArr2 = this.IV;
        if (length < bArr2.length && bArr2.length < this.blockSize) {
            throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
        }
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b9) {
        int i = this.byteCount;
        if (i == 0) {
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i9 = this.byteCount;
            this.byteCount = i9 + 1;
            return (byte) (b9 ^ bArr[i9]);
        }
        byte[] bArr2 = this.counterOut;
        int i10 = i + 1;
        this.byteCount = i10;
        byte b10 = (byte) (b9 ^ bArr2[i]);
        if (i10 == this.counter.length) {
            this.byteCount = 0;
            incrementCounterChecked();
        }
        return b10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.counter;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i = length - 1;
        while (i >= 1) {
            byte[] bArr3 = this.IV;
            int i9 = i < bArr3.length ? (bArr2[i] & 255) - (bArr3[i] & 255) : bArr2[i] & 255;
            if (i9 < 0) {
                int i10 = i - 1;
                bArr2[i10] = (byte) (bArr2[i10] - 1);
                i9 += 256;
            }
            bArr2[i] = (byte) i9;
            i--;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * this.blockSize) + this.byteCount;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] clone = Arrays.clone(parametersWithIV.getIV());
        this.IV = clone;
        int i = this.blockSize;
        if (i < clone.length) {
            throw new IllegalArgumentException(b.m(new StringBuilder("CTR/SIC mode requires IV no greater than: "), this.blockSize, " bytes."));
        }
        int i9 = 8 > i / 2 ? i / 2 : 8;
        if (i - clone.length <= i9) {
            if (parametersWithIV.getParameters() != null) {
                this.cipher.init(true, parametersWithIV.getParameters());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.blockSize - i9) + " bytes.");
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (this.byteCount != 0) {
            processBytes(bArr, i, this.blockSize, bArr2, i9);
        } else {
            int i10 = this.blockSize;
            if (i + i10 > bArr.length) {
                throw new DataLengthException("input buffer too small");
            }
            if (i10 + i9 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            for (int i11 = 0; i11 < this.blockSize; i11++) {
                bArr2[i9 + i11] = (byte) (bArr[i + i11] ^ this.counterOut[i11]);
            }
            incrementCounterChecked();
        }
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher, org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        byte b9;
        if (i + i9 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        if (i10 + i9 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = this.byteCount;
            if (i12 == 0) {
                this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                byte b10 = bArr[i + i11];
                byte[] bArr3 = this.counterOut;
                int i13 = this.byteCount;
                this.byteCount = i13 + 1;
                b9 = (byte) (b10 ^ bArr3[i13]);
            } else {
                byte b11 = bArr[i + i11];
                byte[] bArr4 = this.counterOut;
                int i14 = i12 + 1;
                this.byteCount = i14;
                b9 = (byte) (bArr4[i12] ^ b11);
                if (i14 == this.counter.length) {
                    this.byteCount = 0;
                    incrementCounterChecked();
                }
            }
            bArr2[i10 + i11] = b9;
        }
        return i9;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j10) {
        reset();
        return skip(j10);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j10) {
        adjustCounter(j10);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j10;
    }
}
