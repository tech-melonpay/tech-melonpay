package androidx.work;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import s1.C1194d;

/* compiled from: CoroutineWorker.kt */
@V9.d(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CoroutineWorker$getForegroundInfoAsync$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public c f8074u;

    /* renamed from: v, reason: collision with root package name */
    public int f8075v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c<C1194d> f8076w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f8077x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$getForegroundInfoAsync$1(c<C1194d> cVar, CoroutineWorker coroutineWorker, T9.a<? super CoroutineWorker$getForegroundInfoAsync$1> aVar) {
        super(2, aVar);
        this.f8076w = cVar;
        this.f8077x = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.f8076w, this.f8077x, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f8075v;
        if (i == 0) {
            kotlin.b.b(obj);
            this.f8074u = this.f8076w;
            this.f8075v = 1;
            this.f8077x.getClass();
            throw new IllegalStateException("Not implemented");
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c cVar = this.f8074u;
        kotlin.b.b(obj);
        cVar.f8131b.i(obj);
        return p.f3034a;
    }
}
