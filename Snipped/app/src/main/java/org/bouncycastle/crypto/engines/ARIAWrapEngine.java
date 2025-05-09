package org.bouncycastle.crypto.engines;

/* loaded from: classes2.dex */
public class ARIAWrapEngine extends RFC3394WrapEngine {
    public ARIAWrapEngine() {
        super(new ARIAEngine());
    }

    public ARIAWrapEngine(boolean z10) {
        super(new ARIAEngine(), z10);
    }
}
