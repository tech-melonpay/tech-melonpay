package Ca;

import C.v;
import Ca.b;
import Ka.y;
import Ka.z;
import ha.C0804c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.ISO7816;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;

/* compiled from: Http2Reader.kt */
/* loaded from: classes2.dex */
public final class m implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f803e = Logger.getLogger(Ca.c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Ka.i f804a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f805b;

    /* renamed from: c, reason: collision with root package name */
    public final b f806c;

    /* renamed from: d, reason: collision with root package name */
    public final b.a f807d;

    /* compiled from: Http2Reader.kt */
    public static final class a {
        public static int a(int i, int i9, int i10) {
            if ((i9 & 8) != 0) {
                i--;
            }
            if (i10 <= i) {
                return i - i10;
            }
            throw new IOException(v.k(i10, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        }
    }

    /* compiled from: Http2Reader.kt */
    public interface c {
        void a(int i, List list);

        void b(int i, ByteString byteString);

        void c(int i, long j10);

        void d(int i, int i9, boolean z10);

        void e(r rVar);

        void f(int i, ErrorCode errorCode);

        void g(int i, List list, boolean z10);

        void i(boolean z10, int i, Ka.i iVar, int i9);
    }

    public m(Ka.i iVar, boolean z10) {
        this.f804a = iVar;
        this.f805b = z10;
        b bVar = new b(iVar);
        this.f806c = bVar;
        this.f807d = new b.a(bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f804a.close();
    }

    public final boolean d(boolean z10, c cVar) {
        ErrorCode errorCode;
        int readInt;
        Ka.i iVar = this.f804a;
        int i = 0;
        int i9 = 0;
        try {
            iVar.h0(9L);
            int s10 = wa.b.s(iVar);
            if (s10 > 16384) {
                throw new IOException(com.google.android.gms.measurement.internal.a.g(s10, "FRAME_SIZE_ERROR: "));
            }
            int readByte = iVar.readByte() & 255;
            byte readByte2 = iVar.readByte();
            int i10 = readByte2 & 255;
            int readInt2 = iVar.readInt() & Integer.MAX_VALUE;
            Level level = Level.FINE;
            Logger logger = f803e;
            if (logger.isLoggable(level)) {
                Ca.c.f723a.getClass();
                logger.fine(Ca.c.a(readInt2, s10, readByte, i10, true));
            }
            if (z10 && readByte != 4) {
                StringBuilder sb2 = new StringBuilder("Expected a SETTINGS frame but was ");
                Ca.c.f723a.getClass();
                String[] strArr = Ca.c.f725c;
                sb2.append(readByte < strArr.length ? strArr[readByte] : wa.b.h("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb2.toString());
            }
            ErrorCode errorCode2 = null;
            switch (readByte) {
                case 0:
                    if (readInt2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z11 = (readByte2 & 1) != 0;
                    if ((readByte2 & ISO7816.INS_VERIFY) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int readByte3 = (8 & readByte2) != 0 ? iVar.readByte() & 255 : 0;
                    cVar.i(z11, readInt2, iVar, a.a(s10, i10, readByte3));
                    iVar.skip(readByte3);
                    return true;
                case 1:
                    if (readInt2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z12 = (readByte2 & 1) != 0;
                    int readByte4 = (8 & readByte2) != 0 ? iVar.readByte() & 255 : 0;
                    if ((readByte2 & ISO7816.INS_VERIFY) != 0) {
                        p(cVar, readInt2);
                        s10 -= 5;
                    }
                    cVar.g(readInt2, j(a.a(s10, i10, readByte4), readByte4, i10, readInt2), z12);
                    return true;
                case 2:
                    if (s10 != 5) {
                        throw new IOException(s3.b.i("TYPE_PRIORITY length: ", s10, " != 5"));
                    }
                    if (readInt2 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    p(cVar, readInt2);
                    return true;
                case 3:
                    if (s10 != 4) {
                        throw new IOException(s3.b.i("TYPE_RST_STREAM length: ", s10, " != 4"));
                    }
                    if (readInt2 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int readInt3 = iVar.readInt();
                    ErrorCode[] values = ErrorCode.values();
                    int length = values.length;
                    while (true) {
                        if (i9 < length) {
                            errorCode = values[i9];
                            if (errorCode.f24622a != readInt3) {
                                i9++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(com.google.android.gms.measurement.internal.a.g(readInt3, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    cVar.f(readInt2, errorCode);
                    return true;
                case 4:
                    if (readInt2 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) != 0) {
                        if (s10 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        cVar.getClass();
                    } else {
                        if (s10 % 6 != 0) {
                            throw new IOException(com.google.android.gms.measurement.internal.a.g(s10, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        r rVar = new r();
                        C0804c U = ha.h.U(ha.h.V(0, s10), 6);
                        int i11 = U.f21226a;
                        int i12 = U.f21227b;
                        int i13 = U.f21228c;
                        if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                            while (true) {
                                short readShort = iVar.readShort();
                                byte[] bArr = wa.b.f30872a;
                                int i14 = readShort & 65535;
                                readInt = iVar.readInt();
                                if (i14 != 2) {
                                    if (i14 == 3) {
                                        i14 = 4;
                                    } else if (i14 != 4) {
                                        if (i14 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                        }
                                    } else {
                                        if (readInt < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i14 = 7;
                                    }
                                } else if (readInt != 0 && readInt != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                rVar.b(i14, readInt);
                                if (i11 != i12) {
                                    i11 += i13;
                                }
                            }
                            throw new IOException(com.google.android.gms.measurement.internal.a.g(readInt, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                        cVar.e(rVar);
                    }
                    return true;
                case 5:
                    if (readInt2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int readByte5 = (readByte2 & 8) != 0 ? iVar.readByte() & 255 : 0;
                    cVar.a(iVar.readInt() & Integer.MAX_VALUE, j(a.a(s10 - 4, i10, readByte5), readByte5, i10, readInt2));
                    return true;
                case 6:
                    if (s10 != 8) {
                        throw new IOException(com.google.android.gms.measurement.internal.a.g(s10, "TYPE_PING length != 8: "));
                    }
                    if (readInt2 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    cVar.d(iVar.readInt(), iVar.readInt(), (readByte2 & 1) != 0);
                    return true;
                case 7:
                    if (s10 < 8) {
                        throw new IOException(com.google.android.gms.measurement.internal.a.g(s10, "TYPE_GOAWAY length < 8: "));
                    }
                    if (readInt2 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int readInt4 = iVar.readInt();
                    int readInt5 = iVar.readInt();
                    int i15 = s10 - 8;
                    ErrorCode[] values2 = ErrorCode.values();
                    int length2 = values2.length;
                    while (true) {
                        if (i < length2) {
                            ErrorCode errorCode3 = values2[i];
                            if (errorCode3.f24622a == readInt5) {
                                errorCode2 = errorCode3;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (errorCode2 == null) {
                        throw new IOException(com.google.android.gms.measurement.internal.a.g(readInt5, "TYPE_GOAWAY unexpected error code: "));
                    }
                    ByteString byteString = ByteString.f24696d;
                    if (i15 > 0) {
                        byteString = iVar.h(i15);
                    }
                    cVar.b(readInt4, byteString);
                    return true;
                case 8:
                    if (s10 != 4) {
                        throw new IOException(com.google.android.gms.measurement.internal.a.g(s10, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long readInt6 = iVar.readInt() & 2147483647L;
                    if (readInt6 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    cVar.c(readInt2, readInt6);
                    return true;
                default:
                    iVar.skip(s10);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void i(c cVar) {
        if (this.f805b) {
            if (!d(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ByteString byteString = Ca.c.f724b;
        ByteString h9 = this.f804a.h(byteString.com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String.length);
        Level level = Level.FINE;
        Logger logger = f803e;
        if (logger.isLoggable(level)) {
            logger.fine(wa.b.h("<< CONNECTION " + h9.e(), new Object[0]));
        }
        if (!kotlin.jvm.internal.f.b(byteString, h9)) {
            throw new IOException("Expected a connection header but was ".concat(h9.k()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f708a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<Ca.a> j(int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ca.m.j(int, int, int, int):java.util.List");
    }

    public final void p(c cVar, int i) {
        Ka.i iVar = this.f804a;
        iVar.readInt();
        iVar.readByte();
        byte[] bArr = wa.b.f30872a;
        cVar.getClass();
    }

    /* compiled from: Http2Reader.kt */
    public static final class b implements y {

        /* renamed from: a, reason: collision with root package name */
        public final Ka.i f808a;

        /* renamed from: b, reason: collision with root package name */
        public int f809b;

        /* renamed from: c, reason: collision with root package name */
        public int f810c;

        /* renamed from: d, reason: collision with root package name */
        public int f811d;

        /* renamed from: e, reason: collision with root package name */
        public int f812e;

        /* renamed from: f, reason: collision with root package name */
        public int f813f;

        public b(Ka.i iVar) {
            this.f808a = iVar;
        }

        @Override // Ka.y
        public final z b() {
            return this.f808a.b();
        }

        @Override // Ka.y
        public final long i0(Ka.f fVar, long j10) {
            int i;
            int readInt;
            do {
                int i9 = this.f812e;
                Ka.i iVar = this.f808a;
                if (i9 != 0) {
                    long i02 = iVar.i0(fVar, Math.min(j10, i9));
                    if (i02 == -1) {
                        return -1L;
                    }
                    this.f812e -= (int) i02;
                    return i02;
                }
                iVar.skip(this.f813f);
                this.f813f = 0;
                if ((this.f810c & 4) != 0) {
                    return -1L;
                }
                i = this.f811d;
                int s10 = wa.b.s(iVar);
                this.f812e = s10;
                this.f809b = s10;
                int readByte = iVar.readByte() & 255;
                this.f810c = iVar.readByte() & 255;
                Logger logger = m.f803e;
                if (logger.isLoggable(Level.FINE)) {
                    Ca.c cVar = Ca.c.f723a;
                    int i10 = this.f811d;
                    int i11 = this.f809b;
                    int i12 = this.f810c;
                    cVar.getClass();
                    logger.fine(Ca.c.a(i10, i11, readByte, i12, true));
                }
                readInt = iVar.readInt() & Integer.MAX_VALUE;
                this.f811d = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } while (readInt == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
