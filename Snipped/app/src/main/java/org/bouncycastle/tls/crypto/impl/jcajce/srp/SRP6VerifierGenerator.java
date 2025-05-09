package org.bouncycastle.tls.crypto.impl.jcajce.srp;

import java.math.BigInteger;
import org.bouncycastle.tls.crypto.SRP6Group;
import org.bouncycastle.tls.crypto.TlsHash;

/* loaded from: classes3.dex */
public class SRP6VerifierGenerator {

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f25509N;
    protected TlsHash digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f25510g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f25510g.modPow(SRP6Util.calculateX(this.digest, this.f25509N, bArr, bArr2, bArr3), this.f25509N);
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, TlsHash tlsHash) {
        this.f25509N = bigInteger;
        this.f25510g = bigInteger2;
        this.digest = tlsHash;
    }

    public void init(SRP6Group sRP6Group, TlsHash tlsHash) {
        this.f25509N = sRP6Group.getN();
        this.f25510g = sRP6Group.getG();
        this.digest = tlsHash;
    }
}
