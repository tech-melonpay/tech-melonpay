package org.bouncycastle.mime.encoding;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import org.bouncycastle.util.encoders.Base64;

/* loaded from: classes.dex */
public class Base64OutputStream extends FilterOutputStream {
    int bufOff;
    byte[] buffer;

    public Base64OutputStream(OutputStream outputStream) {
        super(outputStream);
        this.buffer = new byte[54];
    }

    private void doWrite(byte b9) {
        byte[] bArr = this.buffer;
        int i = this.bufOff;
        int i9 = i + 1;
        this.bufOff = i9;
        bArr[i] = b9;
        if (i9 == bArr.length) {
            Base64.encode(bArr, 0, bArr.length, ((FilterOutputStream) this).out);
            ((FilterOutputStream) this).out.write(13);
            ((FilterOutputStream) this).out.write(10);
            this.bufOff = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = this.bufOff;
        if (i > 0) {
            Base64.encode(this.buffer, 0, i, ((FilterOutputStream) this).out);
        }
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        doWrite((byte) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i9) {
        for (int i10 = 0; i10 != i9; i10++) {
            doWrite(bArr[i + i10]);
        }
    }
}
