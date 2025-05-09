package com.luminary.business.presentation.ui.fragments.auth.forgotpassword;

import H6.c;
import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import com.luminary.mobile.R;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import t6.X3;

/* compiled from: ForgotPasswordEmailCodeFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordEmailCodeFragment$showResendTimer$1", f = "ForgotPasswordEmailCodeFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ForgotPasswordEmailCodeFragment$showResendTimer$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordEmailCodeFragment f11553u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForgotPasswordEmailCodeFragment$showResendTimer$1(ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment, T9.a<? super ForgotPasswordEmailCodeFragment$showResendTimer$1> aVar) {
        super(2, aVar);
        this.f11553u = forgotPasswordEmailCodeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new ForgotPasswordEmailCodeFragment$showResendTimer$1(this.f11553u, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((ForgotPasswordEmailCodeFragment$showResendTimer$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment = this.f11553u;
        if (forgotPasswordEmailCodeFragment.f11544q0 == 0) {
            forgotPasswordEmailCodeFragment.u0().f28667r.setEnabled(D9.b.h0(String.valueOf(forgotPasswordEmailCodeFragment.u0().f28665p.getText())));
            forgotPasswordEmailCodeFragment.u0().f28667r.setText(forgotPasswordEmailCodeFragment.getString(R.string.send_code));
        } else {
            forgotPasswordEmailCodeFragment.u0().f28667r.setEnabled(false);
            X3 u02 = forgotPasswordEmailCodeFragment.u0();
            int i = forgotPasswordEmailCodeFragment.f11544q0;
            int i9 = (i % 3600) / 60;
            int i10 = i % 60;
            u02.f28667r.setText(forgotPasswordEmailCodeFragment.getString(R.string.resend_code, i9 + com.sumsub.sns.internal.core.data.model.p.f15541a + (i10 < 10 ? com.google.android.gms.measurement.internal.a.g(i10, "0") : String.valueOf(i10))));
            forgotPasswordEmailCodeFragment.f11544q0 = forgotPasswordEmailCodeFragment.f11544q0 - 1;
            forgotPasswordEmailCodeFragment.f11545r0.postDelayed(new c(1, forgotPasswordEmailCodeFragment.s0), 1000L);
        }
        return p.f3034a;
    }
}
