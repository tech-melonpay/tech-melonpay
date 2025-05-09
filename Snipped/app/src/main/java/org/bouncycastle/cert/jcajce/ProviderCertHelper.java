package org.bouncycastle.cert.jcajce;

import java.security.Provider;
import java.security.cert.CertificateFactory;

/* loaded from: classes2.dex */
class ProviderCertHelper extends CertHelper {
    private final Provider provider;

    public ProviderCertHelper(Provider provider) {
        this.provider = provider;
    }

    @Override // org.bouncycastle.cert.jcajce.CertHelper
    public CertificateFactory createCertificateFactory(String str) {
        return CertificateFactory.getInstance(str, this.provider);
    }
}
