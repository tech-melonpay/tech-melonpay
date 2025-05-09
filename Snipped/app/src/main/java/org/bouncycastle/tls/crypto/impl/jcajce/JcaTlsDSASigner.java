package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.PrivateKey;

/* loaded from: classes3.dex */
public class JcaTlsDSASigner extends JcaTlsDSSSigner {
    public JcaTlsDSASigner(JcaTlsCrypto jcaTlsCrypto, PrivateKey privateKey) {
        super(jcaTlsCrypto, privateKey, (short) 2, "NoneWithDSA");
    }
}
