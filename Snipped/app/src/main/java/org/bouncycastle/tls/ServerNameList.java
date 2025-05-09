package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
public class ServerNameList {
    protected Vector serverNameList;

    public ServerNameList(Vector vector) {
        if (vector == null) {
            throw new NullPointerException("'serverNameList' cannot be null");
        }
        this.serverNameList = vector;
    }

    private static short[] checkNameType(short[] sArr, short s10) {
        if (Arrays.contains(sArr, s10)) {
            return null;
        }
        return Arrays.append(sArr, s10);
    }

    public static ServerNameList parse(InputStream inputStream) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(TlsUtils.readOpaque16(inputStream, 1));
        short[] sArr = TlsUtils.EMPTY_SHORTS;
        Vector vector = new Vector();
        while (byteArrayInputStream.available() > 0) {
            ServerName parse = ServerName.parse(byteArrayInputStream);
            sArr = checkNameType(sArr, parse.getNameType());
            if (sArr == null) {
                throw new TlsFatalAlert((short) 47);
            }
            vector.addElement(parse);
        }
        return new ServerNameList(vector);
    }

    public void encode(OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        short[] sArr = TlsUtils.EMPTY_SHORTS;
        for (int i = 0; i < this.serverNameList.size(); i++) {
            ServerName serverName = (ServerName) this.serverNameList.elementAt(i);
            sArr = checkNameType(sArr, serverName.getNameType());
            if (sArr == null) {
                throw new TlsFatalAlert((short) 80);
            }
            serverName.encode(byteArrayOutputStream);
        }
        TlsUtils.checkUint16(byteArrayOutputStream.size());
        TlsUtils.writeUint16(byteArrayOutputStream.size(), outputStream);
        Streams.writeBufTo(byteArrayOutputStream, outputStream);
    }

    public Vector getServerNameList() {
        return this.serverNameList;
    }
}
