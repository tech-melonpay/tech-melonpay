package org.bouncycastle.est.jcajce;

import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import s3.b;

/* loaded from: classes2.dex */
class SSLSocketFactoryCreatorBuilder {
    protected KeyManager[] keyManagers;
    protected Provider tlsProvider;
    protected X509TrustManager[] trustManagers;
    protected String tlsVersion = "TLS";
    protected SecureRandom secureRandom = CryptoServicesRegistrar.getSecureRandom();

    public SSLSocketFactoryCreatorBuilder(X509TrustManager x509TrustManager) {
        if (x509TrustManager == null) {
            throw new NullPointerException("Trust managers can not be null");
        }
        this.trustManagers = new X509TrustManager[]{x509TrustManager};
    }

    public SSLSocketFactoryCreator build() {
        return new SSLSocketFactoryCreator() { // from class: org.bouncycastle.est.jcajce.SSLSocketFactoryCreatorBuilder.1
            @Override // org.bouncycastle.est.jcajce.SSLSocketFactoryCreator
            public SSLSocketFactory createFactory() {
                SSLSocketFactoryCreatorBuilder sSLSocketFactoryCreatorBuilder = SSLSocketFactoryCreatorBuilder.this;
                Provider provider = sSLSocketFactoryCreatorBuilder.tlsProvider;
                String str = sSLSocketFactoryCreatorBuilder.tlsVersion;
                SSLContext sSLContext = provider != null ? SSLContext.getInstance(str, provider) : SSLContext.getInstance(str);
                SSLSocketFactoryCreatorBuilder sSLSocketFactoryCreatorBuilder2 = SSLSocketFactoryCreatorBuilder.this;
                sSLContext.init(sSLSocketFactoryCreatorBuilder2.keyManagers, sSLSocketFactoryCreatorBuilder2.trustManagers, sSLSocketFactoryCreatorBuilder2.secureRandom);
                return sSLContext.getSocketFactory();
            }

            @Override // org.bouncycastle.est.jcajce.SSLSocketFactoryCreator
            public boolean isTrusted() {
                int i = 0;
                while (true) {
                    X509TrustManager[] x509TrustManagerArr = SSLSocketFactoryCreatorBuilder.this.trustManagers;
                    if (i == x509TrustManagerArr.length) {
                        return false;
                    }
                    if (x509TrustManagerArr[i].getAcceptedIssuers().length > 0) {
                        return true;
                    }
                    i++;
                }
            }
        };
    }

    public SSLSocketFactoryCreatorBuilder withKeyManager(KeyManager keyManager) {
        if (keyManager == null) {
            this.keyManagers = null;
        } else {
            this.keyManagers = new KeyManager[]{keyManager};
        }
        return this;
    }

    public SSLSocketFactoryCreatorBuilder withKeyManagers(KeyManager[] keyManagerArr) {
        this.keyManagers = keyManagerArr;
        return this;
    }

    public SSLSocketFactoryCreatorBuilder withProvider(String str) {
        Provider provider = Security.getProvider(str);
        this.tlsProvider = provider;
        if (provider != null) {
            return this;
        }
        throw new NoSuchProviderException(b.j("JSSE provider not found: ", str));
    }

    public SSLSocketFactoryCreatorBuilder withSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
        return this;
    }

    public SSLSocketFactoryCreatorBuilder withTLSVersion(String str) {
        this.tlsVersion = str;
        return this;
    }

    public SSLSocketFactoryCreatorBuilder(X509TrustManager[] x509TrustManagerArr) {
        if (x509TrustManagerArr == null) {
            throw new NullPointerException("Trust managers can not be null");
        }
        this.trustManagers = x509TrustManagerArr;
    }

    public SSLSocketFactoryCreatorBuilder withProvider(Provider provider) {
        this.tlsProvider = provider;
        return this;
    }
}
