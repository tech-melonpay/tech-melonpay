package org.bouncycastle.tls.crypto;

/* loaded from: classes3.dex */
public interface TlsCipher {
    byte[] decodeCiphertext(long j10, short s10, byte[] bArr, int i, int i9);

    byte[] encodePlaintext(long j10, short s10, byte[] bArr, int i, int i9);

    int getCiphertextLimit(int i);

    int getPlaintextLimit(int i);
}
