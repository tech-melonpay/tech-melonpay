package org.bouncycastle.mime.encoding;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class QuotedPrintableInputStream extends FilterInputStream {
    public QuotedPrintableInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i;
        int i9;
        int read = ((FilterInputStream) this).in.read();
        if (read == -1) {
            return -1;
        }
        while (read == 61) {
            int read2 = ((FilterInputStream) this).in.read();
            if (read2 == -1) {
                throw new IllegalStateException("Quoted '=' at end of stream");
            }
            if (read2 == 13) {
                read = ((FilterInputStream) this).in.read();
                if (read == 10) {
                }
            } else if (read2 != 10) {
                if (read2 >= 48 && read2 <= 57) {
                    i = read2 - 48;
                } else {
                    if (read2 < 65 || read2 > 70) {
                        throw new IllegalStateException("Expecting '0123456789ABCDEF after quote that was not immediately followed by LF or CRLF");
                    }
                    i = read2 - 55;
                }
                int i10 = i << 4;
                int read3 = ((FilterInputStream) this).in.read();
                if (read3 >= 48 && read3 <= 57) {
                    i9 = read3 - 48;
                } else {
                    if (read3 < 65 || read3 > 70) {
                        throw new IllegalStateException("Expecting second '0123456789ABCDEF after quote that was not immediately followed by LF or CRLF");
                    }
                    i9 = read3 - 55;
                }
                return i10 | i9;
            }
            read = ((FilterInputStream) this).in.read();
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i9) {
        int i10 = 0;
        while (i10 != i9) {
            int read = read();
            if (read < 0) {
                break;
            }
            bArr[i10 + i] = (byte) read;
            i10++;
        }
        if (i10 == 0) {
            return -1;
        }
        return i10;
    }
}
