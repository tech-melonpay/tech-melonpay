package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes2.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f25176a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f25177p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f25178q;

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f25179x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f25179x = bigInteger;
        this.f25177p = bigInteger2;
        this.f25178q = bigInteger3;
        this.f25176a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f25176a;
    }

    public BigInteger getP() {
        return this.f25177p;
    }

    public BigInteger getQ() {
        return this.f25178q;
    }

    public BigInteger getX() {
        return this.f25179x;
    }
}
