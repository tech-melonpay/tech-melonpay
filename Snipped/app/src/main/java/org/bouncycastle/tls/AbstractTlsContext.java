package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsNonceGenerator;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Times;

/* loaded from: classes3.dex */
abstract class AbstractTlsContext implements TlsContext {
    private static long counter = Times.nanoTime();
    private int connectionEnd;
    private TlsCrypto crypto;
    private TlsNonceGenerator nonceGenerator;
    private SecurityParameters securityParametersHandshake = null;
    private SecurityParameters securityParametersConnection = null;
    private ProtocolVersion[] clientSupportedVersions = null;
    private ProtocolVersion clientVersion = null;
    private TlsSession session = null;
    private Object userObject = null;

    public AbstractTlsContext(TlsCrypto tlsCrypto, int i) {
        this.crypto = tlsCrypto;
        this.connectionEnd = i;
        this.nonceGenerator = createNonceGenerator(tlsCrypto, i);
    }

    private static TlsNonceGenerator createNonceGenerator(TlsCrypto tlsCrypto, int i) {
        byte[] bArr = new byte[16];
        Pack.longToBigEndian(nextCounterValue(), bArr, 0);
        Pack.longToBigEndian(Times.nanoTime(), bArr, 8);
        bArr[0] = (byte) i;
        return tlsCrypto.createNonceGenerator(bArr);
    }

    private static synchronized long nextCounterValue() {
        long j10;
        synchronized (AbstractTlsContext.class) {
            j10 = counter + 1;
            counter = j10;
        }
        return j10;
    }

    @Override // org.bouncycastle.tls.TlsContext
    public byte[] exportChannelBinding(int i) {
        SecurityParameters securityParametersConnection = getSecurityParametersConnection();
        if (securityParametersConnection == null) {
            throw new IllegalStateException("Export of channel bindings unavailable before handshake completion");
        }
        if (i != 0) {
            if (i == 1) {
                return Arrays.clone(securityParametersConnection.getTLSUnique());
            }
            throw new UnsupportedOperationException();
        }
        byte[] tLSServerEndPoint = securityParametersConnection.getTLSServerEndPoint();
        if (tLSServerEndPoint.length < 1) {
            return null;
        }
        return Arrays.clone(tLSServerEndPoint);
    }

    @Override // org.bouncycastle.tls.TlsContext
    public byte[] exportEarlyKeyingMaterial(String str, byte[] bArr, int i) {
        if (bArr == null || TlsUtils.isValidUint16(bArr.length)) {
            return exportKeyingMaterial13(null, str, bArr, i);
        }
        throw new IllegalArgumentException("'context_value' must have length less than 2^16 (or be null)");
    }

    @Override // org.bouncycastle.tls.TlsContext
    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i) {
        SecurityParameters securityParametersConnection = getSecurityParametersConnection();
        if (securityParametersConnection == null) {
            throw new IllegalStateException("Export of key material unavailable before handshake completion");
        }
        if (!securityParametersConnection.isExtendedMasterSecret()) {
            throw new IllegalStateException("cannot export keying material without extended_master_secret");
        }
        if (TlsUtils.isTLSv13(securityParametersConnection.getNegotiatedVersion())) {
            return exportKeyingMaterial13(null, str, bArr, i);
        }
        return TlsUtils.PRF(securityParametersConnection, securityParametersConnection.getMasterSecret(), str, TlsUtils.calculateExporterSeed(securityParametersConnection, bArr), i).extract();
    }

    public byte[] exportKeyingMaterial13(TlsSecret tlsSecret, String str, byte[] bArr, int i) {
        if (bArr == null) {
            byte[] bArr2 = TlsUtils.EMPTY_BYTES;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.bouncycastle.tls.TlsContext
    public ProtocolVersion[] getClientSupportedVersions() {
        return this.clientSupportedVersions;
    }

    @Override // org.bouncycastle.tls.TlsContext
    public ProtocolVersion getClientVersion() {
        return this.clientVersion;
    }

    @Override // org.bouncycastle.tls.TlsContext
    public TlsCrypto getCrypto() {
        return this.crypto;
    }

    @Override // org.bouncycastle.tls.TlsContext
    public TlsNonceGenerator getNonceGenerator() {
        return this.nonceGenerator;
    }

    @Override // org.bouncycastle.tls.TlsContext
    public TlsSession getResumableSession() {
        TlsSession session = getSession();
        if (session == null || !session.isResumable()) {
            return null;
        }
        return session;
    }

    @Override // org.bouncycastle.tls.TlsContext
    public synchronized SecurityParameters getSecurityParameters() {
        SecurityParameters securityParameters;
        securityParameters = this.securityParametersHandshake;
        if (securityParameters == null) {
            securityParameters = this.securityParametersConnection;
        }
        return securityParameters;
    }

    @Override // org.bouncycastle.tls.TlsContext
    public synchronized SecurityParameters getSecurityParametersConnection() {
        return this.securityParametersConnection;
    }

    @Override // org.bouncycastle.tls.TlsContext
    public synchronized SecurityParameters getSecurityParametersHandshake() {
        return this.securityParametersHandshake;
    }

    @Override // org.bouncycastle.tls.TlsContext
    public ProtocolVersion getServerVersion() {
        return getSecurityParameters().getNegotiatedVersion();
    }

    @Override // org.bouncycastle.tls.TlsContext
    public TlsSession getSession() {
        return this.session;
    }

    @Override // org.bouncycastle.tls.TlsContext
    public Object getUserObject() {
        return this.userObject;
    }

    public synchronized void handshakeBeginning(TlsPeer tlsPeer) {
        try {
            if (this.securityParametersHandshake != null) {
                throw new TlsFatalAlert((short) 80);
            }
            SecurityParameters securityParameters = new SecurityParameters();
            this.securityParametersHandshake = securityParameters;
            securityParameters.entity = this.connectionEnd;
            SecurityParameters securityParameters2 = this.securityParametersConnection;
            if (securityParameters2 != null) {
                securityParameters.renegotiating = true;
                securityParameters.secureRenegotiation = securityParameters2.isSecureRenegotiation();
                this.securityParametersHandshake.negotiatedVersion = this.securityParametersConnection.getNegotiatedVersion();
            }
            tlsPeer.notifyHandshakeBeginning();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void handshakeComplete(TlsPeer tlsPeer, TlsSession tlsSession) {
        SecurityParameters securityParameters = this.securityParametersHandshake;
        if (securityParameters == null) {
            throw new TlsFatalAlert((short) 80);
        }
        this.session = tlsSession;
        this.securityParametersConnection = securityParameters;
        tlsPeer.notifyHandshakeComplete();
        this.securityParametersHandshake = null;
    }

    public void setClientSupportedVersions(ProtocolVersion[] protocolVersionArr) {
        this.clientSupportedVersions = protocolVersionArr;
    }

    public void setClientVersion(ProtocolVersion protocolVersion) {
        this.clientVersion = protocolVersion;
    }

    @Override // org.bouncycastle.tls.TlsContext
    public void setUserObject(Object obj) {
        this.userObject = obj;
    }
}
