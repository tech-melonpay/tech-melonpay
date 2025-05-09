package org.bouncycastle.tls;

import com.google.android.gms.measurement.internal.a;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class ByteQueue {
    private int available;
    private byte[] databuf;
    private boolean readOnlyBuf;
    private int skipped;

    public ByteQueue() {
        this(0);
    }

    public static int nextTwoPow(int i) {
        int i9 = i | (i >> 1);
        int i10 = i9 | (i9 >> 2);
        int i11 = i10 | (i10 >> 4);
        int i12 = i11 | (i11 >> 8);
        return (i12 | (i12 >> 16)) + 1;
    }

    public void addData(byte[] bArr, int i, int i9) {
        if (this.readOnlyBuf) {
            throw new IllegalStateException("Cannot add data to read-only buffer");
        }
        int i10 = this.skipped;
        int i11 = this.available;
        if (i10 + i11 + i9 > this.databuf.length) {
            int nextTwoPow = nextTwoPow(i11 + i9);
            byte[] bArr2 = this.databuf;
            if (nextTwoPow > bArr2.length) {
                byte[] bArr3 = new byte[nextTwoPow];
                System.arraycopy(bArr2, this.skipped, bArr3, 0, this.available);
                this.databuf = bArr3;
            } else {
                System.arraycopy(bArr2, this.skipped, bArr2, 0, this.available);
            }
            this.skipped = 0;
        }
        System.arraycopy(bArr, i, this.databuf, this.skipped + this.available, i9);
        this.available += i9;
    }

    public int available() {
        return this.available;
    }

    public void copyTo(OutputStream outputStream, int i) {
        if (i <= this.available) {
            outputStream.write(this.databuf, this.skipped, i);
        } else {
            StringBuilder l10 = a.l("Cannot copy ", i, " bytes, only got ");
            l10.append(this.available);
            throw new IllegalStateException(l10.toString());
        }
    }

    public void read(byte[] bArr, int i, int i9, int i10) {
        if (bArr.length - i >= i9) {
            if (this.available - i10 < i9) {
                throw new IllegalStateException("Not enough data to read");
            }
            System.arraycopy(this.databuf, this.skipped + i10, bArr, i, i9);
        } else {
            throw new IllegalArgumentException("Buffer size of " + bArr.length + " is too small for a read of " + i9 + " bytes");
        }
    }

    public ByteArrayInputStream readFrom(int i) {
        int i9 = this.available;
        if (i > i9) {
            StringBuilder l10 = a.l("Cannot read ", i, " bytes, only got ");
            l10.append(this.available);
            throw new IllegalStateException(l10.toString());
        }
        int i10 = this.skipped;
        this.available = i9 - i;
        this.skipped = i10 + i;
        return new ByteArrayInputStream(this.databuf, i10, i);
    }

    public void removeData(int i) {
        int i9 = this.available;
        if (i <= i9) {
            this.available = i9 - i;
            this.skipped += i;
        } else {
            StringBuilder l10 = a.l("Cannot remove ", i, " bytes, only got ");
            l10.append(this.available);
            throw new IllegalStateException(l10.toString());
        }
    }

    public void shrink() {
        int i = this.available;
        if (i == 0) {
            this.databuf = TlsUtils.EMPTY_BYTES;
        } else {
            int nextTwoPow = nextTwoPow(i);
            byte[] bArr = this.databuf;
            if (nextTwoPow >= bArr.length) {
                return;
            }
            byte[] bArr2 = new byte[nextTwoPow];
            System.arraycopy(bArr, this.skipped, bArr2, 0, this.available);
            this.databuf = bArr2;
        }
        this.skipped = 0;
    }

    public ByteQueue(int i) {
        this.skipped = 0;
        this.available = 0;
        this.readOnlyBuf = false;
        this.databuf = i == 0 ? TlsUtils.EMPTY_BYTES : new byte[i];
    }

    public ByteQueue(byte[] bArr, int i, int i9) {
        this.databuf = bArr;
        this.skipped = i;
        this.available = i9;
        this.readOnlyBuf = true;
    }

    public void removeData(byte[] bArr, int i, int i9, int i10) {
        read(bArr, i, i9, i10);
        removeData(i10 + i9);
    }

    public byte[] removeData(int i, int i9) {
        byte[] bArr = new byte[i];
        removeData(bArr, 0, i, i9);
        return bArr;
    }
}
