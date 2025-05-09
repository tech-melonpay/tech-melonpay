package org.bouncycastle.tls;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
public class HeartbeatMessage {
    protected byte[] padding;
    protected byte[] payload;
    protected short type;

    public static class PayloadBuffer extends ByteArrayOutputStream {
        public byte[] getPadding(int i) {
            return TlsUtils.copyOfRangeExact(((ByteArrayOutputStream) this).buf, i, ((ByteArrayOutputStream) this).count);
        }

        public byte[] getPayload(int i) {
            if (i > ((ByteArrayOutputStream) this).count - 16) {
                return null;
            }
            return Arrays.copyOf(((ByteArrayOutputStream) this).buf, i);
        }
    }

    public HeartbeatMessage(short s10, byte[] bArr, byte[] bArr2) {
        if (!HeartbeatMessageType.isValid(s10)) {
            throw new IllegalArgumentException("'type' is not a valid HeartbeatMessageType value");
        }
        if (bArr == null || bArr.length >= 65536) {
            throw new IllegalArgumentException("'payload' must have length < 2^16");
        }
        if (bArr2 == null || bArr2.length < 16) {
            throw new IllegalArgumentException("'padding' must have length >= 16");
        }
        this.type = s10;
        this.payload = bArr;
        this.padding = bArr2;
    }

    public static HeartbeatMessage create(TlsContext tlsContext, short s10, byte[] bArr) {
        return create(tlsContext, s10, bArr, 16);
    }

    public static HeartbeatMessage parse(InputStream inputStream) {
        short readUint8 = TlsUtils.readUint8(inputStream);
        if (!HeartbeatMessageType.isValid(readUint8)) {
            throw new TlsFatalAlert((short) 47);
        }
        int readUint16 = TlsUtils.readUint16(inputStream);
        PayloadBuffer payloadBuffer = new PayloadBuffer();
        Streams.pipeAll(inputStream, payloadBuffer);
        byte[] payload = payloadBuffer.getPayload(readUint16);
        if (payload == null) {
            return null;
        }
        return new HeartbeatMessage(readUint8, payload, payloadBuffer.getPadding(readUint16));
    }

    public void encode(OutputStream outputStream) {
        TlsUtils.writeUint8(this.type, outputStream);
        TlsUtils.checkUint16(this.payload.length);
        TlsUtils.writeUint16(this.payload.length, outputStream);
        outputStream.write(this.payload);
        outputStream.write(this.padding);
    }

    public int getPaddingLength() {
        return this.padding.length;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public short getType() {
        return this.type;
    }

    public static HeartbeatMessage create(TlsContext tlsContext, short s10, byte[] bArr, int i) {
        return new HeartbeatMessage(s10, bArr, tlsContext.getNonceGenerator().generateNonce(i));
    }
}
