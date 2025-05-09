package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class AsymmetricKeyParameter implements CipherParameters {
    boolean privateKey;

    public AsymmetricKeyParameter(boolean z10) {
        this.privateKey = z10;
    }

    public boolean isPrivate() {
        return this.privateKey;
    }
}
