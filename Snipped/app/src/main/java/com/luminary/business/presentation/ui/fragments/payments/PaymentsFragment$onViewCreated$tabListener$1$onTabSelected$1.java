package com.luminary.business.presentation.ui.fragments.payments;

import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.ui.fragments.payments.PaymentsFragment;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentsFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.payments.PaymentsFragment$onViewCreated$tabListener$1$onTabSelected$1", f = "PaymentsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PaymentsFragment$onViewCreated$tabListener$1$onTabSelected$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PaymentsFragment f12951u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TabLayout.g f12952v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsFragment$onViewCreated$tabListener$1$onTabSelected$1(PaymentsFragment paymentsFragment, TabLayout.g gVar, T9.a<? super PaymentsFragment$onViewCreated$tabListener$1$onTabSelected$1> aVar) {
        super(2, aVar);
        this.f12951u = paymentsFragment;
        this.f12952v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new PaymentsFragment$onViewCreated$tabListener$1$onTabSelected$1(this.f12951u, this.f12952v, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((PaymentsFragment$onViewCreated$tabListener$1$onTabSelected$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        PaymentsFragment paymentsFragment = this.f12951u;
        PaymentsFragment.PaymentsTab paymentsTab = paymentsFragment.s0;
        TabLayout.g gVar = this.f12952v;
        int i = gVar != null ? gVar.f9855d : 0;
        paymentsFragment.s0 = i != 0 ? i != 1 ? i != 2 ? PaymentsFragment.PaymentsTab.f12943a : PaymentsFragment.PaymentsTab.f12945c : PaymentsFragment.PaymentsTab.f12944b : PaymentsFragment.PaymentsTab.f12943a;
        paymentsFragment.L0();
        if (paymentsTab != paymentsFragment.s0) {
            paymentsFragment.U0();
        }
        paymentsFragment.W0();
        paymentsFragment.V0(null, null, null);
        paymentsFragment.V0(paymentsFragment.T0().f12959Z0.getValue(), paymentsFragment.T0().f12956W0.getValue(), paymentsFragment.T0().f12961b1.getValue());
        return p.f3034a;
    }
}
