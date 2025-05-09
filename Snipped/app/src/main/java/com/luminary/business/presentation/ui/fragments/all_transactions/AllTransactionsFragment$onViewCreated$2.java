package com.luminary.business.presentation.ui.fragments.all_transactions;

import O9.p;
import T9.a;
import V9.d;
import ca.InterfaceC0650p;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AllTransactionsFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.all_transactions.AllTransactionsFragment$onViewCreated$2", f = "AllTransactionsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllTransactionsFragment$onViewCreated$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AllTransactionsFragment f11517u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllTransactionsFragment$onViewCreated$2(AllTransactionsFragment allTransactionsFragment, a<? super AllTransactionsFragment$onViewCreated$2> aVar) {
        super(2, aVar);
        this.f11517u = allTransactionsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(Object obj, a<?> aVar) {
        return new AllTransactionsFragment$onViewCreated$2(this.f11517u, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
        return ((AllTransactionsFragment$onViewCreated$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        AllTransactionsFragment allTransactionsFragment = this.f11517u;
        allTransactionsFragment.V0();
        allTransactionsFragment.U0(null);
        List<TransactionUI> value = allTransactionsFragment.T0().f1066V0.getValue();
        if (value != null && !value.isEmpty()) {
            allTransactionsFragment.U0(allTransactionsFragment.T0().f1066V0.getValue());
        }
        return p.f3034a;
    }
}
