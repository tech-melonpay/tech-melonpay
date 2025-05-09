package org.bouncycastle.jsse;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public abstract class BCExtendedSSLSession implements SSLSession {
    public abstract String[] getLocalSupportedSignatureAlgorithms();

    public abstract String[] getPeerSupportedSignatureAlgorithms();

    public List<BCSNIServerName> getRequestedServerNames() {
        throw new UnsupportedOperationException();
    }

    public List<byte[]> getStatusResponses() {
        return Collections.emptyList();
    }
}
