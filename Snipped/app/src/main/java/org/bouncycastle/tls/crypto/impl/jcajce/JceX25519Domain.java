package org.bouncycastle.tls.crypto.impl.jcajce;

import androidx.camera.core.impl.utils.a;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsECDomain;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class JceX25519Domain implements TlsECDomain {
    protected final JcaTlsCrypto crypto;

    public JceX25519Domain(JcaTlsCrypto jcaTlsCrypto) {
        this.crypto = jcaTlsCrypto;
    }

    public JceTlsSecret calculateECDHAgreement(PrivateKey privateKey, PublicKey publicKey) {
        try {
            byte[] calculateKeyAgreement = this.crypto.calculateKeyAgreement(XDHParameterSpec.X25519, privateKey, publicKey, "TlsPremasterSecret");
            if (calculateKeyAgreement == null || calculateKeyAgreement.length != 32) {
                throw new TlsCryptoException("invalid secret calculated");
            }
            if (Arrays.areAllZeroes(calculateKeyAgreement, 0, calculateKeyAgreement.length)) {
                throw new TlsFatalAlert((short) 40);
            }
            return this.crypto.adoptLocalSecret(calculateKeyAgreement);
        } catch (GeneralSecurityException e10) {
            throw new TlsCryptoException("cannot calculate secret", e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsECDomain
    public TlsAgreement createECDH() {
        return new JceX25519(this);
    }

    public PublicKey decodePublicKey(byte[] bArr) {
        try {
            return this.crypto.getHelper().createKeyFactory(XDHParameterSpec.X25519).generatePublic(new X509EncodedKeySpec(new SubjectPublicKeyInfo(new AlgorithmIdentifier(EdECObjectIdentifiers.id_X25519), bArr).getEncoded(ASN1Encoding.DER)));
        } catch (Exception e10) {
            throw new TlsFatalAlert((short) 47, e10);
        }
    }

    public byte[] encodePublicKey(PublicKey publicKey) {
        try {
            if ("X.509".equals(publicKey.getFormat())) {
                return SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).getPublicKeyData().getOctets();
            }
        } catch (Exception unused) {
        }
        throw new TlsFatalAlert((short) 80);
    }

    public KeyPair generateKeyPair() {
        try {
            KeyPairGenerator createKeyPairGenerator = this.crypto.getHelper().createKeyPairGenerator(XDHParameterSpec.X25519);
            createKeyPairGenerator.initialize(255, this.crypto.getSecureRandom());
            return createKeyPairGenerator.generateKeyPair();
        } catch (GeneralSecurityException e10) {
            throw Exceptions.illegalStateException(a.p(e10, new StringBuilder("unable to create key pair: ")), e10);
        }
    }
}
