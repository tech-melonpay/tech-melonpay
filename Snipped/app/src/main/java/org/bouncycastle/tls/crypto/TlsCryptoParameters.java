package org.bouncycastle.tls.crypto;

import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsContext;

/* loaded from: classes3.dex */
public class TlsCryptoParameters {
    private final TlsContext context;

    public TlsCryptoParameters(TlsContext tlsContext) {
        this.context = tlsContext;
    }

    public ProtocolVersion getClientVersion() {
        return this.context.getClientVersion();
    }

    public TlsNonceGenerator getNonceGenerator() {
        return this.context.getNonceGenerator();
    }

    public SecurityParameters getSecurityParametersHandshake() {
        return this.context.getSecurityParametersHandshake();
    }

    public ProtocolVersion getServerVersion() {
        return this.context.getServerVersion();
    }

    public boolean isServer() {
        return this.context.isServer();
    }
}
