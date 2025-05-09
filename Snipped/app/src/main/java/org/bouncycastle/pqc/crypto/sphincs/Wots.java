package org.bouncycastle.pqc.crypto.sphincs;

import org.jmrtd.PassportService;

/* loaded from: classes3.dex */
class Wots {
    static final int WOTS_L = 67;
    static final int WOTS_L1 = 64;
    static final int WOTS_LOGW = 4;
    static final int WOTS_LOG_L = 7;
    static final int WOTS_SIGBYTES = 2144;
    static final int WOTS_W = 16;

    private static void clear(byte[] bArr, int i, int i9) {
        for (int i10 = 0; i10 != i9; i10++) {
            bArr[i10 + i] = 0;
        }
    }

    public static void expand_seed(byte[] bArr, int i, byte[] bArr2, int i9) {
        clear(bArr, i, WOTS_SIGBYTES);
        Seed.prg(bArr, i, 2144L, bArr2, i9);
    }

    public static void gen_chain(HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, int i10, int i11) {
        for (int i12 = 0; i12 < 32; i12++) {
            bArr[i12 + i] = bArr2[i12 + i9];
        }
        for (int i13 = 0; i13 < i11 && i13 < 16; i13++) {
            hashFunctions.hash_n_n_mask(bArr, i, bArr, i, bArr3, (i13 * 32) + i10);
        }
    }

    public void wots_pkgen(HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, int i10) {
        expand_seed(bArr, i, bArr2, i9);
        for (int i11 = 0; i11 < 67; i11++) {
            int i12 = (i11 * 32) + i;
            gen_chain(hashFunctions, bArr, i12, bArr, i12, bArr3, i10, 15);
        }
    }

    public void wots_sign(HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i9 = 0;
        int i10 = 0;
        while (i9 < 64) {
            byte b9 = bArr2[i9 / 2];
            iArr[i9] = b9 & PassportService.SFI_DG15;
            int i11 = (b9 & 255) >>> 4;
            iArr[i9 + 1] = i11;
            i10 = (15 - i11) + (15 - iArr[i9]) + i10;
            i9 += 2;
        }
        while (i9 < 67) {
            iArr[i9] = i10 & 15;
            i10 >>>= 4;
            i9++;
        }
        expand_seed(bArr, i, bArr3, 0);
        for (int i12 = 0; i12 < 67; i12++) {
            int i13 = (i12 * 32) + i;
            gen_chain(hashFunctions, bArr, i13, bArr, i13, bArr4, 0, iArr[i12]);
        }
    }

    public void wots_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i9 = 0;
        int i10 = 0;
        while (i9 < 64) {
            byte b9 = bArr3[i9 / 2];
            iArr[i9] = b9 & PassportService.SFI_DG15;
            int i11 = (b9 & 255) >>> 4;
            iArr[i9 + 1] = i11;
            i10 = (15 - i11) + (15 - iArr[i9]) + i10;
            i9 += 2;
        }
        while (i9 < 67) {
            iArr[i9] = i10 & 15;
            i10 >>>= 4;
            i9++;
        }
        for (int i12 = 0; i12 < 67; i12++) {
            int i13 = i12 * 32;
            int i14 = iArr[i12];
            gen_chain(hashFunctions, bArr, i13, bArr2, i + i13, bArr4, i14 * 32, 15 - i14);
        }
    }
}
