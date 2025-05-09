package org.bouncycastle.cms;

import java.math.BigInteger;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.selector.X509CertificateHolderSelector;

/* loaded from: classes2.dex */
public class KeyAgreeRecipientId extends RecipientId {
    private X509CertificateHolderSelector baseSelector;

    public KeyAgreeRecipientId(X500Name x500Name, BigInteger bigInteger) {
        this(x500Name, bigInteger, null);
    }

    @Override // org.bouncycastle.cms.RecipientId, org.bouncycastle.util.Selector
    public Object clone() {
        return new KeyAgreeRecipientId(this.baseSelector);
    }

    public boolean equals(Object obj) {
        if (obj instanceof KeyAgreeRecipientId) {
            return this.baseSelector.equals(((KeyAgreeRecipientId) obj).baseSelector);
        }
        return false;
    }

    public BigInteger getSerialNumber() {
        return this.baseSelector.getSerialNumber();
    }

    public byte[] getSubjectKeyIdentifier() {
        return this.baseSelector.getSubjectKeyIdentifier();
    }

    public int hashCode() {
        return this.baseSelector.hashCode();
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        return obj instanceof KeyAgreeRecipientInformation ? ((KeyAgreeRecipientInformation) obj).getRID().equals(this) : this.baseSelector.match(obj);
    }

    public KeyAgreeRecipientId(X500Name x500Name, BigInteger bigInteger, byte[] bArr) {
        this(new X509CertificateHolderSelector(x500Name, bigInteger, bArr));
    }

    private KeyAgreeRecipientId(X509CertificateHolderSelector x509CertificateHolderSelector) {
        super(2);
        this.baseSelector = x509CertificateHolderSelector;
    }

    public KeyAgreeRecipientId(byte[] bArr) {
        this(null, null, bArr);
    }
}
