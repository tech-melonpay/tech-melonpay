package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

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
public class SequenceOfHashedId3 extends ASN1Object {
    private final List<HashedId3> hashedId3s;

    public static class Builder {
        private final List<HashedId3> items = new ArrayList();

        public Builder addHashId3(HashedId3... hashedId3Arr) {
            this.items.addAll(Arrays.asList(hashedId3Arr));
            return this;
        }

        public SequenceOfHashedId3 build() {
            return new SequenceOfHashedId3(this.items);
        }
    }

    public SequenceOfHashedId3(List<HashedId3> list) {
        this.hashedId3s = Collections.unmodifiableList(list);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SequenceOfHashedId3 getInstance(Object obj) {
        if (obj instanceof SequenceOfHashedId3) {
            return (SequenceOfHashedId3) obj;
        }
        if (obj != null) {
            return new SequenceOfHashedId3(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public List<HashedId3> getHashedId3s() {
        return this.hashedId3s;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence((ASN1Encodable[]) this.hashedId3s.toArray(new ASN1Encodable[0]));
    }

    private SequenceOfHashedId3(ASN1Sequence aSN1Sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator<ASN1Encodable> it = aSN1Sequence.iterator();
        while (it.hasNext()) {
            arrayList.add(HashedId3.getInstance(it.next()));
        }
        this.hashedId3s = Collections.unmodifiableList(arrayList);
    }
}
