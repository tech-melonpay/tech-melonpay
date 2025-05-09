package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.PublicKey;

/* loaded from: classes3.dex */
public class JcaTlsDSAVerifier extends JcaTlsDSSVerifier {
    public JcaTlsDSAVerifier(JcaTlsCrypto jcaTlsCrypto, PublicKey publicKey) {
        super(jcaTlsCrypto, publicKey, (short) 2, "NoneWithDSA");
    }
}
