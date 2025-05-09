package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;

/* loaded from: classes3.dex */
public class SABERPublicKey extends ASN1Object {

    /* renamed from: b, reason: collision with root package name */
    private byte[] f25349b;
    private byte[] seed_A;

    private SABERPublicKey(ASN1Sequence aSN1Sequence) {
        this.seed_A = a.A(aSN1Sequence, 0);
        this.f25349b = a.A(aSN1Sequence, 1);
    }

    public static SABERPublicKey getInstance(Object obj) {
        if (obj instanceof SABERPublicKey) {
            return (SABERPublicKey) obj;
        }
        if (obj != null) {
            return new SABERPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getB() {
        return this.f25349b;
    }

    public byte[] getSeed_A() {
        return this.seed_A;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.seed_A));
        aSN1EncodableVector.add(new DEROctetString(this.f25349b));
        return new DERSequence(aSN1EncodableVector);
    }

    public SABERPublicKey(byte[] bArr, byte[] bArr2) {
        this.seed_A = bArr;
        this.f25349b = bArr2;
    }
}
