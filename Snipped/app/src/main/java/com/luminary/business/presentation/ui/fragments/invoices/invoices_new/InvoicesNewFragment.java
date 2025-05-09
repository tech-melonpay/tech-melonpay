package com.luminary.business.presentation.ui.fragments.invoices.invoices_new;

import F7.e;
import F8.o;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager;
import com.luminary.business.presentation.ui.fragments.invoices.invoices_new.InvoicesNewFragment;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.S4;

/* compiled from: InvoicesNewFragment.kt */
/* loaded from: classes2.dex */
public final class InvoicesNewFragment extends BaseFragment<S4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12324n0 = R.layout.fragment_new_invoices;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12325o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f12326p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f12327q0;

    /* renamed from: r0, reason: collision with root package name */
    public SortDialog.Status f12328r0;
    public SortDialog.Direction s0;

    /* renamed from: t0, reason: collision with root package name */
    public final LinkedHashMap f12329t0;

    /* renamed from: u0, reason: collision with root package name */
    public final boolean f12330u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f12331v0;

    /* renamed from: w0, reason: collision with root package name */
    public InvoicesNewController f12332w0;

    /* compiled from: InvoicesNewFragment.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Date f12337a;

        /* renamed from: b, reason: collision with root package name */
        public final Date f12338b;

        public a(Date date, Date date2) {
            this.f12337a = date;
            this.f12338b = date2;
        }
    }

    /* compiled from: InvoicesNewFragment.kt */
    public static final class b extends RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            super.onScrolled(recyclerView, i, i9);
            if (recyclerView.canScrollVertically(1)) {
                return;
            }
            InvoicesNewFragment invoicesNewFragment = InvoicesNewFragment.this;
            if (invoicesNewFragment.f12331v0) {
                return;
            }
            invoicesNewFragment.f12331v0 = true;
            e T02 = invoicesNewFragment.T0();
            int i10 = invoicesNewFragment.f12326p0;
            boolean z10 = i10 == 0;
            LinkedHashMap linkedHashMap = invoicesNewFragment.f12329t0;
            a aVar = (a) linkedHashMap.get(Integer.valueOf(i10));
            Date date = aVar != null ? aVar.f12337a : null;
            a aVar2 = (a) linkedHashMap.get(Integer.valueOf(invoicesNewFragment.f12326p0));
            T02.n(z10, date, aVar2 != null ? aVar2.f12338b : null, invoicesNewFragment.s0, invoicesNewFragment.f12328r0);
        }
    }

    /* compiled from: InvoicesNewFragment.kt */
    public static final class c implements TabLayout.d {
        public c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            InvoicesNewFragment invoicesNewFragment = InvoicesNewFragment.this;
            if (invoicesNewFragment.getView() != null) {
                invoicesNewFragment.f12326p0 = gVar != null ? gVar.f9855d : 0;
                invoicesNewFragment.L0();
                invoicesNewFragment.U0(invoicesNewFragment.T0().f1258V0.getValue(), invoicesNewFragment.T0().f1259W0.getValue());
            }
        }
    }

    /* compiled from: InvoicesNewFragment.kt */
    public static final class d implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12341a;

        public d(InterfaceC0646l interfaceC0646l) {
            this.f12341a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12341a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12341a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.invoices.invoices_new.InvoicesNewFragment$special$$inlined$viewModel$default$1] */
    public InvoicesNewFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.invoices.invoices_new.InvoicesNewFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12325o0 = E.a(this, h.a(e.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.invoices.invoices_new.InvoicesNewFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.invoices.invoices_new.InvoicesNewFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(e.class), null, null, b.l(this));
            }
        });
        this.f12327q0 = "";
        this.f12328r0 = SortDialog.Status.f13217a;
        this.s0 = SortDialog.Direction.f13213a;
        this.f12329t0 = new LinkedHashMap();
        this.f12330u0 = true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void D0(Date date, Date date2) {
        LinkedHashMap linkedHashMap = this.f12329t0;
        linkedHashMap.put(Integer.valueOf(this.f12326p0), new a(date, date2));
        L0();
        T0().m(this.f12326p0 == 0);
        e T02 = T0();
        int i = this.f12326p0;
        boolean z10 = i == 0;
        a aVar = (a) linkedHashMap.get(Integer.valueOf(i));
        Date date3 = aVar != null ? aVar.f12337a : null;
        a aVar2 = (a) linkedHashMap.get(Integer.valueOf(this.f12326p0));
        T02.n(z10, date3, aVar2 != null ? aVar2.f12338b : null, this.s0, this.f12328r0);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void E0(SortDialog.Status status, SortDialog.Direction direction) {
        this.f12328r0 = status;
        this.s0 = direction;
        L0();
        T0().m(this.f12326p0 == 0);
        e T02 = T0();
        int i = this.f12326p0;
        boolean z10 = i == 0;
        LinkedHashMap linkedHashMap = this.f12329t0;
        a aVar = (a) linkedHashMap.get(Integer.valueOf(i));
        Date date = aVar != null ? aVar.f12337a : null;
        a aVar2 = (a) linkedHashMap.get(Integer.valueOf(this.f12326p0));
        T02.n(z10, date, aVar2 != null ? aVar2.f12338b : null, direction, this.f12328r0);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.hub_invoices);
        toolbarStatus.f13265c = 28;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.hub_invoices);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final e T0() {
        return (e) this.f12325o0.getValue();
    }

    public final void U0(List<TransactionUI> list, List<TransactionUI> list2) {
        if (getView() == null) {
            return;
        }
        u0().f28489o.setText(this.f12327q0.length() > 0 ? getString(R.string.nothing_is_found) : getString(R.string.you_do_not_have_any_invoices_yet));
        List<com.luminary.business.presentation.ui.fragments.home.newhome.b> b9 = H8.a.b(this, list, null);
        List<com.luminary.business.presentation.ui.fragments.home.newhome.b> b10 = H8.a.b(this, list2, null);
        int i = this.f12326p0;
        if (i == 0) {
            InvoicesNewController invoicesNewController = this.f12332w0;
            (invoicesNewController != null ? invoicesNewController : null).setData((List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) b9, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) b10, Integer.valueOf(i));
        } else {
            InvoicesNewController invoicesNewController2 = this.f12332w0;
            (invoicesNewController2 != null ? invoicesNewController2 : null).setData((List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) b9, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) b10, Integer.valueOf(i));
        }
        if (this.f12326p0 != 0) {
            b9 = b10;
        }
        if (!b9.isEmpty()) {
            o.b(u0().f28488n);
            o.b(u0().f28492r);
            return;
        }
        u0().f28488n.setVisibility(0);
        if (this.f12330u0) {
            u0().f28492r.setVisibility(0);
        } else {
            o.b(u0().f28492r);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f12327q0.length() > 0) {
            I0(this.f12327q0);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        this.f12332w0 = new InvoicesNewController(requireContext(), new c(), new InterfaceC0646l(this) { // from class: F7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicesNewFragment f1243b;

            {
                this.f1243b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        String str = (String) obj;
                        InvoicesNewFragment invoicesNewFragment = this.f1243b;
                        TransactionUI transactionUI = null;
                        if (invoicesNewFragment.f12326p0 == 0) {
                            List<TransactionUI> value = invoicesNewFragment.T0().f1258V0.getValue();
                            if (value != null) {
                                Iterator<T> it = value.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        if (f.b(((TransactionUI) next).f11371a, str)) {
                                            transactionUI = next;
                                        }
                                    }
                                }
                                transactionUI = transactionUI;
                            }
                        } else {
                            List<TransactionUI> value2 = invoicesNewFragment.T0().f1259W0.getValue();
                            if (value2 != null) {
                                Iterator<T> it2 = value2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        if (f.b(((TransactionUI) next2).f11371a, str)) {
                                            transactionUI = next2;
                                        }
                                    }
                                }
                                transactionUI = transactionUI;
                            }
                        }
                        if (transactionUI != null) {
                            U4.b.g(invoicesNewFragment).j(new b(str, transactionUI));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        InvoicesNewFragment invoicesNewFragment2 = this.f1243b;
                        invoicesNewFragment2.f12331v0 = false;
                        invoicesNewFragment2.u0().f28491q.setRefreshing(false);
                        invoicesNewFragment2.U0((List) obj, invoicesNewFragment2.T0().f1259W0.getValue());
                        break;
                    default:
                        InvoicesNewFragment invoicesNewFragment3 = this.f1243b;
                        invoicesNewFragment3.f12331v0 = false;
                        invoicesNewFragment3.u0().f28491q.setRefreshing(false);
                        invoicesNewFragment3.U0(invoicesNewFragment3.T0().f1258V0.getValue(), (List) obj);
                        break;
                }
                return p.f3034a;
            }
        });
        S4 u02 = u0();
        u02.f28490p.setLayoutManager(new StickyHeaderLinearLayoutManager(requireContext()));
        S4 u03 = u0();
        u03.f28490p.addOnScrollListener(new b());
        S4 u04 = u0();
        InvoicesNewController invoicesNewController = this.f12332w0;
        if (invoicesNewController == null) {
            invoicesNewController = null;
        }
        u04.f28490p.setAdapter(invoicesNewController.getAdapter());
        S4 u05 = u0();
        int progressViewStartOffset = u0().f28491q.getProgressViewStartOffset() - U4.b.C(D9.b.F(2));
        int progressViewEndOffset = u0().f28491q.getProgressViewEndOffset();
        SwipeRefreshLayout swipeRefreshLayout = u05.f28491q;
        swipeRefreshLayout.f7931s = false;
        swipeRefreshLayout.f7937y = progressViewStartOffset;
        swipeRefreshLayout.f7938z = progressViewEndOffset;
        swipeRefreshLayout.f7909J = true;
        swipeRefreshLayout.f();
        swipeRefreshLayout.f7916c = false;
        S4 u06 = u0();
        u06.f28491q.setColorSchemeResources(R.color.main_color);
        S4 u07 = u0();
        u07.f28491q.setOnRefreshListener(new A0.b(this, 7));
        final int i9 = 1;
        T0().f1258V0.observe(getViewLifecycleOwner(), new d(new InterfaceC0646l(this) { // from class: F7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicesNewFragment f1243b;

            {
                this.f1243b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        String str = (String) obj;
                        InvoicesNewFragment invoicesNewFragment = this.f1243b;
                        TransactionUI transactionUI = null;
                        if (invoicesNewFragment.f12326p0 == 0) {
                            List<TransactionUI> value = invoicesNewFragment.T0().f1258V0.getValue();
                            if (value != null) {
                                Iterator<T> it = value.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        if (f.b(((TransactionUI) next).f11371a, str)) {
                                            transactionUI = next;
                                        }
                                    }
                                }
                                transactionUI = transactionUI;
                            }
                        } else {
                            List<TransactionUI> value2 = invoicesNewFragment.T0().f1259W0.getValue();
                            if (value2 != null) {
                                Iterator<T> it2 = value2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        if (f.b(((TransactionUI) next2).f11371a, str)) {
                                            transactionUI = next2;
                                        }
                                    }
                                }
                                transactionUI = transactionUI;
                            }
                        }
                        if (transactionUI != null) {
                            U4.b.g(invoicesNewFragment).j(new b(str, transactionUI));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        InvoicesNewFragment invoicesNewFragment2 = this.f1243b;
                        invoicesNewFragment2.f12331v0 = false;
                        invoicesNewFragment2.u0().f28491q.setRefreshing(false);
                        invoicesNewFragment2.U0((List) obj, invoicesNewFragment2.T0().f1259W0.getValue());
                        break;
                    default:
                        InvoicesNewFragment invoicesNewFragment3 = this.f1243b;
                        invoicesNewFragment3.f12331v0 = false;
                        invoicesNewFragment3.u0().f28491q.setRefreshing(false);
                        invoicesNewFragment3.U0(invoicesNewFragment3.T0().f1258V0.getValue(), (List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 2;
        T0().f1259W0.observe(getViewLifecycleOwner(), new d(new InterfaceC0646l(this) { // from class: F7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicesNewFragment f1243b;

            {
                this.f1243b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        String str = (String) obj;
                        InvoicesNewFragment invoicesNewFragment = this.f1243b;
                        TransactionUI transactionUI = null;
                        if (invoicesNewFragment.f12326p0 == 0) {
                            List<TransactionUI> value = invoicesNewFragment.T0().f1258V0.getValue();
                            if (value != null) {
                                Iterator<T> it = value.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        if (f.b(((TransactionUI) next).f11371a, str)) {
                                            transactionUI = next;
                                        }
                                    }
                                }
                                transactionUI = transactionUI;
                            }
                        } else {
                            List<TransactionUI> value2 = invoicesNewFragment.T0().f1259W0.getValue();
                            if (value2 != null) {
                                Iterator<T> it2 = value2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        if (f.b(((TransactionUI) next2).f11371a, str)) {
                                            transactionUI = next2;
                                        }
                                    }
                                }
                                transactionUI = transactionUI;
                            }
                        }
                        if (transactionUI != null) {
                            U4.b.g(invoicesNewFragment).j(new b(str, transactionUI));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        InvoicesNewFragment invoicesNewFragment2 = this.f1243b;
                        invoicesNewFragment2.f12331v0 = false;
                        invoicesNewFragment2.u0().f28491q.setRefreshing(false);
                        invoicesNewFragment2.U0((List) obj, invoicesNewFragment2.T0().f1259W0.getValue());
                        break;
                    default:
                        InvoicesNewFragment invoicesNewFragment3 = this.f1243b;
                        invoicesNewFragment3.f12331v0 = false;
                        invoicesNewFragment3.u0().f28491q.setRefreshing(false);
                        invoicesNewFragment3.U0(invoicesNewFragment3.T0().f1258V0.getValue(), (List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
        E.b(this, "invoice_detail", new B6.h(this, 1));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12324n0;
    }
}
