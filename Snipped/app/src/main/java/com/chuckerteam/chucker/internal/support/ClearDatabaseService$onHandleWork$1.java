package com.chuckerteam.chucker.internal.support;

import C.N;
import O9.p;
import S1.j;
import V9.d;
import android.util.LongSparseArray;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ClearDatabaseService.kt */
@d(c = "com.chuckerteam.chucker.internal.support.ClearDatabaseService$onHandleWork$1", f = "ClearDatabaseService.kt", l = {16}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
final class ClearDatabaseService$onHandleWork$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8629u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ClearDatabaseService f8630v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearDatabaseService$onHandleWork$1(ClearDatabaseService clearDatabaseService, T9.a<? super ClearDatabaseService$onHandleWork$1> aVar) {
        super(2, aVar);
        this.f8630v = clearDatabaseService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new ClearDatabaseService$onHandleWork$1(this.f8630v, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((ClearDatabaseService$onHandleWork$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f8629u;
        if (i == 0) {
            kotlin.b.b(obj);
            N n10 = Ja.a.f2210a;
            if (n10 == null) {
                throw new IllegalStateException("You can't access the transaction repository if you don't initialize it!".toString());
            }
            this.f8629u = 1;
            Object e10 = ((ChuckerDatabase) n10.f535b).a().e(this);
            if (e10 != coroutineSingletons) {
                e10 = p.f3034a;
            }
            if (e10 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        LongSparseArray<HttpTransaction> longSparseArray = j.f3355c;
        synchronized (longSparseArray) {
            longSparseArray.clear();
            j.f3356d.clear();
            p pVar = p.f3034a;
        }
        new j(this.f8630v.getApplicationContext()).f3358b.cancel(1138);
        return p.f3034a;
    }
}
