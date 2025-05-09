package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
class BENES13 extends BENES {
    public BENES13(int i, int i9, int i10) {
        super(i, i9, i10);
    }

    public static void layer_ex(long[] jArr, long[] jArr2, int i) {
        int i9 = 1 << i;
        int i10 = 0;
        for (int i11 = 0; i11 < 128; i11 += i9 * 2) {
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

    public static void layer_in(long[] jArr, long[] jArr2, int i) {
        int i9 = 1 << i;
        int i10 = 0;
        for (int i11 = 0; i11 < 64; i11 += i9 * 2) {
            for (int i12 = i11; i12 < i11 + i9; i12++) {
                long j10 = jArr[i12];
                int i13 = i12 + i9;
                int i14 = i10 + 1;
                long j11 = (jArr[i13] ^ j10) & jArr2[i10];
                jArr[i12] = j10 ^ j11;
                jArr[i13] = jArr[i13] ^ j11;
                int i15 = i12 + 64;
                long j12 = jArr[i15];
                int i16 = i15 + i9;
                i10 += 2;
                long j13 = jArr2[i14] & (jArr[i16] ^ j12);
                jArr[i15] = j12 ^ j13;
                jArr[i16] = jArr[i16] ^ j13;
            }
        }
    }

    public void apply_benes(byte[] bArr, byte[] bArr2, int i) {
        int i9;
        int i10;
        int i11;
        long[] jArr = new long[128];
        long[] jArr2 = new long[128];
        long[] jArr3 = new long[64];
        long[] jArr4 = new long[64];
        if (i == 0) {
            i9 = (this.SYS_T * 2) + 40;
            i10 = 0;
        } else {
            i9 = (this.SYS_T * 2) + 12328;
            i10 = -1024;
        }
        for (int i12 = 0; i12 < 64; i12++) {
            int i13 = i12 * 16;
            jArr[i12] = Utils.load8(bArr, i13);
            jArr[i12 + 64] = Utils.load8(bArr, i13 + 8);
        }
        BENES.transpose_64x64(jArr2, jArr, 0);
        BENES.transpose_64x64(jArr2, jArr, 64);
        int i14 = 0;
        while (true) {
            if (i14 > 6) {
                break;
            }
            for (int i15 = 0; i15 < 64; i15++) {
                jArr3[i15] = Utils.load8(bArr2, i9);
                i9 += 8;
            }
            i9 += i10;
            BENES.transpose_64x64(jArr4, jArr3);
            layer_ex(jArr2, jArr4, i14);
            i14++;
        }
        BENES.transpose_64x64(jArr, jArr2, 0);
        BENES.transpose_64x64(jArr, jArr2, 64);
        for (int i16 = 0; i16 <= 5; i16++) {
            for (int i17 = 0; i17 < 64; i17++) {
                jArr3[i17] = Utils.load8(bArr2, i9);
                i9 += 8;
            }
            i9 += i10;
            layer_in(jArr, jArr3, i16);
        }
        for (int i18 = 4; i18 >= 0; i18--) {
            for (int i19 = 0; i19 < 64; i19++) {
                jArr3[i19] = Utils.load8(bArr2, i9);
                i9 += 8;
            }
            i9 += i10;
            layer_in(jArr, jArr3, i18);
        }
        BENES.transpose_64x64(jArr2, jArr, 0);
        BENES.transpose_64x64(jArr2, jArr, 64);
        for (i11 = 6; i11 >= 0; i11--) {
            for (int i20 = 0; i20 < 64; i20++) {
                jArr3[i20] = Utils.load8(bArr2, i9);
                i9 += 8;
            }
            i9 += i10;
            BENES.transpose_64x64(jArr4, jArr3);
            layer_ex(jArr2, jArr4, i11);
        }
        BENES.transpose_64x64(jArr, jArr2, 0);
        BENES.transpose_64x64(jArr, jArr2, 64);
        for (int i21 = 0; i21 < 64; i21++) {
            int i22 = i21 * 16;
            Utils.store8(bArr, i22, jArr[i21]);
            Utils.store8(bArr, i22 + 8, jArr[i21 + 64]);
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
