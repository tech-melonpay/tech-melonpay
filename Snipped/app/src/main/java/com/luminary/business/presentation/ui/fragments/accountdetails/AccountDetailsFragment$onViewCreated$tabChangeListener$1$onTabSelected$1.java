package com.luminary.business.presentation.ui.fragments.accountdetails;

import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountDetailsFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1", f = "AccountDetailsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AccountDetailsFragment f11498u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TabLayout.g f11499v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1(AccountDetailsFragment accountDetailsFragment, TabLayout.g gVar, T9.a<? super AccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1> aVar) {
        super(2, aVar);
        this.f11498u = accountDetailsFragment;
        this.f11499v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new AccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1(this.f11498u, this.f11499v, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((AccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        TabLayout.g gVar = this.f11499v;
        int i = gVar != null ? gVar.f9855d : 0;
        AccountDetailsFragment accountDetailsFragment = this.f11498u;
        accountDetailsFragment.f11484r0 = i;
        accountDetailsFragment.L0();
        accountDetailsFragment.W0();
        accountDetailsFragment.V0(null);
        List<TransactionUI> value = accountDetailsFragment.T0().f949V0.getValue();
        if (value != null && !value.isEmpty()) {
            accountDetailsFragment.V0(accountDetailsFragment.T0().f949V0.getValue());
        }
        return p.f3034a;
    }
}
