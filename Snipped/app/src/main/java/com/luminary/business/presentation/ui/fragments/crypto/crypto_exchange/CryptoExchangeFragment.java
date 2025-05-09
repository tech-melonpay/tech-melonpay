package com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange;

import B6.g;
import C.v;
import D7.e;
import F8.o;
import J5.b;
import M6.s;
import O9.f;
import O9.p;
import U4.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Predicate;
import k0.C0913a;
import ka.C0966k;
import ka.C0967l;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.h;
import m7.C1056a;
import m7.C1057b;
import m7.k;
import r5.C1150a;
import t6.E3;
import w5.C1572a;

/* compiled from: CryptoExchangeFragment.kt */
/* loaded from: classes2.dex */
public final class CryptoExchangeFragment extends BaseFragment<E3> {

    /* renamed from: A0, reason: collision with root package name */
    public CryptoAccountDomain f12017A0;

    /* renamed from: B0, reason: collision with root package name */
    public CryptoExchangeFragment$Companion$DirectionType f12018B0;

    /* renamed from: C0, reason: collision with root package name */
    public Boolean f12019C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f12020D0;

    /* renamed from: E0, reason: collision with root package name */
    public String f12021E0;

    /* renamed from: F0, reason: collision with root package name */
    public String f12022F0;

    /* renamed from: G0, reason: collision with root package name */
    public Float f12023G0;

    /* renamed from: H0, reason: collision with root package name */
    public String f12024H0;

    /* renamed from: I0, reason: collision with root package name */
    public Timer f12025I0;

    /* renamed from: J0, reason: collision with root package name */
    public final Handler f12026J0;

    /* renamed from: K0, reason: collision with root package name */
    public m7.c f12027K0;

    /* renamed from: L0, reason: collision with root package name */
    public androidx.appcompat.app.b f12028L0;

    /* renamed from: M0, reason: collision with root package name */
    public c f12029M0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f12030n0 = R.layout.fragment_crypto_exchange;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12031o0;

    /* renamed from: p0, reason: collision with root package name */
    public final f f12032p0;

    /* renamed from: q0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a f12033q0;

    /* renamed from: r0, reason: collision with root package name */
    public Double f12034r0;
    public final ArrayList s0;

    /* renamed from: t0, reason: collision with root package name */
    public final ArrayList f12035t0;

    /* renamed from: u0, reason: collision with root package name */
    public final ArrayList f12036u0;

    /* renamed from: v0, reason: collision with root package name */
    public final ArrayList f12037v0;

    /* renamed from: w0, reason: collision with root package name */
    public BankAccountDomain f12038w0;

    /* renamed from: x0, reason: collision with root package name */
    public CryptoAccountDomain f12039x0;

    /* renamed from: y0, reason: collision with root package name */
    public Double f12040y0;

    /* renamed from: z0, reason: collision with root package name */
    public BankAccountDomain f12041z0;

