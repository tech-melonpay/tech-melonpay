package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.TeeInputStream;

/* loaded from: classes3.dex */
public class ClientHello {
    private final int[] cipherSuites;
    private final ProtocolVersion clientVersion;
    private final byte[] cookie;
    private final Hashtable extensions;
    private final byte[] random;
    private final byte[] sessionID;

    public ClientHello(ProtocolVersion protocolVersion, byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr, Hashtable hashtable) {
        this.clientVersion = protocolVersion;
        this.random = bArr;
        this.sessionID = bArr2;
        this.cookie = bArr3;
        this.cipherSuites = iArr;
        this.extensions = hashtable;
    }

    private static ClientHello implParse(ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) {
        byte[] bArr;
        Hashtable hashtable;
        InputStream teeInputStream = outputStream != null ? new TeeInputStream(byteArrayInputStream, outputStream) : byteArrayInputStream;
        ProtocolVersion readVersion = TlsUtils.readVersion(teeInputStream);
        byte[] readFully = TlsUtils.readFully(32, teeInputStream);
        byte[] readOpaque8 = TlsUtils.readOpaque8(teeInputStream, 0, 32);
        if (outputStream != null) {
            bArr = TlsUtils.readOpaque8(byteArrayInputStream, 0, ProtocolVersion.DTLSv12.isEqualOrEarlierVersionOf(readVersion) ? 255 : 32);
        } else {
            bArr = null;
        }
        int readUint16 = TlsUtils.readUint16(teeInputStream);
        if (readUint16 < 2 || (readUint16 & 1) != 0 || byteArrayInputStream.available() < readUint16) {
            throw new TlsFatalAlert((short) 50);
        }
        int[] readUint16Array = TlsUtils.readUint16Array(readUint16 / 2, teeInputStream);
        short readUint8 = TlsUtils.readUint8(teeInputStream);
        if (readUint8 < 1) {
            throw new TlsFatalAlert((short) 47);
        }
        if (!Arrays.contains(TlsUtils.readUint8Array(readUint8, teeInputStream), (short) 0)) {
            throw new TlsFatalAlert((short) 40);
        }
        if (byteArrayInputStream.available() > 0) {
            byte[] readOpaque16 = TlsUtils.readOpaque16(teeInputStream);
            TlsProtocol.assertEmpty(byteArrayInputStream);
            hashtable = TlsProtocol.readExtensionsData(readOpaque16);
        } else {
            hashtable = null;
        }
        return new ClientHello(readVersion, readFully, readOpaque8, bArr, readUint16Array, hashtable);
    }

    public static ClientHello parse(ByteArrayInputStream byteArrayInputStream, OutputStream outputStream) {
        try {
            return implParse(byteArrayInputStream, outputStream);
        } catch (TlsFatalAlert e10) {
            throw e10;
        } catch (IOException e11) {
            throw new TlsFatalAlert((short) 50, e11);
        }
    }

    public void encode(TlsContext tlsContext, OutputStream outputStream) {
        TlsUtils.writeVersion(this.clientVersion, outputStream);
        outputStream.write(this.random);
        TlsUtils.writeOpaque8(this.sessionID, outputStream);
        byte[] bArr = this.cookie;
        if (bArr != null) {
            TlsUtils.writeOpaque8(bArr, outputStream);
        }
        TlsUtils.writeUint16ArrayWithUint16Length(this.cipherSuites, outputStream);
        TlsUtils.writeUint8ArrayWithUint8Length(new short[]{0}, outputStream);
        TlsProtocol.writeExtensions(outputStream, this.extensions);
    }

    public int[] getCipherSuites() {
        return this.cipherSuites;
    }

    public ProtocolVersion getClientVersion() {
        return this.clientVersion;
    }

    public byte[] getCookie() {
        return this.cookie;
    }

    public Hashtable getExtensions() {
        return this.extensions;
    }

    public byte[] getRandom() {
        return this.random;
    }

    public byte[] getSessionID() {
        return this.sessionID;
    }
}
