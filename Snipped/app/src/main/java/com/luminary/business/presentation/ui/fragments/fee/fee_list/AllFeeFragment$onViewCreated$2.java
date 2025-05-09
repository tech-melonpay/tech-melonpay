package com.luminary.business.presentation.ui.fragments.fee.fee_list;

import O9.p;
import T9.a;
import V9.d;
import ca.InterfaceC0650p;
import com.luminary.business.domain.entity.account.FeeDomain;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AllFeeFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.fee.fee_list.AllFeeFragment$onViewCreated$2", f = "AllFeeFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllFeeFragment$onViewCreated$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AllFeeFragment f12240u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllFeeFragment$onViewCreated$2(AllFeeFragment allFeeFragment, a<? super AllFeeFragment$onViewCreated$2> aVar) {
        super(2, aVar);
        this.f12240u = allFeeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(Object obj, a<?> aVar) {
        return new AllFeeFragment$onViewCreated$2(this.f12240u, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
        return ((AllFeeFragment$onViewCreated$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        AllFeeFragment allFeeFragment = this.f12240u;
        allFeeFragment.V0();
        allFeeFragment.U0(null);
        List<FeeDomain> value = allFeeFragment.T0().f31338V0.getValue();
        if (value == null || value.isEmpty()) {
            allFeeFragment.T0().h0();
        } else {
            allFeeFragment.U0(allFeeFragment.T0().f31338V0.getValue());
        }
        return p.f3034a;
    }
}
