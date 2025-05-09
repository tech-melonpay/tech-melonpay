package org.bouncycastle.math.ec.rfc8032;

import java.security.SecureRandom;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.math.ec.rfc7748.X448Field;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;

/* loaded from: classes.dex */
public abstract class Ed448 {
    private static final int COORD_INTS = 14;
    private static final int C_d = -39081;
    private static final int L4_0 = 43969588;
    private static final int L4_1 = 30366549;
    private static final int L4_2 = 163752818;
    private static final int L4_3 = 258169998;
    private static final int L4_4 = 96434764;
    private static final int L4_5 = 227822194;
    private static final int L4_6 = 149865618;
    private static final int L4_7 = 550336261;
    private static final int L_0 = 78101261;
    private static final int L_1 = 141809365;
    private static final int L_2 = 175155932;
    private static final int L_3 = 64542499;
    private static final int L_4 = 158326419;
    private static final int L_5 = 191173276;
    private static final int L_6 = 104575268;
    private static final int L_7 = 137584065;
    private static final long M26L = 67108863;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int POINT_BYTES = 57;
    private static final int PRECOMP_BLOCKS = 5;
    private static final int PRECOMP_MASK = 15;
    private static final int PRECOMP_POINTS = 16;
    private static final int PRECOMP_RANGE = 450;
    private static final int PRECOMP_SPACING = 18;
    private static final int PRECOMP_TEETH = 5;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 57;
    private static final int SCALAR_BYTES = 57;
    private static final int SCALAR_INTS = 14;
    public static final int SECRET_KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;
    private static final int WNAF_WIDTH_BASE = 7;
    private static final byte[] DOM4_PREFIX = {83, 105, 103, 69, ISOFileInfo.FMD_BYTE, ISO7816.INS_DECREASE_STAMPED, ISO7816.INS_DECREASE_STAMPED, 56};

