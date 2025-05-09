package net.sf.scuba.tlv;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class TLVInputStream extends InputStream {
    private static final Logger LOGGER = Logger.getLogger("net.sf.scuba.tlv");
    private static final int MAX_BUFFER_LENGTH = 65535;
    private int bufferSize;
    private DataInputStream inputStream;
    private TLVInputState markedState;
    private final InputStream originalInputStream;
    private TLVInputState state;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TLVInputStream(java.io.InputStream r5) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.bufferSize = r0
            boolean r0 = r5 instanceof java.io.BufferedInputStream     // Catch: java.io.IOException -> Lf
            if (r0 != 0) goto L11
            boolean r0 = r5 instanceof java.io.ByteArrayInputStream     // Catch: java.io.IOException -> Lf
            if (r0 == 0) goto L21
            goto L11
        Lf:
            r0 = move-exception
            goto L18
        L11:
            int r0 = r5.available()     // Catch: java.io.IOException -> Lf
            r4.bufferSize = r0     // Catch: java.io.IOException -> Lf
            goto L21
        L18:
            java.util.logging.Logger r1 = net.sf.scuba.tlv.TLVInputStream.LOGGER
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r3 = "Exception reading from stream"
            r1.log(r2, r3, r0)
        L21:
            r4.originalInputStream = r5
            boolean r0 = r5 instanceof java.io.DataInputStream
            if (r0 == 0) goto L2a
            java.io.DataInputStream r5 = (java.io.DataInputStream) r5
            goto L30
        L2a:
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r5)
            r5 = r0
        L30:
            r4.inputStream = r5
            net.sf.scuba.tlv.TLVInputState r5 = new net.sf.scuba.tlv.TLVInputState
            r5.<init>()
            r4.state = r5
            r5 = 0
            r4.markedState = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sf.scuba.tlv.TLVInputStream.<init>(java.io.InputStream):void");
    }

    private long skipValue() {
        if (this.state.isAtStartOfTag() || this.state.isAtStartOfLength()) {
            return 0L;
        }
        return skip(this.state.getValueBytesLeft());
    }

    @Override // java.io.InputStream
    public int available() {
        return this.inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inputStream.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.inputStream.mark(i);
        this.markedState = new TLVInputState(this.state);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.inputStream.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.inputStream.read();
        if (read < 0) {
            return -1;
        }
        this.state.updateValueBytesProcessed(1);
        return read;
    }

    public int readLength() {
        if (!this.state.isAtStartOfLength()) {
            throw new IllegalStateException("Not at start of length");
        }
        int readUnsignedByte = this.inputStream.readUnsignedByte();
        int i = 1;
        if ((readUnsignedByte & 128) != 0) {
            int i9 = readUnsignedByte & 127;
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < i9; i12++) {
                i11++;
                i10 = (i10 << 8) | this.inputStream.readUnsignedByte();
            }
            readUnsignedByte = i10;
            i = i11;
        }
        this.state.setLengthProcessed(readUnsignedByte, i);
        return readUnsignedByte;
    }

    public int readTag() {
        if (!this.state.isAtStartOfTag() && !this.state.isProcessingValue()) {
            throw new IllegalStateException("Not at start of tag");
        }
        int readUnsignedByte = this.inputStream.readUnsignedByte();
        int i = 1;
        while (true) {
            if (readUnsignedByte != 0 && readUnsignedByte != 255) {
                break;
            }
            readUnsignedByte = this.inputStream.readUnsignedByte();
            i++;
        }
        if ((readUnsignedByte & 31) == 31) {
            int readUnsignedByte2 = this.inputStream.readUnsignedByte();
            while (true) {
                i++;
                if ((readUnsignedByte2 & 128) != 128) {
                    break;
                }
                readUnsignedByte = (readUnsignedByte << 8) | (readUnsignedByte2 & 127);
                readUnsignedByte2 = this.inputStream.readUnsignedByte();
            }
            readUnsignedByte = (readUnsignedByte << 8) | (readUnsignedByte2 & 127);
        }
        this.state.setTagProcessed(readUnsignedByte, i);
        return readUnsignedByte;
    }

    public byte[] readValue() {
        if (!this.state.isProcessingValue()) {
            throw new IllegalStateException("Not yet processing value!");
        }
        int length = this.state.getLength();
        byte[] bArr = new byte[length];
        this.inputStream.readFully(bArr);
        this.state.updateValueBytesProcessed(length);
        return bArr;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        if (!markSupported()) {
            throw new IOException("mark/reset not supported");
        }
        this.inputStream.reset();
        this.state = this.markedState;
        this.markedState = null;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        long skip = this.inputStream.skip(j10);
        this.state.updateValueBytesProcessed((int) skip);
        return skip;
    }

    public void skipToTag(int i) {
        while (true) {
            if (!this.state.isAtStartOfTag()) {
                if (this.state.isAtStartOfLength()) {
                    readLength();
                    if (TLVUtil.isPrimitive(this.state.getTag())) {
                        skipValue();
                    }
                } else if (TLVUtil.isPrimitive(this.state.getTag())) {
                    skipValue();
                }
            }
            int readTag = readTag();
            if (readTag == i) {
                return;
            }
            if (TLVUtil.isPrimitive(readTag)) {
                if (((int) skipValue()) < readLength()) {
                    return;
                }
            }
        }
    }

    public String toString() {
        return this.state.toString();
    }
}
