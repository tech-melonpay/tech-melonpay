package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes.dex */
public class SecP224R1Curve extends ECCurve.AbstractFp {
    private static final int SECP224R1_DEFAULT_COORDS = 2;
    protected SecP224R1Point infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f25245q = SecP224R1FieldElement.f25249Q;
    private static final ECFieldElement[] SECP224R1_AFFINE_ZS = {new SecP224R1FieldElement(ECConstants.ONE)};

    public SecP224R1Curve() {
        super(f25245q);
        this.infinity = new SecP224R1Point(this, null, null);
        this.f25187a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.f25188b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.order = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP224R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i, final int i9) {
        final int[] iArr = new int[i9 * 14];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            ECPoint eCPoint = eCPointArr[i + i11];
            Nat224.copy(((SecP224R1FieldElement) eCPoint.getRawXCoord()).f25250x, 0, iArr, i10);
            Nat224.copy(((SecP224R1FieldElement) eCPoint.getRawYCoord()).f25250x, 0, iArr, i10 + 7);
            i10 += 14;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP224R1Curve.1
            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return SecP224R1Curve.this.createRawPoint(new SecP224R1FieldElement(iArr2), new SecP224R1FieldElement(iArr3), SecP224R1Curve.SECP224R1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i9;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i12) {
                int[] create = Nat224.create();
                int[] create2 = Nat224.create();
                int i13 = 0;
                for (int i14 = 0; i14 < i9; i14++) {
                    int i15 = ((i14 ^ i12) - 1) >> 31;
                    for (int i16 = 0; i16 < 7; i16++) {
                        int i17 = create[i16];
                        int[] iArr2 = iArr;
                        create[i16] = i17 ^ (iArr2[i13 + i16] & i15);
                        create2[i16] = create2[i16] ^ (iArr2[(i13 + 7) + i16] & i15);
                    }
                    i13 += 14;
                }
                return createPoint(create, create2);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i12) {
                int[] create = Nat224.create();
                int[] create2 = Nat224.create();
                int i13 = i12 * 14;
                for (int i14 = 0; i14 < 7; i14++) {
                    int[] iArr2 = iArr;
                    create[i14] = iArr2[i13 + i14];
                    create2[i14] = iArr2[7 + i13 + i14];
                }
                return createPoint(create, create2);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP224R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP224R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f25245q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f25245q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] create = Nat224.create();
        SecP224R1Field.random(secureRandom, create);
        return new SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] create = Nat224.create();
        SecP224R1Field.randomMult(secureRandom, create);
        return new SecP224R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP224R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
