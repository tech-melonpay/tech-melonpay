package com.luminary.business.presentation.ui.fragments.crypto.all_exchanges;

import O9.p;
import T9.a;
import V9.d;
import ca.InterfaceC0650p;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AllExchangesFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.crypto.all_exchanges.AllExchangesFragment$onViewCreated$2", f = "AllExchangesFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllExchangesFragment$onViewCreated$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AllExchangesFragment f11951u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllExchangesFragment$onViewCreated$2(AllExchangesFragment allExchangesFragment, a<? super AllExchangesFragment$onViewCreated$2> aVar) {
        super(2, aVar);
        this.f11951u = allExchangesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(Object obj, a<?> aVar) {
        return new AllExchangesFragment$onViewCreated$2(this.f11951u, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
        return ((AllExchangesFragment$onViewCreated$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        AllExchangesFragment allExchangesFragment = this.f11951u;
        allExchangesFragment.V0();
        allExchangesFragment.U0(null);
        List<CryptoExchangeDomain> value = allExchangesFragment.T0().f21195V0.getValue();
        if (value != null && !value.isEmpty()) {
            allExchangesFragment.U0(allExchangesFragment.T0().f21195V0.getValue());
        }
        return p.f3034a;
    }
}
