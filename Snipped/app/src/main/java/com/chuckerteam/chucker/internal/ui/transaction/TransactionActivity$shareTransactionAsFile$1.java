package com.chuckerteam.chucker.internal.ui.transaction;

import O9.p;
import S1.k;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TransactionActivity.kt */
@V9.d(c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1", f = "TransactionActivity.kt", l = {139, 141}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
final class TransactionActivity$shareTransactionAsFile$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8723u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TransactionActivity f8724v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0650p<HttpTransaction, T9.a<? super k>, Object> f8725w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f8726x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransactionActivity$shareTransactionAsFile$1(TransactionActivity transactionActivity, InterfaceC0650p<? super HttpTransaction, ? super T9.a<? super k>, ? extends Object> interfaceC0650p, String str, T9.a<? super TransactionActivity$shareTransactionAsFile$1> aVar) {
        super(2, aVar);
        this.f8724v = transactionActivity;
        this.f8725w = interfaceC0650p;
        this.f8726x = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new TransactionActivity$shareTransactionAsFile$1(this.f8724v, this.f8725w, this.f8726x, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((TransactionActivity$shareTransactionAsFile$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r7.f8723u
            r2 = 1
            r3 = 2
            com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity r4 = r7.f8724v
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L1a
            if (r1 != r3) goto L12
            kotlin.b.b(r8)
            goto L60
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.b.b(r8)
            goto L49
        L1e:
            kotlin.b.b(r8)
            int r8 = com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity.f8714k
            U1.h r8 = r4.s()
            androidx.lifecycle.x<com.chuckerteam.chucker.internal.data.entity.HttpTransaction> r8 = r8.f3655E0
            java.lang.Object r8 = r8.getValue()
            com.chuckerteam.chucker.internal.data.entity.HttpTransaction r8 = (com.chuckerteam.chucker.internal.data.entity.HttpTransaction) r8
            if (r8 != 0) goto L3e
            r8 = 2132017400(0x7f1400f8, float:1.9673077E38)
            java.lang.String r8 = r4.getString(r8)
            T1.a.l(r4, r8)
            O9.p r8 = O9.p.f3034a
            return r8
        L3e:
            r7.f8723u = r2
            ca.p<com.chuckerteam.chucker.internal.data.entity.HttpTransaction, T9.a<? super S1.k>, java.lang.Object> r1 = r7.f8725w
            java.lang.Object r8 = r1.invoke(r8, r7)
            if (r8 != r0) goto L49
            return r0
        L49:
            S1.k r8 = (S1.k) r8
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()
            com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1$shareIntent$1 r2 = new com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1$shareIntent$1
            java.lang.String r5 = r7.f8726x
            r6 = 0
            r2.<init>(r8, r4, r5, r6)
            r7.f8723u = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r1, r2, r7)
            if (r8 != r0) goto L60
            return r0
        L60:
            android.content.Intent r8 = (android.content.Intent) r8
            if (r8 == 0) goto L68
            r4.startActivity(r8)
            goto L77
        L68:
            android.content.Context r8 = r4.getApplicationContext()
            r0 = 2132017379(0x7f1400e3, float:1.9673035E38)
            r1 = 0
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r1)
            r8.show()
        L77:
            O9.p r8 = O9.p.f3034a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
