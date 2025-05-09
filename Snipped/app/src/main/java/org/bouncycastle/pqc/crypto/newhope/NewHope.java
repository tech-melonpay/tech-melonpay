package org.bouncycastle.pqc.crypto.newhope;

import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;

/* loaded from: classes3.dex */
class NewHope {
    public static final int AGREEMENT_SIZE = 32;
    public static final int POLY_SIZE = 1024;
    public static final int SENDA_BYTES = 1824;
    public static final int SENDB_BYTES = 2048;
    private static final boolean STATISTICAL_TEST = false;

    public static void decodeA(short[] sArr, byte[] bArr, byte[] bArr2) {
        Poly.fromBytes(sArr, bArr2);
        System.arraycopy(bArr2, 1792, bArr, 0, 32);
    }

    public static void decodeB(short[] sArr, short[] sArr2, byte[] bArr) {
        Poly.fromBytes(sArr, bArr);
        for (int i = 0; i < 256; i++) {
            int i9 = i * 4;
            byte b9 = bArr[i + 1792];
            int i10 = b9 & 255;
            sArr2[i9] = (short) (b9 & 3);
            sArr2[i9 + 1] = (short) ((i10 >>> 2) & 3);
            sArr2[i9 + 2] = (short) ((i10 >>> 4) & 3);
            sArr2[i9 + 3] = (short) (i10 >>> 6);
        }
    }

    public static void encodeA(byte[] bArr, short[] sArr, byte[] bArr2) {
        Poly.toBytes(bArr, sArr);
        System.arraycopy(bArr2, 0, bArr, 1792, 32);
    }

    public static void encodeB(byte[] bArr, short[] sArr, short[] sArr2) {
        Poly.toBytes(bArr, sArr);
        for (int i = 0; i < 256; i++) {
            int i9 = i * 4;
            bArr[i + 1792] = (byte) ((sArr2[i9 + 3] << 6) | sArr2[i9] | (sArr2[i9 + 1] << 2) | (sArr2[i9 + 2] << 4));
        }
    }

    public static void generateA(short[] sArr, byte[] bArr) {
        Poly.uniform(sArr, bArr);
    }

    public static void keygen(SecureRandom secureRandom, byte[] bArr, short[] sArr) {
        byte[] bArr2 = new byte[32];
        secureRandom.nextBytes(bArr2);
        sha3(bArr2);
        short[] sArr2 = new short[1024];
        generateA(sArr2, bArr2);
        byte[] bArr3 = new byte[32];
        secureRandom.nextBytes(bArr3);
        Poly.getNoise(sArr, bArr3, (byte) 0);
        Poly.toNTT(sArr);
        short[] sArr3 = new short[1024];
        Poly.getNoise(sArr3, bArr3, (byte) 1);
        Poly.toNTT(sArr3);
        short[] sArr4 = new short[1024];
        Poly.pointWise(sArr2, sArr, sArr4);
        short[] sArr5 = new short[1024];
        Poly.add(sArr4, sArr3, sArr5);
        encodeA(bArr, sArr5, bArr2);
    }

    public static void sha3(byte[] bArr) {
        SHA3Digest sHA3Digest = new SHA3Digest(256);
        sHA3Digest.update(bArr, 0, 32);
        sHA3Digest.doFinal(bArr, 0);
    }

    public static void sharedA(byte[] bArr, short[] sArr, byte[] bArr2) {
        short[] sArr2 = new short[1024];
        short[] sArr3 = new short[1024];
        decodeB(sArr2, sArr3, bArr2);
        short[] sArr4 = new short[1024];
        Poly.pointWise(sArr, sArr2, sArr4);
        Poly.fromNTT(sArr4);
        ErrorCorrection.rec(bArr, sArr4, sArr3);
        sha3(bArr);
    }

    public static void sharedB(SecureRandom secureRandom, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[1024];
        byte[] bArr4 = new byte[32];
        decodeA(sArr, bArr4, bArr3);
        short[] sArr2 = new short[1024];
        generateA(sArr2, bArr4);
        byte[] bArr5 = new byte[32];
        secureRandom.nextBytes(bArr5);
        short[] sArr3 = new short[1024];
        Poly.getNoise(sArr3, bArr5, (byte) 0);
        Poly.toNTT(sArr3);
        short[] sArr4 = new short[1024];
        Poly.getNoise(sArr4, bArr5, (byte) 1);
        Poly.toNTT(sArr4);
        short[] sArr5 = new short[1024];
        Poly.pointWise(sArr2, sArr3, sArr5);
        Poly.add(sArr5, sArr4, sArr5);
        short[] sArr6 = new short[1024];
        Poly.pointWise(sArr, sArr3, sArr6);
        Poly.fromNTT(sArr6);
        short[] sArr7 = new short[1024];
        Poly.getNoise(sArr7, bArr5, (byte) 2);
        Poly.add(sArr6, sArr7, sArr6);
        short[] sArr8 = new short[1024];
        ErrorCorrection.helpRec(sArr8, sArr6, bArr5, (byte) 3);
        encodeB(bArr2, sArr5, sArr8);
        ErrorCorrection.rec(bArr, sArr6, sArr8);
        sha3(bArr);
    }
}
