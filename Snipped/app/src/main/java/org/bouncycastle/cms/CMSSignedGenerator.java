package org.bouncycastle.cms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.OtherRevocationInfoFormat;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Store;

/* loaded from: classes2.dex */
public class CMSSignedGenerator {
    public static final String DATA = CMSObjectIdentifiers.data.getId();
    public static final String DIGEST_GOST3411;
    public static final String DIGEST_MD5;
    public static final String DIGEST_RIPEMD128;
    public static final String DIGEST_RIPEMD160;
    public static final String DIGEST_RIPEMD256;
    public static final String DIGEST_SHA1;
    public static final String DIGEST_SHA224;
    public static final String DIGEST_SHA256;
    public static final String DIGEST_SHA384;
    public static final String DIGEST_SHA512;
    private static final Map EC_ALGORITHMS;
    public static final String ENCRYPTION_DSA;
    public static final String ENCRYPTION_ECDSA;
    private static final String ENCRYPTION_ECDSA_WITH_SHA1;
    private static final String ENCRYPTION_ECDSA_WITH_SHA224;
    private static final String ENCRYPTION_ECDSA_WITH_SHA256;
    private static final String ENCRYPTION_ECDSA_WITH_SHA384;
    private static final String ENCRYPTION_ECDSA_WITH_SHA512;
    public static final String ENCRYPTION_ECGOST3410;
    public static final String ENCRYPTION_ECGOST3410_2012_256;
    public static final String ENCRYPTION_ECGOST3410_2012_512;
    public static final String ENCRYPTION_GOST3410;
    public static final String ENCRYPTION_RSA;
    public static final String ENCRYPTION_RSA_PSS;
    private static final Set NO_PARAMS;
    protected List certs = new ArrayList();
    protected List crls = new ArrayList();
    protected List _signers = new ArrayList();
    protected List signerGens = new ArrayList();
    protected Map digests = new HashMap();

    static {
        String id = OIWObjectIdentifiers.idSHA1.getId();
        DIGEST_SHA1 = id;
        String id2 = NISTObjectIdentifiers.id_sha224.getId();
        DIGEST_SHA224 = id2;
        String id3 = NISTObjectIdentifiers.id_sha256.getId();
        DIGEST_SHA256 = id3;
        String id4 = NISTObjectIdentifiers.id_sha384.getId();
        DIGEST_SHA384 = id4;
        String id5 = NISTObjectIdentifiers.id_sha512.getId();
        DIGEST_SHA512 = id5;
        DIGEST_MD5 = PKCSObjectIdentifiers.md5.getId();
        DIGEST_GOST3411 = CryptoProObjectIdentifiers.gostR3411.getId();
        DIGEST_RIPEMD128 = TeleTrusTObjectIdentifiers.ripemd128.getId();
        DIGEST_RIPEMD160 = TeleTrusTObjectIdentifiers.ripemd160.getId();
        DIGEST_RIPEMD256 = TeleTrusTObjectIdentifiers.ripemd256.getId();
        ENCRYPTION_RSA = PKCSObjectIdentifiers.rsaEncryption.getId();
        String id6 = X9ObjectIdentifiers.id_dsa_with_sha1.getId();
        ENCRYPTION_DSA = id6;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X9ObjectIdentifiers.ecdsa_with_SHA1;
        String id7 = aSN1ObjectIdentifier.getId();
        ENCRYPTION_ECDSA = id7;
        ENCRYPTION_RSA_PSS = PKCSObjectIdentifiers.id_RSASSA_PSS.getId();
        ENCRYPTION_GOST3410 = CryptoProObjectIdentifiers.gostR3410_94.getId();
        ENCRYPTION_ECGOST3410 = CryptoProObjectIdentifiers.gostR3410_2001.getId();
        ENCRYPTION_ECGOST3410_2012_256 = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256.getId();
        ENCRYPTION_ECGOST3410_2012_512 = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512.getId();
        String id8 = aSN1ObjectIdentifier.getId();
        ENCRYPTION_ECDSA_WITH_SHA1 = id8;
        String id9 = X9ObjectIdentifiers.ecdsa_with_SHA224.getId();
        ENCRYPTION_ECDSA_WITH_SHA224 = id9;
        String id10 = X9ObjectIdentifiers.ecdsa_with_SHA256.getId();
        ENCRYPTION_ECDSA_WITH_SHA256 = id10;
        String id11 = X9ObjectIdentifiers.ecdsa_with_SHA384.getId();
        ENCRYPTION_ECDSA_WITH_SHA384 = id11;
        String id12 = X9ObjectIdentifiers.ecdsa_with_SHA512.getId();
        ENCRYPTION_ECDSA_WITH_SHA512 = id12;
        HashSet hashSet = new HashSet();
        NO_PARAMS = hashSet;
        HashMap hashMap = new HashMap();
        EC_ALGORITHMS = hashMap;
        hashSet.add(id6);
        hashSet.add(id7);
        hashSet.add(id8);
        hashSet.add(id9);
        hashSet.add(id10);
        hashSet.add(id11);
        hashSet.add(id12);
        hashMap.put(id, id8);
        hashMap.put(id2, id9);
        hashMap.put(id3, id10);
        hashMap.put(id4, id11);
        hashMap.put(id5, id12);
    }

    public void addAttributeCertificate(X509AttributeCertificateHolder x509AttributeCertificateHolder) {
        this.certs.add(new DERTaggedObject(false, 2, (ASN1Encodable) x509AttributeCertificateHolder.toASN1Structure()));
    }

    public void addAttributeCertificates(Store store) {
        this.certs.addAll(CMSUtils.getAttributeCertificatesFromStore(store));
    }

    public void addCRL(X509CRLHolder x509CRLHolder) {
        this.crls.add(x509CRLHolder.toASN1Structure());
    }

    public void addCRLs(Store store) {
        this.crls.addAll(CMSUtils.getCRLsFromStore(store));
    }

    public void addCertificate(X509CertificateHolder x509CertificateHolder) {
        this.certs.add(x509CertificateHolder.toASN1Structure());
    }

    public void addCertificates(Store store) {
        this.certs.addAll(CMSUtils.getCertificatesFromStore(store));
    }

    public void addOtherRevocationInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.crls.add(new DERTaggedObject(false, 1, (ASN1Encodable) new OtherRevocationInfoFormat(aSN1ObjectIdentifier, aSN1Encodable)));
    }

    public void addSignerInfoGenerator(SignerInfoGenerator signerInfoGenerator) {
        this.signerGens.add(signerInfoGenerator);
    }

    public void addSigners(SignerInformationStore signerInformationStore) {
        Iterator<SignerInformation> it = signerInformationStore.getSigners().iterator();
        while (it.hasNext()) {
            this._signers.add(it.next());
        }
    }

    public Map getBaseParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(CMSAttributeTableGenerator.CONTENT_TYPE, aSN1ObjectIdentifier);
        hashMap.put(CMSAttributeTableGenerator.DIGEST_ALGORITHM_IDENTIFIER, algorithmIdentifier);
        hashMap.put(CMSAttributeTableGenerator.DIGEST, Arrays.clone(bArr));
        return hashMap;
    }

    public Map getGeneratedDigests() {
        return new HashMap(this.digests);
    }

    public void addOtherRevocationInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, Store store) {
        this.crls.addAll(CMSUtils.getOthersFromStore(aSN1ObjectIdentifier, store));
    }
}
