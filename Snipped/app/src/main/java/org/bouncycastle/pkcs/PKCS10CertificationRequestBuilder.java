package org.bouncycastle.pkcs;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.Attribute;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.pkcs.CertificationRequestInfo;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.ContentSigner;

/* loaded from: classes3.dex */
public class PKCS10CertificationRequestBuilder {
    private List attributes;
    private boolean leaveOffEmpty;
    private SubjectPublicKeyInfo publicKeyInfo;
    private X500Name subject;

    public PKCS10CertificationRequestBuilder(X500Name x500Name, SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.attributes = new ArrayList();
        this.leaveOffEmpty = false;
        this.subject = x500Name;
        this.publicKeyInfo = subjectPublicKeyInfo;
    }

    public PKCS10CertificationRequestBuilder addAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.attributes.add(new Attribute(aSN1ObjectIdentifier, new DERSet(aSN1Encodable)));
        return this;
    }

    public PKCS10CertificationRequest build(ContentSigner contentSigner) {
        CertificationRequestInfo certificationRequestInfo;
        if (this.attributes.isEmpty()) {
            certificationRequestInfo = this.leaveOffEmpty ? new CertificationRequestInfo(this.subject, this.publicKeyInfo, (ASN1Set) null) : new CertificationRequestInfo(this.subject, this.publicKeyInfo, new DERSet());
        } else {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            Iterator it = this.attributes.iterator();
            while (it.hasNext()) {
                aSN1EncodableVector.add(Attribute.getInstance(it.next()));
            }
            certificationRequestInfo = new CertificationRequestInfo(this.subject, this.publicKeyInfo, new DERSet(aSN1EncodableVector));
        }
        try {
            OutputStream outputStream = contentSigner.getOutputStream();
            outputStream.write(certificationRequestInfo.getEncoded(ASN1Encoding.DER));
            outputStream.close();
            return new PKCS10CertificationRequest(new CertificationRequest(certificationRequestInfo, contentSigner.getAlgorithmIdentifier(), new DERBitString(contentSigner.getSignature())));
        } catch (IOException unused) {
            throw new IllegalStateException("cannot produce certification request signature");
        }
    }

    public PKCS10CertificationRequestBuilder setAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        Iterator it = this.attributes.iterator();
        while (it.hasNext()) {
            if (((Attribute) it.next()).getAttrType().equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                throw new IllegalStateException("Attribute " + aSN1ObjectIdentifier.toString() + " is already set");
            }
        }
        addAttribute(aSN1ObjectIdentifier, aSN1Encodable);
        return this;
    }

    public PKCS10CertificationRequestBuilder setLeaveOffEmptyAttributes(boolean z10) {
        this.leaveOffEmpty = z10;
        return this;
    }

    public PKCS10CertificationRequestBuilder(PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder) {
        this.attributes = new ArrayList();
        this.leaveOffEmpty = false;
        this.publicKeyInfo = pKCS10CertificationRequestBuilder.publicKeyInfo;
        this.subject = pKCS10CertificationRequestBuilder.subject;
        this.leaveOffEmpty = pKCS10CertificationRequestBuilder.leaveOffEmpty;
        this.attributes = new ArrayList(pKCS10CertificationRequestBuilder.attributes);
    }

    public PKCS10CertificationRequestBuilder addAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable[] aSN1EncodableArr) {
        this.attributes.add(new Attribute(aSN1ObjectIdentifier, new DERSet(aSN1EncodableArr)));
        return this;
    }

    public PKCS10CertificationRequestBuilder setAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable[] aSN1EncodableArr) {
        Iterator it = this.attributes.iterator();
        while (it.hasNext()) {
            if (((Attribute) it.next()).getAttrType().equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                throw new IllegalStateException("Attribute " + aSN1ObjectIdentifier.toString() + " is already set");
            }
        }
        addAttribute(aSN1ObjectIdentifier, aSN1EncodableArr);
        return this;
    }
}
