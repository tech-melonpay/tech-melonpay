package com.luminary.business.presentation.ui.fragments.newcompany.businessactivity;

import C.v;
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
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.luminary.business.presentation.entity.company.BankAccountOutside;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.AddBankFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import kotlin.Pair;
import kotlin.jvm.internal.h;
import t6.G2;

/* compiled from: AddBankFragment.kt */
/* loaded from: classes2.dex */
public final class AddBankFragment extends BaseFragment<G2> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12520n0 = R.layout.fragment_add_bank;

    /* renamed from: o0, reason: collision with root package name */
    public BankAccountOutside f12521o0;

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f12522p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f12523q0;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.AddBankFragment$special$$inlined$viewModel$default$1] */
    public AddBankFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.AddBankFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12522p0 = E.a(this, h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.AddBankFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.AddBankFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(NewCompanyViewModel.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.account_in_other_bank);
        toolbarStatus.f13266d = getString(R.string.step_of, 9, 12);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.account_in_other_bank);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void T0() {
        boolean z10;
        BankAccountOutside bankAccountOutside = this.f12521o0;
        if (bankAccountOutside == null) {
            bankAccountOutside = null;
        }
        String str = bankAccountOutside.f11188a;
        if (str != null && str.length() != 0) {
            BankAccountOutside bankAccountOutside2 = this.f12521o0;
            String str2 = (bankAccountOutside2 != null ? bankAccountOutside2 : null).f11189b;
            if (str2 != null && str2.length() != 0) {
                z10 = true;
                u0().f27886p.setEnabled(z10);
                u0().f27887q.setEnabled(z10);
            }
        }
        z10 = false;
        u0().f27886p.setEnabled(z10);
        u0().f27887q.setEnabled(z10);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = (NewCompanyViewModel) this.f12522p0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((NewCompanyViewModel) this.f12522p0.getValue()).h0();
        this.f12521o0 = new BankAccountOutside("", "", "", "");
        E.b(this, "country", new B6.h(this, 9));
        T0();
        G2 u02 = u0();
        u02.f27885o.addTextChangedListener(new a());
        final int i = 0;
        o.c(u02.f27888r, 500L, new InterfaceC0635a(this) { // from class: R7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankFragment f3295b;

            {
                this.f3295b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        NavController g10 = U4.b.g(this.f3295b);
                        g10.i(R.id.action_addBankFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    default:
                        AddBankFragment addBankFragment = this.f3295b;
                        BankAccountOutside bankAccountOutside = addBankFragment.f12521o0;
                        Pair pair = new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, (bankAccountOutside == null ? null : bankAccountOutside).f11188a);
                        Pair pair2 = new Pair("country", (bankAccountOutside == null ? null : bankAccountOutside).f11189b);
                        if (bankAccountOutside == null) {
                            bankAccountOutside = null;
                        }
                        addBankFragment.getParentFragmentManager().f0("NEW_BANK_OUTSIDE", t0.c.b(pair, pair2, new Pair("info", bankAccountOutside.f11191d), new Pair("country_full", addBankFragment.f12523q0)));
                        U4.b.g(addBankFragment).l();
                        break;
                }
                return p.f3034a;
            }
        });
        u02.f27884n.addTextChangedListener(new b());
        final int i9 = 1;
        o.c(u02.f27886p, 500L, new InterfaceC0635a(this) { // from class: R7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankFragment f3295b;

            {
                this.f3295b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        NavController g10 = U4.b.g(this.f3295b);
                        g10.i(R.id.action_addBankFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    default:
                        AddBankFragment addBankFragment = this.f3295b;
                        BankAccountOutside bankAccountOutside = addBankFragment.f12521o0;
                        Pair pair = new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, (bankAccountOutside == null ? null : bankAccountOutside).f11188a);
                        Pair pair2 = new Pair("country", (bankAccountOutside == null ? null : bankAccountOutside).f11189b);
                        if (bankAccountOutside == null) {
                            bankAccountOutside = null;
                        }
                        addBankFragment.getParentFragmentManager().f0("NEW_BANK_OUTSIDE", t0.c.b(pair, pair2, new Pair("info", bankAccountOutside.f11191d), new Pair("country_full", addBankFragment.f12523q0)));
                        U4.b.g(addBankFragment).l();
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(u02.f27887q, 500L, new A8.b(u02, 9));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12520n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f27886p.setVisibility(0);
        o.b(u0().f27887q);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f27886p);
        u0().f27887q.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            AddBankFragment addBankFragment = AddBankFragment.this;
            BankAccountOutside bankAccountOutside = addBankFragment.f12521o0;
            if (bankAccountOutside == null) {
                bankAccountOutside = null;
            }
            bankAccountOutside.f11188a = String.valueOf(charSequence);
            addBankFragment.T0();
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
            BankAccountOutside bankAccountOutside = AddBankFragment.this.f12521o0;
            if (bankAccountOutside == null) {
                bankAccountOutside = null;
            }
            bankAccountOutside.f11191d = String.valueOf(charSequence);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
