package org.bouncycastle.math.raw;

/* loaded from: classes.dex */
public abstract class Bits {
    public static int bitPermuteStep(int i, int i9, int i10) {
        int i11 = i9 & ((i >>> i10) ^ i);
        return i ^ (i11 ^ (i11 << i10));
    }

    public static int bitPermuteStepSimple(int i, int i9, int i10) {
        return ((i >>> i10) & i9) | ((i & i9) << i10);
    }

    public static long bitPermuteStep(long j10, long j11, int i) {
        long j12 = j11 & ((j10 >>> i) ^ j10);
        return j10 ^ (j12 ^ (j12 << i));
    }

    public static long bitPermuteStepSimple(long j10, long j11, int i) {
        return ((j10 >>> i) & j11) | ((j10 & j11) << i);
    }
}
