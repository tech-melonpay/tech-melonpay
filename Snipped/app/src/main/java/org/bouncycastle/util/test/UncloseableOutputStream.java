package org.bouncycastle.util.test;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class UncloseableOutputStream extends FilterOutputStream {
    public UncloseableOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new RuntimeException("close() called on UncloseableOutputStream");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i9) {
        ((FilterOutputStream) this).out.write(bArr, i, i9);
    }
}
