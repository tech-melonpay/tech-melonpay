package com.chuckerteam.chucker.internal.ui.transaction;

import O9.p;
import S1.k;
import android.content.Intent;
import ca.InterfaceC0650p;
import com.luminary.mobile.R;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TransactionActivity.kt */
@V9.d(c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsText$1", f = "TransactionActivity.kt", l = {118}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
final class TransactionActivity$shareTransactionAsText$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8730u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f8731v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransactionActivity f8732w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionActivity$shareTransactionAsText$1(k kVar, TransactionActivity transactionActivity, T9.a<? super TransactionActivity$shareTransactionAsText$1> aVar) {
        super(2, aVar);
        this.f8731v = kVar;
        this.f8732w = transactionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new TransactionActivity$shareTransactionAsText$1(this.f8731v, this.f8732w, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((TransactionActivity$shareTransactionAsText$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f8730u;
        TransactionActivity transactionActivity = this.f8732w;
        if (i == 0) {
            kotlin.b.b(obj);
            String string = transactionActivity.getString(R.string.chucker_share_transaction_title);
            String string2 = transactionActivity.getString(R.string.chucker_share_transaction_subject);
            this.f8730u = 1;
            obj = com.chuckerteam.chucker.internal.support.b.b(this.f8731v, transactionActivity, string, string2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        transactionActivity.startActivity((Intent) obj);
        return p.f3034a;
    }
}
