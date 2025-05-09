package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.etsi102941.basetypes.Version;
import org.bouncycastle.oer.its.ieee1609dot2.Opaque;

/* loaded from: classes3.dex */
public class EtsiTs102941Data extends ASN1Object {
    private final EtsiTs102941DataContent content;
    private final Version version;

    private EtsiTs102941Data(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("expected sequence size of 2");
        }
        this.version = Version.getInstance(aSN1Sequence.getObjectAt(0));
        this.content = EtsiTs102941DataContent.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static EtsiTs102941Data getInstance(Object obj) {
        if (obj instanceof EtsiTs102941Data) {
            return (EtsiTs102941Data) obj;
        }
        if (obj != null) {
            return obj instanceof Opaque ? new EtsiTs102941Data(ASN1Sequence.getInstance(((Opaque) obj).getContent())) : new EtsiTs102941Data(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EtsiTs102941DataContent getContent() {
        return this.content;
    }

    public Version getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.version, this.content});
    }

    public EtsiTs102941Data(Version version, EtsiTs102941DataContent etsiTs102941DataContent) {
        this.version = version;
        this.content = etsiTs102941DataContent;
    }
}
