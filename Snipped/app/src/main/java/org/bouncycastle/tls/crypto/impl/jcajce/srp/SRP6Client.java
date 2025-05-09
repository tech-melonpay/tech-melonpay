package org.bouncycastle.tls.crypto.impl.jcajce.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.tls.crypto.SRP6Group;
import org.bouncycastle.tls.crypto.TlsHash;

/* loaded from: classes3.dex */
public class SRP6Client {

    /* renamed from: A, reason: collision with root package name */
    protected BigInteger f25491A;

    /* renamed from: B, reason: collision with root package name */
    protected BigInteger f25492B;
    protected BigInteger Key;

    /* renamed from: M1, reason: collision with root package name */
    protected BigInteger f25493M1;

    /* renamed from: M2, reason: collision with root package name */
    protected BigInteger f25494M2;

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f25495N;
    protected BigInteger S;

    /* renamed from: a, reason: collision with root package name */
    protected BigInteger f25496a;
    protected TlsHash digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f25497g;
    protected SecureRandom random;

    /* renamed from: u, reason: collision with root package name */
    protected BigInteger f25498u;

    /* renamed from: x, reason: collision with root package name */
    protected BigInteger f25499x;

    private BigInteger calculateS() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f25495N, this.f25497g);
        return this.f25492B.subtract(this.f25497g.modPow(this.f25499x, this.f25495N).multiply(calculateK).mod(this.f25495N)).mod(this.f25495N).modPow(this.f25498u.multiply(this.f25499x).add(this.f25496a), this.f25495N);
    }

    public BigInteger calculateClientEvidenceMessage() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f25491A;
        if (bigInteger3 == null || (bigInteger = this.f25492B) == null || (bigInteger2 = this.S) == null) {
            throw new IllegalStateException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger calculateM1 = SRP6Util.calculateM1(this.digest, this.f25495N, bigInteger3, bigInteger, bigInteger2);
        this.f25493M1 = calculateM1;
        return calculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f25495N, bigInteger);
        this.f25492B = validatePublicValue;
        this.f25498u = SRP6Util.calculateU(this.digest, this.f25495N, this.f25491A, validatePublicValue);
        BigInteger calculateS = calculateS();
        this.S = calculateS;
        return calculateS;
    }

    public BigInteger calculateSessionKey() {
        BigInteger bigInteger = this.S;
        if (bigInteger == null || this.f25493M1 == null || this.f25494M2 == null) {
            throw new IllegalStateException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f25495N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f25499x = SRP6Util.calculateX(this.digest, this.f25495N, bArr, bArr2, bArr3);
        BigInteger selectPrivateValue = selectPrivateValue();
        this.f25496a = selectPrivateValue;
        BigInteger modPow = this.f25497g.modPow(selectPrivateValue, this.f25495N);
        this.f25491A = modPow;
        return modPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, TlsHash tlsHash, SecureRandom secureRandom) {
        this.f25495N = bigInteger;
        this.f25497g = bigInteger2;
        this.digest = tlsHash;
        this.random = secureRandom;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.f25495N, this.f25497g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f25491A;
        if (bigInteger4 == null || (bigInteger2 = this.f25493M1) == null || (bigInteger3 = this.S) == null) {
            throw new IllegalStateException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!SRP6Util.calculateM2(this.digest, this.f25495N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f25494M2 = bigInteger;
        return true;
    }

    public void init(SRP6Group sRP6Group, TlsHash tlsHash, SecureRandom secureRandom) {
        init(sRP6Group.getN(), sRP6Group.getG(), tlsHash, secureRandom);
    }
}
