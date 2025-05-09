package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes2.dex */
public class EnvelopedData extends ASN1Object {
    private EncryptedContentInfo encryptedContentInfo;
    private OriginatorInfo originatorInfo;
    private ASN1Set recipientInfos;
    private ASN1Set unprotectedAttrs;
    private ASN1Integer version;

    private EnvelopedData(ASN1Sequence aSN1Sequence) {
        this.version = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
        int i = 2;
        if (objectAt instanceof ASN1TaggedObject) {
            this.originatorInfo = OriginatorInfo.getInstance((ASN1TaggedObject) objectAt, false);
            objectAt = aSN1Sequence.getObjectAt(2);
            i = 3;
        }
        this.recipientInfos = ASN1Set.getInstance(objectAt);
        int i9 = i + 1;
        this.encryptedContentInfo = EncryptedContentInfo.getInstance(aSN1Sequence.getObjectAt(i));
        if (aSN1Sequence.size() > i9) {
            this.unprotectedAttrs = ASN1Set.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(i9), false);
        }
    }

    public static int calculateVersion(OriginatorInfo originatorInfo, ASN1Set aSN1Set, ASN1Set aSN1Set2) {
        if (originatorInfo != null || aSN1Set2 != null) {
            return 2;
        }
        Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            if (!RecipientInfo.getInstance(objects.nextElement()).getVersion().hasValue(0)) {
                return 2;
            }
        }
        return 0;
    }

    public static EnvelopedData getInstance(Object obj) {
        if (obj instanceof EnvelopedData) {
            return (EnvelopedData) obj;
        }
        if (obj != null) {
            return new EnvelopedData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EncryptedContentInfo getEncryptedContentInfo() {
        return this.encryptedContentInfo;
    }

    public OriginatorInfo getOriginatorInfo() {
        return this.originatorInfo;
    }

    public ASN1Set getRecipientInfos() {
        return this.recipientInfos;
    }

    public ASN1Set getUnprotectedAttrs() {
        return this.unprotectedAttrs;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.version);
        OriginatorInfo originatorInfo = this.originatorInfo;
        if (originatorInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) originatorInfo));
        }
        aSN1EncodableVector.add(this.recipientInfos);
        aSN1EncodableVector.add(this.encryptedContentInfo);
        ASN1Set aSN1Set = this.unprotectedAttrs;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) aSN1Set));
        }
        return new BERSequence(aSN1EncodableVector);
    }

    public EnvelopedData(OriginatorInfo originatorInfo, ASN1Set aSN1Set, EncryptedContentInfo encryptedContentInfo, ASN1Set aSN1Set2) {
        this.version = new ASN1Integer(calculateVersion(originatorInfo, aSN1Set, aSN1Set2));
        this.originatorInfo = originatorInfo;
        this.recipientInfos = aSN1Set;
        this.encryptedContentInfo = encryptedContentInfo;
        this.unprotectedAttrs = aSN1Set2;
    }

    public static EnvelopedData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public EnvelopedData(OriginatorInfo originatorInfo, ASN1Set aSN1Set, EncryptedContentInfo encryptedContentInfo, Attributes attributes) {
        this.version = new ASN1Integer(calculateVersion(originatorInfo, aSN1Set, ASN1Set.getInstance(attributes)));
        this.originatorInfo = originatorInfo;
        this.recipientInfos = aSN1Set;
        this.encryptedContentInfo = encryptedContentInfo;
        this.unprotectedAttrs = ASN1Set.getInstance(attributes);
    }
}
