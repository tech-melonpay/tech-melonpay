package androidx.lifecycle;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RepeatOnLifecycle.kt */
@V9.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f7042u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f7043v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> f7044w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, T9.a<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1> aVar) {
        super(2, aVar);
        this.f7044w = interfaceC0650p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(this.f7044w, aVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1.f7043v = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f7042u;
        if (i == 0) {
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f7043v;
            this.f7042u = 1;
            if (this.f7044w.invoke(coroutineScope, this) == coroutineSingletons) {
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
