package org.bouncycastle.oer.its.ieee1609dot2;

import com.google.android.gms.measurement.internal.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

/* loaded from: classes3.dex */
public class SignerIdentifier extends ASN1Object implements ASN1Choice {
    public static final int certificate = 1;
    public static final int digest = 0;
    public static final int self = 2;
    private final int choice;
    private final ASN1Encodable signerIdentifier;

    public SignerIdentifier(int i, ASN1Encodable aSN1Encodable) {
        this.choice = i;
        this.signerIdentifier = aSN1Encodable;
    }

    public static SignerIdentifier certificate(SequenceOfCertificate sequenceOfCertificate) {
        return new SignerIdentifier(1, sequenceOfCertificate);
    }

    public static SignerIdentifier digest(HashedId8 hashedId8) {
        return new SignerIdentifier(0, hashedId8);
    }

    public static SignerIdentifier getInstance(Object obj) {
        if (obj instanceof SignerIdentifier) {
            return (SignerIdentifier) obj;
        }
        if (obj != null) {
            return new SignerIdentifier(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public static SignerIdentifier self() {
        return new SignerIdentifier(2, DERNull.INSTANCE);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getSignerIdentifier() {
        return this.signerIdentifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.signerIdentifier);
    }

    private SignerIdentifier(ASN1TaggedObject aSN1TaggedObject) {
        ASN1Encodable hashedId8;
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            hashedId8 = HashedId8.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 1) {
                if (tagNo != 2) {
                    throw new IllegalArgumentException(a.g(tagNo, "invalid choice value "));
                }
                this.signerIdentifier = ASN1Null.getInstance(aSN1TaggedObject.getObject());
                return;
            }
            hashedId8 = SequenceOfCertificate.getInstance(aSN1TaggedObject.getObject());
        }
        this.signerIdentifier = hashedId8;
    }
}
