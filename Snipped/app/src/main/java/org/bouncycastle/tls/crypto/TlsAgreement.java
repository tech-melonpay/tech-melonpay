package org.bouncycastle.tls.crypto;

/* loaded from: classes3.dex */
public interface TlsAgreement {
    TlsSecret calculateSecret();

    byte[] generateEphemeral();

    void receivePeerValue(byte[] bArr);
}
