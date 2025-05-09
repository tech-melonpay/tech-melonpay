package org.bouncycastle.crypto.encodings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* loaded from: classes2.dex */
public class PKCS1Encoding implements AsymmetricBlockCipher {
    private static final int HEADER_LENGTH = 10;
    public static final String NOT_STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.not_strict";
    public static final String STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.strict";
    private byte[] blockBuffer;
    private AsymmetricBlockCipher engine;
    private byte[] fallback;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private int pLen;
    private SecureRandom random;
    private boolean useStrictLength;

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
    }

    private static int checkPkcs1Encoding(byte[] bArr, int i) {
        int i9 = bArr[0] ^ 2;
        int i10 = i + 1;
        int length = bArr.length - i10;
        for (int i11 = 1; i11 < length; i11++) {
            byte b9 = bArr[i11];
            int i12 = b9 | (b9 >> 1);
            int i13 = i12 | (i12 >> 2);
            i9 |= ((i13 | (i13 >> 4)) & 1) - 1;
        }
        int i14 = bArr[bArr.length - i10] | i9;
        int i15 = i14 | (i14 >> 1);
        int i16 = i15 | (i15 >> 2);
        return ~(((i16 | (i16 >> 4)) & 1) - 1);
    }

    private byte[] decodeBlock(byte[] bArr, int i, int i9) {
        if (this.pLen != -1) {
            return decodeBlockOrRandom(bArr, i, i9);
        }
        byte[] processBlock = this.engine.processBlock(bArr, i, i9);
        boolean z10 = this.useStrictLength & (processBlock.length != this.engine.getOutputBlockSize());
        if (processBlock.length < getOutputBlockSize()) {
            processBlock = this.blockBuffer;
        }
        byte b9 = processBlock[0];
        boolean z11 = !this.forPrivateKey ? b9 == 1 : b9 == 2;
        int findStart = findStart(b9, processBlock) + 1;
        if (z11 || (findStart < 10)) {
            Arrays.fill(processBlock, (byte) 0);
            throw new InvalidCipherTextException("block incorrect");
        }
        if (z10) {
            Arrays.fill(processBlock, (byte) 0);
            throw new InvalidCipherTextException("block incorrect size");
        }
        int length = processBlock.length - findStart;
        byte[] bArr2 = new byte[length];
        System.arraycopy(processBlock, findStart, bArr2, 0, length);
        return bArr2;
    }

    private byte[] decodeBlockOrRandom(byte[] bArr, int i, int i9) {
        if (!this.forPrivateKey) {
            throw new InvalidCipherTextException("sorry, this method is only for decryption, not for signing");
        }
        byte[] processBlock = this.engine.processBlock(bArr, i, i9);
        byte[] bArr2 = this.fallback;
        if (bArr2 == null) {
            bArr2 = new byte[this.pLen];
            this.random.nextBytes(bArr2);
        }
        if (this.useStrictLength & (processBlock.length != this.engine.getOutputBlockSize())) {
            processBlock = this.blockBuffer;
        }
        int checkPkcs1Encoding = checkPkcs1Encoding(processBlock, this.pLen);
        byte[] bArr3 = new byte[this.pLen];
        int i10 = 0;
        while (true) {
            int i11 = this.pLen;
            if (i10 >= i11) {
                Arrays.fill(processBlock, (byte) 0);
                return bArr3;
            }
            bArr3[i10] = (byte) ((processBlock[(processBlock.length - i11) + i10] & (~checkPkcs1Encoding)) | (bArr2[i10] & checkPkcs1Encoding));
            i10++;
        }
    }

    private byte[] encodeBlock(byte[] bArr, int i, int i9) {
        if (i9 > getInputBlockSize()) {
            throw new IllegalArgumentException("input data too large");
        }
        int inputBlockSize = this.engine.getInputBlockSize();
        byte[] bArr2 = new byte[inputBlockSize];
        if (this.forPrivateKey) {
            bArr2[0] = 1;
            for (int i10 = 1; i10 != (inputBlockSize - i9) - 1; i10++) {
                bArr2[i10] = -1;
            }
        } else {
            this.random.nextBytes(bArr2);
            bArr2[0] = 2;
            for (int i11 = 1; i11 != (inputBlockSize - i9) - 1; i11++) {
                while (bArr2[i11] == 0) {
                    bArr2[i11] = (byte) this.random.nextInt();
                }
            }
        }
        int i12 = inputBlockSize - i9;
        bArr2[i12 - 1] = 0;
        System.arraycopy(bArr, i, bArr2, i12, i9);
        return this.engine.processBlock(bArr2, 0, inputBlockSize);
    }

    private int findStart(byte b9, byte[] bArr) {
        int i = -1;
        boolean z10 = false;
        for (int i9 = 1; i9 != bArr.length; i9++) {
            byte b10 = bArr[i9];
            if ((b10 == 0) & (i < 0)) {
                i = i9;
            }
            z10 |= (b10 != -1) & (b9 == 1) & (i < 0);
        }
        if (z10) {
            return -1;
        }
        return i;
    }

    private boolean useStrict() {
        if (Properties.isOverrideSetTo(NOT_STRICT_LENGTH_ENABLED_PROPERTY, true)) {
            return false;
        }
        return !Properties.isOverrideSetTo(STRICT_LENGTH_ENABLED_PROPERTY, false);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : outputBlockSize - 10;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            asymmetricKeyParameter = (AsymmetricKeyParameter) parametersWithRandom.getParameters();
        } else {
            asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
            if (!asymmetricKeyParameter.isPrivate() && z10) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
        }
        this.engine.init(z10, cipherParameters);
        this.forPrivateKey = asymmetricKeyParameter.isPrivate();
        this.forEncryption = z10;
        this.blockBuffer = new byte[this.engine.getOutputBlockSize()];
        if (this.pLen > 0 && this.fallback == null && this.random == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i9) {
        return this.forEncryption ? encodeBlock(bArr, i, i9) : decodeBlock(bArr, i, i9);
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher, int i) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
        this.pLen = i;
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher, byte[] bArr) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
        this.fallback = bArr;
        this.pLen = bArr.length;
    }
}
