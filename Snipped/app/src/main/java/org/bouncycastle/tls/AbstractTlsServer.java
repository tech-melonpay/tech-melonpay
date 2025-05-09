package org.bouncycastle.tls;

import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;

/* loaded from: classes3.dex */
public abstract class AbstractTlsServer extends AbstractTlsPeer implements TlsServer {
    protected CertificateStatusRequest certificateStatusRequest;
    protected int[] cipherSuites;
    protected Hashtable clientExtensions;
    protected Vector clientProtocolNames;
    protected boolean clientSentECPointFormats;
    protected TlsServerContext context;
    protected boolean encryptThenMACOffered;
    protected short maxFragmentLengthOffered;
    protected int[] offeredCipherSuites;
    protected ProtocolVersion[] protocolVersions;
    protected int selectedCipherSuite;
    protected ProtocolName selectedProtocolName;
    protected Hashtable serverExtensions;
    protected boolean truncatedHMacOffered;

    public AbstractTlsServer(TlsCrypto tlsCrypto) {
        super(tlsCrypto);
    }

    public boolean allowCertificateStatus() {
        return true;
    }

    public boolean allowEncryptThenMAC() {
        return true;
    }

    public boolean allowTruncatedHMac() {
        return false;
    }

    public Hashtable checkServerExtensions() {
        Hashtable ensureExtensionsInitialised = TlsExtensionsUtils.ensureExtensionsInitialised(this.serverExtensions);
        this.serverExtensions = ensureExtensionsInitialised;
        return ensureExtensionsInitialised;
    }

    public CertificateRequest getCertificateRequest() {
        return null;
    }

    @Override // org.bouncycastle.tls.TlsServer
    public CertificateStatus getCertificateStatus() {
        return null;
    }

    @Override // org.bouncycastle.tls.TlsPeer
    public int[] getCipherSuites() {
        return this.cipherSuites;
    }

    @Override // org.bouncycastle.tls.TlsServer
    public TlsDHConfig getDHConfig() {
        return TlsDHUtils.createNamedDHConfig(this.context, selectDH(TlsDHUtils.getMinimumFiniteFieldBits(this.selectedCipherSuite)));
    }

    @Override // org.bouncycastle.tls.TlsServer
    public TlsECConfig getECDHConfig() {
        return TlsECCUtils.createNamedECConfig(this.context, selectECDH(TlsECCUtils.getMinimumCurveBits(this.selectedCipherSuite)));
    }

    public int getMaximumNegotiableCurveBits() {
        int[] clientSupportedGroups = this.context.getSecurityParametersHandshake().getClientSupportedGroups();
        if (clientSupportedGroups == null) {
            return NamedGroup.getMaximumCurveBits();
        }
        int i = 0;
        for (int i9 : clientSupportedGroups) {
            i = Math.max(i, NamedGroup.getCurveBits(i9));
        }
        return i;
    }

    public int getMaximumNegotiableFiniteFieldBits() {
        int[] clientSupportedGroups = this.context.getSecurityParametersHandshake().getClientSupportedGroups();
        if (clientSupportedGroups == null) {
            return NamedGroup.getMaximumFiniteFieldBits();
        }
        int i = 0;
        for (int i9 : clientSupportedGroups) {
            i = Math.max(i, NamedGroup.getFiniteFieldBits(i9));
        }
        return i;
    }

    @Override // org.bouncycastle.tls.TlsServer
    public NewSessionTicket getNewSessionTicket() {
        return new NewSessionTicket(0L, TlsUtils.EMPTY_BYTES);
    }

    @Override // org.bouncycastle.tls.TlsServer
    public TlsPSKIdentityManager getPSKIdentityManager() {
        return null;
    }

    public Vector getProtocolNames() {
        return null;
    }

    @Override // org.bouncycastle.tls.TlsPeer
    public ProtocolVersion[] getProtocolVersions() {
        return this.protocolVersions;
    }

    @Override // org.bouncycastle.tls.TlsServer
    public TlsSRPLoginParameters getSRPLoginParameters() {
        return null;
    }

    public int getSelectedCipherSuite() {
        Vector usableSignatureAlgorithms = TlsUtils.getUsableSignatureAlgorithms(this.context.getSecurityParametersHandshake().getClientSigAlgs());
        int maximumNegotiableCurveBits = getMaximumNegotiableCurveBits();
        int maximumNegotiableFiniteFieldBits = getMaximumNegotiableFiniteFieldBits();
        for (int i : TlsUtils.getCommonCipherSuites(this.offeredCipherSuites, getCipherSuites(), preferLocalCipherSuites())) {
            if (isSelectableCipherSuite(i, maximumNegotiableCurveBits, maximumNegotiableFiniteFieldBits, usableSignatureAlgorithms) && selectCipherSuite(i)) {
                return i;
            }
        }
        throw new TlsFatalAlert((short) 40);
    }

