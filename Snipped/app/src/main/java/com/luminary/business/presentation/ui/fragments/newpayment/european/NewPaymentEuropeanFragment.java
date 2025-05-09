package com.luminary.business.presentation.ui.fragments.newpayment.european;

import F8.o;
import Fa.h;
import O9.p;
import U4.b;
import android.os.Bundle;
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
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.european.NewPaymentEuropeanFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import d8.C0696a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0966k;
import ka.C0967l;
import ka.C0969n;
import t6.AbstractC1302b5;

/* compiled from: NewPaymentEuropeanFragment.kt */
/* loaded from: classes2.dex */
public final class NewPaymentEuropeanFragment extends BaseFragment<AbstractC1302b5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12783n0 = R.layout.fragment_new_payment_european;

    /* renamed from: o0, reason: collision with root package name */
    public final h f12784o0 = new h(kotlin.jvm.internal.h.a(d8.c.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.european.NewPaymentEuropeanFragment$special$$inlined$navArgs$1
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
    public final H1.a f12785p0;

    /* renamed from: q0, reason: collision with root package name */
    public PaymentUI f12786q0;

    /* renamed from: r0, reason: collision with root package name */
    public final ArrayList f12787r0;
    public boolean s0;

    /* renamed from: t0, reason: collision with root package name */
    public BankAccountDomain f12788t0;

    /* compiled from: NewPaymentEuropeanFragment.kt */
    public static final class f implements TabLayout.d {
        public f() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            PaymentUI paymentUI = NewPaymentEuropeanFragment.this.f12786q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11342n = gVar != null ? Integer.valueOf(gVar.f9855d) : null;
        }
    }

    /* compiled from: NewPaymentEuropeanFragment.kt */
    public static final class g implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12800a;

        public g(InterfaceC0646l interfaceC0646l) {
            this.f12800a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12800a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12800a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.newpayment.european.NewPaymentEuropeanFragment$special$$inlined$viewModel$default$1] */
    public NewPaymentEuropeanFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.european.NewPaymentEuropeanFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12785p0 = E.a(this, kotlin.jvm.internal.h.a(b8.h.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.european.NewPaymentEuropeanFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.european.NewPaymentEuropeanFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(b8.h.class), null, null, b.l(this));
            }
        });
        this.f12787r0 = new ArrayList();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.european);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.european);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void T0(String str, boolean z10) {
        AbstractC1302b5 u02 = u0();
        boolean g02 = D9.b.g0(str);
        CustomTextInputLayout customTextInputLayout = u02.f28828r;
        if (g02 || !z10) {
            customTextInputLayout.setError(null);
        } else {
            customTextInputLayout.setErrorWithoutFocus(getString(R.string.invalid_beneficiary));
        }
    }

    public final void U0(String str) {
        BankAccountDomain bankAccountDomain;
        String c2;
        Object obj;
        List<BankAccountDomain> value = ((b8.h) this.f12785p0.getValue()).f8470h1.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.f.b(((BankAccountDomain) obj).i, str)) {
                        break;
                    }
                }
            }
            bankAccountDomain = (BankAccountDomain) obj;
        } else {
            bankAccountDomain = null;
        }
        this.f12788t0 = bankAccountDomain;
        if (bankAccountDomain != null && bankAccountDomain.f10694a != null) {
            PaymentUI paymentUI = this.f12786q0;
            (paymentUI != null ? paymentUI : null).f11340l = C0969n.u0(str).toString();
            W0();
        }
        u0().f28827q.setVisibility(0);
        u0().f28826p.setVisibility(0);
        AbstractC1302b5 u02 = u0();
        BankAccountDomain bankAccountDomain2 = this.f12788t0;
        String str2 = "";
        u02.f28826p.setText(getString(R.string.available_balance_value, bankAccountDomain2 != null ? F8.b.b(bankAccountDomain2) : ""));
        AbstractC1302b5 u03 = u0();
        BankAccountDomain bankAccountDomain3 = this.f12788t0;
        if (bankAccountDomain3 != null && (c2 = F8.b.c(bankAccountDomain3)) != null) {
            str2 = c2;
        }
        u03.f28827q.setText(str2);
    }

    public final void V0() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        PaymentUI paymentUI = ((d8.c) this.f12784o0.getValue()).f20472a;
        if (paymentUI != null) {
            AbstractC1302b5 u02 = u0();
            u02.f28829s.setText(paymentUI.f11334e);
            String str = paymentUI.f11338j;
            u02.f28834x.setText(str != null ? C0967l.X(str, " ", "", false) : "");
            u02.f28822A.setText(paymentUI.f11339k);
            u02.f28836z.setText(paymentUI.f11336g);
            String str2 = paymentUI.i;
            u02.f28825o.c(str2 != null ? str2 : "", paymentUI.b());
            W0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W0() {
        /*
            r5 = this;
            F0.f r0 = r5.u0()
            t6.b5 r0 = (t6.AbstractC1302b5) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12786q0
            r2 = 0
            if (r1 != 0) goto Lc
            r1 = r2
        Lc:
            boolean r1 = r1.e()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L27
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12786q0
            if (r1 != 0) goto L19
            r1 = r2
        L19:
            java.math.BigDecimal r1 = r1.f11332c
            float r1 = r1.floatValue()
            boolean r1 = r5.X0(r1)
            if (r1 == 0) goto L27
            r1 = r4
            goto L28
        L27:
            r1 = r3
        L28:
            android.widget.Button r0 = r0.f28830t
            r0.setEnabled(r1)
            F0.f r0 = r5.u0()
            t6.b5 r0 = (t6.AbstractC1302b5) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12786q0
            if (r1 != 0) goto L38
            r1 = r2
        L38:
            boolean r1 = r1.e()
            if (r1 == 0) goto L51
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12786q0
            if (r1 != 0) goto L43
            goto L44
        L43:
            r2 = r1
        L44:
            java.math.BigDecimal r1 = r2.f11332c
            float r1 = r1.floatValue()
            boolean r1 = r5.X0(r1)
            if (r1 == 0) goto L51
            r3 = r4
        L51:
            android.widget.Button r0 = r0.f28831u
            r0.setEnabled(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.newpayment.european.NewPaymentEuropeanFragment.W0():void");
    }

    public final boolean X0(float f10) {
        BigDecimal bigDecimal;
        BankAccountDomain bankAccountDomain = this.f12788t0;
        if (((bankAccountDomain == null || (bigDecimal = bankAccountDomain.f10698e) == null) ? 0.0f : bigDecimal.floatValue()) < f10) {
            u0().f28824n.setErrorWithoutFocus(getString(R.string.you_do_not_have_enough_money));
            return false;
        }
        u0().f28824n.setError(null);
        return true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12786q0 = new PaymentUI(PaymentType.f11149c, BigDecimal.ZERO, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217696);
        PaymentUI paymentUI = ((d8.c) this.f12784o0.getValue()).f20472a;
        if (paymentUI != null) {
            PaymentUI paymentUI2 = this.f12786q0;
            (paymentUI2 == null ? null : paymentUI2).f11332c = paymentUI.f11332c;
            (paymentUI2 == null ? null : paymentUI2).f11339k = paymentUI.f11339k;
            (paymentUI2 == null ? null : paymentUI2).f11338j = paymentUI.f11338j;
            if (paymentUI2 == null) {
                paymentUI2 = null;
            }
            paymentUI2.f11334e = paymentUI.f11334e;
        }
        PaymentUI paymentUI3 = this.f12786q0;
        (paymentUI3 == null ? null : paymentUI3).f11337h = "eur";
        (paymentUI3 == null ? null : paymentUI3).i = "€";
        (paymentUI3 != null ? paymentUI3 : null).f11342n = 0;
        this.f11471m0 = (b8.h) this.f12785p0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        PaymentUI paymentUI = this.f12786q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        Integer num = paymentUI.f11342n;
        if (num != null) {
            int intValue = num.intValue();
            AbstractC1302b5 u02 = u0();
            u02.f28823B.k(u0().f28823B.h(intValue), true);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        f fVar = new f();
        H1.a aVar = this.f12785p0;
        ((b8.h) aVar.getValue()).f8474l1.observe(getViewLifecycleOwner(), new g(new C0696a(this, 0)));
        ((b8.h) aVar.getValue()).n(1);
        ((b8.h) aVar.getValue()).f8470h1.observe(getViewLifecycleOwner(), new g(new C0696a(this, 1)));
        AbstractC1302b5 u02 = u0();
        u02.f28829s.addTextChangedListener(new a());
        u02.f28834x.addTextChangedListener(new b());
        u02.f28822A.addTextChangedListener(new c());
        u02.f28836z.addTextChangedListener(new d());
        e eVar = new e();
        CustomTextInputEditText customTextInputEditText = u02.f28825o;
        customTextInputEditText.addTextChangedListener(eVar);
        final int i = 0;
        o.c(u02.f28830t, 500L, new InterfaceC0635a(this) { // from class: d8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentEuropeanFragment f20471b;

            {
                this.f20471b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        NewPaymentEuropeanFragment newPaymentEuropeanFragment = this.f20471b;
                        NavController g10 = U4.b.g(newPaymentEuropeanFragment);
                        PaymentUI paymentUI = newPaymentEuropeanFragment.f12786q0;
                        if (paymentUI == null) {
                            paymentUI = null;
                        }
                        h hVar = newPaymentEuropeanFragment.f12784o0;
                        g10.j(new d(paymentUI, ((c) hVar.getValue()).f20473b, ((c) hVar.getValue()).f20474c));
                        break;
                    default:
                        NewPaymentEuropeanFragment newPaymentEuropeanFragment2 = this.f20471b;
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(newPaymentEuropeanFragment2.requireContext(), StatementsSelectorDialog.DialogType.f13044b);
                        statementsSelectorDialog.f13040u = new C0696a(newPaymentEuropeanFragment2, 2);
                        statementsSelectorDialog.show();
                        StatementsSelectorDialog.l(statementsSelectorDialog, newPaymentEuropeanFragment2.f12787r0);
                        statementsSelectorDialog.m(newPaymentEuropeanFragment2.getString(R.string.from_account));
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(u02.f28831u, 500L, new A8.b(u02, 27));
        PaymentUI paymentUI = this.f12786q0;
        String str = (paymentUI == null ? null : paymentUI).i;
        if (str == null) {
            str = "";
        }
        if (paymentUI == null) {
            paymentUI = null;
        }
        customTextInputEditText.c(str, paymentUI.f11332c.toString());
        u02.f28823B.a(fVar);
        final int i9 = 1;
        o.c(u02.f28833w, 500L, new InterfaceC0635a(this) { // from class: d8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentEuropeanFragment f20471b;

            {
                this.f20471b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        NewPaymentEuropeanFragment newPaymentEuropeanFragment = this.f20471b;
                        NavController g10 = U4.b.g(newPaymentEuropeanFragment);
                        PaymentUI paymentUI2 = newPaymentEuropeanFragment.f12786q0;
                        if (paymentUI2 == null) {
                            paymentUI2 = null;
                        }
                        h hVar = newPaymentEuropeanFragment.f12784o0;
                        g10.j(new d(paymentUI2, ((c) hVar.getValue()).f20473b, ((c) hVar.getValue()).f20474c));
                        break;
                    default:
                        NewPaymentEuropeanFragment newPaymentEuropeanFragment2 = this.f20471b;
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(newPaymentEuropeanFragment2.requireContext(), StatementsSelectorDialog.DialogType.f13044b);
                        statementsSelectorDialog.f13040u = new C0696a(newPaymentEuropeanFragment2, 2);
                        statementsSelectorDialog.show();
                        StatementsSelectorDialog.l(statementsSelectorDialog, newPaymentEuropeanFragment2.f12787r0);
                        statementsSelectorDialog.m(newPaymentEuropeanFragment2.getString(R.string.from_account));
                        break;
                }
                return p.f3034a;
            }
        });
        F8.g.a(u0().f28829s, new C0696a(this, 3));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12783n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f28830t.setVisibility(0);
        o.b(u0().f28831u);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f28830t);
        u0().f28831u.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentEuropeanFragment newPaymentEuropeanFragment = NewPaymentEuropeanFragment.this;
            PaymentUI paymentUI = newPaymentEuropeanFragment.f12786q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11334e = String.valueOf(charSequence);
            newPaymentEuropeanFragment.T0(String.valueOf(charSequence), false);
            newPaymentEuropeanFragment.W0();
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
            NewPaymentEuropeanFragment newPaymentEuropeanFragment = NewPaymentEuropeanFragment.this;
            PaymentUI paymentUI = newPaymentEuropeanFragment.f12786q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11338j = String.valueOf(charSequence);
            newPaymentEuropeanFragment.W0();
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
            NewPaymentEuropeanFragment newPaymentEuropeanFragment = NewPaymentEuropeanFragment.this;
            PaymentUI paymentUI = newPaymentEuropeanFragment.f12786q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11339k = String.valueOf(charSequence);
            newPaymentEuropeanFragment.W0();
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
            NewPaymentEuropeanFragment newPaymentEuropeanFragment = NewPaymentEuropeanFragment.this;
            PaymentUI paymentUI = newPaymentEuropeanFragment.f12786q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11336g = String.valueOf(charSequence);
            newPaymentEuropeanFragment.W0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentEuropeanFragment newPaymentEuropeanFragment = NewPaymentEuropeanFragment.this;
            PaymentUI paymentUI = newPaymentEuropeanFragment.f12786q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            BigDecimal Q4 = C0966k.Q(D9.b.r0(String.valueOf(charSequence)));
            if (Q4 == null) {
                Q4 = BigDecimal.ZERO;
            }
            paymentUI.f11332c = Q4;
            newPaymentEuropeanFragment.W0();
            PaymentUI paymentUI2 = newPaymentEuropeanFragment.f12786q0;
            newPaymentEuropeanFragment.X0((paymentUI2 != null ? paymentUI2 : null).f11332c.floatValue());
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
