package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
class DTLSReliableHandshake {
    static final int INITIAL_RESEND_MILLIS = 1000;
    private static final int MAX_RECEIVE_AHEAD = 16;
    private static final int MAX_RESEND_MILLIS = 60000;
    private static final int MESSAGE_HEADER_LENGTH = 12;
    private TlsHandshakeHash handshakeHash;
    private Timeout handshakeTimeout;
    private int next_receive_seq;
    private int next_send_seq;
    private DTLSRecordLayer recordLayer;
    private int resendMillis;
    private Timeout resendTimeout;
    private Hashtable currentInboundFlight = new Hashtable();
    private Hashtable previousInboundFlight = null;
    private Vector outboundFlight = new Vector();

    public static class Message {
        private final byte[] body;
        private final int message_seq;
        private final short msg_type;

        private Message(int i, short s10, byte[] bArr) {
            this.message_seq = i;
            this.msg_type = s10;
            this.body = bArr;
        }

        public byte[] getBody() {
            return this.body;
        }

        public int getSeq() {
            return this.message_seq;
        }

        public short getType() {
            return this.msg_type;
        }
    }

    public static class RecordLayerBuffer extends ByteArrayOutputStream {
        public RecordLayerBuffer(int i) {
            super(i);
        }

        public void sendToRecordLayer(DTLSRecordLayer dTLSRecordLayer) {
            dTLSRecordLayer.send(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).buf = null;
        }
    }

    public DTLSReliableHandshake(TlsContext tlsContext, DTLSRecordLayer dTLSRecordLayer, int i, DTLSRequest dTLSRequest) {
        this.resendMillis = -1;
        this.resendTimeout = null;
        this.next_send_seq = 0;
        this.next_receive_seq = 0;
        this.recordLayer = dTLSRecordLayer;
        this.handshakeHash = new DeferredHash(tlsContext);
        this.handshakeTimeout = Timeout.forWaitMillis(i);
        if (dTLSRequest != null) {
            this.resendMillis = INITIAL_RESEND_MILLIS;
            this.resendTimeout = new Timeout(INITIAL_RESEND_MILLIS);
            long recordSeq = dTLSRequest.getRecordSeq();
            int messageSeq = dTLSRequest.getMessageSeq();
            byte[] message = dTLSRequest.getMessage();
            this.recordLayer.resetAfterHelloVerifyRequestServer(recordSeq);
            this.currentInboundFlight.put(Integers.valueOf(messageSeq), new DTLSReassembler((short) 1, message.length - 12));
            this.next_send_seq = messageSeq;
            this.next_receive_seq = messageSeq + 1;
            this.handshakeHash.update(message, 0, message.length);
        }
    }

    public static int backOff(int i) {
        return Math.min(i * 2, MAX_RESEND_MILLIS);
    }

