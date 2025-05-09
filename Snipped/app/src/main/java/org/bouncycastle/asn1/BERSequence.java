package org.bouncycastle.asn1;

/* loaded from: classes2.dex */
public class BERSequence extends ASN1Sequence {
    public BERSequence() {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        aSN1OutputStream.writeEncodingIL(z10, 48, this.elements);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) {
        int i = z10 ? 4 : 3;
        int length = this.elements.length;
        for (int i9 = 0; i9 < length; i9++) {
            i += this.elements[i9].toASN1Primitive().encodedLength(true);
        }
        return i;
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1BitString toASN1BitString() {
        return new BERBitString(getConstructedBitStrings());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1External toASN1External() {
        return ((ASN1Sequence) toDLObject()).toASN1External();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1OctetString toASN1OctetString() {
        return new BEROctetString(getConstructedOctetStrings());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1Set toASN1Set() {
        return new BERSet(false, toArrayInternal());
    }

    public BERSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
    }

    public BERSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
    }
}
