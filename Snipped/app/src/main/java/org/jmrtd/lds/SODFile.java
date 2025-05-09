package org.jmrtd.lds;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.icao.DataGroupHash;
import org.bouncycastle.asn1.icao.LDSSecurityObject;
import org.bouncycastle.asn1.icao.LDSVersionInfo;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes3.dex */
public class SODFile extends AbstractTaggedLDSFile {
    private static final String ICAO_LDS_SOD_ALT_OID = "1.3.27.1.1.1";
    private static final String ICAO_LDS_SOD_OID = "2.23.136.1.1.1";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final String SDU_LDS_SOD_OID = "1.2.528.1.1006.1.20.1";
    private static final long serialVersionUID = -1081347374739311111L;
    private transient SignedData signedData;

    public SODFile(String str, String str2, Map<Integer, byte[]> map, PrivateKey privateKey, X509Certificate x509Certificate) {
        this(str, str2, map, privateKey, x509Certificate, (String) null);
    }

    private static LDSSecurityObject getLDSSecurityObject(SignedData signedData) {
        try {
            ContentInfo encapContentInfo = signedData.getEncapContentInfo();
            String id = encapContentInfo.getContentType().getId();
            ASN1OctetString aSN1OctetString = (ASN1OctetString) encapContentInfo.getContent();
            if (!ICAO_LDS_SOD_OID.equals(id) && !SDU_LDS_SOD_OID.equals(id) && !ICAO_LDS_SOD_ALT_OID.equals(id)) {
                LOGGER.warning("SignedData does not appear to contain an LDS SOd. (content type is " + id + ", was expecting 2.23.136.1.1.1)");
            }
            ASN1InputStream aSN1InputStream = new ASN1InputStream(new ByteArrayInputStream(aSN1OctetString.getOctets()));
            try {
                ASN1Primitive readObject = aSN1InputStream.readObject();
                if (!(readObject instanceof ASN1Sequence)) {
                    throw new IllegalStateException("Expected ASN1Sequence, found ".concat(readObject.getClass().getSimpleName()));
                }
                LDSSecurityObject lDSSecurityObject = LDSSecurityObject.getInstance(readObject);
                if (aSN1InputStream.readObject() != null) {
                    LOGGER.warning("Ignoring extra object found after LDSSecurityObject...");
                }
                return lDSSecurityObject;
            } finally {
                aSN1InputStream.close();
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Could not read security object in signedData", e10);
        }
    }

    private static ContentInfo toContentInfo(String str, String str2, Map<Integer, byte[]> map, String str3, String str4) {
        DataGroupHash[] dataGroupHashArr = new DataGroupHash[map.size()];
        Iterator<Map.Entry<Integer, byte[]>> it = map.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer key = it.next().getKey();
            dataGroupHashArr[i] = new DataGroupHash(key.intValue(), new DEROctetString(map.get(key)));
            i++;
        }
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(new ASN1ObjectIdentifier(SignedDataUtil.lookupOIDByMnemonic(str2)));
        return new ContentInfo(new ASN1ObjectIdentifier(str), new DEROctetString(str3 == null ? new LDSSecurityObject(algorithmIdentifier, dataGroupHashArr) : new LDSSecurityObject(algorithmIdentifier, dataGroupHashArr, new LDSVersionInfo(str3, str4))));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass().equals(getClass())) {
            return Arrays.equals(getEncoded(), ((SODFile) obj).getEncoded());
        }
        return false;
    }

    public Map<Integer, byte[]> getDataGroupHashes() {
        DataGroupHash[] datagroupHash = getLDSSecurityObject(this.signedData).getDatagroupHash();
        TreeMap treeMap = new TreeMap();
        for (DataGroupHash dataGroupHash : datagroupHash) {
            treeMap.put(Integer.valueOf(dataGroupHash.getDataGroupNumber()), dataGroupHash.getDataGroupHashValue().getOctets());
        }
        return treeMap;
    }

    public String getDigestAlgorithm() {
        return getDigestAlgorithm(getLDSSecurityObject(this.signedData));
    }

    public String getDigestEncryptionAlgorithm() {
        return SignedDataUtil.getDigestEncryptionAlgorithm(this.signedData);
    }

    public AlgorithmParameterSpec getDigestEncryptionAlgorithmParams() {
        return SignedDataUtil.getDigestEncryptionAlgorithmParams(this.signedData);
    }

    public X509Certificate getDocSigningCertificate() {
        List<X509Certificate> docSigningCertificates = getDocSigningCertificates();
        if (docSigningCertificates == null || docSigningCertificates.isEmpty()) {
            return null;
        }
        return docSigningCertificates.get(docSigningCertificates.size() - 1);
    }

    public List<X509Certificate> getDocSigningCertificates() {
        return SignedDataUtil.getCertificates(this.signedData);
    }

    public byte[] getEContent() {
        return SignedDataUtil.getEContent(this.signedData);
    }

    public byte[] getEncryptedDigest() {
        return SignedDataUtil.getEncryptedDigest(this.signedData);
    }

    public X500Principal getIssuerX500Principal() {
        X500Name name;
        try {
            IssuerAndSerialNumber issuerAndSerialNumber = SignedDataUtil.getIssuerAndSerialNumber(this.signedData);
            if (issuerAndSerialNumber == null || (name = issuerAndSerialNumber.getName()) == null) {
                return null;
            }
            return new X500Principal(name.getEncoded(ASN1Encoding.DER));
        } catch (IOException e10) {
            LOGGER.log(Level.WARNING, "Could not get issuer", (Throwable) e10);
            return null;
        }
    }

    public String getLDSVersion() {
        LDSVersionInfo versionInfo = getLDSSecurityObject(this.signedData).getVersionInfo();
        if (versionInfo == null) {
            return null;
        }
        return versionInfo.getLdsVersion();
    }

    public BigInteger getSerialNumber() {
        IssuerAndSerialNumber issuerAndSerialNumber = SignedDataUtil.getIssuerAndSerialNumber(this.signedData);
        if (issuerAndSerialNumber == null) {
            return null;
        }
        return issuerAndSerialNumber.getSerialNumber().getValue();
    }

    public String getSignerInfoDigestAlgorithm() {
        return SignedDataUtil.getSignerInfoDigestAlgorithm(this.signedData);
    }

    public byte[] getSubjectKeyIdentifier() {
        return SignedDataUtil.getSubjectKeyIdentifier(this.signedData);
    }

    public String getUnicodeVersion() {
        LDSVersionInfo versionInfo = getLDSSecurityObject(this.signedData).getVersionInfo();
        if (versionInfo == null) {
            return null;
        }
        return versionInfo.getUnicodeVersion();
    }

    public int hashCode() {
        return (Arrays.hashCode(getEncoded()) * 11) + 111;
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void readContent(InputStream inputStream) {
        this.signedData = SignedDataUtil.readSignedData(inputStream);
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SODFile ");
            Iterator<X509Certificate> it = getDocSigningCertificates().iterator();
            while (it.hasNext()) {
                sb2.append(it.next().getIssuerX500Principal().getName());
                sb2.append(", ");
            }
            return sb2.toString();
        } catch (Exception e10) {
            LOGGER.log(Level.WARNING, "Unexpected exception", (Throwable) e10);
            return "SODFile";
        }
    }

    @Override // org.jmrtd.lds.AbstractTaggedLDSFile
    public void writeContent(OutputStream outputStream) {
        SignedDataUtil.writeData(this.signedData, outputStream);
    }

    public SODFile(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, Map<Integer, byte[]> map, PrivateKey privateKey, X509Certificate x509Certificate) {
        this(str, str2, algorithmParameterSpec, map, privateKey, x509Certificate, null);
    }

    private static String getDigestAlgorithm(LDSSecurityObject lDSSecurityObject) {
        try {
            return SignedDataUtil.lookupMnemonicByOID(lDSSecurityObject.getDigestAlgorithmIdentifier().getAlgorithm().getId());
        } catch (NoSuchAlgorithmException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
            return null;
        }
    }

    public SODFile(String str, String str2, Map<Integer, byte[]> map, PrivateKey privateKey, X509Certificate x509Certificate, String str3) {
        this(str, str2, map, privateKey, x509Certificate, str3, null, null);
    }

    public SODFile(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, Map<Integer, byte[]> map, PrivateKey privateKey, X509Certificate x509Certificate, String str3) {
        this(str, str2, algorithmParameterSpec, map, privateKey, x509Certificate, str3, null, null);
    }

    public SODFile(String str, String str2, Map<Integer, byte[]> map, PrivateKey privateKey, X509Certificate x509Certificate, String str3, String str4, String str5) {
        super(119);
        try {
            ContentInfo contentInfo = toContentInfo(ICAO_LDS_SOD_OID, str, map, str4, str5);
            this.signedData = SignedDataUtil.createSignedData(str, str2, ICAO_LDS_SOD_OID, contentInfo, SignedDataUtil.signData(str, str2, ICAO_LDS_SOD_OID, contentInfo, privateKey, str3), x509Certificate);
        } catch (IOException e10) {
            throw new IllegalArgumentException("Error creating signedData", e10);
        }
    }

    public SODFile(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, Map<Integer, byte[]> map, PrivateKey privateKey, X509Certificate x509Certificate, String str3, String str4, String str5) {
        super(119);
        try {
            ContentInfo contentInfo = toContentInfo(ICAO_LDS_SOD_OID, str, map, str4, str5);
            this.signedData = SignedDataUtil.createSignedData(str, str2, algorithmParameterSpec, ICAO_LDS_SOD_OID, contentInfo, SignedDataUtil.signData(str, str2, algorithmParameterSpec, ICAO_LDS_SOD_OID, contentInfo, privateKey, str3), x509Certificate);
        } catch (IOException e10) {
            throw new IllegalArgumentException("Error creating signedData", e10);
        }
    }

    public SODFile(String str, String str2, Map<Integer, byte[]> map, byte[] bArr, X509Certificate x509Certificate) {
        super(119);
        if (map != null) {
            try {
                this.signedData = SignedDataUtil.createSignedData(str, str2, ICAO_LDS_SOD_OID, toContentInfo(ICAO_LDS_SOD_OID, str, map, null, null), bArr, x509Certificate);
                return;
            } catch (IOException e10) {
                throw new IllegalArgumentException("Error creating signedData", e10);
            }
        }
        throw new IllegalArgumentException("Cannot construct security object from null datagroup hashes");
    }

    public SODFile(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, Map<Integer, byte[]> map, byte[] bArr, X509Certificate x509Certificate) {
        super(119);
        if (map != null) {
            try {
                this.signedData = SignedDataUtil.createSignedData(str, str2, algorithmParameterSpec, ICAO_LDS_SOD_OID, toContentInfo(ICAO_LDS_SOD_OID, str, map, null, null), bArr, x509Certificate);
                return;
            } catch (IOException e10) {
                throw new IllegalArgumentException("Error creating signedData", e10);
            }
        }
        throw new IllegalArgumentException("Cannot construct security object from null datagroup hashes");
    }

    public SODFile(InputStream inputStream) {
        super(119, inputStream);
        SignedDataUtil.getSignerInfo(this.signedData);
    }
}
