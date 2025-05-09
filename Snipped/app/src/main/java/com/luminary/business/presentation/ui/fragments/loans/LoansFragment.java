package com.luminary.business.presentation.ui.fragments.loans;

import F8.o;
import I7.e;
import I7.g;
import O9.p;
import P9.s;
import U4.b;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.loans.LoansFragment;
import com.luminary.business.presentation.ui.fragments.loans.history.LoansHistoryController;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import ka.C0967l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.AbstractC1365j4;

/* compiled from: LoansFragment.kt */
/* loaded from: classes2.dex */
public final class LoansFragment extends BaseFragment<AbstractC1365j4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12357n0 = R.layout.fragment_loans;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12358o0;

    /* renamed from: p0, reason: collision with root package name */
    public LoansHistoryController f12359p0;

    /* renamed from: q0, reason: collision with root package name */
    public LoanTab f12360q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f12361r0;
    public int s0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LoansFragment.kt */
    public static final class LoanTab {

        /* renamed from: a, reason: collision with root package name */
        public static final LoanTab f12366a;

        /* renamed from: b, reason: collision with root package name */
        public static final LoanTab f12367b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ LoanTab[] f12368c;

        static {
            LoanTab loanTab = new LoanTab("APPLY", 0);
            f12366a = loanTab;
            LoanTab loanTab2 = new LoanTab("HISTORY", 1);
            f12367b = loanTab2;
            f12368c = new LoanTab[]{loanTab, loanTab2};
        }

        public LoanTab() {
            throw null;
        }

        public static LoanTab valueOf(String str) {
            return (LoanTab) Enum.valueOf(LoanTab.class, str);
        }

        public static LoanTab[] values() {
            return (LoanTab[]) f12368c.clone();
        }
    }

    /* compiled from: LoansFragment.kt */
    public static final class a implements TabLayout.d {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            int i = gVar != null ? gVar.f9855d : 0;
            LoanTab loanTab = i != 0 ? i != 1 ? LoanTab.f12366a : LoanTab.f12367b : LoanTab.f12366a;
            LoansFragment loansFragment = LoansFragment.this;
            loansFragment.f12360q0 = loanTab;
            loansFragment.V0(loansFragment.U0().f1912W0.getValue());
        }
    }

    /* compiled from: LoansFragment.kt */
    public static final class b implements TabLayout.d {
        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            int i = gVar != null ? gVar.f9855d : 0;
            LoanTab loanTab = i != 0 ? i != 1 ? LoanTab.f12366a : LoanTab.f12367b : LoanTab.f12366a;
            LoansFragment loansFragment = LoansFragment.this;
            loansFragment.f12360q0 = loanTab;
            loansFragment.V0(loansFragment.U0().f1912W0.getValue());
        }
    }

    /* compiled from: LoansFragment.kt */
    public static final class c implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12371a;

        public c(InterfaceC0646l interfaceC0646l) {
            this.f12371a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12371a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12371a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.loans.LoansFragment$special$$inlined$viewModel$default$1] */
    public LoansFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.loans.LoansFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12358o0 = E.a(this, h.a(g.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.loans.LoansFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.loans.LoansFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(g.class), null, null, b.l(this));
            }
        });
        this.f12360q0 = LoanTab.f12366a;
        this.f12361r0 = 5;
        this.s0 = 12;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 28;
        toolbarStatus.f13263a = getString(R.string.hub_loans);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        String string;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        int ordinal = this.f12360q0.ordinal();
        if (ordinal == 0) {
            string = getString(R.string.apply);
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            string = getString(R.string.history);
        }
        toolbarStatus.f13263a = string;
        return toolbarStatus;
    }

    public final void T0() {
        int i = this.f12361r0;
        int i9 = this.s0;
        double d10 = 1;
        double pow = (i * 0.0333d) / (d10 - Math.pow(0.0333d + d10, -i9));
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String X = C0967l.X(C0967l.X(decimalFormat.format(pow), ",", ".", false), " ", ",", false);
        String X10 = C0967l.X(C0967l.X(decimalFormat.format(pow * i9), ",", ".", false), " ", ",", false);
        String string = getString(R.string.monthly_repayments_of, Integer.valueOf(i9), X);
        String string2 = getString(R.string.total_repayment_of, X10);
        u0().f29136s.setText(string);
        u0().f29137t.setText(string2);
        u0().f29132o.setEnabled(this.f12361r0 > 999);
        u0().f29133p.setEnabled(u0().f29132o.isEnabled());
        String concat = "dbwagnvd + ".concat(X);
        PrintStream printStream = System.out;
        printStream.println((Object) concat);
        printStream.println((Object) "    dbwagnvd + ".concat(X10));
    }

    public final g U0() {
        return (g) this.f12358o0.getValue();
    }

    public final void V0(List<A5.b> list) {
        ActivityC0533g activity;
        if (getView() == null) {
            return;
        }
        View view = getView();
        if (view != null && (activity = getActivity()) != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        u0().f29142y.setRefreshing(false);
        o.b(u0().f29134q);
        int ordinal = this.f12360q0.ordinal();
        if (ordinal == 0) {
            o.b(u0().f29142y);
            u0().f29139v.setVisibility(0);
            u0().f29131n.setVisibility(0);
            LoansHistoryController loansHistoryController = this.f12359p0;
            if (loansHistoryController == null) {
                loansHistoryController = null;
            }
            loansHistoryController.setData(null, 0);
            u0().f29143z.k(u0().f29143z.h(0), true);
            return;
        }
        if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        u0().f29142y.setVisibility(0);
        LoansHistoryController loansHistoryController2 = this.f12359p0;
        if (loansHistoryController2 == null) {
            loansHistoryController2 = null;
        }
        loansHistoryController2.setData(list != null ? s.X(list, new A7.d(8)) : null, 1);
        List<A5.b> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            u0().f29134q.setVisibility(0);
        } else {
            o.b(u0().f29134q);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        o.b(u0().f29141x);
        super.onPause();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.postDelayed(new I7.a(this, 0), 400L);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        this.f12359p0 = new LoansHistoryController(new b(), requireContext(), new InterfaceC0635a(this) { // from class: I7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoansFragment f1900b;

            {
                this.f1900b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BaseFragment.q0(this.f1900b, Collections.singletonList("support@com"));
                        break;
                    case 1:
                        LoansFragment loansFragment = this.f1900b;
                        g U02 = loansFragment.U0();
                        int i9 = loansFragment.f12361r0;
                        int i10 = loansFragment.s0;
                        U02.f1913X0 = Integer.valueOf(i9);
                        U02.f1914Y0 = Integer.valueOf(i10);
                        U02.f1911V0.setValue(null);
                        break;
                    default:
                        this.f1900b.u0().f29132o.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1365j4 u02 = u0();
        LoansHistoryController loansHistoryController = this.f12359p0;
        if (loansHistoryController == null) {
            loansHistoryController = null;
        }
        u02.f29135r.setAdapter(loansHistoryController.getAdapter());
        u0().f29143z.a(new a());
        final int i9 = 0;
        U0().f1912W0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: I7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoansFragment f1902b;

            {
                this.f1902b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        this.f1902b.V0((List) obj);
                        break;
                    default:
                        LoansFragment loansFragment = this.f1902b;
                        Integer num = loansFragment.U0().f1913X0;
                        if (num != null) {
                            int intValue = num.intValue();
                            Integer num2 = loansFragment.U0().f1914Y0;
                            if (num2 != null) {
                                int intValue2 = num2.intValue();
                                NavController g10 = U4.b.g(loansFragment);
                                g10.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("month", intValue2);
                                bundle2.putInt("creditLimit", intValue);
                                g10.i(R.id.action_loansFragment_to_loansSummeryFragment, bundle2);
                            }
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        u0().f29142y.setColorSchemeResources(R.color.main_color);
        u0().f29142y.setOnRefreshListener(new A0.b(this, 10));
        final int i10 = 1;
        U0().f1911V0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: I7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoansFragment f1902b;

            {
                this.f1902b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        this.f1902b.V0((List) obj);
                        break;
                    default:
                        LoansFragment loansFragment = this.f1902b;
                        Integer num = loansFragment.U0().f1913X0;
                        if (num != null) {
                            int intValue = num.intValue();
                            Integer num2 = loansFragment.U0().f1914Y0;
                            if (num2 != null) {
                                int intValue2 = num2.intValue();
                                NavController g10 = U4.b.g(loansFragment);
                                g10.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("month", intValue2);
                                bundle2.putInt("creditLimit", intValue);
                                g10.i(R.id.action_loansFragment_to_loansSummeryFragment, bundle2);
                            }
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        u0().f29138u.setText("£25,000");
        this.f12361r0 = 25000;
        u0().f29138u.setMovementMethod(null);
        u0().f29138u.addTextChangedListener(new A8.c(this, 2));
        u0().f29140w.getThumb().getLevel();
        u0().f29140w.setOnSeekBarChangeListener(new e(this, ref$FloatRef));
        u0().f29140w.setProgress(this.s0 - 1, true);
        u0().f29140w.refreshDrawableState();
        View view2 = getView();
        if (view2 != null) {
            view2.postDelayed(new B6.d(10, ref$FloatRef, this), 400L);
        }
        final int i11 = 1;
        o.c(u0().f29132o, 500L, new InterfaceC0635a(this) { // from class: I7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoansFragment f1900b;

            {
                this.f1900b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        BaseFragment.q0(this.f1900b, Collections.singletonList("support@com"));
                        break;
                    case 1:
                        LoansFragment loansFragment = this.f1900b;
                        g U02 = loansFragment.U0();
                        int i92 = loansFragment.f12361r0;
                        int i102 = loansFragment.s0;
                        U02.f1913X0 = Integer.valueOf(i92);
                        U02.f1914Y0 = Integer.valueOf(i102);
                        U02.f1911V0.setValue(null);
                        break;
                    default:
                        this.f1900b.u0().f29132o.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i12 = 2;
        o.c(u0().f29133p, 500L, new InterfaceC0635a(this) { // from class: I7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoansFragment f1900b;

            {
                this.f1900b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        BaseFragment.q0(this.f1900b, Collections.singletonList("support@com"));
                        break;
                    case 1:
                        LoansFragment loansFragment = this.f1900b;
                        g U02 = loansFragment.U0();
                        int i92 = loansFragment.f12361r0;
                        int i102 = loansFragment.s0;
                        U02.f1913X0 = Integer.valueOf(i92);
                        U02.f1914Y0 = Integer.valueOf(i102);
                        U02.f1911V0.setValue(null);
                        break;
                    default:
                        this.f1900b.u0().f29132o.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i13 = 0;
        u0().f29135r.setOnScrollChangeListener(new View.OnScrollChangeListener(this) { // from class: I7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoansFragment f1904b;

            {
                this.f1904b = this;
            }

            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view3, int i14, int i15, int i16, int i17) {
                LoansFragment loansFragment = this.f1904b;
                switch (i13) {
                    case 0:
                        LoansFragment.LoanTab loanTab = loansFragment.f12360q0;
                        LoansFragment.LoanTab loanTab2 = LoansFragment.LoanTab.f12366a;
                        break;
                    default:
                        LoansFragment.LoanTab loanTab3 = loansFragment.f12360q0;
                        LoansFragment.LoanTab loanTab4 = LoansFragment.LoanTab.f12366a;
                        break;
                }
            }
        });
        final int i14 = 1;
        u0().f29139v.setOnScrollChangeListener(new View.OnScrollChangeListener(this) { // from class: I7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoansFragment f1904b;

            {
                this.f1904b = this;
            }

            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view3, int i142, int i15, int i16, int i17) {
                LoansFragment loansFragment = this.f1904b;
                switch (i14) {
                    case 0:
                        LoansFragment.LoanTab loanTab = loansFragment.f12360q0;
                        LoansFragment.LoanTab loanTab2 = LoansFragment.LoanTab.f12366a;
                        break;
                    default:
                        LoansFragment.LoanTab loanTab3 = loansFragment.f12360q0;
                        LoansFragment.LoanTab loanTab4 = LoansFragment.LoanTab.f12366a;
                        break;
                }
            }
        });
        View view3 = getView();
        if (view3 != null) {
            view3.postDelayed(new I7.a(this, 1), 300L);
        }
        V0(U0().f1912W0.getValue());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12357n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        u0().f29132o.setVisibility(0);
        o.b(u0().f29133p);
        t0(true);
        s0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f29132o);
        u0().f29133p.setVisibility(0);
    }
}
