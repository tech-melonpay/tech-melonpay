package com.chuckerteam.chucker.internal.ui.transaction;

import O9.p;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: TransactionPayloadFragment.kt */
@V9.d(c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$onViewCreated$2$1", f = "TransactionPayloadFragment.kt", l = {134}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class TransactionPayloadFragment$onViewCreated$2$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f8754u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ TransactionPayloadFragment f8755v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HttpTransaction f8756w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f8757x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPayloadFragment$onViewCreated$2$1(TransactionPayloadFragment transactionPayloadFragment, HttpTransaction httpTransaction, boolean z10, T9.a<? super TransactionPayloadFragment$onViewCreated$2$1> aVar) {
        super(2, aVar);
        this.f8755v = transactionPayloadFragment;
        this.f8756w = httpTransaction;
        this.f8757x = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new TransactionPayloadFragment$onViewCreated$2$1(this.f8755v, this.f8756w, this.f8757x, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((TransactionPayloadFragment$onViewCreated$2$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f8754u;
        TransactionPayloadFragment transactionPayloadFragment = this.f8755v;
        if (i == 0) {
            kotlin.b.b(obj);
            H1.c cVar = transactionPayloadFragment.f8740i0;
            if (cVar == null) {
                cVar = null;
            }
            ((CircularProgressIndicator) cVar.f1441d).setVisibility(0);
            PayloadType o02 = transactionPayloadFragment.o0();
            this.f8754u = 1;
            transactionPayloadFragment.getClass();
            obj = BuildersKt.withContext(Dispatchers.getDefault(), new TransactionPayloadFragment$processPayload$2(o02, this.f8756w, this.f8757x, transactionPayloadFragment, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            H1.c cVar2 = transactionPayloadFragment.f8740i0;
            if (cVar2 == null) {
                cVar2 = null;
            }
            ((TextView) cVar2.f1438a).setText(transactionPayloadFragment.o0() == PayloadType.f8712b ? transactionPayloadFragment.getString(R.string.chucker_response_is_empty) : transactionPayloadFragment.getString(R.string.chucker_request_is_empty));
            ((Group) cVar2.f1440c).setVisibility(0);
            ((RecyclerView) cVar2.f1442e).setVisibility(8);
        } else {
            a aVar = transactionPayloadFragment.f8741j0;
            ArrayList<d> arrayList = aVar.f8772e;
            int size = arrayList.size();
            arrayList.clear();
            arrayList.addAll(list);
            aVar.notifyItemRangeRemoved(0, size);
            aVar.notifyItemRangeInserted(0, arrayList.size());
            H1.c cVar3 = transactionPayloadFragment.f8740i0;
            if (cVar3 == null) {
                cVar3 = null;
            }
            ((Group) cVar3.f1440c).setVisibility(8);
            ((RecyclerView) cVar3.f1442e).setVisibility(0);
        }
        transactionPayloadFragment.requireActivity().invalidateOptionsMenu();
        H1.c cVar4 = transactionPayloadFragment.f8740i0;
        ((CircularProgressIndicator) (cVar4 != null ? cVar4 : null).f1441d).setVisibility(8);
        return p.f3034a;
    }
}
