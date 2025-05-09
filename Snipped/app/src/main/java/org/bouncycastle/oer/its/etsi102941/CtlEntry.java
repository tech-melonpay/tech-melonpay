package org.bouncycastle.oer.its.etsi102941;

import com.google.android.gms.measurement.internal.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes3.dex */
public class CtlEntry extends ASN1Object implements ASN1Choice {
    public static final int aa = 2;
    public static final int dc = 3;
    public static final int ea = 1;
    public static final int rca = 0;
    public static final int tlm = 4;
    private final int choice;
    private final ASN1Encodable ctlEntry;

    public CtlEntry(int i, ASN1Encodable aSN1Encodable) {
        this.choice = i;
        this.ctlEntry = aSN1Encodable;
    }

    public static CtlEntry aa(AaEntry aaEntry) {
        return new CtlEntry(2, aaEntry);
    }

    public static CtlEntry dc(DcEntry dcEntry) {
        return new CtlEntry(3, dcEntry);
    }

    public static CtlEntry ea(EaEntry eaEntry) {
        return new CtlEntry(1, eaEntry);
    }

    public static CtlEntry getInstance(Object obj) {
        if (obj instanceof CtlEntry) {
            return (CtlEntry) obj;
        }
        if (obj != null) {
            return new CtlEntry(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public static CtlEntry rca(RootCaEntry rootCaEntry) {
        return new CtlEntry(0, rootCaEntry);
    }

    public static CtlEntry tlm(TlmEntry tlmEntry) {
        return new CtlEntry(4, tlmEntry);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getCtlEntry() {
        return this.ctlEntry;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.ctlEntry);
    }

    private CtlEntry(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            this.ctlEntry = RootCaEntry.getInstance(aSN1TaggedObject.getObject());
            return;
        }
        if (tagNo == 1) {
            this.ctlEntry = EaEntry.getInstance(aSN1TaggedObject.getObject());
            return;
        }
        if (tagNo == 2) {
            this.ctlEntry = AaEntry.getInstance(aSN1TaggedObject.getObject());
        } else if (tagNo == 3) {
            this.ctlEntry = DcEntry.getInstance(aSN1TaggedObject.getObject());
        } else {
            if (tagNo != 4) {
                throw new IllegalArgumentException(a.g(tagNo, "invalid choice value "));
            }
            this.ctlEntry = TlmEntry.getInstance(aSN1TaggedObject.getObject());
        }
    }
}
