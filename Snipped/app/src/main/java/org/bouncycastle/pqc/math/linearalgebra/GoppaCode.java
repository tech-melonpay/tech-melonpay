package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* loaded from: classes3.dex */
public final class GoppaCode {

    public static class MaMaPe {

        /* renamed from: h, reason: collision with root package name */
        private GF2Matrix f25475h;

        /* renamed from: p, reason: collision with root package name */
        private Permutation f25476p;

        /* renamed from: s, reason: collision with root package name */
        private GF2Matrix f25477s;

        public MaMaPe(GF2Matrix gF2Matrix, GF2Matrix gF2Matrix2, Permutation permutation) {
            this.f25477s = gF2Matrix;
            this.f25475h = gF2Matrix2;
            this.f25476p = permutation;
        }

        public GF2Matrix getFirstMatrix() {
            return this.f25477s;
        }

        public Permutation getPermutation() {
            return this.f25476p;
        }

        public GF2Matrix getSecondMatrix() {
            return this.f25475h;
        }
    }

    public static class MatrixSet {

        /* renamed from: g, reason: collision with root package name */
        private GF2Matrix f25478g;
        private int[] setJ;

        public MatrixSet(GF2Matrix gF2Matrix, int[] iArr) {
            this.f25478g = gF2Matrix;
            this.setJ = iArr;
        }

        public GF2Matrix getG() {
            return this.f25478g;
        }

        public int[] getSetJ() {
            return this.setJ;
        }
    }

    private GoppaCode() {
    }

    public static MaMaPe computeSystematicForm(GF2Matrix gF2Matrix, SecureRandom secureRandom) {
        GF2Matrix gF2Matrix2;
        boolean z10;
        int numColumns = gF2Matrix.getNumColumns();
        GF2Matrix gF2Matrix3 = null;
        while (true) {
            Permutation permutation = new Permutation(numColumns, secureRandom);
            GF2Matrix gF2Matrix4 = (GF2Matrix) gF2Matrix.rightMultiply(permutation);
            GF2Matrix leftSubMatrix = gF2Matrix4.getLeftSubMatrix();
            try {
                gF2Matrix2 = (GF2Matrix) leftSubMatrix.computeInverse();
                z10 = true;
            } catch (ArithmeticException unused) {
                gF2Matrix2 = gF2Matrix3;
                z10 = false;
            }
            if (z10) {
                return new MaMaPe(leftSubMatrix, ((GF2Matrix) gF2Matrix2.rightMultiply(gF2Matrix4)).getRightSubMatrix(), permutation);
            }
            gF2Matrix3 = gF2Matrix2;
        }
    }

    public static GF2Matrix createCanonicalCheckMatrix(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int degree = gF2mField.getDegree();
        int i = 1 << degree;
        int degree2 = polynomialGF2mSmallM.getDegree();
        int i9 = 0;
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, degree2, i);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, degree2, i);
        for (int i10 = 0; i10 < i; i10++) {
            iArr2[0][i10] = gF2mField.inverse(polynomialGF2mSmallM.evaluateAt(i10));
        }
        for (int i11 = 1; i11 < degree2; i11++) {
            for (int i12 = 0; i12 < i; i12++) {
                iArr2[i11][i12] = gF2mField.mult(iArr2[i11 - 1][i12], i12);
            }
        }
        int i13 = 0;
        while (i13 < degree2) {
            int i14 = i9;
            while (i14 < i) {
                for (int i15 = i9; i15 <= i13; i15++) {
                    int[] iArr3 = iArr[i13];
                    iArr3[i14] = gF2mField.add(iArr3[i14], gF2mField.mult(iArr2[i15][i14], polynomialGF2mSmallM.getCoefficient((degree2 + i15) - i13)));
                }
                i14++;
                i9 = 0;
            }
            i13++;
            i9 = 0;
        }
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, degree2 * degree, (i + 31) >>> 5);
        for (int i16 = 0; i16 < i; i16++) {
            int i17 = i16 >>> 5;
            int i18 = 1 << (i16 & 31);
            for (int i19 = 0; i19 < degree2; i19++) {
                int i20 = iArr[i19][i16];
                for (int i21 = 0; i21 < degree; i21++) {
                    if (((i20 >>> i21) & 1) != 0) {
                        int[] iArr5 = iArr4[(((i19 + 1) * degree) - i21) - 1];
                        iArr5[i17] = iArr5[i17] ^ i18;
                    }
                }
            }
        }
        return new GF2Matrix(i, iArr4);
    }

    public static GF2Vector syndromeDecode(GF2Vector gF2Vector, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int degree = 1 << gF2mField.getDegree();
        GF2Vector gF2Vector2 = new GF2Vector(degree);
        if (!gF2Vector.isZero()) {
            PolynomialGF2mSmallM[] modPolynomialToFracton = new PolynomialGF2mSmallM(gF2Vector.toExtensionFieldVector(gF2mField)).modInverse(polynomialGF2mSmallM).addMonomial(1).modSquareRootMatrix(polynomialGF2mSmallMArr).modPolynomialToFracton(polynomialGF2mSmallM);
            PolynomialGF2mSmallM polynomialGF2mSmallM2 = modPolynomialToFracton[0];
            PolynomialGF2mSmallM multiply = polynomialGF2mSmallM2.multiply(polynomialGF2mSmallM2);
            PolynomialGF2mSmallM polynomialGF2mSmallM3 = modPolynomialToFracton[1];
            PolynomialGF2mSmallM add = multiply.add(polynomialGF2mSmallM3.multiply(polynomialGF2mSmallM3).multWithMonomial(1));
            PolynomialGF2mSmallM multWithElement = add.multWithElement(gF2mField.inverse(add.getHeadCoefficient()));
            for (int i = 0; i < degree; i++) {
                if (multWithElement.evaluateAt(i) == 0) {
                    gF2Vector2.setBit(i);
                }
            }
        }
        return gF2Vector2;
    }
}
