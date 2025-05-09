package org.bouncycastle.pqc.crypto.gmss.util;

/* loaded from: classes3.dex */
public class GMSSUtil {
    public int bytesToIntLittleEndian(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public byte[] concatenateArray(byte[][] bArr) {
        byte[] bArr2 = new byte[bArr.length * bArr[0].length];
        int i = 0;
        for (int i9 = 0; i9 < bArr.length; i9++) {
            byte[] bArr3 = bArr[i9];
            System.arraycopy(bArr3, 0, bArr2, i, bArr3.length);
            i += bArr[i9].length;
        }
        return bArr2;
    }

    public int getLog(int i) {
        int i9 = 1;
        int i10 = 2;
        while (i10 < i) {
            i10 <<= 1;
            i9++;
        }
        return i9;
    }

    public byte[] intToBytesLittleEndian(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public void printArray(String str, byte[] bArr) {
        System.out.println(str);
        int i = 0;
        for (byte b9 : bArr) {
            System.out.println(i + "; " + ((int) b9));
            i++;
        }
    }

    public boolean testPowerOfTwo(int i) {
        int i9 = 1;
        while (i9 < i) {
            i9 <<= 1;
        }
        return i == i9;
    }

    public int bytesToIntLittleEndian(byte[] bArr, int i) {
        int i9 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return ((bArr[i + 3] & 255) << 24) | i9 | ((bArr[i + 2] & 255) << 16);
    }

    public void printArray(String str, byte[][] bArr) {
        System.out.println(str);
        int i = 0;
        for (byte[] bArr2 : bArr) {
            for (int i9 = 0; i9 < bArr[0].length; i9++) {
                System.out.println(i + "; " + ((int) bArr2[i9]));
                i++;
            }
        }
    }
}
