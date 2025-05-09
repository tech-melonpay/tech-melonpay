package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.TlsVerifier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Shorts;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
public class TlsUtils {
    private static byte[] DOWNGRADE_TLS11 = Hex.decode("444F574E47524400");
    private static byte[] DOWNGRADE_TLS12 = Hex.decode("444F574E47524401");
    private static final Hashtable CERT_SIG_ALG_OIDS = createCertSigAlgOIDs();
    public static final byte[] EMPTY_BYTES = new byte[0];
    public static final short[] EMPTY_SHORTS = new short[0];
    public static final int[] EMPTY_INTS = new int[0];
    public static final long[] EMPTY_LONGS = new long[0];
    public static final Integer EXT_signature_algorithms = TlsExtensionsUtils.EXT_signature_algorithms;
    public static final Integer EXT_signature_algorithms_cert = TlsExtensionsUtils.EXT_signature_algorithms_cert;
    protected static short MINIMUM_HASH_STRICT = 2;
    protected static short MINIMUM_HASH_PREFERRED = 4;

    public static TlsSecret PRF(SecurityParameters securityParameters, TlsSecret tlsSecret, String str, byte[] bArr, int i) {
        return tlsSecret.deriveUsingPRF(securityParameters.getPrfAlgorithm(), str, bArr, i);
    }

