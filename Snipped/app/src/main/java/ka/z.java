package Ka;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout.kt */
/* loaded from: classes2.dex */
public class z {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2346d = new a();

    /* renamed from: a, reason: collision with root package name */
    public boolean f2347a;

    /* renamed from: b, reason: collision with root package name */
    public long f2348b;

    /* renamed from: c, reason: collision with root package name */
    public long f2349c;

    public z a() {
        this.f2347a = false;
        return this;
    }

    public z b() {
        this.f2349c = 0L;
        return this;
    }

    public long c() {
        if (this.f2347a) {
            return this.f2348b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public z d(long j10) {
        this.f2347a = true;
        this.f2348b = j10;
        return this;
    }

    public boolean e() {
        return this.f2347a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f2347a && this.f2348b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("timeout < 0: ", j10).toString());
        }
        this.f2349c = timeUnit.toNanos(j10);
        return this;
    }

    public long h() {
        return this.f2349c;
    }

    /* compiled from: Timeout.kt */
    public static final class a extends z {
        @Override // Ka.z
        public final void f() {
        }

        @Override // Ka.z
        public final z d(long j10) {
            return this;
        }

        @Override // Ka.z
        public final z g(long j10, TimeUnit timeUnit) {
            return this;
        }
    }
}
