package org.bouncycastle.util;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class Pack {
    public static int bigEndianToInt(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long bigEndianToLong(byte[] bArr, int i) {
        int bigEndianToInt = bigEndianToInt(bArr, i);
        return (bigEndianToInt(bArr, i + 4) & BodyPartID.bodyIdMax) | ((bigEndianToInt & BodyPartID.bodyIdMax) << 32);
    }

    public static short bigEndianToShort(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public static void intToBigEndian(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) (i >>> 24);
        bArr[i9 + 1] = (byte) (i >>> 16);
        bArr[i9 + 2] = (byte) (i >>> 8);
        bArr[i9 + 3] = (byte) i;
    }

    public static void intToLittleEndian(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) i;
        bArr[i9 + 1] = (byte) (i >>> 8);
        bArr[i9 + 2] = (byte) (i >>> 16);
        bArr[i9 + 3] = (byte) (i >>> 24);
    }

    public static int littleEndianToInt(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long littleEndianToLong(byte[] bArr, int i) {
        return ((littleEndianToInt(bArr, i + 4) & BodyPartID.bodyIdMax) << 32) | (littleEndianToInt(bArr, i) & BodyPartID.bodyIdMax);
    }

    public static short littleEndianToShort(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static void longToBigEndian(long j10, byte[] bArr, int i) {
        intToBigEndian((int) (j10 >>> 32), bArr, i);
        intToBigEndian((int) (j10 & BodyPartID.bodyIdMax), bArr, i + 4);
    }

    public static void longToLittleEndian(long j10, byte[] bArr, int i) {
        intToLittleEndian((int) (BodyPartID.bodyIdMax & j10), bArr, i);
        intToLittleEndian((int) (j10 >>> 32), bArr, i + 4);
    }

    public static void shortToBigEndian(short s10, byte[] bArr, int i) {
        bArr[i] = (byte) (s10 >>> 8);
        bArr[i + 1] = (byte) s10;
    }

    public static void shortToLittleEndian(short s10, byte[] bArr, int i) {
        bArr[i] = (byte) s10;
        bArr[i + 1] = (byte) (s10 >>> 8);
    }

    public static void bigEndianToInt(byte[] bArr, int i, int[] iArr) {
        for (int i9 = 0; i9 < iArr.length; i9++) {
            iArr[i9] = bigEndianToInt(bArr, i);
            i += 4;
        }
    }

    public static void bigEndianToLong(byte[] bArr, int i, long[] jArr) {
        for (int i9 = 0; i9 < jArr.length; i9++) {
            jArr[i9] = bigEndianToLong(bArr, i);
            i += 8;
        }
    }

    public static void intToBigEndian(int[] iArr, int i, int i9, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < i9; i11++) {
            intToBigEndian(iArr[i + i11], bArr, i10);
            i10 += 4;
        }
    }

    public static void intToLittleEndian(int[] iArr, int i, int i9, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < i9; i11++) {
            intToLittleEndian(iArr[i + i11], bArr, i10);
            i10 += 4;
        }
    }

    public static void littleEndianToInt(byte[] bArr, int i, int[] iArr) {
        for (int i9 = 0; i9 < iArr.length; i9++) {
            iArr[i9] = littleEndianToInt(bArr, i);
            i += 4;
        }
    }

    public static void littleEndianToLong(byte[] bArr, int i, long[] jArr) {
        for (int i9 = 0; i9 < jArr.length; i9++) {
            jArr[i9] = littleEndianToLong(bArr, i);
            i += 8;
        }
    }

    public static void longToBigEndian(long j10, byte[] bArr, int i, int i9) {
        for (int i10 = i9 - 1; i10 >= 0; i10--) {
            bArr[i10 + i] = (byte) (255 & j10);
            j10 >>>= 8;
        }
    }

    public static void longToLittleEndian(long[] jArr, int i, int i9, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < i9; i11++) {
            longToLittleEndian(jArr[i + i11], bArr, i10);
            i10 += 8;
        }
    }

    public static byte[] shortToBigEndian(short s10) {
        byte[] bArr = new byte[2];
        shortToBigEndian(s10, bArr, 0);
        return bArr;
    }

    public static byte[] shortToLittleEndian(short s10) {
        byte[] bArr = new byte[2];
        shortToLittleEndian(s10, bArr, 0);
        return bArr;
    }

    public static void bigEndianToInt(byte[] bArr, int i, int[] iArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i9 + i11] = bigEndianToInt(bArr, i);
            i += 4;
        }
    }

    public static void bigEndianToLong(byte[] bArr, int i, long[] jArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i9 + i11] = bigEndianToLong(bArr, i);
            i += 8;
        }
    }

    public static void intToBigEndian(int[] iArr, byte[] bArr, int i) {
        for (int i9 : iArr) {
            intToBigEndian(i9, bArr, i);
            i += 4;
        }
    }

    public static void intToLittleEndian(int[] iArr, byte[] bArr, int i) {
        for (int i9 : iArr) {
            intToLittleEndian(i9, bArr, i);
            i += 4;
        }
    }

    public static void littleEndianToInt(byte[] bArr, int i, int[] iArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i9 + i11] = littleEndianToInt(bArr, i);
            i += 4;
        }
    }

    public static void littleEndianToLong(byte[] bArr, int i, long[] jArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i9 + i11] = littleEndianToLong(bArr, i);
            i += 8;
        }
    }

    public static void longToBigEndian(long[] jArr, int i, int i9, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < i9; i11++) {
            longToBigEndian(jArr[i + i11], bArr, i10);
            i10 += 8;
        }
    }

    public static void longToLittleEndian(long[] jArr, byte[] bArr, int i) {
        for (long j10 : jArr) {
            longToLittleEndian(j10, bArr, i);
            i += 8;
        }
    }

    public static byte[] intToBigEndian(int i) {
        byte[] bArr = new byte[4];
        intToBigEndian(i, bArr, 0);
        return bArr;
    }

    public static byte[] intToLittleEndian(int i) {
        byte[] bArr = new byte[4];
        intToLittleEndian(i, bArr, 0);
        return bArr;
    }

    public static int[] littleEndianToInt(byte[] bArr, int i, int i9) {
        int[] iArr = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr[i10] = littleEndianToInt(bArr, i);
            i += 4;
        }
        return iArr;
    }

    public static void longToBigEndian(long[] jArr, byte[] bArr, int i) {
        for (long j10 : jArr) {
            longToBigEndian(j10, bArr, i);
            i += 8;
        }
    }

    public static byte[] longToLittleEndian(long j10) {
        byte[] bArr = new byte[8];
        longToLittleEndian(j10, bArr, 0);
        return bArr;
    }

    public static byte[] intToBigEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToBigEndian(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] intToLittleEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToLittleEndian(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] longToBigEndian(long j10) {
        byte[] bArr = new byte[8];
        longToBigEndian(j10, bArr, 0);
        return bArr;
    }

    public static byte[] longToLittleEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToLittleEndian(jArr, bArr, 0);
        return bArr;
    }

    public static byte[] longToBigEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToBigEndian(jArr, bArr, 0);
        return bArr;
    }
}
