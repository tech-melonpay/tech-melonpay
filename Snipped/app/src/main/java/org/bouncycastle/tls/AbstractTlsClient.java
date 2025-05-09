package org.bouncycastle.tls;

import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public abstract class AbstractTlsClient extends AbstractTlsPeer implements TlsClient {
    protected int[] cipherSuites;
    protected TlsClientContext context;
    protected ProtocolVersion[] protocolVersions;
    protected Vector supportedGroups;
    protected Vector supportedSignatureAlgorithms;

    public AbstractTlsClient(TlsCrypto tlsCrypto) {
        super(tlsCrypto);
    }

    public boolean allowUnexpectedServerExtension(Integer num, byte[] bArr) {
        int intValue = num.intValue();
        if (intValue == 10) {
            TlsExtensionsUtils.readSupportedGroupsExtension(bArr);
            return true;
        }
        if (intValue != 11) {
            return false;
        }
        TlsExtensionsUtils.readSupportedPointFormatsExtension(bArr);
        return true;
    }

    public void checkForUnexpectedServerExtension(Hashtable hashtable, Integer num) {
        byte[] extensionData = TlsUtils.getExtensionData(hashtable, num);
        if (extensionData != null && !allowUnexpectedServerExtension(num, extensionData)) {
            throw new TlsFatalAlert((short) 47);
        }
    }

    public CertificateStatusRequest getCertificateStatusRequest() {
        return new CertificateStatusRequest((short) 1, new OCSPStatusRequest(null, null));
    }

    @Override // org.bouncycastle.tls.TlsPeer
    public int[] getCipherSuites() {
        return this.cipherSuites;
    }

    @Override // org.bouncycastle.tls.TlsClient
    public Hashtable getClientExtensions() {
        boolean z10;
        Hashtable hashtable = new Hashtable();
        ProtocolVersion[] protocolVersions = getProtocolVersions();
        int i = 0;
        while (true) {
            if (i >= protocolVersions.length) {
                z10 = false;
                break;
            }
            if (!TlsUtils.isTLSv13(protocolVersions[i])) {
                z10 = true;
                break;
            }
            i++;
        }
        if (z10) {
            TlsExtensionsUtils.addEncryptThenMACExtension(hashtable);
        }
        Vector protocolNames = getProtocolNames();
        if (protocolNames != null) {
            TlsExtensionsUtils.addALPNExtensionClient(hashtable, protocolNames);
        }
        Vector sNIServerNames = getSNIServerNames();
        if (sNIServerNames != null) {
            TlsExtensionsUtils.addServerNameExtensionClient(hashtable, sNIServerNames);
        }
        CertificateStatusRequest certificateStatusRequest = getCertificateStatusRequest();
        if (certificateStatusRequest != null) {
            TlsExtensionsUtils.addStatusRequestExtension(hashtable, certificateStatusRequest);
        }
        if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(this.context.getClientVersion())) {
            Vector supportedSignatureAlgorithms = getSupportedSignatureAlgorithms();
            this.supportedSignatureAlgorithms = supportedSignatureAlgorithms;
            TlsExtensionsUtils.addSignatureAlgorithmsExtension(hashtable, supportedSignatureAlgorithms);
        }
        Vector namedGroupRoles = getNamedGroupRoles();
        Vector supportedGroups = getSupportedGroups(namedGroupRoles);
        if (supportedGroups != null && !supportedGroups.isEmpty()) {
            this.supportedGroups = supportedGroups;
            TlsExtensionsUtils.addSupportedGroupsExtension(hashtable, supportedGroups);
        }
        if (z10 && (namedGroupRoles.contains(Integers.valueOf(2)) || namedGroupRoles.contains(Integers.valueOf(3)))) {
            TlsExtensionsUtils.addSupportedPointFormatsExtension(hashtable, new short[]{0});
        }
        return hashtable;
    }

    @Override // org.bouncycastle.tls.TlsClient
    public Vector getClientSupplementalData() {
        return null;
    }

    public TlsDHGroupVerifier getDHGroupVerifier() {
        return new DefaultTlsDHGroupVerifier();
    }

    @Override // org.bouncycastle.tls.TlsClient
    public Vector getEarlyKeyShareGroups() {
        Vector vector = this.supportedGroups;
        if (vector == null) {
            return null;
        }
        int i = 29;
        if (!vector.contains(Integers.valueOf(29))) {
            i = 23;
            if (!this.supportedGroups.contains(Integers.valueOf(23))) {
                return null;
            }
        }
        return TlsUtils.vectorOfOne(Integers.valueOf(i));
    }

    public Vector getNamedGroupRoles() {
        Vector namedGroupRoles = TlsUtils.getNamedGroupRoles(getCipherSuites());
        Vector vector = this.supportedSignatureAlgorithms;
        if (vector == null || TlsUtils.containsAnySignatureAlgorithm(vector, (short) 3)) {
            TlsUtils.addToSet(namedGroupRoles, 3);
        }
        return namedGroupRoles;
    }

    @Override // org.bouncycastle.tls.TlsClient
    public TlsPSKIdentity getPSKIdentity() {
        return null;
    }

    public Vector getProtocolNames() {
        return null;
    }

    @Override // org.bouncycastle.tls.TlsPeer
    public ProtocolVersion[] getProtocolVersions() {
        return this.protocolVersions;
    }

    public Vector getSNIServerNames() {
        return null;
    }

    @Override // org.bouncycastle.tls.TlsClient
    public TlsSRPConfigVerifier getSRPConfigVerifier() {
        return new DefaultTlsSRPConfigVerifier();
    }

    @Override // org.bouncycastle.tls.TlsClient
    public TlsSRPIdentity getSRPIdentity() {
        return null;
    }

    public TlsSession getSessionToResume() {
        return null;
    }

    public Vector getSupportedGroups(Vector vector) {
        TlsCrypto crypto = getCrypto();
        Vector vector2 = new Vector();
        if (vector.contains(Integers.valueOf(2))) {
            TlsUtils.addIfSupported(vector2, crypto, 29);
        }
        if (vector.contains(Integers.valueOf(2)) || vector.contains(Integers.valueOf(3))) {
            TlsUtils.addIfSupported(vector2, crypto, new int[]{23, 24});
        }
        if (vector.contains(Integers.valueOf(1))) {
            TlsUtils.addIfSupported(vector2, crypto, new int[]{256, NamedGroup.ffdhe3072, NamedGroup.ffdhe4096});
        }
        return vector2;
    }

    public Vector getSupportedSignatureAlgorithms() {
        return TlsUtils.getDefaultSupportedSignatureAlgorithms(this.context);
    }

    @Override // org.bouncycastle.tls.TlsClient
    public void init(TlsClientContext tlsClientContext) {
        this.context = tlsClientContext;
        this.protocolVersions = getSupportedVersions();
        this.cipherSuites = getSupportedCipherSuites();
    }

    @Override // org.bouncycastle.tls.TlsClient
    public boolean isFallback() {
        return false;
    }

    @Override // org.bouncycastle.tls.AbstractTlsPeer, org.bouncycastle.tls.TlsPeer
    public void notifyHandshakeBeginning() {
        super.notifyHandshakeBeginning();
        this.supportedGroups = null;
        this.supportedSignatureAlgorithms = null;
    }

    @Override // org.bouncycastle.tls.TlsClient
    public void processServerExtensions(Hashtable hashtable) {
        if (hashtable != null) {
            checkForUnexpectedServerExtension(hashtable, TlsUtils.EXT_signature_algorithms);
            checkForUnexpectedServerExtension(hashtable, TlsUtils.EXT_signature_algorithms_cert);
            checkForUnexpectedServerExtension(hashtable, TlsExtensionsUtils.EXT_supported_groups);
            if (TlsECCUtils.isECCCipherSuite(this.context.getSecurityParametersHandshake().getCipherSuite())) {
                TlsExtensionsUtils.getSupportedPointFormatsExtension(hashtable);
            } else {
                checkForUnexpectedServerExtension(hashtable, TlsExtensionsUtils.EXT_ec_point_formats);
            }
            checkForUnexpectedServerExtension(hashtable, TlsExtensionsUtils.EXT_padding);
        }
    }

    @Override // org.bouncycastle.tls.TlsClient
    public void processServerSupplementalData(Vector vector) {
        if (vector != null) {
            throw new TlsFatalAlert((short) 10);
        }
    }

    @Override // org.bouncycastle.tls.TlsClient
    public void notifyNewSessionTicket(NewSessionTicket newSessionTicket) {
    }

    public void notifySelectedCipherSuite(int i) {
    }

    public void notifyServerVersion(ProtocolVersion protocolVersion) {
    }

    public void notifySessionID(byte[] bArr) {
    }
}
