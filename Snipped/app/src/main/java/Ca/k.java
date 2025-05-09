package Ca;

import Ka.s;
import ca.InterfaceC0635a;
import java.io.IOException;
import java.util.Iterator;
import okhttp3.internal.cache.DiskLruCache;
import ya.AbstractC1633a;

/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class k extends AbstractC1633a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f794f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, String str, int i) {
        super(str, true);
        this.f793e = i;
        this.f794f = obj;
    }

    @Override // ya.AbstractC1633a
    public final long a() {
        int i = 0;
        switch (this.f793e) {
            case 0:
                d dVar = (d) this.f794f;
                dVar.getClass();
                try {
                    dVar.f753y.y(2, 0, false);
                } catch (IOException e10) {
                    dVar.i(e10);
                }
                return -1L;
            case 1:
                DiskLruCache diskLruCache = (DiskLruCache) this.f794f;
                synchronized (diskLruCache) {
                    if (diskLruCache.f24563m && !diskLruCache.f24564n) {
                        try {
                            diskLruCache.M();
                        } catch (IOException unused) {
                            diskLruCache.f24565o = true;
                        }
                        try {
                            if (diskLruCache.A()) {
                                diskLruCache.G();
                                diskLruCache.f24560j = 0;
                            }
                        } catch (IOException unused2) {
                            diskLruCache.f24566p = true;
                            diskLruCache.f24559h = new s(new Ka.e());
                        }
                    }
                }
                return -1L;
            case 2:
                ((InterfaceC0635a) this.f794f).invoke();
                return -1L;
            default:
                za.g gVar = (za.g) this.f794f;
                long nanoTime = System.nanoTime();
                Iterator<okhttp3.internal.connection.a> it = gVar.f31408e.iterator();
                long j10 = Long.MIN_VALUE;
                okhttp3.internal.connection.a aVar = null;
                int i9 = 0;
                while (it.hasNext()) {
                    okhttp3.internal.connection.a next = it.next();
                    synchronized (next) {
                        if (gVar.b(next, nanoTime) > 0) {
                            i9++;
                        } else {
                            i++;
                            long j11 = nanoTime - next.f24613q;
                            if (j11 > j10) {
                                aVar = next;
                                j10 = j11;
                            }
                            O9.p pVar = O9.p.f3034a;
                        }
                    }
                }
                long j12 = gVar.f31405b;
                if (j10 < j12 && i <= gVar.f31404a) {
                    if (i > 0) {
                        return j12 - j10;
                    }
                    if (i9 > 0) {
                        return j12;
                    }
                    return -1L;
                }
                synchronized (aVar) {
                    if (!aVar.f24612p.isEmpty()) {
                        return 0L;
                    }
                    if (aVar.f24613q + j10 != nanoTime) {
                        return 0L;
                    }
                    aVar.f24606j = true;
                    gVar.f31408e.remove(aVar);
                    wa.b.d(aVar.f24601d);
                    if (!gVar.f31408e.isEmpty()) {
                        return 0L;
                    }
                    gVar.f31406c.a();
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, Object obj, int i) {
        super(str, true);
        this.f793e = i;
        this.f794f = obj;
    }
}
