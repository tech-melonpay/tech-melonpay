package org.bouncycastle.tls;

import java.io.OutputStream;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsSecret;

/* loaded from: classes3.dex */
public abstract class TlsRSAUtils {
    private TlsRSAUtils() {
    }

    public static TlsSecret generateEncryptedPreMasterSecret(TlsContext tlsContext, TlsCertificate tlsCertificate, OutputStream outputStream) {
        TlsSecret generateRSAPreMasterSecret = tlsContext.getCrypto().generateRSAPreMasterSecret(tlsContext.getClientVersion());
        TlsUtils.writeOpaque16(generateRSAPreMasterSecret.encrypt(tlsCertificate), outputStream);
        return generateRSAPreMasterSecret;
    }
}
