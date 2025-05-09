package com.chuckerteam.chucker.internal.ui.transaction;

import Ka.y;
import O9.p;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.luminary.mobile.R;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TransactionPayloadFragment.kt */
@V9.d(c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$saveToFile$1$1", f = "TransactionPayloadFragment.kt", l = {68}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class TransactionPayloadFragment$saveToFile$1$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8765u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8766v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Uri f8767w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f8768x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TransactionPayloadFragment f8769y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ HttpTransaction f8770z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPayloadFragment$saveToFile$1$1(Uri uri, Context context, TransactionPayloadFragment transactionPayloadFragment, HttpTransaction httpTransaction, T9.a<? super TransactionPayloadFragment$saveToFile$1$1> aVar) {
        super(2, aVar);
        this.f8767w = uri;
        this.f8768x = context;
        this.f8769y = transactionPayloadFragment;
        this.f8770z = httpTransaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        TransactionPayloadFragment$saveToFile$1$1 transactionPayloadFragment$saveToFile$1$1 = new TransactionPayloadFragment$saveToFile$1$1(this.f8767w, this.f8768x, this.f8769y, this.f8770z, aVar);
        transactionPayloadFragment$saveToFile$1$1.f8766v = obj;
        return transactionPayloadFragment$saveToFile$1$1;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((TransactionPayloadFragment$saveToFile$1$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f8765u;
        Context context = this.f8768x;
        if (i == 0) {
            kotlin.b.b(obj);
            TransactionPayloadFragment transactionPayloadFragment = this.f8769y;
            try {
                failure = TransactionPayloadFragment.c(transactionPayloadFragment, transactionPayloadFragment.o0(), this.f8770z);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a10 = Result.a(failure);
            if (a10 != null) {
                Log.e("Chucker", "Failed to save transaction to a file", a10);
                return p.f3034a;
            }
            ContentResolver contentResolver = context.getContentResolver();
            this.f8765u = 1;
            obj = com.chuckerteam.chucker.internal.support.a.a((y) failure, this, contentResolver, this.f8767w);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        Toast.makeText(context, ((Boolean) obj).booleanValue() ? R.string.chucker_file_saved : R.string.chucker_file_not_saved, 0).show();
        return p.f3034a;
    }
}
