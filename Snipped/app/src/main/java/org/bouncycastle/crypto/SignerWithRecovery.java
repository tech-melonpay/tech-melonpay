package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface SignerWithRecovery extends Signer {
    byte[] getRecoveredMessage();

    boolean hasFullMessage();

    void updateWithRecoveredMessage(byte[] bArr);
}
