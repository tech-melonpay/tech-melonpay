package org.bouncycastle.pqc.crypto.newhope;

import android.R;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;

/* loaded from: classes3.dex */
class Poly {
    public static void add(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < 1024; i++) {
            sArr3[i] = Reduce.barrett((short) (sArr[i] + sArr2[i]));
        }
    }

    public static void fromBytes(short[] sArr, byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            int i9 = i * 7;
            int i10 = bArr[i9] & 255;
            byte b9 = bArr[i9 + 1];
            int i11 = bArr[i9 + 2] & 255;
            byte b10 = bArr[i9 + 3];
            int i12 = bArr[i9 + 4] & 255;
            byte b11 = bArr[i9 + 5];
            int i13 = bArr[i9 + 6] & 255;
            int i14 = i * 4;
            sArr[i14] = (short) (i10 | ((b9 & 63) << 8));
            sArr[i14 + 1] = (short) (((b9 & 255) >>> 6) | (i11 << 2) | ((b10 & PassportService.SFI_DG15) << 10));
            sArr[i14 + 2] = (short) (((b10 & 255) >>> 4) | (i12 << 4) | ((b11 & 3) << 12));
            sArr[i14 + 3] = (short) ((i13 << 6) | ((b11 & 255) >>> 2));
        }
    }

    public static void fromNTT(short[] sArr) {
        NTT.bitReverse(sArr);
        NTT.core(sArr, Precomp.OMEGAS_INV_MONTGOMERY);
        NTT.mulCoefficients(sArr, Precomp.PSIS_INV_MONTGOMERY);
    }

    public static void getNoise(short[] sArr, byte[] bArr, byte b9) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b9;
        byte[] bArr3 = new byte[4096];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 4096);
        for (int i = 0; i < 1024; i++) {
            int bigEndianToInt = Pack.bigEndianToInt(bArr3, i * 4);
            int i9 = 0;
            for (int i10 = 0; i10 < 8; i10++) {
                i9 += (bigEndianToInt >> i10) & R.attr.cacheColorHint;
            }
            sArr[i] = (short) (((((i9 >>> 24) + i9) & 255) + 12289) - (((i9 >>> 16) + (i9 >>> 8)) & 255));
        }
    }

    private static short normalize(short s10) {
        short barrett = Reduce.barrett(s10);
        int i = barrett - 12289;
        return (short) (((barrett ^ i) & (i >> 31)) ^ i);
    }

    public static void pointWise(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < 1024; i++) {
            sArr3[i] = Reduce.montgomery((sArr[i] & 65535) * (65535 & Reduce.montgomery((sArr2[i] & 65535) * 3186)));
        }
    }

    public static void toBytes(byte[] bArr, short[] sArr) {
        for (int i = 0; i < 256; i++) {
            int i9 = i * 4;
            short normalize = normalize(sArr[i9]);
            short normalize2 = normalize(sArr[i9 + 1]);
            short normalize3 = normalize(sArr[i9 + 2]);
            short normalize4 = normalize(sArr[i9 + 3]);
            int i10 = i * 7;
            bArr[i10] = (byte) normalize;
            bArr[i10 + 1] = (byte) ((normalize >> 8) | (normalize2 << 6));
            bArr[i10 + 2] = (byte) (normalize2 >> 2);
            bArr[i10 + 3] = (byte) ((normalize2 >> 10) | (normalize3 << 4));
            bArr[i10 + 4] = (byte) (normalize3 >> 4);
            bArr[i10 + 5] = (byte) ((normalize3 >> 12) | (normalize4 << 2));
            bArr[i10 + 6] = (byte) (normalize4 >> 6);
        }
    }

    public static void toNTT(short[] sArr) {
        NTT.mulCoefficients(sArr, Precomp.PSIS_BITREV_MONTGOMERY);
        NTT.core(sArr, Precomp.OMEGAS_MONTGOMERY);
    }

    public static void uniform(short[] sArr, byte[] bArr) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            sHAKEDigest.doOutput(bArr2, 0, 256);
            for (int i9 = 0; i9 < 256; i9 += 2) {
                int i10 = (bArr2[i9] & 255) | ((bArr2[i9 + 1] & 255) << 8);
                if (i10 < 61445) {
                    int i11 = i + 1;
                    sArr[i] = (short) i10;
                    if (i11 == 1024) {
                        return;
                    } else {
                        i = i11;
                    }
                }
            }
        }
    }
}
