package androidx.concurrent.futures;

import a3.InterfaceFutureC0509a;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CallbackToFutureAdapter {

    public static final class FutureGarbageCollectedException extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public Object f5928a;

        /* renamed from: b, reason: collision with root package name */
        public c<T> f5929b;

        /* renamed from: c, reason: collision with root package name */
        public Z.a<Void> f5930c = new Z.a<>();

        /* renamed from: d, reason: collision with root package name */
        public boolean f5931d;

        public final void a(Runnable runnable, Executor executor) {
            Z.a<Void> aVar = this.f5930c;
            if (aVar != null) {
                aVar.addListener(runnable, executor);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(T r5) {
            /*
                r4 = this;
                r0 = 1
                r4.f5931d = r0
                androidx.concurrent.futures.CallbackToFutureAdapter$c<T> r1 = r4.f5929b
                r2 = 0
                if (r1 == 0) goto L1d
                androidx.concurrent.futures.CallbackToFutureAdapter$c$a r1 = r1.f5933b
                r1.getClass()
                if (r5 != 0) goto L11
                java.lang.Object r5 = androidx.concurrent.futures.AbstractResolvableFuture.f5908g
            L11:
                androidx.concurrent.futures.AbstractResolvableFuture$a r3 = androidx.concurrent.futures.AbstractResolvableFuture.f5907f
                boolean r5 = r3.b(r1, r2, r5)
                if (r5 == 0) goto L1d
                androidx.concurrent.futures.AbstractResolvableFuture.b(r1)
                goto L1e
            L1d:
                r0 = 0
            L1e:
                if (r0 == 0) goto L26
                r4.f5928a = r2
                r4.f5929b = r2
                r4.f5930c = r2
            L26:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.CallbackToFutureAdapter.a.b(java.lang.Object):boolean");
        }

        public final boolean c(Throwable th) {
            this.f5931d = true;
            c<T> cVar = this.f5929b;
            boolean z10 = cVar != null && cVar.f5933b.h(th);
            if (z10) {
                this.f5928a = null;
                this.f5929b = null;
                this.f5930c = null;
            }
            return z10;
        }

        public final void finalize() {
            Z.a<Void> aVar;
            c<T> cVar = this.f5929b;
            if (cVar != null) {
                c.a aVar2 = cVar.f5933b;
                if (!aVar2.isDone()) {
                    aVar2.h(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f5928a));
                }
            }
            if (this.f5931d || (aVar = this.f5930c) == null) {
                return;
            }
            aVar.i(null);
        }
    }

    public interface b<T> {
        Object attachCompleter(a<T> aVar);
    }

    public static final class c<T> implements InterfaceFutureC0509a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<a<T>> f5932a;

        /* renamed from: b, reason: collision with root package name */
        public final a f5933b = new a();

        public class a extends AbstractResolvableFuture<T> {
            public a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public final String f() {
                a<T> aVar = c.this.f5932a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f5928a + "]";
            }
        }

        public c(a<T> aVar) {
            this.f5932a = new WeakReference<>(aVar);
        }

        @Override // a3.InterfaceFutureC0509a
        public final void addListener(Runnable runnable, Executor executor) {
            this.f5933b.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            a<T> aVar = this.f5932a.get();
            boolean cancel = this.f5933b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.f5928a = null;
                aVar.f5929b = null;
                aVar.f5930c.i(null);
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() {
            return this.f5933b.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f5933b.f5909a instanceof AbstractResolvableFuture.b;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f5933b.isDone();
        }

        public final String toString() {
            return this.f5933b.toString();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j10, TimeUnit timeUnit) {
            return this.f5933b.get(j10, timeUnit);
        }
    }

    public static c a(b bVar) {
        a aVar = new a();
        c<T> cVar = new c<>(aVar);
        aVar.f5929b = cVar;
        aVar.f5928a = bVar.getClass();
        try {
            Object attachCompleter = bVar.attachCompleter(aVar);
            if (attachCompleter != null) {
                aVar.f5928a = attachCompleter;
            }
        } catch (Exception e10) {
            cVar.f5933b.h(e10);
        }
        return cVar;
    }
}
