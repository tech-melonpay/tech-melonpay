package com.squareup.picasso;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.o;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PicassoExecutorService.java */
/* loaded from: classes2.dex */
public final class j extends ThreadPoolExecutor {

    /* compiled from: PicassoExecutorService.java */
    public static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: a, reason: collision with root package name */
        public final c f13463a;

        public a(c cVar) {
            super(cVar, null);
            this.f13463a = cVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            c cVar = this.f13463a;
            Picasso.Priority priority = cVar.f13431s;
            c cVar2 = aVar.f13463a;
            Picasso.Priority priority2 = cVar2.f13431s;
            return priority == priority2 ? cVar.f13414a - cVar2.f13414a : priority2.ordinal() - priority.ordinal();
        }
    }

    public j() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o.b());
    }

    public final void a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
