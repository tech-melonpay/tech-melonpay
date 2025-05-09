package org.bouncycastle.jsse.provider;

import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.List;

/* loaded from: classes.dex */
interface ProvTlsManager {
    void checkClientTrusted(X509Certificate[] x509CertificateArr, String str);

    void checkServerTrusted(X509Certificate[] x509CertificateArr, String str);

    String chooseClientAlias(String[] strArr, Principal[] principalArr);

    String chooseServerAlias(String str, Principal[] principalArr);

    ProvSSLContextSpi getContext();

    ContextData getContextData();

    boolean getEnableSessionCreation();

    String getPeerHost();

    String getPeerHostSNI();

    int getPeerPort();

    void notifyHandshakeComplete(ProvSSLConnection provSSLConnection);

    void notifyHandshakeSession(ProvSSLSessionHandshake provSSLSessionHandshake);

    String selectApplicationProtocol(List<String> list);
}
