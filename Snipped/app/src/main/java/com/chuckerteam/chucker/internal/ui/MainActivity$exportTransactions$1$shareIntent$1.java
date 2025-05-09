package com.chuckerteam.chucker.internal.ui;

import O9.p;
import S1.k;
import V9.d;
import android.content.Intent;
import ca.InterfaceC0650p;
import com.luminary.mobile.R;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainActivity.kt */
@d(c = "com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1$shareIntent$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainActivity$exportTransactions$1$shareIntent$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super Intent>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f8683u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MainActivity f8684v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f8685w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$exportTransactions$1$shareIntent$1(k kVar, MainActivity mainActivity, String str, T9.a<? super MainActivity$exportTransactions$1$shareIntent$1> aVar) {
        super(2, aVar);
        this.f8683u = kVar;
        this.f8684v = mainActivity;
        this.f8685w = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new MainActivity$exportTransactions$1$shareIntent$1(this.f8683u, this.f8684v, this.f8685w, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super Intent> aVar) {
        return ((MainActivity$exportTransactions$1$shareIntent$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        kotlin.b.b(obj);
        MainActivity mainActivity = this.f8684v;
        return com.chuckerteam.chucker.internal.support.b.a(this.f8683u, mainActivity, this.f8685w, mainActivity.getString(R.string.chucker_share_all_transactions_title), mainActivity.getString(R.string.chucker_share_all_transactions_subject), "transactions");
    }
}
