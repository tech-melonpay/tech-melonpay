package org.bouncycastle.crypto.io;

import java.io.OutputStream;
import org.bouncycastle.crypto.Signer;

/* loaded from: classes2.dex */
public class SignerOutputStream extends OutputStream {
    protected Signer signer;

    public SignerOutputStream(Signer signer) {
        this.signer = signer;
    }

    public Signer getSigner() {
        return this.signer;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.signer.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i9) {
        this.signer.update(bArr, i, i9);
    }
}
