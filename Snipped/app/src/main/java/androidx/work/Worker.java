package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.impl.utils.futures.a<ListenableWorker.a> f8110f;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final androidx.work.impl.utils.futures.a f() {
        this.f8110f = new androidx.work.impl.utils.futures.a<>();
        this.f8086b.f8113c.execute(new d(this));
        return this.f8110f;
    }

    public abstract ListenableWorker.a.c h();
}
