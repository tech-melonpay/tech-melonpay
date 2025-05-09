package za;

import java.io.IOException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import va.k;
import za.h;

/* compiled from: ExchangeFinder.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final g f31372a;

    /* renamed from: b, reason: collision with root package name */
    public final okhttp3.a f31373b;

    /* renamed from: c, reason: collision with root package name */
    public final e f31374c;

    /* renamed from: d, reason: collision with root package name */
    public final va.f f31375d;

    /* renamed from: e, reason: collision with root package name */
    public h.a f31376e;

    /* renamed from: f, reason: collision with root package name */
    public h f31377f;

    /* renamed from: g, reason: collision with root package name */
    public int f31378g;

    /* renamed from: h, reason: collision with root package name */
    public int f31379h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public k f31380j;

    public d(g gVar, okhttp3.a aVar, e eVar, va.f fVar) {
        this.f31372a = gVar;
        this.f31373b = aVar;
        this.f31374c = eVar;
        this.f31375d = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.internal.connection.a a(int r15, int r16, int r17, int r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: za.d.a(int, int, int, int, boolean, boolean):okhttp3.internal.connection.a");
    }

    public final void b(IOException iOException) {
        this.f31380j = null;
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).f24623a == ErrorCode.REFUSED_STREAM) {
                this.f31378g++;
                return;
            }
        }
        if (iOException instanceof ConnectionShutdownException) {
            this.f31379h++;
        } else {
            this.i++;
        }
    }
}
