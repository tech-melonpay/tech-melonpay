package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f25102a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f25103p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f25104q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f25103p = bigInteger;
        this.f25104q = bigInteger2;
        this.f25102a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f25103p) && gOST3410Parameters.getQ().equals(this.f25104q) && gOST3410Parameters.getA().equals(this.f25102a);
    }

    public BigInteger getA() {
        return this.f25102a;
    }

    public BigInteger getP() {
        return this.f25103p;
    }

    public BigInteger getQ() {
        return this.f25104q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f25103p.hashCode() ^ this.f25104q.hashCode()) ^ this.f25102a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f25102a = bigInteger3;
        this.f25103p = bigInteger;
        this.f25104q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}
