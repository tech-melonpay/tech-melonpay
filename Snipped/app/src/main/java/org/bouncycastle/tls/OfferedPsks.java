package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

/* loaded from: classes3.dex */
public class OfferedPsks {
    protected Vector binders;
    protected Vector identities;

    public OfferedPsks(Vector vector, Vector vector2) {
        if (vector == null || vector.isEmpty()) {
            throw new IllegalArgumentException("'identities' cannot be null or empty");
        }
        if (vector2 == null || vector.size() != vector2.size()) {
            throw new IllegalArgumentException("'binders' must be non-null and the same length as 'identities'");
        }
        this.identities = vector;
        this.binders = vector2;
    }

    public static OfferedPsks parse(InputStream inputStream) {
        Vector vector = new Vector();
        int readUint16 = TlsUtils.readUint16(inputStream);
        if (readUint16 < 7) {
            throw new TlsFatalAlert((short) 50);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(TlsUtils.readFully(readUint16, inputStream));
        do {
            vector.add(PskIdentity.parse(byteArrayInputStream));
        } while (byteArrayInputStream.available() > 0);
        Vector vector2 = new Vector();
        int readUint162 = TlsUtils.readUint16(inputStream);
        if (readUint162 < 33) {
            throw new TlsFatalAlert((short) 50);
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(TlsUtils.readFully(readUint162, inputStream));
        do {
            vector2.add(TlsUtils.readOpaque8(inputStream, 32));
        } while (byteArrayInputStream2.available() > 0);
        return new OfferedPsks(vector, vector2);
    }

    public void encode(OutputStream outputStream) {
        int i = 0;
        for (int i9 = 0; i9 < this.identities.size(); i9++) {
            i += ((PskIdentity) this.identities.elementAt(i9)).getIdentity().length + 6;
        }
        TlsUtils.checkUint16(i);
        TlsUtils.writeUint16(i, outputStream);
        for (int i10 = 0; i10 < this.identities.size(); i10++) {
            ((PskIdentity) this.identities.elementAt(i10)).encode(outputStream);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.binders.size(); i12++) {
            i11 += ((byte[]) this.binders.elementAt(i12)).length + 1;
        }
        TlsUtils.checkUint16(i11);
        TlsUtils.writeUint16(i11, outputStream);
        for (int i13 = 0; i13 < this.binders.size(); i13++) {
            TlsUtils.writeOpaque8((byte[]) this.binders.elementAt(i13), outputStream);
        }
    }

    public Vector getBinders() {
        return this.binders;
    }

    public Vector getIdentities() {
        return this.identities;
    }
}
