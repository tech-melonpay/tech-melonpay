package org.bouncycastle.jsse.provider;

import javax.net.ssl.X509ExtendedKeyManager;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;
import org.bouncycastle.tls.crypto.TlsCrypto;

/* loaded from: classes.dex */
final class ContextData {
    private final ProvSSLSessionContext clientSessionContext;
    private final TlsCrypto crypto;
    private final ProvSSLSessionContext serverSessionContext;
    private final X509ExtendedKeyManager x509KeyManager;
    private final BCX509ExtendedTrustManager x509TrustManager;

    public ContextData(TlsCrypto tlsCrypto, X509ExtendedKeyManager x509ExtendedKeyManager, BCX509ExtendedTrustManager bCX509ExtendedTrustManager, ProvSSLSessionContext provSSLSessionContext, ProvSSLSessionContext provSSLSessionContext2) {
        this.crypto = tlsCrypto;
        this.x509KeyManager = x509ExtendedKeyManager;
        this.x509TrustManager = bCX509ExtendedTrustManager;
        this.clientSessionContext = provSSLSessionContext;
        this.serverSessionContext = provSSLSessionContext2;
    }

    public ProvSSLSessionContext getClientSessionContext() {
        return this.clientSessionContext;
    }

    public TlsCrypto getCrypto() {
        return this.crypto;
    }

    public ProvSSLSessionContext getServerSessionContext() {
        return this.serverSessionContext;
    }

    public X509ExtendedKeyManager getX509KeyManager() {
        return this.x509KeyManager;
    }

    public BCX509ExtendedTrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }
}
