package org.bouncycastle.crypto.modes;

import com.google.android.gms.measurement.internal.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.gcm.BasicGCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.modes.gcm.GCMUtil;
import org.bouncycastle.crypto.modes.gcm.Tables4kGCMMultiplier;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class GCMBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: H, reason: collision with root package name */
    private byte[] f25046H;

    /* renamed from: J0, reason: collision with root package name */
    private byte[] f25047J0;
    private byte[] S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private int blocksRemaining;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private GCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private boolean initialised;
    private byte[] lastKey;
    private byte[] macBlock;
    private int macSize;
    private GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;

    public GCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, null);
    }

    private void checkStatus() {
        if (this.initialised) {
            return;
        }
        if (!this.forEncryption) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    private void gHASH(byte[] bArr, byte[] bArr2, int i) {
        for (int i9 = 0; i9 < i; i9 += 16) {
            gHASHPartial(bArr, bArr2, i9, Math.min(i - i9, 16));
        }
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2) {
        GCMUtil.xor(bArr, bArr2);
        this.multiplier.multiplyH(bArr);
    }

    private void gHASHPartial(byte[] bArr, byte[] bArr2, int i, int i9) {
        GCMUtil.xor(bArr, bArr2, i, i9);
        this.multiplier.multiplyH(bArr);
    }

    private void getNextCTRBlock(byte[] bArr) {
        int i = this.blocksRemaining;
        if (i == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.blocksRemaining = i - 1;
        byte[] bArr2 = this.counter;
        int i9 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i9;
        int i10 = (i9 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i10;
        int i11 = (i10 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i11;
        bArr2[12] = (byte) ((i11 >>> 8) + (bArr2[12] & 255));
        this.cipher.processBlock(bArr2, 0, bArr, 0);
    }

    private void initCipher() {
        if (this.atLength > 0) {
            System.arraycopy(this.S_at, 0, this.S_atPre, 0, 16);
            this.atLengthPre = this.atLength;
        }
        int i = this.atBlockPos;
        if (i > 0) {
            gHASHPartial(this.S_atPre, this.atBlock, 0, i);
            this.atLengthPre += this.atBlockPos;
        }
        if (this.atLengthPre > 0) {
            System.arraycopy(this.S_atPre, 0, this.S, 0, 16);
        }
    }

    private void processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (bArr2.length - i9 < 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.totalLength == 0) {
            initCipher();
        }
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        if (this.forEncryption) {
            GCMUtil.xor(bArr3, bArr, i);
            gHASHBlock(this.S, bArr3);
            System.arraycopy(bArr3, 0, bArr2, i9, 16);
        } else {
            gHASHBlock(this.S, bArr, i);
            GCMUtil.xor(bArr3, 0, bArr, i, bArr2, i9);
        }
        this.totalLength += 16;
    }

    private void processPartial(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        if (this.forEncryption) {
            GCMUtil.xor(bArr, i, bArr3, 0, i9);
            gHASHPartial(this.S, bArr, i, i9);
        } else {
            gHASHPartial(this.S, bArr, i, i9);
            GCMUtil.xor(bArr, i, bArr3, 0, i9);
        }
        System.arraycopy(bArr, i, bArr2, i10, i9);
        this.totalLength += i9;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) {
        checkStatus();
        if (this.totalLength == 0) {
            initCipher();
        }
        int i9 = this.bufOff;
        if (!this.forEncryption) {
            int i10 = this.macSize;
            if (i9 < i10) {
                throw new InvalidCipherTextException("data too short");
            }
            i9 -= i10;
            if (bArr.length - i < i9) {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (bArr.length - i < this.macSize + i9) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i9 > 0) {
            processPartial(this.bufBlock, 0, i9, bArr, i);
        }
        long j10 = this.atLength;
        int i11 = this.atBlockPos;
        long j11 = j10 + i11;
        this.atLength = j11;
        if (j11 > this.atLengthPre) {
            if (i11 > 0) {
                gHASHPartial(this.S_at, this.atBlock, 0, i11);
            }
            if (this.atLengthPre > 0) {
                GCMUtil.xor(this.S_at, this.S_atPre);
            }
            long j12 = ((this.totalLength * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.exp == null) {
                BasicGCMExponentiator basicGCMExponentiator = new BasicGCMExponentiator();
                this.exp = basicGCMExponentiator;
                basicGCMExponentiator.init(this.f25046H);
            }
            this.exp.exponentiateX(j12, bArr2);
            GCMUtil.multiply(this.S_at, bArr2);
            GCMUtil.xor(this.S, this.S_at);
        }
        byte[] bArr3 = new byte[16];
        Pack.longToBigEndian(this.atLength * 8, bArr3, 0);
        Pack.longToBigEndian(this.totalLength * 8, bArr3, 8);
        gHASHBlock(this.S, bArr3);
        byte[] bArr4 = new byte[16];
        this.cipher.processBlock(this.f25047J0, 0, bArr4, 0);
        GCMUtil.xor(bArr4, this.S);
        int i12 = this.macSize;
        byte[] bArr5 = new byte[i12];
        this.macBlock = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i12);
        if (this.forEncryption) {
            System.arraycopy(this.macBlock, 0, bArr, i + this.bufOff, this.macSize);
            i9 += this.macSize;
        } else {
            int i13 = this.macSize;
            byte[] bArr6 = new byte[i13];
            System.arraycopy(this.bufBlock, i9, bArr6, 0, i13);
            if (!Arrays.constantTimeAreEqual(this.macBlock, bArr6)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        reset(false);
        return i9;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.macSize] : Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int i9 = i + this.bufOff;
        if (this.forEncryption) {
            return i9 + this.macSize;
        }
        int i10 = this.macSize;
        if (i9 < i10) {
            return 0;
        }
        return i9 - i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int i9 = i + this.bufOff;
        if (!this.forEncryption) {
            int i10 = this.macSize;
            if (i9 < i10) {
                return 0;
            }
            i9 -= i10;
        }
        return i9 - (i9 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        byte[] iv;
        KeyParameter keyParameter;
        byte[] bArr;
        this.forEncryption = z10;
        this.macBlock = null;
        this.initialised = true;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 32 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException(a.g(macSize, "Invalid value for MAC size: "));
            }
            this.macSize = macSize / 8;
            keyParameter = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
        }
        this.bufBlock = new byte[z10 ? 16 : this.macSize + 16];
        if (iv == null || iv.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z10 && (bArr = this.nonce) != null && Arrays.areEqual(bArr, iv)) {
            if (keyParameter == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.lastKey;
            if (bArr2 != null && Arrays.areEqual(bArr2, keyParameter.getKey())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.nonce = iv;
        if (keyParameter != null) {
            this.lastKey = keyParameter.getKey();
        }
        if (keyParameter != null) {
            this.cipher.init(true, keyParameter);
            byte[] bArr3 = new byte[16];
            this.f25046H = bArr3;
            this.cipher.processBlock(bArr3, 0, bArr3, 0);
            this.multiplier.init(this.f25046H);
            this.exp = null;
        } else if (this.f25046H == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.f25047J0 = bArr4;
        byte[] bArr5 = this.nonce;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.f25047J0[15] = 1;
        } else {
            gHASH(bArr4, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            Pack.longToBigEndian(this.nonce.length * 8, bArr6, 8);
            gHASHBlock(this.f25047J0, bArr6);
        }
        this.S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.f25047J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr7 = this.initialAssociatedText;
        if (bArr7 != null) {
            processAADBytes(bArr7, 0, bArr7.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b9) {
        checkStatus();
        byte[] bArr = this.atBlock;
        int i = this.atBlockPos;
        bArr[i] = b9;
        int i9 = i + 1;
        this.atBlockPos = i9;
        if (i9 == 16) {
            gHASHBlock(this.S_at, bArr);
            this.atBlockPos = 0;
            this.atLength += 16;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i9) {
        checkStatus();
        for (int i10 = 0; i10 < i9; i10++) {
            byte[] bArr2 = this.atBlock;
            int i11 = this.atBlockPos;
            bArr2[i11] = bArr[i + i10];
            int i12 = i11 + 1;
            this.atBlockPos = i12;
            if (i12 == 16) {
                gHASHBlock(this.S_at, bArr2);
                this.atBlockPos = 0;
                this.atLength += 16;
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b9, byte[] bArr, int i) {
        checkStatus();
        byte[] bArr2 = this.bufBlock;
        int i9 = this.bufOff;
        bArr2[i9] = b9;
        int i10 = i9 + 1;
        this.bufOff = i10;
        if (i10 != bArr2.length) {
            return 0;
        }
        processBlock(bArr2, 0, bArr, i);
        if (this.forEncryption) {
            this.bufOff = 0;
        } else {
            byte[] bArr3 = this.bufBlock;
            System.arraycopy(bArr3, 16, bArr3, 0, this.macSize);
            this.bufOff = this.macSize;
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        int i11;
        checkStatus();
        if (bArr.length - i < i9) {
            throw new DataLengthException("Input buffer too short");
        }
        if (this.forEncryption) {
            if (this.bufOff != 0) {
                while (i9 > 0) {
                    i9--;
                    byte[] bArr3 = this.bufBlock;
                    int i12 = this.bufOff;
                    int i13 = i + 1;
                    bArr3[i12] = bArr[i];
                    int i14 = i12 + 1;
                    this.bufOff = i14;
                    if (i14 == 16) {
                        processBlock(bArr3, 0, bArr2, i10);
                        this.bufOff = 0;
                        i11 = 16;
                        i = i13;
                        break;
                    }
                    i = i13;
                }
            }
            i11 = 0;
            while (i9 >= 16) {
                processBlock(bArr, i, bArr2, i10 + i11);
                i += 16;
                i9 -= 16;
                i11 += 16;
            }
            if (i9 > 0) {
                System.arraycopy(bArr, i, this.bufBlock, 0, i9);
                this.bufOff = i9;
            }
        } else {
            i11 = 0;
            for (int i15 = 0; i15 < i9; i15++) {
                byte[] bArr4 = this.bufBlock;
                int i16 = this.bufOff;
                bArr4[i16] = bArr[i + i15];
                int i17 = i16 + 1;
                this.bufOff = i17;
                if (i17 == bArr4.length) {
                    processBlock(bArr4, 0, bArr2, i10 + i11);
                    byte[] bArr5 = this.bufBlock;
                    System.arraycopy(bArr5, 16, bArr5, 0, this.macSize);
                    this.bufOff = this.macSize;
                    i11 += 16;
                }
            }
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    public GCMBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        gCMMultiplier = gCMMultiplier == null ? new Tables4kGCMMultiplier() : gCMMultiplier;
        this.cipher = blockCipher;
        this.multiplier = gCMMultiplier;
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2, int i) {
        GCMUtil.xor(bArr, bArr2, i);
        this.multiplier.multiplyH(bArr);
    }

    private void reset(boolean z10) {
        this.cipher.reset();
        this.S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.f25047J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr = this.bufBlock;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z10) {
            this.macBlock = null;
        }
        if (this.forEncryption) {
            this.initialised = false;
            return;
        }
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }
}
