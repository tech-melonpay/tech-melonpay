package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public interface MessageSigner {
    byte[] generateSignature(byte[] bArr);

    void init(boolean z10, CipherParameters cipherParameters);

    boolean verifySignature(byte[] bArr, byte[] bArr2);
}
