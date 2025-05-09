package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes.dex */
public class SecP256K1Curve extends ECCurve.AbstractFp {
    private static final int SECP256K1_DEFAULT_COORDS = 2;
    protected SecP256K1Point infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f25251q = SecP256K1FieldElement.f25254Q;
    private static final ECFieldElement[] SECP256K1_AFFINE_ZS = {new SecP256K1FieldElement(ECConstants.ONE)};

    public SecP256K1Curve() {
        super(f25251q);
        this.infinity = new SecP256K1Point(this, null, null);
        this.f25187a = fromBigInteger(ECConstants.ZERO);
        this.f25188b = fromBigInteger(BigInteger.valueOf(7L));
        this.order = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP256K1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i, final int i9) {
        final int[] iArr = new int[i9 * 16];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            ECPoint eCPoint = eCPointArr[i + i11];
            Nat256.copy(((SecP256K1FieldElement) eCPoint.getRawXCoord()).f25255x, 0, iArr, i10);
            Nat256.copy(((SecP256K1FieldElement) eCPoint.getRawYCoord()).f25255x, 0, iArr, i10 + 8);
            i10 += 16;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP256K1Curve.1
            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return SecP256K1Curve.this.createRawPoint(new SecP256K1FieldElement(iArr2), new SecP256K1FieldElement(iArr3), SecP256K1Curve.SECP256K1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i9;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i12) {
                int[] create = Nat256.create();
                int[] create2 = Nat256.create();
                int i13 = 0;
                for (int i14 = 0; i14 < i9; i14++) {
                    int i15 = ((i14 ^ i12) - 1) >> 31;
                    for (int i16 = 0; i16 < 8; i16++) {
                        int i17 = create[i16];
                        int[] iArr2 = iArr;
                        create[i16] = i17 ^ (iArr2[i13 + i16] & i15);
                        create2[i16] = create2[i16] ^ (iArr2[(i13 + 8) + i16] & i15);
                    }
                    i13 += 16;
                }
                return createPoint(create, create2);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i12) {
                int[] create = Nat256.create();
                int[] create2 = Nat256.create();
                int i13 = i12 * 16;
                for (int i14 = 0; i14 < 8; i14++) {
                    int[] iArr2 = iArr;
                    create[i14] = iArr2[i13 + i14];
                    create2[i14] = iArr2[8 + i13 + i14];
                }
                return createPoint(create, create2);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP256K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP256K1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f25251q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f25251q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] create = Nat256.create();
        SecP256K1Field.random(secureRandom, create);
        return new SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] create = Nat256.create();
        SecP256K1Field.randomMult(secureRandom, create);
        return new SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP256K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
