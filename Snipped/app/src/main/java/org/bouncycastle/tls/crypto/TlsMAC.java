package org.bouncycastle.tls.crypto;

/* loaded from: classes3.dex */
public interface TlsMAC {
    void calculateMAC(byte[] bArr, int i);

    byte[] calculateMAC();

    int getMacLength();

    void reset();

    void setKey(byte[] bArr, int i, int i9);

    void update(byte[] bArr, int i, int i9);
}
