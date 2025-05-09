package com.chuckerteam.chucker.internal.ui.transaction;

import O9.p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.a0;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: TransactionPayloadFragment.kt */
@V9.d(c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$onQueryTextChange$1", f = "TransactionPayloadFragment.kt", l = {335, 540}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
final class TransactionPayloadFragment$onQueryTextChange$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8752u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TransactionPayloadFragment f8753v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPayloadFragment$onQueryTextChange$1(TransactionPayloadFragment transactionPayloadFragment, T9.a<? super TransactionPayloadFragment$onQueryTextChange$1> aVar) {
        super(2, aVar);
        this.f8753v = transactionPayloadFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new TransactionPayloadFragment$onQueryTextChange$1(this.f8753v, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((TransactionPayloadFragment$onQueryTextChange$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$onQueryTextChange$1$invokeSuspend$$inlined$withResumed$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f8752u;
        if (i == 0) {
            kotlin.b.b(obj);
            this.f8752u = 1;
            if (DelayKt.delay(600L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return p.f3034a;
            }
            kotlin.b.b(obj);
        }
        final TransactionPayloadFragment transactionPayloadFragment = this.f8753v;
        Lifecycle lifecycle = transactionPayloadFragment.getLifecycle();
        Lifecycle.State state = Lifecycle.State.f6979e;
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        boolean isDispatchNeeded = immediate.isDispatchNeeded(getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.b() == Lifecycle.State.f6975a) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.b().compareTo(state) >= 0) {
                if (!transactionPayloadFragment.f8745n0.isEmpty()) {
                    transactionPayloadFragment.s0(0);
                } else {
                    transactionPayloadFragment.f8746o0 = -1;
                }
                p pVar = p.f3034a;
                return p.f3034a;
            }
        }
        ?? r32 = new InterfaceC0635a<p>() { // from class: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$onQueryTextChange$1$invokeSuspend$$inlined$withResumed$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final p invoke() {
                TransactionPayloadFragment transactionPayloadFragment2 = TransactionPayloadFragment.this;
                if (!transactionPayloadFragment2.f8745n0.isEmpty()) {
                    transactionPayloadFragment2.s0(0);
                } else {
                    transactionPayloadFragment2.f8746o0 = -1;
                }
                return p.f3034a;
            }
        };
        this.f8752u = 2;
        if (a0.a(lifecycle, isDispatchNeeded, immediate, r32, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p.f3034a;
    }
}
