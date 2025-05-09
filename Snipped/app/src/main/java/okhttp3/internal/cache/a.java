package okhttp3.internal.cache;

import Ka.l;
import Ka.y;
import O9.p;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes2.dex */
public final class a extends l {

    /* renamed from: b, reason: collision with root package name */
    public boolean f24590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f24591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache.a f24592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y yVar, DiskLruCache diskLruCache, DiskLruCache.a aVar) {
        super(yVar);
        this.f24591c = diskLruCache;
        this.f24592d = aVar;
    }

    @Override // Ka.l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.f24590b) {
            return;
        }
        this.f24590b = true;
        DiskLruCache diskLruCache = this.f24591c;
        DiskLruCache.a aVar = this.f24592d;
        synchronized (diskLruCache) {
            try {
                int i = aVar.f24583h - 1;
                aVar.f24583h = i;
                if (i == 0 && aVar.f24581f) {
                    diskLruCache.H(aVar);
                }
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
