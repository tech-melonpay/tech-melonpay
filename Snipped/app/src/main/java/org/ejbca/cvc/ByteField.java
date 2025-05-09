package org.ejbca.cvc;

import C.v;
import java.math.BigInteger;
import org.ejbca.cvc.util.StringConverter;
import s3.b;

/* loaded from: classes3.dex */
public class ByteField extends AbstractDataField {
    private static final long serialVersionUID = 1;
    private byte[] data;
    private boolean showBitLength;

    public ByteField(CVCTagEnum cVCTagEnum) {
        super(cVCTagEnum);
        this.showBitLength = false;
    }

    public byte[] getData() {
        return this.data;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public byte[] getEncoded() {
        return this.data;
    }

    public boolean isShowBitLength() {
        return this.showBitLength;
    }

    public void setShowBitLength(boolean z10) {
        this.showBitLength = z10;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public String valueAsText() {
        String str;
        if (this.showBitLength) {
            str = b.i("[", this.data != null ? new BigInteger(1, this.data).bitLength() : 0, "]  ");
        } else {
            str = "";
        }
        StringBuilder s10 = v.s(str);
        s10.append(StringConverter.byteToHex(this.data));
        return s10.toString();
    }

    public ByteField(CVCTagEnum cVCTagEnum, byte[] bArr) {
        this(cVCTagEnum, bArr, false);
    }

    public ByteField(CVCTagEnum cVCTagEnum, byte[] bArr, boolean z10) {
        super(cVCTagEnum);
        this.data = bArr;
        this.showBitLength = z10;
    }
}
