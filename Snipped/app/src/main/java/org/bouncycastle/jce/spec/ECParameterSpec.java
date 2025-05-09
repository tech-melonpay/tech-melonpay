package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes2.dex */
public class ECParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: G, reason: collision with root package name */
    private ECPoint f25167G;
    private ECCurve curve;

    /* renamed from: h, reason: collision with root package name */
    private BigInteger f25168h;

    /* renamed from: n, reason: collision with root package name */
    private BigInteger f25169n;
    private byte[] seed;

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this.curve = eCCurve;
        this.f25167G = eCPoint.normalize();
        this.f25169n = bigInteger;
        this.f25168h = BigInteger.valueOf(1L);
        this.seed = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ECParameterSpec)) {
            return false;
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
        return getCurve().equals(eCParameterSpec.getCurve()) && getG().equals(eCParameterSpec.getG());
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f25167G;
    }

    public BigInteger getH() {
        return this.f25168h;
    }

    public BigInteger getN() {
        return this.f25169n;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return getCurve().hashCode() ^ getG().hashCode();
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this.curve = eCCurve;
        this.f25167G = eCPoint.normalize();
        this.f25169n = bigInteger;
        this.f25168h = bigInteger2;
        this.seed = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f25167G = eCPoint.normalize();
        this.f25169n = bigInteger;
        this.f25168h = bigInteger2;
        this.seed = bArr;
    }
}
