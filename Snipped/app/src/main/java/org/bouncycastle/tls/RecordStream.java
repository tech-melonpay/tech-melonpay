package org.bouncycastle.tls;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsNullNullCipher;

/* loaded from: classes3.dex */
class RecordStream {
    private static int DEFAULT_PLAINTEXT_LIMIT = 16384;
    private int ciphertextLimit;
    private TlsProtocol handler;
    private InputStream input;
    private final Record inputRecord;
    private OutputStream output;
    private int plaintextLimit;
    private SequenceNumber readSeqNo;
    private SequenceNumber writeSeqNo;
    private TlsContext context = null;
    private TlsCipher pendingCipher = null;
    private TlsCipher readCipher = null;
    private TlsCipher writeCipher = null;
    private TlsHandshakeHash handshakeHash = null;
    private SimpleOutputStream handshakeHashUpdater = new SimpleOutputStream() { // from class: org.bouncycastle.tls.RecordStream.1
        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i9) {
            RecordStream.this.handshakeHash.update(bArr, i, i9);
        }
    };
    private ProtocolVersion writeVersion = null;

    public static class Record {
        volatile byte[] buf;
        private final byte[] header;
        volatile int pos;

        private Record() {
            byte[] bArr = new byte[5];
            this.header = bArr;
            this.buf = bArr;
            this.pos = 0;
        }

        private void resize(int i) {
            if (this.buf.length < i) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.buf, 0, bArr, 0, this.pos);
                this.buf = bArr;
            }
        }

        public void fillTo(InputStream inputStream, int i) {
            while (this.pos < i) {
                try {
                    int read = inputStream.read(this.buf, this.pos, i - this.pos);
                    if (read < 0) {
                        return;
                    } else {
                        this.pos += read;
                    }
                } catch (InterruptedIOException e10) {
                    this.pos += e10.bytesTransferred;
                    e10.bytesTransferred = 0;
                    throw e10;
                }
            }
        }

        public void readFragment(InputStream inputStream, int i) {
            int i9 = i + 5;
            resize(i9);
            fillTo(inputStream, i9);
            if (this.pos < i9) {
                throw new EOFException();
            }
        }

        public boolean readHeader(InputStream inputStream) {
            fillTo(inputStream, 5);
            if (this.pos == 0) {
                return false;
            }
            if (this.pos >= 5) {
                return true;
            }
            throw new EOFException();
        }

        public void reset() {
            this.buf = this.header;
            this.pos = 0;
        }
    }

    public static class SequenceNumber {
        private boolean exhausted;
        private long value;

        private SequenceNumber() {
            this.value = 0L;
            this.exhausted = false;
        }

        public synchronized long nextValue(short s10) {
            long j10;
            if (this.exhausted) {
                throw new TlsFatalAlert(s10);
            }
            j10 = this.value;
            long j11 = 1 + j10;
            this.value = j11;
            if (j11 == 0) {
                this.exhausted = true;
            }
            return j10;
        }
    }

    public RecordStream(TlsProtocol tlsProtocol, InputStream inputStream, OutputStream outputStream) {
        this.inputRecord = new Record();
        this.readSeqNo = new SequenceNumber();
        this.writeSeqNo = new SequenceNumber();
        this.handler = tlsProtocol;
        this.input = inputStream;
        this.output = outputStream;
    }

    private static void checkLength(int i, int i9, short s10) {
        if (i > i9) {
            throw new TlsFatalAlert(s10);
        }
    }

    private static void checkType(short s10, short s11) {
        switch (s10) {
            case 20:
            case 21:
            case 22:
            case 23:
                return;
            default:
                throw new TlsFatalAlert(s11);
        }
    }

    public void close() {
        this.inputRecord.reset();
        try {
            this.input.close();
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        try {
            this.output.close();
        } catch (IOException e11) {
            if (e == null) {
                e = e11;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    public byte[] decodeAndVerify(short s10, byte[] bArr, int i, int i9) {
        byte[] decodeCiphertext = this.readCipher.decodeCiphertext(this.readSeqNo.nextValue((short) 10), s10, bArr, i, i9);
        checkLength(decodeCiphertext.length, this.plaintextLimit, (short) 22);
        if (decodeCiphertext.length >= 1 || s10 == 23) {
            return decodeCiphertext;
        }
        throw new TlsFatalAlert((short) 47);
    }

    public void finaliseHandshake() {
        TlsCipher tlsCipher = this.readCipher;
        TlsCipher tlsCipher2 = this.pendingCipher;
        if (tlsCipher != tlsCipher2 || this.writeCipher != tlsCipher2) {
            throw new TlsFatalAlert((short) 40);
        }
        this.pendingCipher = null;
        this.handshakeHash = new DeferredHash(this.context);
    }

    public void flush() {
        this.output.flush();
    }

    public TlsHandshakeHash getHandshakeHash() {
        return this.handshakeHash;
    }

    public OutputStream getHandshakeHashUpdater() {
        return this.handshakeHashUpdater;
    }

    public int getPlaintextLimit() {
        return this.plaintextLimit;
    }

    public void init(TlsContext tlsContext) {
        this.context = tlsContext;
        TlsNullNullCipher tlsNullNullCipher = new TlsNullNullCipher();
        this.readCipher = tlsNullNullCipher;
        this.writeCipher = tlsNullNullCipher;
        this.handshakeHash = new DeferredHash(tlsContext);
        setPlaintextLimit(DEFAULT_PLAINTEXT_LIMIT);
    }

    public void notifyHelloComplete() {
        this.handshakeHash = this.handshakeHash.notifyPRFDetermined();
    }

    public TlsHandshakeHash prepareToFinish() {
        TlsHandshakeHash tlsHandshakeHash = this.handshakeHash;
        this.handshakeHash = tlsHandshakeHash.stopTracking();
        return tlsHandshakeHash;
    }

    public RecordPreview previewOutputRecord(int i) {
        int max = Math.max(0, Math.min(getPlaintextLimit(), i));
        return new RecordPreview(this.writeCipher.getCiphertextLimit(max) + 5, max);
    }

    public RecordPreview previewRecordHeader(byte[] bArr, boolean z10) {
        short readUint8 = TlsUtils.readUint8(bArr, 0);
        if (!z10 && readUint8 == 23) {
            throw new TlsFatalAlert((short) 10);
        }
        checkType(readUint8, (short) 10);
        int readUint16 = TlsUtils.readUint16(bArr, 3);
        checkLength(readUint16, this.ciphertextLimit, (short) 22);
        return new RecordPreview(readUint16 + 5, readUint8 == 23 ? Math.min(getPlaintextLimit(), this.readCipher.getPlaintextLimit(readUint16)) : 0);
    }

    public boolean readFullRecord(byte[] bArr, int i, int i9) {
        if (i9 < 5) {
            return false;
        }
        int readUint16 = TlsUtils.readUint16(bArr, i + 3);
        if (i9 != readUint16 + 5) {
            return false;
        }
        short readUint8 = TlsUtils.readUint8(bArr, i);
        checkType(readUint8, (short) 10);
        checkLength(readUint16, this.ciphertextLimit, (short) 22);
        byte[] decodeAndVerify = decodeAndVerify(readUint8, bArr, i + 5, readUint16);
        this.handler.processRecord(readUint8, decodeAndVerify, 0, decodeAndVerify.length);
        return true;
    }

    public boolean readRecord() {
        if (!this.inputRecord.readHeader(this.input)) {
            return false;
        }
        short readUint8 = TlsUtils.readUint8(this.inputRecord.buf, 0);
        checkType(readUint8, (short) 10);
        int readUint16 = TlsUtils.readUint16(this.inputRecord.buf, 3);
        checkLength(readUint16, this.ciphertextLimit, (short) 22);
        this.inputRecord.readFragment(this.input, readUint16);
        try {
            byte[] decodeAndVerify = decodeAndVerify(readUint8, this.inputRecord.buf, 5, readUint16);
            this.inputRecord.reset();
            this.handler.processRecord(readUint8, decodeAndVerify, 0, decodeAndVerify.length);
            return true;
        } catch (Throwable th) {
            this.inputRecord.reset();
            throw th;
        }
    }

    public void receivedReadCipherSpec() {
        TlsCipher tlsCipher = this.pendingCipher;
        if (tlsCipher == null) {
            throw new TlsFatalAlert((short) 40);
        }
        this.readCipher = tlsCipher;
        this.readSeqNo = new SequenceNumber();
    }

    public void sentWriteCipherSpec() {
        TlsCipher tlsCipher = this.pendingCipher;
        if (tlsCipher == null) {
            throw new TlsFatalAlert((short) 40);
        }
        this.writeCipher = tlsCipher;
        this.writeSeqNo = new SequenceNumber();
    }

    public void setPendingConnectionState(TlsCipher tlsCipher) {
        this.pendingCipher = tlsCipher;
    }

    public void setPlaintextLimit(int i) {
        this.plaintextLimit = i;
        this.ciphertextLimit = i + 1024;
    }

    public void setWriteVersion(ProtocolVersion protocolVersion) {
        this.writeVersion = protocolVersion;
    }

    public void writeRecord(short s10, byte[] bArr, int i, int i9) {
        if (this.writeVersion == null) {
            return;
        }
        checkType(s10, (short) 80);
        checkLength(i9, this.plaintextLimit, (short) 80);
        if (i9 < 1 && s10 != 23) {
            throw new TlsFatalAlert((short) 80);
        }
        byte[] encodePlaintext = this.writeCipher.encodePlaintext(this.writeSeqNo.nextValue((short) 80), s10, bArr, i, i9);
        checkLength(encodePlaintext.length, this.ciphertextLimit, (short) 80);
        byte[] bArr2 = new byte[encodePlaintext.length + 5];
        TlsUtils.writeUint8(s10, bArr2, 0);
        TlsUtils.writeVersion(this.writeVersion, bArr2, 1);
        TlsUtils.writeUint16(encodePlaintext.length, bArr2, 3);
        System.arraycopy(encodePlaintext, 0, bArr2, 5, encodePlaintext.length);
        try {
            this.output.write(bArr2);
            this.output.flush();
        } catch (InterruptedIOException e10) {
            throw new TlsFatalAlert((short) 80, e10);
        }
    }
}
