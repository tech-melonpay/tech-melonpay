package org.bouncycastle.pqc.math.linearalgebra;

import C.v;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public class GF2mMatrix extends Matrix {
    protected GF2mField field;
    protected int[][] matrix;

    public GF2mMatrix(GF2mField gF2mField, byte[] bArr) {
        this.field = gF2mField;
        int i = 8;
        int i9 = 1;
        while (gF2mField.getDegree() > i) {
            i9++;
            i += 8;
        }
        if (bArr.length < 5) {
            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
        }
        int i10 = ((((bArr[3] & 255) << 24) ^ ((bArr[2] & 255) << 16)) ^ ((bArr[1] & 255) << 8)) ^ (bArr[0] & 255);
        this.numRows = i10;
        int i11 = i9 * i10;
        if (i10 > 0) {
            int i12 = 4;
            if ((bArr.length - 4) % i11 == 0) {
                int length = (bArr.length - 4) / i11;
                this.numColumns = length;
                this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, length);
                for (int i13 = 0; i13 < this.numRows; i13++) {
                    for (int i14 = 0; i14 < this.numColumns; i14++) {
                        int i15 = 0;
                        while (i15 < i) {
                            int[] iArr = this.matrix[i13];
                            iArr[i14] = iArr[i14] ^ ((bArr[i12] & 255) << i15);
                            i15 += 8;
                            i12++;
                        }
                        if (!this.field.isElementOfThisField(this.matrix[i13][i14])) {
                            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
                        }
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
    }

    private void addToRow(int[] iArr, int[] iArr2) {
        for (int length = iArr2.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.add(iArr[length], iArr2[length]);
        }
    }

    private int[] multRowWithElement(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.mult(iArr[length], i);
        }
        return iArr2;
    }

    private void multRowWithElementThis(int[] iArr, int i) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = this.field.mult(iArr[length], i);
        }
    }

    private static void swapColumns(int[][] iArr, int i, int i9) {
        int[] iArr2 = iArr[i];
        iArr[i] = iArr[i9];
        iArr[i9] = iArr2;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        int i;
        int i9 = this.numRows;
        if (i9 != this.numColumns) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i9, i9);
        for (int i10 = this.numRows - 1; i10 >= 0; i10--) {
            iArr[i10] = IntUtils.clone(this.matrix[i10]);
        }
        int i11 = this.numRows;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, i11);
        for (int i12 = this.numRows - 1; i12 >= 0; i12--) {
            iArr2[i12][i12] = 1;
        }
        for (int i13 = 0; i13 < this.numRows; i13++) {
            if (iArr[i13][i13] == 0) {
                int i14 = i13 + 1;
                boolean z10 = false;
                while (i14 < this.numRows) {
                    if (iArr[i14][i13] != 0) {
                        swapColumns(iArr, i13, i14);
                        swapColumns(iArr2, i13, i14);
                        i14 = this.numRows;
                        z10 = true;
                    }
                    i14++;
                }
                if (!z10) {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            int inverse = this.field.inverse(iArr[i13][i13]);
            multRowWithElementThis(iArr[i13], inverse);
            multRowWithElementThis(iArr2[i13], inverse);
            for (int i15 = 0; i15 < this.numRows; i15++) {
                if (i15 != i13 && (i = iArr[i15][i13]) != 0) {
                    int[] multRowWithElement = multRowWithElement(iArr[i13], i);
                    int[] multRowWithElement2 = multRowWithElement(iArr2[i13], i);
                    addToRow(multRowWithElement, iArr[i15]);
                    addToRow(multRowWithElement2, iArr2[i15]);
                }
            }
        }
        return new GF2mMatrix(this.field, iArr2);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mMatrix)) {
            GF2mMatrix gF2mMatrix = (GF2mMatrix) obj;
            if (this.field.equals(gF2mMatrix.field)) {
                int i = gF2mMatrix.numRows;
                int i9 = this.numColumns;
                if (i == i9 && gF2mMatrix.numColumns == i9) {
                    for (int i10 = 0; i10 < this.numRows; i10++) {
                        for (int i11 = 0; i11 < this.numColumns; i11++) {
                            if (this.matrix[i10][i11] != gF2mMatrix.matrix[i10][i11]) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i = 8;
        int i9 = 1;
        while (this.field.getDegree() > i) {
            i9++;
            i += 8;
        }
        int i10 = this.numRows;
        int i11 = this.numColumns * i10 * i9;
        int i12 = 4;
        byte[] bArr = new byte[i11 + 4];
        bArr[0] = (byte) (i10 & 255);
        bArr[1] = (byte) ((i10 >>> 8) & 255);
        bArr[2] = (byte) ((i10 >>> 16) & 255);
        bArr[3] = (byte) ((i10 >>> 24) & 255);
        for (int i13 = 0; i13 < this.numRows; i13++) {
            for (int i14 = 0; i14 < this.numColumns; i14++) {
                int i15 = 0;
                while (i15 < i) {
                    bArr[i12] = (byte) (this.matrix[i13][i14] >>> i15);
                    i15 += 8;
                    i12++;
                }
            }
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = (((this.field.hashCode() * 31) + this.numRows) * 31) + this.numColumns;
        for (int i = 0; i < this.numRows; i++) {
            for (int i9 = 0; i9 < this.numColumns; i9++) {
                hashCode = (hashCode * 31) + this.matrix[i][i9];
            }
        }
        return hashCode;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i = 0; i < this.numRows; i++) {
            for (int i9 = 0; i9 < this.numColumns; i9++) {
                if (this.matrix[i][i9] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public String toString() {
        String str = this.numRows + " x " + this.numColumns + " Matrix over " + this.field.toString() + ": \n";
        for (int i = 0; i < this.numRows; i++) {
            for (int i9 = 0; i9 < this.numColumns; i9++) {
                StringBuilder s10 = v.s(str);
                s10.append(this.field.elementToStr(this.matrix[i][i9]));
                s10.append(" : ");
                str = s10.toString();
            }
            str = v.n(str, "\n");
        }
        return str;
    }

    public GF2mMatrix(GF2mField gF2mField, int[][] iArr) {
        this.field = gF2mField;
        this.matrix = iArr;
        this.numRows = iArr.length;
        this.numColumns = iArr[0].length;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        throw new RuntimeException("Not implemented.");
    }

    public GF2mMatrix(GF2mMatrix gF2mMatrix) {
        int i = gF2mMatrix.numRows;
        this.numRows = i;
        this.numColumns = gF2mMatrix.numColumns;
        this.field = gF2mMatrix.field;
        this.matrix = new int[i][];
        for (int i9 = 0; i9 < this.numRows; i9++) {
            this.matrix[i9] = IntUtils.clone(gF2mMatrix.matrix[i9]);
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        throw new RuntimeException("Not implemented.");
    }
}
