package org.jmrtd.lds;

import androidx.camera.core.impl.utils.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jmrtd.io.SplittableInputStream;

/* loaded from: classes3.dex */
public abstract class AbstractImageInfo implements ImageInfo {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 2870092217269116309L;
    private int height;
    private byte[] imageBytes;
    private int imageLength;
    private int imagePositionInInputStream;
    private String mimeType;
    private transient SplittableInputStream splittableInputStream;
    private int type;
    private int width;

    public AbstractImageInfo() {
        this(-1, 0, 0, null);
    }

    private byte[] getImageBytes() {
        byte[] bArr = new byte[getImageLength()];
        new DataInputStream(getImageInputStream()).readFully(bArr);
        return bArr;
    }

    private static String typeToString(int i) {
        if (i == -1) {
            return "Unknown";
        }
        if (i == 0) {
            return "Portrait";
        }
        if (i == 1) {
            return "Signature or usual mark";
        }
        if (i == 2) {
            return "Finger";
        }
        if (i == 3) {
            return "Iris";
        }
        throw new NumberFormatException(a.g(i, new StringBuilder("Unknown type: ")));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r6 != r5) goto L8
            return r1
        L8:
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Exception -> L30
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.Exception -> L30
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L30
            if (r2 != 0) goto L17
            return r0
        L17:
            org.jmrtd.lds.AbstractImageInfo r6 = (org.jmrtd.lds.AbstractImageInfo) r6     // Catch: java.lang.Exception -> L30
            byte[] r2 = r5.getImageBytes()     // Catch: java.lang.Exception -> L30
            byte[] r3 = r6.getImageBytes()     // Catch: java.lang.Exception -> L30
            boolean r2 = java.util.Arrays.equals(r2, r3)     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L43
            java.lang.String r2 = r5.mimeType     // Catch: java.lang.Exception -> L30
            if (r2 != 0) goto L32
            java.lang.String r3 = r6.mimeType     // Catch: java.lang.Exception -> L30
            if (r3 == 0) goto L3c
            goto L32
        L30:
            r6 = move-exception
            goto L44
        L32:
            if (r2 == 0) goto L43
            java.lang.String r3 = r6.mimeType     // Catch: java.lang.Exception -> L30
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L43
        L3c:
            int r2 = r5.type     // Catch: java.lang.Exception -> L30
            int r6 = r6.type     // Catch: java.lang.Exception -> L30
            if (r2 != r6) goto L43
            r0 = r1
        L43:
            return r0
        L44:
            java.util.logging.Logger r1 = org.jmrtd.lds.AbstractImageInfo.LOGGER
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception"
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r1.log(r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.AbstractImageInfo.equals(java.lang.Object):boolean");
    }

    @Override // org.jmrtd.lds.LDSElement
    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            writeObject(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
            return null;
        }
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getHeight() {
        return this.height;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public InputStream getImageInputStream() {
        SplittableInputStream splittableInputStream = this.splittableInputStream;
        if (splittableInputStream != null) {
            return splittableInputStream.getInputStream(this.imagePositionInInputStream);
        }
        if (this.imageBytes != null) {
            return new ByteArrayInputStream(this.imageBytes);
        }
        throw new IllegalStateException("Both the byte buffer and the stream are null");
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getImageLength() {
        if (this.splittableInputStream != null) {
            return this.imageLength;
        }
        byte[] bArr = this.imageBytes;
        if (bArr != null) {
            return bArr.length;
        }
        throw new IllegalStateException("Cannot get length of null");
    }

    @Override // org.jmrtd.lds.ImageInfo
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getType() {
        return this.type;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i = (this.type * 5) - 591263623;
        String str = this.mimeType;
        return (getImageLength() * 7) + 11 + ((str == null ? 1337 : str.hashCode()) * 5) + 7 + i;
    }

    public void readImage(InputStream inputStream, long j10) {
        this.splittableInputStream = null;
        this.imageBytes = new byte[(int) j10];
        new DataInputStream(inputStream).readFully(this.imageBytes);
    }

    public abstract void readObject(InputStream inputStream);

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setImageBytes(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot set null image bytes");
        }
        try {
            readImage(new ByteArrayInputStream(bArr), bArr.length);
        } catch (IOException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
        }
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(" [type: ");
        sb2.append(typeToString(this.type) + ", ");
        sb2.append("size: ");
        sb2.append(getImageLength());
        sb2.append("]");
        return sb2.toString();
    }

    public void writeImage(OutputStream outputStream) {
        outputStream.write(getImageBytes());
    }

    public abstract void writeObject(OutputStream outputStream);

    public AbstractImageInfo(int i) {
        this(i, 0, 0, null);
    }

    public AbstractImageInfo(int i, String str) {
        this(i, 0, 0, str);
    }

    private AbstractImageInfo(int i, int i9, int i10, String str) {
        this.type = i;
        this.mimeType = str;
        this.width = i9;
        this.height = i10;
    }

    public AbstractImageInfo(int i, int i9, int i10, InputStream inputStream, long j10, String str) {
        this(i, i9, i10, str);
        readImage(inputStream, j10);
    }
}
