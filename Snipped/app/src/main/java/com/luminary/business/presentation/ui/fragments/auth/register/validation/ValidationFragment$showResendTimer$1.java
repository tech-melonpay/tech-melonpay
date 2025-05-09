package com.luminary.business.presentation.ui.fragments.auth.register.validation;

import F8.o;
import H6.c;
import O9.p;
import T9.a;
import V9.d;
import ca.InterfaceC0650p;
import com.luminary.business.presentation.ui.fragments.auth.register.validation.ValidationFragment;
import com.luminary.mobile.R;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import t6.t6;

/* compiled from: ValidationFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.auth.register.validation.ValidationFragment$showResendTimer$1", f = "ValidationFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ValidationFragment$showResendTimer$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ValidationFragment f11722u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationFragment$showResendTimer$1(ValidationFragment validationFragment, a<? super ValidationFragment$showResendTimer$1> aVar) {
        super(2, aVar);
        this.f11722u = validationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(Object obj, a<?> aVar) {
        return new ValidationFragment$showResendTimer$1(this.f11722u, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
        return ((ValidationFragment$showResendTimer$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        ValidationFragment validationFragment = this.f11722u;
        if (validationFragment.f11706r0 == 0) {
            validationFragment.u0().f29630w.setEnabled(true);
            validationFragment.u0().f29630w.setText(validationFragment.getString(R.string.send_code));
            if (validationFragment.f11704p0 != ValidationFragment.ValidationType.f11717b || validationFragment.f11709v0) {
                o.b(validationFragment.u0().f29631x);
            } else {
                validationFragment.u0().f29631x.setVisibility(0);
            }
        } else {
            validationFragment.u0().f29630w.setEnabled(false);
            t6 u02 = validationFragment.u0();
            int i = validationFragment.f11706r0;
            int i9 = (i % 3600) / 60;
            int i10 = i % 60;
            u02.f29630w.setText(validationFragment.getString(R.string.resend_code, i9 + com.sumsub.sns.internal.core.data.model.p.f15541a + (i10 < 10 ? com.google.android.gms.measurement.internal.a.g(i10, "0") : String.valueOf(i10))));
            validationFragment.f11706r0 = validationFragment.f11706r0 - 1;
            validationFragment.s0.postDelayed(new c(4, validationFragment.f11710w0), 1000L);
        }
        return p.f3034a;
    }
}
