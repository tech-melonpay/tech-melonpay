package org.bouncycastle.tls.crypto;

import org.bouncycastle.tls.TlsUtils;

/* loaded from: classes3.dex */
public class TlsNullNullCipher implements TlsCipher {
    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public byte[] decodeCiphertext(long j10, short s10, byte[] bArr, int i, int i9) {
        return TlsUtils.copyOfRangeExact(bArr, i, i9 + i);
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public byte[] encodePlaintext(long j10, short s10, byte[] bArr, int i, int i9) {
        return TlsUtils.copyOfRangeExact(bArr, i, i9 + i);
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public int getCiphertextLimit(int i) {
        return i;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public int getPlaintextLimit(int i) {
        return i;
    }
}
