package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.tls.TlsFatalAlert;

/* loaded from: classes3.dex */
class SignatureOutputStream extends OutputStream {

    /* renamed from: s, reason: collision with root package name */
    protected final Signature f25490s;

    public SignatureOutputStream(Signature signature) {
        this.f25490s = signature;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i9) {
        try {
            this.f25490s.update(bArr, i, i9);
        } catch (SignatureException e10) {
            throw new TlsFatalAlert((short) 80, e10);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}
