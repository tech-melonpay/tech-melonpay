package org.bouncycastle.crypto.ec;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes2.dex */
public class ECPair {

    /* renamed from: x, reason: collision with root package name */
    private final ECPoint f24924x;

    /* renamed from: y, reason: collision with root package name */
    private final ECPoint f24925y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f24924x = eCPoint;
        this.f24925y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public ECPoint getX() {
        return this.f24924x;
    }

    public ECPoint getY() {
        return this.f24925y;
    }

    public int hashCode() {
        return (this.f24925y.hashCode() * 37) + this.f24924x.hashCode();
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }
}
