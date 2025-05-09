package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class ElGamalParameters implements CipherParameters {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f25097g;

    /* renamed from: l, reason: collision with root package name */
    private int f25098l;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f25099p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f25099p) && elGamalParameters.getG().equals(this.f25097g) && elGamalParameters.getL() == this.f25098l;
    }

    public BigInteger getG() {
        return this.f25097g;
    }

    public int getL() {
        return this.f25098l;
    }

    public BigInteger getP() {
        return this.f25099p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f25098l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f25097g = bigInteger2;
        this.f25099p = bigInteger;
        this.f25098l = i;
    }
}
