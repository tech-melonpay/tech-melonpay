package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

@Deprecated
/* loaded from: classes.dex */
public class ExceptionCatchingInputStream extends InputStream {
    private static final Queue<ExceptionCatchingInputStream> QUEUE = Util.createQueue(0);
    private IOException exception;
    private InputStream wrapped;

    public static void clearQueue() {
        while (true) {
            Queue<ExceptionCatchingInputStream> queue = QUEUE;
            if (queue.isEmpty()) {
                return;
            } else {
                queue.remove();
            }
        }
    }

    public static ExceptionCatchingInputStream obtain(InputStream inputStream) {
        ExceptionCatchingInputStream poll;
        Queue<ExceptionCatchingInputStream> queue = QUEUE;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new ExceptionCatchingInputStream();
        }
        poll.setInputStream(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.wrapped.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.wrapped.close();
    }

    public IOException getException() {
        return this.exception;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.wrapped.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.wrapped.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.wrapped.read(bArr);
        } catch (IOException e10) {
            this.exception = e10;
            return -1;
        }
    }

    public void release() {
        this.exception = null;
        this.wrapped = null;
        Queue<ExceptionCatchingInputStream> queue = QUEUE;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.wrapped.reset();
    }

    public void setInputStream(InputStream inputStream) {
        this.wrapped = inputStream;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.wrapped.skip(j10);
        } catch (IOException e10) {
            this.exception = e10;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i9) {
        try {
            return this.wrapped.read(bArr, i, i9);
        } catch (IOException e10) {
            this.exception = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.wrapped.read();
        } catch (IOException e10) {
            this.exception = e10;
            return -1;
        }
    }
}
