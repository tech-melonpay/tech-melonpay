package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StatelessProcessing;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes2.dex */
public abstract class SerpentEngineBase implements BlockCipher, StatelessProcessing {
    protected static final int BLOCK_SIZE = 16;
    static final int PHI = -1640531527;
    static final int ROUNDS = 32;
    protected boolean encrypting;
    protected int[] wKey;

    public static int rotateLeft(int i, int i9) {
        return (i >>> (-i9)) | (i << i9);
    }

    public static int rotateRight(int i, int i9) {
        return (i << (-i9)) | (i >>> i9);
    }

    public final void LT(int[] iArr) {
        int rotateLeft = rotateLeft(iArr[0], 13);
        int rotateLeft2 = rotateLeft(iArr[2], 3);
        int i = (iArr[1] ^ rotateLeft) ^ rotateLeft2;
        int i9 = (iArr[3] ^ rotateLeft2) ^ (rotateLeft << 3);
        iArr[1] = rotateLeft(i, 1);
        int rotateLeft3 = rotateLeft(i9, 7);
        iArr[3] = rotateLeft3;
        iArr[0] = rotateLeft((rotateLeft ^ iArr[1]) ^ rotateLeft3, 5);
        iArr[2] = rotateLeft((iArr[3] ^ rotateLeft2) ^ (iArr[1] << 7), 22);
    }

