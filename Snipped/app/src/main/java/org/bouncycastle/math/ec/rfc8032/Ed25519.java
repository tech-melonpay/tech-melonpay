package org.bouncycastle.math.ec.rfc8032;

import java.security.SecureRandom;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.math.ec.rfc7748.X25519;
import org.bouncycastle.math.ec.rfc7748.X25519Field;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

/* loaded from: classes.dex */
public abstract class Ed25519 {
    private static final int COORD_INTS = 8;

    /* renamed from: L0, reason: collision with root package name */
    private static final int f25283L0 = -50998291;

    /* renamed from: L1, reason: collision with root package name */
    private static final int f25284L1 = 19280294;

    /* renamed from: L2, reason: collision with root package name */
    private static final int f25285L2 = 127719000;

    /* renamed from: L3, reason: collision with root package name */
    private static final int f25286L3 = -6428113;

    /* renamed from: L4, reason: collision with root package name */
    private static final int f25287L4 = 5343;
    private static final long M08L = 255;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int POINT_BYTES = 32;
    private static final int PRECOMP_BLOCKS = 8;
    private static final int PRECOMP_MASK = 7;
    private static final int PRECOMP_POINTS = 8;
    private static final int PRECOMP_SPACING = 8;
    private static final int PRECOMP_TEETH = 4;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 32;
    private static final int SCALAR_BYTES = 32;
    private static final int SCALAR_INTS = 8;
    public static final int SECRET_KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;
    private static final int WNAF_WIDTH_BASE = 7;
    private static final byte[] DOM2_PREFIX = {83, 105, 103, 69, ISOFileInfo.FMD_BYTE, ISO7816.INS_INCREASE, 53, 53, 49, 57, ISO7816.INS_VERIFY, 110, ISOFileInfo.FCI_BYTE, ISO7816.INS_VERIFY, 69, ISOFileInfo.FMD_BYTE, ISO7816.INS_INCREASE, 53, 53, 49, 57, ISO7816.INS_VERIFY, 99, ISOFileInfo.FCI_BYTE, 108, 108, 105, 115, 105, ISOFileInfo.FCI_BYTE, 110, 115};

