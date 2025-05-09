package androidx.recyclerview.widget;

import androidx.recyclerview.widget.q;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: AsyncDifferConfig.java */
/* renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7613a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f7614b;

    /* renamed from: c, reason: collision with root package name */
    public final q.e<T> f7615c;

    /* compiled from: AsyncDifferConfig.java */
    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public static final Object f7616a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public static ExecutorService f7617b;
    }

    public C0565c(Executor executor, Executor executor2, q.e<T> eVar) {
        this.f7613a = executor;
        this.f7614b = executor2;
        this.f7615c = eVar;
    }
}
