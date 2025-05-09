package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: classes2.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a, reason: collision with root package name */
    ASN1Integer f24703a;

    /* renamed from: b, reason: collision with root package name */
    ASN1Integer f24704b;

    /* renamed from: p, reason: collision with root package name */
    ASN1Integer f24705p;

    /* renamed from: q, reason: collision with root package name */
    ASN1Integer f24706q;

    /* renamed from: x, reason: collision with root package name */
    ASN1Integer f24707x;

    /* renamed from: y, reason: collision with root package name */
    ASN1Integer f24708y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
        this.f24703a = new ASN1Integer(bigInteger);
        this.f24704b = new ASN1Integer(bigInteger2);
        this.f24705p = new ASN1Integer(bigInteger3);
        this.f24706q = new ASN1Integer(bigInteger4);
        this.f24707x = new ASN1Integer(i);
        this.f24708y = new ASN1Integer(bigInteger5);
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.e(obj, "Invalid GOST3410Parameter: "));
    }

    public BigInteger getA() {
        return this.f24703a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f24705p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f24706q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f24703a);
        aSN1EncodableVector.add(this.f24704b);
        aSN1EncodableVector.add(this.f24705p);
        aSN1EncodableVector.add(this.f24706q);
        aSN1EncodableVector.add(this.f24707x);
        aSN1EncodableVector.add(this.f24708y);
        return new DERSequence(aSN1EncodableVector);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f24703a = (ASN1Integer) objects.nextElement();
        this.f24704b = (ASN1Integer) objects.nextElement();
        this.f24705p = (ASN1Integer) objects.nextElement();
        this.f24706q = (ASN1Integer) objects.nextElement();
        this.f24707x = (ASN1Integer) objects.nextElement();
        this.f24708y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
