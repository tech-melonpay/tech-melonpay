package org.jmrtd.lds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;

/* loaded from: classes3.dex */
public abstract class AbstractTaggedLDSFile extends AbstractLDSFile {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -4761360877353069639L;
    private int length;
    private int tag;

    public AbstractTaggedLDSFile(int i) {
        this.tag = i;
    }

    private byte[] getContent() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                writeContent(byteArrayOutputStream);
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e10) {
                    LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e10);
                }
            }
        } catch (IOException e11) {
            throw new IllegalStateException("Could not get DG content", e11);
        }
    }

    @Override // org.jmrtd.lds.AbstractLDSFile, org.jmrtd.lds.LDSElement
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    @Override // org.jmrtd.lds.LDSFile
    public int getLength() {
        if (this.length <= 0) {
            this.length = getContent().length;
        }
        return this.length;
    }

    public int getTag() {
        return this.tag;
    }

    public abstract void readContent(InputStream inputStream);

    @Override // org.jmrtd.lds.AbstractLDSFile
    public void readObject(InputStream inputStream) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int readTag = tLVInputStream.readTag();
        if (readTag == this.tag) {
            this.length = tLVInputStream.readLength();
            readContent(tLVInputStream);
        } else {
            throw new IllegalArgumentException("Was expecting tag " + Integer.toHexString(this.tag) + ", found " + Integer.toHexString(readTag));
        }
    }

    public String toString() {
        return "TaggedLDSFile [" + Integer.toHexString(getTag()) + " (" + getLength() + ")]";
    }

    public abstract void writeContent(OutputStream outputStream);

    @Override // org.jmrtd.lds.AbstractLDSFile
    public void writeObject(OutputStream outputStream) {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        int tag = getTag();
        if (this.tag != tag) {
            this.tag = tag;
        }
        tLVOutputStream.writeTag(tag);
        byte[] content = getContent();
        int length = content == null ? 0 : content.length;
        if (this.length != length) {
            this.length = length;
        }
        tLVOutputStream.writeValue(content);
    }

    public AbstractTaggedLDSFile(int i, InputStream inputStream) {
        this.tag = i;
        readObject(inputStream);
    }
}
