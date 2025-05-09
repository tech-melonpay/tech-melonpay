package androidx.work;

import a3.InterfaceFutureC0509a;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import s1.C1194d;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8085a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f8086b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f8087c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8088d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8089e;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0085a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f8090a = androidx.work.b.f8127c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0085a.class != obj.getClass()) {
                    return false;
                }
                return this.f8090a.equals(((C0085a) obj).f8090a);
            }

            public final int hashCode() {
                return this.f8090a.hashCode() + (C0085a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f8090a + '}';
            }
        }

        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final androidx.work.b f8091a;

            public c() {
                this(androidx.work.b.f8127c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f8091a.equals(((c) obj).f8091a);
            }

            public final int hashCode() {
                return this.f8091a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f8091a + '}';
            }

            public c(androidx.work.b bVar) {
                this.f8091a = bVar;
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f8085a = context;
        this.f8086b = workerParameters;
    }

    public InterfaceFutureC0509a<C1194d> a() {
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        aVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return aVar;
    }

    public boolean b() {
        return this.f8089e;
    }

    public abstract androidx.work.impl.utils.futures.a f();

    public final void g() {
        this.f8087c = true;
        c();
    }

    public void c() {
    }
}
