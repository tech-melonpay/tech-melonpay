package org.bouncycastle.oer.its.ieee1609dot2dot1;

import com.google.android.gms.measurement.internal.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;

/* loaded from: classes3.dex */
public class AdditionalParams extends ASN1Object implements ASN1Choice {
    public static final int compactUnified = 2;
    public static final int encryptionKey = 3;
    public static final int original = 0;
    public static final int unified = 1;
    protected final ASN1Encodable additionalParams;
    protected final int choice;

    private AdditionalParams(int i, ASN1Encodable aSN1Encodable) {
        ASN1Encodable butterflyParamsOriginal;
        if (i == 0) {
            butterflyParamsOriginal = ButterflyParamsOriginal.getInstance(aSN1Encodable);
        } else {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalArgumentException(a.g(i, "invalid choice value "));
                }
                this.additionalParams = PublicEncryptionKey.getInstance(aSN1Encodable);
                this.choice = i;
            }
            butterflyParamsOriginal = ButterflyExpansion.getInstance(aSN1Encodable);
        }
        this.additionalParams = butterflyParamsOriginal;
        this.choice = i;
    }

    public static AdditionalParams compactUnified(ButterflyExpansion butterflyExpansion) {
        return new AdditionalParams(2, butterflyExpansion);
    }

    public static AdditionalParams encryptionKey(PublicEncryptionKey publicEncryptionKey) {
        return new AdditionalParams(3, publicEncryptionKey);
    }

    public static AdditionalParams getInstance(Object obj) {
        if (obj instanceof AdditionalParams) {
            return (AdditionalParams) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(obj);
        return new AdditionalParams(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getObject());
    }

    public static AdditionalParams original(ButterflyParamsOriginal butterflyParamsOriginal) {
        return new AdditionalParams(0, butterflyParamsOriginal);
    }

    public static AdditionalParams unified(ButterflyExpansion butterflyExpansion) {
        return new AdditionalParams(1, butterflyExpansion);
    }

    public ASN1Encodable getAdditionalParams() {
        return this.additionalParams;
    }

    public int getChoice() {
        return this.choice;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.additionalParams);
    }

    private AdditionalParams(ASN1TaggedObject aSN1TaggedObject) {
        this(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getObject());
    }
}
