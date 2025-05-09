package org.bouncycastle.pqc.asn1;

import com.google.android.gms.measurement.internal.a;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class ParSet extends ASN1Object {

    /* renamed from: h, reason: collision with root package name */
    private int[] f25341h;

    /* renamed from: k, reason: collision with root package name */
    private int[] f25342k;

    /* renamed from: t, reason: collision with root package name */
    private int f25343t;

    /* renamed from: w, reason: collision with root package name */
    private int[] f25344w;

    public ParSet(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f25343t = i;
        this.f25341h = iArr;
        this.f25344w = iArr2;
        this.f25342k = iArr3;
    }

    private static int checkBigIntegerInIntRangeAndPositive(ASN1Encodable aSN1Encodable) {
        int intValueExact = ((ASN1Integer) aSN1Encodable).intValueExact();
        if (intValueExact > 0) {
            return intValueExact;
        }
        throw new IllegalArgumentException(a.g(intValueExact, "BigInteger not in Range: "));
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj != null) {
            return new ParSet(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f25341h);
    }

    public int[] getK() {
        return Arrays.clone(this.f25342k);
    }

    public int getT() {
        return this.f25343t;
    }

    public int[] getW() {
        return Arrays.clone(this.f25344w);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i = 0; i < this.f25341h.length; i++) {
            aSN1EncodableVector.add(new ASN1Integer(this.f25341h[i]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f25344w[i]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f25342k[i]));
        }
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        aSN1EncodableVector4.add(new ASN1Integer(this.f25343t));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
        return new DERSequence(aSN1EncodableVector4);
    }

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException(org.bouncycastle.asn1.a.i(aSN1Sequence, new StringBuilder("sie of seqOfParams = ")));
        }
        this.f25343t = checkBigIntegerInIntRangeAndPositive(aSN1Sequence.getObjectAt(0));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f25343t || aSN1Sequence3.size() != this.f25343t || aSN1Sequence4.size() != this.f25343t) {
            throw new IllegalArgumentException("invalid size of sequences");
        }
        this.f25341h = new int[aSN1Sequence2.size()];
        this.f25344w = new int[aSN1Sequence3.size()];
        this.f25342k = new int[aSN1Sequence4.size()];
        for (int i = 0; i < this.f25343t; i++) {
            this.f25341h[i] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence2.getObjectAt(i));
            this.f25344w[i] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence3.getObjectAt(i));
            this.f25342k[i] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence4.getObjectAt(i));
        }
    }
}
