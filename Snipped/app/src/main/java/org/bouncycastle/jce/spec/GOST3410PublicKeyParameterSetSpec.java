package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f25180a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f25181p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f25182q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f25181p = bigInteger;
        this.f25182q = bigInteger2;
        this.f25180a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410PublicKeyParameterSetSpec)) {
            return false;
        }
        GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
        return this.f25180a.equals(gOST3410PublicKeyParameterSetSpec.f25180a) && this.f25181p.equals(gOST3410PublicKeyParameterSetSpec.f25181p) && this.f25182q.equals(gOST3410PublicKeyParameterSetSpec.f25182q);
    }

    public BigInteger getA() {
        return this.f25180a;
    }

    public BigInteger getP() {
        return this.f25181p;
    }

    public BigInteger getQ() {
        return this.f25182q;
    }

    public int hashCode() {
        return (this.f25180a.hashCode() ^ this.f25181p.hashCode()) ^ this.f25182q.hashCode();
    }
}
