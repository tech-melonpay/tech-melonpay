package androidx.camera.core.internal;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ByteBufferOutputStream extends OutputStream {
    private final ByteBuffer mByteBuffer;

    public ByteBufferOutputStream(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (!this.mByteBuffer.hasRemaining()) {
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }
        this.mByteBuffer.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i9) {
        int i10;
        bArr.getClass();
        if (i < 0 || i > bArr.length || i9 < 0 || (i10 = i + i9) > bArr.length || i10 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i9 == 0) {
            return;
        }
        if (this.mByteBuffer.remaining() >= i9) {
            this.mByteBuffer.put(bArr, i, i9);
            return;
        }
        throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
    }
}
