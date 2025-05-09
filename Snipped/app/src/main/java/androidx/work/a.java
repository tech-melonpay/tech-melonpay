package androidx.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import pa.C1124b;
import s1.C1202l;
import s1.ThreadFactoryC1191a;
import t1.C1276a;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f8118a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1191a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f8119b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1191a(true));

    /* renamed from: c, reason: collision with root package name */
    public final C1202l f8120c;

    /* renamed from: d, reason: collision with root package name */
    public final C1124b f8121d;

    /* renamed from: e, reason: collision with root package name */
    public final C1276a f8122e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8123f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8124g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8125h;

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C0086a {
    }

    /* compiled from: Configuration.java */
    public interface b {
        a a();
    }

    public a(C0086a c0086a) {
        String str = C1202l.f26520a;
        this.f8120c = new C1202l();
        this.f8121d = new C1124b();
        this.f8122e = new C1276a(0);
        this.f8123f = 4;
        this.f8124g = Integer.MAX_VALUE;
        this.f8125h = 20;
    }
}
