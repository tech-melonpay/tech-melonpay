package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;

/* loaded from: classes3.dex */
public interface TlsKeyExchangeFactory {
    TlsKeyExchange createDHEKeyExchangeClient(int i, TlsDHGroupVerifier tlsDHGroupVerifier);

    TlsKeyExchange createDHEKeyExchangeServer(int i, TlsDHConfig tlsDHConfig);

    TlsKeyExchange createDHKeyExchange(int i);

    TlsKeyExchange createDHanonKeyExchangeClient(int i, TlsDHGroupVerifier tlsDHGroupVerifier);

    TlsKeyExchange createDHanonKeyExchangeServer(int i, TlsDHConfig tlsDHConfig);

    TlsKeyExchange createECDHEKeyExchangeClient(int i);

    TlsKeyExchange createECDHEKeyExchangeServer(int i, TlsECConfig tlsECConfig);

    TlsKeyExchange createECDHKeyExchange(int i);

    TlsKeyExchange createECDHanonKeyExchangeClient(int i);

    TlsKeyExchange createECDHanonKeyExchangeServer(int i, TlsECConfig tlsECConfig);

    TlsKeyExchange createPSKKeyExchangeClient(int i, TlsPSKIdentity tlsPSKIdentity, TlsDHGroupVerifier tlsDHGroupVerifier);

    TlsKeyExchange createPSKKeyExchangeServer(int i, TlsPSKIdentityManager tlsPSKIdentityManager, TlsDHConfig tlsDHConfig, TlsECConfig tlsECConfig);

    TlsKeyExchange createRSAKeyExchange(int i);

    TlsKeyExchange createSRPKeyExchangeClient(int i, TlsSRPIdentity tlsSRPIdentity, TlsSRPConfigVerifier tlsSRPConfigVerifier);

    TlsKeyExchange createSRPKeyExchangeServer(int i, TlsSRPLoginParameters tlsSRPLoginParameters);
}
