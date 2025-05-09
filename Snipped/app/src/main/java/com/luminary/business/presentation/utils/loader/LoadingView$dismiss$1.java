package com.luminary.business.presentation.utils.loader;

import O9.p;
import T9.a;
import V9.d;
import ca.InterfaceC0650p;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* compiled from: LoadingView.kt */
@d(c = "com.luminary.business.presentation.utils.loader.LoadingView$dismiss$1", f = "LoadingView.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingView$dismiss$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f13340u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f13341v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f13342w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LoadingView f13343x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingView$dismiss$1(long j10, LoadingView loadingView, a<? super LoadingView$dismiss$1> aVar) {
        super(2, aVar);
        this.f13342w = j10;
        this.f13343x = loadingView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(Object obj, a<?> aVar) {
        LoadingView$dismiss$1 loadingView$dismiss$1 = new LoadingView$dismiss$1(this.f13342w, this.f13343x, aVar);
        loadingView$dismiss$1.f13341v = obj;
        return loadingView$dismiss$1;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
        return ((LoadingView$dismiss$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f13340u;
        if (i == 0) {
            b.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f13341v;
            long j10 = 500 - this.f13342w;
            this.f13341v = coroutineScope2;
            this.f13340u = 1;
            if (DelayKt.delay(j10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.f13341v;
            b.b(obj);
        }
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            super/*android.app.Dialog*/.dismiss();
        }
        return p.f3034a;
    }
}
