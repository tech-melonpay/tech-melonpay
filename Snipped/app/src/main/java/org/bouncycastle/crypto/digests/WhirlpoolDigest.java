package org.bouncycastle.crypto.digests;

import androidx.recyclerview.widget.u;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.math.Primes;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.jmrtd.PassportService;
import org.jmrtd.lds.iso19794.IrisImageInfo;

/* loaded from: classes2.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private long[] _K;
    private long[] _L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private static final int[] SBOX = {24, 35, 198, 232, 135, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 1, 79, 54, 166, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, BERTags.FLAGS, 215, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 46, 75, IrisImageInfo.IMAGE_QUAL_UNDEF, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, CipherSuite.TLS_PSK_WITH_NULL_SHA384, 160, 107, 133, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, 125, 149, 216, 251, 238, 124, 102, 221, 23, 71, 158, 202, 45, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 7, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 90, 131, 51, 99, 2, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 113, 200, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, CipherSuite.TLS_PSK_WITH_NULL_SHA256, 233, 15, 213, 128, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, 84, 147, 34, 100, 241, 115, 18, 64, 8, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 236, 219, 161, 141, 61, 151, 0, 207, 43, 118, 130, 214, 27, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 47, 192, 222, 28, 253, 77, 146, 117, 6, 138, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 230, 14, 31, 98, 212, 168, 150, 249, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 209, 165, 226, 97, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 33, 156, 30, 67, 199, 252, 4, 81, 153, 109, 13, u.d.DEFAULT_SWIPE_ANIMATION_DURATION, PassportService.DEFAULT_MAX_BLOCKSIZE, 126, 36, 59, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 206, 17, 143, 78, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, 235, 60, 129, 148, 247, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, 19, 44, Primes.SMALL_FACTOR_LIMIT, 231, 110, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 3, 86, 68, 127, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 42, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, 83, 220, 11, 157, 108, 49, 116, 246, 70, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 137, 20, 225, 22, 58, 105, 9, 112, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 208, 237, 204, 66, 152, 164, 40, 92, 248, 134};

    /* renamed from: C0, reason: collision with root package name */
    private static final long[] f24915C0 = new long[256];

    /* renamed from: C1, reason: collision with root package name */
    private static final long[] f24916C1 = new long[256];

    /* renamed from: C2, reason: collision with root package name */
    private static final long[] f24917C2 = new long[256];

    /* renamed from: C3, reason: collision with root package name */
    private static final long[] f24918C3 = new long[256];

    /* renamed from: C4, reason: collision with root package name */
    private static final long[] f24919C4 = new long[256];

    /* renamed from: C5, reason: collision with root package name */
    private static final long[] f24920C5 = new long[256];

    /* renamed from: C6, reason: collision with root package name */
    private static final long[] f24921C6 = new long[256];

    /* renamed from: C7, reason: collision with root package name */
    private static final long[] f24922C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
    }

    public WhirlpoolDigest() {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        for (int i = 0; i < 256; i++) {
            int i9 = SBOX[i];
            int maskWithReductionPolynomial = maskWithReductionPolynomial(i9 << 1);
            int maskWithReductionPolynomial2 = maskWithReductionPolynomial(maskWithReductionPolynomial << 1);
            int i10 = maskWithReductionPolynomial2 ^ i9;
            int maskWithReductionPolynomial3 = maskWithReductionPolynomial(maskWithReductionPolynomial2 << 1);
            int i11 = maskWithReductionPolynomial3 ^ i9;
            f24915C0[i] = packIntoLong(i9, i9, maskWithReductionPolynomial2, i9, maskWithReductionPolynomial3, i10, maskWithReductionPolynomial, i11);
            f24916C1[i] = packIntoLong(i11, i9, i9, maskWithReductionPolynomial2, i9, maskWithReductionPolynomial3, i10, maskWithReductionPolynomial);
            f24917C2[i] = packIntoLong(maskWithReductionPolynomial, i11, i9, i9, maskWithReductionPolynomial2, i9, maskWithReductionPolynomial3, i10);
            f24918C3[i] = packIntoLong(i10, maskWithReductionPolynomial, i11, i9, i9, maskWithReductionPolynomial2, i9, maskWithReductionPolynomial3);
            f24919C4[i] = packIntoLong(maskWithReductionPolynomial3, i10, maskWithReductionPolynomial, i11, i9, i9, maskWithReductionPolynomial2, i9);
            f24920C5[i] = packIntoLong(i9, maskWithReductionPolynomial3, i10, maskWithReductionPolynomial, i11, i9, i9, maskWithReductionPolynomial2);
            f24921C6[i] = packIntoLong(maskWithReductionPolynomial2, i9, maskWithReductionPolynomial3, i10, maskWithReductionPolynomial, i11, i9, i9);
            f24922C7[i] = packIntoLong(i9, maskWithReductionPolynomial2, i9, maskWithReductionPolynomial3, i10, maskWithReductionPolynomial, i11, i9);
        }
        this._rc[0] = 0;
        for (int i12 = 1; i12 <= 10; i12++) {
            int i13 = (i12 - 1) * 8;
            this._rc[i12] = (((((((f24915C0[i13] & (-72057594037927936L)) ^ (f24916C1[i13 + 1] & 71776119061217280L)) ^ (f24917C2[i13 + 2] & 280375465082880L)) ^ (f24918C3[i13 + 3] & 1095216660480L)) ^ (f24919C4[i13 + 4] & 4278190080L)) ^ (f24920C5[i13 + 5] & 16711680)) ^ (f24921C6[i13 + 6] & 65280)) ^ (f24922C7[i13 + 7] & 255);
        }
    }

    private long bytesToLongFromBuffer(byte[] bArr, int i) {
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    private void convertLongToByteArray(long j10, byte[] bArr, int i) {
        for (int i9 = 0; i9 < 8; i9++) {
            bArr[i + i9] = (byte) ((j10 >> (56 - (i9 * 8))) & 255);
        }
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) (this._bitCount[i] & 255);
        }
        return bArr;
    }

    private void finish() {
        byte[] copyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        int i9 = i + 1;
        this._bufferPos = i9;
        bArr[i] = (byte) (bArr[i] | ISOFileInfo.DATA_BYTES1);
        if (i9 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(copyBitLength, 0, this._buffer, 32, copyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i9 = (sArr[length] & 255) + EIGHT[length] + i;
            i = i9 >>> 8;
            sArr[length] = (short) (i9 & 255);
        }
    }

    private int maskWithReductionPolynomial(int i) {
        return ((long) i) >= 256 ? i ^ REDUCTION_POLYNOMIAL : i;
    }

    private long packIntoLong(int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        return (((((((i9 << 48) ^ (i << 56)) ^ (i10 << 40)) ^ (i11 << 32)) ^ (i12 << 24)) ^ (i13 << 16)) ^ (i14 << 8)) ^ i15;
    }

    private void processFilledBuffer(byte[] bArr, int i) {
        for (int i9 = 0; i9 < this._state.length; i9++) {
            this._block[i9] = bytesToLongFromBuffer(this._buffer, i9 * 8);
        }
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        for (int i9 = 0; i9 < 8; i9++) {
            convertLongToByteArray(this._hash[i9], bArr, (i9 * 8) + i);
        }
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    public void processBlock() {
        long[] jArr;
        for (int i = 0; i < 8; i++) {
            long[] jArr2 = this._state;
            long j10 = this._block[i];
            long[] jArr3 = this._K;
            long j11 = this._hash[i];
            jArr3[i] = j11;
            jArr2[i] = j10 ^ j11;
        }
        int i9 = 1;
        while (i9 <= 10) {
            int i10 = 0;
            while (i10 < 8) {
                long[] jArr4 = this._L;
                jArr4[i10] = 0;
                long[] jArr5 = f24915C0;
                long[] jArr6 = this._K;
                long j12 = jArr5[((int) (jArr6[i10 & 7] >>> 56)) & 255];
                jArr4[i10] = j12;
                long j13 = f24916C1[((int) (jArr6[(i10 - 1) & 7] >>> 48)) & 255] ^ j12;
                jArr4[i10] = j13;
                long j14 = j13 ^ f24917C2[((int) (jArr6[(i10 - 2) & 7] >>> 40)) & 255];
                jArr4[i10] = j14;
                long j15 = j14 ^ f24918C3[((int) (jArr6[(i10 - 3) & 7] >>> 32)) & 255];
                jArr4[i10] = j15;
                long j16 = j15 ^ f24919C4[((int) (jArr6[(i10 - 4) & 7] >>> 24)) & 255];
                jArr4[i10] = j16;
                long j17 = j16 ^ f24920C5[((int) (jArr6[(i10 - 5) & 7] >>> 16)) & 255];
                jArr4[i10] = j17;
                long j18 = j17 ^ f24921C6[((int) (jArr6[(i10 - 6) & 7] >>> 8)) & 255];
                jArr4[i10] = j18;
                jArr4[i10] = j18 ^ f24922C7[((int) jArr6[(i10 - 7) & 7]) & 255];
                i10++;
                i9 = i9;
            }
            int i11 = i9;
            long[] jArr7 = this._L;
            long[] jArr8 = this._K;
            System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
            long[] jArr9 = this._K;
            jArr9[0] = jArr9[0] ^ this._rc[i11];
            int i12 = 0;
            while (true) {
                jArr = this._L;
                if (i12 < 8) {
                    long j19 = this._K[i12];
                    jArr[i12] = j19;
                    long[] jArr10 = f24915C0;
                    long[] jArr11 = this._state;
                    long j20 = jArr10[((int) (jArr11[i12 & 7] >>> 56)) & 255] ^ j19;
                    jArr[i12] = j20;
                    long j21 = j20 ^ f24916C1[((int) (jArr11[(i12 - 1) & 7] >>> 48)) & 255];
                    jArr[i12] = j21;
                    long j22 = j21 ^ f24917C2[((int) (jArr11[(i12 - 2) & 7] >>> 40)) & 255];
                    jArr[i12] = j22;
                    long j23 = j22 ^ f24918C3[((int) (jArr11[(i12 - 3) & 7] >>> 32)) & 255];
                    jArr[i12] = j23;
                    long j24 = j23 ^ f24919C4[((int) (jArr11[(i12 - 4) & 7] >>> 24)) & 255];
                    jArr[i12] = j24;
                    long j25 = j24 ^ f24920C5[((int) (jArr11[(i12 - 5) & 7] >>> 16)) & 255];
                    jArr[i12] = j25;
                    long j26 = j25 ^ f24921C6[((int) (jArr11[(i12 - 6) & 7] >>> 8)) & 255];
                    jArr[i12] = j26;
                    jArr[i12] = j26 ^ f24922C7[((int) jArr11[(i12 - 7) & 7]) & 255];
                    i12++;
                }
            }
            long[] jArr12 = this._state;
            System.arraycopy(jArr, 0, jArr12, 0, jArr12.length);
            i9 = i11 + 1;
        }
        for (int i13 = 0; i13 < 8; i13++) {
            long[] jArr13 = this._hash;
            jArr13[i13] = jArr13[i13] ^ (this._state[i13] ^ this._block[i13]);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, (short) 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0L);
        Arrays.fill(this._K, 0L);
        Arrays.fill(this._L, 0L);
        Arrays.fill(this._block, 0L);
        Arrays.fill(this._state, 0L);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b9) {
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        bArr[i] = b9;
        int i9 = i + 1;
        this._bufferPos = i9;
        if (i9 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        reset(whirlpoolDigest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest._K;
        long[] jArr6 = this._K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest._L;
        long[] jArr8 = this._L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i9) {
        while (i9 > 0) {
            update(bArr[i]);
            i++;
            i9--;
        }
    }
}
