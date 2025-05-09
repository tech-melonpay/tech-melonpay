package org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCApplicationProtocolSelector;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLConnection;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsProtocol;

/* loaded from: classes.dex */
class ProvSSLSocketDirect extends ProvSSLSocketBase implements ProvTlsManager {
    private static final Logger LOG = Logger.getLogger(ProvSSLSocketDirect.class.getName());
    protected final AppDataInput appDataIn;
    protected final AppDataOutput appDataOut;
    protected ProvSSLConnection connection;
    protected final ProvSSLContextSpi context;
    protected final ContextData contextData;
    protected boolean enableSessionCreation;
    protected ProvSSLSessionHandshake handshakeSession;
    protected String peerHost;
    protected String peerHostSNI;
    protected TlsProtocol protocol;
    protected ProvTlsPeer protocolPeer;
    protected final ProvSSLParameters sslParameters;
    protected boolean useClientMode;

    public class AppDataInput extends InputStream {
        public AppDataInput() {
        }

        @Override // java.io.InputStream
        public int available() {
            int applicationDataAvailable;
            synchronized (ProvSSLSocketDirect.this) {
                TlsProtocol tlsProtocol = ProvSSLSocketDirect.this.protocol;
                applicationDataAvailable = tlsProtocol == null ? 0 : tlsProtocol.applicationDataAvailable();
            }
            return applicationDataAvailable;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ProvSSLSocketDirect.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            ProvSSLSocketDirect.this.handshakeIfNecessary(true);
            byte[] bArr = new byte[1];
            if (ProvSSLSocketDirect.this.protocol.readApplicationData(bArr, 0, 1) < 0) {
                return -1;
            }
            return bArr[0] & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i9) {
            if (i9 < 1) {
                return 0;
            }
            ProvSSLSocketDirect.this.handshakeIfNecessary(true);
            return ProvSSLSocketDirect.this.protocol.readApplicationData(bArr, i, i9);
        }
    }

