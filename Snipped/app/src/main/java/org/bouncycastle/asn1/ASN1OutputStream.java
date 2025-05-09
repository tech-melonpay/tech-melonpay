package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class ASN1OutputStream {
    private OutputStream os;

    public ASN1OutputStream(OutputStream outputStream) {
        this.os = outputStream;
    }

    public static ASN1OutputStream create(OutputStream outputStream) {
        return new ASN1OutputStream(outputStream);
    }

    public static int getLengthOfDL(int i) {
        if (i < 128) {
            return 1;
        }
        int i9 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i9;
            }
            i9++;
        }
    }

    public static int getLengthOfEncodingDL(boolean z10, int i) {
        return getLengthOfDL(i) + (z10 ? 1 : 0) + i;
    }

    public static int getLengthOfIdentifier(int i) {
        if (i < 31) {
            return 1;
        }
        int i9 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i9;
            }
            i9++;
        }
    }

    public void close() {
        this.os.close();
    }

    public void flush() {
        this.os.flush();
    }

    public DEROutputStream getDERSubStream() {
        return new DEROutputStream(this.os);
    }

    public DLOutputStream getDLSubStream() {
        return new DLOutputStream(this.os);
    }

    public final void write(int i) {
        this.os.write(i);
    }

    public final void writeDL(int i) {
        if (i < 128) {
            write(i);
            return;
        }
        int i9 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i10 = i9 - 1;
            bArr[i10] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i11 = i9 - 2;
                bArr[i11] = (byte) ((5 - i10) | 128);
                write(bArr, i11, 6 - i10);
                return;
            }
            i9 = i10;
        }
    }

    public void writeElements(ASN1Encodable[] aSN1EncodableArr) {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().encode(this, true);
        }
    }

    public final void writeEncodingDL(boolean z10, int i, byte b9) {
        writeIdentifier(z10, i);
        writeDL(1);
        write(b9);
    }

    public final void writeEncodingIL(boolean z10, int i, ASN1Encodable[] aSN1EncodableArr) {
        writeIdentifier(z10, i);
        write(128);
        writeElements(aSN1EncodableArr);
        write(0);
        write(0);
    }

    public final void writeIdentifier(boolean z10, int i) {
        if (z10) {
            write(i);
        }
    }

    public final void writeObject(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(aSN1Encodable.toASN1Primitive(), true);
        flushInternal();
    }

    public void writePrimitive(ASN1Primitive aSN1Primitive, boolean z10) {
        aSN1Primitive.encode(this, z10);
    }

    public void writePrimitives(ASN1Primitive[] aSN1PrimitiveArr) {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.encode(this, true);
        }
    }

    public static ASN1OutputStream create(OutputStream outputStream, String str) {
        return str.equals(ASN1Encoding.DER) ? new DEROutputStream(outputStream) : str.equals(ASN1Encoding.DL) ? new DLOutputStream(outputStream) : new ASN1OutputStream(outputStream);
    }

    public final void write(byte[] bArr, int i, int i9) {
        this.os.write(bArr, i, i9);
    }

    public final void writeEncodingDL(boolean z10, int i, byte b9, byte[] bArr, int i9, int i10) {
        writeIdentifier(z10, i);
        writeDL(i10 + 1);
        write(b9);
        write(bArr, i9, i10);
    }

    public final void writeIdentifier(boolean z10, int i, int i9) {
        if (z10) {
            if (i9 < 31) {
                write(i | i9);
                return;
            }
            byte[] bArr = new byte[6];
            int i10 = 5;
            bArr[5] = (byte) (i9 & 127);
            while (i9 > 127) {
                i9 >>>= 7;
                i10--;
                bArr[i10] = (byte) ((i9 & 127) | 128);
            }
            int i11 = i10 - 1;
            bArr[i11] = (byte) (31 | i);
            write(bArr, i11, 6 - i11);
        }
    }

    public final void writeObject(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(aSN1Primitive, true);
        flushInternal();
    }

    public final void writeEncodingDL(boolean z10, int i, int i9, byte[] bArr) {
        writeIdentifier(z10, i, i9);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void writeEncodingDL(boolean z10, int i, byte[] bArr) {
        writeIdentifier(z10, i);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void writeEncodingDL(boolean z10, int i, byte[] bArr, int i9, int i10) {
        writeIdentifier(z10, i);
        writeDL(i10);
        write(bArr, i9, i10);
    }

    public final void writeEncodingDL(boolean z10, int i, byte[] bArr, int i9, int i10, byte b9) {
        writeIdentifier(z10, i);
        writeDL(i10 + 1);
        write(bArr, i9, i10);
        write(b9);
    }

    public void flushInternal() {
    }
}
