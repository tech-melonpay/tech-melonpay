package org.bouncycastle.jsse.provider;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/* loaded from: classes.dex */
public class SSLSocketFactoryImpl extends ProvSSLSocketFactory {
    public SSLSocketFactoryImpl() {
        super(DefaultSSLContextSpi.getDefaultInstance());
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSocketFactory, javax.net.SocketFactory
    public /* bridge */ /* synthetic */ Socket createSocket() {
        return super.createSocket();
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSocketFactory, javax.net.ssl.SSLSocketFactory
    public /* bridge */ /* synthetic */ String[] getDefaultCipherSuites() {
        return super.getDefaultCipherSuites();
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSocketFactory, javax.net.ssl.SSLSocketFactory
    public /* bridge */ /* synthetic */ String[] getSupportedCipherSuites() {
        return super.getSupportedCipherSuites();
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSocketFactory, javax.net.SocketFactory
    public /* bridge */ /* synthetic */ Socket createSocket(String str, int i) {
        return super.createSocket(str, i);
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSocketFactory, javax.net.SocketFactory
    public /* bridge */ /* synthetic */ Socket createSocket(String str, int i, InetAddress inetAddress, int i9) {
        return super.createSocket(str, i, inetAddress, i9);
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSocketFactory, javax.net.SocketFactory
    public /* bridge */ /* synthetic */ Socket createSocket(InetAddress inetAddress, int i) {
        return super.createSocket(inetAddress, i);
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSocketFactory, javax.net.SocketFactory
    public /* bridge */ /* synthetic */ Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i9) {
        return super.createSocket(inetAddress, i, inetAddress2, i9);
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSocketFactory
    public /* bridge */ /* synthetic */ Socket createSocket(Socket socket, InputStream inputStream, boolean z10) {
        return super.createSocket(socket, inputStream, z10);
    }

    @Override // org.bouncycastle.jsse.provider.ProvSSLSocketFactory, javax.net.ssl.SSLSocketFactory
    public /* bridge */ /* synthetic */ Socket createSocket(Socket socket, String str, int i, boolean z10) {
        return super.createSocket(socket, str, i, z10);
    }
}
