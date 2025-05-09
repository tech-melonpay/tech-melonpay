package org.bouncycastle.tls.crypto.impl.jcajce.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.tls.crypto.SRP6Group;
import org.bouncycastle.tls.crypto.TlsHash;

/* loaded from: classes3.dex */
public class SRP6Server {

    /* renamed from: A, reason: collision with root package name */
    protected BigInteger f25500A;

    /* renamed from: B, reason: collision with root package name */
    protected BigInteger f25501B;
    protected BigInteger Key;

    /* renamed from: M1, reason: collision with root package name */
    protected BigInteger f25502M1;

    /* renamed from: M2, reason: collision with root package name */
    protected BigInteger f25503M2;

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f25504N;
    protected BigInteger S;

    /* renamed from: b, reason: collision with root package name */
    protected BigInteger f25505b;
    protected TlsHash digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f25506g;
    protected SecureRandom random;

    /* renamed from: u, reason: collision with root package name */
    protected BigInteger f25507u;

    /* renamed from: v, reason: collision with root package name */
    protected BigInteger f25508v;

    private BigInteger calculateS() {
        return this.f25508v.modPow(this.f25507u, this.f25504N).multiply(this.f25500A).mod(this.f25504N).modPow(this.f25505b, this.f25504N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f25504N, bigInteger);
        this.f25500A = validatePublicValue;
        this.f25507u = SRP6Util.calculateU(this.digest, this.f25504N, validatePublicValue, this.f25501B);
        BigInteger calculateS = calculateS();
        this.S = calculateS;
        return calculateS;
    }

    public BigInteger calculateServerEvidenceMessage() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f25500A;
        if (bigInteger3 == null || (bigInteger = this.f25502M1) == null || (bigInteger2 = this.S) == null) {
            throw new IllegalStateException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger calculateM2 = SRP6Util.calculateM2(this.digest, this.f25504N, bigInteger3, bigInteger, bigInteger2);
        this.f25503M2 = calculateM2;
        return calculateM2;
    }

    public BigInteger calculateSessionKey() {
        BigInteger bigInteger = this.S;
        if (bigInteger == null || this.f25502M1 == null || this.f25503M2 == null) {
            throw new IllegalStateException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f25504N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f25504N, this.f25506g);
        this.f25505b = selectPrivateValue();
        BigInteger mod = calculateK.multiply(this.f25508v).mod(this.f25504N).add(this.f25506g.modPow(this.f25505b, this.f25504N)).mod(this.f25504N);
        this.f25501B = mod;
        return mod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, TlsHash tlsHash, SecureRandom secureRandom) {
        this.f25504N = bigInteger;
        this.f25506g = bigInteger2;
        this.f25508v = bigInteger3;
        this.random = secureRandom;
        this.digest = tlsHash;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.f25504N, this.f25506g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f25500A;
        if (bigInteger4 == null || (bigInteger2 = this.f25501B) == null || (bigInteger3 = this.S) == null) {
            throw new IllegalStateException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!SRP6Util.calculateM1(this.digest, this.f25504N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f25502M1 = bigInteger;
        return true;
    }

    public void init(SRP6Group sRP6Group, BigInteger bigInteger, TlsHash tlsHash, SecureRandom secureRandom) {
        init(sRP6Group.getN(), sRP6Group.getG(), bigInteger, tlsHash, secureRandom);
    }
}
