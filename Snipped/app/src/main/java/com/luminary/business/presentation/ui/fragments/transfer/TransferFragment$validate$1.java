package com.luminary.business.presentation.ui.fragments.transfer;

import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import com.google.android.material.button.MaterialButton;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TransferFragment.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.transfer.TransferFragment$validate$1", f = "TransferFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TransferFragment$validate$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TransferFragment f13154u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f13155v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFragment$validate$1(TransferFragment transferFragment, boolean z10, T9.a<? super TransferFragment$validate$1> aVar) {
        super(2, aVar);
        this.f13154u = transferFragment;
        this.f13155v = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new TransferFragment$validate$1(this.f13154u, this.f13155v, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((TransferFragment$validate$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        TransferFragment transferFragment = this.f13154u;
        MaterialButton materialButton = transferFragment.u0().f29480n;
        boolean z10 = this.f13155v;
        materialButton.setEnabled(z10);
        transferFragment.u0().f29481o.setEnabled(z10);
        return p.f3034a;
    }
}
