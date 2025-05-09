package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.crmf.CertTemplate;

/* loaded from: classes2.dex */
public class ModCertTemplate extends ASN1Object {
    private final BodyPartList certReferences;
    private final CertTemplate certTemplate;
    private final BodyPartPath pkiDataReference;
    private final boolean replace;

    private ModCertTemplate(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        if (aSN1Sequence.size() != 4 && aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.pkiDataReference = BodyPartPath.getInstance(aSN1Sequence.getObjectAt(0));
        this.certReferences = BodyPartList.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() == 4) {
            this.replace = ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(2)).isTrue();
            objectAt = aSN1Sequence.getObjectAt(3);
        } else {
            this.replace = true;
            objectAt = aSN1Sequence.getObjectAt(2);
        }
        this.certTemplate = CertTemplate.getInstance(objectAt);
    }

    public static ModCertTemplate getInstance(Object obj) {
        if (obj instanceof ModCertTemplate) {
            return (ModCertTemplate) obj;
        }
        if (obj != null) {
            return new ModCertTemplate(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartList getCertReferences() {
        return this.certReferences;
    }

    public CertTemplate getCertTemplate() {
        return this.certTemplate;
    }

    public BodyPartPath getPkiDataReference() {
        return this.pkiDataReference;
    }

    public boolean isReplacingFields() {
        return this.replace;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.pkiDataReference);
        aSN1EncodableVector.add(this.certReferences);
        boolean z10 = this.replace;
        if (!z10) {
            aSN1EncodableVector.add(ASN1Boolean.getInstance(z10));
        }
        aSN1EncodableVector.add(this.certTemplate);
        return new DERSequence(aSN1EncodableVector);
    }

    public ModCertTemplate(BodyPartPath bodyPartPath, BodyPartList bodyPartList, boolean z10, CertTemplate certTemplate) {
        this.pkiDataReference = bodyPartPath;
        this.certReferences = bodyPartList;
        this.replace = z10;
        this.certTemplate = certTemplate;
    }
}
