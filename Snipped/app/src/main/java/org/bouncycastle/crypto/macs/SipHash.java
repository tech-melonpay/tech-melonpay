package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SipHash implements Mac {

    /* renamed from: c, reason: collision with root package name */
    protected final int f25023c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f25024d;

    /* renamed from: k0, reason: collision with root package name */
    protected long f25025k0;

    /* renamed from: k1, reason: collision with root package name */
    protected long f25026k1;

    /* renamed from: m, reason: collision with root package name */
    protected long f25027m;

    /* renamed from: v0, reason: collision with root package name */
    protected long f25028v0;

    /* renamed from: v1, reason: collision with root package name */
    protected long f25029v1;

    /* renamed from: v2, reason: collision with root package name */
    protected long f25030v2;

    /* renamed from: v3, reason: collision with root package name */
    protected long f25031v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f25027m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f25023c = 2;
        this.f25024d = 4;
    }

    public static long rotateLeft(long j10, int i) {
        return (j10 >>> (-i)) | (j10 << i);
    }

    public void applySipRounds(int i) {
        long j10 = this.f25028v0;
        long j11 = this.f25029v1;
        long j12 = this.f25030v2;
        long j13 = this.f25031v3;
        for (int i9 = 0; i9 < i; i9++) {
            long j14 = j10 + j11;
            long j15 = j12 + j13;
            long rotateLeft = rotateLeft(j11, 13) ^ j14;
            long rotateLeft2 = rotateLeft(j13, 16) ^ j15;
            long j16 = j15 + rotateLeft;
            j10 = rotateLeft(j14, 32) + rotateLeft2;
            j11 = rotateLeft(rotateLeft, 17) ^ j16;
            j13 = rotateLeft(rotateLeft2, 21) ^ j10;
            j12 = rotateLeft(j16, 32);
        }
        this.f25028v0 = j10;
        this.f25029v1 = j11;
        this.f25030v2 = j12;
        this.f25031v3 = j13;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        Pack.longToLittleEndian(doFinal(), bArr, i);
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f25023c + "-" + this.f25024d;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f25025k0 = Pack.littleEndianToLong(key, 0);
        this.f25026k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    public void processMessageWord() {
        this.wordCount++;
        this.f25031v3 ^= this.f25027m;
        applySipRounds(this.f25023c);
        this.f25028v0 ^= this.f25027m;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        long j10 = this.f25025k0;
        this.f25028v0 = 8317987319222330741L ^ j10;
        long j11 = this.f25026k1;
        this.f25029v1 = 7237128888997146477L ^ j11;
        this.f25030v2 = j10 ^ 7816392313619706465L;
        this.f25031v3 = 8387220255154660723L ^ j11;
        this.f25027m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b9) {
        this.f25027m = (this.f25027m >>> 8) | ((b9 & 255) << 56);
        int i = this.wordPos + 1;
        this.wordPos = i;
        if (i == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    public SipHash(int i, int i9) {
        this.f25027m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f25023c = i;
        this.f25024d = i9;
    }

    public long doFinal() {
        this.f25027m = ((this.f25027m >>> ((7 - this.wordPos) << 3)) >>> 8) | ((((this.wordCount << 3) + r2) & 255) << 56);
        processMessageWord();
        this.f25030v2 ^= 255;
        applySipRounds(this.f25024d);
        long j10 = ((this.f25028v0 ^ this.f25029v1) ^ this.f25030v2) ^ this.f25031v3;
        reset();
        return j10;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i9) {
        int i10 = i9 & (-8);
        int i11 = this.wordPos;
        int i12 = 0;
        if (i11 == 0) {
            while (i12 < i10) {
                this.f25027m = Pack.littleEndianToLong(bArr, i + i12);
                processMessageWord();
                i12 += 8;
            }
            while (i12 < i9) {
                this.f25027m = (this.f25027m >>> 8) | ((bArr[i + i12] & 255) << 56);
                i12++;
            }
            this.wordPos = i9 - i10;
            return;
        }
        int i13 = i11 << 3;
        int i14 = 0;
        while (i14 < i10) {
            long littleEndianToLong = Pack.littleEndianToLong(bArr, i + i14);
            this.f25027m = (this.f25027m >>> (-i13)) | (littleEndianToLong << i13);
            processMessageWord();
            this.f25027m = littleEndianToLong;
            i14 += 8;
        }
        while (i14 < i9) {
            this.f25027m = (this.f25027m >>> 8) | ((bArr[i + i14] & 255) << 56);
            int i15 = this.wordPos + 1;
            this.wordPos = i15;
            if (i15 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i14++;
        }
    }
}
