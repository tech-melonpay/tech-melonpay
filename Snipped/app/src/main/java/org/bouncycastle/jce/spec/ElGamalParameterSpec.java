package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes2.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f25172g;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f25173p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f25173p = bigInteger;
        this.f25172g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f25172g;
    }

    public BigInteger getP() {
        return this.f25173p;
    }
}
