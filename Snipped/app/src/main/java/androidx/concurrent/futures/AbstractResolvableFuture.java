package androidx.concurrent.futures;

import a3.InterfaceFutureC0509a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class AbstractResolvableFuture<V> implements InterfaceFutureC0509a<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5905d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f5906e = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final a f5907f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5908g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5909a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f5910b;

    /* renamed from: c, reason: collision with root package name */
    public volatile g f5911c;

    public static final class Failure {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f5912a;

        /* renamed from: androidx.concurrent.futures.AbstractResolvableFuture$Failure$1, reason: invalid class name */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));
        }

        public Failure(Throwable th) {
            boolean z10 = AbstractResolvableFuture.f5905d;
            th.getClass();
            this.f5912a = th;
        }
    }

    public static abstract class a {
        public abstract boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, c cVar, c cVar2);

        public abstract boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, g gVar, g gVar2);

        public abstract void d(g gVar, g gVar2);

        public abstract void e(g gVar, Thread thread);
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5913b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f5914c;

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f5915a;

        static {
            if (AbstractResolvableFuture.f5905d) {
                f5914c = null;
                f5913b = null;
            } else {
                f5914c = new b(null, false);
                f5913b = new b(null, true);
            }
        }

        public b(Throwable th, boolean z10) {
            this.f5915a = th;
        }
    }

    public static final class c {

        /* renamed from: d, reason: collision with root package name */
        public static final c f5916d = new c(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f5917a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f5918b;

        /* renamed from: c, reason: collision with root package name */
        public c f5919c;

        public c(Runnable runnable, Executor executor) {
            this.f5917a = runnable;
            this.f5918b = executor;
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, Thread> f5920a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, g> f5921b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> f5922c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> f5923d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> f5924e;

        public d(AtomicReferenceFieldUpdater<g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<g, g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            this.f5920a = atomicReferenceFieldUpdater;
            this.f5921b = atomicReferenceFieldUpdater2;
            this.f5922c = atomicReferenceFieldUpdater3;
            this.f5923d = atomicReferenceFieldUpdater4;
            this.f5924e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, c cVar, c cVar2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f5923d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, cVar, cVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == cVar);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f5924e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, g gVar, g gVar2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f5922c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, gVar, gVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == gVar);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void d(g gVar, g gVar2) {
            this.f5921b.lazySet(gVar, gVar2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void e(g gVar, Thread thread) {
            this.f5920a.lazySet(gVar, thread);
        }
    }

    public static final class e<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class f extends a {
        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, c cVar, c cVar2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f5910b != cVar) {
                        return false;
                    }
                    abstractResolvableFuture.f5910b = cVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f5909a != obj) {
                        return false;
                    }
                    abstractResolvableFuture.f5909a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, g gVar, g gVar2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f5911c != gVar) {
                        return false;
                    }
                    abstractResolvableFuture.f5911c = gVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void d(g gVar, g gVar2) {
            gVar.f5927b = gVar2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void e(g gVar, Thread thread) {
            gVar.f5926a = thread;
        }
    }

    public static final class g {

        /* renamed from: c, reason: collision with root package name */
        public static final g f5925c = new g();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f5926a;

        /* renamed from: b, reason: collision with root package name */
        public volatile g f5927b;

        public g() {
            AbstractResolvableFuture.f5907f.e(this, Thread.currentThread());
        }
    }

    static {
        a fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f5907f = fVar;
        if (th != null) {
            f5906e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5908g = new Object();
    }

    public static void b(AbstractResolvableFuture<?> abstractResolvableFuture) {
        g gVar;
        c cVar;
        do {
            gVar = abstractResolvableFuture.f5911c;
        } while (!f5907f.c(abstractResolvableFuture, gVar, g.f5925c));
        while (gVar != null) {
            Thread thread = gVar.f5926a;
            if (thread != null) {
                gVar.f5926a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f5927b;
        }
        do {
            cVar = abstractResolvableFuture.f5910b;
        } while (!f5907f.a(abstractResolvableFuture, cVar, c.f5916d));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f5919c;
            cVar.f5919c = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            c cVar4 = cVar2.f5919c;
            Runnable runnable = cVar2.f5917a;
            if (runnable instanceof e) {
                ((e) runnable).getClass();
                throw null;
            }
            c(runnable, cVar2.f5918b);
            cVar2 = cVar4;
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f5906e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f5915a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f5912a);
        }
        if (obj == f5908g) {
            return null;
        }
        return obj;
    }

    public static <V> V e(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public final void a(StringBuilder sb2) {
        try {
            Object e10 = e(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(e10 == this ? "this future" : String.valueOf(e10));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e12) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e12.getCause());
            sb2.append("]");
        }
    }

    @Override // a3.InterfaceFutureC0509a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        c cVar = this.f5910b;
        c cVar2 = c.f5916d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f5919c = cVar;
                if (f5907f.a(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f5910b;
                }
            } while (cVar != cVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f5909a;
        if ((obj == null) | (obj instanceof e)) {
            b bVar = f5905d ? new b(new CancellationException("Future.cancel() was called."), z10) : z10 ? b.f5913b : b.f5914c;
            while (!f5907f.b(this, obj, bVar)) {
                obj = this.f5909a;
                if (!(obj instanceof e)) {
                }
            }
            b(this);
            if (!(obj instanceof e)) {
                return true;
            }
            ((e) obj).getClass();
            throw null;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String f() {
        Object obj = this.f5909a;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ((e) obj).getClass();
            sb2.append("null");
            sb2.append("]");
            return sb2.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(g gVar) {
        gVar.f5926a = null;
        while (true) {
            g gVar2 = this.f5911c;
            if (gVar2 == g.f5925c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f5927b;
                if (gVar2.f5926a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f5927b = gVar4;
                    if (gVar3.f5926a == null) {
                        break;
                    }
                } else if (!f5907f.c(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a8 -> B:33:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean h(Throwable th) {
        th.getClass();
        if (!f5907f.b(this, null, new Failure(th))) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5909a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f5909a != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f5909a instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = f();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5909a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return (V) d(obj2);
            }
            g gVar = this.f5911c;
            g gVar2 = g.f5925c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    a aVar = f5907f;
                    aVar.d(gVar3, gVar);
                    if (aVar.c(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5909a;
                            } else {
                                g(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return (V) d(obj);
                    }
                    gVar = this.f5911c;
                } while (gVar != gVar2);
            }
            return (V) d(this.f5909a);
        }
        throw new InterruptedException();
    }
}
