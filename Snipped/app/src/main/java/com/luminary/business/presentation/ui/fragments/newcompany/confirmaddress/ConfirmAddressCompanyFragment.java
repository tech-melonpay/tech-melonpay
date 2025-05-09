package com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress;

import F8.o;
import O9.p;
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
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.ConfirmAddressCompanyFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import kotlin.Pair;
import kotlin.jvm.internal.h;
import t6.AbstractC1464w4;

/* compiled from: ConfirmAddressCompanyFragment.kt */
/* loaded from: classes2.dex */
public final class ConfirmAddressCompanyFragment extends BaseFragment<AbstractC1464w4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12546n0 = R.layout.fragment_new_company_confirm_company_address;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12547o0;

    /* renamed from: p0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.a f12548p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f12549q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f12550r0;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.ConfirmAddressCompanyFragment$special$$inlined$viewModel$default$1] */
    public ConfirmAddressCompanyFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.ConfirmAddressCompanyFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12547o0 = E.a(this, h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.ConfirmAddressCompanyFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.ConfirmAddressCompanyFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(NewCompanyViewModel.class), null, null, b.l(this));
            }
        });
        this.f12550r0 = "";
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        getParentFragmentManager().f0("address", t0.c.b(new Pair("company_id", this.f12550r0)));
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
        return (NewCompanyViewModel) this.f12547o0.getValue();
    }

    public final void U0() {
        String str;
        String str2;
        String str3;
        CreateCompanyUI createCompanyUI = T0().f12445j1;
        if (createCompanyUI == null) {
            createCompanyUI = null;
        }
        String str4 = createCompanyUI.f11281p;
        boolean z10 = (str4 == null || str4.length() == 0 || (str = createCompanyUI.f11280o) == null || str.length() == 0 || (str2 = createCompanyUI.f11282q) == null || str2.length() == 0 || (str3 = createCompanyUI.f11284s) == null || str3.length() == 0) ? false : true;
        u0().f29740n.setEnabled(z10);
        u0().f29741o.setEnabled(z10);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.a a10 = a.C0134a.a(arguments);
            this.f12548p0 = a10;
            this.f12549q0 = a10.f12575b;
            String str = a10.f12576c;
            if (str == null) {
                str = "";
            }
            this.f12550r0 = str;
        }
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CreateCompanyUI createCompanyUI;
        super.onViewCreated(view, bundle);
        com.luminary.business.presentation.ui.fragments.newcompany.confirmaddress.a aVar = this.f12548p0;
        if (aVar != null && (createCompanyUI = aVar.f12574a) != null) {
            T0().f12445j1 = createCompanyUI;
            AbstractC1464w4 u02 = u0();
            u02.f29743q.setText(createCompanyUI.f11281p);
            u02.f29745s.setText(createCompanyUI.f11280o);
            u02.f29742p.setText(createCompanyUI.f11282q);
            u02.f29744r.setText(createCompanyUI.f11284s);
            U0();
        }
        u0().f29743q.addTextChangedListener(new a());
        u0().f29745s.addTextChangedListener(new b());
        u0().f29742p.addTextChangedListener(new c());
        u0().f29744r.addTextChangedListener(new d());
        E.b(this, "position_in_company", new B6.h(this, 12));
        final int i = 0;
        o.c(u0().f29740n, 500L, new InterfaceC0635a(this) { // from class: S7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmAddressCompanyFragment f3396b;

            {
                this.f3396b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ConfirmAddressCompanyFragment confirmAddressCompanyFragment = this.f3396b;
                        NavController g10 = U4.b.g(confirmAddressCompanyFragment);
                        CreateCompanyUI createCompanyUI2 = confirmAddressCompanyFragment.T0().f12445j1;
                        if (createCompanyUI2 == null) {
                            createCompanyUI2 = null;
                        }
                        g10.j(new b(createCompanyUI2, confirmAddressCompanyFragment.f12549q0, confirmAddressCompanyFragment.f12550r0));
                        break;
                    default:
                        this.f3396b.u0().f29740n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i9 = 1;
        o.c(u0().f29741o, 500L, new InterfaceC0635a(this) { // from class: S7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmAddressCompanyFragment f3396b;

            {
                this.f3396b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        ConfirmAddressCompanyFragment confirmAddressCompanyFragment = this.f3396b;
                        NavController g10 = U4.b.g(confirmAddressCompanyFragment);
                        CreateCompanyUI createCompanyUI2 = confirmAddressCompanyFragment.T0().f12445j1;
                        if (createCompanyUI2 == null) {
                            createCompanyUI2 = null;
                        }
                        g10.j(new b(createCompanyUI2, confirmAddressCompanyFragment.f12549q0, confirmAddressCompanyFragment.f12550r0));
                        break;
                    default:
                        this.f3396b.u0().f29740n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12546n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f29740n.setVisibility(0);
        o.b(u0().f29741o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f29740n);
        u0().f29741o.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            ConfirmAddressCompanyFragment confirmAddressCompanyFragment = ConfirmAddressCompanyFragment.this;
            CreateCompanyUI createCompanyUI = confirmAddressCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11281p = String.valueOf(charSequence);
            confirmAddressCompanyFragment.U0();
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
            ConfirmAddressCompanyFragment confirmAddressCompanyFragment = ConfirmAddressCompanyFragment.this;
            CreateCompanyUI createCompanyUI = confirmAddressCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11280o = String.valueOf(charSequence);
            confirmAddressCompanyFragment.U0();
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
            ConfirmAddressCompanyFragment confirmAddressCompanyFragment = ConfirmAddressCompanyFragment.this;
            CreateCompanyUI createCompanyUI = confirmAddressCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11282q = String.valueOf(charSequence);
            confirmAddressCompanyFragment.U0();
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
            ConfirmAddressCompanyFragment confirmAddressCompanyFragment = ConfirmAddressCompanyFragment.this;
            CreateCompanyUI createCompanyUI = confirmAddressCompanyFragment.T0().f12445j1;
            if (createCompanyUI == null) {
                createCompanyUI = null;
            }
            createCompanyUI.f11284s = String.valueOf(charSequence);
            confirmAddressCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
