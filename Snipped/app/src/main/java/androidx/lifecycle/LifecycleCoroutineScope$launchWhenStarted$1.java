package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Lifecycle.jvm.kt */
@V9.d(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.jvm.kt", l = {74}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LifecycleCoroutineScope$launchWhenStarted$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f6987u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC0547m f6988v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> f6989w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleCoroutineScope$launchWhenStarted$1(AbstractC0547m abstractC0547m, InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, T9.a<? super LifecycleCoroutineScope$launchWhenStarted$1> aVar) {
        super(2, aVar);
        this.f6988v = abstractC0547m;
        this.f6989w = interfaceC0650p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
        return new LifecycleCoroutineScope$launchWhenStarted$1(this.f6988v, this.f6989w, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
        return ((LifecycleCoroutineScope$launchWhenStarted$1) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f6987u;
        if (i == 0) {
            kotlin.b.b(obj);
            Lifecycle a10 = this.f6988v.a();
            this.f6987u = 1;
            if (BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new PausingDispatcherKt$whenStateAtLeast$2(a10, Lifecycle.State.f6978d, this.f6989w, null), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return O9.p.f3034a;
    }
}
