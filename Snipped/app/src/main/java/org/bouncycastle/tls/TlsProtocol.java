package org.bouncycastle.tls;

import com.google.android.gms.measurement.internal.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.SessionParameters;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public abstract class TlsProtocol implements TlsCloseable {
    protected static final short ADS_MODE_0_N = 1;
    protected static final short ADS_MODE_0_N_FIRSTONLY = 2;
    protected static final short ADS_MODE_1_Nsub1 = 0;
    protected static final short CS_CERTIFICATE_REQUEST = 7;
    protected static final short CS_CERTIFICATE_STATUS = 5;
    protected static final short CS_CERTIFICATE_VERIFY = 12;
    protected static final short CS_CLIENT_CERTIFICATE = 10;
    protected static final short CS_CLIENT_FINISHED = 13;
    protected static final short CS_CLIENT_HELLO = 1;
    protected static final short CS_CLIENT_KEY_EXCHANGE = 11;
    protected static final short CS_CLIENT_SUPPLEMENTAL_DATA = 9;
    protected static final short CS_END = 16;
    protected static final short CS_SERVER_CERTIFICATE = 4;
    protected static final short CS_SERVER_FINISHED = 15;
    protected static final short CS_SERVER_HELLO = 2;
    protected static final short CS_SERVER_HELLO_DONE = 8;
    protected static final short CS_SERVER_KEY_EXCHANGE = 6;
    protected static final short CS_SERVER_SESSION_TICKET = 14;
    protected static final short CS_SERVER_SUPPLEMENTAL_DATA = 3;
    protected static final short CS_START = 0;
    protected static final Integer EXT_RenegotiationInfo = Integers.valueOf(65281);
    protected static final Integer EXT_SessionTicket = Integers.valueOf(35);
    private ByteQueue alertQueue;
    protected boolean allowCertificateStatus;
    private volatile boolean appDataReady;
    private volatile boolean appDataSplitEnabled;
    private volatile int appDataSplitMode;
    private ByteQueue applicationDataQueue;
    protected boolean blocking;
    protected Hashtable clientExtensions;
    private volatile boolean closed;
    protected short connection_state;
    protected boolean expectSessionTicket;
    private volatile boolean failedWithError;
    private ByteQueue handshakeQueue;
    protected ByteQueueInputStream inputBuffers;
    protected int[] offeredCipherSuites;
    protected ByteQueueOutputStream outputBuffer;
    protected boolean receivedChangeCipherSpec;
    RecordStream recordStream;
    private volatile boolean resumableHandshake;
    protected boolean resumedSession;
    protected Hashtable serverExtensions;
    protected SessionParameters sessionParameters;
    private TlsInputStream tlsInputStream;
    private TlsOutputStream tlsOutputStream;
    protected TlsSession tlsSession;

    public class HandshakeMessage extends ByteArrayOutputStream {
        public HandshakeMessage(TlsProtocol tlsProtocol, short s10) {
            this(s10, 60);
        }

        public void writeToRecordStream() {
            int i = ((ByteArrayOutputStream) this).count - 4;
            TlsUtils.checkUint24(i);
            TlsUtils.writeUint24(i, ((ByteArrayOutputStream) this).buf, 1);
            TlsProtocol.this.writeHandshakeMessage(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).buf = null;
        }

        public HandshakeMessage(short s10, int i) {
            super(i + 4);
            TlsUtils.writeUint8(s10, (OutputStream) this);
            ((ByteArrayOutputStream) this).count += 3;
        }
    }

    public TlsProtocol() {
        this.applicationDataQueue = new ByteQueue(0);
        this.alertQueue = new ByteQueue(2);
        this.handshakeQueue = new ByteQueue(0);
        this.tlsInputStream = null;
        this.tlsOutputStream = null;
        this.closed = false;
        this.failedWithError = false;
        this.appDataReady = false;
        this.appDataSplitEnabled = true;
        this.resumableHandshake = false;
        this.appDataSplitMode = 0;
        this.tlsSession = null;
        this.sessionParameters = null;
        this.offeredCipherSuites = null;
        this.clientExtensions = null;
        this.serverExtensions = null;
        this.connection_state = (short) 0;
        this.resumedSession = false;
        this.receivedChangeCipherSpec = false;
        this.allowCertificateStatus = false;
        this.expectSessionTicket = false;
        this.blocking = false;
        this.inputBuffers = new ByteQueueInputStream();
        ByteQueueOutputStream byteQueueOutputStream = new ByteQueueOutputStream();
        this.outputBuffer = byteQueueOutputStream;
        this.recordStream = new RecordStream(this, this.inputBuffers, byteQueueOutputStream);
    }

    public static void assertEmpty(ByteArrayInputStream byteArrayInputStream) {
        if (byteArrayInputStream.available() > 0) {
            throw new TlsFatalAlert((short) 50);
        }
    }

    public static byte[] createRandomBlock(boolean z10, TlsContext tlsContext) {
        byte[] generateNonce = tlsContext.getNonceGenerator().generateNonce(32);
        if (z10) {
            TlsUtils.writeGMTUnixTime(generateNonce, 0);
        }
        return generateNonce;
    }

    public static byte[] createRenegotiationInfo(byte[] bArr) {
        return TlsUtils.encodeOpaque8(bArr);
    }

    public static void establishMasterSecret(TlsContext tlsContext, TlsKeyExchange tlsKeyExchange) {
        TlsSecret generatePreMasterSecret = tlsKeyExchange.generatePreMasterSecret();
        if (generatePreMasterSecret == null) {
            throw new TlsFatalAlert((short) 80);
        }
        try {
            tlsContext.getSecurityParametersHandshake().masterSecret = TlsUtils.calculateMasterSecret(tlsContext, generatePreMasterSecret);
        } finally {
            generatePreMasterSecret.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0055 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getPRFAlgorithm(org.bouncycastle.tls.TlsContext r5, int r6) {
        /*
            boolean r0 = org.bouncycastle.tls.TlsUtils.isTLSv13(r5)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            boolean r5 = org.bouncycastle.tls.TlsUtils.isTLSv12(r5)
            if (r5 == 0) goto L10
            r5 = r2
            goto L11
        L10:
            r5 = r1
        L11:
            r3 = 47
            switch(r6) {
                case 59: goto L55;
                case 60: goto L55;
                case 61: goto L55;
                case 62: goto L55;
                case 63: goto L55;
                case 64: goto L55;
                default: goto L16;
            }
        L16:
            switch(r6) {
                case 103: goto L55;
                case 104: goto L55;
                case 105: goto L55;
                case 106: goto L55;
                case 107: goto L55;
                case 108: goto L55;
                case 109: goto L55;
                default: goto L19;
            }
        L19:
            r4 = 2
            switch(r6) {
                case 156: goto L55;
                case 157: goto L4c;
                case 158: goto L55;
                case 159: goto L4c;
                case 160: goto L55;
                case 161: goto L4c;
                case 162: goto L55;
                case 163: goto L4c;
                case 164: goto L55;
                case 165: goto L4c;
                case 166: goto L55;
                case 167: goto L4c;
                case 168: goto L55;
                case 169: goto L4c;
                case 170: goto L55;
                case 171: goto L4c;
                case 172: goto L55;
                case 173: goto L4c;
                default: goto L1d;
            }
        L1d:
            switch(r6) {
                case 175: goto L48;
                case 177: goto L48;
                case 179: goto L48;
                case 181: goto L48;
                case 183: goto L48;
                case 49208: goto L48;
                case 49211: goto L48;
                case 49212: goto L55;
                case 49213: goto L4c;
                case 49214: goto L55;
                case 49215: goto L4c;
                case 49216: goto L55;
                case 49217: goto L4c;
                case 49218: goto L55;
                case 49219: goto L4c;
                case 49220: goto L55;
                case 49221: goto L4c;
                case 49222: goto L55;
                case 49223: goto L4c;
                case 49224: goto L55;
                case 49225: goto L4c;
                case 49226: goto L55;
                case 49227: goto L4c;
                case 49228: goto L55;
                case 49229: goto L4c;
                case 49230: goto L55;
                case 49231: goto L4c;
                case 49232: goto L55;
                case 49233: goto L4c;
                case 49234: goto L55;
                case 49235: goto L4c;
                case 49236: goto L55;
                case 49237: goto L4c;
                case 49238: goto L55;
                case 49239: goto L4c;
                case 49240: goto L55;
                case 49241: goto L4c;
                case 49242: goto L55;
                case 49243: goto L4c;
                case 49244: goto L55;
                case 49245: goto L4c;
                case 49246: goto L55;
                case 49247: goto L4c;
                case 49248: goto L55;
                case 49249: goto L4c;
                case 49250: goto L55;
                case 49251: goto L4c;
                case 49252: goto L55;
                case 49253: goto L4c;
                case 49254: goto L55;
                case 49255: goto L4c;
                case 49256: goto L55;
                case 49257: goto L4c;
                case 49258: goto L55;
                case 49259: goto L4c;
                case 49260: goto L55;
                case 49261: goto L4c;
                case 49262: goto L55;
                case 49263: goto L4c;
                case 49264: goto L55;
                case 49265: goto L4c;
                case 49266: goto L55;
                case 49267: goto L4c;
                case 49268: goto L55;
                case 49269: goto L4c;
                case 49270: goto L55;
                case 49271: goto L4c;
                case 49272: goto L55;
                case 49273: goto L4c;
                case 49274: goto L55;
                case 49275: goto L4c;
                case 49276: goto L55;
                case 49277: goto L4c;
                case 49278: goto L55;
                case 49279: goto L4c;
                case 49280: goto L55;
                case 49281: goto L4c;
                case 49282: goto L55;
                case 49283: goto L4c;
                case 49284: goto L55;
                case 49285: goto L4c;
                case 49286: goto L55;
                case 49287: goto L4c;
                case 49288: goto L55;
                case 49289: goto L4c;
                case 49290: goto L55;
                case 49291: goto L4c;
                case 49292: goto L55;
                case 49293: goto L4c;
                case 49294: goto L55;
                case 49295: goto L4c;
                case 49296: goto L55;
                case 49297: goto L4c;
                case 49298: goto L55;
                case 49299: goto L4c;
                case 49301: goto L48;
                case 49303: goto L48;
                case 49305: goto L48;
                case 53253: goto L55;
                case 65280: goto L55;
                case 65281: goto L55;
                case 65282: goto L55;
                case 65283: goto L55;
                case 65284: goto L55;
                case 65285: goto L55;
                case 65296: goto L55;
                case 65297: goto L55;
                case 65298: goto L55;
                case 65299: goto L55;
                case 65300: goto L55;
                case 65301: goto L55;
                default: goto L20;
            }
        L20:
            switch(r6) {
                case 185: goto L48;
                case 186: goto L55;
                case 187: goto L55;
                case 188: goto L55;
                case 189: goto L55;
                case 190: goto L55;
                case 191: goto L55;
                case 192: goto L55;
                case 193: goto L55;
                case 194: goto L55;
                case 195: goto L55;
                case 196: goto L55;
                case 197: goto L55;
                default: goto L23;
            }
        L23:
            switch(r6) {
                case 4865: goto L3f;
                case 4866: goto L36;
                case 4867: goto L3f;
                case 4868: goto L3f;
                case 4869: goto L3f;
                default: goto L26;
            }
        L26:
            switch(r6) {
                case 49187: goto L55;
                case 49188: goto L4c;
                case 49189: goto L55;
                case 49190: goto L4c;
                case 49191: goto L55;
                case 49192: goto L4c;
                case 49193: goto L55;
                case 49194: goto L4c;
                case 49195: goto L55;
                case 49196: goto L4c;
                case 49197: goto L55;
                case 49198: goto L4c;
                case 49199: goto L55;
                case 49200: goto L4c;
                case 49201: goto L55;
                case 49202: goto L4c;
                default: goto L29;
            }
        L29:
            switch(r6) {
                case 49307: goto L48;
                case 49308: goto L55;
                case 49309: goto L55;
                case 49310: goto L55;
                case 49311: goto L55;
                case 49312: goto L55;
                case 49313: goto L55;
                case 49314: goto L55;
                case 49315: goto L55;
                case 49316: goto L55;
                case 49317: goto L55;
                case 49318: goto L55;
                case 49319: goto L55;
                case 49320: goto L55;
                case 49321: goto L55;
                case 49322: goto L55;
                case 49323: goto L55;
                case 49324: goto L55;
                case 49325: goto L55;
                case 49326: goto L55;
                case 49327: goto L55;
                default: goto L2c;
            }
        L2c:
            switch(r6) {
                case 52392: goto L55;
                case 52393: goto L55;
                case 52394: goto L55;
                case 52395: goto L55;
                case 52396: goto L55;
                case 52397: goto L55;
                case 52398: goto L55;
                default: goto L2f;
            }
        L2f:
            switch(r6) {
                case 53249: goto L55;
                case 53250: goto L4c;
                case 53251: goto L55;
                default: goto L32;
            }
        L32:
            if (r5 == 0) goto L35
            return r2
        L35:
            return r1
        L36:
            if (r0 == 0) goto L39
            return r4
        L39:
            org.bouncycastle.tls.TlsFatalAlert r5 = new org.bouncycastle.tls.TlsFatalAlert
            r5.<init>(r3)
            throw r5
        L3f:
            if (r0 == 0) goto L42
            return r2
        L42:
            org.bouncycastle.tls.TlsFatalAlert r5 = new org.bouncycastle.tls.TlsFatalAlert
            r5.<init>(r3)
            throw r5
        L48:
            if (r5 == 0) goto L4b
            return r4
        L4b:
            return r1
        L4c:
            if (r5 == 0) goto L4f
            return r4
        L4f:
            org.bouncycastle.tls.TlsFatalAlert r5 = new org.bouncycastle.tls.TlsFatalAlert
            r5.<init>(r3)
            throw r5
        L55:
            if (r5 == 0) goto L58
            return r2
        L58:
            org.bouncycastle.tls.TlsFatalAlert r5 = new org.bouncycastle.tls.TlsFatalAlert
            r5.<init>(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tls.TlsProtocol.getPRFAlgorithm(org.bouncycastle.tls.TlsContext, int):int");
    }

    private void processAlertQueue() {
        while (this.alertQueue.available() >= 2) {
            byte[] removeData = this.alertQueue.removeData(2, 0);
            handleAlertMessage(removeData[0], removeData[1]);
        }
    }

    private void processChangeCipherSpec(byte[] bArr, int i, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (TlsUtils.readUint8(bArr, i + i10) != 1) {
                throw new TlsFatalAlert((short) 50);
            }
            if (this.receivedChangeCipherSpec || this.alertQueue.available() > 0 || this.handshakeQueue.available() > 0) {
                throw new TlsFatalAlert((short) 10);
            }
            this.recordStream.receivedReadCipherSpec();
            this.receivedChangeCipherSpec = true;
            handleChangeCipherSpecMessage();
        }
    }

    private void processHandshakeQueue(ByteQueue byteQueue) {
        while (byteQueue.available() >= 4) {
            byte[] bArr = new byte[4];
            byteQueue.read(bArr, 0, 4, 0);
            short readUint8 = TlsUtils.readUint8(bArr, 0);
            int readUint24 = TlsUtils.readUint24(bArr, 1);
            int i = readUint24 + 4;
            if (byteQueue.available() < i) {
                return;
            }
            if (readUint8 != 0) {
                if (20 == readUint8) {
                    checkReceivedChangeCipherSpec(true);
                    SecurityParameters securityParametersHandshake = getContext().getSecurityParametersHandshake();
                    if (securityParametersHandshake.getMasterSecret() != null) {
                        securityParametersHandshake.peerVerifyData = createVerifyData(!r2.isServer());
                    }
                } else {
                    checkReceivedChangeCipherSpec(false);
                }
                byteQueue.copyTo(this.recordStream.getHandshakeHashUpdater(), i);
            }
            byteQueue.removeData(4);
            handleHandshakeMessage(readUint8, byteQueue.readFrom(readUint24));
        }
    }

    public static Hashtable readExtensions(ByteArrayInputStream byteArrayInputStream) {
        if (byteArrayInputStream.available() < 1) {
            return null;
        }
        byte[] readOpaque16 = TlsUtils.readOpaque16(byteArrayInputStream);
        assertEmpty(byteArrayInputStream);
        return readExtensionsData(readOpaque16);
    }

    public static Hashtable readExtensionsData(byte[] bArr) {
        Hashtable hashtable = new Hashtable();
        if (bArr.length > 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            while (hashtable.put(Integers.valueOf(TlsUtils.readUint16(byteArrayInputStream)), TlsUtils.readOpaque16(byteArrayInputStream)) == null) {
                if (byteArrayInputStream.available() <= 0) {
                }
            }
            throw new TlsFatalAlert((short) 47);
        }
        return hashtable;
    }

    public static Vector readSupplementalDataMessage(ByteArrayInputStream byteArrayInputStream) {
        byte[] readOpaque24 = TlsUtils.readOpaque24(byteArrayInputStream, 1);
        assertEmpty(byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(readOpaque24);
        Vector vector = new Vector();
        while (byteArrayInputStream2.available() > 0) {
            vector.addElement(new SupplementalDataEntry(TlsUtils.readUint16(byteArrayInputStream2), TlsUtils.readOpaque16(byteArrayInputStream2)));
        }
        return vector;
    }

    public static TlsCredentials validateCredentials(TlsCredentials tlsCredentials) {
        if (tlsCredentials == null || (tlsCredentials instanceof TlsCredentialedAgreement ? 1 : 0) + (tlsCredentials instanceof TlsCredentialedDecryptor ? 1 : 0) + (tlsCredentials instanceof TlsCredentialedSigner ? 1 : 0) == 1) {
            return tlsCredentials;
        }
        throw new TlsFatalAlert((short) 80);
    }

    public static void writeExtensions(OutputStream outputStream, Hashtable hashtable) {
        if (hashtable == null || hashtable.isEmpty()) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeSelectedExtensions(byteArrayOutputStream, hashtable, true);
        writeSelectedExtensions(byteArrayOutputStream, hashtable, false);
        TlsUtils.writeOpaque16(byteArrayOutputStream.toByteArray(), outputStream);
    }

    public static void writeSelectedExtensions(OutputStream outputStream, Hashtable hashtable, boolean z10) {
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            int intValue = num.intValue();
            byte[] bArr = (byte[]) hashtable.get(num);
            if (z10 == (bArr.length == 0)) {
                TlsUtils.checkUint16(intValue);
                TlsUtils.writeUint16(intValue, outputStream);
                TlsUtils.writeOpaque16(bArr, outputStream);
            }
        }
    }

    public static void writeSupplementalData(OutputStream outputStream, Vector vector) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < vector.size(); i++) {
            SupplementalDataEntry supplementalDataEntry = (SupplementalDataEntry) vector.elementAt(i);
            int dataType = supplementalDataEntry.getDataType();
            TlsUtils.checkUint16(dataType);
            TlsUtils.writeUint16(dataType, byteArrayOutputStream);
            TlsUtils.writeOpaque16(supplementalDataEntry.getData(), byteArrayOutputStream);
        }
        TlsUtils.writeOpaque24(byteArrayOutputStream.toByteArray(), outputStream);
    }

    public int applicationDataAvailable() {
        return this.applicationDataQueue.available();
    }

    public void applyMaxFragmentLengthExtension() {
        short maxFragmentLength = getContext().getSecurityParametersHandshake().getMaxFragmentLength();
        if (maxFragmentLength >= 0) {
            if (!MaxFragmentLength.isValid(maxFragmentLength)) {
                throw new TlsFatalAlert((short) 80);
            }
            this.recordStream.setPlaintextLimit(1 << (maxFragmentLength + 8));
        }
    }

    public void beginHandshake(boolean z10) {
        this.connection_state = (short) 0;
        AbstractTlsContext contextAdmin = getContextAdmin();
        TlsPeer peer = getPeer();
        contextAdmin.handshakeBeginning(peer);
        SecurityParameters securityParametersHandshake = contextAdmin.getSecurityParametersHandshake();
        if (z10 != securityParametersHandshake.renegotiating) {
            throw new TlsFatalAlert((short) 80);
        }
        securityParametersHandshake.extendedPadding = peer.shouldUseExtendedPadding();
    }

    public void blockForHandshake() {
        while (this.connection_state != 16) {
            if (isClosed()) {
                throw new TlsFatalAlert((short) 80);
            }
            safeReadRecord();
        }
    }

    public void checkReceivedChangeCipherSpec(boolean z10) {
        if (z10 != this.receivedChangeCipherSpec) {
            throw new TlsFatalAlert((short) 10);
        }
    }

    public void cleanupHandshake() {
        SecurityParameters securityParameters = getContext().getSecurityParameters();
        if (securityParameters != null) {
            securityParameters.clear();
        }
        this.tlsSession = null;
        this.sessionParameters = null;
        this.offeredCipherSuites = null;
        this.clientExtensions = null;
        this.serverExtensions = null;
        this.resumedSession = false;
        this.receivedChangeCipherSpec = false;
        this.allowCertificateStatus = false;
        this.expectSessionTicket = false;
    }

    @Override // org.bouncycastle.tls.TlsCloseable
    public void close() {
        handleClose(true);
    }

    public void closeConnection() {
        this.recordStream.close();
    }

    public void closeInput() {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use closeInput() in blocking mode!");
        }
        if (this.closed) {
            return;
        }
        if (this.inputBuffers.available() > 0) {
            throw new EOFException();
        }
        if (!this.appDataReady) {
            throw new TlsFatalAlert((short) 40);
        }
        throw new TlsNoCloseNotifyException();
    }

    public void completeHandshake() {
        try {
            this.connection_state = (short) 16;
            this.alertQueue.shrink();
            this.handshakeQueue.shrink();
            this.recordStream.finaliseHandshake();
            this.appDataSplitEnabled = !TlsUtils.isTLSv11(getContext());
            if (!this.appDataReady) {
                this.appDataReady = true;
                if (this.blocking) {
                    this.tlsInputStream = new TlsInputStream(this);
                    this.tlsOutputStream = new TlsOutputStream(this);
                }
            }
            if (this.sessionParameters == null) {
                SecurityParameters securityParametersHandshake = getContext().getSecurityParametersHandshake();
                this.sessionParameters = new SessionParameters.Builder().setCipherSuite(securityParametersHandshake.getCipherSuite()).setCompressionAlgorithm(securityParametersHandshake.getCompressionAlgorithm()).setExtendedMasterSecret(securityParametersHandshake.isExtendedMasterSecret()).setLocalCertificate(securityParametersHandshake.getLocalCertificate()).setMasterSecret(getContext().getCrypto().adoptSecret(securityParametersHandshake.getMasterSecret())).setNegotiatedVersion(securityParametersHandshake.getNegotiatedVersion()).setPeerCertificate(securityParametersHandshake.getPeerCertificate()).setPSKIdentity(securityParametersHandshake.getPSKIdentity()).setSRPIdentity(securityParametersHandshake.getSRPIdentity()).setServerExtensions(this.serverExtensions).build();
                this.tlsSession = TlsUtils.importSession(this.tlsSession.getSessionID(), this.sessionParameters);
            }
            getContextAdmin().handshakeComplete(getPeer(), this.tlsSession);
            cleanupHandshake();
        } catch (Throwable th) {
            cleanupHandshake();
            throw th;
        }
    }

    public byte[] createVerifyData(boolean z10) {
        return TlsUtils.calculateTLSVerifyData(getContext(), this.recordStream.getHandshakeHash(), z10);
    }

    public void flush() {
        this.recordStream.flush();
    }

    public int getAppDataSplitMode() {
        return this.appDataSplitMode;
    }

    public int getApplicationDataLimit() {
        return this.recordStream.getPlaintextLimit();
    }

    public int getAvailableInputBytes() {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use getAvailableInputBytes() in blocking mode! Use getInputStream().available() instead.");
        }
        return applicationDataAvailable();
    }

    public int getAvailableOutputBytes() {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use getAvailableOutputBytes() in blocking mode! Use getOutputStream() instead.");
        }
        return this.outputBuffer.getBuffer().available();
    }

    public abstract TlsContext getContext();

    public abstract AbstractTlsContext getContextAdmin();

    public InputStream getInputStream() {
        if (this.blocking) {
            return this.tlsInputStream;
        }
        throw new IllegalStateException("Cannot use InputStream in non-blocking mode! Use offerInput() instead.");
    }

    public OutputStream getOutputStream() {
        if (this.blocking) {
            return this.tlsOutputStream;
        }
        throw new IllegalStateException("Cannot use OutputStream in non-blocking mode! Use offerOutput() instead.");
    }

    public abstract TlsPeer getPeer();

    public int getRenegotiationPolicy() {
        return 0;
    }

    public void handleAlertMessage(short s10, short s11) {
        getPeer().notifyAlertReceived(s10, s11);
        if (s10 == 1) {
            handleAlertWarningMessage(s11);
        } else {
            handleFailure();
            throw new TlsFatalAlertReceived(s11);
        }
    }

    public void handleAlertWarningMessage(short s10) {
        if (s10 == 0) {
            if (!this.appDataReady) {
                throw new TlsFatalAlert((short) 40);
            }
            handleClose(false);
        } else {
            if (s10 == 41) {
                throw new TlsFatalAlert((short) 10);
            }
            if (s10 == 100) {
                throw new TlsFatalAlert((short) 40);
            }
        }
    }

    public void handleClose(boolean z10) {
        if (this.closed) {
            return;
        }
        this.closed = true;
        if (z10 && !this.appDataReady) {
            raiseAlertWarning((short) 90, "User canceled handshake");
        }
        raiseAlertWarning((short) 0, "Connection closed");
        if (this.connection_state != 16) {
            cleanupHandshake();
        }
        closeConnection();
    }

    public void handleException(short s10, String str, Throwable th) {
        if (((this.appDataReady || isResumableHandshake()) && (th instanceof InterruptedIOException)) || this.closed) {
            return;
        }
        raiseAlertFatal(s10, str, th);
        handleFailure();
    }

    public void handleFailure() {
        this.closed = true;
        this.failedWithError = true;
        invalidateSession();
        if (this.connection_state != 16) {
            cleanupHandshake();
        }
        closeConnection();
    }

    public abstract void handleHandshakeMessage(short s10, ByteArrayInputStream byteArrayInputStream);

    public boolean handleRenegotiation() {
        int renegotiationPolicy = getRenegotiationPolicy();
        if (renegotiationPolicy == 1) {
            return false;
        }
        if (renegotiationPolicy != 2) {
            refuseRenegotiation();
            return false;
        }
        beginHandshake(true);
        return true;
    }

    public void invalidateSession() {
        SessionParameters sessionParameters = this.sessionParameters;
        if (sessionParameters != null) {
            sessionParameters.clear();
            this.sessionParameters = null;
        }
        TlsSession tlsSession = this.tlsSession;
        if (tlsSession != null) {
            tlsSession.invalidate();
            this.tlsSession = null;
        }
    }

    public boolean isClosed() {
        return this.closed;
    }

    public boolean isHandshaking() {
        return (isClosed() || getContext().getSecurityParametersHandshake() == null) ? false : true;
    }

    public boolean isResumableHandshake() {
        return this.resumableHandshake;
    }

    public void offerInput(byte[] bArr) {
        offerInput(bArr, 0, bArr.length);
    }

    public RecordPreview previewInputRecord(byte[] bArr) {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use previewInputRecord() in blocking mode!");
        }
        if (this.inputBuffers.available() != 0) {
            throw new IllegalStateException("Can only use previewInputRecord() for record-aligned input.");
        }
        if (this.closed) {
            throw new IOException("Connection is closed, cannot accept any more input");
        }
        return safePreviewRecordHeader(bArr);
    }

    public RecordPreview previewOutputRecord(int i) {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use previewOutputRecord() in blocking mode!");
        }
        if (this.outputBuffer.getBuffer().available() != 0) {
            throw new IllegalStateException("Can only use previewOutputRecord() for record-aligned output.");
        }
        if (this.closed) {
            throw new IOException("Connection is closed, cannot produce any more output");
        }
        if (i < 1) {
            return new RecordPreview(0, 0);
        }
        if (!this.appDataSplitEnabled) {
            return this.recordStream.previewOutputRecord(i);
        }
        int appDataSplitMode = getAppDataSplitMode();
        if (appDataSplitMode == 1 || appDataSplitMode == 2) {
            return RecordPreview.combine(this.recordStream.previewOutputRecord(0), this.recordStream.previewOutputRecord(i));
        }
        RecordPreview previewOutputRecord = this.recordStream.previewOutputRecord(1);
        return i > 1 ? RecordPreview.combine(previewOutputRecord, this.recordStream.previewOutputRecord(i - 1)) : previewOutputRecord;
    }

    public void processFinishedMessage(ByteArrayInputStream byteArrayInputStream) {
        TlsContext context = getContext();
        SecurityParameters securityParametersHandshake = context.getSecurityParametersHandshake();
        byte[] peerVerifyData = securityParametersHandshake.getPeerVerifyData();
        if (peerVerifyData == null) {
            throw new TlsFatalAlert((short) 80);
        }
        boolean isServer = context.isServer();
        boolean z10 = this.resumedSession;
        if ((isServer ^ z10) && (!z10 || securityParametersHandshake.isExtendedMasterSecret())) {
            securityParametersHandshake.tlsUnique = peerVerifyData;
        }
        byte[] readFully = TlsUtils.readFully(peerVerifyData.length, byteArrayInputStream);
        assertEmpty(byteArrayInputStream);
        if (!Arrays.constantTimeAreEqual(peerVerifyData, readFully)) {
            throw new TlsFatalAlert((short) 51);
        }
    }

    public short processMaxFragmentLengthExtension(Hashtable hashtable, Hashtable hashtable2, short s10) {
        short maxFragmentLengthExtension = TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable2);
        if (maxFragmentLengthExtension < 0 || (MaxFragmentLength.isValid(maxFragmentLengthExtension) && (this.resumedSession || maxFragmentLengthExtension == TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable)))) {
            return maxFragmentLengthExtension;
        }
        throw new TlsFatalAlert(s10);
    }

    public void processRecord(short s10, byte[] bArr, int i, int i9) {
        switch (s10) {
            case 20:
                processChangeCipherSpec(bArr, i, i9);
                return;
            case 21:
                this.alertQueue.addData(bArr, i, i9);
                processAlertQueue();
                return;
            case 22:
                if (this.handshakeQueue.available() > 0) {
                    this.handshakeQueue.addData(bArr, i, i9);
                    processHandshakeQueue(this.handshakeQueue);
                    return;
                }
                ByteQueue byteQueue = new ByteQueue(bArr, i, i9);
                processHandshakeQueue(byteQueue);
                int available = byteQueue.available();
                if (available > 0) {
                    this.handshakeQueue.addData(bArr, (i + i9) - available, available);
                    return;
                }
                return;
            case 23:
                if (!this.appDataReady) {
                    throw new TlsFatalAlert((short) 10);
                }
                this.applicationDataQueue.addData(bArr, i, i9);
                processApplicationDataQueue();
                return;
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public void raiseAlertFatal(short s10, String str, Throwable th) {
        getPeer().notifyAlertRaised((short) 2, s10, str, th);
        try {
            this.recordStream.writeRecord((short) 21, new byte[]{2, (byte) s10}, 0, 2);
        } catch (Exception unused) {
        }
    }

    public void raiseAlertWarning(short s10, String str) {
        getPeer().notifyAlertRaised((short) 1, s10, str, null);
        safeWriteRecord((short) 21, new byte[]{1, (byte) s10}, 0, 2);
    }

    public int readApplicationData(byte[] bArr, int i, int i9) {
        if (i9 < 1) {
            return 0;
        }
        while (this.applicationDataQueue.available() == 0) {
            if (this.closed) {
                if (this.failedWithError) {
                    throw new IOException("Cannot read application data on failed TLS connection");
                }
                return -1;
            }
            if (!this.appDataReady) {
                throw new IllegalStateException("Cannot read application data until initial handshake completed.");
            }
            safeReadRecord();
        }
        int min = Math.min(i9, this.applicationDataQueue.available());
        this.applicationDataQueue.removeData(bArr, i, min, 0);
        return min;
    }

    public int readInput(byte[] bArr, int i, int i9) {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use readInput() in blocking mode! Use getInputStream() instead.");
        }
        int min = Math.min(i9, this.applicationDataQueue.available());
        if (min < 1) {
            return 0;
        }
        this.applicationDataQueue.removeData(bArr, i, min, 0);
        return min;
    }

    public int readOutput(byte[] bArr, int i, int i9) {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use readOutput() in blocking mode! Use getOutputStream() instead.");
        }
        int min = Math.min(getAvailableOutputBytes(), i9);
        this.outputBuffer.getBuffer().removeData(bArr, i, min, 0);
        return min;
    }

    public void refuseRenegotiation() {
        raiseAlertWarning((short) 100, "Renegotiation not supported");
    }

    public void resumeHandshake() {
        if (!this.blocking) {
            throw new IllegalStateException("Cannot use resumeHandshake() in non-blocking mode!");
        }
        if (!isHandshaking()) {
            throw new IllegalStateException("No handshake in progress");
        }
        blockForHandshake();
    }

    public RecordPreview safePreviewRecordHeader(byte[] bArr) {
        try {
            return this.recordStream.previewRecordHeader(bArr, this.appDataReady);
        } catch (RuntimeException e10) {
            handleException((short) 80, "Failed to read record", e10);
            throw new TlsFatalAlert((short) 80, e10);
        } catch (TlsFatalAlert e11) {
            handleException(e11.getAlertDescription(), "Failed to read record", e11);
            throw e11;
        } catch (IOException e12) {
            handleException((short) 80, "Failed to read record", e12);
            throw e12;
        }
    }

    public boolean safeReadFullRecord(byte[] bArr, int i, int i9) {
        try {
            return this.recordStream.readFullRecord(bArr, i, i9);
        } catch (IOException e10) {
            handleException((short) 80, "Failed to process record", e10);
            throw e10;
        } catch (RuntimeException e11) {
            handleException((short) 80, "Failed to process record", e11);
            throw new TlsFatalAlert((short) 80, e11);
        } catch (TlsFatalAlert e12) {
            handleException(e12.getAlertDescription(), "Failed to process record", e12);
            throw e12;
        }
    }

    public void safeReadRecord() {
        try {
            if (this.recordStream.readRecord()) {
                return;
            }
            if (!this.appDataReady) {
                throw new TlsFatalAlert((short) 40);
            }
            handleFailure();
            throw new TlsNoCloseNotifyException();
        } catch (RuntimeException e10) {
            handleException((short) 80, "Failed to read record", e10);
            throw new TlsFatalAlert((short) 80, e10);
        } catch (TlsFatalAlert e11) {
            handleException(e11.getAlertDescription(), "Failed to read record", e11);
            throw e11;
        } catch (TlsFatalAlertReceived e12) {
            throw e12;
        } catch (IOException e13) {
            handleException((short) 80, "Failed to read record", e13);
            throw e13;
        }
    }

    public void safeWriteRecord(short s10, byte[] bArr, int i, int i9) {
        try {
            this.recordStream.writeRecord(s10, bArr, i, i9);
        } catch (IOException e10) {
            handleException((short) 80, "Failed to write record", e10);
            throw e10;
        } catch (RuntimeException e11) {
            handleException((short) 80, "Failed to write record", e11);
            throw new TlsFatalAlert((short) 80, e11);
        } catch (TlsFatalAlert e12) {
            handleException(e12.getAlertDescription(), "Failed to write record", e12);
            throw e12;
        }
    }

    public void sendCertificateMessage(Certificate certificate, OutputStream outputStream) {
        TlsContext context = getContext();
        SecurityParameters securityParametersHandshake = context.getSecurityParametersHandshake();
        if (securityParametersHandshake.getLocalCertificate() != null) {
            throw new TlsFatalAlert((short) 80);
        }
        if (certificate == null) {
            certificate = Certificate.EMPTY_CHAIN;
        }
        HandshakeMessage handshakeMessage = new HandshakeMessage(this, (short) 11);
        certificate.encode(context, handshakeMessage, outputStream);
        handshakeMessage.writeToRecordStream();
        securityParametersHandshake.localCertificate = certificate;
    }

    public void sendChangeCipherSpecMessage() {
        safeWriteRecord((short) 20, new byte[]{1}, 0, 1);
        this.recordStream.sentWriteCipherSpec();
    }

    public void sendFinishedMessage() {
        TlsContext context = getContext();
        SecurityParameters securityParametersHandshake = context.getSecurityParametersHandshake();
        byte[] createVerifyData = createVerifyData(context.isServer());
        securityParametersHandshake.localVerifyData = createVerifyData;
        boolean z10 = !context.isServer();
        boolean z11 = this.resumedSession;
        if ((z10 ^ z11) && (!z11 || securityParametersHandshake.isExtendedMasterSecret())) {
            securityParametersHandshake.tlsUnique = createVerifyData;
        }
        HandshakeMessage handshakeMessage = new HandshakeMessage((short) 20, createVerifyData.length);
        handshakeMessage.write(createVerifyData);
        handshakeMessage.writeToRecordStream();
    }

    public void sendSupplementalDataMessage(Vector vector) {
        HandshakeMessage handshakeMessage = new HandshakeMessage(this, (short) 23);
        writeSupplementalData(handshakeMessage, vector);
        handshakeMessage.writeToRecordStream();
    }

    public void setAppDataSplitMode(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(a.g(i, "Illegal appDataSplitMode mode: "));
        }
        this.appDataSplitMode = i;
    }

    public void setResumableHandshake(boolean z10) {
        this.resumableHandshake = z10;
    }

    public void writeApplicationData(byte[] bArr, int i, int i9) {
        if (this.closed) {
            throw new IOException("Cannot write application data on closed/failed TLS connection");
        }
        if (!this.appDataReady) {
            throw new IllegalStateException("Cannot write application data until initial handshake completed.");
        }
        while (i9 > 0) {
            if (this.appDataSplitEnabled) {
                int appDataSplitMode = getAppDataSplitMode();
                if (appDataSplitMode != 1) {
                    if (appDataSplitMode != 2) {
                        safeWriteRecord((short) 23, bArr, i, 1);
                        i++;
                        i9--;
                    } else {
                        this.appDataSplitEnabled = false;
                    }
                }
                safeWriteRecord((short) 23, TlsUtils.EMPTY_BYTES, 0, 0);
            }
            if (i9 > 0) {
                int min = Math.min(i9, this.recordStream.getPlaintextLimit());
                safeWriteRecord((short) 23, bArr, i, min);
                i += min;
                i9 -= min;
            }
        }
    }

    public void writeHandshakeMessage(byte[] bArr, int i, int i9) {
        if (i9 < 4) {
            throw new TlsFatalAlert((short) 80);
        }
        if (TlsUtils.readUint8(bArr, i) != 0) {
            this.recordStream.getHandshakeHashUpdater().write(bArr, i, i9);
        }
        int i10 = 0;
        do {
            int min = Math.min(i9 - i10, this.recordStream.getPlaintextLimit());
            safeWriteRecord((short) 22, bArr, i + i10, min);
            i10 += min;
        } while (i10 < i9);
    }

    public TlsProtocol(InputStream inputStream, OutputStream outputStream) {
        this.applicationDataQueue = new ByteQueue(0);
        this.alertQueue = new ByteQueue(2);
        this.handshakeQueue = new ByteQueue(0);
        this.tlsInputStream = null;
        this.tlsOutputStream = null;
        this.closed = false;
        this.failedWithError = false;
        this.appDataReady = false;
        this.appDataSplitEnabled = true;
        this.resumableHandshake = false;
        this.appDataSplitMode = 0;
        this.tlsSession = null;
        this.sessionParameters = null;
        this.offeredCipherSuites = null;
        this.clientExtensions = null;
        this.serverExtensions = null;
        this.connection_state = (short) 0;
        this.resumedSession = false;
        this.receivedChangeCipherSpec = false;
        this.allowCertificateStatus = false;
        this.expectSessionTicket = false;
        this.blocking = true;
        this.recordStream = new RecordStream(this, inputStream, outputStream);
    }

    public void offerInput(byte[] bArr, int i, int i9) {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use offerInput() in blocking mode! Use getInputStream() instead.");
        }
        if (this.closed) {
            throw new IOException("Connection is closed, cannot accept any more input");
        }
        if (this.inputBuffers.available() == 0 && safeReadFullRecord(bArr, i, i9)) {
            if (this.closed && this.connection_state != 16) {
                throw new TlsFatalAlert((short) 80);
            }
            return;
        }
        this.inputBuffers.addBytes(bArr, i, i9);
        while (this.inputBuffers.available() >= 5) {
            byte[] bArr2 = new byte[5];
            if (5 != this.inputBuffers.peek(bArr2)) {
                throw new TlsFatalAlert((short) 80);
            }
            if (this.inputBuffers.available() < safePreviewRecordHeader(bArr2).getRecordSize()) {
                return;
            }
            safeReadRecord();
            if (this.closed) {
                if (this.connection_state != 16) {
                    throw new TlsFatalAlert((short) 80);
                }
                return;
            }
        }
    }

    private void processApplicationDataQueue() {
    }

    public void handleChangeCipherSpecMessage() {
    }
}
