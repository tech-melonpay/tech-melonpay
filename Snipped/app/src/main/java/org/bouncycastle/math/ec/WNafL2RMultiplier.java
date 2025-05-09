package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.Integers;

/* loaded from: classes.dex */
public class WNafL2RMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint eCPoint2;
        WNafPreCompInfo precompute = WNafUtil.precompute(eCPoint, WNafUtil.getWindowSize(bigInteger.bitLength()), true);
        ECPoint[] preComp = precompute.getPreComp();
        ECPoint[] preCompNeg = precompute.getPreCompNeg();
        int width = precompute.getWidth();
        int[] generateCompactWindowNaf = WNafUtil.generateCompactWindowNaf(width, bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int length = generateCompactWindowNaf.length;
        if (length > 1) {
            length--;
            int i = generateCompactWindowNaf[length];
            int i9 = i >> 16;
            int i10 = i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            int abs = Math.abs(i9);
            ECPoint[] eCPointArr = i9 < 0 ? preCompNeg : preComp;
            if ((abs << 2) < (1 << width)) {
                int numberOfLeadingZeros = Integers.numberOfLeadingZeros(abs);
                int i11 = width - (32 - numberOfLeadingZeros);
                eCPoint2 = eCPointArr[((1 << (width - 1)) - 1) >>> 1].add(eCPointArr[(((abs ^ (1 << (31 - numberOfLeadingZeros))) << i11) + 1) >>> 1]);
                i10 -= i11;
            } else {
                eCPoint2 = eCPointArr[abs >>> 1];
            }
            infinity = eCPoint2.timesPow2(i10);
        }
        while (length > 0) {
            length--;
            int i12 = generateCompactWindowNaf[length];
            int i13 = i12 >> 16;
            infinity = infinity.twicePlus((i13 < 0 ? preCompNeg : preComp)[Math.abs(i13) >>> 1]).timesPow2(i12 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        }
        return infinity;
    }
}
