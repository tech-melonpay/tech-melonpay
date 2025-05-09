package org.jmrtd.lds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;

/* loaded from: classes3.dex */
public class CardSecurityFile implements Serializable {
    private static final String CONTENT_TYPE_OID = "0.4.0.127.0.7.3.2.1";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -3535507558193769952L;
    private X509Certificate certificate;
    private String digestAlgorithm;
    private String digestEncryptionAlgorithm;
    private byte[] encryptedDigest;
    private Set<SecurityInfo> securityInfos;

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, PrivateKey privateKey, X509Certificate x509Certificate) {
        this(str, str2, collection, privateKey, x509Certificate, null);
    }

    private static ContentInfo toContentInfo(String str, Collection<SecurityInfo> collection) {
        try {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            Iterator<SecurityInfo> it = collection.iterator();
            while (it.hasNext()) {
                aSN1EncodableVector.add(it.next().getDERObject());
            }
            return new ContentInfo(new ASN1ObjectIdentifier(str), new DEROctetString(new DLSet(aSN1EncodableVector)));
        } catch (IOException e10) {
            LOGGER.log(Level.WARNING, "Error creating signedData", (Throwable) e10);
            throw new IllegalArgumentException("Error DER encoding the security infos");
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        CardSecurityFile cardSecurityFile = (CardSecurityFile) obj;
        Set<SecurityInfo> set = this.securityInfos;
        if (set == null) {
            return cardSecurityFile.securityInfos == null;
        }
        Set<SecurityInfo> set2 = cardSecurityFile.securityInfos;
        return set2 == null ? set == null : set.equals(set2);
    }

    @Deprecated
    public Collection<ChipAuthenticationInfo> getChipAuthenticationInfos() {
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        for (SecurityInfo securityInfo : this.securityInfos) {
            if (securityInfo instanceof ChipAuthenticationInfo) {
                arrayList.add((ChipAuthenticationInfo) securityInfo);
            }
        }
        return arrayList;
    }

    @Deprecated
    public Collection<ChipAuthenticationPublicKeyInfo> getChipAuthenticationPublicKeyInfos() {
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        for (SecurityInfo securityInfo : this.securityInfos) {
            if (securityInfo instanceof ChipAuthenticationPublicKeyInfo) {
                arrayList.add((ChipAuthenticationPublicKeyInfo) securityInfo);
            }
        }
        return arrayList;
    }

    public String getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    public String getDigestEncryptionAlgorithm() {
        return this.digestEncryptionAlgorithm;
    }

    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                writeContent(byteArrayOutputStream);
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                    LOGGER.log(Level.FINE, "Error closing stream");
                }
            }
        } catch (IOException e10) {
            LOGGER.log(Level.WARNING, "Exception while encoding", (Throwable) e10);
            try {
                byteArrayOutputStream.close();
                return null;
            } catch (IOException unused2) {
                LOGGER.log(Level.FINE, "Error closing stream");
                return null;
            }
        }
    }

    public byte[] getEncryptedDigest() {
        byte[] bArr = this.encryptedDigest;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Deprecated
    public Collection<PACEInfo> getPACEInfos() {
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        for (SecurityInfo securityInfo : this.securityInfos) {
            if (securityInfo instanceof PACEInfo) {
                arrayList.add((PACEInfo) securityInfo);
            }
        }
        return arrayList;
    }

    public Collection<SecurityInfo> getSecurityInfos() {
        return Collections.unmodifiableCollection(this.securityInfos);
    }

    public int hashCode() {
        return (this.securityInfos.hashCode() * 3) + 63;
    }

    public void readContent(InputStream inputStream) {
        SignedData readSignedData = SignedDataUtil.readSignedData(inputStream);
        this.digestAlgorithm = SignedDataUtil.getSignerInfoDigestAlgorithm(readSignedData);
        this.digestEncryptionAlgorithm = SignedDataUtil.getDigestEncryptionAlgorithm(readSignedData);
        List<X509Certificate> certificates = SignedDataUtil.getCertificates(readSignedData);
        this.certificate = (certificates == null || certificates.isEmpty()) ? null : certificates.get(certificates.size() - 1);
        this.securityInfos = getSecurityInfos(readSignedData);
        this.encryptedDigest = SignedDataUtil.getEncryptedDigest(readSignedData);
    }

    public String toString() {
        return "CardSecurityFile [" + this.securityInfos.toString() + "]";
    }

    public void writeContent(OutputStream outputStream) {
        try {
            SignedDataUtil.writeData(SignedDataUtil.createSignedData(this.digestAlgorithm, this.digestEncryptionAlgorithm, CONTENT_TYPE_OID, toContentInfo(CONTENT_TYPE_OID, this.securityInfos), this.encryptedDigest, this.certificate), outputStream);
        } catch (NoSuchAlgorithmException e10) {
            throw new IOException("Unsupported algorithm", e10);
        } catch (CertificateException e11) {
            throw new IOException("Certificate exception during SignedData creation", e11);
        } catch (GeneralSecurityException e12) {
            throw new IOException("General security exception", e12);
        }
    }

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, PrivateKey privateKey, X509Certificate x509Certificate, String str3) {
        this(str, str2, collection, (byte[]) null, x509Certificate);
        this.encryptedDigest = SignedDataUtil.signData(str, str2, CONTENT_TYPE_OID, toContentInfo(CONTENT_TYPE_OID, collection), privateKey, str3);
    }

    private static Set<SecurityInfo> getSecurityInfos(SignedData signedData) {
        ASN1Primitive content = SignedDataUtil.getContent(signedData);
        if (!(content instanceof ASN1Set)) {
            throw new IOException("Was expecting an ASN1Set, found " + content.getClass());
        }
        ASN1Set aSN1Set = (ASN1Set) content;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < aSN1Set.size(); i++) {
            try {
                SecurityInfo securityInfo = SecurityInfo.getInstance(aSN1Set.getObjectAt(i).toASN1Primitive());
                if (securityInfo == null) {
                    LOGGER.log(Level.WARNING, "Could not parse, skipping security info");
                } else {
                    hashSet.add(securityInfo);
                }
            } catch (Exception e10) {
                LOGGER.log(Level.WARNING, "Exception while parsing, skipping security info", (Throwable) e10);
            }
        }
        return hashSet;
    }

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, byte[] bArr, X509Certificate x509Certificate) {
        if (collection == null) {
            throw new IllegalArgumentException("Null securityInfos");
        }
        if (x509Certificate != null) {
            this.digestAlgorithm = str;
            this.digestEncryptionAlgorithm = str2;
            this.securityInfos = new HashSet(collection);
            this.encryptedDigest = bArr;
            this.certificate = x509Certificate;
            return;
        }
        throw new IllegalArgumentException("Null certificate");
    }

    public CardSecurityFile(InputStream inputStream) {
        readContent(inputStream);
    }
}
