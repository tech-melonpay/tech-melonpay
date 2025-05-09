package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class DLApplicationSpecific extends ASN1ApplicationSpecific {
    public DLApplicationSpecific(int i, ASN1Encodable aSN1Encodable) {
        this(true, i, aSN1Encodable);
    }

    public DLApplicationSpecific(int i, ASN1EncodableVector aSN1EncodableVector) {
        super(new DLTaggedObject(false, 64, i, (ASN1Encodable) DLFactory.createSequence(aSN1EncodableVector)));
    }

    public DLApplicationSpecific(int i, byte[] bArr) {
        super(new DLTaggedObject(false, 64, i, (ASN1Encodable) new DEROctetString(Arrays.clone(bArr))));
    }

    public DLApplicationSpecific(ASN1TaggedObject aSN1TaggedObject) {
        super(aSN1TaggedObject);
    }

    public DLApplicationSpecific(boolean z10, int i, ASN1Encodable aSN1Encodable) {
        super(new DLTaggedObject(z10, 64, i, aSN1Encodable));
    }

    @Override // org.bouncycastle.asn1.ASN1ApplicationSpecific, org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }
}
