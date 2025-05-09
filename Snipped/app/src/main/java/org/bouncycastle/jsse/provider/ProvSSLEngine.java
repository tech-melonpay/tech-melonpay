package org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import org.bouncycastle.jsse.BCApplicationProtocolSelector;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLConnection;
import org.bouncycastle.jsse.BCSSLEngine;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.tls.RecordPreview;
import org.bouncycastle.tls.TlsClientProtocol;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsProtocol;
import org.bouncycastle.tls.TlsServerProtocol;

/* loaded from: classes.dex */
class ProvSSLEngine extends SSLEngine implements BCSSLEngine, ProvTlsManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Logger LOG = Logger.getLogger(ProvSSLEngine.class.getName());
    protected boolean closedEarly;
    protected ProvSSLConnection connection;
    protected final ProvSSLContextSpi context;
    protected final ContextData contextData;
    protected SSLException deferredException;
    protected boolean enableSessionCreation;
    protected ProvSSLSessionHandshake handshakeSession;
    protected SSLEngineResult.HandshakeStatus handshakeStatus;
    protected boolean initialHandshakeBegun;
    protected TlsProtocol protocol;
    protected ProvTlsPeer protocolPeer;
    protected final ProvSSLParameters sslParameters;
    protected boolean useClientMode;

    public ProvSSLEngine(ProvSSLContextSpi provSSLContextSpi, ContextData contextData) {
        this.enableSessionCreation = true;
        this.useClientMode = false;
        this.closedEarly = false;
        this.initialHandshakeBegun = false;
        this.handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        this.protocol = null;
        this.protocolPeer = null;
        this.connection = null;
        this.handshakeSession = null;
        this.deferredException = null;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.sslParameters = provSSLContextSpi.getDefaultParameters(true);
    }

    private RecordPreview getRecordPreview(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 5) {
            return null;
        }
        byte[] bArr = new byte[5];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return this.protocol.previewInputRecord(bArr);
    }

    private int getTotalRemaining(ByteBuffer[] byteBufferArr, int i, int i9, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            int remaining = byteBufferArr[i + i12].remaining();
            if (remaining >= i10 - i11) {
                return i10;
            }
            i11 += remaining;
        }
        return i11;
    }

    private boolean hasInsufficientSpace(ByteBuffer[] byteBufferArr, int i, int i9, int i10) {
        return getTotalRemaining(byteBufferArr, i, i9, i10) < i10;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void beginHandshake() {
        SSLEngineResult.HandshakeStatus handshakeStatus;
        try {
            if (this.closedEarly) {
                throw new SSLException("Connection is already closed");
            }
            if (this.initialHandshakeBegun) {
                throw new UnsupportedOperationException("Renegotiation not supported");
            }
            this.initialHandshakeBegun = true;
            try {
                if (this.useClientMode) {
                    TlsClientProtocol tlsClientProtocol = new TlsClientProtocol();
                    this.protocol = tlsClientProtocol;
                    ProvTlsClient provTlsClient = new ProvTlsClient(this, this.sslParameters);
                    this.protocolPeer = provTlsClient;
                    tlsClientProtocol.connect(provTlsClient);
                    handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_WRAP;
                } else {
                    TlsServerProtocol tlsServerProtocol = new TlsServerProtocol();
                    this.protocol = tlsServerProtocol;
                    ProvTlsServer provTlsServer = new ProvTlsServer(this, this.sslParameters);
                    this.protocolPeer = provTlsServer;
                    tlsServerProtocol.accept(provTlsServer);
                    handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
                }
                this.handshakeStatus = handshakeStatus;
            } catch (SSLException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new SSLException(e11);
            }
        } catch (Throwable th) {
            throw th;
        }
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
        return this.contextData.getX509KeyManager().chooseEngineClientAlias(strArr, principalArr, this);
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public String chooseServerAlias(String str, Principal[] principalArr) {
        return this.contextData.getX509KeyManager().chooseEngineServerAlias(str, principalArr, this);
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void closeInbound() {
        if (!this.closedEarly) {
            TlsProtocol tlsProtocol = this.protocol;
            if (tlsProtocol == null) {
                this.closedEarly = true;
            } else {
                try {
                    tlsProtocol.closeInput();
                } catch (IOException e10) {
                    throw new SSLException(e10);
                }
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void closeOutbound() {
        if (!this.closedEarly) {
            TlsProtocol tlsProtocol = this.protocol;
            if (tlsProtocol == null) {
                this.closedEarly = true;
            } else {
                try {
                    tlsProtocol.close();
                } catch (IOException e10) {
                    LOG.log(Level.WARNING, "Failed to close outbound", (Throwable) e10);
                }
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine, org.bouncycastle.jsse.BCSSLEngine
    public synchronized String getApplicationProtocol() {
        ProvSSLConnection provSSLConnection;
        provSSLConnection = this.connection;
        return provSSLConnection == null ? null : provSSLConnection.getApplicationProtocol();
    }

    @Override // org.bouncycastle.jsse.BCSSLEngine
    public synchronized BCApplicationProtocolSelector<SSLEngine> getBCHandshakeApplicationProtocolSelector() {
        return this.sslParameters.getEngineAPSelector();
    }

    @Override // org.bouncycastle.jsse.BCSSLEngine
    public synchronized BCExtendedSSLSession getBCHandshakeSession() {
        return this.handshakeSession;
    }

    @Override // org.bouncycastle.jsse.BCSSLEngine
    public synchronized BCSSLConnection getConnection() {
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

    @Override // javax.net.ssl.SSLEngine
    public synchronized Runnable getDelegatedTask() {
        return null;
    }

    @Override // javax.net.ssl.SSLEngine, org.bouncycastle.jsse.provider.ProvTlsManager
    public synchronized boolean getEnableSessionCreation() {
        return this.enableSessionCreation;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized String[] getEnabledCipherSuites() {
        return this.sslParameters.getCipherSuites();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized String[] getEnabledProtocols() {
        return this.sslParameters.getProtocols();
    }

    @Override // javax.net.ssl.SSLEngine, org.bouncycastle.jsse.BCSSLEngine
    public synchronized String getHandshakeApplicationProtocol() {
        ProvSSLSessionHandshake provSSLSessionHandshake;
        provSSLSessionHandshake = this.handshakeSession;
        return provSSLSessionHandshake == null ? null : provSSLSessionHandshake.getApplicationProtocol();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized SSLSession getHandshakeSession() {
        ProvSSLSessionHandshake provSSLSessionHandshake;
        provSSLSessionHandshake = this.handshakeSession;
        return provSSLSessionHandshake == null ? null : provSSLSessionHandshake.getExportSSLSession();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        return this.handshakeStatus;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    @Override // org.bouncycastle.jsse.BCSSLEngine
    public synchronized BCSSLParameters getParameters() {
        return SSLParametersUtil.getParameters(this.sslParameters);
    }

    @Override // javax.net.ssl.SSLEngine, org.bouncycastle.jsse.provider.ProvTlsManager
    public String getPeerHost() {
        return super.getPeerHost();
    }

    @Override // org.bouncycastle.jsse.provider.ProvTlsManager
    public String getPeerHostSNI() {
        return super.getPeerHost();
    }

    @Override // javax.net.ssl.SSLEngine, org.bouncycastle.jsse.provider.ProvTlsManager
    public int getPeerPort() {
        return super.getPeerPort();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized SSLParameters getSSLParameters() {
        return SSLParametersUtil.getSSLParameters(this.sslParameters);
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized SSLSession getSession() {
        ProvSSLConnection provSSLConnection;
        try {
            provSSLConnection = this.connection;
        } catch (Throwable th) {
            throw th;
        }
        return (provSSLConnection == null ? ProvSSLSession.NULL_SESSION : provSSLConnection.getSession()).getExportSSLSession();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized String[] getSupportedCipherSuites() {
        return this.context.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized String[] getSupportedProtocols() {
        return this.context.getSupportedProtocols();
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized boolean getUseClientMode() {
        return this.useClientMode;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        if (r0.isClosed() != false) goto L13;
     */
    @Override // javax.net.ssl.SSLEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isInboundDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.closedEarly     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L14
            org.bouncycastle.tls.TlsProtocol r0 = r1.protocol     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            boolean r0 = r0.isClosed()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            goto L14
        L10:
            r0 = move-exception
            goto L17
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r1)
            return r0
        L17:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jsse.provider.ProvSSLEngine.isInboundDone():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r2.protocol.getAvailableOutputBytes() < 1) goto L15;
     */
    @Override // javax.net.ssl.SSLEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isOutboundDone() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.closedEarly     // Catch: java.lang.Throwable -> L19
            r1 = 1
            if (r0 != 0) goto L1c
            org.bouncycastle.tls.TlsProtocol r0 = r2.protocol     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            boolean r0 = r0.isClosed()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            org.bouncycastle.tls.TlsProtocol r0 = r2.protocol     // Catch: java.lang.Throwable -> L19
            int r0 = r0.getAvailableOutputBytes()     // Catch: java.lang.Throwable -> L19
            if (r0 >= r1) goto L1b
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r1 = 0
        L1c:
            monitor-exit(r2)
            return r1
        L1e:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jsse.provider.ProvSSLEngine.isOutboundDone():boolean");
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
        return this.sslParameters.getEngineAPSelector().select(this, list);
    }

    @Override // org.bouncycastle.jsse.BCSSLEngine
    public synchronized void setBCHandshakeApplicationProtocolSelector(BCApplicationProtocolSelector<SSLEngine> bCApplicationProtocolSelector) {
        this.sslParameters.setEngineAPSelector(bCApplicationProtocolSelector);
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setEnableSessionCreation(boolean z10) {
        this.enableSessionCreation = z10;
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setNeedClientAuth(boolean z10) {
        this.sslParameters.setNeedClientAuth(z10);
    }

    @Override // org.bouncycastle.jsse.BCSSLEngine
    public synchronized void setParameters(BCSSLParameters bCSSLParameters) {
        SSLParametersUtil.setParameters(this.sslParameters, bCSSLParameters);
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setSSLParameters(SSLParameters sSLParameters) {
        SSLParametersUtil.setSSLParameters(this.sslParameters, sSLParameters);
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setUseClientMode(boolean z10) {
        if (this.initialHandshakeBegun) {
            throw new IllegalArgumentException("Mode cannot be changed after the initial handshake has begun");
        }
        if (this.useClientMode != z10) {
            this.context.updateDefaultProtocols(this.sslParameters, !z10);
            this.useClientMode = z10;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized void setWantClientAuth(boolean z10) {
        this.sslParameters.setWantClientAuth(z10);
    }

    @Override // javax.net.ssl.SSLEngine
    public synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i9) {
        int i10;
        SSLEngineResult.Status status;
        try {
            if (!this.initialHandshakeBegun) {
                beginHandshake();
            }
            SSLEngineResult.Status status2 = SSLEngineResult.Status.OK;
            int i11 = 0;
            if (this.protocol.isClosed()) {
                status = SSLEngineResult.Status.CLOSED;
                i10 = 0;
            } else {
                try {
                    RecordPreview recordPreview = getRecordPreview(byteBuffer);
                    if (recordPreview != null && byteBuffer.remaining() >= recordPreview.getRecordSize()) {
                        if (hasInsufficientSpace(byteBufferArr, i, i9, recordPreview.getApplicationDataLimit())) {
                            status2 = SSLEngineResult.Status.BUFFER_OVERFLOW;
                            i10 = 0;
                            status = status2;
                        } else {
                            int recordSize = recordPreview.getRecordSize();
                            byte[] bArr = new byte[recordSize];
                            byteBuffer.get(bArr);
                            this.protocol.offerInput(bArr);
                            try {
                                int availableInputBytes = this.protocol.getAvailableInputBytes();
                                i10 = 0;
                                for (int i12 = 0; i12 < i9 && availableInputBytes > 0; i12++) {
                                    try {
                                        ByteBuffer byteBuffer2 = byteBufferArr[i + i12];
                                        int min = Math.min(byteBuffer2.remaining(), availableInputBytes);
                                        if (min > 0) {
                                            byte[] bArr2 = new byte[min];
                                            this.protocol.readInput(bArr2, 0, min);
                                            byteBuffer2.put(bArr2);
                                            i10 += min;
                                            availableInputBytes -= min;
                                        }
                                    } catch (IOException e10) {
                                        e = e10;
                                        i11 = recordSize;
                                        if (this.handshakeStatus != SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                                            throw new SSLException(e);
                                        }
                                        if (this.deferredException == null) {
                                            this.deferredException = new SSLException(e);
                                        }
                                        SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_WRAP;
                                        this.handshakeStatus = handshakeStatus;
                                        return new SSLEngineResult(SSLEngineResult.Status.OK, handshakeStatus, i11, i10);
                                    }
                                }
                                if (availableInputBytes != 0) {
                                    throw new TlsFatalAlert((short) 22);
                                }
                                i11 = recordSize;
                                status = status2;
                            } catch (IOException e11) {
                                e = e11;
                                i10 = 0;
                            }
                        }
                    }
                    status2 = SSLEngineResult.Status.BUFFER_UNDERFLOW;
                    i10 = 0;
                    status = status2;
                } catch (IOException e12) {
                    e = e12;
                    i10 = 0;
                }
            }
            SSLEngineResult.HandshakeStatus handshakeStatus2 = this.handshakeStatus;
            if (handshakeStatus2 == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                if (this.protocol.getAvailableOutputBytes() > 0) {
                    handshakeStatus2 = SSLEngineResult.HandshakeStatus.NEED_WRAP;
                } else if (this.protocolPeer.isHandshakeComplete()) {
                    this.handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                    handshakeStatus2 = SSLEngineResult.HandshakeStatus.FINISHED;
                } else if (this.protocol.isClosed()) {
                    handshakeStatus2 = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                }
                this.handshakeStatus = handshakeStatus2;
            }
            return new SSLEngineResult(status, handshakeStatus2, i11, i10);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084 A[Catch: all -> 0x000d, TryCatch #1 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x0010, B:10:0x0019, B:12:0x0021, B:13:0x0025, B:16:0x002e, B:18:0x003a, B:20:0x004e, B:24:0x0059, B:26:0x0067, B:32:0x007c, B:34:0x0084, B:36:0x008e, B:37:0x009b, B:38:0x009d, B:42:0x00a6, B:44:0x00ae, B:45:0x00b5, B:47:0x00bd, B:48:0x00bf, B:49:0x00c2, B:50:0x00c5, B:57:0x0076, B:58:0x007b, B:61:0x00cd, B:62:0x00cf), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae A[Catch: all -> 0x000d, TryCatch #1 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x0010, B:10:0x0019, B:12:0x0021, B:13:0x0025, B:16:0x002e, B:18:0x003a, B:20:0x004e, B:24:0x0059, B:26:0x0067, B:32:0x007c, B:34:0x0084, B:36:0x008e, B:37:0x009b, B:38:0x009d, B:42:0x00a6, B:44:0x00ae, B:45:0x00b5, B:47:0x00bd, B:48:0x00bf, B:49:0x00c2, B:50:0x00c5, B:57:0x0076, B:58:0x007b, B:61:0x00cd, B:62:0x00cf), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[Catch: all -> 0x000d, TryCatch #1 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x0010, B:10:0x0019, B:12:0x0021, B:13:0x0025, B:16:0x002e, B:18:0x003a, B:20:0x004e, B:24:0x0059, B:26:0x0067, B:32:0x007c, B:34:0x0084, B:36:0x008e, B:37:0x009b, B:38:0x009d, B:42:0x00a6, B:44:0x00ae, B:45:0x00b5, B:47:0x00bd, B:48:0x00bf, B:49:0x00c2, B:50:0x00c5, B:57:0x0076, B:58:0x007b, B:61:0x00cd, B:62:0x00cf), top: B:2:0x0001, inners: #0 }] */
    @Override // javax.net.ssl.SSLEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] r9, int r10, int r11, java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jsse.provider.ProvSSLEngine.wrap(java.nio.ByteBuffer[], int, int, java.nio.ByteBuffer):javax.net.ssl.SSLEngineResult");
    }

    public ProvSSLEngine(ProvSSLContextSpi provSSLContextSpi, ContextData contextData, String str, int i) {
        super(str, i);
        this.enableSessionCreation = true;
        this.useClientMode = false;
        this.closedEarly = false;
        this.initialHandshakeBegun = false;
        this.handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        this.protocol = null;
        this.protocolPeer = null;
        this.connection = null;
        this.handshakeSession = null;
        this.deferredException = null;
        this.context = provSSLContextSpi;
        this.contextData = contextData;
        this.sslParameters = provSSLContextSpi.getDefaultParameters(true);
    }
}
