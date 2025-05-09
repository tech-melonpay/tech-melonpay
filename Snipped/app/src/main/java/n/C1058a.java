package n;

import Z0.c;
import android.os.Looper;

/* compiled from: ArchTaskExecutor.java */
/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058a extends Y8.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1058a f24056c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f24057d = new c(1);

    /* renamed from: e, reason: collision with root package name */
    public static final c f24058e = new c(2);

    /* renamed from: b, reason: collision with root package name */
    public final C1059b f24059b = new C1059b();

    public static C1058a f() {
        if (f24056c != null) {
            return f24056c;
        }
        synchronized (C1058a.class) {
            try {
                if (f24056c == null) {
                    f24056c = new C1058a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24056c;
    }

    public final boolean g() {
        this.f24059b.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void h(Runnable runnable) {
        C1059b c1059b = this.f24059b;
        if (c1059b.f24062d == null) {
            synchronized (c1059b.f24060b) {
                try {
                    if (c1059b.f24062d == null) {
                        c1059b.f24062d = C1059b.f(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c1059b.f24062d.post(runnable);
    }
}
