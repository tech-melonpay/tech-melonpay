package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes2.dex */
public class SRP6VerifierGenerator {

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f24810N;
    protected Digest digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f24811g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f24811g.modPow(SRP6Util.calculateX(this.digest, this.f24810N, bArr, bArr2, bArr3), this.f24810N);
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f24810N = bigInteger;
        this.f24811g = bigInteger2;
        this.digest = digest;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.f24810N = sRP6GroupParameters.getN();
        this.f24811g = sRP6GroupParameters.getG();
        this.digest = digest;
    }
}
