package com.chuckerteam.chucker.internal.ui.transaction;

import O9.p;
import S1.k;
import S1.l;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.HarUtils;
import com.luminary.mobile.R;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TransactionActivity.kt */
@V9.d(c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$onOptionsItemSelected$4", f = "TransactionActivity.kt", l = {99}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "LS1/k;", "<anonymous>", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)LS1/k;"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class TransactionActivity$onOptionsItemSelected$4 extends SuspendLambda implements InterfaceC0650p<HttpTransaction, T9.a<? super k>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8720u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8721v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransactionActivity f8722w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionActivity$onOptionsItemSelected$4(TransactionActivity transactionActivity, T9.a<? super TransactionActivity$onOptionsItemSelected$4> aVar) {
        super(2, aVar);
        this.f8722w = transactionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        TransactionActivity$onOptionsItemSelected$4 transactionActivity$onOptionsItemSelected$4 = new TransactionActivity$onOptionsItemSelected$4(this.f8722w, aVar);
        transactionActivity$onOptionsItemSelected$4.f8721v = obj;
        return transactionActivity$onOptionsItemSelected$4;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(HttpTransaction httpTransaction, T9.a<? super k> aVar) {
        return ((TransactionActivity$onOptionsItemSelected$4) create(httpTransaction, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f8720u;
        if (i == 0) {
            kotlin.b.b(obj);
            HttpTransaction httpTransaction = (HttpTransaction) this.f8721v;
            HarUtils harUtils = HarUtils.f8635a;
            List<HttpTransaction> singletonList = Collections.singletonList(httpTransaction);
            TransactionActivity transactionActivity = this.f8722w;
            String string = transactionActivity.getString(R.string.chucker_name);
            String string2 = transactionActivity.getString(R.string.chucker_version);
            this.f8720u = 1;
            obj = harUtils.a(singletonList, string, string2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return new l((String) obj, 1);
    }
}
