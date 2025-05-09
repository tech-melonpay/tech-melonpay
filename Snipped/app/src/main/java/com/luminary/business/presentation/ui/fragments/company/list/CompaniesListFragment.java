package com.luminary.business.presentation.ui.fragments.company.list;

import C.H;
import C.v;
import F8.o;
import O9.f;
import O9.p;
import P9.n;
import P9.s;
import U4.b;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import b5.C0588a;
import b7.C0603b;
import b7.C0606e;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.company.list.CompaniesListController;
import com.luminary.business.presentation.ui.fragments.company.list.CompaniesListFragment;
import com.luminary.business.presentation.ui.fragments.company.list.a;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h;
import t6.AbstractC1324e3;

/* compiled from: CompaniesListFragment.kt */
/* loaded from: classes2.dex */
public final class CompaniesListFragment extends BaseFragment<AbstractC1324e3> {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f11866t0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f11867n0 = R.layout.fragment_company_list;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11868o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f11869p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f11870q0;

    /* renamed from: r0, reason: collision with root package name */
    public CompaniesListController f11871r0;
    public final f s0;

    /* compiled from: CompaniesListFragment.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11877a;

        static {
            int[] iArr = new int[CorporateDetailsDomain.StatusIdentification.values().length];
            try {
                CorporateDetailsDomain.StatusIdentification.a aVar = CorporateDetailsDomain.StatusIdentification.f10854a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CorporateDetailsDomain.StatusIdentification.a aVar2 = CorporateDetailsDomain.StatusIdentification.f10854a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CorporateDetailsDomain.StatusIdentification.a aVar3 = CorporateDetailsDomain.StatusIdentification.f10854a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CorporateDetailsDomain.StatusIdentification.a aVar4 = CorporateDetailsDomain.StatusIdentification.f10854a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CorporateDetailsDomain.StatusIdentification.a aVar5 = CorporateDetailsDomain.StatusIdentification.f10854a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f11877a = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            CorporateDetailsDomain.a aVar = ((CorporateDetailsDomain) t10).f10804a;
            String str = aVar != null ? aVar.Y : null;
            CorporateDetailsDomain.a aVar2 = ((CorporateDetailsDomain) t3).f10804a;
            return R9.a.a(str, aVar2 != null ? aVar2.Y : null);
        }
    }

    /* compiled from: CompaniesListFragment.kt */
    public static final class c implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11878a;

