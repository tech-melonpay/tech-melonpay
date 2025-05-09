package org.jmrtd.io;

import java.io.IOException;
import java.io.InputStream;
import org.jmrtd.io.FragmentBuffer;

/* loaded from: classes3.dex */
public class InputStreamBuffer {
    private FragmentBuffer buffer;
    private PositionInputStream carrier;

    public InputStreamBuffer(InputStream inputStream, int i) {
        PositionInputStream positionInputStream = new PositionInputStream(inputStream);
        this.carrier = positionInputStream;
        positionInputStream.mark(i);
        this.buffer = new FragmentBuffer(i);
    }

    public synchronized int getBytesBuffered() {
        return this.buffer.getBytesBuffered();
    }

    public SubInputStream getInputStream() {
        SubInputStream subInputStream;
        synchronized (this.carrier) {
            subInputStream = new SubInputStream(this.carrier);
        }
        return subInputStream;
    }

    public int getLength() {
        return this.buffer.getLength();
    }

    public synchronized int getPosition() {
        return this.buffer.getPosition();
    }

    public String toString() {
        return "InputStreamBuffer [" + this.buffer + "]";
    }

    public void updateFrom(InputStreamBuffer inputStreamBuffer) {
        this.buffer.updateFrom(inputStreamBuffer.buffer);
    }

    public class SubInputStream extends InputStream {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Object syncObject;
        private int position = 0;
        private int markedPosition = -1;

        public SubInputStream(Object obj) {
            this.syncObject = obj;
        }

        private void syncCarrierPosition(int i) {
            long j10 = i;
            if (j10 == InputStreamBuffer.this.carrier.getPosition()) {
                return;
            }
            InputStreamBuffer.this.carrier.reset();
            int i9 = 0;
            while (i9 < i) {
                long j11 = i9;
                i9 = (int) (InputStreamBuffer.this.carrier.skip(j10 - j11) + j11);
            }
        }

        @Override // java.io.InputStream
        public int available() {
            return InputStreamBuffer.this.buffer.getBufferedLength(this.position);
        }

        public FragmentBuffer getBuffer() {
            return InputStreamBuffer.this.buffer;
        }

        public int getPosition() {
            return this.position;
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.markedPosition = this.position;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            synchronized (this.syncObject) {
                try {
                    if (this.position >= InputStreamBuffer.this.buffer.getLength()) {
                        return -1;
                    }
                    if (InputStreamBuffer.this.buffer.isCoveredByFragment(this.position)) {
                        byte[] buffer = InputStreamBuffer.this.buffer.getBuffer();
                        int i = this.position;
                        this.position = i + 1;
                        return buffer[i] & 255;
                    }
                    if (InputStreamBuffer.this.carrier.markSupported()) {
                        syncCarrierPosition(this.position);
                    }
                    try {
                        int read = InputStreamBuffer.this.carrier.read();
                        if (read < 0) {
                            return -1;
                        }
                        FragmentBuffer fragmentBuffer = InputStreamBuffer.this.buffer;
                        int i9 = this.position;
                        this.position = i9 + 1;
                        fragmentBuffer.addFragment(i9, (byte) read);
                        return read;
                    } catch (IOException e10) {
                        throw e10;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i = this.markedPosition;
            if (i < 0) {
                throw new IOException("Invalid reset, was mark() called?");
            }
            this.position = i;
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            long skip;
            synchronized (this.syncObject) {
                try {
                    int bufferedLength = InputStreamBuffer.this.buffer.getBufferedLength(this.position);
                    long j11 = bufferedLength;
                    if (j10 <= j11) {
                        this.position = (int) (this.position + j10);
                        return j10;
                    }
                    this.position += bufferedLength;
                    if (InputStreamBuffer.this.carrier.markSupported()) {
                        syncCarrierPosition(this.position);
                        skip = InputStreamBuffer.this.carrier.skip(j10 - j11);
                        this.position += (int) skip;
                    } else {
                        skip = super.skip(j10 - j11);
                    }
                    return j11 + skip;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            int read;
            synchronized (this.syncObject) {
                read = read(bArr, 0, bArr.length);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i9) {
            synchronized (this.syncObject) {
                try {
                    if (bArr != null) {
                        if (i < 0 || i9 < 0 || i9 > bArr.length - i) {
                            throw new IndexOutOfBoundsException();
                        }
                        if (i9 == 0) {
                            return 0;
                        }
                        if (i9 > InputStreamBuffer.this.buffer.getLength() - this.position) {
                            i9 = InputStreamBuffer.this.buffer.getLength() - this.position;
                        }
                        if (this.position >= InputStreamBuffer.this.buffer.getLength()) {
                            return -1;
                        }
                        if (InputStreamBuffer.this.carrier.markSupported()) {
                            syncCarrierPosition(this.position);
                        }
                        FragmentBuffer.Fragment smallestUnbufferedFragment = InputStreamBuffer.this.buffer.getSmallestUnbufferedFragment(this.position, i9);
                        if (smallestUnbufferedFragment.getLength() <= 0) {
                            int min = Math.min(i9, InputStreamBuffer.this.buffer.getLength() - this.position);
                            System.arraycopy(InputStreamBuffer.this.buffer.getBuffer(), this.position, bArr, i, min);
                            this.position += min;
                            return min;
                        }
                        int offset = smallestUnbufferedFragment.getOffset() - this.position;
                        int length = smallestUnbufferedFragment.getLength();
                        System.arraycopy(InputStreamBuffer.this.buffer.getBuffer(), this.position, bArr, i, offset);
                        this.position += offset;
                        if (InputStreamBuffer.this.carrier.markSupported()) {
                            syncCarrierPosition(this.position);
                        }
                        int i10 = i + offset;
                        int read = InputStreamBuffer.this.carrier.read(bArr, i10, length);
                        InputStreamBuffer.this.buffer.addFragment(smallestUnbufferedFragment.getOffset(), bArr, i10, read);
                        this.position += read;
                        return offset + read;
                    }
                    throw new NullPointerException();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
