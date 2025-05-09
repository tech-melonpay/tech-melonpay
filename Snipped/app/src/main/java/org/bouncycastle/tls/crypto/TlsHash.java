package org.bouncycastle.tls.crypto;

/* loaded from: classes3.dex */
public interface TlsHash {
    byte[] calculateHash();

    Object clone();

    void reset();

    void update(byte[] bArr, int i, int i9);
}
