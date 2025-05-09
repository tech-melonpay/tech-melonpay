package com.luminary.business.presentation.ui.fragments.statistics;

import A8.e;
import C.v;
import I5.p;
import P9.m;
import U4.b;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.n;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.dialogs.SortStatisticsDialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import g8.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import p8.C1116a;
import p8.C1118c;
import t6.AbstractC1303b6;

/* compiled from: StatisticsFragment.kt */
/* loaded from: classes2.dex */
public final class StatisticsFragment extends BaseFragment<AbstractC1303b6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f13092n0 = R.layout.fragment_statistics;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f13093o0;

    /* renamed from: p0, reason: collision with root package name */
    public SortStatisticsDialog.StatisticType f13094p0;

    /* renamed from: q0, reason: collision with root package name */
    public Integer f13095q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f13096r0;
    public Long s0;

    /* renamed from: t0, reason: collision with root package name */
    public Long f13097t0;

    /* renamed from: u0, reason: collision with root package name */
    public final ArrayList f13098u0;

    /* renamed from: v0, reason: collision with root package name */
    public BankAccountDomain f13099v0;

    /* compiled from: StatisticsFragment.kt */
    public static final class a implements TabLayout.d {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            StatisticsFragment statisticsFragment = StatisticsFragment.this;
            statisticsFragment.f13096r0 = statisticsFragment.u0().f28841r.getSelectedTabPosition();
            statisticsFragment.U0(new ArrayList<>(statisticsFragment.T0().f25717X0.getValue()));
        }
    }

    /* compiled from: StatisticsFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f13105a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f13105a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f13105a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13105a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.statistics.StatisticsFragment$special$$inlined$viewModel$default$1] */
    public StatisticsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.statistics.StatisticsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f13093o0 = E.a(this, h.a(C1118c.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.statistics.StatisticsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.statistics.StatisticsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C1118c.class), null, null, b.l(this));
            }
        });
        this.f13094p0 = SortStatisticsDialog.StatisticType.f13235e;
        this.f13098u0 = new ArrayList();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void F0(SortStatisticsDialog.StatisticType statisticType, Long l10, Long l11) {
        this.f13094p0 = statisticType;
        this.f13097t0 = l11;
        this.s0 = l10;
        String F02 = l10 != null ? D9.b.F0(new Date(l10.longValue()), "yyyy-MM-dd") : null;
        String F03 = l11 != null ? D9.b.F0(new Date(l11.longValue()), "yyyy-MM-dd") : null;
        Integer num = this.f13095q0;
        if (num != null) {
            int intValue = num.intValue();
            C1118c T02 = T0();
            S6.d dVar = new S6.d(T02, intValue, statisticType.toString(), F02, F03);
            T02.f418J0 = dVar;
            dVar.invoke();
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.hub_statistics);
        toolbarStatus.f13265c = 28;
        toolbarStatus.f13269g = new e(Integer.valueOf(R.drawable.ic_customize), null, null, false, null, null, null, new g(this, 14), 124);
        BankAccountDomain bankAccountDomain = this.f13099v0;
        toolbarStatus.f13271j = bankAccountDomain != null ? F8.b.g(bankAccountDomain, requireContext()) : null;
        toolbarStatus.f13279r = new J7.b(this, 21);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13263a = getString(this.f13096r0 == 0 ? R.string.incoming : R.string.outgoing);
        return toolbarStatus;
    }

    public final C1118c T0() {
        return (C1118c) this.f13093o0.getValue();
    }

    public final void U0(ArrayList<p> arrayList) {
        String a10;
        String a11;
        String p10;
        int i = 0;
        u0().f28840q.setRefreshing(false);
        Collections.reverse(arrayList);
        u0().f28838o.setImageResource(this.f13096r0 == 0 ? R.drawable.ic_transaction_income : R.drawable.ic_transaction_out);
        if (this.f13096r0 == 0) {
            BankAccountDomain bankAccountDomain = this.f13099v0;
            a10 = n.a("+ ", bankAccountDomain != null ? K3.a.a(bankAccountDomain.f10701h) : "", ((p) com.google.android.gms.measurement.internal.a.f(1, arrayList)).f1869b.f1870a.b());
            a11 = ((p) com.google.android.gms.measurement.internal.a.f(1, arrayList)).f1869b.f1870a.a();
        } else {
            BankAccountDomain bankAccountDomain2 = this.f13099v0;
            a10 = n.a("- ", bankAccountDomain2 != null ? K3.a.a(bankAccountDomain2.f10701h) : "", ((p) com.google.android.gms.measurement.internal.a.f(1, arrayList)).f1869b.f1871b.b());
            a11 = ((p) com.google.android.gms.measurement.internal.a.f(1, arrayList)).f1869b.f1871b.a();
        }
        u0().f28844u.setText(getString(this.f13096r0 == 0 ? R.string.total_incoming : R.string.total_outgoing));
        u0().f28842s.setText(a10);
        u0().f28843t.setText(a11);
        ArrayList arrayList2 = new ArrayList(P9.n.u(arrayList, 10));
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            arrayList2.add(this.f13096r0 == 0 ? next.f1869b.f1870a : next.f1869b.f1871b);
        }
        AbstractC1303b6 u02 = u0();
        switch (this.f13094p0.ordinal()) {
            case 0:
                Long l10 = this.s0;
                String F02 = l10 != null ? D9.b.F0(new Date(l10.longValue()), "dd.MM.yyyy") : null;
                Long l11 = this.f13097t0;
                p10 = v.p(F02, " - ", l11 != null ? D9.b.F0(new Date(l11.longValue()), "dd.MM.yyyy") : null);
                break;
            case 1:
                p10 = getString(R.string.last_7_days);
                break;
            case 2:
                p10 = getString(R.string.last_30_days);
                break;
            case 3:
                p10 = getString(R.string.last_12_month);
                break;
            case 4:
                p10 = getString(R.string.this_week);
                break;
            case 5:
                p10 = getString(R.string.this_month);
                break;
            case 6:
                p10 = getString(R.string.this_year);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        u02.f28837n.setText(p10);
        if (this.f13094p0 == SortStatisticsDialog.StatisticType.f13231a) {
            AbstractC1303b6 u03 = u0();
            ArrayList<p.a.C0022a> arrayList3 = new ArrayList<>(arrayList2);
            ArrayList<String> n10 = m.n("");
            int i9 = this.f13096r0;
            BankAccountDomain bankAccountDomain3 = this.f13099v0;
            u03.f28839p.a(arrayList3, n10, i9, bankAccountDomain3 != null ? K3.a.a(bankAccountDomain3.f10701h) : "", this.f13094p0);
            return;
        }
        AbstractC1303b6 u04 = u0();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                m.t();
                throw null;
            }
            if (i10 != arrayList.size() - 1) {
                arrayList4.add(next2);
            }
            i10 = i11;
        }
        ArrayList<p.a.C0022a> arrayList5 = new ArrayList<>(arrayList4);
        ArrayList arrayList6 = new ArrayList(P9.n.u(arrayList, 10));
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList6.add(it3.next().f1868a);
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            int i12 = i + 1;
            if (i < 0) {
                m.t();
                throw null;
            }
            if (i != arrayList.size() - 1) {
                arrayList7.add(next3);
            }
            i = i12;
        }
        ArrayList<String> arrayList8 = new ArrayList<>(arrayList7);
        int i13 = this.f13096r0;
        BankAccountDomain bankAccountDomain4 = this.f13099v0;
        u04.f28839p.a(arrayList5, arrayList8, i13, bankAccountDomain4 != null ? K3.a.a(bankAccountDomain4.f10701h) : "", this.f13094p0);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, B6.a
    public final void m0() {
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
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        T0().f25716W0.observe(getViewLifecycleOwner(), new b(new C1116a(this, 0)));
        AbstractC1303b6 u02 = u0();
        u02.f28840q.setColorSchemeResources(R.color.main_color);
        AbstractC1303b6 u03 = u0();
        u03.f28840q.setOnRefreshListener(new com.sumsub.sns.geo.presentation.d(this, 16));
        AbstractC1303b6 u04 = u0();
        u04.f28841r.a(new a());
        T0().f25717X0.observe(getViewLifecycleOwner(), new b(new C1116a(this, 1)));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f13092n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean x0() {
        return false;
    }
}
