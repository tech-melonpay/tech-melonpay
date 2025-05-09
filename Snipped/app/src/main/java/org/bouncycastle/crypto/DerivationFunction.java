package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface DerivationFunction {
    int generateBytes(byte[] bArr, int i, int i9);

    void init(DerivationParameters derivationParameters);
}
