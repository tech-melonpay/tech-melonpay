package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
public abstract class ASN1GraphicString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1GraphicString.class, 25) { // from class: org.bouncycastle.asn1.ASN1GraphicString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1GraphicString.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1GraphicString(byte[] bArr, boolean z10) {
        if (bArr == null) {
            throw new NullPointerException("'contents' cannot be null");
        }
        this.contents = z10 ? Arrays.clone(bArr) : bArr;
    }

    public static ASN1GraphicString createPrimitive(byte[] bArr) {
        return new DERGraphicString(bArr, false);
    }

    public static ASN1GraphicString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1GraphicString)) {
            return (ASN1GraphicString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1GraphicString) {
                return (ASN1GraphicString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(a.e(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1GraphicString) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.c(e10, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1GraphicString) {
            return Arrays.areEqual(this.contents, ((ASN1GraphicString) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        aSN1OutputStream.writeEncodingDL(z10, 25, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z10) {
        return ASN1OutputStream.getLengthOfEncodingDL(z10, this.contents.length);
    }

    public final byte[] getOctets() {
        return Arrays.clone(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return Strings.fromByteArray(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public static ASN1GraphicString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return (ASN1GraphicString) TYPE.getContextInstance(aSN1TaggedObject, z10);
    }
}
