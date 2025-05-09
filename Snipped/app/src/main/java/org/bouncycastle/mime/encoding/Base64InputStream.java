package org.bouncycastle.mime.encoding;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class Base64InputStream extends InputStream {
    private static final byte[] decodingTable = new byte[128];
    InputStream in;
    boolean isEndOfStream;
    int[] outBuf = new int[3];
    int bufPtr = 3;

    static {
        for (int i = 65; i <= 90; i++) {
            decodingTable[i] = (byte) (i - 65);
        }
        for (int i9 = 97; i9 <= 122; i9++) {
            decodingTable[i9] = (byte) (i9 - 71);
        }
        for (int i10 = 48; i10 <= 57; i10++) {
            decodingTable[i10] = (byte) (i10 + 4);
        }
        byte[] bArr = decodingTable;
        bArr[43] = 62;
        bArr[47] = 63;
    }

    public Base64InputStream(InputStream inputStream) {
        this.in = inputStream;
    }

    private int decode(int i, int i9, int i10, int i11, int[] iArr) {
        if (i11 < 0) {
            throw new EOFException("unexpected end of file in armored stream.");
        }
        if (i10 == 61) {
            byte[] bArr = decodingTable;
            iArr[2] = (((bArr[i] & 255) << 2) | ((bArr[i9] & 255) >> 4)) & 255;
            return 2;
        }
        if (i11 == 61) {
            byte[] bArr2 = decodingTable;
            byte b9 = bArr2[i];
            byte b10 = bArr2[i9];
            byte b11 = bArr2[i10];
            iArr[1] = ((b9 << 2) | (b10 >> 4)) & 255;
            iArr[2] = ((b10 << 4) | (b11 >> 2)) & 255;
            return 1;
        }
        byte[] bArr3 = decodingTable;
        byte b12 = bArr3[i];
        byte b13 = bArr3[i9];
        byte b14 = bArr3[i10];
        byte b15 = bArr3[i11];
        iArr[0] = ((b12 << 2) | (b13 >> 4)) & 255;
        iArr[1] = ((b13 << 4) | (b14 >> 2)) & 255;
        iArr[2] = ((b14 << 6) | b15) & 255;
        return 0;
    }

    private int readIgnoreSpace() {
        while (true) {
            int read = this.in.read();
            if (read != 32 && read != 9) {
                return read;
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.in.close();
    }

    @Override // java.io.InputStream
    public int read() {
        int decode;
        if (this.bufPtr > 2) {
            int readIgnoreSpace = readIgnoreSpace();
            if (readIgnoreSpace == 13 || readIgnoreSpace == 10) {
                int readIgnoreSpace2 = readIgnoreSpace();
                while (true) {
                    if (readIgnoreSpace2 != 10 && readIgnoreSpace2 != 13) {
                        break;
                    }
                    readIgnoreSpace2 = readIgnoreSpace();
                }
                if (readIgnoreSpace2 < 0) {
                    this.isEndOfStream = true;
                    return -1;
                }
                decode = decode(readIgnoreSpace2, readIgnoreSpace(), readIgnoreSpace(), readIgnoreSpace(), this.outBuf);
            } else {
                if (readIgnoreSpace < 0) {
                    this.isEndOfStream = true;
                    return -1;
                }
                decode = decode(readIgnoreSpace, readIgnoreSpace(), readIgnoreSpace(), readIgnoreSpace(), this.outBuf);
            }
            this.bufPtr = decode;
        }
        int[] iArr = this.outBuf;
        int i = this.bufPtr;
        this.bufPtr = i + 1;
        return iArr[i];
    }
}
