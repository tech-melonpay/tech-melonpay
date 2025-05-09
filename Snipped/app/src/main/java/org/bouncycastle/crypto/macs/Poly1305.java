package org.bouncycastle.crypto.macs;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* renamed from: h0, reason: collision with root package name */
    private int f25006h0;

    /* renamed from: h1, reason: collision with root package name */
    private int f25007h1;

    /* renamed from: h2, reason: collision with root package name */
    private int f25008h2;

    /* renamed from: h3, reason: collision with root package name */
    private int f25009h3;

    /* renamed from: h4, reason: collision with root package name */
    private int f25010h4;

    /* renamed from: k0, reason: collision with root package name */
    private int f25011k0;

    /* renamed from: k1, reason: collision with root package name */
    private int f25012k1;

    /* renamed from: k2, reason: collision with root package name */
    private int f25013k2;
    private int k3;

    /* renamed from: r0, reason: collision with root package name */
    private int f25014r0;

    /* renamed from: r1, reason: collision with root package name */
    private int f25015r1;

    /* renamed from: r2, reason: collision with root package name */
    private int f25016r2;

    /* renamed from: r3, reason: collision with root package name */
    private int f25017r3;

    /* renamed from: r4, reason: collision with root package name */
    private int f25018r4;

    /* renamed from: s1, reason: collision with root package name */
    private int f25019s1;

    /* renamed from: s2, reason: collision with root package name */
    private int f25020s2;

    /* renamed from: s3, reason: collision with root package name */
    private int f25021s3;

    /* renamed from: s4, reason: collision with root package name */
    private int f25022s4;
    private final byte[] singleByte;

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    private static final long mul32x32_64(int i, int i9) {
        return (i & BodyPartID.bodyIdMax) * i9;
    }

    private void processBlock() {
        int i = this.currentBlockOffset;
        if (i < 16) {
            this.currentBlock[i] = 1;
            for (int i9 = i + 1; i9 < 16; i9++) {
                this.currentBlock[i9] = 0;
            }
        }
        long littleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long j10 = littleEndianToInt & BodyPartID.bodyIdMax;
        long littleEndianToInt2 = Pack.littleEndianToInt(this.currentBlock, 4) & BodyPartID.bodyIdMax;
        long littleEndianToInt3 = Pack.littleEndianToInt(this.currentBlock, 8) & BodyPartID.bodyIdMax;
        long littleEndianToInt4 = BodyPartID.bodyIdMax & Pack.littleEndianToInt(this.currentBlock, 12);
        int i10 = (int) (this.f25006h0 + (littleEndianToInt & 67108863));
        this.f25006h0 = i10;
        this.f25007h1 = (int) (this.f25007h1 + ((((littleEndianToInt2 << 32) | j10) >>> 26) & 67108863));
        this.f25008h2 = (int) (this.f25008h2 + (((littleEndianToInt2 | (littleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.f25009h3 = (int) (this.f25009h3 + ((((littleEndianToInt4 << 32) | littleEndianToInt3) >>> 14) & 67108863));
        int i11 = (int) (this.f25010h4 + (littleEndianToInt4 >>> 8));
        this.f25010h4 = i11;
        if (this.currentBlockOffset == 16) {
            this.f25010h4 = i11 + 16777216;
        }
        long mul32x32_64 = mul32x32_64(i10, this.f25014r0) + mul32x32_64(this.f25007h1, this.f25022s4) + mul32x32_64(this.f25008h2, this.f25021s3) + mul32x32_64(this.f25009h3, this.f25020s2) + mul32x32_64(this.f25010h4, this.f25019s1);
        long mul32x32_642 = mul32x32_64(this.f25006h0, this.f25015r1) + mul32x32_64(this.f25007h1, this.f25014r0) + mul32x32_64(this.f25008h2, this.f25022s4) + mul32x32_64(this.f25009h3, this.f25021s3) + mul32x32_64(this.f25010h4, this.f25020s2);
        long mul32x32_643 = mul32x32_64(this.f25006h0, this.f25016r2) + mul32x32_64(this.f25007h1, this.f25015r1) + mul32x32_64(this.f25008h2, this.f25014r0) + mul32x32_64(this.f25009h3, this.f25022s4) + mul32x32_64(this.f25010h4, this.f25021s3);
        long mul32x32_644 = mul32x32_64(this.f25006h0, this.f25017r3) + mul32x32_64(this.f25007h1, this.f25016r2) + mul32x32_64(this.f25008h2, this.f25015r1) + mul32x32_64(this.f25009h3, this.f25014r0) + mul32x32_64(this.f25010h4, this.f25022s4);
        long mul32x32_645 = mul32x32_64(this.f25006h0, this.f25018r4) + mul32x32_64(this.f25007h1, this.f25017r3) + mul32x32_64(this.f25008h2, this.f25016r2) + mul32x32_64(this.f25009h3, this.f25015r1) + mul32x32_64(this.f25010h4, this.f25014r0);
        long j11 = mul32x32_642 + (mul32x32_64 >>> 26);
        long j12 = mul32x32_643 + (j11 >>> 26);
        this.f25008h2 = ((int) j12) & 67108863;
        long j13 = mul32x32_644 + (j12 >>> 26);
        this.f25009h3 = ((int) j13) & 67108863;
        long j14 = mul32x32_645 + (j13 >>> 26);
        this.f25010h4 = ((int) j14) & 67108863;
        int i12 = (((int) (j14 >>> 26)) * 5) + (((int) mul32x32_64) & 67108863);
        this.f25007h1 = (((int) j11) & 67108863) + (i12 >>> 26);
        this.f25006h0 = i12 & 67108863;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i = 16;
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        this.f25014r0 = 67108863 & littleEndianToInt;
        int i9 = ((littleEndianToInt >>> 26) | (littleEndianToInt2 << 6)) & 67108611;
        this.f25015r1 = i9;
        int i10 = ((littleEndianToInt2 >>> 20) | (littleEndianToInt3 << 12)) & 67092735;
        this.f25016r2 = i10;
        int i11 = ((littleEndianToInt3 >>> 14) | (littleEndianToInt4 << 18)) & 66076671;
        this.f25017r3 = i11;
        int i12 = (littleEndianToInt4 >>> 8) & 1048575;
        this.f25018r4 = i12;
        this.f25019s1 = i9 * 5;
        this.f25020s2 = i10 * 5;
        this.f25021s3 = i11 * 5;
        this.f25022s4 = i12 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 16, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            i = 0;
            bArr = bArr3;
        }
        this.f25011k0 = Pack.littleEndianToInt(bArr, i);
        this.f25012k1 = Pack.littleEndianToInt(bArr, i + 4);
        this.f25013k2 = Pack.littleEndianToInt(bArr, i + 8);
        this.k3 = Pack.littleEndianToInt(bArr, i + 12);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        if (i + 16 > bArr.length) {
            throw new OutputLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i9 = this.f25007h1;
        int i10 = this.f25006h0;
        int i11 = i9 + (i10 >>> 26);
        int i12 = this.f25008h2 + (i11 >>> 26);
        int i13 = this.f25009h3 + (i12 >>> 26);
        int i14 = i12 & 67108863;
        int i15 = this.f25010h4 + (i13 >>> 26);
        int i16 = i13 & 67108863;
        int i17 = ((i15 >>> 26) * 5) + (i10 & 67108863);
        int i18 = i15 & 67108863;
        int i19 = (i11 & 67108863) + (i17 >>> 26);
        int i20 = i17 & 67108863;
        int i21 = i20 + 5;
        int i22 = (i21 >>> 26) + i19;
        int i23 = (i22 >>> 26) + i14;
        int i24 = (i23 >>> 26) + i16;
        int i25 = 67108863 & i24;
        int i26 = ((i24 >>> 26) + i18) - 67108864;
        int i27 = (i26 >>> 31) - 1;
        int i28 = ~i27;
        this.f25006h0 = (i20 & i28) | (i21 & 67108863 & i27);
        this.f25007h1 = (i19 & i28) | (i22 & 67108863 & i27);
        this.f25008h2 = (i14 & i28) | (i23 & 67108863 & i27);
        this.f25009h3 = (i25 & i27) | (i16 & i28);
        this.f25010h4 = (i18 & i28) | (i26 & i27);
        long j10 = (((r3 << 26) | r8) & BodyPartID.bodyIdMax) + (this.f25011k0 & BodyPartID.bodyIdMax);
        long j11 = (((r3 >>> 6) | (r6 << 20)) & BodyPartID.bodyIdMax) + (this.f25012k1 & BodyPartID.bodyIdMax);
        long j12 = (((r6 >>> 12) | (r5 << 14)) & BodyPartID.bodyIdMax) + (this.f25013k2 & BodyPartID.bodyIdMax);
        long j13 = (((r5 >>> 18) | (r4 << 8)) & BodyPartID.bodyIdMax) + (this.k3 & BodyPartID.bodyIdMax);
        Pack.intToLittleEndian((int) j10, bArr, i);
        long j14 = j11 + (j10 >>> 32);
        Pack.intToLittleEndian((int) j14, bArr, i + 4);
        long j15 = j12 + (j14 >>> 32);
        Pack.intToLittleEndian((int) j15, bArr, i + 8);
        Pack.intToLittleEndian((int) (j13 + (j15 >>> 32)), bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        byte[] bArr;
        if (this.cipher == null) {
            bArr = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            bArr = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        setKey(((KeyParameter) cipherParameters).getKey(), bArr);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.f25010h4 = 0;
        this.f25009h3 = 0;
        this.f25008h2 = 0;
        this.f25007h1 = 0;
        this.f25006h0 = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b9) {
        byte[] bArr = this.singleByte;
        bArr[0] = b9;
        update(bArr, 0, 1);
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.cipher = blockCipher;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i9) {
        int i10 = 0;
        while (i9 > i10) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int min = Math.min(i9 - i10, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i10 + i, this.currentBlock, this.currentBlockOffset, min);
            i10 += min;
            this.currentBlockOffset += min;
        }
    }
}
