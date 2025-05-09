package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes2.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f25183a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f25184p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f25185q;

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f25186y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f25186y = bigInteger;
        this.f25184p = bigInteger2;
        this.f25185q = bigInteger3;
        this.f25183a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f25183a;
    }

    public BigInteger getP() {
        return this.f25184p;
    }

    public BigInteger getQ() {
        return this.f25185q;
    }

    public BigInteger getY() {
        return this.f25186y;
    }
}
