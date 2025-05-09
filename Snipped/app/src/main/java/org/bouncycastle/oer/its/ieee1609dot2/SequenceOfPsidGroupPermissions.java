package org.bouncycastle.oer.its.ieee1609dot2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes3.dex */
public class SequenceOfPsidGroupPermissions extends ASN1Object {
    private final List<PsidGroupPermissions> psidGroupPermissions;

    public static class Builder {
        private final List<PsidGroupPermissions> groupPermissions = new ArrayList();

        public Builder addGroupPermission(PsidGroupPermissions... psidGroupPermissionsArr) {
            this.groupPermissions.addAll(Arrays.asList(psidGroupPermissionsArr));
            return this;
        }

        public SequenceOfPsidGroupPermissions createSequenceOfPsidGroupPermissions() {
            return new SequenceOfPsidGroupPermissions(this.groupPermissions);
        }

        public Builder setGroupPermissions(List<PsidGroupPermissions> list) {
            this.groupPermissions.addAll(list);
            return this;
        }
    }

    public SequenceOfPsidGroupPermissions(List<PsidGroupPermissions> list) {
        this.psidGroupPermissions = Collections.unmodifiableList(list);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SequenceOfPsidGroupPermissions getInstance(Object obj) {
        if (obj instanceof SequenceOfPsidGroupPermissions) {
            return (SequenceOfPsidGroupPermissions) obj;
        }
        if (obj != null) {
            return new SequenceOfPsidGroupPermissions(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public List<PsidGroupPermissions> getPsidGroupPermissions() {
        return this.psidGroupPermissions;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence((ASN1Encodable[]) this.psidGroupPermissions.toArray(new PsidGroupPermissions[0]));
    }

    private SequenceOfPsidGroupPermissions(ASN1Sequence aSN1Sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator<ASN1Encodable> it = aSN1Sequence.iterator();
        while (it.hasNext()) {
            arrayList.add(PsidGroupPermissions.getInstance(it.next()));
        }
        this.psidGroupPermissions = Collections.unmodifiableList(arrayList);
    }
}
