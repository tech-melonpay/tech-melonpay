package org.bouncycastle.operator.jcajce;

import C.v;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.bouncycastle.asn1.cms.GenericHybridParameters;
import org.bouncycastle.asn1.cms.RsaKemParameters;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.util.DEROtherInfo;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.AsymmetricKeyUnwrapper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class JceKTSKeyUnwrapper extends AsymmetricKeyUnwrapper {
    private Map extraMappings;
    private OperatorHelper helper;
    private byte[] partyUInfo;
    private byte[] partyVInfo;
    private PrivateKey privKey;

    public JceKTSKeyUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey, byte[] bArr, byte[] bArr2) {
        super(algorithmIdentifier);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.privKey = privateKey;
        this.partyUInfo = Arrays.clone(bArr);
        this.partyVInfo = Arrays.clone(bArr2);
    }

    @Override // org.bouncycastle.operator.KeyUnwrapper
    public GenericKey generateUnwrappedKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        GenericHybridParameters genericHybridParameters = GenericHybridParameters.getInstance(getAlgorithmIdentifier().getParameters());
        Cipher createAsymmetricWrapper = this.helper.createAsymmetricWrapper(getAlgorithmIdentifier().getAlgorithm(), this.extraMappings);
        String wrappingAlgorithmName = this.helper.getWrappingAlgorithmName(genericHybridParameters.getDem().getAlgorithm());
        RsaKemParameters rsaKemParameters = RsaKemParameters.getInstance(genericHybridParameters.getKem().getParameters());
        try {
            createAsymmetricWrapper.init(4, this.privKey, new KTSParameterSpec.Builder(wrappingAlgorithmName, rsaKemParameters.getKeyLength().intValue() * 8, new DEROtherInfo.Builder(genericHybridParameters.getDem(), this.partyUInfo, this.partyVInfo).build().getEncoded()).withKdfAlgorithm(rsaKemParameters.getKeyDerivationFunction()).build());
            return new JceGenericKey(algorithmIdentifier, createAsymmetricWrapper.unwrap(bArr, this.helper.getKeyAlgorithmName(algorithmIdentifier.getAlgorithm()), 3));
        } catch (Exception e10) {
            throw new OperatorException(v.l(e10, new StringBuilder("Unable to unwrap contents key: ")), e10);
        }
    }

    public JceKTSKeyUnwrapper setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JceKTSKeyUnwrapper setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
