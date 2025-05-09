package com.luminary.business.presentation.ui.fragments.payments;

import C.v;
import F8.o;
import O9.p;
import P9.s;
import U4.b;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.presentation.entity.payment.PaymentTypeUI;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager;
import com.luminary.business.presentation.ui.fragments.payments.PaymentsFragment;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import com.luminary.business.presentation.ui.views.dialogs.SortDialogSaved$Status;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import j8.C0904c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0966k;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import s6.L;
import s6.M;
import s6.N;
import s6.O;
import s6.P;
import t6.AbstractC1437s5;

/* compiled from: PaymentsFragment.kt */
/* loaded from: classes2.dex */
public final class PaymentsFragment extends BaseFragment<AbstractC1437s5> {

    /* renamed from: A0, reason: collision with root package name */
    public final boolean f12925A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f12926B0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f12927n0 = R.layout.fragment_payments;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f12928o0 = true;

    /* renamed from: p0, reason: collision with root package name */
    public C0904c f12929p0;

    /* renamed from: q0, reason: collision with root package name */
    public final H1.a f12930q0;

    /* renamed from: r0, reason: collision with root package name */
    public PaymentsController f12931r0;
    public PaymentsTab s0;

    /* renamed from: t0, reason: collision with root package name */
    public String f12932t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f12933u0;

    /* renamed from: v0, reason: collision with root package name */
    public SortDialog.Status f12934v0;

    /* renamed from: w0, reason: collision with root package name */
    public SortDialog.Direction f12935w0;

    /* renamed from: x0, reason: collision with root package name */
    public SortDialogSaved$Status f12936x0;

    /* renamed from: y0, reason: collision with root package name */
    public Date f12937y0;

    /* renamed from: z0, reason: collision with root package name */
    public Date f12938z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentsFragment.kt */
    public static final class PaymentsTab {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentsTab f12943a;

        /* renamed from: b, reason: collision with root package name */
        public static final PaymentsTab f12944b;

        /* renamed from: c, reason: collision with root package name */
        public static final PaymentsTab f12945c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ PaymentsTab[] f12946d;

        static {
            PaymentsTab paymentsTab = new PaymentsTab("SAVED", 0);
            f12943a = paymentsTab;
            PaymentsTab paymentsTab2 = new PaymentsTab("NEW", 1);
            f12944b = paymentsTab2;
            PaymentsTab paymentsTab3 = new PaymentsTab("TRANSACTION", 2);
            f12945c = paymentsTab3;
            f12946d = new PaymentsTab[]{paymentsTab, paymentsTab2, paymentsTab3};
        }

        public PaymentsTab() {
            throw null;
        }

        public static PaymentsTab valueOf(String str) {
            return (PaymentsTab) Enum.valueOf(PaymentsTab.class, str);
        }

        public static PaymentsTab[] values() {
            return (PaymentsTab[]) f12946d.clone();
        }
    }

