package com.luminary.business.presentation.utils.bottomDialog;

import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BottomDialogManagerImpl.kt */
@d(c = "com.luminary.business.presentation.utils.bottomDialog.BottomDialogManagerImpl$dismiss$1", f = "BottomDialogManagerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BottomDialogManagerImpl$dismiss$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BottomDialogManagerImpl f13284u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDialogManagerImpl$dismiss$1(BottomDialogManagerImpl bottomDialogManagerImpl, T9.a<? super BottomDialogManagerImpl$dismiss$1> aVar) {
        super(2, aVar);
        this.f13284u = bottomDialogManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new BottomDialogManagerImpl$dismiss$1(this.f13284u, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((BottomDialogManagerImpl$dismiss$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        a aVar = this.f13284u.f13283a;
        if (aVar == null) {
            aVar = null;
        }
        aVar.dismiss();
        return p.f3034a;
    }
}
