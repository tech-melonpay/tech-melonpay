package t9;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import r9.C1160a;
import s9.C1243a;

/* compiled from: Schedulers.java */
/* renamed from: t9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1492a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29969a = 0;

    /* compiled from: Schedulers.java */
    /* renamed from: t9.a$a, reason: collision with other inner class name */
    public static final class C0473a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1160a f29970a = new C1160a();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: t9.a$b */
    public static final class b implements Callable<j9.h> {
        @Override // java.util.concurrent.Callable
        public final j9.h call() {
            return C0473a.f29970a;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: t9.a$c */
    public static final class c implements Callable<j9.h> {
        @Override // java.util.concurrent.Callable
        public final j9.h call() {
            return d.f29971a;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: t9.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final r9.c f29971a = new r9.c();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: t9.a$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final r9.d f29972a = new r9.d();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: t9.a$f */
    public static final class f implements Callable<j9.h> {
        @Override // java.util.concurrent.Callable
        public final j9.h call() {
            return e.f29972a;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: t9.a$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final r9.g f29973a;

        static {
            r9.g gVar = new r9.g();
            AtomicReference atomicReference = new AtomicReference();
            boolean z10 = r9.f.f26341a;
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, r9.g.f26345a);
            if (r9.f.f26341a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
                r9.f.f26344d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
            }
            atomicReference.lazySet(newScheduledThreadPool);
            f29973a = gVar;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: t9.a$h */
    public static final class h implements Callable<j9.h> {
        @Override // java.util.concurrent.Callable
        public final j9.h call() {
            return g.f29973a;
        }
    }

    static {
        C1243a.a(new h());
        C1243a.a(new b());
        C1243a.a(new c());
        int i = r9.h.f26346a;
        C1243a.a(new f());
    }
}
