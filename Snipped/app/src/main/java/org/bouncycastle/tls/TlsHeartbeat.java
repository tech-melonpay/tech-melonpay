package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public interface TlsHeartbeat {
    byte[] generatePayload();

    int getIdleMillis();

    int getTimeoutMillis();
}
