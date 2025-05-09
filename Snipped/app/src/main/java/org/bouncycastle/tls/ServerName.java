package org.bouncycastle.tls;

import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
public final class ServerName {
    private final byte[] nameData;
    private final short nameType;

    public ServerName(short s10, Object obj) {
        if (obj == null) {
            throw new NullPointerException("'name' cannot be null");
        }
        if (s10 != 0) {
            throw new IllegalArgumentException("'nameType' is an unsupported NameType");
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException("'name' is not an instance of a supported type");
        }
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray((String) obj);
        if (uTF8ByteArray.length < 1 || !TlsUtils.isValidUint16(uTF8ByteArray.length)) {
            throw new IllegalArgumentException("'name' must have length from 1 to 65535");
        }
        this.nameType = s10;
        this.nameData = uTF8ByteArray;
    }

    public static ServerName parse(InputStream inputStream) {
        return new ServerName(TlsUtils.readUint8(inputStream), TlsUtils.readOpaque16(inputStream, 1));
    }

    public void encode(OutputStream outputStream) {
        TlsUtils.writeUint8(this.nameType, outputStream);
        TlsUtils.writeOpaque16(this.nameData, outputStream);
    }

    public String getHostName() {
        if (this.nameType == 0) {
            return Strings.fromUTF8ByteArray(this.nameData);
        }
        throw new IllegalStateException("Not of type host_name");
    }

    public byte[] getNameData() {
        return this.nameData;
    }

    public short getNameType() {
        return this.nameType;
    }

    public ServerName(short s10, byte[] bArr) {
        if (!TlsUtils.isValidUint8(s10)) {
            throw new IllegalArgumentException("'nameType' must be from 0 to 255");
        }
        if (bArr == null) {
            throw new NullPointerException("'nameData' cannot be null");
        }
        if (bArr.length < 1 || !TlsUtils.isValidUint16(bArr.length)) {
            throw new IllegalArgumentException("'nameData' must have length from 1 to 65535");
        }
        this.nameType = s10;
        this.nameData = bArr;
    }
}
