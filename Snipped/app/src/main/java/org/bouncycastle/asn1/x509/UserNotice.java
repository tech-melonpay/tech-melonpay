package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: classes2.dex */
public class UserNotice extends ASN1Object {
    private final DisplayText explicitText;
    private final NoticeReference noticeRef;

    private UserNotice(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.noticeRef = NoticeReference.getInstance(aSN1Sequence.getObjectAt(0));
            this.explicitText = DisplayText.getInstance(aSN1Sequence.getObjectAt(1));
            return;
        }
        if (aSN1Sequence.size() == 1) {
            boolean z10 = aSN1Sequence.getObjectAt(0).toASN1Primitive() instanceof ASN1Sequence;
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
            if (!z10) {
                this.explicitText = DisplayText.getInstance(objectAt);
                this.noticeRef = null;
                return;
            }
            this.noticeRef = NoticeReference.getInstance(objectAt);
        } else {
            if (aSN1Sequence.size() != 0) {
                throw new IllegalArgumentException(a.i(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            }
            this.noticeRef = null;
        }
        this.explicitText = null;
    }

    public static UserNotice getInstance(Object obj) {
        if (obj instanceof UserNotice) {
            return (UserNotice) obj;
        }
        if (obj != null) {
            return new UserNotice(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DisplayText getExplicitText() {
        return this.explicitText;
    }

    public NoticeReference getNoticeRef() {
        return this.noticeRef;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        NoticeReference noticeReference = this.noticeRef;
        if (noticeReference != null) {
            aSN1EncodableVector.add(noticeReference);
        }
        DisplayText displayText = this.explicitText;
        if (displayText != null) {
            aSN1EncodableVector.add(displayText);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public UserNotice(NoticeReference noticeReference, String str) {
        this(noticeReference, new DisplayText(str));
    }

    public UserNotice(NoticeReference noticeReference, DisplayText displayText) {
        this.noticeRef = noticeReference;
        this.explicitText = displayText;
    }
}
