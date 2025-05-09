package org.bouncycastle.jsse.provider;

import androidx.camera.core.impl.utils.a;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLPermission;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.util.Arrays;

/* loaded from: classes.dex */
abstract class ProvSSLSessionBase extends BCExtendedSSLSession {
    protected final long creationTime;
    protected final SSLSession exportSSLSession;
    protected boolean invalidated;
    protected long lastAccessedTime;
    protected final String peerHost;
    protected final int peerPort;
    protected ProvSSLSessionContext sslSessionContext;
    protected final TlsCrypto tlsCrypto;
    protected final Map<String, Object> valueMap = Collections.synchronizedMap(new HashMap());

    public ProvSSLSessionBase(ProvSSLSessionContext provSSLSessionContext, String str, int i) {
        this.sslSessionContext = provSSLSessionContext;
        this.tlsCrypto = provSSLSessionContext == null ? null : provSSLSessionContext.getCrypto();
        this.peerHost = str;
        this.peerPort = i;
        long currentTimeMillis = System.currentTimeMillis();
        this.creationTime = currentTimeMillis;
        this.exportSSLSession = SSLSessionUtil.exportSSLSession(this);
        this.lastAccessedTime = currentTimeMillis;
        this.invalidated = false;
    }

    public synchronized void accessedAt(long j10) {
        this.lastAccessedTime = Math.max(this.lastAccessedTime, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProvSSLSessionBase) {
            return Arrays.areEqual(getIDArray(), ((ProvSSLSessionBase) obj).getIDArray());
        }
        return false;
    }

    @Override // javax.net.ssl.SSLSession
    public int getApplicationBufferSize() {
        return 16384;
    }

    @Override // javax.net.ssl.SSLSession
    public String getCipherSuite() {
        return ProvSSLContextSpi.getCipherSuiteName(getCipherSuiteTLS());
    }

    public abstract int getCipherSuiteTLS();

    @Override // javax.net.ssl.SSLSession
    public long getCreationTime() {
        return this.creationTime;
    }

    public SSLSession getExportSSLSession() {
        return this.exportSSLSession;
    }

    public abstract byte[] getIDArray();

    @Override // javax.net.ssl.SSLSession
    public byte[] getId() {
        byte[] iDArray = getIDArray();
        return iDArray == null ? TlsUtils.EMPTY_BYTES : Arrays.clone(iDArray);
    }

    public abstract JsseSessionParameters getJsseSessionParameters();

    @Override // javax.net.ssl.SSLSession
    public long getLastAccessedTime() {
        return this.lastAccessedTime;
    }

    public abstract Certificate getLocalCertificateTLS();

