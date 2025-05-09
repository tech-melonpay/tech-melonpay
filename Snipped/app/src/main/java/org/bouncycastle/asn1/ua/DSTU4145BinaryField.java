package org.bouncycastle.asn1.ua;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes2.dex */
public class DSTU4145BinaryField extends ASN1Object {

    /* renamed from: j, reason: collision with root package name */
    private int f24725j;

    /* renamed from: k, reason: collision with root package name */
    private int f24726k;

    /* renamed from: l, reason: collision with root package name */
    private int f24727l;

    /* renamed from: m, reason: collision with root package name */
    private int f24728m;

    public DSTU4145BinaryField(int i, int i9) {
        this(i, i9, 0, 0);
    }

    public static DSTU4145BinaryField getInstance(Object obj) {
        if (obj instanceof DSTU4145BinaryField) {
            return (DSTU4145BinaryField) obj;
        }
        if (obj != null) {
            return new DSTU4145BinaryField(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int getK1() {
        return this.f24726k;
    }

    public int getK2() {
        return this.f24725j;
    }

    public int getK3() {
        return this.f24727l;
    }

    public int getM() {
        return this.f24728m;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new ASN1Integer(this.f24728m));
        if (this.f24725j == 0) {
            aSN1EncodableVector.add(new ASN1Integer(this.f24726k));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            aSN1EncodableVector2.add(new ASN1Integer(this.f24726k));
            aSN1EncodableVector2.add(new ASN1Integer(this.f24725j));
            aSN1EncodableVector2.add(new ASN1Integer(this.f24727l));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145BinaryField(int i, int i9, int i10, int i11) {
        this.f24728m = i;
        this.f24726k = i9;
        this.f24725j = i10;
        this.f24727l = i11;
    }

    private DSTU4145BinaryField(ASN1Sequence aSN1Sequence) {
        this.f24728m = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intPositiveValueExact();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            this.f24726k = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intPositiveValueExact();
        } else {
            if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence)) {
                throw new IllegalArgumentException("object parse error");
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
            this.f24726k = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).intPositiveValueExact();
            this.f24725j = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).intPositiveValueExact();
            this.f24727l = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).intPositiveValueExact();
        }
    }
}
