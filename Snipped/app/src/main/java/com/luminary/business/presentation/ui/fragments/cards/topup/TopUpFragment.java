package com.luminary.business.presentation.ui.fragments.cards.topup;

import F8.i;
import F8.o;
import Fa.h;
import O9.p;
import U4.b;
import Z6.g;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cards.DailyLimitDomain;
import com.luminary.business.domain.entity.cards.TopUpCommissionDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.topup.TopUpFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import ka.C0966k;
import kotlin.jvm.internal.f;
import t6.v6;

/* compiled from: TopUpFragment.kt */
/* loaded from: classes2.dex */
public final class TopUpFragment extends BaseFragment<v6> {

    /* renamed from: A0, reason: collision with root package name */
    public TopUpCommissionDomain f11824A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f11825B0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f11826n0 = R.layout.fragment_vault_topup;

    /* renamed from: o0, reason: collision with root package name */
    public final h f11827o0 = new h(kotlin.jvm.internal.h.a(Z6.c.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.cards.topup.TopUpFragment$special$$inlined$navArgs$1
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

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f11828p0;

    /* renamed from: q0, reason: collision with root package name */
    public final ArrayList f11829q0;

    /* renamed from: r0, reason: collision with root package name */
    public final ArrayList f11830r0;
    public BankAccountDomain s0;

    /* renamed from: t0, reason: collision with root package name */
    public VaultDomain f11831t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f11832u0;

    /* renamed from: v0, reason: collision with root package name */
    public VaultDomain f11833v0;

    /* renamed from: w0, reason: collision with root package name */
    public final Handler f11834w0;

    /* renamed from: x0, reason: collision with root package name */
    public B2.d f11835x0;

    /* renamed from: y0, reason: collision with root package name */
    public String f11836y0;

    /* renamed from: z0, reason: collision with root package name */
    public String f11837z0;

    /* compiled from: FragmentExt.kt */
    public static final class b implements InterfaceC0646l<TopUpCommissionDomain, p> {
        public b() {
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(TopUpCommissionDomain topUpCommissionDomain) {
            TopUpFragment topUpFragment = TopUpFragment.this;
            topUpFragment.f11824A0 = topUpCommissionDomain;
            topUpFragment.W0();
            return p.f3034a;
        }
    }

    /* compiled from: FragmentExt.kt */
    public static final class c implements InterfaceC0646l<DailyLimitDomain, p> {
        public c() {
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(DailyLimitDomain dailyLimitDomain) {
            VaultDomain vaultDomain;
            VaultDomain vaultDomain2;
            DailyLimitDomain dailyLimitDomain2 = dailyLimitDomain;
            TopUpFragment topUpFragment = TopUpFragment.this;
            Z6.c U02 = topUpFragment.U0();
            String str = null;
            String str2 = (U02 == null || (vaultDomain2 = U02.f4204b) == null) ? null : vaultDomain2.f10782e;
            String plainString = new BigDecimal(String.valueOf(dailyLimitDomain2.f10774a)).toPlainString();
            Z6.c U03 = topUpFragment.U0();
            if (U03 != null && (vaultDomain = U03.f4204b) != null) {
                str = vaultDomain.f10782e;
            }
            topUpFragment.u0().f29729x.setText(topUpFragment.getString(R.string.top_ups_within_the_daily_limit_are_instant, D9.b.o(str2, D9.b.I(plainString, str))));
            return p.f3034a;
        }
    }

    /* compiled from: TopUpFragment.kt */
    public static final class d implements TabLayout.d {
        public d() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String I10;
            TopUpFragment topUpFragment = TopUpFragment.this;
            topUpFragment.f11832u0 = topUpFragment.u0().f29727v.getSelectedTabPosition();
            str = "";
            if (topUpFragment.f11832u0 == 0) {
                o.b(topUpFragment.u0().f29726u);
                o.b(topUpFragment.u0().f29725t);
                topUpFragment.u0().f29723r.setHint(topUpFragment.getString(R.string.select_card_vault));
                v6 u02 = topUpFragment.u0();
                VaultDomain vaultDomain = topUpFragment.f11831t0;
                if (vaultDomain == null || (str3 = vaultDomain.f10781d) == null) {
                    str3 = "";
                }
                u02.f29724s.setText(str3);
                v6 u03 = topUpFragment.u0();
                String str6 = topUpFragment.f11836y0;
                if (str6 == null) {
                    str6 = "";
                }
                u03.f29720o.setText(str6);
                if (topUpFragment.f11831t0 == null) {
                    o.b(topUpFragment.u0().f29728w);
                } else {
                    topUpFragment.u0().f29728w.setVisibility(0);
                    v6 u04 = topUpFragment.u0();
                    VaultDomain vaultDomain2 = topUpFragment.f11831t0;
                    if (vaultDomain2 == null || (str4 = vaultDomain2.f10782e) == null) {
                        str4 = "";
                    }
                    if (vaultDomain2 != null && (str5 = vaultDomain2.f10785h) != null && (I10 = D9.b.I(str5, vaultDomain2.f10782e)) != null) {
                        str = I10;
                    }
                    u04.f29728w.setText(topUpFragment.getString(R.string.available_balance_value, D9.b.o(str4, str)));
                }
            } else {
                topUpFragment.u0().f29723r.setHint(D9.b.B0(topUpFragment.getString(R.string.select_account)));
                topUpFragment.u0().f29725t.setVisibility(0);
                v6 u05 = topUpFragment.u0();
                BankAccountDomain bankAccountDomain = topUpFragment.s0;
                if (bankAccountDomain == null || (str2 = bankAccountDomain.i) == null) {
                    str2 = "";
                }
                u05.f29724s.setText(str2);
                topUpFragment.u0().f29726u.setVisibility(0);
                v6 u06 = topUpFragment.u0();
                String str7 = topUpFragment.f11837z0;
                u06.f29720o.setText(str7 != null ? str7 : "");
                BankAccountDomain bankAccountDomain2 = topUpFragment.s0;
                if (bankAccountDomain2 == null) {
                    o.b(topUpFragment.u0().f29728w);
                    topUpFragment.u0().f29725t.setImageResource(0);
                } else {
                    Integer g10 = F8.b.g(bankAccountDomain2, topUpFragment.requireContext());
                    if (g10 != null) {
                        topUpFragment.u0().f29725t.setImageResource(g10.intValue());
                    }
                    topUpFragment.u0().f29723r.e();
                    topUpFragment.u0().f29728w.setVisibility(0);
                    v6 u07 = topUpFragment.u0();
                    BankAccountDomain bankAccountDomain3 = topUpFragment.s0;
                    u07.f29728w.setText(topUpFragment.getString(R.string.balance, bankAccountDomain3 != null ? F8.b.f(bankAccountDomain3) : null));
                }
            }
            topUpFragment.u0().f29719n.setError(null);
            topUpFragment.W0();
        }
    }

    /* compiled from: TopUpFragment.kt */
    public static final class e implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11847a;

        public e(InterfaceC0646l interfaceC0646l) {
            this.f11847a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11847a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11847a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.cards.topup.TopUpFragment$special$$inlined$viewModel$default$1] */
    public TopUpFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.cards.topup.TopUpFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11828p0 = E.a(this, kotlin.jvm.internal.h.a(g.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.cards.topup.TopUpFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.cards.topup.TopUpFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(g.class), null, null, b.l(this));
            }
        });
        this.f11829q0 = new ArrayList();
        this.f11830r0 = new ArrayList();
        this.f11834w0 = new Handler(Looper.getMainLooper());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.top_up_your_vault);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 28;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.top_up_your_vault);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    public final void T0() {
        Double R = C0966k.R(D9.b.r0(String.valueOf(u0().f29720o.getText())));
        double doubleValue = R != null ? R.doubleValue() : 0.0d;
        VaultDomain vaultDomain = this.f11833v0;
        Integer valueOf = vaultDomain != null ? Integer.valueOf(vaultDomain.f10778a) : null;
        BankAccountDomain bankAccountDomain = this.s0;
        Integer num = bankAccountDomain != null ? bankAccountDomain.f10694a : null;
        if (valueOf == null || num == null || doubleValue == 0.0d) {
            return;
        }
        g V02 = V0();
        int intValue = valueOf.intValue();
        int intValue2 = num.intValue();
        V02.getClass();
        V6.c cVar = new V6.c(V02, intValue2, intValue, doubleValue, 2);
        V02.N0 = cVar;
        cVar.invoke();
    }

    public final Z6.c U0() {
        return (Z6.c) this.f11827o0.getValue();
    }

    public final g V0() {
        return (g) this.f11828p0.getValue();
    }

    public final void W0() {
        BigDecimal bigDecimal;
        VaultDomain vaultDomain;
        String str;
        Double R = C0966k.R(D9.b.r0(String.valueOf(u0().f29720o.getText())));
        double doubleValue = R != null ? R.doubleValue() : 0.0d;
        DailyLimitDomain value = V0().f4225b1.getValue();
        boolean z10 = false;
        this.f11825B0 = (value != null ? value.f10774a : 0.0d) < doubleValue;
        boolean z11 = doubleValue > 0.0d;
        if (this.f11832u0 == 0) {
            z11 = z11 && this.f11831t0 != null && X0();
        }
        if (this.f11832u0 == 1) {
            if (z11 && this.s0 != null && X0()) {
                Double R2 = C0966k.R(D9.b.r0(String.valueOf(u0().f29720o.getText())));
                Double R4 = (this.f11832u0 != 0 || (vaultDomain = this.f11831t0) == null || (str = vaultDomain.f10785h) == null) ? null : C0966k.R(str);
                if (this.f11832u0 == 1) {
                    BankAccountDomain bankAccountDomain = this.s0;
                    R4 = (bankAccountDomain == null || (bigDecimal = bankAccountDomain.f10698e) == null) ? null : Double.valueOf(bigDecimal.doubleValue());
                }
                if (R2 != null) {
                    double doubleValue2 = R2.doubleValue();
                    TopUpCommissionDomain topUpCommissionDomain = this.f11824A0;
                    if (doubleValue2 + (topUpCommissionDomain != null ? topUpCommissionDomain.f10775a : 0.0d) > (R4 != null ? R4.doubleValue() : 0.0d)) {
                        u0().f29719n.setErrorWithoutFocus(getString(R.string.insufficient_funds));
                    } else {
                        u0().f29719n.setError(null);
                        u0().f29728w.setVisibility(0);
                        z10 = true;
                    }
                }
            }
            z11 = z10;
        }
        u0().f29721p.setEnabled(z11);
        u0().f29722q.setEnabled(u0().f29721p.isEnabled());
    }

    public final boolean X0() {
        BigDecimal bigDecimal;
        VaultDomain vaultDomain;
        String str;
        Double R = C0966k.R(D9.b.r0(String.valueOf(u0().f29720o.getText())));
        Double R2 = (this.f11832u0 != 0 || (vaultDomain = this.f11831t0) == null || (str = vaultDomain.f10785h) == null) ? null : C0966k.R(str);
        if (this.f11832u0 == 1) {
            BankAccountDomain bankAccountDomain = this.s0;
            R2 = (bankAccountDomain == null || (bigDecimal = bankAccountDomain.f10698e) == null) ? null : Double.valueOf(bigDecimal.doubleValue());
        }
        if (R == null) {
            return false;
        }
        if (R.doubleValue() > (R2 != null ? R2.doubleValue() : 0.0d)) {
            u0().f29719n.setErrorWithoutFocus(getString(R.string.insufficient_balance));
            return false;
        }
        u0().f29719n.setError(null);
        u0().f29728w.setVisibility(0);
        return true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = V0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        t0(false);
        s0();
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"RestrictedApi"})
    public final void onViewCreated(View view, Bundle bundle) {
        VaultDomain vaultDomain;
        String I10;
        BankAccountDomain bankAccountDomain;
        Integer num;
        String str;
        super.onViewCreated(view, bundle);
        VaultDomain vaultDomain2 = U0().f4204b;
        this.f11833v0 = vaultDomain2;
        Integer num2 = null;
        if (vaultDomain2 != null && (str = vaultDomain2.f10782e) != null) {
            String C10 = D9.b.C(str);
            v6 u02 = u0();
            VaultDomain vaultDomain3 = this.f11833v0;
            u02.f29720o.setCurrencyNameToInput(vaultDomain3 != null ? vaultDomain3.f10782e : null);
            u0().f29720o.setCurrency(C10);
        }
        d dVar = new d();
        u0().f29727v.k(u0().f29727v.h(this.f11832u0), true);
        u0().f29727v.a(dVar);
        final int i = 0;
        o.c(u0().f29724s, 500L, new InterfaceC0635a(this) { // from class: Z6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopUpFragment f4200b;

            {
                this.f4200b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TopUpFragment topUpFragment = this.f4200b;
                        if (topUpFragment.u0().f29727v.getSelectedTabPosition() == 0) {
                            StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(topUpFragment.requireContext(), StatementsSelectorDialog.DialogType.f13047e);
                            statementsSelectorDialog.f13042w = new b(topUpFragment, 3);
                            statementsSelectorDialog.show();
                            ArrayList arrayList = topUpFragment.f11830r0;
                            String string = topUpFragment.getString(R.string.you_don_t_have_other_card_vaults_available_for_top_up);
                            StatementsSelectorDialog.SelectorController selectorController = statementsSelectorDialog.f13038s;
                            if (selectorController != null) {
                                selectorController.setData(arrayList, string);
                            }
                            statementsSelectorDialog.m(topUpFragment.getString(R.string.select_card_vault));
                        } else {
                            StatementsSelectorDialog statementsSelectorDialog2 = new StatementsSelectorDialog(topUpFragment.requireContext(), StatementsSelectorDialog.DialogType.f13044b);
                            statementsSelectorDialog2.f13042w = new b(topUpFragment, 2);
                            statementsSelectorDialog2.show();
                            ArrayList arrayList2 = topUpFragment.f11829q0;
                            String string2 = topUpFragment.getString(R.string.you_don_t_have_accounts_available_for_top_up);
                            StatementsSelectorDialog.SelectorController selectorController2 = statementsSelectorDialog2.f13038s;
                            if (selectorController2 != null) {
                                selectorController2.setData(arrayList2, string2);
                            }
                            statementsSelectorDialog2.m(D9.b.B0(topUpFragment.getString(R.string.select_account)));
                            topUpFragment.W0();
                        }
                        break;
                    case 1:
                        TopUpFragment topUpFragment2 = this.f4200b;
                        String r02 = D9.b.r0(String.valueOf(topUpFragment2.u0().f29720o.getText()));
                        NavController g10 = U4.b.g(topUpFragment2);
                        int i9 = topUpFragment2.U0().f4203a;
                        VaultDomain vaultDomain4 = topUpFragment2.U0().f4204b;
                        int i10 = topUpFragment2.f11832u0;
                        g10.j(new d(i9, vaultDomain4, i10 == 1 ? topUpFragment2.s0 : null, i10 == 0 ? topUpFragment2.f11831t0 : null, topUpFragment2.f11824A0, r02, topUpFragment2.f11825B0));
                        break;
                    default:
                        this.f4200b.u0().f29721p.performClick();
                        break;
                }
                return p.f3034a;
            }
        });
        V0().f4222Y0.observe(getViewLifecycleOwner(), new e(new Z6.b(this, 0)));
        V0().f4223Z0.observe(getViewLifecycleOwner(), new e(new Z6.b(this, 1)));
        V0().f4224a1.observe(getViewLifecycleOwner(), new i(new b()));
        V0().f4225b1.observe(getViewLifecycleOwner(), new i(new c()));
        u0().f29720o.addTextChangedListener(new a());
        final int i9 = 1;
        o.c(u0().f29721p, 500L, new InterfaceC0635a(this) { // from class: Z6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopUpFragment f4200b;

            {
                this.f4200b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        TopUpFragment topUpFragment = this.f4200b;
                        if (topUpFragment.u0().f29727v.getSelectedTabPosition() == 0) {
                            StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(topUpFragment.requireContext(), StatementsSelectorDialog.DialogType.f13047e);
                            statementsSelectorDialog.f13042w = new b(topUpFragment, 3);
                            statementsSelectorDialog.show();
                            ArrayList arrayList = topUpFragment.f11830r0;
                            String string = topUpFragment.getString(R.string.you_don_t_have_other_card_vaults_available_for_top_up);
                            StatementsSelectorDialog.SelectorController selectorController = statementsSelectorDialog.f13038s;
                            if (selectorController != null) {
                                selectorController.setData(arrayList, string);
                            }
                            statementsSelectorDialog.m(topUpFragment.getString(R.string.select_card_vault));
                        } else {
                            StatementsSelectorDialog statementsSelectorDialog2 = new StatementsSelectorDialog(topUpFragment.requireContext(), StatementsSelectorDialog.DialogType.f13044b);
                            statementsSelectorDialog2.f13042w = new b(topUpFragment, 2);
                            statementsSelectorDialog2.show();
                            ArrayList arrayList2 = topUpFragment.f11829q0;
                            String string2 = topUpFragment.getString(R.string.you_don_t_have_accounts_available_for_top_up);
                            StatementsSelectorDialog.SelectorController selectorController2 = statementsSelectorDialog2.f13038s;
                            if (selectorController2 != null) {
                                selectorController2.setData(arrayList2, string2);
                            }
                            statementsSelectorDialog2.m(D9.b.B0(topUpFragment.getString(R.string.select_account)));
                            topUpFragment.W0();
                        }
                        break;
                    case 1:
                        TopUpFragment topUpFragment2 = this.f4200b;
                        String r02 = D9.b.r0(String.valueOf(topUpFragment2.u0().f29720o.getText()));
                        NavController g10 = U4.b.g(topUpFragment2);
                        int i92 = topUpFragment2.U0().f4203a;
                        VaultDomain vaultDomain4 = topUpFragment2.U0().f4204b;
                        int i10 = topUpFragment2.f11832u0;
                        g10.j(new d(i92, vaultDomain4, i10 == 1 ? topUpFragment2.s0 : null, i10 == 0 ? topUpFragment2.f11831t0 : null, topUpFragment2.f11824A0, r02, topUpFragment2.f11825B0));
                        break;
                    default:
                        this.f4200b.u0().f29721p.performClick();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i10 = 2;
        o.c(u0().f29722q, 500L, new InterfaceC0635a(this) { // from class: Z6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopUpFragment f4200b;

            {
                this.f4200b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        TopUpFragment topUpFragment = this.f4200b;
                        if (topUpFragment.u0().f29727v.getSelectedTabPosition() == 0) {
                            StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(topUpFragment.requireContext(), StatementsSelectorDialog.DialogType.f13047e);
                            statementsSelectorDialog.f13042w = new b(topUpFragment, 3);
                            statementsSelectorDialog.show();
                            ArrayList arrayList = topUpFragment.f11830r0;
                            String string = topUpFragment.getString(R.string.you_don_t_have_other_card_vaults_available_for_top_up);
                            StatementsSelectorDialog.SelectorController selectorController = statementsSelectorDialog.f13038s;
                            if (selectorController != null) {
                                selectorController.setData(arrayList, string);
                            }
                            statementsSelectorDialog.m(topUpFragment.getString(R.string.select_card_vault));
                        } else {
                            StatementsSelectorDialog statementsSelectorDialog2 = new StatementsSelectorDialog(topUpFragment.requireContext(), StatementsSelectorDialog.DialogType.f13044b);
                            statementsSelectorDialog2.f13042w = new b(topUpFragment, 2);
                            statementsSelectorDialog2.show();
                            ArrayList arrayList2 = topUpFragment.f11829q0;
                            String string2 = topUpFragment.getString(R.string.you_don_t_have_accounts_available_for_top_up);
                            StatementsSelectorDialog.SelectorController selectorController2 = statementsSelectorDialog2.f13038s;
                            if (selectorController2 != null) {
                                selectorController2.setData(arrayList2, string2);
                            }
                            statementsSelectorDialog2.m(D9.b.B0(topUpFragment.getString(R.string.select_account)));
                            topUpFragment.W0();
                        }
                        break;
                    case 1:
                        TopUpFragment topUpFragment2 = this.f4200b;
                        String r02 = D9.b.r0(String.valueOf(topUpFragment2.u0().f29720o.getText()));
                        NavController g10 = U4.b.g(topUpFragment2);
                        int i92 = topUpFragment2.U0().f4203a;
                        VaultDomain vaultDomain4 = topUpFragment2.U0().f4204b;
                        int i102 = topUpFragment2.f11832u0;
                        g10.j(new d(i92, vaultDomain4, i102 == 1 ? topUpFragment2.s0 : null, i102 == 0 ? topUpFragment2.f11831t0 : null, topUpFragment2.f11824A0, r02, topUpFragment2.f11825B0));
                        break;
                    default:
                        this.f4200b.u0().f29721p.performClick();
                        break;
                }
                return p.f3034a;
            }
        });
        g V02 = V0();
        VaultDomain vaultDomain4 = this.f11833v0;
        if (vaultDomain4 != null && (num = vaultDomain4.f10793q) != null) {
            num2 = num;
        }
        A7.c cVar = new A7.c(8, V02, num2);
        V02.f418J0 = cVar;
        cVar.invoke();
        VaultDomain vaultDomain5 = U0().f4204b;
        if (vaultDomain5 != null) {
            g V03 = V0();
            Z6.e eVar = new Z6.e(V03, vaultDomain5.f10778a, 0);
            V03.f420L0 = eVar;
            eVar.invoke();
        }
        TabLayout.g h9 = u0().f29727v.h(1);
        if (h9 != null) {
            h9.b(D9.b.B0(getString(R.string.from_account)));
        }
        if (this.f11832u0 == 1 && (bankAccountDomain = this.s0) != null) {
            u0().f29725t.setVisibility(0);
            Integer g10 = F8.b.g(bankAccountDomain, requireContext());
            if (g10 != null) {
                u0().f29725t.setImageResource(g10.intValue());
            }
            u0().f29726u.setVisibility(0);
            u0().f29728w.setVisibility(0);
            u0().f29728w.setText(getString(R.string.balance, F8.b.f(bankAccountDomain)));
        }
        if (this.f11832u0 != 0 || (vaultDomain = this.f11831t0) == null) {
            return;
        }
        u0().f29728w.setVisibility(0);
        v6 u03 = u0();
        String str2 = "";
        String str3 = vaultDomain.f10782e;
        String str4 = str3 == null ? "" : str3;
        String str5 = vaultDomain.f10785h;
        if (str5 != null && (I10 = D9.b.I(str5, str3)) != null) {
            str2 = I10;
        }
        u03.f29728w.setText(getString(R.string.available_balance_value, D9.b.o(str4, str2)));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11826n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(false);
        s0();
        u0().f29721p.setVisibility(0);
        o.b(u0().f29722q);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f29721p);
        u0().f29722q.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            TopUpFragment topUpFragment = TopUpFragment.this;
            if (topUpFragment.f11832u0 != 1) {
                topUpFragment.f11836y0 = D9.b.r0(String.valueOf(charSequence));
                topUpFragment.W0();
                return;
            }
            topUpFragment.f11837z0 = D9.b.r0(String.valueOf(charSequence));
            if (!topUpFragment.X0()) {
                topUpFragment.W0();
                return;
            }
            B2.d dVar = topUpFragment.f11835x0;
            Handler handler = topUpFragment.f11834w0;
            if (dVar != null) {
                handler.removeCallbacks(dVar);
            }
            B2.d dVar2 = new B2.d(topUpFragment, 18);
            topUpFragment.f11835x0 = dVar2;
            handler.postDelayed(dVar2, 1000L);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
