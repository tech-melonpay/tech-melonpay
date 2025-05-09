package org.bouncycastle.asn1;

/* loaded from: classes2.dex */
public class DLBitString extends ASN1BitString {
    public DLBitString(byte b9, int i) {
        super(b9, i);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        aSN1OutputStream.writeEncodingDL(z10, 3, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) {
        return ASN1OutputStream.getLengthOfEncodingDL(z10, this.contents.length);
    }

    public DLBitString(int i) {
        super(ASN1BitString.getBytes(i), ASN1BitString.getPadBits(i));
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z10, byte b9, byte[] bArr, int i, int i9) {
        aSN1OutputStream.writeEncodingDL(z10, 3, b9, bArr, i, i9);
    }

    public static int encodedLength(boolean z10, int i) {
        return ASN1OutputStream.getLengthOfEncodingDL(z10, i);
    }

    public DLBitString(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z10, byte[] bArr, int i, int i9) {
        aSN1OutputStream.writeEncodingDL(z10, 3, bArr, i, i9);
    }

    public DLBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DLBitString(byte[] bArr, int i) {
        super(bArr, i);
    }

    public DLBitString(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }
}
