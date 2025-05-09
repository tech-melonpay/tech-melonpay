package org.jmrtd.lds;

import androidx.camera.core.impl.utils.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.cms.SignerIdentifier;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jmrtd.Util;
import s3.b;

/* loaded from: classes3.dex */
public final class SignedDataUtil {
    public static final String IEEE_P1363_SHA1_OID = "1.3.14.3.2.26";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final String PKCS1_MD2_WITH_RSA_OID = "1.2.840.113549.1.1.2";
    public static final String PKCS1_MD4_WITH_RSA_OID = "1.2.840.113549.1.1.3";
    public static final String PKCS1_MD5_WITH_RSA_OID = "1.2.840.113549.1.1.4";
    public static final String PKCS1_MGF1 = "1.2.840.113549.1.1.8";
    public static final String PKCS1_RSASSA_PSS_OID = "1.2.840.113549.1.1.10";
    public static final String PKCS1_RSA_OID = "1.2.840.113549.1.1.1";
    public static final String PKCS1_SHA1_WITH_RSA_OID = "1.2.840.113549.1.1.5";
    public static final String PKCS1_SHA224_WITH_RSA_OID = "1.2.840.113549.1.1.14";
    public static final String PKCS1_SHA256_WITH_RSA_OID = "1.2.840.113549.1.1.11";
    public static final String PKCS1_SHA384_WITH_RSA_OID = "1.2.840.113549.1.1.12";
    public static final String PKCS1_SHA512_WITH_RSA_OID = "1.2.840.113549.1.1.13";
    public static final String RFC_3369_CONTENT_TYPE_OID = "1.2.840.113549.1.9.3";
    public static final String RFC_3369_MESSAGE_DIGEST_OID = "1.2.840.113549.1.9.4";
    public static final String RFC_3369_SIGNED_DATA_OID = "1.2.840.113549.1.7.2";
    public static final String X9_SHA1_WITH_ECDSA_OID = "1.2.840.10045.4.1";
    public static final String X9_SHA224_WITH_ECDSA_OID = "1.2.840.10045.4.3.1";
    public static final String X9_SHA256_WITH_ECDSA_OID = "1.2.840.10045.4.3.2";
    public static final String X9_SHA384_WITH_ECDSA_OID = "1.2.840.10045.4.3.3";
    public static final String X9_SHA512_WITH_ECDSA_OID = "1.2.840.10045.4.3.4";

    private SignedDataUtil() {
    }

    private static void checkEContent(Collection<Attribute> collection, String str, byte[] bArr) {
        for (Attribute attribute : collection) {
            if (RFC_3369_MESSAGE_DIGEST_OID.equals(attribute.getAttrType().getId())) {
                ASN1Set attrValues = attribute.getAttrValues();
                if (attrValues.size() != 1) {
                    LOGGER.warning("Expected only one attribute value in signedAttribute message digest in eContent!");
                }
                byte[] octets = ((ASN1OctetString) attrValues.getObjectAt(0)).getOctets();
                if (octets == null) {
                    LOGGER.warning("Error extracting signedAttribute message digest in eContent!");
                }
                if (!Arrays.equals(octets, MessageDigest.getInstance(str).digest(bArr))) {
                    throw new SignatureException("Error checking signedAttribute message digest in eContent!");
                }
            }
        }
    }

    public static ASN1Set createAuthenticatedAttributes(String str, String str2, ContentInfo contentInfo) {
        if ("SHA256".equals(str)) {
            str = "SHA-256";
        }
        DEROctetString dEROctetString = new DEROctetString(Util.getMessageDigest(str).digest(((ASN1OctetString) contentInfo.getContent()).getOctets()));
        return new DLSet(new ASN1Object[]{new Attribute(new ASN1ObjectIdentifier(RFC_3369_CONTENT_TYPE_OID), createSingletonSet(new ASN1ObjectIdentifier(str2))).toASN1Primitive(), new Attribute(new ASN1ObjectIdentifier(RFC_3369_MESSAGE_DIGEST_OID), createSingletonSet(dEROctetString)).toASN1Primitive()});
    }

