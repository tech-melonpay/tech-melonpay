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
import org.bouncycastle.oer.its.ItsUtils;

/* loaded from: classes3.dex */
public class PolygonalRegion extends ASN1Object implements RegionInterface {
    private final List<TwoDLocation> twoDLocations;

    public static class Builder {
        private List<TwoDLocation> locations = new ArrayList();

        public PolygonalRegion createPolygonalRegion() {
            return new PolygonalRegion(this.locations);
        }

        public Builder setLocations(List<TwoDLocation> list) {
            this.locations = list;
            return this;
        }

        public Builder setLocations(TwoDLocation... twoDLocationArr) {
            this.locations.addAll(Arrays.asList(twoDLocationArr));
            return this;
        }
    }

    public PolygonalRegion(List<TwoDLocation> list) {
        this.twoDLocations = Collections.unmodifiableList(list);
    }

    public static PolygonalRegion getInstance(Object obj) {
        if (obj instanceof PolygonalRegion) {
            return (PolygonalRegion) obj;
        }
        if (obj != null) {
            return new PolygonalRegion((List<TwoDLocation>) ItsUtils.fillList(TwoDLocation.class, ASN1Sequence.getInstance(obj)));
        }
        return null;
    }

    public List<TwoDLocation> getTwoDLocations() {
        return this.twoDLocations;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ItsUtils.toSequence(this.twoDLocations);
    }

    private PolygonalRegion(ASN1Sequence aSN1Sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator<ASN1Encodable> it = aSN1Sequence.iterator();
        while (it.hasNext()) {
            arrayList.add(TwoDLocation.getInstance(aSN1Sequence));
        }
        this.twoDLocations = Collections.unmodifiableList(arrayList);
    }
}
