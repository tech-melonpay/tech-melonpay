package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.KeyPair;
import java.security.PublicKey;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsSecret;

/* loaded from: classes3.dex */
public class JceX448 implements TlsAgreement {
    protected final JceX448Domain domain;
    protected KeyPair localKeyPair;
    protected PublicKey peerPublicKey;

    public JceX448(JceX448Domain jceX448Domain) {
        this.domain = jceX448Domain;
    }

    @Override // org.bouncycastle.tls.crypto.TlsAgreement
    public TlsSecret calculateSecret() {
        return this.domain.calculateECDHAgreement(this.localKeyPair.getPrivate(), this.peerPublicKey);
    }

    @Override // org.bouncycastle.tls.crypto.TlsAgreement
    public byte[] generateEphemeral() {
        KeyPair generateKeyPair = this.domain.generateKeyPair();
        this.localKeyPair = generateKeyPair;
        return this.domain.encodePublicKey(generateKeyPair.getPublic());
    }

    @Override // org.bouncycastle.tls.crypto.TlsAgreement
    public void receivePeerValue(byte[] bArr) {
        this.peerPublicKey = this.domain.decodePublicKey(bArr);
    }
}
