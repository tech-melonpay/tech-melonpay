package org.bouncycastle.tls.crypto;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class DHGroup {

    /* renamed from: g, reason: collision with root package name */
    private final BigInteger f25484g;

    /* renamed from: l, reason: collision with root package name */
    private final int f25485l;

    /* renamed from: p, reason: collision with root package name */
    private final BigInteger f25486p;

    /* renamed from: q, reason: collision with root package name */
    private final BigInteger f25487q;

    public DHGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this.f25486p = bigInteger;
        this.f25484g = bigInteger3;
        this.f25487q = bigInteger2;
        this.f25485l = i;
    }

    public BigInteger getG() {
        return this.f25484g;
    }

    public int getL() {
        return this.f25485l;
    }

    public BigInteger getP() {
        return this.f25486p;
    }

    public BigInteger getQ() {
        return this.f25487q;
    }
}
