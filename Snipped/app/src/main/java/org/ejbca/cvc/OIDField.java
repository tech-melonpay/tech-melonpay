package org.ejbca.cvc;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes3.dex */
public class OIDField extends AbstractDataField {
    private static final long serialVersionUID = 5212215839749666908L;
    private String id;

    public OIDField() {
        super(CVCTagEnum.OID);
    }

    public boolean equals(Object obj) {
        if (obj instanceof OIDField) {
            return this.id.equals(((OIDField) obj).getValue());
        }
        return false;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public byte[] getEncoded() {
        try {
            byte[] encoded = new ASN1ObjectIdentifier(this.id).getEncoded();
            int length = encoded.length - 2;
            byte[] bArr = new byte[length];
            System.arraycopy(encoded, 2, bArr, 0, length);
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    public String getValue() {
        return this.id;
    }

    public String toString() {
        return getValue();
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public String valueAsText() {
        return this.id;
    }

    public OIDField(String str) {
        this();
        this.id = str;
    }

    public OIDField(byte[] bArr) {
        this();
        this.id = ASN1ObjectIdentifier.getInstance(new DERTaggedObject(true, 0, (ASN1Encodable) new DEROctetString(bArr)), false).getId();
    }
}
