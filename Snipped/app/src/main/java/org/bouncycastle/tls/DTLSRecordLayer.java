package org.bouncycastle.tls;

import java.io.ByteArrayOutputStream;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsNullNullCipher;

/* loaded from: classes3.dex */
class DTLSRecordLayer implements DatagramTransport {
    private static final int MAX_FRAGMENT_LENGTH = 16384;
    private static final int RECORD_HEADER_LENGTH = 13;
    private static final long RETRANSMIT_TIMEOUT = 240000;
    private static final long TCP_MSL = 120000;
    private final TlsContext context;
    private DTLSEpoch currentEpoch;
    private volatile boolean inConnection;
    private final TlsPeer peer;
    private DTLSEpoch pendingEpoch;
    private volatile int plaintextLimit;
    private DTLSEpoch readEpoch;
    private final DatagramTransport transport;
    private DTLSEpoch writeEpoch;
    private final ByteQueue recordQueue = new ByteQueue();
    private final Object writeLock = new Object();
    private volatile boolean closed = false;
    private volatile boolean failed = false;
    private volatile ProtocolVersion readVersion = null;
    private volatile ProtocolVersion writeVersion = null;
    private DTLSHandshakeRetransmit retransmit = null;
    private DTLSEpoch retransmitEpoch = null;
    private Timeout retransmitTimeout = null;
    private TlsHeartbeat heartbeat = null;
    private boolean heartBeatResponder = false;
    private HeartbeatMessage heartbeatInFlight = null;
    private Timeout heartbeatTimeout = null;
    private int heartbeatResendMillis = -1;
    private Timeout heartbeatResendTimeout = null;
    private volatile boolean inHandshake = true;

    public DTLSRecordLayer(TlsContext tlsContext, TlsPeer tlsPeer, DatagramTransport datagramTransport) {
        this.context = tlsContext;
        this.peer = tlsPeer;
        this.transport = datagramTransport;
        DTLSEpoch dTLSEpoch = new DTLSEpoch(0, new TlsNullNullCipher());
        this.currentEpoch = dTLSEpoch;
        this.pendingEpoch = null;
        this.readEpoch = dTLSEpoch;
        this.writeEpoch = dTLSEpoch;
        setPlaintextLimit(16384);
    }

    private void closeTransport() {
        if (this.closed) {
            return;
        }
        try {
            if (!this.failed) {
                warn((short) 0, null);
            }
            this.transport.close();
        } catch (Exception unused) {
        }
        this.closed = true;
    }

    private static long getMacSequenceNumber(int i, long j10) {
        return ((i & BodyPartID.bodyIdMax) << 48) | j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int processRecord(int r18, byte[] r19, byte[] r20, int r21) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tls.DTLSRecordLayer.processRecord(int, byte[], byte[], int):int");
    }

    private void raiseAlert(short s10, short s11, String str, Throwable th) {
        this.peer.notifyAlertRaised(s10, s11, str, th);
        sendRecord((short) 21, new byte[]{(byte) s10, (byte) s11}, 0, 2);
    }

    public static byte[] receiveClientHelloRecord(byte[] bArr, int i, int i9) {
        if (i9 < 13 || 22 != TlsUtils.readUint8(bArr, i)) {
            return null;
        }
        if (!ProtocolVersion.DTLSv10.isEqualOrEarlierVersionOf(TlsUtils.readVersion(bArr, i + 1)) || TlsUtils.readUint16(bArr, i + 3) != 0) {
            return null;
        }
        int readUint16 = TlsUtils.readUint16(bArr, i + 11);
        if (i9 < readUint16 + 13 || readUint16 > 16384) {
            return null;
        }
        int i10 = i + 13;
        return TlsUtils.copyOfRangeExact(bArr, i10, readUint16 + i10);
    }

    private int receiveDatagram(byte[] bArr, int i, int i9, int i10) {
        try {
            return this.transport.receive(bArr, i, i9, i10);
        } catch (SocketTimeoutException unused) {
            return -1;
        } catch (InterruptedIOException e10) {
            e10.bytesTransferred = 0;
            throw e10;
        }
    }