    private static void addCertSigAlgOID(Hashtable hashtable, ASN1ObjectIdentifier aSN1ObjectIdentifier, short s10, short s11) {
        hashtable.put(aSN1ObjectIdentifier.getId(), SignatureAndHashAlgorithm.getInstance(s10, s11));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Hashtable addEarlyKeySharesToClientHello(org.bouncycastle.tls.TlsContext r11, org.bouncycastle.tls.TlsClient r12, java.util.Hashtable r13) {
        /*
            org.bouncycastle.tls.ProtocolVersion r0 = r11.getClientVersion()
            boolean r0 = isTLSv13(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            int[] r0 = org.bouncycastle.tls.TlsExtensionsUtils.getSupportedGroupsExtension(r13)
            if (r0 == 0) goto La5
            int r2 = r0.length
            r3 = 1
            if (r2 >= r3) goto L18
            goto La5
        L18:
            java.util.Vector r12 = r12.getEarlyKeyShareGroups()
            if (r12 == 0) goto La5
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L26
            goto La5
        L26:
            org.bouncycastle.tls.crypto.TlsCrypto r11 = r11.getCrypto()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            java.util.Hashtable r4 = new java.util.Hashtable
            r4.<init>()
            r5 = 0
        L35:
            int r6 = r0.length
            if (r5 >= r6) goto L9a
            r6 = r0[r5]
            java.lang.Integer r7 = org.bouncycastle.util.Integers.valueOf(r6)
            boolean r8 = r12.contains(r7)
            if (r8 == 0) goto L97
            boolean r8 = r4.containsKey(r7)
            if (r8 != 0) goto L97
            boolean r8 = r11.hasNamedGroup(r6)
            if (r8 != 0) goto L51
            goto L97
        L51:
            boolean r8 = org.bouncycastle.tls.NamedGroup.refersToASpecificCurve(r6)
            if (r8 == 0) goto L6b
            boolean r8 = r11.hasECDHAgreement()
            if (r8 == 0) goto L85
            org.bouncycastle.tls.crypto.TlsECConfig r8 = new org.bouncycastle.tls.crypto.TlsECConfig
            r8.<init>(r6)
            org.bouncycastle.tls.crypto.TlsECDomain r8 = r11.createECDomain(r8)
            org.bouncycastle.tls.crypto.TlsAgreement r8 = r8.createECDH()
            goto L86
        L6b:
            boolean r8 = org.bouncycastle.tls.NamedGroup.refersToASpecificFiniteField(r6)
            if (r8 == 0) goto L85
            boolean r8 = r11.hasDHAgreement()
            if (r8 == 0) goto L85
            org.bouncycastle.tls.crypto.TlsDHConfig r8 = new org.bouncycastle.tls.crypto.TlsDHConfig
            r8.<init>(r6, r3)
            org.bouncycastle.tls.crypto.TlsDHDomain r8 = r11.createDHDomain(r8)
            org.bouncycastle.tls.crypto.TlsAgreement r8 = r8.createDH()
            goto L86
        L85:
            r8 = r1
        L86:
            if (r8 == 0) goto L97
            byte[] r9 = r8.generateEphemeral()
            org.bouncycastle.tls.KeyShareEntry r10 = new org.bouncycastle.tls.KeyShareEntry
            r10.<init>(r6, r9)
            r2.addElement(r10)
            r4.put(r7, r8)
        L97:
            int r5 = r5 + 1
            goto L35
        L9a:
            boolean r11 = r4.isEmpty()
            if (r11 == 0) goto La1
            return r1
        La1:
            org.bouncycastle.tls.TlsExtensionsUtils.addKeyShareClientHello(r13, r2)
            return r4
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tls.TlsUtils.addEarlyKeySharesToClientHello(org.bouncycastle.tls.TlsContext, org.bouncycastle.tls.TlsClient, java.util.Hashtable):java.util.Hashtable");
    }

    public static void addIfSupported(Vector vector, TlsCrypto tlsCrypto, int i) {
        if (tlsCrypto.hasNamedGroup(i)) {
            vector.addElement(Integers.valueOf(i));
        }
    }

    public static void addSignatureAlgorithmsExtension(Hashtable hashtable, Vector vector) {
        TlsExtensionsUtils.addSignatureAlgorithmsExtension(hashtable, vector);
    }

    public static boolean addToSet(Vector vector, int i) {
        boolean z10 = !vector.contains(Integers.valueOf(i));
        if (z10) {
            vector.add(Integers.valueOf(i));
        }
        return z10;
    }

    public static byte[] calculateEndPointHash(TlsContext tlsContext, String str, byte[] bArr) {
        return calculateEndPointHash(tlsContext, str, bArr, 0, bArr.length);
    }

    public static byte[] calculateExporterSeed(SecurityParameters securityParameters, byte[] bArr) {
        byte[] clientRandom = securityParameters.getClientRandom();
        byte[] serverRandom = securityParameters.getServerRandom();
        if (bArr == null) {
            return Arrays.concatenate(clientRandom, serverRandom);
        }
        if (!isValidUint16(bArr.length)) {
            throw new IllegalArgumentException("'context_value' must have length less than 2^16 (or be null)");
        }
        byte[] bArr2 = new byte[2];
        writeUint16(bArr.length, bArr2, 0);
        return Arrays.concatenate(clientRandom, serverRandom, bArr2, bArr);
    }

    public static TlsSecret calculateMasterSecret(TlsContext tlsContext, TlsSecret tlsSecret) {
        byte[] concat;
        String str;
        SecurityParameters securityParametersHandshake = tlsContext.getSecurityParametersHandshake();
        if (securityParametersHandshake.isExtendedMasterSecret()) {
            concat = securityParametersHandshake.getSessionHash();
            str = ExporterLabel.extended_master_secret;
        } else {
            concat = concat(securityParametersHandshake.getClientRandom(), securityParametersHandshake.getServerRandom());
            str = "master secret";
        }
        return PRF(tlsContext, tlsSecret, str, concat, 48);
    }

    public static byte[] calculateSignatureHash(TlsContext tlsContext, SignatureAndHashAlgorithm signatureAndHashAlgorithm, DigestInputBuffer digestInputBuffer) {
        TlsCrypto crypto = tlsContext.getCrypto();
        TlsHash combinedHash = signatureAndHashAlgorithm == null ? new CombinedHash(crypto) : crypto.createHash(signatureAndHashAlgorithm.getHash());
        SecurityParameters securityParametersHandshake = tlsContext.getSecurityParametersHandshake();
        byte[] clientRandom = securityParametersHandshake.getClientRandom();
        byte[] serverRandom = securityParametersHandshake.getServerRandom();
        combinedHash.update(clientRandom, 0, clientRandom.length);
        combinedHash.update(serverRandom, 0, serverRandom.length);
        digestInputBuffer.updateDigest(combinedHash);
        return combinedHash.calculateHash();
    }

    public static byte[] calculateTLSVerifyData(TlsContext tlsContext, String str, byte[] bArr) {
        SecurityParameters securityParametersHandshake = tlsContext.getSecurityParametersHandshake();
        return PRF(tlsContext, securityParametersHandshake.getMasterSecret(), str, bArr, securityParametersHandshake.getVerifyDataLength()).extract();
    }

    public static void checkDowngradeMarker(ProtocolVersion protocolVersion, byte[] bArr) {
        ProtocolVersion equivalentTLSVersion = protocolVersion.getEquivalentTLSVersion();
        if (equivalentTLSVersion.isEqualOrEarlierVersionOf(ProtocolVersion.TLSv11)) {
            checkDowngradeMarker(bArr, DOWNGRADE_TLS11);
        }
        if (equivalentTLSVersion.isEqualOrEarlierVersionOf(ProtocolVersion.TLSv12)) {
            checkDowngradeMarker(bArr, DOWNGRADE_TLS12);
        }
    }

    public static void checkSigAlgOfClientCerts(TlsContext tlsContext, Certificate certificate, CertificateRequest certificateRequest) {
        Vector supportedSignatureAlgorithms = certificateRequest.getSupportedSignatureAlgorithms();
        for (int i = 0; i < certificate.getLength(); i++) {
            SignatureAndHashAlgorithm certSigAndHashAlg = getCertSigAndHashAlg(certificate.getCertificateAt(i).getSigAlgOID());
            if (certSigAndHashAlg != null) {
                if (supportedSignatureAlgorithms == null) {
                    for (short s10 : certificateRequest.getCertificateTypes()) {
                        if (certSigAndHashAlg.getSignature() == getLegacySignatureAlgorithmClientCert(s10)) {
                            break;
                        }
                    }
                } else if (containsSignatureAlgorithm(supportedSignatureAlgorithms, certSigAndHashAlg)) {
                }
            }
            throw new TlsFatalAlert((short) 42);
        }
    }

    public static void checkSigAlgOfServerCerts(TlsContext tlsContext, Certificate certificate) {
        SecurityParameters securityParametersHandshake = tlsContext.getSecurityParametersHandshake();
        Vector clientSigAlgsCert = securityParametersHandshake.getClientSigAlgsCert();
        for (int i = 0; i < certificate.getLength(); i++) {
            SignatureAndHashAlgorithm certSigAndHashAlg = getCertSigAndHashAlg(certificate.getCertificateAt(i).getSigAlgOID());
            if (certSigAndHashAlg != null) {
                if (clientSigAlgsCert == null) {
                    if (getLegacySignatureAlgorithmServerCert(securityParametersHandshake.getKeyExchangeAlgorithm()) == certSigAndHashAlg.getSignature()) {
                    }
                } else if (containsSignatureAlgorithm(clientSigAlgsCert, certSigAndHashAlg)) {
                }
            }
            throw new TlsFatalAlert((short) 42);
        }
    }

    public static void checkTlsFeatures(Certificate certificate, Hashtable hashtable, Hashtable hashtable2) {
        byte[] extension = certificate.getCertificateAt(0).getExtension(TlsObjectIdentifiers.id_pe_tlsfeature);
        if (extension != null) {
            Enumeration objects = ((ASN1Sequence) readDERObject(extension)).getObjects();
            while (objects.hasMoreElements()) {
                BigInteger positiveValue = ((ASN1Integer) objects.nextElement()).getPositiveValue();
                if (positiveValue.bitLength() <= 16) {
                    Integer valueOf = Integers.valueOf(positiveValue.intValue());
                    if (hashtable.containsKey(valueOf) && !hashtable2.containsKey(valueOf)) {
                        throw new TlsFatalAlert((short) 46);
                    }
                }
            }
        }
    }

    public static void checkUint16(int i) {
        if (!isValidUint16(i)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint24(int i) {
        if (!isValidUint24(i)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint32(long j10) {
        if (!isValidUint32(j10)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint48(long j10) {
        if (!isValidUint48(j10)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint64(long j10) {
        if (!isValidUint64(j10)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint8(int i) {
        if (!isValidUint8(i)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static SignatureAndHashAlgorithm chooseSignatureAndHashAlgorithm(TlsContext tlsContext, Vector vector, short s10) {
        short hash;
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = null;
        if (!isTLSv12(tlsContext)) {
            return null;
        }
        if (vector == null) {
            vector = getDefaultSignatureAlgorithms(s10);
        }
        for (int i = 0; i < vector.size(); i++) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm2 = (SignatureAndHashAlgorithm) vector.elementAt(i);
            if (signatureAndHashAlgorithm2.getSignature() == s10 && (hash = signatureAndHashAlgorithm2.getHash()) >= MINIMUM_HASH_STRICT) {
                if (signatureAndHashAlgorithm != null) {
                    short hash2 = signatureAndHashAlgorithm.getHash();
                    short s11 = MINIMUM_HASH_PREFERRED;
                    if (hash2 < s11) {
                        if (hash <= hash2) {
                        }
                    } else if (hash >= s11) {
                        if (hash >= hash2) {
                        }
                    }
                }
                signatureAndHashAlgorithm = signatureAndHashAlgorithm2;
            }
        }
        if (signatureAndHashAlgorithm != null) {
            return signatureAndHashAlgorithm;
        }
        throw new TlsFatalAlert((short) 80);
    }

    public static byte[] concat(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean contains(int[] iArr, int i, int i9, int i10) {
        for (int i11 = 0; i11 < i9; i11++) {
            if (i10 == iArr[i + i11]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsAll(short[] sArr, short[] sArr2) {
        for (short s10 : sArr2) {
            if (!Arrays.contains(sArr, s10)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsAnySignatureAlgorithm(Vector vector, short s10) {
        for (int i = 0; i < vector.size(); i++) {
            if (((SignatureAndHashAlgorithm) vector.elementAt(i)).getSignature() == s10) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNonAscii(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 128) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSignatureAlgorithm(Vector vector, SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        for (int i = 0; i < vector.size(); i++) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm2 = (SignatureAndHashAlgorithm) vector.elementAt(i);
            if (signatureAndHashAlgorithm2.getHash() == signatureAndHashAlgorithm.getHash() && signatureAndHashAlgorithm2.getSignature() == signatureAndHashAlgorithm.getSignature()) {
                return true;
            }
        }
        return false;
    }

    public static byte[] copyOfRangeExact(byte[] bArr, int i, int i9) {
        int i10 = i9 - i;
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i, bArr2, 0, i10);
        return bArr2;
    }

    private static Hashtable createCertSigAlgOIDs() {
        Hashtable hashtable = new Hashtable();
        addCertSigAlgOID(hashtable, NISTObjectIdentifiers.dsa_with_sha224, (short) 3, (short) 2);
        addCertSigAlgOID(hashtable, NISTObjectIdentifiers.dsa_with_sha256, (short) 4, (short) 2);
        addCertSigAlgOID(hashtable, NISTObjectIdentifiers.dsa_with_sha384, (short) 5, (short) 2);
        addCertSigAlgOID(hashtable, NISTObjectIdentifiers.dsa_with_sha512, (short) 6, (short) 2);
        addCertSigAlgOID(hashtable, OIWObjectIdentifiers.dsaWithSHA1, (short) 2, (short) 2);
        addCertSigAlgOID(hashtable, OIWObjectIdentifiers.sha1WithRSA, (short) 2, (short) 1);
        addCertSigAlgOID(hashtable, PKCSObjectIdentifiers.sha1WithRSAEncryption, (short) 2, (short) 1);
        addCertSigAlgOID(hashtable, PKCSObjectIdentifiers.sha224WithRSAEncryption, (short) 3, (short) 1);
        addCertSigAlgOID(hashtable, PKCSObjectIdentifiers.sha256WithRSAEncryption, (short) 4, (short) 1);
        addCertSigAlgOID(hashtable, PKCSObjectIdentifiers.sha384WithRSAEncryption, (short) 5, (short) 1);
        addCertSigAlgOID(hashtable, PKCSObjectIdentifiers.sha512WithRSAEncryption, (short) 6, (short) 1);
        addCertSigAlgOID(hashtable, X9ObjectIdentifiers.ecdsa_with_SHA1, (short) 2, (short) 3);
        addCertSigAlgOID(hashtable, X9ObjectIdentifiers.ecdsa_with_SHA224, (short) 3, (short) 3);
        addCertSigAlgOID(hashtable, X9ObjectIdentifiers.ecdsa_with_SHA256, (short) 4, (short) 3);
        addCertSigAlgOID(hashtable, X9ObjectIdentifiers.ecdsa_with_SHA384, (short) 5, (short) 3);
        addCertSigAlgOID(hashtable, X9ObjectIdentifiers.ecdsa_with_SHA512, (short) 6, (short) 3);
        addCertSigAlgOID(hashtable, X9ObjectIdentifiers.id_dsa_with_sha1, (short) 2, (short) 2);
        addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_ECDSA_SHA_1, (short) 2, (short) 3);
        addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_ECDSA_SHA_224, (short) 3, (short) 3);
        addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_ECDSA_SHA_256, (short) 4, (short) 3);
        addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_ECDSA_SHA_384, (short) 5, (short) 3);
        addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_ECDSA_SHA_512, (short) 6, (short) 3);
        addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, (short) 2, (short) 1);
        addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, (short) 4, (short) 1);
        addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256, (short) 8, (short) 9);
        addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_RSA_PSS_SHA_512, (short) 8, (short) 11);
        addCertSigAlgOID(hashtable, BSIObjectIdentifiers.ecdsa_plain_SHA1, (short) 2, (short) 3);
        addCertSigAlgOID(hashtable, BSIObjectIdentifiers.ecdsa_plain_SHA224, (short) 3, (short) 3);
        addCertSigAlgOID(hashtable, BSIObjectIdentifiers.ecdsa_plain_SHA256, (short) 4, (short) 3);
        addCertSigAlgOID(hashtable, BSIObjectIdentifiers.ecdsa_plain_SHA384, (short) 5, (short) 3);
        addCertSigAlgOID(hashtable, BSIObjectIdentifiers.ecdsa_plain_SHA512, (short) 6, (short) 3);
        addCertSigAlgOID(hashtable, EdECObjectIdentifiers.id_Ed25519, (short) 8, (short) 7);
        addCertSigAlgOID(hashtable, EdECObjectIdentifiers.id_Ed448, (short) 8, (short) 8);
        return hashtable;
    }

    private static TlsKeyExchange createKeyExchangeClient(TlsClient tlsClient, int i) {
        TlsKeyExchangeFactory keyExchangeFactory = tlsClient.getKeyExchangeFactory();
        if (i == 1) {
            return keyExchangeFactory.createRSAKeyExchange(i);
        }
        if (i == 3 || i == 5) {
            return keyExchangeFactory.createDHEKeyExchangeClient(i, tlsClient.getDHGroupVerifier());
        }
        if (i == 7 || i == 9) {
            return keyExchangeFactory.createDHKeyExchange(i);
        }
        if (i == 11) {
            return keyExchangeFactory.createDHanonKeyExchangeClient(i, tlsClient.getDHGroupVerifier());
        }
        switch (i) {
            case 13:
            case 15:
            case 24:
                return keyExchangeFactory.createPSKKeyExchangeClient(i, tlsClient.getPSKIdentity(), null);
            case 14:
                return keyExchangeFactory.createPSKKeyExchangeClient(i, tlsClient.getPSKIdentity(), tlsClient.getDHGroupVerifier());
            case 16:
            case 18:
                return keyExchangeFactory.createECDHKeyExchange(i);
            case 17:
            case 19:
                return keyExchangeFactory.createECDHEKeyExchangeClient(i);
            case 20:
                return keyExchangeFactory.createECDHanonKeyExchangeClient(i);
            case 21:
            case 22:
            case 23:
                return keyExchangeFactory.createSRPKeyExchangeClient(i, tlsClient.getSRPIdentity(), tlsClient.getSRPConfigVerifier());
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    private static TlsKeyExchange createKeyExchangeServer(TlsServer tlsServer, int i) {
        TlsKeyExchangeFactory keyExchangeFactory = tlsServer.getKeyExchangeFactory();
        if (i == 1) {
            return keyExchangeFactory.createRSAKeyExchange(i);
        }
        if (i == 3 || i == 5) {
            return keyExchangeFactory.createDHEKeyExchangeServer(i, tlsServer.getDHConfig());
        }
        if (i == 7 || i == 9) {
            return keyExchangeFactory.createDHKeyExchange(i);
        }
        if (i == 11) {
            return keyExchangeFactory.createDHanonKeyExchangeServer(i, tlsServer.getDHConfig());
        }
        switch (i) {
            case 13:
            case 15:
                return keyExchangeFactory.createPSKKeyExchangeServer(i, tlsServer.getPSKIdentityManager(), null, null);
            case 14:
                return keyExchangeFactory.createPSKKeyExchangeServer(i, tlsServer.getPSKIdentityManager(), tlsServer.getDHConfig(), null);
            case 16:
            case 18:
                return keyExchangeFactory.createECDHKeyExchange(i);
            case 17:
            case 19:
                return keyExchangeFactory.createECDHEKeyExchangeServer(i, tlsServer.getECDHConfig());
            case 20:
                return keyExchangeFactory.createECDHanonKeyExchangeServer(i, tlsServer.getECDHConfig());
            case 21:
            case 22:
            case 23:
                return keyExchangeFactory.createSRPKeyExchangeServer(i, tlsServer.getSRPLoginParameters());
            case 24:
                return keyExchangeFactory.createPSKKeyExchangeServer(i, tlsServer.getPSKIdentityManager(), null, tlsServer.getECDHConfig());
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public static byte[] createSignatureAlgorithmsExtension(Vector vector) {
        return TlsExtensionsUtils.createSignatureAlgorithmsExtension(vector);
    }

    public static byte[] decodeOpaque16(byte[] bArr) {
        return decodeOpaque16(bArr, 0);
    }

    public static byte[] decodeOpaque8(byte[] bArr) {
        return decodeOpaque8(bArr, 0);
    }

    public static int decodeUint16(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("'buf' cannot be null");
        }
        if (bArr.length == 2) {
            return readUint16(bArr, 0);
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static long decodeUint32(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("'buf' cannot be null");
        }
        if (bArr.length == 4) {
            return readUint32(bArr, 0);
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static short decodeUint8(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("'buf' cannot be null");
        }
        if (bArr.length == 1) {
            return readUint8(bArr, 0);
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static short[] decodeUint8ArrayWithUint8Length(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("'buf' cannot be null");
        }
        int i = 0;
        int readUint8 = readUint8(bArr, 0);
        if (bArr.length != readUint8 + 1) {
            throw new TlsFatalAlert((short) 50);
        }
        short[] sArr = new short[readUint8];
        while (i < readUint8) {
            int i9 = i + 1;
            sArr[i] = readUint8(bArr, i9);
            i = i9;
        }
        return sArr;
    }

    public static byte[] encodeOpaque16(byte[] bArr) {
        return Arrays.concatenate(encodeUint16(bArr.length), bArr);
    }

    public static byte[] encodeOpaque8(byte[] bArr) {
        checkUint8(bArr.length);
        return Arrays.prepend(bArr, (byte) bArr.length);
    }

    public static void encodeSupportedSignatureAlgorithms(Vector vector, OutputStream outputStream) {
        if (vector == null || vector.size() < 1 || vector.size() >= 32768) {
            throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
        }
        int size = vector.size() * 2;
        checkUint16(size);
        writeUint16(size, outputStream);
        for (int i = 0; i < vector.size(); i++) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = (SignatureAndHashAlgorithm) vector.elementAt(i);
            if (signatureAndHashAlgorithm.getSignature() == 0) {
                throw new IllegalArgumentException("SignatureAlgorithm.anonymous MUST NOT appear in the signature_algorithms extension");
            }
            signatureAndHashAlgorithm.encode(outputStream);
        }
    }

    public static byte[] encodeUint16(int i) {
        checkUint16(i);
        byte[] bArr = new byte[2];
        writeUint16(i, bArr, 0);
        return bArr;
    }

    public static byte[] encodeUint16ArrayWithUint16Length(int[] iArr) {
        byte[] bArr = new byte[(iArr.length * 2) + 2];
        writeUint16ArrayWithUint16Length(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] encodeUint32(long j10) {
        checkUint32(j10);
        byte[] bArr = new byte[4];
        writeUint32(j10, bArr, 0);
        return bArr;
    }

    public static byte[] encodeUint8(short s10) {
        checkUint8(s10);
        byte[] bArr = new byte[1];
        writeUint8(s10, bArr, 0);
        return bArr;
    }

    public static byte[] encodeUint8ArrayWithUint8Length(short[] sArr) {
        byte[] bArr = new byte[sArr.length + 1];
        writeUint8ArrayWithUint8Length(sArr, bArr, 0);
        return bArr;
    }

    public static byte[] encodeVersion(ProtocolVersion protocolVersion) {
        return new byte[]{(byte) protocolVersion.getMajorVersion(), (byte) protocolVersion.getMinorVersion()};
    }

    public static DigitallySigned generateCertificateVerify(TlsContext tlsContext, TlsCredentialedSigner tlsCredentialedSigner, TlsStreamSigner tlsStreamSigner, TlsHandshakeHash tlsHandshakeHash) {
        byte[] generateRawSignature;
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = getSignatureAndHashAlgorithm(tlsContext, tlsCredentialedSigner);
        if (tlsStreamSigner != null) {
            tlsHandshakeHash.copyBufferTo(tlsStreamSigner.getOutputStream());
            generateRawSignature = tlsStreamSigner.getSignature();
        } else {
            generateRawSignature = tlsCredentialedSigner.generateRawSignature(signatureAndHashAlgorithm == null ? tlsContext.getSecurityParametersHandshake().getSessionHash() : tlsHandshakeHash.getFinalHash(signatureAndHashAlgorithm.getHash()));
        }
        return new DigitallySigned(signatureAndHashAlgorithm, generateRawSignature);
    }

    public static void generateServerKeyExchangeSignature(TlsContext tlsContext, TlsCredentialedSigner tlsCredentialedSigner, DigestInputBuffer digestInputBuffer) {
        byte[] generateRawSignature;
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = getSignatureAndHashAlgorithm(tlsContext, tlsCredentialedSigner);
        TlsStreamSigner streamSigner = tlsCredentialedSigner.getStreamSigner();
        if (streamSigner != null) {
            sendSignatureInput(tlsContext, digestInputBuffer, streamSigner.getOutputStream());
            generateRawSignature = streamSigner.getSignature();
        } else {
            generateRawSignature = tlsCredentialedSigner.generateRawSignature(calculateSignatureHash(tlsContext, signatureAndHashAlgorithm, digestInputBuffer));
        }
        new DigitallySigned(signatureAndHashAlgorithm, generateRawSignature).encode(digestInputBuffer);
    }

    public static SignatureAndHashAlgorithm getCertSigAndHashAlg(String str) {
        return (SignatureAndHashAlgorithm) CERT_SIG_ALG_OIDS.get(str);
    }

    public static int getCipherType(int i) {
        return getEncryptionAlgorithmType(getEncryptionAlgorithm(i));
    }

    public static int[] getCommonCipherSuites(int[] iArr, int[] iArr2, boolean z10) {
        if (z10) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int min = Math.min(iArr.length, iArr2.length);
        int[] iArr3 = new int[min];
        int i = 0;
        for (int i9 : iArr) {
            if (!contains(iArr3, 0, i, i9) && Arrays.contains(iArr2, i9)) {
                iArr3[i] = i9;
                i++;
            }
        }
        return i < min ? Arrays.copyOf(iArr3, i) : iArr3;
    }

    public static byte[] getCurrentPRFHash(TlsHandshakeHash tlsHandshakeHash) {
        return tlsHandshakeHash.forkPRFHash().calculateHash();
    }

    public static Vector getDefaultDSSSignatureAlgorithms() {
        return getDefaultSignatureAlgorithms((short) 2);
    }

    public static Vector getDefaultECDSASignatureAlgorithms() {
        return getDefaultSignatureAlgorithms((short) 3);
    }

    public static Vector getDefaultRSASignatureAlgorithms() {
        return getDefaultSignatureAlgorithms((short) 1);
    }

    public static SignatureAndHashAlgorithm getDefaultSignatureAlgorithm(short s10) {
        if (s10 == 1 || s10 == 2 || s10 == 3) {
            return SignatureAndHashAlgorithm.getInstance((short) 2, s10);
        }
        return null;
    }

    public static Vector getDefaultSignatureAlgorithms(short s10) {
        SignatureAndHashAlgorithm defaultSignatureAlgorithm = getDefaultSignatureAlgorithm(s10);
        return defaultSignatureAlgorithm == null ? new Vector() : vectorOfOne(defaultSignatureAlgorithm);
    }

    public static Vector getDefaultSupportedSignatureAlgorithms(TlsContext tlsContext) {
        TlsCrypto crypto = tlsContext.getCrypto();
        SignatureAndHashAlgorithm[] signatureAndHashAlgorithmArr = {SignatureAndHashAlgorithm.ed25519, SignatureAndHashAlgorithm.ed448, SignatureAndHashAlgorithm.rsa_pss_rsae_sha256, SignatureAndHashAlgorithm.rsa_pss_rsae_sha384, SignatureAndHashAlgorithm.rsa_pss_rsae_sha512, SignatureAndHashAlgorithm.rsa_pss_pss_sha256, SignatureAndHashAlgorithm.rsa_pss_pss_sha384, SignatureAndHashAlgorithm.rsa_pss_pss_sha512};
        short[] sArr = {2, 3, 4, 5, 6};
        short[] sArr2 = {1, 2, 3};
        Vector vector = new Vector();
        for (int i = 0; i < 8; i++) {
            addIfSupported(vector, crypto, signatureAndHashAlgorithmArr[i]);
        }
        for (int i9 = 0; i9 < 3; i9++) {
            for (int i10 = 0; i10 < 5; i10++) {
                addIfSupported(vector, crypto, new SignatureAndHashAlgorithm(sArr[i10], sArr2[i9]));
            }
        }
        return vector;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0060 A[FALL_THROUGH, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0060 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getEncryptionAlgorithm(int r1) {
        /*
            r0 = 0
            switch(r1) {
                case 2: goto L60;
                case 10: goto L5e;
                case 13: goto L5e;
                case 16: goto L5e;
                case 19: goto L5e;
                case 22: goto L5e;
                case 27: goto L5e;
                case 147: goto L5e;
                case 148: goto L5b;
                case 149: goto L58;
                case 150: goto L55;
                case 151: goto L55;
                case 152: goto L55;
                case 153: goto L55;
                case 154: goto L55;
                case 155: goto L55;
                case 156: goto L52;
                case 157: goto L4f;
                case 158: goto L52;
                case 159: goto L4f;
                case 160: goto L52;
                case 161: goto L4f;
                case 162: goto L52;
                case 163: goto L4f;
                case 164: goto L52;
                case 165: goto L4f;
                case 166: goto L52;
                case 167: goto L4f;
                case 168: goto L52;
                case 169: goto L4f;
                case 170: goto L52;
                case 171: goto L4f;
                case 172: goto L52;
                case 173: goto L4f;
                case 174: goto L5b;
                case 175: goto L58;
                case 176: goto L4e;
                case 177: goto L4e;
                case 178: goto L5b;
                case 179: goto L58;
                case 180: goto L4e;
                case 181: goto L4e;
                case 182: goto L5b;
                case 183: goto L58;
                case 184: goto L4e;
                case 185: goto L4e;
                case 186: goto L4b;
                case 187: goto L4b;
                case 188: goto L4b;
                case 189: goto L4b;
                case 190: goto L4b;
                case 191: goto L4b;
                case 192: goto L48;
                case 193: goto L48;
                case 194: goto L48;
                case 195: goto L48;
                case 196: goto L48;
                case 197: goto L48;
                case 49153: goto L60;
                case 49170: goto L5e;
                case 49171: goto L5b;
                case 49172: goto L58;
                case 49173: goto L60;
                case 49175: goto L5e;
                case 49176: goto L5b;
                case 49177: goto L58;
                case 49178: goto L5e;
                case 49179: goto L5e;
                case 49180: goto L5e;
                case 49181: goto L5b;
                case 49182: goto L5b;
                case 49183: goto L5b;
                case 49184: goto L58;
                case 49185: goto L58;
                case 49186: goto L58;
                case 49187: goto L5b;
                case 49188: goto L58;
                case 49189: goto L5b;
                case 49190: goto L58;
                case 49191: goto L5b;
                case 49192: goto L58;
                case 49193: goto L5b;
                case 49194: goto L58;
                case 49195: goto L52;
                case 49196: goto L4f;
                case 49197: goto L52;
                case 49198: goto L4f;
                case 49199: goto L52;
                case 49200: goto L4f;
                case 49201: goto L52;
                case 49202: goto L4f;
                case 49204: goto L5e;
                case 49205: goto L5b;
                case 49206: goto L58;
                case 49207: goto L5b;
                case 49208: goto L58;
                case 49209: goto L60;
                case 49210: goto L4e;
                case 49211: goto L4e;
                case 49212: goto L45;
                case 49213: goto L42;
                case 49214: goto L45;
                case 49215: goto L42;
                case 49216: goto L45;
                case 49217: goto L42;
                case 49218: goto L45;
                case 49219: goto L42;
                case 49220: goto L45;
                case 49221: goto L42;
                case 49222: goto L45;
                case 49223: goto L42;
                case 49224: goto L45;
                case 49225: goto L42;
                case 49226: goto L45;
                case 49227: goto L42;
                case 49228: goto L45;
                case 49229: goto L42;
                case 49230: goto L45;
                case 49231: goto L42;
                case 49232: goto L3f;
                case 49233: goto L3c;
                case 49234: goto L3f;
                case 49235: goto L3c;
                case 49236: goto L3f;
                case 49237: goto L3c;
                case 49238: goto L3f;
                case 49239: goto L3c;
                case 49240: goto L3f;
                case 49241: goto L3c;
                case 49242: goto L3f;
                case 49243: goto L3c;
                case 49244: goto L3f;
                case 49245: goto L3c;
                case 49246: goto L3f;
                case 49247: goto L3c;
                case 49248: goto L3f;
                case 49249: goto L3c;
                case 49250: goto L3f;
                case 49251: goto L3c;
                case 49252: goto L45;
                case 49253: goto L42;
                case 49254: goto L45;
                case 49255: goto L42;
                case 49256: goto L45;
                case 49257: goto L42;
                case 49258: goto L3f;
                case 49259: goto L3c;
                case 49260: goto L3f;
                case 49261: goto L3c;
                case 49262: goto L3f;
                case 49263: goto L3c;
                case 49264: goto L45;
                case 49265: goto L42;
                case 49266: goto L4b;
                case 49267: goto L48;
                case 49268: goto L4b;
                case 49269: goto L48;
                case 49270: goto L4b;
                case 49271: goto L48;
                case 49272: goto L4b;
                case 49273: goto L48;
                case 49274: goto L39;
                case 49275: goto L36;
                case 49276: goto L39;
                case 49277: goto L36;
                case 49278: goto L39;
                case 49279: goto L36;
                case 49280: goto L39;
                case 49281: goto L36;
                case 49282: goto L39;
                case 49283: goto L36;
                case 49284: goto L39;
                case 49285: goto L36;
                case 49286: goto L39;
                case 49287: goto L36;
                case 49288: goto L39;
                case 49289: goto L36;
                case 49290: goto L39;
                case 49291: goto L36;
                case 49292: goto L39;
                case 49293: goto L36;
                case 49294: goto L39;
                case 49295: goto L36;
                case 49296: goto L39;
                case 49297: goto L36;
                case 49298: goto L39;
                case 49299: goto L36;
                case 49300: goto L4b;
                case 49301: goto L48;
                case 49302: goto L4b;
                case 49303: goto L48;
                case 49304: goto L4b;
                case 49305: goto L48;
                case 49306: goto L4b;
                case 49307: goto L48;
                case 49308: goto L33;
                case 49309: goto L30;
                case 49310: goto L33;
                case 49311: goto L30;
                case 49312: goto L2d;
                case 49313: goto L2a;
                case 49314: goto L2d;
                case 49315: goto L2a;
                case 49316: goto L33;
                case 49317: goto L30;
                case 49318: goto L33;
                case 49319: goto L30;
                case 49320: goto L2d;
                case 49321: goto L2a;
                case 49322: goto L2d;
                case 49323: goto L2a;
                case 49324: goto L33;
                case 49325: goto L30;
                case 49326: goto L2d;
                case 49327: goto L2a;
                case 52392: goto L27;
                case 52393: goto L27;
                case 52394: goto L27;
                case 52395: goto L27;
                case 52396: goto L27;
                case 52397: goto L27;
                case 52398: goto L27;
                case 53249: goto L52;
                case 53250: goto L4f;
                case 53251: goto L2d;
                case 53253: goto L33;
                case 65280: goto L24;
                case 65281: goto L21;
                case 65282: goto L24;
                case 65283: goto L21;
                case 65284: goto L24;
                case 65285: goto L21;
                case 65296: goto L24;
                case 65297: goto L21;
                case 65298: goto L24;
                case 65299: goto L21;
                case 65300: goto L24;
                case 65301: goto L21;
                default: goto L4;
            }
        L4:
            switch(r1) {
                case 44: goto L60;
                case 45: goto L60;
                case 46: goto L60;
                case 47: goto L5b;
                case 48: goto L5b;
                case 49: goto L5b;
                case 50: goto L5b;
                case 51: goto L5b;
                case 52: goto L5b;
                case 53: goto L58;
                case 54: goto L58;
                case 55: goto L58;
                case 56: goto L58;
                case 57: goto L58;
                case 58: goto L58;
                case 59: goto L4e;
                case 60: goto L5b;
                case 61: goto L58;
                case 62: goto L5b;
                case 63: goto L5b;
                case 64: goto L5b;
                case 65: goto L4b;
                case 66: goto L4b;
                case 67: goto L4b;
                case 68: goto L4b;
                case 69: goto L4b;
                case 70: goto L4b;
                default: goto L7;
            }
        L7:
            switch(r1) {
                case 103: goto L5b;
                case 104: goto L58;
                case 105: goto L58;
                case 106: goto L58;
                case 107: goto L58;
                case 108: goto L5b;
                case 109: goto L58;
                default: goto La;
            }
        La:
            switch(r1) {
                case 132: goto L48;
                case 133: goto L48;
                case 134: goto L48;
                case 135: goto L48;
                case 136: goto L48;
                case 137: goto L48;
                default: goto Ld;
            }
        Ld:
            switch(r1) {
                case 139: goto L5e;
                case 140: goto L5b;
                case 141: goto L58;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 143: goto L5e;
                case 144: goto L5b;
                case 145: goto L58;
                default: goto L13;
            }
        L13:
            switch(r1) {
                case 4865: goto L52;
                case 4866: goto L4f;
                case 4867: goto L27;
                case 4868: goto L33;
                case 4869: goto L2d;
                default: goto L16;
            }
        L16:
            switch(r1) {
                case 49155: goto L5e;
                case 49156: goto L5b;
                case 49157: goto L58;
                case 49158: goto L60;
                default: goto L19;
            }
        L19:
            switch(r1) {
                case 49160: goto L5e;
                case 49161: goto L5b;
                case 49162: goto L58;
                case 49163: goto L60;
                default: goto L1c;
            }
        L1c:
            switch(r1) {
                case 49165: goto L5e;
                case 49166: goto L5b;
                case 49167: goto L58;
                case 49168: goto L60;
                default: goto L1f;
            }
        L1f:
            r1 = -1
            return r1
        L21:
            r1 = 104(0x68, float:1.46E-43)
            return r1
        L24:
            r1 = 103(0x67, float:1.44E-43)
            return r1
        L27:
            r1 = 21
            return r1
        L2a:
            r1 = 18
            return r1
        L2d:
            r1 = 16
            return r1
        L30:
            r1 = 17
            return r1
        L33:
            r1 = 15
            return r1
        L36:
            r1 = 20
            return r1
        L39:
            r1 = 19
            return r1
        L3c:
            r1 = 25
            return r1
        L3f:
            r1 = 24
            return r1
        L42:
            r1 = 23
            return r1
        L45:
            r1 = 22
            return r1
        L48:
            r1 = 13
            return r1
        L4b:
            r1 = 12
            return r1
        L4e:
            return r0
        L4f:
            r1 = 11
            return r1
        L52:
            r1 = 10
            return r1
        L55:
            r1 = 14
            return r1
        L58:
            r1 = 9
            return r1
        L5b:
            r1 = 8
            return r1
        L5e:
            r1 = 7
            return r1
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tls.TlsUtils.getEncryptionAlgorithm(int):int");
    }

    public static int getEncryptionAlgorithmType(int i) {
        if (i == 103 || i == 104) {
            return 2;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
            case 22:
            case 23:
                return 1;
            case 10:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            case 25:
                return 2;
            default:
                return -1;
        }
    }

    public static byte[] getExtensionData(Hashtable hashtable, Integer num) {
        if (hashtable == null) {
            return null;
        }
        return (byte[]) hashtable.get(num);
    }

    public static short getHashAlgorithmForHMACAlgorithm(int i) {
        short s10 = 1;
        if (i != 1) {
            s10 = 2;
            if (i != 2) {
                if (i == 3) {
                    return (short) 4;
                }
                if (i == 4) {
                    return (short) 5;
                }
                if (i == 5) {
                    return (short) 6;
                }
                throw new IllegalArgumentException("specified MACAlgorithm not an HMAC: " + MACAlgorithm.getText(i));
            }
        }
        return s10;
    }

    public static short getHashAlgorithmForPRFAlgorithm(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("legacy PRF not a valid algorithm");
        }
        if (i == 1) {
            return (short) 4;
        }
        if (i == 2) {
            return (short) 5;
        }
        throw new IllegalArgumentException("unknown PRFAlgorithm: " + PRFAlgorithm.getText(i));
    }

    public static int getKeyExchangeAlgorithm(int i) {
        switch (i) {
            case 2:
            case 10:
            case 150:
            case 156:
            case 157:
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
            case 192:
            case CipherSuite.TLS_RSA_WITH_ARIA_128_CBC_SHA256 /* 49212 */:
            case CipherSuite.TLS_RSA_WITH_ARIA_256_CBC_SHA384 /* 49213 */:
            case CipherSuite.TLS_RSA_WITH_ARIA_128_GCM_SHA256 /* 49232 */:
            case CipherSuite.TLS_RSA_WITH_ARIA_256_GCM_SHA384 /* 49233 */:
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49274 */:
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49275 */:
            case CipherSuite.TLS_RSA_WITH_AES_128_CCM /* 49308 */:
            case CipherSuite.TLS_RSA_WITH_AES_256_CCM /* 49309 */:
            case CipherSuite.TLS_RSA_WITH_AES_128_CCM_8 /* 49312 */:
            case CipherSuite.TLS_RSA_WITH_AES_256_CCM_8 /* 49313 */:
                return 1;
            case 13:
            case 151:
            case 164:
            case 165:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
            case CipherSuite.TLS_DH_DSS_WITH_ARIA_128_CBC_SHA256 /* 49214 */:
            case CipherSuite.TLS_DH_DSS_WITH_ARIA_256_CBC_SHA384 /* 49215 */:
            case CipherSuite.TLS_DH_DSS_WITH_ARIA_128_GCM_SHA256 /* 49240 */:
            case CipherSuite.TLS_DH_DSS_WITH_ARIA_256_GCM_SHA384 /* 49241 */:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49282 */:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49283 */:
                return 7;
            case 16:
            case 152:
            case 160:
            case 161:
            case 188:
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
            case CipherSuite.TLS_DH_RSA_WITH_ARIA_128_CBC_SHA256 /* 49216 */:
            case CipherSuite.TLS_DH_RSA_WITH_ARIA_256_CBC_SHA384 /* 49217 */:
            case CipherSuite.TLS_DH_RSA_WITH_ARIA_128_GCM_SHA256 /* 49236 */:
            case CipherSuite.TLS_DH_RSA_WITH_ARIA_256_GCM_SHA384 /* 49237 */:
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49278 */:
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49279 */:
                return 9;
            case 19:
            case 153:
            case 162:
            case 163:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_128_CBC_SHA256 /* 49218 */:
            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_256_CBC_SHA384 /* 49219 */:
            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_128_GCM_SHA256 /* 49238 */:
            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_256_GCM_SHA384 /* 49239 */:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49280 */:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49281 */:
                return 3;
            case 22:
            case 154:
            case 158:
            case 159:
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_128_CBC_SHA256 /* 49220 */:
            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_256_CBC_SHA384 /* 49221 */:
            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_128_GCM_SHA256 /* 49234 */:
            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_256_GCM_SHA384 /* 49235 */:
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49276 */:
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49277 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM /* 49310 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM /* 49311 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8 /* 49314 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8 /* 49315 */:
            case CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52394 */:
            case CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB /* 65280 */:
            case 65281:
                return 5;
            case 27:
            case 155:
            case 166:
            case 167:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
            case CipherSuite.TLS_DH_anon_WITH_ARIA_128_CBC_SHA256 /* 49222 */:
            case CipherSuite.TLS_DH_anon_WITH_ARIA_256_CBC_SHA384 /* 49223 */:
            case CipherSuite.TLS_DH_anon_WITH_ARIA_128_GCM_SHA256 /* 49242 */:
            case CipherSuite.TLS_DH_anon_WITH_ARIA_256_GCM_SHA384 /* 49243 */:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_GCM_SHA256 /* 49284 */:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_GCM_SHA384 /* 49285 */:
                return 11;
            case 147:
            case 148:
            case 149:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_128_CBC_SHA256 /* 49256 */:
            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_256_CBC_SHA384 /* 49257 */:
            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_128_GCM_SHA256 /* 49262 */:
            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_256_GCM_SHA384 /* 49263 */:
            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49298 */:
            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49299 */:
            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49304 */:
            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49305 */:
            case CipherSuite.TLS_RSA_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52398 */:
                return 15;
            case 168:
            case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
            case CipherSuite.TLS_PSK_WITH_NULL_SHA256 /* 176 */:
            case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
            case CipherSuite.TLS_PSK_WITH_ARIA_128_CBC_SHA256 /* 49252 */:
            case CipherSuite.TLS_PSK_WITH_ARIA_256_CBC_SHA384 /* 49253 */:
            case CipherSuite.TLS_PSK_WITH_ARIA_128_GCM_SHA256 /* 49258 */:
            case CipherSuite.TLS_PSK_WITH_ARIA_256_GCM_SHA384 /* 49259 */:
            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49294 */:
            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49295 */:
            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49300 */:
            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49301 */:
            case CipherSuite.TLS_PSK_WITH_AES_128_CCM /* 49316 */:
            case CipherSuite.TLS_PSK_WITH_AES_256_CCM /* 49317 */:
            case CipherSuite.TLS_PSK_WITH_AES_128_CCM_8 /* 49320 */:
            case CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 /* 49321 */:
            case CipherSuite.TLS_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52395 */:
            case CipherSuite.DRAFT_TLS_PSK_WITH_AES_128_OCB /* 65296 */:
            case CipherSuite.DRAFT_TLS_PSK_WITH_AES_256_OCB /* 65297 */:
                return 13;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 /* 180 */:
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_128_CBC_SHA256 /* 49254 */:
            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_256_CBC_SHA384 /* 49255 */:
            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_128_GCM_SHA256 /* 49260 */:
            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_256_GCM_SHA384 /* 49261 */:
            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49296 */:
            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49297 */:
            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49302 */:
            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49303 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CCM /* 49318 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CCM /* 49319 */:
            case CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8 /* 49322 */:
            case CipherSuite.TLS_PSK_DHE_WITH_AES_256_CCM_8 /* 49323 */:
            case CipherSuite.TLS_DHE_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52397 */:
            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_128_OCB /* 65298 */:
            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_256_OCB /* 65299 */:
                return 14;
            case CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA /* 49153 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 /* 49189 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 /* 49190 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 /* 49197 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 /* 49198 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_128_CBC_SHA256 /* 49226 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_256_CBC_SHA384 /* 49227 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_128_GCM_SHA256 /* 49246 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_256_GCM_SHA384 /* 49247 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49268 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49269 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
                return 16;
            case CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA /* 49175 */:
            case CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA /* 49176 */:
            case CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA /* 49177 */:
                return 20;
            case CipherSuite.TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA /* 49178 */:
            case CipherSuite.TLS_SRP_SHA_WITH_AES_128_CBC_SHA /* 49181 */:
            case CipherSuite.TLS_SRP_SHA_WITH_AES_256_CBC_SHA /* 49184 */:
                return 21;
            case CipherSuite.TLS_SRP_SHA_RSA_WITH_3DES_EDE_CBC_SHA /* 49179 */:
            case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_128_CBC_SHA /* 49182 */:
            case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_256_CBC_SHA /* 49185 */:
                return 23;
            case CipherSuite.TLS_SRP_SHA_DSS_WITH_3DES_EDE_CBC_SHA /* 49180 */:
            case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_128_CBC_SHA /* 49183 */:
            case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_256_CBC_SHA /* 49186 */:
                return 22;
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 /* 49187 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_128_CBC_SHA256 /* 49224 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_256_CBC_SHA384 /* 49225 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_128_GCM_SHA256 /* 49244 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_256_GCM_SHA384 /* 49245 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49266 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49267 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52393 */:
            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_128_OCB /* 65284 */:
            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_256_OCB /* 65285 */:
                return 17;
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_128_CBC_SHA256 /* 49228 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_256_CBC_SHA384 /* 49229 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_128_GCM_SHA256 /* 49248 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_256_GCM_SHA384 /* 49249 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49270 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49271 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52392 */:
            case 65282:
            case CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_AES_256_OCB /* 65283 */:
                return 19;
            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 /* 49193 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 /* 49194 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 /* 49201 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 /* 49202 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_128_CBC_SHA256 /* 49230 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_256_CBC_SHA384 /* 49231 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_128_GCM_SHA256 /* 49250 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_256_GCM_SHA384 /* 49251 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49272 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49273 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
                return 18;
            case CipherSuite.TLS_ECDHE_PSK_WITH_3DES_EDE_CBC_SHA /* 49204 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA /* 49205 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA /* 49206 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256 /* 49207 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384 /* 49208 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA /* 49209 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA256 /* 49210 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA384 /* 49211 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_ARIA_128_CBC_SHA256 /* 49264 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_ARIA_256_CBC_SHA384 /* 49265 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49306 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49307 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52396 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_GCM_SHA256 /* 53249 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_GCM_SHA384 /* 53250 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CCM_8_SHA256 /* 53251 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CCM_SHA256 /* 53253 */:
            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_128_OCB /* 65300 */:
            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_256_OCB /* 65301 */:
                return 24;
            default:
                switch (i) {
                    case 44:
                        return 13;
                    case 45:
                        return 14;
                    case 46:
                        return 15;
                    case 47:
                    case 53:
                    case 59:
                    case 60:
                    case 61:
                    case 65:
                        return 1;
                    case 48:
                    case 54:
                    case 62:
                    case 66:
                        return 7;
                    case 49:
                    case 55:
                    case 63:
                    case 67:
                        return 9;
                    case 50:
                    case 56:
                    case 64:
                    case 68:
                        return 3;
                    case 51:
                    case 57:
                    case 69:
                        return 5;
                    case 52:
                    case 58:
                    case 70:
                        return 11;
                    default:
                        switch (i) {
                            case 103:
                            case 107:
                                return 5;
                            case 104:
                                return 7;
                            case 105:
                                return 9;
                            case 106:
                                return 3;
                            case 108:
                            case 109:
                                return 11;
                            default:
                                switch (i) {
                                    case 132:
                                        return 1;
                                    case 133:
                                        return 7;
                                    case 134:
                                        return 9;
                                    case 135:
                                        return 3;
                                    case 136:
                                        return 5;
                                    case 137:
                                        return 11;
                                    default:
                                        switch (i) {
                                            case 139:
                                            case 140:
                                            case 141:
                                                return 13;
                                            default:
                                                switch (i) {
                                                    case 143:
                                                    case 144:
                                                    case 145:
                                                        return 14;
                                                    default:
                                                        switch (i) {
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49155 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA /* 49156 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA /* 49157 */:
                                                                return 16;
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA /* 49158 */:
                                                                return 17;
                                                            default:
                                                                switch (i) {
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49160 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA /* 49161 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA /* 49162 */:
                                                                        return 17;
                                                                    case CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA /* 49163 */:
                                                                        return 18;
                                                                    default:
                                                                        switch (i) {
                                                                            case CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA /* 49165 */:
                                                                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA /* 49166 */:
                                                                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA /* 49167 */:
                                                                                return 18;
                                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA /* 49168 */:
                                                                                return 19;
                                                                            default:
                                                                                switch (i) {
                                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA /* 49170 */:
                                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA /* 49171 */:
                                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA /* 49172 */:
                                                                                        return 19;
                                                                                    case CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA /* 49173 */:
                                                                                        return 20;
                                                                                    default:
                                                                                        return -1;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static Vector getKeyExchangeAlgorithms(int[] iArr) {
        Vector vector = new Vector();
        if (iArr != null) {
            for (int i : iArr) {
                addToSet(vector, getKeyExchangeAlgorithm(i));
            }
            vector.removeElement(Integers.valueOf(-1));
        }
        return vector;
    }

    public static short getLegacyClientCertType(short s10) {
        short s11 = 1;
        if (s10 != 1) {
            s11 = 2;
            if (s10 != 2) {
                return s10 != 3 ? (short) -1 : (short) 64;
            }
        }
        return s11;
    }

    public static short getLegacySignatureAlgorithmClient(short s10) {
        short s11 = 1;
        if (s10 != 1) {
            s11 = 2;
            if (s10 != 2) {
                return s10 != 64 ? (short) -1 : (short) 3;
            }
        }
        return s11;
    }

    public static short getLegacySignatureAlgorithmClientCert(short s10) {
        if (s10 != 1) {
            if (s10 != 2) {
                if (s10 != 3) {
                    if (s10 != 4) {
                        switch (s10) {
                            case 64:
                            case 66:
                                return (short) 3;
                            case 65:
                                break;
                            default:
                                return (short) -1;
                        }
                    }
                }
            }
            return (short) 2;
        }
        return (short) 1;
    }

    public static short getLegacySignatureAlgorithmServer(int i) {
        if (i == 3) {
            return (short) 2;
        }
        if (i == 5) {
            return (short) 1;
        }
        if (i == 17) {
            return (short) 3;
        }
        if (i == 19) {
            return (short) 1;
        }
        if (i != 22) {
            return i != 23 ? (short) -1 : (short) 1;
        }
        return (short) 2;
    }

    public static short getLegacySignatureAlgorithmServerCert(int i) {
        if (i != 1) {
            if (i == 3) {
                return (short) 2;
            }
            if (i != 5) {
                if (i == 7) {
                    return (short) 2;
                }
                if (i != 9) {
                    if (i == 22) {
                        return (short) 2;
                    }
                    if (i != 23) {
                        switch (i) {
                            case 15:
                            case 18:
                            case 19:
                                break;
                            case 16:
                            case 17:
                                return (short) 3;
                            default:
                                return (short) -1;
                        }
                    }
                }
            }
        }
        return (short) 1;
    }

    public static int getMACAlgorithm(int i) {
        switch (i) {
            case 2:
            case 10:
            case 13:
            case 16:
            case 19:
            case 22:
            case 27:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA /* 49153 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA /* 49170 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA /* 49171 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA /* 49172 */:
            case CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA /* 49173 */:
            case CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA /* 49175 */:
            case CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA /* 49176 */:
            case CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA /* 49177 */:
            case CipherSuite.TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA /* 49178 */:
            case CipherSuite.TLS_SRP_SHA_RSA_WITH_3DES_EDE_CBC_SHA /* 49179 */:
            case CipherSuite.TLS_SRP_SHA_DSS_WITH_3DES_EDE_CBC_SHA /* 49180 */:
            case CipherSuite.TLS_SRP_SHA_WITH_AES_128_CBC_SHA /* 49181 */:
            case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_128_CBC_SHA /* 49182 */:
            case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_128_CBC_SHA /* 49183 */:
            case CipherSuite.TLS_SRP_SHA_WITH_AES_256_CBC_SHA /* 49184 */:
            case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_256_CBC_SHA /* 49185 */:
            case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_256_CBC_SHA /* 49186 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_3DES_EDE_CBC_SHA /* 49204 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA /* 49205 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA /* 49206 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA /* 49209 */:
                return 2;
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 /* 49197 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 /* 49198 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 /* 49201 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 /* 49202 */:
            case CipherSuite.TLS_RSA_WITH_ARIA_128_GCM_SHA256 /* 49232 */:
            case CipherSuite.TLS_RSA_WITH_ARIA_256_GCM_SHA384 /* 49233 */:
            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_128_GCM_SHA256 /* 49234 */:
            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_256_GCM_SHA384 /* 49235 */:
            case CipherSuite.TLS_DH_RSA_WITH_ARIA_128_GCM_SHA256 /* 49236 */:
            case CipherSuite.TLS_DH_RSA_WITH_ARIA_256_GCM_SHA384 /* 49237 */:
            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_128_GCM_SHA256 /* 49238 */:
            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_256_GCM_SHA384 /* 49239 */:
            case CipherSuite.TLS_DH_DSS_WITH_ARIA_128_GCM_SHA256 /* 49240 */:
            case CipherSuite.TLS_DH_DSS_WITH_ARIA_256_GCM_SHA384 /* 49241 */:
            case CipherSuite.TLS_DH_anon_WITH_ARIA_128_GCM_SHA256 /* 49242 */:
            case CipherSuite.TLS_DH_anon_WITH_ARIA_256_GCM_SHA384 /* 49243 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_128_GCM_SHA256 /* 49244 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_256_GCM_SHA384 /* 49245 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_128_GCM_SHA256 /* 49246 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_256_GCM_SHA384 /* 49247 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_128_GCM_SHA256 /* 49248 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_256_GCM_SHA384 /* 49249 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_128_GCM_SHA256 /* 49250 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_256_GCM_SHA384 /* 49251 */:
            case CipherSuite.TLS_PSK_WITH_ARIA_128_GCM_SHA256 /* 49258 */:
            case CipherSuite.TLS_PSK_WITH_ARIA_256_GCM_SHA384 /* 49259 */:
            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_128_GCM_SHA256 /* 49260 */:
            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_256_GCM_SHA384 /* 49261 */:
            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_128_GCM_SHA256 /* 49262 */:
            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_256_GCM_SHA384 /* 49263 */:
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49274 */:
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49275 */:
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49276 */:
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49277 */:
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49278 */:
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49279 */:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49280 */:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49281 */:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49282 */:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49283 */:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_GCM_SHA256 /* 49284 */:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_GCM_SHA384 /* 49285 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49294 */:
            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49295 */:
            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49296 */:
            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49297 */:
            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49298 */:
            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49299 */:
            case CipherSuite.TLS_RSA_WITH_AES_128_CCM /* 49308 */:
            case CipherSuite.TLS_RSA_WITH_AES_256_CCM /* 49309 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM /* 49310 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM /* 49311 */:
            case CipherSuite.TLS_RSA_WITH_AES_128_CCM_8 /* 49312 */:
            case CipherSuite.TLS_RSA_WITH_AES_256_CCM_8 /* 49313 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8 /* 49314 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8 /* 49315 */:
            case CipherSuite.TLS_PSK_WITH_AES_128_CCM /* 49316 */:
            case CipherSuite.TLS_PSK_WITH_AES_256_CCM /* 49317 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CCM /* 49318 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CCM /* 49319 */:
            case CipherSuite.TLS_PSK_WITH_AES_128_CCM_8 /* 49320 */:
            case CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 /* 49321 */:
            case CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8 /* 49322 */:
            case CipherSuite.TLS_PSK_DHE_WITH_AES_256_CCM_8 /* 49323 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52392 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52393 */:
            case CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52394 */:
            case CipherSuite.TLS_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52395 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52396 */:
            case CipherSuite.TLS_DHE_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52397 */:
            case CipherSuite.TLS_RSA_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52398 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_GCM_SHA256 /* 53249 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_GCM_SHA384 /* 53250 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CCM_8_SHA256 /* 53251 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CCM_SHA256 /* 53253 */:
            case CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB /* 65280 */:
            case 65281:
            case 65282:
            case CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_AES_256_OCB /* 65283 */:
            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_128_OCB /* 65284 */:
            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_256_OCB /* 65285 */:
            case CipherSuite.DRAFT_TLS_PSK_WITH_AES_128_OCB /* 65296 */:
            case CipherSuite.DRAFT_TLS_PSK_WITH_AES_256_OCB /* 65297 */:
            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_128_OCB /* 65298 */:
            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_256_OCB /* 65299 */:
            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_128_OCB /* 65300 */:
            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_256_OCB /* 65301 */:
                return 0;
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
            case CipherSuite.TLS_PSK_WITH_NULL_SHA256 /* 176 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 /* 180 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
            case 188:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
            case 192:
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 /* 49187 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 /* 49189 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 /* 49193 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256 /* 49207 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA256 /* 49210 */:
            case CipherSuite.TLS_RSA_WITH_ARIA_128_CBC_SHA256 /* 49212 */:
            case CipherSuite.TLS_DH_DSS_WITH_ARIA_128_CBC_SHA256 /* 49214 */:
            case CipherSuite.TLS_DH_RSA_WITH_ARIA_128_CBC_SHA256 /* 49216 */:
            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_128_CBC_SHA256 /* 49218 */:
            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_128_CBC_SHA256 /* 49220 */:
            case CipherSuite.TLS_DH_anon_WITH_ARIA_128_CBC_SHA256 /* 49222 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_128_CBC_SHA256 /* 49224 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_128_CBC_SHA256 /* 49226 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_128_CBC_SHA256 /* 49228 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_128_CBC_SHA256 /* 49230 */:
            case CipherSuite.TLS_PSK_WITH_ARIA_128_CBC_SHA256 /* 49252 */:
            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_128_CBC_SHA256 /* 49254 */:
            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_128_CBC_SHA256 /* 49256 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_ARIA_128_CBC_SHA256 /* 49264 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49266 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49268 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49270 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49272 */:
            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49300 */:
            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49302 */:
            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49304 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49306 */:
                return 3;
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
            case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 /* 49190 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 /* 49194 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384 /* 49208 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA384 /* 49211 */:
            case CipherSuite.TLS_RSA_WITH_ARIA_256_CBC_SHA384 /* 49213 */:
            case CipherSuite.TLS_DH_DSS_WITH_ARIA_256_CBC_SHA384 /* 49215 */:
            case CipherSuite.TLS_DH_RSA_WITH_ARIA_256_CBC_SHA384 /* 49217 */:
            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_256_CBC_SHA384 /* 49219 */:
            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_256_CBC_SHA384 /* 49221 */:
            case CipherSuite.TLS_DH_anon_WITH_ARIA_256_CBC_SHA384 /* 49223 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_256_CBC_SHA384 /* 49225 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_256_CBC_SHA384 /* 49227 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_256_CBC_SHA384 /* 49229 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_256_CBC_SHA384 /* 49231 */:
            case CipherSuite.TLS_PSK_WITH_ARIA_256_CBC_SHA384 /* 49253 */:
            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_256_CBC_SHA384 /* 49255 */:
            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_256_CBC_SHA384 /* 49257 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_ARIA_256_CBC_SHA384 /* 49265 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49267 */:
            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49269 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49271 */:
            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49273 */:
            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49301 */:
            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49303 */:
            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49305 */:
            case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49307 */:
                return 4;
            default:
                switch (i) {
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                        return 2;
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                        return 3;
                    default:
                        switch (i) {
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                                return 3;
                            default:
                                switch (i) {
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                        return 2;
                                    default:
                                        switch (i) {
                                            case 139:
                                            case 140:
                                            case 141:
                                                return 2;
                                            default:
                                                switch (i) {
                                                    case 143:
                                                    case 144:
                                                    case 145:
                                                        return 2;
                                                    default:
                                                        switch (i) {
                                                            case CipherSuite.TLS_AES_128_GCM_SHA256 /* 4865 */:
                                                            case CipherSuite.TLS_AES_256_GCM_SHA384 /* 4866 */:
                                                            case CipherSuite.TLS_CHACHA20_POLY1305_SHA256 /* 4867 */:
                                                            case CipherSuite.TLS_AES_128_CCM_SHA256 /* 4868 */:
                                                            case CipherSuite.TLS_AES_128_CCM_8_SHA256 /* 4869 */:
                                                                return 0;
                                                            default:
                                                                switch (i) {
                                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49155 */:
                                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA /* 49156 */:
                                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA /* 49157 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA /* 49158 */:
                                                                        return 2;
                                                                    default:
                                                                        switch (i) {
                                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49160 */:
                                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA /* 49161 */:
                                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA /* 49162 */:
                                                                            case CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA /* 49163 */:
                                                                                return 2;
                                                                            default:
                                                                                switch (i) {
                                                                                    case CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA /* 49165 */:
                                                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA /* 49166 */:
                                                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA /* 49167 */:
                                                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA /* 49168 */:
                                                                                        return 2;
                                                                                    default:
                                                                                        return -1;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static ProtocolVersion getMinimumVersion(int i) {
        switch (i) {
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                break;
            default:
                switch (i) {
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                        break;
                    default:
                        switch (i) {
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                            case 160:
                            case 161:
                            case 162:
                            case 163:
                            case 164:
                            case 165:
                            case 166:
                            case 167:
                            case 168:
                            case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                                break;
                            default:
                                switch (i) {
                                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                                    case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                                    case 188:
                                    case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                                    case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
                                    case 192:
                                    case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
                                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                                    case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                                    case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                                        break;
                                    default:
                                        switch (i) {
                                            case CipherSuite.TLS_AES_128_GCM_SHA256 /* 4865 */:
                                            case CipherSuite.TLS_AES_256_GCM_SHA384 /* 4866 */:
                                            case CipherSuite.TLS_CHACHA20_POLY1305_SHA256 /* 4867 */:
                                            case CipherSuite.TLS_AES_128_CCM_SHA256 /* 4868 */:
                                            case CipherSuite.TLS_AES_128_CCM_8_SHA256 /* 4869 */:
                                                return ProtocolVersion.TLSv13;
                                            default:
                                                switch (i) {
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 /* 49187 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 /* 49189 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 /* 49190 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 /* 49193 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 /* 49194 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 /* 49197 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 /* 49198 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 /* 49201 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 /* 49202 */:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case CipherSuite.TLS_RSA_WITH_ARIA_128_CBC_SHA256 /* 49212 */:
                                                            case CipherSuite.TLS_RSA_WITH_ARIA_256_CBC_SHA384 /* 49213 */:
                                                            case CipherSuite.TLS_DH_DSS_WITH_ARIA_128_CBC_SHA256 /* 49214 */:
                                                            case CipherSuite.TLS_DH_DSS_WITH_ARIA_256_CBC_SHA384 /* 49215 */:
                                                            case CipherSuite.TLS_DH_RSA_WITH_ARIA_128_CBC_SHA256 /* 49216 */:
                                                            case CipherSuite.TLS_DH_RSA_WITH_ARIA_256_CBC_SHA384 /* 49217 */:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_128_CBC_SHA256 /* 49218 */:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_256_CBC_SHA384 /* 49219 */:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_128_CBC_SHA256 /* 49220 */:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_256_CBC_SHA384 /* 49221 */:
                                                            case CipherSuite.TLS_DH_anon_WITH_ARIA_128_CBC_SHA256 /* 49222 */:
                                                            case CipherSuite.TLS_DH_anon_WITH_ARIA_256_CBC_SHA384 /* 49223 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_128_CBC_SHA256 /* 49224 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_256_CBC_SHA384 /* 49225 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_128_CBC_SHA256 /* 49226 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_256_CBC_SHA384 /* 49227 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_128_CBC_SHA256 /* 49228 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_256_CBC_SHA384 /* 49229 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_128_CBC_SHA256 /* 49230 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_256_CBC_SHA384 /* 49231 */:
                                                            case CipherSuite.TLS_RSA_WITH_ARIA_128_GCM_SHA256 /* 49232 */:
                                                            case CipherSuite.TLS_RSA_WITH_ARIA_256_GCM_SHA384 /* 49233 */:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_128_GCM_SHA256 /* 49234 */:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_ARIA_256_GCM_SHA384 /* 49235 */:
                                                            case CipherSuite.TLS_DH_RSA_WITH_ARIA_128_GCM_SHA256 /* 49236 */:
                                                            case CipherSuite.TLS_DH_RSA_WITH_ARIA_256_GCM_SHA384 /* 49237 */:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_128_GCM_SHA256 /* 49238 */:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_ARIA_256_GCM_SHA384 /* 49239 */:
                                                            case CipherSuite.TLS_DH_DSS_WITH_ARIA_128_GCM_SHA256 /* 49240 */:
                                                            case CipherSuite.TLS_DH_DSS_WITH_ARIA_256_GCM_SHA384 /* 49241 */:
                                                            case CipherSuite.TLS_DH_anon_WITH_ARIA_128_GCM_SHA256 /* 49242 */:
                                                            case CipherSuite.TLS_DH_anon_WITH_ARIA_256_GCM_SHA384 /* 49243 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_128_GCM_SHA256 /* 49244 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_ARIA_256_GCM_SHA384 /* 49245 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_128_GCM_SHA256 /* 49246 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_ARIA_256_GCM_SHA384 /* 49247 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_128_GCM_SHA256 /* 49248 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_ARIA_256_GCM_SHA384 /* 49249 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_128_GCM_SHA256 /* 49250 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_ARIA_256_GCM_SHA384 /* 49251 */:
                                                            case CipherSuite.TLS_PSK_WITH_ARIA_128_CBC_SHA256 /* 49252 */:
                                                            case CipherSuite.TLS_PSK_WITH_ARIA_256_CBC_SHA384 /* 49253 */:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_128_CBC_SHA256 /* 49254 */:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_256_CBC_SHA384 /* 49255 */:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_128_CBC_SHA256 /* 49256 */:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_256_CBC_SHA384 /* 49257 */:
                                                            case CipherSuite.TLS_PSK_WITH_ARIA_128_GCM_SHA256 /* 49258 */:
                                                            case CipherSuite.TLS_PSK_WITH_ARIA_256_GCM_SHA384 /* 49259 */:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_128_GCM_SHA256 /* 49260 */:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_ARIA_256_GCM_SHA384 /* 49261 */:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_128_GCM_SHA256 /* 49262 */:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_ARIA_256_GCM_SHA384 /* 49263 */:
                                                            case CipherSuite.TLS_ECDHE_PSK_WITH_ARIA_128_CBC_SHA256 /* 49264 */:
                                                            case CipherSuite.TLS_ECDHE_PSK_WITH_ARIA_256_CBC_SHA384 /* 49265 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49266 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49267 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49268 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49269 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49270 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49271 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49272 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49273 */:
                                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49274 */:
                                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49275 */:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49276 */:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49277 */:
                                                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49278 */:
                                                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49279 */:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49280 */:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49281 */:
                                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49282 */:
                                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49283 */:
                                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_GCM_SHA256 /* 49284 */:
                                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_GCM_SHA384 /* 49285 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
                                                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49294 */:
                                                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49295 */:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49296 */:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49297 */:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49298 */:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49299 */:
                                                            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CCM_SHA256 /* 53253 */:
                                                            case CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB /* 65280 */:
                                                            case 65281:
                                                            case 65282:
                                                            case CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_AES_256_OCB /* 65283 */:
                                                            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_128_OCB /* 65284 */:
                                                            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_256_OCB /* 65285 */:
                                                            case CipherSuite.DRAFT_TLS_PSK_WITH_AES_128_OCB /* 65296 */:
                                                            case CipherSuite.DRAFT_TLS_PSK_WITH_AES_256_OCB /* 65297 */:
                                                            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_128_OCB /* 65298 */:
                                                            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_256_OCB /* 65299 */:
                                                            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_128_OCB /* 65300 */:
                                                            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_256_OCB /* 65301 */:
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case CipherSuite.TLS_RSA_WITH_AES_128_CCM /* 49308 */:
                                                                    case CipherSuite.TLS_RSA_WITH_AES_256_CCM /* 49309 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM /* 49310 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM /* 49311 */:
                                                                    case CipherSuite.TLS_RSA_WITH_AES_128_CCM_8 /* 49312 */:
                                                                    case CipherSuite.TLS_RSA_WITH_AES_256_CCM_8 /* 49313 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8 /* 49314 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8 /* 49315 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_128_CCM /* 49316 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_256_CCM /* 49317 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CCM /* 49318 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CCM /* 49319 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_128_CCM_8 /* 49320 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 /* 49321 */:
                                                                    case CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8 /* 49322 */:
                                                                    case CipherSuite.TLS_PSK_DHE_WITH_AES_256_CCM_8 /* 49323 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52392 */:
                                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52393 */:
                                                                            case CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52394 */:
                                                                            case CipherSuite.TLS_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52395 */:
                                                                            case CipherSuite.TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52396 */:
                                                                            case CipherSuite.TLS_DHE_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52397 */:
                                                                            case CipherSuite.TLS_RSA_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52398 */:
                                                                                break;
                                                                            default:
                                                                                switch (i) {
                                                                                    case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_GCM_SHA256 /* 53249 */:
                                                                                    case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_GCM_SHA384 /* 53250 */:
                                                                                    case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CCM_8_SHA256 /* 53251 */:
                                                                                        break;
                                                                                    default:
                                                                                        return ProtocolVersion.SSLv3;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        return ProtocolVersion.TLSv12;
    }

    public static Vector getNamedGroupRoles(Vector vector) {
        Vector vector2 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            int intValue = ((Integer) vector.elementAt(i)).intValue();
            if (intValue == 3 || intValue == 5 || intValue == 7 || intValue == 9 || intValue == 11 || intValue == 14) {
                addToSet(vector2, 1);
            } else {
                if (intValue != 24) {
                    switch (intValue) {
                        case 16:
                        case 17:
                            addToSet(vector2, 2);
                            addToSet(vector2, 3);
                            break;
                    }
                }
                addToSet(vector2, 2);
            }
        }
        return vector2;
    }

    public static ASN1ObjectIdentifier getOIDForHashAlgorithm(short s10) {
        switch (s10) {
            case 1:
                return PKCSObjectIdentifiers.md5;
            case 2:
                return X509ObjectIdentifiers.id_SHA1;
            case 3:
                return NISTObjectIdentifiers.id_sha224;
            case 4:
                return NISTObjectIdentifiers.id_sha256;
            case 5:
                return NISTObjectIdentifiers.id_sha384;
            case 6:
                return NISTObjectIdentifiers.id_sha512;
            default:
                throw new IllegalArgumentException("invalid HashAlgorithm: " + HashAlgorithm.getText(s10));
        }
    }

    public static Vector getSignatureAlgorithmsExtension(Hashtable hashtable) {
        return TlsExtensionsUtils.getSignatureAlgorithmsExtension(hashtable);
    }

    public static SignatureAndHashAlgorithm getSignatureAndHashAlgorithm(TlsContext tlsContext, TlsCredentialedSigner tlsCredentialedSigner) {
        if (!isTLSv12(tlsContext)) {
            return null;
        }
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = tlsCredentialedSigner.getSignatureAndHashAlgorithm();
        if (signatureAndHashAlgorithm != null) {
            return signatureAndHashAlgorithm;
        }
        throw new TlsFatalAlert((short) 80);
    }

    public static int[] getSupportedCipherSuites(TlsCrypto tlsCrypto, int[] iArr) {
        return getSupportedCipherSuites(tlsCrypto, iArr, iArr.length);
    }

    public static Vector getUsableSignatureAlgorithms(Vector vector) {
        if (vector == null) {
            Vector vector2 = new Vector(3);
            vector2.addElement(Shorts.valueOf((short) 1));
            vector2.addElement(Shorts.valueOf((short) 2));
            vector2.addElement(Shorts.valueOf((short) 3));
            return vector2;
        }
        Vector vector3 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = (SignatureAndHashAlgorithm) vector.elementAt(i);
            if (signatureAndHashAlgorithm.getHash() >= MINIMUM_HASH_STRICT) {
                Short valueOf = Shorts.valueOf(signatureAndHashAlgorithm.getSignature());
                if (!vector3.contains(valueOf)) {
                    vector3.addElement(valueOf);
                }
            }
        }
        return vector3;
    }

    public static boolean hasAnyRSASigAlgs(TlsCrypto tlsCrypto) {
        return tlsCrypto.hasSignatureAlgorithm((short) 1) || tlsCrypto.hasSignatureAlgorithm((short) 4) || tlsCrypto.hasSignatureAlgorithm((short) 5) || tlsCrypto.hasSignatureAlgorithm((short) 6) || tlsCrypto.hasSignatureAlgorithm((short) 9) || tlsCrypto.hasSignatureAlgorithm((short) 10) || tlsCrypto.hasSignatureAlgorithm((short) 11);
    }

    public static boolean hasExpectedEmptyExtensionData(Hashtable hashtable, Integer num, short s10) {
        byte[] extensionData = getExtensionData(hashtable, num);
        if (extensionData == null) {
            return false;
        }
        if (extensionData.length == 0) {
            return true;
        }
        throw new TlsFatalAlert(s10);
    }

    public static boolean hasSigningCapability(short s10) {
        return s10 == 1 || s10 == 2 || s10 == 64;
    }

    public static TlsSession importSession(byte[] bArr, SessionParameters sessionParameters) {
        return new TlsSessionImpl(bArr, sessionParameters);
    }

    public static TlsCipher initCipher(TlsContext tlsContext) {
        int cipherSuite = tlsContext.getSecurityParametersHandshake().getCipherSuite();
        int encryptionAlgorithm = getEncryptionAlgorithm(cipherSuite);
        int mACAlgorithm = getMACAlgorithm(cipherSuite);
        if (encryptionAlgorithm < 0 || mACAlgorithm < 0) {
            throw new TlsFatalAlert((short) 80);
        }
        return tlsContext.getSecurityParametersHandshake().getMasterSecret().createCipher(new TlsCryptoParameters(tlsContext), encryptionAlgorithm, mACAlgorithm);
    }

    private static TlsKeyExchange initKeyExchange(TlsContext tlsContext, TlsKeyExchange tlsKeyExchange) {
        Vector clientSigAlgs;
        tlsKeyExchange.init(tlsContext);
        SecurityParameters securityParametersHandshake = tlsContext.getSecurityParametersHandshake();
        if (isSignatureAlgorithmsExtensionAllowed(tlsContext.getServerVersion())) {
            if (securityParametersHandshake.getClientSigAlgs() == null) {
                securityParametersHandshake.clientSigAlgs = getDefaultSignatureAlgorithms(getLegacySignatureAlgorithmServerCert(securityParametersHandshake.getKeyExchangeAlgorithm()));
            }
            clientSigAlgs = securityParametersHandshake.getClientSigAlgsCert() == null ? securityParametersHandshake.getClientSigAlgs() : null;
            return tlsKeyExchange;
        }
        securityParametersHandshake.clientSigAlgs = null;
        securityParametersHandshake.clientSigAlgsCert = clientSigAlgs;
        return tlsKeyExchange;
    }

    public static TlsKeyExchange initKeyExchangeClient(TlsClientContext tlsClientContext, TlsClient tlsClient) {
        SecurityParameters securityParametersHandshake = tlsClientContext.getSecurityParametersHandshake();
        securityParametersHandshake.keyExchangeAlgorithm = getKeyExchangeAlgorithm(securityParametersHandshake.getCipherSuite());
        return initKeyExchange(tlsClientContext, createKeyExchangeClient(tlsClient, securityParametersHandshake.getKeyExchangeAlgorithm()));
    }

    public static TlsKeyExchange initKeyExchangeServer(TlsServerContext tlsServerContext, TlsServer tlsServer) {
        SecurityParameters securityParametersHandshake = tlsServerContext.getSecurityParametersHandshake();
        securityParametersHandshake.keyExchangeAlgorithm = getKeyExchangeAlgorithm(securityParametersHandshake.getCipherSuite());
        return initKeyExchange(tlsServerContext, createKeyExchangeServer(tlsServer, securityParametersHandshake.getKeyExchangeAlgorithm()));
    }

    public static boolean isAEADCipherSuite(int i) {
        return 2 == getCipherType(i);
    }

    public static boolean isBlockCipherSuite(int i) {
        return 1 == getCipherType(i);
    }

    public static boolean isSignatureAlgorithmsExtensionAllowed(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isStreamCipherSuite(int i) {
        return getCipherType(i) == 0;
    }

    public static boolean isSupportedCipherSuite(TlsCrypto tlsCrypto, int i) {
        return isSupportedKeyExchange(tlsCrypto, getKeyExchangeAlgorithm(i)) && tlsCrypto.hasEncryptionAlgorithm(getEncryptionAlgorithm(i)) && tlsCrypto.hasMacAlgorithm(getMACAlgorithm(i));
    }

    public static boolean isSupportedKeyExchange(TlsCrypto tlsCrypto, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 3) {
                    return tlsCrypto.hasDHAgreement() && tlsCrypto.hasSignatureAlgorithm((short) 2);
                }
                if (i == 5) {
                    return tlsCrypto.hasDHAgreement() && hasAnyRSASigAlgs(tlsCrypto);
                }
                if (i != 7 && i != 9 && i != 11) {
                    switch (i) {
                        case 17:
                            if (!tlsCrypto.hasECDHAgreement() || (!tlsCrypto.hasSignatureAlgorithm((short) 3) && !tlsCrypto.hasSignatureAlgorithm((short) 7) && !tlsCrypto.hasSignatureAlgorithm((short) 8))) {
                                break;
                            }
                            break;
                        case 19:
                            if (!tlsCrypto.hasECDHAgreement() || !hasAnyRSASigAlgs(tlsCrypto)) {
                                break;
                            }
                            break;
                        case 22:
                            if (!tlsCrypto.hasSRPAuthentication() || !tlsCrypto.hasSignatureAlgorithm((short) 2)) {
                                break;
                            }
                            break;
                        case 23:
                            if (!tlsCrypto.hasSRPAuthentication() || !hasAnyRSASigAlgs(tlsCrypto)) {
                                break;
                            }
                            break;
                    }
                    return false;
                }
                return tlsCrypto.hasDHAgreement();
            }
            return tlsCrypto.hasRSAEncryption();
        }
        return true;
    }

    public static boolean isTLSv10(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv10.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isTLSv11(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv11.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isTLSv12(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isTLSv13(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv13.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isValidCipherSuiteForSignatureAlgorithms(int i, Vector vector) {
        int keyExchangeAlgorithm = getKeyExchangeAlgorithm(i);
        if (keyExchangeAlgorithm != 3) {
            if (keyExchangeAlgorithm != 5) {
                if (keyExchangeAlgorithm == 17) {
                    return vector.contains(Shorts.valueOf((short) 3)) || vector.contains(Shorts.valueOf((short) 7)) || vector.contains(Shorts.valueOf((short) 8));
                }
                if (keyExchangeAlgorithm != 19) {
                    if (keyExchangeAlgorithm != 22) {
                        if (keyExchangeAlgorithm != 23) {
                            return true;
                        }
                    }
                }
            }
            return vector.contains(Shorts.valueOf((short) 1)) || vector.contains(Shorts.valueOf((short) 4)) || vector.contains(Shorts.valueOf((short) 5)) || vector.contains(Shorts.valueOf((short) 6)) || vector.contains(Shorts.valueOf((short) 9)) || vector.contains(Shorts.valueOf((short) 10)) || vector.contains(Shorts.valueOf((short) 11));
        }
        return vector.contains(Shorts.valueOf((short) 2));
    }

    public static boolean isValidCipherSuiteForVersion(int i, ProtocolVersion protocolVersion) {
        return getMinimumVersion(i).isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isValidSignatureAlgorithmForCertificateVerify(short s10, short[] sArr) {
        for (short s11 : sArr) {
            if (isValidSignatureAlgorithmForClientCertType(s10, s11)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidSignatureAlgorithmForClientCertType(short s10, short s11) {
        if (s11 != 1) {
            if (s11 == 2) {
                return 2 == s10;
            }
            if (s11 != 64) {
                return false;
            }
            return s10 == 3 || s10 == 7 || s10 == 8;
        }
        if (s10 != 1 && s10 != 4 && s10 != 5 && s10 != 6) {
            switch (s10) {
            }
            return false;
        }
        return true;
    }

    public static boolean isValidSignatureAlgorithmForServerKeyExchange(short s10, int i) {
        if (i != 3) {
            if (i != 5) {
                if (i == 17) {
                    return s10 == 3 || s10 == 7 || s10 == 8;
                }
                if (i != 19) {
                    if (i != 22) {
                        if (i != 23) {
                            return false;
                        }
                    }
                }
            }
            if (s10 != 1 && s10 != 4 && s10 != 5 && s10 != 6) {
                switch (s10) {
                }
                return false;
            }
            return true;
        }
        return 2 == s10;
    }

    public static boolean isValidUint16(int i) {
        return (65535 & i) == i;
    }

    public static boolean isValidUint24(int i) {
        return (16777215 & i) == i;
    }

    public static boolean isValidUint32(long j10) {
        return (BodyPartID.bodyIdMax & j10) == j10;
    }

    public static boolean isValidUint48(long j10) {
        return (281474976710655L & j10) == j10;
    }

    public static boolean isValidUint64(long j10) {
        return true;
    }

    public static boolean isValidUint8(int i) {
        return (i & 255) == i;
    }

    public static CertificateRequest normalizeCertificateRequest(CertificateRequest certificateRequest, short[] sArr) {
        if (containsAll(sArr, certificateRequest.getCertificateTypes())) {
            return certificateRequest;
        }
        short[] retainAll = retainAll(certificateRequest.getCertificateTypes(), sArr);
        if (retainAll.length < 1) {
            return null;
        }
        return new CertificateRequest(retainAll, certificateRequest.getSupportedSignatureAlgorithms(), certificateRequest.getCertificateAuthorities());
    }

    public static Vector parseSupportedSignatureAlgorithms(InputStream inputStream) {
        int readUint16 = readUint16(inputStream);
        if (readUint16 < 2 || (readUint16 & 1) != 0) {
            throw new TlsFatalAlert((short) 50);
        }
        int i = readUint16 / 2;
        Vector vector = new Vector(i);
        for (int i9 = 0; i9 < i; i9++) {
            SignatureAndHashAlgorithm parse = SignatureAndHashAlgorithm.parse(inputStream);
            if (parse.getSignature() != 0) {
                vector.addElement(parse);
            }
        }
        return vector;
    }

    public static void processClientCertificate(TlsServerContext tlsServerContext, Certificate certificate, CertificateRequest certificateRequest, TlsKeyExchange tlsKeyExchange, TlsServer tlsServer) {
        SecurityParameters securityParametersHandshake = tlsServerContext.getSecurityParametersHandshake();
        if (securityParametersHandshake.getPeerCertificate() != null) {
            throw new TlsFatalAlert((short) 10);
        }
        if (certificateRequest == null) {
            throw new TlsFatalAlert((short) 80);
        }
        if (certificate.isEmpty()) {
            tlsKeyExchange.skipClientCredentials();
        } else {
            if (tlsServer.shouldCheckSigAlgOfPeerCerts()) {
                checkSigAlgOfClientCerts(tlsServerContext, certificate, certificateRequest);
            }
            tlsKeyExchange.processClientCertificate(certificate);
        }
        securityParametersHandshake.peerCertificate = certificate;
        tlsServer.notifyClientCertificate(certificate);
    }

    public static void processServerCertificate(TlsClientContext tlsClientContext, TlsClient tlsClient, CertificateStatus certificateStatus, TlsKeyExchange tlsKeyExchange, TlsAuthentication tlsAuthentication, Hashtable hashtable, Hashtable hashtable2) {
        SecurityParameters securityParametersHandshake = tlsClientContext.getSecurityParametersHandshake();
        if (tlsAuthentication == null) {
            tlsKeyExchange.skipServerCredentials();
            securityParametersHandshake.tlsServerEndPoint = EMPTY_BYTES;
            return;
        }
        Certificate peerCertificate = securityParametersHandshake.getPeerCertificate();
        checkTlsFeatures(peerCertificate, hashtable, hashtable2);
        if (tlsClient.shouldCheckSigAlgOfPeerCerts()) {
            checkSigAlgOfServerCerts(tlsClientContext, peerCertificate);
        }
        tlsKeyExchange.processServerCertificate(peerCertificate);
        tlsAuthentication.notifyServerCertificate(new TlsServerCertificateImpl(peerCertificate, certificateStatus));
    }

    public static ASN1Primitive readASN1Object(byte[] bArr) {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        ASN1Primitive readObject = aSN1InputStream.readObject();
        if (readObject == null) {
            throw new TlsFatalAlert((short) 50);
        }
        if (aSN1InputStream.readObject() == null) {
            return readObject;
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static byte[] readAllOrNothing(int i, InputStream inputStream) {
        if (i < 1) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i];
        int readFully = Streams.readFully(inputStream, bArr);
        if (readFully == 0) {
            return null;
        }
        if (readFully == i) {
            return bArr;
        }
        throw new EOFException();
    }

    public static ASN1Primitive readDERObject(byte[] bArr) {
        ASN1Primitive readASN1Object = readASN1Object(bArr);
        if (Arrays.areEqual(readASN1Object.getEncoded(ASN1Encoding.DER), bArr)) {
            return readASN1Object;
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static void readFully(byte[] bArr, InputStream inputStream) {
        int length = bArr.length;
        if (length > 0 && length != Streams.readFully(inputStream, bArr)) {
            throw new EOFException();
        }
    }

    public static byte[] readOpaque16(InputStream inputStream) {
        return readFully(readUint16(inputStream), inputStream);
    }

    public static byte[] readOpaque24(InputStream inputStream) {
        return readFully(readUint24(inputStream), inputStream);
    }

    public static byte[] readOpaque8(InputStream inputStream) {
        return readFully(readUint8(inputStream), inputStream);
    }

    public static Vector readSignatureAlgorithmsExtension(byte[] bArr) {
        return TlsExtensionsUtils.readSignatureAlgorithmsExtension(bArr);
    }

    public static int readUint16(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return read2 | (read << 8);
        }
        throw new EOFException();
    }

    public static int[] readUint16Array(int i, InputStream inputStream) {
        int[] iArr = new int[i];
        for (int i9 = 0; i9 < i; i9++) {
            iArr[i9] = readUint16(inputStream);
        }
        return iArr;
    }

    public static int readUint24(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        if (read3 >= 0) {
            return read3 | (read << 16) | (read2 << 8);
        }
        throw new EOFException();
    }

    public static long readUint32(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        if (inputStream.read() >= 0) {
            return (r4 | (read << 24) | (read2 << 16) | (read3 << 8)) & BodyPartID.bodyIdMax;
        }
        throw new EOFException();
    }

    public static long readUint48(InputStream inputStream) {
        return ((readUint24(inputStream) & BodyPartID.bodyIdMax) << 24) | (BodyPartID.bodyIdMax & readUint24(inputStream));
    }

    public static short readUint8(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            return (short) read;
        }
        throw new EOFException();
    }

    public static short[] readUint8Array(int i, InputStream inputStream) {
        short[] sArr = new short[i];
        for (int i9 = 0; i9 < i; i9++) {
            sArr[i9] = readUint8(inputStream);
        }
        return sArr;
    }

    public static ProtocolVersion readVersion(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 < 0) {
            throw new EOFException();
        }
        try {
            return ProtocolVersion.get(read, read2);
        } catch (RuntimeException e10) {
            throw new TlsFatalAlert((short) 50, e10);
        }
    }

    public static void receiveServerCertificate(TlsClientContext tlsClientContext, ByteArrayInputStream byteArrayInputStream) {
        SecurityParameters securityParametersHandshake = tlsClientContext.getSecurityParametersHandshake();
        if (securityParametersHandshake.getPeerCertificate() != null) {
            throw new TlsFatalAlert((short) 10);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Certificate parse = Certificate.parse(tlsClientContext, byteArrayInputStream, byteArrayOutputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        if (parse.isEmpty()) {
            throw new TlsFatalAlert((short) 42);
        }
        securityParametersHandshake.peerCertificate = parse;
        securityParametersHandshake.tlsServerEndPoint = byteArrayOutputStream.toByteArray();
    }

    public static TlsCredentialedAgreement requireAgreementCredentials(TlsCredentials tlsCredentials) {
        if (tlsCredentials instanceof TlsCredentialedAgreement) {
            return (TlsCredentialedAgreement) tlsCredentials;
        }
        throw new TlsFatalAlert((short) 80);
    }

    public static TlsCredentialedDecryptor requireDecryptorCredentials(TlsCredentials tlsCredentials) {
        if (tlsCredentials instanceof TlsCredentialedDecryptor) {
            return (TlsCredentialedDecryptor) tlsCredentials;
        }
        throw new TlsFatalAlert((short) 80);
    }

    public static TlsCredentialedSigner requireSignerCredentials(TlsCredentials tlsCredentials) {
        if (tlsCredentials instanceof TlsCredentialedSigner) {
            return (TlsCredentialedSigner) tlsCredentials;
        }
        throw new TlsFatalAlert((short) 80);
    }

    public static short[] retainAll(short[] sArr, short[] sArr2) {
        short[] sArr3 = new short[Math.min(sArr.length, sArr2.length)];
        int i = 0;
        for (int i9 = 0; i9 < sArr2.length; i9++) {
            if (Arrays.contains(sArr, sArr2[i9])) {
                sArr3[i] = sArr2[i9];
                i++;
            }
        }
        return truncate(sArr3, i);
    }

    public static void sealHandshakeHash(TlsContext tlsContext, TlsHandshakeHash tlsHandshakeHash, boolean z10) {
        if (z10 || !tlsContext.getCrypto().hasAllRawSignatureAlgorithms()) {
            tlsHandshakeHash.forceBuffering();
        }
        tlsHandshakeHash.sealHashAlgorithms();
    }

    public static void sendSignatureInput(TlsContext tlsContext, DigestInputBuffer digestInputBuffer, OutputStream outputStream) {
        SecurityParameters securityParametersHandshake = tlsContext.getSecurityParametersHandshake();
        outputStream.write(Arrays.concatenate(securityParametersHandshake.getClientRandom(), securityParametersHandshake.getServerRandom()));
        digestInputBuffer.copyTo(outputStream);
        outputStream.close();
    }

    public static void trackHashAlgorithms(TlsHandshakeHash tlsHandshakeHash, Vector vector) {
        if (vector != null) {
            for (int i = 0; i < vector.size(); i++) {
                short hash = ((SignatureAndHashAlgorithm) vector.elementAt(i)).getHash();
                if (8 == hash) {
                    tlsHandshakeHash.forceBuffering();
                } else if (HashAlgorithm.isRecognized(hash)) {
                    tlsHandshakeHash.trackHashAlgorithm(hash);
                }
            }
        }
    }

    public static short[] truncate(short[] sArr, int i) {
        if (i < sArr.length) {
            return sArr;
        }
        short[] sArr2 = new short[i];
        System.arraycopy(sArr, 0, sArr2, 0, i);
        return sArr2;
    }

    public static CertificateRequest validateCertificateRequest(CertificateRequest certificateRequest, TlsKeyExchange tlsKeyExchange) {
        short[] clientCertificateTypes = tlsKeyExchange.getClientCertificateTypes();
        if (clientCertificateTypes == null || clientCertificateTypes.length < 1) {
            throw new TlsFatalAlert((short) 10);
        }
        CertificateRequest normalizeCertificateRequest = normalizeCertificateRequest(certificateRequest, clientCertificateTypes);
        if (normalizeCertificateRequest != null) {
            return normalizeCertificateRequest;
        }
        throw new TlsFatalAlert((short) 47);
    }

    public static Vector vectorOfOne(Object obj) {
        Vector vector = new Vector(1);
        vector.addElement(obj);
        return vector;
    }

    public static void verifyCertificateVerify(TlsServerContext tlsServerContext, CertificateRequest certificateRequest, DigitallySigned digitallySigned, TlsHandshakeHash tlsHandshakeHash) {
        short signature;
        boolean verifyRawSignature;
        SecurityParameters securityParametersHandshake = tlsServerContext.getSecurityParametersHandshake();
        TlsCertificate certificateAt = securityParametersHandshake.getPeerCertificate().getCertificateAt(0);
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm == null) {
            signature = certificateAt.getLegacySignatureAlgorithm();
            short legacyClientCertType = getLegacyClientCertType(signature);
            if (legacyClientCertType < 0 || !Arrays.contains(certificateRequest.getCertificateTypes(), legacyClientCertType)) {
                throw new TlsFatalAlert((short) 47);
            }
        } else {
            signature = algorithm.getSignature();
            if (!isValidSignatureAlgorithmForCertificateVerify(signature, certificateRequest.getCertificateTypes())) {
                throw new TlsFatalAlert((short) 47);
            }
            verifySupportedSignatureAlgorithm(certificateRequest.getSupportedSignatureAlgorithms(), algorithm);
        }
        try {
            TlsVerifier createVerifier = certificateAt.createVerifier(signature);
            TlsStreamVerifier streamVerifier = createVerifier.getStreamVerifier(digitallySigned);
            if (streamVerifier != null) {
                tlsHandshakeHash.copyBufferTo(streamVerifier.getOutputStream());
                verifyRawSignature = streamVerifier.isVerified();
            } else {
                verifyRawSignature = createVerifier.verifyRawSignature(digitallySigned, isTLSv12(tlsServerContext) ? tlsHandshakeHash.getFinalHash(algorithm.getHash()) : securityParametersHandshake.getSessionHash());
            }
            if (!verifyRawSignature) {
                throw new TlsFatalAlert((short) 51);
            }
        } catch (TlsFatalAlert e10) {
            throw e10;
        } catch (Exception e11) {
            throw new TlsFatalAlert((short) 51, e11);
        }
    }

    public static void verifyServerKeyExchangeSignature(TlsContext tlsContext, InputStream inputStream, TlsCertificate tlsCertificate, DigestInputBuffer digestInputBuffer) {
        short s10;
        boolean verifyRawSignature;
        DigitallySigned parse = DigitallySigned.parse(tlsContext, inputStream);
        SecurityParameters securityParametersHandshake = tlsContext.getSecurityParametersHandshake();
        int keyExchangeAlgorithm = securityParametersHandshake.getKeyExchangeAlgorithm();
        SignatureAndHashAlgorithm algorithm = parse.getAlgorithm();
        if (algorithm == null) {
            s10 = getLegacySignatureAlgorithmServer(keyExchangeAlgorithm);
        } else {
            short signature = algorithm.getSignature();
            if (!isValidSignatureAlgorithmForServerKeyExchange(signature, keyExchangeAlgorithm)) {
                throw new TlsFatalAlert((short) 47);
            }
            verifySupportedSignatureAlgorithm(securityParametersHandshake.getClientSigAlgs(), algorithm);
            s10 = signature;
        }
        TlsVerifier createVerifier = tlsCertificate.createVerifier(s10);
        TlsStreamVerifier streamVerifier = createVerifier.getStreamVerifier(parse);
        if (streamVerifier != null) {
            sendSignatureInput(tlsContext, digestInputBuffer, streamVerifier.getOutputStream());
            verifyRawSignature = streamVerifier.isVerified();
        } else {
            verifyRawSignature = createVerifier.verifyRawSignature(parse, calculateSignatureHash(tlsContext, algorithm, digestInputBuffer));
        }
        if (!verifyRawSignature) {
            throw new TlsFatalAlert((short) 51);
        }
    }

    public static void verifySupportedSignatureAlgorithm(Vector vector, SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (vector == null || vector.size() < 1 || vector.size() >= 32768) {
            throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
        }
        if (signatureAndHashAlgorithm == null) {
            throw new IllegalArgumentException("'signatureAlgorithm' cannot be null");
        }
        if (signatureAndHashAlgorithm.getSignature() == 0 || !containsSignatureAlgorithm(vector, signatureAndHashAlgorithm)) {
            throw new TlsFatalAlert((short) 47);
        }
    }

    public static void writeDowngradeMarker(ProtocolVersion protocolVersion, byte[] bArr) {
        byte[] bArr2;
        ProtocolVersion equivalentTLSVersion = protocolVersion.getEquivalentTLSVersion();
        if (ProtocolVersion.TLSv12 == equivalentTLSVersion) {
            bArr2 = DOWNGRADE_TLS12;
        } else {
            if (!equivalentTLSVersion.isEqualOrEarlierVersionOf(ProtocolVersion.TLSv11)) {
                throw new TlsFatalAlert((short) 80);
            }
            bArr2 = DOWNGRADE_TLS11;
        }
        System.arraycopy(bArr2, 0, bArr, bArr.length - bArr2.length, bArr2.length);
    }

    public static void writeGMTUnixTime(byte[] bArr, int i) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        bArr[i] = (byte) (currentTimeMillis >>> 24);
        bArr[i + 1] = (byte) (currentTimeMillis >>> 16);
        bArr[i + 2] = (byte) (currentTimeMillis >>> 8);
        bArr[i + 3] = (byte) currentTimeMillis;
    }

    public static void writeOpaque16(byte[] bArr, OutputStream outputStream) {
        checkUint16(bArr.length);
        writeUint16(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeOpaque24(byte[] bArr, OutputStream outputStream) {
        checkUint24(bArr.length);
        writeUint24(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeOpaque8(byte[] bArr, OutputStream outputStream) {
        checkUint8(bArr.length);
        writeUint8(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeUint16(int i, OutputStream outputStream) {
        outputStream.write(i >>> 8);
        outputStream.write(i);
    }

    public static void writeUint16Array(int[] iArr, OutputStream outputStream) {
        for (int i : iArr) {
            writeUint16(i, outputStream);
        }
    }

    public static void writeUint16ArrayWithUint16Length(int[] iArr, OutputStream outputStream) {
        int length = iArr.length * 2;
        checkUint16(length);
        writeUint16(length, outputStream);
        writeUint16Array(iArr, outputStream);
    }

    public static void writeUint24(int i, OutputStream outputStream) {
        outputStream.write((byte) (i >>> 16));
        outputStream.write((byte) (i >>> 8));
        outputStream.write((byte) i);
    }

    public static void writeUint32(long j10, OutputStream outputStream) {
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) j10);
    }

    public static void writeUint48(long j10, OutputStream outputStream) {
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) j10);
    }

    public static void writeUint64(long j10, OutputStream outputStream) {
        outputStream.write((byte) (j10 >>> 56));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) j10);
    }

    public static void writeUint8(int i, OutputStream outputStream) {
        outputStream.write(i);
    }

    public static void writeUint8Array(short[] sArr, OutputStream outputStream) {
        for (short s10 : sArr) {
            writeUint8(s10, outputStream);
        }
    }

    public static void writeUint8ArrayWithUint8Length(short[] sArr, OutputStream outputStream) {
        checkUint8(sArr.length);
        writeUint8(sArr.length, outputStream);
        writeUint8Array(sArr, outputStream);
    }

    public static void writeVersion(ProtocolVersion protocolVersion, OutputStream outputStream) {
        outputStream.write(protocolVersion.getMajorVersion());
        outputStream.write(protocolVersion.getMinorVersion());
    }

    public static TlsSecret PRF(TlsContext tlsContext, TlsSecret tlsSecret, String str, byte[] bArr, int i) {
        return tlsSecret.deriveUsingPRF(tlsContext.getSecurityParametersHandshake().getPrfAlgorithm(), str, bArr, i);
    }

    public static void addIfSupported(Vector vector, TlsCrypto tlsCrypto, SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (tlsCrypto.hasSignatureAndHashAlgorithm(signatureAndHashAlgorithm)) {
            vector.addElement(signatureAndHashAlgorithm);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r2 != 8) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] calculateEndPointHash(org.bouncycastle.tls.TlsContext r1, java.lang.String r2, byte[] r3, int r4, int r5) {
        /*
            if (r2 == 0) goto L2f
            org.bouncycastle.tls.SignatureAndHashAlgorithm r2 = getCertSigAndHashAlg(r2)
            if (r2 == 0) goto L2f
            short r2 = r2.getHash()
            if (r2 == 0) goto L2c
            r0 = 1
            if (r2 == r0) goto L19
            r0 = 2
            if (r2 == r0) goto L19
            r0 = 8
            if (r2 == r0) goto L2c
            goto L1a
        L19:
            r2 = 4
        L1a:
            org.bouncycastle.tls.crypto.TlsCrypto r1 = r1.getCrypto()
            org.bouncycastle.tls.crypto.TlsHash r1 = r1.createHash(r2)
            if (r1 == 0) goto L2f
            r1.update(r3, r4, r5)
            byte[] r1 = r1.calculateHash()
            return r1
        L2c:
            byte[] r1 = org.bouncycastle.tls.TlsUtils.EMPTY_BYTES
            return r1
        L2f:
            byte[] r1 = org.bouncycastle.tls.TlsUtils.EMPTY_BYTES
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tls.TlsUtils.calculateEndPointHash(org.bouncycastle.tls.TlsContext, java.lang.String, byte[], int, int):byte[]");
    }

    public static byte[] calculateTLSVerifyData(TlsContext tlsContext, TlsHandshakeHash tlsHandshakeHash, boolean z10) {
        return calculateTLSVerifyData(tlsContext, z10 ? ExporterLabel.server_finished : ExporterLabel.client_finished, getCurrentPRFHash(tlsHandshakeHash));
    }

    private static void checkDowngradeMarker(byte[] bArr, byte[] bArr2) {
        if (Arrays.constantTimeAreEqual(copyOfRangeExact(bArr, bArr.length - bArr2.length, bArr.length), bArr2)) {
            throw new TlsFatalAlert((short) 47);
        }
    }

    public static void checkUint16(long j10) {
        if (!isValidUint16(j10)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint24(long j10) {
        if (!isValidUint24(j10)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint8(long j10) {
        if (!isValidUint8(j10)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static boolean containsNonAscii(byte[] bArr) {
        for (byte b9 : bArr) {
            if ((b9 & 255) >= 128) {
                return true;
            }
        }
        return false;
    }

    public static byte[] decodeOpaque16(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("'buf' cannot be null");
        }
        if (bArr.length < 2) {
            throw new TlsFatalAlert((short) 50);
        }
        int readUint16 = readUint16(bArr, 0);
        if (bArr.length != readUint16 + 2 || readUint16 < i) {
            throw new TlsFatalAlert((short) 50);
        }
        return copyOfRangeExact(bArr, 2, bArr.length);
    }

    public static byte[] decodeOpaque8(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("'buf' cannot be null");
        }
        if (bArr.length < 1) {
            throw new TlsFatalAlert((short) 50);
        }
        short readUint8 = readUint8(bArr, 0);
        if (bArr.length != readUint8 + 1 || readUint8 < i) {
            throw new TlsFatalAlert((short) 50);
        }
        return copyOfRangeExact(bArr, 1, bArr.length);
    }

    public static Vector getNamedGroupRoles(int[] iArr) {
        return getNamedGroupRoles(getKeyExchangeAlgorithms(iArr));
    }

    public static int[] getSupportedCipherSuites(TlsCrypto tlsCrypto, int[] iArr, int i) {
        int[] iArr2 = new int[i];
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = iArr[i10];
            if (isSupportedCipherSuite(tlsCrypto, i11)) {
                iArr2[i9] = i11;
                i9++;
            }
        }
        return i9 < i ? Arrays.copyOf(iArr2, i9) : iArr2;
    }

    public static boolean isTLSv10(TlsContext tlsContext) {
        return isTLSv10(tlsContext.getServerVersion());
    }

    public static boolean isTLSv11(TlsContext tlsContext) {
        return isTLSv11(tlsContext.getServerVersion());
    }

    public static boolean isTLSv12(TlsContext tlsContext) {
        return isTLSv12(tlsContext.getServerVersion());
    }

    public static boolean isTLSv13(TlsContext tlsContext) {
        return isTLSv13(tlsContext.getServerVersion());
    }

    public static boolean isValidUint16(long j10) {
        return (65535 & j10) == j10;
    }

    public static boolean isValidUint24(long j10) {
        return (16777215 & j10) == j10;
    }

    public static boolean isValidUint8(long j10) {
        return (255 & j10) == j10;
    }

    public static byte[] readFully(int i, InputStream inputStream) {
        if (i < 1) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i];
        if (i == Streams.readFully(inputStream, bArr)) {
            return bArr;
        }
        throw new EOFException();
    }

    public static byte[] readOpaque16(InputStream inputStream, int i) {
        int readUint16 = readUint16(inputStream);
        if (readUint16 >= i) {
            return readFully(readUint16, inputStream);
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static byte[] readOpaque24(InputStream inputStream, int i) {
        int readUint24 = readUint24(inputStream);
        if (readUint24 >= i) {
            return readFully(readUint24, inputStream);
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static byte[] readOpaque8(InputStream inputStream, int i) {
        short readUint8 = readUint8(inputStream);
        if (readUint8 >= i) {
            return readFully(readUint8, inputStream);
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static int readUint16(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public static int readUint24(byte[] bArr, int i) {
        return (bArr[i + 2] & 255) | ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static long readUint32(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8)) & BodyPartID.bodyIdMax;
    }

    public static long readUint48(byte[] bArr, int i) {
        int readUint24 = readUint24(bArr, i);
        return (readUint24(bArr, i + 3) & BodyPartID.bodyIdMax) | ((readUint24 & BodyPartID.bodyIdMax) << 24);
    }

    public static short readUint8(byte[] bArr, int i) {
        return (short) (bArr[i] & 255);
    }

    public static ProtocolVersion readVersion(byte[] bArr, int i) {
        try {
            return ProtocolVersion.get(bArr[i] & 255, bArr[i + 1] & 255);
        } catch (RuntimeException e10) {
            throw new TlsFatalAlert((short) 50, e10);
        }
    }

    public static void writeOpaque8(byte[] bArr, byte[] bArr2, int i) {
        checkUint8(bArr.length);
        writeUint8(bArr.length, bArr2, i);
        System.arraycopy(bArr, 0, bArr2, i + 1, bArr.length);
    }

    public static void writeUint16(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) (i >>> 8);
        bArr[i9 + 1] = (byte) i;
    }

    public static void writeUint16Array(int[] iArr, byte[] bArr, int i) {
        for (int i9 : iArr) {
            writeUint16(i9, bArr, i);
            i += 2;
        }
    }

    public static void writeUint16ArrayWithUint16Length(int[] iArr, byte[] bArr, int i) {
        int length = iArr.length * 2;
        checkUint16(length);
        writeUint16(length, bArr, i);
        writeUint16Array(iArr, bArr, i + 2);
    }

    public static void writeUint24(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) (i >>> 16);
        bArr[i9 + 1] = (byte) (i >>> 8);
        bArr[i9 + 2] = (byte) i;
    }

    public static void writeUint32(long j10, byte[] bArr, int i) {
        bArr[i] = (byte) (j10 >>> 24);
        bArr[i + 1] = (byte) (j10 >>> 16);
        bArr[i + 2] = (byte) (j10 >>> 8);
        bArr[i + 3] = (byte) j10;
    }

    public static void writeUint48(long j10, byte[] bArr, int i) {
        bArr[i] = (byte) (j10 >>> 40);
        bArr[i + 1] = (byte) (j10 >>> 32);
        bArr[i + 2] = (byte) (j10 >>> 24);
        bArr[i + 3] = (byte) (j10 >>> 16);
        bArr[i + 4] = (byte) (j10 >>> 8);
        bArr[i + 5] = (byte) j10;
    }

    public static void writeUint64(long j10, byte[] bArr, int i) {
        bArr[i] = (byte) (j10 >>> 56);
        bArr[i + 1] = (byte) (j10 >>> 48);
        bArr[i + 2] = (byte) (j10 >>> 40);
        bArr[i + 3] = (byte) (j10 >>> 32);
        bArr[i + 4] = (byte) (j10 >>> 24);
        bArr[i + 5] = (byte) (j10 >>> 16);
        bArr[i + 6] = (byte) (j10 >>> 8);
        bArr[i + 7] = (byte) j10;
    }

    public static void writeUint8(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) i;
    }

    public static void writeUint8Array(short[] sArr, byte[] bArr, int i) {
        for (short s10 : sArr) {
            writeUint8(s10, bArr, i);
            i++;
        }
    }

    public static void writeUint8ArrayWithUint8Length(short[] sArr, byte[] bArr, int i) {
        checkUint8(sArr.length);
        writeUint8(sArr.length, bArr, i);
        writeUint8Array(sArr, bArr, i + 1);
    }

    public static void writeVersion(ProtocolVersion protocolVersion, byte[] bArr, int i) {
        bArr[i] = (byte) protocolVersion.getMajorVersion();
        bArr[i + 1] = (byte) protocolVersion.getMinorVersion();
    }

    public static void addIfSupported(Vector vector, TlsCrypto tlsCrypto, int[] iArr) {
        for (int i : iArr) {
            addIfSupported(vector, tlsCrypto, i);
        }
    }

    public static void checkUint8(short s10) {
        if (!isValidUint8(s10)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static boolean isValidUint8(short s10) {
        return (s10 & 255) == s10;
    }

    public static byte[] readOpaque8(InputStream inputStream, int i, int i9) {
        short readUint8 = readUint8(inputStream);
        if (readUint8 < i || i9 < readUint8) {
            throw new TlsFatalAlert((short) 50);
        }
        return readFully(readUint8, inputStream);
    }

    public static void writeUint8(short s10, OutputStream outputStream) {
        outputStream.write(s10);
    }

    public static void writeUint8(short s10, byte[] bArr, int i) {
        bArr[i] = (byte) s10;
    }
}
