package org.bouncycastle.tls.crypto;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface TlsStreamVerifier {
    OutputStream getOutputStream();

    boolean isVerified();
}
