package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: classes.dex */
public class SecP256R1Point extends ECPoint.AbstractFp {
    public SecP256R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
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
        SecP256R1FieldElement secP256R1FieldElement = (SecP256R1FieldElement) this.f25199x;
        SecP256R1FieldElement secP256R1FieldElement2 = (SecP256R1FieldElement) this.f25200y;
        SecP256R1FieldElement secP256R1FieldElement3 = (SecP256R1FieldElement) eCPoint.getXCoord();
        SecP256R1FieldElement secP256R1FieldElement4 = (SecP256R1FieldElement) eCPoint.getYCoord();
        SecP256R1FieldElement secP256R1FieldElement5 = (SecP256R1FieldElement) this.zs[0];
        SecP256R1FieldElement secP256R1FieldElement6 = (SecP256R1FieldElement) eCPoint.getZCoord(0);
        int[] createExt = Nat256.createExt();
        int[] createExt2 = Nat256.createExt();
        int[] create = Nat256.create();
        int[] create2 = Nat256.create();
        int[] create3 = Nat256.create();
        boolean isOne = secP256R1FieldElement5.isOne();
        if (isOne) {
            iArr = secP256R1FieldElement3.f25261x;
            iArr2 = secP256R1FieldElement4.f25261x;
        } else {
            SecP256R1Field.square(secP256R1FieldElement5.f25261x, create2, createExt);
            SecP256R1Field.multiply(create2, secP256R1FieldElement3.f25261x, create, createExt);
            SecP256R1Field.multiply(create2, secP256R1FieldElement5.f25261x, create2, createExt);
            SecP256R1Field.multiply(create2, secP256R1FieldElement4.f25261x, create2, createExt);
            iArr = create;
            iArr2 = create2;
        }
        boolean isOne2 = secP256R1FieldElement6.isOne();
        if (isOne2) {
            iArr3 = secP256R1FieldElement.f25261x;
            iArr4 = secP256R1FieldElement2.f25261x;
        } else {
            SecP256R1Field.square(secP256R1FieldElement6.f25261x, create3, createExt);
            SecP256R1Field.multiply(create3, secP256R1FieldElement.f25261x, createExt2, createExt);
            SecP256R1Field.multiply(create3, secP256R1FieldElement6.f25261x, create3, createExt);
            SecP256R1Field.multiply(create3, secP256R1FieldElement2.f25261x, create3, createExt);
            iArr3 = createExt2;
            iArr4 = create3;
        }
        int[] create4 = Nat256.create();
        SecP256R1Field.subtract(iArr3, iArr, create4);
        SecP256R1Field.subtract(iArr4, iArr2, create);
        if (Nat256.isZero(create4)) {
            return Nat256.isZero(create) ? twice() : curve.getInfinity();
        }
        SecP256R1Field.square(create4, create2, createExt);
        int[] create5 = Nat256.create();
        SecP256R1Field.multiply(create2, create4, create5, createExt);
        SecP256R1Field.multiply(create2, iArr3, create2, createExt);
        SecP256R1Field.negate(create5, create5);
        Nat256.mul(iArr4, create5, createExt2);
        SecP256R1Field.reduce32(Nat256.addBothTo(create2, create2, create5), create5);
        SecP256R1FieldElement secP256R1FieldElement7 = new SecP256R1FieldElement(create3);
        SecP256R1Field.square(create, secP256R1FieldElement7.f25261x, createExt);
        int[] iArr5 = secP256R1FieldElement7.f25261x;
        SecP256R1Field.subtract(iArr5, create5, iArr5);
        SecP256R1FieldElement secP256R1FieldElement8 = new SecP256R1FieldElement(create5);
        SecP256R1Field.subtract(create2, secP256R1FieldElement7.f25261x, secP256R1FieldElement8.f25261x);
        SecP256R1Field.multiplyAddToExt(secP256R1FieldElement8.f25261x, create, createExt2);
        SecP256R1Field.reduce(createExt2, secP256R1FieldElement8.f25261x);
        SecP256R1FieldElement secP256R1FieldElement9 = new SecP256R1FieldElement(create4);
        if (!isOne) {
            int[] iArr6 = secP256R1FieldElement9.f25261x;
            SecP256R1Field.multiply(iArr6, secP256R1FieldElement5.f25261x, iArr6, createExt);
        }
        if (!isOne2) {
            int[] iArr7 = secP256R1FieldElement9.f25261x;
            SecP256R1Field.multiply(iArr7, secP256R1FieldElement6.f25261x, iArr7, createExt);
        }
        return new SecP256R1Point(curve, secP256R1FieldElement7, secP256R1FieldElement8, new ECFieldElement[]{secP256R1FieldElement9});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint detach() {
        return new SecP256R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP256R1Point(this.curve, this.f25199x, this.f25200y.negate(), this.zs);
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
        SecP256R1FieldElement secP256R1FieldElement = (SecP256R1FieldElement) this.f25200y;
        if (secP256R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP256R1FieldElement secP256R1FieldElement2 = (SecP256R1FieldElement) this.f25199x;
        SecP256R1FieldElement secP256R1FieldElement3 = (SecP256R1FieldElement) this.zs[0];
        int[] createExt = Nat256.createExt();
        int[] create = Nat256.create();
        int[] create2 = Nat256.create();
        int[] create3 = Nat256.create();
        SecP256R1Field.square(secP256R1FieldElement.f25261x, create3, createExt);
        int[] create4 = Nat256.create();
        SecP256R1Field.square(create3, create4, createExt);
        boolean isOne = secP256R1FieldElement3.isOne();
        int[] iArr = secP256R1FieldElement3.f25261x;
        if (!isOne) {
            SecP256R1Field.square(iArr, create2, createExt);
            iArr = create2;
        }
        SecP256R1Field.subtract(secP256R1FieldElement2.f25261x, iArr, create);
        SecP256R1Field.add(secP256R1FieldElement2.f25261x, iArr, create2);
        SecP256R1Field.multiply(create2, create, create2, createExt);
        SecP256R1Field.reduce32(Nat256.addBothTo(create2, create2, create2), create2);
        SecP256R1Field.multiply(create3, secP256R1FieldElement2.f25261x, create3, createExt);
        SecP256R1Field.reduce32(Nat.shiftUpBits(8, create3, 2, 0), create3);
        SecP256R1Field.reduce32(Nat.shiftUpBits(8, create4, 3, 0, create), create);
        SecP256R1FieldElement secP256R1FieldElement4 = new SecP256R1FieldElement(create4);
        SecP256R1Field.square(create2, secP256R1FieldElement4.f25261x, createExt);
        int[] iArr2 = secP256R1FieldElement4.f25261x;
        SecP256R1Field.subtract(iArr2, create3, iArr2);
        int[] iArr3 = secP256R1FieldElement4.f25261x;
        SecP256R1Field.subtract(iArr3, create3, iArr3);
        SecP256R1FieldElement secP256R1FieldElement5 = new SecP256R1FieldElement(create3);
        SecP256R1Field.subtract(create3, secP256R1FieldElement4.f25261x, secP256R1FieldElement5.f25261x);
        int[] iArr4 = secP256R1FieldElement5.f25261x;
        SecP256R1Field.multiply(iArr4, create2, iArr4, createExt);
        int[] iArr5 = secP256R1FieldElement5.f25261x;
        SecP256R1Field.subtract(iArr5, create, iArr5);
        SecP256R1FieldElement secP256R1FieldElement6 = new SecP256R1FieldElement(create2);
        SecP256R1Field.twice(secP256R1FieldElement.f25261x, secP256R1FieldElement6.f25261x);
        if (!isOne) {
            int[] iArr6 = secP256R1FieldElement6.f25261x;
            SecP256R1Field.multiply(iArr6, secP256R1FieldElement3.f25261x, iArr6, createExt);
        }
        return new SecP256R1Point(curve, secP256R1FieldElement4, secP256R1FieldElement5, new ECFieldElement[]{secP256R1FieldElement6});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        return this == eCPoint ? threeTimes() : isInfinity() ? eCPoint : eCPoint.isInfinity() ? twice() : this.f25200y.isZero() ? eCPoint : twice().add(eCPoint);
    }

    public SecP256R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
