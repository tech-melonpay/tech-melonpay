package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: classes2.dex */
public class MGFParameters implements DerivationParameters {
    byte[] seed;

    public MGFParameters(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public MGFParameters(byte[] bArr, int i, int i9) {
        byte[] bArr2 = new byte[i9];
        this.seed = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i9);
    }
}
