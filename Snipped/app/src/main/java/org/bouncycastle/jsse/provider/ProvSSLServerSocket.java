package org.bouncycastle.jsse.provider;

import java.net.InetAddress;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLServerSocket;

/* loaded from: classes.dex */
class ProvSSLServerSocket extends SSLServerSocket {
    protected final ProvSSLContextSpi context;
    protected final ContextData contextData;
    protected boolean enableSessionCreation;
    protected final ProvSSLParameters sslParameters;
    protected boolean useClientMode;

    public ProvSSLServerSocket(ProvSSLContextSpi provSSLContextSpi, ContextData contextData) {
        this.enableSessionCreation = true;
        this.useClientMode = false;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.sslParameters = provSSLContextSpi.getDefaultParameters(true);
    }

    @Override // java.net.ServerSocket
    public synchronized Socket accept() {
        ProvSSLSocketDirect create;
        create = SSLSocketUtil.create(this.context, this.contextData, this.enableSessionCreation, this.useClientMode, this.sslParameters.copy());
        implAccept(create);
        create.notifyConnected();
        return create;
    }

    @Override // java.net.ServerSocket
    public ServerSocketChannel getChannel() {
        throw new UnsupportedOperationException();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized boolean getEnableSessionCreation() {
        return this.enableSessionCreation;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized String[] getEnabledCipherSuites() {
        return this.sslParameters.getCipherSuites();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized String[] getEnabledProtocols() {
        return this.sslParameters.getProtocols();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized SSLParameters getSSLParameters() {
        return SSLParametersUtil.getSSLParameters(this.sslParameters);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized String[] getSupportedCipherSuites() {
        return this.context.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized String[] getSupportedProtocols() {
        return this.context.getSupportedProtocols();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized boolean getUseClientMode() {
        return this.useClientMode;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized void setEnableSessionCreation(boolean z10) {
        this.enableSessionCreation = z10;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized void setNeedClientAuth(boolean z10) {
        this.sslParameters.setNeedClientAuth(z10);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized void setSSLParameters(SSLParameters sSLParameters) {
        SSLParametersUtil.setSSLParameters(this.sslParameters, sSLParameters);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized void setUseClientMode(boolean z10) {
        if (this.useClientMode != z10) {
            this.context.updateDefaultProtocols(this.sslParameters, !z10);
            this.useClientMode = z10;
        }
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized void setWantClientAuth(boolean z10) {
        this.sslParameters.setWantClientAuth(z10);
    }

    public ProvSSLServerSocket(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, int i) {
        super(i);
        this.enableSessionCreation = true;
        this.useClientMode = false;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.sslParameters = provSSLContextSpi.getDefaultParameters(true);
    }

    public ProvSSLServerSocket(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, int i, int i9) {
        super(i, i9);
        this.enableSessionCreation = true;
        this.useClientMode = false;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.sslParameters = provSSLContextSpi.getDefaultParameters(true);
    }

    public ProvSSLServerSocket(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, int i, int i9, InetAddress inetAddress) {
        super(i, i9, inetAddress);
        this.enableSessionCreation = true;
        this.useClientMode = false;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.sslParameters = provSSLContextSpi.getDefaultParameters(true);
    }
}
