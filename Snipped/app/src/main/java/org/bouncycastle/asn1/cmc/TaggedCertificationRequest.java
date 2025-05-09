package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes2.dex */
public class TaggedCertificationRequest extends ASN1Object {
    private final BodyPartID bodyPartID;
    private final CertificationRequest certificationRequest;

    private TaggedCertificationRequest(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.bodyPartID = BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.certificationRequest = CertificationRequest.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static TaggedCertificationRequest getInstance(Object obj) {
        if (obj instanceof TaggedCertificationRequest) {
            return (TaggedCertificationRequest) obj;
        }
        if (obj != null) {
            return new TaggedCertificationRequest(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.bodyPartID);
        aSN1EncodableVector.add(this.certificationRequest);
        return new DERSequence(aSN1EncodableVector);
    }

    public TaggedCertificationRequest(BodyPartID bodyPartID, CertificationRequest certificationRequest) {
        this.bodyPartID = bodyPartID;
        this.certificationRequest = certificationRequest;
    }

    public static TaggedCertificationRequest getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
