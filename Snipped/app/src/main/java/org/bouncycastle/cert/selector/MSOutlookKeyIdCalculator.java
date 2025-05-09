package org.bouncycastle.cert.selector;

import com.google.android.gms.measurement.internal.a;
import java.io.IOException;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
class MSOutlookKeyIdCalculator {

    public static abstract class GeneralDigest {
        private static final int BYTE_LENGTH = 64;
        private long byteCount;
        private byte[] xBuf;
        private int xBufOff;

        public GeneralDigest() {
            this.xBuf = new byte[4];
            this.xBufOff = 0;
        }

        public void copyIn(GeneralDigest generalDigest) {
            byte[] bArr = generalDigest.xBuf;
            System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
            this.xBufOff = generalDigest.xBufOff;
            this.byteCount = generalDigest.byteCount;
        }

        public void finish() {
            long j10 = this.byteCount << 3;
            byte b9 = ISOFileInfo.DATA_BYTES1;
            while (true) {
                update(b9);
                if (this.xBufOff == 0) {
                    processLength(j10);
                    processBlock();
                    return;
                }
                b9 = 0;
            }
        }

        public abstract void processBlock();

        public abstract void processLength(long j10);

        public abstract void processWord(byte[] bArr, int i);

        public void reset() {
            this.byteCount = 0L;
            this.xBufOff = 0;
            int i = 0;
            while (true) {
                byte[] bArr = this.xBuf;
                if (i >= bArr.length) {
                    return;
                }
                bArr[i] = 0;
                i++;
            }
        }

        public void update(byte b9) {
            byte[] bArr = this.xBuf;
            int i = this.xBufOff;
            int i9 = i + 1;
            this.xBufOff = i9;
            bArr[i] = b9;
            if (i9 == bArr.length) {
                processWord(bArr, 0);
                this.xBufOff = 0;
            }
            this.byteCount++;
        }

        public GeneralDigest(GeneralDigest generalDigest) {
            this.xBuf = new byte[generalDigest.xBuf.length];
            copyIn(generalDigest);
        }

        public void update(byte[] bArr, int i, int i9) {
            while (this.xBufOff != 0 && i9 > 0) {
                update(bArr[i]);
                i++;
                i9--;
            }
            while (i9 > this.xBuf.length) {
                processWord(bArr, i);
                byte[] bArr2 = this.xBuf;
                i += bArr2.length;
                i9 -= bArr2.length;
                this.byteCount += bArr2.length;
            }
            while (i9 > 0) {
                update(bArr[i]);
                i++;
                i9--;
            }
        }
    }

    public static class SHA1Digest extends GeneralDigest {
        private static final int DIGEST_LENGTH = 20;

        /* renamed from: Y1, reason: collision with root package name */
        private static final int f24763Y1 = 1518500249;

        /* renamed from: Y2, reason: collision with root package name */
        private static final int f24764Y2 = 1859775393;

        /* renamed from: Y3, reason: collision with root package name */
        private static final int f24765Y3 = -1894007588;

        /* renamed from: Y4, reason: collision with root package name */
        private static final int f24766Y4 = -899497514;

        /* renamed from: H1, reason: collision with root package name */
        private int f24767H1;

        /* renamed from: H2, reason: collision with root package name */
        private int f24768H2;

        /* renamed from: H3, reason: collision with root package name */
        private int f24769H3;

        /* renamed from: H4, reason: collision with root package name */
        private int f24770H4;

        /* renamed from: H5, reason: collision with root package name */
        private int f24771H5;
        private int[] X = new int[80];
        private int xOff;

