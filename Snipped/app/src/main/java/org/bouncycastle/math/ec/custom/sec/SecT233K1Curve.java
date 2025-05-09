package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes.dex */
public class SecT233K1Curve extends ECCurve.AbstractF2m {
    private static final ECFieldElement[] SECT233K1_AFFINE_ZS = {new SecT233FieldElement(ECConstants.ONE)};
    private static final int SECT233K1_DEFAULT_COORDS = 6;
    protected SecT233K1Point infinity;

    public SecT233K1Curve() {
        super(233, 74, 0, 0);
        this.infinity = new SecT233K1Point(this, null, null);
        this.f25187a = fromBigInteger(BigInteger.valueOf(0L));
        this.f25188b = fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decodeStrict("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT233K1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i, final int i9) {
        final long[] jArr = new long[i9 * 8];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            ECPoint eCPoint = eCPointArr[i + i11];
            Nat256.copy64(((SecT233FieldElement) eCPoint.getRawXCoord()).f25275x, 0, jArr, i10);
            Nat256.copy64(((SecT233FieldElement) eCPoint.getRawYCoord()).f25275x, 0, jArr, i10 + 4);
            i10 += 8;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecT233K1Curve.1
            private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                return SecT233K1Curve.this.createRawPoint(new SecT233FieldElement(jArr2), new SecT233FieldElement(jArr3), SecT233K1Curve.SECT233K1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i9;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i12) {
                long[] create64 = Nat256.create64();
                long[] create642 = Nat256.create64();
                int i13 = 0;
                for (int i14 = 0; i14 < i9; i14++) {
                    long j10 = ((i14 ^ i12) - 1) >> 31;
                    for (int i15 = 0; i15 < 4; i15++) {
                        long j11 = create64[i15];
                        long[] jArr2 = jArr;
                        create64[i15] = j11 ^ (jArr2[i13 + i15] & j10);
                        create642[i15] = create642[i15] ^ (jArr2[(i13 + 4) + i15] & j10);
                    }
                    i13 += 8;
                }
                return createPoint(create64, create642);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i12) {
                long[] create64 = Nat256.create64();
                long[] create642 = Nat256.create64();
                int i13 = i12 * 8;
                for (int i14 = 0; i14 < 4; i14++) {
                    long[] jArr2 = jArr;
                    create64[i14] = jArr2[i13 + i14];
                    create642[i14] = jArr2[4 + i13 + i14];
                }
                return createPoint(create64, create642);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT233K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT233FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 233;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 74;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 233;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return true;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecT233K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
