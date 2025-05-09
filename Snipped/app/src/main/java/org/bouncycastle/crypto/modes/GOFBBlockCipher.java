package org.bouncycastle.crypto.modes;

import android.R;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public class GOFBBlockCipher extends StreamBlockCipher {

    /* renamed from: C1, reason: collision with root package name */
    static final int f25048C1 = 16843012;

    /* renamed from: C2, reason: collision with root package name */
    static final int f25049C2 = 16843009;
    private byte[] IV;

    /* renamed from: N3, reason: collision with root package name */
    int f25050N3;

    /* renamed from: N4, reason: collision with root package name */
    int f25051N4;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    boolean firstStep;
    private byte[] ofbOutV;
    private byte[] ofbV;

    public GOFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.firstStep = true;
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        if (blockSize != 8) {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        }
        this.IV = new byte[blockCipher.getBlockSize()];
        this.ofbV = new byte[blockCipher.getBlockSize()];
        this.ofbOutV = new byte[blockCipher.getBlockSize()];
    }

    private int bytesToint(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) + (bArr[i] & 255);
    }

    private void intTobytes(int i, byte[] bArr, int i9) {
        bArr[i9 + 3] = (byte) (i >>> 24);
        bArr[i9 + 2] = (byte) (i >>> 16);
        bArr[i9 + 1] = (byte) (i >>> 8);
        bArr[i9] = (byte) i;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b9) {
        if (this.byteCount == 0) {
            if (this.firstStep) {
                this.firstStep = false;
                this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
                this.f25050N3 = bytesToint(this.ofbOutV, 0);
                this.f25051N4 = bytesToint(this.ofbOutV, 4);
            }
            int i = this.f25050N3 + 16843009;
            this.f25050N3 = i;
            int i9 = this.f25051N4;
            int i10 = i9 + 16843012;
            this.f25051N4 = i10;
            if (i10 < 16843012 && i10 > 0) {
                this.f25051N4 = i9 + R.attr.format;
            }
            intTobytes(i, this.ofbV, 0);
            intTobytes(this.f25051N4, this.ofbV, 4);
            this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
        }
        byte[] bArr = this.ofbOutV;
        int i11 = this.byteCount;
        int i12 = i11 + 1;
        this.byteCount = i12;
        byte b10 = (byte) (b9 ^ bArr[i11]);
        int i13 = this.blockSize;
        if (i12 == i13) {
            this.byteCount = 0;
            byte[] bArr2 = this.ofbV;
            System.arraycopy(bArr2, i13, bArr2, 0, bArr2.length - i13);
            byte[] bArr3 = this.ofbOutV;
            byte[] bArr4 = this.ofbV;
            int length = bArr4.length;
            int i14 = this.blockSize;
            System.arraycopy(bArr3, 0, bArr4, length - i14, i14);
        }
        return b10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCTR";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        BlockCipher blockCipher;
        this.firstStep = true;
        this.f25050N3 = 0;
        this.f25051N4 = 0;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = this.IV;
            if (length < bArr.length) {
                System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.IV;
                    if (i >= bArr2.length - iv.length) {
                        break;
                    }
                    bArr2[i] = 0;
                    i++;
                }
            } else {
                System.arraycopy(iv, 0, bArr, 0, bArr.length);
            }
            reset();
            if (parametersWithIV.getParameters() == null) {
                return;
            }
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            if (cipherParameters == null) {
                return;
            } else {
                blockCipher = this.cipher;
            }
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        processBytes(bArr, i, this.blockSize, bArr2, i9);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.firstStep = true;
        this.f25050N3 = 0;
        this.f25051N4 = 0;
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.ofbV, 0, bArr.length);
        this.byteCount = 0;
        this.cipher.reset();
    }
}
