package Ca;

import Ca.b;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: Http2Writer.kt */
/* loaded from: classes2.dex */
public final class o implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f838g = Logger.getLogger(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Ka.h f839a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f840b;

    /* renamed from: c, reason: collision with root package name */
    public final Ka.f f841c;

    /* renamed from: d, reason: collision with root package name */
    public int f842d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f843e;

    /* renamed from: f, reason: collision with root package name */
    public final b.C0008b f844f;

    public o(Ka.h hVar, boolean z10) {
        this.f839a = hVar;
        this.f840b = z10;
        Ka.f fVar = new Ka.f();
        this.f841c = fVar;
        this.f842d = 16384;
        this.f844f = new b.C0008b(fVar);
    }

    public final synchronized void A(int i, ErrorCode errorCode) {
        if (this.f843e) {
            throw new IOException("closed");
        }
        if (errorCode.f24622a == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        j(i, 4, 3, 0);
        this.f839a.o(errorCode.f24622a);
        this.f839a.flush();
    }

    public final synchronized void C(int i, long j10) {
        if (this.f843e) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        j(i, 4, 8, 0);
        this.f839a.o((int) j10);
        this.f839a.flush();
    }

    public final void D(int i, long j10) {
        while (j10 > 0) {
            long min = Math.min(this.f842d, j10);
            j10 -= min;
            j(i, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f839a.z(this.f841c, min);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f843e = true;
        this.f839a.close();
    }

    public final synchronized void d(r rVar) {
        try {
            if (this.f843e) {
                throw new IOException("closed");
            }
            int i = this.f842d;
            int i9 = rVar.f852a;
            if ((i9 & 32) != 0) {
                i = rVar.f853b[5];
            }
            this.f842d = i;
            if (((i9 & 2) != 0 ? rVar.f853b[1] : -1) != -1) {
                b.C0008b c0008b = this.f844f;
                int i10 = (i9 & 2) != 0 ? rVar.f853b[1] : -1;
                c0008b.getClass();
                int min = Math.min(i10, 16384);
                int i11 = c0008b.f719e;
                if (i11 != min) {
                    if (min < i11) {
                        c0008b.f717c = Math.min(c0008b.f717c, min);
                    }
                    c0008b.f718d = true;
                    c0008b.f719e = min;
                    int i12 = c0008b.i;
                    if (min < i12) {
                        if (min == 0) {
                            P9.i.k(c0008b.f720f, null);
                            c0008b.f721g = c0008b.f720f.length - 1;
                            c0008b.f722h = 0;
                            c0008b.i = 0;
                        } else {
                            c0008b.a(i12 - min);
                        }
                    }
                }
            }
            j(0, 0, 4, 1);
            this.f839a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (this.f843e) {
            throw new IOException("closed");
        }
        this.f839a.flush();
    }

    public final synchronized void i(boolean z10, int i, Ka.f fVar, int i9) {
        if (this.f843e) {
            throw new IOException("closed");
        }
        j(i, i9, 0, z10 ? 1 : 0);
        if (i9 > 0) {
            this.f839a.z(fVar, i9);
        }
    }

    public final void j(int i, int i9, int i10, int i11) {
        Level level = Level.FINE;
        Logger logger = f838g;
        if (logger.isLoggable(level)) {
            c.f723a.getClass();
            logger.fine(c.a(i, i9, i10, i11, false));
        }
        if (i9 > this.f842d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f842d + ": " + i9).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "reserved bit set: ").toString());
        }
        byte[] bArr = wa.b.f30872a;
        Ka.h hVar = this.f839a;
        hVar.s((i9 >>> 16) & 255);
        hVar.s((i9 >>> 8) & 255);
        hVar.s(i9 & 255);
        hVar.s(i10 & 255);
        hVar.s(i11 & 255);
        hVar.o(i & Integer.MAX_VALUE);
    }

    public final synchronized void p(int i, ErrorCode errorCode, byte[] bArr) {
        try {
            if (this.f843e) {
                throw new IOException("closed");
            }
            if (errorCode.f24622a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            j(0, bArr.length + 8, 7, 0);
            this.f839a.o(i);
            this.f839a.o(errorCode.f24622a);
            if (!(bArr.length == 0)) {
                this.f839a.X(bArr);
            }
            this.f839a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void y(int i, int i9, boolean z10) {
        if (this.f843e) {
            throw new IOException("closed");
        }
        j(0, 8, 6, z10 ? 1 : 0);
        this.f839a.o(i);
        this.f839a.o(i9);
        this.f839a.flush();
    }
}
