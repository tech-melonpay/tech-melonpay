package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsCrypto;

/* loaded from: classes3.dex */
public interface TlsPeer {
    void cancel();

    int[] getCipherSuites();

    TlsCrypto getCrypto();

    int getHandshakeTimeoutMillis();

    TlsHeartbeat getHeartbeat();

    short getHeartbeatPolicy();

    TlsKeyExchangeFactory getKeyExchangeFactory();

    ProtocolVersion[] getProtocolVersions();

    int getRenegotiationPolicy();

    void notifyAlertRaised(short s10, short s11, String str, Throwable th);

    void notifyAlertReceived(short s10, short s11);

    void notifyCloseHandle(TlsCloseable tlsCloseable);

    void notifyHandshakeBeginning();

    void notifyHandshakeComplete();

    void notifySecureRenegotiation(boolean z10);

    boolean requiresExtendedMasterSecret();

    boolean shouldCheckSigAlgOfPeerCerts();

    boolean shouldUseExtendedPadding();

    boolean shouldUseGMTUnixTime();
}
