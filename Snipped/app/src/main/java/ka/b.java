package Ka;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes2.dex */
public class b extends z {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f2280h;
    public static final Condition i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f2281j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f2282k;

    /* renamed from: l, reason: collision with root package name */
    public static b f2283l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2284e;

    /* renamed from: f, reason: collision with root package name */
    public b f2285f;

    /* renamed from: g, reason: collision with root package name */
    public long f2286g;

    /* compiled from: AsyncTimeout.kt */
    public static final class a {
        public static b a() {
            b bVar = b.f2283l.f2285f;
            if (bVar == null) {
                long nanoTime = System.nanoTime();
                b.i.await(b.f2281j, TimeUnit.MILLISECONDS);
                if (b.f2283l.f2285f != null || System.nanoTime() - nanoTime < b.f2282k) {
                    return null;
                }
                return b.f2283l;
            }
            long nanoTime2 = bVar.f2286g - System.nanoTime();
            if (nanoTime2 > 0) {
                b.i.await(nanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            b.f2283l.f2285f = bVar.f2285f;
            bVar.f2285f = null;
            return bVar;
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: Ka.b$b, reason: collision with other inner class name */
    public static final class C0031b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            b a10;
            while (true) {
                try {
                    reentrantLock = b.f2280h;
                    reentrantLock.lock();
                    try {
                        a10 = a.a();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (a10 == b.f2283l) {
                    b.f2283l = null;
                    return;
                }
                O9.p pVar = O9.p.f3034a;
                reentrantLock.unlock();
                if (a10 != null) {
                    a10.l();
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f2280h = reentrantLock;
        i = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f2281j = millis;
        f2282k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        b bVar;
        long j10 = this.f2349c;
        boolean z10 = this.f2347a;
        if (j10 != 0 || z10) {
            ReentrantLock reentrantLock = f2280h;
            reentrantLock.lock();
            try {
                if (!(!this.f2284e)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f2284e = true;
                if (f2283l == null) {
                    f2283l = new b();
                    C0031b c0031b = new C0031b("Okio Watchdog");
                    c0031b.setDaemon(true);
                    c0031b.start();
                }
                long nanoTime = System.nanoTime();
                if (j10 != 0 && z10) {
                    this.f2286g = Math.min(j10, c() - nanoTime) + nanoTime;
                } else if (j10 != 0) {
                    this.f2286g = j10 + nanoTime;
                } else {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    this.f2286g = c();
                }
                long j11 = this.f2286g - nanoTime;
                b bVar2 = f2283l;
                while (true) {
                    bVar = bVar2.f2285f;
                    if (bVar == null || j11 < bVar.f2286g - nanoTime) {
                        break;
                    } else {
                        bVar2 = bVar;
                    }
                }
                this.f2285f = bVar;
                bVar2.f2285f = this;
                if (bVar2 == f2283l) {
                    i.signal();
                }
                O9.p pVar = O9.p.f3034a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = f2280h;
        reentrantLock.lock();
        try {
            if (!this.f2284e) {
                return false;
            }
            this.f2284e = false;
            b bVar = f2283l;
            while (bVar != null) {
                b bVar2 = bVar.f2285f;
                if (bVar2 == this) {
                    bVar.f2285f = this.f2285f;
                    this.f2285f = null;
                    return false;
                }
                bVar = bVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void l() {
    }
}
