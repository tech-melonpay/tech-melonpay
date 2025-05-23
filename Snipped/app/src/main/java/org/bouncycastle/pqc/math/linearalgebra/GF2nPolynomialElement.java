package org.bouncycastle.pqc.math.linearalgebra;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class GF2nPolynomialElement extends GF2nElement {
    private static final int[] bitMask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, PKIFailureInfo.badCertTemplate, PKIFailureInfo.badSenderNonce, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, PKIFailureInfo.duplicateCertReq, 1073741824, Integer.MIN_VALUE, 0};
    private GF2Polynomial polynomial;

    public GF2nPolynomialElement(GF2nPolynomialElement gF2nPolynomialElement) {
        this.mField = gF2nPolynomialElement.mField;
        this.mDegree = gF2nPolynomialElement.mDegree;
        this.polynomial = new GF2Polynomial(gF2nPolynomialElement.polynomial);
    }

    public static GF2nPolynomialElement ONE(GF2nPolynomialField gF2nPolynomialField) {
        return new GF2nPolynomialElement(gF2nPolynomialField, new GF2Polynomial(gF2nPolynomialField.getDegree(), new int[]{1}));
    }

    public static GF2nPolynomialElement ZERO(GF2nPolynomialField gF2nPolynomialField) {
        return new GF2nPolynomialElement(gF2nPolynomialField, new GF2Polynomial(gF2nPolynomialField.getDegree()));
    }

    private GF2Polynomial getGF2Polynomial() {
        return new GF2Polynomial(this.polynomial);
    }

    private GF2nPolynomialElement halfTrace() {
        if ((this.mDegree & 1) == 0) {
            throw new RuntimeException();
        }
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        for (int i = 1; i <= ((this.mDegree - 1) >> 1); i++) {
            gF2nPolynomialElement.squareThis();
            gF2nPolynomialElement.squareThis();
            gF2nPolynomialElement.addToThis(this);
        }
        return gF2nPolynomialElement;
    }

    private void randomize(Random random) {
        this.polynomial.expandN(this.mDegree);
        this.polynomial.randomize(random);
    }

    private void reducePentanomialBitwise(int[] iArr) {
        int i = this.mDegree;
        int i9 = i - iArr[2];
        int i10 = i - iArr[1];
        int i11 = i - iArr[0];
        for (int length = this.polynomial.getLength() - 1; length >= this.mDegree; length--) {
            if (this.polynomial.testBit(length)) {
                this.polynomial.xorBit(length);
                this.polynomial.xorBit(length - i9);
                this.polynomial.xorBit(length - i10);
                this.polynomial.xorBit(length - i11);
                this.polynomial.xorBit(length - this.mDegree);
            }
        }
        this.polynomial.reduceN();
        this.polynomial.expandN(this.mDegree);
    }

    private void reduceThis() {
        if (this.polynomial.getLength() <= this.mDegree) {
            int length = this.polynomial.getLength();
            int i = this.mDegree;
            if (length < i) {
                this.polynomial.expandN(i);
                return;
            }
            return;
        }
        if (((GF2nPolynomialField) this.mField).isTrinomial()) {
            try {
                int tc = ((GF2nPolynomialField) this.mField).getTc();
                if (this.mDegree - tc > 32) {
                    int length2 = this.polynomial.getLength();
                    int i9 = this.mDegree;
                    if (length2 <= (i9 << 1)) {
                        this.polynomial.reduceTrinomial(i9, tc);
                        return;
                    }
                }
                reduceTrinomialBitwise(tc);
                return;
            } catch (RuntimeException unused) {
                throw new RuntimeException("GF2nPolynomialElement.reduce: the field polynomial is not a trinomial");
            }
        }
        if (!((GF2nPolynomialField) this.mField).isPentanomial()) {
            GF2Polynomial remainder = this.polynomial.remainder(this.mField.getFieldPolynomial());
            this.polynomial = remainder;
            remainder.expandN(this.mDegree);
            return;
        }
        try {
            int[] pc = ((GF2nPolynomialField) this.mField).getPc();
            if (this.mDegree - pc[2] > 32) {
                int length3 = this.polynomial.getLength();
                int i10 = this.mDegree;
                if (length3 <= (i10 << 1)) {
                    this.polynomial.reducePentanomial(i10, pc);
                    return;
                }
            }
            reducePentanomialBitwise(pc);
        } catch (RuntimeException unused2) {
            throw new RuntimeException("GF2nPolynomialElement.reduce: the field polynomial is not a pentanomial");
        }
    }

    private void reduceTrinomialBitwise(int i) {
        int i9 = this.mDegree - i;
        int length = this.polynomial.getLength();
        while (true) {
            length--;
            if (length < this.mDegree) {
                this.polynomial.reduceN();
                this.polynomial.expandN(this.mDegree);
                return;
            } else if (this.polynomial.testBit(length)) {
                this.polynomial.xorBit(length);
                this.polynomial.xorBit(length - i9);
                this.polynomial.xorBit(length - this.mDegree);
            }
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.addToThis(gFElement);
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) {
        if (!(gFElement instanceof GF2nPolynomialElement)) {
            throw new RuntimeException();
        }
        GF2nPolynomialElement gF2nPolynomialElement = (GF2nPolynomialElement) gFElement;
        if (!this.mField.equals(gF2nPolynomialElement.mField)) {
            throw new RuntimeException();
        }
        this.polynomial.addToThis(gF2nPolynomialElement.polynomial);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void assignOne() {
        this.polynomial.assignOne();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void assignZero() {
        this.polynomial.assignZero();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nPolynomialElement(this);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nPolynomialElement)) {
            return false;
        }
        GF2nPolynomialElement gF2nPolynomialElement = (GF2nPolynomialElement) obj;
        GF2nField gF2nField = this.mField;
        if (gF2nField == gF2nPolynomialElement.mField || gF2nField.getFieldPolynomial().equals(gF2nPolynomialElement.mField.getFieldPolynomial())) {
            return this.polynomial.equals(gF2nPolynomialElement.polynomial);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        return this.polynomial.hashCode() + this.mField.hashCode();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.increaseThis();
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() {
        this.polynomial.increaseThis();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement invert() {
        return invertMAIA();
    }

    public GF2nPolynomialElement invertEEA() {
        if (isZero()) {
            throw new ArithmeticException();
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 32, "ONE");
        gF2Polynomial.reduceN();
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree + 32);
        gF2Polynomial2.reduceN();
        GF2Polynomial gF2Polynomial3 = getGF2Polynomial();
        GF2Polynomial fieldPolynomial = this.mField.getFieldPolynomial();
        gF2Polynomial3.reduceN();
        while (!gF2Polynomial3.isOne()) {
            gF2Polynomial3.reduceN();
            fieldPolynomial.reduceN();
            int length = gF2Polynomial3.getLength() - fieldPolynomial.getLength();
            if (length < 0) {
                length = -length;
                gF2Polynomial.reduceN();
                GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
                gF2Polynomial2 = gF2Polynomial;
                gF2Polynomial = gF2Polynomial4;
                GF2Polynomial gF2Polynomial5 = fieldPolynomial;
                fieldPolynomial = gF2Polynomial3;
                gF2Polynomial3 = gF2Polynomial5;
            }
            gF2Polynomial3.shiftLeftAddThis(fieldPolynomial, length);
            gF2Polynomial.shiftLeftAddThis(gF2Polynomial2, length);
        }
        gF2Polynomial.reduceN();
        return new GF2nPolynomialElement((GF2nPolynomialField) this.mField, gF2Polynomial);
    }

    public GF2nPolynomialElement invertMAIA() {
        if (isZero()) {
            throw new ArithmeticException();
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, "ONE");
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree);
        GF2Polynomial gF2Polynomial3 = getGF2Polynomial();
        GF2Polynomial fieldPolynomial = this.mField.getFieldPolynomial();
        while (true) {
            if (!gF2Polynomial3.testBit(0)) {
                gF2Polynomial3.shiftRightThis();
                if (gF2Polynomial.testBit(0)) {
                    gF2Polynomial.addToThis(this.mField.getFieldPolynomial());
                }
                gF2Polynomial.shiftRightThis();
            } else {
                if (gF2Polynomial3.isOne()) {
                    return new GF2nPolynomialElement((GF2nPolynomialField) this.mField, gF2Polynomial);
                }
                gF2Polynomial3.reduceN();
                fieldPolynomial.reduceN();
                if (gF2Polynomial3.getLength() < fieldPolynomial.getLength()) {
                    GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
                    gF2Polynomial2 = gF2Polynomial;
                    gF2Polynomial = gF2Polynomial4;
                    GF2Polynomial gF2Polynomial5 = fieldPolynomial;
                    fieldPolynomial = gF2Polynomial3;
                    gF2Polynomial3 = gF2Polynomial5;
                }
                gF2Polynomial3.addToThis(fieldPolynomial);
                gF2Polynomial.addToThis(gF2Polynomial2);
            }
        }
    }

    public GF2nPolynomialElement invertSquare() {
        if (isZero()) {
            throw new ArithmeticException();
        }
        int degree = this.mField.getDegree() - 1;
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.polynomial.expandN((this.mDegree << 1) + 32);
        gF2nPolynomialElement.polynomial.reduceN();
        int i = 1;
        for (int floorLog = IntegerFunctions.floorLog(degree) - 1; floorLog >= 0; floorLog--) {
            GF2nPolynomialElement gF2nPolynomialElement2 = new GF2nPolynomialElement(gF2nPolynomialElement);
            for (int i9 = 1; i9 <= i; i9++) {
                gF2nPolynomialElement2.squareThisPreCalc();
            }
            gF2nPolynomialElement.multiplyThisBy(gF2nPolynomialElement2);
            i <<= 1;
            if ((bitMask[floorLog] & degree) != 0) {
                gF2nPolynomialElement.squareThisPreCalc();
                gF2nPolynomialElement.multiplyThisBy(this);
                i++;
            }
        }
        gF2nPolynomialElement.squareThisPreCalc();
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isOne() {
        return this.polynomial.isOne();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isZero() {
        return this.polynomial.isZero();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.multiplyThisBy(gFElement);
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) {
        if (!(gFElement instanceof GF2nPolynomialElement)) {
            throw new RuntimeException();
        }
        GF2nPolynomialElement gF2nPolynomialElement = (GF2nPolynomialElement) gFElement;
        if (!this.mField.equals(gF2nPolynomialElement.mField)) {
            throw new RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
        } else {
            this.polynomial = this.polynomial.multiply(gF2nPolynomialElement.polynomial);
            reduceThis();
        }
    }

    public GF2nPolynomialElement power(int i) {
        if (i == 1) {
            return new GF2nPolynomialElement(this);
        }
        GF2nPolynomialElement ONE = ONE((GF2nPolynomialField) this.mField);
        if (i == 0) {
            return ONE;
        }
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.polynomial.expandN((gF2nPolynomialElement.mDegree << 1) + 32);
        gF2nPolynomialElement.polynomial.reduceN();
        for (int i9 = 0; i9 < this.mDegree; i9++) {
            if (((1 << i9) & i) != 0) {
                ONE.multiplyThisBy(gF2nPolynomialElement);
            }
            gF2nPolynomialElement.square();
        }
        return ONE;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() {
        GF2nPolynomialElement ZERO;
        GF2nPolynomialElement gF2nPolynomialElement;
        if (isZero()) {
            return ZERO((GF2nPolynomialField) this.mField);
        }
        if ((this.mDegree & 1) == 1) {
            return halfTrace();
        }
        do {
            GF2nPolynomialElement gF2nPolynomialElement2 = new GF2nPolynomialElement((GF2nPolynomialField) this.mField, new Random());
            ZERO = ZERO((GF2nPolynomialField) this.mField);
            gF2nPolynomialElement = (GF2nPolynomialElement) gF2nPolynomialElement2.clone();
            for (int i = 1; i < this.mDegree; i++) {
                ZERO.squareThis();
                gF2nPolynomialElement.squareThis();
                ZERO.addToThis(gF2nPolynomialElement.multiply(this));
                gF2nPolynomialElement.addToThis(gF2nPolynomialElement2);
            }
        } while (gF2nPolynomialElement.isZero());
        if (equals(ZERO.square().add(ZERO))) {
            return ZERO;
        }
        throw new RuntimeException();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        return squarePreCalc();
    }

    public GF2nPolynomialElement squareBitwise() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisBitwise();
        gF2nPolynomialElement.reduceThis();
        return gF2nPolynomialElement;
    }

    public GF2nPolynomialElement squareMatrix() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisMatrix();
        gF2nPolynomialElement.reduceThis();
        return gF2nPolynomialElement;
    }

    public GF2nPolynomialElement squarePreCalc() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisPreCalc();
        gF2nPolynomialElement.reduceThis();
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareRootThis();
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        this.polynomial.expandN((this.mDegree << 1) + 32);
        this.polynomial.reduceN();
        for (int i = 0; i < this.mField.getDegree() - 1; i++) {
            squareThis();
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        squareThisPreCalc();
    }

    public void squareThisBitwise() {
        this.polynomial.squareThisBitwise();
        reduceThis();
    }

    public void squareThisMatrix() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree);
        int i = 0;
        while (true) {
            if (i >= this.mDegree) {
                this.polynomial = gF2Polynomial;
                return;
            } else {
                if (this.polynomial.vectorMult(((GF2nPolynomialField) this.mField).squaringMatrix[(r2 - i) - 1])) {
                    gF2Polynomial.setBit(i);
                }
                i++;
            }
        }
    }

    public void squareThisPreCalc() {
        this.polynomial.squareThisPreCalc();
        reduceThis();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testBit(int i) {
        return this.polynomial.testBit(i);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return this.polynomial.testBit(0);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        return this.polynomial.toByteArray();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return this.polynomial.toFlexiBigInt();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public String toString() {
        return this.polynomial.toString(16);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public int trace() {
        GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this);
        for (int i = 1; i < this.mDegree; i++) {
            gF2nPolynomialElement.squareThis();
            gF2nPolynomialElement.addToThis(this);
        }
        return gF2nPolynomialElement.isOne() ? 1 : 0;
    }

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, Random random) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        this.polynomial = new GF2Polynomial(this.mDegree);
        randomize(random);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public String toString(int i) {
        return this.polynomial.toString(i);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, GF2Polynomial gF2Polynomial) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(gF2Polynomial);
        this.polynomial = gF2Polynomial2;
        gF2Polynomial2.expandN(this.mDegree);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, byte[] bArr) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, bArr);
        this.polynomial = gF2Polynomial;
        gF2Polynomial.expandN(this.mDegree);
    }

    public GF2nPolynomialElement(GF2nPolynomialField gF2nPolynomialField, int[] iArr) {
        this.mField = gF2nPolynomialField;
        this.mDegree = gF2nPolynomialField.getDegree();
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, iArr);
        this.polynomial = gF2Polynomial;
        gF2Polynomial.expandN(gF2nPolynomialField.mDegree);
    }
}
