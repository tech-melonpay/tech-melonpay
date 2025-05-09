package org.bouncycastle.asn1;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public class BEROctetStringGenerator extends BERGenerator {

    public class BufferedBEROctetStream extends OutputStream {
        private byte[] _buf;
        private DEROutputStream _derOut;
        private int _off = 0;

        public BufferedBEROctetStream(byte[] bArr) {
            this._buf = bArr;
            this._derOut = new DEROutputStream(BEROctetStringGenerator.this._out);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            int i = this._off;
            if (i != 0) {
                DEROctetString.encode(this._derOut, true, this._buf, 0, i);
            }
            this._derOut.flushInternal();
            BEROctetStringGenerator.this.writeBEREnd();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            byte[] bArr = this._buf;
            int i9 = this._off;
            int i10 = i9 + 1;
            this._off = i10;
            bArr[i9] = (byte) i;
            if (i10 == bArr.length) {
                DEROctetString.encode(this._derOut, true, bArr, 0, bArr.length);
                this._off = 0;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i9) {
            byte[] bArr2 = this._buf;
            int length = bArr2.length;
            int i10 = this._off;
            int i11 = length - i10;
            if (i9 < i11) {
                System.arraycopy(bArr, i, bArr2, i10, i9);
                this._off += i9;
                return;
            }
            if (i10 > 0) {
                System.arraycopy(bArr, i, bArr2, i10, i11);
                DEROctetString.encode(this._derOut, true, this._buf, 0, length);
            } else {
                i11 = 0;
            }
            while (true) {
                int i12 = i9 - i11;
                if (i12 < length) {
                    System.arraycopy(bArr, i + i11, this._buf, 0, i12);
                    this._off = i12;
                    return;
                } else {
                    DEROctetString.encode(this._derOut, true, bArr, i + i11, length);
                    i11 += length;
                }
            }
        }
    }

    public BEROctetStringGenerator(OutputStream outputStream) {
        super(outputStream);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream() {
        return getOctetOutputStream(new byte[1000]);
    }

    public BEROctetStringGenerator(OutputStream outputStream, int i, boolean z10) {
        super(outputStream, i, z10);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream(byte[] bArr) {
        return new BufferedBEROctetStream(bArr);
    }
}
