package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class BitmapSsp extends ASN1Object {
    private final DEROctetString string;

    public BitmapSsp(DEROctetString dEROctetString) {
        this.string = dEROctetString;
    }

    public static BitmapSsp getInstance(Object obj) {
        if (obj instanceof BitmapSsp) {
            return (BitmapSsp) obj;
        }
        if (obj != null) {
            return new BitmapSsp(ASN1OctetString.getInstance(obj).getOctets());
        }
        return null;
    }

    public DEROctetString getString() {
        return this.string;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.string;
    }

    public BitmapSsp(byte[] bArr) {
        this.string = new DEROctetString(Arrays.clone(bArr));
    }
}
