package org.bouncycastle.asn1;

/* loaded from: classes2.dex */
public class DERBMPString extends ASN1BMPString {
    public DERBMPString(String str) {
        super(str);
    }

    public static DERBMPString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERBMPString)) {
            return (DERBMPString) obj;
        }
        if (obj instanceof ASN1BMPString) {
            return new DERBMPString(((ASN1BMPString) obj).string);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(a.e(obj, "illegal object in getInstance: "));
        }
        try {
            return (DERBMPString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.c(e10, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public DERBMPString(byte[] bArr) {
        super(bArr);
    }

    public DERBMPString(char[] cArr) {
        super(cArr);
    }

    public static DERBMPString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof DERBMPString)) ? getInstance((Object) object) : new DERBMPString(ASN1OctetString.getInstance(object).getOctets());
    }
}
