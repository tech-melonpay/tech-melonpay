package com.luminary.business.presentation.ui.fragments.company.list;

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
import b7.C0606e;
import b7.C0608g;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.company.list.CompaniesListController;
import com.luminary.business.presentation.ui.fragments.company.list.MyCompaniesFragment;
import com.luminary.business.presentation.ui.fragments.company.list.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h;
import t6.AbstractC1421q4;

/* compiled from: MyCompaniesFragment.kt */
/* loaded from: classes2.dex */
public final class MyCompaniesFragment extends BaseFragment<AbstractC1421q4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11879n0 = R.layout.fragment_my_companies;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11880o0;

    /* renamed from: p0, reason: collision with root package name */
    public CompaniesListController f11881p0;

    /* renamed from: q0, reason: collision with root package name */
    public final f f11882q0;

    /* compiled from: MyCompaniesFragment.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11888a;

        static {
            int[] iArr = new int[CorporateDetailsDomain.StatusIdentification.values().length];
            try {
                CorporateDetailsDomain.StatusIdentification.a aVar = CorporateDetailsDomain.StatusIdentification.f10854a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f11888a = iArr;
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

    /* compiled from: MyCompaniesFragment.kt */
    public static final class c implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11889a;

        public c(InterfaceC0646l interfaceC0646l) {
            this.f11889a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11889a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11889a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.company.list.MyCompaniesFragment$special$$inlined$viewModel$default$1] */
    public MyCompaniesFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.company.list.MyCompaniesFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11880o0 = E.a(this, h.a(C0606e.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.company.list.MyCompaniesFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.company.list.MyCompaniesFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C0606e.class), null, null, b.l(this));
            }
        });
        this.f11882q0 = kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<K5.a>() { // from class: com.luminary.business.presentation.ui.fragments.company.list.MyCompaniesFragment$special$$inlined$inject$default$1
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
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.my_companies);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13263a = getString(R.string.my_companies);
        return toolbarStatus;
    }

    public final C0606e T0() {
        return (C0606e) this.f11880o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        T0().m(false);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        T0().f426S0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyCompaniesFragment f8388b;

            {
                this.f8388b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                Integer num;
                switch (i) {
                    case 0:
                        this.f8388b.getClass();
                        break;
                    case 1:
                        int intValue = ((Integer) obj).intValue();
                        MyCompaniesFragment myCompaniesFragment = this.f8388b;
                        List<CorporateDetailsDomain> value = myCompaniesFragment.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar == null || (num = aVar.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain != null) {
                                CorporateDetailsDomain.a aVar2 = corporateDetailsDomain.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar2 != null ? aVar2.f10896d0 : null;
                                if (statusIdentification != null && MyCompaniesFragment.a.f11888a[statusIdentification.ordinal()] == 1) {
                                    O9.f fVar = myCompaniesFragment.f11882q0;
                                    ((K5.a) fVar.getValue()).S(intValue);
                                    if (aVar2 != null) {
                                        ((K5.a) fVar.getValue()).g(F8.f.a(aVar2));
                                    }
                                    U4.b.g(myCompaniesFragment).i(R.id.action_global_homeFragment, null);
                                }
                            }
                        }
                        break;
                    case 2:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj3).f10804a;
                            if ((aVar3 != null ? aVar3.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                arrayList2.add(obj3);
                            }
                        }
                        List<CorporateDetailsDomain> X = s.X(arrayList2, new MyCompaniesFragment.b());
                        ArrayList arrayList3 = new ArrayList(n.u(X, 10));
                        int i9 = 0;
                        for (CorporateDetailsDomain corporateDetailsDomain2 : X) {
                            i9++;
                            arrayList.add(new a.C0118a(new CorporateDetailsDomain(corporateDetailsDomain2.f10804a, corporateDetailsDomain2.f10805b, corporateDetailsDomain2.f10806c, corporateDetailsDomain2.f10807d, String.valueOf(i9), corporateDetailsDomain2.f10809f, corporateDetailsDomain2.f10810g, corporateDetailsDomain2.f10811h)));
                            arrayList3.add(new a.C0118a(corporateDetailsDomain2));
                        }
                        CompaniesListController companiesListController = this.f8388b.f11881p0;
                        (companiesListController == null ? null : companiesListController).setData(arrayList3);
                        break;
                    case 3:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    case 4:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    default:
                        v.w(U4.b.g(this.f8388b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i9 = 1;
        this.f11881p0 = new CompaniesListController(requireContext(), new InterfaceC0646l(this) { // from class: b7.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyCompaniesFragment f8388b;

            {
                this.f8388b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                Integer num;
                switch (i9) {
                    case 0:
                        this.f8388b.getClass();
                        break;
                    case 1:
                        int intValue = ((Integer) obj).intValue();
                        MyCompaniesFragment myCompaniesFragment = this.f8388b;
                        List<CorporateDetailsDomain> value = myCompaniesFragment.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar == null || (num = aVar.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain != null) {
                                CorporateDetailsDomain.a aVar2 = corporateDetailsDomain.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar2 != null ? aVar2.f10896d0 : null;
                                if (statusIdentification != null && MyCompaniesFragment.a.f11888a[statusIdentification.ordinal()] == 1) {
                                    O9.f fVar = myCompaniesFragment.f11882q0;
                                    ((K5.a) fVar.getValue()).S(intValue);
                                    if (aVar2 != null) {
                                        ((K5.a) fVar.getValue()).g(F8.f.a(aVar2));
                                    }
                                    U4.b.g(myCompaniesFragment).i(R.id.action_global_homeFragment, null);
                                }
                            }
                        }
                        break;
                    case 2:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj3).f10804a;
                            if ((aVar3 != null ? aVar3.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                arrayList2.add(obj3);
                            }
                        }
                        List<CorporateDetailsDomain> X = s.X(arrayList2, new MyCompaniesFragment.b());
                        ArrayList arrayList3 = new ArrayList(n.u(X, 10));
                        int i92 = 0;
                        for (CorporateDetailsDomain corporateDetailsDomain2 : X) {
                            i92++;
                            arrayList.add(new a.C0118a(new CorporateDetailsDomain(corporateDetailsDomain2.f10804a, corporateDetailsDomain2.f10805b, corporateDetailsDomain2.f10806c, corporateDetailsDomain2.f10807d, String.valueOf(i92), corporateDetailsDomain2.f10809f, corporateDetailsDomain2.f10810g, corporateDetailsDomain2.f10811h)));
                            arrayList3.add(new a.C0118a(corporateDetailsDomain2));
                        }
                        CompaniesListController companiesListController = this.f8388b.f11881p0;
                        (companiesListController == null ? null : companiesListController).setData(arrayList3);
                        break;
                    case 3:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    case 4:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    default:
                        v.w(U4.b.g(this.f8388b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1421q4 u02 = u0();
        CompaniesListController companiesListController = this.f11881p0;
        if (companiesListController == null) {
            companiesListController = null;
        }
        u02.f29515o.setAdapter(companiesListController.getAdapter());
        final int i10 = 2;
        T0().f8379X0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyCompaniesFragment f8388b;

            {
                this.f8388b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                Integer num;
                switch (i10) {
                    case 0:
                        this.f8388b.getClass();
                        break;
                    case 1:
                        int intValue = ((Integer) obj).intValue();
                        MyCompaniesFragment myCompaniesFragment = this.f8388b;
                        List<CorporateDetailsDomain> value = myCompaniesFragment.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar == null || (num = aVar.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain != null) {
                                CorporateDetailsDomain.a aVar2 = corporateDetailsDomain.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar2 != null ? aVar2.f10896d0 : null;
                                if (statusIdentification != null && MyCompaniesFragment.a.f11888a[statusIdentification.ordinal()] == 1) {
                                    O9.f fVar = myCompaniesFragment.f11882q0;
                                    ((K5.a) fVar.getValue()).S(intValue);
                                    if (aVar2 != null) {
                                        ((K5.a) fVar.getValue()).g(F8.f.a(aVar2));
                                    }
                                    U4.b.g(myCompaniesFragment).i(R.id.action_global_homeFragment, null);
                                }
                            }
                        }
                        break;
                    case 2:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj3).f10804a;
                            if ((aVar3 != null ? aVar3.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                arrayList2.add(obj3);
                            }
                        }
                        List<CorporateDetailsDomain> X = s.X(arrayList2, new MyCompaniesFragment.b());
                        ArrayList arrayList3 = new ArrayList(n.u(X, 10));
                        int i92 = 0;
                        for (CorporateDetailsDomain corporateDetailsDomain2 : X) {
                            i92++;
                            arrayList.add(new a.C0118a(new CorporateDetailsDomain(corporateDetailsDomain2.f10804a, corporateDetailsDomain2.f10805b, corporateDetailsDomain2.f10806c, corporateDetailsDomain2.f10807d, String.valueOf(i92), corporateDetailsDomain2.f10809f, corporateDetailsDomain2.f10810g, corporateDetailsDomain2.f10811h)));
                            arrayList3.add(new a.C0118a(corporateDetailsDomain2));
                        }
                        CompaniesListController companiesListController2 = this.f8388b.f11881p0;
                        (companiesListController2 == null ? null : companiesListController2).setData(arrayList3);
                        break;
                    case 3:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    case 4:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    default:
                        v.w(U4.b.g(this.f8388b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        break;
                }
                return p.f3034a;
            }
        }));
        C0606e T02 = T0();
        final int i11 = 3;
        T02.f8381Z0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyCompaniesFragment f8388b;

            {
                this.f8388b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                Integer num;
                switch (i11) {
                    case 0:
                        this.f8388b.getClass();
                        break;
                    case 1:
                        int intValue = ((Integer) obj).intValue();
                        MyCompaniesFragment myCompaniesFragment = this.f8388b;
                        List<CorporateDetailsDomain> value = myCompaniesFragment.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar == null || (num = aVar.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain != null) {
                                CorporateDetailsDomain.a aVar2 = corporateDetailsDomain.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar2 != null ? aVar2.f10896d0 : null;
                                if (statusIdentification != null && MyCompaniesFragment.a.f11888a[statusIdentification.ordinal()] == 1) {
                                    O9.f fVar = myCompaniesFragment.f11882q0;
                                    ((K5.a) fVar.getValue()).S(intValue);
                                    if (aVar2 != null) {
                                        ((K5.a) fVar.getValue()).g(F8.f.a(aVar2));
                                    }
                                    U4.b.g(myCompaniesFragment).i(R.id.action_global_homeFragment, null);
                                }
                            }
                        }
                        break;
                    case 2:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj3).f10804a;
                            if ((aVar3 != null ? aVar3.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                arrayList2.add(obj3);
                            }
                        }
                        List<CorporateDetailsDomain> X = s.X(arrayList2, new MyCompaniesFragment.b());
                        ArrayList arrayList3 = new ArrayList(n.u(X, 10));
                        int i92 = 0;
                        for (CorporateDetailsDomain corporateDetailsDomain2 : X) {
                            i92++;
                            arrayList.add(new a.C0118a(new CorporateDetailsDomain(corporateDetailsDomain2.f10804a, corporateDetailsDomain2.f10805b, corporateDetailsDomain2.f10806c, corporateDetailsDomain2.f10807d, String.valueOf(i92), corporateDetailsDomain2.f10809f, corporateDetailsDomain2.f10810g, corporateDetailsDomain2.f10811h)));
                            arrayList3.add(new a.C0118a(corporateDetailsDomain2));
                        }
                        CompaniesListController companiesListController2 = this.f8388b.f11881p0;
                        (companiesListController2 == null ? null : companiesListController2).setData(arrayList3);
                        break;
                    case 3:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    case 4:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    default:
                        v.w(U4.b.g(this.f8388b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        break;
                }
                return p.f3034a;
            }
        }));
        C0606e T03 = T0();
        final int i12 = 4;
        T03.f8382a1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyCompaniesFragment f8388b;

            {
                this.f8388b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                Integer num;
                switch (i12) {
                    case 0:
                        this.f8388b.getClass();
                        break;
                    case 1:
                        int intValue = ((Integer) obj).intValue();
                        MyCompaniesFragment myCompaniesFragment = this.f8388b;
                        List<CorporateDetailsDomain> value = myCompaniesFragment.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar == null || (num = aVar.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain != null) {
                                CorporateDetailsDomain.a aVar2 = corporateDetailsDomain.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar2 != null ? aVar2.f10896d0 : null;
                                if (statusIdentification != null && MyCompaniesFragment.a.f11888a[statusIdentification.ordinal()] == 1) {
                                    O9.f fVar = myCompaniesFragment.f11882q0;
                                    ((K5.a) fVar.getValue()).S(intValue);
                                    if (aVar2 != null) {
                                        ((K5.a) fVar.getValue()).g(F8.f.a(aVar2));
                                    }
                                    U4.b.g(myCompaniesFragment).i(R.id.action_global_homeFragment, null);
                                }
                            }
                        }
                        break;
                    case 2:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj3).f10804a;
                            if ((aVar3 != null ? aVar3.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                arrayList2.add(obj3);
                            }
                        }
                        List<CorporateDetailsDomain> X = s.X(arrayList2, new MyCompaniesFragment.b());
                        ArrayList arrayList3 = new ArrayList(n.u(X, 10));
                        int i92 = 0;
                        for (CorporateDetailsDomain corporateDetailsDomain2 : X) {
                            i92++;
                            arrayList.add(new a.C0118a(new CorporateDetailsDomain(corporateDetailsDomain2.f10804a, corporateDetailsDomain2.f10805b, corporateDetailsDomain2.f10806c, corporateDetailsDomain2.f10807d, String.valueOf(i92), corporateDetailsDomain2.f10809f, corporateDetailsDomain2.f10810g, corporateDetailsDomain2.f10811h)));
                            arrayList3.add(new a.C0118a(corporateDetailsDomain2));
                        }
                        CompaniesListController companiesListController2 = this.f8388b.f11881p0;
                        (companiesListController2 == null ? null : companiesListController2).setData(arrayList3);
                        break;
                    case 3:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    case 4:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    default:
                        v.w(U4.b.g(this.f8388b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        break;
                }
                return p.f3034a;
            }
        }));
        C0606e T04 = T0();
        final int i13 = 5;
        T04.f8383b1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: b7.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyCompaniesFragment f8388b;

            {
                this.f8388b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                Integer num;
                switch (i13) {
                    case 0:
                        this.f8388b.getClass();
                        break;
                    case 1:
                        int intValue = ((Integer) obj).intValue();
                        MyCompaniesFragment myCompaniesFragment = this.f8388b;
                        List<CorporateDetailsDomain> value = myCompaniesFragment.T0().f8379X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    CorporateDetailsDomain.a aVar = ((CorporateDetailsDomain) obj2).f10804a;
                                    if (aVar == null || (num = aVar.f10889a) == null || num.intValue() != intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj2;
                            if (corporateDetailsDomain != null) {
                                CorporateDetailsDomain.a aVar2 = corporateDetailsDomain.f10804a;
                                CorporateDetailsDomain.StatusIdentification statusIdentification = aVar2 != null ? aVar2.f10896d0 : null;
                                if (statusIdentification != null && MyCompaniesFragment.a.f11888a[statusIdentification.ordinal()] == 1) {
                                    O9.f fVar = myCompaniesFragment.f11882q0;
                                    ((K5.a) fVar.getValue()).S(intValue);
                                    if (aVar2 != null) {
                                        ((K5.a) fVar.getValue()).g(F8.f.a(aVar2));
                                    }
                                    U4.b.g(myCompaniesFragment).i(R.id.action_global_homeFragment, null);
                                }
                            }
                        }
                        break;
                    case 2:
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            CorporateDetailsDomain.a aVar3 = ((CorporateDetailsDomain) obj3).f10804a;
                            if ((aVar3 != null ? aVar3.f10896d0 : null) == CorporateDetailsDomain.StatusIdentification.f10855b) {
                                arrayList2.add(obj3);
                            }
                        }
                        List<CorporateDetailsDomain> X = s.X(arrayList2, new MyCompaniesFragment.b());
                        ArrayList arrayList3 = new ArrayList(n.u(X, 10));
                        int i92 = 0;
                        for (CorporateDetailsDomain corporateDetailsDomain2 : X) {
                            i92++;
                            arrayList.add(new a.C0118a(new CorporateDetailsDomain(corporateDetailsDomain2.f10804a, corporateDetailsDomain2.f10805b, corporateDetailsDomain2.f10806c, corporateDetailsDomain2.f10807d, String.valueOf(i92), corporateDetailsDomain2.f10809f, corporateDetailsDomain2.f10810g, corporateDetailsDomain2.f10811h)));
                            arrayList3.add(new a.C0118a(corporateDetailsDomain2));
                        }
                        CompaniesListController companiesListController2 = this.f8388b.f11881p0;
                        (companiesListController2 == null ? null : companiesListController2).setData(arrayList3);
                        break;
                    case 3:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    case 4:
                        U4.b.g(this.f8388b).i(R.id.action_global_homeFragment, null);
                        break;
                    default:
                        v.w(U4.b.g(this.f8388b), R.id.action_companiesListFragment_to_signerCheckFragment);
                        break;
                }
                return p.f3034a;
            }
        }));
        AbstractC1421q4 u03 = u0();
        o.c(u03.f29514n, 500L, new C0608g(this, 0));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11879n0;
    }
}