    public abstract void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9);

    public abstract void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9);

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    public final void ib0(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = ~i;
        int i13 = i9 ^ i;
        int i14 = (i12 | i13) ^ i11;
        int i15 = i10 ^ i14;
        int i16 = i13 ^ i15;
        iArr[2] = i16;
        int i17 = (i13 & i11) ^ i12;
        int i18 = (i16 & i17) ^ i14;
        iArr[1] = i18;
        int i19 = (i & i14) ^ (i18 | i15);
        iArr[3] = i19;
        iArr[0] = i19 ^ (i17 ^ i15);
    }

    public final void ib1(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = i11 ^ i9;
        int i13 = i ^ (i9 & i12);
        int i14 = i12 ^ i13;
        int i15 = i10 ^ i14;
        iArr[3] = i15;
        int i16 = i9 ^ (i12 & i13);
        int i17 = i13 ^ (i15 | i16);
        iArr[1] = i17;
        int i18 = ~i17;
        int i19 = i16 ^ i15;
        iArr[0] = i18 ^ i19;
        iArr[2] = (i18 | i19) ^ i14;
    }

    public final void ib2(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = i9 ^ i11;
        int i13 = ~i12;
        int i14 = i ^ i10;
        int i15 = i10 ^ i12;
        int i16 = (i9 & i15) ^ i14;
        iArr[0] = i16;
        int i17 = (((i | i13) ^ i11) | i14) ^ i12;
        iArr[3] = i17;
        int i18 = ~i15;
        int i19 = i17 | i16;
        iArr[1] = i18 ^ i19;
        iArr[2] = (i19 ^ i14) ^ (i11 & i18);
    }

    public final void ib3(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = i | i9;
        int i13 = i9 ^ i10;
        int i14 = i ^ (i9 & i13);
        int i15 = i10 ^ i14;
        int i16 = i11 | i14;
        int i17 = i13 ^ i16;
        iArr[0] = i17;
        int i18 = (i16 | i13) ^ i11;
        iArr[2] = i15 ^ i18;
        int i19 = i12 ^ i18;
        int i20 = i14 ^ (i17 & i19);
        iArr[3] = i20;
        iArr[1] = i20 ^ (i19 ^ i17);
    }

    public final void ib4(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = i9 ^ ((i10 | i11) & i);
        int i13 = i10 ^ (i & i12);
        int i14 = i11 ^ i13;
        iArr[1] = i14;
        int i15 = ~i;
        int i16 = (i13 & i14) ^ i12;
        iArr[3] = i16;
        int i17 = i11 ^ (i14 | i15);
        iArr[0] = i16 ^ i17;
        iArr[2] = (i15 ^ i14) ^ (i12 & i17);
    }

    public final void ib5(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = ~i10;
        int i13 = (i9 & i12) ^ i11;
        int i14 = i & i13;
        int i15 = (i9 ^ i12) ^ i14;
        iArr[3] = i15;
        int i16 = i15 | i9;
        iArr[1] = i13 ^ (i & i16);
        int i17 = i11 | i;
        iArr[0] = (i12 ^ i16) ^ i17;
        iArr[2] = ((i ^ i10) | i14) ^ (i9 & i17);
    }

    public final void ib6(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = ~i;
        int i13 = i ^ i9;
        int i14 = i10 ^ i13;
        int i15 = (i10 | i12) ^ i11;
        iArr[1] = i14 ^ i15;
        int i16 = i13 ^ (i14 & i15);
        int i17 = i15 ^ (i9 | i16);
        iArr[3] = i17;
        int i18 = i9 | i17;
        iArr[0] = i16 ^ i18;
        iArr[2] = (i11 & i12) ^ (i18 ^ i14);
    }

    public final void ib7(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = (i & i9) | i10;
        int i13 = (i | i9) & i11;
        int i14 = i12 ^ i13;
        iArr[3] = i14;
        int i15 = i9 ^ i13;
        int i16 = ((i14 ^ (~i11)) | i15) ^ i;
        iArr[1] = i16;
        int i17 = (i15 ^ i10) ^ (i11 | i16);
        iArr[0] = i17;
        iArr[2] = ((i & i14) ^ i17) ^ (i12 ^ i16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.encrypting = z10;
            this.wKey = makeWorkingKey(((KeyParameter) cipherParameters).getKey());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + cipherParameters.getClass().getName());
        }
    }

    public final void inverseLT(int[] iArr) {
        int rotateRight = (rotateRight(iArr[2], 22) ^ iArr[3]) ^ (iArr[1] << 7);
        int rotateRight2 = rotateRight(iArr[0], 5) ^ iArr[1];
        int i = iArr[3];
        int i9 = rotateRight2 ^ i;
        int rotateRight3 = rotateRight(i, 7);
        int rotateRight4 = rotateRight(iArr[1], 1);
        iArr[3] = (rotateRight3 ^ rotateRight) ^ (i9 << 3);
        iArr[1] = (rotateRight4 ^ i9) ^ rotateRight;
        iArr[2] = rotateRight(rotateRight, 3);
        iArr[0] = rotateRight(i9, 13);
    }

    public abstract int[] makeWorkingKey(byte[] bArr);

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (this.wKey == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i9);
            return 16;
        }
        decryptBlock(bArr, i, bArr2, i9);
        return 16;
    }

    public final void sb0(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = i ^ i11;
        int i13 = i10 ^ i12;
        int i14 = i9 ^ i13;
        int i15 = (i11 & i) ^ i14;
        iArr[3] = i15;
        int i16 = i ^ (i9 & i12);
        iArr[2] = (i10 | i16) ^ i14;
        int i17 = (i13 ^ i16) & i15;
        iArr[1] = (~i13) ^ i17;
        iArr[0] = (~i16) ^ i17;
    }

    public final void sb1(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = (~i) ^ i9;
        int i13 = (i | i12) ^ i10;
        int i14 = i11 ^ i13;
        iArr[2] = i14;
        int i15 = i9 ^ (i11 | i12);
        int i16 = i14 ^ i12;
        int i17 = (i13 & i15) ^ i16;
        iArr[3] = i17;
        int i18 = i15 ^ i13;
        iArr[1] = i17 ^ i18;
        iArr[0] = i13 ^ (i18 & i16);
    }

    public final void sb2(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = ~i;
        int i13 = i9 ^ i11;
        int i14 = (i10 & i12) ^ i13;
        iArr[0] = i14;
        int i15 = i10 ^ i12;
        int i16 = i9 & (i10 ^ i14);
        int i17 = i15 ^ i16;
        iArr[3] = i17;
        int i18 = i ^ ((i16 | i11) & (i14 | i15));
        iArr[2] = i18;
        iArr[1] = (i18 ^ (i11 | i12)) ^ (i13 ^ i17);
    }

    public final void sb3(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = i ^ i9;
        int i13 = i & i10;
        int i14 = i | i11;
        int i15 = i10 ^ i11;
        int i16 = i13 | (i12 & i14);
        int i17 = i15 ^ i16;
        iArr[2] = i17;
        int i18 = (i14 ^ i9) ^ i16;
        int i19 = i12 ^ (i15 & i18);
        iArr[0] = i19;
        int i20 = i19 & i17;
        iArr[1] = i18 ^ i20;
        iArr[3] = (i9 | i11) ^ (i15 ^ i20);
    }

    public final void sb4(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = i ^ i11;
        int i13 = i10 ^ (i11 & i12);
        int i14 = i9 | i13;
        iArr[3] = i12 ^ i14;
        int i15 = ~i9;
        int i16 = (i12 | i15) ^ i13;
        iArr[0] = i16;
        int i17 = i15 ^ i12;
        int i18 = (i14 & i17) ^ (i16 & i);
        iArr[2] = i18;
        iArr[1] = (i ^ i13) ^ (i17 & i18);
    }

    public final void sb5(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = ~i;
        int i13 = i ^ i9;
        int i14 = i ^ i11;
        int i15 = (i10 ^ i12) ^ (i13 | i14);
        iArr[0] = i15;
        int i16 = i11 & i15;
        int i17 = (i13 ^ i15) ^ i16;
        iArr[1] = i17;
        int i18 = i14 ^ (i15 | i12);
        iArr[2] = (i13 | i16) ^ i18;
        iArr[3] = (i18 & i17) ^ (i9 ^ i16);
    }

    public final void sb6(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = ~i;
        int i13 = i ^ i11;
        int i14 = i9 ^ i13;
        int i15 = i10 ^ (i12 | i13);
        int i16 = i9 ^ i15;
        iArr[1] = i16;
        int i17 = (i13 | i16) ^ i11;
        int i18 = (i15 & i17) ^ i14;
        iArr[2] = i18;
        int i19 = i17 ^ i15;
        iArr[0] = i18 ^ i19;
        iArr[3] = (i19 & i14) ^ (~i15);
    }

    public final void sb7(int[] iArr, int i, int i9, int i10, int i11) {
        int i12 = i9 ^ i10;
        int i13 = (i10 & i12) ^ i11;
        int i14 = i ^ i13;
        int i15 = i9 ^ ((i11 | i12) & i14);
        iArr[1] = i15;
        int i16 = (i & i14) ^ i12;
        iArr[3] = i16;
        int i17 = (i15 | i13) ^ i14;
        int i18 = i13 ^ (i16 & i17);
        iArr[2] = i18;
        iArr[0] = (i16 & i18) ^ (~i17);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
