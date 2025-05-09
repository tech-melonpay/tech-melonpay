package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;

/* loaded from: classes3.dex */
public class DefaultTlsKeyExchangeFactory extends AbstractTlsKeyExchangeFactory {
    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createDHEKeyExchangeClient(int i, TlsDHGroupVerifier tlsDHGroupVerifier) {
        return new TlsDHEKeyExchange(i, tlsDHGroupVerifier);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createDHEKeyExchangeServer(int i, TlsDHConfig tlsDHConfig) {
        return new TlsDHEKeyExchange(i, tlsDHConfig);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createDHKeyExchange(int i) {
        return new TlsDHKeyExchange(i);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createDHanonKeyExchangeClient(int i, TlsDHGroupVerifier tlsDHGroupVerifier) {
        return new TlsDHanonKeyExchange(i, tlsDHGroupVerifier);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createDHanonKeyExchangeServer(int i, TlsDHConfig tlsDHConfig) {
        return new TlsDHanonKeyExchange(i, tlsDHConfig);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createECDHEKeyExchangeClient(int i) {
        return new TlsECDHEKeyExchange(i);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createECDHEKeyExchangeServer(int i, TlsECConfig tlsECConfig) {
        return new TlsECDHEKeyExchange(i, tlsECConfig);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createECDHKeyExchange(int i) {
        return new TlsECDHKeyExchange(i);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createECDHanonKeyExchangeClient(int i) {
        return new TlsECDHanonKeyExchange(i);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createECDHanonKeyExchangeServer(int i, TlsECConfig tlsECConfig) {
        return new TlsECDHanonKeyExchange(i, tlsECConfig);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createPSKKeyExchangeClient(int i, TlsPSKIdentity tlsPSKIdentity, TlsDHGroupVerifier tlsDHGroupVerifier) {
        return new TlsPSKKeyExchange(i, tlsPSKIdentity, tlsDHGroupVerifier);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createPSKKeyExchangeServer(int i, TlsPSKIdentityManager tlsPSKIdentityManager, TlsDHConfig tlsDHConfig, TlsECConfig tlsECConfig) {
        return new TlsPSKKeyExchange(i, tlsPSKIdentityManager, tlsDHConfig, tlsECConfig);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createRSAKeyExchange(int i) {
        return new TlsRSAKeyExchange(i);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createSRPKeyExchangeClient(int i, TlsSRPIdentity tlsSRPIdentity, TlsSRPConfigVerifier tlsSRPConfigVerifier) {
        return new TlsSRPKeyExchange(i, tlsSRPIdentity, tlsSRPConfigVerifier);
    }

    @Override // org.bouncycastle.tls.AbstractTlsKeyExchangeFactory, org.bouncycastle.tls.TlsKeyExchangeFactory
    public TlsKeyExchange createSRPKeyExchangeServer(int i, TlsSRPLoginParameters tlsSRPLoginParameters) {
        return new TlsSRPKeyExchange(i, tlsSRPLoginParameters);
    }
}
