package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import ca.InterfaceC0650p;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: Lifecycle.kt */
@V9.d(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f6990u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0548n f6991v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(C0548n c0548n, T9.a<? super LifecycleCoroutineScopeImpl$register$1> aVar) {
        super(2, aVar);
        this.f6991v = c0548n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.f6991v, aVar);
        lifecycleCoroutineScopeImpl$register$1.f6990u = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
        return ((LifecycleCoroutineScopeImpl$register$1) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        kotlin.b.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f6990u;
        C0548n c0548n = this.f6991v;
        if (c0548n.f7092a.b().compareTo(Lifecycle.State.f6976b) >= 0) {
            c0548n.f7092a.a(c0548n);
        } else {
            JobKt__JobKt.cancel$default(coroutineScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
        return O9.p.f3034a;
    }
}
