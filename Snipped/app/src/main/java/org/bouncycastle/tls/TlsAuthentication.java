package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public interface TlsAuthentication {
    TlsCredentials getClientCredentials(CertificateRequest certificateRequest);

    void notifyServerCertificate(TlsServerCertificate tlsServerCertificate);
}
