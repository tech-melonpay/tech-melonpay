package org.bouncycastle.tls;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class PskIdentity {
    protected byte[] identity;
    protected long obfuscatedTicketAge;

    public PskIdentity(byte[] bArr, long j10) {
        if (bArr == null) {
            throw new IllegalArgumentException("'identity' cannot be null");
        }
        if (bArr.length < 1 || !TlsUtils.isValidUint16(bArr.length)) {
            throw new IllegalArgumentException("'identity' should have length from 1 to 65535");
        }
        if (!TlsUtils.isValidUint32(j10)) {
            throw new IllegalArgumentException("'obfuscatedTicketAge' should be a uint32");
        }
        this.identity = bArr;
        this.obfuscatedTicketAge = j10;
    }

    public static PskIdentity parse(InputStream inputStream) {
        return new PskIdentity(TlsUtils.readOpaque16(inputStream, 1), TlsUtils.readUint32(inputStream));
    }

    public void encode(OutputStream outputStream) {
        TlsUtils.writeOpaque16(this.identity, outputStream);
        TlsUtils.writeUint32(this.obfuscatedTicketAge, outputStream);
    }

    public byte[] getIdentity() {
        return this.identity;
    }

    public long getObfuscatedTicketAge() {
        return this.obfuscatedTicketAge;
    }
}