    private int receiveRecord(byte[] bArr, int i, int i9, int i10) {
        int i11;
        if (this.recordQueue.available() > 0) {
            if (this.recordQueue.available() >= 13) {
                byte[] bArr2 = new byte[2];
                this.recordQueue.read(bArr2, 0, 2, 11);
                i11 = TlsUtils.readUint16(bArr2, 0);
            } else {
                i11 = 0;
            }
            int min = Math.min(this.recordQueue.available(), i11 + 13);
            this.recordQueue.removeData(bArr, i, min, 0);
            return min;
        }
        int receiveDatagram = receiveDatagram(bArr, i, i9, i10);
        if (receiveDatagram < 13) {
            return receiveDatagram;
        }
        this.inConnection = true;
        int readUint16 = TlsUtils.readUint16(bArr, i + 11) + 13;
        if (receiveDatagram <= readUint16) {
            return receiveDatagram;
        }
        this.recordQueue.addData(bArr, i + readUint16, receiveDatagram - readUint16);
        return readUint16;
    }

    private void resetHeartbeat() {
        this.heartbeatInFlight = null;
        this.heartbeatResendMillis = -1;
        this.heartbeatResendTimeout = null;
        this.heartbeatTimeout = new Timeout(this.heartbeat.getIdleMillis());
    }

    private static void sendDatagram(DatagramSender datagramSender, byte[] bArr) {
        try {
            datagramSender.send(bArr, 0, bArr.length);
        } catch (InterruptedIOException e10) {
            e10.bytesTransferred = 0;
            throw e10;
        }
    }

    private void sendHeartbeatMessage(HeartbeatMessage heartbeatMessage) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        heartbeatMessage.encode(byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        sendRecord((short) 24, byteArray, 0, byteArray.length);
    }

    public static void sendHelloVerifyRequestRecord(DatagramSender datagramSender, long j10, byte[] bArr) {
        TlsUtils.checkUint16(bArr.length);
        byte[] bArr2 = new byte[bArr.length + 13];
        TlsUtils.writeUint8((short) 22, bArr2, 0);
        TlsUtils.writeVersion(ProtocolVersion.DTLSv10, bArr2, 1);
        TlsUtils.writeUint16(0, bArr2, 3);
        TlsUtils.writeUint48(j10, bArr2, 5);
        TlsUtils.writeUint16(bArr.length, bArr2, 11);
        System.arraycopy(bArr, 0, bArr2, 13, bArr.length);
        sendDatagram(datagramSender, bArr2);
    }

    private void sendRecord(short s10, byte[] bArr, int i, int i9) {
        if (this.writeVersion == null) {
            return;
        }
        if (i9 > this.plaintextLimit) {
            throw new TlsFatalAlert((short) 80);
        }
        if (i9 < 1 && s10 != 23) {
            throw new TlsFatalAlert((short) 80);
        }
        synchronized (this.writeLock) {
            int epoch = this.writeEpoch.getEpoch();
            long allocateSequenceNumber = this.writeEpoch.allocateSequenceNumber();
            byte[] encodePlaintext = this.writeEpoch.getCipher().encodePlaintext(getMacSequenceNumber(epoch, allocateSequenceNumber), s10, bArr, i, i9);
            byte[] bArr2 = new byte[encodePlaintext.length + 13];
            TlsUtils.writeUint8(s10, bArr2, 0);
            TlsUtils.writeVersion(this.writeVersion, bArr2, 1);
            TlsUtils.writeUint16(epoch, bArr2, 3);
            TlsUtils.writeUint48(allocateSequenceNumber, bArr2, 5);
            TlsUtils.writeUint16(encodePlaintext.length, bArr2, 11);
            System.arraycopy(encodePlaintext, 0, bArr2, 13, encodePlaintext.length);
            sendDatagram(this.transport, bArr2);
        }
    }

