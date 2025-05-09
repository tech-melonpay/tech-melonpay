package org.bouncycastle.crypto.macs;

import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        this.f25027m = ((this.f25027m >>> ((7 - this.wordPos) << 3)) >>> 8) | ((((this.wordCount << 3) + r2) & 255) << 56);
        processMessageWord();
        this.f25030v2 ^= 238;
        applySipRounds(this.f25024d);
        long j10 = this.f25028v0;
        long j11 = this.f25029v1;
        long j12 = ((j10 ^ j11) ^ this.f25030v2) ^ this.f25031v3;
        this.f25029v1 = j11 ^ 221;
        applySipRounds(this.f25024d);
        long j13 = ((this.f25028v0 ^ this.f25029v1) ^ this.f25030v2) ^ this.f25031v3;
        reset();
        Pack.longToLittleEndian(j12, bArr, i);
        Pack.longToLittleEndian(j13, bArr, i + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.f25023c + "-" + this.f25024d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f25029v1 ^= 238;
    }

    public SipHash128(int i, int i9) {
        super(i, i9);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }
}
