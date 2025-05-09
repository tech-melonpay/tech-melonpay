package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes2.dex */
public class Shacal2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 32;

    /* renamed from: K, reason: collision with root package name */
    private static final int[] f24981K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private static final int ROUNDS = 64;
    private boolean forEncryption = false;
    private int[] workingKey = null;

    private void byteBlockToInts(byte[] bArr, int[] iArr, int i, int i9) {
        while (i9 < 8) {
            int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i11 = i + 3;
            int i12 = ((bArr[i + 2] & 255) << 8) | i10;
            i += 4;
            iArr[i9] = i12 | (bArr[i11] & 255);
            i9++;
        }
    }

    private void bytes2ints(byte[] bArr, int[] iArr, int i, int i9) {
        while (i9 < bArr.length / 4) {
            int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i11 = i + 3;
            int i12 = i10 | ((bArr[i + 2] & 255) << 8);
            i += 4;
            iArr[i9] = i12 | (bArr[i11] & 255);
            i9++;
        }
    }

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int[] iArr = new int[8];
        byteBlockToInts(bArr, iArr, i, 0);
        for (int i10 = 63; i10 > -1; i10--) {
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            int i15 = (i11 - ((((i12 >>> 2) | (i12 << (-2))) ^ ((i12 >>> 13) | (i12 << (-13)))) ^ ((i12 >>> 22) | (i12 << (-22))))) - (((i12 & i13) ^ (i12 & i14)) ^ (i13 & i14));
            iArr[0] = i12;
            iArr[1] = i13;
            iArr[2] = i14;
            iArr[3] = iArr[4] - i15;
            int i16 = iArr[5];
            iArr[4] = i16;
            int i17 = iArr[6];
            iArr[5] = i17;
            int i18 = iArr[7];
            iArr[6] = i18;
            iArr[7] = (((i15 - f24981K[i10]) - this.workingKey[i10]) - ((((i16 >>> 6) | (i16 << (-6))) ^ ((i16 >>> 11) | (i16 << (-11)))) ^ ((i16 >>> 25) | (i16 << (-25))))) - ((i16 & i17) ^ ((~i16) & i18));
        }
        ints2bytes(iArr, bArr2, i9);
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int[] iArr = new int[8];
        byteBlockToInts(bArr, iArr, i, 0);
        for (int i10 = 0; i10 < 64; i10++) {
            int i11 = iArr[4];
            int i12 = iArr[5];
            int i13 = ~i11;
            int i14 = iArr[6];
            int i15 = ((((i11 >>> 6) | (i11 << (-6))) ^ ((i11 >>> 11) | (i11 << (-11)))) ^ ((i11 >>> 25) | (i11 << (-25)))) + ((i11 & i12) ^ (i13 & i14)) + iArr[7] + f24981K[i10] + this.workingKey[i10];
            iArr[7] = i14;
            iArr[6] = i12;
            iArr[5] = i11;
            iArr[4] = iArr[3] + i15;
            int i16 = iArr[2];
            iArr[3] = i16;
            int i17 = iArr[1];
            iArr[2] = i17;
            int i18 = iArr[0];
            iArr[1] = i18;
            iArr[0] = i15 + ((((i18 >>> 2) | (i18 << (-2))) ^ ((i18 >>> 13) | (i18 << (-13)))) ^ ((i18 >>> 22) | (i18 << (-22)))) + (((i18 & i16) ^ (i18 & i17)) ^ (i17 & i16));
        }
        ints2bytes(iArr, bArr2, i9);
    }

    private void ints2bytes(int[] iArr, byte[] bArr, int i) {
        for (int i9 : iArr) {
            bArr[i] = (byte) (i9 >>> 24);
            bArr[i + 1] = (byte) (i9 >>> 16);
            int i10 = i + 3;
            bArr[i + 2] = (byte) (i9 >>> 8);
            i += 4;
            bArr[i10] = (byte) i9;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Shacal2";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        }
        this.forEncryption = z10;
        this.workingKey = new int[64];
        setKey(((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        if (this.workingKey == null) {
            throw new IllegalStateException("Shacal2 not initialised");
        }
        if (i + 32 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + 32 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i, bArr2, i9);
            return 32;
        }
        decryptBlock(bArr, i, bArr2, i9);
        return 32;
    }

    public void setKey(byte[] bArr) {
        if (bArr.length != 0 && bArr.length <= 64) {
            if (bArr.length >= 16 && bArr.length % 8 == 0) {
                bytes2ints(bArr, this.workingKey, 0, 0);
                for (int i = 16; i < 64; i++) {
                    int[] iArr = this.workingKey;
                    int i9 = iArr[i - 2];
                    int i10 = ((i9 >>> 10) ^ (((i9 >>> 17) | (i9 << (-17))) ^ ((i9 >>> 19) | (i9 << (-19))))) + iArr[i - 7];
                    int i11 = iArr[i - 15];
                    iArr[i] = i10 + ((i11 >>> 3) ^ (((i11 >>> 7) | (i11 << (-7))) ^ ((i11 >>> 18) | (i11 << (-18))))) + iArr[i - 16];
                }
                return;
            }
        }
        throw new IllegalArgumentException("Shacal2-key must be 16 - 64 bytes and multiple of 8");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
