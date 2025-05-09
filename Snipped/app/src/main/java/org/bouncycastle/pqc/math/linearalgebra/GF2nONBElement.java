package org.bouncycastle.pqc.math.linearalgebra;

import C.v;
import java.math.BigInteger;
import java.security.SecureRandom;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GF2nONBElement extends GF2nElement {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    private long[] mPol;
    private static final long[] mBitmask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, LockFreeTaskQueueCore.FROZEN_MASK, LockFreeTaskQueueCore.CLOSED_MASK, 4611686018427387904L, Long.MIN_VALUE};
    private static final long[] mMaxmask = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, LockFreeTaskQueueCore.HEAD_MASK, 2147483647L, BodyPartID.bodyIdMax, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, 9007199254740991L, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, 4611686018427387903L, Long.MAX_VALUE, -1};
    private static final int[] mIBY64 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    public GF2nONBElement(GF2nONBElement gF2nONBElement) {
        GF2nField gF2nField = gF2nONBElement.mField;
        this.mField = gF2nField;
        this.mDegree = gF2nField.getDegree();
        this.mLength = ((GF2nONBField) this.mField).getONBLength();
        this.mBit = ((GF2nONBField) this.mField).getONBBit();
        this.mPol = new long[this.mLength];
        assign(gF2nONBElement.getElement());
    }

    public static GF2nONBElement ONE(GF2nONBField gF2nONBField) {
        int oNBLength = gF2nONBField.getONBLength();
        long[] jArr = new long[oNBLength];
        int i = 0;
        while (true) {
            int i9 = oNBLength - 1;
            if (i >= i9) {
                jArr[i9] = mMaxmask[gF2nONBField.getONBBit() - 1];
                return new GF2nONBElement(gF2nONBField, jArr);
            }
            jArr[i] = -1;
            i++;
        }
    }

    public static GF2nONBElement ZERO(GF2nONBField gF2nONBField) {
        return new GF2nONBElement(gF2nONBField, new long[gF2nONBField.getONBLength()]);
    }

    private void assign(BigInteger bigInteger) {
        assign(bigInteger.toByteArray());
    }

    private long[] getElement() {
        long[] jArr = this.mPol;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    private long[] getElementReverseOrder() {
        long[] jArr = new long[this.mPol.length];
        int i = 0;
        while (true) {
            if (i >= this.mDegree) {
                return jArr;
            }
            if (testBit((r2 - i) - 1)) {
                int i9 = i >>> 6;
                jArr[i9] = jArr[i9] | mBitmask[i & 63];
            }
            i++;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) {
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException();
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        for (int i = 0; i < this.mLength; i++) {
            long[] jArr = this.mPol;
            jArr[i] = jArr[i] ^ gF2nONBElement.mPol[i];
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void assignOne() {
        int i = 0;
        while (true) {
            int i9 = this.mLength;
            if (i >= i9 - 1) {
                this.mPol[i9 - 1] = mMaxmask[this.mBit - 1];
                return;
            } else {
                this.mPol[i] = -1;
                i++;
            }
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void assignZero() {
        this.mPol = new long[this.mLength];
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nONBElement(this);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nONBElement)) {
            return false;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) obj;
        for (int i = 0; i < this.mLength; i++) {
            if (this.mPol[i] != gF2nONBElement.mPol[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        return Arrays.hashCode(this.mPol);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() {
        addToThis(ONE((GF2nONBField) this.mField));
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement invert() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.invertThis();
        return gF2nONBElement;
    }

    public void invertThis() {
        if (isZero()) {
            throw new ArithmeticException();
        }
        int i = 31;
        boolean z10 = false;
        while (!z10 && i >= 0) {
            if (((this.mDegree - 1) & mBitmask[i]) != 0) {
                z10 = true;
            }
            i--;
        }
        ZERO((GF2nONBField) this.mField);
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        int i9 = 1;
        while (i >= 0) {
            GF2nElement gF2nElement = (GF2nElement) gF2nONBElement.clone();
            for (int i10 = 1; i10 <= i9; i10++) {
                gF2nElement.squareThis();
            }
            gF2nONBElement.multiplyThisBy(gF2nElement);
            i9 <<= 1;
            if (((this.mDegree - 1) & mBitmask[i]) != 0) {
                gF2nONBElement.squareThis();
                gF2nONBElement.multiplyThisBy(this);
                i9++;
            }
            i--;
        }
        gF2nONBElement.squareThis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if ((r3 & r2[r5 - 1]) == r2[r5 - 1]) goto L18;
     */
    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isOne() {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r8.mLength
            int r5 = r4 + (-1)
            if (r2 >= r5) goto L1e
            if (r3 == 0) goto L1e
            if (r3 == 0) goto L1a
            long[] r3 = r8.mPol
            r4 = r3[r2]
            r6 = -1
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 != 0) goto L1a
            r3 = r0
            goto L1b
        L1a:
            r3 = r1
        L1b:
            int r2 = r2 + 1
            goto L4
        L1e:
            if (r3 == 0) goto L3a
            if (r3 == 0) goto L38
            long[] r2 = r8.mPol
            int r4 = r4 - r0
            r3 = r2[r4]
            long[] r2 = org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.mMaxmask
            int r5 = r8.mBit
            int r6 = r5 + (-1)
            r6 = r2[r6]
            long r3 = r3 & r6
            int r5 = r5 - r0
            r5 = r2[r5]
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L38
            goto L39
        L38:
            r0 = r1
        L39:
            r3 = r0
        L3a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.isOne():boolean");
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isZero() {
        boolean z10 = true;
        for (int i = 0; i < this.mLength && z10; i++) {
            z10 = z10 && this.mPol[i] == 0;
        }
        return z10;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) {
        boolean z10;
        char c2;
        boolean z11;
        char c10;
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException("The elements have different representation: not yet implemented");
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
            return;
        }
        long[] jArr = this.mPol;
        long[] jArr2 = gF2nONBElement.mPol;
        int i = this.mLength;
        long[] jArr3 = new long[i];
        int[][] iArr = ((GF2nONBField) this.mField).mMult;
        int i9 = i - 1;
        int i10 = this.mBit - 1;
        long[] jArr4 = mBitmask;
        long j10 = jArr4[63];
        long j11 = jArr4[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < this.mDegree; i12++) {
            int i13 = i11;
            int i14 = i13;
            while (i13 < this.mDegree) {
                int[] iArr2 = mIBY64;
                int i15 = iArr2[i13];
                int[] iArr3 = iArr[i13];
                int i16 = iArr3[i11];
                int i17 = iArr2[i16];
                int i18 = i16 & 63;
                long j12 = jArr[i15];
                long[] jArr5 = mBitmask;
                if ((j12 & jArr5[i13 & 63]) != 0) {
                    if ((jArr2[i17] & jArr5[i18]) != 0) {
                        i14 ^= 1;
                    }
                    int i19 = iArr3[1];
                    if (i19 != -1) {
                        if ((jArr2[iArr2[i19]] & jArr5[i19 & 63]) != 0) {
                            i14 ^= 1;
                        }
                    }
                }
                i13++;
                i11 = 0;
            }
            int i20 = mIBY64[i12];
            int i21 = i12 & 63;
            if (i14 != 0) {
                jArr3[i20] = jArr3[i20] ^ mBitmask[i21];
            }
            if (this.mLength > 1) {
                boolean z12 = (jArr[i9] & 1) == 1;
                int i22 = i - 2;
                int i23 = i22;
                while (i23 >= 0) {
                    long j13 = jArr[i23];
                    boolean z13 = (j13 & 1) != 0;
                    long j14 = j13 >>> 1;
                    jArr[i23] = j14;
                    if (z12) {
                        jArr[i23] = j14 ^ j10;
                    }
                    i23--;
                    z12 = z13;
                }
                long j15 = jArr[i9] >>> 1;
                jArr[i9] = j15;
                if (z12) {
                    jArr[i9] = j15 ^ j11;
                }
                boolean z14 = (jArr2[i9] & 1) == 1;
                while (i22 >= 0) {
                    long j16 = jArr2[i22];
                    boolean z15 = (j16 & 1) != 0;
                    long j17 = j16 >>> 1;
                    jArr2[i22] = j17;
                    if (z14) {
                        jArr2[i22] = j17 ^ j10;
                    }
                    i22--;
                    z14 = z15;
                }
                long j18 = jArr2[i9] >>> 1;
                jArr2[i9] = j18;
                if (z14) {
                    jArr2[i9] = j18 ^ j11;
                }
                i11 = 0;
            } else {
                i11 = 0;
                long j19 = jArr[0];
                if ((j19 & 1) == 1) {
                    c2 = 1;
                    z10 = true;
                } else {
                    z10 = false;
                    c2 = 1;
                }
                long j20 = j19 >>> c2;
                jArr[0] = j20;
                if (z10) {
                    jArr[0] = j20 ^ j11;
                }
                long j21 = jArr2[0];
                if ((j21 & 1) == 1) {
                    c10 = 1;
                    z11 = true;
                } else {
                    z11 = false;
                    c10 = 1;
                }
                long j22 = j21 >>> c10;
                jArr2[0] = j22;
                if (z11) {
                    jArr2[0] = j22 ^ j11;
                }
            }
        }
        assign(jArr3);
    }

    public void reverseOrder() {
        this.mPol = getElementReverseOrder();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() {
        int i;
        if (trace() == 1) {
            throw new RuntimeException();
        }
        long j10 = mBitmask[63];
        long[] jArr = new long[this.mLength];
        int i9 = 0;
        long j11 = 0;
        while (true) {
            i = this.mLength;
            if (i9 >= i - 1) {
                break;
            }
            for (int i10 = 1; i10 < 64; i10++) {
                long[] jArr2 = mBitmask;
                long j12 = jArr2[i10];
                long j13 = this.mPol[i9];
                if (((j12 & j13) == 0 || (j11 & jArr2[i10 - 1]) == 0) && ((j13 & j12) != 0 || (jArr2[i10 - 1] & j11) != 0)) {
                    j11 ^= j12;
                }
            }
            jArr[i9] = j11;
            long j14 = j11 & j10;
            j11 = ((j14 == 0 || (1 & this.mPol[i9 + 1]) != 1) && !(j14 == 0 && (this.mPol[i9 + 1] & 1) == 0)) ? 1L : 0L;
            i9++;
        }
        int i11 = 63 & this.mDegree;
        long j15 = this.mPol[i - 1];
        for (int i12 = 1; i12 < i11; i12++) {
            long[] jArr3 = mBitmask;
            long j16 = jArr3[i12];
            if (((j16 & j15) == 0 || (jArr3[i12 - 1] & j11) == 0) && ((j16 & j15) != 0 || (jArr3[i12 - 1] & j11) != 0)) {
                j11 ^= j16;
            }
        }
        jArr[this.mLength - 1] = j11;
        return new GF2nONBElement((GF2nONBField) this.mField, jArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        long[] element = getElement();
        int i = this.mLength - 1;
        int i9 = this.mBit - 1;
        long j10 = mBitmask[63];
        boolean z10 = (element[0] & 1) != 0;
        int i10 = i;
        while (i10 >= 0) {
            long j11 = element[i10];
            boolean z11 = (j11 & 1) != 0;
            long j12 = j11 >>> 1;
            element[i10] = j12;
            if (z10) {
                if (i10 == i) {
                    element[i10] = j12 ^ mBitmask[i9];
                } else {
                    element[i10] = j12 ^ j10;
                }
            }
            i10--;
            z10 = z11;
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        long[] element = getElement();
        int i = this.mLength - 1;
        int i9 = this.mBit;
        int i10 = i9 - 1;
        long[] jArr = mBitmask;
        long j10 = jArr[63];
        boolean z10 = (element[i] & jArr[i10]) != 0;
        int i11 = 0;
        while (i11 < i) {
            long j11 = element[i11];
            boolean z11 = (j11 & j10) != 0;
            long j12 = j11 << 1;
            element[i11] = j12;
            if (z10) {
                element[i11] = 1 ^ j12;
            }
            i11++;
            z10 = z11;
        }
        long j13 = element[i];
        long[] jArr2 = mBitmask;
        boolean z12 = (jArr2[i10] & j13) != 0;
        long j14 = j13 << 1;
        element[i] = j14;
        if (z10) {
            element[i] = j14 ^ 1;
        }
        if (z12) {
            element[i] = jArr2[i9] ^ element[i];
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testBit(int i) {
        return i >= 0 && i <= this.mDegree && (this.mPol[i >>> 6] & mBitmask[i & 63]) != 0;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return (this.mPol[this.mLength - 1] & mBitmask[this.mBit - 1]) != 0;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i];
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = (i9 & 7) << 3;
            bArr[(i - i9) - 1] = (byte) ((this.mPol[i9 >>> 3] & (255 << i10)) >>> i10);
        }
        return bArr;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return new BigInteger(1, toByteArray());
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public String toString() {
        return toString(16);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public int trace() {
        int i = this.mLength - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.mPol[i10] & mBitmask[i11]) != 0) {
                    i9 ^= 1;
                }
            }
        }
        int i12 = this.mBit;
        for (int i13 = 0; i13 < i12; i13++) {
            if ((this.mPol[i] & mBitmask[i13]) != 0) {
                i9 ^= 1;
            }
        }
        return i9;
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bigInteger);
    }

    private void assign(byte[] bArr) {
        this.mPol = new long[this.mLength];
        for (int i = 0; i < bArr.length; i++) {
            long[] jArr = this.mPol;
            int i9 = i >>> 3;
            jArr[i9] = jArr[i9] | ((bArr[(bArr.length - 1) - i] & 255) << ((i & 7) << 3));
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public String toString(int i) {
        long[] element = getElement();
        int i9 = this.mBit;
        String str = "";
        if (i == 2) {
            while (true) {
                i9--;
                if (i9 < 0) {
                    break;
                }
                str = (element[element.length + (-1)] & (1 << i9)) == 0 ? v.n(str, "0") : v.n(str, "1");
            }
            for (int length = element.length - 2; length >= 0; length--) {
                for (int i10 = 63; i10 >= 0; i10--) {
                    str = (element[length] & mBitmask[i10]) == 0 ? v.n(str, "0") : v.n(str, "1");
                }
            }
        } else if (i == 16) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            for (int length2 = element.length - 1; length2 >= 0; length2--) {
                StringBuilder s10 = v.s(str);
                s10.append(cArr[((int) (element[length2] >>> 60)) & 15]);
                StringBuilder s11 = v.s(s10.toString());
                s11.append(cArr[((int) (element[length2] >>> 56)) & 15]);
                StringBuilder s12 = v.s(s11.toString());
                s12.append(cArr[((int) (element[length2] >>> 52)) & 15]);
                StringBuilder s13 = v.s(s12.toString());
                s13.append(cArr[((int) (element[length2] >>> 48)) & 15]);
                StringBuilder s14 = v.s(s13.toString());
                s14.append(cArr[((int) (element[length2] >>> 44)) & 15]);
                StringBuilder s15 = v.s(s14.toString());
                s15.append(cArr[((int) (element[length2] >>> 40)) & 15]);
                StringBuilder s16 = v.s(s15.toString());
                s16.append(cArr[((int) (element[length2] >>> 36)) & 15]);
                StringBuilder s17 = v.s(s16.toString());
                s17.append(cArr[((int) (element[length2] >>> 32)) & 15]);
                StringBuilder s18 = v.s(s17.toString());
                s18.append(cArr[((int) (element[length2] >>> 28)) & 15]);
                StringBuilder s19 = v.s(s18.toString());
                s19.append(cArr[((int) (element[length2] >>> 24)) & 15]);
                StringBuilder s20 = v.s(s19.toString());
                s20.append(cArr[((int) (element[length2] >>> 20)) & 15]);
                StringBuilder s21 = v.s(s20.toString());
                s21.append(cArr[((int) (element[length2] >>> 16)) & 15]);
                StringBuilder s22 = v.s(s21.toString());
                s22.append(cArr[((int) (element[length2] >>> 12)) & 15]);
                StringBuilder s23 = v.s(s22.toString());
                s23.append(cArr[((int) (element[length2] >>> 8)) & 15]);
                StringBuilder s24 = v.s(s23.toString());
                s24.append(cArr[((int) (element[length2] >>> 4)) & 15]);
                StringBuilder s25 = v.s(s24.toString());
                s25.append(cArr[((int) element[length2]) & 15]);
                str = v.n(s25.toString(), " ");
            }
        }
        return str;
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        int i = this.mLength;
        long[] jArr = new long[i];
        this.mPol = jArr;
        if (i <= 1) {
            jArr[0] = secureRandom.nextLong();
            long[] jArr2 = this.mPol;
            jArr2[0] = jArr2[0] >>> (64 - this.mBit);
        } else {
            for (int i9 = 0; i9 < this.mLength - 1; i9++) {
                this.mPol[i9] = secureRandom.nextLong();
            }
            this.mPol[this.mLength - 1] = secureRandom.nextLong() >>> (64 - this.mBit);
        }
    }

    private void assign(long[] jArr) {
        System.arraycopy(jArr, 0, this.mPol, 0, this.mLength);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bArr);
    }

    private GF2nONBElement(GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = jArr;
    }
}
