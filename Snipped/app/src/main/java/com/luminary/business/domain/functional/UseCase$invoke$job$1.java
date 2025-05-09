package com.luminary.business.domain.functional;

import J5.b;
import O9.p;
import V9.d;
import ca.InterfaceC0650p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [Type] */
/* compiled from: UseCase.kt */
@d(c = "com.luminary.business.domain.functional.UseCase$invoke$job$1", f = "UseCase.kt", l = {13}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UseCase$invoke$job$1<Type> extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super J5.a<? extends b, ? extends Type>>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f11158u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a<Type, Params> f11159v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Params f11160w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UseCase$invoke$job$1(a<? extends Type, ? super Params> aVar, Params params, T9.a<? super UseCase$invoke$job$1> aVar2) {
        super(2, aVar2);
        this.f11159v = aVar;
        this.f11160w = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new UseCase$invoke$job$1(this.f11159v, this.f11160w, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, Object obj) {
        return ((UseCase$invoke$job$1) create(coroutineScope, (T9.a) obj)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f11158u;
        if (i == 0) {
            kotlin.b.b(obj);
            this.f11158u = 1;
            obj = this.f11159v.b(this.f11160w, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
