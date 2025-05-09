package com.luminary.business.presentation.ui.fragments.crypto.sell_external_account;

import A8.e;
import B6.g;
import B6.h;
import C.v;
import D9.b;
import F8.o;
import O9.p;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.SellExternalAccountInfoFragment;
import com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import t6.K5;

/* compiled from: SellExternalAccountInfoFragment.kt */
/* loaded from: classes2.dex */
public final class SellExternalAccountInfoFragment extends BaseFragment<K5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12129n0 = R.layout.fragment_sell_crypto_external_info;

    /* renamed from: o0, reason: collision with root package name */
    public a f12130o0;

    /* renamed from: p0, reason: collision with root package name */
    public CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain f12131p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f12132q0;

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        a aVar = this.f12130o0;
        toolbarStatus.f13263a = getString(K3.a.c(aVar != null ? aVar.f12155c : null) ? R.string.fiat_to_crypto : R.string.crypto_to_fiat);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13269g = new e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(19), 76);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        a aVar = this.f12130o0;
        toolbarStatus.f13263a = getString(K3.a.c(aVar != null ? aVar.f12155c : null) ? R.string.fiat_to_crypto : R.string.crypto_to_fiat);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13269g = new e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(18), 76);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12130o0 = a.C0125a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        CryptoAccountDomain cryptoAccountDomain;
        CryptoAccountDomain cryptoAccountDomain2;
        CryptoAccountDomain cryptoAccountDomain3;
        String str6;
        Integer M8;
        String str7;
        Integer z10;
        super.onViewCreated(view, bundle);
        a aVar = this.f12130o0;
        if (aVar != null && (str7 = aVar.f12155c) != null && (z10 = b.z(str7)) != null) {
            u0().f28085v.setImageResource(z10.intValue());
        }
        a aVar2 = this.f12130o0;
        if (aVar2 != null && (str6 = aVar2.f12156d) != null && (M8 = b.M(requireContext(), str6)) != null) {
            u0().f28084u.setImageResource(M8.intValue());
        }
        K5 u02 = u0();
        a aVar3 = this.f12130o0;
        String str8 = "";
        if (aVar3 == null || (cryptoAccountDomain3 = aVar3.f12153a) == null || (str = cryptoAccountDomain3.f10969g) == null) {
            str = "";
        }
        u02.f28087x.setText(str);
        K5 u03 = u0();
        a aVar4 = this.f12130o0;
        if (aVar4 == null || (cryptoAccountDomain2 = aVar4.f12153a) == null || (str2 = cryptoAccountDomain2.f10968f) == null) {
            str2 = "";
        }
        u03.f28083t.setText(str2);
        K5 u04 = u0();
        a aVar5 = this.f12130o0;
        if (aVar5 == null || (cryptoAccountDomain = aVar5.f12153a) == null || (str3 = cryptoAccountDomain.f10965c) == null) {
            str3 = "";
        }
        u04.f28075A.setText(str3);
        K5 u05 = u0();
        a aVar6 = this.f12130o0;
        if (aVar6 == null || (str4 = aVar6.f12156d) == null) {
            str4 = "";
        }
        u05.f28076B.setText(getString(R.string.select_name_account, str4));
        a aVar7 = this.f12130o0;
        BankAccountDomain bankAccountDomain = aVar7 != null ? aVar7.f12154b : null;
        if (bankAccountDomain != null) {
            u0().f28079p.setText(bankAccountDomain.i);
            u0().f28078o.setText(b.D(bankAccountDomain.f10701h));
        }
        K5 u06 = u0();
        a aVar8 = this.f12130o0;
        String v10 = b.v(String.valueOf(aVar8 != null ? new BigDecimal(String.valueOf(aVar8.f12157e)) : null));
        a aVar9 = this.f12130o0;
        String valueOf = String.valueOf(aVar9 != null ? new BigDecimal(String.valueOf(aVar9.f12157e)) : null);
        a aVar10 = this.f12130o0;
        String u6 = b.u(valueOf, aVar10 != null ? aVar10.f12156d : null);
        a aVar11 = this.f12130o0;
        u06.f28077n.setText(b.v0("+", v10, u6, aVar11 != null ? aVar11.f12156d : null, 15, 10, false, false, false, 384));
        u0().f28080q.setText(b.v0("-", b.v(new BigDecimal(String.valueOf(this.f12130o0.f12158f)).toString()), b.u(new BigDecimal(String.valueOf(this.f12130o0.f12158f)).toString(), this.f12130o0.f12155c), this.f12130o0.f12155c, 15, 10, false, false, false, 384));
        a aVar12 = this.f12130o0;
        if (aVar12 == null || !aVar12.i) {
            K5 u07 = u0();
            BankAccountDomain bankAccountDomain2 = this.f12130o0.f12154b;
            if (bankAccountDomain2 != null && (str5 = bankAccountDomain2.i) != null) {
                str8 = str5;
            }
            u07.f28079p.setText(str8);
            u0().f28078o.setText(b.D(this.f12130o0.f12156d));
            o.b(u0().f28086w);
        } else {
            u0().f28086w.setVisibility(0);
            u0().f28079p.setText(this.f12130o0.f12156d);
            u0().f28078o.setText(b.A(this.f12130o0.f12156d));
        }
        final int i = 0;
        o.c(u0().f28086w, 500L, new InterfaceC0635a(this) { // from class: r7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SellExternalAccountInfoFragment f26300b;

            {
                this.f26300b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SellExternalAccountInfoFragment sellExternalAccountInfoFragment = this.f26300b;
                        NavController g10 = U4.b.g(sellExternalAccountInfoFragment);
                        com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.a aVar13 = sellExternalAccountInfoFragment.f12130o0;
                        Bundle g11 = v.g(g10);
                        g11.putString(FirebaseAnalytics.Param.CURRENCY, aVar13.f12156d);
                        g10.i(R.id.action_sellExternalAccountInfoFragment_to_sellExternalAccountSelectFragment, g11);
                        break;
                    default:
                        SellExternalAccountInfoFragment sellExternalAccountInfoFragment2 = this.f26300b;
                        NavController g12 = U4.b.g(sellExternalAccountInfoFragment2);
                        com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.a aVar14 = sellExternalAccountInfoFragment2.f12130o0;
                        boolean z11 = sellExternalAccountInfoFragment2.f12132q0;
                        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountInfoFragment2.f12131p0;
                        g12.j(new C1154b(aVar14.f12153a, aVar14.f12154b, aVar14.f12155c, aVar14.f12156d, aVar14.f12157e, aVar14.f12158f, aVar14.f12159g, aVar14.f12160h, aVar14.i, z11, externalAccountRequisitesDomain));
                        break;
                }
                return p.f3034a;
            }
        });
        final int i9 = 1;
        o.c(u0().f28081r, 500L, new InterfaceC0635a(this) { // from class: r7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SellExternalAccountInfoFragment f26300b;

            {
                this.f26300b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        SellExternalAccountInfoFragment sellExternalAccountInfoFragment = this.f26300b;
                        NavController g10 = U4.b.g(sellExternalAccountInfoFragment);
                        com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.a aVar13 = sellExternalAccountInfoFragment.f12130o0;
                        Bundle g11 = v.g(g10);
                        g11.putString(FirebaseAnalytics.Param.CURRENCY, aVar13.f12156d);
                        g10.i(R.id.action_sellExternalAccountInfoFragment_to_sellExternalAccountSelectFragment, g11);
                        break;
                    default:
                        SellExternalAccountInfoFragment sellExternalAccountInfoFragment2 = this.f26300b;
                        NavController g12 = U4.b.g(sellExternalAccountInfoFragment2);
                        com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.a aVar14 = sellExternalAccountInfoFragment2.f12130o0;
                        boolean z11 = sellExternalAccountInfoFragment2.f12132q0;
                        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountInfoFragment2.f12131p0;
                        g12.j(new C1154b(aVar14.f12153a, aVar14.f12154b, aVar14.f12155c, aVar14.f12156d, aVar14.f12157e, aVar14.f12158f, aVar14.f12159g, aVar14.f12160h, aVar14.i, z11, externalAccountRequisitesDomain));
                        break;
                }
                return p.f3034a;
            }
        });
        E.b(this, "payment", new h(this, 26));
        u0().f28081r.setEnabled((this.f12130o0.i && this.f12131p0 == null) ? false : true);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12129n0;
    }
}
