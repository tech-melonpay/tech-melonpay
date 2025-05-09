package org.bouncycastle.tls.crypto;

import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
public abstract class TlsCryptoUtils {
    public static TlsSecret hkdfExpandLabel(TlsSecret tlsSecret, short s10, String str, byte[] bArr, int i) {
        byte[] byteArray = Strings.toByteArray("tls13 " + str);
        byte[] bArr2 = new byte[bArr.length + 1 + byteArray.length + 3];
        TlsUtils.checkUint16(i);
        TlsUtils.writeUint16(i, bArr2, 0);
        TlsUtils.writeOpaque8(byteArray, bArr2, 2);
        TlsUtils.writeOpaque8(bArr, bArr2, byteArray.length + 3);
        return tlsSecret.hkdfExpand(s10, bArr2, i);
    }
}
