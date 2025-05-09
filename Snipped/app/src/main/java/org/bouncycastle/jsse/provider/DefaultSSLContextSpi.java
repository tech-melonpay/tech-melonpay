package org.bouncycastle.jsse.provider;

import java.security.KeyManagementException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import org.bouncycastle.tls.crypto.TlsCryptoProvider;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCryptoProvider;

/* loaded from: classes.dex */
class DefaultSSLContextSpi extends ProvSSLContextSpi {

    public static class LazyInstance {
        private static final Exception initException;
        private static final DefaultSSLContextSpi instance;

        static {
            Exception e10 = LazyManagers.initException;
            DefaultSSLContextSpi defaultSSLContextSpi = null;
            if (e10 == null) {
                try {
                    defaultSSLContextSpi = new DefaultSSLContextSpi(false, new JcaTlsCryptoProvider());
                } catch (Exception e11) {
                    e10 = e11;
                }
            }
            initException = e10;
            instance = defaultSSLContextSpi;
        }

        private LazyInstance() {
        }
    }

    public static class LazyManagers {
        private static final Exception initException;
        private static final KeyManager[] keyManagers;
        private static final TrustManager[] trustManagers;

        static {
            TrustManager[] trustManagerArr;
            KeyManager[] keyManagerArr;
            Exception exc = null;
            try {
                keyManagerArr = ProvSSLContextSpi.getDefaultKeyManagers();
                trustManagerArr = ProvSSLContextSpi.getDefaultTrustManagers();
            } catch (Exception e10) {
                trustManagerArr = null;
                exc = e10;
                keyManagerArr = null;
            }
            initException = exc;
            keyManagers = keyManagerArr;
            trustManagers = trustManagerArr;
        }

        private LazyManagers() {
        }
    }

    public DefaultSSLContextSpi(boolean z10, TlsCryptoProvider tlsCryptoProvider) {
        super(z10, tlsCryptoProvider, null);
        if (LazyManagers.initException != null) {
            throw new KeyManagementException("Default key/trust managers unavailable", LazyManagers.initException);
        }
        super.engineInit(LazyManagers.keyManagers, LazyManagers.trustManagers, null);
    }

    public static ProvSSLContextSpi getDefaultInstance() {
        if (LazyInstance.initException == null) {
            return LazyInstance.instance;
        }
        throw LazyInstance.initException;
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLContextSpi, javax.net.ssl.SSLContextSpi
    public void engineInit(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
        throw new KeyManagementException("Default SSLContext is initialized automatically");
    }
}
