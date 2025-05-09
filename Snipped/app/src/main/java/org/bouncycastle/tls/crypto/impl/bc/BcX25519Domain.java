package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsECDomain;

/* loaded from: classes3.dex */
public class BcX25519Domain implements TlsECDomain {
    protected final BcTlsCrypto crypto;

    public BcX25519Domain(BcTlsCrypto bcTlsCrypto) {
        this.crypto = bcTlsCrypto;
    }

    @Override // org.bouncycastle.tls.crypto.TlsECDomain
    public TlsAgreement createECDH() {
        return new BcX25519(this.crypto);
    }
}
