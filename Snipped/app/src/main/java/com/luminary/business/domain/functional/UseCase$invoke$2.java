package com.luminary.business.domain.functional;

import J5.b;
import O9.p;
import V9.d;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: UseCase.kt */
@d(c = "com.luminary.business.domain.functional.UseCase$invoke$2", f = "UseCase.kt", l = {14}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UseCase$invoke$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0646l f11154u;

    /* renamed from: v, reason: collision with root package name */
    public int f11155v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0646l<J5.a<? extends b, ? extends Type>, p> f11156w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Deferred<J5.a<b, Type>> f11157x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UseCase$invoke$2(InterfaceC0646l<? super J5.a<? extends b, ? extends Type>, p> interfaceC0646l, Deferred<? extends J5.a<? extends b, ? extends Type>> deferred, T9.a<? super UseCase$invoke$2> aVar) {
        super(2, aVar);
        this.f11156w = interfaceC0646l;
        this.f11157x = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new UseCase$invoke$2(this.f11156w, this.f11157x, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((UseCase$invoke$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC0646l interfaceC0646l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f11155v;
        if (i == 0) {
            kotlin.b.b(obj);
            InterfaceC0646l interfaceC0646l2 = this.f11156w;
            this.f11154u = interfaceC0646l2;
            this.f11155v = 1;
            Object await = this.f11157x.await(this);
            if (await == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC0646l = interfaceC0646l2;
            obj = await;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0646l = this.f11154u;
            kotlin.b.b(obj);
        }
        interfaceC0646l.invoke(obj);
        return p.f3034a;
    }
}
