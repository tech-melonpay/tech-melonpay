package Ia;

import Ka.f;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import okio.ByteString;
import org.jmrtd.PassportService;

/* compiled from: WebSocketReader.kt */
/* loaded from: classes2.dex */
public final class i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1996a;

    /* renamed from: b, reason: collision with root package name */
    public final Ka.i f1997b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1998c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1999d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2000e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2001f;

    /* renamed from: g, reason: collision with root package name */
    public int f2002g;

    /* renamed from: h, reason: collision with root package name */
    public long f2003h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2004j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2005k;

    /* renamed from: l, reason: collision with root package name */
    public final Ka.f f2006l = new Ka.f();

    /* renamed from: m, reason: collision with root package name */
    public final Ka.f f2007m = new Ka.f();

    /* renamed from: n, reason: collision with root package name */
    public c f2008n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f2009o;

    /* renamed from: p, reason: collision with root package name */
    public final f.a f2010p;

    /* compiled from: WebSocketReader.kt */
    public interface a {
        void b(ByteString byteString);

        void c(String str);

        void d(ByteString byteString);

        void f();

        void g(int i, String str);
    }

    public i(boolean z10, Ka.i iVar, d dVar, boolean z11, boolean z12) {
        this.f1996a = z10;
        this.f1997b = iVar;
        this.f1998c = dVar;
        this.f1999d = z11;
        this.f2000e = z12;
        this.f2009o = z10 ? null : new byte[4];
        this.f2010p = z10 ? null : new f.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c cVar = this.f2008n;
        if (cVar != null) {
            cVar.close();
        }
    }

    public final void d() {
        short s10;
        String str;
        long j10 = this.f2003h;
        Ka.f fVar = this.f2006l;
        if (j10 > 0) {
            this.f1997b.J(fVar, j10);
            if (!this.f1996a) {
                f.a aVar = this.f2010p;
                fVar.D(aVar);
                aVar.i(0L);
                h.a(aVar, this.f2009o);
                aVar.close();
            }
        }
        int i = this.f2002g;
        a aVar2 = this.f1998c;
        switch (i) {
            case 8:
                long j11 = fVar.f2294b;
                if (j11 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j11 != 0) {
                    s10 = fVar.readShort();
                    str = fVar.M();
                    String g10 = (s10 < 1000 || s10 >= 5000) ? com.google.android.gms.measurement.internal.a.g(s10, "Code must be in range [1000,5000): ") : ((1004 > s10 || s10 >= 1007) && (1015 > s10 || s10 >= 3000)) ? null : s3.b.i("Code ", s10, " is reserved and may not be used.");
                    if (g10 != null) {
                        throw new ProtocolException(g10);
                    }
                } else {
                    s10 = 1005;
                    str = "";
                }
                aVar2.g(s10, str);
                this.f2001f = true;
                return;
            case 9:
                aVar2.d(fVar.h(fVar.f2294b));
                return;
            case 10:
                fVar.h(fVar.f2294b);
                aVar2.f();
                return;
            default:
                int i9 = this.f2002g;
                byte[] bArr = wa.b.f30872a;
                throw new ProtocolException("Unknown control opcode: ".concat(Integer.toHexString(i9)));
        }
    }

    public final void i() {
        boolean z10;
        if (this.f2001f) {
            throw new IOException("closed");
        }
        Ka.i iVar = this.f1997b;
        long h9 = iVar.b().h();
        iVar.b().b();
        try {
            byte readByte = iVar.readByte();
            byte[] bArr = wa.b.f30872a;
            iVar.b().g(h9, TimeUnit.NANOSECONDS);
            int i = readByte & PassportService.SFI_DG15;
            this.f2002g = i;
            boolean z11 = (readByte & ISOFileInfo.DATA_BYTES1) != 0;
            this.i = z11;
            boolean z12 = (readByte & 8) != 0;
            this.f2004j = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (readByte & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.f1999d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.f2005k = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((readByte & ISO7816.INS_VERIFY) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((readByte & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte readByte2 = iVar.readByte();
            boolean z14 = (readByte2 & ISOFileInfo.DATA_BYTES1) != 0;
            boolean z15 = this.f1996a;
            if (z14 == z15) {
                throw new ProtocolException(z15 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j10 = readByte2 & Byte.MAX_VALUE;
            this.f2003h = j10;
            if (j10 == 126) {
                this.f2003h = iVar.readShort() & 65535;
            } else if (j10 == 127) {
                long readLong = iVar.readLong();
                this.f2003h = readLong;
                if (readLong < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f2003h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f2004j && this.f2003h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z14) {
                iVar.readFully(this.f2009o);
            }
        } catch (Throwable th) {
            iVar.b().g(h9, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
