package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GF2Vector extends Vector {

    /* renamed from: v, reason: collision with root package name */
    private int[] f25474v;

    public GF2Vector(int i) {
        if (i < 0) {
            throw new ArithmeticException("Negative length.");
        }
        this.length = i;
        this.f25474v = new int[(i + 31) >> 5];
    }

    public static GF2Vector OS2VP(int i, byte[] bArr) {
        if (i < 0) {
            throw new ArithmeticException("negative length");
        }
        if (bArr.length <= ((i + 7) >> 3)) {
            return new GF2Vector(i, LittleEndianConversions.toIntArray(bArr));
        }
        throw new ArithmeticException("length mismatch");
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public Vector add(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        GF2Vector gF2Vector = (GF2Vector) vector;
        if (this.length != gF2Vector.length) {
            throw new ArithmeticException("length mismatch");
        }
        int[] clone = IntUtils.clone(gF2Vector.f25474v);
        for (int length = clone.length - 1; length >= 0; length--) {
            clone[length] = clone[length] ^ this.f25474v[length];
        }
        return new GF2Vector(this.length, clone);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public boolean equals(Object obj) {
        if (!(obj instanceof GF2Vector)) {
            return false;
        }
        GF2Vector gF2Vector = (GF2Vector) obj;
        return this.length == gF2Vector.length && IntUtils.equals(this.f25474v, gF2Vector.f25474v);
    }

    public GF2Vector extractLeftVector(int i) {
        int i9 = this.length;
        if (i > i9) {
            throw new ArithmeticException("invalid length");
        }
        if (i == i9) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i);
        int i10 = i >> 5;
        int i11 = i & 31;
        System.arraycopy(this.f25474v, 0, gF2Vector.f25474v, 0, i10);
        if (i11 != 0) {
            gF2Vector.f25474v[i10] = ((1 << i11) - 1) & this.f25474v[i10];
        }
        return gF2Vector;
    }

    public GF2Vector extractRightVector(int i) {
        int i9;
        int i10 = this.length;
        if (i > i10) {
            throw new ArithmeticException("invalid length");
        }
        if (i == i10) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i);
        int i11 = this.length;
        int i12 = (i11 - i) >> 5;
        int i13 = (i11 - i) & 31;
        int i14 = (i + 31) >> 5;
        int i15 = 0;
        if (i13 != 0) {
            while (true) {
                i9 = i14 - 1;
                if (i15 >= i9) {
                    break;
                }
                int[] iArr = gF2Vector.f25474v;
                int[] iArr2 = this.f25474v;
                int i16 = i12 + 1;
                iArr[i15] = (iArr2[i12] >>> i13) | (iArr2[i16] << (32 - i13));
                i15++;
                i12 = i16;
            }
            int[] iArr3 = gF2Vector.f25474v;
            int[] iArr4 = this.f25474v;
            int i17 = i12 + 1;
            int i18 = iArr4[i12] >>> i13;
            iArr3[i9] = i18;
            if (i17 < iArr4.length) {
                iArr3[i9] = (iArr4[i17] << (32 - i13)) | i18;
            }
        } else {
            System.arraycopy(this.f25474v, i12, gF2Vector.f25474v, 0, i14);
        }
        return gF2Vector;
    }

    public GF2Vector extractVector(int[] iArr) {
        int length = iArr.length;
        if (iArr[length - 1] > this.length) {
            throw new ArithmeticException("invalid index set");
        }
        GF2Vector gF2Vector = new GF2Vector(length);
        for (int i = 0; i < length; i++) {
            int[] iArr2 = this.f25474v;
            int i9 = iArr[i];
            if ((iArr2[i9 >> 5] & (1 << (i9 & 31))) != 0) {
                int[] iArr3 = gF2Vector.f25474v;
                int i10 = i >> 5;
                iArr3[i10] = (1 << (i & 31)) | iArr3[i10];
            }
        }
        return gF2Vector;
    }

    public int getBit(int i) {
        if (i >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int i9 = i >> 5;
        int i10 = i & 31;
        return (this.f25474v[i9] & (1 << i10)) >>> i10;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public byte[] getEncoded() {
        return LittleEndianConversions.toByteArray(this.f25474v, (this.length + 7) >> 3);
    }

    public int getHammingWeight() {
        int i = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f25474v;
            if (i >= iArr.length) {
                return i9;
            }
            int i10 = iArr[i];
            for (int i11 = 0; i11 < 32; i11++) {
                if ((i10 & 1) != 0) {
                    i9++;
                }
                i10 >>>= 1;
            }
            i++;
        }
    }

    public int[] getVecArray() {
        return this.f25474v;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public int hashCode() {
        return Arrays.hashCode(this.f25474v) + (this.length * 31);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public boolean isZero() {
        for (int length = this.f25474v.length - 1; length >= 0; length--) {
            if (this.f25474v[length] != 0) {
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
            throw new ArithmeticException("length mismatch");
        }
        GF2Vector gF2Vector = new GF2Vector(i);
        for (int i9 = 0; i9 < vector.length; i9++) {
            int[] iArr = this.f25474v;
            int i10 = vector[i9];
            if ((iArr[i10 >> 5] & (1 << (i10 & 31))) != 0) {
                int[] iArr2 = gF2Vector.f25474v;
                int i11 = i9 >> 5;
                iArr2[i11] = (1 << (i9 & 31)) | iArr2[i11];
            }
        }
        return gF2Vector;
    }

    public void setBit(int i) {
        if (i >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int[] iArr = this.f25474v;
        int i9 = i >> 5;
        iArr[i9] = (1 << (i & 31)) | iArr[i9];
    }

    public GF2mVector toExtensionFieldVector(GF2mField gF2mField) {
        int degree = gF2mField.getDegree();
        int i = this.length;
        if (i % degree != 0) {
            throw new ArithmeticException("conversion is impossible");
        }
        int i9 = i / degree;
        int[] iArr = new int[i9];
        int i10 = 0;
        for (int i11 = i9 - 1; i11 >= 0; i11--) {
            for (int degree2 = gF2mField.getDegree() - 1; degree2 >= 0; degree2--) {
                if (((this.f25474v[i10 >>> 5] >>> (i10 & 31)) & 1) == 1) {
                    iArr[i11] = iArr[i11] ^ (1 << degree2);
                }
                i10++;
            }
        }
        return new GF2mVector(gF2mField, iArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.length; i++) {
            if (i != 0 && (i & 31) == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append((this.f25474v[i >> 5] & (1 << (i & 31))) == 0 ? '0' : '1');
        }
        return stringBuffer.toString();
    }

    public GF2Vector(int i, int i9, SecureRandom secureRandom) {
        if (i9 > i) {
            throw new ArithmeticException("The hamming weight is greater than the length of vector.");
        }
        this.length = i;
        this.f25474v = new int[(i + 31) >> 5];
        int[] iArr = new int[i];
        for (int i10 = 0; i10 < i; i10++) {
            iArr[i10] = i10;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            int nextInt = RandUtils.nextInt(secureRandom, i);
            setBit(iArr[nextInt]);
            i--;
            iArr[nextInt] = iArr[i];
        }
    }

    public GF2Vector(int i, SecureRandom secureRandom) {
        this.length = i;
        int i9 = (i + 31) >> 5;
        this.f25474v = new int[i9];
        int i10 = i9 - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            this.f25474v[i11] = secureRandom.nextInt();
        }
        int i12 = i & 31;
        if (i12 != 0) {
            int[] iArr = this.f25474v;
            iArr[i10] = ((1 << i12) - 1) & iArr[i10];
        }
    }

    public GF2Vector(int i, int[] iArr) {
        if (i < 0) {
            throw new ArithmeticException("negative length");
        }
        this.length = i;
        int i9 = (i + 31) >> 5;
        if (iArr.length != i9) {
            throw new ArithmeticException("length mismatch");
        }
        int[] clone = IntUtils.clone(iArr);
        this.f25474v = clone;
        int i10 = i & 31;
        if (i10 != 0) {
            int i11 = i9 - 1;
            clone[i11] = ((1 << i10) - 1) & clone[i11];
        }
    }

    public GF2Vector(GF2Vector gF2Vector) {
        this.length = gF2Vector.length;
        this.f25474v = IntUtils.clone(gF2Vector.f25474v);
    }

    public GF2Vector(int[] iArr, int i) {
        this.f25474v = iArr;
        this.length = i;
    }
}
