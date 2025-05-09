package com.bumptech.glide.load.data;

import com.google.android.gms.measurement.internal.a;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class ExifOrientationStream extends FilterInputStream {
    private static final byte[] EXIF_SEGMENT;
    private static final int ORIENTATION_POSITION;
    private static final int SEGMENT_LENGTH;
    private static final int SEGMENT_START_POSITION = 2;
    private final byte orientation;
    private int position;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        EXIF_SEGMENT = bArr;
        int length = bArr.length;
        SEGMENT_LENGTH = length;
        ORIENTATION_POSITION = length + 2;
    }

    public ExifOrientationStream(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(a.g(i, "Cannot add invalid orientation: "));
        }
        this.orientation = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i;
        int i9 = this.position;
        int read = (i9 < 2 || i9 > (i = ORIENTATION_POSITION)) ? super.read() : i9 == i ? this.orientation : EXIF_SEGMENT[i9 - 2] & 255;
        if (read != -1) {
            this.position++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.position = (int) (this.position + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i9) {
        int i10;
        int i11 = this.position;
        int i12 = ORIENTATION_POSITION;
        if (i11 > i12) {
            i10 = super.read(bArr, i, i9);
        } else if (i11 == i12) {
            bArr[i] = this.orientation;
            i10 = 1;
        } else if (i11 < 2) {
            i10 = super.read(bArr, i, 2 - i11);
        } else {
            int min = Math.min(i12 - i11, i9);
            System.arraycopy(EXIF_SEGMENT, this.position - 2, bArr, i, min);
            i10 = min;
        }
        if (i10 > 0) {
            this.position += i10;
        }
        return i10;
    }
}
