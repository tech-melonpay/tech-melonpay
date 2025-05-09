package org.bouncycastle.operator.bc;

import java.io.OutputStream;
import org.bouncycastle.crypto.Signer;

/* loaded from: classes3.dex */
public class BcSignerOutputStream extends OutputStream {
    private Signer sig;

    public BcSignerOutputStream(Signer signer) {
        this.sig = signer;
    }

    public byte[] getSignature() {
        return this.sig.generateSignature();
    }

    public boolean verify(byte[] bArr) {
        return this.sig.verifySignature(bArr);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.sig.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.sig.update(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i9) {
        this.sig.update(bArr, i, i9);
    }
}
