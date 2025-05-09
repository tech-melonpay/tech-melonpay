package com.luminary.business.presentation.ui.fragments.auth.login;

import H6.c;
import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LoginFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.auth.login.LoginFragment$showResendTimer$1", f = "LoginFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LoginFragment$showResendTimer$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f11604u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFragment$showResendTimer$1(LoginFragment loginFragment, T9.a<? super LoginFragment$showResendTimer$1> aVar) {
        super(2, aVar);
        this.f11604u = loginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new LoginFragment$showResendTimer$1(this.f11604u, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((LoginFragment$showResendTimer$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        LoginFragment loginFragment = this.f11604u;
        int i = loginFragment.f11594p0;
        if (i != 0) {
            loginFragment.f11594p0 = i - 1;
            loginFragment.f11595q0.postDelayed(new c(2, loginFragment.f11596r0), 1000L);
        }
        return p.f3034a;
    }
}
