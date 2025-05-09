package org.bouncycastle.crypto.params;

/* loaded from: classes2.dex */
public class DESedeParameters extends DESParameters {
    public static final int DES_EDE_KEY_LENGTH = 24;

    public DESedeParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0, bArr.length)) {
            throw new IllegalArgumentException("attempt to create weak DESede key");
        }
    }

    public static boolean isReal2Key(byte[] bArr, int i) {
        boolean z10 = false;
        for (int i9 = i; i9 != i + 8; i9++) {
            if (bArr[i9] != bArr[i9 + 8]) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean isReal3Key(byte[] bArr, int i) {
        int i9 = i;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            boolean z13 = true;
            if (i9 == i + 8) {
                break;
            }
            byte b9 = bArr[i9];
            byte b10 = bArr[i9 + 8];
            z10 |= b9 != b10;
            byte b11 = bArr[i9 + 16];
            z11 |= b9 != b11;
            if (b10 == b11) {
                z13 = false;
            }
            z12 |= z13;
            i9++;
        }
        return z10 && z11 && z12;
    }

    public static boolean isRealEDEKey(byte[] bArr, int i) {
        return bArr.length == 16 ? isReal2Key(bArr, i) : isReal3Key(bArr, i);
    }

    public static boolean isWeakKey(byte[] bArr, int i) {
        return isWeakKey(bArr, i, bArr.length - i);
    }

    public static boolean isWeakKey(byte[] bArr, int i, int i9) {
        while (i < i9) {
            if (DESParameters.isWeakKey(bArr, i)) {
                return true;
            }
            i += 8;
        }
        return false;
    }
}
