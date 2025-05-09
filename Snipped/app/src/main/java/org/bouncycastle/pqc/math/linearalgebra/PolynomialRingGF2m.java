package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes3.dex */
public class PolynomialRingGF2m {
    private GF2mField field;

    /* renamed from: p, reason: collision with root package name */
    private PolynomialGF2mSmallM f25479p;
    protected PolynomialGF2mSmallM[] sqMatrix;
    protected PolynomialGF2mSmallM[] sqRootMatrix;

    public PolynomialRingGF2m(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.field = gF2mField;
        this.f25479p = polynomialGF2mSmallM;
        computeSquaringMatrix();
        computeSquareRootMatrix();
    }

    private void computeSquareRootMatrix() {
        int coefficient;
        int degree = this.f25479p.getDegree();
        PolynomialGF2mSmallM[] polynomialGF2mSmallMArr = new PolynomialGF2mSmallM[degree];
        int i = degree - 1;
        for (int i9 = i; i9 >= 0; i9--) {
            polynomialGF2mSmallMArr[i9] = new PolynomialGF2mSmallM(this.sqMatrix[i9]);
        }
        this.sqRootMatrix = new PolynomialGF2mSmallM[degree];
        while (i >= 0) {
            this.sqRootMatrix[i] = new PolynomialGF2mSmallM(this.field, i);
            i--;
        }
        for (int i10 = 0; i10 < degree; i10++) {
            if (polynomialGF2mSmallMArr[i10].getCoefficient(i10) == 0) {
                int i11 = i10 + 1;
                boolean z10 = false;
                while (i11 < degree) {
                    if (polynomialGF2mSmallMArr[i11].getCoefficient(i10) != 0) {
                        swapColumns(polynomialGF2mSmallMArr, i10, i11);
                        swapColumns(this.sqRootMatrix, i10, i11);
                        i11 = degree;
                        z10 = true;
                    }
                    i11++;
                }
                if (!z10) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int inverse = this.field.inverse(polynomialGF2mSmallMArr[i10].getCoefficient(i10));
            polynomialGF2mSmallMArr[i10].multThisWithElement(inverse);
            this.sqRootMatrix[i10].multThisWithElement(inverse);
            for (int i12 = 0; i12 < degree; i12++) {
                if (i12 != i10 && (coefficient = polynomialGF2mSmallMArr[i12].getCoefficient(i10)) != 0) {
                    PolynomialGF2mSmallM multWithElement = polynomialGF2mSmallMArr[i10].multWithElement(coefficient);
                    PolynomialGF2mSmallM multWithElement2 = this.sqRootMatrix[i10].multWithElement(coefficient);
                    polynomialGF2mSmallMArr[i12].addToThis(multWithElement);
                    this.sqRootMatrix[i12].addToThis(multWithElement2);
                }
            }
        }
    }

    private void computeSquaringMatrix() {
        int i;
        int degree = this.f25479p.getDegree();
        this.sqMatrix = new PolynomialGF2mSmallM[degree];
        int i9 = 0;
        while (true) {
            i = degree >> 1;
            if (i9 >= i) {
                break;
            }
            int i10 = i9 << 1;
            int[] iArr = new int[i10 + 1];
            iArr[i10] = 1;
            this.sqMatrix[i9] = new PolynomialGF2mSmallM(this.field, iArr);
            i9++;
        }
        while (i < degree) {
            int i11 = i << 1;
            int[] iArr2 = new int[i11 + 1];
            iArr2[i11] = 1;
            this.sqMatrix[i] = new PolynomialGF2mSmallM(this.field, iArr2).mod(this.f25479p);
            i++;
        }
    }

    private static void swapColumns(PolynomialGF2mSmallM[] polynomialGF2mSmallMArr, int i, int i9) {
        PolynomialGF2mSmallM polynomialGF2mSmallM = polynomialGF2mSmallMArr[i];
        polynomialGF2mSmallMArr[i] = polynomialGF2mSmallMArr[i9];
        polynomialGF2mSmallMArr[i9] = polynomialGF2mSmallM;
    }

    public PolynomialGF2mSmallM[] getSquareRootMatrix() {
        return this.sqRootMatrix;
    }

    public PolynomialGF2mSmallM[] getSquaringMatrix() {
        return this.sqMatrix;
    }
}
