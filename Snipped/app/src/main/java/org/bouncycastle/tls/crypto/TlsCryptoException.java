package org.bouncycastle.tls.crypto;

import org.bouncycastle.tls.TlsException;

/* loaded from: classes3.dex */
public class TlsCryptoException extends TlsException {
    public TlsCryptoException(String str) {
        super(str, null);
    }

    public TlsCryptoException(String str, Throwable th) {
        super(str, th);
    }
}
