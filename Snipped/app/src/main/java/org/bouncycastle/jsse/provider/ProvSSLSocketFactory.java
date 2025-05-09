package org.bouncycastle.jsse.provider;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
class ProvSSLSocketFactory extends SSLSocketFactory {
    protected final ProvSSLContextSpi context;

    public ProvSSLSocketFactory(ProvSSLContextSpi provSSLContextSpi) {
        this.context = provSSLContextSpi;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        ProvSSLContextSpi provSSLContextSpi = this.context;
        return SSLSocketUtil.create(provSSLContextSpi, provSSLContextSpi.createContextData());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.context.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.context.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        ProvSSLContextSpi provSSLContextSpi = this.context;
        return SSLSocketUtil.create(provSSLContextSpi, provSSLContextSpi.createContextData(), str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i9) {
        ProvSSLContextSpi provSSLContextSpi = this.context;
        return SSLSocketUtil.create(provSSLContextSpi, provSSLContextSpi.createContextData(), str, i, inetAddress, i9);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        ProvSSLContextSpi provSSLContextSpi = this.context;
        return SSLSocketUtil.create(provSSLContextSpi, provSSLContextSpi.createContextData(), inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i9) {
        ProvSSLContextSpi provSSLContextSpi = this.context;
        return SSLSocketUtil.create(provSSLContextSpi, provSSLContextSpi.createContextData(), inetAddress, i, inetAddress2, i9);
    }

    public Socket createSocket(Socket socket, InputStream inputStream, boolean z10) {
        ProvSSLContextSpi provSSLContextSpi = this.context;
        return SSLSocketUtil.create(provSSLContextSpi, provSSLContextSpi.createContextData(), socket, inputStream, z10);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z10) {
        ProvSSLContextSpi provSSLContextSpi = this.context;
        return SSLSocketUtil.create(provSSLContextSpi, provSSLContextSpi.createContextData(), socket, str, i, z10);
    }
}
