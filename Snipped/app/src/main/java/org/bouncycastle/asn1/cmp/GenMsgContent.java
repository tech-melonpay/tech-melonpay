package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes2.dex */
public class GenMsgContent extends ASN1Object {
    private final ASN1Sequence content;

    private GenMsgContent(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }

    public static GenMsgContent getInstance(Object obj) {
        if (obj instanceof GenMsgContent) {
            return (GenMsgContent) obj;
        }
        if (obj != null) {
            return new GenMsgContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    public InfoTypeAndValue[] toInfoTypeAndValueArray() {
        int size = this.content.size();
        InfoTypeAndValue[] infoTypeAndValueArr = new InfoTypeAndValue[size];
        for (int i = 0; i != size; i++) {
            infoTypeAndValueArr[i] = InfoTypeAndValue.getInstance(this.content.getObjectAt(i));
        }
        return infoTypeAndValueArr;
    }

    public GenMsgContent(InfoTypeAndValue infoTypeAndValue) {
        this.content = new DERSequence(infoTypeAndValue);
    }

    public GenMsgContent(InfoTypeAndValue[] infoTypeAndValueArr) {
        this.content = new DERSequence(infoTypeAndValueArr);
    }
}
