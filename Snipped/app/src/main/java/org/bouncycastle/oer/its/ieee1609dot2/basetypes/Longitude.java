package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: classes3.dex */
public class Longitude extends OneEightyDegreeInt {
    public Longitude(long j10) {
        super(j10);
    }

    public static Longitude getInstance(Object obj) {
        if (obj instanceof Longitude) {
            return (Longitude) obj;
        }
        if (obj != null) {
            return new Longitude(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public Longitude(BigInteger bigInteger) {
        super(bigInteger);
    }

    private Longitude(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
