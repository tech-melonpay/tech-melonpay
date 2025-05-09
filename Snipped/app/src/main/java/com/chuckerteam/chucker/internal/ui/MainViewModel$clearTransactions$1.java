package com.chuckerteam.chucker.internal.ui;

import C.N;
import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainViewModel.kt */
@d(c = "com.chuckerteam.chucker.internal.ui.MainViewModel$clearTransactions$1", f = "MainViewModel.kt", l = {43}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
final class MainViewModel$clearTransactions$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8704u;

    public MainViewModel$clearTransactions$1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new MainViewModel$clearTransactions$1(2, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((MainViewModel$clearTransactions$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f8704u;
        if (i == 0) {
            kotlin.b.b(obj);
            N n10 = Ja.a.f2210a;
            if (n10 == null) {
                throw new IllegalStateException("You can't access the transaction repository if you don't initialize it!".toString());
            }
            this.f8704u = 1;
            Object e10 = ((ChuckerDatabase) n10.f535b).a().e(this);
            if (e10 != coroutineSingletons) {
                e10 = p.f3034a;
            }
            if (e10 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p.f3034a;
    }
}
