package org.bouncycastle.asn1.eac;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class CVCertificate extends ASN1Object {
    private static int bodyValid = 1;
    private static int signValid = 2;
    private CertificateBody certificateBody;
    private byte[] signature;
    private int valid;

    private CVCertificate(ASN1ApplicationSpecific aSN1ApplicationSpecific) {
        setPrivateData(aSN1ApplicationSpecific);
    }

    public static CVCertificate getInstance(Object obj) {
        if (obj instanceof CVCertificate) {
            return (CVCertificate) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return new CVCertificate(ASN1ApplicationSpecific.getInstance(obj));
        } catch (IOException e10) {
            throw new ASN1ParsingException(a.b(e10, new StringBuilder("unable to parse data: ")), e10);
        }
    }

    private void initFrom(ASN1InputStream aSN1InputStream) {
        while (true) {
            ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject == null) {
                return;
            }
            if (!(readObject instanceof ASN1ApplicationSpecific)) {
                throw new IOException("Invalid Input Stream for creating an Iso7816CertificateStructure");
            }
            setPrivateData((ASN1ApplicationSpecific) readObject);
        }
    }

    private void setPrivateData(ASN1ApplicationSpecific aSN1ApplicationSpecific) {
        int i;
        int i9;
        this.valid = 0;
        if (aSN1ApplicationSpecific.getApplicationTag() != 33) {
            throw new IOException("not a CARDHOLDER_CERTIFICATE :" + aSN1ApplicationSpecific.getApplicationTag());
        }
        ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1ApplicationSpecific.getContents());
        while (true) {
            ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject == null) {
                aSN1InputStream.close();
                if (this.valid == (signValid | bodyValid)) {
                    return;
                }
                throw new IOException("invalid CARDHOLDER_CERTIFICATE :" + aSN1ApplicationSpecific.getApplicationTag());
            }
            if (!(readObject instanceof ASN1ApplicationSpecific)) {
                throw new IOException("Invalid Object, not an Iso7816CertificateStructure");
            }
            ASN1ApplicationSpecific aSN1ApplicationSpecific2 = (ASN1ApplicationSpecific) readObject;
            int applicationTag = aSN1ApplicationSpecific2.getApplicationTag();
            if (applicationTag == 55) {
                this.signature = aSN1ApplicationSpecific2.getContents();
                i = this.valid;
                i9 = signValid;
            } else {
                if (applicationTag != 78) {
                    throw new IOException("Invalid tag, not an Iso7816CertificateStructure :" + aSN1ApplicationSpecific2.getApplicationTag());
                }
                this.certificateBody = CertificateBody.getInstance(aSN1ApplicationSpecific2);
                i = this.valid;
                i9 = bodyValid;
            }
            this.valid = i | i9;
        }
    }

    public CertificationAuthorityReference getAuthorityReference() {
        return this.certificateBody.getCertificationAuthorityReference();
    }

    public CertificateBody getBody() {
        return this.certificateBody;
    }

    public int getCertificateType() {
        return this.certificateBody.getCertificateType();
    }

    public PackedDate getEffectiveDate() {
        return this.certificateBody.getCertificateEffectiveDate();
    }

    public PackedDate getExpirationDate() {
        return this.certificateBody.getCertificateExpirationDate();
    }

    public ASN1ObjectIdentifier getHolderAuthorization() {
        return this.certificateBody.getCertificateHolderAuthorization().getOid();
    }

    public Flags getHolderAuthorizationRights() {
        return new Flags(this.certificateBody.getCertificateHolderAuthorization().getAccessRights() & 31);
    }

    public int getHolderAuthorizationRole() {
        return this.certificateBody.getCertificateHolderAuthorization().getAccessRights() & 192;
    }

    public CertificateHolderReference getHolderReference() {
        return this.certificateBody.getCertificateHolderReference();
    }

    public int getRole() {
        return this.certificateBody.getCertificateHolderAuthorization().getAccessRights();
    }

    public byte[] getSignature() {
        return Arrays.clone(this.signature);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.certificateBody);
        try {
            aSN1EncodableVector.add(new DERApplicationSpecific(false, 55, new DEROctetString(this.signature)));
            return new DERApplicationSpecific(33, aSN1EncodableVector);
        } catch (IOException unused) {
            throw new IllegalStateException("unable to convert signature!");
        }
    }

    public CVCertificate(ASN1InputStream aSN1InputStream) {
        initFrom(aSN1InputStream);
    }

    public CVCertificate(CertificateBody certificateBody, byte[] bArr) {
        this.certificateBody = certificateBody;
        this.signature = Arrays.clone(bArr);
        this.valid = this.valid | bodyValid | signValid;
    }
}
