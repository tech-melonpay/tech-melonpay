package androidx.work.impl.utils.futures;

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
public abstract class AbstractFuture<V> implements InterfaceFutureC0509a<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8216d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f8217e = Logger.getLogger(AbstractFuture.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final a f8218f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f8219g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f8220a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f8221b;

    /* renamed from: c, reason: collision with root package name */
    public volatile g f8222c;

    public static final class Failure {

        /* renamed from: b, reason: collision with root package name */
        public static final Failure f8223b = new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f8224a;

        /* renamed from: androidx.work.impl.utils.futures.AbstractFuture$Failure$1, reason: invalid class name */
        public class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public Failure(Throwable th) {
            boolean z10 = AbstractFuture.f8216d;
            th.getClass();
            this.f8224a = th;
        }
    }

    public static abstract class a {
        public abstract boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2);

        public abstract boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture<?> abstractFuture, g gVar, g gVar2);

        public abstract void d(g gVar, g gVar2);

        public abstract void e(g gVar, Thread thread);
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f8225c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f8226d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8227a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f8228b;

        static {
            if (AbstractFuture.f8216d) {
                f8226d = null;
                f8225c = null;
            } else {
                f8226d = new b(null, false);
                f8225c = new b(null, true);
            }
        }

        public b(Throwable th, boolean z10) {
            this.f8227a = z10;
            this.f8228b = th;
        }
    }

    public static final class c {

        /* renamed from: d, reason: collision with root package name */
        public static final c f8229d = new c(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f8230a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f8231b;

        /* renamed from: c, reason: collision with root package name */
        public c f8232c;

        public c(Runnable runnable, Executor executor) {
            this.f8230a = runnable;
            this.f8231b = executor;
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, Thread> f8233a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, g> f8234b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, g> f8235c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, c> f8236d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f8237e;

        public d(AtomicReferenceFieldUpdater<g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<g, g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            this.f8233a = atomicReferenceFieldUpdater;
            this.f8234b = atomicReferenceFieldUpdater2;
            this.f8235c = atomicReferenceFieldUpdater3;
            this.f8236d = atomicReferenceFieldUpdater4;
            this.f8237e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, c> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f8236d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, cVar, cVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == cVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f8237e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean c(AbstractFuture<?> abstractFuture, g gVar, g gVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, g> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f8235c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, gVar, gVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == gVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void d(g gVar, g gVar2) {
            this.f8234b.lazySet(gVar, gVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void e(g gVar, Thread thread) {
            this.f8233a.lazySet(gVar, thread);
        }
    }

    public static final class e<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractFuture<V> f8238a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceFutureC0509a<? extends V> f8239b;

        public e(AbstractFuture<V> abstractFuture, InterfaceFutureC0509a<? extends V> interfaceFutureC0509a) {
            this.f8238a = abstractFuture;
            this.f8239b = interfaceFutureC0509a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f8238a.f8220a != this) {
                return;
            }
            if (AbstractFuture.f8218f.b(this.f8238a, this, AbstractFuture.e(this.f8239b))) {
                AbstractFuture.b(this.f8238a);
            }
        }
    }

    public static final class f extends a {
        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f8221b != cVar) {
                        return false;
                    }
                    abstractFuture.f8221b = cVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f8220a != obj) {
                        return false;
                    }
                    abstractFuture.f8220a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean c(AbstractFuture<?> abstractFuture, g gVar, g gVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f8222c != gVar) {
                        return false;
                    }
                    abstractFuture.f8222c = gVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void d(g gVar, g gVar2) {
            gVar.f8242b = gVar2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void e(g gVar, Thread thread) {
            gVar.f8241a = thread;
        }
    }

    public static final class g {

        /* renamed from: c, reason: collision with root package name */
        public static final g f8240c = new g();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f8241a;

        /* renamed from: b, reason: collision with root package name */
        public volatile g f8242b;

        public g() {
            AbstractFuture.f8218f.e(this, Thread.currentThread());
        }
    }

    static {
        a fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f8218f = fVar;
        if (th != null) {
            f8217e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8219g = new Object();
    }

    public static void b(AbstractFuture<?> abstractFuture) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = abstractFuture.f8222c;
            if (f8218f.c(abstractFuture, gVar, g.f8240c)) {
                while (gVar != null) {
                    Thread thread = gVar.f8241a;
                    if (thread != null) {
                        gVar.f8241a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f8242b;
                }
                do {
                    cVar = abstractFuture.f8221b;
                } while (!f8218f.a(abstractFuture, cVar, c.f8229d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f8232c;
                    cVar3.f8232c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f8232c;
                    Runnable runnable = cVar2.f8230a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        abstractFuture = eVar.f8238a;
                        if (abstractFuture.f8220a == eVar) {
                            if (f8218f.b(abstractFuture, eVar, e(eVar.f8239b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, cVar2.f8231b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f8217e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f8228b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f8224a);
        }
        if (obj == f8219g) {
            return null;
        }
        return obj;
    }

    public static Object e(InterfaceFutureC0509a<?> interfaceFutureC0509a) {
        if (interfaceFutureC0509a instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) interfaceFutureC0509a).f8220a;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            return bVar.f8227a ? bVar.f8228b != null ? new b(bVar.f8228b, false) : b.f8226d : obj;
        }
        boolean isCancelled = interfaceFutureC0509a.isCancelled();
        if ((!f8216d) && isCancelled) {
            return b.f8226d;
        }
        try {
            Object f10 = f(interfaceFutureC0509a);
            return f10 == null ? f8219g : f10;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new b(e10, false);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC0509a, e10));
        } catch (ExecutionException e11) {
            return new Failure(e11.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    public static <V> V f(Future<V> future) {
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
            Object f10 = f(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(f10 == this ? "this future" : String.valueOf(f10));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // a3.InterfaceFutureC0509a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        c cVar = this.f8221b;
        c cVar2 = c.f8229d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f8232c = cVar;
                if (f8218f.a(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f8221b;
                }
            } while (cVar != cVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f8220a;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        b bVar = f8216d ? new b(new CancellationException("Future.cancel() was called."), z10) : z10 ? b.f8225c : b.f8226d;
        AbstractFuture<V> abstractFuture = this;
        boolean z11 = false;
        while (true) {
            if (f8218f.b(abstractFuture, obj, bVar)) {
                b(abstractFuture);
                if (!(obj instanceof e)) {
                    return true;
                }
                InterfaceFutureC0509a<? extends V> interfaceFutureC0509a = ((e) obj).f8239b;
                if (!(interfaceFutureC0509a instanceof AbstractFuture)) {
                    interfaceFutureC0509a.cancel(z10);
                    return true;
                }
                abstractFuture = (AbstractFuture) interfaceFutureC0509a;
                obj = abstractFuture.f8220a;
                if (!(obj == null) && !(obj instanceof e)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractFuture.f8220a;
                if (!(obj instanceof e)) {
                    return z11;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f8220a;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            InterfaceFutureC0509a<? extends V> interfaceFutureC0509a = ((e) obj).f8239b;
            return androidx.camera.core.impl.utils.a.n(sb2, interfaceFutureC0509a == this ? "this future" : String.valueOf(interfaceFutureC0509a), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void h(g gVar) {
        gVar.f8241a = null;
        while (true) {
            g gVar2 = this.f8222c;
            if (gVar2 == g.f8240c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f8242b;
                if (gVar2.f8241a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f8242b = gVar4;
                    if (gVar3.f8241a == null) {
                        break;
                    }
                } else if (!f8218f.c(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8220a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f8220a != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f8220a instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = g();
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
            Object obj2 = this.f8220a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return (V) d(obj2);
            }
            g gVar = this.f8222c;
            g gVar2 = g.f8240c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    a aVar = f8218f;
                    aVar.d(gVar3, gVar);
                    if (aVar.c(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8220a;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return (V) d(obj);
                    }
                    gVar = this.f8222c;
                } while (gVar != gVar2);
            }
            return (V) d(this.f8220a);
        }
        throw new InterruptedException();
    }
}
