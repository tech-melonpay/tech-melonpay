package org.jmrtd.io;

import java.io.IOException;
import java.io.InputStream;
import org.jmrtd.io.InputStreamBuffer;

/* loaded from: classes3.dex */
public class SplittableInputStream extends InputStream {
    private InputStreamBuffer.SubInputStream carrier;
    private InputStreamBuffer inputStreamBuffer;

    public SplittableInputStream(InputStream inputStream, int i) {
        InputStreamBuffer inputStreamBuffer = new InputStreamBuffer(inputStream, i);
        this.inputStreamBuffer = inputStreamBuffer;
        this.carrier = inputStreamBuffer.getInputStream();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.carrier.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.carrier.close();
    }

    public int getBytesBuffered() {
        return this.inputStreamBuffer.getBytesBuffered();
    }

    public InputStream getInputStream(int i) {
        try {
            InputStreamBuffer.SubInputStream inputStream = this.inputStreamBuffer.getInputStream();
            long j10 = 0;
            while (true) {
                long j11 = i;
                if (j10 >= j11) {
                    return inputStream;
                }
                j10 += inputStream.skip(j11 - j10);
            }
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public int getLength() {
        return this.inputStreamBuffer.getLength();
    }

    public int getPosition() {
        return this.carrier.getPosition();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.carrier.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.carrier.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.carrier.read();
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.carrier.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.carrier.skip(j10);
    }

    public void updateFrom(SplittableInputStream splittableInputStream) {
        this.inputStreamBuffer.updateFrom(splittableInputStream.inputStreamBuffer);
    }
}
