package org.bouncycastle.tls.crypto;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public interface TlsCryptoProvider {
    TlsCrypto create(SecureRandom secureRandom);

    TlsCrypto create(SecureRandom secureRandom, SecureRandom secureRandom2);
}