        public c(InterfaceC0646l interfaceC0646l) {
            this.f11878a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11878a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11878a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.company.list.CompaniesListFragment$special$$inlined$viewModel$default$1] */
    public CompaniesListFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.company.list.CompaniesListFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11868o0 = E.a(this, h.a(C0606e.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.company.list.CompaniesListFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.company.list.CompaniesListFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C0606e.class), null, null, b.l(this));
            }
        });
        this.f11869p0 = true;
        this.f11870q0 = true;
        this.s0 = kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<K5.a>() { // from class: com.luminary.business.presentation.ui.fragments.company.list.CompaniesListFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [K5.a, java.lang.Object] */
            @Override // ca.InterfaceC0635a
            public final K5.a invoke() {
                return b.l(this).a(null, null, h.a(K5.a.class));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        return false;
    }

    public final C0606e T0() {
        return (C0606e) this.f11868o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((MainActivity) requireActivity()).F();
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((MainActivity) requireActivity()).D();
        if (!this.f11869p0) {
            T0().m(this.f11870q0);
        } else {
            this.f11869p0 = false;
            ((MainActivity) requireActivity()).E(false);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        T0().f426S0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompaniesListFragment f8367b;

            {
                this.f8367b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                Object obj2;
                String str5;
                String str6;
                Integer num;
                switch (i) {
                    case 0:
                        this.f8367b.getClass();
                        return p.f3034a;
                    case 1:
                        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain != null) {
                            CompaniesListFragment companiesListFragment = this.f8367b;
                            NavController g10 = U4.b.g(companiesListFragment);
                            CorporateDetailsDomain.a aVar = corporateDetailsDomain.f10804a;
                            if (aVar == null || (str = aVar.f10937z) == null) {
                                str = "";
                            }
                            if (aVar == null || (str2 = aVar.f10861A) == null) {
                                str2 = "";
                            }
                            String a10 = aVar != null ? aVar.a() : "";
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("companyName", str);
                            bundle2.putString("companyNumber", str2);
                            bundle2.putString("companyAddress", a10);
                            g10.i(R.id.action_companiesListFragment_to_companyNotApprovedFragment, bundle2);
                            companiesListFragment.T0().f8385d1.postValue(null);
                        }
                        return p.f3034a;
                    case 2:
                        CorporateDetailsDomain corporateDetailsDomain2 = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain2 != null) {
                            CompaniesListFragment companiesListFragment2 = this.f8367b;
                            NavController g11 = U4.b.g(companiesListFragment2);
                            CorporateDetailsDomain.a aVar2 = corporateDetailsDomain2.f10804a;
                            if (aVar2 == null || (str3 = aVar2.f10937z) == null) {
                                str3 = "";
                            }
                            if (aVar2 == null || (str4 = aVar2.f10861A) == null) {
                                str4 = "";
                            }
                            String a11 = aVar2 != null ? aVar2.a() : "";
                            g11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("companyName", str3);
                            bundle3.putString("companyNumber", str4);
                            bundle3.putString("companyAddress", a11);
                            g11.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle3);
                            companiesListFragment2.T0().f8386e1.postValue(null);
                        }
                        return p.f3034a;
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        CompaniesListFragment companiesListFragment3 = this.f8367b;
                        List<CorporateDetailsDomain> value = companiesListFragment3.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar3 == null || (num = aVar3.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain3 = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain3 != null) {
                                CorporateDetailsDomain.a aVar4 = corporateDetailsDomain3.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar4 != null ? aVar4.f10896d0 : null;
                                int i9 = statusIdentification == null ? -1 : CompaniesListFragment.a.f11877a[statusIdentification.ordinal()];
                                if (i9 != -1) {
                                    if (i9 == 1) {
                                        companiesListFragment3.f11870q0 = false;
                                        O9.f fVar = companiesListFragment3.s0;
                                        if (aVar4 != null) {
                                            ((K5.a) fVar.getValue()).g(F8.f.a(aVar4));
                                        }
                                        ((K5.a) fVar.getValue()).S(intValue);
                                        U4.b.g(companiesListFragment3).i(R.id.action_global_homeFragment, null);
                                    } else if (i9 == 2) {
                                        NavController g12 = U4.b.g(companiesListFragment3);
                                        if (aVar4 == null || (str5 = aVar4.f10937z) == null) {
                                            str5 = "";
                                        }
                                        if (aVar4 == null || (str6 = aVar4.f10861A) == null) {
                                            str6 = "";
                                        }
                                        String a12 = aVar4 != null ? aVar4.a() : "";
                                        g12.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("companyName", str5);
                                        bundle4.putString("companyNumber", str6);
                                        bundle4.putString("companyAddress", a12);
                                        g12.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle4);
                                        companiesListFragment3.T0().f8386e1.postValue(null);
                                    } else if (i9 != 3) {
                                        if (i9 == 4) {
                                            NavController g13 = U4.b.g(companiesListFragment3);
                                            String valueOf = String.valueOf(intValue);
                                            g13.getClass();
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putString("companyId", valueOf);
                                            bundle5.putBoolean("isEdit", true);
                                            g13.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle5);
                                            companiesListFragment3.T0().f8384c1.postValue(null);
                                        } else if (i9 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                    case 4:
                        CompaniesListFragment companiesListFragment4 = this.f8367b;
                        companiesListFragment4.f11870q0 = false;
                        U4.b.g(companiesListFragment4).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    case 5:
                        v.w(U4.b.g(this.f8367b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        return p.f3034a;
                    case 6:
                        List list = (List) obj;
                        List list2 = list;
                        CompaniesListFragment companiesListFragment5 = this.f8367b;
                        if (list2 == null || list2.isEmpty()) {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.getString(R.string.company_details));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.please_add_information_about_your_company));
                        } else {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.f11870q0 ? companiesListFragment5.getString(R.string.welcome_to_bank_business) : companiesListFragment5.getString(R.string.my_companies));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.choose_the_company_account_you_want_to_login_in));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (companiesListFragment5.f11870q0) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                CorporateDetailsDomain.a aVar5 = ((CorporateDetailsDomain) obj3).f10804a;
                                boolean z10 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b;
                                boolean z11 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10856c;
                                boolean z12 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10858e;
                                if (z10 || z11 || z12) {
                                    arrayList2.add(obj3);
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                CorporateDetailsDomain.a aVar6 = ((CorporateDetailsDomain) next).f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification2 = aVar6 != null ? aVar6.f10896d0 : null;
                                Object obj4 = linkedHashMap.get(statusIdentification2);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(statusIdentification2, obj4);
                                }
                                ((List) obj4).add(next);
                            }
                            TreeMap treeMap = new TreeMap(new H(new C0588a(15), 2));
                            treeMap.putAll(linkedHashMap);
                            ArrayList arrayList3 = new ArrayList(treeMap.size());
                            for (Map.Entry entry : treeMap.entrySet()) {
                                CorporateDetailsDomain.StatusIdentification statusIdentification3 = (CorporateDetailsDomain.StatusIdentification) entry.getKey();
                                if (statusIdentification3 == null) {
                                    statusIdentification3 = CorporateDetailsDomain.StatusIdentification.f10859f;
                                }
                                arrayList.add(new a.b(statusIdentification3));
                                Iterable iterable = (Iterable) entry.getValue();
                                ArrayList arrayList4 = new ArrayList(n.u(iterable, 10));
                                Iterator it3 = iterable.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(new a.C0118a((CorporateDetailsDomain) it3.next()));
                                }
                                arrayList3.add(Boolean.valueOf(arrayList.addAll(arrayList4)));
                            }
                            CompaniesListController companiesListController = companiesListFragment5.f11871r0;
                            (companiesListController != null ? companiesListController : null).setData(arrayList);
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : list) {
                                CorporateDetailsDomain.a aVar7 = ((CorporateDetailsDomain) obj5).f10804a;
                                if ((aVar7 != null ? aVar7.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                    arrayList5.add(obj5);
                                }
                            }
                            List X = s.X(arrayList5, new CompaniesListFragment.b());
                            ArrayList arrayList6 = new ArrayList(n.u(X, 10));
                            Iterator it4 = X.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(new a.C0118a((CorporateDetailsDomain) it4.next()));
                            }
                            CompaniesListController companiesListController2 = companiesListFragment5.f11871r0;
                            (companiesListController2 != null ? companiesListController2 : null).setData(arrayList6);
                        }
                        return p.f3034a;
                    case 7:
                        CompaniesListFragment companiesListFragment6 = this.f8367b;
                        companiesListFragment6.getClass();
                        U4.b.g(companiesListFragment6).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            CompaniesListFragment companiesListFragment7 = this.f8367b;
                            NavController g14 = U4.b.g(companiesListFragment7);
                            String valueOf2 = String.valueOf(intValue2);
                            g14.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putString("companyId", valueOf2);
                            bundle6.putBoolean("isEdit", true);
                            g14.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle6);
                            companiesListFragment7.T0().f8384c1.postValue(null);
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i9 = 3;
        this.f11871r0 = new CompaniesListController(requireContext(), new InterfaceC0646l(this) { // from class: b7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompaniesListFragment f8367b;

            {
                this.f8367b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                Object obj2;
                String str5;
                String str6;
                Integer num;
                switch (i9) {
                    case 0:
                        this.f8367b.getClass();
                        return p.f3034a;
                    case 1:
                        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain != null) {
                            CompaniesListFragment companiesListFragment = this.f8367b;
                            NavController g10 = U4.b.g(companiesListFragment);
                            CorporateDetailsDomain.a aVar = corporateDetailsDomain.f10804a;
                            if (aVar == null || (str = aVar.f10937z) == null) {
                                str = "";
                            }
                            if (aVar == null || (str2 = aVar.f10861A) == null) {
                                str2 = "";
                            }
                            String a10 = aVar != null ? aVar.a() : "";
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("companyName", str);
                            bundle2.putString("companyNumber", str2);
                            bundle2.putString("companyAddress", a10);
                            g10.i(R.id.action_companiesListFragment_to_companyNotApprovedFragment, bundle2);
                            companiesListFragment.T0().f8385d1.postValue(null);
                        }
                        return p.f3034a;
                    case 2:
                        CorporateDetailsDomain corporateDetailsDomain2 = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain2 != null) {
                            CompaniesListFragment companiesListFragment2 = this.f8367b;
                            NavController g11 = U4.b.g(companiesListFragment2);
                            CorporateDetailsDomain.a aVar2 = corporateDetailsDomain2.f10804a;
                            if (aVar2 == null || (str3 = aVar2.f10937z) == null) {
                                str3 = "";
                            }
                            if (aVar2 == null || (str4 = aVar2.f10861A) == null) {
                                str4 = "";
                            }
                            String a11 = aVar2 != null ? aVar2.a() : "";
                            g11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("companyName", str3);
                            bundle3.putString("companyNumber", str4);
                            bundle3.putString("companyAddress", a11);
                            g11.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle3);
                            companiesListFragment2.T0().f8386e1.postValue(null);
                        }
                        return p.f3034a;
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        CompaniesListFragment companiesListFragment3 = this.f8367b;
                        List<CorporateDetailsDomain> value = companiesListFragment3.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar3 == null || (num = aVar3.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain3 = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain3 != null) {
                                CorporateDetailsDomain.a aVar4 = corporateDetailsDomain3.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar4 != null ? aVar4.f10896d0 : null;
                                int i92 = statusIdentification == null ? -1 : CompaniesListFragment.a.f11877a[statusIdentification.ordinal()];
                                if (i92 != -1) {
                                    if (i92 == 1) {
                                        companiesListFragment3.f11870q0 = false;
                                        O9.f fVar = companiesListFragment3.s0;
                                        if (aVar4 != null) {
                                            ((K5.a) fVar.getValue()).g(F8.f.a(aVar4));
                                        }
                                        ((K5.a) fVar.getValue()).S(intValue);
                                        U4.b.g(companiesListFragment3).i(R.id.action_global_homeFragment, null);
                                    } else if (i92 == 2) {
                                        NavController g12 = U4.b.g(companiesListFragment3);
                                        if (aVar4 == null || (str5 = aVar4.f10937z) == null) {
                                            str5 = "";
                                        }
                                        if (aVar4 == null || (str6 = aVar4.f10861A) == null) {
                                            str6 = "";
                                        }
                                        String a12 = aVar4 != null ? aVar4.a() : "";
                                        g12.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("companyName", str5);
                                        bundle4.putString("companyNumber", str6);
                                        bundle4.putString("companyAddress", a12);
                                        g12.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle4);
                                        companiesListFragment3.T0().f8386e1.postValue(null);
                                    } else if (i92 != 3) {
                                        if (i92 == 4) {
                                            NavController g13 = U4.b.g(companiesListFragment3);
                                            String valueOf = String.valueOf(intValue);
                                            g13.getClass();
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putString("companyId", valueOf);
                                            bundle5.putBoolean("isEdit", true);
                                            g13.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle5);
                                            companiesListFragment3.T0().f8384c1.postValue(null);
                                        } else if (i92 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                    case 4:
                        CompaniesListFragment companiesListFragment4 = this.f8367b;
                        companiesListFragment4.f11870q0 = false;
                        U4.b.g(companiesListFragment4).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    case 5:
                        v.w(U4.b.g(this.f8367b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        return p.f3034a;
                    case 6:
                        List list = (List) obj;
                        List list2 = list;
                        CompaniesListFragment companiesListFragment5 = this.f8367b;
                        if (list2 == null || list2.isEmpty()) {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.getString(R.string.company_details));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.please_add_information_about_your_company));
                        } else {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.f11870q0 ? companiesListFragment5.getString(R.string.welcome_to_bank_business) : companiesListFragment5.getString(R.string.my_companies));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.choose_the_company_account_you_want_to_login_in));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (companiesListFragment5.f11870q0) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                CorporateDetailsDomain.a aVar5 = ((CorporateDetailsDomain) obj3).f10804a;
                                boolean z10 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b;
                                boolean z11 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10856c;
                                boolean z12 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10858e;
                                if (z10 || z11 || z12) {
                                    arrayList2.add(obj3);
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                CorporateDetailsDomain.a aVar6 = ((CorporateDetailsDomain) next).f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification2 = aVar6 != null ? aVar6.f10896d0 : null;
                                Object obj4 = linkedHashMap.get(statusIdentification2);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(statusIdentification2, obj4);
                                }
                                ((List) obj4).add(next);
                            }
                            TreeMap treeMap = new TreeMap(new H(new C0588a(15), 2));
                            treeMap.putAll(linkedHashMap);
                            ArrayList arrayList3 = new ArrayList(treeMap.size());
                            for (Map.Entry entry : treeMap.entrySet()) {
                                CorporateDetailsDomain.StatusIdentification statusIdentification3 = (CorporateDetailsDomain.StatusIdentification) entry.getKey();
                                if (statusIdentification3 == null) {
                                    statusIdentification3 = CorporateDetailsDomain.StatusIdentification.f10859f;
                                }
                                arrayList.add(new a.b(statusIdentification3));
                                Iterable iterable = (Iterable) entry.getValue();
                                ArrayList arrayList4 = new ArrayList(n.u(iterable, 10));
                                Iterator it3 = iterable.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(new a.C0118a((CorporateDetailsDomain) it3.next()));
                                }
                                arrayList3.add(Boolean.valueOf(arrayList.addAll(arrayList4)));
                            }
                            CompaniesListController companiesListController = companiesListFragment5.f11871r0;
                            (companiesListController != null ? companiesListController : null).setData(arrayList);
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : list) {
                                CorporateDetailsDomain.a aVar7 = ((CorporateDetailsDomain) obj5).f10804a;
                                if ((aVar7 != null ? aVar7.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                    arrayList5.add(obj5);
                                }
                            }
                            List X = s.X(arrayList5, new CompaniesListFragment.b());
                            ArrayList arrayList6 = new ArrayList(n.u(X, 10));
                            Iterator it4 = X.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(new a.C0118a((CorporateDetailsDomain) it4.next()));
                            }
                            CompaniesListController companiesListController2 = companiesListFragment5.f11871r0;
                            (companiesListController2 != null ? companiesListController2 : null).setData(arrayList6);
                        }
                        return p.f3034a;
                    case 7:
                        CompaniesListFragment companiesListFragment6 = this.f8367b;
                        companiesListFragment6.getClass();
                        U4.b.g(companiesListFragment6).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            CompaniesListFragment companiesListFragment7 = this.f8367b;
                            NavController g14 = U4.b.g(companiesListFragment7);
                            String valueOf2 = String.valueOf(intValue2);
                            g14.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putString("companyId", valueOf2);
                            bundle6.putBoolean("isEdit", true);
                            g14.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle6);
                            companiesListFragment7.T0().f8384c1.postValue(null);
                        }
                        return p.f3034a;
                }
            }
        });
        u0().f28957r.setColorSchemeResources(R.color.main_color);
        u0().f28957r.setOnRefreshListener(new A0.b(this, 24));
        AbstractC1324e3 u02 = u0();
        CompaniesListController companiesListController = this.f11871r0;
        if (companiesListController == null) {
            companiesListController = null;
        }
        u02.f28955p.setAdapter(companiesListController.getAdapter());
        CompaniesListController companiesListController2 = this.f11871r0;
        if (companiesListController2 == null) {
            companiesListController2 = null;
        }
        companiesListController2.setData(null);
        final int i10 = 4;
        T0().f8382a1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompaniesListFragment f8367b;

            {
                this.f8367b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                Object obj2;
                String str5;
                String str6;
                Integer num;
                switch (i10) {
                    case 0:
                        this.f8367b.getClass();
                        return p.f3034a;
                    case 1:
                        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain != null) {
                            CompaniesListFragment companiesListFragment = this.f8367b;
                            NavController g10 = U4.b.g(companiesListFragment);
                            CorporateDetailsDomain.a aVar = corporateDetailsDomain.f10804a;
                            if (aVar == null || (str = aVar.f10937z) == null) {
                                str = "";
                            }
                            if (aVar == null || (str2 = aVar.f10861A) == null) {
                                str2 = "";
                            }
                            String a10 = aVar != null ? aVar.a() : "";
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("companyName", str);
                            bundle2.putString("companyNumber", str2);
                            bundle2.putString("companyAddress", a10);
                            g10.i(R.id.action_companiesListFragment_to_companyNotApprovedFragment, bundle2);
                            companiesListFragment.T0().f8385d1.postValue(null);
                        }
                        return p.f3034a;
                    case 2:
                        CorporateDetailsDomain corporateDetailsDomain2 = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain2 != null) {
                            CompaniesListFragment companiesListFragment2 = this.f8367b;
                            NavController g11 = U4.b.g(companiesListFragment2);
                            CorporateDetailsDomain.a aVar2 = corporateDetailsDomain2.f10804a;
                            if (aVar2 == null || (str3 = aVar2.f10937z) == null) {
                                str3 = "";
                            }
                            if (aVar2 == null || (str4 = aVar2.f10861A) == null) {
                                str4 = "";
                            }
                            String a11 = aVar2 != null ? aVar2.a() : "";
                            g11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("companyName", str3);
                            bundle3.putString("companyNumber", str4);
                            bundle3.putString("companyAddress", a11);
                            g11.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle3);
                            companiesListFragment2.T0().f8386e1.postValue(null);
                        }
                        return p.f3034a;
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        CompaniesListFragment companiesListFragment3 = this.f8367b;
                        List<CorporateDetailsDomain> value = companiesListFragment3.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar3 == null || (num = aVar3.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain3 = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain3 != null) {
                                CorporateDetailsDomain.a aVar4 = corporateDetailsDomain3.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar4 != null ? aVar4.f10896d0 : null;
                                int i92 = statusIdentification == null ? -1 : CompaniesListFragment.a.f11877a[statusIdentification.ordinal()];
                                if (i92 != -1) {
                                    if (i92 == 1) {
                                        companiesListFragment3.f11870q0 = false;
                                        O9.f fVar = companiesListFragment3.s0;
                                        if (aVar4 != null) {
                                            ((K5.a) fVar.getValue()).g(F8.f.a(aVar4));
                                        }
                                        ((K5.a) fVar.getValue()).S(intValue);
                                        U4.b.g(companiesListFragment3).i(R.id.action_global_homeFragment, null);
                                    } else if (i92 == 2) {
                                        NavController g12 = U4.b.g(companiesListFragment3);
                                        if (aVar4 == null || (str5 = aVar4.f10937z) == null) {
                                            str5 = "";
                                        }
                                        if (aVar4 == null || (str6 = aVar4.f10861A) == null) {
                                            str6 = "";
                                        }
                                        String a12 = aVar4 != null ? aVar4.a() : "";
                                        g12.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("companyName", str5);
                                        bundle4.putString("companyNumber", str6);
                                        bundle4.putString("companyAddress", a12);
                                        g12.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle4);
                                        companiesListFragment3.T0().f8386e1.postValue(null);
                                    } else if (i92 != 3) {
                                        if (i92 == 4) {
                                            NavController g13 = U4.b.g(companiesListFragment3);
                                            String valueOf = String.valueOf(intValue);
                                            g13.getClass();
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putString("companyId", valueOf);
                                            bundle5.putBoolean("isEdit", true);
                                            g13.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle5);
                                            companiesListFragment3.T0().f8384c1.postValue(null);
                                        } else if (i92 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                    case 4:
                        CompaniesListFragment companiesListFragment4 = this.f8367b;
                        companiesListFragment4.f11870q0 = false;
                        U4.b.g(companiesListFragment4).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    case 5:
                        v.w(U4.b.g(this.f8367b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        return p.f3034a;
                    case 6:
                        List list = (List) obj;
                        List list2 = list;
                        CompaniesListFragment companiesListFragment5 = this.f8367b;
                        if (list2 == null || list2.isEmpty()) {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.getString(R.string.company_details));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.please_add_information_about_your_company));
                        } else {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.f11870q0 ? companiesListFragment5.getString(R.string.welcome_to_bank_business) : companiesListFragment5.getString(R.string.my_companies));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.choose_the_company_account_you_want_to_login_in));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (companiesListFragment5.f11870q0) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                CorporateDetailsDomain.a aVar5 = ((CorporateDetailsDomain) obj3).f10804a;
                                boolean z10 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b;
                                boolean z11 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10856c;
                                boolean z12 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10858e;
                                if (z10 || z11 || z12) {
                                    arrayList2.add(obj3);
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                CorporateDetailsDomain.a aVar6 = ((CorporateDetailsDomain) next).f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification2 = aVar6 != null ? aVar6.f10896d0 : null;
                                Object obj4 = linkedHashMap.get(statusIdentification2);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(statusIdentification2, obj4);
                                }
                                ((List) obj4).add(next);
                            }
                            TreeMap treeMap = new TreeMap(new H(new C0588a(15), 2));
                            treeMap.putAll(linkedHashMap);
                            ArrayList arrayList3 = new ArrayList(treeMap.size());
                            for (Map.Entry entry : treeMap.entrySet()) {
                                CorporateDetailsDomain.StatusIdentification statusIdentification3 = (CorporateDetailsDomain.StatusIdentification) entry.getKey();
                                if (statusIdentification3 == null) {
                                    statusIdentification3 = CorporateDetailsDomain.StatusIdentification.f10859f;
                                }
                                arrayList.add(new a.b(statusIdentification3));
                                Iterable iterable = (Iterable) entry.getValue();
                                ArrayList arrayList4 = new ArrayList(n.u(iterable, 10));
                                Iterator it3 = iterable.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(new a.C0118a((CorporateDetailsDomain) it3.next()));
                                }
                                arrayList3.add(Boolean.valueOf(arrayList.addAll(arrayList4)));
                            }
                            CompaniesListController companiesListController3 = companiesListFragment5.f11871r0;
                            (companiesListController3 != null ? companiesListController3 : null).setData(arrayList);
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : list) {
                                CorporateDetailsDomain.a aVar7 = ((CorporateDetailsDomain) obj5).f10804a;
                                if ((aVar7 != null ? aVar7.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                    arrayList5.add(obj5);
                                }
                            }
                            List X = s.X(arrayList5, new CompaniesListFragment.b());
                            ArrayList arrayList6 = new ArrayList(n.u(X, 10));
                            Iterator it4 = X.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(new a.C0118a((CorporateDetailsDomain) it4.next()));
                            }
                            CompaniesListController companiesListController22 = companiesListFragment5.f11871r0;
                            (companiesListController22 != null ? companiesListController22 : null).setData(arrayList6);
                        }
                        return p.f3034a;
                    case 7:
                        CompaniesListFragment companiesListFragment6 = this.f8367b;
                        companiesListFragment6.getClass();
                        U4.b.g(companiesListFragment6).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            CompaniesListFragment companiesListFragment7 = this.f8367b;
                            NavController g14 = U4.b.g(companiesListFragment7);
                            String valueOf2 = String.valueOf(intValue2);
                            g14.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putString("companyId", valueOf2);
                            bundle6.putBoolean("isEdit", true);
                            g14.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle6);
                            companiesListFragment7.T0().f8384c1.postValue(null);
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i11 = 5;
        T0().f8383b1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompaniesListFragment f8367b;

            {
                this.f8367b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                Object obj2;
                String str5;
                String str6;
                Integer num;
                switch (i11) {
                    case 0:
                        this.f8367b.getClass();
                        return p.f3034a;
                    case 1:
                        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain != null) {
                            CompaniesListFragment companiesListFragment = this.f8367b;
                            NavController g10 = U4.b.g(companiesListFragment);
                            CorporateDetailsDomain.a aVar = corporateDetailsDomain.f10804a;
                            if (aVar == null || (str = aVar.f10937z) == null) {
                                str = "";
                            }
                            if (aVar == null || (str2 = aVar.f10861A) == null) {
                                str2 = "";
                            }
                            String a10 = aVar != null ? aVar.a() : "";
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("companyName", str);
                            bundle2.putString("companyNumber", str2);
                            bundle2.putString("companyAddress", a10);
                            g10.i(R.id.action_companiesListFragment_to_companyNotApprovedFragment, bundle2);
                            companiesListFragment.T0().f8385d1.postValue(null);
                        }
                        return p.f3034a;
                    case 2:
                        CorporateDetailsDomain corporateDetailsDomain2 = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain2 != null) {
                            CompaniesListFragment companiesListFragment2 = this.f8367b;
                            NavController g11 = U4.b.g(companiesListFragment2);
                            CorporateDetailsDomain.a aVar2 = corporateDetailsDomain2.f10804a;
                            if (aVar2 == null || (str3 = aVar2.f10937z) == null) {
                                str3 = "";
                            }
                            if (aVar2 == null || (str4 = aVar2.f10861A) == null) {
                                str4 = "";
                            }
                            String a11 = aVar2 != null ? aVar2.a() : "";
                            g11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("companyName", str3);
                            bundle3.putString("companyNumber", str4);
                            bundle3.putString("companyAddress", a11);
                            g11.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle3);
                            companiesListFragment2.T0().f8386e1.postValue(null);
                        }
                        return p.f3034a;
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        CompaniesListFragment companiesListFragment3 = this.f8367b;
                        List<CorporateDetailsDomain> value = companiesListFragment3.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar3 == null || (num = aVar3.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain3 = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain3 != null) {
                                CorporateDetailsDomain.a aVar4 = corporateDetailsDomain3.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar4 != null ? aVar4.f10896d0 : null;
                                int i92 = statusIdentification == null ? -1 : CompaniesListFragment.a.f11877a[statusIdentification.ordinal()];
                                if (i92 != -1) {
                                    if (i92 == 1) {
                                        companiesListFragment3.f11870q0 = false;
                                        O9.f fVar = companiesListFragment3.s0;
                                        if (aVar4 != null) {
                                            ((K5.a) fVar.getValue()).g(F8.f.a(aVar4));
                                        }
                                        ((K5.a) fVar.getValue()).S(intValue);
                                        U4.b.g(companiesListFragment3).i(R.id.action_global_homeFragment, null);
                                    } else if (i92 == 2) {
                                        NavController g12 = U4.b.g(companiesListFragment3);
                                        if (aVar4 == null || (str5 = aVar4.f10937z) == null) {
                                            str5 = "";
                                        }
                                        if (aVar4 == null || (str6 = aVar4.f10861A) == null) {
                                            str6 = "";
                                        }
                                        String a12 = aVar4 != null ? aVar4.a() : "";
                                        g12.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("companyName", str5);
                                        bundle4.putString("companyNumber", str6);
                                        bundle4.putString("companyAddress", a12);
                                        g12.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle4);
                                        companiesListFragment3.T0().f8386e1.postValue(null);
                                    } else if (i92 != 3) {
                                        if (i92 == 4) {
                                            NavController g13 = U4.b.g(companiesListFragment3);
                                            String valueOf = String.valueOf(intValue);
                                            g13.getClass();
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putString("companyId", valueOf);
                                            bundle5.putBoolean("isEdit", true);
                                            g13.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle5);
                                            companiesListFragment3.T0().f8384c1.postValue(null);
                                        } else if (i92 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                    case 4:
                        CompaniesListFragment companiesListFragment4 = this.f8367b;
                        companiesListFragment4.f11870q0 = false;
                        U4.b.g(companiesListFragment4).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    case 5:
                        v.w(U4.b.g(this.f8367b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        return p.f3034a;
                    case 6:
                        List list = (List) obj;
                        List list2 = list;
                        CompaniesListFragment companiesListFragment5 = this.f8367b;
                        if (list2 == null || list2.isEmpty()) {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.getString(R.string.company_details));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.please_add_information_about_your_company));
                        } else {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.f11870q0 ? companiesListFragment5.getString(R.string.welcome_to_bank_business) : companiesListFragment5.getString(R.string.my_companies));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.choose_the_company_account_you_want_to_login_in));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (companiesListFragment5.f11870q0) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                CorporateDetailsDomain.a aVar5 = ((CorporateDetailsDomain) obj3).f10804a;
                                boolean z10 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b;
                                boolean z11 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10856c;
                                boolean z12 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10858e;
                                if (z10 || z11 || z12) {
                                    arrayList2.add(obj3);
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                CorporateDetailsDomain.a aVar6 = ((CorporateDetailsDomain) next).f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification2 = aVar6 != null ? aVar6.f10896d0 : null;
                                Object obj4 = linkedHashMap.get(statusIdentification2);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(statusIdentification2, obj4);
                                }
                                ((List) obj4).add(next);
                            }
                            TreeMap treeMap = new TreeMap(new H(new C0588a(15), 2));
                            treeMap.putAll(linkedHashMap);
                            ArrayList arrayList3 = new ArrayList(treeMap.size());
                            for (Map.Entry entry : treeMap.entrySet()) {
                                CorporateDetailsDomain.StatusIdentification statusIdentification3 = (CorporateDetailsDomain.StatusIdentification) entry.getKey();
                                if (statusIdentification3 == null) {
                                    statusIdentification3 = CorporateDetailsDomain.StatusIdentification.f10859f;
                                }
                                arrayList.add(new a.b(statusIdentification3));
                                Iterable iterable = (Iterable) entry.getValue();
                                ArrayList arrayList4 = new ArrayList(n.u(iterable, 10));
                                Iterator it3 = iterable.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(new a.C0118a((CorporateDetailsDomain) it3.next()));
                                }
                                arrayList3.add(Boolean.valueOf(arrayList.addAll(arrayList4)));
                            }
                            CompaniesListController companiesListController3 = companiesListFragment5.f11871r0;
                            (companiesListController3 != null ? companiesListController3 : null).setData(arrayList);
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : list) {
                                CorporateDetailsDomain.a aVar7 = ((CorporateDetailsDomain) obj5).f10804a;
                                if ((aVar7 != null ? aVar7.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                    arrayList5.add(obj5);
                                }
                            }
                            List X = s.X(arrayList5, new CompaniesListFragment.b());
                            ArrayList arrayList6 = new ArrayList(n.u(X, 10));
                            Iterator it4 = X.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(new a.C0118a((CorporateDetailsDomain) it4.next()));
                            }
                            CompaniesListController companiesListController22 = companiesListFragment5.f11871r0;
                            (companiesListController22 != null ? companiesListController22 : null).setData(arrayList6);
                        }
                        return p.f3034a;
                    case 7:
                        CompaniesListFragment companiesListFragment6 = this.f8367b;
                        companiesListFragment6.getClass();
                        U4.b.g(companiesListFragment6).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            CompaniesListFragment companiesListFragment7 = this.f8367b;
                            NavController g14 = U4.b.g(companiesListFragment7);
                            String valueOf2 = String.valueOf(intValue2);
                            g14.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putString("companyId", valueOf2);
                            bundle6.putBoolean("isEdit", true);
                            g14.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle6);
                            companiesListFragment7.T0().f8384c1.postValue(null);
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i12 = 6;
        T0().f8379X0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompaniesListFragment f8367b;

            {
                this.f8367b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                Object obj2;
                String str5;
                String str6;
                Integer num;
                switch (i12) {
                    case 0:
                        this.f8367b.getClass();
                        return p.f3034a;
                    case 1:
                        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain != null) {
                            CompaniesListFragment companiesListFragment = this.f8367b;
                            NavController g10 = U4.b.g(companiesListFragment);
                            CorporateDetailsDomain.a aVar = corporateDetailsDomain.f10804a;
                            if (aVar == null || (str = aVar.f10937z) == null) {
                                str = "";
                            }
                            if (aVar == null || (str2 = aVar.f10861A) == null) {
                                str2 = "";
                            }
                            String a10 = aVar != null ? aVar.a() : "";
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("companyName", str);
                            bundle2.putString("companyNumber", str2);
                            bundle2.putString("companyAddress", a10);
                            g10.i(R.id.action_companiesListFragment_to_companyNotApprovedFragment, bundle2);
                            companiesListFragment.T0().f8385d1.postValue(null);
                        }
                        return p.f3034a;
                    case 2:
                        CorporateDetailsDomain corporateDetailsDomain2 = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain2 != null) {
                            CompaniesListFragment companiesListFragment2 = this.f8367b;
                            NavController g11 = U4.b.g(companiesListFragment2);
                            CorporateDetailsDomain.a aVar2 = corporateDetailsDomain2.f10804a;
                            if (aVar2 == null || (str3 = aVar2.f10937z) == null) {
                                str3 = "";
                            }
                            if (aVar2 == null || (str4 = aVar2.f10861A) == null) {
                                str4 = "";
                            }
                            String a11 = aVar2 != null ? aVar2.a() : "";
                            g11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("companyName", str3);
                            bundle3.putString("companyNumber", str4);
                            bundle3.putString("companyAddress", a11);
                            g11.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle3);
                            companiesListFragment2.T0().f8386e1.postValue(null);
                        }
                        return p.f3034a;
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        CompaniesListFragment companiesListFragment3 = this.f8367b;
                        List<CorporateDetailsDomain> value = companiesListFragment3.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar3 == null || (num = aVar3.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain3 = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain3 != null) {
                                CorporateDetailsDomain.a aVar4 = corporateDetailsDomain3.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar4 != null ? aVar4.f10896d0 : null;
                                int i92 = statusIdentification == null ? -1 : CompaniesListFragment.a.f11877a[statusIdentification.ordinal()];
                                if (i92 != -1) {
                                    if (i92 == 1) {
                                        companiesListFragment3.f11870q0 = false;
                                        O9.f fVar = companiesListFragment3.s0;
                                        if (aVar4 != null) {
                                            ((K5.a) fVar.getValue()).g(F8.f.a(aVar4));
                                        }
                                        ((K5.a) fVar.getValue()).S(intValue);
                                        U4.b.g(companiesListFragment3).i(R.id.action_global_homeFragment, null);
                                    } else if (i92 == 2) {
                                        NavController g12 = U4.b.g(companiesListFragment3);
                                        if (aVar4 == null || (str5 = aVar4.f10937z) == null) {
                                            str5 = "";
                                        }
                                        if (aVar4 == null || (str6 = aVar4.f10861A) == null) {
                                            str6 = "";
                                        }
                                        String a12 = aVar4 != null ? aVar4.a() : "";
                                        g12.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("companyName", str5);
                                        bundle4.putString("companyNumber", str6);
                                        bundle4.putString("companyAddress", a12);
                                        g12.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle4);
                                        companiesListFragment3.T0().f8386e1.postValue(null);
                                    } else if (i92 != 3) {
                                        if (i92 == 4) {
                                            NavController g13 = U4.b.g(companiesListFragment3);
                                            String valueOf = String.valueOf(intValue);
                                            g13.getClass();
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putString("companyId", valueOf);
                                            bundle5.putBoolean("isEdit", true);
                                            g13.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle5);
                                            companiesListFragment3.T0().f8384c1.postValue(null);
                                        } else if (i92 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                    case 4:
                        CompaniesListFragment companiesListFragment4 = this.f8367b;
                        companiesListFragment4.f11870q0 = false;
                        U4.b.g(companiesListFragment4).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    case 5:
                        v.w(U4.b.g(this.f8367b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        return p.f3034a;
                    case 6:
                        List list = (List) obj;
                        List list2 = list;
                        CompaniesListFragment companiesListFragment5 = this.f8367b;
                        if (list2 == null || list2.isEmpty()) {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.getString(R.string.company_details));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.please_add_information_about_your_company));
                        } else {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.f11870q0 ? companiesListFragment5.getString(R.string.welcome_to_bank_business) : companiesListFragment5.getString(R.string.my_companies));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.choose_the_company_account_you_want_to_login_in));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (companiesListFragment5.f11870q0) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                CorporateDetailsDomain.a aVar5 = ((CorporateDetailsDomain) obj3).f10804a;
                                boolean z10 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b;
                                boolean z11 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10856c;
                                boolean z12 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10858e;
                                if (z10 || z11 || z12) {
                                    arrayList2.add(obj3);
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                CorporateDetailsDomain.a aVar6 = ((CorporateDetailsDomain) next).f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification2 = aVar6 != null ? aVar6.f10896d0 : null;
                                Object obj4 = linkedHashMap.get(statusIdentification2);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(statusIdentification2, obj4);
                                }
                                ((List) obj4).add(next);
                            }
                            TreeMap treeMap = new TreeMap(new H(new C0588a(15), 2));
                            treeMap.putAll(linkedHashMap);
                            ArrayList arrayList3 = new ArrayList(treeMap.size());
                            for (Map.Entry entry : treeMap.entrySet()) {
                                CorporateDetailsDomain.StatusIdentification statusIdentification3 = (CorporateDetailsDomain.StatusIdentification) entry.getKey();
                                if (statusIdentification3 == null) {
                                    statusIdentification3 = CorporateDetailsDomain.StatusIdentification.f10859f;
                                }
                                arrayList.add(new a.b(statusIdentification3));
                                Iterable iterable = (Iterable) entry.getValue();
                                ArrayList arrayList4 = new ArrayList(n.u(iterable, 10));
                                Iterator it3 = iterable.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(new a.C0118a((CorporateDetailsDomain) it3.next()));
                                }
                                arrayList3.add(Boolean.valueOf(arrayList.addAll(arrayList4)));
                            }
                            CompaniesListController companiesListController3 = companiesListFragment5.f11871r0;
                            (companiesListController3 != null ? companiesListController3 : null).setData(arrayList);
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : list) {
                                CorporateDetailsDomain.a aVar7 = ((CorporateDetailsDomain) obj5).f10804a;
                                if ((aVar7 != null ? aVar7.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                    arrayList5.add(obj5);
                                }
                            }
                            List X = s.X(arrayList5, new CompaniesListFragment.b());
                            ArrayList arrayList6 = new ArrayList(n.u(X, 10));
                            Iterator it4 = X.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(new a.C0118a((CorporateDetailsDomain) it4.next()));
                            }
                            CompaniesListController companiesListController22 = companiesListFragment5.f11871r0;
                            (companiesListController22 != null ? companiesListController22 : null).setData(arrayList6);
                        }
                        return p.f3034a;
                    case 7:
                        CompaniesListFragment companiesListFragment6 = this.f8367b;
                        companiesListFragment6.getClass();
                        U4.b.g(companiesListFragment6).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            CompaniesListFragment companiesListFragment7 = this.f8367b;
                            NavController g14 = U4.b.g(companiesListFragment7);
                            String valueOf2 = String.valueOf(intValue2);
                            g14.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putString("companyId", valueOf2);
                            bundle6.putBoolean("isEdit", true);
                            g14.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle6);
                            companiesListFragment7.T0().f8384c1.postValue(null);
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i13 = 7;
        T0().f8381Z0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompaniesListFragment f8367b;

            {
                this.f8367b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                Object obj2;
                String str5;
                String str6;
                Integer num;
                switch (i13) {
                    case 0:
                        this.f8367b.getClass();
                        return p.f3034a;
                    case 1:
                        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain != null) {
                            CompaniesListFragment companiesListFragment = this.f8367b;
                            NavController g10 = U4.b.g(companiesListFragment);
                            CorporateDetailsDomain.a aVar = corporateDetailsDomain.f10804a;
                            if (aVar == null || (str = aVar.f10937z) == null) {
                                str = "";
                            }
                            if (aVar == null || (str2 = aVar.f10861A) == null) {
                                str2 = "";
                            }
                            String a10 = aVar != null ? aVar.a() : "";
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("companyName", str);
                            bundle2.putString("companyNumber", str2);
                            bundle2.putString("companyAddress", a10);
                            g10.i(R.id.action_companiesListFragment_to_companyNotApprovedFragment, bundle2);
                            companiesListFragment.T0().f8385d1.postValue(null);
                        }
                        return p.f3034a;
                    case 2:
                        CorporateDetailsDomain corporateDetailsDomain2 = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain2 != null) {
                            CompaniesListFragment companiesListFragment2 = this.f8367b;
                            NavController g11 = U4.b.g(companiesListFragment2);
                            CorporateDetailsDomain.a aVar2 = corporateDetailsDomain2.f10804a;
                            if (aVar2 == null || (str3 = aVar2.f10937z) == null) {
                                str3 = "";
                            }
                            if (aVar2 == null || (str4 = aVar2.f10861A) == null) {
                                str4 = "";
                            }
                            String a11 = aVar2 != null ? aVar2.a() : "";
                            g11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("companyName", str3);
                            bundle3.putString("companyNumber", str4);
                            bundle3.putString("companyAddress", a11);
                            g11.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle3);
                            companiesListFragment2.T0().f8386e1.postValue(null);
                        }
                        return p.f3034a;
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        CompaniesListFragment companiesListFragment3 = this.f8367b;
                        List<CorporateDetailsDomain> value = companiesListFragment3.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar3 == null || (num = aVar3.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain3 = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain3 != null) {
                                CorporateDetailsDomain.a aVar4 = corporateDetailsDomain3.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar4 != null ? aVar4.f10896d0 : null;
                                int i92 = statusIdentification == null ? -1 : CompaniesListFragment.a.f11877a[statusIdentification.ordinal()];
                                if (i92 != -1) {
                                    if (i92 == 1) {
                                        companiesListFragment3.f11870q0 = false;
                                        O9.f fVar = companiesListFragment3.s0;
                                        if (aVar4 != null) {
                                            ((K5.a) fVar.getValue()).g(F8.f.a(aVar4));
                                        }
                                        ((K5.a) fVar.getValue()).S(intValue);
                                        U4.b.g(companiesListFragment3).i(R.id.action_global_homeFragment, null);
                                    } else if (i92 == 2) {
                                        NavController g12 = U4.b.g(companiesListFragment3);
                                        if (aVar4 == null || (str5 = aVar4.f10937z) == null) {
                                            str5 = "";
                                        }
                                        if (aVar4 == null || (str6 = aVar4.f10861A) == null) {
                                            str6 = "";
                                        }
                                        String a12 = aVar4 != null ? aVar4.a() : "";
                                        g12.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("companyName", str5);
                                        bundle4.putString("companyNumber", str6);
                                        bundle4.putString("companyAddress", a12);
                                        g12.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle4);
                                        companiesListFragment3.T0().f8386e1.postValue(null);
                                    } else if (i92 != 3) {
                                        if (i92 == 4) {
                                            NavController g13 = U4.b.g(companiesListFragment3);
                                            String valueOf = String.valueOf(intValue);
                                            g13.getClass();
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putString("companyId", valueOf);
                                            bundle5.putBoolean("isEdit", true);
                                            g13.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle5);
                                            companiesListFragment3.T0().f8384c1.postValue(null);
                                        } else if (i92 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                    case 4:
                        CompaniesListFragment companiesListFragment4 = this.f8367b;
                        companiesListFragment4.f11870q0 = false;
                        U4.b.g(companiesListFragment4).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    case 5:
                        v.w(U4.b.g(this.f8367b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        return p.f3034a;
                    case 6:
                        List list = (List) obj;
                        List list2 = list;
                        CompaniesListFragment companiesListFragment5 = this.f8367b;
                        if (list2 == null || list2.isEmpty()) {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.getString(R.string.company_details));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.please_add_information_about_your_company));
                        } else {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.f11870q0 ? companiesListFragment5.getString(R.string.welcome_to_bank_business) : companiesListFragment5.getString(R.string.my_companies));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.choose_the_company_account_you_want_to_login_in));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (companiesListFragment5.f11870q0) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                CorporateDetailsDomain.a aVar5 = ((CorporateDetailsDomain) obj3).f10804a;
                                boolean z10 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b;
                                boolean z11 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10856c;
                                boolean z12 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10858e;
                                if (z10 || z11 || z12) {
                                    arrayList2.add(obj3);
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                CorporateDetailsDomain.a aVar6 = ((CorporateDetailsDomain) next).f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification2 = aVar6 != null ? aVar6.f10896d0 : null;
                                Object obj4 = linkedHashMap.get(statusIdentification2);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(statusIdentification2, obj4);
                                }
                                ((List) obj4).add(next);
                            }
                            TreeMap treeMap = new TreeMap(new H(new C0588a(15), 2));
                            treeMap.putAll(linkedHashMap);
                            ArrayList arrayList3 = new ArrayList(treeMap.size());
                            for (Map.Entry entry : treeMap.entrySet()) {
                                CorporateDetailsDomain.StatusIdentification statusIdentification3 = (CorporateDetailsDomain.StatusIdentification) entry.getKey();
                                if (statusIdentification3 == null) {
                                    statusIdentification3 = CorporateDetailsDomain.StatusIdentification.f10859f;
                                }
                                arrayList.add(new a.b(statusIdentification3));
                                Iterable iterable = (Iterable) entry.getValue();
                                ArrayList arrayList4 = new ArrayList(n.u(iterable, 10));
                                Iterator it3 = iterable.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(new a.C0118a((CorporateDetailsDomain) it3.next()));
                                }
                                arrayList3.add(Boolean.valueOf(arrayList.addAll(arrayList4)));
                            }
                            CompaniesListController companiesListController3 = companiesListFragment5.f11871r0;
                            (companiesListController3 != null ? companiesListController3 : null).setData(arrayList);
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : list) {
                                CorporateDetailsDomain.a aVar7 = ((CorporateDetailsDomain) obj5).f10804a;
                                if ((aVar7 != null ? aVar7.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                    arrayList5.add(obj5);
                                }
                            }
                            List X = s.X(arrayList5, new CompaniesListFragment.b());
                            ArrayList arrayList6 = new ArrayList(n.u(X, 10));
                            Iterator it4 = X.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(new a.C0118a((CorporateDetailsDomain) it4.next()));
                            }
                            CompaniesListController companiesListController22 = companiesListFragment5.f11871r0;
                            (companiesListController22 != null ? companiesListController22 : null).setData(arrayList6);
                        }
                        return p.f3034a;
                    case 7:
                        CompaniesListFragment companiesListFragment6 = this.f8367b;
                        companiesListFragment6.getClass();
                        U4.b.g(companiesListFragment6).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            CompaniesListFragment companiesListFragment7 = this.f8367b;
                            NavController g14 = U4.b.g(companiesListFragment7);
                            String valueOf2 = String.valueOf(intValue2);
                            g14.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putString("companyId", valueOf2);
                            bundle6.putBoolean("isEdit", true);
                            g14.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle6);
                            companiesListFragment7.T0().f8384c1.postValue(null);
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i14 = 8;
        T0().f8384c1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompaniesListFragment f8367b;

            {
                this.f8367b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                Object obj2;
                String str5;
                String str6;
                Integer num;
                switch (i14) {
                    case 0:
                        this.f8367b.getClass();
                        return p.f3034a;
                    case 1:
                        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain != null) {
                            CompaniesListFragment companiesListFragment = this.f8367b;
                            NavController g10 = U4.b.g(companiesListFragment);
                            CorporateDetailsDomain.a aVar = corporateDetailsDomain.f10804a;
                            if (aVar == null || (str = aVar.f10937z) == null) {
                                str = "";
                            }
                            if (aVar == null || (str2 = aVar.f10861A) == null) {
                                str2 = "";
                            }
                            String a10 = aVar != null ? aVar.a() : "";
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("companyName", str);
                            bundle2.putString("companyNumber", str2);
                            bundle2.putString("companyAddress", a10);
                            g10.i(R.id.action_companiesListFragment_to_companyNotApprovedFragment, bundle2);
                            companiesListFragment.T0().f8385d1.postValue(null);
                        }
                        return p.f3034a;
                    case 2:
                        CorporateDetailsDomain corporateDetailsDomain2 = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain2 != null) {
                            CompaniesListFragment companiesListFragment2 = this.f8367b;
                            NavController g11 = U4.b.g(companiesListFragment2);
                            CorporateDetailsDomain.a aVar2 = corporateDetailsDomain2.f10804a;
                            if (aVar2 == null || (str3 = aVar2.f10937z) == null) {
                                str3 = "";
                            }
                            if (aVar2 == null || (str4 = aVar2.f10861A) == null) {
                                str4 = "";
                            }
                            String a11 = aVar2 != null ? aVar2.a() : "";
                            g11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("companyName", str3);
                            bundle3.putString("companyNumber", str4);
                            bundle3.putString("companyAddress", a11);
                            g11.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle3);
                            companiesListFragment2.T0().f8386e1.postValue(null);
                        }
                        return p.f3034a;
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        CompaniesListFragment companiesListFragment3 = this.f8367b;
                        List<CorporateDetailsDomain> value = companiesListFragment3.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar3 == null || (num = aVar3.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain3 = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain3 != null) {
                                CorporateDetailsDomain.a aVar4 = corporateDetailsDomain3.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar4 != null ? aVar4.f10896d0 : null;
                                int i92 = statusIdentification == null ? -1 : CompaniesListFragment.a.f11877a[statusIdentification.ordinal()];
                                if (i92 != -1) {
                                    if (i92 == 1) {
                                        companiesListFragment3.f11870q0 = false;
                                        O9.f fVar = companiesListFragment3.s0;
                                        if (aVar4 != null) {
                                            ((K5.a) fVar.getValue()).g(F8.f.a(aVar4));
                                        }
                                        ((K5.a) fVar.getValue()).S(intValue);
                                        U4.b.g(companiesListFragment3).i(R.id.action_global_homeFragment, null);
                                    } else if (i92 == 2) {
                                        NavController g12 = U4.b.g(companiesListFragment3);
                                        if (aVar4 == null || (str5 = aVar4.f10937z) == null) {
                                            str5 = "";
                                        }
                                        if (aVar4 == null || (str6 = aVar4.f10861A) == null) {
                                            str6 = "";
                                        }
                                        String a12 = aVar4 != null ? aVar4.a() : "";
                                        g12.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("companyName", str5);
                                        bundle4.putString("companyNumber", str6);
                                        bundle4.putString("companyAddress", a12);
                                        g12.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle4);
                                        companiesListFragment3.T0().f8386e1.postValue(null);
                                    } else if (i92 != 3) {
                                        if (i92 == 4) {
                                            NavController g13 = U4.b.g(companiesListFragment3);
                                            String valueOf = String.valueOf(intValue);
                                            g13.getClass();
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putString("companyId", valueOf);
                                            bundle5.putBoolean("isEdit", true);
                                            g13.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle5);
                                            companiesListFragment3.T0().f8384c1.postValue(null);
                                        } else if (i92 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                    case 4:
                        CompaniesListFragment companiesListFragment4 = this.f8367b;
                        companiesListFragment4.f11870q0 = false;
                        U4.b.g(companiesListFragment4).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    case 5:
                        v.w(U4.b.g(this.f8367b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        return p.f3034a;
                    case 6:
                        List list = (List) obj;
                        List list2 = list;
                        CompaniesListFragment companiesListFragment5 = this.f8367b;
                        if (list2 == null || list2.isEmpty()) {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.getString(R.string.company_details));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.please_add_information_about_your_company));
                        } else {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.f11870q0 ? companiesListFragment5.getString(R.string.welcome_to_bank_business) : companiesListFragment5.getString(R.string.my_companies));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.choose_the_company_account_you_want_to_login_in));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (companiesListFragment5.f11870q0) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                CorporateDetailsDomain.a aVar5 = ((CorporateDetailsDomain) obj3).f10804a;
                                boolean z10 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b;
                                boolean z11 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10856c;
                                boolean z12 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10858e;
                                if (z10 || z11 || z12) {
                                    arrayList2.add(obj3);
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                CorporateDetailsDomain.a aVar6 = ((CorporateDetailsDomain) next).f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification2 = aVar6 != null ? aVar6.f10896d0 : null;
                                Object obj4 = linkedHashMap.get(statusIdentification2);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(statusIdentification2, obj4);
                                }
                                ((List) obj4).add(next);
                            }
                            TreeMap treeMap = new TreeMap(new H(new C0588a(15), 2));
                            treeMap.putAll(linkedHashMap);
                            ArrayList arrayList3 = new ArrayList(treeMap.size());
                            for (Map.Entry entry : treeMap.entrySet()) {
                                CorporateDetailsDomain.StatusIdentification statusIdentification3 = (CorporateDetailsDomain.StatusIdentification) entry.getKey();
                                if (statusIdentification3 == null) {
                                    statusIdentification3 = CorporateDetailsDomain.StatusIdentification.f10859f;
                                }
                                arrayList.add(new a.b(statusIdentification3));
                                Iterable iterable = (Iterable) entry.getValue();
                                ArrayList arrayList4 = new ArrayList(n.u(iterable, 10));
                                Iterator it3 = iterable.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(new a.C0118a((CorporateDetailsDomain) it3.next()));
                                }
                                arrayList3.add(Boolean.valueOf(arrayList.addAll(arrayList4)));
                            }
                            CompaniesListController companiesListController3 = companiesListFragment5.f11871r0;
                            (companiesListController3 != null ? companiesListController3 : null).setData(arrayList);
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : list) {
                                CorporateDetailsDomain.a aVar7 = ((CorporateDetailsDomain) obj5).f10804a;
                                if ((aVar7 != null ? aVar7.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                    arrayList5.add(obj5);
                                }
                            }
                            List X = s.X(arrayList5, new CompaniesListFragment.b());
                            ArrayList arrayList6 = new ArrayList(n.u(X, 10));
                            Iterator it4 = X.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(new a.C0118a((CorporateDetailsDomain) it4.next()));
                            }
                            CompaniesListController companiesListController22 = companiesListFragment5.f11871r0;
                            (companiesListController22 != null ? companiesListController22 : null).setData(arrayList6);
                        }
                        return p.f3034a;
                    case 7:
                        CompaniesListFragment companiesListFragment6 = this.f8367b;
                        companiesListFragment6.getClass();
                        U4.b.g(companiesListFragment6).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            CompaniesListFragment companiesListFragment7 = this.f8367b;
                            NavController g14 = U4.b.g(companiesListFragment7);
                            String valueOf2 = String.valueOf(intValue2);
                            g14.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putString("companyId", valueOf2);
                            bundle6.putBoolean("isEdit", true);
                            g14.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle6);
                            companiesListFragment7.T0().f8384c1.postValue(null);
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i15 = 1;
        T0().f8385d1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompaniesListFragment f8367b;

            {
                this.f8367b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                Object obj2;
                String str5;
                String str6;
                Integer num;
                switch (i15) {
                    case 0:
                        this.f8367b.getClass();
                        return p.f3034a;
                    case 1:
                        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain != null) {
                            CompaniesListFragment companiesListFragment = this.f8367b;
                            NavController g10 = U4.b.g(companiesListFragment);
                            CorporateDetailsDomain.a aVar = corporateDetailsDomain.f10804a;
                            if (aVar == null || (str = aVar.f10937z) == null) {
                                str = "";
                            }
                            if (aVar == null || (str2 = aVar.f10861A) == null) {
                                str2 = "";
                            }
                            String a10 = aVar != null ? aVar.a() : "";
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("companyName", str);
                            bundle2.putString("companyNumber", str2);
                            bundle2.putString("companyAddress", a10);
                            g10.i(R.id.action_companiesListFragment_to_companyNotApprovedFragment, bundle2);
                            companiesListFragment.T0().f8385d1.postValue(null);
                        }
                        return p.f3034a;
                    case 2:
                        CorporateDetailsDomain corporateDetailsDomain2 = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain2 != null) {
                            CompaniesListFragment companiesListFragment2 = this.f8367b;
                            NavController g11 = U4.b.g(companiesListFragment2);
                            CorporateDetailsDomain.a aVar2 = corporateDetailsDomain2.f10804a;
                            if (aVar2 == null || (str3 = aVar2.f10937z) == null) {
                                str3 = "";
                            }
                            if (aVar2 == null || (str4 = aVar2.f10861A) == null) {
                                str4 = "";
                            }
                            String a11 = aVar2 != null ? aVar2.a() : "";
                            g11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("companyName", str3);
                            bundle3.putString("companyNumber", str4);
                            bundle3.putString("companyAddress", a11);
                            g11.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle3);
                            companiesListFragment2.T0().f8386e1.postValue(null);
                        }
                        return p.f3034a;
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        CompaniesListFragment companiesListFragment3 = this.f8367b;
                        List<CorporateDetailsDomain> value = companiesListFragment3.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar3 == null || (num = aVar3.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain3 = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain3 != null) {
                                CorporateDetailsDomain.a aVar4 = corporateDetailsDomain3.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar4 != null ? aVar4.f10896d0 : null;
                                int i92 = statusIdentification == null ? -1 : CompaniesListFragment.a.f11877a[statusIdentification.ordinal()];
                                if (i92 != -1) {
                                    if (i92 == 1) {
                                        companiesListFragment3.f11870q0 = false;
                                        O9.f fVar = companiesListFragment3.s0;
                                        if (aVar4 != null) {
                                            ((K5.a) fVar.getValue()).g(F8.f.a(aVar4));
                                        }
                                        ((K5.a) fVar.getValue()).S(intValue);
                                        U4.b.g(companiesListFragment3).i(R.id.action_global_homeFragment, null);
                                    } else if (i92 == 2) {
                                        NavController g12 = U4.b.g(companiesListFragment3);
                                        if (aVar4 == null || (str5 = aVar4.f10937z) == null) {
                                            str5 = "";
                                        }
                                        if (aVar4 == null || (str6 = aVar4.f10861A) == null) {
                                            str6 = "";
                                        }
                                        String a12 = aVar4 != null ? aVar4.a() : "";
                                        g12.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("companyName", str5);
                                        bundle4.putString("companyNumber", str6);
                                        bundle4.putString("companyAddress", a12);
                                        g12.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle4);
                                        companiesListFragment3.T0().f8386e1.postValue(null);
                                    } else if (i92 != 3) {
                                        if (i92 == 4) {
                                            NavController g13 = U4.b.g(companiesListFragment3);
                                            String valueOf = String.valueOf(intValue);
                                            g13.getClass();
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putString("companyId", valueOf);
                                            bundle5.putBoolean("isEdit", true);
                                            g13.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle5);
                                            companiesListFragment3.T0().f8384c1.postValue(null);
                                        } else if (i92 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                    case 4:
                        CompaniesListFragment companiesListFragment4 = this.f8367b;
                        companiesListFragment4.f11870q0 = false;
                        U4.b.g(companiesListFragment4).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    case 5:
                        v.w(U4.b.g(this.f8367b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        return p.f3034a;
                    case 6:
                        List list = (List) obj;
                        List list2 = list;
                        CompaniesListFragment companiesListFragment5 = this.f8367b;
                        if (list2 == null || list2.isEmpty()) {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.getString(R.string.company_details));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.please_add_information_about_your_company));
                        } else {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.f11870q0 ? companiesListFragment5.getString(R.string.welcome_to_bank_business) : companiesListFragment5.getString(R.string.my_companies));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.choose_the_company_account_you_want_to_login_in));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (companiesListFragment5.f11870q0) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                CorporateDetailsDomain.a aVar5 = ((CorporateDetailsDomain) obj3).f10804a;
                                boolean z10 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b;
                                boolean z11 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10856c;
                                boolean z12 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10858e;
                                if (z10 || z11 || z12) {
                                    arrayList2.add(obj3);
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                CorporateDetailsDomain.a aVar6 = ((CorporateDetailsDomain) next).f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification2 = aVar6 != null ? aVar6.f10896d0 : null;
                                Object obj4 = linkedHashMap.get(statusIdentification2);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(statusIdentification2, obj4);
                                }
                                ((List) obj4).add(next);
                            }
                            TreeMap treeMap = new TreeMap(new H(new C0588a(15), 2));
                            treeMap.putAll(linkedHashMap);
                            ArrayList arrayList3 = new ArrayList(treeMap.size());
                            for (Map.Entry entry : treeMap.entrySet()) {
                                CorporateDetailsDomain.StatusIdentification statusIdentification3 = (CorporateDetailsDomain.StatusIdentification) entry.getKey();
                                if (statusIdentification3 == null) {
                                    statusIdentification3 = CorporateDetailsDomain.StatusIdentification.f10859f;
                                }
                                arrayList.add(new a.b(statusIdentification3));
                                Iterable iterable = (Iterable) entry.getValue();
                                ArrayList arrayList4 = new ArrayList(n.u(iterable, 10));
                                Iterator it3 = iterable.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(new a.C0118a((CorporateDetailsDomain) it3.next()));
                                }
                                arrayList3.add(Boolean.valueOf(arrayList.addAll(arrayList4)));
                            }
                            CompaniesListController companiesListController3 = companiesListFragment5.f11871r0;
                            (companiesListController3 != null ? companiesListController3 : null).setData(arrayList);
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : list) {
                                CorporateDetailsDomain.a aVar7 = ((CorporateDetailsDomain) obj5).f10804a;
                                if ((aVar7 != null ? aVar7.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                    arrayList5.add(obj5);
                                }
                            }
                            List X = s.X(arrayList5, new CompaniesListFragment.b());
                            ArrayList arrayList6 = new ArrayList(n.u(X, 10));
                            Iterator it4 = X.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(new a.C0118a((CorporateDetailsDomain) it4.next()));
                            }
                            CompaniesListController companiesListController22 = companiesListFragment5.f11871r0;
                            (companiesListController22 != null ? companiesListController22 : null).setData(arrayList6);
                        }
                        return p.f3034a;
                    case 7:
                        CompaniesListFragment companiesListFragment6 = this.f8367b;
                        companiesListFragment6.getClass();
                        U4.b.g(companiesListFragment6).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            CompaniesListFragment companiesListFragment7 = this.f8367b;
                            NavController g14 = U4.b.g(companiesListFragment7);
                            String valueOf2 = String.valueOf(intValue2);
                            g14.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putString("companyId", valueOf2);
                            bundle6.putBoolean("isEdit", true);
                            g14.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle6);
                            companiesListFragment7.T0().f8384c1.postValue(null);
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i16 = 2;
        T0().f8386e1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompaniesListFragment f8367b;

            {
                this.f8367b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                Object obj2;
                String str5;
                String str6;
                Integer num;
                switch (i16) {
                    case 0:
                        this.f8367b.getClass();
                        return p.f3034a;
                    case 1:
                        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain != null) {
                            CompaniesListFragment companiesListFragment = this.f8367b;
                            NavController g10 = U4.b.g(companiesListFragment);
                            CorporateDetailsDomain.a aVar = corporateDetailsDomain.f10804a;
                            if (aVar == null || (str = aVar.f10937z) == null) {
                                str = "";
                            }
                            if (aVar == null || (str2 = aVar.f10861A) == null) {
                                str2 = "";
                            }
                            String a10 = aVar != null ? aVar.a() : "";
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("companyName", str);
                            bundle2.putString("companyNumber", str2);
                            bundle2.putString("companyAddress", a10);
                            g10.i(R.id.action_companiesListFragment_to_companyNotApprovedFragment, bundle2);
                            companiesListFragment.T0().f8385d1.postValue(null);
                        }
                        return p.f3034a;
                    case 2:
                        CorporateDetailsDomain corporateDetailsDomain2 = (CorporateDetailsDomain) obj;
                        if (corporateDetailsDomain2 != null) {
                            CompaniesListFragment companiesListFragment2 = this.f8367b;
                            NavController g11 = U4.b.g(companiesListFragment2);
                            CorporateDetailsDomain.a aVar2 = corporateDetailsDomain2.f10804a;
                            if (aVar2 == null || (str3 = aVar2.f10937z) == null) {
                                str3 = "";
                            }
                            if (aVar2 == null || (str4 = aVar2.f10861A) == null) {
                                str4 = "";
                            }
                            String a11 = aVar2 != null ? aVar2.a() : "";
                            g11.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("companyName", str3);
                            bundle3.putString("companyNumber", str4);
                            bundle3.putString("companyAddress", a11);
                            g11.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle3);
                            companiesListFragment2.T0().f8386e1.postValue(null);
                        }
                        return p.f3034a;
                    case 3:
                        int intValue = ((Integer) obj).intValue();
                        CompaniesListFragment companiesListFragment3 = this.f8367b;
                        List<CorporateDetailsDomain> value = companiesListFragment3.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar3 == null || (num = aVar3.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain3 = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain3 != null) {
                                CorporateDetailsDomain.a aVar4 = corporateDetailsDomain3.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar4 != null ? aVar4.f10896d0 : null;
                                int i92 = statusIdentification == null ? -1 : CompaniesListFragment.a.f11877a[statusIdentification.ordinal()];
                                if (i92 != -1) {
                                    if (i92 == 1) {
                                        companiesListFragment3.f11870q0 = false;
                                        O9.f fVar = companiesListFragment3.s0;
                                        if (aVar4 != null) {
                                            ((K5.a) fVar.getValue()).g(F8.f.a(aVar4));
                                        }
                                        ((K5.a) fVar.getValue()).S(intValue);
                                        U4.b.g(companiesListFragment3).i(R.id.action_global_homeFragment, null);
                                    } else if (i92 == 2) {
                                        NavController g12 = U4.b.g(companiesListFragment3);
                                        if (aVar4 == null || (str5 = aVar4.f10937z) == null) {
                                            str5 = "";
                                        }
                                        if (aVar4 == null || (str6 = aVar4.f10861A) == null) {
                                            str6 = "";
                                        }
                                        String a12 = aVar4 != null ? aVar4.a() : "";
                                        g12.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putString("companyName", str5);
                                        bundle4.putString("companyNumber", str6);
                                        bundle4.putString("companyAddress", a12);
                                        g12.i(R.id.action_companiesListFragment_to_companyUnderReviewFragment, bundle4);
                                        companiesListFragment3.T0().f8386e1.postValue(null);
                                    } else if (i92 != 3) {
                                        if (i92 == 4) {
                                            NavController g13 = U4.b.g(companiesListFragment3);
                                            String valueOf = String.valueOf(intValue);
                                            g13.getClass();
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putString("companyId", valueOf);
                                            bundle5.putBoolean("isEdit", true);
                                            g13.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle5);
                                            companiesListFragment3.T0().f8384c1.postValue(null);
                                        } else if (i92 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                    case 4:
                        CompaniesListFragment companiesListFragment4 = this.f8367b;
                        companiesListFragment4.f11870q0 = false;
                        U4.b.g(companiesListFragment4).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    case 5:
                        v.w(U4.b.g(this.f8367b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        return p.f3034a;
                    case 6:
                        List list = (List) obj;
                        List list2 = list;
                        CompaniesListFragment companiesListFragment5 = this.f8367b;
                        if (list2 == null || list2.isEmpty()) {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.getString(R.string.company_details));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.please_add_information_about_your_company));
                        } else {
                            companiesListFragment5.u0().f28958s.setText(companiesListFragment5.f11870q0 ? companiesListFragment5.getString(R.string.welcome_to_bank_business) : companiesListFragment5.getString(R.string.my_companies));
                            companiesListFragment5.u0().f28956q.setText(companiesListFragment5.getString(R.string.choose_the_company_account_you_want_to_login_in));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (companiesListFragment5.f11870q0) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                CorporateDetailsDomain.a aVar5 = ((CorporateDetailsDomain) obj3).f10804a;
                                boolean z10 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b;
                                boolean z11 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10856c;
                                boolean z12 = (aVar5 != null ? aVar5.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10858e;
                                if (z10 || z11 || z12) {
                                    arrayList2.add(obj3);
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                CorporateDetailsDomain.a aVar6 = ((CorporateDetailsDomain) next).f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification2 = aVar6 != null ? aVar6.f10896d0 : null;
                                Object obj4 = linkedHashMap.get(statusIdentification2);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(statusIdentification2, obj4);
                                }
                                ((List) obj4).add(next);
                            }
                            TreeMap treeMap = new TreeMap(new H(new C0588a(15), 2));
                            treeMap.putAll(linkedHashMap);
                            ArrayList arrayList3 = new ArrayList(treeMap.size());
                            for (Map.Entry entry : treeMap.entrySet()) {
                                CorporateDetailsDomain.StatusIdentification statusIdentification3 = (CorporateDetailsDomain.StatusIdentification) entry.getKey();
                                if (statusIdentification3 == null) {
                                    statusIdentification3 = CorporateDetailsDomain.StatusIdentification.f10859f;
                                }
                                arrayList.add(new a.b(statusIdentification3));
                                Iterable iterable = (Iterable) entry.getValue();
                                ArrayList arrayList4 = new ArrayList(n.u(iterable, 10));
                                Iterator it3 = iterable.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(new a.C0118a((CorporateDetailsDomain) it3.next()));
                                }
                                arrayList3.add(Boolean.valueOf(arrayList.addAll(arrayList4)));
                            }
                            CompaniesListController companiesListController3 = companiesListFragment5.f11871r0;
                            (companiesListController3 != null ? companiesListController3 : null).setData(arrayList);
                        } else {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : list) {
                                CorporateDetailsDomain.a aVar7 = ((CorporateDetailsDomain) obj5).f10804a;
                                if ((aVar7 != null ? aVar7.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                    arrayList5.add(obj5);
                                }
                            }
                            List X = s.X(arrayList5, new CompaniesListFragment.b());
                            ArrayList arrayList6 = new ArrayList(n.u(X, 10));
                            Iterator it4 = X.iterator();
                            while (it4.hasNext()) {
                                arrayList6.add(new a.C0118a((CorporateDetailsDomain) it4.next()));
                            }
                            CompaniesListController companiesListController22 = companiesListFragment5.f11871r0;
                            (companiesListController22 != null ? companiesListController22 : null).setData(arrayList6);
                        }
                        return p.f3034a;
                    case 7:
                        CompaniesListFragment companiesListFragment6 = this.f8367b;
                        companiesListFragment6.getClass();
                        U4.b.g(companiesListFragment6).i(R.id.action_global_homeFragment, null);
                        return p.f3034a;
                    default:
                        Integer num2 = (Integer) obj;
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            CompaniesListFragment companiesListFragment7 = this.f8367b;
                            NavController g14 = U4.b.g(companiesListFragment7);
                            String valueOf2 = String.valueOf(intValue2);
                            g14.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putString("companyId", valueOf2);
                            bundle6.putBoolean("isEdit", true);
                            g14.i(R.id.action_companiesListFragment_to_additionalInformationFragment, bundle6);
                            companiesListFragment7.T0().f8384c1.postValue(null);
                        }
                        return p.f3034a;
                }
            }
        }));
        o.c(u0().f28954o, 500L, new C0603b(this, 2));
        o.c(u0().f28953n, 500L, new C0603b(this, 3));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11867n0;
    }
}
