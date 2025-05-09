package org.bouncycastle.crypto.digests;

import com.google.android.gms.measurement.internal.a;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;

    /* renamed from: Y1, reason: collision with root package name */
    private static final int f24881Y1 = 1518500249;

    /* renamed from: Y2, reason: collision with root package name */
    private static final int f24882Y2 = 1859775393;

    /* renamed from: Y3, reason: collision with root package name */
    private static final int f24883Y3 = -1894007588;

    /* renamed from: Y4, reason: collision with root package name */
    private static final int f24884Y4 = -899497514;

    /* renamed from: H1, reason: collision with root package name */
    private int f24885H1;

    /* renamed from: H2, reason: collision with root package name */
    private int f24886H2;

    /* renamed from: H3, reason: collision with root package name */
    private int f24887H3;

    /* renamed from: H4, reason: collision with root package name */
    private int f24888H4;

    /* renamed from: H5, reason: collision with root package name */
    private int f24889H5;
    private int[] X;
    private int xOff;

    public SHA1Digest() {
        this.X = new int[80];
        reset();
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.f24885H1 = sHA1Digest.f24885H1;
        this.f24886H2 = sHA1Digest.f24886H2;
        this.f24887H3 = sHA1Digest.f24887H3;
        this.f24888H4 = sHA1Digest.f24888H4;
        this.f24889H5 = sHA1Digest.f24889H5;
        int[] iArr = sHA1Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    private int f(int i, int i9, int i10) {
        return ((~i) & i10) | (i9 & i);
    }

    private int g(int i, int i9, int i10) {
        return (i & i10) | (i & i9) | (i9 & i10);
    }

    private int h(int i, int i9, int i10) {
        return (i ^ i9) ^ i10;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.f24885H1, bArr, i);
        Pack.intToBigEndian(this.f24886H2, bArr, i + 4);
        Pack.intToBigEndian(this.f24887H3, bArr, i + 8);
        Pack.intToBigEndian(this.f24888H4, bArr, i + 12);
        Pack.intToBigEndian(this.f24889H5, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA1;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 40];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f24885H1, bArr, 16);
        Pack.intToBigEndian(this.f24886H2, bArr, 20);
        Pack.intToBigEndian(this.f24887H3, bArr, 24);
        Pack.intToBigEndian(this.f24888H4, bArr, 28);
        Pack.intToBigEndian(this.f24889H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            Pack.intToBigEndian(this.X[i], bArr, (i * 4) + 40);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.X;
            int i9 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i9 >>> 31) | (i9 << 1);
        }
        int i10 = this.f24885H1;
        int i11 = this.f24886H2;
        int i12 = this.f24887H3;
        int i13 = this.f24888H4;
        int i14 = this.f24889H5;
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            int u6 = a.u(((i10 << 5) | (i10 >>> 27)) + f(i11, i12, i13), this.X[i15], f24881Y1, i14);
            int i17 = (i11 >>> 2) | (i11 << 30);
            int u10 = a.u(((u6 << 5) | (u6 >>> 27)) + f(i10, i17, i12), this.X[i15 + 1], f24881Y1, i13);
            int i18 = (i10 >>> 2) | (i10 << 30);
            int u11 = a.u(((u10 << 5) | (u10 >>> 27)) + f(u6, i18, i17), this.X[i15 + 2], f24881Y1, i12);
            i14 = (u6 >>> 2) | (u6 << 30);
            int i19 = i15 + 4;
            i11 = a.u(((u11 << 5) | (u11 >>> 27)) + f(u10, i14, i18), this.X[i15 + 3], f24881Y1, i17);
            i13 = (u10 >>> 2) | (u10 << 30);
            i15 += 5;
            i10 = a.u(((i11 << 5) | (i11 >>> 27)) + f(u11, i13, i14), this.X[i19], f24881Y1, i18);
            i12 = (u11 >>> 2) | (u11 << 30);
        }
        for (int i20 = 0; i20 < 4; i20++) {
            int u12 = a.u(((i10 << 5) | (i10 >>> 27)) + h(i11, i12, i13), this.X[i15], f24882Y2, i14);
            int i21 = (i11 >>> 2) | (i11 << 30);
            int u13 = a.u(((u12 << 5) | (u12 >>> 27)) + h(i10, i21, i12), this.X[i15 + 1], f24882Y2, i13);
            int i22 = (i10 >>> 2) | (i10 << 30);
            int u14 = a.u(((u13 << 5) | (u13 >>> 27)) + h(u12, i22, i21), this.X[i15 + 2], f24882Y2, i12);
            i14 = (u12 >>> 2) | (u12 << 30);
            int i23 = i15 + 4;
            i11 = a.u(((u14 << 5) | (u14 >>> 27)) + h(u13, i14, i22), this.X[i15 + 3], f24882Y2, i21);
            i13 = (u13 >>> 2) | (u13 << 30);
            i15 += 5;
            i10 = a.u(((i11 << 5) | (i11 >>> 27)) + h(u14, i13, i14), this.X[i23], f24882Y2, i22);
            i12 = (u14 >>> 2) | (u14 << 30);
        }
        for (int i24 = 0; i24 < 4; i24++) {
            int u15 = a.u(((i10 << 5) | (i10 >>> 27)) + g(i11, i12, i13), this.X[i15], f24883Y3, i14);
            int i25 = (i11 >>> 2) | (i11 << 30);
            int u16 = a.u(((u15 << 5) | (u15 >>> 27)) + g(i10, i25, i12), this.X[i15 + 1], f24883Y3, i13);
            int i26 = (i10 >>> 2) | (i10 << 30);
            int u17 = a.u(((u16 << 5) | (u16 >>> 27)) + g(u15, i26, i25), this.X[i15 + 2], f24883Y3, i12);
            i14 = (u15 >>> 2) | (u15 << 30);
            int i27 = i15 + 4;
            i11 = a.u(((u17 << 5) | (u17 >>> 27)) + g(u16, i14, i26), this.X[i15 + 3], f24883Y3, i25);
            i13 = (u16 >>> 2) | (u16 << 30);
            i15 += 5;
            i10 = a.u(((i11 << 5) | (i11 >>> 27)) + g(u17, i13, i14), this.X[i27], f24883Y3, i26);
            i12 = (u17 >>> 2) | (u17 << 30);
        }
        for (int i28 = 0; i28 <= 3; i28++) {
            int u18 = a.u(((i10 << 5) | (i10 >>> 27)) + h(i11, i12, i13), this.X[i15], f24884Y4, i14);
            int i29 = (i11 >>> 2) | (i11 << 30);
            int u19 = a.u(((u18 << 5) | (u18 >>> 27)) + h(i10, i29, i12), this.X[i15 + 1], f24884Y4, i13);
            int i30 = (i10 >>> 2) | (i10 << 30);
            int u20 = a.u(((u19 << 5) | (u19 >>> 27)) + h(u18, i30, i29), this.X[i15 + 2], f24884Y4, i12);
            i14 = (u18 >>> 2) | (u18 << 30);
            int i31 = i15 + 4;
            i11 = a.u(((u20 << 5) | (u20 >>> 27)) + h(u19, i14, i30), this.X[i15 + 3], f24884Y4, i29);
            i13 = (u19 >>> 2) | (u19 << 30);
            i15 += 5;
            i10 = a.u(((i11 << 5) | (i11 >>> 27)) + h(u20, i13, i14), this.X[i31], f24884Y4, i30);
            i12 = (u20 >>> 2) | (u20 << 30);
        }
        this.f24885H1 += i10;
        this.f24886H2 += i11;
        this.f24887H3 += i12;
        this.f24888H4 += i13;
        this.f24889H5 += i14;
        this.xOff = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            this.X[i32] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j10) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int i9 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.X;
        int i10 = this.xOff;
        iArr[i10] = i9;
        int i11 = i10 + 1;
        this.xOff = i11;
        if (i11 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f24885H1 = 1732584193;
        this.f24886H2 = -271733879;
        this.f24887H3 = -1732584194;
        this.f24888H4 = 271733878;
        this.f24889H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.X = new int[80];
        copyIn(sHA1Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[80];
        this.f24885H1 = Pack.bigEndianToInt(bArr, 16);
        this.f24886H2 = Pack.bigEndianToInt(bArr, 20);
        this.f24887H3 = Pack.bigEndianToInt(bArr, 24);
        this.f24888H4 = Pack.bigEndianToInt(bArr, 28);
        this.f24889H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            this.X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 40);
        }
    }
}
