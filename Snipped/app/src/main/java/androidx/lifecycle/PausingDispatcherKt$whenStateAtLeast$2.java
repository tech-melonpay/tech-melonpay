package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: PausingDispatcher.jvm.kt */
@V9.d(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {205}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<Object>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f7002u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f7003v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f7004w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f7005x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0650p<CoroutineScope, T9.a<Object>, Object> f7006y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, InterfaceC0650p<? super CoroutineScope, ? super T9.a<Object>, ? extends Object> interfaceC0650p, T9.a<? super PausingDispatcherKt$whenStateAtLeast$2> aVar) {
        super(2, aVar);
        this.f7004w = lifecycle;
        this.f7005x = state;
        this.f7006y = interfaceC0650p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.f7004w, this.f7005x, this.f7006y, aVar);
        pausingDispatcherKt$whenStateAtLeast$2.f7003v = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<Object> aVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C0546l c0546l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f7002u;
        if (i == 0) {
            kotlin.b.b(obj);
            Job job = (Job) ((CoroutineScope) this.f7003v).getCoroutineContext().get(Job.INSTANCE);
            if (job == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            C c2 = new C();
            C0546l c0546l2 = new C0546l(this.f7004w, this.f7005x, c2.f6950b, job);
            try {
                InterfaceC0650p<CoroutineScope, T9.a<Object>, Object> interfaceC0650p = this.f7006y;
                this.f7003v = c0546l2;
                this.f7002u = 1;
                obj = BuildersKt.withContext(c2, interfaceC0650p, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c0546l = c0546l2;
            } catch (Throwable th) {
                th = th;
                c0546l = c0546l2;
                c0546l.a();
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0546l = (C0546l) this.f7003v;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                c0546l.a();
                throw th;
            }
        }
        c0546l.a();
        return obj;
    }
}
