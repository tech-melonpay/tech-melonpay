package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
class BENES12 extends BENES {
    public BENES12(int i, int i9, int i10) {
        super(i, i9, i10);
    }

    private void apply_benes(byte[] bArr, byte[] bArr2, int i) {
        int i9;
        int i10;
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        for (int i11 = 0; i11 < 64; i11++) {
            jArr[i11] = Utils.load8(bArr, i11 * 8);
        }
        int i12 = 256;
        if (i == 0) {
            i9 = (this.SYS_T * 2) + 40;
        } else {
            i9 = (this.SYS_T * 2) + 40 + (((this.GFBITS * 2) - 2) * 256);
            i12 = -256;
        }
        BENES.transpose_64x64(jArr, jArr);
        int i13 = 0;
        while (true) {
            if (i13 > 5) {
                break;
            }
            for (int i14 = 0; i14 < 64; i14++) {
                jArr2[i14] = Utils.load4(bArr2, (i14 * 4) + i9);
            }
            BENES.transpose_64x64(jArr2, jArr2);
            layerBenes(jArr, jArr2, i13);
            i9 += i12;
            i13++;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (int i15 = 0; i15 <= 5; i15++) {
            for (int i16 = 0; i16 < 32; i16++) {
                jArr2[i16] = Utils.load8(bArr2, (i16 * 8) + i9);
            }
            layerBenes(jArr, jArr2, i15);
            i9 += i12;
        }
        for (int i17 = 4; i17 >= 0; i17--) {
            for (int i18 = 0; i18 < 32; i18++) {
                jArr2[i18] = Utils.load8(bArr2, (i18 * 8) + i9);
            }
            layerBenes(jArr, jArr2, i17);
            i9 += i12;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (i10 = 5; i10 >= 0; i10--) {
            for (int i19 = 0; i19 < 64; i19++) {
                jArr2[i19] = Utils.load4(bArr2, (i19 * 4) + i9);
            }
            BENES.transpose_64x64(jArr2, jArr2);
            layerBenes(jArr, jArr2, i10);
            i9 += i12;
        }
        BENES.transpose_64x64(jArr, jArr);
        for (int i20 = 0; i20 < 64; i20++) {
            Utils.store8(bArr, i20 * 8, jArr[i20]);
        }
    }

    public static void layerBenes(long[] jArr, long[] jArr2, int i) {
        int i9 = 1 << i;
        int i10 = 0;
        for (int i11 = 0; i11 < 64; i11 += i9 * 2) {
            int i12 = i11;
            while (i12 < i11 + i9) {
                long j10 = jArr[i12];
                int i13 = i12 + i9;
                long j11 = (jArr[i13] ^ j10) & jArr2[i10];
                jArr[i12] = j10 ^ j11;
                jArr[i13] = jArr[i13] ^ j11;
                i12++;
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.BENES
    public void support_gen(short[] sArr, byte[] bArr) {
        int i = this.GFBITS;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i, (1 << i) / 8);
        for (int i9 = 0; i9 < this.GFBITS; i9++) {
            for (int i10 = 0; i10 < (1 << this.GFBITS) / 8; i10++) {
                bArr2[i9][i10] = 0;
            }
        }
        int i11 = 0;
        while (true) {
            int i12 = this.GFBITS;
            if (i11 >= (1 << i12)) {
                break;
            }
            short bitrev = Utils.bitrev((short) i11, i12);
            for (int i13 = 0; i13 < this.GFBITS; i13++) {
                byte[] bArr3 = bArr2[i13];
                int i14 = i11 / 8;
                bArr3[i14] = (byte) (bArr3[i14] | (((bitrev >> i13) & 1) << (i11 % 8)));
            }
            i11++;
        }
        for (int i15 = 0; i15 < this.GFBITS; i15++) {
            apply_benes(bArr2[i15], bArr, 0);
        }
        for (int i16 = 0; i16 < this.SYS_N; i16++) {
            sArr[i16] = 0;
            for (int i17 = this.GFBITS - 1; i17 >= 0; i17--) {
                short s10 = (short) (sArr[i16] << 1);
                sArr[i16] = s10;
                sArr[i16] = (short) (s10 | ((bArr2[i17][i16 / 8] >> (i16 % 8)) & 1));
            }
        }
    }
}
