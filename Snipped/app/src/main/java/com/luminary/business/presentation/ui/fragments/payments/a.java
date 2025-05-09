package com.luminary.business.presentation.ui.fragments.payments;

import B6.i;
import H5.b;
import P9.m;
import androidx.lifecycle.C0559z;
import com.luminary.business.presentation.entity.payment.PaymentTypeUI;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.mobile.R;
import g8.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import o6.j;
import q6.C1134b;

/* compiled from: PaymentsViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final j f12953T0;

    /* renamed from: U0, reason: collision with root package name */
    public final C1134b f12954U0;

    /* renamed from: V0, reason: collision with root package name */
    public final K5.a f12955V0;

    /* renamed from: W0, reason: collision with root package name */
    public final C0559z<List<TransactionUI>> f12956W0 = new C0559z<>();

    /* renamed from: X0, reason: collision with root package name */
    public final ArrayList<TransactionUI> f12957X0 = new ArrayList<>();

    /* renamed from: Y0, reason: collision with root package name */
    public final C0559z<List<PaymentTypeUI>> f12958Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final C0559z<List<PaymentTypeUI>> f12959Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final C0559z<List<b>> f12960a1;

    /* renamed from: b1, reason: collision with root package name */
    public final C0559z<List<b>> f12961b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f12962c1;

    public a(j jVar, C1134b c1134b, K5.a aVar) {
        this.f12953T0 = jVar;
        this.f12954U0 = c1134b;
        this.f12955V0 = aVar;
        C0559z<List<PaymentTypeUI>> c0559z = new C0559z<>();
        this.f12958Y0 = c0559z;
        this.f12959Z0 = c0559z;
        C0559z<List<b>> c0559z2 = new C0559z<>();
        this.f12960a1 = c0559z2;
        this.f12961b1 = c0559z2;
        C0559z c0559z3 = new C0559z();
        this.f12962c1 = 1;
        c0559z3.postValue(EmptyList.f23104a);
        h0();
        i0();
    }

    public final void h0() {
        g gVar = new g(this, 7);
        this.f418J0 = gVar;
        gVar.invoke();
    }

    public final void i0() {
        this.f12958Y0.postValue(m.q(new PaymentTypeUI(R.string.to_bank_account, R.string.pay_to_an_international_bank_account, R.drawable.ic_international, PaymentTypeUI.Type.f11326a), new PaymentTypeUI(R.string.email, R.string.pay_to_a_bank_app_customer, R.drawable.ic_bank_email_payment, PaymentTypeUI.Type.f11327b)));
    }
}
