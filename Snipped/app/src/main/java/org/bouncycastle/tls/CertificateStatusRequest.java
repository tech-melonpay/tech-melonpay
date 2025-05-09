package org.bouncycastle.tls;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class CertificateStatusRequest {
    protected Object request;
    protected short statusType;

    public CertificateStatusRequest(short s10, Object obj) {
        if (!isCorrectType(s10, obj)) {
            throw new IllegalArgumentException("'request' is not an instance of the correct type");
        }
        this.statusType = s10;
        this.request = obj;
    }

    public static boolean isCorrectType(short s10, Object obj) {
        if (s10 == 1) {
            return obj instanceof OCSPStatusRequest;
        }
        throw new IllegalArgumentException("'statusType' is an unsupported CertificateStatusType");
    }

    public static CertificateStatusRequest parse(InputStream inputStream) {
        short readUint8 = TlsUtils.readUint8(inputStream);
        if (readUint8 == 1) {
            return new CertificateStatusRequest(readUint8, OCSPStatusRequest.parse(inputStream));
        }
        throw new TlsFatalAlert((short) 50);
    }

    public void encode(OutputStream outputStream) {
        TlsUtils.writeUint8(this.statusType, outputStream);
        if (this.statusType != 1) {
            throw new TlsFatalAlert((short) 80);
        }
        ((OCSPStatusRequest) this.request).encode(outputStream);
    }

    public OCSPStatusRequest getOCSPStatusRequest() {
        if (isCorrectType((short) 1, this.request)) {
            return (OCSPStatusRequest) this.request;
        }
        throw new IllegalStateException("'request' is not an OCSPStatusRequest");
    }

    public Object getRequest() {
        return this.request;
    }

    public short getStatusType() {
        return this.statusType;
    }
}
