package org.bouncycastle.pqc.math.linearalgebra;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GF2mVector extends Vector {
    private GF2mField field;
    private int[] vector;

    public GF2mVector(GF2mField gF2mField, byte[] bArr) {
        this.field = new GF2mField(gF2mField);
        int i = 8;
        int i9 = 1;
        while (gF2mField.getDegree() > i) {
            i9++;
            i += 8;
        }
        if (bArr.length % i9 != 0) {
            throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
        }
        int length = bArr.length / i9;
        this.length = length;
        this.vector = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < this.vector.length; i11++) {
            int i12 = 0;
            while (i12 < i) {
                int[] iArr = this.vector;
                iArr[i11] = ((bArr[i10] & 255) << i12) | iArr[i11];
                i12 += 8;
                i10++;
            }
            if (!gF2mField.isElementOfThisField(this.vector[i11])) {
                throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
            }
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public Vector add(Vector vector) {
        throw new RuntimeException("not implemented");
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public boolean equals(Object obj) {
        if (!(obj instanceof GF2mVector)) {
            return false;
        }
        GF2mVector gF2mVector = (GF2mVector) obj;
        if (this.field.equals(gF2mVector.field)) {
            return IntUtils.equals(this.vector, gF2mVector.vector);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public byte[] getEncoded() {
        int i = 8;
        int i9 = 1;
        while (this.field.getDegree() > i) {
            i9++;
            i += 8;
        }
        byte[] bArr = new byte[this.vector.length * i9];
        int i10 = 0;
        for (int i11 = 0; i11 < this.vector.length; i11++) {
            int i12 = 0;
            while (i12 < i) {
                bArr[i10] = (byte) (this.vector[i11] >>> i12);
                i12 += 8;
                i10++;
            }
        }
        return bArr;
    }

    public GF2mField getField() {
        return this.field;
    }

    public int[] getIntArrayForm() {
        return IntUtils.clone(this.vector);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public int hashCode() {
        return Arrays.hashCode(this.vector) + (this.field.hashCode() * 31);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public boolean isZero() {
        for (int length = this.vector.length - 1; length >= 0; length--) {
            if (this.vector[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public Vector multiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int i = this.length;
        if (i != vector.length) {
            throw new ArithmeticException("permutation size and vector size mismatch");
        }
        int[] iArr = new int[i];
        for (int i9 = 0; i9 < vector.length; i9++) {
            iArr[i9] = this.vector[vector[i9]];
        }
        return new GF2mVector(this.field, iArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.vector.length; i++) {
            for (int i9 = 0; i9 < this.field.getDegree(); i9++) {
                stringBuffer.append(((1 << (i9 & 31)) & this.vector[i]) != 0 ? '1' : '0');
            }
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    public GF2mVector(GF2mField gF2mField, int[] iArr) {
        this.field = gF2mField;
        this.length = iArr.length;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (!gF2mField.isElementOfThisField(iArr[length])) {
                throw new ArithmeticException("Element array is not specified over the given finite field.");
            }
        }
        this.vector = IntUtils.clone(iArr);
    }

    public GF2mVector(GF2mVector gF2mVector) {
        this.field = new GF2mField(gF2mVector.field);
        this.length = gF2mVector.length;
        this.vector = IntUtils.clone(gF2mVector.vector);
    }
}
