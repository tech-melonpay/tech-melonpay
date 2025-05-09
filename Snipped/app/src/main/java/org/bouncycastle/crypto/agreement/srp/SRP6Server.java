package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes2.dex */
public class SRP6Server {

    /* renamed from: A, reason: collision with root package name */
    protected BigInteger f24801A;

    /* renamed from: B, reason: collision with root package name */
    protected BigInteger f24802B;
    protected BigInteger Key;

    /* renamed from: M1, reason: collision with root package name */
    protected BigInteger f24803M1;

    /* renamed from: M2, reason: collision with root package name */
    protected BigInteger f24804M2;

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f24805N;
    protected BigInteger S;

    /* renamed from: b, reason: collision with root package name */
    protected BigInteger f24806b;
    protected Digest digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f24807g;
    protected SecureRandom random;

    /* renamed from: u, reason: collision with root package name */
    protected BigInteger f24808u;

    /* renamed from: v, reason: collision with root package name */
    protected BigInteger f24809v;

    private BigInteger calculateS() {
        return this.f24809v.modPow(this.f24808u, this.f24805N).multiply(this.f24801A).mod(this.f24805N).modPow(this.f24806b, this.f24805N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f24805N, bigInteger);
        this.f24801A = validatePublicValue;
        this.f24808u = SRP6Util.calculateU(this.digest, this.f24805N, validatePublicValue, this.f24802B);
        BigInteger calculateS = calculateS();
        this.S = calculateS;
        return calculateS;
    }

    public BigInteger calculateServerEvidenceMessage() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f24801A;
        if (bigInteger3 == null || (bigInteger = this.f24803M1) == null || (bigInteger2 = this.S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger calculateM2 = SRP6Util.calculateM2(this.digest, this.f24805N, bigInteger3, bigInteger, bigInteger2);
        this.f24804M2 = calculateM2;
        return calculateM2;
    }

    public BigInteger calculateSessionKey() {
        BigInteger bigInteger = this.S;
        if (bigInteger == null || this.f24803M1 == null || this.f24804M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f24805N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f24805N, this.f24807g);
        this.f24806b = selectPrivateValue();
        BigInteger mod = calculateK.multiply(this.f24809v).mod(this.f24805N).add(this.f24807g.modPow(this.f24806b, this.f24805N)).mod(this.f24805N);
        this.f24802B = mod;
        return mod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f24805N = bigInteger;
        this.f24807g = bigInteger2;
        this.f24809v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f24805N, this.f24807g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f24801A;
        if (bigInteger4 == null || (bigInteger2 = this.f24802B) == null || (bigInteger3 = this.S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!SRP6Util.calculateM1(this.digest, this.f24805N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f24803M1 = bigInteger;
        return true;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }
}
