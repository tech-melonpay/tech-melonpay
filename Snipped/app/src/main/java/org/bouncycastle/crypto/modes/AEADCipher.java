package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public interface AEADCipher {
    int doFinal(byte[] bArr, int i);

    String getAlgorithmName();

    byte[] getMac();

    int getOutputSize(int i);

    int getUpdateOutputSize(int i);

    void init(boolean z10, CipherParameters cipherParameters);

    void processAADByte(byte b9);

    void processAADBytes(byte[] bArr, int i, int i9);

    int processByte(byte b9, byte[] bArr, int i);

    int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10);

    void reset();
}