    public class AppDataOutput extends OutputStream {
        public AppDataOutput() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ProvSSLSocketDirect.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            synchronized (ProvSSLSocketDirect.this) {
                try {
                    TlsProtocol tlsProtocol = ProvSSLSocketDirect.this.protocol;
                    if (tlsProtocol != null) {
                        tlsProtocol.flush();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            ProvSSLSocketDirect.this.handshakeIfNecessary(true);
            ProvSSLSocketDirect.this.protocol.writeApplicationData(new byte[]{(byte) i}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i9) {
            if (i9 > 0) {
                ProvSSLSocketDirect.this.handshakeIfNecessary(true);
                ProvSSLSocketDirect.this.protocol.writeApplicationData(bArr, i, i9);
            }
        }
    }

    public ProvSSLSocketDirect(ProvSSLContextSpi provSSLContextSpi, ContextData contextData) {
        this.appDataIn = new AppDataInput();
        this.appDataOut = new AppDataOutput();
        this.peerHost = null;
        this.peerHostSNI = null;
        this.enableSessionCreation = true;
        this.useClientMode = true;
        this.protocol = null;
        this.protocolPeer = null;
        this.connection = null;
        this.handshakeSession = null;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.sslParameters = provSSLContextSpi.getDefaultParameters(!true);
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        try {
            this.contextData.getX509TrustManager().checkClientTrusted((X509Certificate[]) x509CertificateArr.clone(), str, this);
        } catch (CertificateException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        try {
            this.contextData.getX509TrustManager().checkServerTrusted((X509Certificate[]) x509CertificateArr.clone(), str, this);
        } catch (CertificateException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public String chooseClientAlias(String[] strArr, Principal[] principalArr) {
        return this.contextData.getX509KeyManager().chooseClientAlias(strArr, principalArr, this);
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public String chooseServerAlias(String str, Principal[] principalArr) {
        return this.contextData.getX509KeyManager().chooseServerAlias(str, principalArr, this);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            TlsProtocol tlsProtocol = this.protocol;
            if (tlsProtocol == null) {
                closeSocket();
            } else {
                tlsProtocol.close();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            throw new SocketException("Only InetSocketAddress is supported.");
        }
        super.connect(socketAddress, i);
        notifyConnected();
    }

    public void finalize() {
        try {
            try {
                try {
                    close();
                } finally {
                    super.finalize();
                }
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            super.close();
        }
    }

    @Override // javax.net.ssl.SSLSocket, org.bouncycastle.jsse.BCSSLSocket
    public synchronized String getApplicationProtocol() {
        ProvSSLConnection provSSLConnection;
        provSSLConnection = this.connection;
        return provSSLConnection == null ? null : provSSLConnection.getApplicationProtocol();
    }

    @Override // org.bouncycastle.jsse.BCSSLSocket
    public synchronized BCApplicationProtocolSelector<SSLSocket> getBCHandshakeApplicationProtocolSelector() {
        return this.sslParameters.getSocketAPSelector();
    }

    @Override // org.bouncycastle.jsse.BCSSLSocket
    public synchronized BCExtendedSSLSession getBCHandshakeSession() {
        return this.handshakeSession;
    }

    @Override // org.bouncycastle.jsse.BCSSLSocket
    public synchronized BCSSLConnection getConnection() {
        try {
            handshakeIfNecessary(false);
        } catch (IOException e10) {
            LOG.log(Level.FINE, "Failed to establish connection", (Throwable) e10);
        }
        return this.connection;
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public ProvSSLContextSpi getContext() {
        return this.context;
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public ContextData getContextData() {
        return this.contextData;
    }

    @Override // javax.net.ssl.SSLSocket, org.bouncycastle.jsse.provider.ProvTlsManager
    public synchronized boolean getEnableSessionCreation() {
        return this.enableSessionCreation;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized String[] getEnabledCipherSuites() {
        return this.sslParameters.getCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized String[] getEnabledProtocols() {
        return this.sslParameters.getProtocols();
    }

    @Override // javax.net.ssl.SSLSocket, org.bouncycastle.jsse.BCSSLSocket
    public synchronized String getHandshakeApplicationProtocol() {
        ProvSSLSessionHandshake provSSLSessionHandshake;
        provSSLSessionHandshake = this.handshakeSession;
        return provSSLSessionHandshake == null ? null : provSSLSessionHandshake.getApplicationProtocol();
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized SSLSession getHandshakeSession() {
        ProvSSLSessionHandshake provSSLSessionHandshake;
        provSSLSessionHandshake = this.handshakeSession;
        return provSSLSessionHandshake == null ? null : provSSLSessionHandshake.getExportSSLSession();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() {
        return this.appDataIn;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() {
        return this.appDataOut;
    }

    @Override // org.bouncycastle.jsse.BCSSLSocket
    public synchronized BCSSLParameters getParameters() {
        return SSLParametersUtil.getParameters(this.sslParameters);
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public synchronized String getPeerHost() {
        return this.peerHost;
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public synchronized String getPeerHostSNI() {
        return this.peerHostSNI;
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public int getPeerPort() {
        return getPort();
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized SSLParameters getSSLParameters() {
        return SSLParametersUtil.getSSLParameters(this.sslParameters);
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized SSLSession getSession() {
        ProvSSLConnection provSSLConnection;
        try {
            getConnection();
            provSSLConnection = this.connection;
        } catch (Throwable th) {
            throw th;
        }
        return (provSSLConnection == null ? ProvSSLSession.NULL_SESSION : provSSLConnection.getSession()).getExportSSLSession();
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized String[] getSupportedCipherSuites() {
        return this.context.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized String[] getSupportedProtocols() {
        return this.context.getSupportedProtocols();
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized boolean getUseClientMode() {
        return this.useClientMode;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    public synchronized void handshakeIfNecessary(boolean z10) {
        try {
            TlsProtocol tlsProtocol = this.protocol;
            if (tlsProtocol != null) {
                if (tlsProtocol.isHandshaking()) {
                }
            }
            startHandshake(z10);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void notifyConnected() {
        String str = this.peerHost;
        if (str != null && str.length() > 0) {
            this.peerHostSNI = this.peerHost;
            return;
        }
        InetAddress inetAddress = getInetAddress();
        if (inetAddress == null) {
            return;
        }
        this.peerHost = (this.useClientMode && ProvSSLSocketBase.provJdkTlsTrustNameService) ? inetAddress.getHostName() : inetAddress.getHostAddress();
        this.peerHostSNI = null;
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public synchronized void notifyHandshakeComplete(ProvSSLConnection provSSLConnection) {
        try {
            ProvSSLSessionHandshake provSSLSessionHandshake = this.handshakeSession;
            if (provSSLSessionHandshake != null && !provSSLSessionHandshake.isValid()) {
                provSSLConnection.getSession().invalidate();
            }
            this.handshakeSession = null;
            this.connection = provSSLConnection;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public synchronized void notifyHandshakeSession(ProvSSLSessionHandshake provSSLSessionHandshake) {
        this.handshakeSession = provSSLSessionHandshake;
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public synchronized String selectApplicationProtocol(List<String> list) {
        return this.sslParameters.getSocketAPSelector().select(this, list);
    }

    @Override // org.bouncycastle.jsse.BCSSLSocket
    public synchronized void setBCHandshakeApplicationProtocolSelector(BCApplicationProtocolSelector<SSLSocket> bCApplicationProtocolSelector) {
        this.sslParameters.setSocketAPSelector(bCApplicationProtocolSelector);
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setEnableSessionCreation(boolean z10) {
        this.enableSessionCreation = z10;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setProtocols(strArr);
    }

    @Override // org.bouncycastle.jsse.BCSSLSocket
    public synchronized void setHost(String str) {
        this.peerHost = str;
        this.peerHostSNI = str;
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setNeedClientAuth(boolean z10) {
        this.sslParameters.setNeedClientAuth(z10);
    }

    @Override // org.bouncycastle.jsse.BCSSLSocket
    public synchronized void setParameters(BCSSLParameters bCSSLParameters) {
        SSLParametersUtil.setParameters(this.sslParameters, bCSSLParameters);
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setSSLParameters(SSLParameters sSLParameters) {
        SSLParametersUtil.setSSLParameters(this.sslParameters, sSLParameters);
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setUseClientMode(boolean z10) {
        if (this.protocol != null) {
            throw new IllegalArgumentException("Mode cannot be changed after the initial handshake has begun");
        }
        if (this.useClientMode != z10) {
            this.context.updateDefaultProtocols(this.sslParameters, !z10);
            this.useClientMode = z10;
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void setWantClientAuth(boolean z10) {
        this.sslParameters.setWantClientAuth(z10);
    }

    @Override // javax.net.ssl.SSLSocket
    public synchronized void startHandshake() {
        startHandshake(true);
    }

    public ProvSSLSocketDirect(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, String str, int i) {
        this.appDataIn = new AppDataInput();
        this.appDataOut = new AppDataOutput();
        this.peerHost = null;
        this.peerHostSNI = null;
        this.enableSessionCreation = true;
        this.useClientMode = true;
        this.protocol = null;
        this.protocolPeer = null;
        this.connection = null;
        this.handshakeSession = null;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.sslParameters = provSSLContextSpi.getDefaultParameters(!true);
        this.peerHost = str;
        implConnect(str, i);
    }

    public void startHandshake(boolean z10) {
        TlsProtocol tlsProtocol = this.protocol;
        if (tlsProtocol != null) {
            if (!tlsProtocol.isHandshaking()) {
                throw new UnsupportedOperationException("Renegotiation not supported");
            }
            this.protocol.setResumableHandshake(z10);
            this.protocol.resumeHandshake();
            return;
        }
        InputStream inputStream = super.getInputStream();
        OutputStream outputStream = super.getOutputStream();
        if (this.useClientMode) {
            ProvTlsClientProtocol provTlsClientProtocol = new ProvTlsClientProtocol(inputStream, outputStream, this.socketCloser);
            provTlsClientProtocol.setResumableHandshake(z10);
            this.protocol = provTlsClientProtocol;
            ProvTlsClient provTlsClient = new ProvTlsClient(this, this.sslParameters);
            this.protocolPeer = provTlsClient;
            provTlsClientProtocol.connect(provTlsClient);
            return;
        }
        ProvTlsServerProtocol provTlsServerProtocol = new ProvTlsServerProtocol(inputStream, outputStream, this.socketCloser);
        provTlsServerProtocol.setResumableHandshake(z10);
        this.protocol = provTlsServerProtocol;
        ProvTlsServer provTlsServer = new ProvTlsServer(this, this.sslParameters);
        this.protocolPeer = provTlsServer;
        provTlsServerProtocol.accept(provTlsServer);
    }

    public ProvSSLSocketDirect(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, String str, int i, InetAddress inetAddress, int i9) {
        this.appDataIn = new AppDataInput();
        this.appDataOut = new AppDataOutput();
        this.peerHost = null;
        this.peerHostSNI = null;
        this.enableSessionCreation = true;
        this.useClientMode = true;
        this.protocol = null;
        this.protocolPeer = null;
        this.connection = null;
        this.handshakeSession = null;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.sslParameters = provSSLContextSpi.getDefaultParameters(!true);
        this.peerHost = str;
        implBind(inetAddress, i9);
        implConnect(str, i);
    }

    public ProvSSLSocketDirect(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, InetAddress inetAddress, int i) {
        this.appDataIn = new AppDataInput();
        this.appDataOut = new AppDataOutput();
        this.peerHost = null;
        this.peerHostSNI = null;
        this.enableSessionCreation = true;
        this.useClientMode = true;
        this.protocol = null;
        this.protocolPeer = null;
        this.connection = null;
        this.handshakeSession = null;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.sslParameters = provSSLContextSpi.getDefaultParameters(!true);
        implConnect(inetAddress, i);
    }

    public ProvSSLSocketDirect(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, InetAddress inetAddress, int i, InetAddress inetAddress2, int i9) {
        this.appDataIn = new AppDataInput();
        this.appDataOut = new AppDataOutput();
        this.peerHost = null;
        this.peerHostSNI = null;
        this.enableSessionCreation = true;
        this.useClientMode = true;
        this.protocol = null;
        this.protocolPeer = null;
        this.connection = null;
        this.handshakeSession = null;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.sslParameters = provSSLContextSpi.getDefaultParameters(!true);
        implBind(inetAddress2, i9);
        implConnect(inetAddress, i);
    }

    public ProvSSLSocketDirect(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, boolean z10, boolean z11, ProvSSLParameters provSSLParameters) {
        this.appDataIn = new AppDataInput();
        this.appDataOut = new AppDataOutput();
        this.peerHost = null;
        this.peerHostSNI = null;
        this.protocol = null;
        this.protocolPeer = null;
        this.connection = null;
        this.handshakeSession = null;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.enableSessionCreation = z10;
        this.useClientMode = z11;
        this.sslParameters = provSSLParameters;
    }
}
