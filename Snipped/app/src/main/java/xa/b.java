package xa;

import Ka.f;
import Ka.h;
import Ka.i;
import Ka.s;
import Ka.y;
import Ka.z;
import java.io.IOException;
import okhttp3.b;

/* compiled from: CacheInterceptor.kt */
/* loaded from: classes2.dex */
public final class b implements y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f30950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f30951c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f30952d;

    public b(i iVar, b.d dVar, s sVar) {
        this.f30950b = iVar;
        this.f30951c = dVar;
        this.f30952d = sVar;
    }

    @Override // Ka.y
    public final z b() {
        return this.f30950b.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (wa.b.t(r2, 100, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L7;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r2 = this;
            boolean r0 = r2.f30949a
            if (r0 != 0) goto L16
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 100
            boolean r0 = wa.b.t(r2, r1, r0)     // Catch: java.io.IOException -> Le
            if (r0 != 0) goto L16
        Le:
            r0 = 1
            r2.f30949a = r0
            xa.c r0 = r2.f30951c
            r0.a()
        L16:
            Ka.i r0 = r2.f30950b
            r0.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.b.close():void");
    }

    @Override // Ka.y
    public final long i0(f fVar, long j10) {
        try {
            long i02 = this.f30950b.i0(fVar, j10);
            h hVar = this.f30952d;
            if (i02 != -1) {
                fVar.p(hVar.getBuffer(), fVar.f2294b - i02, i02);
                hVar.v();
                return i02;
            }
            if (!this.f30949a) {
                this.f30949a = true;
                hVar.close();
            }
            return -1L;
        } catch (IOException e10) {
            if (!this.f30949a) {
                this.f30949a = true;
                this.f30951c.a();
            }
            throw e10;
        }
    }
}
