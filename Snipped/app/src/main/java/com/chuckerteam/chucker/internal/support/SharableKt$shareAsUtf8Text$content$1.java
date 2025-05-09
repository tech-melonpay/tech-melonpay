package com.chuckerteam.chucker.internal.support;

import Ka.t;
import O9.p;
import S1.k;
import V9.d;
import android.app.Activity;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Sharable.kt */
@d(c = "com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$content$1", f = "Sharable.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SharableKt$shareAsUtf8Text$content$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super String>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f8647u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Activity f8648v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharableKt$shareAsUtf8Text$content$1(k kVar, Activity activity, T9.a<? super SharableKt$shareAsUtf8Text$content$1> aVar) {
        super(2, aVar);
        this.f8647u = kVar;
        this.f8648v = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new SharableKt$shareAsUtf8Text$content$1(this.f8647u, this.f8648v, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super String> aVar) {
        return ((SharableKt$shareAsUtf8Text$content$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        kotlin.b.b(obj);
        t tVar = new t(this.f8647u.a(this.f8648v));
        try {
            String y10 = tVar.y();
            U4.b.d(tVar, null);
            return y10;
        } finally {
        }
    }
}
