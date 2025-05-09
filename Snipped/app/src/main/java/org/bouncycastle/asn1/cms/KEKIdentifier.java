package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: classes2.dex */
public class KEKIdentifier extends ASN1Object {
    private ASN1GeneralizedTime date;
    private ASN1OctetString keyIdentifier;
    private OtherKeyAttribute other;

    private KEKIdentifier(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        this.keyIdentifier = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        int size = aSN1Sequence.size();
        if (size != 1) {
            if (size == 2) {
                boolean z10 = aSN1Sequence.getObjectAt(1) instanceof ASN1GeneralizedTime;
                objectAt = aSN1Sequence.getObjectAt(1);
                if (z10) {
                    this.date = (ASN1GeneralizedTime) objectAt;
                    return;
                }
            } else {
                if (size != 3) {
                    throw new IllegalArgumentException("Invalid KEKIdentifier");
                }
                this.date = (ASN1GeneralizedTime) aSN1Sequence.getObjectAt(1);
                objectAt = aSN1Sequence.getObjectAt(2);
            }
            this.other = OtherKeyAttribute.getInstance(objectAt);
        }
    }

    public static KEKIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof KEKIdentifier)) {
            return (KEKIdentifier) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new KEKIdentifier((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.e(obj, "Invalid KEKIdentifier: "));
    }

    public ASN1GeneralizedTime getDate() {
        return this.date;
    }

    public ASN1OctetString getKeyIdentifier() {
        return this.keyIdentifier;
    }

    public OtherKeyAttribute getOther() {
        return this.other;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.keyIdentifier);
        ASN1GeneralizedTime aSN1GeneralizedTime = this.date;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(aSN1GeneralizedTime);
        }
        OtherKeyAttribute otherKeyAttribute = this.other;
        if (otherKeyAttribute != null) {
            aSN1EncodableVector.add(otherKeyAttribute);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public KEKIdentifier(byte[] bArr, ASN1GeneralizedTime aSN1GeneralizedTime, OtherKeyAttribute otherKeyAttribute) {
        this.keyIdentifier = new DEROctetString(bArr);
        this.date = aSN1GeneralizedTime;
        this.other = otherKeyAttribute;
    }

    public static KEKIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
