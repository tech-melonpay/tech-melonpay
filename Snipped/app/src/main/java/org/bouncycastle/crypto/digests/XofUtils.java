package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class XofUtils {
    public static byte[] encode(byte b9) {
        return Arrays.concatenate(leftEncode(8L), new byte[]{b9});
    }

    public static byte[] leftEncode(long j10) {
        long j11 = j10;
        byte b9 = 1;
        while (true) {
            j11 >>= 8;
            if (j11 == 0) {
                break;
            }
            b9 = (byte) (b9 + 1);
        }
        byte[] bArr = new byte[b9 + 1];
        bArr[0] = b9;
        for (int i = 1; i <= b9; i++) {
            bArr[i] = (byte) (j10 >> ((b9 - i) * 8));
        }
        return bArr;
    }

    public static byte[] rightEncode(long j10) {
        long j11 = j10;
        byte b9 = 1;
        while (true) {
            j11 >>= 8;
            if (j11 == 0) {
                break;
            }
            b9 = (byte) (b9 + 1);
        }
        byte[] bArr = new byte[b9 + 1];
        bArr[b9] = b9;
        for (int i = 0; i < b9; i++) {
            bArr[i] = (byte) (j10 >> (((b9 - i) - 1) * 8));
        }
        return bArr;
    }

    public static byte[] encode(byte[] bArr, int i, int i9) {
        return bArr.length == i9 ? Arrays.concatenate(leftEncode(i9 * 8), bArr) : Arrays.concatenate(leftEncode(i9 * 8), Arrays.copyOfRange(bArr, i, i9 + i));
    }
}
