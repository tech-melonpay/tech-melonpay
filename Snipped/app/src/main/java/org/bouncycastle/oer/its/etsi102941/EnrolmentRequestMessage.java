package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataSignedAndEncryptedUnicast;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

/* loaded from: classes3.dex */
public class EnrolmentRequestMessage extends EtsiTs103097DataSignedAndEncryptedUnicast {
    public EnrolmentRequestMessage(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static EnrolmentRequestMessage getInstance(Object obj) {
        if (obj instanceof EnrolmentRequestMessage) {
            return (EnrolmentRequestMessage) obj;
        }
        if (obj != null) {
            return new EnrolmentRequestMessage(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EnrolmentRequestMessage(Ieee1609Dot2Content ieee1609Dot2Content) {
        super(ieee1609Dot2Content);
    }
}
