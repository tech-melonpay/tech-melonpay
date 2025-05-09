package org.bouncycastle.pqc.crypto.cmce;

/* loaded from: classes3.dex */
class GF13 extends GF {
    public GF13(int i) {
        super(i);
    }

    private short gf_sq2mul(short s10, short s11) {
        long[] jArr = {2301339409586323456L, 4494803534348288L, 8778913153024L, 17146314752L, 33423360, 122880};
        long j10 = s10;
        long j11 = s11;
        long j12 = (j11 << 18) * (64 & j10);
        long j13 = j10 ^ (j10 << 21);
        long j14 = ((j11 * (j13 & 8589934624L)) << 15) ^ (((((j12 ^ ((268435457 & j13) * j11)) ^ (((536870914 & j13) * j11) << 3)) ^ (((1073741828 & j13) * j11) << 6)) ^ (((2147483656L & j13) * j11) << 9)) ^ (((4294967312L & j13) * j11) << 12));
        for (int i = 0; i < 6; i++) {
            long j15 = jArr[i] & j14;
            j14 ^= (j15 >> 13) ^ (((j15 >> 9) ^ (j15 >> 10)) ^ (j15 >> 12));
        }
        return (short) (j14 & this.GFMASK);
    }

    private short gf_sqmul(short s10, short s11) {
        long[] jArr = {137170518016L, 267911168, 516096};
        long j10 = s10;
        long j11 = s11;
        long j12 = (j11 << 6) * (64 & j10);
        long j13 = j10 ^ (j10 << 7);
        long j14 = ((j11 * (j13 & 524320)) << 5) ^ (((((j12 ^ ((16385 & j13) * j11)) ^ (((32770 & j13) * j11) << 1)) ^ (((65540 & j13) * j11) << 2)) ^ (((131080 & j13) * j11) << 3)) ^ (((262160 & j13) * j11) << 4));
        for (int i = 0; i < 3; i++) {
            long j15 = jArr[i] & j14;
            j14 ^= (j15 >> 13) ^ (((j15 >> 9) ^ (j15 >> 10)) ^ (j15 >> 12));
        }
        return (short) (j14 & this.GFMASK);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_frac(short s10, short s11) {
        short gf_sqmul = gf_sqmul(s10, s10);
        short gf_sq2mul = gf_sq2mul(gf_sqmul, gf_sqmul);
        return gf_sqmul(gf_sq2mul(gf_sq2(gf_sq2mul(gf_sq2(gf_sq2mul), gf_sq2mul)), gf_sq2mul), s11);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_inv(short s10) {
        return gf_frac(s10, (short) 1);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_mul(short s10, short s11) {
        long j10 = s10;
        long j11 = s11;
        long j12 = (1 & j11) * j10;
        for (int i = 1; i < this.GFBITS; i++) {
            j12 ^= ((1 << i) & j11) * j10;
        }
        long j13 = 33488896 & j12;
        long j14 = 57344 & (((j13 >> 13) ^ (((j13 >> 9) ^ (j13 >> 10)) ^ (j13 >> 12))) ^ j12);
        return (short) ((r10 ^ ((((j14 >> 10) ^ (j14 >> 9)) ^ (j14 >> 12)) ^ (j14 >> 13))) & this.GFMASK);
    }

    public short gf_sq2(short s10) {
        long[] jArr = {1229782938247303441L, 217020518514230019L, 4222189076152335L, 1095216660735L};
        long[] jArr2 = {561850441793536L, 1097364144128L, 2143289344, 4186112};
        long j10 = s10;
        long j11 = (j10 | (j10 << 24)) & jArr[3];
        long j12 = (j11 | (j11 << 12)) & jArr[2];
        long j13 = (j12 | (j12 << 6)) & jArr[1];
        long j14 = (j13 | (j13 << 3)) & jArr[0];
        for (int i = 0; i < 4; i++) {
            long j15 = jArr2[i] & j14;
            j14 ^= (j15 >> 13) ^ (((j15 >> 9) ^ (j15 >> 10)) ^ (j15 >> 12));
        }
        return (short) (this.GFMASK & j14);
    }
}
