package com.airbnb.epoxy;

/* loaded from: classes.dex */
public final class IdUtils {
    private IdUtils() {
    }

    public static long hashLong64Bit(long j10) {
        long j11 = j10 ^ (j10 << 21);
        long j12 = j11 ^ (j11 >>> 35);
        return j12 ^ (j12 << 4);
    }

    public static long hashString64Bit(CharSequence charSequence) {
        if (charSequence == null) {
            return 0L;
        }
        long j10 = -3750763034362895579L;
        for (int i = 0; i < charSequence.length(); i++) {
            j10 = (j10 ^ charSequence.charAt(i)) * 1099511628211L;
        }
        return j10;
    }
}
