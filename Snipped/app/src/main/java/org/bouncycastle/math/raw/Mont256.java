package org.bouncycastle.math.raw;

/* loaded from: classes.dex */
public abstract class Mont256 {

    /* renamed from: M, reason: collision with root package name */
    private static final long f25307M = 4294967295L;

    public static int inverse32(int i) {
        int i9 = (2 - (i * i)) * i;
        int i10 = (2 - (i * i9)) * i9;
        int i11 = (2 - (i * i10)) * i10;
        return (2 - (i * i11)) * i11;
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        char c2 = 0;
        long j10 = iArr2[0] & 4294967295L;
        int i9 = 0;
        int i10 = 0;
        while (i9 < 8) {
            long j11 = iArr[i9] & 4294967295L;
            long j12 = j11 * j10;
            long j13 = j10;
            long j14 = (((int) r10) * i) & 4294967295L;
            int i11 = i9;
            int i12 = i10;
            long j15 = (iArr4[c2] & 4294967295L) * j14;
            char c10 = ' ';
            long j16 = ((((j12 & 4294967295L) + (iArr3[c2] & 4294967295L)) + (j15 & 4294967295L)) >>> 32) + (j12 >>> 32) + (j15 >>> 32);
            int i13 = 1;
            while (i13 < 8) {
                long j17 = (iArr2[i13] & 4294967295L) * j11;
                long j18 = (iArr4[i13] & 4294967295L) * j14;
                long j19 = (j17 & 4294967295L) + (j18 & 4294967295L) + (iArr3[i13] & 4294967295L) + j16;
                iArr3[i13 - 1] = (int) j19;
                j16 = (j19 >>> 32) + (j17 >>> 32) + (j18 >>> 32);
                i13++;
                c10 = ' ';
                j14 = j14;
            }
            long j20 = j16 + (i12 & 4294967295L);
            iArr3[7] = (int) j20;
            i10 = (int) (j20 >>> c10);
            i9 = i11 + 1;
            j10 = j13;
            c2 = 0;
        }
        if (i10 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c2 = 0;
        long j10 = iArr2[0] & 4294967295L;
        int i = 0;
        int i9 = 0;
        while (true) {
            if (i >= 8) {
                break;
            }
            long j11 = iArr[i] & 4294967295L;
            long j12 = (j11 * j10) + (iArr3[c2] & 4294967295L);
            long j13 = j12 & 4294967295L;
            long j14 = (j12 >>> 32) + j13;
            int i10 = 1;
            for (int i11 = 8; i10 < i11; i11 = 8) {
                long j15 = j10;
                long j16 = (iArr2[i10] & 4294967295L) * j11;
                long j17 = (iArr4[i10] & 4294967295L) * j13;
                long j18 = (j16 & 4294967295L) + (j17 & 4294967295L) + (iArr3[i10] & 4294967295L) + j14;
                iArr3[i10 - 1] = (int) j18;
                j14 = (j18 >>> 32) + (j16 >>> 32) + (j17 >>> 32);
                i10++;
                j10 = j15;
                j11 = j11;
                j13 = j13;
            }
            long j19 = j14 + (i9 & 4294967295L);
            iArr3[7] = (int) j19;
            i9 = (int) (j19 >>> 32);
            i++;
            j10 = j10;
            c2 = 0;
        }
        if (i9 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i) {
        char c2 = 0;
        int i9 = 0;
        while (i9 < 8) {
            long j10 = (r5 * i) & 4294967295L;
            long j11 = (((iArr2[c2] & 4294967295L) * j10) + (iArr[c2] & 4294967295L)) >>> 32;
            int i10 = 1;
            while (i10 < 8) {
                long j12 = ((iArr2[i10] & 4294967295L) * j10) + (iArr[i10] & 4294967295L) + j11;
                iArr[i10 - 1] = (int) j12;
                j11 = j12 >>> 32;
                i10++;
                i9 = i9;
            }
            iArr[7] = (int) j11;
            i9++;
            c2 = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 8; i++) {
            long j10 = iArr[0] & 4294967295L;
            long j11 = j10;
            for (int i9 = 1; i9 < 8; i9++) {
                long j12 = ((iArr2[i9] & 4294967295L) * j10) + (iArr[i9] & 4294967295L) + j11;
                iArr[i9 - 1] = (int) j12;
                j11 = j12 >>> 32;
            }
            iArr[7] = (int) j11;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}
