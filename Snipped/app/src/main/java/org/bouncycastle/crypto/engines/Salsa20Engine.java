package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
public class Salsa20Engine implements SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;
    private static final int STATE_SIZE = 16;
    private static final int[] TAU_SIGMA = Pack.littleEndianToInt(Strings.toByteArray("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
    protected static final byte[] tau = Strings.toByteArray("expand 16-byte k");
    private int cW0;
    private int cW1;
    private int cW2;
    protected int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    protected int rounds;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f24980x;

    public Salsa20Engine() {
        this(20);
    }

    private boolean limitExceeded() {
        int i = this.cW0 + 1;
        this.cW0 = i;
        if (i == 0) {
            int i9 = this.cW1 + 1;
            this.cW1 = i9;
            if (i9 == 0) {
                int i10 = this.cW2 + 1;
                this.cW2 = i10;
                return (i10 & 32) != 0;
            }
        }
        return false;
    }

    private void resetLimitCounter() {
        this.cW0 = 0;
        this.cW1 = 0;
        this.cW2 = 0;
    }

    public static void salsaCore(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        boolean z10 = false;
        int i9 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = 7;
        int i17 = iArr[7];
        int i18 = iArr[8];
        int i19 = 9;
        int i20 = iArr[9];
        int i21 = iArr[10];
        int i22 = iArr[11];
        int i23 = iArr[12];
        int i24 = 13;
        int i25 = iArr[13];
        int i26 = iArr[14];
        int i27 = iArr[15];
        int i28 = i26;
        int i29 = i25;
        int i30 = i23;
        int i31 = i22;
        int i32 = i21;
        int i33 = i20;
        int i34 = i18;
        int i35 = i17;
        int i36 = i15;
        int i37 = i14;
        int i38 = i13;
        int i39 = i12;
        int i40 = i11;
        int i41 = i10;
        int i42 = i9;
        int i43 = i;
        while (i43 > 0) {
            int rotateLeft = Integers.rotateLeft(i42 + i30, i16) ^ i38;
            int rotateLeft2 = i34 ^ Integers.rotateLeft(rotateLeft + i42, i19);
            int rotateLeft3 = i30 ^ Integers.rotateLeft(rotateLeft2 + rotateLeft, i24);
            int rotateLeft4 = Integers.rotateLeft(rotateLeft3 + rotateLeft2, 18) ^ i42;
            int rotateLeft5 = i33 ^ Integers.rotateLeft(i37 + i41, i16);
            int rotateLeft6 = i29 ^ Integers.rotateLeft(rotateLeft5 + i37, i19);
            int rotateLeft7 = i41 ^ Integers.rotateLeft(rotateLeft6 + rotateLeft5, i24);
            int rotateLeft8 = Integers.rotateLeft(rotateLeft7 + rotateLeft6, 18) ^ i37;
            int rotateLeft9 = i28 ^ Integers.rotateLeft(i32 + i36, 7);
            int rotateLeft10 = i40 ^ Integers.rotateLeft(rotateLeft9 + i32, 9);
            int rotateLeft11 = i36 ^ Integers.rotateLeft(rotateLeft10 + rotateLeft9, 13);
            int rotateLeft12 = i32 ^ Integers.rotateLeft(rotateLeft11 + rotateLeft10, 18);
            int rotateLeft13 = i39 ^ Integers.rotateLeft(i27 + i31, 7);
            int rotateLeft14 = i35 ^ Integers.rotateLeft(rotateLeft13 + i27, 9);
            int i44 = i43;
            int rotateLeft15 = i31 ^ Integers.rotateLeft(rotateLeft14 + rotateLeft13, 13);
            int rotateLeft16 = i27 ^ Integers.rotateLeft(rotateLeft15 + rotateLeft14, 18);
            i41 = rotateLeft7 ^ Integers.rotateLeft(rotateLeft4 + rotateLeft13, 7);
            i40 = rotateLeft10 ^ Integers.rotateLeft(i41 + rotateLeft4, 9);
            int rotateLeft17 = rotateLeft13 ^ Integers.rotateLeft(i40 + i41, 13);
            int rotateLeft18 = rotateLeft4 ^ Integers.rotateLeft(rotateLeft17 + i40, 18);
            i36 = rotateLeft11 ^ Integers.rotateLeft(rotateLeft8 + rotateLeft, 7);
            i35 = rotateLeft14 ^ Integers.rotateLeft(i36 + rotateLeft8, 9);
            int rotateLeft19 = Integers.rotateLeft(i35 + i36, 13) ^ rotateLeft;
            i37 = rotateLeft8 ^ Integers.rotateLeft(rotateLeft19 + i35, 18);
            i31 = rotateLeft15 ^ Integers.rotateLeft(rotateLeft12 + rotateLeft5, 7);
            int rotateLeft20 = Integers.rotateLeft(i31 + rotateLeft12, 9) ^ rotateLeft2;
            i33 = rotateLeft5 ^ Integers.rotateLeft(rotateLeft20 + i31, 13);
            i32 = rotateLeft12 ^ Integers.rotateLeft(i33 + rotateLeft20, 18);
            i30 = rotateLeft3 ^ Integers.rotateLeft(rotateLeft16 + rotateLeft9, 7);
            i29 = rotateLeft6 ^ Integers.rotateLeft(i30 + rotateLeft16, 9);
            i28 = rotateLeft9 ^ Integers.rotateLeft(i29 + i30, 13);
            i27 = rotateLeft16 ^ Integers.rotateLeft(i28 + i29, 18);
            i39 = rotateLeft17;
            i34 = rotateLeft20;
            i42 = rotateLeft18;
            i38 = rotateLeft19;
            z10 = false;
            i24 = 13;
            i19 = 9;
            i16 = 7;
            i43 = i44 - 2;
        }
        boolean z11 = z10;
        iArr2[z11 ? 1 : 0] = i42 + iArr[z11 ? 1 : 0];
        iArr2[1] = i41 + iArr[1];
        iArr2[2] = i40 + iArr[2];
        iArr2[3] = i39 + iArr[3];
        iArr2[4] = i38 + iArr[4];
        iArr2[5] = i37 + iArr[5];
        iArr2[6] = i36 + iArr[6];
        iArr2[7] = i35 + iArr[7];
        iArr2[8] = i34 + iArr[8];
        iArr2[9] = i33 + iArr[9];
        iArr2[10] = i32 + iArr[10];
        iArr2[11] = i31 + iArr[11];
        iArr2[12] = i30 + iArr[12];
        iArr2[13] = i29 + iArr[13];
        iArr2[14] = i28 + iArr[14];
        iArr2[15] = i27 + iArr[15];
    }

    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.f24980x);
        Pack.intToLittleEndian(this.f24980x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        if (this.rounds == 20) {
            return "Salsa20";
        }
        return "Salsa20/" + this.rounds;
    }

    public long getCounter() {
        int[] iArr = this.engineState;
        return (iArr[9] << 32) | (iArr[8] & BodyPartID.bodyIdMax);
    }

    public int getNonceSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + this.index;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != getNonceSize()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + getNonceSize() + " bytes of IV");
        }
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters == null) {
            if (!this.initialised) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            setKey(null, iv);
        } else {
            if (!(parameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            setKey(((KeyParameter) parameters).getKey(), iv);
        }
        reset();
        this.initialised = true;
    }

    public void packTauOrSigma(int i, int[] iArr, int i9) {
        int i10 = (i - 16) / 4;
        int[] iArr2 = TAU_SIGMA;
        iArr[i9] = iArr2[i10];
        iArr[i9 + 1] = iArr2[i10 + 1];
        iArr[i9 + 2] = iArr2[i10 + 2];
        iArr[i9 + 3] = iArr2[i10 + 3];
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
        if (limitExceeded(i9)) {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int i11 = 0; i11 < i9; i11++) {
            byte[] bArr3 = this.keyStream;
            int i12 = this.index;
            bArr2[i11 + i10] = (byte) (bArr3[i12] ^ bArr[i11 + i]);
            int i13 = (i12 + 1) & 63;
            this.index = i13;
            if (i13 == 0) {
                advanceCounter();
                generateKeyStream(this.keyStream);
            }
        }
        return i9;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 0;
        resetLimitCounter();
        resetCounter();
        generateKeyStream(this.keyStream);
    }

    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i = iArr[8];
        if (i == 0 && iArr[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i9 = i - 1;
        iArr[8] = i9;
        if (i9 == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b9) {
        if (limitExceeded()) {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        byte[] bArr = this.keyStream;
        int i = this.index;
        byte b10 = (byte) (b9 ^ bArr[i]);
        int i9 = (i + 1) & 63;
        this.index = i9;
        if (i9 == 0) {
            advanceCounter();
            generateKeyStream(this.keyStream);
        }
        return b10;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j10) {
        reset();
        return skip(j10);
    }

    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.engineState;
            int[] iArr2 = TAU_SIGMA;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            Pack.littleEndianToInt(bArr, 0, iArr, 1, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 11, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 6, 2);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j10) {
        long j11;
        if (j10 >= 0) {
            if (j10 >= 64) {
                long j12 = j10 / 64;
                advanceCounter(j12);
                j11 = j10 - (j12 * 64);
            } else {
                j11 = j10;
            }
            int i = this.index;
            int i9 = (((int) j11) + i) & 63;
            this.index = i9;
            if (i9 < i) {
                advanceCounter();
            }
        } else {
            long j13 = -j10;
            if (j13 >= 64) {
                long j14 = j13 / 64;
                retreatCounter(j14);
                j13 -= j14 * 64;
            }
            for (long j15 = 0; j15 < j13; j15++) {
                if (this.index == 0) {
                    retreatCounter();
                }
                this.index = (this.index - 1) & 63;
            }
        }
        generateKeyStream(this.keyStream);
        return j10;
    }

    public Salsa20Engine(int i) {
        this.index = 0;
        this.engineState = new int[16];
        this.f24980x = new int[16];
        this.keyStream = new byte[64];
        this.initialised = false;
        if (i <= 0 || (i & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.rounds = i;
    }

    private boolean limitExceeded(int i) {
        int i9 = this.cW0 + i;
        this.cW0 = i9;
        if (i9 >= i || i9 < 0) {
            return false;
        }
        int i10 = this.cW1 + 1;
        this.cW1 = i10;
        if (i10 != 0) {
            return false;
        }
        int i11 = this.cW2 + 1;
        this.cW2 = i11;
        return (i11 & 32) != 0;
    }

    public void advanceCounter(long j10) {
        int i = (int) (j10 >>> 32);
        int i9 = (int) j10;
        if (i > 0) {
            int[] iArr = this.engineState;
            iArr[9] = iArr[9] + i;
        }
        int[] iArr2 = this.engineState;
        int i10 = iArr2[8];
        int i11 = i9 + i10;
        iArr2[8] = i11;
        if (i10 == 0 || i11 >= i10) {
            return;
        }
        iArr2[9] = iArr2[9] + 1;
    }

    public void retreatCounter(long j10) {
        int i = (int) (j10 >>> 32);
        int i9 = (int) j10;
        if (i != 0) {
            int[] iArr = this.engineState;
            int i10 = iArr[9];
            if ((i10 & BodyPartID.bodyIdMax) < (i & BodyPartID.bodyIdMax)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[9] = i10 - i;
        }
        int[] iArr2 = this.engineState;
        int i11 = iArr2[8];
        if ((i11 & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & i9)) {
            iArr2[8] = i11 - i9;
            return;
        }
        int i12 = iArr2[9];
        if (i12 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[9] = i12 - 1;
        iArr2[8] = i11 - i9;
    }
}
