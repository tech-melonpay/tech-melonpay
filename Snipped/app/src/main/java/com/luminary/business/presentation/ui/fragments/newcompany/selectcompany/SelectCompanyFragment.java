package com.luminary.business.presentation.ui.fragments.newcompany.selectcompany;

import F8.o;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.selectcompany.SelectCompanyFragment;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.Locale;
import ka.C0966k;
import ka.C0969n;
import kotlin.Pair;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.E4;

/* compiled from: SelectCompanyFragment.kt */
/* loaded from: classes2.dex */
public final class SelectCompanyFragment extends BaseFragment<E4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12634n0 = R.layout.fragment_new_company_select_company;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12635o0;

    /* renamed from: p0, reason: collision with root package name */
    public SelectorDialog f12636p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f12637q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f12638r0;
    public String s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Fa.h f12639t0;

    /* renamed from: u0, reason: collision with root package name */
    public androidx.appcompat.app.b f12640u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f12641v0;

    /* renamed from: w0, reason: collision with root package name */
    public String f12642w0;

    /* compiled from: SelectCompanyFragment.kt */
    public static final class l implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12659a;

        public l(InterfaceC0646l interfaceC0646l) {
            this.f12659a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12659a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12659a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.selectcompany.SelectCompanyFragment$special$$inlined$viewModel$default$1] */
    public SelectCompanyFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.selectcompany.SelectCompanyFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12635o0 = E.a(this, kotlin.jvm.internal.h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.selectcompany.SelectCompanyFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.selectcompany.SelectCompanyFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(NewCompanyViewModel.class), null, null, b.l(this));
            }
        });
        this.f12638r0 = true;
        this.s0 = "";
        this.f12639t0 = new Fa.h(kotlin.jvm.internal.h.a(W7.d.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.selectcompany.SelectCompanyFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Bundle invoke() {
                Fragment fragment = Fragment.this;
                Bundle arguments = fragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException(a.k("Fragment ", fragment, " has null arguments"));
            }
        });
        this.f12642w0 = "";
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        getParentFragmentManager().f0("select_company", t0.c.b(new Pair("company_id", this.f12642w0)));
        return !(this instanceof CardsFragment);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.company_details);
        toolbarStatus.f13266d = getString(R.string.step_of, 2, 14);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.company_details);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final NewCompanyViewModel T0() {
        return (NewCompanyViewModel) this.f12635o0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0() {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.newcompany.selectcompany.SelectCompanyFragment.U0():void");
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
        Fa.h hVar = this.f12639t0;
        W7.d dVar = (W7.d) hVar.getValue();
        this.f12641v0 = dVar != null ? dVar.f3874b : false;
        String str = ((W7.d) hVar.getValue()).f3875c;
        if (str == null) {
            str = "";
        }
        this.f12642w0 = str;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        androidx.appcompat.app.b bVar = this.f12640u0;
        if (bVar != null) {
            if (bVar != null) {
                bVar.dismiss();
            }
            this.f12640u0 = null;
        }
        super.onDestroyView();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CorporateDetailsDomain.CompanyTypes companyTypes;
        CorporateDetailsDomain.SourceOfFunds sourceOfFunds;
        CorporateDetailsDomain.CompanySourceOfWealth companySourceOfWealth;
        super.onViewCreated(view, bundle);
        this.f12637q0 = true;
        SelectorDialog selectorDialog = new SelectorDialog(requireContext());
        this.f12636p0 = selectorDialog;
        selectorDialog.f13206v = new W7.a(this, 3);
        selectorDialog.f13208x = new W7.a(this, 4);
        T0().f12445j1 = ((W7.d) this.f12639t0.getValue()).f3873a;
        T0().f12448m1.observe(getViewLifecycleOwner(), new l(new W7.a(this, 0)));
        u0().f27810o.setCurrency("€");
        E4 u02 = u0();
        CreateCompanyUI createCompanyUI = T0().f12445j1;
        if (createCompanyUI == null) {
            createCompanyUI = null;
        }
        u02.f27818w.setText(createCompanyUI.f11273g);
        E4 u03 = u0();
        CreateCompanyUI createCompanyUI2 = T0().f12445j1;
        if (createCompanyUI2 == null) {
            createCompanyUI2 = null;
        }
        u03.f27794B.setText(createCompanyUI2.f11276k);
        E4 u04 = u0();
        CreateCompanyUI createCompanyUI3 = T0().f12445j1;
        if (createCompanyUI3 == null) {
            createCompanyUI3 = null;
        }
        u04.f27808P.setText(createCompanyUI3.i);
        E4 u05 = u0();
        CreateCompanyUI createCompanyUI4 = T0().f12445j1;
        if (createCompanyUI4 == null) {
            createCompanyUI4 = null;
        }
        u05.f27819x.setText(createCompanyUI4.f11274h);
        E4 u06 = u0();
        CreateCompanyUI createCompanyUI5 = T0().f12445j1;
        if (createCompanyUI5 == null) {
            createCompanyUI5 = null;
        }
        u06.f27817v.setText(createCompanyUI5.f11270d);
        E4 u07 = u0();
        CreateCompanyUI createCompanyUI6 = T0().f12445j1;
        if (createCompanyUI6 == null) {
            createCompanyUI6 = null;
        }
        u07.f27810o.setText(D9.b.r0(String.valueOf(createCompanyUI6.f11265B)));
        E4 u08 = u0();
        CreateCompanyUI createCompanyUI7 = T0().f12445j1;
        if (createCompanyUI7 == null) {
            createCompanyUI7 = null;
        }
        u08.f27802J.setText(createCompanyUI7.f11272f);
        E4 u09 = u0();
        CreateCompanyUI createCompanyUI8 = T0().f12445j1;
        if (createCompanyUI8 == null) {
            createCompanyUI8 = null;
        }
        u09.f27796D.setText(createCompanyUI8.f11279n);
        E4 u010 = u0();
        CreateCompanyUI createCompanyUI9 = T0().f12445j1;
        if (createCompanyUI9 == null) {
            createCompanyUI9 = null;
        }
        u010.f27807O.setText(createCompanyUI9.f11290y);
        E4 u011 = u0();
        CreateCompanyUI createCompanyUI10 = T0().f12445j1;
        if (createCompanyUI10 == null) {
            createCompanyUI10 = null;
        }
        u011.f27801I.setText(createCompanyUI10.f11264A);
        E4 u012 = u0();
        CreateCompanyUI createCompanyUI11 = T0().f12445j1;
        if (createCompanyUI11 == null) {
            createCompanyUI11 = null;
        }
        u012.f27798F.setText(createCompanyUI11.f11288w);
        E4 u013 = u0();
        CreateCompanyUI createCompanyUI12 = T0().f12445j1;
        if (createCompanyUI12 == null) {
            createCompanyUI12 = null;
        }
        u013.f27812q.setText(createCompanyUI12.f11277l);
        CreateCompanyUI createCompanyUI13 = T0().f12445j1;
        if (createCompanyUI13 == null) {
            createCompanyUI13 = null;
        }
        if (kotlin.jvm.internal.f.b(createCompanyUI13.f11266C, Boolean.TRUE)) {
            u0().f27804L.setChecked(true);
        }
        CreateCompanyUI createCompanyUI14 = T0().f12445j1;
        if (createCompanyUI14 == null) {
            createCompanyUI14 = null;
        }
        if (kotlin.jvm.internal.f.b(createCompanyUI14.f11266C, Boolean.FALSE)) {
            u0().f27803K.setChecked(true);
        }
        E4 u014 = u0();
        CreateCompanyUI createCompanyUI15 = T0().f12445j1;
        if (createCompanyUI15 == null) {
            createCompanyUI15 = null;
        }
        u014.f27813r.setText(createCompanyUI15.f11278m);
        CreateCompanyUI createCompanyUI16 = T0().f12445j1;
        if (createCompanyUI16 == null) {
            createCompanyUI16 = null;
        }
        String str = createCompanyUI16.f11271e;
        if (str != null && str.length() != 0) {
            E4 u015 = u0();
            CreateCompanyUI createCompanyUI17 = T0().f12445j1;
            if (createCompanyUI17 == null) {
                createCompanyUI17 = null;
            }
            u015.f27797E.setText(s3.b.j("+", createCompanyUI17.f11271e));
        }
        E4 u016 = u0();
        CorporateDetailsDomain.CompanyTypes.a aVar = CorporateDetailsDomain.CompanyTypes.f10821b;
        CreateCompanyUI createCompanyUI18 = T0().f12445j1;
        if (createCompanyUI18 == null) {
            createCompanyUI18 = null;
        }
        String str2 = createCompanyUI18.f11275j;
        if (str2 == null) {
            str2 = "";
        }
        aVar.getClass();
        switch (str2.hashCode()) {
            case -2144771227:
                if (str2.equals("PUBLIC_COMPANIES")) {
                    companyTypes = CorporateDetailsDomain.CompanyTypes.f10824e;
                    break;
                }
                companyTypes = null;
                break;
            case -2024903398:
                if (str2.equals("TRUST_FOUNDATION")) {
                    companyTypes = CorporateDetailsDomain.CompanyTypes.f10825f;
                    break;
                }
                companyTypes = null;
                break;
            case -1797638673:
                if (str2.equals("PARTNERSHIPS")) {
                    companyTypes = CorporateDetailsDomain.CompanyTypes.f10823d;
                    break;
                }
                companyTypes = null;
                break;
            case -995862876:
                if (str2.equals("LIMITED_LIABILITY_COMPANIES")) {
                    companyTypes = CorporateDetailsDomain.CompanyTypes.f10822c;
                    break;
                }
                companyTypes = null;
                break;
            case 75532016:
                if (str2.equals("OTHER")) {
                    companyTypes = CorporateDetailsDomain.CompanyTypes.f10826g;
                    break;
                }
                companyTypes = null;
                break;
            default:
                companyTypes = null;
                break;
        }
        u016.f27821z.setText(companyTypes != null ? companyTypes.f10828a : null);
        E4 u017 = u0();
        CorporateDetailsDomain.SourceOfFunds.a aVar2 = CorporateDetailsDomain.SourceOfFunds.f10837b;
        CreateCompanyUI createCompanyUI19 = T0().f12445j1;
        if (createCompanyUI19 == null) {
            createCompanyUI19 = null;
        }
        String str3 = createCompanyUI19.f11289x;
        if (str3 == null) {
            str3 = "";
        }
        aVar2.getClass();
        switch (str3.hashCode()) {
            case 75532016:
                if (str3.equals("OTHER")) {
                    sourceOfFunds = CorporateDetailsDomain.SourceOfFunds.f10842g;
                    break;
                }
                sourceOfFunds = null;
                break;
            case 1194049092:
                if (str3.equals("DIVIDENDS")) {
                    sourceOfFunds = CorporateDetailsDomain.SourceOfFunds.f10841f;
                    break;
                }
                sourceOfFunds = null;
                break;
            case 1446849548:
                if (str3.equals("REVENUE_GENERATED_FROM_BUSINESS_ACTIVITY")) {
                    sourceOfFunds = CorporateDetailsDomain.SourceOfFunds.f10838c;
                    break;
                }
                sourceOfFunds = null;
                break;
            case 1869530280:
                if (str3.equals("COMMISSION_REVENUE")) {
                    sourceOfFunds = CorporateDetailsDomain.SourceOfFunds.f10839d;
                    break;
                }
                sourceOfFunds = null;
                break;
            case 1956865561:
                if (str3.equals("INVESTMENTS/CAPITAL")) {
                    sourceOfFunds = CorporateDetailsDomain.SourceOfFunds.f10840e;
                    break;
                }
                sourceOfFunds = null;
                break;
            default:
                sourceOfFunds = null;
                break;
        }
        u017.f27805M.setText(sourceOfFunds != null ? sourceOfFunds.f10844a : null);
        E4 u018 = u0();
        CorporateDetailsDomain.CompanySourceOfWealth.a aVar3 = CorporateDetailsDomain.CompanySourceOfWealth.f10813b;
        CreateCompanyUI createCompanyUI20 = T0().f12445j1;
        if (createCompanyUI20 == null) {
            createCompanyUI20 = null;
        }
        String str4 = createCompanyUI20.f11291z;
        String str5 = str4 != null ? str4 : "";
        aVar3.getClass();
        switch (str5.hashCode()) {
            case -1656270556:
                if (str5.equals("RENTAL_INCOME")) {
                    companySourceOfWealth = CorporateDetailsDomain.CompanySourceOfWealth.f10815d;
                    break;
                }
                companySourceOfWealth = null;
                break;
            case -1436525699:
                if (str5.equals("COMMISSION_INCOME")) {
                    companySourceOfWealth = CorporateDetailsDomain.CompanySourceOfWealth.f10817f;
                    break;
                }
                companySourceOfWealth = null;
                break;
            case -744470621:
                if (str5.equals("BUSINESS_PROFIT")) {
                    companySourceOfWealth = CorporateDetailsDomain.CompanySourceOfWealth.f10814c;
                    break;
                }
                companySourceOfWealth = null;
                break;
            case 2342128:
                if (str5.equals("LOAN")) {
                    companySourceOfWealth = CorporateDetailsDomain.CompanySourceOfWealth.f10816e;
                    break;
                }
                companySourceOfWealth = null;
                break;
            case 75532016:
                if (str5.equals("OTHER")) {
                    companySourceOfWealth = CorporateDetailsDomain.CompanySourceOfWealth.f10818g;
                    break;
                }
                companySourceOfWealth = null;
                break;
            default:
                companySourceOfWealth = null;
                break;
        }
        u018.f27820y.setText(companySourceOfWealth != null ? companySourceOfWealth.f10820a : null);
        String valueOf = String.valueOf(u0().f27821z.getText());
        Locale locale = Locale.ROOT;
        if (kotlin.jvm.internal.f.b(valueOf.toLowerCase(locale), "other")) {
            u0().f27793A.setVisibility(0);
        } else {
            o.b(u0().f27793A);
        }
        if (kotlin.jvm.internal.f.b(String.valueOf(u0().f27805M.getText()).toLowerCase(locale), "Other".toLowerCase(locale))) {
            u0().f27806N.setVisibility(0);
        } else {
            o.b(u0().f27806N);
        }
        CreateCompanyUI createCompanyUI21 = T0().f12445j1;
        if (createCompanyUI21 == null) {
            createCompanyUI21 = null;
        }
        String str6 = createCompanyUI21.f11291z;
        if (str6 == null || str6.length() == 0) {
            o.b(u0().f27809n);
        } else {
            u0().f27809n.setVisibility(0);
        }
        if (kotlin.jvm.internal.f.b(String.valueOf(u0().f27820y.getText()).toLowerCase(locale), "Other".toLowerCase(locale))) {
            u0().f27800H.setVisibility(0);
        } else {
            o.b(u0().f27800H);
        }
        CreateCompanyUI createCompanyUI22 = T0().f12445j1;
        if (createCompanyUI22 == null) {
            createCompanyUI22 = null;
        }
        createCompanyUI22.f11278m = String.valueOf(u0().f27813r.getText());
        CreateCompanyUI createCompanyUI23 = T0().f12445j1;
        if (createCompanyUI23 == null) {
            createCompanyUI23 = null;
        }
        String str7 = createCompanyUI23.f11278m;
        if (kotlin.jvm.internal.f.b(str7 != null ? str7.toLowerCase(locale) : null, "other")) {
            u0().f27811p.setVisibility(0);
        } else {
            o.b(u0().f27811p);
        }
        o.c(u0().f27797E, 500L, new W7.c(this, 11));
        final int i9 = 2;
        E.b(this, "country", new InterfaceC0650p(this) { // from class: W7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCompanyFragment f3870b;

            {
                this.f3870b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                String str8 = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (i9) {
                    case 0:
                        if (!f.b(str8, "address")) {
                            break;
                        } else {
                            String valueOf2 = String.valueOf(bundle2.getString("company_id"));
                            SelectCompanyFragment selectCompanyFragment = this.f3870b;
                            selectCompanyFragment.f12642w0 = valueOf2;
                            if (valueOf2.length() != 0) {
                                selectCompanyFragment.f12641v0 = true;
                            }
                            break;
                        }
                    case 1:
                        if (!f.b(str8, "address")) {
                            break;
                        } else {
                            String valueOf3 = String.valueOf(bundle2.getString("company_id"));
                            SelectCompanyFragment selectCompanyFragment2 = this.f3870b;
                            selectCompanyFragment2.f12642w0 = valueOf3;
                            if (valueOf3.length() != 0) {
                                selectCompanyFragment2.f12641v0 = true;
                            }
                            break;
                        }
                    default:
                        if (!f.b(str8, "country")) {
                            break;
                        } else {
                            String string = bundle2.getString("selected_country");
                            if (string == null) {
                                string = "";
                            }
                            SelectCompanyFragment selectCompanyFragment3 = this.f3870b;
                            selectCompanyFragment3.s0 = string;
                            CreateCompanyUI createCompanyUI24 = selectCompanyFragment3.T0().f12445j1;
                            if (createCompanyUI24 == null) {
                                createCompanyUI24 = null;
                            }
                            createCompanyUI24.f11271e = selectCompanyFragment3.s0;
                            E4 u019 = selectCompanyFragment3.u0();
                            u019.f27797E.setText(s3.b.j("+", selectCompanyFragment3.s0));
                            break;
                        }
                }
                return p.f3034a;
            }
        });
        final int i10 = 0;
        E.b(this, "address", new InterfaceC0650p(this) { // from class: W7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCompanyFragment f3870b;

            {
                this.f3870b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                String str8 = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (i10) {
                    case 0:
                        if (!f.b(str8, "address")) {
                            break;
                        } else {
                            String valueOf2 = String.valueOf(bundle2.getString("company_id"));
                            SelectCompanyFragment selectCompanyFragment = this.f3870b;
                            selectCompanyFragment.f12642w0 = valueOf2;
                            if (valueOf2.length() != 0) {
                                selectCompanyFragment.f12641v0 = true;
                            }
                            break;
                        }
                    case 1:
                        if (!f.b(str8, "address")) {
                            break;
                        } else {
                            String valueOf3 = String.valueOf(bundle2.getString("company_id"));
                            SelectCompanyFragment selectCompanyFragment2 = this.f3870b;
                            selectCompanyFragment2.f12642w0 = valueOf3;
                            if (valueOf3.length() != 0) {
                                selectCompanyFragment2.f12641v0 = true;
                            }
                            break;
                        }
                    default:
                        if (!f.b(str8, "country")) {
                            break;
                        } else {
                            String string = bundle2.getString("selected_country");
                            if (string == null) {
                                string = "";
                            }
                            SelectCompanyFragment selectCompanyFragment3 = this.f3870b;
                            selectCompanyFragment3.s0 = string;
                            CreateCompanyUI createCompanyUI24 = selectCompanyFragment3.T0().f12445j1;
                            if (createCompanyUI24 == null) {
                                createCompanyUI24 = null;
                            }
                            createCompanyUI24.f11271e = selectCompanyFragment3.s0;
                            E4 u019 = selectCompanyFragment3.u0();
                            u019.f27797E.setText(s3.b.j("+", selectCompanyFragment3.s0));
                            break;
                        }
                }
                return p.f3034a;
            }
        });
        final int i11 = 1;
        E.b(this, "address", new InterfaceC0650p(this) { // from class: W7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCompanyFragment f3870b;

            {
                this.f3870b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                String str8 = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (i11) {
                    case 0:
                        if (!f.b(str8, "address")) {
                            break;
                        } else {
                            String valueOf2 = String.valueOf(bundle2.getString("company_id"));
                            SelectCompanyFragment selectCompanyFragment = this.f3870b;
                            selectCompanyFragment.f12642w0 = valueOf2;
                            if (valueOf2.length() != 0) {
                                selectCompanyFragment.f12641v0 = true;
                            }
                            break;
                        }
                    case 1:
                        if (!f.b(str8, "address")) {
                            break;
                        } else {
                            String valueOf3 = String.valueOf(bundle2.getString("company_id"));
                            SelectCompanyFragment selectCompanyFragment2 = this.f3870b;
                            selectCompanyFragment2.f12642w0 = valueOf3;
                            if (valueOf3.length() != 0) {
                                selectCompanyFragment2.f12641v0 = true;
                            }
                            break;
                        }
                    default:
                        if (!f.b(str8, "country")) {
                            break;
                        } else {
                            String string = bundle2.getString("selected_country");
                            if (string == null) {
                                string = "";
                            }
                            SelectCompanyFragment selectCompanyFragment3 = this.f3870b;
                            selectCompanyFragment3.s0 = string;
                            CreateCompanyUI createCompanyUI24 = selectCompanyFragment3.T0().f12445j1;
                            if (createCompanyUI24 == null) {
                                createCompanyUI24 = null;
                            }
                            createCompanyUI24.f11271e = selectCompanyFragment3.s0;
                            E4 u019 = selectCompanyFragment3.u0();
                            u019.f27797E.setText(s3.b.j("+", selectCompanyFragment3.s0));
                            break;
                        }
                }
                return p.f3034a;
            }
        });
        o.c(u0().f27821z, 500L, new W7.c(this, 0));
        o.c(u0().f27798F, 500L, new W7.c(this, 1));
        o.c(u0().f27805M, 500L, new W7.c(this, 2));
        o.c(u0().f27820y, 500L, new W7.c(this, 3));
        o.c(u0().f27799G, 500L, new W7.c(this, 4));
        o.c(u0().f27813r, 500L, new W7.c(this, 5));
        T0().f12447l1.observe(getViewLifecycleOwner(), new l(new W7.a(this, 8)));
        T0().f12451q1.observe(getViewLifecycleOwner(), new l(new W7.a(this, 9)));
        o.c(u0().f27814s, 500L, new W7.c(this, 7));
        o.c(u0().f27815t, 500L, new W7.c(this, 8));
        u0().f27818w.addTextChangedListener(new c());
        u0().f27794B.addTextChangedListener(new d());
        u0().f27808P.addTextChangedListener(new e());
        u0().f27819x.addTextChangedListener(new f());
        u0().f27817v.addTextChangedListener(new a());
        u0().f27810o.addTextChangedListener(new b());
        u0().f27802J.addTextChangedListener(new g());
        u0().f27796D.addTextChangedListener(new h());
        u0().f27807O.addTextChangedListener(new i());
        u0().f27801I.addTextChangedListener(new j());
        o.c(u0().f27804L, 500L, new W7.c(this, 9));
        o.c(u0().f27803K, 500L, new W7.c(this, 10));
        u0().f27812q.addTextChangedListener(new k());
        U0();
        NewCompanyViewModel T02 = T0();
        O7.c cVar = new O7.c(T02, 1);
        T02.f12425E1 = cVar;
        cVar.invoke();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12634n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f27814s.setVisibility(0);
        o.b(u0().f27815t);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f27814s);
        u0().f27815t.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SelectCompanyFragment selectCompanyFragment = SelectCompanyFragment.this;
            CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11273g = String.valueOf(charSequence);
            selectCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SelectCompanyFragment selectCompanyFragment = SelectCompanyFragment.this;
            CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11276k = String.valueOf(charSequence);
            selectCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SelectCompanyFragment selectCompanyFragment = SelectCompanyFragment.this;
            CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.i = String.valueOf(charSequence);
            selectCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SelectCompanyFragment selectCompanyFragment = SelectCompanyFragment.this;
            CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11274h = String.valueOf(charSequence);
            selectCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SelectCompanyFragment selectCompanyFragment = SelectCompanyFragment.this;
            CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11272f = String.valueOf(charSequence);
            selectCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            CharSequence u02 = charSequence != null ? C0969n.u0(charSequence) : null;
            SelectCompanyFragment selectCompanyFragment = SelectCompanyFragment.this;
            if (u02 == null || u02.length() == 0) {
                CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
                if (createCompanyUI == null) {
                    createCompanyUI = null;
                }
                createCompanyUI.f11279n = null;
            } else {
                CreateCompanyUI createCompanyUI2 = selectCompanyFragment.T0().f12445j1;
                (createCompanyUI2 != null ? createCompanyUI2 : null).f11279n = charSequence.toString();
            }
            selectCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class i implements TextWatcher {
        public i() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SelectCompanyFragment selectCompanyFragment = SelectCompanyFragment.this;
            CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11290y = String.valueOf(charSequence);
            selectCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class j implements TextWatcher {
        public j() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SelectCompanyFragment selectCompanyFragment = SelectCompanyFragment.this;
            CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11264A = String.valueOf(charSequence);
            selectCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class k implements TextWatcher {
        public k() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SelectCompanyFragment selectCompanyFragment = SelectCompanyFragment.this;
            CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11277l = String.valueOf(charSequence);
            selectCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            SelectCompanyFragment selectCompanyFragment = SelectCompanyFragment.this;
            CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11270d = String.valueOf(editable);
            selectCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            SelectCompanyFragment selectCompanyFragment = SelectCompanyFragment.this;
            CreateCompanyUI createCompanyUI = selectCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11265B = C0966k.R(D9.b.r0(String.valueOf(editable)));
            selectCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
