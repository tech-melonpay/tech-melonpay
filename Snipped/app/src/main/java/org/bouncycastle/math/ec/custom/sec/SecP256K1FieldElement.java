package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes.dex */
public class SecP256K1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q, reason: collision with root package name */
    public static final BigInteger f25254Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f25255x;

    public SecP256K1FieldElement() {
        this.f25255x = Nat256.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        SecP256K1Field.add(this.f25255x, ((SecP256K1FieldElement) eCFieldElement).f25255x, create);
        return new SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat256.create();
        SecP256K1Field.addOne(this.f25255x, create);
        return new SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        SecP256K1Field.inv(((SecP256K1FieldElement) eCFieldElement).f25255x, create);
        SecP256K1Field.multiply(create, this.f25255x, create);
        return new SecP256K1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP256K1FieldElement) {
            return Nat256.eq(this.f25255x, ((SecP256K1FieldElement) obj).f25255x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP256K1Field";
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return f25254Q.bitLength();
    }

    public int hashCode() {
        return f25254Q.hashCode() ^ Arrays.hashCode(this.f25255x, 0, 8);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat256.create();
        SecP256K1Field.inv(this.f25255x, create);
        return new SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f25255x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f25255x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        SecP256K1Field.multiply(this.f25255x, ((SecP256K1FieldElement) eCFieldElement).f25255x, create);
        return new SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat256.create();
        SecP256K1Field.negate(this.f25255x, create);
        return new SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25255x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] createExt = Nat256.createExt();
        int[] create = Nat256.create();
        SecP256K1Field.square(iArr, create, createExt);
        SecP256K1Field.multiply(create, iArr, create, createExt);
        int[] create2 = Nat256.create();
        SecP256K1Field.square(create, create2, createExt);
        SecP256K1Field.multiply(create2, iArr, create2, createExt);
        int[] create3 = Nat256.create();
        SecP256K1Field.squareN(create2, 3, create3, createExt);
        SecP256K1Field.multiply(create3, create2, create3, createExt);
        SecP256K1Field.squareN(create3, 3, create3, createExt);
        SecP256K1Field.multiply(create3, create2, create3, createExt);
        SecP256K1Field.squareN(create3, 2, create3, createExt);
        SecP256K1Field.multiply(create3, create, create3, createExt);
        int[] create4 = Nat256.create();
        SecP256K1Field.squareN(create3, 11, create4, createExt);
        SecP256K1Field.multiply(create4, create3, create4, createExt);
        SecP256K1Field.squareN(create4, 22, create3, createExt);
        SecP256K1Field.multiply(create3, create4, create3, createExt);
        int[] create5 = Nat256.create();
        SecP256K1Field.squareN(create3, 44, create5, createExt);
        SecP256K1Field.multiply(create5, create3, create5, createExt);
        int[] create6 = Nat256.create();
        SecP256K1Field.squareN(create5, 88, create6, createExt);
        SecP256K1Field.multiply(create6, create5, create6, createExt);
        SecP256K1Field.squareN(create6, 44, create5, createExt);
        SecP256K1Field.multiply(create5, create3, create5, createExt);
        SecP256K1Field.squareN(create5, 3, create3, createExt);
        SecP256K1Field.multiply(create3, create2, create3, createExt);
        SecP256K1Field.squareN(create3, 23, create3, createExt);
        SecP256K1Field.multiply(create3, create4, create3, createExt);
        SecP256K1Field.squareN(create3, 6, create3, createExt);
        SecP256K1Field.multiply(create3, create, create3, createExt);
        SecP256K1Field.squareN(create3, 2, create3, createExt);
        SecP256K1Field.square(create3, create, createExt);
        if (Nat256.eq(iArr, create)) {
            return new SecP256K1FieldElement(create3);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat256.create();
        SecP256K1Field.square(this.f25255x, create);
        return new SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat256.create();
        SecP256K1Field.subtract(this.f25255x, ((SecP256K1FieldElement) eCFieldElement).f25255x, create);
        return new SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f25255x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f25255x);
    }

    public SecP256K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f25254Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f25255x = SecP256K1Field.fromBigInteger(bigInteger);
    }

    public SecP256K1FieldElement(int[] iArr) {
        this.f25255x = iArr;
    }
}
