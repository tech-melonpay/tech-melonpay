package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;

/* loaded from: classes3.dex */
public class AbstractTlsKeyExchangeFactory implements TlsKeyExchangeFactory {
    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createDHEKeyExchangeClient(int i, TlsDHGroupVerifier tlsDHGroupVerifier) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createDHEKeyExchangeServer(int i, TlsDHConfig tlsDHConfig) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createDHKeyExchange(int i) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createDHanonKeyExchangeClient(int i, TlsDHGroupVerifier tlsDHGroupVerifier) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createDHanonKeyExchangeServer(int i, TlsDHConfig tlsDHConfig) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createECDHEKeyExchangeClient(int i) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createECDHEKeyExchangeServer(int i, TlsECConfig tlsECConfig) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createECDHKeyExchange(int i) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createECDHanonKeyExchangeClient(int i) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createECDHanonKeyExchangeServer(int i, TlsECConfig tlsECConfig) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createPSKKeyExchangeClient(int i, TlsPSKIdentity tlsPSKIdentity, TlsDHGroupVerifier tlsDHGroupVerifier) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createPSKKeyExchangeServer(int i, TlsPSKIdentityManager tlsPSKIdentityManager, TlsDHConfig tlsDHConfig, TlsECConfig tlsECConfig) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createRSAKeyExchange(int i) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createSRPKeyExchangeClient(int i, TlsSRPIdentity tlsSRPIdentity, TlsSRPConfigVerifier tlsSRPConfigVerifier) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createSRPKeyExchangeServer(int i, TlsSRPLoginParameters tlsSRPLoginParameters) {
        throw new TlsFatalAlert((short) 80);
    }
}
