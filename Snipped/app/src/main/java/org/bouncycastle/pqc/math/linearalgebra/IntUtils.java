package org.bouncycastle.pqc.math.linearalgebra;

import C.v;
import s3.b;

/* loaded from: classes3.dex */
public final class IntUtils {
    private IntUtils() {
    }

    public static int[] clone(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z10 &= iArr[length] == iArr2[length];
        }
        return z10;
    }

    public static void fill(int[] iArr, int i) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = i;
        }
    }

    private static int partition(int[] iArr, int i, int i9, int i10) {
        int i11 = iArr[i10];
        iArr[i10] = iArr[i9];
        iArr[i9] = i11;
        int i12 = i;
        while (i < i9) {
            int i13 = iArr[i];
            if (i13 <= i11) {
                int i14 = iArr[i12];
                iArr[i12] = i13;
                iArr[i] = i14;
                i12++;
            }
            i++;
        }
        int i15 = iArr[i12];
        iArr[i12] = iArr[i9];
        iArr[i9] = i15;
        return i12;
    }

    public static void quicksort(int[] iArr) {
        quicksort(iArr, 0, iArr.length - 1);
    }

    public static int[] subArray(int[] iArr, int i, int i9) {
        int i10 = i9 - i;
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, i, iArr2, 0, i10);
        return iArr2;
    }

    public static String toHexString(int[] iArr) {
        return ByteUtils.toHexString(BigEndianConversions.toByteArray(iArr));
    }

    public static String toString(int[] iArr) {
        String str = "";
        for (int i : iArr) {
            str = b.m(v.s(str), i, " ");
        }
        return str;
    }

    public static void quicksort(int[] iArr, int i, int i9) {
        if (i9 > i) {
            int partition = partition(iArr, i, i9, i9);
            quicksort(iArr, i, partition - 1);
            quicksort(iArr, partition + 1, i9);
        }
    }
}
