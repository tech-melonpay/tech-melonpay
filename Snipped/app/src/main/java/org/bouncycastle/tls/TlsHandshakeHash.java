package org.bouncycastle.tls;

import java.io.OutputStream;
import org.bouncycastle.tls.crypto.TlsHash;

/* loaded from: classes3.dex */
public interface TlsHandshakeHash extends TlsHash {
    void copyBufferTo(OutputStream outputStream);

    void forceBuffering();

    TlsHash forkPRFHash();

    byte[] getFinalHash(short s10);

    TlsHandshakeHash notifyPRFDetermined();

    void sealHashAlgorithms();

    TlsHandshakeHash stopTracking();

    void trackHashAlgorithm(short s10);
}
