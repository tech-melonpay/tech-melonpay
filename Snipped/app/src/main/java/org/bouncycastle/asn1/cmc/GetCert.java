package org.bouncycastle.asn1.cmc;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

/* loaded from: classes2.dex */
public class GetCert extends ASN1Object {
    private final GeneralName issuerName;
    private final BigInteger serialNumber;

    private GetCert(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.issuerName = GeneralName.getInstance(aSN1Sequence.getObjectAt(0));
        this.serialNumber = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
    }

    public static GetCert getInstance(Object obj) {
        if (obj instanceof GetCert) {
            return (GetCert) obj;
        }
        if (obj != null) {
            return new GetCert(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralName getIssuerName() {
        return this.issuerName;
    }

    public BigInteger getSerialNumber() {
        return this.serialNumber;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.issuerName);
        aSN1EncodableVector.add(new ASN1Integer(this.serialNumber));
        return new DERSequence(aSN1EncodableVector);
    }

    public GetCert(GeneralName generalName, BigInteger bigInteger) {
        this.issuerName = generalName;
        this.serialNumber = bigInteger;
    }
}
