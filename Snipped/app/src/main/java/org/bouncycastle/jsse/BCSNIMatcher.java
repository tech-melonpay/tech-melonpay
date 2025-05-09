package org.bouncycastle.jsse;

import org.bouncycastle.tls.TlsUtils;

/* loaded from: classes.dex */
public abstract class BCSNIMatcher {
    private final int nameType;

    public BCSNIMatcher(int i) {
        if (!TlsUtils.isValidUint8(i)) {
            throw new IllegalArgumentException("'nameType' should be between 0 and 255");
        }
        this.nameType = i;
    }

    public final int getType() {
        return this.nameType;
    }

    public abstract boolean matches(BCSNIServerName bCSNIServerName);
}
