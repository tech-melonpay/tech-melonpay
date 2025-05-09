package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class DSAParameters implements CipherParameters {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f25087g;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f25088p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f25089q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f25087g = bigInteger3;
        this.f25088p = bigInteger;
        this.f25089q = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f25088p) && dSAParameters.getQ().equals(this.f25089q) && dSAParameters.getG().equals(this.f25087g);
    }

    public BigInteger getG() {
        return this.f25087g;
    }

    public BigInteger getP() {
        return this.f25088p;
    }

    public BigInteger getQ() {
        return this.f25089q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f25087g = bigInteger3;
        this.f25088p = bigInteger;
        this.f25089q = bigInteger2;
        this.validation = dSAValidationParameters;
    }
}
