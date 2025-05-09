package com.luminary.business.presentation.ui.fragments.crypto.all_exchanges;

import A7.c;
import C.v;
import F8.o;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
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
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.all_exchanges.AllExchangesFragment;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import h7.C0800b;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import t6.K2;

/* compiled from: AllExchangesFragment.kt */
/* loaded from: classes2.dex */
public final class AllExchangesFragment extends BaseFragment<K2> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11939n0 = R.layout.fragment_all_transactions;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11940o0;

    /* renamed from: p0, reason: collision with root package name */
    public AllExchangesController f11941p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f11942q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f11943r0;
    public final boolean s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f11944t0;

    /* compiled from: AllExchangesFragment.kt */
    public static final class a extends RecyclerView.s {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            super.onScrolled(recyclerView, i, i9);
            if (recyclerView.canScrollVertically(1)) {
                return;
            }
            AllExchangesFragment allExchangesFragment = AllExchangesFragment.this;
            if (allExchangesFragment.f11944t0 || allExchangesFragment.T0().f21197X0) {
                return;
            }
            allExchangesFragment.f11944t0 = true;
            C0800b T02 = allExchangesFragment.T0();
            c cVar = new c(15, T02, allExchangesFragment.f11942q0);
            T02.f418J0 = cVar;
            cVar.invoke();
        }
    }

    /* compiled from: AllExchangesFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11950a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f11950a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11950a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11950a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.all_exchanges.AllExchangesFragment$special$$inlined$viewModel$default$1] */
    public AllExchangesFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.all_exchanges.AllExchangesFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11940o0 = E.a(this, h.a(C0800b.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.all_exchanges.AllExchangesFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.all_exchanges.AllExchangesFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C0800b.class), null, null, b.l(this));
            }
        });
        this.f11942q0 = "";
        this.f11943r0 = "";
        SortDialog.Status status = SortDialog.Status.f13217a;
        SortDialog.Direction direction = SortDialog.Direction.f13213a;
        this.s0 = true;
        new Handler(Looper.getMainLooper());
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

    public final C0800b T0() {
        return (C0800b) this.f11940o0.getValue();
    }

    public final void U0(List<CryptoExchangeDomain> list) {
        u0().f28067q.setRefreshing(false);
        AllExchangesController allExchangesController = this.f11941p0;
        if (allExchangesController == null) {
            allExchangesController = null;
        }
        allExchangesController.setDataForHeader(H8.a.a(this, list));
        List<CryptoExchangeDomain> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            o.b(u0().f28064n);
            o.b(u0().f28068r);
            return;
        }
        V0();
        u0().f28064n.setVisibility(0);
        if (this.s0) {
            u0().f28068r.setVisibility(0);
        } else {
            o.b(u0().f28068r);
        }
    }

    public final void V0() {
        u0().f28065o.setText((this.f11942q0.length() <= 0 && this.f11943r0.length() <= 0) ? getString(R.string.you_do_not_have_any_crypto_transactions_yet) : getString(R.string.nothing_is_found));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, B6.a
    public final void m0() {
        SortDialog.Status status = SortDialog.Status.f13217a;
        this.f11942q0 = "";
        this.f11943r0 = "";
        L0();
        o0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        M0(R.id.navigation_payments);
        U0(T0().f21195V0.getValue());
        if (this.f11942q0.length() > 0) {
            I0(this.f11942q0);
        } else if (this.f11943r0.length() > 0) {
            I0(this.f11943r0);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        this.f11941p0 = new AllExchangesController(requireContext(), new InterfaceC0646l(this) { // from class: h7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllExchangesFragment f21192b;

            {
                this.f21192b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i) {
                    case 0:
                        int intValue = ((Integer) obj).intValue();
                        AllExchangesFragment allExchangesFragment = this.f21192b;
                        List<CryptoExchangeDomain> value = allExchangesFragment.T0().f21195V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    Integer num = ((CryptoExchangeDomain) obj2).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            Serializable serializable = (CryptoExchangeDomain) obj2;
                            if (serializable != null) {
                                NavController g10 = U4.b.g(allExchangesFragment);
                                Bundle g11 = v.g(g10);
                                if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    g11.putParcelable("exchange", (Parcelable) serializable);
                                } else {
                                    if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                        throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                    }
                                    g11.putSerializable("exchange", serializable);
                                }
                                g10.i(R.id.action_allExchangesFragment_to_exchangeDetailsFragment, g11);
                            }
                        }
                        return p.f3034a;
                    case 1:
                        this.f21192b.f11944t0 = false;
                        return p.f3034a;
                    default:
                        AllExchangesFragment allExchangesFragment2 = this.f21192b;
                        allExchangesFragment2.f11944t0 = false;
                        allExchangesFragment2.U0((List) obj);
                        return p.f3034a;
                }
            }
        });
        u0().f28065o.setText(getString(R.string.you_do_not_have_any_saved_beneficiaries_yet));
        if (getView() != null) {
            U0(null);
            BuildersKt__Builders_commonKt.launch$default(C0552s.a(getViewLifecycleOwner()), Dispatchers.getMain(), null, new AllExchangesFragment$onViewCreated$2(this, null), 2, null);
        }
        final int i9 = 1;
        T0().f426S0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: h7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllExchangesFragment f21192b;

            {
                this.f21192b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i9) {
                    case 0:
                        int intValue = ((Integer) obj).intValue();
                        AllExchangesFragment allExchangesFragment = this.f21192b;
                        List<CryptoExchangeDomain> value = allExchangesFragment.T0().f21195V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    Integer num = ((CryptoExchangeDomain) obj2).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            Serializable serializable = (CryptoExchangeDomain) obj2;
                            if (serializable != null) {
                                NavController g10 = U4.b.g(allExchangesFragment);
                                Bundle g11 = v.g(g10);
                                if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    g11.putParcelable("exchange", (Parcelable) serializable);
                                } else {
                                    if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                        throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                    }
                                    g11.putSerializable("exchange", serializable);
                                }
                                g10.i(R.id.action_allExchangesFragment_to_exchangeDetailsFragment, g11);
                            }
                        }
                        return p.f3034a;
                    case 1:
                        this.f21192b.f11944t0 = false;
                        return p.f3034a;
                    default:
                        AllExchangesFragment allExchangesFragment2 = this.f21192b;
                        allExchangesFragment2.f11944t0 = false;
                        allExchangesFragment2.U0((List) obj);
                        return p.f3034a;
                }
            }
        }));
        u0().f28066p.setLayoutManager(new StickyHeaderLinearLayoutManager(requireContext()));
        K2 u02 = u0();
        AllExchangesController allExchangesController = this.f11941p0;
        u02.f28066p.setAdapter((allExchangesController != null ? allExchangesController : null).getAdapter());
        u0().f28066p.addOnScrollListener(new a());
        u0().f28067q.setColorSchemeResources(R.color.main_color);
        u0().f28067q.setOnRefreshListener(new com.sumsub.sns.geo.presentation.d(this, 10));
        final int i10 = 2;
        T0().f21195V0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: h7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllExchangesFragment f21192b;

            {
                this.f21192b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i10) {
                    case 0:
                        int intValue = ((Integer) obj).intValue();
                        AllExchangesFragment allExchangesFragment = this.f21192b;
                        List<CryptoExchangeDomain> value = allExchangesFragment.T0().f21195V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    Integer num = ((CryptoExchangeDomain) obj2).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            Serializable serializable = (CryptoExchangeDomain) obj2;
                            if (serializable != null) {
                                NavController g10 = U4.b.g(allExchangesFragment);
                                Bundle g11 = v.g(g10);
                                if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    g11.putParcelable("exchange", (Parcelable) serializable);
                                } else {
                                    if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                        throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                    }
                                    g11.putSerializable("exchange", serializable);
                                }
                                g10.i(R.id.action_allExchangesFragment_to_exchangeDetailsFragment, g11);
                            }
                        }
                        return p.f3034a;
                    case 1:
                        this.f21192b.f11944t0 = false;
                        return p.f3034a;
                    default:
                        AllExchangesFragment allExchangesFragment2 = this.f21192b;
                        allExchangesFragment2.f11944t0 = false;
                        allExchangesFragment2.U0((List) obj);
                        return p.f3034a;
                }
            }
        }));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11939n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean x0() {
        return false;
    }
}
