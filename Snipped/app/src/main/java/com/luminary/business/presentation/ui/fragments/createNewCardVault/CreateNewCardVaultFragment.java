package com.luminary.business.presentation.ui.fragments.createNewCardVault;

import A7.c;
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
import com.google.android.material.imageview.ShapeableImageView;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.createNewCardVault.CreateNewCardVaultFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.InfoView;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import d7.C0691b;
import d7.C0693d;
import d7.C0695f;
import h4.i;
import java.math.BigDecimal;
import java.util.List;
import ka.C0969n;
import kotlin.jvm.internal.h;
import t6.AbstractC1477y3;

/* compiled from: CreateNewCardVaultFragment.kt */
/* loaded from: classes2.dex */
public final class CreateNewCardVaultFragment extends BaseFragment<AbstractC1477y3> {

    /* renamed from: n0, reason: collision with root package name */
    public final H1.a f11910n0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.luminary.business.presentation.ui.fragments.createNewCardVault.CreateNewCardVaultFragment$special$$inlined$viewModel$default$1] */
    public CreateNewCardVaultFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.createNewCardVault.CreateNewCardVaultFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11910n0 = E.a(this, h.a(C0695f.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.createNewCardVault.CreateNewCardVaultFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.createNewCardVault.CreateNewCardVaultFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C0695f.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.create_card_vault);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 28;
        return toolbarStatus;
    }

    public final C0695f T0() {
        return (C0695f) this.f11910n0.getValue();
    }

    public final void U0() {
        Integer M8;
        String bigDecimal;
        AbstractC1477y3 u02 = u0();
        BankAccountDomain bankAccountDomain = T0().f20457W0;
        if (bankAccountDomain != null) {
            String str = "";
            String str2 = bankAccountDomain.f10701h;
            String str3 = str2 == null ? "" : str2;
            BigDecimal bigDecimal2 = bankAccountDomain.f10698e;
            if (bigDecimal2 != null && (bigDecimal = bigDecimal2.toString()) != null) {
                str = bigDecimal;
            }
            u02.f29851u.setText(getString(R.string.balance, D9.b.o(str3, str)));
            if (str2 == null || (M8 = D9.b.M(requireContext(), str2)) == null) {
                return;
            }
            int intValue = M8.intValue();
            ShapeableImageView shapeableImageView = u02.f29844n;
            shapeableImageView.setImageResource(intValue);
            shapeableImageView.setVisibility(0);
        }
    }

    public final void V0() {
        AbstractC1477y3 u02 = u0();
        i iVar = T0().f20456V0;
        if (iVar != null) {
            InfoView infoView = u02.f29850t;
            infoView.setVisibility(0);
            infoView.setInfoText(C0693d.a(iVar.f21122e));
            InfoView infoView2 = u02.f29849s;
            infoView2.setVisibility(0);
            infoView2.setInfoText(getString(R.string.your_currency_account_will_be_set_as_default_for_this_vault_future_fees_for_card_issuance_and_monthly_charges_will_be_deducted_from_the_selected_account));
            u02.f29854x.setText(iVar.f21120c);
            p pVar = p.f3034a;
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        V0();
        U0();
        AbstractC1477y3 u02 = u0();
        o.c(u02.f29846p, 500L, new c(13, this, u02));
        final int i = 0;
        o.c(u02.f29854x, 500L, new InterfaceC0635a(this) { // from class: d7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateNewCardVaultFragment f20442b;

            {
                this.f20442b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreateNewCardVaultFragment createNewCardVaultFragment = this.f20442b;
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(createNewCardVaultFragment.requireContext(), StatementsSelectorDialog.DialogType.f13047e);
                        statementsSelectorDialog.f13042w = new C7.a(createNewCardVaultFragment, 19);
                        statementsSelectorDialog.show();
                        List<StatementsSelectorDialog.a> list = createNewCardVaultFragment.T0().f20462b1;
                        String string = createNewCardVaultFragment.getString(R.string.no_vault_types_available);
                        statementsSelectorDialog.f13039t = list;
                        StatementsSelectorDialog.SelectorController selectorController = statementsSelectorDialog.f13038s;
                        if (selectorController != null) {
                            selectorController.setData(list, string);
                        }
                        statementsSelectorDialog.m(createNewCardVaultFragment.getString(R.string.vault_type));
                        break;
                    default:
                        CreateNewCardVaultFragment createNewCardVaultFragment2 = this.f20442b;
                        BankAccountDomain bankAccountDomain = createNewCardVaultFragment2.T0().f20457W0;
                        Integer num = bankAccountDomain != null ? bankAccountDomain.f10694a : null;
                        i iVar = createNewCardVaultFragment2.T0().f20456V0;
                        Integer valueOf = iVar != null ? Integer.valueOf(iVar.f21118a) : null;
                        if (num != null && valueOf != null) {
                            NavController g10 = U4.b.g(createNewCardVaultFragment2);
                            String num2 = num.toString();
                            String num3 = valueOf.toString();
                            String str = createNewCardVaultFragment2.T0().f20458X0;
                            i iVar2 = createNewCardVaultFragment2.T0().f20456V0;
                            String a10 = C0693d.a(iVar2 != null ? iVar2.f21122e : null);
                            i iVar3 = createNewCardVaultFragment2.T0().f20456V0;
                            g10.j(new C0692c(num2, num3, str, a10, iVar3 != null ? iVar3.f21120c : null, null));
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        final int i9 = 1;
        o.c(u02.f29847q, 500L, new InterfaceC0635a(this) { // from class: d7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateNewCardVaultFragment f20442b;

            {
                this.f20442b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        CreateNewCardVaultFragment createNewCardVaultFragment = this.f20442b;
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(createNewCardVaultFragment.requireContext(), StatementsSelectorDialog.DialogType.f13047e);
                        statementsSelectorDialog.f13042w = new C7.a(createNewCardVaultFragment, 19);
                        statementsSelectorDialog.show();
                        List<StatementsSelectorDialog.a> list = createNewCardVaultFragment.T0().f20462b1;
                        String string = createNewCardVaultFragment.getString(R.string.no_vault_types_available);
                        statementsSelectorDialog.f13039t = list;
                        StatementsSelectorDialog.SelectorController selectorController = statementsSelectorDialog.f13038s;
                        if (selectorController != null) {
                            selectorController.setData(list, string);
                        }
                        statementsSelectorDialog.m(createNewCardVaultFragment.getString(R.string.vault_type));
                        break;
                    default:
                        CreateNewCardVaultFragment createNewCardVaultFragment2 = this.f20442b;
                        BankAccountDomain bankAccountDomain = createNewCardVaultFragment2.T0().f20457W0;
                        Integer num = bankAccountDomain != null ? bankAccountDomain.f10694a : null;
                        i iVar = createNewCardVaultFragment2.T0().f20456V0;
                        Integer valueOf = iVar != null ? Integer.valueOf(iVar.f21118a) : null;
                        if (num != null && valueOf != null) {
                            NavController g10 = U4.b.g(createNewCardVaultFragment2);
                            String num2 = num.toString();
                            String num3 = valueOf.toString();
                            String str = createNewCardVaultFragment2.T0().f20458X0;
                            i iVar2 = createNewCardVaultFragment2.T0().f20456V0;
                            String a10 = C0693d.a(iVar2 != null ? iVar2.f21122e : null);
                            i iVar3 = createNewCardVaultFragment2.T0().f20456V0;
                            g10.j(new C0692c(num2, num3, str, a10, iVar3 != null ? iVar3.f21120c : null, null));
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(u02.f29848r, 500L, new A8.b(u02, 25));
        T0().f20459Y0.observe(getViewLifecycleOwner(), new F8.i(new C0691b(this, 0)));
        T0().f20465e1.observe(getViewLifecycleOwner(), new F8.i(new C0691b(this, 1)));
        AbstractC1477y3 u03 = u0();
        u03.f29853w.addTextChangedListener(new a());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return R.layout.fragment_create_new_card_vault;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f29847q.setVisibility(0);
        o.b(u0().f29848r);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f29847q);
        u0().f29848r.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            CreateNewCardVaultFragment createNewCardVaultFragment = CreateNewCardVaultFragment.this;
            C0695f T02 = createNewCardVaultFragment.T0();
            T02.f20458X0 = String.valueOf(charSequence);
            T02.h0();
            if (charSequence == null || C0969n.i0(charSequence)) {
                AbstractC1477y3 u02 = createNewCardVaultFragment.u0();
                u02.f29852v.setErrorWithoutFocus(createNewCardVaultFragment.getString(R.string.empty_name));
            } else {
                if (charSequence.toString().length() <= 18) {
                    createNewCardVaultFragment.u0().f29852v.setError(null);
                    return;
                }
                AbstractC1477y3 u03 = createNewCardVaultFragment.u0();
                u03.f29852v.setErrorWithoutFocus(createNewCardVaultFragment.getString(R.string.too_many_characters));
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
