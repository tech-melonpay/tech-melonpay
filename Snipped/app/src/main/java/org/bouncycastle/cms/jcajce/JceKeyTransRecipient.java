package org.bouncycastle.cms.jcajce;

import C.v;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey;
import org.bouncycastle.asn1.cryptopro.GostR3410KeyTransport;
import org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KeyTransRecipient;
import org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public abstract class JceKeyTransRecipient implements KeyTransRecipient {
    protected EnvelopedDataHelper contentHelper;
    protected Map extraMappings;
    protected EnvelopedDataHelper helper;
    private PrivateKey recipientKey;
    protected boolean unwrappedKeyMustBeEncodable;
    protected boolean validateKeySize;

    public JceKeyTransRecipient(PrivateKey privateKey) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.extraMappings = new HashMap();
        this.validateKeySize = false;
        this.recipientKey = CMSUtils.cleanPrivateKey(privateKey);
    }

    public Key extractSecretKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        if (CMSUtils.isGOST(algorithmIdentifier.getAlgorithm())) {
            try {
                GostR3410KeyTransport gostR3410KeyTransport = GostR3410KeyTransport.getInstance(bArr);
                GostR3410TransportParameters transportParameters = gostR3410KeyTransport.getTransportParameters();
                PublicKey generatePublic = this.helper.createKeyFactory(algorithmIdentifier.getAlgorithm()).generatePublic(new X509EncodedKeySpec(transportParameters.getEphemeralPublicKey().getEncoded()));
                KeyAgreement createKeyAgreement = this.helper.createKeyAgreement(algorithmIdentifier.getAlgorithm());
                createKeyAgreement.init(this.recipientKey, new UserKeyingMaterialSpec(transportParameters.getUkm()));
                createKeyAgreement.doPhase(generatePublic, true);
                ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap;
                SecretKey generateSecret = createKeyAgreement.generateSecret(aSN1ObjectIdentifier.getId());
                Cipher createCipher = this.helper.createCipher(aSN1ObjectIdentifier);
                createCipher.init(4, generateSecret, new GOST28147WrapParameterSpec(transportParameters.getEncryptionParamSet(), transportParameters.getUkm()));
                Gost2814789EncryptedKey sessionEncryptedKey = gostR3410KeyTransport.getSessionEncryptedKey();
                return createCipher.unwrap(Arrays.concatenate(sessionEncryptedKey.getEncryptedKey(), sessionEncryptedKey.getMacKey()), this.helper.getBaseCipherName(algorithmIdentifier2.getAlgorithm()), 3);
            } catch (Exception e10) {
                throw new CMSException(v.l(e10, new StringBuilder("exception unwrapping key: ")), e10);
            }
        }
        JceAsymmetricKeyUnwrapper mustProduceEncodableUnwrappedKey = this.helper.createAsymmetricUnwrapper(algorithmIdentifier, this.recipientKey).setMustProduceEncodableUnwrappedKey(this.unwrappedKeyMustBeEncodable);
        if (!this.extraMappings.isEmpty()) {
            for (ASN1ObjectIdentifier aSN1ObjectIdentifier2 : this.extraMappings.keySet()) {
                mustProduceEncodableUnwrappedKey.setAlgorithmMapping(aSN1ObjectIdentifier2, (String) this.extraMappings.get(aSN1ObjectIdentifier2));
            }
        }
        try {
            Key jceKey = this.helper.getJceKey(algorithmIdentifier2.getAlgorithm(), mustProduceEncodableUnwrappedKey.generateUnwrappedKey(algorithmIdentifier2, bArr));
            if (this.validateKeySize) {
                this.helper.keySizeCheck(algorithmIdentifier2, jceKey);
            }
            return jceKey;
        } catch (OperatorException e11) {
            throw new CMSException("exception unwrapping key: " + e11.getMessage(), e11);
        }
    }

    public JceKeyTransRecipient setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceKeyTransRecipient setContentProvider(String str) {
        this.contentHelper = CMSUtils.createContentHelper(str);
        return this;
    }

    public JceKeyTransRecipient setKeySizeValidation(boolean z10) {
        this.validateKeySize = z10;
        return this;
    }

    public JceKeyTransRecipient setMustProduceEncodableUnwrappedKey(boolean z10) {
        this.unwrappedKeyMustBeEncodable = z10;
        return this;
    }

    public JceKeyTransRecipient setProvider(String str) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public JceKeyTransRecipient setContentProvider(Provider provider) {
        this.contentHelper = CMSUtils.createContentHelper(provider);
        return this;
    }

    public JceKeyTransRecipient setProvider(Provider provider) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }
}
