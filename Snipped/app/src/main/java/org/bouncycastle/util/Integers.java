package org.bouncycastle.util;

/* loaded from: classes3.dex */
public class Integers {
    public static final int BYTES = 4;
    public static final int SIZE = 32;

    public static int numberOfLeadingZeros(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    public static int numberOfTrailingZeros(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    public static int reverse(int i) {
        return Integer.reverse(i);
    }

    public static int reverseBytes(int i) {
        return Integer.reverseBytes(i);
    }

    public static int rotateLeft(int i, int i9) {
        return Integer.rotateLeft(i, i9);
    }

    public static int rotateRight(int i, int i9) {
        return Integer.rotateRight(i, i9);
    }

    public static Integer valueOf(int i) {
        return Integer.valueOf(i);
    }
}
