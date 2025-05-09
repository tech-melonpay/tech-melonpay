package org.jmrtd.lds;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.jmrtd.cert.CVCPrincipal;

/* loaded from: classes3.dex */
public class CVCAFile extends AbstractLDSFile {
    public static final byte CAR_TAG = 66;
    public static final int LENGTH = 36;
    private static final long serialVersionUID = -1100904058684365703L;
    private String altCAReference;
    private String caReference;
    private short fid;

    public CVCAFile(InputStream inputStream) {
        this((short) 284, inputStream);
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        CVCAFile cVCAFile = (CVCAFile) obj;
        if (!this.caReference.equals(cVCAFile.caReference)) {
            return false;
        }
        String str = this.altCAReference;
        return (str == null && cVCAFile.altCAReference == null) || (str != null && str.equals(cVCAFile.altCAReference));
    }

    public CVCPrincipal getAltCAReference() {
        if (this.altCAReference == null) {
            return null;
        }
        return new CVCPrincipal(this.altCAReference);
    }

    public CVCPrincipal getCAReference() {
        if (this.caReference == null) {
            return null;
        }
        return new CVCPrincipal(this.caReference);
    }

    @Override // org.jmrtd.lds.AbstractLDSFile, org.jmrtd.lds.LDSElement
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public short getFID() {
        return this.fid;
    }

    @Override // org.jmrtd.lds.LDSFile
    public int getLength() {
        return 36;
    }

    public int hashCode() {
        int hashCode = this.caReference.hashCode() * 11;
        String str = this.altCAReference;
        return hashCode + (str != null ? str.hashCode() * 13 : 0) + 5;
    }

    @Override // org.jmrtd.lds.AbstractLDSFile
    public void readObject(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int read = dataInputStream.read();
        if (read != 66) {
            throw new IllegalArgumentException("Wrong tag, expected " + Integer.toHexString(66) + ", found " + Integer.toHexString(read));
        }
        int read2 = dataInputStream.read();
        if (read2 > 16) {
            throw new IllegalArgumentException("Wrong length");
        }
        byte[] bArr = new byte[read2];
        dataInputStream.readFully(bArr);
        this.caReference = new String(bArr);
        int read3 = dataInputStream.read();
        if (read3 != 0 && read3 != -1) {
            if (read3 != 66) {
                throw new IllegalArgumentException("Wrong tag");
            }
            int read4 = dataInputStream.read();
            if (read4 > 16) {
                throw new IllegalArgumentException("Wrong length");
            }
            byte[] bArr2 = new byte[read4];
            dataInputStream.readFully(bArr2);
            this.altCAReference = new String(bArr2);
            read3 = dataInputStream.read();
        }
        while (read3 != -1) {
            if (read3 != 0) {
                throw new IllegalArgumentException("Bad file padding");
            }
            read3 = dataInputStream.read();
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("CA reference: \"");
        sb2.append(this.caReference);
        sb2.append("\"");
        if (this.altCAReference != null) {
            str = ", Alternative CA reference: " + this.altCAReference;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // org.jmrtd.lds.AbstractLDSFile
    public void writeObject(OutputStream outputStream) {
        byte[] bArr = new byte[36];
        bArr[0] = CAR_TAG;
        bArr[1] = (byte) this.caReference.length();
        System.arraycopy(this.caReference.getBytes(), 0, bArr, 2, bArr[1]);
        String str = this.altCAReference;
        if (str != null) {
            byte b9 = bArr[1];
            bArr[b9 + 2] = CAR_TAG;
            int i = b9 + 3;
            bArr[i] = (byte) str.length();
            System.arraycopy(this.altCAReference.getBytes(), 0, bArr, b9 + 4, bArr[i]);
        }
        outputStream.write(bArr);
    }

    public CVCAFile(short s10, InputStream inputStream) {
        this.caReference = null;
        this.altCAReference = null;
        this.fid = s10;
        readObject(inputStream);
    }

    public CVCAFile(String str, String str2) {
        this((short) 284, str, str2);
    }

    public CVCAFile(short s10, String str, String str2) {
        this.caReference = null;
        this.altCAReference = null;
        if (str != null && str.length() <= 16 && (str2 == null || str2.length() <= 16)) {
            this.fid = s10;
            this.caReference = str;
            this.altCAReference = str2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public CVCAFile(short s10, String str) {
        this(s10, str, null);
    }
}
