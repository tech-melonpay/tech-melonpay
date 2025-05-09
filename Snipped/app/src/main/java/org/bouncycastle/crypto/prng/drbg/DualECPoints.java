package org.bouncycastle.crypto.prng.drbg;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes2.dex */
public class DualECPoints {
    private final int cofactor;

    /* renamed from: p, reason: collision with root package name */
    private final ECPoint f25123p;

    /* renamed from: q, reason: collision with root package name */
    private final ECPoint f25124q;
    private final int securityStrength;

    public DualECPoints(int i, ECPoint eCPoint, ECPoint eCPoint2, int i9) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            throw new IllegalArgumentException("points need to be on the same curve");
        }
        this.securityStrength = i;
        this.f25123p = eCPoint;
        this.f25124q = eCPoint2;
        this.cofactor = i9;
    }

    private static int log2(int i) {
        int i9 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i9;
            }
            i9++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f25123p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f25123p;
    }

    public ECPoint getQ() {
        return this.f25124q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f25123p.getCurve().getFieldSize();
    }
}