    @Override // javax.net.ssl.SSLSession
    public java.security.cert.Certificate[] getLocalCertificates() {
        X509Certificate[] x509CertificateChain;
        TlsCrypto tlsCrypto = this.tlsCrypto;
        if (tlsCrypto == null || (x509CertificateChain = JsseUtils.getX509CertificateChain(tlsCrypto, getLocalCertificateTLS())) == null || x509CertificateChain.length <= 0) {
            return null;
        }
        return x509CertificateChain;
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getLocalPrincipal() {
        TlsCrypto tlsCrypto = this.tlsCrypto;
        if (tlsCrypto != null) {
            return JsseUtils.getSubject(tlsCrypto, getLocalCertificateTLS());
        }
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public int getPacketBufferSize() {
        return 18443;
    }

    @Override // javax.net.ssl.SSLSession
    public javax.security.cert.X509Certificate[] getPeerCertificateChain() {
        java.security.cert.Certificate[] peerCertificates = getPeerCertificates();
        try {
            javax.security.cert.X509Certificate[] x509CertificateArr = new javax.security.cert.X509Certificate[peerCertificates.length];
            for (int i = 0; i < peerCertificates.length; i++) {
                x509CertificateArr[i] = javax.security.cert.X509Certificate.getInstance(peerCertificates[i].getEncoded());
            }
            return x509CertificateArr;
        } catch (Exception e10) {
            throw new SSLPeerUnverifiedException(e10.getMessage());
        }
    }

    public abstract Certificate getPeerCertificateTLS();

    @Override // javax.net.ssl.SSLSession
    public java.security.cert.Certificate[] getPeerCertificates() {
        X509Certificate[] x509CertificateChain;
        TlsCrypto tlsCrypto = this.tlsCrypto;
        if (tlsCrypto == null || (x509CertificateChain = JsseUtils.getX509CertificateChain(tlsCrypto, getPeerCertificateTLS())) == null || x509CertificateChain.length <= 0) {
            throw new SSLPeerUnverifiedException("No peer identity established");
        }
        return x509CertificateChain;
    }

    @Override // javax.net.ssl.SSLSession
    public String getPeerHost() {
        return this.peerHost;
    }

    @Override // javax.net.ssl.SSLSession
    public int getPeerPort() {
        return this.peerPort;
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getPeerPrincipal() {
        X500Principal subject;
        TlsCrypto tlsCrypto = this.tlsCrypto;
        if (tlsCrypto == null || (subject = JsseUtils.getSubject(tlsCrypto, getPeerCertificateTLS())) == null) {
            throw new SSLPeerUnverifiedException("No peer identity established");
        }
        return subject;
    }

    @Override // javax.net.ssl.SSLSession
    public String getProtocol() {
        return ProvSSLContextSpi.getProtocolVersionName(getProtocolTLS());
    }

    public abstract ProtocolVersion getProtocolTLS();

    @Override // javax.net.ssl.SSLSession
    public SSLSessionContext getSessionContext() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new SSLPermission("getSSLSessionContext"));
        }
        return this.sslSessionContext;
    }

    @Override // javax.net.ssl.SSLSession
    public Object getValue(String str) {
        return this.valueMap.get(str);
    }

    @Override // javax.net.ssl.SSLSession
    public String[] getValueNames() {
        String[] strArr;
        synchronized (this.valueMap) {
            strArr = (String[]) this.valueMap.keySet().toArray(new String[this.valueMap.size()]);
        }
        return strArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getIDArray());
    }

    @Override // javax.net.ssl.SSLSession
    public synchronized void invalidate() {
        ProvSSLSessionContext provSSLSessionContext = this.sslSessionContext;
        if (provSSLSessionContext != null) {
            provSSLSessionContext.removeSession(getIDArray());
            this.sslSessionContext = null;
            this.invalidated = true;
        }
    }

    @Override // javax.net.ssl.SSLSession
    public synchronized boolean isValid() {
        boolean z10;
        byte[] iDArray = getIDArray();
        if (iDArray != null && iDArray.length > 0) {
            z10 = this.invalidated ? false : true;
        }
        return z10;
    }

    public void notifyBound(String str, Object obj) {
        if (obj instanceof SSLSessionBindingListener) {
            new SessionBindingListenerAdapter((SSLSessionBindingListener) obj).valueBound(new SSLSessionBindingEvent(this, str));
        }
    }

    public void notifyUnbound(String str, Object obj) {
        if (obj instanceof SSLSessionBindingListener) {
            new SessionBindingListenerAdapter((SSLSessionBindingListener) obj).valueUnbound(new SSLSessionBindingEvent(this, str));
        }
    }

    @Override // javax.net.ssl.SSLSession
    public void putValue(String str, Object obj) {
        notifyUnbound(str, this.valueMap.put(str, obj));
        notifyBound(str, obj);
    }

    @Override // javax.net.ssl.SSLSession
    public void removeValue(String str) {
        notifyUnbound(str, this.valueMap.remove(str));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Session(");
        sb2.append(getCreationTime());
        sb2.append("|");
        return a.n(sb2, getCipherSuite(), ")");
    }
}
