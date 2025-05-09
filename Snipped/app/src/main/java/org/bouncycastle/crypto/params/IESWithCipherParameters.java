package org.bouncycastle.crypto.params;

/* loaded from: classes2.dex */
public class IESWithCipherParameters extends IESParameters {
    private int cipherKeySize;

    public IESWithCipherParameters(byte[] bArr, byte[] bArr2, int i, int i9) {
        super(bArr, bArr2, i);
        this.cipherKeySize = i9;
    }

    public int getCipherKeySize() {
        return this.cipherKeySize;
    }
}
