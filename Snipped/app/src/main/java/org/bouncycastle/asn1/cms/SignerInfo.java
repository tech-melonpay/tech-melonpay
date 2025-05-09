package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes2.dex */
public class SignerInfo extends ASN1Object {
    private ASN1Set authenticatedAttributes;
    private AlgorithmIdentifier digAlgorithm;
    private AlgorithmIdentifier digEncryptionAlgorithm;
    private ASN1OctetString encryptedDigest;
    private SignerIdentifier sid;
    private ASN1Set unauthenticatedAttributes;
    private ASN1Integer version;

    private SignerInfo(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.version = (ASN1Integer) objects.nextElement();
        this.sid = SignerIdentifier.getInstance(objects.nextElement());
        this.digAlgorithm = AlgorithmIdentifier.getInstance(objects.nextElement());
        Object nextElement = objects.nextElement();
        if (nextElement instanceof ASN1TaggedObject) {
            this.authenticatedAttributes = ASN1Set.getInstance((ASN1TaggedObject) nextElement, false);
            nextElement = objects.nextElement();
        } else {
            this.authenticatedAttributes = null;
        }
        this.digEncryptionAlgorithm = AlgorithmIdentifier.getInstance(nextElement);
        this.encryptedDigest = ASN1OctetString.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.unauthenticatedAttributes = ASN1Set.getInstance((ASN1TaggedObject) objects.nextElement(), false);
        } else {
            this.unauthenticatedAttributes = null;
        }
    }

    public static SignerInfo getInstance(Object obj) {
        if (obj instanceof SignerInfo) {
            return (SignerInfo) obj;
        }
        if (obj != null) {
            return new SignerInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Set getAuthenticatedAttributes() {
        return this.authenticatedAttributes;
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.digAlgorithm;
    }

    public AlgorithmIdentifier getDigestEncryptionAlgorithm() {
        return this.digEncryptionAlgorithm;
    }

    public ASN1OctetString getEncryptedDigest() {
        return this.encryptedDigest;
    }

    public SignerIdentifier getSID() {
        return this.sid;
    }

    public ASN1Set getUnauthenticatedAttributes() {
        return this.unauthenticatedAttributes;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
        aSN1EncodableVector.add(this.version);
        aSN1EncodableVector.add(this.sid);
        aSN1EncodableVector.add(this.digAlgorithm);
        ASN1Set aSN1Set = this.authenticatedAttributes;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) aSN1Set));
        }
        aSN1EncodableVector.add(this.digEncryptionAlgorithm);
        aSN1EncodableVector.add(this.encryptedDigest);
        ASN1Set aSN1Set2 = this.unauthenticatedAttributes;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) aSN1Set2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SignerInfo(SignerIdentifier signerIdentifier, AlgorithmIdentifier algorithmIdentifier, ASN1Set aSN1Set, AlgorithmIdentifier algorithmIdentifier2, ASN1OctetString aSN1OctetString, ASN1Set aSN1Set2) {
        this.version = signerIdentifier.isTagged() ? new ASN1Integer(3L) : new ASN1Integer(1L);
        this.sid = signerIdentifier;
        this.digAlgorithm = algorithmIdentifier;
        this.authenticatedAttributes = aSN1Set;
        this.digEncryptionAlgorithm = algorithmIdentifier2;
        this.encryptedDigest = aSN1OctetString;
        this.unauthenticatedAttributes = aSN1Set2;
    }

    public SignerInfo(SignerIdentifier signerIdentifier, AlgorithmIdentifier algorithmIdentifier, Attributes attributes, AlgorithmIdentifier algorithmIdentifier2, ASN1OctetString aSN1OctetString, Attributes attributes2) {
        this.version = signerIdentifier.isTagged() ? new ASN1Integer(3L) : new ASN1Integer(1L);
        this.sid = signerIdentifier;
        this.digAlgorithm = algorithmIdentifier;
        this.authenticatedAttributes = ASN1Set.getInstance(attributes);
        this.digEncryptionAlgorithm = algorithmIdentifier2;
        this.encryptedDigest = aSN1OctetString;
        this.unauthenticatedAttributes = ASN1Set.getInstance(attributes2);
    }
}
