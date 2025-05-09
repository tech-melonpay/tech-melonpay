package com.luminary.business.presentation.ui.fragments.cards.transactions;

import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CardTransactionsFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.cards.transactions.CardTransactionsFragment$onViewCreated$2", f = "CardTransactionsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CardTransactionsFragment$onViewCreated$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CardTransactionsFragment f11862u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTransactionsFragment$onViewCreated$2(CardTransactionsFragment cardTransactionsFragment, T9.a<? super CardTransactionsFragment$onViewCreated$2> aVar) {
        super(2, aVar);
        this.f11862u = cardTransactionsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new CardTransactionsFragment$onViewCreated$2(this.f11862u, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((CardTransactionsFragment$onViewCreated$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        CardTransactionsFragment cardTransactionsFragment = this.f11862u;
        cardTransactionsFragment.V0();
        cardTransactionsFragment.U0(null);
        List<CardTransactionDomain> value = cardTransactionsFragment.T0().f4468V0.getValue();
        if (value != null && !value.isEmpty()) {
            cardTransactionsFragment.U0(cardTransactionsFragment.T0().f4468V0.getValue());
        }
        return p.f3034a;
    }
}
