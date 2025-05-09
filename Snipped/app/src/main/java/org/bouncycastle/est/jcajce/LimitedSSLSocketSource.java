package org.bouncycastle.est.jcajce;

import java.io.InputStream;
import java.io.OutputStream;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.est.LimitedSource;
import org.bouncycastle.est.Source;
import org.bouncycastle.est.TLSUniqueProvider;

/* loaded from: classes2.dex */
class LimitedSSLSocketSource implements Source<SSLSession>, TLSUniqueProvider, LimitedSource {
    private final Long absoluteReadLimit;
    private final ChannelBindingProvider bindingProvider;
    protected final SSLSocket socket;

    public LimitedSSLSocketSource(SSLSocket sSLSocket, ChannelBindingProvider channelBindingProvider, Long l10) {
        this.socket = sSLSocket;
        this.bindingProvider = channelBindingProvider;
        this.absoluteReadLimit = l10;
    }

    @Override // org.bouncycastle.est.Source
    public void close() {
        this.socket.close();
    }

    @Override // org.bouncycastle.est.LimitedSource
    public Long getAbsoluteReadLimit() {
        return this.absoluteReadLimit;
    }

    @Override // org.bouncycastle.est.Source
    public InputStream getInputStream() {
        return this.socket.getInputStream();
    }

    @Override // org.bouncycastle.est.Source
    public OutputStream getOutputStream() {
        return this.socket.getOutputStream();
    }

    @Override // org.bouncycastle.est.TLSUniqueProvider
    public byte[] getTLSUnique() {
        if (isTLSUniqueAvailable()) {
            return this.bindingProvider.getChannelBinding(this.socket, "tls-unique");
        }
        throw new IllegalStateException("No binding provider.");
    }

    @Override // org.bouncycastle.est.TLSUniqueProvider
    public boolean isTLSUniqueAvailable() {
        return this.bindingProvider.canAccessChannelBinding(this.socket);
    }

    @Override // org.bouncycastle.est.Source
    public SSLSession getSession() {
        return this.socket.getSession();
    }
}
