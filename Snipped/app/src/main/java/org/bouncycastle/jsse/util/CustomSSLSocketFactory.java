package org.bouncycastle.jsse.util;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class CustomSSLSocketFactory extends SSLSocketFactory {
    protected final SSLSocketFactory delegate;

    public CustomSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        if (sSLSocketFactory == null) {
            throw new NullPointerException("'delegate' cannot be null");
        }
        this.delegate = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return configureSocket(this.delegate.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return configureSocket(this.delegate.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i9) {
        return configureSocket(this.delegate.createSocket(str, i, inetAddress, i9));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return configureSocket(this.delegate.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i9) {
        return configureSocket(this.delegate.createSocket(inetAddress, i, inetAddress2, i9));
    }

    public Socket createSocket(Socket socket, InputStream inputStream, boolean z10) {
        return configureSocket(this.delegate.createSocket(socket, inputStream, z10));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z10) {
        return configureSocket(this.delegate.createSocket(socket, str, i, z10));
    }

    public Socket configureSocket(Socket socket) {
        return socket;
    }
}
