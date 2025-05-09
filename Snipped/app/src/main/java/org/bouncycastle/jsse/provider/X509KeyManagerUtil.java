package org.bouncycastle.jsse.provider;

import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;

/* loaded from: classes.dex */
abstract class X509KeyManagerUtil {
    public static X509ExtendedKeyManager importX509KeyManager(X509KeyManager x509KeyManager) {
        return x509KeyManager instanceof X509ExtendedKeyManager ? (X509ExtendedKeyManager) x509KeyManager : new ImportX509KeyManager_5(x509KeyManager);
    }
}
