package org.bouncycastle.util.encoders;

/* loaded from: classes3.dex */
public class BufferedDecoder {
    protected byte[] buf;
    protected int bufOff;
    protected Translator translator;

    public BufferedDecoder(Translator translator, int i) {
        this.translator = translator;
        if (i % translator.getEncodedBlockSize() != 0) {
            throw new IllegalArgumentException("buffer size not multiple of input block size");
        }
        this.buf = new byte[i];
        this.bufOff = 0;
    }

    public int processByte(byte b9, byte[] bArr, int i) {
        byte[] bArr2 = this.buf;
        int i9 = this.bufOff;
        int i10 = i9 + 1;
        this.bufOff = i10;
        bArr2[i9] = b9;
        if (i10 != bArr2.length) {
            return 0;
        }
        int decode = this.translator.decode(bArr2, 0, bArr2.length, bArr, i);
        this.bufOff = 0;
        return decode;
    }

    public int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        if (i9 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i11 = this.bufOff;
        int i12 = length - i11;
        int i13 = 0;
        if (i9 > i12) {
            System.arraycopy(bArr, i, bArr3, i11, i12);
            Translator translator = this.translator;
            byte[] bArr4 = this.buf;
            int decode = translator.decode(bArr4, 0, bArr4.length, bArr2, i10);
            this.bufOff = 0;
            int i14 = i9 - i12;
            int i15 = i + i12;
            int i16 = i10 + decode;
            int length2 = i14 - (i14 % this.buf.length);
            i13 = decode + this.translator.decode(bArr, i15, length2, bArr2, i16);
            i9 = i14 - length2;
            i = i15 + length2;
        }
        if (i9 != 0) {
            System.arraycopy(bArr, i, this.buf, this.bufOff, i9);
            this.bufOff += i9;
        }
        return i13;
    }
}
