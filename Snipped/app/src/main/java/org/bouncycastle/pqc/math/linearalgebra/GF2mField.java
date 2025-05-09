package org.bouncycastle.pqc.math.linearalgebra;

import androidx.camera.core.impl.utils.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import s3.b;

/* loaded from: classes3.dex */
public class GF2mField {
    private int degree;
    private int polynomial;

    public GF2mField(int i) {
        this.degree = 0;
        if (i >= 32) {
            throw new IllegalArgumentException(" Error: the degree of field is too large ");
        }
        if (i < 1) {
            throw new IllegalArgumentException(" Error: the degree of field is non-positive ");
        }
        this.degree = i;
        this.polynomial = PolynomialRingGF2.getIrreduciblePolynomial(i);
    }

    private static String polyToString(int i) {
        if (i == 0) {
            return "0";
        }
        String str = ((byte) (i & 1)) == 1 ? "1" : "";
        int i9 = i >>> 1;
        int i10 = 1;
        while (i9 != 0) {
            if (((byte) (i9 & 1)) == 1) {
                str = str + "+x^" + i10;
            }
            i9 >>>= 1;
            i10++;
        }
        return str;
    }

    public int add(int i, int i9) {
        return i ^ i9;
    }

    public String elementToStr(int i) {
        String str = "";
        for (int i9 = 0; i9 < this.degree; i9++) {
            str = b.j((((byte) i) & 1) == 0 ? "0" : "1", str);
            i >>>= 1;
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mField)) {
            GF2mField gF2mField = (GF2mField) obj;
            if (this.degree == gF2mField.degree && this.polynomial == gF2mField.polynomial) {
                return true;
            }
        }
        return false;
    }

    public int exp(int i, int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i9 < 0) {
            i = inverse(i);
            i9 = -i9;
        }
        int i10 = 1;
        while (i9 != 0) {
            if ((i9 & 1) == 1) {
                i10 = mult(i10, i);
            }
            i = mult(i, i);
            i9 >>>= 1;
        }
        return i10;
    }

    public int getDegree() {
        return this.degree;
    }

    public byte[] getEncoded() {
        return LittleEndianConversions.I2OSP(this.polynomial);
    }

    public int getPolynomial() {
        return this.polynomial;
    }

    public int getRandomElement(SecureRandom secureRandom) {
        return RandUtils.nextInt(secureRandom, 1 << this.degree);
    }

    public int getRandomNonZeroElement() {
        return getRandomNonZeroElement(CryptoServicesRegistrar.getSecureRandom());
    }

    public int hashCode() {
        return this.polynomial;
    }

    public int inverse(int i) {
        return exp(i, (1 << this.degree) - 2);
    }

    public boolean isElementOfThisField(int i) {
        int i9 = this.degree;
        return i9 == 31 ? i >= 0 : i >= 0 && i < (1 << i9);
    }

    public int mult(int i, int i9) {
        return PolynomialRingGF2.modMultiply(i, i9, this.polynomial);
    }

    public int sqRoot(int i) {
        for (int i9 = 1; i9 < this.degree; i9++) {
            i = mult(i, i);
        }
        return i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Finite Field GF(2^");
        sb2.append(this.degree);
        sb2.append(") = GF(2)[X]/<");
        return a.n(sb2, polyToString(this.polynomial), "> ");
    }

    public GF2mField(int i, int i9) {
        this.degree = 0;
        if (i != PolynomialRingGF2.degree(i9)) {
            throw new IllegalArgumentException(" Error: the degree is not correct");
        }
        if (!PolynomialRingGF2.isIrreducible(i9)) {
            throw new IllegalArgumentException(" Error: given polynomial is reducible");
        }
        this.degree = i;
        this.polynomial = i9;
    }

    public int getRandomNonZeroElement(SecureRandom secureRandom) {
        int nextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
        int i = 0;
        while (nextInt == 0 && i < 1048576) {
            nextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
            i++;
        }
        if (i == 1048576) {
            return 1;
        }
        return nextInt;
    }

    public GF2mField(GF2mField gF2mField) {
        this.degree = 0;
        this.degree = gF2mField.degree;
        this.polynomial = gF2mField.polynomial;
    }

    public GF2mField(byte[] bArr) {
        this.degree = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int OS2IP = LittleEndianConversions.OS2IP(bArr);
        this.polynomial = OS2IP;
        if (!PolynomialRingGF2.isIrreducible(OS2IP)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.degree = PolynomialRingGF2.degree(this.polynomial);
    }
}
