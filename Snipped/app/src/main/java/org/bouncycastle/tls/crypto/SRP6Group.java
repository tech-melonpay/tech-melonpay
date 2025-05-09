package org.bouncycastle.tls.crypto;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class SRP6Group {

    /* renamed from: N, reason: collision with root package name */
    private BigInteger f25488N;

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f25489g;

    public SRP6Group(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f25488N = bigInteger;
        this.f25489g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f25489g;
    }

    public BigInteger getN() {
        return this.f25488N;
    }
}
