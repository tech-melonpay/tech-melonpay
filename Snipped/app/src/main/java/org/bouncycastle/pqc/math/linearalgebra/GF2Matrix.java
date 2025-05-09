package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GF2Matrix extends Matrix {
    private int length;
    private int[][] matrix;

    public GF2Matrix(int i, char c2) {
        this(i, c2, new SecureRandom());
    }

    private static void addToRow(int[] iArr, int[] iArr2, int i) {
        for (int length = iArr2.length - 1; length >= i; length--) {
            iArr2[length] = iArr[length] ^ iArr2[length];
        }
    }

    private void assignRandomLowerTriangularMatrix(int i, SecureRandom secureRandom) {
        this.numRows = i;
        this.numColumns = i;
        int i9 = (i + 31) >>> 5;
        this.length = i9;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i9);
        for (int i10 = 0; i10 < this.numRows; i10++) {
            int i11 = i10 >>> 5;
            int i12 = i10 & 31;
            int i13 = 31 - i12;
            int i14 = 1 << i12;
            for (int i15 = 0; i15 < i11; i15++) {
                this.matrix[i10][i15] = secureRandom.nextInt();
            }
            this.matrix[i10][i11] = i14 | (secureRandom.nextInt() >>> i13);
            while (true) {
                i11++;
                if (i11 < this.length) {
                    this.matrix[i10][i11] = 0;
                }
            }
        }
    }

    private void assignRandomRegularMatrix(int i, SecureRandom secureRandom) {
        this.numRows = i;
        this.numColumns = i;
        int i9 = (i + 31) >>> 5;
        this.length = i9;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i9);
        GF2Matrix gF2Matrix = (GF2Matrix) new GF2Matrix(i, Matrix.MATRIX_TYPE_RANDOM_LT, secureRandom).rightMultiply(new GF2Matrix(i, Matrix.MATRIX_TYPE_RANDOM_UT, secureRandom));
        int[] vector = new Permutation(i, secureRandom).getVector();
        for (int i10 = 0; i10 < i; i10++) {
            System.arraycopy(gF2Matrix.matrix[i10], 0, this.matrix[vector[i10]], 0, this.length);
        }
    }

    private void assignRandomUpperTriangularMatrix(int i, SecureRandom secureRandom) {
        int i9;
        this.numRows = i;
        this.numColumns = i;
        int i10 = (i + 31) >>> 5;
        this.length = i10;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i10);
        int i11 = i & 31;
        int i12 = i11 == 0 ? -1 : (1 << i11) - 1;
        for (int i13 = 0; i13 < this.numRows; i13++) {
            int i14 = i13 >>> 5;
            int i15 = i13 & 31;
            int i16 = 1 << i15;
            for (int i17 = 0; i17 < i14; i17++) {
                this.matrix[i13][i17] = 0;
            }
            this.matrix[i13][i14] = (secureRandom.nextInt() << i15) | i16;
            while (true) {
                i14++;
                i9 = this.length;
                if (i14 < i9) {
                    this.matrix[i13][i14] = secureRandom.nextInt();
                }
            }
            int[] iArr = this.matrix[i13];
            int i18 = i9 - 1;
            iArr[i18] = iArr[i18] & i12;
        }
    }

    private void assignUnitMatrix(int i) {
        this.numRows = i;
        this.numColumns = i;
        int i9 = (i + 31) >>> 5;
        this.length = i9;
        int[] iArr = {i, i9};
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr);
        for (int i10 = 0; i10 < this.numRows; i10++) {
            for (int i11 = 0; i11 < this.length; i11++) {
                this.matrix[i10][i11] = 0;
            }
        }
        for (int i12 = 0; i12 < this.numRows; i12++) {
            this.matrix[i12][i12 >>> 5] = 1 << (i12 & 31);
        }
    }

    private void assignZeroMatrix(int i, int i9) {
        this.numRows = i;
        this.numColumns = i9;
        int i10 = (i9 + 31) >>> 5;
        this.length = i10;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i10);
        for (int i11 = 0; i11 < this.numRows; i11++) {
            for (int i12 = 0; i12 < this.length; i12++) {
                this.matrix[i11][i12] = 0;
            }
        }
    }

    public static GF2Matrix[] createRandomRegularMatrixAndItsInverse(int i, SecureRandom secureRandom) {
        int i9 = (i + 31) >> 5;
        GF2Matrix gF2Matrix = new GF2Matrix(i, Matrix.MATRIX_TYPE_RANDOM_LT, secureRandom);
        GF2Matrix gF2Matrix2 = new GF2Matrix(i, Matrix.MATRIX_TYPE_RANDOM_UT, secureRandom);
        GF2Matrix gF2Matrix3 = (GF2Matrix) gF2Matrix.rightMultiply(gF2Matrix2);
        Permutation permutation = new Permutation(i, secureRandom);
        int[] vector = permutation.getVector();
        int i10 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i9);
        for (int i11 = 0; i11 < i; i11++) {
            System.arraycopy(gF2Matrix3.matrix[vector[i11]], 0, iArr[i11], 0, i9);
        }
        GF2Matrix gF2Matrix4 = new GF2Matrix(i, iArr);
        GF2Matrix gF2Matrix5 = new GF2Matrix(i, 'I');
        int i12 = 0;
        while (i12 < i) {
            int i13 = i12 >>> 5;
            int i14 = 1 << (i12 & 31);
            int i15 = i12 + 1;
            int i16 = i15;
            while (i16 < i) {
                if ((gF2Matrix.matrix[i16][i13] & i14) != 0) {
                    for (int i17 = i10; i17 <= i13; i17++) {
                        int[][] iArr2 = gF2Matrix5.matrix;
                        int[] iArr3 = iArr2[i16];
                        iArr3[i17] = iArr3[i17] ^ iArr2[i12][i17];
                    }
                }
                i16++;
                i10 = 0;
            }
            i12 = i15;
        }
        GF2Matrix gF2Matrix6 = new GF2Matrix(i, 'I');
        for (int i18 = i - 1; i18 >= 0; i18--) {
            int i19 = i18 >>> 5;
            int i20 = 1 << (i18 & 31);
            for (int i21 = i18 - 1; i21 >= 0; i21--) {
                if ((gF2Matrix2.matrix[i21][i19] & i20) != 0) {
                    for (int i22 = i19; i22 < i9; i22++) {
                        int[][] iArr4 = gF2Matrix6.matrix;
                        int[] iArr5 = iArr4[i21];
                        iArr5[i22] = iArr4[i18][i22] ^ iArr5[i22];
                    }
                }
            }
        }
        return new GF2Matrix[]{gF2Matrix4, (GF2Matrix) gF2Matrix6.rightMultiply(gF2Matrix5.rightMultiply(permutation))};
    }

    private static void swapRows(int[][] iArr, int i, int i9) {
        int[] iArr2 = iArr[i];
        iArr[i] = iArr[i9];
        iArr[i9] = iArr2;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        int i = this.numRows;
        if (i != this.numColumns) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, this.length);
        for (int i9 = this.numRows - 1; i9 >= 0; i9--) {
            iArr[i9] = IntUtils.clone(this.matrix[i9]);
        }
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.length);
        for (int i10 = this.numRows - 1; i10 >= 0; i10--) {
            iArr2[i10][i10 >> 5] = 1 << (i10 & 31);
        }
        for (int i11 = 0; i11 < this.numRows; i11++) {
            int i12 = i11 >> 5;
            int i13 = 1 << (i11 & 31);
            if ((iArr[i11][i12] & i13) == 0) {
                int i14 = i11 + 1;
                boolean z10 = false;
                while (i14 < this.numRows) {
                    if ((iArr[i14][i12] & i13) != 0) {
                        swapRows(iArr, i11, i14);
                        swapRows(iArr2, i11, i14);
                        i14 = this.numRows;
                        z10 = true;
                    }
                    i14++;
                }
                if (!z10) {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            for (int i15 = this.numRows - 1; i15 >= 0; i15--) {
                if (i15 != i11) {
                    int[] iArr3 = iArr[i15];
                    if ((iArr3[i12] & i13) != 0) {
                        addToRow(iArr[i11], iArr3, i12);
                        addToRow(iArr2[i11], iArr2[i15], 0);
                    }
                }
            }
        }
        return new GF2Matrix(this.numColumns, iArr2);
    }

    public Matrix computeTranspose() {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numColumns, (this.numRows + 31) >>> 5);
        int i = 0;
        while (true) {
            int i9 = this.numRows;
            if (i >= i9) {
                return new GF2Matrix(i9, iArr);
            }
            for (int i10 = 0; i10 < this.numColumns; i10++) {
                int i11 = i >>> 5;
                int i12 = i & 31;
                if (((this.matrix[i][i10 >>> 5] >>> (i10 & 31)) & 1) == 1) {
                    int[] iArr2 = iArr[i10];
                    iArr2[i11] = (1 << i12) | iArr2[i11];
                }
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GF2Matrix)) {
            return false;
        }
        GF2Matrix gF2Matrix = (GF2Matrix) obj;
        if (this.numRows != gF2Matrix.numRows || this.numColumns != gF2Matrix.numColumns || this.length != gF2Matrix.length) {
            return false;
        }
        for (int i = 0; i < this.numRows; i++) {
            if (!IntUtils.equals(this.matrix[i], gF2Matrix.matrix[i])) {
                return false;
            }
        }
        return true;
    }

    public GF2Matrix extendLeftCompactForm() {
        int i = this.numColumns;
        int i9 = this.numRows;
        GF2Matrix gF2Matrix = new GF2Matrix(i9, i + i9);
        int i10 = this.numRows;
        int i11 = (i10 - 1) + this.numColumns;
        int i12 = i10 - 1;
        while (i12 >= 0) {
            System.arraycopy(this.matrix[i12], 0, gF2Matrix.matrix[i12], 0, this.length);
            int[] iArr = gF2Matrix.matrix[i12];
            int i13 = i11 >> 5;
            iArr[i13] = iArr[i13] | (1 << (i11 & 31));
            i12--;
            i11--;
        }
        return gF2Matrix;
    }

    public GF2Matrix extendRightCompactForm() {
        int i;
        int i9 = this.numRows;
        GF2Matrix gF2Matrix = new GF2Matrix(i9, this.numColumns + i9);
        int i10 = this.numRows;
        int i11 = i10 >> 5;
        int i12 = i10 & 31;
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            int[] iArr = gF2Matrix.matrix[i13];
            int i14 = i13 >> 5;
            iArr[i14] = iArr[i14] | (1 << (i13 & 31));
            int i15 = 0;
            if (i12 != 0) {
                int i16 = i11;
                while (true) {
                    i = this.length;
                    if (i15 >= i - 1) {
                        break;
                    }
                    int i17 = this.matrix[i13][i15];
                    int[] iArr2 = gF2Matrix.matrix[i13];
                    int i18 = i16 + 1;
                    iArr2[i16] = iArr2[i16] | (i17 << i12);
                    iArr2[i18] = iArr2[i18] | (i17 >>> (32 - i12));
                    i15++;
                    i16 = i18;
                }
                int i19 = this.matrix[i13][i - 1];
                int[] iArr3 = gF2Matrix.matrix[i13];
                int i20 = i16 + 1;
                iArr3[i16] = iArr3[i16] | (i19 << i12);
                if (i20 < gF2Matrix.length) {
                    iArr3[i20] = iArr3[i20] | (i19 >>> (32 - i12));
                }
            } else {
                System.arraycopy(this.matrix[i13], 0, iArr, i11, this.length);
            }
        }
        return gF2Matrix;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i = (this.numColumns + 7) >>> 3;
        int i9 = this.numRows;
        int i10 = 8;
        byte[] bArr = new byte[(i * i9) + 8];
        LittleEndianConversions.I2OSP(i9, bArr, 0);
        LittleEndianConversions.I2OSP(this.numColumns, bArr, 4);
        int i11 = this.numColumns;
        int i12 = i11 >>> 5;
        int i13 = i11 & 31;
        for (int i14 = 0; i14 < this.numRows; i14++) {
            int i15 = 0;
            while (i15 < i12) {
                LittleEndianConversions.I2OSP(this.matrix[i14][i15], bArr, i10);
                i15++;
                i10 += 4;
            }
            int i16 = 0;
            while (i16 < i13) {
                bArr[i10] = (byte) ((this.matrix[i14][i12] >>> i16) & 255);
                i16 += 8;
                i10++;
            }
        }
        return bArr;
    }

    public double getHammingWeight() {
        int i = this.numColumns & 31;
        int i9 = this.length;
        if (i != 0) {
            i9--;
        }
        double d10 = 0.0d;
        double d11 = 0.0d;
        for (int i10 = 0; i10 < this.numRows; i10++) {
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = this.matrix[i10][i11];
                for (int i13 = 0; i13 < 32; i13++) {
                    d10 += (i12 >>> i13) & 1;
                    d11 += 1.0d;
                }
            }
            int i14 = this.matrix[i10][this.length - 1];
            for (int i15 = 0; i15 < i; i15++) {
                d10 += (i14 >>> i15) & 1;
                d11 += 1.0d;
            }
        }
        return d10 / d11;
    }

    public int[][] getIntArray() {
        return this.matrix;
    }

    public GF2Matrix getLeftSubMatrix() {
        int i = this.numColumns;
        int i9 = this.numRows;
        if (i <= i9) {
            throw new ArithmeticException("empty submatrix");
        }
        int i10 = (i9 + 31) >> 5;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i9, i10);
        int i11 = this.numRows;
        int i12 = (1 << (i11 & 31)) - 1;
        if (i12 == 0) {
            i12 = -1;
        }
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            System.arraycopy(this.matrix[i13], 0, iArr[i13], 0, i10);
            int[] iArr2 = iArr[i13];
            int i14 = i10 - 1;
            iArr2[i14] = iArr2[i14] & i12;
        }
        return new GF2Matrix(this.numRows, iArr);
    }

    public int getLength() {
        return this.length;
    }

    public GF2Matrix getRightSubMatrix() {
        int i;
        int i9 = this.numColumns;
        int i10 = this.numRows;
        if (i9 <= i10) {
            throw new ArithmeticException("empty submatrix");
        }
        int i11 = i10 >> 5;
        int i12 = i10 & 31;
        GF2Matrix gF2Matrix = new GF2Matrix(i10, i9 - i10);
        for (int i13 = this.numRows - 1; i13 >= 0; i13--) {
            int i14 = 0;
            if (i12 != 0) {
                int i15 = i11;
                while (true) {
                    i = gF2Matrix.length;
                    if (i14 >= i - 1) {
                        break;
                    }
                    int[] iArr = gF2Matrix.matrix[i13];
                    int[] iArr2 = this.matrix[i13];
                    int i16 = i15 + 1;
                    iArr[i14] = (iArr2[i15] >>> i12) | (iArr2[i16] << (32 - i12));
                    i14++;
                    i15 = i16;
                }
                int[] iArr3 = gF2Matrix.matrix[i13];
                int[] iArr4 = this.matrix[i13];
                int i17 = i15 + 1;
                iArr3[i - 1] = iArr4[i15] >>> i12;
                if (i17 < this.length) {
                    int i18 = i - 1;
                    iArr3[i18] = iArr3[i18] | (iArr4[i17] << (32 - i12));
                }
            } else {
                System.arraycopy(this.matrix[i13], i11, gF2Matrix.matrix[i13], 0, gF2Matrix.length);
            }
        }
        return gF2Matrix;
    }

    public int[] getRow(int i) {
        return this.matrix[i];
    }

    public int hashCode() {
        int i = (((this.numRows * 31) + this.numColumns) * 31) + this.length;
        for (int i9 = 0; i9 < this.numRows; i9++) {
            i = (i * 31) + Arrays.hashCode(this.matrix[i9]);
        }
        return i;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i = 0; i < this.numRows; i++) {
            for (int i9 = 0; i9 < this.length; i9++) {
                if (this.matrix[i][i9] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public Matrix leftMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int length = vector.length;
        int i = this.numRows;
        if (length != i) {
            throw new ArithmeticException("length mismatch");
        }
        int[][] iArr = new int[i][];
        for (int i9 = i - 1; i9 >= 0; i9--) {
            iArr[i9] = IntUtils.clone(this.matrix[vector[i9]]);
        }
        return new GF2Matrix(this.numRows, iArr);
    }

    public Vector leftMultiplyLeftCompactForm(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int i = this.numRows;
        int[] iArr = new int[((this.numColumns + i) + 31) >>> 5];
        int i9 = i >>> 5;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = 1;
            do {
                if ((vecArray[i11] & i12) != 0) {
                    for (int i13 = 0; i13 < this.length; i13++) {
                        iArr[i13] = iArr[i13] ^ this.matrix[i10][i13];
                    }
                    int i14 = this.numColumns;
                    int i15 = (i14 + i10) >>> 5;
                    iArr[i15] = (1 << ((i14 + i10) & 31)) | iArr[i15];
                }
                i10++;
                i12 <<= 1;
            } while (i12 != 0);
        }
        int i16 = 1 << (this.numRows & 31);
        for (int i17 = 1; i17 != i16; i17 <<= 1) {
            if ((vecArray[i9] & i17) != 0) {
                for (int i18 = 0; i18 < this.length; i18++) {
                    iArr[i18] = iArr[i18] ^ this.matrix[i10][i18];
                }
                int i19 = this.numColumns;
                int i20 = (i19 + i10) >>> 5;
                iArr[i20] = (1 << ((i19 + i10) & 31)) | iArr[i20];
            }
            i10++;
        }
        return new GF2Vector(iArr, this.numRows + this.numColumns);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        if (!(matrix instanceof GF2Matrix)) {
            throw new ArithmeticException("matrix is not defined over GF(2)");
        }
        if (matrix.numRows != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        GF2Matrix gF2Matrix = (GF2Matrix) matrix;
        GF2Matrix gF2Matrix2 = new GF2Matrix(this.numRows, matrix.numColumns);
        int i = this.numColumns & 31;
        int i9 = this.length;
        if (i != 0) {
            i9--;
        }
        for (int i10 = 0; i10 < this.numRows; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = this.matrix[i10][i12];
                for (int i14 = 0; i14 < 32; i14++) {
                    if (((1 << i14) & i13) != 0) {
                        for (int i15 = 0; i15 < gF2Matrix.length; i15++) {
                            int[] iArr = gF2Matrix2.matrix[i10];
                            iArr[i15] = iArr[i15] ^ gF2Matrix.matrix[i11][i15];
                        }
                    }
                    i11++;
                }
            }
            int i16 = this.matrix[i10][this.length - 1];
            for (int i17 = 0; i17 < i; i17++) {
                if (((1 << i17) & i16) != 0) {
                    for (int i18 = 0; i18 < gF2Matrix.length; i18++) {
                        int[] iArr2 = gF2Matrix2.matrix[i10];
                        iArr2[i18] = iArr2[i18] ^ gF2Matrix.matrix[i11][i18];
                    }
                }
                i11++;
            }
        }
        return gF2Matrix2;
    }

    public Vector rightMultiplyRightCompactForm(Vector vector) {
        int i;
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numColumns + this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int i9 = this.numRows;
        int[] iArr = new int[(i9 + 31) >>> 5];
        int i10 = i9 >> 5;
        int i11 = i9 & 31;
        int i12 = 0;
        while (true) {
            int i13 = this.numRows;
            if (i12 >= i13) {
                return new GF2Vector(iArr, i13);
            }
            int i14 = i12 >> 5;
            int i15 = i12 & 31;
            int i16 = (vecArray[i14] >>> i15) & 1;
            int i17 = i10;
            int i18 = 0;
            if (i11 != 0) {
                while (true) {
                    i = this.length;
                    if (i18 >= i - 1) {
                        break;
                    }
                    int i19 = i17 + 1;
                    i16 ^= ((vecArray[i17] >>> i11) | (vecArray[i19] << (32 - i11))) & this.matrix[i12][i18];
                    i18++;
                    i17 = i19;
                }
                int i20 = i17 + 1;
                int i21 = vecArray[i17] >>> i11;
                if (i20 < vecArray.length) {
                    i21 |= vecArray[i20] << (32 - i11);
                }
                i16 ^= this.matrix[i12][i - 1] & i21;
            } else {
                while (i18 < this.length) {
                    i16 ^= vecArray[i17] & this.matrix[i12][i18];
                    i18++;
                    i17++;
                }
            }
            int i22 = 0;
            for (int i23 = 0; i23 < 32; i23++) {
                i22 ^= i16 & 1;
                i16 >>>= 1;
            }
            if (i22 == 1) {
                iArr[i14] = iArr[i14] | (1 << i15);
            }
            i12++;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public String toString() {
        int i = this.numColumns & 31;
        int i9 = this.length;
        if (i != 0) {
            i9--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < this.numRows; i10++) {
            stringBuffer.append(i10 + ": ");
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = this.matrix[i10][i11];
                for (int i13 = 0; i13 < 32; i13++) {
                    if (((i12 >>> i13) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i14 = this.matrix[i10][this.length - 1];
            for (int i15 = 0; i15 < i; i15++) {
                if (((i14 >>> i15) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public GF2Matrix(int i, char c2, SecureRandom secureRandom) {
        if (i <= 0) {
            throw new ArithmeticException("Size of matrix is non-positive.");
        }
        if (c2 == 'I') {
            assignUnitMatrix(i);
            return;
        }
        if (c2 == 'L') {
            assignRandomLowerTriangularMatrix(i, secureRandom);
            return;
        }
        if (c2 == 'R') {
            assignRandomRegularMatrix(i, secureRandom);
        } else if (c2 == 'U') {
            assignRandomUpperTriangularMatrix(i, secureRandom);
        } else {
            if (c2 != 'Z') {
                throw new ArithmeticException("Unknown matrix type.");
            }
            assignZeroMatrix(i, i);
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[this.length];
        int i = this.numRows;
        int i9 = i >> 5;
        int i10 = 1 << (i & 31);
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = 1;
            do {
                if ((vecArray[i12] & i13) != 0) {
                    for (int i14 = 0; i14 < this.length; i14++) {
                        iArr[i14] = iArr[i14] ^ this.matrix[i11][i14];
                    }
                }
                i11++;
                i13 <<= 1;
            } while (i13 != 0);
        }
        for (int i15 = 1; i15 != i10; i15 <<= 1) {
            if ((vecArray[i9] & i15) != 0) {
                for (int i16 = 0; i16 < this.length; i16++) {
                    iArr[i16] = iArr[i16] ^ this.matrix[i11][i16];
                }
            }
            i11++;
        }
        return new GF2Vector(iArr, this.numColumns);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int length = vector.length;
        int i = this.numColumns;
        if (length != i) {
            throw new ArithmeticException("length mismatch");
        }
        GF2Matrix gF2Matrix = new GF2Matrix(this.numRows, i);
        for (int i9 = this.numColumns - 1; i9 >= 0; i9--) {
            int i10 = i9 >>> 5;
            int i11 = i9 & 31;
            int i12 = vector[i9];
            int i13 = i12 >>> 5;
            int i14 = i12 & 31;
            for (int i15 = this.numRows - 1; i15 >= 0; i15--) {
                int[] iArr = gF2Matrix.matrix[i15];
                iArr[i10] = iArr[i10] | (((this.matrix[i15][i13] >>> i14) & 1) << i11);
            }
        }
        return gF2Matrix;
    }

    private GF2Matrix(int i, int i9) {
        if (i9 <= 0 || i <= 0) {
            throw new ArithmeticException("size of matrix is non-positive");
        }
        assignZeroMatrix(i, i9);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[(this.numRows + 31) >>> 5];
        int i = 0;
        while (true) {
            int i9 = this.numRows;
            if (i >= i9) {
                return new GF2Vector(iArr, i9);
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.length; i11++) {
                i10 ^= this.matrix[i][i11] & vecArray[i11];
            }
            int i12 = 0;
            for (int i13 = 0; i13 < 32; i13++) {
                i12 ^= (i10 >>> i13) & 1;
            }
            if (i12 == 1) {
                int i14 = i >>> 5;
                iArr[i14] = iArr[i14] | (1 << (i & 31));
            }
            i++;
        }
    }

    public GF2Matrix(int i, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.numColumns = i;
        this.numRows = iArr.length;
        this.length = iArr2.length;
        int i9 = i & 31;
        int i10 = i9 == 0 ? -1 : (1 << i9) - 1;
        for (int i11 = 0; i11 < this.numRows; i11++) {
            int[] iArr3 = iArr[i11];
            int i12 = this.length - 1;
            iArr3[i12] = iArr3[i12] & i10;
        }
        this.matrix = iArr;
    }

    public GF2Matrix(GF2Matrix gF2Matrix) {
        this.numColumns = gF2Matrix.getNumColumns();
        this.numRows = gF2Matrix.getNumRows();
        this.length = gF2Matrix.length;
        this.matrix = new int[gF2Matrix.matrix.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.matrix;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = IntUtils.clone(gF2Matrix.matrix[i]);
            i++;
        }
    }

    public GF2Matrix(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.numRows = LittleEndianConversions.OS2IP(bArr, 0);
        int OS2IP = LittleEndianConversions.OS2IP(bArr, 4);
        this.numColumns = OS2IP;
        int i = this.numRows;
        int i9 = ((OS2IP + 7) >>> 3) * i;
        if (i > 0) {
            int i10 = 8;
            if (i9 == bArr.length - 8) {
                int i11 = (OS2IP + 31) >>> 5;
                this.length = i11;
                this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i11);
                int i12 = this.numColumns;
                int i13 = i12 >> 5;
                int i14 = i12 & 31;
                for (int i15 = 0; i15 < this.numRows; i15++) {
                    int i16 = 0;
                    while (i16 < i13) {
                        this.matrix[i15][i16] = LittleEndianConversions.OS2IP(bArr, i10);
                        i16++;
                        i10 += 4;
                    }
                    int i17 = 0;
                    while (i17 < i14) {
                        int[] iArr = this.matrix[i15];
                        iArr[i13] = ((bArr[i10] & 255) << i17) ^ iArr[i13];
                        i17 += 8;
                        i10++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
