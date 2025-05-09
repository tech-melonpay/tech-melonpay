package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: AsyncListDiffer.java */
/* renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567e<T> {

    /* renamed from: h, reason: collision with root package name */
    public static final b f7626h = new b();

    /* renamed from: a, reason: collision with root package name */
    public final D f7627a;

    /* renamed from: b, reason: collision with root package name */
    public final C0565c<T> f7628b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f7629c;

    /* renamed from: e, reason: collision with root package name */
    public List<T> f7631e;

    /* renamed from: g, reason: collision with root package name */
    public int f7633g;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f7630d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List<T> f7632f = Collections.emptyList();

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.e$a */
    public interface a<T> {
        void a();
    }

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.e$b */
    public static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f7634a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f7634a.post(runnable);
        }
    }

    public C0567e(C0564b c0564b, C0565c c0565c) {
        this.f7627a = c0564b;
        this.f7628b = c0565c;
        Executor executor = c0565c.f7613a;
        if (executor != null) {
            this.f7629c = executor;
        } else {
            this.f7629c = f7626h;
        }
    }

    public final void a(List<T> list, Runnable runnable) {
        Iterator it = this.f7630d.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
