package com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details;

import F8.o;
import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import t6.C3;

/* compiled from: CryptoAccountDetailsFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1", f = "CryptoAccountDetailsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CryptoAccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CryptoAccountDetailsFragment f12014u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TabLayout.g f12015v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1(CryptoAccountDetailsFragment cryptoAccountDetailsFragment, TabLayout.g gVar, T9.a<? super CryptoAccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1> aVar) {
        super(2, aVar);
        this.f12014u = cryptoAccountDetailsFragment;
        this.f12015v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new CryptoAccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1(this.f12014u, this.f12015v, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((CryptoAccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<CryptoExchangeDomain> value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        boolean z10 = false;
        TabLayout.g gVar = this.f12015v;
        int i = gVar != null ? gVar.f9855d : 0;
        CryptoAccountDetailsFragment cryptoAccountDetailsFragment = this.f12014u;
        cryptoAccountDetailsFragment.f12002r0 = i;
        cryptoAccountDetailsFragment.L0();
        int i9 = cryptoAccountDetailsFragment.f12002r0;
        C3 u02 = cryptoAccountDetailsFragment.u0();
        if (i9 == 1 && ((value = cryptoAccountDetailsFragment.T0().f23578V0.getValue()) == null || value.isEmpty())) {
            z10 = true;
        }
        o.i(u02.f27679n, z10);
        u02.f27680o.setText(cryptoAccountDetailsFragment.getString(R.string.you_do_not_have_any_transactions_yet));
        int i10 = cryptoAccountDetailsFragment.f12002r0;
        if (i10 == 0) {
            a aVar = cryptoAccountDetailsFragment.f12001q0;
            cryptoAccountDetailsFragment.U0(aVar != null ? aVar.f12016a : null, null);
        } else if (i10 == 1) {
            cryptoAccountDetailsFragment.U0(null, cryptoAccountDetailsFragment.T0().f23578V0.getValue());
        }
        CryptoAccountDetailsController cryptoAccountDetailsController = cryptoAccountDetailsFragment.f12000p0;
        cryptoAccountDetailsFragment.V0((cryptoAccountDetailsController != null ? cryptoAccountDetailsController : null).getSummaryTab());
        return p.f3034a;
    }
}
