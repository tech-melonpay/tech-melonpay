package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public class GF2nPolynomialField extends GF2nField {
    private boolean isPentanomial;
    private boolean isTrinomial;
    private int[] pc;
    GF2Polynomial[] squaringMatrix;
    private int tc;

    public GF2nPolynomialField(int i, SecureRandom secureRandom) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.pc = new int[3];
        if (i < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i;
        computeFieldPolynomial();
        computeSquaringMatrix();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    private void computeSquaringMatrix() {
        int i = this.mDegree;
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i - 1];
        this.squaringMatrix = new GF2Polynomial[i];
        int i9 = 0;
        while (true) {
            GF2Polynomial[] gF2PolynomialArr2 = this.squaringMatrix;
            if (i9 >= gF2PolynomialArr2.length) {
                break;
            }
            gF2PolynomialArr2[i9] = new GF2Polynomial(this.mDegree, "ZERO");
            i9++;
        }
        for (int i10 = 0; i10 < this.mDegree - 1; i10++) {
            gF2PolynomialArr[i10] = new GF2Polynomial(1, "ONE").shiftLeft(this.mDegree + i10).remainder(this.fieldPolynomial);
        }
        for (int i11 = 1; i11 <= Math.abs(this.mDegree >> 1); i11++) {
            int i12 = 1;
            while (true) {
                int i13 = this.mDegree;
                if (i12 <= i13) {
                    if (gF2PolynomialArr[i13 - (i11 << 1)].testBit(i13 - i12)) {
                        this.squaringMatrix[i12 - 1].setBit(this.mDegree - i11);
                    }
                    i12++;
                }
            }
        }
        int abs = Math.abs(this.mDegree >> 1) + 1;
        while (true) {
            int i14 = this.mDegree;
            if (abs > i14) {
                return;
            }
            this.squaringMatrix[((abs << 1) - i14) - 1].setBit(i14 - abs);
            abs++;
        }
    }

    private boolean testPentanomials() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        boolean z10 = false;
        int i = 1;
        while (i <= this.mDegree - 3 && !z10) {
            this.fieldPolynomial.setBit(i);
            int i9 = i + 1;
            int i10 = i9;
            while (i10 <= this.mDegree - 2 && !z10) {
                this.fieldPolynomial.setBit(i10);
                int i11 = i10 + 1;
                for (int i12 = i11; i12 <= this.mDegree - 1 && !z10; i12++) {
                    this.fieldPolynomial.setBit(i12);
                    if (((((this.mDegree & 1) != 0) | ((i & 1) != 0) | ((i10 & 1) != 0)) || ((i12 & 1) != 0)) && (z10 = this.fieldPolynomial.isIrreducible())) {
                        this.isPentanomial = true;
                        int[] iArr = this.pc;
                        iArr[0] = i;
                        iArr[1] = i10;
                        iArr[2] = i12;
                        return z10;
                    }
                    this.fieldPolynomial.resetBit(i12);
                }
                this.fieldPolynomial.resetBit(i10);
                i10 = i11;
            }
            this.fieldPolynomial.resetBit(i);
            i = i9;
        }
        return z10;
    }

    private boolean testRandom() {
        this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1);
        do {
            this.fieldPolynomial.randomize();
            this.fieldPolynomial.setBit(this.mDegree);
            this.fieldPolynomial.setBit(0);
        } while (!this.fieldPolynomial.isIrreducible());
        return true;
    }

    private boolean testTrinomials() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial = gF2Polynomial;
        boolean z10 = false;
        gF2Polynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        for (int i = 1; i < this.mDegree && !z10; i++) {
            this.fieldPolynomial.setBit(i);
            boolean isIrreducible = this.fieldPolynomial.isIrreducible();
            if (isIrreducible) {
                this.isTrinomial = true;
                this.tc = i;
                return isIrreducible;
            }
            this.fieldPolynomial.resetBit(i);
            z10 = this.fieldPolynomial.isIrreducible();
        }
        return z10;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    public void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        GF2nElement[] gF2nElementArr;
        int i = this.mDegree;
        if (i != gF2nField.mDegree) {
            throw new IllegalArgumentException("GF2nPolynomialField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        boolean z10 = gF2nField instanceof GF2nONBField;
        if (z10) {
            gF2nField.computeCOBMatrix(this);
            return;
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i];
        for (int i9 = 0; i9 < this.mDegree; i9++) {
            gF2PolynomialArr[i9] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        if (randomRoot instanceof GF2nONBElement) {
            int i10 = this.mDegree;
            gF2nElementArr = new GF2nONBElement[i10];
            gF2nElementArr[i10 - 1] = GF2nONBElement.ONE((GF2nONBField) gF2nField);
        } else {
            int i11 = this.mDegree;
            gF2nElementArr = new GF2nPolynomialElement[i11];
            gF2nElementArr[i11 - 1] = GF2nPolynomialElement.ONE((GF2nPolynomialField) gF2nField);
        }
        int i12 = this.mDegree;
        gF2nElementArr[i12 - 2] = randomRoot;
        for (int i13 = i12 - 3; i13 >= 0; i13--) {
            gF2nElementArr[i13] = (GF2nElement) gF2nElementArr[i13 + 1].multiply(randomRoot);
        }
        if (z10) {
            for (int i14 = 0; i14 < this.mDegree; i14++) {
                int i15 = 0;
                while (true) {
                    if (i15 < this.mDegree) {
                        if (gF2nElementArr[i14].testBit((r4 - i15) - 1)) {
                            int i16 = this.mDegree;
                            gF2PolynomialArr[(i16 - i15) - 1].setBit((i16 - i14) - 1);
                        }
                        i15++;
                    }
                }
            }
        } else {
            for (int i17 = 0; i17 < this.mDegree; i17++) {
                for (int i18 = 0; i18 < this.mDegree; i18++) {
                    if (gF2nElementArr[i17].testBit(i18)) {
                        int i19 = this.mDegree;
                        gF2PolynomialArr[(i19 - i18) - 1].setBit((i19 - i17) - 1);
                    }
                }
            }
        }
        this.fields.addElement(gF2nField);
        this.matrices.addElement(gF2PolynomialArr);
        gF2nField.fields.addElement(this);
        gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    public void computeFieldPolynomial() {
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    public void computeFieldPolynomial2() {
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    public int[] getPc() {
        if (!this.isPentanomial) {
            throw new RuntimeException();
        }
        int[] iArr = new int[3];
        System.arraycopy(this.pc, 0, iArr, 0, 3);
        return iArr;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    public GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nPolynomialElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nPolynomialElement);
                GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial2);
                for (int i = 1; i <= this.mDegree - 1; i++) {
                    gF2nPolynomial3 = gF2nPolynomial3.multiplyAndReduce(gF2nPolynomial3, gF2nPolynomial).add(gF2nPolynomial2);
                }
                gcd = gF2nPolynomial3.gcd(gF2nPolynomial);
                degree = gcd.getDegree();
                degree2 = gF2nPolynomial.getDegree();
                if (degree != 0 && degree != degree2) {
                    break;
                }
            }
            gF2nPolynomial = (degree << 1) > degree2 ? gF2nPolynomial.quotient(gcd) : new GF2nPolynomial(gcd);
        }
        return gF2nPolynomial.at(0);
    }

    public GF2Polynomial getSquaringVector(int i) {
        return new GF2Polynomial(this.squaringMatrix[i]);
    }

    public int getTc() {
        if (this.isTrinomial) {
            return this.tc;
        }
        throw new RuntimeException();
    }

    public boolean isPentanomial() {
        return this.isPentanomial;
    }

    public boolean isTrinomial() {
        return this.isTrinomial;
    }

    public GF2nPolynomialField(int i, SecureRandom secureRandom, GF2Polynomial gF2Polynomial) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.pc = new int[3];
        if (i < 3) {
            throw new IllegalArgumentException("degree must be at least 3");
        }
        if (gF2Polynomial.getLength() != i + 1) {
            throw new RuntimeException();
        }
        if (!gF2Polynomial.isIrreducible()) {
            throw new RuntimeException();
        }
        this.mDegree = i;
        this.fieldPolynomial = gF2Polynomial;
        computeSquaringMatrix();
        int i9 = 2;
        for (int i10 = 1; i10 < this.fieldPolynomial.getLength() - 1; i10++) {
            if (this.fieldPolynomial.testBit(i10)) {
                int i11 = i9 + 1;
                if (i11 == 3) {
                    this.tc = i10;
                }
                if (i11 <= 5) {
                    this.pc[i9 - 2] = i10;
                }
                i9 = i11;
            }
        }
        if (i9 == 3) {
            this.isTrinomial = true;
        }
        if (i9 == 5) {
            this.isPentanomial = true;
        }
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    public GF2nPolynomialField(int i, SecureRandom secureRandom, boolean z10) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.pc = new int[3];
        if (i < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i;
        if (z10) {
            computeFieldPolynomial();
        } else {
            computeFieldPolynomial2();
        }
        computeSquaringMatrix();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }
}
