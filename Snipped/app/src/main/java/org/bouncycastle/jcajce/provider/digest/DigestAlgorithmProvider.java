package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s3.b;

/* loaded from: classes2.dex */
abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String j10 = b.j("HMAC", str);
        configurableProvider.addAlgorithm("Mac." + j10, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, j10);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, j10);
        configurableProvider.addAlgorithm("KeyGenerator." + j10, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, j10);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, j10);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String j10 = b.j("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier, j10);
        a.x(new StringBuilder("Alg.Alias.KeyGenerator."), aSN1ObjectIdentifier, configurableProvider, j10);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String j10 = b.j("KMAC", str);
        configurableProvider.addAlgorithm("Mac." + j10, str2);
        configurableProvider.addAlgorithm("KeyGenerator." + j10, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + str, j10);
    }
}
