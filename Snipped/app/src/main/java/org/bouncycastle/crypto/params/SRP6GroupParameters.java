package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class SRP6GroupParameters {

    /* renamed from: N, reason: collision with root package name */
    private BigInteger f25117N;

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f25118g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f25117N = bigInteger;
        this.f25118g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f25118g;
    }

    public BigInteger getN() {
        return this.f25117N;
    }
}
