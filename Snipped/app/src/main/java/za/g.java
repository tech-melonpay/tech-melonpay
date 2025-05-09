package za;

import Ca.k;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import za.e;

/* compiled from: RealConnectionPool.kt */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public final long f31405b;

    /* renamed from: c, reason: collision with root package name */
    public final ya.c f31406c;

    /* renamed from: a, reason: collision with root package name */
    public final int f31404a = 5;

    /* renamed from: d, reason: collision with root package name */
    public final k f31407d = new k(this, androidx.camera.core.impl.utils.a.n(new StringBuilder(), wa.b.f30878g, " ConnectionPool"), 3);

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue<okhttp3.internal.connection.a> f31408e = new ConcurrentLinkedQueue<>();

    public g(ya.d dVar, TimeUnit timeUnit) {
        this.f31405b = timeUnit.toNanos(5L);
        this.f31406c = dVar.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0017, code lost:
    
        if (r1.f24604g != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(okhttp3.a r4, za.e r5, java.util.ArrayList r6, boolean r7) {
        /*
            r3 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.a> r0 = r3.f31408e
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.a r1 = (okhttp3.internal.connection.a) r1
            monitor-enter(r1)
            if (r7 == 0) goto L19
            Ca.d r2 = r1.f24604g     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
        L19:
            boolean r2 = r1.h(r4, r6)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            r5.b(r1)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            r4 = 1
            return r4
        L25:
            r4 = move-exception
            goto L2b
        L27:
            O9.p r2 = O9.p.f3034a     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            goto L6
        L2b:
            monitor-exit(r1)
            throw r4
        L2d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: za.g.a(okhttp3.a, za.e, java.util.ArrayList, boolean):boolean");
    }

    public final int b(okhttp3.internal.connection.a aVar, long j10) {
        byte[] bArr = wa.b.f30872a;
        ArrayList arrayList = aVar.f24612p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + aVar.f24599b.f30764a.i + " was leaked. Did you forget to close a response body?";
                Ea.h hVar = Ea.h.f1121a;
                Ea.h.f1121a.k(((e.b) reference).f31401a, str);
                arrayList.remove(i);
                aVar.f24606j = true;
                if (arrayList.isEmpty()) {
                    aVar.f24613q = j10 - this.f31405b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
