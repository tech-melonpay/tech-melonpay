package com.luminary.business.presentation.ui.fragments.all_transactions;

import E6.c;
import E6.d;
import F8.o;
import O9.p;
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
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.all_transactions.AllTransactionsFragment;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import t6.K2;

/* compiled from: AllTransactionsFragment.kt */
/* loaded from: classes2.dex */
public final class AllTransactionsFragment extends BaseFragment<K2> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11501n0 = R.layout.fragment_all_transactions;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11502o0;

    /* renamed from: p0, reason: collision with root package name */
    public AllTransactionsController f11503p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f11504q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f11505r0;
    public SortDialog.Status s0;

    /* renamed from: t0, reason: collision with root package name */
    public SortDialog.Direction f11506t0;

    /* renamed from: u0, reason: collision with root package name */
    public Date f11507u0;

    /* renamed from: v0, reason: collision with root package name */
    public Date f11508v0;

    /* renamed from: w0, reason: collision with root package name */
    public final boolean f11509w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f11510x0;

    /* compiled from: AllTransactionsFragment.kt */
    public static final class a extends RecyclerView.s {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            super.onScrolled(recyclerView, i, i9);
            if (recyclerView.canScrollVertically(1)) {
                return;
            }
            AllTransactionsFragment allTransactionsFragment = AllTransactionsFragment.this;
            if (allTransactionsFragment.f11510x0) {
                return;
            }
            allTransactionsFragment.f11510x0 = true;
            d T02 = allTransactionsFragment.T0();
            c cVar = new c(T02, allTransactionsFragment.s0, allTransactionsFragment.f11507u0, allTransactionsFragment.f11508v0, allTransactionsFragment.f11506t0, 0);
            T02.f418J0 = cVar;
            cVar.invoke();
        }
    }

    /* compiled from: AllTransactionsFragment.kt */
    public static final class b implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11516a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f11516a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11516a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11516a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.all_transactions.AllTransactionsFragment$special$$inlined$viewModel$default$1] */
    public AllTransactionsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.all_transactions.AllTransactionsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11502o0 = E.a(this, h.a(d.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.all_transactions.AllTransactionsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.all_transactions.AllTransactionsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(d.class), null, null, b.l(this));
            }
        });
        this.f11504q0 = "";
        this.f11505r0 = "";
        this.s0 = SortDialog.Status.f13217a;
        this.f11506t0 = SortDialog.Direction.f13213a;
        this.f11509w0 = true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void D0(Date date, Date date2) {
        this.f11507u0 = date;
        this.f11508v0 = date2;
        L0();
        d T02 = T0();
        T02.f1068X0 = 1;
        T02.f1067W0.clear();
        d T03 = T0();
        c cVar = new c(T03, this.s0, this.f11507u0, this.f11508v0, this.f11506t0, 0);
        T03.f418J0 = cVar;
        cVar.invoke();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void E0(SortDialog.Status status, SortDialog.Direction direction) {
        this.f11506t0 = direction;
        this.s0 = status;
        L0();
        d T02 = T0();
        T02.f1068X0 = 1;
        T02.f1067W0.clear();
        d T03 = T0();
        c cVar = new c(T03, this.s0, this.f11507u0, this.f11508v0, direction, 0);
        T03.f418J0 = cVar;
        cVar.invoke();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.transactions);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13263a = getString(R.string.transactions);
        return toolbarStatus;
    }

    public final d T0() {
        return (d) this.f11502o0.getValue();
    }

    public final void U0(List<TransactionUI> list) {
        ArrayList arrayList;
        u0().f28067q.setRefreshing(false);
        V0();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Integer num = ((TransactionUI) obj).f11372b;
                if (num == null || num.intValue() != 1) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        AllTransactionsController allTransactionsController = this.f11503p0;
        if (allTransactionsController == null) {
            allTransactionsController = null;
        }
        allTransactionsController.setDataForHeader(H8.a.b(this, arrayList, null));
        if (arrayList != null && !arrayList.isEmpty()) {
            o.b(u0().f28064n);
            o.b(u0().f28068r);
            return;
        }
        u0().f28064n.setVisibility(0);
        if (this.f11509w0) {
            u0().f28068r.setVisibility(0);
        } else {
            o.b(u0().f28068r);
        }
    }

    public final void V0() {
        u0().f28065o.setText((this.f11504q0.length() <= 0 && this.f11505r0.length() <= 0) ? getString(R.string.you_do_not_have_any_transactions_yet) : getString(R.string.nothing_is_found));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, B6.a
    public final void m0() {
        this.f11508v0 = null;
        this.f11507u0 = null;
        this.s0 = SortDialog.Status.f13217a;
        this.f11504q0 = "";
        this.f11505r0 = "";
        L0();
        o0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        M0(R.id.navigation_payments);
        U0(T0().f1066V0.getValue());
        if (this.f11504q0.length() > 0) {
            I0(this.f11504q0);
        } else if (this.f11505r0.length() > 0) {
            I0(this.f11505r0);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        this.f11503p0 = new AllTransactionsController(requireContext(), new InterfaceC0646l(this) { // from class: E6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllTransactionsFragment f1055b;

            {
                this.f1055b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i) {
                    case 0:
                        String str = (String) obj;
                        AllTransactionsFragment allTransactionsFragment = this.f1055b;
                        List<TransactionUI> value = allTransactionsFragment.T0().f1066V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (f.b(((TransactionUI) obj2).f11371a, str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj2;
                            if (transactionUI != null) {
                                NavController g10 = U4.b.g(allTransactionsFragment);
                                String str2 = transactionUI.f11371a;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                g10.j(new b(str2, transactionUI));
                            }
                        }
                        break;
                    case 1:
                        this.f1055b.f11510x0 = false;
                        break;
                    default:
                        AllTransactionsFragment allTransactionsFragment2 = this.f1055b;
                        allTransactionsFragment2.f11510x0 = false;
                        allTransactionsFragment2.U0((List) obj);
                        break;
                }
                return p.f3034a;
            }
        });
        u0().f28065o.setText(getString(R.string.you_do_not_have_any_saved_beneficiaries_yet));
        if (getView() != null) {
            U0(null);
            BuildersKt__Builders_commonKt.launch$default(C0552s.a(getViewLifecycleOwner()), Dispatchers.getMain(), null, new AllTransactionsFragment$onViewCreated$2(this, null), 2, null);
        }
        final int i9 = 1;
        T0().f426S0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: E6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllTransactionsFragment f1055b;

            {
                this.f1055b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i9) {
                    case 0:
                        String str = (String) obj;
                        AllTransactionsFragment allTransactionsFragment = this.f1055b;
                        List<TransactionUI> value = allTransactionsFragment.T0().f1066V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (f.b(((TransactionUI) obj2).f11371a, str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj2;
                            if (transactionUI != null) {
                                NavController g10 = U4.b.g(allTransactionsFragment);
                                String str2 = transactionUI.f11371a;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                g10.j(new b(str2, transactionUI));
                            }
                        }
                        break;
                    case 1:
                        this.f1055b.f11510x0 = false;
                        break;
                    default:
                        AllTransactionsFragment allTransactionsFragment2 = this.f1055b;
                        allTransactionsFragment2.f11510x0 = false;
                        allTransactionsFragment2.U0((List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
        u0().f28066p.setLayoutManager(new StickyHeaderLinearLayoutManager(requireContext()));
        K2 u02 = u0();
        AllTransactionsController allTransactionsController = this.f11503p0;
        u02.f28066p.setAdapter((allTransactionsController != null ? allTransactionsController : null).getAdapter());
        u0().f28066p.addOnScrollListener(new a());
        u0().f28067q.setColorSchemeResources(R.color.main_color);
        u0().f28067q.setOnRefreshListener(new A0.b(this, 5));
        final int i10 = 2;
        T0().f1066V0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: E6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllTransactionsFragment f1055b;

            {
                this.f1055b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i10) {
                    case 0:
                        String str = (String) obj;
                        AllTransactionsFragment allTransactionsFragment = this.f1055b;
                        List<TransactionUI> value = allTransactionsFragment.T0().f1066V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (f.b(((TransactionUI) obj2).f11371a, str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj2;
                            if (transactionUI != null) {
                                NavController g10 = U4.b.g(allTransactionsFragment);
                                String str2 = transactionUI.f11371a;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                g10.j(new b(str2, transactionUI));
                            }
                        }
                        break;
                    case 1:
                        this.f1055b.f11510x0 = false;
                        break;
                    default:
                        AllTransactionsFragment allTransactionsFragment2 = this.f1055b;
                        allTransactionsFragment2.f11510x0 = false;
                        allTransactionsFragment2.U0((List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11501n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean x0() {
        return false;
    }
}
