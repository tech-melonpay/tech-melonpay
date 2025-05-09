package org.bouncycastle.math.raw;

import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes.dex */
public class Interleave {
    private static final long M32 = 1431655765;
    private static final long M64 = 6148914691236517205L;
    private static final long M64R = -6148914691236517206L;

    public static int expand16to32(int i) {
        int i9 = i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        int i10 = (i9 | (i9 << 8)) & 16711935;
        int i11 = (i10 | (i10 << 4)) & 252645135;
        int i12 = (i11 | (i11 << 2)) & 858993459;
        return (i12 | (i12 << 1)) & 1431655765;
    }

    public static long expand32to64(int i) {
        return (((r6 >>> 1) & M32) << 32) | (M32 & Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(i, CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB, 8), 15728880, 4), 202116108, 2), 572662306, 1));
    }

    public static void expand64To128(long j10, long[] jArr, int i) {
        long bitPermuteStep = Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j10, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i] = bitPermuteStep & M64;
        jArr[i + 1] = (bitPermuteStep >>> 1) & M64;
    }

    public static void expand64To128Rev(long j10, long[] jArr, int i) {
        long bitPermuteStep = Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j10, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i] = bitPermuteStep & M64R;
        jArr[i + 1] = (bitPermuteStep << 1) & M64R;
    }

    public static int expand8to16(int i) {
        int i9 = i & 255;
        int i10 = (i9 | (i9 << 4)) & 3855;
        int i11 = (i10 | (i10 << 2)) & 13107;
        return (i11 | (i11 << 1)) & 21845;
    }

    public static int shuffle(int i) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(i, CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB, 8), 15728880, 4), 202116108, 2), 572662306, 1);
    }

    public static int shuffle2(int i) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(i, 11141290, 7), 52428, 14), 15728880, 4), CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB, 8);
    }

    public static long shuffle3(long j10) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j10, 47851476196393130L, 7), 225176545447116L, 14), 4042322160L, 28);
    }

    public static int unshuffle(int i) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(i, 572662306, 1), 202116108, 2), 15728880, 4), CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB, 8);
    }

    public static int unshuffle2(int i) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(i, CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB, 8), 15728880, 4), 52428, 14), 11141290, 7);
    }

    public static long unshuffle3(long j10) {
        return shuffle3(j10);
    }

    public static void expand64To128(long[] jArr, int i, int i9, long[] jArr2, int i10) {
        for (int i11 = 0; i11 < i9; i11++) {
            expand64To128(jArr[i + i11], jArr2, i10);
            i10 += 2;
        }
    }

    public static long shuffle(long j10) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j10, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
    }

    public static long shuffle2(long j10) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j10, 4278255360L, 24), 57421771435671756L, 6), 264913582878960L, 12), 723401728380766730L, 3);
    }

    public static long unshuffle(long j10) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j10, 2459565876494606882L, 1), 868082074056920076L, 2), 67555025218437360L, 4), 280375465148160L, 8), 4294901760L, 16);
    }

    public static long unshuffle2(long j10) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j10, 723401728380766730L, 3), 264913582878960L, 12), 57421771435671756L, 6), 4278255360L, 24);
    }
}
