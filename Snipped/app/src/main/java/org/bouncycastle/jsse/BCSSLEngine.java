package org.bouncycastle.jsse;

import javax.net.ssl.SSLEngine;

/* loaded from: classes.dex */
public interface BCSSLEngine {
    String getApplicationProtocol();

    BCApplicationProtocolSelector<SSLEngine> getBCHandshakeApplicationProtocolSelector();

    BCExtendedSSLSession getBCHandshakeSession();

    BCSSLConnection getConnection();

    String getHandshakeApplicationProtocol();

    BCSSLParameters getParameters();

    void setBCHandshakeApplicationProtocolSelector(BCApplicationProtocolSelector<SSLEngine> bCApplicationProtocolSelector);

    void setParameters(BCSSLParameters bCSSLParameters);
}
