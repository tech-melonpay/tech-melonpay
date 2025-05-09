package net.sf.scuba.tlv;

import java.io.DataOutputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class TLVOutputStream extends OutputStream {
    private DataOutputStream outputStream;
    private TLVOutputState state;

    public TLVOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        this.state = new TLVOutputState();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.state.canBeWritten()) {
            throw new IllegalStateException("Cannot close stream yet, illegal TLV state.");
        }
        this.outputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.outputStream.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public void writeLength(int i) {
        byte[] lengthAsBytes = TLVUtil.getLengthAsBytes(i);
        this.state.setLengthProcessed(i);
        if (this.state.canBeWritten()) {
            this.outputStream.write(lengthAsBytes);
        }
    }

    public void writeTag(int i) {
        byte[] tagAsBytes = TLVUtil.getTagAsBytes(i);
        if (this.state.canBeWritten()) {
            this.outputStream.write(tagAsBytes);
        }
        this.state.setTagProcessed(i);
    }

    public void writeValue(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot write null.");
        }
        if (this.state.isAtStartOfTag()) {
            throw new IllegalStateException("Cannot write value bytes yet. Need to write a tag first.");
        }
        if (this.state.isAtStartOfLength()) {
            writeLength(bArr.length);
            write(bArr);
        } else {
            write(bArr);
            this.state.updatePreviousLength(bArr.length);
        }
    }

    public void writeValueEnd() {
        if (this.state.isAtStartOfLength()) {
            throw new IllegalStateException("Not processing value yet.");
        }
        if (!this.state.isAtStartOfTag() || this.state.isDummyLengthSet()) {
            byte[] value = this.state.getValue();
            int length = value.length;
            this.state.updatePreviousLength(length);
            if (this.state.canBeWritten()) {
                this.outputStream.write(TLVUtil.getLengthAsBytes(length));
                this.outputStream.write(value);
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i9) {
        if (!this.state.isAtStartOfTag()) {
            if (this.state.isAtStartOfLength()) {
                this.state.setDummyLengthProcessed();
            }
            this.state.updateValueBytesProcessed(bArr, i, i9);
            if (this.state.canBeWritten()) {
                this.outputStream.write(bArr, i, i9);
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot write value bytes yet. Need to write a tag first.");
    }
}
