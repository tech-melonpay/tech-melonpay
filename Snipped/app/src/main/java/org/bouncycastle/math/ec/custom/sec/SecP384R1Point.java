package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;

/* loaded from: classes.dex */
public class SecP384R1Point extends ECPoint.AbstractFp {
    public SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f25199x;
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f25200y;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) eCPoint.getXCoord();
        SecP384R1FieldElement secP384R1FieldElement4 = (SecP384R1FieldElement) eCPoint.getYCoord();
        SecP384R1FieldElement secP384R1FieldElement5 = (SecP384R1FieldElement) this.zs[0];
        SecP384R1FieldElement secP384R1FieldElement6 = (SecP384R1FieldElement) eCPoint.getZCoord(0);
        int[] create = Nat.create(24);
        int[] create2 = Nat.create(24);
        int[] create3 = Nat.create(24);
        int i = 12;
        int[] create4 = Nat.create(12);
        int[] create5 = Nat.create(12);
        boolean isOne = secP384R1FieldElement5.isOne();
        if (isOne) {
            iArr = secP384R1FieldElement3.f25266x;
            iArr2 = secP384R1FieldElement4.f25266x;
        } else {
            SecP384R1Field.square(secP384R1FieldElement5.f25266x, create4, create);
            SecP384R1Field.multiply(create4, secP384R1FieldElement3.f25266x, create3, create);
            SecP384R1Field.multiply(create4, secP384R1FieldElement5.f25266x, create4, create);
            SecP384R1Field.multiply(create4, secP384R1FieldElement4.f25266x, create4, create);
            iArr = create3;
            iArr2 = create4;
        }
        boolean isOne2 = secP384R1FieldElement6.isOne();
        if (isOne2) {
            iArr3 = secP384R1FieldElement.f25266x;
            iArr4 = secP384R1FieldElement2.f25266x;
        } else {
            SecP384R1Field.square(secP384R1FieldElement6.f25266x, create5, create);
            SecP384R1Field.multiply(create5, secP384R1FieldElement.f25266x, create2, create);
            SecP384R1Field.multiply(create5, secP384R1FieldElement6.f25266x, create5, create);
            SecP384R1Field.multiply(create5, secP384R1FieldElement2.f25266x, create5, create);
            iArr3 = create2;
            iArr4 = create5;
            i = 12;
        }
        int[] create6 = Nat.create(i);
        SecP384R1Field.subtract(iArr3, iArr, create6);
        int[] create7 = Nat.create(i);
        SecP384R1Field.subtract(iArr4, iArr2, create7);
        if (Nat.isZero(i, create6)) {
            return Nat.isZero(i, create7) ? twice() : curve.getInfinity();
        }
        SecP384R1Field.square(create6, create4, create);
        int[] create8 = Nat.create(i);
        SecP384R1Field.multiply(create4, create6, create8, create);
        SecP384R1Field.multiply(create4, iArr3, create4, create);
        SecP384R1Field.negate(create8, create8);
        Nat384.mul(iArr4, create8, create2);
        SecP384R1Field.reduce32(Nat.addBothTo(i, create4, create4, create8), create8);
        SecP384R1FieldElement secP384R1FieldElement7 = new SecP384R1FieldElement(create5);
        SecP384R1Field.square(create7, secP384R1FieldElement7.f25266x, create);
        int[] iArr5 = secP384R1FieldElement7.f25266x;
        SecP384R1Field.subtract(iArr5, create8, iArr5);
        SecP384R1FieldElement secP384R1FieldElement8 = new SecP384R1FieldElement(create8);
        SecP384R1Field.subtract(create4, secP384R1FieldElement7.f25266x, secP384R1FieldElement8.f25266x);
        Nat384.mul(secP384R1FieldElement8.f25266x, create7, create3);
        SecP384R1Field.addExt(create2, create3, create2);
        SecP384R1Field.reduce(create2, secP384R1FieldElement8.f25266x);
        SecP384R1FieldElement secP384R1FieldElement9 = new SecP384R1FieldElement(create6);
        if (!isOne) {
            int[] iArr6 = secP384R1FieldElement9.f25266x;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement5.f25266x, iArr6, create);
        }
        if (!isOne2) {
            int[] iArr7 = secP384R1FieldElement9.f25266x;
            SecP384R1Field.multiply(iArr7, secP384R1FieldElement6.f25266x, iArr7, create);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement7, secP384R1FieldElement8, new ECFieldElement[]{secP384R1FieldElement9});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint detach() {
        return new SecP384R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP384R1Point(this.curve, this.f25199x, this.f25200y.negate(), this.zs);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f25200y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f25200y;
        if (secP384R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f25199x;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) this.zs[0];
        int[] create = Nat.create(24);
        int[] create2 = Nat.create(12);
        int[] create3 = Nat.create(12);
        int[] create4 = Nat.create(12);
        SecP384R1Field.square(secP384R1FieldElement.f25266x, create4, create);
        int[] create5 = Nat.create(12);
        SecP384R1Field.square(create4, create5, create);
        boolean isOne = secP384R1FieldElement3.isOne();
        int[] iArr = secP384R1FieldElement3.f25266x;
        if (!isOne) {
            SecP384R1Field.square(iArr, create3, create);
            iArr = create3;
        }
        SecP384R1Field.subtract(secP384R1FieldElement2.f25266x, iArr, create2);
        SecP384R1Field.add(secP384R1FieldElement2.f25266x, iArr, create3);
        SecP384R1Field.multiply(create3, create2, create3, create);
        SecP384R1Field.reduce32(Nat.addBothTo(12, create3, create3, create3), create3);
        SecP384R1Field.multiply(create4, secP384R1FieldElement2.f25266x, create4, create);
        SecP384R1Field.reduce32(Nat.shiftUpBits(12, create4, 2, 0), create4);
        SecP384R1Field.reduce32(Nat.shiftUpBits(12, create5, 3, 0, create2), create2);
        SecP384R1FieldElement secP384R1FieldElement4 = new SecP384R1FieldElement(create5);
        SecP384R1Field.square(create3, secP384R1FieldElement4.f25266x, create);
        int[] iArr2 = secP384R1FieldElement4.f25266x;
        SecP384R1Field.subtract(iArr2, create4, iArr2);
        int[] iArr3 = secP384R1FieldElement4.f25266x;
        SecP384R1Field.subtract(iArr3, create4, iArr3);
        SecP384R1FieldElement secP384R1FieldElement5 = new SecP384R1FieldElement(create4);
        SecP384R1Field.subtract(create4, secP384R1FieldElement4.f25266x, secP384R1FieldElement5.f25266x);
        int[] iArr4 = secP384R1FieldElement5.f25266x;
        SecP384R1Field.multiply(iArr4, create3, iArr4, create);
        int[] iArr5 = secP384R1FieldElement5.f25266x;
        SecP384R1Field.subtract(iArr5, create2, iArr5);
        SecP384R1FieldElement secP384R1FieldElement6 = new SecP384R1FieldElement(create3);
        SecP384R1Field.twice(secP384R1FieldElement.f25266x, secP384R1FieldElement6.f25266x);
        if (!isOne) {
            int[] iArr6 = secP384R1FieldElement6.f25266x;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement3.f25266x, iArr6, create);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement4, secP384R1FieldElement5, new ECFieldElement[]{secP384R1FieldElement6});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        return this == eCPoint ? threeTimes() : isInfinity() ? eCPoint : eCPoint.isInfinity() ? twice() : this.f25200y.isZero() ? eCPoint : twice().add(eCPoint);
    }

    public SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
