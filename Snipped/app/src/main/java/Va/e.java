package va;

import O9.p;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import za.e;

/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public ExecutorService f30691c;

    /* renamed from: a, reason: collision with root package name */
    public int f30689a = 64;

    /* renamed from: b, reason: collision with root package name */
    public int f30690b = 5;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<e.a> f30692d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque<e.a> f30693e = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque<za.e> f30694f = new ArrayDeque<>();

    public final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            p pVar = p.f3034a;
        }
        c();
    }

    public final void b(e.a aVar) {
        aVar.f31399b.decrementAndGet();
        a(this.f30693e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: va.e.c():void");
    }
}
