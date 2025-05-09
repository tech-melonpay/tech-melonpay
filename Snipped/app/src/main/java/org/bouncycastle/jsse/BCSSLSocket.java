package org.bouncycastle.jsse;

import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public interface BCSSLSocket {
    String getApplicationProtocol();

    BCApplicationProtocolSelector<SSLSocket> getBCHandshakeApplicationProtocolSelector();

    BCExtendedSSLSession getBCHandshakeSession();

    BCSSLConnection getConnection();

    String getHandshakeApplicationProtocol();

    BCSSLParameters getParameters();

    void setBCHandshakeApplicationProtocolSelector(BCApplicationProtocolSelector<SSLSocket> bCApplicationProtocolSelector);

    void setHost(String str);

    void setParameters(BCSSLParameters bCSSLParameters);
}
