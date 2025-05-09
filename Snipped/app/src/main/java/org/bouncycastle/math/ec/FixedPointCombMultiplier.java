package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;

/* loaded from: classes.dex */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        if (bigInteger.bitLength() > FixedPointUtil.getCombSize(curve)) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        FixedPointPreCompInfo precompute = FixedPointUtil.precompute(eCPoint);
        ECLookupTable lookupTable = precompute.getLookupTable();
        int width = precompute.getWidth();
        int i = ((r1 + width) - 1) / width;
        ECPoint infinity = curve.getInfinity();
        int i9 = width * i;
        int[] fromBigInteger = Nat.fromBigInteger(i9, bigInteger);
        int i10 = i9 - 1;
        for (int i11 = 0; i11 < i; i11++) {
            int i12 = 0;
            for (int i13 = i10 - i11; i13 >= 0; i13 -= i) {
                int i14 = fromBigInteger[i13 >>> 5] >>> (i13 & 31);
                i12 = ((i12 ^ (i14 >>> 1)) << 1) ^ i14;
            }
            infinity = infinity.twicePlus(lookupTable.lookup(i12));
        }
        return infinity.add(precompute.getOffset());
    }
}
