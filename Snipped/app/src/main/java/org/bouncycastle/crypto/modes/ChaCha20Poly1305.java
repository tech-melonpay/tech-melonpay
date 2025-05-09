package org.bouncycastle.crypto.modes;

import com.google.android.gms.measurement.internal.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class ChaCha20Poly1305 implements AEADCipher {
    private static final long AAD_LIMIT = -1;
    private static final int BUF_SIZE = 64;
    private static final long DATA_LIMIT = 274877906880L;
    private static final int KEY_SIZE = 32;
    private static final int MAC_SIZE = 16;
    private static final int NONCE_SIZE = 12;
    private static final byte[] ZEROES = new byte[15];
    private long aadCount;
    private final byte[] buf;
    private int bufPos;
    private final ChaCha7539Engine chacha20;
    private long dataCount;
    private byte[] initialAAD;
    private final byte[] key;
    private final byte[] mac;
    private final byte[] nonce;
    private final Mac poly1305;
    private int state;

    public static final class State {
        static final int DEC_AAD = 6;
        static final int DEC_DATA = 7;
        static final int DEC_FINAL = 8;
        static final int DEC_INIT = 5;
        static final int ENC_AAD = 2;
        static final int ENC_DATA = 3;
        static final int ENC_FINAL = 4;
        static final int ENC_INIT = 1;
        static final int UNINITIALIZED = 0;

        private State() {
        }
    }

    public ChaCha20Poly1305() {
        this(new Poly1305());
    }

    private void checkAAD() {
        int i = this.state;
        int i9 = 2;
        if (i != 1) {
            if (i == 2) {
                return;
            }
            if (i == 4) {
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            }
            i9 = 6;
            if (i != 5) {
                if (i != 6) {
                    throw new IllegalStateException();
                }
                return;
            }
        }
        this.state = i9;
    }

    private void checkData() {
        int i;
        switch (this.state) {
            case 1:
            case 2:
                i = 3;
                break;
            case 3:
            case 7:
                return;
            case 4:
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            case 5:
            case 6:
                i = 7;
                break;
            default:
                throw new IllegalStateException();
        }
        finishAAD(i);
    }

    private void finishAAD(int i) {
        padMAC(this.aadCount);
        this.state = i;
    }

    private void finishData(int i) {
        padMAC(this.dataCount);
        byte[] bArr = new byte[16];
        Pack.longToLittleEndian(this.aadCount, bArr, 0);
        Pack.longToLittleEndian(this.dataCount, bArr, 8);
        this.poly1305.update(bArr, 0, 16);
        this.poly1305.doFinal(this.mac, 0);
        this.state = i;
    }

    private long incrementCount(long j10, int i, long j11) {
        long j12 = i;
        if (j10 - Long.MIN_VALUE <= (j11 - j12) - Long.MIN_VALUE) {
            return j10 + j12;
        }
        throw new IllegalStateException("Limit exceeded");
    }

    private void initMAC() {
        byte[] bArr = new byte[64];
        try {
            this.chacha20.processBytes(bArr, 0, 64, bArr, 0);
            this.poly1305.init(new KeyParameter(bArr, 0, 32));
        } finally {
            Arrays.clear(bArr);
        }
    }

    private void padMAC(long j10) {
        int i = ((int) j10) & 15;
        if (i != 0) {
            this.poly1305.update(ZEROES, 0, 16 - i);
        }
    }

    private void processData(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        if (i10 > bArr2.length - i9) {
            throw new OutputLengthException("Output buffer too short");
        }
        this.chacha20.processBytes(bArr, i, i9, bArr2, i10);
        this.dataCount = incrementCount(this.dataCount, i9, DATA_LIMIT);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) {
        int i9;
        if (bArr == null) {
            throw new NullPointerException("'out' cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("'outOff' cannot be negative");
        }
        checkData();
        Arrays.clear(this.mac);
        int i10 = this.state;
        if (i10 == 3) {
            int i11 = this.bufPos;
            i9 = i11 + 16;
            if (i > bArr.length - i9) {
                throw new OutputLengthException("Output buffer too short");
            }
            if (i11 > 0) {
                processData(this.buf, 0, i11, bArr, i);
                this.poly1305.update(bArr, i, this.bufPos);
            }
            finishData(4);
            System.arraycopy(this.mac, 0, bArr, i + this.bufPos, 16);
        } else {
            if (i10 != 7) {
                throw new IllegalStateException();
            }
            int i12 = this.bufPos;
            if (i12 < 16) {
                throw new InvalidCipherTextException("data too short");
            }
            i9 = i12 - 16;
            if (i > bArr.length - i9) {
                throw new OutputLengthException("Output buffer too short");
            }
            if (i9 > 0) {
                this.poly1305.update(this.buf, 0, i9);
                processData(this.buf, 0, i9, bArr, i);
            }
            finishData(8);
            if (!Arrays.constantTimeAreEqual(16, this.mac, 0, this.buf, i9)) {
                throw new InvalidCipherTextException("mac check in ChaCha20Poly1305 failed");
            }
        }
        reset(false, true);
        return i9;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int max = Math.max(0, i) + this.bufPos;
        int i9 = this.state;
        if (i9 == 1 || i9 == 2 || i9 == 3) {
            return max + 16;
        }
        if (i9 == 5 || i9 == 6 || i9 == 7) {
            return Math.max(0, max - 16);
        }
        throw new IllegalStateException();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int max = Math.max(0, i) + this.bufPos;
        int i9 = this.state;
        if (i9 != 1 && i9 != 2 && i9 != 3) {
            if (i9 != 5 && i9 != 6 && i9 != 7) {
                throw new IllegalStateException();
            }
            max = Math.max(0, max - 16);
        }
        return max - (max % 64);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        ParametersWithIV parametersWithIV;
        KeyParameter keyParameter;
        byte[] iv;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            int macSize = aEADParameters.getMacSize();
            if (128 != macSize) {
                throw new IllegalArgumentException(a.g(macSize, "Invalid value for MAC size: "));
            }
            keyParameter = aEADParameters.getKey();
            iv = aEADParameters.getNonce();
            parametersWithIV = new ParametersWithIV(keyParameter, iv);
            this.initialAAD = aEADParameters.getAssociatedText();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to ChaCha20Poly1305");
            }
            parametersWithIV = (ParametersWithIV) cipherParameters;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
            iv = parametersWithIV.getIV();
            this.initialAAD = null;
        }
        if (keyParameter == null) {
            if (this.state == 0) {
                throw new IllegalArgumentException("Key must be specified in initial init");
            }
        } else if (32 != keyParameter.getKey().length) {
            throw new IllegalArgumentException("Key must be 256 bits");
        }
        if (iv == null || 12 != iv.length) {
            throw new IllegalArgumentException("Nonce must be 96 bits");
        }
        if (this.state != 0 && z10 && Arrays.areEqual(this.nonce, iv) && (keyParameter == null || Arrays.areEqual(this.key, keyParameter.getKey()))) {
            throw new IllegalArgumentException("cannot reuse nonce for ChaCha20Poly1305 encryption");
        }
        if (keyParameter != null) {
            System.arraycopy(keyParameter.getKey(), 0, this.key, 0, 32);
        }
        System.arraycopy(iv, 0, this.nonce, 0, 12);
        this.chacha20.init(true, parametersWithIV);
        this.state = z10 ? 1 : 5;
        reset(true, false);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b9) {
        checkAAD();
        this.aadCount = incrementCount(this.aadCount, 1, -1L);
        this.poly1305.update(b9);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i9) {
        if (bArr == null) {
            throw new NullPointerException("'in' cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("'inOff' cannot be negative");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        if (i > bArr.length - i9) {
            throw new DataLengthException("Input buffer too short");
        }
        checkAAD();
        if (i9 > 0) {
            this.aadCount = incrementCount(this.aadCount, i9, -1L);
            this.poly1305.update(bArr, i, i9);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b9, byte[] bArr, int i) {
        checkData();
        int i9 = this.state;
        if (i9 == 3) {
            byte[] bArr2 = this.buf;
            int i10 = this.bufPos;
            bArr2[i10] = b9;
            int i11 = i10 + 1;
            this.bufPos = i11;
            if (i11 != 64) {
                return 0;
            }
            processData(bArr2, 0, 64, bArr, i);
            this.poly1305.update(bArr, i, 64);
            this.bufPos = 0;
            return 64;
        }
        if (i9 != 7) {
            throw new IllegalStateException();
        }
        byte[] bArr3 = this.buf;
        int i12 = this.bufPos;
        bArr3[i12] = b9;
        int i13 = i12 + 1;
        this.bufPos = i13;
        if (i13 != bArr3.length) {
            return 0;
        }
        this.poly1305.update(bArr3, 0, 64);
        processData(this.buf, 0, 64, bArr, i);
        byte[] bArr4 = this.buf;
        System.arraycopy(bArr4, 64, bArr4, 0, 16);
        this.bufPos = 16;
        return 64;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        int i11;
        int i12 = i;
        int i13 = i9;
        if (bArr == null) {
            throw new NullPointerException("'in' cannot be null");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("'inOff' cannot be negative");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        if (i12 > bArr.length - i13) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("'outOff' cannot be negative");
        }
        checkData();
        int i14 = this.state;
        if (i14 == 3) {
            if (this.bufPos != 0) {
                while (i13 > 0) {
                    i13--;
                    byte[] bArr3 = this.buf;
                    int i15 = this.bufPos;
                    int i16 = i12 + 1;
                    bArr3[i15] = bArr[i12];
                    int i17 = i15 + 1;
                    this.bufPos = i17;
                    if (i17 == 64) {
                        processData(bArr3, 0, 64, bArr2, i10);
                        this.poly1305.update(bArr2, i10, 64);
                        this.bufPos = 0;
                        i11 = 64;
                        i12 = i16;
                        break;
                    }
                    i12 = i16;
                }
            }
            i11 = 0;
            while (i13 >= 64) {
                int i18 = i10 + i11;
                processData(bArr, i12, 64, bArr2, i18);
                this.poly1305.update(bArr2, i18, 64);
                i12 += 64;
                i13 -= 64;
                i11 += 64;
            }
            if (i13 > 0) {
                System.arraycopy(bArr, i12, this.buf, 0, i13);
                this.bufPos = i13;
            }
        } else {
            if (i14 != 7) {
                throw new IllegalStateException();
            }
            i11 = 0;
            for (int i19 = 0; i19 < i13; i19++) {
                byte[] bArr4 = this.buf;
                int i20 = this.bufPos;
                bArr4[i20] = bArr[i12 + i19];
                int i21 = i20 + 1;
                this.bufPos = i21;
                if (i21 == bArr4.length) {
                    this.poly1305.update(bArr4, 0, 64);
                    processData(this.buf, 0, 64, bArr2, i10 + i11);
                    byte[] bArr5 = this.buf;
                    System.arraycopy(bArr5, 64, bArr5, 0, 16);
                    this.bufPos = 16;
                    i11 += 64;
                }
            }
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true, true);
    }

    public ChaCha20Poly1305(Mac mac) {
        this.key = new byte[32];
        this.nonce = new byte[12];
        this.buf = new byte[80];
        this.mac = new byte[16];
        this.state = 0;
        if (mac == null) {
            throw new NullPointerException("'poly1305' cannot be null");
        }
        if (16 != mac.getMacSize()) {
            throw new IllegalArgumentException("'poly1305' must be a 128-bit MAC");
        }
        this.chacha20 = new ChaCha7539Engine();
        this.poly1305 = mac;
    }

    private void reset(boolean z10, boolean z11) {
        Arrays.clear(this.buf);
        if (z10) {
            Arrays.clear(this.mac);
        }
        this.aadCount = 0L;
        this.dataCount = 0L;
        this.bufPos = 0;
        switch (this.state) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.state = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.state = 5;
                break;
            default:
                throw new IllegalStateException();
        }
        if (z11) {
            this.chacha20.reset();
        }
        initMAC();
        byte[] bArr = this.initialAAD;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
