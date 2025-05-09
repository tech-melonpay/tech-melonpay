package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes2.dex */
public class SRP6Client {

    /* renamed from: A, reason: collision with root package name */
    protected BigInteger f24792A;

    /* renamed from: B, reason: collision with root package name */
    protected BigInteger f24793B;
    protected BigInteger Key;

    /* renamed from: M1, reason: collision with root package name */
    protected BigInteger f24794M1;

    /* renamed from: M2, reason: collision with root package name */
    protected BigInteger f24795M2;

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f24796N;
    protected BigInteger S;

    /* renamed from: a, reason: collision with root package name */
    protected BigInteger f24797a;
    protected Digest digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f24798g;
    protected SecureRandom random;

    /* renamed from: u, reason: collision with root package name */
    protected BigInteger f24799u;

    /* renamed from: x, reason: collision with root package name */
    protected BigInteger f24800x;

    private BigInteger calculateS() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f24796N, this.f24798g);
        return this.f24793B.subtract(this.f24798g.modPow(this.f24800x, this.f24796N).multiply(calculateK).mod(this.f24796N)).mod(this.f24796N).modPow(this.f24799u.multiply(this.f24800x).add(this.f24797a), this.f24796N);
    }

    public BigInteger calculateClientEvidenceMessage() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f24792A;
        if (bigInteger3 == null || (bigInteger = this.f24793B) == null || (bigInteger2 = this.S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger calculateM1 = SRP6Util.calculateM1(this.digest, this.f24796N, bigInteger3, bigInteger, bigInteger2);
        this.f24794M1 = calculateM1;
        return calculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f24796N, bigInteger);
        this.f24793B = validatePublicValue;
        this.f24799u = SRP6Util.calculateU(this.digest, this.f24796N, this.f24792A, validatePublicValue);
        BigInteger calculateS = calculateS();
        this.S = calculateS;
        return calculateS;
    }

    public BigInteger calculateSessionKey() {
        BigInteger bigInteger = this.S;
        if (bigInteger == null || this.f24794M1 == null || this.f24795M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f24796N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f24800x = SRP6Util.calculateX(this.digest, this.f24796N, bArr, bArr2, bArr3);
        BigInteger selectPrivateValue = selectPrivateValue();
        this.f24797a = selectPrivateValue;
        BigInteger modPow = this.f24798g.modPow(selectPrivateValue, this.f24796N);
        this.f24792A = modPow;
        return modPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f24796N = bigInteger;
        this.f24798g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f24796N, this.f24798g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f24792A;
        if (bigInteger4 == null || (bigInteger2 = this.f24794M1) == null || (bigInteger3 = this.S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!SRP6Util.calculateM2(this.digest, this.f24796N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f24795M2 = bigInteger;
        return true;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }
}
