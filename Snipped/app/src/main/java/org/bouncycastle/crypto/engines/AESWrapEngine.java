package org.bouncycastle.crypto.engines;

/* loaded from: classes2.dex */
public class AESWrapEngine extends RFC3394WrapEngine {
    public AESWrapEngine() {
        super(new AESEngine());
    }

    public AESWrapEngine(boolean z10) {
        super(new AESEngine(), z10);
    }
}
