package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class ErrorCorrection {
    public static short LDDecode(int i, int i9, int i10, int i11) {
        return (short) (((((g(i) + g(i9)) + g(i10)) + g(i11)) - 98312) >>> 31);
    }

    public static int abs(int i) {
        int i9 = i >> 31;
        return (i ^ i9) - i9;
    }

    public static int f(int[] iArr, int i, int i9, int i10) {
        int i11 = (i10 * 2730) >> 25;
        int i12 = i11 - ((12288 - (i10 - (i11 * 12289))) >> 31);
        iArr[i] = (i12 >> 1) + (i12 & 1);
        int i13 = i12 - 1;
        iArr[i9] = (i13 >> 1) + (i13 & 1);
        return abs(i10 - (iArr[i] * 24578));
    }

    public static int g(int i) {
        int i9 = (i * 2730) >> 27;
        int i10 = i9 - ((CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA - (i - (CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA * i9))) >> 31);
        return abs((((i10 >> 1) + (i10 & 1)) * 98312) - i);
    }

    public static void helpRec(short[] sArr, short[] sArr2, byte[] bArr, byte b9) {
        short s10 = 8;
        byte[] bArr2 = new byte[8];
        bArr2[0] = b9;
        byte[] bArr3 = new byte[32];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 32);
        int[] iArr = new int[8];
        int i = 0;
        while (i < 256) {
            int i9 = ((bArr3[i >>> 3] >>> (i & 7)) & 1) * 4;
            int i10 = i + 256;
            int i11 = i + 512;
            int i12 = i + 768;
            int f10 = (24577 - (((f(iArr, 0, 4, (sArr2[i] * s10) + i9) + f(iArr, 1, 5, (sArr2[i10] * s10) + i9)) + f(iArr, 2, 6, (sArr2[i11] * s10) + i9)) + f(iArr, 3, 7, (sArr2[i12] * s10) + i9))) >> 31;
            int i13 = ~f10;
            int[] iArr2 = {(i13 & iArr[0]) ^ (iArr[4] & f10), (i13 & iArr[1]) ^ (iArr[5] & f10), (i13 & iArr[2]) ^ (iArr[6] & f10), (iArr[7] & f10) ^ (i13 & iArr[3])};
            int i14 = iArr2[0];
            int i15 = iArr2[3];
            sArr[i] = (short) ((i14 - i15) & 3);
            sArr[i10] = (short) ((iArr2[1] - i15) & 3);
            sArr[i11] = (short) ((iArr2[2] - i15) & 3);
            sArr[i12] = (short) (((i15 * 2) + (-f10)) & 3);
            i++;
            s10 = 8;
        }
    }

    public static void rec(byte[] bArr, short[] sArr, short[] sArr2) {
        Arrays.fill(bArr, (byte) 0);
        for (int i = 0; i < 256; i++) {
            int i9 = (sArr[i] * 8) + 196624;
            int i10 = sArr2[i] * 2;
            int i11 = i + 768;
            short s10 = sArr2[i11];
            int i12 = i9 - ((i10 + s10) * 12289);
            int i13 = i + 256;
            int i14 = ((sArr[i13] * 8) + 196624) - (((sArr2[i13] * 2) + s10) * 12289);
            int i15 = i + 512;
            int[] iArr = {i12, i14, ((sArr[i15] * 8) + 196624) - (((sArr2[i15] * 2) + s10) * 12289), ((sArr[i11] * 8) + 196624) - (s10 * 12289)};
            int i16 = i >>> 3;
            bArr[i16] = (byte) ((LDDecode(iArr[0], iArr[1], iArr[2], iArr[3]) << (i & 7)) | bArr[i16]);
        }
    }
}
