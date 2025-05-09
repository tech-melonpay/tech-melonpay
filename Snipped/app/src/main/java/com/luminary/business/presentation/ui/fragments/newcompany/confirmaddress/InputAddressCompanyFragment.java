package com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress;

import C.v;
import F8.o;
import Fa.h;
import O9.p;
import S7.e;
import U4.b;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.InputAddressCompanyFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import ka.C0969n;
import kotlin.Pair;
import kotlin.jvm.internal.f;
import t6.A4;

/* compiled from: InputAddressCompanyFragment.kt */
/* loaded from: classes2.dex */
public final class InputAddressCompanyFragment extends BaseFragment<A4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12559n0 = R.layout.fragment_new_company_input_address;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12560o0;

    /* renamed from: p0, reason: collision with root package name */
    public final h f12561p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f12562q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f12563r0;
    public String s0;

    /* renamed from: t0, reason: collision with root package name */
    public String f12564t0;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.InputAddressCompanyFragment$special$$inlined$viewModel$default$1] */
    public InputAddressCompanyFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.InputAddressCompanyFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12560o0 = E.a(this, kotlin.jvm.internal.h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.InputAddressCompanyFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.InputAddressCompanyFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(NewCompanyViewModel.class), null, null, b.l(this));
            }
        });
        this.f12561p0 = new h(kotlin.jvm.internal.h.a(e.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.InputAddressCompanyFragment$special$$inlined$navArgs$1
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
                throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", fragment, " has null arguments"));
            }
        });
        this.f12563r0 = "";
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        getParentFragmentManager().f0("address", t0.c.b(new Pair("company_id", this.f12563r0)));
        return !(this instanceof CardsFragment);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.legal_address);
        toolbarStatus.f13266d = getString(R.string.step_of, 3, 14);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.legal_address);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final NewCompanyViewModel T0() {
        return (NewCompanyViewModel) this.f12560o0.getValue();
    }

    public final void U0() {
        CreateCompanyUI createCompanyUI = T0().f12445j1;
        if (createCompanyUI == null) {
            createCompanyUI = null;
        }
        if (f.b(createCompanyUI.f11268b, "gb")) {
            A4 u02 = u0();
            u02.f27613n.setHint(getString(R.string.street_address));
            A4 u03 = u0();
            u03.f27615p.setHint(getString(R.string.house_number));
            return;
        }
        A4 u04 = u0();
        u04.f27613n.setHint(getString(R.string.text_address_line_1_small_l));
        A4 u05 = u0();
        u05.f27615p.setHint(getString(R.string.text_address_line_2_small_l));
    }

    public final void V0() {
        boolean z10;
        CreateCompanyUI createCompanyUI = T0().f12445j1;
        if (createCompanyUI == null) {
            createCompanyUI = null;
        }
        String str = createCompanyUI.f11280o;
        String obj = str != null ? C0969n.u0(str).toString() : null;
        if (obj != null && obj.length() != 0) {
            String str2 = createCompanyUI.f11282q;
            String obj2 = str2 != null ? C0969n.u0(str2).toString() : null;
            if (obj2 != null && obj2.length() != 0) {
                String str3 = createCompanyUI.f11284s;
                String obj3 = str3 != null ? C0969n.u0(str3).toString() : null;
                if (obj3 != null && obj3.length() != 0) {
                    z10 = true;
                    u0().f27617r.setEnabled(z10);
                    u0().f27618s.setEnabled(z10);
                }
            }
        }
        z10 = false;
        u0().f27617r.setEnabled(z10);
        u0().f27618s.setEnabled(z10);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        h hVar = this.f12561p0;
        e eVar = (e) hVar.getValue();
        this.f12562q0 = eVar != null ? eVar.f3405b : false;
        e eVar2 = (e) hVar.getValue();
        if (eVar2 == null || (str = eVar2.f3406c) == null) {
            str = "";
        }
        this.f12563r0 = str;
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CreateCompanyUI createCompanyUI = ((e) this.f12561p0.getValue()).f3404a;
        T0().f12445j1 = createCompanyUI;
        A4 u02 = u0();
        u02.f27621v.setText(createCompanyUI.f11269c);
        u02.f27614o.setText(createCompanyUI.f11280o);
        u02.f27616q.setText(createCompanyUI.f11281p);
        u02.f27620u.setText(createCompanyUI.f11282q);
        u02.f27623x.setText(createCompanyUI.f11284s);
        V0();
        u0().f27614o.addTextChangedListener(new a());
        u0().f27616q.addTextChangedListener(new b());
        u0().f27620u.addTextChangedListener(new c());
        u0().f27623x.addTextChangedListener(new d());
        final int i = 0;
        o.c(u0().f27617r, 500L, new InterfaceC0635a(this) { // from class: S7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAddressCompanyFragment f3401b;

            {
                this.f3401b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        InputAddressCompanyFragment inputAddressCompanyFragment = this.f3401b;
                        NavController g10 = U4.b.g(inputAddressCompanyFragment);
                        CreateCompanyUI createCompanyUI2 = inputAddressCompanyFragment.T0().f12445j1;
                        if (createCompanyUI2 == null) {
                            createCompanyUI2 = null;
                        }
                        g10.j(new f(createCompanyUI2, inputAddressCompanyFragment.f12562q0, inputAddressCompanyFragment.f12563r0));
                        break;
                    case 1:
                        this.f3401b.u0().f27617r.callOnClick();
                        break;
                    default:
                        NavController g11 = U4.b.g(this.f3401b);
                        g11.i(R.id.action_inputAddressCompanyFragment_to_countrySelectFragment, v.h(g11, "isCountryCode", false, "fieldName", ""));
                        break;
                }
                return p.f3034a;
            }
        });
        final int i9 = 1;
        o.c(u0().f27618s, 500L, new InterfaceC0635a(this) { // from class: S7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAddressCompanyFragment f3401b;

            {
                this.f3401b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        InputAddressCompanyFragment inputAddressCompanyFragment = this.f3401b;
                        NavController g10 = U4.b.g(inputAddressCompanyFragment);
                        CreateCompanyUI createCompanyUI2 = inputAddressCompanyFragment.T0().f12445j1;
                        if (createCompanyUI2 == null) {
                            createCompanyUI2 = null;
                        }
                        g10.j(new f(createCompanyUI2, inputAddressCompanyFragment.f12562q0, inputAddressCompanyFragment.f12563r0));
                        break;
                    case 1:
                        this.f3401b.u0().f27617r.callOnClick();
                        break;
                    default:
                        NavController g11 = U4.b.g(this.f3401b);
                        g11.i(R.id.action_inputAddressCompanyFragment_to_countrySelectFragment, v.h(g11, "isCountryCode", false, "fieldName", ""));
                        break;
                }
                return p.f3034a;
            }
        });
        final int i10 = 2;
        o.c(u0().f27621v, 500L, new InterfaceC0635a(this) { // from class: S7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAddressCompanyFragment f3401b;

            {
                this.f3401b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        InputAddressCompanyFragment inputAddressCompanyFragment = this.f3401b;
                        NavController g10 = U4.b.g(inputAddressCompanyFragment);
                        CreateCompanyUI createCompanyUI2 = inputAddressCompanyFragment.T0().f12445j1;
                        if (createCompanyUI2 == null) {
                            createCompanyUI2 = null;
                        }
                        g10.j(new f(createCompanyUI2, inputAddressCompanyFragment.f12562q0, inputAddressCompanyFragment.f12563r0));
                        break;
                    case 1:
                        this.f3401b.u0().f27617r.callOnClick();
                        break;
                    default:
                        NavController g11 = U4.b.g(this.f3401b);
                        g11.i(R.id.action_inputAddressCompanyFragment_to_countrySelectFragment, v.h(g11, "isCountryCode", false, "fieldName", ""));
                        break;
                }
                return p.f3034a;
            }
        });
        final int i11 = 0;
        E.b(this, "country", new InterfaceC0650p(this) { // from class: S7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAddressCompanyFragment f3403b;

            {
                this.f3403b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (i11) {
                    case 0:
                        if (!kotlin.jvm.internal.f.b(str, "country")) {
                            break;
                        } else {
                            String string = bundle2.getString("selected_country");
                            if (string == null) {
                                string = "";
                            }
                            InputAddressCompanyFragment inputAddressCompanyFragment = this.f3403b;
                            inputAddressCompanyFragment.s0 = string;
                            String string2 = bundle2.getString("selected_country_code");
                            inputAddressCompanyFragment.f12564t0 = string2 != null ? string2 : "";
                            CreateCompanyUI createCompanyUI2 = inputAddressCompanyFragment.T0().f12445j1;
                            if (createCompanyUI2 == null) {
                                createCompanyUI2 = null;
                            }
                            createCompanyUI2.f11269c = inputAddressCompanyFragment.s0;
                            CreateCompanyUI createCompanyUI3 = inputAddressCompanyFragment.T0().f12445j1;
                            (createCompanyUI3 != null ? createCompanyUI3 : null).f11268b = inputAddressCompanyFragment.f12564t0;
                            inputAddressCompanyFragment.u0().f27621v.setText(inputAddressCompanyFragment.s0);
                            inputAddressCompanyFragment.U0();
                            inputAddressCompanyFragment.V0();
                            break;
                        }
                    default:
                        if (!kotlin.jvm.internal.f.b(str, "position_in_company")) {
                            break;
                        } else {
                            String valueOf = String.valueOf(bundle2.getString("company_id"));
                            InputAddressCompanyFragment inputAddressCompanyFragment2 = this.f3403b;
                            inputAddressCompanyFragment2.f12563r0 = valueOf;
                            if (valueOf.length() != 0) {
                                inputAddressCompanyFragment2.f12562q0 = true;
                            }
                            break;
                        }
                }
                return p.f3034a;
            }
        });
        final int i12 = 1;
        E.b(this, "position_in_company", new InterfaceC0650p(this) { // from class: S7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputAddressCompanyFragment f3403b;

            {
                this.f3403b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (i12) {
                    case 0:
                        if (!kotlin.jvm.internal.f.b(str, "country")) {
                            break;
                        } else {
                            String string = bundle2.getString("selected_country");
                            if (string == null) {
                                string = "";
                            }
                            InputAddressCompanyFragment inputAddressCompanyFragment = this.f3403b;
                            inputAddressCompanyFragment.s0 = string;
                            String string2 = bundle2.getString("selected_country_code");
                            inputAddressCompanyFragment.f12564t0 = string2 != null ? string2 : "";
                            CreateCompanyUI createCompanyUI2 = inputAddressCompanyFragment.T0().f12445j1;
                            if (createCompanyUI2 == null) {
                                createCompanyUI2 = null;
                            }
                            createCompanyUI2.f11269c = inputAddressCompanyFragment.s0;
                            CreateCompanyUI createCompanyUI3 = inputAddressCompanyFragment.T0().f12445j1;
                            (createCompanyUI3 != null ? createCompanyUI3 : null).f11268b = inputAddressCompanyFragment.f12564t0;
                            inputAddressCompanyFragment.u0().f27621v.setText(inputAddressCompanyFragment.s0);
                            inputAddressCompanyFragment.U0();
                            inputAddressCompanyFragment.V0();
                            break;
                        }
                    default:
                        if (!kotlin.jvm.internal.f.b(str, "position_in_company")) {
                            break;
                        } else {
                            String valueOf = String.valueOf(bundle2.getString("company_id"));
                            InputAddressCompanyFragment inputAddressCompanyFragment2 = this.f3403b;
                            inputAddressCompanyFragment2.f12563r0 = valueOf;
                            if (valueOf.length() != 0) {
                                inputAddressCompanyFragment2.f12562q0 = true;
                            }
                            break;
                        }
                }
                return p.f3034a;
            }
        });
        CreateCompanyUI createCompanyUI2 = T0().f12445j1;
        if (createCompanyUI2 == null) {
            createCompanyUI2 = null;
        }
        this.f12564t0 = createCompanyUI2.f11268b;
        CreateCompanyUI createCompanyUI3 = T0().f12445j1;
        this.s0 = (createCompanyUI3 != null ? createCompanyUI3 : null).f11269c;
        U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12559n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f27617r.setVisibility(0);
        o.b(u0().f27618s);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f27617r);
        u0().f27618s.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            InputAddressCompanyFragment inputAddressCompanyFragment = InputAddressCompanyFragment.this;
            CreateCompanyUI createCompanyUI = inputAddressCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11280o = String.valueOf(charSequence);
            inputAddressCompanyFragment.V0();
            Editable text = inputAddressCompanyFragment.u0().f27614o.getText();
            if (String.valueOf(text != null ? C0969n.u0(text) : null).length() != 0) {
                inputAddressCompanyFragment.u0().f27613n.setError(null);
                return;
            }
            A4 u02 = inputAddressCompanyFragment.u0();
            CreateCompanyUI createCompanyUI2 = inputAddressCompanyFragment.T0().f12445j1;
            u02.f27613n.setErrorWithoutFocus(inputAddressCompanyFragment.getString(R.string.enter_value, inputAddressCompanyFragment.getString(f.b((createCompanyUI2 != null ? createCompanyUI2 : null).f11268b, "gb") ? R.string.street_address : R.string.address_line_1)));
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            InputAddressCompanyFragment inputAddressCompanyFragment = InputAddressCompanyFragment.this;
            CreateCompanyUI createCompanyUI = inputAddressCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11281p = String.valueOf(charSequence);
            inputAddressCompanyFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            InputAddressCompanyFragment inputAddressCompanyFragment = InputAddressCompanyFragment.this;
            CreateCompanyUI createCompanyUI = inputAddressCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11282q = String.valueOf(charSequence);
            inputAddressCompanyFragment.V0();
            Editable text = inputAddressCompanyFragment.u0().f27620u.getText();
            if (String.valueOf(text != null ? C0969n.u0(text) : null).length() != 0) {
                inputAddressCompanyFragment.u0().f27619t.setError(null);
            } else {
                inputAddressCompanyFragment.u0().f27619t.setErrorWithoutFocus(inputAddressCompanyFragment.getString(R.string.enter_value, inputAddressCompanyFragment.getString(R.string.city)));
            }
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
            InputAddressCompanyFragment inputAddressCompanyFragment = InputAddressCompanyFragment.this;
            CreateCompanyUI createCompanyUI = inputAddressCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11284s = String.valueOf(charSequence);
            inputAddressCompanyFragment.V0();
            Editable text = inputAddressCompanyFragment.u0().f27623x.getText();
            if (String.valueOf(text != null ? C0969n.u0(text) : null).length() != 0) {
                inputAddressCompanyFragment.u0().f27622w.setError(null);
            } else {
                inputAddressCompanyFragment.u0().f27622w.setErrorWithoutFocus(inputAddressCompanyFragment.getString(R.string.enter_value, inputAddressCompanyFragment.getString(R.string.postal_code)));
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
