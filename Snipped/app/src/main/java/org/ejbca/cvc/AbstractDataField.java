package org.ejbca.cvc;

import java.io.DataOutputStream;

/* loaded from: classes3.dex */
public abstract class AbstractDataField extends CVCObject {
    private static final long serialVersionUID = 1;

    public AbstractDataField(CVCTagEnum cVCTagEnum) {
        super(cVCTagEnum);
    }

    @Override // org.ejbca.cvc.CVCObject
    public int encode(DataOutputStream dataOutputStream) {
        int size = dataOutputStream.size();
        dataOutputStream.write(CVCObject.toByteArray(Integer.valueOf(getTag().getValue())));
        byte[] encoded = getEncoded();
        dataOutputStream.write(CVCObject.encodeLength(encoded.length));
        dataOutputStream.write(encoded);
        return dataOutputStream.size() - size;
    }

    @Override // org.ejbca.cvc.CVCObject
    public String getAsText(String str, boolean z10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.getAsText(str, z10));
        stringBuffer.append(valueAsText());
        return stringBuffer.toString();
    }

    public abstract byte[] getEncoded();

    public abstract String valueAsText();
}
