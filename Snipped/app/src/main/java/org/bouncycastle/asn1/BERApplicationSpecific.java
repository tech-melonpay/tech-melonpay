package org.bouncycastle.asn1;

/* loaded from: classes2.dex */
public class BERApplicationSpecific extends ASN1ApplicationSpecific {
    public BERApplicationSpecific(int i, ASN1Encodable aSN1Encodable) {
        this(true, i, aSN1Encodable);
    }

    public BERApplicationSpecific(int i, ASN1EncodableVector aSN1EncodableVector) {
        super(new BERTaggedObject(false, 64, i, (ASN1Encodable) BERFactory.createSequence(aSN1EncodableVector)));
    }

    public BERApplicationSpecific(ASN1TaggedObject aSN1TaggedObject) {
        super(aSN1TaggedObject);
    }

    public BERApplicationSpecific(boolean z10, int i, ASN1Encodable aSN1Encodable) {
        super(new BERTaggedObject(z10, 64, i, aSN1Encodable));
    }
}