    /* compiled from: Timer.kt */
    public static final class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            CryptoExchangeFragment.this.Z0();
        }
    }

    /* compiled from: CryptoExchangeFragment.kt */
    public static final class b implements TabLayout.d {
        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            CryptoExchangeFragment cryptoExchangeFragment = CryptoExchangeFragment.this;
            cryptoExchangeFragment.f12020D0 = cryptoExchangeFragment.u0().f27792z.getSelectedTabPosition();
            cryptoExchangeFragment.f1();
        }
    }

    /* compiled from: CryptoExchangeFragment.kt */
    public static final class d implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12056a;

        public d(InterfaceC0646l interfaceC0646l) {
            this.f12056a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12056a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12056a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$special$$inlined$viewModel$default$1] */
    public CryptoExchangeFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12031o0 = E.a(this, h.a(k.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(k.class), null, null, b.l(this));
            }
        });
        this.f12032p0 = kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<K5.a>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$special$$inlined$inject$default$1
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
        this.s0 = new ArrayList();
        this.f12035t0 = new ArrayList();
        this.f12036u0 = new ArrayList();
        this.f12037v0 = new ArrayList();
        this.f12018B0 = CryptoExchangeFragment$Companion$DirectionType.f12051b;
        this.f12021E0 = "";
        this.f12022F0 = "";
        this.f12024H0 = "";
        this.f12026J0 = new Handler(Looper.getMainLooper());
    }

    public static String W0(String str, Double d10) {
        Integer num;
        C1572a Q4 = ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).Q(str);
        int intValue = (Q4 == null || (num = Q4.f30832g) == null) ? 2 : num.intValue();
        return new DecimalFormat(s3.b.j("#.", intValue <= 0 ? "".substring(0, intValue) : s3.b.j("", C0967l.W(intValue, "#"))), new DecimalFormatSymbols(Locale.US)).format(d10 != null ? d10.doubleValue() : 0.0d);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = kotlin.jvm.internal.f.b(this.f12019C0, Boolean.TRUE) ? getString(R.string.rates) : getString(R.string.exchange);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 28;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = kotlin.jvm.internal.f.b(this.f12019C0, Boolean.TRUE) ? getString(R.string.rates) : getString(R.string.exchange);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    public final boolean T0() {
        if (kotlin.jvm.internal.f.b(this.f12019C0, Boolean.TRUE)) {
            o.b(u0().f27781o);
            o.b(u0().f27780n);
        }
        return kotlin.jvm.internal.f.b(this.f12019C0, Boolean.FALSE);
    }

    public final void U0() {
        E3 u02 = u0();
        o.c(u02.f27789w, 500L, new C1056a(this, 3));
    }

    public final void V0() {
        E3 u02 = u0();
        o.c(u02.f27788v, 500L, new C1056a(this, 1));
    }

    public final void X0(Double d10) {
        String W02 = W0(this.f12022F0, d10);
        if (kotlin.jvm.internal.f.b(u0().f27775B.getDecStyle(), "Lower")) {
            E3 u02 = u0();
            u02.f27775B.setText(Ja.a.g(W02, u0().f27775B.getXmlValuetextSizeAfterDot()));
        } else {
            u0().f27775B.setText(W02);
        }
        f1();
    }

    public final void Y0(String str, Double d10, String str2) {
        String plainString;
        String I10;
        if (!kotlin.jvm.internal.f.b(str, "fixed")) {
            this.f12024H0 = "%";
            u0().f27785s.setText(getString(R.string.fee_value, v.n(d10 != null ? new BigDecimal(String.valueOf(d10.doubleValue())).toPlainString() : null, "%")));
            return;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        this.f12024H0 = str2;
        E3 u02 = u0();
        String str4 = this.f12024H0;
        if (d10 != null && (plainString = new BigDecimal(String.valueOf(d10.doubleValue())).toPlainString()) != null && (I10 = D9.b.I(plainString, this.f12024H0)) != null) {
            str3 = I10;
        }
        u02.f27785s.setText(getString(R.string.fee_value, D9.b.o(str4, str3)));
    }

    public final void Z0() {
        Long l10;
        Long l11;
        BankAccountDomain bankAccountDomain;
        BankAccountDomain bankAccountDomain2;
        if (kotlin.jvm.internal.f.b(this.f12019C0, Boolean.TRUE)) {
            k a12 = a1();
            String str = this.f12021E0;
            String str2 = this.f12022F0;
            a12.getClass();
            if (str.length() == 0 || str2.length() == 0) {
                return;
            }
            e eVar = new e(str, str2, 5, a12);
            a12.f420L0 = eVar;
            eVar.invoke();
            return;
        }
        CryptoAccountDomain cryptoAccountDomain = this.f12039x0;
        Integer num = null;
        Long l12 = cryptoAccountDomain != null ? cryptoAccountDomain.f10963a : null;
        CryptoAccountDomain cryptoAccountDomain2 = this.f12017A0;
        Long l13 = cryptoAccountDomain2 != null ? cryptoAccountDomain2.f10963a : null;
        if (l12 != null && l13 != null) {
            l10 = l12;
            l11 = l13;
        } else if (cryptoAccountDomain != null) {
            l11 = null;
            l10 = l12;
        } else if (cryptoAccountDomain2 != null) {
            l11 = null;
            l10 = l13;
        } else {
            l10 = null;
            l11 = null;
        }
        boolean z10 = D9.b.Z(this.f12021E0) && l10 != null;
        if (D9.b.Z(this.f12021E0) && l10 != null && D9.b.Z(this.f12022F0) && l11 != null) {
            z10 = true;
        }
        if (D9.b.Z(this.f12022F0) && l10 != null) {
            z10 = true;
        }
        boolean z11 = (K3.a.c(this.f12021E0) && K3.a.c(this.f12022F0)) ? true : z10;
        Double R = C0966k.R(D9.b.r0(String.valueOf(u0().f27787u.getText())));
        f1();
        if (z11) {
            k a13 = a1();
            String str3 = this.f12021E0;
            String str4 = this.f12022F0;
            Integer num2 = (!K3.a.c(str3) || (bankAccountDomain2 = this.f12038w0) == null) ? null : bankAccountDomain2.f10694a;
            if (K3.a.c(this.f12022F0) && (bankAccountDomain = this.f12041z0) != null) {
                num = bankAccountDomain.f10694a;
            }
            Integer num3 = num;
            a13.getClass();
            if (str3.length() == 0 || str4.length() == 0 || R == null) {
                return;
            }
            s sVar = new s(a13, str3, str4, R, num2, num3, l10, l11, 1);
            a13.f421M0 = sVar;
            sVar.invoke();
        }
    }

    public final k a1() {
        return (k) this.f12031o0.getValue();
    }

    public final void b1() {
        String str = this.f12022F0;
        if (str == null) {
            str = "";
        }
        String string = getString(R.string.buy_currency, str);
        u0().f27781o.setText(string);
        u0().f27780n.setText(string);
    }

    public final void c1(boolean z10, b.a aVar) {
        E3 u02 = u0();
        String string = getString(z10 ? R.string.insufficient_balance : R.string.you_sell);
        CustomTextInputLayout customTextInputLayout = u02.f27786t;
        customTextInputLayout.setHint(string);
        Context requireContext = requireContext();
        int i = R.color.middle_gray;
        customTextInputLayout.setHintTextColor(ColorStateList.valueOf(C0913a.getColor(requireContext, z10 ? R.color.error : R.color.middle_gray)));
        customTextInputLayout.f(z10);
        if (z10) {
            i = R.color.error;
        }
        u02.f27776C.setTextColor(getResources().getColor(i, null));
        if ((aVar != null ? aVar.f2148b : null) != null) {
            C1150a.C0465a a10 = aVar.f2148b.a();
            X0(a10 != null ? a10.d() : null);
            C1150a c1150a = aVar.f2148b;
            C1150a.C0465a a11 = c1150a.a();
            String c2 = a11 != null ? a11.c() : null;
            C1150a.C0465a a12 = c1150a.a();
            Double b9 = a12 != null ? a12.b() : null;
            C1150a.C0465a a13 = c1150a.a();
            Y0(c2, b9, a13 != null ? a13.a() : null);
        }
    }

    public final void d1(String str, boolean z10) {
        E3 u02 = u0();
        String string = z10 ? getString(R.string.insufficient_balance_minimum, str) : getString(R.string.you_sell);
        CustomTextInputLayout customTextInputLayout = u02.f27786t;
        customTextInputLayout.setHint(string);
        customTextInputLayout.setHintTextColor(ColorStateList.valueOf(C0913a.getColor(requireContext(), z10 ? R.color.error : R.color.middle_gray)));
        customTextInputLayout.f(z10);
    }

    public final void e1(final boolean z10) {
        this.f12040y0 = C0966k.R(D9.b.r0(String.valueOf(u0().f27787u.getText())));
        com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a aVar = this.f12033q0;
        StatementsSelectorDialog statementsSelectorDialog = (aVar == null || !aVar.f12057a) ? this.f12020D0 == 0 ? new StatementsSelectorDialog(requireContext(), StatementsSelectorDialog.DialogType.f13044b) : new StatementsSelectorDialog(requireContext(), StatementsSelectorDialog.DialogType.f13045c) : new StatementsSelectorDialog(requireContext(), StatementsSelectorDialog.DialogType.f13045c);
        final int i = 0;
        statementsSelectorDialog.f13042w = new InterfaceC0646l(this) { // from class: m7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeFragment f23963b;

            {
                this.f23963b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                Integer M8;
                CryptoAccountDomain cryptoAccountDomain;
                String str2;
                String str3;
                Integer z11;
                Object obj2;
                BankAccountDomain bankAccountDomain;
                String str4;
                Integer g10;
                Object obj3;
                CryptoAccountDomain cryptoAccountDomain2;
                String str5;
                String str6;
                Integer z12;
                Object obj4;
                Integer M10;
                CryptoAccountDomain cryptoAccountDomain3;
                String str7;
                String str8;
                Integer z13;
                Object obj5;
                BankAccountDomain bankAccountDomain2;
                String str9;
                Integer g11;
                Object obj6;
                CryptoAccountDomain cryptoAccountDomain4;
                String str10;
                String str11;
                String str12;
                Integer z14;
                Object obj7;
                switch (i) {
                    case 0:
                        StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) obj;
                        CryptoExchangeFragment cryptoExchangeFragment = this.f23963b;
                        if (kotlin.jvm.internal.f.b(cryptoExchangeFragment.f12019C0, Boolean.FALSE)) {
                            Integer num = aVar2.f13059h;
                            boolean z15 = z10;
                            str = "";
                            String str13 = aVar2.f13058g;
                            if (z15) {
                                if (cryptoExchangeFragment.f12020D0 == 0) {
                                    if (D9.b.Z(str13)) {
                                        List<CryptoAccountDomain> value = cryptoExchangeFragment.a1().f24008d1.getValue();
                                        if (value != null) {
                                            Iterator<T> it = value.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj7 = it.next();
                                                    Long l10 = ((CryptoAccountDomain) obj7).f10963a;
                                                    if (kotlin.jvm.internal.f.b(l10 != null ? Integer.valueOf((int) l10.longValue()) : null, num)) {
                                                    }
                                                } else {
                                                    obj7 = null;
                                                }
                                            }
                                            cryptoAccountDomain4 = (CryptoAccountDomain) obj7;
                                        } else {
                                            cryptoAccountDomain4 = null;
                                        }
                                        cryptoExchangeFragment.f12039x0 = cryptoAccountDomain4;
                                        if (cryptoAccountDomain4 != null && (str12 = cryptoAccountDomain4.f10969g) != null && (z14 = D9.b.z(str12)) != null) {
                                            cryptoExchangeFragment.u0().f27788v.setImageResource(z14.intValue());
                                        }
                                        E3 u02 = cryptoExchangeFragment.u0();
                                        CryptoAccountDomain cryptoAccountDomain5 = cryptoExchangeFragment.f12039x0;
                                        u02.f27787u.setCurrencyNameToInput(cryptoAccountDomain5 != null ? cryptoAccountDomain5.f10969g : null);
                                        CryptoAccountDomain cryptoAccountDomain6 = cryptoExchangeFragment.f12039x0;
                                        if (cryptoAccountDomain6 == null || (str10 = cryptoAccountDomain6.f10969g) == null) {
                                            str10 = "";
                                        }
                                        cryptoExchangeFragment.f12021E0 = str10;
                                        cryptoExchangeFragment.u0().f27787u.c("", CryptoExchangeFragment.W0(cryptoExchangeFragment.f12021E0, cryptoExchangeFragment.f12040y0));
                                        E3 u03 = cryptoExchangeFragment.u0();
                                        CryptoAccountDomain cryptoAccountDomain7 = cryptoExchangeFragment.f12039x0;
                                        if (cryptoAccountDomain7 != null) {
                                            K5.a aVar3 = (K5.a) cryptoExchangeFragment.f12032p0.getValue();
                                            CryptoAccountDomain cryptoAccountDomain8 = cryptoExchangeFragment.f12039x0;
                                            str11 = cryptoAccountDomain7.c(aVar3.Q(cryptoAccountDomain8 != null ? cryptoAccountDomain8.f10969g : null));
                                        } else {
                                            str11 = null;
                                        }
                                        u03.f27776C.setText(cryptoExchangeFragment.getString(R.string.balance, str11));
                                        cryptoExchangeFragment.f12038w0 = null;
                                    } else {
                                        List<BankAccountDomain> value2 = cryptoExchangeFragment.a1().f24007c1.getValue();
                                        if (value2 != null) {
                                            Iterator<T> it2 = value2.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    obj6 = it2.next();
                                                    if (kotlin.jvm.internal.f.b(((BankAccountDomain) obj6).f10694a, num)) {
                                                    }
                                                } else {
                                                    obj6 = null;
                                                }
                                            }
                                            bankAccountDomain2 = (BankAccountDomain) obj6;
                                        } else {
                                            bankAccountDomain2 = null;
                                        }
                                        cryptoExchangeFragment.f12038w0 = bankAccountDomain2;
                                        if (bankAccountDomain2 != null && (g11 = F8.b.g(bankAccountDomain2, cryptoExchangeFragment.requireContext())) != null) {
                                            cryptoExchangeFragment.u0().f27788v.setImageResource(g11.intValue());
                                        }
                                        E3 u04 = cryptoExchangeFragment.u0();
                                        BankAccountDomain bankAccountDomain3 = cryptoExchangeFragment.f12038w0;
                                        u04.f27787u.setCurrencyNameToInput(bankAccountDomain3 != null ? bankAccountDomain3.f10701h : null);
                                        BankAccountDomain bankAccountDomain4 = cryptoExchangeFragment.f12038w0;
                                        if (bankAccountDomain4 == null || (str9 = bankAccountDomain4.f10701h) == null) {
                                            str9 = "";
                                        }
                                        cryptoExchangeFragment.f12021E0 = str9;
                                        E3 u05 = cryptoExchangeFragment.u0();
                                        BankAccountDomain bankAccountDomain5 = cryptoExchangeFragment.f12038w0;
                                        u05.f27787u.c(bankAccountDomain5 != null ? F8.b.e(bankAccountDomain5) : "", CryptoExchangeFragment.W0(cryptoExchangeFragment.f12021E0, cryptoExchangeFragment.f12040y0));
                                        E3 u06 = cryptoExchangeFragment.u0();
                                        BankAccountDomain bankAccountDomain6 = cryptoExchangeFragment.f12038w0;
                                        u06.f27776C.setText(cryptoExchangeFragment.getString(R.string.balance, bankAccountDomain6 != null ? F8.b.f(bankAccountDomain6) : null));
                                        cryptoExchangeFragment.f12039x0 = null;
                                    }
                                } else if (D9.b.Z(str13)) {
                                    List<CryptoAccountDomain> value3 = cryptoExchangeFragment.a1().f24008d1.getValue();
                                    if (value3 != null) {
                                        Iterator<T> it3 = value3.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj5 = it3.next();
                                                Long l11 = ((CryptoAccountDomain) obj5).f10963a;
                                                if (kotlin.jvm.internal.f.b(l11 != null ? Integer.valueOf((int) l11.longValue()) : null, num)) {
                                                }
                                            } else {
                                                obj5 = null;
                                            }
                                        }
                                        cryptoAccountDomain3 = (CryptoAccountDomain) obj5;
                                    } else {
                                        cryptoAccountDomain3 = null;
                                    }
                                    cryptoExchangeFragment.f12039x0 = cryptoAccountDomain3;
                                    if (cryptoAccountDomain3 != null && (str8 = cryptoAccountDomain3.f10969g) != null && (z13 = D9.b.z(str8)) != null) {
                                        cryptoExchangeFragment.u0().f27788v.setImageResource(z13.intValue());
                                    }
                                    E3 u07 = cryptoExchangeFragment.u0();
                                    CryptoAccountDomain cryptoAccountDomain9 = cryptoExchangeFragment.f12039x0;
                                    u07.f27787u.setCurrencyNameToInput(cryptoAccountDomain9 != null ? cryptoAccountDomain9.f10969g : null);
                                    CryptoAccountDomain cryptoAccountDomain10 = cryptoExchangeFragment.f12039x0;
                                    if (cryptoAccountDomain10 == null || (str7 = cryptoAccountDomain10.f10969g) == null) {
                                        str7 = "";
                                    }
                                    cryptoExchangeFragment.f12021E0 = str7;
                                    cryptoExchangeFragment.u0().f27787u.c("", CryptoExchangeFragment.W0(cryptoExchangeFragment.f12021E0, cryptoExchangeFragment.f12040y0));
                                    cryptoExchangeFragment.f12038w0 = null;
                                } else {
                                    if (str13 != null && (M10 = D9.b.M(cryptoExchangeFragment.requireContext(), str13)) != null) {
                                        cryptoExchangeFragment.u0().f27788v.setImageResource(M10.intValue());
                                    }
                                    cryptoExchangeFragment.u0().f27787u.setText(str13);
                                    cryptoExchangeFragment.u0().f27787u.c(str13 != null ? K3.a.a(str13) : "", CryptoExchangeFragment.W0(cryptoExchangeFragment.f12021E0, cryptoExchangeFragment.f12040y0));
                                    cryptoExchangeFragment.u0().f27787u.setCurrencyNameToInput(str13);
                                    cryptoExchangeFragment.f12021E0 = str13 != null ? str13 : "";
                                }
                            } else if (cryptoExchangeFragment.f12020D0 == 0) {
                                if (D9.b.Z(str13)) {
                                    List<CryptoAccountDomain> value4 = cryptoExchangeFragment.a1().f24008d1.getValue();
                                    if (value4 != null) {
                                        Iterator<T> it4 = value4.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                obj4 = it4.next();
                                                Long l12 = ((CryptoAccountDomain) obj4).f10963a;
                                                if (kotlin.jvm.internal.f.b(l12 != null ? Integer.valueOf((int) l12.longValue()) : null, num)) {
                                                }
                                            } else {
                                                obj4 = null;
                                            }
                                        }
                                        cryptoAccountDomain2 = (CryptoAccountDomain) obj4;
                                    } else {
                                        cryptoAccountDomain2 = null;
                                    }
                                    cryptoExchangeFragment.f12017A0 = cryptoAccountDomain2;
                                    if (cryptoAccountDomain2 != null && (str6 = cryptoAccountDomain2.f10969g) != null && (z12 = D9.b.z(str6)) != null) {
                                        cryptoExchangeFragment.u0().f27789w.setImageResource(z12.intValue());
                                    }
                                    E3 u08 = cryptoExchangeFragment.u0();
                                    CryptoAccountDomain cryptoAccountDomain11 = cryptoExchangeFragment.f12017A0;
                                    u08.f27775B.setCurrencyNameToInput(cryptoAccountDomain11 != null ? cryptoAccountDomain11.f10969g : null);
                                    CryptoAccountDomain cryptoAccountDomain12 = cryptoExchangeFragment.f12017A0;
                                    if (cryptoAccountDomain12 == null || (str5 = cryptoAccountDomain12.f10969g) == null) {
                                        str5 = "";
                                    }
                                    cryptoExchangeFragment.f12022F0 = str5;
                                    cryptoExchangeFragment.u0().f27775B.setCurrency("");
                                    cryptoExchangeFragment.f12041z0 = null;
                                } else {
                                    List<BankAccountDomain> value5 = cryptoExchangeFragment.a1().f24007c1.getValue();
                                    if (value5 != null) {
                                        Iterator<T> it5 = value5.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                obj3 = it5.next();
                                                if (kotlin.jvm.internal.f.b(((BankAccountDomain) obj3).f10694a, num)) {
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        bankAccountDomain = (BankAccountDomain) obj3;
                                    } else {
                                        bankAccountDomain = null;
                                    }
                                    cryptoExchangeFragment.f12041z0 = bankAccountDomain;
                                    if (bankAccountDomain != null && (g10 = F8.b.g(bankAccountDomain, cryptoExchangeFragment.requireContext())) != null) {
                                        cryptoExchangeFragment.u0().f27789w.setImageResource(g10.intValue());
                                    }
                                    cryptoExchangeFragment.f12017A0 = null;
                                    E3 u09 = cryptoExchangeFragment.u0();
                                    BankAccountDomain bankAccountDomain7 = cryptoExchangeFragment.f12041z0;
                                    u09.f27775B.setCurrencyNameToInput(bankAccountDomain7 != null ? bankAccountDomain7.f10701h : null);
                                    E3 u010 = cryptoExchangeFragment.u0();
                                    BankAccountDomain bankAccountDomain8 = cryptoExchangeFragment.f12041z0;
                                    u010.f27775B.setCurrency(bankAccountDomain8 != null ? K3.a.a(bankAccountDomain8.f10701h) : "");
                                    BankAccountDomain bankAccountDomain9 = cryptoExchangeFragment.f12041z0;
                                    if (bankAccountDomain9 != null && (str4 = bankAccountDomain9.f10701h) != null) {
                                        str = str4;
                                    }
                                    cryptoExchangeFragment.f12022F0 = str;
                                }
                                cryptoExchangeFragment.b1();
                            } else if (D9.b.Z(str13)) {
                                List<CryptoAccountDomain> value6 = cryptoExchangeFragment.a1().f24008d1.getValue();
                                if (value6 != null) {
                                    Iterator<T> it6 = value6.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            obj2 = it6.next();
                                            Long l13 = ((CryptoAccountDomain) obj2).f10963a;
                                            if (kotlin.jvm.internal.f.b(l13 != null ? Integer.valueOf((int) l13.longValue()) : null, num)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    cryptoAccountDomain = (CryptoAccountDomain) obj2;
                                } else {
                                    cryptoAccountDomain = null;
                                }
                                cryptoExchangeFragment.f12017A0 = cryptoAccountDomain;
                                if (cryptoAccountDomain != null && (str3 = cryptoAccountDomain.f10969g) != null && (z11 = D9.b.z(str3)) != null) {
                                    cryptoExchangeFragment.u0().f27789w.setImageResource(z11.intValue());
                                }
                                E3 u011 = cryptoExchangeFragment.u0();
                                CryptoAccountDomain cryptoAccountDomain13 = cryptoExchangeFragment.f12017A0;
                                u011.f27775B.setCurrencyNameToInput(cryptoAccountDomain13 != null ? cryptoAccountDomain13.f10969g : null);
                                cryptoExchangeFragment.u0().f27775B.setCurrency("");
                                CryptoAccountDomain cryptoAccountDomain14 = cryptoExchangeFragment.f12017A0;
                                if (cryptoAccountDomain14 != null && (str2 = cryptoAccountDomain14.f10969g) != null) {
                                    str = str2;
                                }
                                cryptoExchangeFragment.f12022F0 = str;
                            } else {
                                if (str13 != null && (M8 = D9.b.M(cryptoExchangeFragment.getContext(), str13)) != null) {
                                    cryptoExchangeFragment.u0().f27789w.setImageResource(M8.intValue());
                                }
                                cryptoExchangeFragment.u0().f27775B.setCurrency(str13 != null ? K3.a.a(str13) : "");
                                cryptoExchangeFragment.u0().f27775B.setCurrencyNameToInput(str13);
                                cryptoExchangeFragment.f12022F0 = str13 != null ? str13 : "";
                            }
                            cryptoExchangeFragment.Z0();
                        }
                        break;
                    default:
                        String str14 = (String) obj;
                        CryptoExchangeFragment cryptoExchangeFragment2 = this.f23963b;
                        if (kotlin.jvm.internal.f.b(cryptoExchangeFragment2.f12019C0, Boolean.TRUE)) {
                            if (z10) {
                                cryptoExchangeFragment2.f12021E0 = str14;
                                cryptoExchangeFragment2.u0().f27787u.setCurrencyNameToInput(str14);
                                if (K3.a.c(str14)) {
                                    Integer M11 = D9.b.M(cryptoExchangeFragment2.getContext(), str14);
                                    if (M11 != null) {
                                        cryptoExchangeFragment2.u0().f27788v.setImageResource(M11.intValue());
                                    }
                                    cryptoExchangeFragment2.u0().f27787u.c(K3.a.a(str14), CryptoExchangeFragment.W0(cryptoExchangeFragment2.f12021E0, cryptoExchangeFragment2.f12040y0));
                                } else {
                                    Integer z16 = D9.b.z(str14);
                                    if (z16 != null) {
                                        cryptoExchangeFragment2.u0().f27788v.setImageResource(z16.intValue());
                                    }
                                    cryptoExchangeFragment2.u0().f27787u.c("", CryptoExchangeFragment.W0(cryptoExchangeFragment2.f12021E0, cryptoExchangeFragment2.f12040y0));
                                }
                            } else {
                                if (K3.a.c(str14)) {
                                    Integer M12 = D9.b.M(cryptoExchangeFragment2.getContext(), str14);
                                    if (M12 != null) {
                                        cryptoExchangeFragment2.u0().f27789w.setImageResource(M12.intValue());
                                    }
                                    cryptoExchangeFragment2.u0().f27775B.setCurrency(K3.a.a(str14));
                                    cryptoExchangeFragment2.u0().f27775B.setText(str14);
                                } else {
                                    Integer z17 = D9.b.z(str14);
                                    if (z17 != null) {
                                        cryptoExchangeFragment2.u0().f27789w.setImageResource(z17.intValue());
                                    }
                                    cryptoExchangeFragment2.u0().f27775B.setCurrency("");
                                }
                                cryptoExchangeFragment2.f12022F0 = str14;
                                cryptoExchangeFragment2.u0().f27775B.setCurrencyNameToInput(str14);
                            }
                            cryptoExchangeFragment2.Z0();
                        }
                        break;
                }
                return p.f3034a;
            }
        };
        final int i9 = 1;
        statementsSelectorDialog.f13040u = new InterfaceC0646l(this) { // from class: m7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoExchangeFragment f23963b;

            {
                this.f23963b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                Integer M8;
                CryptoAccountDomain cryptoAccountDomain;
                String str2;
                String str3;
                Integer z11;
                Object obj2;
                BankAccountDomain bankAccountDomain;
                String str4;
                Integer g10;
                Object obj3;
                CryptoAccountDomain cryptoAccountDomain2;
                String str5;
                String str6;
                Integer z12;
                Object obj4;
                Integer M10;
                CryptoAccountDomain cryptoAccountDomain3;
                String str7;
                String str8;
                Integer z13;
                Object obj5;
                BankAccountDomain bankAccountDomain2;
                String str9;
                Integer g11;
                Object obj6;
                CryptoAccountDomain cryptoAccountDomain4;
                String str10;
                String str11;
                String str12;
                Integer z14;
                Object obj7;
                switch (i9) {
                    case 0:
                        StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) obj;
                        CryptoExchangeFragment cryptoExchangeFragment = this.f23963b;
                        if (kotlin.jvm.internal.f.b(cryptoExchangeFragment.f12019C0, Boolean.FALSE)) {
                            Integer num = aVar2.f13059h;
                            boolean z15 = z10;
                            str = "";
                            String str13 = aVar2.f13058g;
                            if (z15) {
                                if (cryptoExchangeFragment.f12020D0 == 0) {
                                    if (D9.b.Z(str13)) {
                                        List<CryptoAccountDomain> value = cryptoExchangeFragment.a1().f24008d1.getValue();
                                        if (value != null) {
                                            Iterator<T> it = value.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj7 = it.next();
                                                    Long l10 = ((CryptoAccountDomain) obj7).f10963a;
                                                    if (kotlin.jvm.internal.f.b(l10 != null ? Integer.valueOf((int) l10.longValue()) : null, num)) {
                                                    }
                                                } else {
                                                    obj7 = null;
                                                }
                                            }
                                            cryptoAccountDomain4 = (CryptoAccountDomain) obj7;
                                        } else {
                                            cryptoAccountDomain4 = null;
                                        }
                                        cryptoExchangeFragment.f12039x0 = cryptoAccountDomain4;
                                        if (cryptoAccountDomain4 != null && (str12 = cryptoAccountDomain4.f10969g) != null && (z14 = D9.b.z(str12)) != null) {
                                            cryptoExchangeFragment.u0().f27788v.setImageResource(z14.intValue());
                                        }
                                        E3 u02 = cryptoExchangeFragment.u0();
                                        CryptoAccountDomain cryptoAccountDomain5 = cryptoExchangeFragment.f12039x0;
                                        u02.f27787u.setCurrencyNameToInput(cryptoAccountDomain5 != null ? cryptoAccountDomain5.f10969g : null);
                                        CryptoAccountDomain cryptoAccountDomain6 = cryptoExchangeFragment.f12039x0;
                                        if (cryptoAccountDomain6 == null || (str10 = cryptoAccountDomain6.f10969g) == null) {
                                            str10 = "";
                                        }
                                        cryptoExchangeFragment.f12021E0 = str10;
                                        cryptoExchangeFragment.u0().f27787u.c("", CryptoExchangeFragment.W0(cryptoExchangeFragment.f12021E0, cryptoExchangeFragment.f12040y0));
                                        E3 u03 = cryptoExchangeFragment.u0();
                                        CryptoAccountDomain cryptoAccountDomain7 = cryptoExchangeFragment.f12039x0;
                                        if (cryptoAccountDomain7 != null) {
                                            K5.a aVar3 = (K5.a) cryptoExchangeFragment.f12032p0.getValue();
                                            CryptoAccountDomain cryptoAccountDomain8 = cryptoExchangeFragment.f12039x0;
                                            str11 = cryptoAccountDomain7.c(aVar3.Q(cryptoAccountDomain8 != null ? cryptoAccountDomain8.f10969g : null));
                                        } else {
                                            str11 = null;
                                        }
                                        u03.f27776C.setText(cryptoExchangeFragment.getString(R.string.balance, str11));
                                        cryptoExchangeFragment.f12038w0 = null;
                                    } else {
                                        List<BankAccountDomain> value2 = cryptoExchangeFragment.a1().f24007c1.getValue();
                                        if (value2 != null) {
                                            Iterator<T> it2 = value2.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    obj6 = it2.next();
                                                    if (kotlin.jvm.internal.f.b(((BankAccountDomain) obj6).f10694a, num)) {
                                                    }
                                                } else {
                                                    obj6 = null;
                                                }
                                            }
                                            bankAccountDomain2 = (BankAccountDomain) obj6;
                                        } else {
                                            bankAccountDomain2 = null;
                                        }
                                        cryptoExchangeFragment.f12038w0 = bankAccountDomain2;
                                        if (bankAccountDomain2 != null && (g11 = F8.b.g(bankAccountDomain2, cryptoExchangeFragment.requireContext())) != null) {
                                            cryptoExchangeFragment.u0().f27788v.setImageResource(g11.intValue());
                                        }
                                        E3 u04 = cryptoExchangeFragment.u0();
                                        BankAccountDomain bankAccountDomain3 = cryptoExchangeFragment.f12038w0;
                                        u04.f27787u.setCurrencyNameToInput(bankAccountDomain3 != null ? bankAccountDomain3.f10701h : null);
                                        BankAccountDomain bankAccountDomain4 = cryptoExchangeFragment.f12038w0;
                                        if (bankAccountDomain4 == null || (str9 = bankAccountDomain4.f10701h) == null) {
                                            str9 = "";
                                        }
                                        cryptoExchangeFragment.f12021E0 = str9;
                                        E3 u05 = cryptoExchangeFragment.u0();
                                        BankAccountDomain bankAccountDomain5 = cryptoExchangeFragment.f12038w0;
                                        u05.f27787u.c(bankAccountDomain5 != null ? F8.b.e(bankAccountDomain5) : "", CryptoExchangeFragment.W0(cryptoExchangeFragment.f12021E0, cryptoExchangeFragment.f12040y0));
                                        E3 u06 = cryptoExchangeFragment.u0();
                                        BankAccountDomain bankAccountDomain6 = cryptoExchangeFragment.f12038w0;
                                        u06.f27776C.setText(cryptoExchangeFragment.getString(R.string.balance, bankAccountDomain6 != null ? F8.b.f(bankAccountDomain6) : null));
                                        cryptoExchangeFragment.f12039x0 = null;
                                    }
                                } else if (D9.b.Z(str13)) {
                                    List<CryptoAccountDomain> value3 = cryptoExchangeFragment.a1().f24008d1.getValue();
                                    if (value3 != null) {
                                        Iterator<T> it3 = value3.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj5 = it3.next();
                                                Long l11 = ((CryptoAccountDomain) obj5).f10963a;
                                                if (kotlin.jvm.internal.f.b(l11 != null ? Integer.valueOf((int) l11.longValue()) : null, num)) {
                                                }
                                            } else {
                                                obj5 = null;
                                            }
                                        }
                                        cryptoAccountDomain3 = (CryptoAccountDomain) obj5;
                                    } else {
                                        cryptoAccountDomain3 = null;
                                    }
                                    cryptoExchangeFragment.f12039x0 = cryptoAccountDomain3;
                                    if (cryptoAccountDomain3 != null && (str8 = cryptoAccountDomain3.f10969g) != null && (z13 = D9.b.z(str8)) != null) {
                                        cryptoExchangeFragment.u0().f27788v.setImageResource(z13.intValue());
                                    }
                                    E3 u07 = cryptoExchangeFragment.u0();
                                    CryptoAccountDomain cryptoAccountDomain9 = cryptoExchangeFragment.f12039x0;
                                    u07.f27787u.setCurrencyNameToInput(cryptoAccountDomain9 != null ? cryptoAccountDomain9.f10969g : null);
                                    CryptoAccountDomain cryptoAccountDomain10 = cryptoExchangeFragment.f12039x0;
                                    if (cryptoAccountDomain10 == null || (str7 = cryptoAccountDomain10.f10969g) == null) {
                                        str7 = "";
                                    }
                                    cryptoExchangeFragment.f12021E0 = str7;
                                    cryptoExchangeFragment.u0().f27787u.c("", CryptoExchangeFragment.W0(cryptoExchangeFragment.f12021E0, cryptoExchangeFragment.f12040y0));
                                    cryptoExchangeFragment.f12038w0 = null;
                                } else {
                                    if (str13 != null && (M10 = D9.b.M(cryptoExchangeFragment.requireContext(), str13)) != null) {
                                        cryptoExchangeFragment.u0().f27788v.setImageResource(M10.intValue());
                                    }
                                    cryptoExchangeFragment.u0().f27787u.setText(str13);
                                    cryptoExchangeFragment.u0().f27787u.c(str13 != null ? K3.a.a(str13) : "", CryptoExchangeFragment.W0(cryptoExchangeFragment.f12021E0, cryptoExchangeFragment.f12040y0));
                                    cryptoExchangeFragment.u0().f27787u.setCurrencyNameToInput(str13);
                                    cryptoExchangeFragment.f12021E0 = str13 != null ? str13 : "";
                                }
                            } else if (cryptoExchangeFragment.f12020D0 == 0) {
                                if (D9.b.Z(str13)) {
                                    List<CryptoAccountDomain> value4 = cryptoExchangeFragment.a1().f24008d1.getValue();
                                    if (value4 != null) {
                                        Iterator<T> it4 = value4.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                obj4 = it4.next();
                                                Long l12 = ((CryptoAccountDomain) obj4).f10963a;
                                                if (kotlin.jvm.internal.f.b(l12 != null ? Integer.valueOf((int) l12.longValue()) : null, num)) {
                                                }
                                            } else {
                                                obj4 = null;
                                            }
                                        }
                                        cryptoAccountDomain2 = (CryptoAccountDomain) obj4;
                                    } else {
                                        cryptoAccountDomain2 = null;
                                    }
                                    cryptoExchangeFragment.f12017A0 = cryptoAccountDomain2;
                                    if (cryptoAccountDomain2 != null && (str6 = cryptoAccountDomain2.f10969g) != null && (z12 = D9.b.z(str6)) != null) {
                                        cryptoExchangeFragment.u0().f27789w.setImageResource(z12.intValue());
                                    }
                                    E3 u08 = cryptoExchangeFragment.u0();
                                    CryptoAccountDomain cryptoAccountDomain11 = cryptoExchangeFragment.f12017A0;
                                    u08.f27775B.setCurrencyNameToInput(cryptoAccountDomain11 != null ? cryptoAccountDomain11.f10969g : null);
                                    CryptoAccountDomain cryptoAccountDomain12 = cryptoExchangeFragment.f12017A0;
                                    if (cryptoAccountDomain12 == null || (str5 = cryptoAccountDomain12.f10969g) == null) {
                                        str5 = "";
                                    }
                                    cryptoExchangeFragment.f12022F0 = str5;
                                    cryptoExchangeFragment.u0().f27775B.setCurrency("");
                                    cryptoExchangeFragment.f12041z0 = null;
                                } else {
                                    List<BankAccountDomain> value5 = cryptoExchangeFragment.a1().f24007c1.getValue();
                                    if (value5 != null) {
                                        Iterator<T> it5 = value5.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                obj3 = it5.next();
                                                if (kotlin.jvm.internal.f.b(((BankAccountDomain) obj3).f10694a, num)) {
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        bankAccountDomain = (BankAccountDomain) obj3;
                                    } else {
                                        bankAccountDomain = null;
                                    }
                                    cryptoExchangeFragment.f12041z0 = bankAccountDomain;
                                    if (bankAccountDomain != null && (g10 = F8.b.g(bankAccountDomain, cryptoExchangeFragment.requireContext())) != null) {
                                        cryptoExchangeFragment.u0().f27789w.setImageResource(g10.intValue());
                                    }
                                    cryptoExchangeFragment.f12017A0 = null;
                                    E3 u09 = cryptoExchangeFragment.u0();
                                    BankAccountDomain bankAccountDomain7 = cryptoExchangeFragment.f12041z0;
                                    u09.f27775B.setCurrencyNameToInput(bankAccountDomain7 != null ? bankAccountDomain7.f10701h : null);
                                    E3 u010 = cryptoExchangeFragment.u0();
                                    BankAccountDomain bankAccountDomain8 = cryptoExchangeFragment.f12041z0;
                                    u010.f27775B.setCurrency(bankAccountDomain8 != null ? K3.a.a(bankAccountDomain8.f10701h) : "");
                                    BankAccountDomain bankAccountDomain9 = cryptoExchangeFragment.f12041z0;
                                    if (bankAccountDomain9 != null && (str4 = bankAccountDomain9.f10701h) != null) {
                                        str = str4;
                                    }
                                    cryptoExchangeFragment.f12022F0 = str;
                                }
                                cryptoExchangeFragment.b1();
                            } else if (D9.b.Z(str13)) {
                                List<CryptoAccountDomain> value6 = cryptoExchangeFragment.a1().f24008d1.getValue();
                                if (value6 != null) {
                                    Iterator<T> it6 = value6.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            obj2 = it6.next();
                                            Long l13 = ((CryptoAccountDomain) obj2).f10963a;
                                            if (kotlin.jvm.internal.f.b(l13 != null ? Integer.valueOf((int) l13.longValue()) : null, num)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    cryptoAccountDomain = (CryptoAccountDomain) obj2;
                                } else {
                                    cryptoAccountDomain = null;
                                }
                                cryptoExchangeFragment.f12017A0 = cryptoAccountDomain;
                                if (cryptoAccountDomain != null && (str3 = cryptoAccountDomain.f10969g) != null && (z11 = D9.b.z(str3)) != null) {
                                    cryptoExchangeFragment.u0().f27789w.setImageResource(z11.intValue());
                                }
                                E3 u011 = cryptoExchangeFragment.u0();
                                CryptoAccountDomain cryptoAccountDomain13 = cryptoExchangeFragment.f12017A0;
                                u011.f27775B.setCurrencyNameToInput(cryptoAccountDomain13 != null ? cryptoAccountDomain13.f10969g : null);
                                cryptoExchangeFragment.u0().f27775B.setCurrency("");
                                CryptoAccountDomain cryptoAccountDomain14 = cryptoExchangeFragment.f12017A0;
                                if (cryptoAccountDomain14 != null && (str2 = cryptoAccountDomain14.f10969g) != null) {
                                    str = str2;
                                }
                                cryptoExchangeFragment.f12022F0 = str;
                            } else {
                                if (str13 != null && (M8 = D9.b.M(cryptoExchangeFragment.getContext(), str13)) != null) {
                                    cryptoExchangeFragment.u0().f27789w.setImageResource(M8.intValue());
                                }
                                cryptoExchangeFragment.u0().f27775B.setCurrency(str13 != null ? K3.a.a(str13) : "");
                                cryptoExchangeFragment.u0().f27775B.setCurrencyNameToInput(str13);
                                cryptoExchangeFragment.f12022F0 = str13 != null ? str13 : "";
                            }
                            cryptoExchangeFragment.Z0();
                        }
                        break;
                    default:
                        String str14 = (String) obj;
                        CryptoExchangeFragment cryptoExchangeFragment2 = this.f23963b;
                        if (kotlin.jvm.internal.f.b(cryptoExchangeFragment2.f12019C0, Boolean.TRUE)) {
                            if (z10) {
                                cryptoExchangeFragment2.f12021E0 = str14;
                                cryptoExchangeFragment2.u0().f27787u.setCurrencyNameToInput(str14);
                                if (K3.a.c(str14)) {
                                    Integer M11 = D9.b.M(cryptoExchangeFragment2.getContext(), str14);
                                    if (M11 != null) {
                                        cryptoExchangeFragment2.u0().f27788v.setImageResource(M11.intValue());
                                    }
                                    cryptoExchangeFragment2.u0().f27787u.c(K3.a.a(str14), CryptoExchangeFragment.W0(cryptoExchangeFragment2.f12021E0, cryptoExchangeFragment2.f12040y0));
                                } else {
                                    Integer z16 = D9.b.z(str14);
                                    if (z16 != null) {
                                        cryptoExchangeFragment2.u0().f27788v.setImageResource(z16.intValue());
                                    }
                                    cryptoExchangeFragment2.u0().f27787u.c("", CryptoExchangeFragment.W0(cryptoExchangeFragment2.f12021E0, cryptoExchangeFragment2.f12040y0));
                                }
                            } else {
                                if (K3.a.c(str14)) {
                                    Integer M12 = D9.b.M(cryptoExchangeFragment2.getContext(), str14);
                                    if (M12 != null) {
                                        cryptoExchangeFragment2.u0().f27789w.setImageResource(M12.intValue());
                                    }
                                    cryptoExchangeFragment2.u0().f27775B.setCurrency(K3.a.a(str14));
                                    cryptoExchangeFragment2.u0().f27775B.setText(str14);
                                } else {
                                    Integer z17 = D9.b.z(str14);
                                    if (z17 != null) {
                                        cryptoExchangeFragment2.u0().f27789w.setImageResource(z17.intValue());
                                    }
                                    cryptoExchangeFragment2.u0().f27775B.setCurrency("");
                                }
                                cryptoExchangeFragment2.f12022F0 = str14;
                                cryptoExchangeFragment2.u0().f27775B.setCurrencyNameToInput(str14);
                            }
                            cryptoExchangeFragment2.Z0();
                        }
                        break;
                }
                return p.f3034a;
            }
        };
        statementsSelectorDialog.show();
        ArrayList arrayList = new ArrayList();
        com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a aVar2 = this.f12033q0;
        ArrayList arrayList2 = this.f12036u0;
        ArrayList arrayList3 = this.f12035t0;
        if (aVar2 != null && aVar2.f12057a) {
            arrayList.addAll(arrayList3);
            arrayList.addAll(arrayList2);
        } else if (this.f12020D0 == 0) {
            arrayList.addAll(this.s0);
            arrayList.addAll(this.f12037v0);
        } else {
            arrayList.addAll(arrayList3);
            arrayList.addAll(arrayList2);
        }
        if (z10) {
            final C1057b c1057b = new C1057b(this, 7);
            final int i10 = 0;
            arrayList.removeIf(new Predicate() { // from class: m7.e
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    switch (i10) {
                    }
                    return ((Boolean) c1057b.invoke(obj)).booleanValue();
                }
            });
        } else {
            final C1057b c1057b2 = new C1057b(this, 8);
            final int i11 = 1;
            arrayList.removeIf(new Predicate() { // from class: m7.e
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    switch (i11) {
                    }
                    return ((Boolean) c1057b2.invoke(obj)).booleanValue();
                }
            });
        }
        StatementsSelectorDialog.l(statementsSelectorDialog, arrayList);
        statementsSelectorDialog.m(getString(z10 ? R.string.you_sell : R.string.you_receive));
    }

    public final void f1() {
        requireActivity().runOnUiThread(new m7.c(this, 1));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = a1();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12033q0 = a.C0122a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Timer timer = this.f12025I0;
        if (timer != null) {
            timer.cancel();
        }
        this.f12040y0 = C0966k.R(D9.b.r0(String.valueOf(u0().f27787u.getText())));
        y0();
        androidx.appcompat.app.b bVar = this.f12028L0;
        if (bVar != null) {
            if (bVar != null) {
                bVar.dismiss();
            }
            this.f12028L0 = null;
        }
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType;
        String str;
        String str2;
        Integer z10;
        String str3;
        Integer z11;
        String str4;
        String str5;
        super.onViewCreated(view, bundle);
        this.f12025I0 = new Timer();
        com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a aVar = this.f12033q0;
        this.f12019C0 = aVar != null ? Boolean.valueOf(aVar.f12057a) : null;
        com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a aVar2 = this.f12033q0;
        if (aVar2 == null || (cryptoExchangeFragment$Companion$DirectionType = aVar2.f12058b) == null) {
            cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12051b;
        }
        this.f12018B0 = cryptoExchangeFragment$Companion$DirectionType;
        u0().f27774A.setBack(R.drawable.sl_text_input_bg_for_exchanges);
        u0().f27786t.setBack(R.drawable.sl_text_input_bg_for_exchanges);
        u0().f27792z.a(new b());
        String str6 = "";
        if (kotlin.jvm.internal.f.b(this.f12019C0, Boolean.FALSE)) {
            com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a aVar3 = this.f12033q0;
            if (aVar3 == null || (str4 = aVar3.f12059c) == null) {
                str4 = "";
            }
            if (aVar3 != null && (str5 = aVar3.f12060d) != null) {
                str6 = str5;
            }
            str = str6;
            str6 = str4;
        } else {
            str = "";
        }
        if (kotlin.jvm.internal.f.b(this.f12019C0, Boolean.TRUE)) {
            U0();
            V0();
            o.b(u0().f27785s);
            o.b(u0().f27783q);
            ConstraintLayout constraintLayout = u0().f27782p;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.a aVar4 = (ConstraintLayout.a) layoutParams;
            aVar4.f6303t = u0().f27779F.getId();
            aVar4.f6305v = u0().f27779F.getId();
            ((ViewGroup.MarginLayoutParams) aVar4).width = -2;
            constraintLayout.setLayoutParams(aVar4);
            float f10 = 30;
            o.f(u0().f27778E, 0, 0, 0, U4.b.C(Resources.getSystem().getDisplayMetrics().density * f10), 7);
            o.f(u0().f27778E, 0, U4.b.C(f10 * Resources.getSystem().getDisplayMetrics().density), 0, 0, 13);
        } else {
            com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a aVar5 = this.f12033q0;
            Float valueOf = aVar5 != null ? Float.valueOf(aVar5.f12061e) : null;
            if (valueOf == null || valueOf.floatValue() != 0.0f) {
                U0();
                V0();
                u0().f27790x.setVisibility(0);
                u0().f27791y.setVisibility(0);
            } else {
                com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a aVar6 = this.f12033q0;
                String str7 = aVar6 != null ? aVar6.f12059c : null;
                if (str7 == null || str7.length() == 0) {
                    com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a aVar7 = this.f12033q0;
                    String str8 = aVar7 != null ? aVar7.f12060d : null;
                    if (str8 == null || str8.length() == 0) {
                        U0();
                        V0();
                        u0().f27790x.setVisibility(0);
                        u0().f27791y.setVisibility(0);
                    }
                }
                if (this.f12018B0 != CryptoExchangeFragment$Companion$DirectionType.f12051b) {
                    u0().f27790x.setVisibility(4);
                    TabLayout.g h9 = u0().f27792z.h(0);
                    if (h9 != null) {
                        h9.b(getString(R.string.to_app_account));
                    }
                    TabLayout.g h10 = u0().f27792z.h(1);
                    if (h10 != null) {
                        h10.b(getString(R.string.to_external_account));
                    }
                    U0();
                } else {
                    TabLayout.g h11 = u0().f27792z.h(0);
                    if (h11 != null) {
                        h11.b(getString(R.string.from_app_account));
                    }
                    TabLayout.g h12 = u0().f27792z.h(1);
                    if (h12 != null) {
                        h12.b(getString(R.string.from_external_account));
                    }
                    V0();
                    u0().f27791y.setVisibility(4);
                }
            }
        }
        o.c(u0().f27791y, 500L, new C1056a(this, 0));
        o.c(u0().f27790x, 500L, new C1056a(this, 7));
        o.c(u0().f27782p, 500L, new g(16));
        this.f12029M0 = new c();
        E.b(this, "signer", new B6.h(this, 24));
        a1().f24005a1.observe(getViewLifecycleOwner(), new d(new C1057b(this, 0)));
        a1().f24007c1.observe(getViewLifecycleOwner(), new d(new C1057b(this, 1)));
        a1().f24004Z0.observe(getViewLifecycleOwner(), new d(new C1057b(this, 2)));
        a1().f24008d1.observe(getViewLifecycleOwner(), new d(new C1057b(this, 3)));
        a1().f24006b1.observe(getViewLifecycleOwner(), new d(new C1057b(this, 4)));
        a1().f24010f1.observe(getViewLifecycleOwner(), new d(new C1057b(this, 5)));
        a1().f24011g1.observe(getViewLifecycleOwner(), new d(new C1057b(this, 6)));
        a1().f24009e1.observe(getViewLifecycleOwner(), new d(new C1057b(this, 9)));
        o.c(u0().f27778E, 500L, new C1056a(this, 4));
        o.c(u0().f27780n, 500L, new C1056a(this, 5));
        o.c(u0().f27781o, 500L, new C1056a(this, 6));
        E3 u02 = u0();
        c cVar = this.f12029M0;
        u02.f27787u.addTextChangedListener(cVar != null ? cVar : null);
        com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.a aVar8 = this.f12033q0;
        if (aVar8 != null && !aVar8.f12057a) {
            if (this.f12018B0 == CryptoExchangeFragment$Companion$DirectionType.f12051b) {
                CryptoAccountDomain cryptoAccountDomain = this.f12017A0;
                if (cryptoAccountDomain != null && (str3 = cryptoAccountDomain.f10969g) != null && (z11 = D9.b.z(str3)) != null) {
                    u0().f27789w.setImageResource(z11.intValue());
                }
            } else {
                CryptoAccountDomain cryptoAccountDomain2 = this.f12039x0;
                if (cryptoAccountDomain2 != null && (str2 = cryptoAccountDomain2.f10969g) != null && (z10 = D9.b.z(str2)) != null) {
                    u0().f27788v.setImageResource(z10.intValue());
                }
            }
        }
        T0();
        u0().f27787u.setCurrencyNameToInput(this.f12021E0);
        u0().f27775B.setCurrencyNameToInput(this.f12022F0);
        if (this.f12021E0.length() == 0) {
            this.f12021E0 = str6;
        }
        if (this.f12022F0.length() == 0) {
            this.f12022F0 = str;
        }
        u0().f27787u.postDelayed(new m7.c(this, 2), 300L);
        Timer timer = this.f12025I0;
        if (timer != null) {
            timer.schedule(new a(), 10000L, 30000L);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12030n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        E3 u02 = u0();
        t0(true);
        s0();
        if (T0()) {
            u02.f27780n.setVisibility(0);
            o.b(u02.f27781o);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        E3 u02 = u0();
        p0(true);
        B0();
        if (T0()) {
            o.b(u02.f27780n);
            u02.f27781o.setVisibility(0);
        }
    }

    /* compiled from: CryptoExchangeFragment.kt */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            C0966k.R(D9.b.r0(String.valueOf(charSequence)));
            CryptoExchangeFragment cryptoExchangeFragment = CryptoExchangeFragment.this;
            cryptoExchangeFragment.u0().f27780n.setClickable(false);
            E3 u02 = cryptoExchangeFragment.u0();
            u02.f27781o.setClickable(cryptoExchangeFragment.u0().f27780n.isClickable());
            m7.c cVar = cryptoExchangeFragment.f12027K0;
            Handler handler = cryptoExchangeFragment.f12026J0;
            if (cVar != null) {
                handler.removeCallbacks(cVar);
            }
            m7.c cVar2 = new m7.c(cryptoExchangeFragment, 0);
            cryptoExchangeFragment.f12027K0 = cVar2;
            handler.postDelayed(cVar2, 1500L);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
