package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class EciesP256EncryptedKey extends ASN1Object {

    /* renamed from: c, reason: collision with root package name */
    private final ASN1OctetString f25314c;

    /* renamed from: t, reason: collision with root package name */
    private final ASN1OctetString f25315t;

    /* renamed from: v, reason: collision with root package name */
    private final EccP256CurvePoint f25316v;

    public static class Builder {

        /* renamed from: c, reason: collision with root package name */
        private ASN1OctetString f25317c;

        /* renamed from: t, reason: collision with root package name */
        private ASN1OctetString f25318t;

        /* renamed from: v, reason: collision with root package name */
        private EccP256CurvePoint f25319v;

        public EciesP256EncryptedKey createEciesP256EncryptedKey() {
            return new EciesP256EncryptedKey(this.f25319v, this.f25317c, this.f25318t);
        }

        public Builder setC(ASN1OctetString aSN1OctetString) {
            this.f25317c = aSN1OctetString;
            return this;
        }

        public Builder setT(ASN1OctetString aSN1OctetString) {
            this.f25318t = aSN1OctetString;
            return this;
        }

        public Builder setV(EccP256CurvePoint eccP256CurvePoint) {
            this.f25319v = eccP256CurvePoint;
            return this;
        }

        public Builder setC(byte[] bArr) {
            this.f25317c = new DEROctetString(Arrays.clone(bArr));
            return this;
        }

        public Builder setT(byte[] bArr) {
            this.f25318t = new DEROctetString(Arrays.clone(bArr));
            return this;
        }
    }

    private EciesP256EncryptedKey(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("expected sequence size of 3");
        }
        this.f25316v = EccP256CurvePoint.getInstance(aSN1Sequence.getObjectAt(0));
        this.f25314c = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        this.f25315t = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EciesP256EncryptedKey getInstance(Object obj) {
        if (obj instanceof EciesP256EncryptedKey) {
            return (EciesP256EncryptedKey) obj;
        }
        if (obj != null) {
            return new EciesP256EncryptedKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getC() {
        return this.f25314c;
    }

    public ASN1OctetString getT() {
        return this.f25315t;
    }

    public EccP256CurvePoint getV() {
        return this.f25316v;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f25316v, this.f25314c, this.f25315t});
    }

    public EciesP256EncryptedKey(EccP256CurvePoint eccP256CurvePoint, ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        this.f25316v = eccP256CurvePoint;
        this.f25314c = aSN1OctetString;
        this.f25315t = aSN1OctetString2;
    }
}
