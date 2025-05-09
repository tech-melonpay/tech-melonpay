package org.bouncycastle.openssl.jcajce;

import C.v;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.openssl.PEMKeyPair;

/* loaded from: classes3.dex */
public class JcaPEMKeyConverter {
    private static final Map algorithms;
    private JcaJceHelper helper = new DefaultJcaJceHelper();

    static {
        HashMap hashMap = new HashMap();
        algorithms = hashMap;
        hashMap.put(X9ObjectIdentifiers.id_ecPublicKey, "ECDSA");
        hashMap.put(PKCSObjectIdentifiers.rsaEncryption, "RSA");
        hashMap.put(X9ObjectIdentifiers.id_dsa, "DSA");
    }

    private KeyFactory getKeyFactory(AlgorithmIdentifier algorithmIdentifier) {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        String str = (String) algorithms.get(algorithm);
        if (str == null) {
            str = algorithm.getId();
        }
        try {
            return this.helper.createKeyFactory(str);
        } catch (NoSuchAlgorithmException e10) {
            if (str.equals("ECDSA")) {
                return this.helper.createKeyFactory("EC");
            }
            throw e10;
        }
    }

    public KeyPair getKeyPair(PEMKeyPair pEMKeyPair) {
        try {
            KeyFactory keyFactory = getKeyFactory(pEMKeyPair.getPrivateKeyInfo().getPrivateKeyAlgorithm());
            return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(pEMKeyPair.getPublicKeyInfo().getEncoded())), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(pEMKeyPair.getPrivateKeyInfo().getEncoded())));
        } catch (Exception e10) {
            throw new PEMException(v.l(e10, new StringBuilder("unable to convert key pair: ")), e10);
        }
    }

    public PrivateKey getPrivateKey(PrivateKeyInfo privateKeyInfo) {
        try {
            return getKeyFactory(privateKeyInfo.getPrivateKeyAlgorithm()).generatePrivate(new PKCS8EncodedKeySpec(privateKeyInfo.getEncoded()));
        } catch (Exception e10) {
            throw new PEMException(v.l(e10, new StringBuilder("unable to convert key pair: ")), e10);
        }
    }

    public PublicKey getPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return getKeyFactory(subjectPublicKeyInfo.getAlgorithm()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (Exception e10) {
            throw new PEMException(v.l(e10, new StringBuilder("unable to convert key pair: ")), e10);
        }
    }

    public JcaPEMKeyConverter setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JcaPEMKeyConverter setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }
}
