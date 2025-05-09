package org.bouncycastle.jsse.provider;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/* loaded from: classes.dex */
class ProvSSLServerSocketFactory extends SSLServerSocketFactory {
    protected final ProvSSLContextSpi context;

    public ProvSSLServerSocketFactory(ProvSSLContextSpi provSSLContextSpi) {
        this.context = provSSLContextSpi;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket() {
        ProvSSLContextSpi provSSLContextSpi = this.context;
        return new ProvSSLServerSocket(provSSLContextSpi, provSSLContextSpi.createContextData());
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.context.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.context.getSupportedCipherSuites();
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i) {
        ProvSSLContextSpi provSSLContextSpi = this.context;
        return new ProvSSLServerSocket(provSSLContextSpi, provSSLContextSpi.createContextData(), i);
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i9) {
        ProvSSLContextSpi provSSLContextSpi = this.context;
        return new ProvSSLServerSocket(provSSLContextSpi, provSSLContextSpi.createContextData(), i, i9);
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i9, InetAddress inetAddress) {
        ProvSSLContextSpi provSSLContextSpi = this.context;
        return new ProvSSLServerSocket(provSSLContextSpi, provSSLContextSpi.createContextData(), i, i9, inetAddress);
    }
}
