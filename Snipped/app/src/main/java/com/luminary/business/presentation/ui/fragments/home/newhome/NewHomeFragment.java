package com.luminary.business.presentation.ui.fragments.home.newhome;

import A7.e;
import B7.g;
import B7.i;
import C.v;
import F8.o;
import O9.p;
import P9.s;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.C0558y;
import androidx.lifecycle.C0559z;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.account.FeeDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeCryptoController;
import com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeFragment;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.h;
import t6.Q4;

/* compiled from: NewHomeFragment.kt */
/* loaded from: classes2.dex */
public final class NewHomeFragment extends BaseFragment<Q4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12242n0 = R.layout.fragment_new_home;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f12243o0 = true;

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f12244p0;

    /* renamed from: q0, reason: collision with root package name */
    public NewHomeController f12245q0;

    /* renamed from: r0, reason: collision with root package name */
    public NewHomeCryptoController f12246r0;
    public boolean s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Handler f12247t0;

    /* renamed from: u0, reason: collision with root package name */
    public final f f12248u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f12249v0;

    /* renamed from: w0, reason: collision with root package name */
    public Timer f12250w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f12251x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f12252y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f12253z0;

    /* compiled from: FragmentExt.kt */
    public static final class a implements InterfaceC0646l<Pair<? extends List<? extends TransactionUI>, ? extends List<? extends FeeDomain>>, p> {
        public a() {
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(Pair<? extends List<? extends TransactionUI>, ? extends List<? extends FeeDomain>> pair) {
            Pair<? extends List<? extends TransactionUI>, ? extends List<? extends FeeDomain>> pair2 = pair;
            A a10 = pair2.f23089a;
            List<FeeDomain> list = (List) pair2.f23090b;
            NewHomeFragment newHomeFragment = NewHomeFragment.this;
            newHomeFragment.u0().f28396r.setRefreshing(false);
            newHomeFragment.f12253z0 = false;
            newHomeFragment.V0(newHomeFragment.U0().f118b1.getValue(), (List) a10, list);
            return p.f3034a;
        }
    }

    /* compiled from: NewHomeFragment.kt */
    public static final class c extends RecyclerView.s {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            super.onScrolled(recyclerView, i, i9);
            if (recyclerView.canScrollVertically(1)) {
                return;
            }
            NewHomeFragment newHomeFragment = NewHomeFragment.this;
            if (newHomeFragment.f12253z0) {
                return;
            }
            newHomeFragment.U0();
            newHomeFragment.f12253z0 = true;
            A7.e U02 = newHomeFragment.U0();
            if (U02.f126j1 == 1) {
                A7.a aVar = new A7.a(U02, 2);
                U02.f422O0 = aVar;
                aVar.invoke();
            }
            A7.a aVar2 = new A7.a(U02, 4);
            U02.f420L0 = aVar2;
            aVar2.invoke();
        }
    }

    /* compiled from: NewHomeFragment.kt */
    public static final class d extends RecyclerView.s {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            super.onScrolled(recyclerView, i, i9);
            if (recyclerView.canScrollVertically(1)) {
                return;
            }
            NewHomeFragment newHomeFragment = NewHomeFragment.this;
            if (newHomeFragment.f12252y0 || newHomeFragment.U0().f128l1) {
                return;
            }
            newHomeFragment.f12252y0 = true;
            A7.e U02 = newHomeFragment.U0();
            A7.a aVar = new A7.a(U02, 3);
            U02.N0 = aVar;
            aVar.invoke();
        }
    }

    /* compiled from: NewHomeFragment.kt */
    public static final class e implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12261a;

        public e(InterfaceC0646l interfaceC0646l) {
            this.f12261a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12261a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12261a.invoke(obj);
        }
    }

    /* compiled from: Runnable.kt */
    public static final class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NewHomeFragment.this.T0();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeFragment$special$$inlined$viewModel$default$1] */
    public NewHomeFragment() {
        final ?? r12 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12244p0 = E.a(this, h.a(A7.e.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r12.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return U4.b.n((X) r12.invoke(), h.a(e.class), null, null, U4.b.l(this));
            }
        });
        this.s0 = true;
        this.f12247t0 = new Handler(Looper.getMainLooper());
        this.f12248u0 = new f();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        return false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = false;
        toolbarStatus.f13265c = 28;
        toolbarStatus.f13270h = new A8.e(Integer.valueOf(R.drawable.ic_arrowtopright), null, null, false, null, null, null, new g(this, 0), 124);
        toolbarStatus.f13263a = getString(R.string.fiat);
        if (U0().f113W0.E()) {
            toolbarStatus.f13272k = Integer.valueOf(R.color.middle_gray);
            toolbarStatus.f13277p = Integer.valueOf(R.color.black);
            C0559z<List<CryptoAccountDomain>> c0559z = U0().f122f1;
            List<CryptoAccountDomain> value = c0559z != null ? c0559z.getValue() : null;
            if (value == null || value.isEmpty()) {
                toolbarStatus.f13269g = null;
            } else {
                toolbarStatus.f13269g = new A8.e(Integer.valueOf(R.drawable.ic_plus_black_16), getString(R.string.add_new_crypto), null, this.s0, Integer.valueOf(R.drawable.button_bg_white_900), Integer.valueOf(R.color.black), 16, new g(this, 2), 4);
            }
            toolbarStatus.i = null;
            toolbarStatus.f13270h = null;
        } else {
            toolbarStatus.f13272k = Integer.valueOf(R.color.black);
            toolbarStatus.f13277p = Integer.valueOf(R.color.middle_gray);
            toolbarStatus.i = new A8.e(Integer.valueOf(R.drawable.ic_exchange), null, null, false, null, null, null, new g(this, 1), 124);
            toolbarStatus.f13269g = null;
        }
        toolbarStatus.f13276o = getString(R.string.hub_crypto);
        toolbarStatus.f13274m = new i(this, 2);
        toolbarStatus.f13275n = new i(this, 3);
        ((MainActivity) requireActivity()).A();
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = false;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13263a = getString(R.string.fiat);
        if (U0().f113W0.E()) {
            toolbarStatus.f13272k = Integer.valueOf(R.color.middle_gray);
            toolbarStatus.f13277p = Integer.valueOf(R.color.black);
        } else {
            toolbarStatus.f13272k = Integer.valueOf(R.color.black);
            toolbarStatus.f13277p = Integer.valueOf(R.color.middle_gray);
        }
        toolbarStatus.f13276o = getString(R.string.hub_crypto);
        toolbarStatus.f13274m = new i(this, 0);
        toolbarStatus.f13275n = new i(this, 1);
        ((MainActivity) requireActivity()).A();
        return toolbarStatus;
    }

    public final void T0() {
        int i = this.f12249v0;
        if (i > 600) {
            A7.e U02 = U0();
            A7.a aVar = new A7.a(U02, 0);
            U02.f419K0 = aVar;
            aVar.invoke();
            A7.e U03 = U0();
            A7.a aVar2 = new A7.a(U03, 1);
            U03.f421M0 = aVar2;
            aVar2.invoke();
            this.f12249v0 = 0;
        } else {
            this.f12249v0 = i + 30;
        }
        this.f12247t0.postDelayed(this.f12248u0, 30000L);
    }

    public final A7.e U0() {
        return (A7.e) this.f12244p0.getValue();
    }

    public final void V0(List<BankAccountDomain> list, List<TransactionUI> list2, List<FeeDomain> list3) {
        BankAccountDomain bankAccountDomain;
        ArrayList arrayList;
        Object obj;
        W0();
        List<BankAccountDomain> X = list != null ? s.X(list, new A7.d(1)) : null;
        if (X != null) {
            Iterator<T> it = X.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer num = ((BankAccountDomain) obj).f10702j;
                if (num != null && num.intValue() == 1) {
                    break;
                }
            }
            bankAccountDomain = (BankAccountDomain) obj;
        } else {
            bankAccountDomain = null;
        }
        boolean z10 = bankAccountDomain != null;
        if (z10 != this.s0) {
            this.s0 = z10;
            L0();
        }
        if (list2 != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list2) {
                Integer num2 = ((TransactionUI) obj2).f11372b;
                if (num2 == null || num2.intValue() != 1) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        List<BankAccountDomain> list4 = X;
        if (list4 == null || list4.isEmpty()) {
            return;
        }
        NewHomeController newHomeController = this.f12245q0;
        (newHomeController != null ? newHomeController : null).setData2(X, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.b>) H8.a.b(this, arrayList, list3));
    }

    public final void W0() {
        if (U0().f113W0.E()) {
            u0().f28393o.setText(getString(R.string.you_do_not_have_any_crypto_transactions_yet));
            C0559z<List<CryptoExchangeDomain>> c0559z = U0().f123g1;
            Collection collection = c0559z != null ? (List) c0559z.getValue() : null;
            if (collection == null || collection.isEmpty()) {
                u0().f28392n.setVisibility(0);
                u0().f28397s.setVisibility(0);
                return;
            } else {
                o.b(u0().f28397s);
                o.b(u0().f28392n);
                return;
            }
        }
        u0().f28393o.setText(getString(R.string.you_do_not_have_any_transactions_yet));
        List<TransactionUI> value = U0().f119c1.getValue();
        if (value != null) {
            r1 = new ArrayList();
            for (Object obj : value) {
                Integer num = ((TransactionUI) obj).f11372b;
                if (num == null || num.intValue() != 1) {
                    r1.add(obj);
                }
            }
        }
        if (r1 != null && !r1.isEmpty()) {
            o.b(u0().f28397s);
            o.b(u0().f28392n);
            return;
        }
        u0().f28392n.setVisibility(0);
        List<BankAccountDomain> value2 = U0().f118b1.getValue();
        if (value2 == null || value2.isEmpty()) {
            o.b(u0().f28397s);
        } else {
            u0().f28397s.setVisibility(0);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Timer timer = this.f12250w0;
        if (timer == null) {
            timer = null;
        }
        timer.cancel();
        u0().f28395q.setRecycledViewPool(null);
        u0().f28395q.setAdapter(null);
        u0().f28394p.setRecycledViewPool(null);
        u0().f28394p.setAdapter(null);
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        this.f12247t0.removeCallbacks(this.f12248u0);
        super.onPause();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        M0(R.id.navigation_home);
        A7.e U02 = U0();
        A7.a aVar = new A7.a(U02, 0);
        U02.f419K0 = aVar;
        aVar.invoke();
        A7.e U03 = U0();
        A7.a aVar2 = new A7.a(U03, 1);
        U03.f421M0 = aVar2;
        aVar2.invoke();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f12250w0 = new Timer();
        this.f12251x0 = false;
        final int i = 2;
        U0().f426S0.observe(getViewLifecycleOwner(), new e(new InterfaceC0646l(this) { // from class: B7.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewHomeFragment f451b;

            {
                this.f451b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i9;
                switch (i) {
                    case 0:
                        List<CryptoAccountDomain> list = (List) obj;
                        NewHomeFragment newHomeFragment = this.f451b;
                        newHomeFragment.L0();
                        C0559z<List<CryptoExchangeDomain>> c0559z = newHomeFragment.U0().f123g1;
                        List<CryptoExchangeDomain> value = c0559z != null ? c0559z.getValue() : null;
                        newHomeFragment.W0();
                        NewHomeCryptoController newHomeCryptoController = newHomeFragment.f12246r0;
                        (newHomeCryptoController != null ? newHomeCryptoController : null).setData2(list, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) H8.a.a(newHomeFragment, value));
                        return p.f3034a;
                    case 1:
                        List list2 = (List) obj;
                        NewHomeFragment newHomeFragment2 = this.f451b;
                        MainActivity mainActivity = (MainActivity) newHomeFragment2.requireActivity();
                        List<CryptoExchangeDomain> value2 = newHomeFragment2.U0().f123g1.getValue();
                        if (value2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value2) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i9 = arrayList.size();
                        } else {
                            i9 = 0;
                        }
                        mainActivity.G(i9, true);
                        newHomeFragment2.f12252y0 = false;
                        if (!newHomeFragment2.f12251x0) {
                            newHomeFragment2.f12251x0 = true;
                        }
                        List<CryptoAccountDomain> value3 = newHomeFragment2.U0().f122f1.getValue();
                        newHomeFragment2.W0();
                        NewHomeCryptoController newHomeCryptoController2 = newHomeFragment2.f12246r0;
                        if (newHomeCryptoController2 == null) {
                            newHomeCryptoController2 = null;
                        }
                        newHomeCryptoController2.setData2(value3, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) H8.a.a(newHomeFragment2, list2));
                        return p.f3034a;
                    case 2:
                        NewHomeFragment newHomeFragment3 = this.f451b;
                        newHomeFragment3.f12252y0 = false;
                        newHomeFragment3.f12253z0 = false;
                        return p.f3034a;
                    case 3:
                        Serializable serializable = (FeeDomain) obj;
                        NavController g10 = U4.b.g(this.f451b);
                        Bundle g11 = v.g(g10);
                        if (Parcelable.class.isAssignableFrom(FeeDomain.class)) {
                            g11.putParcelable("fee", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(FeeDomain.class)) {
                                throw new UnsupportedOperationException(FeeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g11.putSerializable("fee", serializable);
                        }
                        g10.i(R.id.action_homeFragment_to_feeDetailsFragment, g11);
                        return p.f3034a;
                    default:
                        NewHomeFragment newHomeFragment4 = this.f451b;
                        newHomeFragment4.u0().f28396r.setRefreshing(false);
                        newHomeFragment4.V0((List) obj, newHomeFragment4.U0().f119c1.getValue(), newHomeFragment4.U0().f124h1.getValue());
                        return p.f3034a;
                }
            }
        }));
        final int i9 = 3;
        this.f12245q0 = new NewHomeController(requireContext(), new NewHomeFragment$onViewCreated$2(1, this, NewHomeFragment.class, "openAccount", "openAccount(Ljava/lang/String;)V", 0), new NewHomeFragment$onViewCreated$3(1, this, NewHomeFragment.class, "refreshAccount", "refreshAccount(Ljava/lang/String;)V", 0), new NewHomeFragment$onViewCreated$4(1, this, NewHomeFragment.class, "openTransaction", "openTransaction(Ljava/lang/String;)V", 0), new NewHomeFragment$onViewCreated$5(0, this, NewHomeFragment.class, "openTransactionsAll", "openTransactionsAll()V", 0), new g(this, 3), new InterfaceC0646l(this) { // from class: B7.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewHomeFragment f451b;

            {
                this.f451b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                switch (i9) {
                    case 0:
                        List<CryptoAccountDomain> list = (List) obj;
                        NewHomeFragment newHomeFragment = this.f451b;
                        newHomeFragment.L0();
                        C0559z<List<CryptoExchangeDomain>> c0559z = newHomeFragment.U0().f123g1;
                        List<CryptoExchangeDomain> value = c0559z != null ? c0559z.getValue() : null;
                        newHomeFragment.W0();
                        NewHomeCryptoController newHomeCryptoController = newHomeFragment.f12246r0;
                        (newHomeCryptoController != null ? newHomeCryptoController : null).setData2(list, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) H8.a.a(newHomeFragment, value));
                        return p.f3034a;
                    case 1:
                        List list2 = (List) obj;
                        NewHomeFragment newHomeFragment2 = this.f451b;
                        MainActivity mainActivity = (MainActivity) newHomeFragment2.requireActivity();
                        List<CryptoExchangeDomain> value2 = newHomeFragment2.U0().f123g1.getValue();
                        if (value2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value2) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, true);
                        newHomeFragment2.f12252y0 = false;
                        if (!newHomeFragment2.f12251x0) {
                            newHomeFragment2.f12251x0 = true;
                        }
                        List<CryptoAccountDomain> value3 = newHomeFragment2.U0().f122f1.getValue();
                        newHomeFragment2.W0();
                        NewHomeCryptoController newHomeCryptoController2 = newHomeFragment2.f12246r0;
                        if (newHomeCryptoController2 == null) {
                            newHomeCryptoController2 = null;
                        }
                        newHomeCryptoController2.setData2(value3, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) H8.a.a(newHomeFragment2, list2));
                        return p.f3034a;
                    case 2:
                        NewHomeFragment newHomeFragment3 = this.f451b;
                        newHomeFragment3.f12252y0 = false;
                        newHomeFragment3.f12253z0 = false;
                        return p.f3034a;
                    case 3:
                        Serializable serializable = (FeeDomain) obj;
                        NavController g10 = U4.b.g(this.f451b);
                        Bundle g11 = v.g(g10);
                        if (Parcelable.class.isAssignableFrom(FeeDomain.class)) {
                            g11.putParcelable("fee", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(FeeDomain.class)) {
                                throw new UnsupportedOperationException(FeeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g11.putSerializable("fee", serializable);
                        }
                        g10.i(R.id.action_homeFragment_to_feeDetailsFragment, g11);
                        return p.f3034a;
                    default:
                        NewHomeFragment newHomeFragment4 = this.f451b;
                        newHomeFragment4.u0().f28396r.setRefreshing(false);
                        newHomeFragment4.V0((List) obj, newHomeFragment4.U0().f119c1.getValue(), newHomeFragment4.U0().f124h1.getValue());
                        return p.f3034a;
                }
            }
        });
        this.f12246r0 = new NewHomeCryptoController(requireContext(), new NewHomeFragment$onViewCreated$8(1, this, NewHomeFragment.class, "openCryptoWallet", "openCryptoWallet(J)V", 0), new NewHomeFragment$onViewCreated$9(1, this, NewHomeFragment.class, "refreshAccount", "refreshAccount(Ljava/lang/String;)V", 0), new NewHomeFragment$onViewCreated$10(1, this, NewHomeFragment.class, "openCryptoExchange", "openCryptoExchange(Ljava/lang/String;)V", 0), new NewHomeFragment$onViewCreated$11(0, this, NewHomeFragment.class, "openExchangeAll", "openExchangeAll()V", 0), new NewHomeFragment$onViewCreated$12(0, this, NewHomeFragment.class, "createAccountScreen", "createAccountScreen()V", 0));
        u0().f28395q.setLayoutManager(new StickyHeaderLinearLayoutManager(requireContext()));
        Q4 u02 = u0();
        NewHomeController newHomeController = this.f12245q0;
        if (newHomeController == null) {
            newHomeController = null;
        }
        u02.f28395q.setAdapter(newHomeController.getAdapter());
        u0().f28395q.addOnScrollListener(new c());
        u0().f28394p.setLayoutManager(new StickyHeaderLinearLayoutManager(requireContext()));
        Q4 u03 = u0();
        NewHomeCryptoController newHomeCryptoController = this.f12246r0;
        if (newHomeCryptoController == null) {
            newHomeCryptoController = null;
        }
        u03.f28394p.setAdapter(newHomeCryptoController.getAdapter());
        u0().f28394p.addOnScrollListener(new d());
        u0().f28396r.setColorSchemeResources(R.color.main_color);
        Q4 u04 = u0();
        int progressViewStartOffset = u0().f28396r.getProgressViewStartOffset() - U4.b.C(D9.b.F(2));
        int progressViewEndOffset = u0().f28396r.getProgressViewEndOffset();
        SwipeRefreshLayout swipeRefreshLayout = u04.f28396r;
        swipeRefreshLayout.f7931s = false;
        swipeRefreshLayout.f7937y = progressViewStartOffset;
        swipeRefreshLayout.f7938z = progressViewEndOffset;
        swipeRefreshLayout.f7909J = true;
        swipeRefreshLayout.f();
        swipeRefreshLayout.f7916c = false;
        u0().f28396r.setOnRefreshListener(new A0.b(this, 2));
        final int i10 = 4;
        U0().f118b1.observe(getViewLifecycleOwner(), new e(new InterfaceC0646l(this) { // from class: B7.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewHomeFragment f451b;

            {
                this.f451b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                switch (i10) {
                    case 0:
                        List<CryptoAccountDomain> list = (List) obj;
                        NewHomeFragment newHomeFragment = this.f451b;
                        newHomeFragment.L0();
                        C0559z<List<CryptoExchangeDomain>> c0559z = newHomeFragment.U0().f123g1;
                        List<CryptoExchangeDomain> value = c0559z != null ? c0559z.getValue() : null;
                        newHomeFragment.W0();
                        NewHomeCryptoController newHomeCryptoController2 = newHomeFragment.f12246r0;
                        (newHomeCryptoController2 != null ? newHomeCryptoController2 : null).setData2(list, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) H8.a.a(newHomeFragment, value));
                        return p.f3034a;
                    case 1:
                        List list2 = (List) obj;
                        NewHomeFragment newHomeFragment2 = this.f451b;
                        MainActivity mainActivity = (MainActivity) newHomeFragment2.requireActivity();
                        List<CryptoExchangeDomain> value2 = newHomeFragment2.U0().f123g1.getValue();
                        if (value2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value2) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, true);
                        newHomeFragment2.f12252y0 = false;
                        if (!newHomeFragment2.f12251x0) {
                            newHomeFragment2.f12251x0 = true;
                        }
                        List<CryptoAccountDomain> value3 = newHomeFragment2.U0().f122f1.getValue();
                        newHomeFragment2.W0();
                        NewHomeCryptoController newHomeCryptoController22 = newHomeFragment2.f12246r0;
                        if (newHomeCryptoController22 == null) {
                            newHomeCryptoController22 = null;
                        }
                        newHomeCryptoController22.setData2(value3, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) H8.a.a(newHomeFragment2, list2));
                        return p.f3034a;
                    case 2:
                        NewHomeFragment newHomeFragment3 = this.f451b;
                        newHomeFragment3.f12252y0 = false;
                        newHomeFragment3.f12253z0 = false;
                        return p.f3034a;
                    case 3:
                        Serializable serializable = (FeeDomain) obj;
                        NavController g10 = U4.b.g(this.f451b);
                        Bundle g11 = v.g(g10);
                        if (Parcelable.class.isAssignableFrom(FeeDomain.class)) {
                            g11.putParcelable("fee", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(FeeDomain.class)) {
                                throw new UnsupportedOperationException(FeeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g11.putSerializable("fee", serializable);
                        }
                        g10.i(R.id.action_homeFragment_to_feeDetailsFragment, g11);
                        return p.f3034a;
                    default:
                        NewHomeFragment newHomeFragment4 = this.f451b;
                        newHomeFragment4.u0().f28396r.setRefreshing(false);
                        newHomeFragment4.V0((List) obj, newHomeFragment4.U0().f119c1.getValue(), newHomeFragment4.U0().f124h1.getValue());
                        return p.f3034a;
                }
            }
        }));
        final int i11 = 0;
        U0().f122f1.observe(getViewLifecycleOwner(), new e(new InterfaceC0646l(this) { // from class: B7.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewHomeFragment f451b;

            {
                this.f451b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                switch (i11) {
                    case 0:
                        List<CryptoAccountDomain> list = (List) obj;
                        NewHomeFragment newHomeFragment = this.f451b;
                        newHomeFragment.L0();
                        C0559z<List<CryptoExchangeDomain>> c0559z = newHomeFragment.U0().f123g1;
                        List<CryptoExchangeDomain> value = c0559z != null ? c0559z.getValue() : null;
                        newHomeFragment.W0();
                        NewHomeCryptoController newHomeCryptoController2 = newHomeFragment.f12246r0;
                        (newHomeCryptoController2 != null ? newHomeCryptoController2 : null).setData2(list, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) H8.a.a(newHomeFragment, value));
                        return p.f3034a;
                    case 1:
                        List list2 = (List) obj;
                        NewHomeFragment newHomeFragment2 = this.f451b;
                        MainActivity mainActivity = (MainActivity) newHomeFragment2.requireActivity();
                        List<CryptoExchangeDomain> value2 = newHomeFragment2.U0().f123g1.getValue();
                        if (value2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value2) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, true);
                        newHomeFragment2.f12252y0 = false;
                        if (!newHomeFragment2.f12251x0) {
                            newHomeFragment2.f12251x0 = true;
                        }
                        List<CryptoAccountDomain> value3 = newHomeFragment2.U0().f122f1.getValue();
                        newHomeFragment2.W0();
                        NewHomeCryptoController newHomeCryptoController22 = newHomeFragment2.f12246r0;
                        if (newHomeCryptoController22 == null) {
                            newHomeCryptoController22 = null;
                        }
                        newHomeCryptoController22.setData2(value3, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) H8.a.a(newHomeFragment2, list2));
                        return p.f3034a;
                    case 2:
                        NewHomeFragment newHomeFragment3 = this.f451b;
                        newHomeFragment3.f12252y0 = false;
                        newHomeFragment3.f12253z0 = false;
                        return p.f3034a;
                    case 3:
                        Serializable serializable = (FeeDomain) obj;
                        NavController g10 = U4.b.g(this.f451b);
                        Bundle g11 = v.g(g10);
                        if (Parcelable.class.isAssignableFrom(FeeDomain.class)) {
                            g11.putParcelable("fee", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(FeeDomain.class)) {
                                throw new UnsupportedOperationException(FeeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g11.putSerializable("fee", serializable);
                        }
                        g10.i(R.id.action_homeFragment_to_feeDetailsFragment, g11);
                        return p.f3034a;
                    default:
                        NewHomeFragment newHomeFragment4 = this.f451b;
                        newHomeFragment4.u0().f28396r.setRefreshing(false);
                        newHomeFragment4.V0((List) obj, newHomeFragment4.U0().f119c1.getValue(), newHomeFragment4.U0().f124h1.getValue());
                        return p.f3034a;
                }
            }
        }));
        final int i12 = 1;
        U0().f123g1.observe(getViewLifecycleOwner(), new e(new InterfaceC0646l(this) { // from class: B7.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewHomeFragment f451b;

            {
                this.f451b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                switch (i12) {
                    case 0:
                        List<CryptoAccountDomain> list = (List) obj;
                        NewHomeFragment newHomeFragment = this.f451b;
                        newHomeFragment.L0();
                        C0559z<List<CryptoExchangeDomain>> c0559z = newHomeFragment.U0().f123g1;
                        List<CryptoExchangeDomain> value = c0559z != null ? c0559z.getValue() : null;
                        newHomeFragment.W0();
                        NewHomeCryptoController newHomeCryptoController2 = newHomeFragment.f12246r0;
                        (newHomeCryptoController2 != null ? newHomeCryptoController2 : null).setData2(list, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) H8.a.a(newHomeFragment, value));
                        return p.f3034a;
                    case 1:
                        List list2 = (List) obj;
                        NewHomeFragment newHomeFragment2 = this.f451b;
                        MainActivity mainActivity = (MainActivity) newHomeFragment2.requireActivity();
                        List<CryptoExchangeDomain> value2 = newHomeFragment2.U0().f123g1.getValue();
                        if (value2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value2) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, true);
                        newHomeFragment2.f12252y0 = false;
                        if (!newHomeFragment2.f12251x0) {
                            newHomeFragment2.f12251x0 = true;
                        }
                        List<CryptoAccountDomain> value3 = newHomeFragment2.U0().f122f1.getValue();
                        newHomeFragment2.W0();
                        NewHomeCryptoController newHomeCryptoController22 = newHomeFragment2.f12246r0;
                        if (newHomeCryptoController22 == null) {
                            newHomeCryptoController22 = null;
                        }
                        newHomeCryptoController22.setData2(value3, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) H8.a.a(newHomeFragment2, list2));
                        return p.f3034a;
                    case 2:
                        NewHomeFragment newHomeFragment3 = this.f451b;
                        newHomeFragment3.f12252y0 = false;
                        newHomeFragment3.f12253z0 = false;
                        return p.f3034a;
                    case 3:
                        Serializable serializable = (FeeDomain) obj;
                        NavController g10 = U4.b.g(this.f451b);
                        Bundle g11 = v.g(g10);
                        if (Parcelable.class.isAssignableFrom(FeeDomain.class)) {
                            g11.putParcelable("fee", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(FeeDomain.class)) {
                                throw new UnsupportedOperationException(FeeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g11.putSerializable("fee", serializable);
                        }
                        g10.i(R.id.action_homeFragment_to_feeDetailsFragment, g11);
                        return p.f3034a;
                    default:
                        NewHomeFragment newHomeFragment4 = this.f451b;
                        newHomeFragment4.u0().f28396r.setRefreshing(false);
                        newHomeFragment4.V0((List) obj, newHomeFragment4.U0().f119c1.getValue(), newHomeFragment4.U0().f124h1.getValue());
                        return p.f3034a;
                }
            }
        }));
        C0559z<List<TransactionUI>> c0559z = U0().f119c1;
        C0559z<List<FeeDomain>> c0559z2 = U0().f124h1;
        C0558y c0558y = new C0558y();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        c0558y.a(c0559z, new F8.i(new F8.h(ref$ObjectRef, c0558y, ref$ObjectRef2, 0)));
        c0558y.a(c0559z2, new F8.i(new F8.h(ref$ObjectRef2, c0558y, ref$ObjectRef, 1)));
        c0558y.observe(getViewLifecycleOwner(), new F8.i(new a()));
        T0();
        if (U0().f113W0.E()) {
            u0().f28398t.setDisplayedChild(1);
        } else {
            u0().f28398t.setDisplayedChild(0);
        }
        Timer timer = this.f12250w0;
        (timer == null ? null : timer).schedule(new b(), 10000L, 30000L);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12242n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean x0() {
        return this.f12243o0;
    }

    /* compiled from: Timer.kt */
    public static final class b extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
        }
    }
}
