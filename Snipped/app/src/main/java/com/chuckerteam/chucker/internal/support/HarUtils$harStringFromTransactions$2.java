package com.chuckerteam.chucker.internal.support;

import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.google.gson.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HarUtils.kt */
@d(c = "com.chuckerteam.chucker.internal.support.HarUtils$harStringFromTransactions$2", f = "HarUtils.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HarUtils$harStringFromTransactions$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super String>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List<HttpTransaction> f8639u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f8640v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f8641w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HarUtils$harStringFromTransactions$2(List<HttpTransaction> list, String str, String str2, T9.a<? super HarUtils$harStringFromTransactions$2> aVar) {
        super(2, aVar);
        this.f8639u = list;
        this.f8640v = str;
        this.f8641w = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new HarUtils$harStringFromTransactions$2(this.f8639u, this.f8640v, this.f8641w, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super String> aVar) {
        return ((HarUtils$harStringFromTransactions$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        kotlin.b.b(obj);
        return ((g) S1.g.f3346a.getValue()).h(new J1.a(this.f8639u, new K1.b(this.f8640v, this.f8641w)));
    }
}
