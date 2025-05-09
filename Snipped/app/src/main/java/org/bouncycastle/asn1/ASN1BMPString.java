package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public abstract class ASN1BMPString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BMPString.class, 30) { // from class: org.bouncycastle.asn1.ASN1BMPString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BMPString.createPrimitive(dEROctetString.getOctets());
        }
    };
    final char[] string;

    public ASN1BMPString(String str) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.string = str.toCharArray();
    }

    public static ASN1BMPString createPrimitive(byte[] bArr) {
        return new DERBMPString(bArr);
    }

    public static ASN1BMPString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1BMPString)) {
            return (ASN1BMPString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1BMPString) {
                return (ASN1BMPString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(a.e(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1BMPString) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.c(e10, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1BMPString) {
            return Arrays.areEqual(this.string, ((ASN1BMPString) aSN1Primitive).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z10) {
        int length = this.string.length;
        aSN1OutputStream.writeIdentifier(z10, 30);
        aSN1OutputStream.writeDL(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i9 = 0;
        while (i9 < i) {
            char[] cArr = this.string;
            char c2 = cArr[i9];
            char c10 = cArr[i9 + 1];
            char c11 = cArr[i9 + 2];
            char c12 = cArr[i9 + 3];
            i9 += 4;
            bArr[0] = (byte) (c2 >> '\b');
            bArr[1] = (byte) c2;
            bArr[2] = (byte) (c10 >> '\b');
            bArr[3] = (byte) c10;
            bArr[4] = (byte) (c11 >> '\b');
            bArr[5] = (byte) c11;
            bArr[6] = (byte) (c12 >> '\b');
            bArr[7] = (byte) c12;
            aSN1OutputStream.write(bArr, 0, 8);
        }
        if (i9 < length) {
            int i10 = 0;
            do {
                char c13 = this.string[i9];
                i9++;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (c13 >> '\b');
                i10 += 2;
                bArr[i11] = (byte) c13;
            } while (i9 < length);
            aSN1OutputStream.write(bArr, 0, i10);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z10) {
        return ASN1OutputStream.getLengthOfEncodingDL(z10, this.string.length * 2);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return new String(this.string);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public String toString() {
        return getString();
    }

    public ASN1BMPString(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i9 = 0; i9 != i; i9++) {
            int i10 = i9 * 2;
            cArr[i9] = (char) ((bArr[i10 + 1] & 255) | (bArr[i10] << 8));
        }
        this.string = cArr;
    }

    public static ASN1BMPString createPrimitive(char[] cArr) {
        return new DERBMPString(cArr);
    }

    public ASN1BMPString(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.string = cArr;
    }

    public static ASN1BMPString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return (ASN1BMPString) TYPE.getContextInstance(aSN1TaggedObject, z10);
    }
}
