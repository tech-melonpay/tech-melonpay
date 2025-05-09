package org.bouncycastle.util.io;

import java.io.OutputStream;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class BufferingOutputStream extends OutputStream {
    private final byte[] buf;
    private int bufOff;
    private final OutputStream other;

    public BufferingOutputStream(OutputStream outputStream) {
        this.other = outputStream;
        this.buf = new byte[4096];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();
        this.other.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.other.write(this.buf, 0, this.bufOff);
        this.bufOff = 0;
        Arrays.fill(this.buf, (byte) 0);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        byte[] bArr = this.buf;
        int i9 = this.bufOff;
        int i10 = i9 + 1;
        this.bufOff = i10;
        bArr[i9] = (byte) i;
        if (i10 == bArr.length) {
            flush();
        }
    }

    public BufferingOutputStream(OutputStream outputStream, int i) {
        this.other = outputStream;
        this.buf = new byte[i];
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i9) {
        byte[] bArr2;
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i10 = this.bufOff;
        if (i9 < length - i10) {
            System.arraycopy(bArr, i, bArr3, i10, i9);
        } else {
            int length2 = bArr3.length - i10;
            System.arraycopy(bArr, i, bArr3, i10, length2);
            this.bufOff += length2;
            flush();
            int i11 = i + length2;
            i9 -= length2;
            while (true) {
                bArr2 = this.buf;
                if (i9 < bArr2.length) {
                    break;
                }
                this.other.write(bArr, i11, bArr2.length);
                byte[] bArr4 = this.buf;
                i11 += bArr4.length;
                i9 -= bArr4.length;
            }
            if (i9 <= 0) {
                return;
            } else {
                System.arraycopy(bArr, i11, bArr2, this.bufOff, i9);
            }
        }
        this.bufOff += i9;
    }
}
