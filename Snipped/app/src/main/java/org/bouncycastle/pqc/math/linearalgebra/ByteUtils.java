package org.bouncycastle.pqc.math.linearalgebra;

import C.v;
import org.jmrtd.PassportService;

/* loaded from: classes3.dex */
public final class ByteUtils {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private ByteUtils() {
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static int deepHashCode(byte[] bArr) {
        int i = 1;
        for (byte b9 : bArr) {
            i = (i * 31) + b9;
        }
        return i;
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z10 &= bArr[length] == bArr2[length];
        }
        return z10;
    }

    public static byte[] fromHexString(String str) {
        char[] charArray = str.toUpperCase().toCharArray();
        int i = 0;
        for (char c2 : charArray) {
            if ((c2 >= '0' && c2 <= '9') || (c2 >= 'A' && c2 <= 'F')) {
                i++;
            }
        }
        byte[] bArr = new byte[(i + 1) >> 1];
        int i9 = i & 1;
        for (char c10 : charArray) {
            if (c10 < '0' || c10 > '9') {
                if (c10 >= 'A' && c10 <= 'F') {
                    int i10 = i9 >> 1;
                    byte b9 = (byte) (bArr[i10] << 4);
                    bArr[i10] = b9;
                    bArr[i10] = (byte) ((c10 - '7') | b9);
                }
            } else {
                int i11 = i9 >> 1;
                byte b10 = (byte) (bArr[i11] << 4);
                bArr[i11] = b10;
                bArr[i11] = (byte) ((c10 - '0') | b10);
            }
            i9++;
        }
        return bArr;
    }

    public static byte[][] split(byte[] bArr, int i) {
        if (i > bArr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        byte[][] bArr2 = {new byte[i], new byte[bArr.length - i]};
        System.arraycopy(bArr, 0, bArr2[0], 0, i);
        System.arraycopy(bArr, i, bArr2[1], 0, bArr.length - i);
        return bArr2;
    }

    public static byte[] subArray(byte[] bArr, int i) {
        return subArray(bArr, i, bArr.length);
    }

    public static String toBinaryString(byte[] bArr) {
        String str = "";
        for (int i = 0; i < bArr.length; i++) {
            byte b9 = bArr[i];
            for (int i9 = 0; i9 < 8; i9++) {
                str = str + ((b9 >>> i9) & 1);
            }
            if (i != bArr.length - 1) {
                str = v.n(str, " ");
            }
        }
        return str;
    }

    public static char[] toCharArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = (char) bArr[i];
        }
        return cArr;
    }

    public static String toHexString(byte[] bArr) {
        String str = "";
        for (int i = 0; i < bArr.length; i++) {
            StringBuilder s10 = v.s(str);
            char[] cArr = HEX_CHARS;
            s10.append(cArr[(bArr[i] >>> 4) & 15]);
            StringBuilder s11 = v.s(s10.toString());
            s11.append(cArr[bArr[i] & PassportService.SFI_DG15]);
            str = s11.toString();
        }
        return str;
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr3[length] = (byte) (bArr[length] ^ bArr2[length]);
        }
        return bArr3;
    }

    public static byte[] concatenate(byte[][] bArr) {
        int length = bArr[0].length;
        byte[] bArr2 = new byte[bArr.length * length];
        int i = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i, length);
            i += length;
        }
        return bArr2;
    }

    public static int deepHashCode(byte[][] bArr) {
        int i = 1;
        for (byte[] bArr2 : bArr) {
            i = (i * 31) + deepHashCode(bArr2);
        }
        return i;
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z10 &= equals(bArr[length], bArr2[length]);
        }
        return z10;
    }

    public static byte[] subArray(byte[] bArr, int i, int i9) {
        int i10 = i9 - i;
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i, bArr2, 0, i10);
        return bArr2;
    }

    public static int deepHashCode(byte[][][] bArr) {
        int i = 1;
        for (byte[][] bArr2 : bArr) {
            i = (i * 31) + deepHashCode(bArr2);
        }
        return i;
    }

    public static boolean equals(byte[][][] bArr, byte[][][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte[][] bArr3 = bArr[length];
            if (bArr3.length != bArr2[length].length) {
                return false;
            }
            for (int length2 = bArr3.length - 1; length2 >= 0; length2--) {
                z10 &= equals(bArr[length][length2], bArr2[length][length2]);
            }
        }
        return z10;
    }

    public static String toHexString(byte[] bArr, String str, String str2) {
        String str3 = new String(str);
        for (int i = 0; i < bArr.length; i++) {
            StringBuilder s10 = v.s(str3);
            char[] cArr = HEX_CHARS;
            s10.append(cArr[(bArr[i] >>> 4) & 15]);
            StringBuilder s11 = v.s(s10.toString());
            s11.append(cArr[bArr[i] & PassportService.SFI_DG15]);
            str3 = s11.toString();
            if (i < bArr.length - 1) {
                str3 = v.n(str3, str2);
            }
        }
        return str3;
    }
}