    public Hashtable getServerExtensions() {
        Vector vector;
        if (!shouldSelectProtocolNameEarly() && (vector = this.clientProtocolNames) != null && !vector.isEmpty()) {
            this.selectedProtocolName = selectProtocolName();
        }
        if (this.selectedProtocolName != null) {
            TlsExtensionsUtils.addALPNExtensionServer(checkServerExtensions(), this.selectedProtocolName);
        }
        if (this.encryptThenMACOffered && allowEncryptThenMAC() && TlsUtils.isBlockCipherSuite(this.selectedCipherSuite)) {
            TlsExtensionsUtils.addEncryptThenMACExtension(checkServerExtensions());
        }
        short s10 = this.maxFragmentLengthOffered;
        if (s10 >= 0 && MaxFragmentLength.isValid(s10)) {
            TlsExtensionsUtils.addMaxFragmentLengthExtension(checkServerExtensions(), this.maxFragmentLengthOffered);
        }
        if (this.truncatedHMacOffered && allowTruncatedHMac()) {
            TlsExtensionsUtils.addTruncatedHMacExtension(checkServerExtensions());
        }
        if (this.clientSentECPointFormats && TlsECCUtils.isECCCipherSuite(this.selectedCipherSuite)) {
            TlsExtensionsUtils.addSupportedPointFormatsExtension(checkServerExtensions(), new short[]{0});
        }
        if (this.certificateStatusRequest != null && allowCertificateStatus()) {
            checkServerExtensions().put(TlsExtensionsUtils.EXT_status_request, TlsExtensionsUtils.createEmptyExtensionData());
        }
        return this.serverExtensions;
    }

    @Override // org.bouncycastle.tls.TlsServer
    public Vector getServerSupplementalData() {
        return null;
    }

    public ProtocolVersion getServerVersion() {
        ProtocolVersion[] protocolVersions = getProtocolVersions();
        for (ProtocolVersion protocolVersion : this.context.getClientSupportedVersions()) {
            if (ProtocolVersion.contains(protocolVersions, protocolVersion)) {
                return protocolVersion;
            }
        }
        throw new TlsFatalAlert((short) 70);
    }

    public TlsSession getSessionToResume(byte[] bArr) {
        return null;
    }

    @Override // org.bouncycastle.tls.TlsServer
    public void init(TlsServerContext tlsServerContext) {
        this.context = tlsServerContext;
        this.protocolVersions = getSupportedVersions();
        this.cipherSuites = getSupportedCipherSuites();
    }

    public boolean isSelectableCipherSuite(int i, int i9, int i10, Vector vector) {
        return TlsUtils.isValidCipherSuiteForVersion(i, this.context.getServerVersion()) && i9 >= TlsECCUtils.getMinimumCurveBits(i) && i10 >= TlsDHUtils.getMinimumFiniteFieldBits(i) && TlsUtils.isValidCipherSuiteForSignatureAlgorithms(i, vector);
    }

