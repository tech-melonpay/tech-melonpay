package org.bouncycastle.jsse.provider;

import java.net.InetAddress;
import java.net.ServerSocket;

/* loaded from: classes.dex */
public class SSLServerSocketFactoryImpl extends ProvSSLServerSocketFactory {
    public SSLServerSocketFactoryImpl() {
        super(DefaultSSLContextSpi.getDefaultInstance());
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLServerSocketFactory, javax.net.ServerSocketFactory
    public /* bridge */ /* synthetic */ ServerSocket createServerSocket() {
        return super.createServerSocket();
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLServerSocketFactory, javax.net.ssl.SSLServerSocketFactory
    public /* bridge */ /* synthetic */ String[] getDefaultCipherSuites() {
        return super.getDefaultCipherSuites();
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLServerSocketFactory, javax.net.ssl.SSLServerSocketFactory
    public /* bridge */ /* synthetic */ String[] getSupportedCipherSuites() {
        return super.getSupportedCipherSuites();
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLServerSocketFactory, javax.net.ServerSocketFactory
    public /* bridge */ /* synthetic */ ServerSocket createServerSocket(int i) {
        return super.createServerSocket(i);
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLServerSocketFactory, javax.net.ServerSocketFactory
    public /* bridge */ /* synthetic */ ServerSocket createServerSocket(int i, int i9) {
        return super.createServerSocket(i, i9);
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLServerSocketFactory, javax.net.ServerSocketFactory
    public /* bridge */ /* synthetic */ ServerSocket createServerSocket(int i, int i9, InetAddress inetAddress) {
        return super.createServerSocket(i, i9, inetAddress);
    }
}
