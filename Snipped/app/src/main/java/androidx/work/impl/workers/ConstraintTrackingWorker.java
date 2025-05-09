package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.a;
import java.util.ArrayList;
import java.util.List;
import s1.AbstractC1197g;
import x1.InterfaceC1582c;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC1582c {

    /* renamed from: k, reason: collision with root package name */
    public static final String f8245k = AbstractC1197g.e("ConstraintTrkngWrkr");

    /* renamed from: f, reason: collision with root package name */
    public final WorkerParameters f8246f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8247g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f8248h;
    public final a<ListenableWorker.a> i;

    /* renamed from: j, reason: collision with root package name */
    public ListenableWorker f8249j;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f8246f = workerParameters;
        this.f8247g = new Object();
        this.f8248h = false;
        this.i = new a<>();
    }

    @Override // androidx.work.ListenableWorker
    public final boolean b() {
        ListenableWorker listenableWorker = this.f8249j;
        return listenableWorker != null && listenableWorker.b();
    }

    @Override // androidx.work.ListenableWorker
    public final void c() {
        ListenableWorker listenableWorker = this.f8249j;
        if (listenableWorker == null || listenableWorker.f8087c) {
            return;
        }
        this.f8249j.g();
    }

    @Override // x1.InterfaceC1582c
    public final void d(ArrayList arrayList) {
        AbstractC1197g.c().a(f8245k, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f8247g) {
            this.f8248h = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final a f() {
        this.f8086b.f8113c.execute(new E1.a(this, 0));
        return this.i;
    }

    @Override // x1.InterfaceC1582c
    public final void e(List<String> list) {
    }
}
