package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.google.android.gms.measurement.internal.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes3.dex */
public class EncryptionKey extends ASN1Object implements ASN1Choice {
    public static final int publicOption = 0;
    public static final int symmetric = 1;
    private final int choice;
    private final ASN1Encodable encryptionKey;

    public EncryptionKey(int i, ASN1Encodable aSN1Encodable) {
        this.choice = i;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.g(i, "invalid choice value "));
        }
        this.encryptionKey = aSN1Encodable;
    }

    public static EncryptionKey getInstance(Object obj) {
        if (obj instanceof EncryptionKey) {
            return (EncryptionKey) obj;
        }
        if (obj != null) {
            return new EncryptionKey(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public static EncryptionKey publicOption(PublicEncryptionKey publicEncryptionKey) {
        return new EncryptionKey(0, publicEncryptionKey);
    }

    public static EncryptionKey symmetric(SymmetricEncryptionKey symmetricEncryptionKey) {
        return new EncryptionKey(1, symmetricEncryptionKey);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getEncryptionKey() {
        return this.encryptionKey;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.encryptionKey);
    }

    private EncryptionKey(ASN1TaggedObject aSN1TaggedObject) {
        this(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getObject());
    }
}
