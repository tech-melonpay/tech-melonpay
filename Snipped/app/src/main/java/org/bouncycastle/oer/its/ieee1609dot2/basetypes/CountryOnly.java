package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: classes3.dex */
public class CountryOnly extends UINT16 implements RegionInterface {
    public CountryOnly(int i) {
        super(i);
    }

    public static CountryOnly getInstance(Object obj) {
        if (obj instanceof CountryOnly) {
            return (CountryOnly) obj;
        }
        if (obj != null) {
            return new CountryOnly(ASN1Integer.getInstance(obj).getValue());
        }
        return null;
    }

    public CountryOnly(BigInteger bigInteger) {
        super(bigInteger);
    }
}
