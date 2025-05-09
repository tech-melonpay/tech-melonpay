package com.luminary.business.presentation.ui.fragments.crypto.buy_external_account;

import C.v;
import F8.o;
import O9.p;
import U4.b;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.BuyExternalAccountDetailsFragment;
import com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import i7.C0827b;
import i7.C0830e;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.O2;
import y8.DialogC1631l;

/* compiled from: BuyExternalAccountDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class BuyExternalAccountDetailsFragment extends BaseFragment<O2> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11952n0 = R.layout.fragment_buy_crypto_external_details;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11953o0;

    /* renamed from: p0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a f11954p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f11955q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f11956r0;

    /* compiled from: BuyExternalAccountDetailsFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11961a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f11961a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11961a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11961a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.BuyExternalAccountDetailsFragment$special$$inlined$viewModel$default$1] */
    public BuyExternalAccountDetailsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.BuyExternalAccountDetailsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11953o0 = E.a(this, h.a(C0830e.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.BuyExternalAccountDetailsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.BuyExternalAccountDetailsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C0830e.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar = this.f11954p0;
        toolbarStatus.f13263a = getString(K3.a.c(aVar != null ? aVar.f11964c : null) ? R.string.fiat_to_crypto : R.string.crypto_to_fiat);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar = this.f11954p0;
        toolbarStatus.f13263a = getString(K3.a.c(aVar != null ? aVar.f11964c : null) ? R.string.fiat_to_crypto : R.string.crypto_to_fiat);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    public final C0830e T0() {
        return (C0830e) this.f11953o0.getValue();
    }

    public final void U0() {
        O2 u02 = u0();
        String str = this.f11956r0;
        u02.f28256o.setEnabled((str == null || str.length() == 0 || T0().f21501W0.getValue() == null) ? false : true);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11954p0 = a.C0119a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Integer z10;
        super.onViewCreated(view, bundle);
        final int i = 0;
        T0().f426S0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: i7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BuyExternalAccountDetailsFragment f21484b;

            {
                this.f21484b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str3;
                String p10;
                String str4;
                String str5;
                String str6;
                String str7;
                Map<String, CryptoExchangeDomain.a> map;
                switch (i) {
                    case 0:
                        if (((J5.b) obj) != null) {
                            BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment = this.f21484b;
                            buyExternalAccountDetailsFragment.T0().f426S0.postValue(null);
                            buyExternalAccountDetailsFragment.u0().f28258q.setErrorWithoutFocus(buyExternalAccountDetailsFragment.getString(R.string.we_can_not_accept_payments, buyExternalAccountDetailsFragment.f11955q0));
                            buyExternalAccountDetailsFragment.f11956r0 = null;
                            buyExternalAccountDetailsFragment.u0().f28258q.setErrorIconDrawable((Drawable) null);
                            buyExternalAccountDetailsFragment.U0();
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment2 = this.f21484b;
                        com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar = buyExternalAccountDetailsFragment2.f11954p0;
                        if (K3.a.c(aVar != null ? aVar.f11965d : null)) {
                            com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar2 = buyExternalAccountDetailsFragment2.f11954p0;
                            p10 = v.n(K3.a.a(aVar2 != null ? aVar2.f11965d : null), D9.b.I(new BigDecimal(String.valueOf(buyExternalAccountDetailsFragment2.f11954p0.f11966e)).toString(), buyExternalAccountDetailsFragment2.f11954p0.f11965d));
                        } else {
                            String I10 = D9.b.I(new BigDecimal(String.valueOf(buyExternalAccountDetailsFragment2.f11954p0.f11966e)).toString(), buyExternalAccountDetailsFragment2.f11954p0.f11965d);
                            com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar3 = buyExternalAccountDetailsFragment2.f11954p0;
                            if (aVar3 == null || (str3 = aVar3.f11965d) == null) {
                                str3 = "";
                            }
                            p10 = v.p(I10, " ", str3);
                        }
                        DialogC1631l dialogC1631l = new DialogC1631l(buyExternalAccountDetailsFragment2.requireContext(), buyExternalAccountDetailsFragment2.getString(R.string.your_transacton_will_be_completed_within_hours, 24), 86400L);
                        dialogC1631l.f31154s.f29568r.setText(buyExternalAccountDetailsFragment2.getString(R.string.is_on_the_way, p10));
                        dialogC1631l.f31155t = new C0827b(buyExternalAccountDetailsFragment2, 3);
                        dialogC1631l.show();
                        break;
                    default:
                        CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) obj;
                        BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment3 = this.f21484b;
                        buyExternalAccountDetailsFragment3.u0().f28257p.setVisibility(0);
                        CryptoExchangeDomain.a aVar4 = null;
                        buyExternalAccountDetailsFragment3.u0().f28258q.setError(null);
                        if (cryptoExchangeDomain != null && (map = cryptoExchangeDomain.f11041z) != null) {
                            aVar4 = map.get("international");
                        }
                        buyExternalAccountDetailsFragment3.u0().f28262u.setText(buyExternalAccountDetailsFragment3.getString(R.string.amount));
                        buyExternalAccountDetailsFragment3.u0().f28262u.setText(buyExternalAccountDetailsFragment3.getString(R.string.amount));
                        buyExternalAccountDetailsFragment3.u0().f28250B.setText(buyExternalAccountDetailsFragment3.getString(R.string.beneficiary));
                        O2 u02 = buyExternalAccountDetailsFragment3.u0();
                        String str8 = "";
                        if (aVar4 == null || (str4 = aVar4.f11066c) == null) {
                            str4 = "";
                        }
                        u02.f28251C.setText(str4);
                        buyExternalAccountDetailsFragment3.u0().f28252D.setText(buyExternalAccountDetailsFragment3.getString(R.string.iban));
                        O2 u03 = buyExternalAccountDetailsFragment3.u0();
                        if (aVar4 == null || (str5 = aVar4.f11065b) == null) {
                            str5 = "";
                        }
                        u03.f28253E.setText(str5);
                        buyExternalAccountDetailsFragment3.u0().f28264w.setText(buyExternalAccountDetailsFragment3.getString(R.string.swift_bic));
                        O2 u04 = buyExternalAccountDetailsFragment3.u0();
                        if (aVar4 == null || (str6 = aVar4.f11068e) == null) {
                            str6 = "";
                        }
                        u04.f28265x.setText(str6);
                        buyExternalAccountDetailsFragment3.u0().f28260s.setText(buyExternalAccountDetailsFragment3.getString(R.string.reference));
                        O2 u05 = buyExternalAccountDetailsFragment3.u0();
                        if (aVar4 != null && (str7 = aVar4.f11071h) != null) {
                            str8 = str7;
                        }
                        u05.f28261t.setText(str8);
                        buyExternalAccountDetailsFragment3.U0();
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i9 = 1;
        T0().f21502X0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: i7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BuyExternalAccountDetailsFragment f21484b;

            {
                this.f21484b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str3;
                String p10;
                String str4;
                String str5;
                String str6;
                String str7;
                Map<String, CryptoExchangeDomain.a> map;
                switch (i9) {
                    case 0:
                        if (((J5.b) obj) != null) {
                            BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment = this.f21484b;
                            buyExternalAccountDetailsFragment.T0().f426S0.postValue(null);
                            buyExternalAccountDetailsFragment.u0().f28258q.setErrorWithoutFocus(buyExternalAccountDetailsFragment.getString(R.string.we_can_not_accept_payments, buyExternalAccountDetailsFragment.f11955q0));
                            buyExternalAccountDetailsFragment.f11956r0 = null;
                            buyExternalAccountDetailsFragment.u0().f28258q.setErrorIconDrawable((Drawable) null);
                            buyExternalAccountDetailsFragment.U0();
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment2 = this.f21484b;
                        com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar = buyExternalAccountDetailsFragment2.f11954p0;
                        if (K3.a.c(aVar != null ? aVar.f11965d : null)) {
                            com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar2 = buyExternalAccountDetailsFragment2.f11954p0;
                            p10 = v.n(K3.a.a(aVar2 != null ? aVar2.f11965d : null), D9.b.I(new BigDecimal(String.valueOf(buyExternalAccountDetailsFragment2.f11954p0.f11966e)).toString(), buyExternalAccountDetailsFragment2.f11954p0.f11965d));
                        } else {
                            String I10 = D9.b.I(new BigDecimal(String.valueOf(buyExternalAccountDetailsFragment2.f11954p0.f11966e)).toString(), buyExternalAccountDetailsFragment2.f11954p0.f11965d);
                            com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar3 = buyExternalAccountDetailsFragment2.f11954p0;
                            if (aVar3 == null || (str3 = aVar3.f11965d) == null) {
                                str3 = "";
                            }
                            p10 = v.p(I10, " ", str3);
                        }
                        DialogC1631l dialogC1631l = new DialogC1631l(buyExternalAccountDetailsFragment2.requireContext(), buyExternalAccountDetailsFragment2.getString(R.string.your_transacton_will_be_completed_within_hours, 24), 86400L);
                        dialogC1631l.f31154s.f29568r.setText(buyExternalAccountDetailsFragment2.getString(R.string.is_on_the_way, p10));
                        dialogC1631l.f31155t = new C0827b(buyExternalAccountDetailsFragment2, 3);
                        dialogC1631l.show();
                        break;
                    default:
                        CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) obj;
                        BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment3 = this.f21484b;
                        buyExternalAccountDetailsFragment3.u0().f28257p.setVisibility(0);
                        CryptoExchangeDomain.a aVar4 = null;
                        buyExternalAccountDetailsFragment3.u0().f28258q.setError(null);
                        if (cryptoExchangeDomain != null && (map = cryptoExchangeDomain.f11041z) != null) {
                            aVar4 = map.get("international");
                        }
                        buyExternalAccountDetailsFragment3.u0().f28262u.setText(buyExternalAccountDetailsFragment3.getString(R.string.amount));
                        buyExternalAccountDetailsFragment3.u0().f28262u.setText(buyExternalAccountDetailsFragment3.getString(R.string.amount));
                        buyExternalAccountDetailsFragment3.u0().f28250B.setText(buyExternalAccountDetailsFragment3.getString(R.string.beneficiary));
                        O2 u02 = buyExternalAccountDetailsFragment3.u0();
                        String str8 = "";
                        if (aVar4 == null || (str4 = aVar4.f11066c) == null) {
                            str4 = "";
                        }
                        u02.f28251C.setText(str4);
                        buyExternalAccountDetailsFragment3.u0().f28252D.setText(buyExternalAccountDetailsFragment3.getString(R.string.iban));
                        O2 u03 = buyExternalAccountDetailsFragment3.u0();
                        if (aVar4 == null || (str5 = aVar4.f11065b) == null) {
                            str5 = "";
                        }
                        u03.f28253E.setText(str5);
                        buyExternalAccountDetailsFragment3.u0().f28264w.setText(buyExternalAccountDetailsFragment3.getString(R.string.swift_bic));
                        O2 u04 = buyExternalAccountDetailsFragment3.u0();
                        if (aVar4 == null || (str6 = aVar4.f11068e) == null) {
                            str6 = "";
                        }
                        u04.f28265x.setText(str6);
                        buyExternalAccountDetailsFragment3.u0().f28260s.setText(buyExternalAccountDetailsFragment3.getString(R.string.reference));
                        O2 u05 = buyExternalAccountDetailsFragment3.u0();
                        if (aVar4 != null && (str7 = aVar4.f11071h) != null) {
                            str8 = str7;
                        }
                        u05.f28261t.setText(str8);
                        buyExternalAccountDetailsFragment3.U0();
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 2;
        T0().f21501W0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: i7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BuyExternalAccountDetailsFragment f21484b;

            {
                this.f21484b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str3;
                String p10;
                String str4;
                String str5;
                String str6;
                String str7;
                Map<String, CryptoExchangeDomain.a> map;
                switch (i10) {
                    case 0:
                        if (((J5.b) obj) != null) {
                            BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment = this.f21484b;
                            buyExternalAccountDetailsFragment.T0().f426S0.postValue(null);
                            buyExternalAccountDetailsFragment.u0().f28258q.setErrorWithoutFocus(buyExternalAccountDetailsFragment.getString(R.string.we_can_not_accept_payments, buyExternalAccountDetailsFragment.f11955q0));
                            buyExternalAccountDetailsFragment.f11956r0 = null;
                            buyExternalAccountDetailsFragment.u0().f28258q.setErrorIconDrawable((Drawable) null);
                            buyExternalAccountDetailsFragment.U0();
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment2 = this.f21484b;
                        com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar = buyExternalAccountDetailsFragment2.f11954p0;
                        if (K3.a.c(aVar != null ? aVar.f11965d : null)) {
                            com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar2 = buyExternalAccountDetailsFragment2.f11954p0;
                            p10 = v.n(K3.a.a(aVar2 != null ? aVar2.f11965d : null), D9.b.I(new BigDecimal(String.valueOf(buyExternalAccountDetailsFragment2.f11954p0.f11966e)).toString(), buyExternalAccountDetailsFragment2.f11954p0.f11965d));
                        } else {
                            String I10 = D9.b.I(new BigDecimal(String.valueOf(buyExternalAccountDetailsFragment2.f11954p0.f11966e)).toString(), buyExternalAccountDetailsFragment2.f11954p0.f11965d);
                            com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar3 = buyExternalAccountDetailsFragment2.f11954p0;
                            if (aVar3 == null || (str3 = aVar3.f11965d) == null) {
                                str3 = "";
                            }
                            p10 = v.p(I10, " ", str3);
                        }
                        DialogC1631l dialogC1631l = new DialogC1631l(buyExternalAccountDetailsFragment2.requireContext(), buyExternalAccountDetailsFragment2.getString(R.string.your_transacton_will_be_completed_within_hours, 24), 86400L);
                        dialogC1631l.f31154s.f29568r.setText(buyExternalAccountDetailsFragment2.getString(R.string.is_on_the_way, p10));
                        dialogC1631l.f31155t = new C0827b(buyExternalAccountDetailsFragment2, 3);
                        dialogC1631l.show();
                        break;
                    default:
                        CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) obj;
                        BuyExternalAccountDetailsFragment buyExternalAccountDetailsFragment3 = this.f21484b;
                        buyExternalAccountDetailsFragment3.u0().f28257p.setVisibility(0);
                        CryptoExchangeDomain.a aVar4 = null;
                        buyExternalAccountDetailsFragment3.u0().f28258q.setError(null);
                        if (cryptoExchangeDomain != null && (map = cryptoExchangeDomain.f11041z) != null) {
                            aVar4 = map.get("international");
                        }
                        buyExternalAccountDetailsFragment3.u0().f28262u.setText(buyExternalAccountDetailsFragment3.getString(R.string.amount));
                        buyExternalAccountDetailsFragment3.u0().f28262u.setText(buyExternalAccountDetailsFragment3.getString(R.string.amount));
                        buyExternalAccountDetailsFragment3.u0().f28250B.setText(buyExternalAccountDetailsFragment3.getString(R.string.beneficiary));
                        O2 u02 = buyExternalAccountDetailsFragment3.u0();
                        String str8 = "";
                        if (aVar4 == null || (str4 = aVar4.f11066c) == null) {
                            str4 = "";
                        }
                        u02.f28251C.setText(str4);
                        buyExternalAccountDetailsFragment3.u0().f28252D.setText(buyExternalAccountDetailsFragment3.getString(R.string.iban));
                        O2 u03 = buyExternalAccountDetailsFragment3.u0();
                        if (aVar4 == null || (str5 = aVar4.f11065b) == null) {
                            str5 = "";
                        }
                        u03.f28253E.setText(str5);
                        buyExternalAccountDetailsFragment3.u0().f28264w.setText(buyExternalAccountDetailsFragment3.getString(R.string.swift_bic));
                        O2 u04 = buyExternalAccountDetailsFragment3.u0();
                        if (aVar4 == null || (str6 = aVar4.f11068e) == null) {
                            str6 = "";
                        }
                        u04.f28265x.setText(str6);
                        buyExternalAccountDetailsFragment3.u0().f28260s.setText(buyExternalAccountDetailsFragment3.getString(R.string.reference));
                        O2 u05 = buyExternalAccountDetailsFragment3.u0();
                        if (aVar4 != null && (str7 = aVar4.f11071h) != null) {
                            str8 = str7;
                        }
                        u05.f28261t.setText(str8);
                        buyExternalAccountDetailsFragment3.U0();
                        break;
                }
                return p.f3034a;
            }
        }));
        com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar = this.f11954p0;
        if (aVar != null && (str2 = aVar.f11965d) != null && (z10 = D9.b.z(str2)) != null) {
            u0().f28266y.setImageResource(z10.intValue());
        }
        O2 u02 = u0();
        com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar2 = this.f11954p0;
        u02.f28254F.setText(getString(R.string.exchange_two_currency, aVar2 != null ? aVar2.f11964c : null, aVar2 != null ? aVar2.f11965d : null));
        u0().f28255n.setText(D9.b.v0("+", D9.b.v(new BigDecimal(String.valueOf(this.f11954p0.f11966e)).toString()), D9.b.u(new BigDecimal(String.valueOf(this.f11954p0.f11966e)).toString(), this.f11954p0.f11965d), this.f11954p0.f11965d, 25, 16, false, false, false, 384));
        O2 u03 = u0();
        com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar3 = this.f11954p0;
        u03.f28263v.setText(v.n(K3.a.a(aVar3 != null ? aVar3.f11965d : null), D9.b.I(new BigDecimal(String.valueOf(this.f11954p0.f11966e)).toString(), this.f11954p0.f11965d)));
        O2 u04 = u0();
        com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a aVar4 = this.f11954p0;
        u04.f28249A.setText(getString(R.string.send_to, v.n((aVar4 == null || (str = aVar4.f11964c) == null) ? "" : K3.a.a(str), D9.b.I(new BigDecimal(String.valueOf(this.f11954p0.f11967f)).toString(), this.f11954p0.f11964c))));
        o.c(u0().f28259r, 500L, new C0827b(this, 0));
        E.b(this, "country", new B6.h(this, 20));
        o.c(u0().f28256o, 500L, new C0827b(this, 1));
        o.c(u0().f28267z, 500L, new C0827b(this, 2));
        U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11952n0;
    }
}
