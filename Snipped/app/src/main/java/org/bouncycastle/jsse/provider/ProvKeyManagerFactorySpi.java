package org.bouncycastle.jsse.provider;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.KeyStoreBuilderParameters;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.X509ExtendedKeyManager;

/* loaded from: classes.dex */
class ProvKeyManagerFactorySpi extends KeyManagerFactorySpi {
    private static final Logger LOG = Logger.getLogger(ProvKeyManagerFactorySpi.class.getName());
    protected X509ExtendedKeyManager x509KeyManager = null;

    private static KeyStore createKeyStore(String str) {
        String keyStoreType = getKeyStoreType(str);
        String systemProperty = PropertyUtils.getSystemProperty("javax.net.ssl.keyStoreProvider");
        return (systemProperty == null || systemProperty.length() < 1) ? KeyStore.getInstance(keyStoreType) : KeyStore.getInstance(keyStoreType, systemProperty);
    }

    public static KeyStoreConfig getDefaultKeyStore() {
        String defaultType = KeyStore.getDefaultType();
        String systemProperty = PropertyUtils.getSystemProperty("javax.net.ssl.keyStore");
        BufferedInputStream bufferedInputStream = null;
        if ("NONE".equals(systemProperty) || systemProperty == null || !new File(systemProperty).exists()) {
            systemProperty = null;
        }
        KeyStore createKeyStore = createKeyStore(defaultType);
        String systemProperty2 = PropertyUtils.getSystemProperty("javax.net.ssl.keyStorePassword");
        char[] charArray = systemProperty2 != null ? systemProperty2.toCharArray() : null;
        try {
            if (systemProperty == null) {
                LOG.info("Initializing empty key store");
            } else {
                LOG.info("Initializing with key store at path: " + systemProperty);
                bufferedInputStream = new BufferedInputStream(new FileInputStream(systemProperty));
            }
            createKeyStore.load(bufferedInputStream, charArray);
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            return new KeyStoreConfig(createKeyStore, charArray);
        } catch (Throwable th) {
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw th;
        }
    }

    private static String getKeyStoreType(String str) {
        String systemProperty = PropertyUtils.getSystemProperty("javax.net.ssl.keyStoreType");
        return systemProperty == null ? str : systemProperty;
    }

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public KeyManager[] engineGetKeyManagers() {
        X509ExtendedKeyManager x509ExtendedKeyManager = this.x509KeyManager;
        if (x509ExtendedKeyManager != null) {
            return new KeyManager[]{x509ExtendedKeyManager};
        }
        throw new IllegalStateException("KeyManagerFactory not initialized");
    }

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public void engineInit(KeyStore keyStore, char[] cArr) {
        this.x509KeyManager = new ProvX509KeyManagerSimple(keyStore, cArr);
    }

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public void engineInit(ManagerFactoryParameters managerFactoryParameters) {
        if (!(managerFactoryParameters instanceof KeyStoreBuilderParameters)) {
            throw new InvalidAlgorithmParameterException("Parameters must be instance of KeyStoreBuilderParameters");
        }
        this.x509KeyManager = new ProvX509KeyManager(((KeyStoreBuilderParameters) managerFactoryParameters).getParameters());
    }
}
