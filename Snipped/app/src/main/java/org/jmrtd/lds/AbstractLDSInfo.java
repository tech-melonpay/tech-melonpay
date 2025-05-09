package org.jmrtd.lds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class AbstractLDSInfo implements LDSElement {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -2340098256249194537L;

    @Override // org.jmrtd.lds.LDSElement
    public byte[] getEncoded() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeObject(byteArrayOutputStream);
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            LOGGER.log(Level.WARNING, "Exception: ", (Throwable) e10);
            return null;
        }
    }

    public abstract void writeObject(OutputStream outputStream);
}
