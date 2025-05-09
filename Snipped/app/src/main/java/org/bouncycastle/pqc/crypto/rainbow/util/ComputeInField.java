package org.bouncycastle.pqc.crypto.rainbow.util;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public class ComputeInField {

    /* renamed from: A, reason: collision with root package name */
    private short[][] f25449A;

    /* renamed from: x, reason: collision with root package name */
    short[] f25450x;

    private void computeZerosAbove() {
        for (int length = this.f25449A.length - 1; length > 0; length--) {
            for (int i = length - 1; i >= 0; i--) {
                short[][] sArr = this.f25449A;
                short s10 = sArr[i][length];
                short invElem = GF2Field.invElem(sArr[length][length]);
                if (invElem == 0) {
                    throw new RuntimeException("The matrix is not invertible");
                }
                int i9 = length;
                while (true) {
                    short[][] sArr2 = this.f25449A;
                    if (i9 < sArr2.length * 2) {
                        short multElem = GF2Field.multElem(s10, GF2Field.multElem(sArr2[length][i9], invElem));
                        short[] sArr3 = this.f25449A[i];
                        sArr3[i9] = GF2Field.addElem(sArr3[i9], multElem);
                        i9++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r0 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void computeZerosUnder(boolean r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L8
            short[][] r10 = r9.f25449A
            int r10 = r10.length
            int r10 = r10 * 2
            goto Ld
        L8:
            short[][] r10 = r9.f25449A
            int r10 = r10.length
            int r10 = r10 + 1
        Ld:
            r0 = 0
        Le:
            short[][] r1 = r9.f25449A
            int r1 = r1.length
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L58
            int r1 = r0 + 1
            r2 = r1
        L18:
            short[][] r3 = r9.f25449A
            int r4 = r3.length
            if (r2 >= r4) goto L56
            r4 = r3[r2]
            short r4 = r4[r0]
            r3 = r3[r0]
            short r3 = r3[r0]
            short r3 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.invElem(r3)
            if (r3 == 0) goto L4e
            r5 = r0
        L2c:
            if (r5 >= r10) goto L4b
            short[][] r6 = r9.f25449A
            r6 = r6[r0]
            short r6 = r6[r5]
            short r6 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(r6, r3)
            short r6 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(r4, r6)
            short[][] r7 = r9.f25449A
            r7 = r7[r2]
            short r8 = r7[r5]
            short r6 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(r8, r6)
            r7[r5] = r6
            int r5 = r5 + 1
            goto L2c
        L4b:
            int r2 = r2 + 1
            goto L18
        L4e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Matrix not invertible! We have to choose another one!"
            r10.<init>(r0)
            throw r10
        L56:
            r0 = r1
            goto Le
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField.computeZerosUnder(boolean):void");
    }

    private void substitute() {
        short invElem = GF2Field.invElem(this.f25449A[r0.length - 1][r0.length - 1]);
        if (invElem == 0) {
            throw new IllegalStateException("The equation system is not solvable");
        }
        short[] sArr = this.f25450x;
        short[][] sArr2 = this.f25449A;
        sArr[sArr2.length - 1] = GF2Field.multElem(sArr2[sArr2.length - 1][sArr2.length], invElem);
        for (int length = this.f25449A.length - 2; length >= 0; length--) {
            short[][] sArr3 = this.f25449A;
            short s10 = sArr3[length][sArr3.length];
            for (int length2 = sArr3.length - 1; length2 > length; length2--) {
                s10 = GF2Field.addElem(s10, GF2Field.multElem(this.f25449A[length][length2], this.f25450x[length2]));
            }
            short invElem2 = GF2Field.invElem(this.f25449A[length][length]);
            if (invElem2 == 0) {
                throw new IllegalStateException("Not solvable equation system");
            }
            this.f25450x[length] = GF2Field.multElem(s10, invElem2);
        }
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            throw new RuntimeException("Addition is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i9 = 0; i9 < sArr2.length; i9++) {
                sArr3[i][i9] = GF2Field.addElem(sArr[i][i9], sArr2[i][i9]);
            }
        }
        return sArr3;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i = 0; i < length; i++) {
            sArr3[i] = GF2Field.addElem(sArr[i], sArr2[i]);
        }
        return sArr3;
    }

    public short[][] inverse(short[][] sArr) {
        try {
            int i = 0;
            this.f25449A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length * 2);
            if (sArr.length != sArr[0].length) {
                throw new RuntimeException("The matrix is not invertible. Please choose another one!");
            }
            for (int i9 = 0; i9 < sArr.length; i9++) {
                for (int i10 = 0; i10 < sArr.length; i10++) {
                    this.f25449A[i9][i10] = sArr[i9][i10];
                }
                for (int length = sArr.length; length < sArr.length * 2; length++) {
                    this.f25449A[i9][length] = 0;
                }
                short[][] sArr2 = this.f25449A;
                sArr2[i9][sArr2.length + i9] = 1;
            }
            computeZerosUnder(true);
            int i11 = 0;
            while (true) {
                short[][] sArr3 = this.f25449A;
                if (i11 >= sArr3.length) {
                    break;
                }
                short invElem = GF2Field.invElem(sArr3[i11][i11]);
                int i12 = i11;
                while (true) {
                    short[][] sArr4 = this.f25449A;
                    if (i12 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i11];
                        sArr5[i12] = GF2Field.multElem(sArr5[i12], invElem);
                        i12++;
                    }
                }
                i11++;
            }
            computeZerosAbove();
            short[][] sArr6 = this.f25449A;
            short[][] sArr7 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr6.length, sArr6.length);
            while (true) {
                short[][] sArr8 = this.f25449A;
                if (i >= sArr8.length) {
                    return sArr7;
                }
                int length2 = sArr8.length;
                while (true) {
                    short[][] sArr9 = this.f25449A;
                    if (length2 < sArr9.length * 2) {
                        sArr7[i][length2 - sArr9.length] = sArr9[i][length2];
                        length2++;
                    }
                }
                i++;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s10, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i9 = 0; i9 < sArr[0].length; i9++) {
                sArr2[i][i9] = GF2Field.multElem(s10, sArr[i][i9]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s10, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i = 0; i < length; i++) {
            sArr2[i] = GF2Field.multElem(s10, sArr[i]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i9 = 0; i9 < sArr2.length; i9++) {
                sArr3[i][i9] = GF2Field.multElem(sArr[i], sArr2[i9]);
            }
        }
        return sArr3;
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[] sArr3 = new short[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            for (int i9 = 0; i9 < sArr2.length; i9++) {
                sArr3[i] = GF2Field.addElem(sArr3[i], GF2Field.multElem(sArr[i][i9], sArr2[i9]));
            }
        }
        return sArr3;
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            this.f25449A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            this.f25450x = new short[sArr.length];
            for (int i = 0; i < sArr.length; i++) {
                for (int i9 = 0; i9 < sArr[0].length; i9++) {
                    this.f25449A[i][i9] = sArr[i][i9];
                }
            }
            for (int i10 = 0; i10 < sArr2.length; i10++) {
                short[] sArr3 = this.f25449A[i10];
                sArr3[sArr2.length] = GF2Field.addElem(sArr2[i10], sArr3[sArr2.length]);
            }
            computeZerosUnder(false);
            substitute();
            return this.f25450x;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        this.f25449A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i9 = 0; i9 < sArr2.length; i9++) {
                for (int i10 = 0; i10 < sArr2[0].length; i10++) {
                    short multElem = GF2Field.multElem(sArr[i][i9], sArr2[i9][i10]);
                    short[] sArr3 = this.f25449A[i];
                    sArr3[i10] = GF2Field.addElem(sArr3[i10], multElem);
                }
            }
        }
        return this.f25449A;
    }
}
