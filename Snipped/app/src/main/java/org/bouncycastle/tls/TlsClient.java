package org.bouncycastle.tls;

import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes3.dex */
public interface TlsClient extends TlsPeer {
    TlsAuthentication getAuthentication();

    Hashtable getClientExtensions();

    Vector getClientSupplementalData();

    TlsDHGroupVerifier getDHGroupVerifier();

    Vector getEarlyKeyShareGroups();

    TlsPSKIdentity getPSKIdentity();

    TlsSRPConfigVerifier getSRPConfigVerifier();

    TlsSRPIdentity getSRPIdentity();

    TlsSession getSessionToResume();

    void init(TlsClientContext tlsClientContext);

    boolean isFallback();

    void notifyNewSessionTicket(NewSessionTicket newSessionTicket);

    void notifySelectedCipherSuite(int i);

    void notifyServerVersion(ProtocolVersion protocolVersion);

    void notifySessionID(byte[] bArr);

    void processServerExtensions(Hashtable hashtable);

    void processServerSupplementalData(Vector vector);
}
