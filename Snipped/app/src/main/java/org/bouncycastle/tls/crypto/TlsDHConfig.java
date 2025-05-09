package org.bouncycastle.tls.crypto;

/* loaded from: classes3.dex */
public class TlsDHConfig {
    protected final DHGroup explicitGroup;
    protected final int namedGroup;
    protected final boolean padded;

    public TlsDHConfig(int i, boolean z10) {
        this.explicitGroup = null;
        this.namedGroup = i;
        this.padded = z10;
    }

    public DHGroup getExplicitGroup() {
        return this.explicitGroup;
    }

    public int getNamedGroup() {
        return this.namedGroup;
    }

    public boolean isPadded() {
        return this.padded;
    }

    public TlsDHConfig(DHGroup dHGroup) {
        this.explicitGroup = dHGroup;
        this.namedGroup = -1;
        this.padded = false;
    }
}
