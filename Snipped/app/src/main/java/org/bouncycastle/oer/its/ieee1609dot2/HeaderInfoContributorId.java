package org.bouncycastle.oer.its.ieee1609dot2;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: classes3.dex */
public class HeaderInfoContributorId extends ASN1Object {
    private static final BigInteger MAX = BigInteger.valueOf(255);
    private final BigInteger contributorId;

    public HeaderInfoContributorId(long j10) {
        this(BigInteger.valueOf(j10));
    }

    public static HeaderInfoContributorId getInstance(Object obj) {
        if (obj instanceof HeaderInfoContributorId) {
            return (HeaderInfoContributorId) obj;
        }
        if (obj != null) {
            return new HeaderInfoContributorId(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public BigInteger getContributorId() {
        return this.contributorId;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.contributorId);
    }

    public HeaderInfoContributorId(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 || bigInteger.compareTo(MAX) <= 0) {
            this.contributorId = bigInteger;
            return;
        }
        throw new IllegalArgumentException("contributor id " + bigInteger + " is out of range 0..255");
    }

    private HeaderInfoContributorId(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
