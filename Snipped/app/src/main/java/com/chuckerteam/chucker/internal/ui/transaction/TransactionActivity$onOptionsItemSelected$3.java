package com.chuckerteam.chucker.internal.ui.transaction;

import O9.p;
import S1.k;
import S1.m;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TransactionActivity.kt */
@V9.d(c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$onOptionsItemSelected$3", f = "TransactionActivity.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "LS1/k;", "<anonymous>", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)LS1/k;"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class TransactionActivity$onOptionsItemSelected$3 extends SuspendLambda implements InterfaceC0650p<HttpTransaction, T9.a<? super k>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8718u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TransactionActivity f8719v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionActivity$onOptionsItemSelected$3(TransactionActivity transactionActivity, T9.a<? super TransactionActivity$onOptionsItemSelected$3> aVar) {
        super(2, aVar);
        this.f8719v = transactionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        TransactionActivity$onOptionsItemSelected$3 transactionActivity$onOptionsItemSelected$3 = new TransactionActivity$onOptionsItemSelected$3(this.f8719v, aVar);
        transactionActivity$onOptionsItemSelected$3.f8718u = obj;
        return transactionActivity$onOptionsItemSelected$3;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(HttpTransaction httpTransaction, T9.a<? super k> aVar) {
        return ((TransactionActivity$onOptionsItemSelected$3) create(httpTransaction, aVar)).invokeSuspend(p.f3034a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        kotlin.b.b(obj);
        HttpTransaction httpTransaction = (HttpTransaction) this.f8718u;
        int i = TransactionActivity.f8714k;
        return new m(httpTransaction, ((Boolean) this.f8719v.s().f3658p.getValue()).booleanValue());
    }
}
