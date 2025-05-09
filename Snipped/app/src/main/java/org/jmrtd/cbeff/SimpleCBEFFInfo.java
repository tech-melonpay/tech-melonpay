package org.jmrtd.cbeff;

import org.jmrtd.cbeff.BiometricDataBlock;

/* loaded from: classes3.dex */
public class SimpleCBEFFInfo<B extends BiometricDataBlock> implements CBEFFInfo {
    private B bdb;

    public SimpleCBEFFInfo(B b9) {
        this.bdb = b9;
    }

    public B getBiometricDataBlock() {
        return this.bdb;
    }
}
