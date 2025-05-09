package org.bouncycastle.jcajce.provider.util;

import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* loaded from: classes2.dex */
public interface AsymmetricKeyInfoConverter {
    PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo);

    PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo);
}
