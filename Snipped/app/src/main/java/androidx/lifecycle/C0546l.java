package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* compiled from: LifecycleController.jvm.kt */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546l {

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f7088a;

    /* renamed from: b, reason: collision with root package name */
    public final Lifecycle.State f7089b;

    /* renamed from: c, reason: collision with root package name */
    public final C0540f f7090c;

    /* renamed from: d, reason: collision with root package name */
    public final W0.c f7091d;

    public C0546l(Lifecycle lifecycle, Lifecycle.State state, C0540f c0540f, Job job) {
        this.f7088a = lifecycle;
        this.f7089b = state;
        this.f7090c = c0540f;
        W0.c cVar = new W0.c(1, this, job);
        this.f7091d = cVar;
        if (lifecycle.b() != Lifecycle.State.f6975a) {
            lifecycle.a(cVar);
        } else {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            a();
        }
    }

    public final void a() {
        this.f7088a.c(this.f7091d);
        C0540f c0540f = this.f7090c;
        c0540f.f7083b = true;
        c0540f.b();
    }
}
