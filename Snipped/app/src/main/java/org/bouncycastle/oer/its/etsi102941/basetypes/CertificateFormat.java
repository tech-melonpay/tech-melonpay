package org.bouncycastle.oer.its.etsi102941.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
public class CertificateFormat extends ASN1Object {
    private final int format;

    public CertificateFormat(int i) {
        this.format = i;
    }

    public static CertificateFormat getInstance(Object obj) {
        if (obj instanceof CertificateFormat) {
            return (CertificateFormat) obj;
        }
        if (obj != null) {
            return new CertificateFormat(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public int getFormat() {
        return this.format;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.format);
    }

    public CertificateFormat(BigInteger bigInteger) {
        this.format = BigIntegers.intValueExact(bigInteger);
    }

    private CertificateFormat(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
