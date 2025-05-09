package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class DERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    public DERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    private void writeLength(OutputStream outputStream, int i) {
        if (i <= 127) {
            outputStream.write((byte) i);
            return;
        }
        int i9 = i;
        int i10 = 1;
        while (true) {
            i9 >>>= 8;
            if (i9 == 0) {
                break;
            } else {
                i10++;
            }
        }
        outputStream.write((byte) (i10 | 128));
        for (int i11 = (i10 - 1) * 8; i11 >= 0; i11 -= 8) {
            outputStream.write((byte) (i >> i11));
        }
    }

    public void writeDEREncoded(int i, byte[] bArr) {
        if (!this._tagged) {
            writeDEREncoded(this._out, i, bArr);
            return;
        }
        int i9 = this._tagNo;
        int i10 = i9 | 128;
        if (this._isExplicit) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeDEREncoded(byteArrayOutputStream, i, bArr);
            writeDEREncoded(this._out, i9 | 160, byteArrayOutputStream.toByteArray());
            return;
        }
        if ((i & 32) != 0) {
            writeDEREncoded(this._out, i9 | 160, bArr);
        } else {
            writeDEREncoded(this._out, i10, bArr);
        }
    }

    public DERGenerator(OutputStream outputStream, int i, boolean z10) {
        super(outputStream);
        this._tagged = true;
        this._isExplicit = z10;
        this._tagNo = i;
    }

    public void writeDEREncoded(OutputStream outputStream, int i, byte[] bArr) {
        outputStream.write(i);
        writeLength(outputStream, bArr.length);
        outputStream.write(bArr);
    }
}
