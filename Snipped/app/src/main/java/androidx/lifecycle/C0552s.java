package androidx.lifecycle;

import android.view.View;
import com.luminary.mobile.R;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: LifecycleOwner.kt */
/* renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552s {

    /* renamed from: a, reason: collision with root package name */
    public static final Ja.a f7095a = new Ja.a();

    public static final C0548n a(r rVar) {
        C0548n c0548n;
        Lifecycle lifecycle = rVar.getLifecycle();
        loop0: while (true) {
            AtomicReference<Object> atomicReference = lifecycle.f6973a;
            c0548n = (C0548n) atomicReference.get();
            if (c0548n == null) {
                c0548n = new C0548n(lifecycle, SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
                while (!atomicReference.compareAndSet(null, c0548n)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                BuildersKt__Builders_commonKt.launch$default(c0548n, Dispatchers.getMain().getImmediate(), null, new LifecycleCoroutineScopeImpl$register$1(c0548n, null), 2, null);
                break loop0;
            }
            break;
        }
        return c0548n;
    }

    public static final S0.a b(Q q10) {
        S0.a aVar;
        kotlin.coroutines.d dVar;
        synchronized (f7095a) {
            aVar = (S0.a) q10.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                try {
                    try {
                        dVar = Dispatchers.getMain().getImmediate();
                    } catch (IllegalStateException unused) {
                        dVar = EmptyCoroutineContext.f23155a;
                    }
                } catch (NotImplementedError unused2) {
                    dVar = EmptyCoroutineContext.f23155a;
                }
                S0.a aVar2 = new S0.a(dVar.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
                q10.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final void c(View view, r rVar) {
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