    /* renamed from: P, reason: collision with root package name */
    private static final int[] f25301P = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: L, reason: collision with root package name */
    private static final int[] f25300L = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};
    private static final int[] B_x = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] B_y = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final Object precompLock = new Object();
    private static PointExt[] precompBaseTable = null;
    private static int[] precompBase = null;

    public static final class Algorithm {
        public static final int Ed448 = 0;
        public static final int Ed448ph = 1;
    }

    public static class F extends X448Field {
        private F() {
        }
    }

    public static class PointExt {

        /* renamed from: x, reason: collision with root package name */
        int[] f25302x;

        /* renamed from: y, reason: collision with root package name */
        int[] f25303y;

        /* renamed from: z, reason: collision with root package name */
        int[] f25304z;

        private PointExt() {
            this.f25302x = X448Field.create();
            this.f25303y = X448Field.create();
            this.f25304z = X448Field.create();
        }
    }

    public static class PointPrecomp {

        /* renamed from: x, reason: collision with root package name */
        int[] f25305x;

        /* renamed from: y, reason: collision with root package name */
        int[] f25306y;

        private PointPrecomp() {
            this.f25305x = X448Field.create();
            this.f25306y = X448Field.create();
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        decodeScalar(bArr, 0, iArr);
        int[] iArr2 = new int[14];
        decodeScalar(bArr2, 0, iArr2);
        int[] iArr3 = new int[14];
        decodeScalar(bArr3, 0, iArr3);
        Nat.mulAddTo(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        for (int i = 0; i < 28; i++) {
            encode32(iArr[i], bArr4, i * 4);
        }
        return reduceScalar(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(int[] iArr, int[] iArr2) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        X448Field.sqr(iArr, create2);
        X448Field.sqr(iArr2, create3);
        X448Field.mul(create2, create3, create);
        X448Field.add(create2, create3, create2);
        X448Field.mul(create, 39081, create);
        X448Field.subOne(create);
        X448Field.add(create, create2, create);
        X448Field.normalize(create);
        return X448Field.isZero(create);
    }

    private static boolean checkPointVar(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        decode32(bArr, 0, new int[14], 0, 14);
        return !Nat.gte(14, r2, f25301P);
    }

    private static boolean checkScalarVar(byte[] bArr, int[] iArr) {
        if (bArr[56] != 0) {
            return false;
        }
        decodeScalar(bArr, 0, iArr);
        return !Nat.gte(14, iArr, f25300L);
    }

    private static byte[] copy(byte[] bArr, int i, int i9) {
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i, bArr2, 0, i9);
        return bArr2;
    }

    public static Xof createPrehash() {
        return createXof();
    }

    private static Xof createXof() {
        return new SHAKEDigest(256);
    }

    private static int decode16(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    private static int decode24(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static boolean decodePointVar(byte[] bArr, int i, boolean z10, PointExt pointExt) {
        byte[] copy = copy(bArr, i, 57);
        if (!checkPointVar(copy)) {
            return false;
        }
        byte b9 = copy[56];
        int i9 = (b9 & ISOFileInfo.DATA_BYTES1) >>> 7;
        copy[56] = (byte) (b9 & Byte.MAX_VALUE);
        X448Field.decode(copy, 0, pointExt.f25303y);
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        X448Field.sqr(pointExt.f25303y, create);
        X448Field.mul(create, 39081, create2);
        X448Field.negate(create, create);
        X448Field.addOne(create);
        X448Field.addOne(create2);
        if (!X448Field.sqrtRatioVar(create, create2, pointExt.f25302x)) {
            return false;
        }
        X448Field.normalize(pointExt.f25302x);
        if (i9 == 1 && X448Field.isZeroVar(pointExt.f25302x)) {
            return false;
        }
        int[] iArr = pointExt.f25302x;
        if (z10 ^ (i9 != (iArr[0] & 1))) {
            X448Field.negate(iArr, iArr);
        }
        pointExtendXY(pointExt);
        return true;
    }

    private static void decodeScalar(byte[] bArr, int i, int[] iArr) {
        decode32(bArr, i, iArr, 0, 14);
    }

    private static void dom4(Xof xof, byte b9, byte[] bArr) {
        byte[] bArr2 = DOM4_PREFIX;
        int length = bArr2.length;
        int i = length + 2;
        int length2 = bArr.length + i;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b9;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i, bArr.length);
        xof.update(bArr3, 0, length2);
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

    private static int encodePoint(PointExt pointExt, byte[] bArr, int i) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        X448Field.inv(pointExt.f25304z, create2);
        X448Field.mul(pointExt.f25302x, create2, create);
        X448Field.mul(pointExt.f25303y, create2, create2);
        X448Field.normalize(create);
        X448Field.normalize(create2);
        int checkPoint = checkPoint(create, create2);
        X448Field.encode(create2, bArr, i);
        bArr[i + 56] = (byte) ((create[0] & 1) << 7);
        return checkPoint;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void generatePublicKey(byte[] bArr, int i, byte[] bArr2, int i9) {
        Xof createXof = createXof();
        byte[] bArr3 = new byte[114];
        createXof.update(bArr, i, 57);
        createXof.doFinal(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i9);
    }

    private static int getWindow4(int[] iArr, int i) {
        return (iArr[i >>> 3] >>> ((i & 7) << 2)) & 15;
    }

    private static byte[] getWnafVar(int[] iArr, int i) {
        int[] iArr2 = new int[28];
        int i9 = 0;
        int i10 = 14;
        int i11 = 28;
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
        byte[] bArr = new byte[447];
        int i14 = 32 - i;
        int i15 = 0;
        int i16 = 0;
        while (i9 < 28) {
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

    private static void implSign(Xof xof, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b9, byte[] bArr5, int i9, int i10, byte[] bArr6, int i11) {
        dom4(xof, b9, bArr4);
        xof.update(bArr, 57, 57);
        xof.update(bArr5, i9, i10);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] reduceScalar = reduceScalar(bArr);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(reduceScalar, bArr7, 0);
        dom4(xof, b9, bArr4);
        xof.update(bArr7, 0, 57);
        xof.update(bArr3, i, 57);
        xof.update(bArr5, i9, i10);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] calculateS = calculateS(reduceScalar, reduceScalar(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i11, 57);
        System.arraycopy(calculateS, 0, bArr6, i11 + 57, 57);
    }

    private static boolean implVerify(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte b9, byte[] bArr4, int i10, int i11) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] copy = copy(bArr, i, 57);
        byte[] copy2 = copy(bArr, i + 57, 57);
        if (!checkPointVar(copy)) {
            return false;
        }
        int[] iArr = new int[14];
        if (!checkScalarVar(copy2, iArr)) {
            return false;
        }
        PointExt pointExt = new PointExt();
        if (!decodePointVar(bArr2, i9, true, pointExt)) {
            return false;
        }
        Xof createXof = createXof();
        byte[] bArr5 = new byte[114];
        dom4(createXof, b9, bArr3);
        createXof.update(copy, 0, 57);
        createXof.update(bArr2, i9, 57);
        createXof.update(bArr4, i10, i11);
        createXof.doFinal(bArr5, 0, 114);
        int[] iArr2 = new int[14];
        decodeScalar(reduceScalar(bArr5), 0, iArr2);
        PointExt pointExt2 = new PointExt();
        scalarMultStrausVar(iArr, iArr2, pointExt, pointExt2);
        byte[] bArr6 = new byte[57];
        return encodePoint(pointExt2, bArr6, 0) != 0 && Arrays.areEqual(bArr6, copy);
    }

    private static boolean isNeutralElementVar(int[] iArr, int[] iArr2, int[] iArr3) {
        return X448Field.isZeroVar(iArr) && X448Field.areEqualVar(iArr2, iArr3);
    }

    private static void pointAdd(PointExt pointExt, PointExt pointExt2) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        int[] create8 = X448Field.create();
        X448Field.mul(pointExt.f25304z, pointExt2.f25304z, create);
        X448Field.sqr(create, create2);
        X448Field.mul(pointExt.f25302x, pointExt2.f25302x, create3);
        X448Field.mul(pointExt.f25303y, pointExt2.f25303y, create4);
        X448Field.mul(create3, create4, create5);
        X448Field.mul(create5, 39081, create5);
        X448Field.add(create2, create5, create6);
        X448Field.sub(create2, create5, create7);
        X448Field.add(pointExt.f25302x, pointExt.f25303y, create2);
        X448Field.add(pointExt2.f25302x, pointExt2.f25303y, create5);
        X448Field.mul(create2, create5, create8);
        X448Field.add(create4, create3, create2);
        X448Field.sub(create4, create3, create5);
        X448Field.carry(create2);
        X448Field.sub(create8, create2, create8);
        X448Field.mul(create8, create, create8);
        X448Field.mul(create5, create, create5);
        X448Field.mul(create6, create8, pointExt2.f25302x);
        X448Field.mul(create5, create7, pointExt2.f25303y);
        X448Field.mul(create6, create7, pointExt2.f25304z);
    }

    private static void pointAddPrecomp(PointPrecomp pointPrecomp, PointExt pointExt) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        X448Field.sqr(pointExt.f25304z, create);
        X448Field.mul(pointPrecomp.f25305x, pointExt.f25302x, create2);
        X448Field.mul(pointPrecomp.f25306y, pointExt.f25303y, create3);
        X448Field.mul(create2, create3, create4);
        X448Field.mul(create4, 39081, create4);
        X448Field.add(create, create4, create5);
        X448Field.sub(create, create4, create6);
        X448Field.add(pointPrecomp.f25305x, pointPrecomp.f25306y, create);
        X448Field.add(pointExt.f25302x, pointExt.f25303y, create4);
        X448Field.mul(create, create4, create7);
        X448Field.add(create3, create2, create);
        X448Field.sub(create3, create2, create4);
        X448Field.carry(create);
        X448Field.sub(create7, create, create7);
        X448Field.mul(create7, pointExt.f25304z, create7);
        X448Field.mul(create4, pointExt.f25304z, create4);
        X448Field.mul(create5, create7, pointExt.f25302x);
        X448Field.mul(create4, create6, pointExt.f25303y);
        X448Field.mul(create5, create6, pointExt.f25304z);
    }

    private static void pointAddVar(boolean z10, PointExt pointExt, PointExt pointExt2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        int[] create8 = X448Field.create();
        if (z10) {
            X448Field.sub(pointExt.f25303y, pointExt.f25302x, create8);
            iArr2 = create2;
            iArr = create5;
            iArr4 = create6;
            iArr3 = create7;
        } else {
            X448Field.add(pointExt.f25303y, pointExt.f25302x, create8);
            iArr = create2;
            iArr2 = create5;
            iArr3 = create6;
            iArr4 = create7;
        }
        X448Field.mul(pointExt.f25304z, pointExt2.f25304z, create);
        X448Field.sqr(create, create2);
        X448Field.mul(pointExt.f25302x, pointExt2.f25302x, create3);
        X448Field.mul(pointExt.f25303y, pointExt2.f25303y, create4);
        X448Field.mul(create3, create4, create5);
        X448Field.mul(create5, 39081, create5);
        X448Field.add(create2, create5, iArr3);
        X448Field.sub(create2, create5, iArr4);
        X448Field.add(pointExt2.f25302x, pointExt2.f25303y, create5);
        X448Field.mul(create8, create5, create8);
        X448Field.add(create4, create3, iArr);
        X448Field.sub(create4, create3, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(create8, create2, create8);
        X448Field.mul(create8, create, create8);
        X448Field.mul(create5, create, create5);
        X448Field.mul(create6, create8, pointExt2.f25302x);
        X448Field.mul(create5, create7, pointExt2.f25303y);
        X448Field.mul(create6, create7, pointExt2.f25304z);
    }

    private static PointExt pointCopy(PointExt pointExt) {
        PointExt pointExt2 = new PointExt();
        pointCopy(pointExt, pointExt2);
        return pointExt2;
    }

    private static void pointDouble(PointExt pointExt) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        X448Field.add(pointExt.f25302x, pointExt.f25303y, create);
        X448Field.sqr(create, create);
        X448Field.sqr(pointExt.f25302x, create2);
        X448Field.sqr(pointExt.f25303y, create3);
        X448Field.add(create2, create3, create4);
        X448Field.carry(create4);
        X448Field.sqr(pointExt.f25304z, create5);
        X448Field.add(create5, create5, create5);
        X448Field.carry(create5);
        X448Field.sub(create4, create5, create6);
        X448Field.sub(create, create4, create);
        X448Field.sub(create2, create3, create2);
        X448Field.mul(create, create6, pointExt.f25302x);
        X448Field.mul(create4, create2, pointExt.f25303y);
        X448Field.mul(create4, create6, pointExt.f25304z);
    }

    private static void pointExtendXY(PointExt pointExt) {
        X448Field.one(pointExt.f25304z);
    }

    private static void pointLookup(int i, int i9, PointPrecomp pointPrecomp) {
        int i10 = i * 512;
        for (int i11 = 0; i11 < 16; i11++) {
            int i12 = ((i11 ^ i9) - 1) >> 31;
            X448Field.cmov(i12, precompBase, i10, pointPrecomp.f25305x, 0);
            X448Field.cmov(i12, precompBase, i10 + 16, pointPrecomp.f25306y, 0);
            i10 += 32;
        }
    }

    private static void pointLookup15(int[] iArr, PointExt pointExt) {
        X448Field.copy(iArr, 336, pointExt.f25302x, 0);
        X448Field.copy(iArr, 352, pointExt.f25303y, 0);
        X448Field.copy(iArr, 368, pointExt.f25304z, 0);
    }

    private static int[] pointPrecompute(PointExt pointExt, int i) {
        PointExt pointCopy = pointCopy(pointExt);
        PointExt pointCopy2 = pointCopy(pointCopy);
        pointDouble(pointCopy2);
        int[] createTable = X448Field.createTable(i * 3);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            X448Field.copy(pointCopy.f25302x, 0, createTable, i9);
            X448Field.copy(pointCopy.f25303y, 0, createTable, i9 + 16);
            X448Field.copy(pointCopy.f25304z, 0, createTable, i9 + 32);
            i9 += 48;
            i10++;
            if (i10 == i) {
                return createTable;
            }
            pointAdd(pointCopy2, pointCopy);
        }
    }

    private static PointExt[] pointPrecomputeVar(PointExt pointExt, int i) {
        PointExt pointCopy = pointCopy(pointExt);
        pointDouble(pointCopy);
        PointExt[] pointExtArr = new PointExt[i];
        pointExtArr[0] = pointCopy(pointExt);
        for (int i9 = 1; i9 < i; i9++) {
            PointExt pointCopy2 = pointCopy(pointExtArr[i9 - 1]);
            pointExtArr[i9] = pointCopy2;
            pointAddVar(false, pointCopy, pointCopy2);
        }
        return pointExtArr;
    }

    private static void pointSetNeutral(PointExt pointExt) {
        X448Field.zero(pointExt.f25302x);
        X448Field.one(pointExt.f25303y);
        X448Field.one(pointExt.f25304z);
    }

    public static void precompute() {
        synchronized (precompLock) {
            try {
                if (precompBase != null) {
                    return;
                }
                PointExt pointExt = new PointExt();
                X448Field.copy(B_x, 0, pointExt.f25302x, 0);
                X448Field.copy(B_y, 0, pointExt.f25303y, 0);
                pointExtendXY(pointExt);
                precompBaseTable = pointPrecomputeVar(pointExt, 32);
                precompBase = X448Field.createTable(160);
                int i = 0;
                for (int i9 = 0; i9 < 5; i9++) {
                    PointExt[] pointExtArr = new PointExt[5];
                    PointExt pointExt2 = new PointExt();
                    pointSetNeutral(pointExt2);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 5) {
                            break;
                        }
                        pointAddVar(true, pointExt, pointExt2);
                        pointDouble(pointExt);
                        pointExtArr[i10] = pointCopy(pointExt);
                        if (i9 + i10 != 8) {
                            for (int i11 = 1; i11 < 18; i11++) {
                                pointDouble(pointExt);
                            }
                        }
                        i10++;
                    }
                    PointExt[] pointExtArr2 = new PointExt[16];
                    pointExtArr2[0] = pointExt2;
                    int i12 = 1;
                    for (int i13 = 0; i13 < 4; i13++) {
                        int i14 = 1 << i13;
                        int i15 = 0;
                        while (i15 < i14) {
                            PointExt pointCopy = pointCopy(pointExtArr2[i12 - i14]);
                            pointExtArr2[i12] = pointCopy;
                            pointAddVar(false, pointExtArr[i13], pointCopy);
                            i15++;
                            i12++;
                        }
                    }
                    int[] createTable = X448Field.createTable(16);
                    int[] create = X448Field.create();
                    X448Field.copy(pointExtArr2[0].f25304z, 0, create, 0);
                    X448Field.copy(create, 0, createTable, 0);
                    int i16 = 0;
                    while (true) {
                        int i17 = i16 + 1;
                        if (i17 >= 16) {
                            break;
                        }
                        X448Field.mul(create, pointExtArr2[i17].f25304z, create);
                        X448Field.copy(create, 0, createTable, i17 * 16);
                        i16 = i17;
                    }
                    X448Field.invVar(create, create);
                    int[] create2 = X448Field.create();
                    while (i16 > 0) {
                        int i18 = i16 - 1;
                        X448Field.copy(createTable, i18 * 16, create2, 0);
                        X448Field.mul(create2, create, create2);
                        X448Field.copy(create2, 0, createTable, i16 * 16);
                        X448Field.mul(create, pointExtArr2[i16].f25304z, create);
                        i16 = i18;
                    }
                    X448Field.copy(create, 0, createTable, 0);
                    for (int i19 = 0; i19 < 16; i19++) {
                        PointExt pointExt3 = pointExtArr2[i19];
                        X448Field.copy(createTable, i19 * 16, pointExt3.f25304z, 0);
                        int[] iArr = pointExt3.f25302x;
                        X448Field.mul(iArr, pointExt3.f25304z, iArr);
                        int[] iArr2 = pointExt3.f25303y;
                        X448Field.mul(iArr2, pointExt3.f25304z, iArr2);
                        X448Field.copy(pointExt3.f25302x, 0, precompBase, i);
                        X448Field.copy(pointExt3.f25303y, 0, precompBase, i + 16);
                        i += 32;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | ISOFileInfo.DATA_BYTES1);
        bArr2[56] = 0;
    }

    private static byte[] reduceScalar(byte[] bArr) {
        long decode32 = decode32(bArr, 84);
        long j10 = decode32 & 4294967295L;
        long decode322 = decode32(bArr, 91);
        long j11 = decode322 & 4294967295L;
        long decode323 = decode32(bArr, 98);
        long j12 = decode323 & 4294967295L;
        long decode324 = decode32(bArr, 105);
        long j13 = decode324 & 4294967295L;
        long decode16 = decode16(bArr, 112) & 4294967295L;
        long decode24 = ((decode24(bArr, 109) << 4) & 4294967295L) + (j13 >>> 28);
        long j14 = decode324 & M28L;
        long decode325 = (j14 * 163752818) + (decode24 * 30366549) + (decode16 * 43969588) + (decode32(bArr, 56) & 4294967295L);
        long decode242 = (j14 * 258169998) + (decode24 * 163752818) + (decode16 * 30366549) + ((decode24(bArr, 60) << 4) & 4294967295L);
        long decode326 = (j14 * 96434764) + (decode24 * 258169998) + (decode16 * 163752818) + (decode32(bArr, 63) & 4294967295L);
        long decode243 = (j14 * 227822194) + (decode24 * 96434764) + (decode16 * 258169998) + ((decode24(bArr, 67) << 4) & 4294967295L);
        long decode327 = (j14 * 149865618) + (decode24 * 227822194) + (decode16 * 96434764) + (decode32(bArr, 70) & 4294967295L);
        long decode244 = ((decode24(bArr, 102) << 4) & 4294967295L) + (j12 >>> 28);
        long j15 = decode323 & M28L;
        long decode245 = (decode244 * 43969588) + ((decode24(bArr, 46) << 4) & 4294967295L);
        long decode328 = (decode244 * 30366549) + (j14 * 43969588) + (decode32(bArr, 49) & 4294967295L);
        long decode246 = (decode244 * 163752818) + (j14 * 30366549) + (decode24 * 43969588) + ((decode24(bArr, 53) << 4) & 4294967295L);
        long j16 = (decode244 * 258169998) + decode325;
        long j17 = (decode244 * 96434764) + decode242;
        long j18 = (decode244 * 227822194) + decode326;
        long j19 = (decode244 * 149865618) + decode243;
        long j20 = (decode244 * 550336261) + decode327;
        long decode329 = (j15 * 43969588) + (decode32(bArr, 42) & 4294967295L);
        long j21 = (j15 * 30366549) + decode245;
        long j22 = (j15 * 163752818) + decode328;
        long j23 = (j15 * 258169998) + decode246;
        long j24 = (j15 * 96434764) + j16;
        long j25 = (j15 * 227822194) + j17;
        long j26 = (j15 * 149865618) + j18;
        long j27 = (j15 * 550336261) + j19;
        long decode247 = ((decode24(bArr, 95) << 4) & 4294967295L) + (j11 >>> 28);
        long j28 = decode322 & M28L;
        long j29 = (decode247 * 163752818) + j21;
        long j30 = (decode247 * 258169998) + j22;
        long j31 = (decode247 * 149865618) + j25;
        long decode3210 = (j28 * 43969588) + (decode32(bArr, 35) & 4294967295L);
        long decode248 = (j28 * 30366549) + (decode247 * 43969588) + ((decode24(bArr, 39) << 4) & 4294967295L);
        long j32 = (j28 * 163752818) + (decode247 * 30366549) + decode329;
        long j33 = (j28 * 258169998) + j29;
        long j34 = (j28 * 96434764) + j30;
        long j35 = (j28 * 227822194) + (decode247 * 96434764) + j23;
        long j36 = (j28 * 149865618) + (decode247 * 227822194) + j24;
        long j37 = (j28 * 550336261) + j31;
        long decode249 = ((decode24(bArr, 88) << 4) & 4294967295L) + (j10 >>> 28);
        long j38 = decode32 & M28L;
        long j39 = (decode249 * 30366549) + decode3210;
        long j40 = (decode249 * 163752818) + decode248;
        long j41 = (decode249 * 258169998) + j32;
        long j42 = (decode249 * 96434764) + j33;
        long j43 = (decode249 * 227822194) + j34;
        long j44 = (decode249 * 149865618) + j35;
        long decode2410 = (j14 * 550336261) + (decode24 * 149865618) + (decode16 * 227822194) + ((decode24(bArr, 74) << 4) & 4294967295L) + (j20 >>> 28);
        long j45 = j20 & M28L;
        long decode3211 = (decode24 * 550336261) + (decode16 * 149865618) + (decode32(bArr, 77) & 4294967295L) + (decode2410 >>> 28);
        long j46 = decode2410 & M28L;
        long decode2411 = (decode16 * 550336261) + ((decode24(bArr, 81) << 4) & 4294967295L) + (decode3211 >>> 28);
        long j47 = decode3211 & M28L;
        long j48 = j38 + (decode2411 >>> 28);
        long j49 = decode2411 & M28L;
        long decode3212 = (j48 * 43969588) + (decode32(bArr, 28) & 4294967295L);
        long decode2412 = (j48 * 30366549) + (decode249 * 43969588) + ((decode24(bArr, 32) << 4) & 4294967295L);
        long j50 = (j48 * 163752818) + j39;
        long j51 = (j48 * 258169998) + j40;
        long j52 = (j48 * 96434764) + j41;
        long j53 = (j48 * 227822194) + j42;
        long j54 = (j48 * 149865618) + j43;
        long j55 = (j48 * 550336261) + j44;
        long decode2413 = (j49 * 43969588) + ((decode24(bArr, 25) << 4) & 4294967295L);
        long j56 = (j49 * 30366549) + decode3212;
        long j57 = (j49 * 163752818) + decode2412;
        long j58 = (j49 * 258169998) + j50;
        long j59 = (j49 * 96434764) + j51;
        long j60 = (j49 * 227822194) + j52;
        long j61 = (j49 * 149865618) + j53;
        long j62 = (j49 * 550336261) + j54;
        long decode3213 = (j47 * 43969588) + (decode32(bArr, 21) & 4294967295L);
        long j63 = (j47 * 30366549) + decode2413;
        long j64 = (j47 * 163752818) + j56;
        long j65 = (j47 * 258169998) + j57;
        long j66 = (j47 * 96434764) + j58;
        long j67 = (j47 * 227822194) + j59;
        long j68 = (j47 * 149865618) + j60;
        long j69 = (j47 * 550336261) + j61;
        long j70 = (decode247 * 550336261) + j26 + (j37 >>> 28);
        long j71 = j37 & M28L;
        long j72 = j27 + (j70 >>> 28);
        long j73 = j70 & M28L;
        long j74 = j45 + (j72 >>> 28);
        long j75 = j72 & M28L;
        long j76 = j46 + (j74 >>> 28);
        long j77 = j74 & M28L;
        long decode2414 = (j76 * 43969588) + ((decode24(bArr, 18) << 4) & 4294967295L);
        long j78 = (j76 * 30366549) + decode3213;
        long j79 = (j76 * 163752818) + j63;
        long j80 = (j76 * 258169998) + j64;
        long j81 = (j76 * 96434764) + j65;
        long j82 = (j76 * 227822194) + j66;
        long j83 = (j76 * 149865618) + j67;
        long j84 = (j76 * 550336261) + j68;
        long j85 = (j77 * 163752818) + j78;
        long j86 = (j77 * 258169998) + j79;
        long j87 = (j77 * 96434764) + j80;
        long j88 = (j77 * 227822194) + j81;
        long j89 = (j77 * 149865618) + j82;
        long decode2415 = (j75 * 43969588) + ((decode24(bArr, 11) << 4) & 4294967295L);
        long decode3214 = (j75 * 30366549) + (j77 * 43969588) + (decode32(bArr, 14) & 4294967295L);
        long j90 = (j75 * 163752818) + (j77 * 30366549) + decode2414;
        long j91 = (j75 * 258169998) + j85;
        long j92 = (j75 * 96434764) + j86;
        long j93 = (j75 * 227822194) + j87;
        long j94 = (j75 * 149865618) + j88;
        long j95 = (j75 * 550336261) + j89;
        long j96 = j55 + (j62 >>> 28);
        long j97 = j62 & M28L;
        long j98 = (decode249 * 550336261) + j36 + (j96 >>> 28);
        long j99 = j96 & M28L;
        long j100 = j71 + (j98 >>> 28);
        long j101 = j98 & M28L;
        long j102 = j73 + (j100 >>> 28);
        long j103 = j100 & M28L;
        long j104 = (j102 * 30366549) + decode2415;
        long j105 = (j102 * 163752818) + decode3214;
        long j106 = (j102 * 258169998) + j90;
        long j107 = (j102 * 96434764) + j91;
        long j108 = (149865618 * j103) + (j102 * 227822194) + j92;
        long j109 = j96 & M26L;
        long j110 = (j101 * 4) + (j99 >>> 26) + 1;
        long decode3215 = (78101261 * j110) + (decode32(bArr, 0) & 4294967295L);
        long decode2416 = (141809365 * j110) + (43969588 * j103) + ((decode24(bArr, 4) << 4) & 4294967295L) + (decode3215 >>> 28);
        long j111 = decode3215 & M28L;
        long decode3216 = (175155932 * j110) + (30366549 * j103) + (j102 * 43969588) + (decode32(bArr, 7) & 4294967295L) + (decode2416 >>> 28);
        long j112 = decode2416 & M28L;
        long j113 = (64542499 * j110) + (163752818 * j103) + j104 + (decode3216 >>> 28);
        long j114 = decode3216 & M28L;
        long j115 = (158326419 * j110) + (258169998 * j103) + j105 + (j113 >>> 28);
        long j116 = j113 & M28L;
        long j117 = (191173276 * j110) + (96434764 * j103) + j106 + (j115 >>> 28);
        long j118 = j115 & M28L;
        long j119 = (104575268 * j110) + (227822194 * j103) + j107 + (j117 >>> 28);
        long j120 = j117 & M28L;
        long j121 = (j110 * 137584065) + j108 + (j119 >>> 28);
        long j122 = j119 & M28L;
        long j123 = (j103 * 550336261) + (j102 * 149865618) + j93 + (j121 >>> 28);
        long j124 = j121 & M28L;
        long j125 = (j102 * 550336261) + j94 + (j123 >>> 28);
        long j126 = j123 & M28L;
        long j127 = j95 + (j125 >>> 28);
        long j128 = j125 & M28L;
        long j129 = (j77 * 550336261) + j83 + (j127 >>> 28);
        long j130 = j127 & M28L;
        long j131 = j84 + (j129 >>> 28);
        long j132 = j129 & M28L;
        long j133 = j69 + (j131 >>> 28);
        long j134 = j131 & M28L;
        long j135 = j97 + (j133 >>> 28);
        long j136 = j133 & M28L;
        long j137 = j109 + (j135 >>> 28);
        long j138 = j135 & M28L;
        long j139 = j137 & M26L;
        long j140 = (j137 >>> 26) - 1;
        long j141 = j111 - (j140 & 78101261);
        long j142 = (j112 - (j140 & 141809365)) + (j141 >> 28);
        long j143 = j141 & M28L;
        long j144 = (j114 - (j140 & 175155932)) + (j142 >> 28);
        long j145 = j142 & M28L;
        long j146 = (j116 - (j140 & 64542499)) + (j144 >> 28);
        long j147 = j144 & M28L;
        long j148 = (j118 - (j140 & 158326419)) + (j146 >> 28);
        long j149 = j146 & M28L;
        long j150 = (j120 - (j140 & 191173276)) + (j148 >> 28);
        long j151 = j148 & M28L;
        long j152 = (j122 - (j140 & 104575268)) + (j150 >> 28);
        long j153 = j150 & M28L;
        long j154 = (j124 - (j140 & 137584065)) + (j152 >> 28);
        long j155 = j152 & M28L;
        long j156 = j126 + (j154 >> 28);
        long j157 = j154 & M28L;
        long j158 = j128 + (j156 >> 28);
        long j159 = j156 & M28L;
        long j160 = j130 + (j158 >> 28);
        long j161 = j158 & M28L;
        long j162 = j132 + (j160 >> 28);
        long j163 = j160 & M28L;
        long j164 = j134 + (j162 >> 28);
        long j165 = j162 & M28L;
        long j166 = j136 + (j164 >> 28);
        long j167 = j164 & M28L;
        long j168 = j138 + (j166 >> 28);
        long j169 = j166 & M28L;
        long j170 = j139 + (j168 >> 28);
        long j171 = j168 & M28L;
        byte[] bArr2 = new byte[57];
        encode56(j143 | (j145 << 28), bArr2, 0);
        encode56((j149 << 28) | j147, bArr2, 7);
        encode56(j151 | (j153 << 28), bArr2, 14);
        encode56(j155 | (j157 << 28), bArr2, 21);
        encode56(j159 | (j161 << 28), bArr2, 28);
        encode56(j163 | (j165 << 28), bArr2, 35);
        encode56(j167 | (j169 << 28), bArr2, 42);
        encode56(j171 | (j170 << 28), bArr2, 49);
        return bArr2;
    }

    private static void scalarMult(byte[] bArr, PointExt pointExt, PointExt pointExt2) {
        int[] iArr = new int[14];
        decodeScalar(bArr, 0, iArr);
        Nat.shiftDownBit(14, iArr, Nat.cadd(14, (~iArr[0]) & 1, iArr, f25300L, iArr));
        int[] pointPrecompute = pointPrecompute(pointExt, 8);
        PointExt pointExt3 = new PointExt();
        pointLookup15(pointPrecompute, pointExt2);
        pointAdd(pointExt, pointExt2);
        int i = 111;
        while (true) {
            pointLookup(iArr, i, pointPrecompute, pointExt3);
            pointAdd(pointExt3, pointExt2);
            i--;
            if (i < 0) {
                return;
            }
            for (int i9 = 0; i9 < 4; i9++) {
                pointDouble(pointExt2);
            }
        }
    }

    private static void scalarMultBase(byte[] bArr, PointExt pointExt) {
        precompute();
        int[] iArr = new int[15];
        decodeScalar(bArr, 0, iArr);
        iArr[14] = Nat.cadd(14, (~iArr[0]) & 1, iArr, f25300L, iArr) + 4;
        Nat.shiftDownBit(15, iArr, 0);
        PointPrecomp pointPrecomp = new PointPrecomp();
        pointSetNeutral(pointExt);
        int i = 17;
        while (true) {
            int i9 = i;
            for (int i10 = 0; i10 < 5; i10++) {
                int i11 = 0;
                for (int i12 = 0; i12 < 5; i12++) {
                    i11 = (i11 & (~(1 << i12))) ^ ((iArr[i9 >>> 5] >>> (i9 & 31)) << i12);
                    i9 += 18;
                }
                int i13 = (i11 >>> 4) & 1;
                pointLookup(i10, ((-i13) ^ i11) & 15, pointPrecomp);
                X448Field.cnegate(i13, pointPrecomp.f25305x);
                pointAddPrecomp(pointPrecomp, pointExt);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointExt);
            }
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i) {
        PointExt pointExt = new PointExt();
        scalarMultBase(bArr, pointExt);
        if (encodePoint(pointExt, bArr2, i) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void scalarMultBaseXY(X448.Friend friend, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by X448");
        }
        byte[] bArr2 = new byte[57];
        pruneScalar(bArr, i, bArr2);
        PointExt pointExt = new PointExt();
        scalarMultBase(bArr2, pointExt);
        if (checkPoint(pointExt.f25302x, pointExt.f25303y, pointExt.f25304z) == 0) {
            throw new IllegalStateException();
        }
        X448Field.copy(pointExt.f25302x, 0, iArr, 0);
        X448Field.copy(pointExt.f25303y, 0, iArr2, 0);
    }

    private static void scalarMultOrderVar(PointExt pointExt, PointExt pointExt2) {
        byte[] wnafVar = getWnafVar(f25300L, 5);
        PointExt[] pointPrecomputeVar = pointPrecomputeVar(pointExt, 8);
        pointSetNeutral(pointExt2);
        int i = 446;
        while (true) {
            byte b9 = wnafVar[i];
            if (b9 != 0) {
                int i9 = b9 >> 31;
                pointAddVar(i9 != 0, pointPrecomputeVar[(b9 ^ i9) >>> 1], pointExt2);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointExt2);
            }
        }
    }

    private static void scalarMultStrausVar(int[] iArr, int[] iArr2, PointExt pointExt, PointExt pointExt2) {
        precompute();
        byte[] wnafVar = getWnafVar(iArr, 7);
        byte[] wnafVar2 = getWnafVar(iArr2, 5);
        PointExt[] pointPrecomputeVar = pointPrecomputeVar(pointExt, 8);
        pointSetNeutral(pointExt2);
        int i = 446;
        while (true) {
            byte b9 = wnafVar[i];
            if (b9 != 0) {
                int i9 = b9 >> 31;
                pointAddVar(i9 != 0, precompBaseTable[(b9 ^ i9) >>> 1], pointExt2);
            }
            byte b10 = wnafVar2[i];
            if (b10 != 0) {
                int i10 = b10 >> 31;
                pointAddVar(i10 != 0, pointPrecomputeVar[(b10 ^ i10) >>> 1], pointExt2);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointExt2);
            }
        }
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte[] bArr4, int i10, int i11, byte[] bArr5, int i12) {
        implSign(bArr, i, bArr2, i9, bArr3, (byte) 0, bArr4, i10, i11, bArr5, i12);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, Xof xof, byte[] bArr4, int i10) {
        byte[] bArr5 = new byte[64];
        if (64 != xof.doFinal(bArr5, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i, bArr2, i9, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i10);
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i) {
        PointExt pointExt = new PointExt();
        if (!decodePointVar(bArr, i, false, pointExt)) {
            return false;
        }
        X448Field.normalize(pointExt.f25302x);
        X448Field.normalize(pointExt.f25303y);
        X448Field.normalize(pointExt.f25304z);
        if (isNeutralElementVar(pointExt.f25302x, pointExt.f25303y, pointExt.f25304z)) {
            return false;
        }
        PointExt pointExt2 = new PointExt();
        scalarMultOrderVar(pointExt, pointExt2);
        X448Field.normalize(pointExt2.f25302x);
        X448Field.normalize(pointExt2.f25303y);
        X448Field.normalize(pointExt2.f25304z);
        return isNeutralElementVar(pointExt2.f25302x, pointExt2.f25303y, pointExt2.f25304z);
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i) {
        return decodePointVar(bArr, i, false, new PointExt());
    }

    public static boolean verify(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte[] bArr4, int i10, int i11) {
        return implVerify(bArr, i, bArr2, i9, bArr3, (byte) 0, bArr4, i10, i11);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, Xof xof) {
        byte[] bArr4 = new byte[64];
        if (64 == xof.doFinal(bArr4, 0, 64)) {
            return implVerify(bArr, i, bArr2, i9, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new IllegalArgumentException("ph");
    }

    private static int checkPoint(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        X448Field.sqr(iArr, create2);
        X448Field.sqr(iArr2, create3);
        X448Field.sqr(iArr3, create4);
        X448Field.mul(create2, create3, create);
        X448Field.add(create2, create3, create2);
        X448Field.mul(create2, create4, create2);
        X448Field.sqr(create4, create4);
        X448Field.mul(create, 39081, create);
        X448Field.sub(create, create4, create);
        X448Field.add(create, create2, create);
        X448Field.normalize(create);
        return X448Field.isZero(create);
    }

    private static void decode32(byte[] bArr, int i, int[] iArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i9 + i11] = decode32(bArr, (i11 * 4) + i);
        }
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, byte b9, byte[] bArr3, int i9, int i10, byte[] bArr4, int i11) {
        if (!checkContextVar(bArr2)) {
            throw new IllegalArgumentException("ctx");
        }
        Xof createXof = createXof();
        byte[] bArr5 = new byte[114];
        createXof.update(bArr, i, 57);
        createXof.doFinal(bArr5, 0, 114);
        byte[] bArr6 = new byte[57];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(createXof, bArr5, bArr6, bArr7, 0, bArr2, b9, bArr3, i9, i10, bArr4, i11);
    }

    private static void pointCopy(PointExt pointExt, PointExt pointExt2) {
        X448Field.copy(pointExt.f25302x, 0, pointExt2.f25302x, 0);
        X448Field.copy(pointExt.f25303y, 0, pointExt2.f25303y, 0);
        X448Field.copy(pointExt.f25304z, 0, pointExt2.f25304z, 0);
    }

    private static void pointLookup(int[] iArr, int i, int[] iArr2, PointExt pointExt) {
        int window4 = getWindow4(iArr, i);
        int i9 = (window4 >>> 3) ^ 1;
        int i10 = (window4 ^ (-i9)) & 7;
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = ((i12 ^ i10) - 1) >> 31;
            X448Field.cmov(i13, iArr2, i11, pointExt.f25302x, 0);
            X448Field.cmov(i13, iArr2, i11 + 16, pointExt.f25303y, 0);
            X448Field.cmov(i13, iArr2, i11 + 32, pointExt.f25304z, 0);
            i11 += 48;
        }
        X448Field.cnegate(i9, pointExt.f25302x);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i9, int i10, byte[] bArr4, int i11) {
        implSign(bArr, i, bArr2, (byte) 0, bArr3, i9, i10, bArr4, i11);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte[] bArr4, int i10, byte[] bArr5, int i11) {
        implSign(bArr, i, bArr2, i9, bArr3, (byte) 1, bArr4, i10, 64, bArr5, i11);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte[] bArr4, int i10) {
        return implVerify(bArr, i, bArr2, i9, bArr3, (byte) 1, bArr4, i10, 64);
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, byte b9, byte[] bArr4, int i10, int i11, byte[] bArr5, int i12) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        Xof createXof = createXof();
        byte[] bArr6 = new byte[114];
        createXof.update(bArr, i, 57);
        createXof.doFinal(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        pruneScalar(bArr6, 0, bArr7);
        implSign(createXof, bArr6, bArr7, bArr2, i9, bArr3, b9, bArr4, i10, i11, bArr5, i12);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, Xof xof, byte[] bArr3, int i9) {
        byte[] bArr4 = new byte[64];
        if (64 != xof.doFinal(bArr4, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i9);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i9, byte[] bArr4, int i10) {
        implSign(bArr, i, bArr2, (byte) 1, bArr3, i9, 64, bArr4, i10);
    }
}
