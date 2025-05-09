package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
abstract class BENES {
    protected final int GFBITS;
    protected final int SYS_N;
    protected final int SYS_T;

    public BENES(int i, int i9, int i10) {
        this.SYS_N = i;
        this.SYS_T = i9;
        this.GFBITS = i10;
    }

    public static void transpose_64x64(long[] jArr, long[] jArr2) {
        long[][] jArr3 = {new long[]{6148914691236517205L, -6148914691236517206L}, new long[]{3689348814741910323L, -3689348814741910324L}, new long[]{1085102592571150095L, -1085102592571150096L}, new long[]{71777214294589695L, -71777214294589696L}, new long[]{281470681808895L, -281470681808896L}, new long[]{BodyPartID.bodyIdMax, -4294967296L}};
        for (int i = 0; i < 64; i++) {
            jArr[i] = jArr2[i];
        }
        for (int i9 = 5; i9 >= 0; i9--) {
            int i10 = 1 << i9;
            for (int i11 = 0; i11 < 64; i11 += i10 * 2) {
                for (int i12 = i11; i12 < i11 + i10; i12++) {
                    long j10 = jArr[i12];
                    long[] jArr4 = jArr3[i9];
                    long j11 = jArr4[0];
                    int i13 = i12 + i10;
                    long j12 = jArr[i13];
                    long j13 = jArr4[1];
                    jArr[i12] = ((j12 & j11) << i10) | (j10 & j11);
                    jArr[i13] = ((j10 & j13) >>> i10) | (j12 & j13);
                }
            }
        }
    }

    public abstract void support_gen(short[] sArr, byte[] bArr);

    public static void transpose_64x64(long[] jArr, long[] jArr2, int i) {
        long[][] jArr3 = {new long[]{6148914691236517205L, -6148914691236517206L}, new long[]{3689348814741910323L, -3689348814741910324L}, new long[]{1085102592571150095L, -1085102592571150096L}, new long[]{71777214294589695L, -71777214294589696L}, new long[]{281470681808895L, -281470681808896L}, new long[]{BodyPartID.bodyIdMax, -4294967296L}};
        for (int i9 = 0; i9 < 64; i9++) {
            int i10 = i9 + i;
            jArr[i10] = jArr2[i10];
        }
        for (int i11 = 5; i11 >= 0; i11--) {
            int i12 = 1 << i11;
            for (int i13 = 0; i13 < 64; i13 += i12 * 2) {
                for (int i14 = i13; i14 < i13 + i12; i14++) {
                    long j10 = jArr[i14 + i];
                    long[] jArr4 = jArr3[i11];
                    long j11 = jArr4[0];
                    int i15 = i14 + i12 + i;
                    long j12 = jArr[i15];
                    long j13 = jArr4[1];
                    jArr[i14 + i] = ((j12 & j11) << i12) | (j10 & j11);
                    jArr[i15] = ((j10 & j13) >>> i12) | (j12 & j13);
                }
            }
        }
    }
}
