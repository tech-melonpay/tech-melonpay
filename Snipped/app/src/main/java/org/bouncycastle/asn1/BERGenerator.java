package org.bouncycastle.asn1;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class BERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    public BERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    private void writeHdr(int i) {
        this._out.write(i);
        this._out.write(128);
    }

    @Override // org.bouncycastle.asn1.ASN1Generator
    public OutputStream getRawOutputStream() {
        return this._out;
    }

    public void writeBEREnd() {
        this._out.write(0);
        this._out.write(0);
        if (this._tagged && this._isExplicit) {
            this._out.write(0);
            this._out.write(0);
        }
    }

    public void writeBERHeader(int i) {
        if (this._tagged) {
            int i9 = this._tagNo;
            int i10 = i9 | 128;
            if (this._isExplicit) {
                writeHdr(i9 | 160);
            } else {
                if ((i & 32) == 0) {
                    writeHdr(i10);
                    return;
                }
                i = i9 | 160;
            }
        }
        writeHdr(i);
    }

    public BERGenerator(OutputStream outputStream, int i, boolean z10) {
        super(outputStream);
        this._tagged = true;
        this._isExplicit = z10;
        this._tagNo = i;
    }
}
