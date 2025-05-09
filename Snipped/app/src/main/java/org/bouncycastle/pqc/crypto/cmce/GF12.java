package org.bouncycastle.pqc.crypto.cmce;

/* loaded from: classes3.dex */
class GF12 extends GF {
    public GF12(int i) {
        super(i);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_frac(short s10, short s11) {
        return gf_mul(gf_inv(s10), s11);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_inv(short s10) {
        short gf_mul = gf_mul(gf_sq(s10), s10);
        short gf_mul2 = gf_mul(gf_sq(gf_sq(gf_mul)), gf_mul);
        return gf_sq(gf_mul(gf_sq(gf_mul(gf_sq(gf_sq(gf_mul(gf_sq(gf_sq(gf_sq(gf_sq(gf_mul2)))), gf_mul2))), gf_mul)), s10));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_mul(short s10, short s11) {
        int i = (s11 & 1) * s10;
        int i9 = 1;
        while (true) {
            int i10 = this.GFBITS;
            if (i9 >= i10) {
                int i11 = 8372224 & i;
                int i12 = (i11 >> 12) ^ ((i11 >> 9) ^ i);
                int i13 = i12 & 12288;
                return (short) (((i12 ^ (i13 >> 9)) ^ (i13 >> 12)) & ((1 << i10) - 1));
            }
            i ^= ((1 << i9) & s11) * s10;
            i9++;
        }
    }

    public short gf_sq(short s10) {
        int[] iArr = {1431655765, 858993459, 252645135, 16711935};
        int i = (s10 | (s10 << 8)) & iArr[3];
        int i9 = (i | (i << 4)) & iArr[2];
        int i10 = (i9 | (i9 << 2)) & iArr[1];
        int i11 = (i10 | (i10 << 1)) & iArr[0];
        int i12 = 8372224 & i11;
        int i13 = (i11 ^ (i12 >> 9)) ^ (i12 >> 12);
        int i14 = i13 & 12288;
        return (short) (((i13 ^ (i14 >> 9)) ^ (i14 >> 12)) & ((1 << this.GFBITS) - 1));
    }
}
