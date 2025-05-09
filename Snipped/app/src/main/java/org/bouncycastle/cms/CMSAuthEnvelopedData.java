package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.AuthEnvelopedData;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EncryptedContentInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class CMSAuthEnvelopedData {
    private ASN1Set authAttrs;
    private AlgorithmIdentifier authEncAlg;
    ContentInfo contentInfo;
    private byte[] mac;
    private OriginatorInformation originatorInfo;
    RecipientInformationStore recipientInfoStore;
    private ASN1Set unauthAttrs;

    public CMSAuthEnvelopedData(InputStream inputStream) {
        this(CMSUtils.readContentInfo(inputStream));
    }

    public AttributeTable getAuthAttrs() {
        ASN1Set aSN1Set = this.authAttrs;
        if (aSN1Set == null) {
            return null;
        }
        return new AttributeTable(aSN1Set);
    }

    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    public OriginatorInformation getOriginatorInfo() {
        return this.originatorInfo;
    }

    public RecipientInformationStore getRecipientInfos() {
        return this.recipientInfoStore;
    }

    public AttributeTable getUnauthAttrs() {
        ASN1Set aSN1Set = this.unauthAttrs;
        if (aSN1Set == null) {
            return null;
        }
        return new AttributeTable(aSN1Set);
    }

    public CMSAuthEnvelopedData(ContentInfo contentInfo) {
        this.contentInfo = contentInfo;
        AuthEnvelopedData authEnvelopedData = AuthEnvelopedData.getInstance(contentInfo.getContent());
        if (authEnvelopedData.getOriginatorInfo() != null) {
            this.originatorInfo = new OriginatorInformation(authEnvelopedData.getOriginatorInfo());
        }
        ASN1Set recipientInfos = authEnvelopedData.getRecipientInfos();
        final EncryptedContentInfo authEncryptedContentInfo = authEnvelopedData.getAuthEncryptedContentInfo();
        this.authEncAlg = authEncryptedContentInfo.getContentEncryptionAlgorithm();
        CMSSecureReadable cMSSecureReadable = new CMSSecureReadable() { // from class: org.bouncycastle.cms.CMSAuthEnvelopedData.1
            @Override // org.bouncycastle.cms.CMSSecureReadable
            public InputStream getInputStream() {
                return new ByteArrayInputStream(authEncryptedContentInfo.getEncryptedContent().getOctets());
            }
        };
        this.authAttrs = authEnvelopedData.getAuthAttrs();
        this.mac = authEnvelopedData.getMac().getOctets();
        this.unauthAttrs = authEnvelopedData.getUnauthAttrs();
        this.recipientInfoStore = this.authAttrs != null ? CMSEnvelopedHelper.buildRecipientInformationStore(recipientInfos, this.authEncAlg, cMSSecureReadable, new AuthAttributesProvider() { // from class: org.bouncycastle.cms.CMSAuthEnvelopedData.2
            @Override // org.bouncycastle.cms.AuthAttributesProvider
            public ASN1Set getAuthAttributes() {
                return CMSAuthEnvelopedData.this.authAttrs;
            }

            @Override // org.bouncycastle.cms.AuthAttributesProvider
            public boolean isAead() {
                return true;
            }
        }) : CMSEnvelopedHelper.buildRecipientInformationStore(recipientInfos, this.authEncAlg, cMSSecureReadable);
    }

    public CMSAuthEnvelopedData(byte[] bArr) {
        this(CMSUtils.readContentInfo(bArr));
    }
}
