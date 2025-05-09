package org.bouncycastle.jsse.provider;

import java.io.Closeable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
abstract class ProvSSLSocketBase extends SSLSocket implements BCSSLSocket {
    protected static final boolean provJdkTlsTrustNameService = PropertyUtils.getBooleanSystemProperty("jdk.tls.trustNameService", false);
    protected final Closeable socketCloser = new Closeable() { // from class: org.bouncycastle.jsse.provider.ProvSSLSocketBase.1
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ProvSSLSocketBase.this.closeSocket();
        }
    };
    protected final Set<HandshakeCompletedListenerAdapter> listeners = Collections.synchronizedSet(new HashSet());

    @Override // javax.net.ssl.SSLSocket
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        if (handshakeCompletedListener == null) {
            throw new IllegalArgumentException("'listener' cannot be null");
        }
        this.listeners.add(new HandshakeCompletedListenerAdapter(handshakeCompletedListener));
    }

    public void closeSocket() {
        super.close();
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        throw new UnsupportedOperationException();
    }

    @Override // java.net.Socket
    public boolean getOOBInline() {
        return false;
    }

    public void implBind(InetAddress inetAddress, int i) {
        bind(new InetSocketAddress(inetAddress, i));
    }

    public void implConnect(String str, int i) {
        connect(str == null ? new InetSocketAddress(InetAddress.getByName(null), i) : new InetSocketAddress(str, i), 0);
    }

    @Override // javax.net.ssl.SSLSocket
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        if (handshakeCompletedListener == null) {
            throw new IllegalArgumentException("'listener' cannot be null");
        }
        if (!this.listeners.remove(new HandshakeCompletedListenerAdapter(handshakeCompletedListener))) {
            throw new IllegalArgumentException("'listener' is not registered");
        }
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i) {
        throw new UnsupportedOperationException("Urgent data not supported in TLS");
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("Urgent data not supported in TLS");
        }
    }

    @Override // java.net.Socket
    public void shutdownInput() {
        throw new UnsupportedOperationException("shutdownInput() not supported in TLS");
    }

    @Override // java.net.Socket
    public void shutdownOutput() {
        throw new UnsupportedOperationException("shutdownOutput() not supported in TLS");
    }

    public void implConnect(InetAddress inetAddress, int i) {
        connect(new InetSocketAddress(inetAddress, i), 0);
    }
}
