package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class Utils {
    public static short bitrev(short s10, int i) {
        short s11 = (short) (((s10 & 65280) >> 8) | ((s10 & 255) << 8));
        short s12 = (short) (((s11 & 61680) >> 4) | ((s11 & 3855) << 4));
        short s13 = (short) (((s12 & 52428) >> 2) | ((s12 & 13107) << 2));
        short s14 = (short) (((s13 & 43690) >> 1) | ((s13 & 21845) << 1));
        return (short) (i == 12 ? s14 >> 4 : s14 >> 3);
    }

    public static int load4(byte[] bArr, int i) {
        return Pack.littleEndianToInt(bArr, i);
    }

    public static long load8(byte[] bArr, int i) {
        return Pack.littleEndianToLong(bArr, i);
    }

    public static short load_gf(byte[] bArr, int i, int i9) {
        return (short) (Pack.littleEndianToShort(bArr, i) & i9);
    }

    public static void store8(byte[] bArr, int i, long j10) {
        bArr[i] = (byte) (j10 & 255);
        bArr[i + 1] = (byte) ((j10 >> 8) & 255);
        bArr[i + 2] = (byte) ((j10 >> 16) & 255);
        bArr[i + 3] = (byte) ((j10 >> 24) & 255);
        bArr[i + 4] = (byte) ((j10 >> 32) & 255);
        bArr[i + 5] = (byte) ((j10 >> 40) & 255);
        bArr[i + 6] = (byte) ((j10 >> 48) & 255);
        bArr[i + 7] = (byte) ((j10 >> 56) & 255);
    }

    public static void store_gf(byte[] bArr, int i, short s10) {
        bArr[i] = (byte) (s10 & 255);
        bArr[i + 1] = (byte) (s10 >> 8);
    }
}
