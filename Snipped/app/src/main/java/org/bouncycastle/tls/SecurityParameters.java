package org.bouncycastle.tls;

import java.util.Vector;
import org.bouncycastle.tls.crypto.TlsSecret;

/* loaded from: classes3.dex */
public class SecurityParameters {
    int entity = -1;
    boolean renegotiating = false;
    boolean secureRenegotiation = false;
    int cipherSuite = 0;
    final short compressionAlgorithm = 0;
    short maxFragmentLength = -1;
    int prfAlgorithm = -1;
    int verifyDataLength = -1;
    TlsSecret masterSecret = null;
    byte[] clientRandom = null;
    byte[] serverRandom = null;
    byte[] sessionHash = null;
    byte[] sessionID = null;
    byte[] pskIdentity = null;
    byte[] srpIdentity = null;
    byte[] tlsServerEndPoint = null;
    byte[] tlsUnique = null;
    boolean encryptThenMAC = false;
    boolean extendedMasterSecret = false;
    boolean extendedPadding = false;
    boolean truncatedHMac = false;
    ProtocolName applicationProtocol = null;
    boolean applicationProtocolSet = false;
    Vector clientServerNames = null;
    Vector clientSigAlgs = null;
    Vector clientSigAlgsCert = null;
    int[] clientSupportedGroups = null;
    int keyExchangeAlgorithm = -1;
    Certificate localCertificate = null;
    Certificate peerCertificate = null;
    ProtocolVersion negotiatedVersion = null;
    byte[] localVerifyData = null;
    byte[] peerVerifyData = null;

    public void clear() {
        this.sessionHash = null;
        this.sessionID = null;
        this.clientServerNames = null;
        this.clientSigAlgs = null;
        this.clientSigAlgsCert = null;
        this.clientSupportedGroups = null;
        TlsSecret tlsSecret = this.masterSecret;
        if (tlsSecret != null) {
            tlsSecret.destroy();
            this.masterSecret = null;
        }
    }

    public ProtocolName getApplicationProtocol() {
        return this.applicationProtocol;
    }

    public int getCipherSuite() {
        return this.cipherSuite;
    }

    public byte[] getClientRandom() {
        return this.clientRandom;
    }

    public Vector getClientServerNames() {
        return this.clientServerNames;
    }

    public Vector getClientSigAlgs() {
        return this.clientSigAlgs;
    }

    public Vector getClientSigAlgsCert() {
        return this.clientSigAlgsCert;
    }

    public int[] getClientSupportedGroups() {
        return this.clientSupportedGroups;
    }

    public short getCompressionAlgorithm() {
        return (short) 0;
    }

    public int getEntity() {
        return this.entity;
    }

    public int getKeyExchangeAlgorithm() {
        return this.keyExchangeAlgorithm;
    }

    public Certificate getLocalCertificate() {
        return this.localCertificate;
    }

    public byte[] getLocalVerifyData() {
        return this.localVerifyData;
    }

    public TlsSecret getMasterSecret() {
        return this.masterSecret;
    }

    public short getMaxFragmentLength() {
        return this.maxFragmentLength;
    }

    public ProtocolVersion getNegotiatedVersion() {
        return this.negotiatedVersion;
    }

    public byte[] getPSKIdentity() {
        return this.pskIdentity;
    }

    public Certificate getPeerCertificate() {
        return this.peerCertificate;
    }

    public byte[] getPeerVerifyData() {
        return this.peerVerifyData;
    }

    public int getPrfAlgorithm() {
        return this.prfAlgorithm;
    }

    public byte[] getPskIdentity() {
        return this.pskIdentity;
    }

    public byte[] getSRPIdentity() {
        return this.srpIdentity;
    }

    public byte[] getServerRandom() {
        return this.serverRandom;
    }

    public byte[] getSessionHash() {
        return this.sessionHash;
    }

    public byte[] getSessionID() {
        return this.sessionID;
    }

    public byte[] getTLSServerEndPoint() {
        return this.tlsServerEndPoint;
    }

    public byte[] getTLSUnique() {
        return this.tlsUnique;
    }

    public int getVerifyDataLength() {
        return this.verifyDataLength;
    }

    public boolean isApplicationProtocolSet() {
        return this.applicationProtocolSet;
    }

    public boolean isEncryptThenMAC() {
        return this.encryptThenMAC;
    }

    public boolean isExtendedMasterSecret() {
        return this.extendedMasterSecret;
    }

    public boolean isExtendedPadding() {
        return this.extendedPadding;
    }

    public boolean isRenegotiating() {
        return this.renegotiating;
    }

    public boolean isSecureRenegotiation() {
        return this.secureRenegotiation;
    }

    public boolean isTruncatedHMac() {
        return this.truncatedHMac;
    }
}