    private static boolean checkAll(Hashtable hashtable) {
        Enumeration elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            if (((DTLSReassembler) elements.nextElement()).getBodyIfComplete() == null) {
                return false;
            }
        }
        return true;
    }

    private void checkInboundFlight() {
        Enumeration keys = this.currentInboundFlight.keys();
        while (keys.hasMoreElements()) {
            ((Integer) keys.nextElement()).getClass();
        }
    }

    private Message getPendingMessage() {
        byte[] bodyIfComplete;
        DTLSReassembler dTLSReassembler = (DTLSReassembler) this.currentInboundFlight.get(Integers.valueOf(this.next_receive_seq));
        if (dTLSReassembler == null || (bodyIfComplete = dTLSReassembler.getBodyIfComplete()) == null) {
            return null;
        }
        this.previousInboundFlight = null;
        int i = this.next_receive_seq;
        this.next_receive_seq = i + 1;
        return updateHandshakeMessagesDigest(new Message(i, dTLSReassembler.getMsgType(), bodyIfComplete));
    }

    private void prepareInboundFlight(Hashtable hashtable) {
        resetAll(this.currentInboundFlight);
        this.previousInboundFlight = this.currentInboundFlight;
        this.currentInboundFlight = hashtable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRecord(int i, int i9, byte[] bArr, int i10, int i11) {
        int readUint24;
        int readUint242;
        DTLSReassembler dTLSReassembler;
        int i12 = i10;
        int i13 = i11;
        boolean z10 = false;
        while (i13 >= 12 && i13 >= (readUint242 = (readUint24 = TlsUtils.readUint24(bArr, i12 + 9)) + 12)) {
            int readUint243 = TlsUtils.readUint24(bArr, i12 + 1);
            int readUint244 = TlsUtils.readUint24(bArr, i12 + 6);
            if (readUint244 + readUint24 > readUint243) {
                break;
            }
            short readUint8 = TlsUtils.readUint8(bArr, i12);
            if (i9 != (readUint8 == 20 ? 1 : 0)) {
                break;
            }
            int readUint16 = TlsUtils.readUint16(bArr, i12 + 4);
            int i14 = this.next_receive_seq;
            if (readUint16 < i14 + i) {
                if (readUint16 >= i14) {
                    DTLSReassembler dTLSReassembler2 = (DTLSReassembler) this.currentInboundFlight.get(Integers.valueOf(readUint16));
                    if (dTLSReassembler2 == null) {
                        dTLSReassembler2 = new DTLSReassembler(readUint8, readUint243);
                        this.currentInboundFlight.put(Integers.valueOf(readUint16), dTLSReassembler2);
                    }
                    dTLSReassembler2.contributeFragment(readUint8, readUint243, bArr, i12 + 12, readUint244, readUint24);
                } else {
                    Hashtable hashtable = this.previousInboundFlight;
                    if (hashtable != null && (dTLSReassembler = (DTLSReassembler) hashtable.get(Integers.valueOf(readUint16))) != null) {
                        dTLSReassembler.contributeFragment(readUint8, readUint243, bArr, i12 + 12, readUint244, readUint24);
                        z10 = true;
                    }
                }
            }
            i12 += readUint242;
            i13 -= readUint242;
        }
        if (z10 && checkAll(this.previousInboundFlight)) {
            resendOutboundFlight();
            resetAll(this.previousInboundFlight);
        }
    }

    public static DTLSRequest readClientRequest(byte[] bArr, int i, int i9, OutputStream outputStream) {
        byte[] receiveClientHelloRecord = DTLSRecordLayer.receiveClientHelloRecord(bArr, i, i9);
        if (receiveClientHelloRecord == null || receiveClientHelloRecord.length < 12) {
            return null;
        }
        long readUint48 = TlsUtils.readUint48(bArr, i + 5);
        if (1 != TlsUtils.readUint8(receiveClientHelloRecord, 0)) {
            return null;
        }
        int readUint24 = TlsUtils.readUint24(receiveClientHelloRecord, 1);
        if (receiveClientHelloRecord.length == readUint24 + 12 && TlsUtils.readUint24(receiveClientHelloRecord, 6) == 0 && readUint24 == TlsUtils.readUint24(receiveClientHelloRecord, 9)) {
            return new DTLSRequest(readUint48, receiveClientHelloRecord, ClientHello.parse(new ByteArrayInputStream(receiveClientHelloRecord, 12, readUint24), outputStream));
        }
        return null;
    }

    private void resendOutboundFlight() {
        this.recordLayer.resetWriteEpoch();
        for (int i = 0; i < this.outboundFlight.size(); i++) {
            writeMessage((Message) this.outboundFlight.elementAt(i));
        }
        int backOff = backOff(this.resendMillis);
        this.resendMillis = backOff;
        this.resendTimeout = new Timeout(backOff);
    }

    private static void resetAll(Hashtable hashtable) {
        Enumeration elements = hashtable.elements();
        while (elements.hasMoreElements()) {
            ((DTLSReassembler) elements.nextElement()).reset();
        }
    }

    public static void sendHelloVerifyRequest(DatagramSender datagramSender, long j10, int i, byte[] bArr) {
        TlsUtils.checkUint16(i);
        TlsUtils.checkUint8(bArr.length);
        int length = bArr.length;
        int i9 = length + 3;
        byte[] bArr2 = new byte[length + 15];
        TlsUtils.writeUint8((short) 3, bArr2, 0);
        TlsUtils.writeUint24(i9, bArr2, 1);
        TlsUtils.writeUint16(i, bArr2, 4);
        TlsUtils.writeUint24(0, bArr2, 6);
        TlsUtils.writeUint24(i9, bArr2, 9);
        TlsUtils.writeVersion(ProtocolVersion.DTLSv10, bArr2, 12);
        TlsUtils.writeOpaque8(bArr, bArr2, 14);
        DTLSRecordLayer.sendHelloVerifyRequestRecord(datagramSender, j10, bArr2);
    }

    private Message updateHandshakeMessagesDigest(Message message) {
        if (message.getType() != 0) {
            byte[] body = message.getBody();
            byte[] bArr = new byte[12];
            TlsUtils.writeUint8(message.getType(), bArr, 0);
            TlsUtils.writeUint24(body.length, bArr, 1);
            TlsUtils.writeUint16(message.getSeq(), bArr, 4);
            TlsUtils.writeUint24(0, bArr, 6);
            TlsUtils.writeUint24(body.length, bArr, 9);
            this.handshakeHash.update(bArr, 0, 12);
            this.handshakeHash.update(body, 0, body.length);
        }
        return message;
    }

    private void writeHandshakeFragment(Message message, int i, int i9) {
        RecordLayerBuffer recordLayerBuffer = new RecordLayerBuffer(i9 + 12);
        TlsUtils.writeUint8(message.getType(), (OutputStream) recordLayerBuffer);
        TlsUtils.writeUint24(message.getBody().length, recordLayerBuffer);
        TlsUtils.writeUint16(message.getSeq(), recordLayerBuffer);
        TlsUtils.writeUint24(i, recordLayerBuffer);
        TlsUtils.writeUint24(i9, recordLayerBuffer);
        recordLayerBuffer.write(message.getBody(), i, i9);
        recordLayerBuffer.sendToRecordLayer(this.recordLayer);
    }

    private void writeMessage(Message message) {
        int sendLimit = this.recordLayer.getSendLimit() - 12;
        if (sendLimit < 1) {
            throw new TlsFatalAlert((short) 80);
        }
        int length = message.getBody().length;
        int i = 0;
        do {
            int min = Math.min(length - i, sendLimit);
            writeHandshakeFragment(message, i, min);
            i += min;
        } while (i < length);
    }

    public void finish() {
        DTLSHandshakeRetransmit dTLSHandshakeRetransmit = null;
        if (this.resendTimeout != null) {
            checkInboundFlight();
        } else {
            prepareInboundFlight(null);
            if (this.previousInboundFlight != null) {
                dTLSHandshakeRetransmit = new DTLSHandshakeRetransmit() { // from class: org.bouncycastle.tls.DTLSReliableHandshake.1
                    @Override // org.bouncycastle.tls.DTLSHandshakeRetransmit
                    public void receivedHandshakeRecord(int i, byte[] bArr, int i9, int i10) {
                        DTLSReliableHandshake.this.processRecord(0, i, bArr, i9, i10);
                    }
                };
            }
        }
        this.recordLayer.handshakeSuccessful(dTLSHandshakeRetransmit);
    }

    public TlsHandshakeHash getHandshakeHash() {
        return this.handshakeHash;
    }

    public void notifyHelloComplete() {
        this.handshakeHash = this.handshakeHash.notifyPRFDetermined();
    }

    public TlsHandshakeHash prepareToFinish() {
        TlsHandshakeHash tlsHandshakeHash = this.handshakeHash;
        this.handshakeHash = tlsHandshakeHash.stopTracking();
        return tlsHandshakeHash;
    }

    public Message receiveMessage() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.resendTimeout == null) {
            this.resendMillis = INITIAL_RESEND_MILLIS;
            this.resendTimeout = new Timeout(INITIAL_RESEND_MILLIS, currentTimeMillis);
            prepareInboundFlight(new Hashtable());
        }
        byte[] bArr = null;
        while (!this.recordLayer.isClosed()) {
            Message pendingMessage = getPendingMessage();
            if (pendingMessage != null) {
                return pendingMessage;
            }
            if (Timeout.hasExpired(this.handshakeTimeout, currentTimeMillis)) {
                throw new TlsTimeoutException("Handshake timed out");
            }
            int constrainWaitMillis = Timeout.constrainWaitMillis(Timeout.getWaitMillis(this.handshakeTimeout, currentTimeMillis), this.resendTimeout, currentTimeMillis);
            if (constrainWaitMillis < 1) {
                constrainWaitMillis = 1;
            }
            int receiveLimit = this.recordLayer.getReceiveLimit();
            if (bArr == null || bArr.length < receiveLimit) {
                bArr = new byte[receiveLimit];
            }
            int receive = this.recordLayer.receive(bArr, 0, receiveLimit, constrainWaitMillis);
            if (receive < 0) {
                resendOutboundFlight();
            } else {
                processRecord(16, this.recordLayer.getReadEpoch(), bArr, 0, receive);
            }
            currentTimeMillis = System.currentTimeMillis();
        }
        throw new TlsFatalAlert((short) 90);
    }

    public byte[] receiveMessageBody(short s10) {
        Message receiveMessage = receiveMessage();
        if (receiveMessage.getType() == s10) {
            return receiveMessage.getBody();
        }
        throw new TlsFatalAlert((short) 10);
    }

    public void resetAfterHelloVerifyRequestClient() {
        this.currentInboundFlight = new Hashtable();
        this.previousInboundFlight = null;
        this.outboundFlight = new Vector();
        this.resendMillis = -1;
        this.resendTimeout = null;
        this.next_receive_seq = this.next_send_seq;
        this.handshakeHash.reset();
        this.recordLayer.resetAfterHelloVerifyRequestClient();
    }

    public void sendMessage(short s10, byte[] bArr) {
        TlsUtils.checkUint24(bArr.length);
        if (this.resendTimeout != null) {
            checkInboundFlight();
            this.resendMillis = -1;
            this.resendTimeout = null;
            this.outboundFlight.removeAllElements();
        }
        int i = this.next_send_seq;
        this.next_send_seq = i + 1;
        Message message = new Message(i, s10, bArr);
        this.outboundFlight.addElement(message);
        writeMessage(message);
        updateHandshakeMessagesDigest(message);
    }
}
