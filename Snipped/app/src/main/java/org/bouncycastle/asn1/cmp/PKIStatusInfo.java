package org.bouncycastle.asn1.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes2.dex */
public class PKIStatusInfo extends ASN1Object {
    ASN1BitString failInfo;
    ASN1Integer status;
    PKIFreeText statusString;

    private PKIStatusInfo(ASN1Sequence aSN1Sequence) {
        ASN1BitString aSN1BitString;
        this.status = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.statusString = null;
        this.failInfo = null;
        if (aSN1Sequence.size() > 2) {
            this.statusString = PKIFreeText.getInstance(aSN1Sequence.getObjectAt(1));
            aSN1BitString = DERBitString.getInstance((Object) aSN1Sequence.getObjectAt(2));
        } else {
            if (aSN1Sequence.size() <= 1) {
                return;
            }
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
            if (!(objectAt instanceof ASN1BitString)) {
                this.statusString = PKIFreeText.getInstance(objectAt);
                return;
            }
            aSN1BitString = ASN1BitString.getInstance(objectAt);
        }
        this.failInfo = aSN1BitString;
    }

    public static PKIStatusInfo getInstance(Object obj) {
        if (obj instanceof PKIStatusInfo) {
            return (PKIStatusInfo) obj;
        }
        if (obj != null) {
            return new PKIStatusInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1BitString getFailInfo() {
        return this.failInfo;
    }

    public BigInteger getStatus() {
        return this.status.getValue();
    }

    public PKIFreeText getStatusString() {
        return this.statusString;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.status);
        PKIFreeText pKIFreeText = this.statusString;
        if (pKIFreeText != null) {
            aSN1EncodableVector.add(pKIFreeText);
        }
        ASN1BitString aSN1BitString = this.failInfo;
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(aSN1BitString);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public PKIStatusInfo(PKIStatus pKIStatus) {
        this.status = ASN1Integer.getInstance(pKIStatus.toASN1Primitive());
    }

    public static PKIStatusInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public PKIStatusInfo(PKIStatus pKIStatus, PKIFreeText pKIFreeText) {
        this.status = ASN1Integer.getInstance(pKIStatus.toASN1Primitive());
        this.statusString = pKIFreeText;
    }

    public PKIStatusInfo(PKIStatus pKIStatus, PKIFreeText pKIFreeText, PKIFailureInfo pKIFailureInfo) {
        this.status = ASN1Integer.getInstance(pKIStatus.toASN1Primitive());
        this.statusString = pKIFreeText;
        this.failInfo = pKIFailureInfo;
    }
}