    /* renamed from: P, reason: collision with root package name */
    private static final int[] f25288P = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: L, reason: collision with root package name */
    private static final int[] f25282L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] B_x = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    private static final int[] B_y = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    private static final int[] C_d = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    private static final int[] C_d2 = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    private static final int[] C_d4 = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    private static final Object precompLock = new Object();
    private static PointExt[] precompBaseTable = null;
    private static int[] precompBase = null;

    public static final class Algorithm {
        public static final int Ed25519 = 0;
        public static final int Ed25519ctx = 1;
        public static final int Ed25519ph = 2;
    }

    public static class F extends X25519Field {
        private F() {
        }
    }

    public static class PointAccum {

        /* renamed from: u, reason: collision with root package name */
        int[] f25289u;

        /* renamed from: v, reason: collision with root package name */
        int[] f25290v;

        /* renamed from: x, reason: collision with root package name */
        int[] f25291x;

        /* renamed from: y, reason: collision with root package name */
        int[] f25292y;

        /* renamed from: z, reason: collision with root package name */
        int[] f25293z;

        private PointAccum() {
            this.f25291x = X25519Field.create();
            this.f25292y = X25519Field.create();
            this.f25293z = X25519Field.create();
            this.f25289u = X25519Field.create();
            this.f25290v = X25519Field.create();
        }
    }

    public static class PointAffine {

        /* renamed from: x, reason: collision with root package name */
        int[] f25294x;

        /* renamed from: y, reason: collision with root package name */
        int[] f25295y;

        private PointAffine() {
            this.f25294x = X25519Field.create();
            this.f25295y = X25519Field.create();
        }
    }

    public static class PointExt {

        /* renamed from: t, reason: collision with root package name */
        int[] f25296t;

        /* renamed from: x, reason: collision with root package name */
        int[] f25297x;

        /* renamed from: y, reason: collision with root package name */
        int[] f25298y;

        /* renamed from: z, reason: collision with root package name */
        int[] f25299z;

        private PointExt() {
            this.f25297x = X25519Field.create();
            this.f25298y = X25519Field.create();
            this.f25299z = X25519Field.create();
            this.f25296t = X25519Field.create();
        }
    }

    public static class PointPrecomp {
        int[] xyd;
        int[] ymx_h;
        int[] ypx_h;

        private PointPrecomp() {
            this.ypx_h = X25519Field.create();
            this.ymx_h = X25519Field.create();
            this.xyd = X25519Field.create();
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        decodeScalar(bArr, 0, iArr);
        int[] iArr2 = new int[8];
        decodeScalar(bArr2, 0, iArr2);
        int[] iArr3 = new int[8];
        decodeScalar(bArr3, 0, iArr3);
        Nat256.mulAddTo(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        for (int i = 0; i < 16; i++) {
            encode32(iArr[i], bArr4, i * 4);
        }
        return reduceScalar(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr, byte b9) {
        return (bArr == null && b9 == 0) || (bArr != null && bArr.length < 256);
    }

    private static int checkPoint(int[] iArr, int[] iArr2) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        X25519Field.sqr(iArr, create2);
        X25519Field.sqr(iArr2, create3);
        X25519Field.mul(create2, create3, create);
        X25519Field.sub(create3, create2, create3);
        X25519Field.mul(create, C_d, create);
        X25519Field.addOne(create);
        X25519Field.sub(create, create3, create);
        X25519Field.normalize(create);
        return X25519Field.isZero(create);
    }

    private static boolean checkPointVar(byte[] bArr) {
        int[] iArr = new int[8];
        decode32(bArr, 0, iArr, 0, 8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !Nat256.gte(iArr, f25288P);
    }

    private static boolean checkScalarVar(byte[] bArr, int[] iArr) {
        decodeScalar(bArr, 0, iArr);
        return !Nat256.gte(iArr, f25282L);
    }

    private static byte[] copy(byte[] bArr, int i, int i9) {
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i, bArr2, 0, i9);
        return bArr2;
    }

    private static Digest createDigest() {
        return new SHA512Digest();
    }

    public static Digest createPrehash() {
        return createDigest();
    }

    private static int decode24(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static boolean decodePointVar(byte[] bArr, int i, boolean z10, PointAffine pointAffine) {
        byte[] copy = copy(bArr, i, 32);
        if (!checkPointVar(copy)) {
            return false;
        }
        byte b9 = copy[31];
        int i9 = (b9 & ISOFileInfo.DATA_BYTES1) >>> 7;
        copy[31] = (byte) (b9 & Byte.MAX_VALUE);
        X25519Field.decode(copy, 0, pointAffine.f25295y);
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        X25519Field.sqr(pointAffine.f25295y, create);
        X25519Field.mul(C_d, create, create2);
        X25519Field.subOne(create);
        X25519Field.addOne(create2);
        if (!X25519Field.sqrtRatioVar(create, create2, pointAffine.f25294x)) {
            return false;
        }
        X25519Field.normalize(pointAffine.f25294x);
        if (i9 == 1 && X25519Field.isZeroVar(pointAffine.f25294x)) {
            return false;
        }
        int[] iArr = pointAffine.f25294x;
        if (z10 ^ (i9 != (iArr[0] & 1))) {
            X25519Field.negate(iArr, iArr);
        }
        return true;
    }

    private static void decodeScalar(byte[] bArr, int i, int[] iArr) {
        decode32(bArr, i, iArr, 0, 8);
    }

    private static void dom2(Digest digest, byte b9, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = DOM2_PREFIX;
            int length = bArr2.length;
            int i = length + 2;
            int length2 = bArr.length + i;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, length);
            bArr3[length] = b9;
            bArr3[length + 1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, i, bArr.length);
            digest.update(bArr3, 0, length2);
        }
    }

    private static void encode24(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) i;
        bArr[i9 + 1] = (byte) (i >>> 8);
        bArr[i9 + 2] = (byte) (i >>> 16);
    }

    private static void encode32(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) i;
        bArr[i9 + 1] = (byte) (i >>> 8);
        bArr[i9 + 2] = (byte) (i >>> 16);
        bArr[i9 + 3] = (byte) (i >>> 24);
    }

    private static void encode56(long j10, byte[] bArr, int i) {
        encode32((int) j10, bArr, i);
        encode24((int) (j10 >>> 32), bArr, i + 4);
    }

    private static int encodePoint(PointAccum pointAccum, byte[] bArr, int i) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        X25519Field.inv(pointAccum.f25293z, create2);
        X25519Field.mul(pointAccum.f25291x, create2, create);
        X25519Field.mul(pointAccum.f25292y, create2, create2);
        X25519Field.normalize(create);
        X25519Field.normalize(create2);
        int checkPoint = checkPoint(create, create2);
        X25519Field.encode(create2, bArr, i);
        int i9 = i + 31;
        bArr[i9] = (byte) (((create[0] & 1) << 7) | bArr[i9]);
        return checkPoint;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void generatePublicKey(byte[] bArr, int i, byte[] bArr2, int i9) {
        Digest createDigest = createDigest();
        byte[] bArr3 = new byte[createDigest.getDigestSize()];
        createDigest.update(bArr, i, 32);
        createDigest.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[32];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i9);
    }

    private static int getWindow4(int[] iArr, int i) {
        return (iArr[i >>> 3] >>> ((i & 7) << 2)) & 15;
    }

    private static byte[] getWnafVar(int[] iArr, int i) {
        int[] iArr2 = new int[16];
        int i9 = 0;
        int i10 = 8;
        int i11 = 16;
        int i12 = 0;
        while (true) {
            i10--;
            if (i10 < 0) {
                break;
            }
            int i13 = iArr[i10];
            iArr2[i11 - 1] = (i12 << 16) | (i13 >>> 16);
            i11 -= 2;
            iArr2[i11] = i13;
            i12 = i13;
        }
        byte[] bArr = new byte[253];
        int i14 = 32 - i;
        int i15 = 0;
        int i16 = 0;
        while (i9 < 16) {
            int i17 = iArr2[i9];
            while (i15 < 16) {
                int i18 = i17 >>> i15;
                if ((i18 & 1) == i16) {
                    i15++;
                } else {
                    int i19 = (i18 | 1) << i14;
                    bArr[(i9 << 4) + i15] = (byte) (i19 >> i14);
                    i15 += i;
                    i16 = i19 >>> 31;
                }
            }
            i9++;
            i15 -= 16;
        }
        return bArr;
    }

    private static void implSign(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b9, byte[] bArr5, int i9, int i10, byte[] bArr6, int i11) {
        dom2(digest, b9, bArr4);
        digest.update(bArr, 32, 32);
        digest.update(bArr5, i9, i10);
        digest.doFinal(bArr, 0);
        byte[] reduceScalar = reduceScalar(bArr);
        byte[] bArr7 = new byte[32];
        scalarMultBaseEncoded(reduceScalar, bArr7, 0);
        dom2(digest, b9, bArr4);
        digest.update(bArr7, 0, 32);
        digest.update(bArr3, i, 32);
        digest.update(bArr5, i9, i10);
        digest.doFinal(bArr, 0);
        byte[] calculateS = calculateS(reduceScalar, reduceScalar(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i11, 32);
        System.arraycopy(calculateS, 0, bArr6, i11 + 32, 32);
    }

    private static boolean implVerify(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte b9, byte[] bArr4, int i10, int i11) {
        if (!checkContextVar(bArr3, b9)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] copy = copy(bArr, i, 32);
        byte[] copy2 = copy(bArr, i + 32, 32);
        if (!checkPointVar(copy)) {
            return false;
        }
        int[] iArr = new int[8];
        if (!checkScalarVar(copy2, iArr)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArr2, i9, true, pointAffine)) {
            return false;
        }
        Digest createDigest = createDigest();
        byte[] bArr5 = new byte[createDigest.getDigestSize()];
        dom2(createDigest, b9, bArr3);
        createDigest.update(copy, 0, 32);
        createDigest.update(bArr2, i9, 32);
        createDigest.update(bArr4, i10, i11);
        createDigest.doFinal(bArr5, 0);
        int[] iArr2 = new int[8];
        decodeScalar(reduceScalar(bArr5), 0, iArr2);
        PointAccum pointAccum = new PointAccum();
        scalarMultStrausVar(iArr, iArr2, pointAffine, pointAccum);
        byte[] bArr6 = new byte[32];
        return encodePoint(pointAccum, bArr6, 0) != 0 && Arrays.areEqual(bArr6, copy);
    }

    private static boolean isNeutralElementVar(int[] iArr, int[] iArr2) {
        return X25519Field.isZeroVar(iArr) && X25519Field.isOneVar(iArr2);
    }

    private static void pointAdd(PointExt pointExt, PointAccum pointAccum) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] create4 = X25519Field.create();
        int[] iArr = pointAccum.f25289u;
        int[] create5 = X25519Field.create();
        int[] create6 = X25519Field.create();
        int[] iArr2 = pointAccum.f25290v;
        X25519Field.apm(pointAccum.f25292y, pointAccum.f25291x, create2, create);
        X25519Field.apm(pointExt.f25298y, pointExt.f25297x, create4, create3);
        X25519Field.mul(create, create3, create);
        X25519Field.mul(create2, create4, create2);
        X25519Field.mul(pointAccum.f25289u, pointAccum.f25290v, create3);
        X25519Field.mul(create3, pointExt.f25296t, create3);
        X25519Field.mul(create3, C_d2, create3);
        X25519Field.mul(pointAccum.f25293z, pointExt.f25299z, create4);
        X25519Field.add(create4, create4, create4);
        X25519Field.apm(create2, create, iArr2, iArr);
        X25519Field.apm(create4, create3, create6, create5);
        X25519Field.carry(create6);
        X25519Field.mul(iArr, create5, pointAccum.f25291x);
        X25519Field.mul(create6, iArr2, pointAccum.f25292y);
        X25519Field.mul(create5, create6, pointAccum.f25293z);
    }

    private static void pointAddPrecomp(PointPrecomp pointPrecomp, PointAccum pointAccum) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] iArr = pointAccum.f25289u;
        int[] create4 = X25519Field.create();
        int[] create5 = X25519Field.create();
        int[] iArr2 = pointAccum.f25290v;
        X25519Field.apm(pointAccum.f25292y, pointAccum.f25291x, create2, create);
        X25519Field.mul(create, pointPrecomp.ymx_h, create);
        X25519Field.mul(create2, pointPrecomp.ypx_h, create2);
        X25519Field.mul(pointAccum.f25289u, pointAccum.f25290v, create3);
        X25519Field.mul(create3, pointPrecomp.xyd, create3);
        X25519Field.apm(create2, create, iArr2, iArr);
        X25519Field.apm(pointAccum.f25293z, create3, create5, create4);
        X25519Field.carry(create5);
        X25519Field.mul(iArr, create4, pointAccum.f25291x);
        X25519Field.mul(create5, iArr2, pointAccum.f25292y);
        X25519Field.mul(create4, create5, pointAccum.f25293z);
    }

    private static void pointAddVar(boolean z10, PointExt pointExt, PointAccum pointAccum) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] create4 = X25519Field.create();
        int[] iArr5 = pointAccum.f25289u;
        int[] create5 = X25519Field.create();
        int[] create6 = X25519Field.create();
        int[] iArr6 = pointAccum.f25290v;
        if (z10) {
            iArr2 = create3;
            iArr = create4;
            iArr4 = create5;
            iArr3 = create6;
        } else {
            iArr = create3;
            iArr2 = create4;
            iArr3 = create5;
            iArr4 = create6;
        }
        X25519Field.apm(pointAccum.f25292y, pointAccum.f25291x, create2, create);
        X25519Field.apm(pointExt.f25298y, pointExt.f25297x, iArr2, iArr);
        X25519Field.mul(create, create3, create);
        X25519Field.mul(create2, create4, create2);
        X25519Field.mul(pointAccum.f25289u, pointAccum.f25290v, create3);
        X25519Field.mul(create3, pointExt.f25296t, create3);
        X25519Field.mul(create3, C_d2, create3);
        X25519Field.mul(pointAccum.f25293z, pointExt.f25299z, create4);
        X25519Field.add(create4, create4, create4);
        X25519Field.apm(create2, create, iArr6, iArr5);
        X25519Field.apm(create4, create3, iArr4, iArr3);
        X25519Field.carry(iArr4);
        X25519Field.mul(iArr5, create5, pointAccum.f25291x);
        X25519Field.mul(create6, iArr6, pointAccum.f25292y);
        X25519Field.mul(create5, create6, pointAccum.f25293z);
    }

    private static PointExt pointCopy(PointAccum pointAccum) {
        PointExt pointExt = new PointExt();
        X25519Field.copy(pointAccum.f25291x, 0, pointExt.f25297x, 0);
        X25519Field.copy(pointAccum.f25292y, 0, pointExt.f25298y, 0);
        X25519Field.copy(pointAccum.f25293z, 0, pointExt.f25299z, 0);
        X25519Field.mul(pointAccum.f25289u, pointAccum.f25290v, pointExt.f25296t);
        return pointExt;
    }

    private static void pointDouble(PointAccum pointAccum) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] iArr = pointAccum.f25289u;
        int[] create4 = X25519Field.create();
        int[] create5 = X25519Field.create();
        int[] iArr2 = pointAccum.f25290v;
        X25519Field.sqr(pointAccum.f25291x, create);
        X25519Field.sqr(pointAccum.f25292y, create2);
        X25519Field.sqr(pointAccum.f25293z, create3);
        X25519Field.add(create3, create3, create3);
        X25519Field.apm(create, create2, iArr2, create5);
        X25519Field.add(pointAccum.f25291x, pointAccum.f25292y, iArr);
        X25519Field.sqr(iArr, iArr);
        X25519Field.sub(iArr2, iArr, iArr);
        X25519Field.add(create3, create5, create4);
        X25519Field.carry(create4);
        X25519Field.mul(iArr, create4, pointAccum.f25291x);
        X25519Field.mul(create5, iArr2, pointAccum.f25292y);
        X25519Field.mul(create4, create5, pointAccum.f25293z);
    }

    private static void pointExtendXY(PointAccum pointAccum) {
        X25519Field.one(pointAccum.f25293z);
        X25519Field.copy(pointAccum.f25291x, 0, pointAccum.f25289u, 0);
        X25519Field.copy(pointAccum.f25292y, 0, pointAccum.f25290v, 0);
    }

    private static void pointLookup(int i, int i9, PointPrecomp pointPrecomp) {
        int i10 = i * 240;
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = ((i11 ^ i9) - 1) >> 31;
            X25519Field.cmov(i12, precompBase, i10, pointPrecomp.ypx_h, 0);
            X25519Field.cmov(i12, precompBase, i10 + 10, pointPrecomp.ymx_h, 0);
            X25519Field.cmov(i12, precompBase, i10 + 20, pointPrecomp.xyd, 0);
            i10 += 30;
        }
    }

    private static int[] pointPrecompute(PointAffine pointAffine, int i) {
        PointExt pointCopy = pointCopy(pointAffine);
        PointExt pointCopy2 = pointCopy(pointCopy);
        pointAdd(pointCopy, pointCopy2);
        int[] createTable = X25519Field.createTable(i * 4);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            X25519Field.copy(pointCopy.f25297x, 0, createTable, i9);
            X25519Field.copy(pointCopy.f25298y, 0, createTable, i9 + 10);
            X25519Field.copy(pointCopy.f25299z, 0, createTable, i9 + 20);
            X25519Field.copy(pointCopy.f25296t, 0, createTable, i9 + 30);
            i9 += 40;
            i10++;
            if (i10 == i) {
                return createTable;
            }
            pointAdd(pointCopy2, pointCopy);
        }
    }

    private static PointExt[] pointPrecomputeVar(PointExt pointExt, int i) {
        PointExt pointExt2 = new PointExt();
        pointAddVar(false, pointExt, pointExt, pointExt2);
        PointExt[] pointExtArr = new PointExt[i];
        pointExtArr[0] = pointCopy(pointExt);
        for (int i9 = 1; i9 < i; i9++) {
            PointExt pointExt3 = pointExtArr[i9 - 1];
            PointExt pointExt4 = new PointExt();
            pointExtArr[i9] = pointExt4;
            pointAddVar(false, pointExt3, pointExt2, pointExt4);
        }
        return pointExtArr;
    }

    private static void pointSetNeutral(PointAccum pointAccum) {
        X25519Field.zero(pointAccum.f25291x);
        X25519Field.one(pointAccum.f25292y);
        X25519Field.one(pointAccum.f25293z);
        X25519Field.zero(pointAccum.f25289u);
        X25519Field.one(pointAccum.f25290v);
    }

    public static void precompute() {
        int i;
        synchronized (precompLock) {
            try {
                if (precompBase != null) {
                    return;
                }
                PointExt pointExt = new PointExt();
                int[] iArr = B_x;
                X25519Field.copy(iArr, 0, pointExt.f25297x, 0);
                int[] iArr2 = B_y;
                X25519Field.copy(iArr2, 0, pointExt.f25298y, 0);
                pointExtendXY(pointExt);
                precompBaseTable = pointPrecomputeVar(pointExt, 32);
                PointAccum pointAccum = new PointAccum();
                X25519Field.copy(iArr, 0, pointAccum.f25291x, 0);
                X25519Field.copy(iArr2, 0, pointAccum.f25292y, 0);
                pointExtendXY(pointAccum);
                precompBase = X25519Field.createTable(192);
                int i9 = 0;
                for (int i10 = 0; i10 < 8; i10++) {
                    PointExt[] pointExtArr = new PointExt[4];
                    PointExt pointExt2 = new PointExt();
                    pointSetNeutral(pointExt2);
                    int i11 = 0;
                    while (true) {
                        i = 1;
                        if (i11 >= 4) {
                            break;
                        }
                        pointAddVar(true, pointExt2, pointCopy(pointAccum), pointExt2);
                        pointDouble(pointAccum);
                        pointExtArr[i11] = pointCopy(pointAccum);
                        if (i10 + i11 != 10) {
                            while (i < 8) {
                                pointDouble(pointAccum);
                                i++;
                            }
                        }
                        i11++;
                    }
                    PointExt[] pointExtArr2 = new PointExt[8];
                    pointExtArr2[0] = pointExt2;
                    int i12 = 0;
                    int i13 = 1;
                    while (i12 < 3) {
                        int i14 = i << i12;
                        int i15 = 0;
                        while (i15 < i14) {
                            PointExt pointExt3 = pointExtArr2[i13 - i14];
                            PointExt pointExt4 = pointExtArr[i12];
                            PointExt pointExt5 = new PointExt();
                            pointExtArr2[i13] = pointExt5;
                            pointAddVar(false, pointExt3, pointExt4, pointExt5);
                            i15++;
                            i13++;
                        }
                        i12++;
                        i = 1;
                    }
                    int[] createTable = X25519Field.createTable(8);
                    int[] create = X25519Field.create();
                    X25519Field.copy(pointExtArr2[0].f25299z, 0, create, 0);
                    X25519Field.copy(create, 0, createTable, 0);
                    int i16 = 0;
                    while (true) {
                        int i17 = i16 + 1;
                        if (i17 >= 8) {
                            break;
                        }
                        X25519Field.mul(create, pointExtArr2[i17].f25299z, create);
                        X25519Field.copy(create, 0, createTable, i17 * 10);
                        i16 = i17;
                    }
                    X25519Field.add(create, create, create);
                    X25519Field.invVar(create, create);
                    int[] create2 = X25519Field.create();
                    while (i16 > 0) {
                        int i18 = i16 - 1;
                        X25519Field.copy(createTable, i18 * 10, create2, 0);
                        X25519Field.mul(create2, create, create2);
                        X25519Field.copy(create2, 0, createTable, i16 * 10);
                        X25519Field.mul(create, pointExtArr2[i16].f25299z, create);
                        i16 = i18;
                    }
                    X25519Field.copy(create, 0, createTable, 0);
                    for (int i19 = 0; i19 < 8; i19++) {
                        PointExt pointExt6 = pointExtArr2[i19];
                        int[] create3 = X25519Field.create();
                        int[] create4 = X25519Field.create();
                        X25519Field.copy(createTable, i19 * 10, create4, 0);
                        X25519Field.mul(pointExt6.f25297x, create4, create3);
                        X25519Field.mul(pointExt6.f25298y, create4, create4);
                        PointPrecomp pointPrecomp = new PointPrecomp();
                        X25519Field.apm(create4, create3, pointPrecomp.ypx_h, pointPrecomp.ymx_h);
                        X25519Field.mul(create3, create4, pointPrecomp.xyd);
                        int[] iArr3 = pointPrecomp.xyd;
                        X25519Field.mul(iArr3, C_d4, iArr3);
                        X25519Field.normalize(pointPrecomp.ypx_h);
                        X25519Field.normalize(pointPrecomp.ymx_h);
                        X25519Field.copy(pointPrecomp.ypx_h, 0, precompBase, i9);
                        X25519Field.copy(pointPrecomp.ymx_h, 0, precompBase, i9 + 10);
                        X25519Field.copy(pointPrecomp.xyd, 0, precompBase, i9 + 20);
                        i9 += 30;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b9 = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = b9;
        bArr2[31] = (byte) (b9 | 64);
    }

    private static byte[] reduceScalar(byte[] bArr) {
        long decode32 = decode32(bArr, 49);
        long j10 = decode32 & 4294967295L;
        long decode322 = decode32(bArr, 56);
        long j11 = decode322 & 4294967295L;
        long j12 = bArr[63] & M08L;
        long decode24 = ((decode24(bArr, 60) << 4) & 4294967295L) + (j11 >> 28);
        long j13 = decode322 & M28L;
        long decode323 = (decode32(bArr, 28) & 4294967295L) - (decode24 * (-50998291));
        long decode242 = (((decode24(bArr, 32) << 4) & 4294967295L) - (j12 * (-50998291))) - (decode24 * 19280294);
        long decode324 = ((decode32(bArr, 42) & 4294967295L) - (j12 * (-6428113))) - (decode24 * 5343);
        long decode243 = ((((decode24(bArr, 39) << 4) & 4294967295L) - (j12 * 127719000)) - (decode24 * (-6428113))) - (j13 * 5343);
        long decode244 = ((decode24(bArr, 53) << 4) & 4294967295L) + (j10 >> 28);
        long j14 = decode32 & M28L;
        long decode325 = ((((decode32(bArr, 35) & 4294967295L) - (j12 * 19280294)) - (decode24 * 127719000)) - (j13 * (-6428113))) - (decode244 * 5343);
        long decode245 = ((((decode24(bArr, 25) << 4) & 4294967295L) - (j13 * (-50998291))) - (decode244 * 19280294)) - (j14 * 127719000);
        long j15 = ((decode242 - (j13 * 127719000)) - (decode244 * (-6428113))) - (j14 * 5343);
        long decode246 = (((decode24(bArr, 46) << 4) & 4294967295L) - (j12 * 5343)) + (decode324 >> 28);
        long j16 = (decode324 & M28L) + (decode243 >> 28);
        long decode247 = ((decode24(bArr, 11) << 4) & 4294967295L) - (j16 * (-50998291));
        long decode326 = ((decode32(bArr, 14) & 4294967295L) - (decode246 * (-50998291))) - (j16 * 19280294);
        long decode248 = ((((decode24(bArr, 18) << 4) & 4294967295L) - (j14 * (-50998291))) - (decode246 * 19280294)) - (j16 * 127719000);
        long decode327 = ((((decode32(bArr, 21) & 4294967295L) - (decode244 * (-50998291))) - (j14 * 19280294)) - (decode246 * 127719000)) - (j16 * (-6428113));
        long j17 = (decode245 - (decode246 * (-6428113))) - (j16 * 5343);
        long j18 = (decode243 & M28L) + (decode325 >> 28);
        long j19 = decode325 & M28L;
        long decode328 = (decode32(bArr, 7) & 4294967295L) - (j18 * (-50998291));
        long j20 = decode247 - (j18 * 19280294);
        long j21 = decode326 - (j18 * 127719000);
        long j22 = decode248 - (j18 * (-6428113));
        long j23 = decode327 - (j18 * 5343);
        long j24 = j19 + (j15 >> 28);
        long j25 = j15 & M28L;
        long decode249 = ((decode24(bArr, 4) << 4) & 4294967295L) - (j24 * (-50998291));
        long j26 = decode328 - (j24 * 19280294);
        long j27 = j20 - (j24 * 127719000);
        long j28 = j21 - (j24 * (-6428113));
        long j29 = j22 - (j24 * 5343);
        long j30 = ((((decode323 - (j13 * 19280294)) - (decode244 * 127719000)) - (j14 * (-6428113))) - (decode246 * 5343)) + (j17 >> 28);
        long j31 = j17 & M28L;
        long j32 = j30 & M28L;
        long j33 = j32 >>> 27;
        long j34 = j25 + (j30 >> 28) + j33;
        long decode329 = (decode32(bArr, 0) & 4294967295L) - (j34 * (-50998291));
        long j35 = (decode249 - (j34 * 19280294)) + (decode329 >> 28);
        long j36 = decode329 & M28L;
        long j37 = (j26 - (j34 * 127719000)) + (j35 >> 28);
        long j38 = j35 & M28L;
        long j39 = (j27 - (j34 * (-6428113))) + (j37 >> 28);
        long j40 = j37 & M28L;
        long j41 = (j28 - (j34 * 5343)) + (j39 >> 28);
        long j42 = j39 & M28L;
        long j43 = j29 + (j41 >> 28);
        long j44 = j41 & M28L;
        long j45 = j23 + (j43 >> 28);
        long j46 = j43 & M28L;
        long j47 = j31 + (j45 >> 28);
        long j48 = j45 & M28L;
        long j49 = j32 + (j47 >> 28);
        long j50 = j47 & M28L;
        long j51 = j49 >> 28;
        long j52 = j49 & M28L;
        long j53 = j51 - j33;
        long j54 = j36 + (j53 & (-50998291));
        long j55 = j38 + (j53 & 19280294) + (j54 >> 28);
        long j56 = j54 & M28L;
        long j57 = j40 + (j53 & 127719000) + (j55 >> 28);
        long j58 = j55 & M28L;
        long j59 = j42 + (j53 & (-6428113)) + (j57 >> 28);
        long j60 = j57 & M28L;
        long j61 = j44 + (j53 & 5343) + (j59 >> 28);
        long j62 = j59 & M28L;
        long j63 = j46 + (j61 >> 28);
        long j64 = j61 & M28L;
        long j65 = j48 + (j63 >> 28);
        long j66 = j63 & M28L;
        long j67 = j50 + (j65 >> 28);
        long j68 = j65 & M28L;
        long j69 = j52 + (j67 >> 28);
        long j70 = j67 & M28L;
        byte[] bArr2 = new byte[32];
        encode56(j56 | (j58 << 28), bArr2, 0);
        encode56((j62 << 28) | j60, bArr2, 7);
        encode56(j64 | (j66 << 28), bArr2, 14);
        encode56(j68 | (j70 << 28), bArr2, 21);
        encode32((int) j69, bArr2, 28);
        return bArr2;
    }

    private static void scalarMult(byte[] bArr, PointAffine pointAffine, PointAccum pointAccum) {
        int[] iArr = new int[8];
        decodeScalar(bArr, 0, iArr);
        Nat.cadd(8, (~iArr[0]) & 1, iArr, f25282L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
        int[] pointPrecompute = pointPrecompute(pointAffine, 8);
        PointExt pointExt = new PointExt();
        pointSetNeutral(pointAccum);
        int i = 63;
        while (true) {
            pointLookup(iArr, i, pointPrecompute, pointExt);
            pointAdd(pointExt, pointAccum);
            i--;
            if (i < 0) {
                return;
            }
            for (int i9 = 0; i9 < 4; i9++) {
                pointDouble(pointAccum);
            }
        }
    }

    private static void scalarMultBase(byte[] bArr, PointAccum pointAccum) {
        precompute();
        int[] iArr = new int[8];
        decodeScalar(bArr, 0, iArr);
        Nat.cadd(8, (~iArr[0]) & 1, iArr, f25282L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
        for (int i = 0; i < 8; i++) {
            iArr[i] = Interleave.shuffle2(iArr[i]);
        }
        PointPrecomp pointPrecomp = new PointPrecomp();
        pointSetNeutral(pointAccum);
        int i9 = 28;
        while (true) {
            for (int i10 = 0; i10 < 8; i10++) {
                int i11 = iArr[i10] >>> i9;
                int i12 = (i11 >>> 3) & 1;
                pointLookup(i10, (i11 ^ (-i12)) & 7, pointPrecomp);
                X25519Field.cswap(i12, pointPrecomp.ypx_h, pointPrecomp.ymx_h);
                X25519Field.cnegate(i12, pointPrecomp.xyd);
                pointAddPrecomp(pointPrecomp, pointAccum);
            }
            i9 -= 4;
            if (i9 < 0) {
                return;
            } else {
                pointDouble(pointAccum);
            }
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i) {
        PointAccum pointAccum = new PointAccum();
        scalarMultBase(bArr, pointAccum);
        if (encodePoint(pointAccum, bArr2, i) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void scalarMultBaseYZ(X25519.Friend friend, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by X25519");
        }
        byte[] bArr2 = new byte[32];
        pruneScalar(bArr, i, bArr2);
        PointAccum pointAccum = new PointAccum();
        scalarMultBase(bArr2, pointAccum);
        if (checkPoint(pointAccum.f25291x, pointAccum.f25292y, pointAccum.f25293z) == 0) {
            throw new IllegalStateException();
        }
        X25519Field.copy(pointAccum.f25292y, 0, iArr, 0);
        X25519Field.copy(pointAccum.f25293z, 0, iArr2, 0);
    }

    private static void scalarMultOrderVar(PointAffine pointAffine, PointAccum pointAccum) {
        byte[] wnafVar = getWnafVar(f25282L, 5);
        PointExt[] pointPrecomputeVar = pointPrecomputeVar(pointCopy(pointAffine), 8);
        pointSetNeutral(pointAccum);
        int i = 252;
        while (true) {
            byte b9 = wnafVar[i];
            if (b9 != 0) {
                int i9 = b9 >> 31;
                pointAddVar(i9 != 0, pointPrecomputeVar[(b9 ^ i9) >>> 1], pointAccum);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointAccum);
            }
        }
    }

    private static void scalarMultStrausVar(int[] iArr, int[] iArr2, PointAffine pointAffine, PointAccum pointAccum) {
        precompute();
        byte[] wnafVar = getWnafVar(iArr, 7);
        byte[] wnafVar2 = getWnafVar(iArr2, 5);
        PointExt[] pointPrecomputeVar = pointPrecomputeVar(pointCopy(pointAffine), 8);
        pointSetNeutral(pointAccum);
        int i = 252;
        while (true) {
            byte b9 = wnafVar[i];
            if (b9 != 0) {
                int i9 = b9 >> 31;
                pointAddVar(i9 != 0, precompBaseTable[(b9 ^ i9) >>> 1], pointAccum);
            }
            byte b10 = wnafVar2[i];
            if (b10 != 0) {
                int i10 = b10 >> 31;
                pointAddVar(i10 != 0, pointPrecomputeVar[(b10 ^ i10) >>> 1], pointAccum);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointAccum);
            }
        }
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i9, int i10, byte[] bArr3, int i11) {
        implSign(bArr, i, null, (byte) 0, bArr2, i9, i10, bArr3, i11);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, Digest digest, byte[] bArr4, int i10) {
        byte[] bArr5 = new byte[64];
        if (64 != digest.doFinal(bArr5, 0)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i, bArr2, i9, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i10);
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i) {
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArr, i, false, pointAffine)) {
            return false;
        }
        X25519Field.normalize(pointAffine.f25294x);
        X25519Field.normalize(pointAffine.f25295y);
        if (isNeutralElementVar(pointAffine.f25294x, pointAffine.f25295y)) {
            return false;
        }
        PointAccum pointAccum = new PointAccum();
        scalarMultOrderVar(pointAffine, pointAccum);
        X25519Field.normalize(pointAccum.f25291x);
        X25519Field.normalize(pointAccum.f25292y);
        X25519Field.normalize(pointAccum.f25293z);
        return isNeutralElementVar(pointAccum.f25291x, pointAccum.f25292y, pointAccum.f25293z);
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i) {
        return decodePointVar(bArr, i, false, new PointAffine());
    }

    public static boolean verify(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, int i10, int i11) {
        return implVerify(bArr, i, bArr2, i9, null, (byte) 0, bArr3, i10, i11);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, Digest digest) {
        byte[] bArr4 = new byte[64];
        if (64 == digest.doFinal(bArr4, 0)) {
            return implVerify(bArr, i, bArr2, i9, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new IllegalArgumentException("ph");
    }

    private static int checkPoint(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] create4 = X25519Field.create();
        X25519Field.sqr(iArr, create2);
        X25519Field.sqr(iArr2, create3);
        X25519Field.sqr(iArr3, create4);
        X25519Field.mul(create2, create3, create);
        X25519Field.sub(create3, create2, create3);
        X25519Field.mul(create3, create4, create3);
        X25519Field.sqr(create4, create4);
        X25519Field.mul(create, C_d, create);
        X25519Field.add(create, create4, create);
        X25519Field.sub(create, create3, create);
        X25519Field.normalize(create);
        return X25519Field.isZero(create);
    }

    private static void decode32(byte[] bArr, int i, int[] iArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i9 + i11] = decode32(bArr, (i11 * 4) + i);
        }
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, byte b9, byte[] bArr3, int i9, int i10, byte[] bArr4, int i11) {
        if (!checkContextVar(bArr2, b9)) {
            throw new IllegalArgumentException("ctx");
        }
        Digest createDigest = createDigest();
        byte[] bArr5 = new byte[createDigest.getDigestSize()];
        createDigest.update(bArr, i, 32);
        createDigest.doFinal(bArr5, 0);
        byte[] bArr6 = new byte[32];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[32];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(createDigest, bArr5, bArr6, bArr7, 0, bArr2, b9, bArr3, i9, i10, bArr4, i11);
    }

    private static boolean isNeutralElementVar(int[] iArr, int[] iArr2, int[] iArr3) {
        return X25519Field.isZeroVar(iArr) && X25519Field.areEqualVar(iArr2, iArr3);
    }

    private static void pointAdd(PointExt pointExt, PointExt pointExt2) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] create4 = X25519Field.create();
        int[] create5 = X25519Field.create();
        int[] create6 = X25519Field.create();
        int[] create7 = X25519Field.create();
        int[] create8 = X25519Field.create();
        X25519Field.apm(pointExt.f25298y, pointExt.f25297x, create2, create);
        X25519Field.apm(pointExt2.f25298y, pointExt2.f25297x, create4, create3);
        X25519Field.mul(create, create3, create);
        X25519Field.mul(create2, create4, create2);
        X25519Field.mul(pointExt.f25296t, pointExt2.f25296t, create3);
        X25519Field.mul(create3, C_d2, create3);
        X25519Field.mul(pointExt.f25299z, pointExt2.f25299z, create4);
        X25519Field.add(create4, create4, create4);
        X25519Field.apm(create2, create, create8, create5);
        X25519Field.apm(create4, create3, create7, create6);
        X25519Field.carry(create7);
        X25519Field.mul(create5, create6, pointExt2.f25297x);
        X25519Field.mul(create7, create8, pointExt2.f25298y);
        X25519Field.mul(create6, create7, pointExt2.f25299z);
        X25519Field.mul(create5, create8, pointExt2.f25296t);
    }

    private static void pointAddVar(boolean z10, PointExt pointExt, PointExt pointExt2, PointExt pointExt3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] create4 = X25519Field.create();
        int[] create5 = X25519Field.create();
        int[] create6 = X25519Field.create();
        int[] create7 = X25519Field.create();
        int[] create8 = X25519Field.create();
        if (z10) {
            iArr2 = create3;
            iArr = create4;
            iArr4 = create6;
            iArr3 = create7;
        } else {
            iArr = create3;
            iArr2 = create4;
            iArr3 = create6;
            iArr4 = create7;
        }
        X25519Field.apm(pointExt.f25298y, pointExt.f25297x, create2, create);
        X25519Field.apm(pointExt2.f25298y, pointExt2.f25297x, iArr2, iArr);
        X25519Field.mul(create, create3, create);
        X25519Field.mul(create2, create4, create2);
        X25519Field.mul(pointExt.f25296t, pointExt2.f25296t, create3);
        X25519Field.mul(create3, C_d2, create3);
        X25519Field.mul(pointExt.f25299z, pointExt2.f25299z, create4);
        X25519Field.add(create4, create4, create4);
        X25519Field.apm(create2, create, create8, create5);
        X25519Field.apm(create4, create3, iArr4, iArr3);
        X25519Field.carry(iArr4);
        X25519Field.mul(create5, create6, pointExt3.f25297x);
        X25519Field.mul(create7, create8, pointExt3.f25298y);
        X25519Field.mul(create6, create7, pointExt3.f25299z);
        X25519Field.mul(create5, create8, pointExt3.f25296t);
    }

    private static PointExt pointCopy(PointAffine pointAffine) {
        PointExt pointExt = new PointExt();
        X25519Field.copy(pointAffine.f25294x, 0, pointExt.f25297x, 0);
        X25519Field.copy(pointAffine.f25295y, 0, pointExt.f25298y, 0);
        pointExtendXY(pointExt);
        return pointExt;
    }

    private static void pointExtendXY(PointExt pointExt) {
        X25519Field.one(pointExt.f25299z);
        X25519Field.mul(pointExt.f25297x, pointExt.f25298y, pointExt.f25296t);
    }

    private static void pointLookup(int[] iArr, int i, int[] iArr2, PointExt pointExt) {
        int window4 = getWindow4(iArr, i);
        int i9 = (window4 >>> 3) ^ 1;
        int i10 = (window4 ^ (-i9)) & 7;
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = ((i12 ^ i10) - 1) >> 31;
            X25519Field.cmov(i13, iArr2, i11, pointExt.f25297x, 0);
            X25519Field.cmov(i13, iArr2, i11 + 10, pointExt.f25298y, 0);
            X25519Field.cmov(i13, iArr2, i11 + 20, pointExt.f25299z, 0);
            X25519Field.cmov(i13, iArr2, i11 + 30, pointExt.f25296t, 0);
            i11 += 40;
        }
        X25519Field.cnegate(i9, pointExt.f25297x);
        X25519Field.cnegate(i9, pointExt.f25296t);
    }

    private static void pointSetNeutral(PointExt pointExt) {
        X25519Field.zero(pointExt.f25297x);
        X25519Field.one(pointExt.f25298y);
        X25519Field.one(pointExt.f25299z);
        X25519Field.zero(pointExt.f25296t);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, int i10, int i11, byte[] bArr4, int i12) {
        implSign(bArr, i, bArr2, i9, null, (byte) 0, bArr3, i10, i11, bArr4, i12);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte[] bArr4, int i10, byte[] bArr5, int i11) {
        implSign(bArr, i, bArr2, i9, bArr3, (byte) 1, bArr4, i10, 64, bArr5, i11);
    }

    public static boolean verify(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte[] bArr4, int i10, int i11) {
        return implVerify(bArr, i, bArr2, i9, bArr3, (byte) 0, bArr4, i10, i11);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte[] bArr4, int i10) {
        return implVerify(bArr, i, bArr2, i9, bArr3, (byte) 1, bArr4, i10, 64);
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte b9, byte[] bArr4, int i10, int i11, byte[] bArr5, int i12) {
        if (!checkContextVar(bArr3, b9)) {
            throw new IllegalArgumentException("ctx");
        }
        Digest createDigest = createDigest();
        byte[] bArr6 = new byte[createDigest.getDigestSize()];
        createDigest.update(bArr, i, 32);
        createDigest.doFinal(bArr6, 0);
        byte[] bArr7 = new byte[32];
        pruneScalar(bArr6, 0, bArr7);
        implSign(createDigest, bArr6, bArr7, bArr2, i9, bArr3, b9, bArr4, i10, i11, bArr5, i12);
    }

    private static PointExt pointCopy(PointExt pointExt) {
        PointExt pointExt2 = new PointExt();
        pointCopy(pointExt, pointExt2);
        return pointExt2;
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte[] bArr4, int i10, int i11, byte[] bArr5, int i12) {
        implSign(bArr, i, bArr2, i9, bArr3, (byte) 0, bArr4, i10, i11, bArr5, i12);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, Digest digest, byte[] bArr3, int i9) {
        byte[] bArr4 = new byte[64];
        if (64 != digest.doFinal(bArr4, 0)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i9);
    }

    private static void pointCopy(PointExt pointExt, PointExt pointExt2) {
        X25519Field.copy(pointExt.f25297x, 0, pointExt2.f25297x, 0);
        X25519Field.copy(pointExt.f25298y, 0, pointExt2.f25298y, 0);
        X25519Field.copy(pointExt.f25299z, 0, pointExt2.f25299z, 0);
        X25519Field.copy(pointExt.f25296t, 0, pointExt2.f25296t, 0);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i9, int i10, byte[] bArr4, int i11) {
        implSign(bArr, i, bArr2, (byte) 0, bArr3, i9, i10, bArr4, i11);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i9, byte[] bArr4, int i10) {
        implSign(bArr, i, bArr2, (byte) 1, bArr3, i9, 64, bArr4, i10);
    }
}