    @Override // org.bouncycastle.tls.TlsCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        if (this.inHandshake && this.inConnection) {
            warn((short) 90, "User canceled handshake");
        }
        closeTransport();
    }

    public void fail(short s10) {
        if (this.closed) {
            return;
        }
        if (this.inConnection) {
            try {
                raiseAlert((short) 2, s10, null, null);
            } catch (Exception unused) {
            }
        }
        this.failed = true;
        closeTransport();
    }

    public void failed() {
        if (this.closed) {
            return;
        }
        this.failed = true;
        closeTransport();
    }

    public int getReadEpoch() {
        return this.readEpoch.getEpoch();
    }

    public ProtocolVersion getReadVersion() {
        return this.readVersion;
    }

    @Override // org.bouncycastle.tls.DatagramReceiver
    public int getReceiveLimit() {
        return Math.min(this.plaintextLimit, this.readEpoch.getCipher().getPlaintextLimit(this.transport.getReceiveLimit() - 13));
    }

    @Override // org.bouncycastle.tls.DatagramSender
    public int getSendLimit() {
        return Math.min(this.plaintextLimit, this.writeEpoch.getCipher().getPlaintextLimit(this.transport.getSendLimit() - 13));
    }

    public void handshakeSuccessful(DTLSHandshakeRetransmit dTLSHandshakeRetransmit) {
        DTLSEpoch dTLSEpoch = this.readEpoch;
        DTLSEpoch dTLSEpoch2 = this.currentEpoch;
        if (dTLSEpoch == dTLSEpoch2 || this.writeEpoch == dTLSEpoch2) {
            throw new IllegalStateException();
        }
        if (dTLSHandshakeRetransmit != null) {
            this.retransmit = dTLSHandshakeRetransmit;
            this.retransmitEpoch = dTLSEpoch2;
            this.retransmitTimeout = new Timeout(RETRANSMIT_TIMEOUT);
        }
        this.inHandshake = false;
        this.currentEpoch = this.pendingEpoch;
        this.pendingEpoch = null;
    }

    public void initHeartbeat(TlsHeartbeat tlsHeartbeat, boolean z10) {
        if (this.inHandshake) {
            throw new IllegalStateException();
        }
        this.heartbeat = tlsHeartbeat;
        this.heartBeatResponder = z10;
        if (tlsHeartbeat != null) {
            resetHeartbeat();
        }
    }

    public void initPendingEpoch(TlsCipher tlsCipher) {
        if (this.pendingEpoch != null) {
            throw new IllegalStateException();
        }
        this.pendingEpoch = new DTLSEpoch(this.writeEpoch.getEpoch() + 1, tlsCipher);
    }

    public boolean isClosed() {
        return this.closed;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[LOOP:0: B:2:0x000a->B:23:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6 A[SYNTHETIC] */
    @Override // org.bouncycastle.tls.DatagramReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int receive(byte[] r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
            org.bouncycastle.tls.Timeout r2 = org.bouncycastle.tls.Timeout.forWaitMillis(r14, r0)
            r3 = 0
            r4 = r3
        La:
            if (r14 < 0) goto Lb1
            org.bouncycastle.tls.Timeout r5 = r10.retransmitTimeout
            if (r5 == 0) goto L20
            long r5 = r5.remainingMillis(r0)
            r7 = 1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L20
            r10.retransmit = r3
            r10.retransmitEpoch = r3
            r10.retransmitTimeout = r3
        L20:
            org.bouncycastle.tls.Timeout r5 = r10.heartbeatTimeout
            boolean r5 = org.bouncycastle.tls.Timeout.hasExpired(r5, r0)
            r6 = 1
            if (r5 == 0) goto L63
            org.bouncycastle.tls.HeartbeatMessage r5 = r10.heartbeatInFlight
            if (r5 != 0) goto L5b
            org.bouncycastle.tls.TlsContext r5 = r10.context
            org.bouncycastle.tls.TlsHeartbeat r7 = r10.heartbeat
            byte[] r7 = r7.generatePayload()
            org.bouncycastle.tls.HeartbeatMessage r5 = org.bouncycastle.tls.HeartbeatMessage.create(r5, r6, r7)
            r10.heartbeatInFlight = r5
            org.bouncycastle.tls.Timeout r5 = new org.bouncycastle.tls.Timeout
            org.bouncycastle.tls.TlsHeartbeat r7 = r10.heartbeat
            int r7 = r7.getTimeoutMillis()
            long r7 = (long) r7
            r5.<init>(r7, r0)
            r10.heartbeatTimeout = r5
            r5 = 1000(0x3e8, float:1.401E-42)
            r10.heartbeatResendMillis = r5
            org.bouncycastle.tls.Timeout r7 = new org.bouncycastle.tls.Timeout
            long r8 = (long) r5
            r7.<init>(r8, r0)
        L53:
            r10.heartbeatResendTimeout = r7
            org.bouncycastle.tls.HeartbeatMessage r5 = r10.heartbeatInFlight
            r10.sendHeartbeatMessage(r5)
            goto L7a
        L5b:
            org.bouncycastle.tls.TlsTimeoutException r11 = new org.bouncycastle.tls.TlsTimeoutException
            java.lang.String r12 = "Heartbeat timed out"
            r11.<init>(r12)
            throw r11
        L63:
            org.bouncycastle.tls.Timeout r5 = r10.heartbeatResendTimeout
            boolean r5 = org.bouncycastle.tls.Timeout.hasExpired(r5, r0)
            if (r5 == 0) goto L7a
            int r5 = r10.heartbeatResendMillis
            int r5 = org.bouncycastle.tls.DTLSReliableHandshake.backOff(r5)
            r10.heartbeatResendMillis = r5
            org.bouncycastle.tls.Timeout r7 = new org.bouncycastle.tls.Timeout
            long r8 = (long) r5
            r7.<init>(r8, r0)
            goto L53
        L7a:
            org.bouncycastle.tls.Timeout r5 = r10.heartbeatTimeout
            int r14 = org.bouncycastle.tls.Timeout.constrainWaitMillis(r14, r5, r0)
            org.bouncycastle.tls.Timeout r5 = r10.heartbeatResendTimeout
            int r14 = org.bouncycastle.tls.Timeout.constrainWaitMillis(r14, r5, r0)
            if (r14 >= 0) goto L89
            goto L8a
        L89:
            r6 = r14
        L8a:
            int r14 = r10.getReceiveLimit()
            int r14 = java.lang.Math.min(r13, r14)
            int r14 = r14 + 13
            if (r4 == 0) goto L99
            int r0 = r4.length
            if (r0 >= r14) goto L9b
        L99:
            byte[] r4 = new byte[r14]
        L9b:
            r0 = 0
            int r14 = r10.receiveRecord(r4, r0, r14, r6)
            int r14 = r10.processRecord(r14, r4, r11, r12)
            if (r14 < 0) goto La7
            return r14
        La7:
            long r0 = java.lang.System.currentTimeMillis()
            int r14 = org.bouncycastle.tls.Timeout.getWaitMillis(r2, r0)
            goto La
        Lb1:
            r11 = -1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tls.DTLSRecordLayer.receive(byte[], int, int, int):int");
    }

    public void resetAfterHelloVerifyRequestClient() {
        this.currentEpoch.getReplayWindow().reset();
    }

    public void resetAfterHelloVerifyRequestServer(long j10) {
        this.inConnection = true;
        this.currentEpoch.setSequenceNumber(j10);
    }

    public void resetWriteEpoch() {
        DTLSEpoch dTLSEpoch = this.retransmitEpoch;
        if (dTLSEpoch == null) {
            dTLSEpoch = this.currentEpoch;
        }
        this.writeEpoch = dTLSEpoch;
    }

    @Override // org.bouncycastle.tls.DatagramSender
    public void send(byte[] bArr, int i, int i9) {
        short s10;
        if (this.inHandshake || this.writeEpoch == this.retransmitEpoch) {
            if (TlsUtils.readUint8(bArr, i) == 20) {
                DTLSEpoch dTLSEpoch = this.inHandshake ? this.pendingEpoch : this.writeEpoch == this.retransmitEpoch ? this.currentEpoch : null;
                if (dTLSEpoch == null) {
                    throw new IllegalStateException();
                }
                sendRecord((short) 20, new byte[]{1}, 0, 1);
                this.writeEpoch = dTLSEpoch;
            }
            s10 = 22;
        } else {
            s10 = 23;
        }
        sendRecord(s10, bArr, i, i9);
    }

    public void setPlaintextLimit(int i) {
        this.plaintextLimit = i;
    }

    public void setReadVersion(ProtocolVersion protocolVersion) {
        this.readVersion = protocolVersion;
    }

    public void setWriteVersion(ProtocolVersion protocolVersion) {
        this.writeVersion = protocolVersion;
    }

    public void warn(short s10, String str) {
        raiseAlert((short) 1, s10, str, null);
    }
}
