package com.luminary.business.presentation.ui.fragments.newcompany.selectcountry;

import B2.d;
import C.v;
import F8.o;
import H1.a;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.selectcountry.SelectCountryFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.G4;

/* compiled from: SelectCountryFragment.kt */
/* loaded from: classes2.dex */
public final class SelectCountryFragment extends BaseFragment<G4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12660n0 = R.layout.fragment_new_company_select_country;

    /* renamed from: o0, reason: collision with root package name */
    public String f12661o0;

    /* renamed from: p0, reason: collision with root package name */
    public String f12662p0;

    /* renamed from: q0, reason: collision with root package name */
    public final a f12663q0;

    /* renamed from: r0, reason: collision with root package name */
    public CreateCompanyUI f12664r0;
    public String s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f12665t0;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.selectcountry.SelectCountryFragment$special$$inlined$viewModel$default$1] */
    public SelectCountryFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.selectcountry.SelectCountryFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12663q0 = E.a(this, h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.selectcountry.SelectCountryFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.selectcountry.SelectCountryFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(NewCompanyViewModel.class), null, null, b.l(this));
            }
        });
        EmptyList emptyList = EmptyList.f23104a;
        this.s0 = "";
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13266d = getString(R.string.step_of, 1, 14);
        toolbarStatus.f13263a = getString(R.string.company_jurisdiction);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.company_jurisdiction);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final NewCompanyViewModel T0() {
        return (NewCompanyViewModel) this.f12663q0.getValue();
    }

    public final void U0() {
        G4 u02 = u0();
        CreateCompanyUI createCompanyUI = T0().f12445j1;
        if (createCompanyUI == null) {
            createCompanyUI = null;
        }
        u02.f27910n.setEnabled(createCompanyUI.f11268b != null);
        G4 u03 = u0();
        CreateCompanyUI createCompanyUI2 = T0().f12445j1;
        u03.f27911o.setEnabled((createCompanyUI2 != null ? createCompanyUI2 : null).f11268b != null);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        T0().h0();
        u0().f27912p.setText(this.f12661o0);
        if (this.f12664r0 == null) {
            this.f12664r0 = new CreateCompanyUI(402653183, Double.valueOf(0.0d));
            T0().f12445j1 = this.f12664r0;
        }
        G4 u02 = u0();
        final int i = 0;
        o.c(u02.f27912p, 500L, new InterfaceC0635a(this) { // from class: X7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCountryFragment f4031b;

            {
                this.f4031b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        NavController g10 = U4.b.g(this.f4031b);
                        g10.i(R.id.action_selectCountryFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    case 1:
                        SelectCountryFragment selectCountryFragment = this.f4031b;
                        CreateCompanyUI createCompanyUI = selectCountryFragment.T0().f12445j1;
                        if (createCompanyUI == null) {
                            createCompanyUI = null;
                        }
                        U4.b.g(selectCountryFragment).j(new c(createCompanyUI, selectCountryFragment.f12665t0, selectCountryFragment.s0));
                        break;
                    default:
                        this.f4031b.u0().f27910n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i9 = 0;
        E.b(this, "country", new InterfaceC0650p(this) { // from class: X7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCountryFragment f4033b;

            {
                this.f4033b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (i9) {
                    case 0:
                        if (!f.b(str, "country")) {
                            break;
                        } else {
                            String string = bundle2.getString("selected_country");
                            if (string == null) {
                                string = "";
                            }
                            SelectCountryFragment selectCountryFragment = this.f4033b;
                            selectCountryFragment.f12661o0 = string;
                            String string2 = bundle2.getString("selected_country_code");
                            selectCountryFragment.f12662p0 = string2 != null ? string2 : "";
                            selectCountryFragment.u0().f27912p.setText(selectCountryFragment.f12661o0);
                            CreateCompanyUI createCompanyUI = selectCountryFragment.T0().f12445j1;
                            if (createCompanyUI == null) {
                                createCompanyUI = null;
                            }
                            createCompanyUI.f11269c = selectCountryFragment.f12661o0;
                            CreateCompanyUI createCompanyUI2 = selectCountryFragment.T0().f12445j1;
                            (createCompanyUI2 != null ? createCompanyUI2 : null).f11268b = selectCountryFragment.f12662p0;
                            selectCountryFragment.U0();
                            break;
                        }
                    default:
                        if (!f.b(str, "select_company")) {
                            break;
                        } else {
                            String valueOf = String.valueOf(bundle2.getString("company_id"));
                            SelectCountryFragment selectCountryFragment2 = this.f4033b;
                            selectCountryFragment2.s0 = valueOf;
                            if (valueOf.length() != 0) {
                                selectCountryFragment2.f12665t0 = true;
                            }
                            break;
                        }
                }
                return p.f3034a;
            }
        });
        final int i10 = 1;
        E.b(this, "select_company", new InterfaceC0650p(this) { // from class: X7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCountryFragment f4033b;

            {
                this.f4033b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (i10) {
                    case 0:
                        if (!f.b(str, "country")) {
                            break;
                        } else {
                            String string = bundle2.getString("selected_country");
                            if (string == null) {
                                string = "";
                            }
                            SelectCountryFragment selectCountryFragment = this.f4033b;
                            selectCountryFragment.f12661o0 = string;
                            String string2 = bundle2.getString("selected_country_code");
                            selectCountryFragment.f12662p0 = string2 != null ? string2 : "";
                            selectCountryFragment.u0().f27912p.setText(selectCountryFragment.f12661o0);
                            CreateCompanyUI createCompanyUI = selectCountryFragment.T0().f12445j1;
                            if (createCompanyUI == null) {
                                createCompanyUI = null;
                            }
                            createCompanyUI.f11269c = selectCountryFragment.f12661o0;
                            CreateCompanyUI createCompanyUI2 = selectCountryFragment.T0().f12445j1;
                            (createCompanyUI2 != null ? createCompanyUI2 : null).f11268b = selectCountryFragment.f12662p0;
                            selectCountryFragment.U0();
                            break;
                        }
                    default:
                        if (!f.b(str, "select_company")) {
                            break;
                        } else {
                            String valueOf = String.valueOf(bundle2.getString("company_id"));
                            SelectCountryFragment selectCountryFragment2 = this.f4033b;
                            selectCountryFragment2.s0 = valueOf;
                            if (valueOf.length() != 0) {
                                selectCountryFragment2.f12665t0 = true;
                            }
                            break;
                        }
                }
                return p.f3034a;
            }
        });
        G4 u03 = u0();
        final int i11 = 1;
        o.c(u03.f27910n, 500L, new InterfaceC0635a(this) { // from class: X7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCountryFragment f4031b;

            {
                this.f4031b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        NavController g10 = U4.b.g(this.f4031b);
                        g10.i(R.id.action_selectCountryFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    case 1:
                        SelectCountryFragment selectCountryFragment = this.f4031b;
                        CreateCompanyUI createCompanyUI = selectCountryFragment.T0().f12445j1;
                        if (createCompanyUI == null) {
                            createCompanyUI = null;
                        }
                        U4.b.g(selectCountryFragment).j(new c(createCompanyUI, selectCountryFragment.f12665t0, selectCountryFragment.s0));
                        break;
                    default:
                        this.f4031b.u0().f27910n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        G4 u04 = u0();
        final int i12 = 2;
        o.c(u04.f27911o, 500L, new InterfaceC0635a(this) { // from class: X7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectCountryFragment f4031b;

            {
                this.f4031b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        NavController g10 = U4.b.g(this.f4031b);
                        g10.i(R.id.action_selectCountryFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    case 1:
                        SelectCountryFragment selectCountryFragment = this.f4031b;
                        CreateCompanyUI createCompanyUI = selectCountryFragment.T0().f12445j1;
                        if (createCompanyUI == null) {
                            createCompanyUI = null;
                        }
                        U4.b.g(selectCountryFragment).j(new c(createCompanyUI, selectCountryFragment.f12665t0, selectCountryFragment.s0));
                        break;
                    default:
                        this.f4031b.u0().f27910n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        G4 u05 = u0();
        u05.f27910n.post(new d(this, 17));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12660n0;
    }
}
