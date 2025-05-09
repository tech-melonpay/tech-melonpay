package org.bouncycastle.tls;

import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;

/* loaded from: classes3.dex */
public interface TlsServer extends TlsPeer {
    CertificateRequest getCertificateRequest();

    CertificateStatus getCertificateStatus();

    TlsCredentials getCredentials();

    TlsDHConfig getDHConfig();

    TlsECConfig getECDHConfig();

    NewSessionTicket getNewSessionTicket();

    TlsPSKIdentityManager getPSKIdentityManager();

    TlsSRPLoginParameters getSRPLoginParameters();

    int getSelectedCipherSuite();

    Hashtable getServerExtensions();

    Vector getServerSupplementalData();

    ProtocolVersion getServerVersion();

    TlsSession getSessionToResume(byte[] bArr);

    void init(TlsServerContext tlsServerContext);

    void notifyClientCertificate(Certificate certificate);

    void notifyClientVersion(ProtocolVersion protocolVersion);

    void notifyFallback(boolean z10);

    void notifyOfferedCipherSuites(int[] iArr);

    void processClientExtensions(Hashtable hashtable);

    void processClientSupplementalData(Vector vector);
}
