package com.luminary.business.presentation.ui.fragments.newcompany.teammembers;

import C.v;
import F8.o;
import O9.p;
import P9.m;
import P9.n;
import U4.b;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.entity.company.BankAccountOutside;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.business.presentation.entity.company.TeamMemberUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.teammembers.TeamMembersFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.teammembers.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.K4;
import x6.C1591a;

/* compiled from: TeamMembersFragment.kt */
/* loaded from: classes2.dex */
public final class TeamMembersFragment extends BaseFragment<K4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12683n0 = R.layout.fragment_new_company_team_members;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12684o0;

    /* renamed from: p0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.newcompany.teammembers.a f12685p0;

    /* renamed from: q0, reason: collision with root package name */
    public UBOType f12686q0;

    /* renamed from: r0, reason: collision with root package name */
    public TeamMembersController f12687r0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TeamMembersFragment.kt */
    public static final class UBOType {

        /* renamed from: a, reason: collision with root package name */
        public static final UBOType f12692a;

        /* renamed from: b, reason: collision with root package name */
        public static final UBOType f12693b;

        /* renamed from: c, reason: collision with root package name */
        public static final UBOType f12694c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ UBOType[] f12695d;

        static {
            UBOType uBOType = new UBOType("PRIMARY", 0);
            f12692a = uBOType;
            UBOType uBOType2 = new UBOType("SECONDARY", 1);
            f12693b = uBOType2;
            UBOType uBOType3 = new UBOType("SHAREHOLDER", 2);
            f12694c = uBOType3;
            f12695d = new UBOType[]{uBOType, uBOType2, uBOType3};
        }

        public UBOType() {
            throw null;
        }

        public static UBOType valueOf(String str) {
            return (UBOType) Enum.valueOf(UBOType.class, str);
        }

        public static UBOType[] values() {
            return (UBOType[]) f12695d.clone();
        }
    }

    /* compiled from: TeamMembersFragment.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12696a;

        static {
            int[] iArr = new int[UBOType.values().length];
            try {
                UBOType uBOType = UBOType.f12692a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UBOType uBOType2 = UBOType.f12692a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UBOType uBOType3 = UBOType.f12692a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12696a = iArr;
        }
    }

    /* compiled from: TeamMembersFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12697a;

        public b(Z7.a aVar) {
            this.f12697a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12697a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12697a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.teammembers.TeamMembersFragment$special$$inlined$viewModel$default$1] */
    public TeamMembersFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.teammembers.TeamMembersFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12684o0 = E.a(this, h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.teammembers.TeamMembersFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.teammembers.TeamMembersFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(NewCompanyViewModel.class), null, null, b.l(this));
            }
        });
        this.f12686q0 = UBOType.f12692a;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        CorporateDetailsDomain value = T0().f12449o1.getValue();
        List<CorporateDetailsDomain.b> list = value != null ? value.f10805b : null;
        int ordinal = this.f12686q0.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            this.f12686q0 = UBOType.f12692a;
            if (list == null) {
                list = EmptyList.f23104a;
            }
            U0(list);
            L0();
            V0();
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f12686q0 = UBOType.f12693b;
            u0().f28070n.setText(R.string.add_ubo);
            u0().f28071o.setText(R.string.add_ubo);
            if (list == null) {
                list = EmptyList.f23104a;
            }
            U0(list);
            L0();
            V0();
        }
        return false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        int ordinal = this.f12686q0.ordinal();
        if (ordinal == 0) {
            toolbarStatus.f13263a = getString(R.string.primary_ubos);
            toolbarStatus.f13266d = getString(R.string.step_of, 6, 14);
        } else if (ordinal == 1) {
            toolbarStatus.f13263a = getString(R.string.ubos_under_25);
            toolbarStatus.f13266d = getString(R.string.step_of, 7, 14);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            toolbarStatus.f13263a = getString(R.string.shareholders);
            toolbarStatus.f13266d = getString(R.string.step_of, 8, 14);
        }
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        int ordinal = this.f12686q0.ordinal();
        if (ordinal == 0) {
            toolbarStatus.f13263a = getString(R.string.primary_ubos);
        } else if (ordinal == 1) {
            toolbarStatus.f13263a = getString(R.string.ubos_under_25);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            toolbarStatus.f13263a = getString(R.string.shareholders);
        }
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final NewCompanyViewModel T0() {
        return (NewCompanyViewModel) this.f12684o0.getValue();
    }

    public final void U0(List<CorporateDetailsDomain.b> list) {
        List<CorporateDetailsDomain.b> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((CorporateDetailsDomain.b) obj).f10948c != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            CorporateDetailsDomain.b bVar = (CorporateDetailsDomain.b) next;
            if (f.b(bVar.f10947b, "ubo")) {
                UBOType uBOType = this.f12686q0;
                UBOType uBOType2 = UBOType.f12692a;
                Float f10 = bVar.f10948c;
                if (uBOType == uBOType2) {
                    if ((f10 != null ? f10.floatValue() : 0.0f) >= 25.0f) {
                        arrayList2.add(next);
                    }
                }
                if (this.f12686q0 == UBOType.f12693b) {
                    if ((f10 != null ? f10.floatValue() : 0.0f) < 25.0f) {
                        arrayList2.add(next);
                    }
                }
            }
            if (f.b(bVar.f10947b, "shareholder") && this.f12686q0 == UBOType.f12694c) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(n.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(C1591a.a((CorporateDetailsDomain.b) it2.next()));
        }
        arrayList3.addAll(arrayList4);
        TeamMembersController teamMembersController = this.f12687r0;
        if (teamMembersController == null) {
            teamMembersController = null;
        }
        teamMembersController.setData(arrayList3);
        Iterator<T> it3 = list2.iterator();
        float f11 = 0.0f;
        while (it3.hasNext()) {
            Float f12 = ((CorporateDetailsDomain.b) it3.next()).f10948c;
            f11 += f12 != null ? f12.floatValue() : 0.0f;
        }
        if (a.f12696a[this.f12686q0.ordinal()] == 1) {
            u0().f28070n.setEnabled(f11 < 75.0f);
            u0().f28071o.setEnabled(f11 < 75.0f);
        } else {
            u0().f28070n.setEnabled(f11 < 100.0f);
            u0().f28071o.setEnabled(f11 < 100.0f);
        }
        if (!arrayList3.isEmpty()) {
            o.b(u0().f28074r);
        } else {
            u0().f28074r.setVisibility(0);
        }
        UBOType uBOType3 = this.f12686q0;
        if (uBOType3 == UBOType.f12692a) {
            if (arrayList3.isEmpty()) {
                u0().f28072p.setText(R.string.no_ubos_owning_25_or_more);
                return;
            } else {
                u0().f28072p.setText(R.string.continue_btn);
                return;
            }
        }
        if (uBOType3 == UBOType.f12693b) {
            if (arrayList3.isEmpty()) {
                u0().f28072p.setText(R.string.skip);
                return;
            } else {
                u0().f28072p.setText(R.string.continue_btn);
                return;
            }
        }
        u0().f28070n.setText(getString(R.string.add_shareholder));
        if (arrayList3.isEmpty()) {
            u0().f28072p.setText(R.string.skip);
        } else {
            u0().f28072p.setText(R.string.continue_btn);
        }
    }

    public final void V0() {
        int i;
        int ordinal = this.f12686q0.ordinal();
        if (ordinal == 0) {
            i = R.string.add_ubos_ultimate_beneficial_owners_that_hold_over_25;
        } else if (ordinal == 1) {
            i = R.string.add_ubos_ultimate_beneficial_owners_that_hold_under_25;
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.add_shareholders_optional;
        }
        u0().f28074r.setText(getString(i));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12685p0 = a.C0136a.a(arguments);
        }
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        CorporateDetailsDomain value = T0().f12449o1.getValue();
        List<CorporateDetailsDomain.b> list = value != null ? value.f10805b : null;
        if (list == null) {
            list = EmptyList.f23104a;
        }
        U0(list);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z7.a] */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        final int i = 0;
        this.f12687r0 = new TeamMembersController(new InterfaceC0646l(this) { // from class: Z7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeamMembersFragment f4227b;

            {
                this.f4227b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str2;
                Integer num;
                CompanyDetailsUI.CompanyUI companyUI;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                LinkedHashMap linkedHashMap2;
                switch (i) {
                    case 0:
                        int intValue = ((Integer) obj).intValue();
                        TeamMembersFragment teamMembersFragment = this.f4227b;
                        CorporateDetailsDomain value = teamMembersFragment.T0().f12449o1.getValue();
                        CorporateDetailsDomain.b bVar = null;
                        List<CorporateDetailsDomain.b> list = value != null ? value.f10805b : null;
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    CorporateDetailsDomain.a aVar = ((CorporateDetailsDomain.b) next).f10950e;
                                    if (aVar != null && (num = aVar.f10889a) != null && num.intValue() == intValue) {
                                        bVar = next;
                                    }
                                }
                            }
                            bVar = bVar;
                        }
                        if (bVar != null) {
                            if (f.b(bVar.f10951f, Boolean.FALSE)) {
                                TeamMemberUI a10 = C1591a.a(bVar);
                                com.luminary.business.presentation.ui.fragments.newcompany.teammembers.a aVar2 = teamMembersFragment.f12685p0;
                                if (aVar2 != null && (str2 = aVar2.f12698a) != null) {
                                    U4.b.g(teamMembersFragment).j(new c(str2, teamMembersFragment.T0().j0(), teamMembersFragment.f12686q0.name(), a10));
                                }
                            }
                        }
                        return p.f3034a;
                    default:
                        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                        TeamMembersFragment teamMembersFragment2 = this.f4227b;
                        NewCompanyViewModel T02 = teamMembersFragment2.T0();
                        CorporateDetailsDomain.a aVar3 = corporateDetailsDomain.f10804a;
                        if (aVar3 != null) {
                            Long valueOf = Long.valueOf((long) aVar3.f10898e0);
                            BigDecimal valueOf2 = aVar3.f10902g0 != null ? BigDecimal.valueOf(r7.intValue()) : null;
                            BigDecimal valueOf3 = aVar3.f10904h0 != null ? BigDecimal.valueOf(r7.intValue()) : null;
                            Boolean valueOf4 = Boolean.valueOf(aVar3.f10900f0);
                            List<CorporateDetailsDomain.a.C0113a> list2 = aVar3.f10905i0;
                            ArrayList arrayList2 = new ArrayList(n.u(list2, 10));
                            for (CorporateDetailsDomain.a.C0113a c0113a : list2) {
                                arrayList2.add(new BankAccountOutside(c0113a.f10939a, c0113a.f10940b, null, c0113a.f10941c));
                            }
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            List<CorporateDetailsDomain.a.b> list3 = aVar3.f10907j0;
                            if (list3 != null) {
                                List<CorporateDetailsDomain.a.b> list4 = list3;
                                ArrayList arrayList4 = new ArrayList(n.u(list4, 10));
                                int i9 = 0;
                                for (Object obj2 : list4) {
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        m.t();
                                        throw null;
                                    }
                                    CorporateDetailsDomain.a.b bVar2 = (CorporateDetailsDomain.a.b) obj2;
                                    arrayList4.add(new Pair(Integer.valueOf(i10), new CreateCompanyUI.ContractorUI(bVar2.f10942a, bVar2.f10943b, bVar2.f10944c, bVar2.f10945d)));
                                    i9 = i10;
                                }
                                linkedHashMap = new LinkedHashMap(kotlin.collections.a.v(arrayList4));
                            } else {
                                linkedHashMap = null;
                            }
                            List<CorporateDetailsDomain.a.b> list5 = aVar3.f10909k0;
                            if (list5 != null) {
                                List<CorporateDetailsDomain.a.b> list6 = list5;
                                ArrayList arrayList5 = new ArrayList(n.u(list6, 10));
                                int i11 = 0;
                                for (Object obj3 : list6) {
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        m.t();
                                        throw null;
                                    }
                                    CorporateDetailsDomain.a.b bVar3 = (CorporateDetailsDomain.a.b) obj3;
                                    arrayList5.add(new Pair(Integer.valueOf(i12), new CreateCompanyUI.ContractorUI(bVar3.f10942a, bVar3.f10943b, bVar3.f10944c, bVar3.f10945d)));
                                    i11 = i12;
                                }
                                linkedHashMap2 = new LinkedHashMap(kotlin.collections.a.v(arrayList5));
                            } else {
                                linkedHashMap2 = null;
                            }
                            Float f10 = aVar3.f10921q0;
                            Long valueOf5 = f10 != null ? Long.valueOf((long) f10.floatValue()) : null;
                            Float f11 = aVar3.f10923r0;
                            companyUI = new CompanyDetailsUI.CompanyUI(aVar3.f10889a, aVar3.f10891b, aVar3.f10893c, aVar3.f10895d, aVar3.f10897e, aVar3.f10899f, aVar3.f10901g, aVar3.f10903h, aVar3.i, aVar3.f10906j, aVar3.f10908k, aVar3.f10910l, aVar3.f10912m, aVar3.f10914n, aVar3.f10916o, aVar3.f10918p, aVar3.f10920q, aVar3.f10922r, aVar3.f10924s, aVar3.f10925t, aVar3.f10927u, aVar3.f10929v, aVar3.f10931w, aVar3.f10933x, aVar3.f10935y, aVar3.f10937z, aVar3.f10861A, aVar3.f10863B, aVar3.f10867D, aVar3.f10869E, aVar3.f10871F, aVar3.f10873G, aVar3.f10875H, aVar3.f10877I, aVar3.f10879J, aVar3.f10881K, aVar3.f10882L, aVar3.f10883M, aVar3.f10884N, aVar3.f10885O, aVar3.f10886P, aVar3.f10887Q, aVar3.R, aVar3.S, aVar3.T, aVar3.U, aVar3.V, aVar3.W, aVar3.X, aVar3.Y, aVar3.f10888Z, aVar3.f10890a0, aVar3.f10892b0, aVar3.f10896d0, valueOf, valueOf2, valueOf3, null, valueOf4, aVar3.f10917o0, aVar3.f10928u0, aVar3.f10930v0, aVar3.f10932w0, arrayList3, linkedHashMap, linkedHashMap2, aVar3.f10919p0, valueOf5, f11 != null ? Long.valueOf((long) f11.floatValue()) : null, aVar3.s0 != null ? BigDecimal.valueOf(r6.intValue()) : null, aVar3.f10926t0 != null ? BigDecimal.valueOf(r6.intValue()) : null, aVar3.f10934x0, aVar3.f10936y0, aVar3.f10938z0);
                        } else {
                            companyUI = null;
                        }
                        List<CorporateDetailsDomain.b> list7 = corporateDetailsDomain.f10805b;
                        if (list7 != null) {
                            List<CorporateDetailsDomain.b> list8 = list7;
                            ArrayList arrayList6 = new ArrayList(n.u(list8, 10));
                            Iterator<T> it2 = list8.iterator();
                            while (it2.hasNext()) {
                                arrayList6.add(C1591a.a((CorporateDetailsDomain.b) it2.next()));
                            }
                            arrayList = arrayList6;
                        } else {
                            arrayList = null;
                        }
                        T02.f12446k1 = new CompanyDetailsUI(companyUI, arrayList, corporateDetailsDomain.f10806c, corporateDetailsDomain.f10807d, corporateDetailsDomain.f10808e, corporateDetailsDomain.f10809f, corporateDetailsDomain.f10810g, corporateDetailsDomain.f10811h);
                        if (list7 == null) {
                            list7 = EmptyList.f23104a;
                        }
                        teamMembersFragment2.U0(list7);
                        return p.f3034a;
                }
            }
        });
        com.luminary.business.presentation.ui.fragments.newcompany.teammembers.a aVar = this.f12685p0;
        if (aVar != null && (str = aVar.f12698a) != null) {
            NewCompanyViewModel T02 = T0();
            O7.b bVar = new O7.b(T02, str, 2);
            T02.f12421A1 = bVar;
            bVar.invoke();
        }
        V0();
        K4 u02 = u0();
        TeamMembersController teamMembersController = this.f12687r0;
        if (teamMembersController == null) {
            teamMembersController = null;
        }
        u02.f28073q.setAdapter(teamMembersController.getAdapter());
        final int i9 = 1;
        T0().f12449o1.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: Z7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeamMembersFragment f4227b;

            {
                this.f4227b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str2;
                Integer num;
                CompanyDetailsUI.CompanyUI companyUI;
                ArrayList arrayList;
                LinkedHashMap linkedHashMap;
                LinkedHashMap linkedHashMap2;
                switch (i9) {
                    case 0:
                        int intValue = ((Integer) obj).intValue();
                        TeamMembersFragment teamMembersFragment = this.f4227b;
                        CorporateDetailsDomain value = teamMembersFragment.T0().f12449o1.getValue();
                        CorporateDetailsDomain.b bVar2 = null;
                        List<CorporateDetailsDomain.b> list = value != null ? value.f10805b : null;
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    CorporateDetailsDomain.a aVar2 = ((CorporateDetailsDomain.b) next).f10950e;
                                    if (aVar2 != null && (num = aVar2.f10889a) != null && num.intValue() == intValue) {
                                        bVar2 = next;
                                    }
                                }
                            }
                            bVar2 = bVar2;
                        }
                        if (bVar2 != null) {
                            if (f.b(bVar2.f10951f, Boolean.FALSE)) {
                                TeamMemberUI a10 = C1591a.a(bVar2);
                                com.luminary.business.presentation.ui.fragments.newcompany.teammembers.a aVar22 = teamMembersFragment.f12685p0;
                                if (aVar22 != null && (str2 = aVar22.f12698a) != null) {
                                    U4.b.g(teamMembersFragment).j(new c(str2, teamMembersFragment.T0().j0(), teamMembersFragment.f12686q0.name(), a10));
                                }
                            }
                        }
                        return p.f3034a;
                    default:
                        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                        TeamMembersFragment teamMembersFragment2 = this.f4227b;
                        NewCompanyViewModel T022 = teamMembersFragment2.T0();
                        CorporateDetailsDomain.a aVar3 = corporateDetailsDomain.f10804a;
                        if (aVar3 != null) {
                            Long valueOf = Long.valueOf((long) aVar3.f10898e0);
                            BigDecimal valueOf2 = aVar3.f10902g0 != null ? BigDecimal.valueOf(r7.intValue()) : null;
                            BigDecimal valueOf3 = aVar3.f10904h0 != null ? BigDecimal.valueOf(r7.intValue()) : null;
                            Boolean valueOf4 = Boolean.valueOf(aVar3.f10900f0);
                            List<CorporateDetailsDomain.a.C0113a> list2 = aVar3.f10905i0;
                            ArrayList arrayList2 = new ArrayList(n.u(list2, 10));
                            for (CorporateDetailsDomain.a.C0113a c0113a : list2) {
                                arrayList2.add(new BankAccountOutside(c0113a.f10939a, c0113a.f10940b, null, c0113a.f10941c));
                            }
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            List<CorporateDetailsDomain.a.b> list3 = aVar3.f10907j0;
                            if (list3 != null) {
                                List<CorporateDetailsDomain.a.b> list4 = list3;
                                ArrayList arrayList4 = new ArrayList(n.u(list4, 10));
                                int i92 = 0;
                                for (Object obj2 : list4) {
                                    int i10 = i92 + 1;
                                    if (i92 < 0) {
                                        m.t();
                                        throw null;
                                    }
                                    CorporateDetailsDomain.a.b bVar22 = (CorporateDetailsDomain.a.b) obj2;
                                    arrayList4.add(new Pair(Integer.valueOf(i10), new CreateCompanyUI.ContractorUI(bVar22.f10942a, bVar22.f10943b, bVar22.f10944c, bVar22.f10945d)));
                                    i92 = i10;
                                }
                                linkedHashMap = new LinkedHashMap(kotlin.collections.a.v(arrayList4));
                            } else {
                                linkedHashMap = null;
                            }
                            List<CorporateDetailsDomain.a.b> list5 = aVar3.f10909k0;
                            if (list5 != null) {
                                List<CorporateDetailsDomain.a.b> list6 = list5;
                                ArrayList arrayList5 = new ArrayList(n.u(list6, 10));
                                int i11 = 0;
                                for (Object obj3 : list6) {
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        m.t();
                                        throw null;
                                    }
                                    CorporateDetailsDomain.a.b bVar3 = (CorporateDetailsDomain.a.b) obj3;
                                    arrayList5.add(new Pair(Integer.valueOf(i12), new CreateCompanyUI.ContractorUI(bVar3.f10942a, bVar3.f10943b, bVar3.f10944c, bVar3.f10945d)));
                                    i11 = i12;
                                }
                                linkedHashMap2 = new LinkedHashMap(kotlin.collections.a.v(arrayList5));
                            } else {
                                linkedHashMap2 = null;
                            }
                            Float f10 = aVar3.f10921q0;
                            Long valueOf5 = f10 != null ? Long.valueOf((long) f10.floatValue()) : null;
                            Float f11 = aVar3.f10923r0;
                            companyUI = new CompanyDetailsUI.CompanyUI(aVar3.f10889a, aVar3.f10891b, aVar3.f10893c, aVar3.f10895d, aVar3.f10897e, aVar3.f10899f, aVar3.f10901g, aVar3.f10903h, aVar3.i, aVar3.f10906j, aVar3.f10908k, aVar3.f10910l, aVar3.f10912m, aVar3.f10914n, aVar3.f10916o, aVar3.f10918p, aVar3.f10920q, aVar3.f10922r, aVar3.f10924s, aVar3.f10925t, aVar3.f10927u, aVar3.f10929v, aVar3.f10931w, aVar3.f10933x, aVar3.f10935y, aVar3.f10937z, aVar3.f10861A, aVar3.f10863B, aVar3.f10867D, aVar3.f10869E, aVar3.f10871F, aVar3.f10873G, aVar3.f10875H, aVar3.f10877I, aVar3.f10879J, aVar3.f10881K, aVar3.f10882L, aVar3.f10883M, aVar3.f10884N, aVar3.f10885O, aVar3.f10886P, aVar3.f10887Q, aVar3.R, aVar3.S, aVar3.T, aVar3.U, aVar3.V, aVar3.W, aVar3.X, aVar3.Y, aVar3.f10888Z, aVar3.f10890a0, aVar3.f10892b0, aVar3.f10896d0, valueOf, valueOf2, valueOf3, null, valueOf4, aVar3.f10917o0, aVar3.f10928u0, aVar3.f10930v0, aVar3.f10932w0, arrayList3, linkedHashMap, linkedHashMap2, aVar3.f10919p0, valueOf5, f11 != null ? Long.valueOf((long) f11.floatValue()) : null, aVar3.s0 != null ? BigDecimal.valueOf(r6.intValue()) : null, aVar3.f10926t0 != null ? BigDecimal.valueOf(r6.intValue()) : null, aVar3.f10934x0, aVar3.f10936y0, aVar3.f10938z0);
                        } else {
                            companyUI = null;
                        }
                        List<CorporateDetailsDomain.b> list7 = corporateDetailsDomain.f10805b;
                        if (list7 != null) {
                            List<CorporateDetailsDomain.b> list8 = list7;
                            ArrayList arrayList6 = new ArrayList(n.u(list8, 10));
                            Iterator<T> it2 = list8.iterator();
                            while (it2.hasNext()) {
                                arrayList6.add(C1591a.a((CorporateDetailsDomain.b) it2.next()));
                            }
                            arrayList = arrayList6;
                        } else {
                            arrayList = null;
                        }
                        T022.f12446k1 = new CompanyDetailsUI(companyUI, arrayList, corporateDetailsDomain.f10806c, corporateDetailsDomain.f10807d, corporateDetailsDomain.f10808e, corporateDetailsDomain.f10809f, corporateDetailsDomain.f10810g, corporateDetailsDomain.f10811h);
                        if (list7 == null) {
                            list7 = EmptyList.f23104a;
                        }
                        teamMembersFragment2.U0(list7);
                        return p.f3034a;
                }
            }
        }));
        final int i10 = 0;
        o.c(u0().f28072p, 500L, new InterfaceC0635a(this) { // from class: Z7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeamMembersFragment f4229b;

            {
                this.f4229b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                String str2;
                switch (i10) {
                    case 0:
                        TeamMembersFragment teamMembersFragment = this.f4229b;
                        teamMembersFragment.u0().f28070n.setText(R.string.add_ubo);
                        teamMembersFragment.u0().f28071o.setText(R.string.add_ubo);
                        CorporateDetailsDomain value = teamMembersFragment.T0().f12449o1.getValue();
                        List<CorporateDetailsDomain.b> list = value != null ? value.f10805b : null;
                        int ordinal = teamMembersFragment.f12686q0.ordinal();
                        if (ordinal == 0) {
                            teamMembersFragment.f12686q0 = TeamMembersFragment.UBOType.f12693b;
                            teamMembersFragment.L0();
                            if (list == null) {
                                list = EmptyList.f23104a;
                            }
                            teamMembersFragment.U0(list);
                        } else if (ordinal == 1) {
                            teamMembersFragment.f12686q0 = TeamMembersFragment.UBOType.f12694c;
                            teamMembersFragment.L0();
                            if (list == null) {
                                list = EmptyList.f23104a;
                            }
                            teamMembersFragment.U0(list);
                            teamMembersFragment.u0().f28070n.setText(R.string.add_shareholder);
                            teamMembersFragment.u0().f28071o.setText(R.string.add_shareholder);
                        } else {
                            if (ordinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            NavController g10 = U4.b.g(teamMembersFragment);
                            CompanyDetailsUI companyDetailsUI = teamMembersFragment.T0().f12446k1;
                            Parcelable parcelable = companyDetailsUI != null ? companyDetailsUI : null;
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                                g11.putParcelable("companyDetails", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                                    throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("companyDetails", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_teamMembersFragment_to_businessActivityFragment, g11);
                        }
                        teamMembersFragment.V0();
                        return p.f3034a;
                    case 1:
                        TeamMembersFragment teamMembersFragment2 = this.f4229b;
                        com.luminary.business.presentation.ui.fragments.newcompany.teammembers.a aVar2 = teamMembersFragment2.f12685p0;
                        if (aVar2 != null && (str2 = aVar2.f12700c) != null) {
                            U4.b.g(teamMembersFragment2).j(new c(str2, teamMembersFragment2.T0().j0(), teamMembersFragment2.f12686q0.name(), null));
                        }
                        return p.f3034a;
                    default:
                        this.f4229b.u0().f28070n.callOnClick();
                        return p.f3034a;
                }
            }
        });
        final int i11 = 1;
        o.c(u0().f28070n, 500L, new InterfaceC0635a(this) { // from class: Z7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeamMembersFragment f4229b;

            {
                this.f4229b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                String str2;
                switch (i11) {
                    case 0:
                        TeamMembersFragment teamMembersFragment = this.f4229b;
                        teamMembersFragment.u0().f28070n.setText(R.string.add_ubo);
                        teamMembersFragment.u0().f28071o.setText(R.string.add_ubo);
                        CorporateDetailsDomain value = teamMembersFragment.T0().f12449o1.getValue();
                        List<CorporateDetailsDomain.b> list = value != null ? value.f10805b : null;
                        int ordinal = teamMembersFragment.f12686q0.ordinal();
                        if (ordinal == 0) {
                            teamMembersFragment.f12686q0 = TeamMembersFragment.UBOType.f12693b;
                            teamMembersFragment.L0();
                            if (list == null) {
                                list = EmptyList.f23104a;
                            }
                            teamMembersFragment.U0(list);
                        } else if (ordinal == 1) {
                            teamMembersFragment.f12686q0 = TeamMembersFragment.UBOType.f12694c;
                            teamMembersFragment.L0();
                            if (list == null) {
                                list = EmptyList.f23104a;
                            }
                            teamMembersFragment.U0(list);
                            teamMembersFragment.u0().f28070n.setText(R.string.add_shareholder);
                            teamMembersFragment.u0().f28071o.setText(R.string.add_shareholder);
                        } else {
                            if (ordinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            NavController g10 = U4.b.g(teamMembersFragment);
                            CompanyDetailsUI companyDetailsUI = teamMembersFragment.T0().f12446k1;
                            Parcelable parcelable = companyDetailsUI != null ? companyDetailsUI : null;
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                                g11.putParcelable("companyDetails", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                                    throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("companyDetails", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_teamMembersFragment_to_businessActivityFragment, g11);
                        }
                        teamMembersFragment.V0();
                        return p.f3034a;
                    case 1:
                        TeamMembersFragment teamMembersFragment2 = this.f4229b;
                        com.luminary.business.presentation.ui.fragments.newcompany.teammembers.a aVar2 = teamMembersFragment2.f12685p0;
                        if (aVar2 != null && (str2 = aVar2.f12700c) != null) {
                            U4.b.g(teamMembersFragment2).j(new c(str2, teamMembersFragment2.T0().j0(), teamMembersFragment2.f12686q0.name(), null));
                        }
                        return p.f3034a;
                    default:
                        this.f4229b.u0().f28070n.callOnClick();
                        return p.f3034a;
                }
            }
        });
        final int i12 = 2;
        o.c(u0().f28071o, 500L, new InterfaceC0635a(this) { // from class: Z7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TeamMembersFragment f4229b;

            {
                this.f4229b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                String str2;
                switch (i12) {
                    case 0:
                        TeamMembersFragment teamMembersFragment = this.f4229b;
                        teamMembersFragment.u0().f28070n.setText(R.string.add_ubo);
                        teamMembersFragment.u0().f28071o.setText(R.string.add_ubo);
                        CorporateDetailsDomain value = teamMembersFragment.T0().f12449o1.getValue();
                        List<CorporateDetailsDomain.b> list = value != null ? value.f10805b : null;
                        int ordinal = teamMembersFragment.f12686q0.ordinal();
                        if (ordinal == 0) {
                            teamMembersFragment.f12686q0 = TeamMembersFragment.UBOType.f12693b;
                            teamMembersFragment.L0();
                            if (list == null) {
                                list = EmptyList.f23104a;
                            }
                            teamMembersFragment.U0(list);
                        } else if (ordinal == 1) {
                            teamMembersFragment.f12686q0 = TeamMembersFragment.UBOType.f12694c;
                            teamMembersFragment.L0();
                            if (list == null) {
                                list = EmptyList.f23104a;
                            }
                            teamMembersFragment.U0(list);
                            teamMembersFragment.u0().f28070n.setText(R.string.add_shareholder);
                            teamMembersFragment.u0().f28071o.setText(R.string.add_shareholder);
                        } else {
                            if (ordinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            NavController g10 = U4.b.g(teamMembersFragment);
                            CompanyDetailsUI companyDetailsUI = teamMembersFragment.T0().f12446k1;
                            Parcelable parcelable = companyDetailsUI != null ? companyDetailsUI : null;
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                                g11.putParcelable("companyDetails", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                                    throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("companyDetails", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_teamMembersFragment_to_businessActivityFragment, g11);
                        }
                        teamMembersFragment.V0();
                        return p.f3034a;
                    case 1:
                        TeamMembersFragment teamMembersFragment2 = this.f4229b;
                        com.luminary.business.presentation.ui.fragments.newcompany.teammembers.a aVar2 = teamMembersFragment2.f12685p0;
                        if (aVar2 != null && (str2 = aVar2.f12700c) != null) {
                            U4.b.g(teamMembersFragment2).j(new c(str2, teamMembersFragment2.T0().j0(), teamMembersFragment2.f12686q0.name(), null));
                        }
                        return p.f3034a;
                    default:
                        this.f4229b.u0().f28070n.callOnClick();
                        return p.f3034a;
                }
            }
        });
        E.b(this, "AddUBO", new B6.h(this, 15));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12683n0;
    }
}
