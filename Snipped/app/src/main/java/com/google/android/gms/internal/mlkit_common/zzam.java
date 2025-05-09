package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public class zzam {
    public static int zza(int i, int i9) {
        if (i9 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i10 = i + (i >> 1) + 1;
        if (i10 < i9) {
            int highestOneBit = Integer.highestOneBit(i9 - 1);
            i10 = highestOneBit + highestOneBit;
        }
        if (i10 < 0) {
            return Integer.MAX_VALUE;
        }
        return i10;
    }
}
