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
@V9.d(c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1$shareIntent$1", f = "TransactionActivity.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionActivity$shareTransactionAsFile$1$shareIntent$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super Intent>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f8727u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TransactionActivity f8728v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f8729w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionActivity$shareTransactionAsFile$1$shareIntent$1(k kVar, TransactionActivity transactionActivity, String str, T9.a<? super TransactionActivity$shareTransactionAsFile$1$shareIntent$1> aVar) {
        super(2, aVar);
        this.f8727u = kVar;
        this.f8728v = transactionActivity;
        this.f8729w = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new TransactionActivity$shareTransactionAsFile$1$shareIntent$1(this.f8727u, this.f8728v, this.f8729w, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super Intent> aVar) {
        return ((TransactionActivity$shareTransactionAsFile$1$shareIntent$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        kotlin.b.b(obj);
        TransactionActivity transactionActivity = this.f8728v;
        return com.chuckerteam.chucker.internal.support.b.a(this.f8727u, transactionActivity, this.f8729w, transactionActivity.getString(R.string.chucker_share_transaction_title), transactionActivity.getString(R.string.chucker_share_transaction_subject), "transaction");
    }
}
