package org.bouncycastle.crypto.digests;

import com.google.android.gms.measurement.internal.a;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] inwords;
    private int xOff;

    static {
        int i;
        int i9 = 0;
        while (true) {
            if (i9 >= 16) {
                break;
            }
            T[i9] = (2043430169 >>> (32 - i9)) | (2043430169 << i9);
            i9++;
        }
        for (i = 16; i < 64; i++) {
            int i10 = i % 32;
            T[i] = (2055708042 >>> (32 - i10)) | (2055708042 << i10);
        }
    }

    public SM3Digest() {
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        reset();
    }

    private int FF0(int i, int i9, int i10) {
        return (i ^ i9) ^ i10;
    }

    private int FF1(int i, int i9, int i10) {
        return (i & i10) | (i & i9) | (i9 & i10);
    }

    private int GG0(int i, int i9, int i10) {
        return (i ^ i9) ^ i10;
    }

    private int GG1(int i, int i9, int i10) {
        return ((~i) & i10) | (i9 & i);
    }

    private int P0(int i) {
        return (i ^ ((i << 9) | (i >>> 23))) ^ ((i << 17) | (i >>> 15));
    }

    private int P1(int i) {
        return (i ^ ((i << 15) | (i >>> 17))) ^ ((i << 23) | (i >>> 9));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.V;
        int[] iArr2 = this.V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.V, bArr, i);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i;
        int i9 = 0;
        while (true) {
            i = 16;
            if (i9 >= 16) {
                break;
            }
            this.W[i9] = this.inwords[i9];
            i9++;
        }
        for (int i10 = 16; i10 < 68; i10++) {
            int[] iArr = this.W;
            int i11 = iArr[i10 - 3];
            int i12 = iArr[i10 - 13];
            iArr[i10] = (P1(((i11 >>> 17) | (i11 << 15)) ^ (iArr[i10 - 16] ^ iArr[i10 - 9])) ^ ((i12 >>> 25) | (i12 << 7))) ^ this.W[i10 - 6];
        }
        int[] iArr2 = this.V;
        int i13 = iArr2[0];
        int i14 = iArr2[1];
        int i15 = iArr2[2];
        int i16 = iArr2[3];
        int i17 = iArr2[4];
        int i18 = iArr2[5];
        int i19 = iArr2[6];
        int i20 = iArr2[7];
        int i21 = 0;
        int i22 = i19;
        while (i21 < i) {
            int i23 = (i13 << 12) | (i13 >>> 20);
            int i24 = i23 + i17 + T[i21];
            int i25 = (i24 << 7) | (i24 >>> 25);
            int[] iArr3 = this.W;
            int i26 = iArr3[i21];
            int u6 = a.u(FF0(i13, i14, i15), i16, i25 ^ i23, iArr3[i21 + 4] ^ i26);
            int u10 = a.u(GG0(i17, i18, i22), i20, i25, i26);
            int i27 = (i14 << 9) | (i14 >>> 23);
            int i28 = (i18 << 19) | (i18 >>> 13);
            i21++;
            i16 = i15;
            i18 = i17;
            i17 = P0(u10);
            i15 = i27;
            i20 = i22;
            i = 16;
            i22 = i28;
            i14 = i13;
            i13 = u6;
        }
        int i29 = i20;
        int i30 = i13;
        int i31 = i22;
        int i32 = 16;
        while (i32 < 64) {
            int i33 = (i30 << 12) | (i30 >>> 20);
            int i34 = i33 + i17 + T[i32];
            int i35 = (i34 >>> 25) | (i34 << 7);
            int[] iArr4 = this.W;
            int i36 = iArr4[i32];
            int u11 = a.u(FF1(i30, i14, i15), i16, i33 ^ i35, iArr4[i32 + 4] ^ i36);
            int u12 = a.u(GG1(i17, i18, i31), i29, i35, i36);
            int i37 = (i18 << 19) | (i18 >>> 13);
            i32++;
            i16 = i15;
            i18 = i17;
            i17 = P0(u12);
            i15 = (i14 >>> 23) | (i14 << 9);
            i29 = i31;
            i14 = i30;
            i30 = u11;
            i31 = i37;
        }
        int[] iArr5 = this.V;
        iArr5[0] = i30 ^ iArr5[0];
        iArr5[1] = i14 ^ iArr5[1];
        iArr5[2] = iArr5[2] ^ i15;
        iArr5[3] = iArr5[3] ^ i16;
        iArr5[4] = iArr5[4] ^ i17;
        iArr5[5] = iArr5[5] ^ i18;
        iArr5[6] = i31 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i29;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        int i = this.xOff;
        if (i > 14) {
            this.inwords[i] = 0;
            this.xOff = i + 1;
            processBlock();
        }
        while (true) {
            int i9 = this.xOff;
            if (i9 >= 14) {
                int[] iArr = this.inwords;
                iArr[i9] = (int) (j10 >>> 32);
                this.xOff = i9 + 2;
                iArr[i9 + 1] = (int) j10;
                return;
            }
            this.inwords[i9] = 0;
            this.xOff = i9 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int i9 = (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.inwords;
        int i10 = this.xOff;
        iArr[i10] = i9;
        int i11 = i10 + 1;
        this.xOff = i11;
        if (i11 >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        copyIn(sM3Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }
}
