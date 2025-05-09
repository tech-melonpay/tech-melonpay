package org.bouncycastle.cert.jcajce;

import java.security.cert.CertificateFactory;

/* loaded from: classes2.dex */
class DefaultCertHelper extends CertHelper {
    @Override // org.bouncycastle.cert.jcajce.CertHelper
    public CertificateFactory createCertificateFactory(String str) {
        return CertificateFactory.getInstance(str);
    }
}
