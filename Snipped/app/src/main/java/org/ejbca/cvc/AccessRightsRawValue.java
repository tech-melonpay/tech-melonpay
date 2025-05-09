package org.ejbca.cvc;

import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class AccessRightsRawValue implements AccessRights {
    private final byte[] bytes;

    public AccessRightsRawValue(byte[] bArr) {
        this.bytes = bArr;
    }

    @Override // org.ejbca.cvc.AccessRights
    public byte[] getEncoded() {
        return this.bytes;
    }

    @Override // org.ejbca.cvc.AccessRights
    public String name() {
        return "RAW_ACCESS_RIGHTS";
    }

    public String toString() {
        return "AccessRightsRawValue(" + Hex.toHexString(this.bytes).toUpperCase() + ")";
    }
}
