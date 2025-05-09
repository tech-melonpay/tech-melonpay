package org.bouncycastle.crypto.digests;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class GOST3411Digest implements ExtendedDigest, Memoable {

    /* renamed from: C2, reason: collision with root package name */
    private static final byte[] f24823C2 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: C, reason: collision with root package name */
    private byte[][] f24824C;

    /* renamed from: H, reason: collision with root package name */
    private byte[] f24825H;

    /* renamed from: K, reason: collision with root package name */
    private byte[] f24826K;

    /* renamed from: L, reason: collision with root package name */
    private byte[] f24827L;

    /* renamed from: M, reason: collision with root package name */
    private byte[] f24828M;
    byte[] S;
    private byte[] Sum;
    byte[] U;
    byte[] V;
    byte[] W;

    /* renamed from: a, reason: collision with root package name */
    byte[] f24829a;
    private long byteCount;
    private BlockCipher cipher;
    private byte[] sBox;
    short[] wS;
    short[] w_S;
    private byte[] xBuf;
    private int xBufOff;

    public GOST3411Digest() {
        this.f24825H = new byte[32];
        this.f24827L = new byte[32];
        this.f24828M = new byte[32];
        this.Sum = new byte[32];
        this.f24824C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f24826K = new byte[32];
        this.f24829a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        byte[] sBox = GOST28147Engine.getSBox("D-A");
        this.sBox = sBox;
        this.cipher.init(true, new ParametersWithSBox(null, sBox));
        reset();
    }

    private byte[] A(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.f24829a[i] = (byte) (bArr[i] ^ bArr[i + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.f24829a, 0, bArr, 24, 8);
        return bArr;
    }

    private void E(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i9) {
        this.cipher.init(true, new KeyParameter(bArr));
        this.cipher.processBlock(bArr3, i9, bArr2, i);
    }

    private byte[] P(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            byte[] bArr2 = this.f24826K;
            int i9 = i * 4;
            bArr2[i9] = bArr[i];
            bArr2[i9 + 1] = bArr[i + 8];
            bArr2[i9 + 2] = bArr[i + 16];
            bArr2[i9 + 3] = bArr[i + 24];
        }
        return this.f24826K;
    }

    private void cpyBytesToShort(byte[] bArr, short[] sArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i9 = i * 2;
            sArr[i] = (short) ((bArr[i9] & 255) | ((bArr[i9 + 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB));
        }
    }

    private void cpyShortToBytes(short[] sArr, byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i9 = i * 2;
            short s10 = sArr[i];
            bArr[i9 + 1] = (byte) (s10 >> 8);
            bArr[i9] = (byte) s10;
        }
    }

    private void finish() {
        Pack.longToLittleEndian(this.byteCount * 8, this.f24827L, 0);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processBlock(this.f24827L, 0);
        processBlock(this.Sum, 0);
    }

    private void fw(byte[] bArr) {
        cpyBytesToShort(bArr, this.wS);
        short[] sArr = this.w_S;
        short[] sArr2 = this.wS;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        cpyShortToBytes(this.w_S, bArr);
    }

    private void sumByteArray(byte[] bArr) {
        int i = 0;
        int i9 = 0;
        while (true) {
            byte[] bArr2 = this.Sum;
            if (i == bArr2.length) {
                return;
            }
            int i10 = (bArr2[i] & 255) + (bArr[i] & 255) + i9;
            bArr2[i] = (byte) i10;
            i9 = i10 >>> 8;
            i++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new GOST3411Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        byte[] bArr2 = this.f24825H;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    public void processBlock(byte[] bArr, int i) {
        System.arraycopy(bArr, i, this.f24828M, 0, 32);
        System.arraycopy(this.f24825H, 0, this.U, 0, 32);
        System.arraycopy(this.f24828M, 0, this.V, 0, 32);
        for (int i9 = 0; i9 < 32; i9++) {
            this.W[i9] = (byte) (this.U[i9] ^ this.V[i9]);
        }
        E(P(this.W), this.S, 0, this.f24825H, 0);
        for (int i10 = 1; i10 < 4; i10++) {
            byte[] A10 = A(this.U);
            for (int i11 = 0; i11 < 32; i11++) {
                this.U[i11] = (byte) (A10[i11] ^ this.f24824C[i10][i11]);
            }
            this.V = A(A(this.V));
            for (int i12 = 0; i12 < 32; i12++) {
                this.W[i12] = (byte) (this.U[i12] ^ this.V[i12]);
            }
            int i13 = i10 * 8;
            E(P(this.W), this.S, i13, this.f24825H, i13);
        }
        for (int i14 = 0; i14 < 12; i14++) {
            fw(this.S);
        }
        for (int i15 = 0; i15 < 32; i15++) {
            byte[] bArr2 = this.S;
            bArr2[i15] = (byte) (bArr2[i15] ^ this.f24828M[i15]);
        }
        fw(this.S);
        for (int i16 = 0; i16 < 32; i16++) {
            byte[] bArr3 = this.S;
            bArr3[i16] = (byte) (this.f24825H[i16] ^ bArr3[i16]);
        }
        for (int i17 = 0; i17 < 61; i17++) {
            fw(this.S);
        }
        byte[] bArr4 = this.S;
        byte[] bArr5 = this.f24825H;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f24825H;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        int i9 = 0;
        while (true) {
            byte[] bArr2 = this.f24827L;
            if (i9 >= bArr2.length) {
                break;
            }
            bArr2[i9] = 0;
            i9++;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr3 = this.f24828M;
            if (i10 >= bArr3.length) {
                break;
            }
            bArr3[i10] = 0;
            i10++;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr4 = this.f24824C[1];
            if (i11 >= bArr4.length) {
                break;
            }
            bArr4[i11] = 0;
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr5 = this.f24824C[3];
            if (i12 >= bArr5.length) {
                break;
            }
            bArr5[i12] = 0;
            i12++;
        }
        int i13 = 0;
        while (true) {
            byte[] bArr6 = this.Sum;
            if (i13 >= bArr6.length) {
                break;
            }
            bArr6[i13] = 0;
            i13++;
        }
        int i14 = 0;
        while (true) {
            byte[] bArr7 = this.xBuf;
            if (i14 >= bArr7.length) {
                byte[] bArr8 = f24823C2;
                System.arraycopy(bArr8, 0, this.f24824C[2], 0, bArr8.length);
                return;
            } else {
                bArr7[i14] = 0;
                i14++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b9) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        int i9 = i + 1;
        this.xBufOff = i9;
        bArr[i] = b9;
        if (i9 == bArr.length) {
            sumByteArray(bArr);
            processBlock(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    public GOST3411Digest(GOST3411Digest gOST3411Digest) {
        this.f24825H = new byte[32];
        this.f24827L = new byte[32];
        this.f24828M = new byte[32];
        this.Sum = new byte[32];
        this.f24824C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f24826K = new byte[32];
        this.f24829a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        reset(gOST3411Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        GOST3411Digest gOST3411Digest = (GOST3411Digest) memoable;
        byte[] bArr = gOST3411Digest.sBox;
        this.sBox = bArr;
        this.cipher.init(true, new ParametersWithSBox(null, bArr));
        reset();
        byte[] bArr2 = gOST3411Digest.f24825H;
        System.arraycopy(bArr2, 0, this.f24825H, 0, bArr2.length);
        byte[] bArr3 = gOST3411Digest.f24827L;
        System.arraycopy(bArr3, 0, this.f24827L, 0, bArr3.length);
        byte[] bArr4 = gOST3411Digest.f24828M;
        System.arraycopy(bArr4, 0, this.f24828M, 0, bArr4.length);
        byte[] bArr5 = gOST3411Digest.Sum;
        System.arraycopy(bArr5, 0, this.Sum, 0, bArr5.length);
        byte[] bArr6 = gOST3411Digest.f24824C[1];
        System.arraycopy(bArr6, 0, this.f24824C[1], 0, bArr6.length);
        byte[] bArr7 = gOST3411Digest.f24824C[2];
        System.arraycopy(bArr7, 0, this.f24824C[2], 0, bArr7.length);
        byte[] bArr8 = gOST3411Digest.f24824C[3];
        System.arraycopy(bArr8, 0, this.f24824C[3], 0, bArr8.length);
        byte[] bArr9 = gOST3411Digest.xBuf;
        System.arraycopy(bArr9, 0, this.xBuf, 0, bArr9.length);
        this.xBufOff = gOST3411Digest.xBufOff;
        this.byteCount = gOST3411Digest.byteCount;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i9) {
        while (this.xBufOff != 0 && i9 > 0) {
            update(bArr[i]);
            i++;
            i9--;
        }
        while (true) {
            byte[] bArr2 = this.xBuf;
            if (i9 <= bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            sumByteArray(this.xBuf);
            processBlock(this.xBuf, 0);
            byte[] bArr3 = this.xBuf;
            i += bArr3.length;
            i9 -= bArr3.length;
            this.byteCount += bArr3.length;
        }
        while (i9 > 0) {
            update(bArr[i]);
            i++;
            i9--;
        }
    }

    public GOST3411Digest(byte[] bArr) {
        this.f24825H = new byte[32];
        this.f24827L = new byte[32];
        this.f24828M = new byte[32];
        this.Sum = new byte[32];
        this.f24824C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.f24826K = new byte[32];
        this.f24829a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        byte[] clone = Arrays.clone(bArr);
        this.sBox = clone;
        this.cipher.init(true, new ParametersWithSBox(null, clone));
        reset();
    }
}
