package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public class RandUtils {
    public static int nextInt(SecureRandom secureRandom, int i) {
        int nextInt;
        int i9;
        if (((-i) & i) == i) {
            return (int) ((i * (secureRandom.nextInt() >>> 1)) >> 31);
        }
        do {
            nextInt = secureRandom.nextInt() >>> 1;
            i9 = nextInt % i;
        } while ((i - 1) + (nextInt - i9) < 0);
        return i9;
    }
}
