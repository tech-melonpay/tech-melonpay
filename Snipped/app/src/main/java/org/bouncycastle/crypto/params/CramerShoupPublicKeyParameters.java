package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: c, reason: collision with root package name */
    private BigInteger f25074c;

    /* renamed from: d, reason: collision with root package name */
    private BigInteger f25075d;

    /* renamed from: h, reason: collision with root package name */
    private BigInteger f25076h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f25074c = bigInteger;
        this.f25075d = bigInteger2;
        this.f25076h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f25074c) && cramerShoupPublicKeyParameters.getD().equals(this.f25075d) && cramerShoupPublicKeyParameters.getH().equals(this.f25076h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f25074c;
    }

    public BigInteger getD() {
        return this.f25075d;
    }

    public BigInteger getH() {
        return this.f25076h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f25074c.hashCode() ^ this.f25075d.hashCode()) ^ this.f25076h.hashCode()) ^ super.hashCode();
    }
}
