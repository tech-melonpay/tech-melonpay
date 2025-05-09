package com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto;

import C.v;
import F8.o;
import O9.f;
import U4.b;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import c.RunnableC0615f;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import ka.C0966k;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h;
import t6.D6;
import u7.C1522a;
import u7.C1523b;

/* compiled from: WithdrawCryptoFragment.kt */
/* loaded from: classes2.dex */
public final class WithdrawCryptoFragment extends BaseFragment<D6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12185n0 = R.layout.fragment_withdraw_crypto;

    /* renamed from: o0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.a f12186o0;

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f12187p0;

    /* renamed from: q0, reason: collision with root package name */
    public final f f12188q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f12189r0;
    public Integer s0;

    /* renamed from: t0, reason: collision with root package name */
    public CryptoAccountDomain f12190t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f12191u0;

    /* compiled from: WithdrawCryptoFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12197a;

        public b(C1522a c1522a) {
            this.f12197a = c1522a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12197a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12197a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.WithdrawCryptoFragment$special$$inlined$viewModel$default$1] */
    public WithdrawCryptoFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.WithdrawCryptoFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12187p0 = E.a(this, h.a(u7.f.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.WithdrawCryptoFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.WithdrawCryptoFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(u7.f.class), null, null, b.l(this));
            }
        });
        this.f12188q0 = org.koin.java.a.a(K5.a.class);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        String str;
        CryptoAccountDomain cryptoAccountDomain;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.a aVar = this.f12186o0;
        if (aVar == null || (cryptoAccountDomain = aVar.f12200c) == null || (str = cryptoAccountDomain.f10969g) == null) {
            str = "";
        }
        toolbarStatus.f13263a = getString(R.string.withdraw_name, str);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        String str;
        CryptoAccountDomain cryptoAccountDomain;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.a aVar = this.f12186o0;
        if (aVar == null || (cryptoAccountDomain = aVar.f12200c) == null || (str = cryptoAccountDomain.f10969g) == null) {
            str = "";
        }
        toolbarStatus.f13263a = getString(R.string.withdraw_name, str);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    public final void T0() {
        String str;
        Integer z10;
        D6 u02 = u0();
        CryptoAccountDomain cryptoAccountDomain = this.f12190t0;
        u02.f27758v.setText(D9.b.G0(cryptoAccountDomain != null ? cryptoAccountDomain.f10969g : null, cryptoAccountDomain != null ? cryptoAccountDomain.f10968f : null));
        u0().f27756t.setText(this.f12191u0);
        CryptoAccountDomain cryptoAccountDomain2 = this.f12190t0;
        if (cryptoAccountDomain2 == null || (str = cryptoAccountDomain2.f10969g) == null || (z10 = D9.b.z(str)) == null) {
            return;
        }
        u0().f27757u.setImageResource(z10.intValue());
    }

    public final void U0() {
        boolean z10;
        CryptoAccountDomain cryptoAccountDomain;
        Double d10;
        D6 u02 = u0();
        Editable text = u0().f27752p.getText();
        if (text != null && text.length() != 0) {
            Double R = C0966k.R(D9.b.r0(String.valueOf(u0().f27752p.getText())));
            if (!kotlin.jvm.internal.f.a(R) && R != null) {
                com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.a aVar = this.f12186o0;
                if (((aVar == null || (cryptoAccountDomain = aVar.f12200c) == null || (d10 = cryptoAccountDomain.f10977p) == null) ? 0.0d : d10.doubleValue()) < R.doubleValue()) {
                    u0().f27751o.setErrorWithoutFocus(getString(R.string.you_do_not_have_enough_money));
                } else {
                    u0().f27751o.setError(null);
                    Integer num = this.s0;
                    if ((num == null || num.intValue() != 0) && this.s0 != null) {
                        z10 = true;
                        u02.f27754r.setEnabled(z10);
                        u0().f27755s.setEnabled(u0().f27754r.isEnabled());
                    }
                }
            }
        }
        z10 = false;
        u02.f27754r.setEnabled(z10);
        u0().f27755s.setEnabled(u0().f27754r.isEnabled());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12186o0 = a.C0127a.a(arguments);
        }
        this.f11471m0 = (u7.f) this.f12187p0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f12189r0 = Float.parseFloat(D9.b.r0(String.valueOf(u0().f27752p.getText())));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        D6 u02 = u0();
        u02.f27752p.post(new RunnableC0615f(this, 24));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.a aVar = this.f12186o0;
        this.f12190t0 = aVar != null ? aVar.f12200c : null;
        this.f12191u0 = aVar != null ? aVar.f12199b : null;
        if (aVar == null || aVar.f12198a != 0) {
            this.s0 = aVar != null ? Integer.valueOf(aVar.f12198a) : null;
        }
        if (this.s0 != null) {
            u0().f27759w.setDisplayedChild(1);
            T0();
        }
        ((u7.f) this.f12187p0.getValue()).f30341V0.observe(getViewLifecycleOwner(), new b(new C1522a(this, 0)));
        o.c(u0().f27750n, 500L, new C1523b(this, 0));
        E.b(this, "withdraw", new B6.h(this, 28));
        D6 u02 = u0();
        CryptoAccountDomain cryptoAccountDomain = this.f12190t0;
        String str2 = "";
        if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10969g) == null) {
            str = "";
        }
        u02.f27752p.setCurrencyNameToInput(str);
        o.c(u0().f27754r, 500L, new C1523b(this, 1));
        o.c(u0().f27755s, 500L, new C1523b(this, 2));
        u0().f27752p.addTextChangedListener(new a());
        D6 u03 = u0();
        CryptoAccountDomain cryptoAccountDomain2 = this.f12190t0;
        if (cryptoAccountDomain2 != null) {
            K5.a aVar2 = (K5.a) this.f12188q0.getValue();
            CryptoAccountDomain cryptoAccountDomain3 = this.f12190t0;
            String n10 = v.n(cryptoAccountDomain2.a(), cryptoAccountDomain2.b(aVar2.Q(cryptoAccountDomain3 != null ? cryptoAccountDomain3.f10969g : null)));
            if (n10 != null) {
                str2 = n10;
            }
        }
        u03.f27753q.setText(getString(R.string.available_balance_value, str2));
        U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12185n0;
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            WithdrawCryptoFragment.this.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
