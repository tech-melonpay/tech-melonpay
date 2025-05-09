package com.luminary.business.presentation.ui.fragments.statements;

import C.v;
import O9.p;
import P9.n;
import V9.d;
import ca.InterfaceC0650p;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import java.util.ArrayList;
import java.util.List;
import ka.C0970o;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StatementsViewModel.kt */
@d(c = "com.luminary.business.presentation.ui.fragments.statements.StatementsViewModel$loadCards$1$1$2$1", f = "StatementsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class StatementsViewModel$loadCards$1$1$2$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f13060u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List<CardsDomain> f13061v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatementsViewModel$loadCards$1$1$2$1(c cVar, List<CardsDomain> list, T9.a<? super StatementsViewModel$loadCards$1$1$2$1> aVar) {
        super(2, aVar);
        this.f13060u = cVar;
        this.f13061v = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new StatementsViewModel$loadCards$1$1$2$1(this.f13060u, this.f13061v, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((StatementsViewModel$loadCards$1$1$2$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        kotlin.b.b(obj);
        c cVar = this.f13060u;
        List<CardsDomain> list = this.f13061v;
        cVar.f13083j1 = list;
        List<CardsDomain> list2 = list;
        ArrayList arrayList = new ArrayList(n.u(list2, 10));
        for (CardsDomain cardsDomain : list2) {
            String str = cardsDomain.f10730g;
            String j10 = s3.b.j("**** **** **** ", str != null ? C0970o.A0(4, str) : null);
            String str2 = cardsDomain.f10728e;
            arrayList.add(new StatementsSelectorDialog.a(j10, v.p(str2, " • ", D9.b.A(str2)), "", null, null, null, null, cardsDomain.f10724a, false, 376));
        }
        cVar.f13084k1 = arrayList;
        return p.f3034a;
    }
}
