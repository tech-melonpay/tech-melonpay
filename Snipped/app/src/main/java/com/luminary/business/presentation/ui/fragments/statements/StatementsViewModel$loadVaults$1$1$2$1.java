package com.luminary.business.presentation.ui.fragments.statements;

import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import com.luminary.business.domain.entity.cards.VaultDomain;
import e7.C0724d;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StatementsViewModel.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.statements.StatementsViewModel$loadVaults$1$1$2$1", f = "StatementsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class StatementsViewModel$loadVaults$1$1$2$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f13062u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List<VaultDomain> f13063v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatementsViewModel$loadVaults$1$1$2$1(c cVar, List<VaultDomain> list, T9.a<? super StatementsViewModel$loadVaults$1$1$2$1> aVar) {
        super(2, aVar);
        this.f13062u = cVar;
        this.f13063v = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new StatementsViewModel$loadVaults$1$1$2$1(this.f13062u, this.f13063v, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((StatementsViewModel$loadVaults$1$1$2$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        kotlin.b.b(obj);
        c cVar = this.f13062u;
        List<VaultDomain> list = this.f13063v;
        cVar.f13082i1 = list;
        cVar.f13081h1 = C0724d.a(list);
        return p.f3034a;
    }
}
