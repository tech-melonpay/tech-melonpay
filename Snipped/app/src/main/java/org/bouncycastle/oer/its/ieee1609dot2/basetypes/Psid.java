package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: classes3.dex */
public class Psid extends ASN1Object {
    private final BigInteger psid;

    public Psid(long j10) {
        this(BigInteger.valueOf(j10));
    }

    public static Psid getInstance(Object obj) {
        if (obj instanceof Psid) {
            return (Psid) obj;
        }
        if (obj != null) {
            return new Psid(ASN1Integer.getInstance(obj).getValue());
        }
        return null;
    }

    public BigInteger getPsid() {
        return this.psid;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.psid);
    }

    public Psid(BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            throw new IllegalStateException("psid must be greater than zero");
        }
        this.psid = bigInteger;
    }
}
