package com.luminary.business.presentation.ui.fragments.auth.kyc;

import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: KycFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.auth.kyc.KycFragment$initilizeSumSub$1$2", f = "KycFragment.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class KycFragment$initilizeSumSub$1$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f11589u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ KycFragment f11590v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycFragment$initilizeSumSub$1$2(KycFragment kycFragment, T9.a<? super KycFragment$initilizeSumSub$1$2> aVar) {
        super(2, aVar);
        this.f11590v = kycFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new KycFragment$initilizeSumSub$1$2(this.f11590v, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((KycFragment$initilizeSumSub$1$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f11589u;
        if (i == 0) {
            b.b(obj);
            this.f11589u = 1;
            if (DelayKt.delay(100L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        this.f11590v.W0();
        return p.f3034a;
    }
}
