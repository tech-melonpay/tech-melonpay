package org.bouncycastle.jsse.provider;

import java.util.List;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;

/* loaded from: classes.dex */
class ProvSSLSessionHandshake extends ProvSSLSessionBase {
    protected final SecurityParameters securityParameters;

    public ProvSSLSessionHandshake(ProvSSLSessionContext provSSLSessionContext, String str, int i, SecurityParameters securityParameters) {
        super(provSSLSessionContext, str, i);
        this.securityParameters = securityParameters;
    }

    public String getApplicationProtocol() {
        return JsseUtils.getApplicationProtocol(this.securityParameters);
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSessionBase
    public int getCipherSuiteTLS() {
        return this.securityParameters.getCipherSuite();
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSessionBase
    public byte[] getIDArray() {
        return this.securityParameters.getSessionID();
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSessionBase
    public JsseSessionParameters getJsseSessionParameters() {
        return null;
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSessionBase
    public Certificate getLocalCertificateTLS() {
        return this.securityParameters.getLocalCertificate();
    }

    @Override // org.bouncycastle.jsse.BCExtendedSSLSession
    public String[] getLocalSupportedSignatureAlgorithms() {
        throw new UnsupportedOperationException();
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSessionBase
    public Certificate getPeerCertificateTLS() {
        return this.securityParameters.getPeerCertificate();
    }

    @Override // org.bouncycastle.jsse.BCExtendedSSLSession
    public String[] getPeerSupportedSignatureAlgorithms() {
        throw new UnsupportedOperationException();
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSessionBase
    public ProtocolVersion getProtocolTLS() {
        return this.securityParameters.getNegotiatedVersion();
    }

    @Override // org.bouncycastle.jsse.BCExtendedSSLSession
    public List<BCSNIServerName> getRequestedServerNames() {
        return JsseUtils.convertSNIServerNames(this.securityParameters.getClientServerNames());
    }
}