    public static ASN1Sequence createCertificate(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new IllegalArgumentException("Cannot encode null certificate");
        }
        try {
            ASN1InputStream aSN1InputStream = new ASN1InputStream(x509Certificate.getEncoded());
            try {
                return (ASN1Sequence) aSN1InputStream.readObject();
            } finally {
                try {
                    aSN1InputStream.close();
                } catch (IOException e10) {
                    LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e10);
                }
            }
        } catch (IOException e11) {
            throw new CertificateException("Could not construct certificate byte stream", e11);
        }
    }

    public static ASN1Sequence createDigestAlgorithms(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(lookupOIDByMnemonic(str));
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        return new DLSequence(aSN1EncodableVector);
    }

    public static SignedData createSignedData(String str, String str2, String str3, ContentInfo contentInfo, byte[] bArr, X509Certificate x509Certificate) {
        return createSignedData(str, str2, null, str3, contentInfo, bArr, x509Certificate);
    }

    public static SignerInfo createSignerInfo(String str, String str2, String str3, ContentInfo contentInfo, byte[] bArr, X509Certificate x509Certificate) {
        return createSignerInfo(str, str2, null, str3, contentInfo, bArr, x509Certificate);
    }

    private static ASN1Set createSingletonSet(ASN1Object aSN1Object) {
        return new DLSet(new ASN1Encodable[]{aSN1Object});
    }

    public static X509Certificate decodeCertificate(Certificate certificate) {
        return (X509Certificate) CertificateFactory.getInstance("X.509", Util.getBouncyCastleProvider()).generateCertificate(new ByteArrayInputStream(certificate.getEncoded(ASN1Encoding.DER)));
    }

    private static List<Attribute> getAttributes(ASN1Set aSN1Set) {
        ArrayList list = Collections.list(aSN1Set.getObjects());
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Attribute.getInstance((ASN1Sequence) it.next()));
        }
        return arrayList;
    }

    public static List<X509Certificate> getCertificates(SignedData signedData) {
        ASN1Set certificates = signedData.getCertificates();
        int size = certificates == null ? 0 : certificates.size();
        ArrayList arrayList = new ArrayList(size);
        if (size <= 0) {
            return arrayList;
        }
        for (int i = 0; i < size; i++) {
            try {
                arrayList.add(decodeCertificate(Certificate.getInstance(certificates.getObjectAt(i))));
            } catch (Exception e10) {
                LOGGER.log(Level.WARNING, "Exception in decoding certificate", (Throwable) e10);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.bouncycastle.asn1.ASN1Primitive getContent(org.bouncycastle.asn1.cms.SignedData r6) {
        /*
            java.lang.String r0 = "Exception closing input stream"
            org.bouncycastle.asn1.cms.ContentInfo r6 = r6.getEncapContentInfo()
            org.bouncycastle.asn1.ASN1Encodable r6 = r6.getContent()
            org.bouncycastle.asn1.ASN1OctetString r6 = (org.bouncycastle.asn1.ASN1OctetString) r6
            r1 = 0
            org.bouncycastle.asn1.ASN1InputStream r2 = new org.bouncycastle.asn1.ASN1InputStream     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            byte[] r6 = r6.getOctets()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            org.bouncycastle.asn1.ASN1Primitive r6 = r2.readObject()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r2.close()     // Catch: java.io.IOException -> L23
            goto L2b
        L23:
            r1 = move-exception
            java.util.logging.Logger r2 = org.jmrtd.lds.SignedDataUtil.LOGGER
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            r2.log(r3, r0, r1)
        L2b:
            return r6
        L2c:
            r6 = move-exception
            r1 = r2
            goto L4d
        L2f:
            r6 = move-exception
            goto L35
        L31:
            r6 = move-exception
            goto L4d
        L33:
            r6 = move-exception
            r2 = r1
        L35:
            java.util.logging.Logger r3 = org.jmrtd.lds.SignedDataUtil.LOGGER     // Catch: java.lang.Throwable -> L2c
            java.util.logging.Level r4 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = "Unexpected exception"
            r3.log(r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L44
            goto L4c
        L44:
            r6 = move-exception
            java.util.logging.Logger r2 = org.jmrtd.lds.SignedDataUtil.LOGGER
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            r2.log(r3, r0, r6)
        L4c:
            return r1
        L4d:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.io.IOException -> L53
            goto L5b
        L53:
            r1 = move-exception
            java.util.logging.Logger r2 = org.jmrtd.lds.SignedDataUtil.LOGGER
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            r2.log(r3, r0, r1)
        L5b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.SignedDataUtil.getContent(org.bouncycastle.asn1.cms.SignedData):org.bouncycastle.asn1.ASN1Primitive");
    }

    public static String getDigestEncryptionAlgorithm(SignedData signedData) {
        try {
            String id = getSignerInfo(signedData).getDigestEncryptionAlgorithm().getAlgorithm().getId();
            if (id != null) {
                return lookupMnemonicByOID(id);
            }
            LOGGER.warning("Could not determine digest encryption algorithm OID");
            return null;
        } catch (NoSuchAlgorithmException e10) {
            LOGGER.log(Level.WARNING, "No such algorithm", (Throwable) e10);
            return null;
        }
    }

    private static AlgorithmIdentifier getDigestEncryptionAlgorithmObject(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(lookupOIDByMnemonic(str));
        if (algorithmParameterSpec == null) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier);
        }
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(str);
            algorithmParameters.init(algorithmParameterSpec);
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, ASN1Primitive.fromByteArray(algorithmParameters.getEncoded()));
        } catch (IOException e10) {
            throw new InvalidAlgorithmParameterException("Unable to encode parameters object", e10);
        }
    }

    public static AlgorithmParameterSpec getDigestEncryptionAlgorithmParams(SignedData signedData) {
        try {
            AlgorithmIdentifier digestEncryptionAlgorithm = getSignerInfo(signedData).getDigestEncryptionAlgorithm();
            if (!PKCS1_RSASSA_PSS_OID.equals(digestEncryptionAlgorithm.getAlgorithm().getId())) {
                return null;
            }
            ASN1Encodable parameters = digestEncryptionAlgorithm.getParameters();
            if (parameters == null) {
                LOGGER.warning("Cannot get RSASSA/PSS parameters");
                return null;
            }
            RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(parameters);
            if (rSASSAPSSparams != null) {
                return toAlgorithmParameterSpec(rSASSAPSSparams);
            }
            LOGGER.warning("Cannot get RSASSA/PSS parameters");
            return null;
        } catch (Exception e10) {
            LOGGER.log(Level.WARNING, "Cannot get RSASSA/PSS parameters", (Throwable) e10);
            return null;
        }
    }

    public static byte[] getEContent(SignedData signedData) {
        SignerInfo signerInfo = getSignerInfo(signedData);
        ASN1Set authenticatedAttributes = signerInfo.getAuthenticatedAttributes();
        byte[] octets = ((ASN1OctetString) signedData.getEncapContentInfo().getContent()).getOctets();
        if (authenticatedAttributes.size() == 0) {
            return octets;
        }
        String id = signerInfo.getDigestAlgorithm().getAlgorithm().getId();
        try {
            byte[] encoded = authenticatedAttributes.getEncoded(ASN1Encoding.DER);
            checkEContent(getAttributes(authenticatedAttributes), id, octets);
            return encoded;
        } catch (Exception e10) {
            throw new SignatureException(e10);
        }
    }

    public static byte[] getEncryptedDigest(SignedData signedData) {
        return getSignerInfo(signedData).getEncryptedDigest().getOctets();
    }

    public static IssuerAndSerialNumber getIssuerAndSerialNumber(SignedData signedData) {
        ASN1Encodable id = getSignerInfo(signedData).getSID().getId();
        if (!(id instanceof ASN1Sequence) && !(id instanceof IssuerAndSerialNumber)) {
            return null;
        }
        IssuerAndSerialNumber issuerAndSerialNumber = IssuerAndSerialNumber.getInstance(id);
        return new IssuerAndSerialNumber(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue());
    }

    public static ASN1Primitive getObjectFromTaggedObject(ASN1Encodable aSN1Encodable) {
        if (!(aSN1Encodable instanceof ASN1TaggedObject)) {
            throw new IOException("Was expecting an ASN1TaggedObject, found " + aSN1Encodable.getClass().getCanonicalName());
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return aSN1TaggedObject.getObject();
        }
        throw new IOException(a.g(tagNo, new StringBuilder("Was expecting tag 0, found ")));
    }

    public static List<ASN1Primitive> getObjectsFromOctetString(ASN1OctetString aSN1OctetString) {
        ArrayList arrayList = new ArrayList();
        ASN1InputStream aSN1InputStream = new ASN1InputStream(new ByteArrayInputStream(aSN1OctetString.getOctets()));
        while (true) {
            try {
                ASN1Primitive readObject = aSN1InputStream.readObject();
                if (readObject == null) {
                    break;
                }
                arrayList.add(readObject);
            } catch (IOException e10) {
                LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
            }
        }
        aSN1InputStream.close();
        return arrayList;
    }

    public static SignerInfo getSignerInfo(SignedData signedData) {
        ASN1Set signerInfos = signedData.getSignerInfos();
        if (signerInfos == null || signerInfos.size() <= 0) {
            throw new IllegalArgumentException("No signer info in signed data");
        }
        if (signerInfos.size() > 1) {
            LOGGER.warning("Found " + signerInfos.size() + " signerInfos");
        }
        return SignerInfo.getInstance(signerInfos.getObjectAt(0));
    }

    public static String getSignerInfoDigestAlgorithm(SignedData signedData) {
        try {
            return lookupMnemonicByOID(getSignerInfo(signedData).getDigestAlgorithm().getAlgorithm().getId());
        } catch (NoSuchAlgorithmException e10) {
            LOGGER.log(Level.WARNING, "No such algorithm" + e10);
            return null;
        }
    }

    public static byte[] getSubjectKeyIdentifier(SignedData signedData) {
        ASN1Encodable id;
        SignerIdentifier sid = getSignerInfo(signedData).getSID();
        if (sid == null || (id = sid.getId()) == null || !(id instanceof ASN1OctetString)) {
            return null;
        }
        return ((ASN1OctetString) id).getOctets();
    }

    public static String lookupMnemonicByOID(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals(X509ObjectIdentifiers.organization.getId())) {
            return "O";
        }
        if (str.equals(X509ObjectIdentifiers.organizationalUnitName.getId())) {
            return "OU";
        }
        if (str.equals(X509ObjectIdentifiers.commonName.getId())) {
            return "CN";
        }
        if (str.equals(X509ObjectIdentifiers.countryName.getId())) {
            return "C";
        }
        if (str.equals(X509ObjectIdentifiers.stateOrProvinceName.getId())) {
            return "ST";
        }
        if (str.equals(X509ObjectIdentifiers.localityName.getId())) {
            return "L";
        }
        if (str.equals(X509ObjectIdentifiers.id_SHA1.getId())) {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }
        if (str.equals(NISTObjectIdentifiers.id_sha224.getId())) {
            return McElieceCCA2KeyGenParameterSpec.SHA224;
        }
        if (str.equals(NISTObjectIdentifiers.id_sha256.getId())) {
            return "SHA-256";
        }
        if (str.equals(NISTObjectIdentifiers.id_sha384.getId())) {
            return McElieceCCA2KeyGenParameterSpec.SHA384;
        }
        if (str.equals(NISTObjectIdentifiers.id_sha512.getId())) {
            return "SHA-512";
        }
        if (str.equals(X9_SHA1_WITH_ECDSA_OID)) {
            return "SHA1withECDSA";
        }
        if (str.equals(X9_SHA224_WITH_ECDSA_OID)) {
            return "SHA224withECDSA";
        }
        if (str.equals(X9_SHA256_WITH_ECDSA_OID)) {
            return "SHA256withECDSA";
        }
        if (str.equals(X9_SHA384_WITH_ECDSA_OID)) {
            return "SHA384withECDSA";
        }
        if (str.equals(X9_SHA512_WITH_ECDSA_OID)) {
            return "SHA512withECDSA";
        }
        if (str.equals(PKCS1_RSA_OID)) {
            return "RSA";
        }
        if (str.equals(PKCS1_MD2_WITH_RSA_OID)) {
            return "MD2withRSA";
        }
        if (str.equals(PKCS1_MD4_WITH_RSA_OID)) {
            return "MD4withRSA";
        }
        if (str.equals(PKCS1_MD5_WITH_RSA_OID)) {
            return "MD5withRSA";
        }
        if (str.equals(PKCS1_SHA1_WITH_RSA_OID)) {
            return "SHA1withRSA";
        }
        if (str.equals(PKCS1_SHA256_WITH_RSA_OID)) {
            return "SHA256withRSA";
        }
        if (str.equals(PKCS1_SHA384_WITH_RSA_OID)) {
            return "SHA384withRSA";
        }
        if (str.equals(PKCS1_SHA512_WITH_RSA_OID)) {
            return "SHA512withRSA";
        }
        if (str.equals(PKCS1_SHA224_WITH_RSA_OID)) {
            return "SHA224withRSA";
        }
        if (str.equals(IEEE_P1363_SHA1_OID)) {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }
        if (str.equals(PKCS1_RSASSA_PSS_OID)) {
            return "SSAwithRSA/PSS";
        }
        if (str.equals(PKCS1_MGF1)) {
            return "MGF1";
        }
        throw new NoSuchAlgorithmException("Unknown OID ".concat(str));
    }

    public static String lookupOIDByMnemonic(String str) {
        if ("O".equals(str)) {
            return X509ObjectIdentifiers.organization.getId();
        }
        if ("OU".equals(str)) {
            return X509ObjectIdentifiers.organizationalUnitName.getId();
        }
        if ("CN".equals(str)) {
            return X509ObjectIdentifiers.commonName.getId();
        }
        if ("C".equals(str)) {
            return X509ObjectIdentifiers.countryName.getId();
        }
        if ("ST".equals(str)) {
            return X509ObjectIdentifiers.stateOrProvinceName.getId();
        }
        if ("L".equals(str)) {
            return X509ObjectIdentifiers.localityName.getId();
        }
        if (McElieceCCA2KeyGenParameterSpec.SHA1.equalsIgnoreCase(str) || "SHA1".equalsIgnoreCase(str)) {
            return X509ObjectIdentifiers.id_SHA1.getId();
        }
        if (McElieceCCA2KeyGenParameterSpec.SHA224.equalsIgnoreCase(str) || "SHA224".equalsIgnoreCase(str)) {
            return NISTObjectIdentifiers.id_sha224.getId();
        }
        if ("SHA-256".equalsIgnoreCase(str) || "SHA256".equalsIgnoreCase(str)) {
            return NISTObjectIdentifiers.id_sha256.getId();
        }
        if (McElieceCCA2KeyGenParameterSpec.SHA384.equalsIgnoreCase(str) || "SHA384".equalsIgnoreCase(str)) {
            return NISTObjectIdentifiers.id_sha384.getId();
        }
        if ("SHA-512".equalsIgnoreCase(str) || "SHA512".equalsIgnoreCase(str)) {
            return NISTObjectIdentifiers.id_sha512.getId();
        }
        if ("RSA".equalsIgnoreCase(str)) {
            return PKCS1_RSA_OID;
        }
        if ("MD2withRSA".equalsIgnoreCase(str)) {
            return PKCS1_MD2_WITH_RSA_OID;
        }
        if ("MD4withRSA".equalsIgnoreCase(str)) {
            return PKCS1_MD4_WITH_RSA_OID;
        }
        if ("MD5withRSA".equalsIgnoreCase(str)) {
            return PKCS1_MD5_WITH_RSA_OID;
        }
        if ("SHA1withRSA".equalsIgnoreCase(str)) {
            return PKCS1_SHA1_WITH_RSA_OID;
        }
        if ("SHA256withRSA".equalsIgnoreCase(str)) {
            return PKCS1_SHA256_WITH_RSA_OID;
        }
        if ("SHA384withRSA".equalsIgnoreCase(str)) {
            return PKCS1_SHA384_WITH_RSA_OID;
        }
        if ("SHA512withRSA".equalsIgnoreCase(str)) {
            return PKCS1_SHA512_WITH_RSA_OID;
        }
        if ("SHA224withRSA".equalsIgnoreCase(str)) {
            return PKCS1_SHA224_WITH_RSA_OID;
        }
        if ("SHA1withECDSA".equalsIgnoreCase(str)) {
            return X9_SHA1_WITH_ECDSA_OID;
        }
        if ("SHA224withECDSA".equalsIgnoreCase(str)) {
            return X9_SHA224_WITH_ECDSA_OID;
        }
        if ("SHA256withECDSA".equalsIgnoreCase(str)) {
            return X9_SHA256_WITH_ECDSA_OID;
        }
        if ("SHA384withECDSA".equalsIgnoreCase(str)) {
            return X9_SHA384_WITH_ECDSA_OID;
        }
        if ("SHA512withECDSA".equalsIgnoreCase(str)) {
            return X9_SHA512_WITH_ECDSA_OID;
        }
        if ("SAwithRSA/PSS".equalsIgnoreCase(str) || "SSAwithRSA/PSS".equalsIgnoreCase(str) || "RSASSA-PSS".equalsIgnoreCase(str)) {
            return PKCS1_RSASSA_PSS_OID;
        }
        if ("MGF1".equalsIgnoreCase(str) || "SHA256withRSAandMGF1".equalsIgnoreCase(str) || "SHA512withRSAandMGF1".equalsIgnoreCase(str)) {
            return PKCS1_MGF1;
        }
        throw new NoSuchAlgorithmException(b.j("Unknown name ", str));
    }

    public static SignedData readSignedData(InputStream inputStream) {
        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(inputStream).readObject();
        if (aSN1Sequence.size() != 2) {
            throw new IOException(org.bouncycastle.asn1.a.i(aSN1Sequence, new StringBuilder("Was expecting a DER sequence of length 2, found a DER sequence of length ")));
        }
        String id = ((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0)).getId();
        if (!RFC_3369_SIGNED_DATA_OID.equals(id)) {
            throw new IOException(b.j("Was expecting signed-data content type OID (1.2.840.113549.1.7.2), found ", id));
        }
        ASN1Primitive objectFromTaggedObject = getObjectFromTaggedObject(aSN1Sequence.getObjectAt(1));
        if (objectFromTaggedObject instanceof ASN1Sequence) {
            return SignedData.getInstance(objectFromTaggedObject);
        }
        throw new IOException("Was expecting an ASN.1 sequence as content");
    }

    public static byte[] signData(String str, String str2, String str3, ContentInfo contentInfo, PrivateKey privateKey, String str4) {
        return signData(str, str2, null, str3, contentInfo, privateKey, str4);
    }

    private static AlgorithmParameterSpec toAlgorithmParameterSpec(RSASSAPSSparams rSASSAPSSparams) {
        if (rSASSAPSSparams == null) {
            return null;
        }
        String id = rSASSAPSSparams.getHashAlgorithm().getAlgorithm().getId();
        AlgorithmIdentifier maskGenAlgorithm = rSASSAPSSparams.getMaskGenAlgorithm();
        String id2 = maskGenAlgorithm.getAlgorithm().getId();
        String lookupMnemonicByOID = lookupMnemonicByOID(id);
        String lookupMnemonicByOID2 = lookupMnemonicByOID(id2);
        int intValue = rSASSAPSSparams.getSaltLength().intValue();
        int intValue2 = rSASSAPSSparams.getTrailerField().intValue();
        if (lookupMnemonicByOID != null && lookupMnemonicByOID2 != null && intValue >= 0 && intValue2 >= 0) {
            return new PSSParameterSpec(lookupMnemonicByOID, lookupMnemonicByOID2, toMaskGenAlgorithmParameterSpec(maskGenAlgorithm), intValue, intValue2);
        }
        LOGGER.warning("Cannot get RSASSA/PSS parameters");
        return null;
    }

    private static AlgorithmParameterSpec toMaskGenAlgorithmParameterSpec(AlgorithmIdentifier algorithmIdentifier) {
        try {
            ASN1Encodable parameters = algorithmIdentifier.getParameters();
            if (parameters != null) {
                return new MGF1ParameterSpec(lookupMnemonicByOID(AlgorithmIdentifier.getInstance(parameters).getAlgorithm().getId()));
            }
        } catch (Exception e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
        }
        return new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA1);
    }

    public static void writeData(SignedData signedData, OutputStream outputStream) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(RFC_3369_SIGNED_DATA_OID));
        aSN1EncodableVector.add(new DERTaggedObject(0, signedData));
        outputStream.write(new DLSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER));
    }

    public static SignedData createSignedData(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, String str3, ContentInfo contentInfo, byte[] bArr, X509Certificate x509Certificate) {
        return new SignedData(createSingletonSet(createDigestAlgorithms(str)), contentInfo, createSingletonSet(createCertificate(x509Certificate)), null, createSingletonSet(createSignerInfo(str, str2, algorithmParameterSpec, str3, contentInfo, bArr, x509Certificate).toASN1Primitive()));
    }

    public static SignerInfo createSignerInfo(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, String str3, ContentInfo contentInfo, byte[] bArr, X509Certificate x509Certificate) {
        if (bArr == null) {
            throw new IllegalArgumentException("Encrypted digest cannot be null");
        }
        return new SignerInfo(new SignerIdentifier(new IssuerAndSerialNumber(X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded()), x509Certificate.getSerialNumber())), new AlgorithmIdentifier(new ASN1ObjectIdentifier(lookupOIDByMnemonic(str))), createAuthenticatedAttributes(str, str3, contentInfo), getDigestEncryptionAlgorithmObject(str2, algorithmParameterSpec), new DEROctetString(bArr), (ASN1Set) null);
    }

    public static byte[] signData(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, String str3, ContentInfo contentInfo, PrivateKey privateKey, String str4) {
        try {
            byte[] encoded = createAuthenticatedAttributes(str, str3, contentInfo).getEncoded(ASN1Encoding.DER);
            Signature signature = str4 != null ? Signature.getInstance(str2, str4) : Signature.getInstance(str2);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.initSign(privateKey);
            signature.update(encoded);
            return signature.sign();
        } catch (Exception e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
            return null;
        }
    }
}
