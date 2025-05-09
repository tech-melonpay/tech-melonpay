package org.bouncycastle.tls;

import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class DefaultTlsHeartbeat implements TlsHeartbeat {
    private int counter = 0;
    private final int idleMillis;
    private final int timeoutMillis;

    public DefaultTlsHeartbeat(int i, int i9) {
        if (i <= 0) {
            throw new IllegalArgumentException("'idleMillis' must be > 0");
        }
        if (i9 <= 0) {
            throw new IllegalArgumentException("'timeoutMillis' must be > 0");
        }
        this.idleMillis = i;
        this.timeoutMillis = i9;
    }

    @Override // org.bouncycastle.tls.TlsHeartbeat
    public synchronized byte[] generatePayload() {
        int i;
        i = this.counter + 1;
        this.counter = i;
        return Pack.intToBigEndian(i);
    }

    @Override // org.bouncycastle.tls.TlsHeartbeat
    public int getIdleMillis() {
        return this.idleMillis;
    }

    @Override // org.bouncycastle.tls.TlsHeartbeat
    public int getTimeoutMillis() {
        return this.timeoutMillis;
    }
}
