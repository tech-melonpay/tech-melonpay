package org.bouncycastle.jcajce.io;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* loaded from: classes2.dex */
class SignatureUpdatingOutputStream extends OutputStream {
    private Signature sig;

    public SignatureUpdatingOutputStream(Signature signature) {
        this.sig = signature;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        try {
            this.sig.update((byte) i);
        } catch (SignatureException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.sig.update(bArr);
        } catch (SignatureException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i9) {
        try {
            this.sig.update(bArr, i, i9);
        } catch (SignatureException e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
