package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Random;

/* loaded from: classes3.dex */
public class GF2nONBField extends GF2nField {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    int[][] mMult;
    private int mType;

    public GF2nONBField(int i, SecureRandom secureRandom) {
        super(secureRandom);
        if (i < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i;
        int i9 = i / 64;
        this.mLength = i9;
        int i10 = i & 63;
        this.mBit = i10;
        if (i10 == 0) {
            this.mBit = 64;
        } else {
            this.mLength = i9 + 1;
        }
        computeType();
        if (this.mType >= 3) {
            throw new RuntimeException("\nThe type of this field is " + this.mType);
        }
        this.mMult = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.mDegree, 2);
        for (int i11 = 0; i11 < this.mDegree; i11++) {
            int[] iArr = this.mMult[i11];
            iArr[0] = -1;
            iArr[1] = -1;
        }
        computeMultMatrix();
        computeFieldPolynomial();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    private void computeMultMatrix() {
        int i;
        int i9 = this.mType;
        if ((i9 & 7) == 0) {
            throw new RuntimeException("bisher nur fuer Gausssche Normalbasen implementiert");
        }
        int i10 = this.mDegree * i9;
        int i11 = i10 + 1;
        int[] iArr = new int[i11];
        int elementOfOrder = i9 == 1 ? 1 : i9 == 2 ? i10 : elementOfOrder(i9, i11);
        int i12 = 1;
        int i13 = 0;
        while (true) {
            i = this.mType;
            if (i13 >= i) {
                break;
            }
            int i14 = i12;
            for (int i15 = 0; i15 < this.mDegree; i15++) {
                iArr[i14] = i15;
                i14 = (i14 << 1) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
            }
            i12 = (i12 * elementOfOrder) % i11;
            if (i12 < 0) {
                i12 += i11;
            }
            i13++;
        }
        if (i != 1) {
            if (i != 2) {
                throw new RuntimeException("only type 1 or type 2 implemented");
            }
            int i16 = 1;
            while (i16 < i10) {
                int i17 = i16 + 1;
                int[] iArr2 = this.mMult[iArr[i17]];
                int i18 = i11 - i16;
                if (iArr2[0] == -1) {
                    iArr2[0] = iArr[i18];
                } else {
                    iArr2[1] = iArr[i18];
                }
                i16 = i17;
            }
            return;
        }
        int i19 = 1;
        while (i19 < i10) {
            int i20 = i19 + 1;
            int[] iArr3 = this.mMult[iArr[i20]];
            int i21 = i11 - i19;
            if (iArr3[0] == -1) {
                iArr3[0] = iArr[i21];
            } else {
                iArr3[1] = iArr[i21];
            }
            i19 = i20;
        }
        int i22 = this.mDegree >> 1;
        for (int i23 = 1; i23 <= i22; i23++) {
            int[][] iArr4 = this.mMult;
            int i24 = i23 - 1;
            int[] iArr5 = iArr4[i24];
            if (iArr5[0] == -1) {
                iArr5[0] = (i22 + i23) - 1;
            } else {
                iArr5[1] = (i22 + i23) - 1;
            }
            int[] iArr6 = iArr4[(i22 + i23) - 1];
            if (iArr6[0] == -1) {
                iArr6[0] = i24;
            } else {
                iArr6[1] = i24;
            }
        }
    }

    private void computeType() {
        if ((this.mDegree & 7) == 0) {
            throw new RuntimeException("The extension degree is divisible by 8!");
        }
        this.mType = 1;
        int i = 0;
        while (i != 1) {
            int i9 = (this.mType * this.mDegree) + 1;
            if (IntegerFunctions.isPrime(i9)) {
                int order = IntegerFunctions.order(2, i9);
                int i10 = this.mType;
                int i11 = this.mDegree;
                i = IntegerFunctions.gcd((i10 * i11) / order, i11);
            }
            this.mType++;
        }
        int i12 = this.mType - 1;
        this.mType = i12;
        if (i12 == 1) {
            int i13 = (this.mDegree << 1) + 1;
            if (IntegerFunctions.isPrime(i13)) {
                int order2 = IntegerFunctions.order(2, i13);
                int i14 = this.mDegree;
                if (IntegerFunctions.gcd((i14 << 1) / order2, i14) == 1) {
                    this.mType++;
                }
            }
        }
    }

    private int elementOfOrder(int i, int i9) {
        int order;
        Random random = new Random();
        int i10 = 0;
        while (i10 == 0) {
            int i11 = i9 - 1;
            i10 = random.nextInt() % i11;
            if (i10 < 0) {
                i10 += i11;
            }
        }
        while (true) {
            order = IntegerFunctions.order(i10, i9);
            if (order % i == 0 && order != 0) {
                break;
            }
            while (i10 == 0) {
                int i12 = i9 - 1;
                i10 = random.nextInt() % i12;
                if (i10 < 0) {
                    i10 += i12;
                }
            }
        }
        int i13 = i10;
        for (int i14 = 2; i14 <= i / order; i14++) {
            i13 *= i10;
        }
        return i13;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    public void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        int i = this.mDegree;
        if (i != gF2nField.mDegree) {
            throw new IllegalArgumentException("GF2nField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i];
        for (int i9 = 0; i9 < this.mDegree; i9++) {
            gF2PolynomialArr[i9] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        GF2nElement[] gF2nElementArr = new GF2nPolynomialElement[this.mDegree];
        gF2nElementArr[0] = (GF2nElement) randomRoot.clone();
        for (int i10 = 1; i10 < this.mDegree; i10++) {
            gF2nElementArr[i10] = gF2nElementArr[i10 - 1].square();
        }
        for (int i11 = 0; i11 < this.mDegree; i11++) {
            for (int i12 = 0; i12 < this.mDegree; i12++) {
                if (gF2nElementArr[i11].testBit(i12)) {
                    int i13 = this.mDegree;
                    gF2PolynomialArr[(i13 - i12) - 1].setBit((i13 - i11) - 1);
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
        GF2Polynomial gF2Polynomial;
        int i = this.mType;
        if (i == 1) {
            gF2Polynomial = new GF2Polynomial(this.mDegree + 1, "ALL");
        } else {
            if (i != 2) {
                return;
            }
            GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree + 1, "ONE");
            GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this.mDegree + 1, "X");
            gF2Polynomial3.addToThis(gF2Polynomial2);
            GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
            gF2Polynomial = gF2Polynomial3;
            int i9 = 1;
            while (i9 < this.mDegree) {
                GF2Polynomial shiftLeft = gF2Polynomial.shiftLeft();
                shiftLeft.addToThis(gF2Polynomial4);
                i9++;
                gF2Polynomial4 = gF2Polynomial;
                gF2Polynomial = shiftLeft;
            }
        }
        this.fieldPolynomial = gF2Polynomial;
    }

    public int getONBBit() {
        return this.mBit;
    }

    public int getONBLength() {
        return this.mLength;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    public GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                GF2nONBElement gF2nONBElement = new GF2nONBElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nONBElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nONBElement);
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

    public int[][] invMatrix(int[][] iArr) {
        int i = this.mDegree;
        int[] iArr2 = {i, i};
        Class cls = Integer.TYPE;
        int i9 = this.mDegree;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, i9, i9);
        for (int i10 = 0; i10 < this.mDegree; i10++) {
            iArr3[i10][i10] = 1;
        }
        for (int i11 = 0; i11 < this.mDegree; i11++) {
            int i12 = i11;
            while (true) {
                int i13 = this.mDegree;
                if (i12 < i13) {
                    iArr[(i13 - 1) - i11][i12] = iArr[i11][i11];
                    i12++;
                }
            }
        }
        return null;
    }
}
