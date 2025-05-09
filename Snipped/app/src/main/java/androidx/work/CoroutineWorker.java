package androidx.work;

import a3.InterfaceFutureC0509a;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import s1.C1194d;

/* compiled from: CoroutineWorker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: f, reason: collision with root package name */
    public final CompletableJob f8070f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<ListenableWorker.a> f8071g;

    /* renamed from: h, reason: collision with root package name */
    public final CoroutineDispatcher f8072h;

    /* compiled from: CoroutineWorker.kt */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.f8071g.f8220a instanceof AbstractFuture.b) {
                Job.DefaultImpls.cancel$default((Job) CoroutineWorker.this.f8070f, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        CompletableJob Job$default;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f8070f = Job$default;
        androidx.work.impl.utils.futures.a<ListenableWorker.a> aVar = new androidx.work.impl.utils.futures.a<>();
        this.f8071g = aVar;
        aVar.addListener(new a(), ((D1.b) this.f8086b.f8114d).f858a);
        this.f8072h = Dispatchers.getDefault();
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC0509a<C1194d> a() {
        CompletableJob Job$default;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(this.f8072h.plus(Job$default));
        c cVar = new c(Job$default);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new CoroutineWorker$getForegroundInfoAsync$1(cVar, this, null), 3, null);
        return cVar;
    }

    @Override // androidx.work.ListenableWorker
    public final void c() {
        this.f8071g.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final androidx.work.impl.utils.futures.a f() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f8072h.plus(this.f8070f)), null, null, new CoroutineWorker$startWork$1(this, null), 3, null);
        return this.f8071g;
    }

    public abstract Object h();
}