    /* compiled from: PaymentsFragment.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12947a;

        static {
            int[] iArr = new int[PaymentsTab.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PaymentsTab paymentsTab = PaymentsTab.f12943a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PaymentsTab paymentsTab2 = PaymentsTab.f12943a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12947a = iArr;
            int[] iArr2 = new int[PaymentType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PaymentType paymentType = PaymentType.f11147a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PaymentType paymentType2 = PaymentType.f11147a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PaymentType paymentType3 = PaymentType.f11147a;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                PaymentType paymentType4 = PaymentType.f11147a;
                iArr2[8] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[SortDialogSaved$Status.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                SortDialogSaved$Status sortDialogSaved$Status = SortDialogSaved$Status.f13226a;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: PaymentsFragment.kt */
    public static final class b extends RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            super.onScrolled(recyclerView, i, i9);
            PaymentsFragment paymentsFragment = PaymentsFragment.this;
            if (paymentsFragment.s0 != PaymentsTab.f12945c || recyclerView.canScrollVertically(1) || paymentsFragment.f12926B0) {
                return;
            }
            paymentsFragment.f12926B0 = true;
            com.luminary.business.presentation.ui.fragments.payments.a T02 = paymentsFragment.T0();
            E6.c cVar = new E6.c(T02, paymentsFragment.f12934v0, paymentsFragment.f12937y0, paymentsFragment.f12938z0, paymentsFragment.f12935w0, 5);
            T02.f419K0 = cVar;
            cVar.invoke();
        }
    }

    /* compiled from: PaymentsFragment.kt */
    public static final class c implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12949a;

        public c(InterfaceC0646l interfaceC0646l) {
            this.f12949a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12949a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12949a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.luminary.business.presentation.ui.fragments.payments.PaymentsFragment$special$$inlined$viewModel$default$1] */
    public PaymentsFragment() {
        final ?? r12 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.payments.PaymentsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12930q0 = E.a(this, h.a(com.luminary.business.presentation.ui.fragments.payments.a.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.payments.PaymentsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r12.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.payments.PaymentsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r12.invoke(), h.a(a.class), null, null, b.l(this));
            }
        });
        this.s0 = PaymentsTab.f12943a;
        this.f12932t0 = "";
        this.f12933u0 = "";
        this.f12934v0 = SortDialog.Status.f13217a;
        this.f12935w0 = SortDialog.Direction.f13213a;
        this.f12936x0 = SortDialogSaved$Status.f13226a;
        this.f12925A0 = true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        return false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void D0(Date date, Date date2) {
        this.f12937y0 = date;
        this.f12938z0 = date2;
        L0();
        com.luminary.business.presentation.ui.fragments.payments.a T02 = T0();
        T02.f12962c1 = 1;
        T02.f12957X0.clear();
        com.luminary.business.presentation.ui.fragments.payments.a T03 = T0();
        E6.c cVar = new E6.c(T03, this.f12934v0, this.f12937y0, this.f12938z0, this.f12935w0, 5);
        T03.f419K0 = cVar;
        cVar.invoke();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void E0(SortDialog.Status status, SortDialog.Direction direction) {
        this.f12934v0 = status;
        this.f12935w0 = direction;
        L0();
        com.luminary.business.presentation.ui.fragments.payments.a T02 = T0();
        T02.f12962c1 = 1;
        T02.f12957X0.clear();
        com.luminary.business.presentation.ui.fragments.payments.a T03 = T0();
        E6.c cVar = new E6.c(T03, this.f12934v0, this.f12937y0, this.f12938z0, direction, 5);
        T03.f419K0 = cVar;
        cVar.invoke();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = false;
        toolbarStatus.f13263a = getString(R.string.payments);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 28;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        String string;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = false;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        int ordinal = this.s0.ordinal();
        if (ordinal == 0) {
            string = getString(R.string.saved);
        } else if (ordinal == 1) {
            string = getString(R.string.new_payment);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string = getString(R.string.transactions);
        }
        toolbarStatus.f13263a = string;
        return toolbarStatus;
    }

    public final com.luminary.business.presentation.ui.fragments.payments.a T0() {
        return (com.luminary.business.presentation.ui.fragments.payments.a) this.f12930q0.getValue();
    }

    public final void U0() {
        this.f12938z0 = null;
        this.f12937y0 = null;
        this.f12934v0 = SortDialog.Status.f13217a;
        this.f12936x0 = SortDialogSaved$Status.f13226a;
        this.f12932t0 = "";
        this.f12933u0 = "";
        L0();
        o0();
    }

    public final void V0(List<PaymentTypeUI> list, List<TransactionUI> list2, List<H5.b> list3) {
        ArrayList arrayList;
        List<H5.b> X;
        Integer num;
        int i;
        u0().f29591q.setRefreshing(false);
        W0();
        if (list2 != null) {
            arrayList = new ArrayList();
            for (Object obj : list2) {
                Integer num2 = ((TransactionUI) obj).f11372b;
                if (num2 == null || num2.intValue() != 1) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (this.f12933u0.length() != 0) {
            if (list3 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    String str = ((H5.b) obj2).f1500e;
                    if (str != null) {
                        Locale locale = Locale.ROOT;
                        if (C0969n.Y(str.toLowerCase(locale), this.f12933u0.toLowerCase(locale), false)) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                list3 = arrayList2;
            } else {
                list3 = null;
            }
        }
        int ordinal = this.f12936x0.ordinal();
        if (ordinal == 0) {
            if (list3 != null) {
                X = s.X(list3, new A7.d(9));
            }
            X = null;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (list3 != null) {
                X = s.X(list3, new A7.d(10));
            }
            X = null;
        }
        boolean z10 = this.f12925A0;
        if (z10) {
            int ordinal2 = this.s0.ordinal();
            if (ordinal2 == 0) {
                i = 0;
            } else if (ordinal2 == 1) {
                i = 1;
            } else {
                if (ordinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 2;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        int ordinal3 = this.s0.ordinal();
        if (ordinal3 == 0) {
            PaymentsController paymentsController = this.f12931r0;
            if (paymentsController == null) {
                paymentsController = null;
            }
            paymentsController.setData2((List<PaymentTypeUI>) null, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) null, X, num);
            List<H5.b> list4 = X;
            if (list4 != null && !list4.isEmpty()) {
                o.b(u0().f29588n);
                o.b(u0().f29592r);
                return;
            }
            u0().f29588n.setVisibility(0);
            if (z10) {
                u0().f29592r.setVisibility(0);
                return;
            } else {
                o.b(u0().f29592r);
                return;
            }
        }
        if (ordinal3 == 1) {
            PaymentsController paymentsController2 = this.f12931r0;
            if (paymentsController2 == null) {
                paymentsController2 = null;
            }
            paymentsController2.setData2(list, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) null, (List<H5.b>) null, num);
            List<PaymentTypeUI> list5 = list;
            if (list5 != null && !list5.isEmpty()) {
                o.b(u0().f29588n);
                o.b(u0().f29592r);
                return;
            }
            u0().f29588n.setVisibility(0);
            if (z10) {
                u0().f29592r.setVisibility(0);
                return;
            } else {
                o.b(u0().f29592r);
                return;
            }
        }
        if (ordinal3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentsController paymentsController3 = this.f12931r0;
        if (paymentsController3 == null) {
            paymentsController3 = null;
        }
        paymentsController3.setData2((List<PaymentTypeUI>) null, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) H8.a.b(this, arrayList, null), (List<H5.b>) null, num);
        if (arrayList != null && !arrayList.isEmpty()) {
            o.b(u0().f29588n);
            o.b(u0().f29592r);
            return;
        }
        u0().f29588n.setVisibility(0);
        if (z10) {
            u0().f29592r.setVisibility(0);
        } else {
            o.b(u0().f29592r);
        }
    }

    public final void W0() {
        String string;
        AbstractC1437s5 u02 = u0();
        if (this.f12932t0.length() <= 0 && this.f12933u0.length() <= 0) {
            string = a.f12947a[this.s0.ordinal()] == 3 ? getString(R.string.you_do_not_have_any_transactions_yet) : getString(R.string.you_do_not_have_any_saved_templates);
        } else {
            string = getString(R.string.nothing_is_found);
        }
        u02.f29589o.setText(string);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, B6.a
    public final void m0() {
        U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolean z10 = v.y(arguments, C0904c.class, "isSend") ? arguments.getBoolean("isSend") : false;
            this.f12929p0 = new C0904c(z10, arguments.containsKey("isAll") ? arguments.getBoolean("isAll") : false);
            if (z10) {
                this.s0 = PaymentsTab.f12944b;
                L0();
            }
            C0904c c0904c = this.f12929p0;
            if (c0904c != null && c0904c.f22550b) {
                this.s0 = PaymentsTab.f12945c;
                L0();
            }
        }
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        M0(R.id.navigation_payments);
        V0(T0().f12959Z0.getValue(), T0().f12956W0.getValue(), T0().f12961b1.getValue());
        if (this.f12932t0.length() > 0) {
            I0(this.f12932t0);
        } else if (this.f12933u0.length() > 0) {
            I0(this.f12933u0);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC1437s5 u02 = u0();
        u02.f29589o.setText(getString(R.string.you_do_not_have_any_saved_beneficiaries_yet));
        TabLayout.d dVar = new TabLayout.d() { // from class: com.luminary.business.presentation.ui.fragments.payments.PaymentsFragment$onViewCreated$tabListener$1
            @Override // com.google.android.material.tabs.TabLayout.c
            public final void a(TabLayout.g gVar) {
                PaymentsFragment paymentsFragment = PaymentsFragment.this;
                if (paymentsFragment.getView() != null) {
                    paymentsFragment.V0(null, null, null);
                    BuildersKt__Builders_commonKt.launch$default(C0552s.a(paymentsFragment.getViewLifecycleOwner()), Dispatchers.getMain(), null, new PaymentsFragment$onViewCreated$tabListener$1$onTabSelected$1(paymentsFragment, gVar, null), 2, null);
                }
            }
        };
        final int i = 0;
        T0().f426S0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: j8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsFragment f22548b;

            {
                this.f22548b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                H5.b bVar;
                Object obj2;
                List<TransactionUI> value;
                switch (i) {
                    case 0:
                        this.f22548b.f12926B0 = false;
                        break;
                    case 1:
                        String str = (String) obj;
                        PaymentsFragment paymentsFragment = this.f22548b;
                        int ordinal = paymentsFragment.s0.ordinal();
                        Object obj3 = null;
                        if (ordinal == 0) {
                            List<H5.b> value2 = paymentsFragment.T0().f12961b1.getValue();
                            if (value2 != null) {
                                Iterator<T> it = value2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (f.b(((H5.b) obj2).f1496a, C0966k.T(str))) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                bVar = (H5.b) obj2;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                BigDecimal bigDecimal = BigDecimal.ZERO;
                                String str2 = bVar.f1503h;
                                String str3 = str2 == null ? "gbp" : str2;
                                String C10 = str2 != null ? D9.b.C(str2) : null;
                                PaymentType paymentType = PaymentType.f11148b;
                                PaymentType paymentType2 = bVar.f1502g;
                                PaymentUI paymentUI = new PaymentUI(paymentType2, bigDecimal, bVar.f1506l, bVar.f1499d, bVar.f1505k, str3, C10, paymentType2 == paymentType ? bVar.f1505k : (paymentType2 == PaymentType.f11150d || paymentType2 == PaymentType.f11151e) ? bVar.f1520z : bVar.i, bVar.f1504j, bVar.f1495A, bVar.f1512r, bVar.f1513s, bVar.f1514t, bVar.f1515u, bVar.f1516v, bVar.f1517w, bVar.f1518x, bVar.f1519y, 260096);
                                int ordinal2 = paymentType2.ordinal();
                                if (ordinal2 == 0) {
                                    U4.b.g(paymentsFragment).j(new L(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 1) {
                                    U4.b.g(paymentsFragment).j(new P(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 2) {
                                    U4.b.g(paymentsFragment).j(new M(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 3) {
                                    U4.b.g(paymentsFragment).j(new N(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 8) {
                                    U4.b.g(paymentsFragment).j(new O(paymentUI, true, R.id.paymentsFragment));
                                }
                            }
                        } else if (ordinal == 2 && (value = paymentsFragment.T0().f12956W0.getValue()) != null) {
                            Iterator<T> it2 = value.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (f.b(String.valueOf(((TransactionUI) next).f11371a), str)) {
                                        obj3 = next;
                                    }
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj3;
                            if (transactionUI != null) {
                                U4.b.g(paymentsFragment).j(new C0905d(str, transactionUI));
                            }
                        }
                        break;
                    case 2:
                        int i9 = ((PaymentTypeUI) obj).f11322a;
                        PaymentsFragment paymentsFragment2 = this.f22548b;
                        if (i9 == R.string.european) {
                            U4.b.g(paymentsFragment2).j(new M(null, false, R.id.paymentsFragment));
                        } else if (i9 == R.string.email) {
                            U4.b.g(paymentsFragment2).j(new L(null, false, R.id.paymentsFragment));
                        } else if (i9 == R.string.international) {
                            U4.b.g(paymentsFragment2).j(new N(null, false, R.id.paymentsFragment));
                        } else if (i9 == R.string.to_bank_account) {
                            U4.b.g(paymentsFragment2).j(new O(null, false, R.id.paymentsFragment));
                        } else {
                            U4.b.g(paymentsFragment2).j(new P(null, false, R.id.paymentsFragment));
                        }
                        break;
                    case 3:
                        PaymentsFragment paymentsFragment3 = this.f22548b;
                        paymentsFragment3.V0((List) obj, paymentsFragment3.T0().f12956W0.getValue(), paymentsFragment3.T0().f12961b1.getValue());
                        break;
                    case 4:
                        PaymentsFragment paymentsFragment4 = this.f22548b;
                        paymentsFragment4.f12926B0 = false;
                        paymentsFragment4.V0(paymentsFragment4.T0().f12959Z0.getValue(), (List) obj, paymentsFragment4.T0().f12961b1.getValue());
                        break;
                    default:
                        PaymentsFragment paymentsFragment5 = this.f22548b;
                        paymentsFragment5.V0(paymentsFragment5.T0().f12959Z0.getValue(), paymentsFragment5.T0().f12956W0.getValue(), (List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i9 = 1;
        final int i10 = 2;
        this.f12931r0 = new PaymentsController(requireContext(), dVar, new InterfaceC0646l(this) { // from class: j8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsFragment f22548b;

            {
                this.f22548b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                H5.b bVar;
                Object obj2;
                List<TransactionUI> value;
                switch (i9) {
                    case 0:
                        this.f22548b.f12926B0 = false;
                        break;
                    case 1:
                        String str = (String) obj;
                        PaymentsFragment paymentsFragment = this.f22548b;
                        int ordinal = paymentsFragment.s0.ordinal();
                        Object obj3 = null;
                        if (ordinal == 0) {
                            List<H5.b> value2 = paymentsFragment.T0().f12961b1.getValue();
                            if (value2 != null) {
                                Iterator<T> it = value2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (f.b(((H5.b) obj2).f1496a, C0966k.T(str))) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                bVar = (H5.b) obj2;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                BigDecimal bigDecimal = BigDecimal.ZERO;
                                String str2 = bVar.f1503h;
                                String str3 = str2 == null ? "gbp" : str2;
                                String C10 = str2 != null ? D9.b.C(str2) : null;
                                PaymentType paymentType = PaymentType.f11148b;
                                PaymentType paymentType2 = bVar.f1502g;
                                PaymentUI paymentUI = new PaymentUI(paymentType2, bigDecimal, bVar.f1506l, bVar.f1499d, bVar.f1505k, str3, C10, paymentType2 == paymentType ? bVar.f1505k : (paymentType2 == PaymentType.f11150d || paymentType2 == PaymentType.f11151e) ? bVar.f1520z : bVar.i, bVar.f1504j, bVar.f1495A, bVar.f1512r, bVar.f1513s, bVar.f1514t, bVar.f1515u, bVar.f1516v, bVar.f1517w, bVar.f1518x, bVar.f1519y, 260096);
                                int ordinal2 = paymentType2.ordinal();
                                if (ordinal2 == 0) {
                                    U4.b.g(paymentsFragment).j(new L(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 1) {
                                    U4.b.g(paymentsFragment).j(new P(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 2) {
                                    U4.b.g(paymentsFragment).j(new M(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 3) {
                                    U4.b.g(paymentsFragment).j(new N(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 8) {
                                    U4.b.g(paymentsFragment).j(new O(paymentUI, true, R.id.paymentsFragment));
                                }
                            }
                        } else if (ordinal == 2 && (value = paymentsFragment.T0().f12956W0.getValue()) != null) {
                            Iterator<T> it2 = value.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (f.b(String.valueOf(((TransactionUI) next).f11371a), str)) {
                                        obj3 = next;
                                    }
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj3;
                            if (transactionUI != null) {
                                U4.b.g(paymentsFragment).j(new C0905d(str, transactionUI));
                            }
                        }
                        break;
                    case 2:
                        int i92 = ((PaymentTypeUI) obj).f11322a;
                        PaymentsFragment paymentsFragment2 = this.f22548b;
                        if (i92 == R.string.european) {
                            U4.b.g(paymentsFragment2).j(new M(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.email) {
                            U4.b.g(paymentsFragment2).j(new L(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.international) {
                            U4.b.g(paymentsFragment2).j(new N(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.to_bank_account) {
                            U4.b.g(paymentsFragment2).j(new O(null, false, R.id.paymentsFragment));
                        } else {
                            U4.b.g(paymentsFragment2).j(new P(null, false, R.id.paymentsFragment));
                        }
                        break;
                    case 3:
                        PaymentsFragment paymentsFragment3 = this.f22548b;
                        paymentsFragment3.V0((List) obj, paymentsFragment3.T0().f12956W0.getValue(), paymentsFragment3.T0().f12961b1.getValue());
                        break;
                    case 4:
                        PaymentsFragment paymentsFragment4 = this.f22548b;
                        paymentsFragment4.f12926B0 = false;
                        paymentsFragment4.V0(paymentsFragment4.T0().f12959Z0.getValue(), (List) obj, paymentsFragment4.T0().f12961b1.getValue());
                        break;
                    default:
                        PaymentsFragment paymentsFragment5 = this.f22548b;
                        paymentsFragment5.V0(paymentsFragment5.T0().f12959Z0.getValue(), paymentsFragment5.T0().f12956W0.getValue(), (List) obj);
                        break;
                }
                return p.f3034a;
            }
        }, new InterfaceC0646l(this) { // from class: j8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsFragment f22548b;

            {
                this.f22548b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                H5.b bVar;
                Object obj2;
                List<TransactionUI> value;
                switch (i10) {
                    case 0:
                        this.f22548b.f12926B0 = false;
                        break;
                    case 1:
                        String str = (String) obj;
                        PaymentsFragment paymentsFragment = this.f22548b;
                        int ordinal = paymentsFragment.s0.ordinal();
                        Object obj3 = null;
                        if (ordinal == 0) {
                            List<H5.b> value2 = paymentsFragment.T0().f12961b1.getValue();
                            if (value2 != null) {
                                Iterator<T> it = value2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (f.b(((H5.b) obj2).f1496a, C0966k.T(str))) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                bVar = (H5.b) obj2;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                BigDecimal bigDecimal = BigDecimal.ZERO;
                                String str2 = bVar.f1503h;
                                String str3 = str2 == null ? "gbp" : str2;
                                String C10 = str2 != null ? D9.b.C(str2) : null;
                                PaymentType paymentType = PaymentType.f11148b;
                                PaymentType paymentType2 = bVar.f1502g;
                                PaymentUI paymentUI = new PaymentUI(paymentType2, bigDecimal, bVar.f1506l, bVar.f1499d, bVar.f1505k, str3, C10, paymentType2 == paymentType ? bVar.f1505k : (paymentType2 == PaymentType.f11150d || paymentType2 == PaymentType.f11151e) ? bVar.f1520z : bVar.i, bVar.f1504j, bVar.f1495A, bVar.f1512r, bVar.f1513s, bVar.f1514t, bVar.f1515u, bVar.f1516v, bVar.f1517w, bVar.f1518x, bVar.f1519y, 260096);
                                int ordinal2 = paymentType2.ordinal();
                                if (ordinal2 == 0) {
                                    U4.b.g(paymentsFragment).j(new L(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 1) {
                                    U4.b.g(paymentsFragment).j(new P(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 2) {
                                    U4.b.g(paymentsFragment).j(new M(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 3) {
                                    U4.b.g(paymentsFragment).j(new N(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 8) {
                                    U4.b.g(paymentsFragment).j(new O(paymentUI, true, R.id.paymentsFragment));
                                }
                            }
                        } else if (ordinal == 2 && (value = paymentsFragment.T0().f12956W0.getValue()) != null) {
                            Iterator<T> it2 = value.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (f.b(String.valueOf(((TransactionUI) next).f11371a), str)) {
                                        obj3 = next;
                                    }
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj3;
                            if (transactionUI != null) {
                                U4.b.g(paymentsFragment).j(new C0905d(str, transactionUI));
                            }
                        }
                        break;
                    case 2:
                        int i92 = ((PaymentTypeUI) obj).f11322a;
                        PaymentsFragment paymentsFragment2 = this.f22548b;
                        if (i92 == R.string.european) {
                            U4.b.g(paymentsFragment2).j(new M(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.email) {
                            U4.b.g(paymentsFragment2).j(new L(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.international) {
                            U4.b.g(paymentsFragment2).j(new N(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.to_bank_account) {
                            U4.b.g(paymentsFragment2).j(new O(null, false, R.id.paymentsFragment));
                        } else {
                            U4.b.g(paymentsFragment2).j(new P(null, false, R.id.paymentsFragment));
                        }
                        break;
                    case 3:
                        PaymentsFragment paymentsFragment3 = this.f22548b;
                        paymentsFragment3.V0((List) obj, paymentsFragment3.T0().f12956W0.getValue(), paymentsFragment3.T0().f12961b1.getValue());
                        break;
                    case 4:
                        PaymentsFragment paymentsFragment4 = this.f22548b;
                        paymentsFragment4.f12926B0 = false;
                        paymentsFragment4.V0(paymentsFragment4.T0().f12959Z0.getValue(), (List) obj, paymentsFragment4.T0().f12961b1.getValue());
                        break;
                    default:
                        PaymentsFragment paymentsFragment5 = this.f22548b;
                        paymentsFragment5.V0(paymentsFragment5.T0().f12959Z0.getValue(), paymentsFragment5.T0().f12956W0.getValue(), (List) obj);
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1437s5 u03 = u0();
        u03.f29590p.setLayoutManager(new StickyHeaderLinearLayoutManager(requireContext()));
        AbstractC1437s5 u04 = u0();
        PaymentsController paymentsController = this.f12931r0;
        if (paymentsController == null) {
            paymentsController = null;
        }
        u04.f29590p.setAdapter(paymentsController.getAdapter());
        AbstractC1437s5 u05 = u0();
        u05.f29590p.addOnScrollListener(new b());
        AbstractC1437s5 u06 = u0();
        u06.f29591q.setColorSchemeResources(R.color.main_color);
        AbstractC1437s5 u07 = u0();
        u07.f29591q.setOnRefreshListener(new com.sumsub.sns.geo.presentation.d(this, 11));
        final int i11 = 3;
        T0().f12959Z0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: j8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsFragment f22548b;

            {
                this.f22548b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                H5.b bVar;
                Object obj2;
                List<TransactionUI> value;
                switch (i11) {
                    case 0:
                        this.f22548b.f12926B0 = false;
                        break;
                    case 1:
                        String str = (String) obj;
                        PaymentsFragment paymentsFragment = this.f22548b;
                        int ordinal = paymentsFragment.s0.ordinal();
                        Object obj3 = null;
                        if (ordinal == 0) {
                            List<H5.b> value2 = paymentsFragment.T0().f12961b1.getValue();
                            if (value2 != null) {
                                Iterator<T> it = value2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (f.b(((H5.b) obj2).f1496a, C0966k.T(str))) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                bVar = (H5.b) obj2;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                BigDecimal bigDecimal = BigDecimal.ZERO;
                                String str2 = bVar.f1503h;
                                String str3 = str2 == null ? "gbp" : str2;
                                String C10 = str2 != null ? D9.b.C(str2) : null;
                                PaymentType paymentType = PaymentType.f11148b;
                                PaymentType paymentType2 = bVar.f1502g;
                                PaymentUI paymentUI = new PaymentUI(paymentType2, bigDecimal, bVar.f1506l, bVar.f1499d, bVar.f1505k, str3, C10, paymentType2 == paymentType ? bVar.f1505k : (paymentType2 == PaymentType.f11150d || paymentType2 == PaymentType.f11151e) ? bVar.f1520z : bVar.i, bVar.f1504j, bVar.f1495A, bVar.f1512r, bVar.f1513s, bVar.f1514t, bVar.f1515u, bVar.f1516v, bVar.f1517w, bVar.f1518x, bVar.f1519y, 260096);
                                int ordinal2 = paymentType2.ordinal();
                                if (ordinal2 == 0) {
                                    U4.b.g(paymentsFragment).j(new L(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 1) {
                                    U4.b.g(paymentsFragment).j(new P(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 2) {
                                    U4.b.g(paymentsFragment).j(new M(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 3) {
                                    U4.b.g(paymentsFragment).j(new N(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 8) {
                                    U4.b.g(paymentsFragment).j(new O(paymentUI, true, R.id.paymentsFragment));
                                }
                            }
                        } else if (ordinal == 2 && (value = paymentsFragment.T0().f12956W0.getValue()) != null) {
                            Iterator<T> it2 = value.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (f.b(String.valueOf(((TransactionUI) next).f11371a), str)) {
                                        obj3 = next;
                                    }
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj3;
                            if (transactionUI != null) {
                                U4.b.g(paymentsFragment).j(new C0905d(str, transactionUI));
                            }
                        }
                        break;
                    case 2:
                        int i92 = ((PaymentTypeUI) obj).f11322a;
                        PaymentsFragment paymentsFragment2 = this.f22548b;
                        if (i92 == R.string.european) {
                            U4.b.g(paymentsFragment2).j(new M(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.email) {
                            U4.b.g(paymentsFragment2).j(new L(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.international) {
                            U4.b.g(paymentsFragment2).j(new N(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.to_bank_account) {
                            U4.b.g(paymentsFragment2).j(new O(null, false, R.id.paymentsFragment));
                        } else {
                            U4.b.g(paymentsFragment2).j(new P(null, false, R.id.paymentsFragment));
                        }
                        break;
                    case 3:
                        PaymentsFragment paymentsFragment3 = this.f22548b;
                        paymentsFragment3.V0((List) obj, paymentsFragment3.T0().f12956W0.getValue(), paymentsFragment3.T0().f12961b1.getValue());
                        break;
                    case 4:
                        PaymentsFragment paymentsFragment4 = this.f22548b;
                        paymentsFragment4.f12926B0 = false;
                        paymentsFragment4.V0(paymentsFragment4.T0().f12959Z0.getValue(), (List) obj, paymentsFragment4.T0().f12961b1.getValue());
                        break;
                    default:
                        PaymentsFragment paymentsFragment5 = this.f22548b;
                        paymentsFragment5.V0(paymentsFragment5.T0().f12959Z0.getValue(), paymentsFragment5.T0().f12956W0.getValue(), (List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i12 = 4;
        T0().f12956W0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: j8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsFragment f22548b;

            {
                this.f22548b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                H5.b bVar;
                Object obj2;
                List<TransactionUI> value;
                switch (i12) {
                    case 0:
                        this.f22548b.f12926B0 = false;
                        break;
                    case 1:
                        String str = (String) obj;
                        PaymentsFragment paymentsFragment = this.f22548b;
                        int ordinal = paymentsFragment.s0.ordinal();
                        Object obj3 = null;
                        if (ordinal == 0) {
                            List<H5.b> value2 = paymentsFragment.T0().f12961b1.getValue();
                            if (value2 != null) {
                                Iterator<T> it = value2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (f.b(((H5.b) obj2).f1496a, C0966k.T(str))) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                bVar = (H5.b) obj2;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                BigDecimal bigDecimal = BigDecimal.ZERO;
                                String str2 = bVar.f1503h;
                                String str3 = str2 == null ? "gbp" : str2;
                                String C10 = str2 != null ? D9.b.C(str2) : null;
                                PaymentType paymentType = PaymentType.f11148b;
                                PaymentType paymentType2 = bVar.f1502g;
                                PaymentUI paymentUI = new PaymentUI(paymentType2, bigDecimal, bVar.f1506l, bVar.f1499d, bVar.f1505k, str3, C10, paymentType2 == paymentType ? bVar.f1505k : (paymentType2 == PaymentType.f11150d || paymentType2 == PaymentType.f11151e) ? bVar.f1520z : bVar.i, bVar.f1504j, bVar.f1495A, bVar.f1512r, bVar.f1513s, bVar.f1514t, bVar.f1515u, bVar.f1516v, bVar.f1517w, bVar.f1518x, bVar.f1519y, 260096);
                                int ordinal2 = paymentType2.ordinal();
                                if (ordinal2 == 0) {
                                    U4.b.g(paymentsFragment).j(new L(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 1) {
                                    U4.b.g(paymentsFragment).j(new P(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 2) {
                                    U4.b.g(paymentsFragment).j(new M(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 3) {
                                    U4.b.g(paymentsFragment).j(new N(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 8) {
                                    U4.b.g(paymentsFragment).j(new O(paymentUI, true, R.id.paymentsFragment));
                                }
                            }
                        } else if (ordinal == 2 && (value = paymentsFragment.T0().f12956W0.getValue()) != null) {
                            Iterator<T> it2 = value.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (f.b(String.valueOf(((TransactionUI) next).f11371a), str)) {
                                        obj3 = next;
                                    }
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj3;
                            if (transactionUI != null) {
                                U4.b.g(paymentsFragment).j(new C0905d(str, transactionUI));
                            }
                        }
                        break;
                    case 2:
                        int i92 = ((PaymentTypeUI) obj).f11322a;
                        PaymentsFragment paymentsFragment2 = this.f22548b;
                        if (i92 == R.string.european) {
                            U4.b.g(paymentsFragment2).j(new M(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.email) {
                            U4.b.g(paymentsFragment2).j(new L(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.international) {
                            U4.b.g(paymentsFragment2).j(new N(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.to_bank_account) {
                            U4.b.g(paymentsFragment2).j(new O(null, false, R.id.paymentsFragment));
                        } else {
                            U4.b.g(paymentsFragment2).j(new P(null, false, R.id.paymentsFragment));
                        }
                        break;
                    case 3:
                        PaymentsFragment paymentsFragment3 = this.f22548b;
                        paymentsFragment3.V0((List) obj, paymentsFragment3.T0().f12956W0.getValue(), paymentsFragment3.T0().f12961b1.getValue());
                        break;
                    case 4:
                        PaymentsFragment paymentsFragment4 = this.f22548b;
                        paymentsFragment4.f12926B0 = false;
                        paymentsFragment4.V0(paymentsFragment4.T0().f12959Z0.getValue(), (List) obj, paymentsFragment4.T0().f12961b1.getValue());
                        break;
                    default:
                        PaymentsFragment paymentsFragment5 = this.f22548b;
                        paymentsFragment5.V0(paymentsFragment5.T0().f12959Z0.getValue(), paymentsFragment5.T0().f12956W0.getValue(), (List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i13 = 5;
        T0().f12961b1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: j8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsFragment f22548b;

            {
                this.f22548b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                H5.b bVar;
                Object obj2;
                List<TransactionUI> value;
                switch (i13) {
                    case 0:
                        this.f22548b.f12926B0 = false;
                        break;
                    case 1:
                        String str = (String) obj;
                        PaymentsFragment paymentsFragment = this.f22548b;
                        int ordinal = paymentsFragment.s0.ordinal();
                        Object obj3 = null;
                        if (ordinal == 0) {
                            List<H5.b> value2 = paymentsFragment.T0().f12961b1.getValue();
                            if (value2 != null) {
                                Iterator<T> it = value2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (f.b(((H5.b) obj2).f1496a, C0966k.T(str))) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                bVar = (H5.b) obj2;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                BigDecimal bigDecimal = BigDecimal.ZERO;
                                String str2 = bVar.f1503h;
                                String str3 = str2 == null ? "gbp" : str2;
                                String C10 = str2 != null ? D9.b.C(str2) : null;
                                PaymentType paymentType = PaymentType.f11148b;
                                PaymentType paymentType2 = bVar.f1502g;
                                PaymentUI paymentUI = new PaymentUI(paymentType2, bigDecimal, bVar.f1506l, bVar.f1499d, bVar.f1505k, str3, C10, paymentType2 == paymentType ? bVar.f1505k : (paymentType2 == PaymentType.f11150d || paymentType2 == PaymentType.f11151e) ? bVar.f1520z : bVar.i, bVar.f1504j, bVar.f1495A, bVar.f1512r, bVar.f1513s, bVar.f1514t, bVar.f1515u, bVar.f1516v, bVar.f1517w, bVar.f1518x, bVar.f1519y, 260096);
                                int ordinal2 = paymentType2.ordinal();
                                if (ordinal2 == 0) {
                                    U4.b.g(paymentsFragment).j(new L(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 1) {
                                    U4.b.g(paymentsFragment).j(new P(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 2) {
                                    U4.b.g(paymentsFragment).j(new M(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 3) {
                                    U4.b.g(paymentsFragment).j(new N(paymentUI, true, R.id.paymentsFragment));
                                } else if (ordinal2 == 8) {
                                    U4.b.g(paymentsFragment).j(new O(paymentUI, true, R.id.paymentsFragment));
                                }
                            }
                        } else if (ordinal == 2 && (value = paymentsFragment.T0().f12956W0.getValue()) != null) {
                            Iterator<T> it2 = value.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (f.b(String.valueOf(((TransactionUI) next).f11371a), str)) {
                                        obj3 = next;
                                    }
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj3;
                            if (transactionUI != null) {
                                U4.b.g(paymentsFragment).j(new C0905d(str, transactionUI));
                            }
                        }
                        break;
                    case 2:
                        int i92 = ((PaymentTypeUI) obj).f11322a;
                        PaymentsFragment paymentsFragment2 = this.f22548b;
                        if (i92 == R.string.european) {
                            U4.b.g(paymentsFragment2).j(new M(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.email) {
                            U4.b.g(paymentsFragment2).j(new L(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.international) {
                            U4.b.g(paymentsFragment2).j(new N(null, false, R.id.paymentsFragment));
                        } else if (i92 == R.string.to_bank_account) {
                            U4.b.g(paymentsFragment2).j(new O(null, false, R.id.paymentsFragment));
                        } else {
                            U4.b.g(paymentsFragment2).j(new P(null, false, R.id.paymentsFragment));
                        }
                        break;
                    case 3:
                        PaymentsFragment paymentsFragment3 = this.f22548b;
                        paymentsFragment3.V0((List) obj, paymentsFragment3.T0().f12956W0.getValue(), paymentsFragment3.T0().f12961b1.getValue());
                        break;
                    case 4:
                        PaymentsFragment paymentsFragment4 = this.f22548b;
                        paymentsFragment4.f12926B0 = false;
                        paymentsFragment4.V0(paymentsFragment4.T0().f12959Z0.getValue(), (List) obj, paymentsFragment4.T0().f12961b1.getValue());
                        break;
                    default:
                        PaymentsFragment paymentsFragment5 = this.f22548b;
                        paymentsFragment5.V0(paymentsFragment5.T0().f12959Z0.getValue(), paymentsFragment5.T0().f12956W0.getValue(), (List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12927n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean x0() {
        return this.f12928o0;
    }
}
