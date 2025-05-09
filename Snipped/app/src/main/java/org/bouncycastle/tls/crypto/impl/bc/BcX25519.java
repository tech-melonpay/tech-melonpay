package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.math.ec.rfc7748.X25519;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class BcX25519 implements TlsAgreement {
    protected final BcTlsCrypto crypto;
    protected final byte[] privateKey = new byte[32];
    protected final byte[] peerPublicKey = new byte[32];

    public BcX25519(BcTlsCrypto bcTlsCrypto) {
        this.crypto = bcTlsCrypto;
    }

    @Override // org.bouncycastle.tls.crypto.TlsAgreement
    public TlsSecret calculateSecret() {
        try {
            byte[] bArr = new byte[32];
            if (X25519.calculateAgreement(this.privateKey, 0, this.peerPublicKey, 0, bArr, 0)) {
                return this.crypto.adoptLocalSecret(bArr);
            }
            throw new TlsFatalAlert((short) 40);
        } finally {
            Arrays.fill(this.privateKey, (byte) 0);
            Arrays.fill(this.peerPublicKey, (byte) 0);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsAgreement
    public byte[] generateEphemeral() {
        this.crypto.getSecureRandom().nextBytes(this.privateKey);
        byte[] bArr = new byte[32];
        X25519.scalarMultBase(this.privateKey, 0, bArr, 0);
        return bArr;
    }

    @Override // org.bouncycastle.tls.crypto.TlsAgreement
    public void receivePeerValue(byte[] bArr) {
        if (bArr == null || bArr.length != 32) {
            throw new TlsFatalAlert((short) 47);
        }
        System.arraycopy(bArr, 0, this.peerPublicKey, 0, 32);
    }
}
