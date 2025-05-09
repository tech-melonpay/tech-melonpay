package org.bouncycastle.oer.its.ieee1609dot2;

import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class AesCcmCiphertext extends ASN1Object {
    private final Opaque ccmCiphertext;
    private final ASN1OctetString nonce;

    public static class Builder {
        private ASN1OctetString nonce;
        private Opaque opaque;

        public AesCcmCiphertext createAesCcmCiphertext() {
            return new AesCcmCiphertext(this.nonce, this.opaque);
        }

        public Builder setCcmCiphertext(Opaque opaque) {
            this.opaque = opaque;
            return this;
        }

        public Builder setNonce(ASN1OctetString aSN1OctetString) {
            this.nonce = aSN1OctetString;
            return this;
        }

        public Builder setCcmCiphertext(byte[] bArr) {
            return setCcmCiphertext(new Opaque(bArr));
        }

        public Builder setNonce(byte[] bArr) {
            return setNonce(new DEROctetString(Arrays.clone(bArr)));
        }
    }

    public AesCcmCiphertext(ASN1OctetString aSN1OctetString, Opaque opaque) {
        this.nonce = aSN1OctetString;
        this.ccmCiphertext = opaque;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AesCcmCiphertext getInstance(Object obj) {
        if (obj instanceof AesCcmCiphertext) {
            return (AesCcmCiphertext) obj;
        }
        if (obj != null) {
            return new AesCcmCiphertext(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Opaque getCcmCiphertext() {
        return this.ccmCiphertext;
    }

    public ASN1OctetString getNonce() {
        return this.nonce;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ItsUtils.toSequence(this.nonce, this.ccmCiphertext);
    }

    private AesCcmCiphertext(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("expected sequence size of 2");
        }
        Iterator<ASN1Encodable> it = aSN1Sequence.iterator();
        this.nonce = ASN1OctetString.getInstance(it.next());
        this.ccmCiphertext = Opaque.getInstance(it.next());
    }
}
