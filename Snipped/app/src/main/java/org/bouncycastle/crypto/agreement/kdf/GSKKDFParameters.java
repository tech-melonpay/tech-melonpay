package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: classes2.dex */
public class GSKKDFParameters implements DerivationParameters {
    private final byte[] nonce;
    private final int startCounter;

    /* renamed from: z, reason: collision with root package name */
    private final byte[] f24789z;

    public GSKKDFParameters(byte[] bArr, int i) {
        this(bArr, i, null);
    }

    public byte[] getNonce() {
        return this.nonce;
    }

    public int getStartCounter() {
        return this.startCounter;
    }

    public byte[] getZ() {
        return this.f24789z;
    }

    public GSKKDFParameters(byte[] bArr, int i, byte[] bArr2) {
        this.f24789z = bArr;
        this.startCounter = i;
        this.nonce = bArr2;
    }
}
