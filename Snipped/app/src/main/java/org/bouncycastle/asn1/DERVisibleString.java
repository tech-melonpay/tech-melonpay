package org.bouncycastle.asn1;

/* loaded from: classes2.dex */
public class DERVisibleString extends ASN1VisibleString {
    public DERVisibleString(String str) {
        super(str);
    }

    public static DERVisibleString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERVisibleString)) {
            return (DERVisibleString) obj;
        }
        if (obj instanceof ASN1VisibleString) {
            return new DERVisibleString(((ASN1VisibleString) obj).contents, false);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(a.e(obj, "illegal object in getInstance: "));
        }
        try {
            return (DERVisibleString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.c(e10, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public DERVisibleString(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }

    public static DERVisibleString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof DERVisibleString)) ? getInstance((Object) object) : new DERVisibleString(ASN1OctetString.getInstance(object).getOctets(), true);
    }
}
