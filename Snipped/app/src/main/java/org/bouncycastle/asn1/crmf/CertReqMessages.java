package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes2.dex */
public class CertReqMessages extends ASN1Object {
    private ASN1Sequence content;

    private CertReqMessages(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }

    public static CertReqMessages getInstance(Object obj) {
        if (obj instanceof CertReqMessages) {
            return (CertReqMessages) obj;
        }
        if (obj != null) {
            return new CertReqMessages(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    public CertReqMsg[] toCertReqMsgArray() {
        int size = this.content.size();
        CertReqMsg[] certReqMsgArr = new CertReqMsg[size];
        for (int i = 0; i != size; i++) {
            certReqMsgArr[i] = CertReqMsg.getInstance(this.content.getObjectAt(i));
        }
        return certReqMsgArr;
    }

    public CertReqMessages(CertReqMsg certReqMsg) {
        this.content = new DERSequence(certReqMsg);
    }

    public CertReqMessages(CertReqMsg[] certReqMsgArr) {
        this.content = new DERSequence(certReqMsgArr);
    }
}