        public SHA1Digest() {
            reset();
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

        public int doFinal(byte[] bArr, int i) {
            finish();
            Pack.intToBigEndian(this.f24767H1, bArr, i);
            Pack.intToBigEndian(this.f24768H2, bArr, i + 4);
            Pack.intToBigEndian(this.f24769H3, bArr, i + 8);
            Pack.intToBigEndian(this.f24770H4, bArr, i + 12);
            Pack.intToBigEndian(this.f24771H5, bArr, i + 16);
            reset();
            return 20;
        }

        public String getAlgorithmName() {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }

        public int getDigestSize() {
            return 20;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void processBlock() {
            for (int i = 16; i < 80; i++) {
                int[] iArr = this.X;
                int i9 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
                iArr[i] = (i9 >>> 31) | (i9 << 1);
            }
            int i10 = this.f24767H1;
            int i11 = this.f24768H2;
            int i12 = this.f24769H3;
            int i13 = this.f24770H4;
            int i14 = this.f24771H5;
            int i15 = 0;
            for (int i16 = 0; i16 < 4; i16++) {
                int u6 = a.u(((i10 << 5) | (i10 >>> 27)) + f(i11, i12, i13), this.X[i15], f24763Y1, i14);
                int i17 = (i11 >>> 2) | (i11 << 30);
                int u10 = a.u(((u6 << 5) | (u6 >>> 27)) + f(i10, i17, i12), this.X[i15 + 1], f24763Y1, i13);
                int i18 = (i10 >>> 2) | (i10 << 30);
                int u11 = a.u(((u10 << 5) | (u10 >>> 27)) + f(u6, i18, i17), this.X[i15 + 2], f24763Y1, i12);
                i14 = (u6 >>> 2) | (u6 << 30);
                int i19 = i15 + 4;
                i11 = a.u(((u11 << 5) | (u11 >>> 27)) + f(u10, i14, i18), this.X[i15 + 3], f24763Y1, i17);
                i13 = (u10 >>> 2) | (u10 << 30);
                i15 += 5;
                i10 = a.u(((i11 << 5) | (i11 >>> 27)) + f(u11, i13, i14), this.X[i19], f24763Y1, i18);
                i12 = (u11 >>> 2) | (u11 << 30);
            }
            for (int i20 = 0; i20 < 4; i20++) {
                int u12 = a.u(((i10 << 5) | (i10 >>> 27)) + h(i11, i12, i13), this.X[i15], f24764Y2, i14);
                int i21 = (i11 >>> 2) | (i11 << 30);
                int u13 = a.u(((u12 << 5) | (u12 >>> 27)) + h(i10, i21, i12), this.X[i15 + 1], f24764Y2, i13);
                int i22 = (i10 >>> 2) | (i10 << 30);
                int u14 = a.u(((u13 << 5) | (u13 >>> 27)) + h(u12, i22, i21), this.X[i15 + 2], f24764Y2, i12);
                i14 = (u12 >>> 2) | (u12 << 30);
                int i23 = i15 + 4;
                i11 = a.u(((u14 << 5) | (u14 >>> 27)) + h(u13, i14, i22), this.X[i15 + 3], f24764Y2, i21);
                i13 = (u13 >>> 2) | (u13 << 30);
                i15 += 5;
                i10 = a.u(((i11 << 5) | (i11 >>> 27)) + h(u14, i13, i14), this.X[i23], f24764Y2, i22);
                i12 = (u14 >>> 2) | (u14 << 30);
            }
            for (int i24 = 0; i24 < 4; i24++) {
                int u15 = a.u(((i10 << 5) | (i10 >>> 27)) + g(i11, i12, i13), this.X[i15], f24765Y3, i14);
                int i25 = (i11 >>> 2) | (i11 << 30);
                int u16 = a.u(((u15 << 5) | (u15 >>> 27)) + g(i10, i25, i12), this.X[i15 + 1], f24765Y3, i13);
                int i26 = (i10 >>> 2) | (i10 << 30);
                int u17 = a.u(((u16 << 5) | (u16 >>> 27)) + g(u15, i26, i25), this.X[i15 + 2], f24765Y3, i12);
                i14 = (u15 >>> 2) | (u15 << 30);
                int i27 = i15 + 4;
                i11 = a.u(((u17 << 5) | (u17 >>> 27)) + g(u16, i14, i26), this.X[i15 + 3], f24765Y3, i25);
                i13 = (u16 >>> 2) | (u16 << 30);
                i15 += 5;
                i10 = a.u(((i11 << 5) | (i11 >>> 27)) + g(u17, i13, i14), this.X[i27], f24765Y3, i26);
                i12 = (u17 >>> 2) | (u17 << 30);
            }
            for (int i28 = 0; i28 <= 3; i28++) {
                int u18 = a.u(((i10 << 5) | (i10 >>> 27)) + h(i11, i12, i13), this.X[i15], f24766Y4, i14);
                int i29 = (i11 >>> 2) | (i11 << 30);
                int u19 = a.u(((u18 << 5) | (u18 >>> 27)) + h(i10, i29, i12), this.X[i15 + 1], f24766Y4, i13);
                int i30 = (i10 >>> 2) | (i10 << 30);
                int u20 = a.u(((u19 << 5) | (u19 >>> 27)) + h(u18, i30, i29), this.X[i15 + 2], f24766Y4, i12);
                i14 = (u18 >>> 2) | (u18 << 30);
                int i31 = i15 + 4;
                i11 = a.u(((u20 << 5) | (u20 >>> 27)) + h(u19, i14, i30), this.X[i15 + 3], f24766Y4, i29);
                i13 = (u19 >>> 2) | (u19 << 30);
                i15 += 5;
                i10 = a.u(((i11 << 5) | (i11 >>> 27)) + h(u20, i13, i14), this.X[i31], f24766Y4, i30);
                i12 = (u20 >>> 2) | (u20 << 30);
            }
            this.f24767H1 += i10;
            this.f24768H2 += i11;
            this.f24769H3 += i12;
            this.f24770H4 += i13;
            this.f24771H5 += i14;
            this.xOff = 0;
            for (int i32 = 0; i32 < 16; i32++) {
                this.X[i32] = 0;
            }
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void processLength(long j10) {
            if (this.xOff > 14) {
                processBlock();
            }
            int[] iArr = this.X;
            iArr[14] = (int) (j10 >>> 32);
            iArr[15] = (int) j10;
        }

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
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

        @Override // org.bouncycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void reset() {
            super.reset();
            this.f24767H1 = 1732584193;
            this.f24768H2 = -271733879;
            this.f24769H3 = -1732584194;
            this.f24770H4 = 271733878;
            this.f24771H5 = -1009589776;
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
    }

    public static byte[] calculateKeyId(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        SHA1Digest sHA1Digest = new SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        try {
            byte[] encoded = subjectPublicKeyInfo.getEncoded(ASN1Encoding.DER);
            sHA1Digest.update(encoded, 0, encoded.length);
            sHA1Digest.doFinal(bArr, 0);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }
}
