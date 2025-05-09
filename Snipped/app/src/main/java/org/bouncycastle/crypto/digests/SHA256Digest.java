package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SHA256Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 32;

    /* renamed from: K, reason: collision with root package name */
    static final int[] f24899K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: H1, reason: collision with root package name */
    private int f24900H1;

    /* renamed from: H2, reason: collision with root package name */
    private int f24901H2;

    /* renamed from: H3, reason: collision with root package name */
    private int f24902H3;

    /* renamed from: H4, reason: collision with root package name */
    private int f24903H4;

    /* renamed from: H5, reason: collision with root package name */
    private int f24904H5;

    /* renamed from: H6, reason: collision with root package name */
    private int f24905H6;

    /* renamed from: H7, reason: collision with root package name */
    private int f24906H7;

    /* renamed from: H8, reason: collision with root package name */
    private int f24907H8;
    private int[] X;
    private int xOff;

    public SHA256Digest() {
        this.X = new int[64];
        reset();
    }

    private static int Ch(int i, int i9, int i10) {
        return ((~i) & i10) ^ (i9 & i);
    }

    private static int Maj(int i, int i9, int i10) {
        return ((i ^ i9) & i10) | (i & i9);
    }

    private static int Sum0(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    private static int Sum1(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    private static int Theta0(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    private static int Theta1(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    private void copyIn(SHA256Digest sHA256Digest) {
        super.copyIn((GeneralDigest) sHA256Digest);
        this.f24900H1 = sHA256Digest.f24900H1;
        this.f24901H2 = sHA256Digest.f24901H2;
        this.f24902H3 = sHA256Digest.f24902H3;
        this.f24903H4 = sHA256Digest.f24903H4;
        this.f24904H5 = sHA256Digest.f24904H5;
        this.f24905H6 = sHA256Digest.f24905H6;
        this.f24906H7 = sHA256Digest.f24906H7;
        this.f24907H8 = sHA256Digest.f24907H8;
        int[] iArr = sHA256Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA256Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA256Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.f24900H1, bArr, i);
        Pack.intToBigEndian(this.f24901H2, bArr, i + 4);
        Pack.intToBigEndian(this.f24902H3, bArr, i + 8);
        Pack.intToBigEndian(this.f24903H4, bArr, i + 12);
        Pack.intToBigEndian(this.f24904H5, bArr, i + 16);
        Pack.intToBigEndian(this.f24905H6, bArr, i + 20);
        Pack.intToBigEndian(this.f24906H7, bArr, i + 24);
        Pack.intToBigEndian(this.f24907H8, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.xOff * 4) + 52];
        super.populateState(bArr);
        Pack.intToBigEndian(this.f24900H1, bArr, 16);
        Pack.intToBigEndian(this.f24901H2, bArr, 20);
        Pack.intToBigEndian(this.f24902H3, bArr, 24);
        Pack.intToBigEndian(this.f24903H4, bArr, 28);
        Pack.intToBigEndian(this.f24904H5, bArr, 32);
        Pack.intToBigEndian(this.f24905H6, bArr, 36);
        Pack.intToBigEndian(this.f24906H7, bArr, 40);
        Pack.intToBigEndian(this.f24907H8, bArr, 44);
        Pack.intToBigEndian(this.xOff, bArr, 48);
        for (int i = 0; i != this.xOff; i++) {
            Pack.intToBigEndian(this.X[i], bArr, (i * 4) + 52);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.X;
            int Theta1 = Theta1(iArr[i - 2]);
            int[] iArr2 = this.X;
            iArr[i] = Theta1 + iArr2[i - 7] + Theta0(iArr2[i - 15]) + this.X[i - 16];
        }
        int i9 = this.f24900H1;
        int i10 = this.f24901H2;
        int i11 = this.f24902H3;
        int i12 = this.f24903H4;
        int i13 = this.f24904H5;
        int i14 = this.f24905H6;
        int i15 = this.f24906H7;
        int i16 = this.f24907H8;
        int i17 = 0;
        for (int i18 = 0; i18 < 8; i18++) {
            int Sum1 = Sum1(i13) + Ch(i13, i14, i15);
            int[] iArr3 = f24899K;
            int i19 = Sum1 + iArr3[i17] + this.X[i17] + i16;
            int i20 = i12 + i19;
            int Sum0 = Sum0(i9) + Maj(i9, i10, i11) + i19;
            int i21 = i17 + 1;
            int Sum12 = Sum1(i20) + Ch(i20, i13, i14) + iArr3[i21] + this.X[i21] + i15;
            int i22 = i11 + Sum12;
            int Sum02 = Sum0(Sum0) + Maj(Sum0, i9, i10) + Sum12;
            int i23 = i17 + 2;
            int Sum13 = Sum1(i22) + Ch(i22, i20, i13) + iArr3[i23] + this.X[i23] + i14;
            int i24 = i10 + Sum13;
            int Sum03 = Sum0(Sum02) + Maj(Sum02, Sum0, i9) + Sum13;
            int i25 = i17 + 3;
            int Sum14 = Sum1(i24) + Ch(i24, i22, i20) + iArr3[i25] + this.X[i25] + i13;
            int i26 = i9 + Sum14;
            int Sum04 = Sum0(Sum03) + Maj(Sum03, Sum02, Sum0) + Sum14;
            int i27 = i17 + 4;
            int Sum15 = Sum1(i26) + Ch(i26, i24, i22) + iArr3[i27] + this.X[i27] + i20;
            i16 = Sum0 + Sum15;
            i12 = Sum0(Sum04) + Maj(Sum04, Sum03, Sum02) + Sum15;
            int i28 = i17 + 5;
            int Sum16 = Sum1(i16) + Ch(i16, i26, i24) + iArr3[i28] + this.X[i28] + i22;
            i15 = Sum02 + Sum16;
            i11 = Sum0(i12) + Maj(i12, Sum04, Sum03) + Sum16;
            int i29 = i17 + 6;
            int Sum17 = Sum1(i15) + Ch(i15, i16, i26) + iArr3[i29] + this.X[i29] + i24;
            i14 = Sum03 + Sum17;
            i10 = Sum0(i11) + Maj(i11, i12, Sum04) + Sum17;
            int i30 = i17 + 7;
            int Sum18 = Sum1(i14) + Ch(i14, i15, i16) + iArr3[i30] + this.X[i30] + i26;
            i13 = Sum04 + Sum18;
            i9 = Sum0(i10) + Maj(i10, i11, i12) + Sum18;
            i17 += 8;
        }
        this.f24900H1 += i9;
        this.f24901H2 += i10;
        this.f24902H3 += i11;
        this.f24903H4 += i12;
        this.f24904H5 += i13;
        this.f24905H6 += i14;
        this.f24906H7 += i15;
        this.f24907H8 += i16;
        this.xOff = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            this.X[i31] = 0;
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
        this.f24900H1 = 1779033703;
        this.f24901H2 = -1150833019;
        this.f24902H3 = 1013904242;
        this.f24903H4 = -1521486534;
        this.f24904H5 = 1359893119;
        this.f24905H6 = -1694144372;
        this.f24906H7 = 528734635;
        this.f24907H8 = 1541459225;
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

    public SHA256Digest(SHA256Digest sHA256Digest) {
        super(sHA256Digest);
        this.X = new int[64];
        copyIn(sHA256Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA256Digest) memoable);
    }

    public SHA256Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[64];
        this.f24900H1 = Pack.bigEndianToInt(bArr, 16);
        this.f24901H2 = Pack.bigEndianToInt(bArr, 20);
        this.f24902H3 = Pack.bigEndianToInt(bArr, 24);
        this.f24903H4 = Pack.bigEndianToInt(bArr, 28);
        this.f24904H5 = Pack.bigEndianToInt(bArr, 32);
        this.f24905H6 = Pack.bigEndianToInt(bArr, 36);
        this.f24906H7 = Pack.bigEndianToInt(bArr, 40);
        this.f24907H8 = Pack.bigEndianToInt(bArr, 44);
        this.xOff = Pack.bigEndianToInt(bArr, 48);
        for (int i = 0; i != this.xOff; i++) {
            this.X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 52);
        }
    }
}
