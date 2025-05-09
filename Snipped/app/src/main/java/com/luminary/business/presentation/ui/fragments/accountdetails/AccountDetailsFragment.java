package com.luminary.business.presentation.ui.fragments.accountdetails;

import A8.e;
import D6.i;
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
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.presentation.entity.account.AccountDetailsUI;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsFragment;
import com.luminary.business.presentation.ui.fragments.accountdetails.a;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import t6.A2;

/* compiled from: AccountDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class AccountDetailsFragment extends BaseFragment<A2> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11480n0 = R.layout.fragment_account_details;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11481o0;

    /* renamed from: p0, reason: collision with root package name */
    public AccountDetailsController f11482p0;

    /* renamed from: q0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.accountdetails.a f11483q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f11484r0;
    public String s0;

    /* renamed from: t0, reason: collision with root package name */
    public SortDialog.Status f11485t0;

    /* renamed from: u0, reason: collision with root package name */
    public SortDialog.Direction f11486u0;

    /* renamed from: v0, reason: collision with root package name */
    public Date f11487v0;

    /* renamed from: w0, reason: collision with root package name */
    public Date f11488w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f11489x0;

    /* renamed from: y0, reason: collision with root package name */
    public final boolean f11490y0;

    /* compiled from: AccountDetailsFragment.kt */
    public static final class a extends RecyclerView.s {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            AccountDetailsUI accountDetailsUI;
            String str;
            super.onScrolled(recyclerView, i, i9);
            AccountDetailsFragment accountDetailsFragment = AccountDetailsFragment.this;
            com.luminary.business.presentation.ui.fragments.accountdetails.a aVar = accountDetailsFragment.f11483q0;
            if (aVar == null || (accountDetailsUI = aVar.f11500a) == null || (str = accountDetailsUI.f11170g) == null || accountDetailsFragment.f11484r0 != 2 || recyclerView.canScrollVertically(1) || accountDetailsFragment.f11489x0) {
                return;
            }
            accountDetailsFragment.f11489x0 = true;
            accountDetailsFragment.T0().m(str, accountDetailsFragment.f11487v0, accountDetailsFragment.f11488w0, accountDetailsFragment.f11486u0, accountDetailsFragment.f11485t0);
        }
    }

    /* compiled from: AccountDetailsFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11496a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f11496a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11496a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11496a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsFragment$special$$inlined$viewModel$default$1] */
    public AccountDetailsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11481o0 = E.a(this, h.a(i.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(i.class), null, null, b.l(this));
            }
        });
        this.s0 = "";
        this.f11485t0 = SortDialog.Status.f13217a;
        this.f11486u0 = SortDialog.Direction.f13213a;
        this.f11490y0 = true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void D0(Date date, Date date2) {
        AccountDetailsUI accountDetailsUI;
        String str;
        this.f11487v0 = date;
        this.f11488w0 = date2;
        L0();
        com.luminary.business.presentation.ui.fragments.accountdetails.a aVar = this.f11483q0;
        if (aVar == null || (accountDetailsUI = aVar.f11500a) == null || (str = accountDetailsUI.f11170g) == null) {
            return;
        }
        i T02 = T0();
        T02.f952Y0 = 1;
        T02.f950W0.clear();
        T0().m(str, this.f11487v0, this.f11488w0, this.f11486u0, this.f11485t0);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void E0(SortDialog.Status status, SortDialog.Direction direction) {
        AccountDetailsUI accountDetailsUI;
        String str;
        this.f11485t0 = status;
        this.f11486u0 = direction;
        L0();
        com.luminary.business.presentation.ui.fragments.accountdetails.a aVar = this.f11483q0;
        if (aVar == null || (accountDetailsUI = aVar.f11500a) == null || (str = accountDetailsUI.f11170g) == null) {
            return;
        }
        i T02 = T0();
        T02.f952Y0 = 1;
        T02.f950W0.clear();
        T0().m(str, this.f11487v0, this.f11488w0, direction, this.f11485t0);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.account_details);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 18;
        toolbarStatus.i = new e(Integer.valueOf(R.drawable.ic_edit), null, null, false, null, null, null, new D6.e(this, 0), 124);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13276o = null;
        int i = this.f11484r0;
        toolbarStatus.f13263a = i != 0 ? i != 1 ? i != 2 ? getString(R.string.empty) : getString(R.string.transactions) : getString(R.string.local) : getString(R.string.international);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final i T0() {
        return (i) this.f11481o0.getValue();
    }

    public final void U0() {
        AccountDetailsUI accountDetailsUI;
        String str;
        this.f11488w0 = null;
        this.f11487v0 = null;
        SortDialog.Status status = SortDialog.Status.f13217a;
        this.f11485t0 = status;
        this.s0 = "";
        L0();
        o0();
        List<TransactionUI> value = T0().f949V0.getValue();
        if (value != null && !value.isEmpty()) {
            V0(T0().f949V0.getValue());
            return;
        }
        com.luminary.business.presentation.ui.fragments.accountdetails.a aVar = this.f11483q0;
        if (aVar == null || (accountDetailsUI = aVar.f11500a) == null || (str = accountDetailsUI.f11170g) == null) {
            return;
        }
        i T02 = T0();
        if (this.f11484r0 == 2) {
            T02.f952Y0 = 1;
            T02.f950W0.clear();
            T02.m(str, null, null, SortDialog.Direction.f13213a, status);
        }
    }

    public final void V0(List list) {
        ArrayList arrayList;
        com.luminary.business.presentation.ui.fragments.accountdetails.a aVar = this.f11483q0;
        AccountDetailsUI accountDetailsUI = aVar != null ? aVar.f11500a : null;
        W0();
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
        boolean z10 = this.f11490y0;
        Integer valueOf = z10 ? Integer.valueOf(this.f11484r0) : null;
        int i = this.f11484r0;
        if (i == 0) {
            u0().f27602p.setVisibility(0);
            o.b(u0().f27600n);
            o.b(u0().f27604r);
            AccountDetailsController accountDetailsController = this.f11482p0;
            if (accountDetailsController == null) {
                accountDetailsController = null;
            }
            accountDetailsController.setData2(accountDetailsUI, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) null, (List<CardsDomain>) null, Integer.valueOf(this.f11484r0));
            return;
        }
        if (i == 1) {
            u0().f27602p.setVisibility(0);
            o.b(u0().f27600n);
            o.b(u0().f27604r);
            AccountDetailsController accountDetailsController2 = this.f11482p0;
            if (accountDetailsController2 == null) {
                accountDetailsController2 = null;
            }
            accountDetailsController2.setData2(accountDetailsUI, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) null, (List<CardsDomain>) null, Integer.valueOf(this.f11484r0));
            return;
        }
        if (i == 2) {
            if (arrayList == null || arrayList.isEmpty()) {
                u0().f27600n.setVisibility(0);
                if (z10) {
                    u0().f27604r.setVisibility(0);
                } else {
                    o.b(u0().f27604r);
                }
            } else {
                o.b(u0().f27600n);
                o.b(u0().f27604r);
            }
            AccountDetailsController accountDetailsController3 = this.f11482p0;
            if (accountDetailsController3 == null) {
                accountDetailsController3 = null;
            }
            accountDetailsController3.setData2(accountDetailsUI, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) H8.a.b(this, arrayList, null), (List<CardsDomain>) null, valueOf);
            return;
        }
        if (i != 3) {
            AccountDetailsController accountDetailsController4 = this.f11482p0;
            if (accountDetailsController4 == null) {
                accountDetailsController4 = null;
            }
            accountDetailsController4.setData2(accountDetailsUI, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) null, (List<CardsDomain>) null, valueOf);
            return;
        }
        u0().f27600n.setVisibility(0);
        if (z10) {
            u0().f27604r.setVisibility(0);
        } else {
            o.b(u0().f27604r);
        }
        AccountDetailsController accountDetailsController5 = this.f11482p0;
        if (accountDetailsController5 == null) {
            accountDetailsController5 = null;
        }
        accountDetailsController5.setData2(accountDetailsUI, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) null, (List<CardsDomain>) null, valueOf);
    }

    public final void W0() {
        String string;
        A2 u02 = u0();
        if (this.s0.length() > 0) {
            string = getString(R.string.nothing_is_found);
        } else {
            int i = this.f11484r0;
            string = i != 2 ? i != 3 ? getString(R.string.you_do_not_have_any_cards_yet) : getString(R.string.you_do_not_have_any_cards_yet) : getString(R.string.you_do_not_have_any_transactions_yet);
        }
        u02.f27601o.setText(string);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, B6.a
    public final void m0() {
        U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11483q0 = a.C0114a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.s0.length() > 0) {
            I0(this.s0);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 1;
        final int i9 = 2;
        this.f11482p0 = new AccountDetailsController(requireContext(), new TabLayout.d() { // from class: com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsFragment$onViewCreated$tabChangeListener$1
            @Override // com.google.android.material.tabs.TabLayout.c
            public final void a(TabLayout.g gVar) {
                AccountDetailsFragment accountDetailsFragment = AccountDetailsFragment.this;
                if (accountDetailsFragment.getView() == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(C0552s.a(accountDetailsFragment.getViewLifecycleOwner()), Dispatchers.getMain(), null, new AccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1(accountDetailsFragment, gVar, null), 2, null);
            }
        }, new D6.e(this, 1), new D6.e(this, 2), new D6.e(this, 3), new InterfaceC0646l(this) { // from class: D6.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsFragment f931b;

            {
                this.f931b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i) {
                    case 0:
                        AccountDetailsFragment accountDetailsFragment = this.f931b;
                        accountDetailsFragment.L0();
                        accountDetailsFragment.o0();
                        break;
                    case 1:
                        this.f931b.r0((String) obj);
                        break;
                    case 2:
                        String str = (String) obj;
                        AccountDetailsFragment accountDetailsFragment2 = this.f931b;
                        List<TransactionUI> value = accountDetailsFragment2.T0().f949V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (kotlin.jvm.internal.f.b(String.valueOf(((TransactionUI) obj2).f11371a), str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj2;
                            if (transactionUI != null) {
                                U4.b.g(accountDetailsFragment2).j(new g(str, transactionUI));
                            }
                        }
                        break;
                    case 3:
                        this.f931b.f11489x0 = false;
                        break;
                    default:
                        AccountDetailsFragment accountDetailsFragment3 = this.f931b;
                        accountDetailsFragment3.f11489x0 = false;
                        accountDetailsFragment3.u0().f27603q.setRefreshing(false);
                        accountDetailsFragment3.V0((List) obj);
                        break;
                }
                return p.f3034a;
            }
        }, new B8.a(2), new InterfaceC0646l(this) { // from class: D6.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsFragment f931b;

            {
                this.f931b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i9) {
                    case 0:
                        AccountDetailsFragment accountDetailsFragment = this.f931b;
                        accountDetailsFragment.L0();
                        accountDetailsFragment.o0();
                        break;
                    case 1:
                        this.f931b.r0((String) obj);
                        break;
                    case 2:
                        String str = (String) obj;
                        AccountDetailsFragment accountDetailsFragment2 = this.f931b;
                        List<TransactionUI> value = accountDetailsFragment2.T0().f949V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (kotlin.jvm.internal.f.b(String.valueOf(((TransactionUI) obj2).f11371a), str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj2;
                            if (transactionUI != null) {
                                U4.b.g(accountDetailsFragment2).j(new g(str, transactionUI));
                            }
                        }
                        break;
                    case 3:
                        this.f931b.f11489x0 = false;
                        break;
                    default:
                        AccountDetailsFragment accountDetailsFragment3 = this.f931b;
                        accountDetailsFragment3.f11489x0 = false;
                        accountDetailsFragment3.u0().f27603q.setRefreshing(false);
                        accountDetailsFragment3.V0((List) obj);
                        break;
                }
                return p.f3034a;
            }
        });
        u0().f27602p.setLayoutManager(new StickyHeaderLinearLayoutManager(requireContext()));
        A2 u02 = u0();
        AccountDetailsController accountDetailsController = this.f11482p0;
        if (accountDetailsController == null) {
            accountDetailsController = null;
        }
        u02.f27602p.setAdapter(accountDetailsController.getAdapter());
        u0().f27602p.addOnScrollListener(new a());
        u0().f27603q.setColorSchemeResources(R.color.main_color);
        u0().f27603q.setOnRefreshListener(new A0.b(this, 3));
        final int i10 = 3;
        T0().f426S0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: D6.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsFragment f931b;

            {
                this.f931b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i10) {
                    case 0:
                        AccountDetailsFragment accountDetailsFragment = this.f931b;
                        accountDetailsFragment.L0();
                        accountDetailsFragment.o0();
                        break;
                    case 1:
                        this.f931b.r0((String) obj);
                        break;
                    case 2:
                        String str = (String) obj;
                        AccountDetailsFragment accountDetailsFragment2 = this.f931b;
                        List<TransactionUI> value = accountDetailsFragment2.T0().f949V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (kotlin.jvm.internal.f.b(String.valueOf(((TransactionUI) obj2).f11371a), str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj2;
                            if (transactionUI != null) {
                                U4.b.g(accountDetailsFragment2).j(new g(str, transactionUI));
                            }
                        }
                        break;
                    case 3:
                        this.f931b.f11489x0 = false;
                        break;
                    default:
                        AccountDetailsFragment accountDetailsFragment3 = this.f931b;
                        accountDetailsFragment3.f11489x0 = false;
                        accountDetailsFragment3.u0().f27603q.setRefreshing(false);
                        accountDetailsFragment3.V0((List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i11 = 4;
        T0().f949V0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: D6.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsFragment f931b;

            {
                this.f931b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i11) {
                    case 0:
                        AccountDetailsFragment accountDetailsFragment = this.f931b;
                        accountDetailsFragment.L0();
                        accountDetailsFragment.o0();
                        break;
                    case 1:
                        this.f931b.r0((String) obj);
                        break;
                    case 2:
                        String str = (String) obj;
                        AccountDetailsFragment accountDetailsFragment2 = this.f931b;
                        List<TransactionUI> value = accountDetailsFragment2.T0().f949V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (kotlin.jvm.internal.f.b(String.valueOf(((TransactionUI) obj2).f11371a), str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj2;
                            if (transactionUI != null) {
                                U4.b.g(accountDetailsFragment2).j(new g(str, transactionUI));
                            }
                        }
                        break;
                    case 3:
                        this.f931b.f11489x0 = false;
                        break;
                    default:
                        AccountDetailsFragment accountDetailsFragment3 = this.f931b;
                        accountDetailsFragment3.f11489x0 = false;
                        accountDetailsFragment3.u0().f27603q.setRefreshing(false);
                        accountDetailsFragment3.V0((List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i12 = 0;
        T0().f951X0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: D6.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountDetailsFragment f931b;

            {
                this.f931b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i12) {
                    case 0:
                        AccountDetailsFragment accountDetailsFragment = this.f931b;
                        accountDetailsFragment.L0();
                        accountDetailsFragment.o0();
                        break;
                    case 1:
                        this.f931b.r0((String) obj);
                        break;
                    case 2:
                        String str = (String) obj;
                        AccountDetailsFragment accountDetailsFragment2 = this.f931b;
                        List<TransactionUI> value = accountDetailsFragment2.T0().f949V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (kotlin.jvm.internal.f.b(String.valueOf(((TransactionUI) obj2).f11371a), str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            TransactionUI transactionUI = (TransactionUI) obj2;
                            if (transactionUI != null) {
                                U4.b.g(accountDetailsFragment2).j(new g(str, transactionUI));
                            }
                        }
                        break;
                    case 3:
                        this.f931b.f11489x0 = false;
                        break;
                    default:
                        AccountDetailsFragment accountDetailsFragment3 = this.f931b;
                        accountDetailsFragment3.f11489x0 = false;
                        accountDetailsFragment3.u0().f27603q.setRefreshing(false);
                        accountDetailsFragment3.V0((List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
        V0(null);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11480n0;
    }
}