    public void notifyClientCertificate(Certificate certificate) {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.tls.TlsServer
    public void notifyFallback(boolean z10) {
        ProtocolVersion latestDTLS;
        if (z10) {
            ProtocolVersion[] protocolVersions = getProtocolVersions();
            ProtocolVersion clientVersion = this.context.getClientVersion();
            if (clientVersion.isTLS()) {
                latestDTLS = ProtocolVersion.getLatestTLS(protocolVersions);
            } else {
                if (!clientVersion.isDTLS()) {
                    throw new TlsFatalAlert((short) 80);
                }
                latestDTLS = ProtocolVersion.getLatestDTLS(protocolVersions);
            }
            if (latestDTLS != null && latestDTLS.isLaterVersionOf(clientVersion)) {
                throw new TlsFatalAlert((short) 86);
            }
        }
    }

    @Override // org.bouncycastle.tls.AbstractTlsPeer, org.bouncycastle.tls.TlsPeer
    public void notifyHandshakeBeginning() {
        super.notifyHandshakeBeginning();
        this.offeredCipherSuites = null;
        this.clientExtensions = null;
        this.encryptThenMACOffered = false;
        this.maxFragmentLengthOffered = (short) 0;
        this.truncatedHMacOffered = false;
        this.clientSentECPointFormats = false;
        this.certificateStatusRequest = null;
        this.selectedCipherSuite = -1;
        this.selectedProtocolName = null;
        this.serverExtensions = null;
    }

    @Override // org.bouncycastle.tls.TlsServer
    public void notifyOfferedCipherSuites(int[] iArr) {
        this.offeredCipherSuites = iArr;
    }

    public boolean preferLocalCipherSuites() {
        return false;
    }

    public void processClientExtensions(Hashtable hashtable) {
        Vector vector;
        this.clientExtensions = hashtable;
        if (hashtable != null) {
            this.clientProtocolNames = TlsExtensionsUtils.getALPNExtensionClient(hashtable);
            if (shouldSelectProtocolNameEarly() && (vector = this.clientProtocolNames) != null && !vector.isEmpty()) {
                this.selectedProtocolName = selectProtocolName();
            }
            this.encryptThenMACOffered = TlsExtensionsUtils.hasEncryptThenMACExtension(hashtable);
            short maxFragmentLengthExtension = TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable);
            this.maxFragmentLengthOffered = maxFragmentLengthExtension;
            if (maxFragmentLengthExtension >= 0 && !MaxFragmentLength.isValid(maxFragmentLengthExtension)) {
                throw new TlsFatalAlert((short) 47);
            }
            this.truncatedHMacOffered = TlsExtensionsUtils.hasTruncatedHMacExtension(hashtable);
            this.clientSentECPointFormats = TlsExtensionsUtils.getSupportedPointFormatsExtension(hashtable) != null;
            this.certificateStatusRequest = TlsExtensionsUtils.getStatusRequestExtension(hashtable);
        }
    }

    @Override // org.bouncycastle.tls.TlsServer
    public void processClientSupplementalData(Vector vector) {
        if (vector != null) {
            throw new TlsFatalAlert((short) 10);
        }
    }

    public boolean selectCipherSuite(int i) {
        this.selectedCipherSuite = i;
        return true;
    }

    public int selectDH(int i) {
        int[] clientSupportedGroups = this.context.getSecurityParametersHandshake().getClientSupportedGroups();
        if (clientSupportedGroups == null) {
            return selectDHDefault(i);
        }
        for (int i9 : clientSupportedGroups) {
            if (NamedGroup.getFiniteFieldBits(i9) >= i) {
                return i9;
            }
        }
        return -1;
    }

    public int selectDHDefault(int i) {
        if (i <= 2048) {
            return 256;
        }
        if (i <= 3072) {
            return NamedGroup.ffdhe3072;
        }
        if (i <= 4096) {
            return NamedGroup.ffdhe4096;
        }
        if (i <= 6144) {
            return NamedGroup.ffdhe6144;
        }
        if (i <= 8192) {
            return NamedGroup.ffdhe8192;
        }
        return -1;
    }

    public int selectECDH(int i) {
        int[] clientSupportedGroups = this.context.getSecurityParametersHandshake().getClientSupportedGroups();
        if (clientSupportedGroups == null) {
            return selectECDHDefault(i);
        }
        for (int i9 : clientSupportedGroups) {
            if (NamedGroup.getCurveBits(i9) >= i) {
                return i9;
            }
        }
        return -1;
    }

    public int selectECDHDefault(int i) {
        if (i <= 256) {
            return 23;
        }
        if (i <= 384) {
            return 24;
        }
        return i <= 521 ? 25 : -1;
    }

    public ProtocolName selectProtocolName() {
        Vector protocolNames = getProtocolNames();
        if (protocolNames == null || protocolNames.isEmpty()) {
            return null;
        }
        ProtocolName selectProtocolName = selectProtocolName(this.clientProtocolNames, protocolNames);
        if (selectProtocolName != null) {
            return selectProtocolName;
        }
        throw new TlsFatalAlert(AlertDescription.no_application_protocol);
    }

    public boolean shouldSelectProtocolNameEarly() {
        return true;
    }

    public ProtocolName selectProtocolName(Vector vector, Vector vector2) {
        for (int i = 0; i < vector2.size(); i++) {
            ProtocolName protocolName = (ProtocolName) vector2.elementAt(i);
            if (vector.contains(protocolName)) {
                return protocolName;
            }
        }
        return null;
    }

    @Override // org.bouncycastle.tls.TlsServer
    public void notifyClientVersion(ProtocolVersion protocolVersion) {
    }
}
