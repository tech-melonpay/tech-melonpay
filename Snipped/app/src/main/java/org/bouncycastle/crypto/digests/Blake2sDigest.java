package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;

/* loaded from: classes2.dex */
public class Blake2sDigest implements ExtendedDigest {
    private static final int BLOCK_LENGTH_BYTES = 64;
    private static final int ROUNDS = 10;
    private static final int[] blake2s_IV = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    private static final byte[][] blake2s_sigma = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, PassportService.SFI_DG11, PassportService.SFI_DG12, PassportService.SFI_DG13, 14, PassportService.SFI_DG15}, new byte[]{14, 10, 4, 8, 9, PassportService.SFI_DG15, PassportService.SFI_DG13, 6, 1, PassportService.SFI_DG12, 0, 2, PassportService.SFI_DG11, 7, 5, 3}, new byte[]{PassportService.SFI_DG11, 8, PassportService.SFI_DG12, 0, 5, 2, PassportService.SFI_DG15, PassportService.SFI_DG13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, PassportService.SFI_DG13, PassportService.SFI_DG12, PassportService.SFI_DG11, 14, 2, 6, 5, 10, 4, 0, PassportService.SFI_DG15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, PassportService.SFI_DG15, 14, 1, PassportService.SFI_DG11, PassportService.SFI_DG12, 6, 8, 3, PassportService.SFI_DG13}, new byte[]{2, PassportService.SFI_DG12, 6, 10, 0, PassportService.SFI_DG11, 8, 3, 4, PassportService.SFI_DG13, 7, 5, PassportService.SFI_DG15, 14, 1, 9}, new byte[]{PassportService.SFI_DG12, 5, 1, PassportService.SFI_DG15, 14, PassportService.SFI_DG13, 4, 10, 0, 7, 6, 3, 9, 2, 8, PassportService.SFI_DG11}, new byte[]{PassportService.SFI_DG13, PassportService.SFI_DG11, 7, 14, PassportService.SFI_DG12, 1, 3, 9, 5, 0, PassportService.SFI_DG15, 4, 8, 6, 2, 10}, new byte[]{6, PassportService.SFI_DG15, 14, 9, PassportService.SFI_DG11, 3, 0, 8, PassportService.SFI_DG12, 2, PassportService.SFI_DG13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, PassportService.SFI_DG15, PassportService.SFI_DG11, 9, 14, 3, PassportService.SFI_DG12, PassportService.SFI_DG13, 0}};
    private byte[] buffer;
    private int bufferPos;
    private int[] chainValue;
    private int depth;
    private int digestLength;

    /* renamed from: f0, reason: collision with root package name */
    private int f24815f0;
    private int fanout;
    private int innerHashLength;
    private int[] internalState;
    private byte[] key;
    private int keyLength;
    private int leafLength;
    private int nodeDepth;
    private long nodeOffset;
    private byte[] personalization;
    private byte[] salt;

    /* renamed from: t0, reason: collision with root package name */
    private int f24816t0;

    /* renamed from: t1, reason: collision with root package name */
    private int f24817t1;

    public Blake2sDigest() {
        this(256);
    }

    private void G(int i, int i9, int i10, int i11, int i12, int i13) {
        int[] iArr = this.internalState;
        int i14 = iArr[i10] + iArr[i11] + i;
        iArr[i10] = i14;
        iArr[i13] = rotr32(iArr[i13] ^ i14, 16);
        int[] iArr2 = this.internalState;
        int i15 = iArr2[i12] + iArr2[i13];
        iArr2[i12] = i15;
        iArr2[i11] = rotr32(i15 ^ iArr2[i11], 12);
        int[] iArr3 = this.internalState;
        int i16 = iArr3[i10] + iArr3[i11] + i9;
        iArr3[i10] = i16;
        iArr3[i13] = rotr32(iArr3[i13] ^ i16, 8);
        int[] iArr4 = this.internalState;
        int i17 = iArr4[i12] + iArr4[i13];
        iArr4[i12] = i17;
        iArr4[i11] = rotr32(i17 ^ iArr4[i11], 7);
    }

    private void compress(byte[] bArr, int i) {
        initializeInternalState();
        int[] iArr = new int[16];
        int i9 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            iArr[i10] = Pack.littleEndianToInt(bArr, (i10 * 4) + i);
        }
        for (int i11 = 0; i11 < 10; i11++) {
            byte[][] bArr2 = blake2s_sigma;
            byte[] bArr3 = bArr2[i11];
            G(iArr[bArr3[0]], iArr[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i11];
            G(iArr[bArr4[2]], iArr[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i11];
            G(iArr[bArr5[4]], iArr[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i11];
            G(iArr[bArr6[6]], iArr[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i11];
            G(iArr[bArr7[8]], iArr[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i11];
            G(iArr[bArr8[10]], iArr[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i11];
            G(iArr[bArr9[12]], iArr[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i11];
            G(iArr[bArr10[14]], iArr[bArr10[15]], 3, 4, 9, 14);
        }
        while (true) {
            int[] iArr2 = this.chainValue;
            if (i9 >= iArr2.length) {
                return;
            }
            int i12 = iArr2[i9];
            int[] iArr3 = this.internalState;
            iArr2[i9] = (i12 ^ iArr3[i9]) ^ iArr3[i9 + 8];
            i9++;
        }
    }

    private void init(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.buffer = new byte[64];
        if (bArr3 != null && bArr3.length > 0) {
            if (bArr3.length > 32) {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
            byte[] bArr4 = new byte[bArr3.length];
            this.key = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            this.keyLength = bArr3.length;
            System.arraycopy(bArr3, 0, this.buffer, 0, bArr3.length);
            this.bufferPos = 64;
        }
        if (this.chainValue == null) {
            this.chainValue = new int[]{r3[0] ^ ((this.digestLength | (this.keyLength << 8)) | ((this.fanout << 16) | (this.depth << 24))), r3[1] ^ this.leafLength, ((int) r4) ^ r3[2], ((r1 | (this.nodeDepth << 16)) | (this.innerHashLength << 24)) ^ r5, r3[4], r3[5], 0, 0};
            int[] iArr = blake2s_IV;
            long j10 = this.nodeOffset;
            int i = (int) (j10 >> 32);
            int i9 = iArr[3];
            if (bArr != null) {
                if (bArr.length != 8) {
                    throw new IllegalArgumentException("Salt length must be exactly 8 bytes");
                }
                byte[] bArr5 = new byte[8];
                this.salt = bArr5;
                System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                int[] iArr2 = this.chainValue;
                iArr2[4] = iArr2[4] ^ Pack.littleEndianToInt(bArr, 0);
                int[] iArr3 = this.chainValue;
                iArr3[5] = Pack.littleEndianToInt(bArr, 4) ^ iArr3[5];
            }
            int[] iArr4 = this.chainValue;
            iArr4[6] = iArr[6];
            iArr4[7] = iArr[7];
            if (bArr2 != null) {
                if (bArr2.length != 8) {
                    throw new IllegalArgumentException("Personalization length must be exactly 8 bytes");
                }
                byte[] bArr6 = new byte[8];
                this.personalization = bArr6;
                System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                int[] iArr5 = this.chainValue;
                iArr5[6] = iArr5[6] ^ Pack.littleEndianToInt(bArr2, 0);
                int[] iArr6 = this.chainValue;
                iArr6[7] = Pack.littleEndianToInt(bArr2, 4) ^ iArr6[7];
            }
        }
    }

    private void initializeInternalState() {
        int[] iArr = this.chainValue;
        System.arraycopy(iArr, 0, this.internalState, 0, iArr.length);
        int[] iArr2 = blake2s_IV;
        System.arraycopy(iArr2, 0, this.internalState, this.chainValue.length, 4);
        int[] iArr3 = this.internalState;
        iArr3[12] = this.f24816t0 ^ iArr2[4];
        iArr3[13] = this.f24817t1 ^ iArr2[5];
        iArr3[14] = this.f24815f0 ^ iArr2[6];
        iArr3[15] = iArr2[7];
    }

    private int rotr32(int i, int i9) {
        return (i << (32 - i9)) | (i >>> i9);
    }

    public void clearKey() {
        byte[] bArr = this.key;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            Arrays.fill(this.buffer, (byte) 0);
        }
    }

    public void clearSalt() {
        byte[] bArr = this.salt;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        int[] iArr;
        int i9;
        this.f24815f0 = -1;
        int i10 = this.f24816t0;
        int i11 = this.bufferPos;
        int i12 = i10 + i11;
        this.f24816t0 = i12;
        if (i12 < 0 && i11 > (-i12)) {
            this.f24817t1++;
        }
        compress(this.buffer, 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.internalState, 0);
        int i13 = 0;
        while (true) {
            iArr = this.chainValue;
            if (i13 >= iArr.length || (i9 = i13 * 4) >= this.digestLength) {
                break;
            }
            byte[] intToLittleEndian = Pack.intToLittleEndian(iArr[i13]);
            int i14 = this.digestLength;
            if (i9 < i14 - 4) {
                System.arraycopy(intToLittleEndian, 0, bArr, i9 + i, 4);
            } else {
                System.arraycopy(intToLittleEndian, 0, bArr, i + i9, i14 - i9);
            }
            i13++;
        }
        Arrays.fill(iArr, 0);
        reset();
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2s";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.bufferPos = 0;
        this.f24815f0 = 0;
        this.f24816t0 = 0;
        this.f24817t1 = 0;
        this.chainValue = null;
        Arrays.fill(this.buffer, (byte) 0);
        byte[] bArr = this.key;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.buffer, 0, bArr.length);
            this.bufferPos = 64;
        }
        init(this.salt, this.personalization, this.key);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b9) {
        int i = this.bufferPos;
        if (64 - i != 0) {
            this.buffer[i] = b9;
            this.bufferPos = i + 1;
            return;
        }
        int i9 = this.f24816t0 + 64;
        this.f24816t0 = i9;
        if (i9 == 0) {
            this.f24817t1++;
        }
        compress(this.buffer, 0);
        Arrays.fill(this.buffer, (byte) 0);
        this.buffer[0] = b9;
        this.bufferPos = 1;
    }

    public Blake2sDigest(int i) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f24816t0 = 0;
        this.f24817t1 = 0;
        this.f24815f0 = 0;
        if (i < 8 || i > 256 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.digestLength = i / 8;
        init(null, null, null);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i9) {
        int i10;
        if (bArr == null || i9 == 0) {
            return;
        }
        int i11 = this.bufferPos;
        if (i11 != 0) {
            i10 = 64 - i11;
            if (i10 >= i9) {
                System.arraycopy(bArr, i, this.buffer, i11, i9);
                this.bufferPos += i9;
            }
            System.arraycopy(bArr, i, this.buffer, i11, i10);
            int i12 = this.f24816t0 + 64;
            this.f24816t0 = i12;
            if (i12 == 0) {
                this.f24817t1++;
            }
            compress(this.buffer, 0);
            this.bufferPos = 0;
            Arrays.fill(this.buffer, (byte) 0);
        } else {
            i10 = 0;
        }
        int i13 = i9 + i;
        int i14 = i13 - 64;
        int i15 = i + i10;
        while (i15 < i14) {
            int i16 = this.f24816t0 + 64;
            this.f24816t0 = i16;
            if (i16 == 0) {
                this.f24817t1++;
            }
            compress(bArr, i15);
            i15 += 64;
        }
        i9 = i13 - i15;
        System.arraycopy(bArr, i15, this.buffer, 0, i9);
        this.bufferPos += i9;
    }

    public Blake2sDigest(int i, int i9, long j10) {
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f24816t0 = 0;
        this.f24817t1 = 0;
        this.f24815f0 = 0;
        this.digestLength = i;
        this.nodeOffset = j10;
        this.fanout = 0;
        this.depth = 0;
        this.leafLength = i9;
        this.innerHashLength = i9;
        this.nodeDepth = 0;
        init(null, null, null);
    }

    public Blake2sDigest(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, long j10) {
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f24816t0 = 0;
        this.f24817t1 = 0;
        this.f24815f0 = 0;
        this.digestLength = i;
        this.nodeOffset = j10;
        init(bArr2, bArr3, bArr);
    }

    public Blake2sDigest(Blake2sDigest blake2sDigest) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f24816t0 = 0;
        this.f24817t1 = 0;
        this.f24815f0 = 0;
        this.bufferPos = blake2sDigest.bufferPos;
        this.buffer = Arrays.clone(blake2sDigest.buffer);
        this.keyLength = blake2sDigest.keyLength;
        this.key = Arrays.clone(blake2sDigest.key);
        this.digestLength = blake2sDigest.digestLength;
        this.internalState = Arrays.clone(this.internalState);
        this.chainValue = Arrays.clone(blake2sDigest.chainValue);
        this.f24816t0 = blake2sDigest.f24816t0;
        this.f24817t1 = blake2sDigest.f24817t1;
        this.f24815f0 = blake2sDigest.f24815f0;
        this.salt = Arrays.clone(blake2sDigest.salt);
        this.personalization = Arrays.clone(blake2sDigest.personalization);
        this.fanout = blake2sDigest.fanout;
        this.depth = blake2sDigest.depth;
        this.leafLength = blake2sDigest.leafLength;
        this.nodeOffset = blake2sDigest.nodeOffset;
        this.nodeDepth = blake2sDigest.nodeDepth;
        this.innerHashLength = blake2sDigest.innerHashLength;
    }

    public Blake2sDigest(byte[] bArr) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f24816t0 = 0;
        this.f24817t1 = 0;
        this.f24815f0 = 0;
        init(null, null, bArr);
    }

    public Blake2sDigest(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        this.digestLength = 32;
        this.keyLength = 0;
        this.salt = null;
        this.personalization = null;
        this.key = null;
        this.fanout = 1;
        this.depth = 1;
        this.leafLength = 0;
        this.nodeOffset = 0L;
        this.nodeDepth = 0;
        this.innerHashLength = 0;
        this.buffer = null;
        this.bufferPos = 0;
        this.internalState = new int[16];
        this.chainValue = null;
        this.f24816t0 = 0;
        this.f24817t1 = 0;
        this.f24815f0 = 0;
        if (i < 1 || i > 32) {
            throw new IllegalArgumentException("Invalid digest length (required: 1 - 32)");
        }
        this.digestLength = i;
        init(bArr2, bArr3, bArr);
    }
}
