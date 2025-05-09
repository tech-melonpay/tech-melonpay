package J;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import io.sentry.U;
import io.sentry.V;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements CallbackToFutureAdapter.b, V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2054b;

    public /* synthetic */ f(AtomicReference atomicReference, int i) {
        this.f2053a = i;
        this.f2054b = atomicReference;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        switch (this.f2053a) {
            case 0:
                this.f2054b.set(aVar);
                return "Data closed";
            case 1:
                this.f2054b.set(aVar);
                return "Data closed";
            case 2:
                this.f2054b.set(aVar);
                return "acquireInputBuffer";
            case 3:
                this.f2054b.set(aVar);
                return "mReleasedFuture";
            default:
                this.f2054b.set(aVar);
                return "Terminate InputBuffer";
        }
    }

    @Override // io.sentry.V
    public void c(U u6) {
        this.f2054b.set(u6.f21898d);
    }
}
