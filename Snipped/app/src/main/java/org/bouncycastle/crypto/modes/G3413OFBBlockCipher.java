package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class G3413OFBBlockCipher extends StreamBlockCipher {
    private byte[] R;
    private byte[] R_init;
    private byte[] Y;
    private int blockSize;
    private int byteCount;
    private BlockCipher cipher;
    private boolean initialized;

    /* renamed from: m, reason: collision with root package name */
    private int f25044m;

    public G3413OFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.initialized = false;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.cipher = blockCipher;
        this.Y = new byte[blockSize];
    }

    private void generateR() {
        byte[] LSB = GOST3413CipherUtil.LSB(this.R, this.f25044m - this.blockSize);
        System.arraycopy(LSB, 0, this.R, 0, LSB.length);
        System.arraycopy(this.Y, 0, this.R, LSB.length, this.f25044m - LSB.length);
    }

    private void generateY() {
        this.cipher.processBlock(GOST3413CipherUtil.MSB(this.R, this.blockSize), 0, this.Y, 0);
    }

    private void initArrays() {
        int i = this.f25044m;
        this.R = new byte[i];
        this.R_init = new byte[i];
    }

    private void setupDefaultParams() {
        this.f25044m = this.blockSize * 2;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b9) {
        if (this.byteCount == 0) {
            generateY();
        }
        byte[] bArr = this.Y;
        int i = this.byteCount;
        byte b10 = (byte) (b9 ^ bArr[i]);
        int i9 = i + 1;
        this.byteCount = i9;
        if (i9 == getBlockSize()) {
            this.byteCount = 0;
            generateR();
        }
        return b10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OFB";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        BlockCipher blockCipher;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            setupDefaultParams();
            initArrays();
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.R, 0, bArr.length);
            if (cipherParameters != null) {
                blockCipher = this.cipher;
                blockCipher.init(true, cipherParameters);
            }
            this.initialized = true;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv.length < this.blockSize) {
            throw new IllegalArgumentException("Parameter m must blockSize <= m");
        }
        this.f25044m = iv.length;
        initArrays();
        byte[] clone = Arrays.clone(iv);
        this.R_init = clone;
        System.arraycopy(clone, 0, this.R, 0, clone.length);
        if (parametersWithIV.getParameters() != null) {
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
            blockCipher.init(true, cipherParameters);
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        processBytes(bArr, i, this.blockSize, bArr2, i9);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialized) {
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.R, 0, bArr.length);
            Arrays.clear(this.Y);
            this.byteCount = 0;
            this.cipher.reset();
        }
    }
}
