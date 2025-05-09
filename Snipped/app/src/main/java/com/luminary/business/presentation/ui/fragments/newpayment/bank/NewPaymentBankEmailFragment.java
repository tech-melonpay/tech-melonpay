package com.luminary.business.presentation.ui.fragments.newpayment.bank;

import B5.c;
import F8.i;
import F8.j;
import F8.o;
import Fa.h;
import O9.p;
import P9.s;
import U4.b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import c.RunnableC0615f;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.extensions.FeeType;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0966k;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import t6.W4;

/* compiled from: NewPaymentBankEmailFragment.kt */
/* loaded from: classes2.dex */
public final class NewPaymentBankEmailFragment extends BaseFragment<W4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12740n0 = R.layout.fragment_new_payment_bank_email;

    /* renamed from: o0, reason: collision with root package name */
    public final h f12741o0 = new h(kotlin.jvm.internal.h.a(c8.b.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment$special$$inlined$navArgs$1
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

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f12742p0;

    /* renamed from: q0, reason: collision with root package name */
    public PaymentUI f12743q0;

    /* renamed from: r0, reason: collision with root package name */
    public State f12744r0;
    public String s0;

    /* renamed from: t0, reason: collision with root package name */
    public final ArrayList f12745t0;

    /* renamed from: u0, reason: collision with root package name */
    public Integer f12746u0;

    /* renamed from: v0, reason: collision with root package name */
    public BankAccountDomain f12747v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f12748w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f12749x0;

    /* renamed from: y0, reason: collision with root package name */
    public final Handler f12750y0;

    /* renamed from: z0, reason: collision with root package name */
    public RunnableC0615f f12751z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewPaymentBankEmailFragment.kt */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f12757a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f12758b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ State[] f12759c;

        static {
            State state = new State("INIT", 0);
            f12757a = state;
            State state2 = new State("ACCOUNT", 1);
            State state3 = new State("EMAIL", 2);
            f12758b = state3;
            f12759c = new State[]{state, state2, state3};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f12759c.clone();
        }
    }

    /* compiled from: NewPaymentBankEmailFragment.kt */
    public static final class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            NewPaymentBankEmailFragment newPaymentBankEmailFragment;
            String U02;
            Integer num;
            if (z10 || (U02 = (newPaymentBankEmailFragment = NewPaymentBankEmailFragment.this).U0()) == null || (num = newPaymentBankEmailFragment.f12746u0) == null) {
                return;
            }
            int intValue = num.intValue();
            b8.h W02 = newPaymentBankEmailFragment.W0();
            H7.c cVar = new H7.c(W02, U02, newPaymentBankEmailFragment.s0, intValue);
            W02.f423P0 = cVar;
            cVar.invoke();
        }
    }

    /* compiled from: NewPaymentBankEmailFragment.kt */
    public static final class g implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12766a;

        public g(InterfaceC0646l interfaceC0646l) {
            this.f12766a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12766a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12766a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment$special$$inlined$viewModel$default$1] */
    public NewPaymentBankEmailFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12742p0 = E.a(this, kotlin.jvm.internal.h.a(b8.h.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(b8.h.class), null, null, b.l(this));
            }
        });
        this.f12744r0 = State.f12757a;
        this.s0 = "eur";
        this.f12745t0 = new ArrayList();
        this.f12750y0 = new Handler(Looper.getMainLooper());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.bank_app_payment);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.bank_app_payment);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void T0() {
        if (!this.f12749x0) {
            o.b(u0().f28632C);
            return;
        }
        String valueOf = String.valueOf(u0().f28640t.getText());
        PaymentUI paymentUI = this.f12743q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        if (kotlin.jvm.internal.f.b(valueOf, paymentUI.f11334e)) {
            o.b(u0().f28632C);
        } else {
            u0().f28632C.setVisibility(0);
        }
    }

    public final String U0() {
        String obj;
        Editable text = u0().f28644x.getText();
        if (text != null && (obj = text.toString()) != null && D9.b.h0(obj)) {
            return obj;
        }
        u0().f28643w.setErrorWithoutFocus(getString(R.string.invalid_email));
        return null;
    }

    public final c8.b V0() {
        return (c8.b) this.f12741o0.getValue();
    }

    public final b8.h W0() {
        return (b8.h) this.f12742p0.getValue();
    }

    public final void X0(String str, boolean z10) {
        W4 u02 = u0();
        boolean g02 = D9.b.g0(str);
        CustomTextInputLayout customTextInputLayout = u02.f28639s;
        if (g02 || !z10) {
            customTextInputLayout.setError(null);
        } else {
            customTextInputLayout.setErrorWithoutFocus(getString(R.string.invalid_beneficiary));
        }
    }

    public final void Y0(int i) {
        BankAccountDomain bankAccountDomain;
        String U02;
        Integer num;
        Integer num2;
        Integer g10;
        Object obj;
        List<BankAccountDomain> value = W0().f8469g1.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer num3 = ((BankAccountDomain) obj).f10694a;
                if (num3 != null && num3.intValue() == i) {
                    break;
                }
            }
            bankAccountDomain = (BankAccountDomain) obj;
        } else {
            bankAccountDomain = null;
        }
        this.f12747v0 = bankAccountDomain;
        if (bankAccountDomain != null && (g10 = F8.b.g(bankAccountDomain, requireContext())) != null) {
            u0().f28631B.setImageResource(g10.intValue());
        }
        u0().f28631B.setVisibility(0);
        u0().f28630A.setText(C0969n.u0(String.valueOf(u0().f28630A.getText())).toString());
        u0().f28646z.e();
        u0().f28635o.setEnabled(true);
        u0().f28644x.setEnabled(true);
        BankAccountDomain bankAccountDomain2 = this.f12747v0;
        this.s0 = String.valueOf(bankAccountDomain2 != null ? bankAccountDomain2.f10701h : null);
        BankAccountDomain bankAccountDomain3 = this.f12747v0;
        if (bankAccountDomain3 != null) {
            u0().f28635o.setCurrency(F8.b.e(bankAccountDomain3));
        }
        BankAccountDomain bankAccountDomain4 = this.f12747v0;
        if (bankAccountDomain4 != null && (num2 = bankAccountDomain4.f10694a) != null) {
            int intValue = num2.intValue();
            this.f12746u0 = Integer.valueOf(intValue);
            PaymentUI paymentUI = this.f12743q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11330a = String.valueOf(intValue);
            a1();
            PaymentUI paymentUI2 = this.f12743q0;
            PaymentUI paymentUI3 = paymentUI2 == null ? null : paymentUI2;
            BankAccountDomain bankAccountDomain5 = this.f12747v0;
            paymentUI3.f11340l = bankAccountDomain5 != null ? bankAccountDomain5.i : null;
            if (paymentUI2 == null) {
                paymentUI2 = null;
            }
            paymentUI2.f11337h = this.s0;
        }
        PaymentUI paymentUI4 = this.f12743q0;
        if (paymentUI4 == null) {
            paymentUI4 = null;
        }
        paymentUI4.i = K3.a.a(this.s0);
        u0().f28636p.setVisibility(0);
        W4 u02 = u0();
        String string = getString(R.string.available_balance_value, "");
        BankAccountDomain bankAccountDomain6 = this.f12747v0;
        u02.f28636p.setText(TextUtils.concat(string, bankAccountDomain6 != null ? F8.b.a(bankAccountDomain6, 13, 9) : ""));
        Editable text = u0().f28644x.getText();
        if (text != null && text.length() != 0 && (U02 = U0()) != null && (num = this.f12746u0) != null) {
            int intValue2 = num.intValue();
            b8.h W02 = W0();
            H7.c cVar = new H7.c(W02, U02, this.s0, intValue2);
            W02.f423P0 = cVar;
            cVar.invoke();
        }
        b8.h W03 = W0();
        PaymentUI paymentUI5 = this.f12743q0;
        if (paymentUI5 == null) {
            paymentUI5 = null;
        }
        String obj2 = paymentUI5.f11331b.toString();
        PaymentUI paymentUI6 = this.f12743q0;
        D7.d dVar = new D7.d(W03, obj2, (paymentUI6 == null ? null : paymentUI6).f11332c, (paymentUI6 != null ? paymentUI6 : null).f11337h);
        W03.f419K0 = dVar;
        dVar.invoke();
    }

    public final void Z0() {
        if (this.f12748w0) {
            return;
        }
        this.f12748w0 = true;
        PaymentUI paymentUI = V0().f8588a;
        if (paymentUI != null) {
            W4 u02 = u0();
            u02.f28640t.setText(paymentUI.f11334e);
            u02.f28633D.setText(paymentUI.f11336g);
            u02.f28644x.setText(paymentUI.f11347s);
            String str = paymentUI.i;
            if (str == null) {
                str = "";
            }
            u02.f28635o.c(str, paymentUI.f11332c.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a1() {
        /*
            r5 = this;
            com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment$State r0 = r5.f12744r0
            com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment$State r1 = com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment.State.f12758b
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L65
            F0.f r0 = r5.u0()
            t6.W4 r0 = (t6.W4) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12743q0
            if (r1 != 0) goto L14
            r1 = r4
        L14:
            boolean r1 = r1.e()
            if (r1 == 0) goto L31
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12743q0
            if (r1 != 0) goto L1f
            r1 = r4
        L1f:
            java.math.BigDecimal r1 = r1.f11332c
            float r1 = r1.floatValue()
            boolean r1 = r5.b1(r1)
            if (r1 == 0) goto L31
            boolean r1 = r5.f12749x0
            if (r1 == 0) goto L31
            r1 = r3
            goto L32
        L31:
            r1 = r2
        L32:
            android.widget.Button r0 = r0.f28641u
            r0.setEnabled(r1)
            F0.f r0 = r5.u0()
            t6.W4 r0 = (t6.W4) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12743q0
            if (r1 != 0) goto L42
            r1 = r4
        L42:
            boolean r1 = r1.e()
            if (r1 == 0) goto L5f
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12743q0
            if (r1 != 0) goto L4d
            goto L4e
        L4d:
            r4 = r1
        L4e:
            java.math.BigDecimal r1 = r4.f11332c
            float r1 = r1.floatValue()
            boolean r1 = r5.b1(r1)
            if (r1 == 0) goto L5f
            boolean r1 = r5.f12749x0
            if (r1 == 0) goto L5f
            r2 = r3
        L5f:
            android.widget.Button r0 = r0.f28642v
            r0.setEnabled(r2)
            goto Lc4
        L65:
            com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment$State r1 = com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment.State.f12757a
            if (r0 != r1) goto Lc4
            F0.f r0 = r5.u0()
            t6.W4 r0 = (t6.W4) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12743q0
            if (r1 != 0) goto L74
            r1 = r4
        L74:
            boolean r1 = r1.e()
            if (r1 == 0) goto L91
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12743q0
            if (r1 != 0) goto L7f
            r1 = r4
        L7f:
            java.math.BigDecimal r1 = r1.f11332c
            float r1 = r1.floatValue()
            boolean r1 = r5.b1(r1)
            if (r1 == 0) goto L91
            boolean r1 = r5.f12749x0
            if (r1 == 0) goto L91
            r1 = r3
            goto L92
        L91:
            r1 = r2
        L92:
            android.widget.Button r0 = r0.f28641u
            r0.setEnabled(r1)
            F0.f r0 = r5.u0()
            t6.W4 r0 = (t6.W4) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12743q0
            if (r1 != 0) goto La2
            r1 = r4
        La2:
            boolean r1 = r1.e()
            if (r1 == 0) goto Lbf
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12743q0
            if (r1 != 0) goto Lad
            goto Lae
        Lad:
            r4 = r1
        Lae:
            java.math.BigDecimal r1 = r4.f11332c
            float r1 = r1.floatValue()
            boolean r1 = r5.b1(r1)
            if (r1 == 0) goto Lbf
            boolean r1 = r5.f12749x0
            if (r1 == 0) goto Lbf
            r2 = r3
        Lbf:
            android.widget.Button r0 = r0.f28642v
            r0.setEnabled(r2)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankEmailFragment.a1():void");
    }

    public final boolean b1(float f10) {
        BigDecimal bigDecimal;
        BankAccountDomain bankAccountDomain = this.f12747v0;
        float floatValue = (bankAccountDomain == null || (bigDecimal = bankAccountDomain.f10698e) == null) ? 0.0f : bigDecimal.floatValue();
        PaymentUI paymentUI = this.f12743q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        if (floatValue < f10 + paymentUI.f11345q) {
            u0().f28634n.setErrorWithoutFocus(getString(R.string.you_do_not_have_enough_money));
            return false;
        }
        u0().f28634n.setError(null);
        return true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12743q0 = new PaymentUI(PaymentType.f11147a, BigDecimal.ZERO, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217696);
        PaymentUI paymentUI = V0().f8588a;
        if (paymentUI != null) {
            PaymentUI paymentUI2 = this.f12743q0;
            (paymentUI2 == null ? null : paymentUI2).f11332c = paymentUI.f11332c;
            (paymentUI2 == null ? null : paymentUI2).f11331b = paymentUI.f11331b;
            if (paymentUI2 == null) {
                paymentUI2 = null;
            }
            paymentUI2.f11343o = paymentUI.f11343o;
        }
        PaymentUI paymentUI3 = this.f12743q0;
        (paymentUI3 != null ? paymentUI3 : null).f11342n = 0;
        this.f11471m0 = W0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Integer num;
        super.onResume();
        BankAccountDomain bankAccountDomain = this.f12747v0;
        if (bankAccountDomain == null || (num = bankAccountDomain.f10694a) == null) {
            return;
        }
        Y0(num.intValue());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        W0().f8477p1.observe(getViewLifecycleOwner(), new g(new InterfaceC0646l(this) { // from class: c8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankEmailFragment f8587b;

            {
                this.f8587b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Integer num;
                Object obj2;
                Integer num2;
                String str;
                Integer num3;
                switch (i) {
                    case 0:
                        String str2 = (String) obj;
                        if (str2 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment = this.f8587b;
                            newPaymentBankEmailFragment.f12749x0 = false;
                            newPaymentBankEmailFragment.u0().f28643w.setErrorWithoutFocus(str2);
                            newPaymentBankEmailFragment.T0();
                            newPaymentBankEmailFragment.W0().f8477p1.postValue(null);
                            break;
                        }
                    case 1:
                        String str3 = (String) obj;
                        if (str3 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment2 = this.f8587b;
                            NavController g10 = U4.b.g(newPaymentBankEmailFragment2);
                            PaymentUI paymentUI = newPaymentBankEmailFragment2.f12743q0;
                            if (paymentUI == null) {
                                paymentUI = null;
                            }
                            g10.j(new c(paymentUI, newPaymentBankEmailFragment2.V0().f8589b, str3, newPaymentBankEmailFragment2.V0().f8590c));
                            newPaymentBankEmailFragment2.W0().f8479r1.postValue(null);
                            break;
                        }
                    case 2:
                        this.f8587b.X0((String) obj, true);
                        break;
                    case 3:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment3 = this.f8587b;
                        NavController g11 = U4.b.g(newPaymentBankEmailFragment3);
                        PaymentUI paymentUI2 = newPaymentBankEmailFragment3.f12743q0;
                        if (paymentUI2 == null) {
                            paymentUI2 = null;
                        }
                        g11.j(new c(paymentUI2, newPaymentBankEmailFragment3.V0().f8589b, null, newPaymentBankEmailFragment3.V0().f8590c));
                        break;
                    case 4:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment4 = this.f8587b;
                        newPaymentBankEmailFragment4.f12745t0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentBankEmailFragment4.f12745t0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    W4 u02 = newPaymentBankEmailFragment4.u0();
                                    StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    u02.f28630A.setText(aVar != null ? aVar.f13052a : null);
                                    newPaymentBankEmailFragment4.u0().f28646z.e();
                                    StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    if (aVar2 != null && (num3 = aVar2.f13059h) != null) {
                                        newPaymentBankEmailFragment4.Y0(num3.intValue());
                                    }
                                    newPaymentBankEmailFragment4.u0().f28631B.setVisibility(0);
                                    newPaymentBankEmailFragment4.Z0();
                                } else {
                                    if (newPaymentBankEmailFragment4.V0().f8588a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentBankEmailFragment4.V0().f8588a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar3 = (StatementsSelectorDialog.a) obj2;
                                        W4 u03 = newPaymentBankEmailFragment4.u0();
                                        if (aVar3 != null && (str = aVar3.f13052a) != null) {
                                            r5 = C0969n.u0(str).toString();
                                        }
                                        u03.f28630A.setText(r5);
                                        if (aVar3 != null && (num2 = aVar3.f13059h) != null) {
                                            newPaymentBankEmailFragment4.Y0(num2.intValue());
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentBankEmailFragment4.f12747v0;
                                        if (bankAccountDomain != null && (num = bankAccountDomain.f10694a) != null) {
                                            newPaymentBankEmailFragment4.Y0(num.intValue());
                                        }
                                    }
                                    newPaymentBankEmailFragment4.Z0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str4 = bankAccountDomain2.i;
                                String str5 = str4 == null ? "" : str4;
                                String str6 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str5, D9.b.D(str6), str6 == null ? "" : str6, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, bankAccountDomain2.f10701h, bankAccountDomain2.f10694a, false, 288));
                            }
                        }
                        break;
                    case 5:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment5 = this.f8587b;
                        PaymentUI paymentUI3 = newPaymentBankEmailFragment5.f12743q0;
                        String str7 = (paymentUI3 == null ? null : paymentUI3).f11337h;
                        if (paymentUI3 == null) {
                            paymentUI3 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI3.f11345q = j.b(hVar, feeType, str7);
                        PaymentUI paymentUI4 = newPaymentBankEmailFragment5.f12743q0;
                        (paymentUI4 != null ? paymentUI4 : null).f11346r = j.a(hVar, feeType, str7);
                        break;
                    case 6:
                        s5.e eVar = (s5.e) obj;
                        String str8 = eVar.f26620d;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment6 = this.f8587b;
                        if (str8 != null) {
                            PaymentUI paymentUI5 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI5 == null) {
                                paymentUI5 = null;
                            }
                            paymentUI5.f11337h = str8.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI6 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI6 == null) {
                            paymentUI6 = null;
                        }
                        String str9 = eVar.f26620d;
                        paymentUI6.i = str9 != null ? K3.a.a(str9) : null;
                        newPaymentBankEmailFragment6.u0().f28635o.setEnabled(true);
                        if (str9 != null) {
                            String C10 = D9.b.C(str9);
                            W4 u04 = newPaymentBankEmailFragment6.u0();
                            PaymentUI paymentUI7 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI7 == null) {
                                paymentUI7 = null;
                            }
                            u04.f28635o.c(C10, paymentUI7.f11332c.toString());
                        }
                        newPaymentBankEmailFragment6.a1();
                        PaymentUI paymentUI8 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI8 == null) {
                            paymentUI8 = null;
                        }
                        String str10 = paymentUI8.f11337h;
                        B5.h value = newPaymentBankEmailFragment6.W0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI9 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI9 == null) {
                                paymentUI9 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI9.f11345q = j.b(value, feeType2, str10);
                            PaymentUI paymentUI10 = newPaymentBankEmailFragment6.f12743q0;
                            (paymentUI10 != null ? paymentUI10 : null).f11346r = j.a(value, feeType2, str10);
                        }
                        break;
                    default:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment7 = this.f8587b;
                        newPaymentBankEmailFragment7.u0().f28637q.setError((String) obj);
                        newPaymentBankEmailFragment7.a1();
                        break;
                }
                return p.f3034a;
            }
        }));
        W0().n(0);
        final int i9 = 4;
        W0().f8469g1.observe(getViewLifecycleOwner(), new g(new InterfaceC0646l(this) { // from class: c8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankEmailFragment f8587b;

            {
                this.f8587b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Integer num;
                Object obj2;
                Integer num2;
                String str;
                Integer num3;
                switch (i9) {
                    case 0:
                        String str2 = (String) obj;
                        if (str2 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment = this.f8587b;
                            newPaymentBankEmailFragment.f12749x0 = false;
                            newPaymentBankEmailFragment.u0().f28643w.setErrorWithoutFocus(str2);
                            newPaymentBankEmailFragment.T0();
                            newPaymentBankEmailFragment.W0().f8477p1.postValue(null);
                            break;
                        }
                    case 1:
                        String str3 = (String) obj;
                        if (str3 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment2 = this.f8587b;
                            NavController g10 = U4.b.g(newPaymentBankEmailFragment2);
                            PaymentUI paymentUI = newPaymentBankEmailFragment2.f12743q0;
                            if (paymentUI == null) {
                                paymentUI = null;
                            }
                            g10.j(new c(paymentUI, newPaymentBankEmailFragment2.V0().f8589b, str3, newPaymentBankEmailFragment2.V0().f8590c));
                            newPaymentBankEmailFragment2.W0().f8479r1.postValue(null);
                            break;
                        }
                    case 2:
                        this.f8587b.X0((String) obj, true);
                        break;
                    case 3:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment3 = this.f8587b;
                        NavController g11 = U4.b.g(newPaymentBankEmailFragment3);
                        PaymentUI paymentUI2 = newPaymentBankEmailFragment3.f12743q0;
                        if (paymentUI2 == null) {
                            paymentUI2 = null;
                        }
                        g11.j(new c(paymentUI2, newPaymentBankEmailFragment3.V0().f8589b, null, newPaymentBankEmailFragment3.V0().f8590c));
                        break;
                    case 4:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment4 = this.f8587b;
                        newPaymentBankEmailFragment4.f12745t0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentBankEmailFragment4.f12745t0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    W4 u02 = newPaymentBankEmailFragment4.u0();
                                    StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    u02.f28630A.setText(aVar != null ? aVar.f13052a : null);
                                    newPaymentBankEmailFragment4.u0().f28646z.e();
                                    StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    if (aVar2 != null && (num3 = aVar2.f13059h) != null) {
                                        newPaymentBankEmailFragment4.Y0(num3.intValue());
                                    }
                                    newPaymentBankEmailFragment4.u0().f28631B.setVisibility(0);
                                    newPaymentBankEmailFragment4.Z0();
                                } else {
                                    if (newPaymentBankEmailFragment4.V0().f8588a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentBankEmailFragment4.V0().f8588a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar3 = (StatementsSelectorDialog.a) obj2;
                                        W4 u03 = newPaymentBankEmailFragment4.u0();
                                        if (aVar3 != null && (str = aVar3.f13052a) != null) {
                                            r5 = C0969n.u0(str).toString();
                                        }
                                        u03.f28630A.setText(r5);
                                        if (aVar3 != null && (num2 = aVar3.f13059h) != null) {
                                            newPaymentBankEmailFragment4.Y0(num2.intValue());
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentBankEmailFragment4.f12747v0;
                                        if (bankAccountDomain != null && (num = bankAccountDomain.f10694a) != null) {
                                            newPaymentBankEmailFragment4.Y0(num.intValue());
                                        }
                                    }
                                    newPaymentBankEmailFragment4.Z0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str4 = bankAccountDomain2.i;
                                String str5 = str4 == null ? "" : str4;
                                String str6 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str5, D9.b.D(str6), str6 == null ? "" : str6, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, bankAccountDomain2.f10701h, bankAccountDomain2.f10694a, false, 288));
                            }
                        }
                        break;
                    case 5:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment5 = this.f8587b;
                        PaymentUI paymentUI3 = newPaymentBankEmailFragment5.f12743q0;
                        String str7 = (paymentUI3 == null ? null : paymentUI3).f11337h;
                        if (paymentUI3 == null) {
                            paymentUI3 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI3.f11345q = j.b(hVar, feeType, str7);
                        PaymentUI paymentUI4 = newPaymentBankEmailFragment5.f12743q0;
                        (paymentUI4 != null ? paymentUI4 : null).f11346r = j.a(hVar, feeType, str7);
                        break;
                    case 6:
                        s5.e eVar = (s5.e) obj;
                        String str8 = eVar.f26620d;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment6 = this.f8587b;
                        if (str8 != null) {
                            PaymentUI paymentUI5 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI5 == null) {
                                paymentUI5 = null;
                            }
                            paymentUI5.f11337h = str8.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI6 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI6 == null) {
                            paymentUI6 = null;
                        }
                        String str9 = eVar.f26620d;
                        paymentUI6.i = str9 != null ? K3.a.a(str9) : null;
                        newPaymentBankEmailFragment6.u0().f28635o.setEnabled(true);
                        if (str9 != null) {
                            String C10 = D9.b.C(str9);
                            W4 u04 = newPaymentBankEmailFragment6.u0();
                            PaymentUI paymentUI7 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI7 == null) {
                                paymentUI7 = null;
                            }
                            u04.f28635o.c(C10, paymentUI7.f11332c.toString());
                        }
                        newPaymentBankEmailFragment6.a1();
                        PaymentUI paymentUI8 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI8 == null) {
                            paymentUI8 = null;
                        }
                        String str10 = paymentUI8.f11337h;
                        B5.h value = newPaymentBankEmailFragment6.W0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI9 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI9 == null) {
                                paymentUI9 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI9.f11345q = j.b(value, feeType2, str10);
                            PaymentUI paymentUI10 = newPaymentBankEmailFragment6.f12743q0;
                            (paymentUI10 != null ? paymentUI10 : null).f11346r = j.a(value, feeType2, str10);
                        }
                        break;
                    default:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment7 = this.f8587b;
                        newPaymentBankEmailFragment7.u0().f28637q.setError((String) obj);
                        newPaymentBankEmailFragment7.a1();
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 5;
        W0().f8474l1.observe(getViewLifecycleOwner(), new g(new InterfaceC0646l(this) { // from class: c8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankEmailFragment f8587b;

            {
                this.f8587b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Integer num;
                Object obj2;
                Integer num2;
                String str;
                Integer num3;
                switch (i10) {
                    case 0:
                        String str2 = (String) obj;
                        if (str2 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment = this.f8587b;
                            newPaymentBankEmailFragment.f12749x0 = false;
                            newPaymentBankEmailFragment.u0().f28643w.setErrorWithoutFocus(str2);
                            newPaymentBankEmailFragment.T0();
                            newPaymentBankEmailFragment.W0().f8477p1.postValue(null);
                            break;
                        }
                    case 1:
                        String str3 = (String) obj;
                        if (str3 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment2 = this.f8587b;
                            NavController g10 = U4.b.g(newPaymentBankEmailFragment2);
                            PaymentUI paymentUI = newPaymentBankEmailFragment2.f12743q0;
                            if (paymentUI == null) {
                                paymentUI = null;
                            }
                            g10.j(new c(paymentUI, newPaymentBankEmailFragment2.V0().f8589b, str3, newPaymentBankEmailFragment2.V0().f8590c));
                            newPaymentBankEmailFragment2.W0().f8479r1.postValue(null);
                            break;
                        }
                    case 2:
                        this.f8587b.X0((String) obj, true);
                        break;
                    case 3:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment3 = this.f8587b;
                        NavController g11 = U4.b.g(newPaymentBankEmailFragment3);
                        PaymentUI paymentUI2 = newPaymentBankEmailFragment3.f12743q0;
                        if (paymentUI2 == null) {
                            paymentUI2 = null;
                        }
                        g11.j(new c(paymentUI2, newPaymentBankEmailFragment3.V0().f8589b, null, newPaymentBankEmailFragment3.V0().f8590c));
                        break;
                    case 4:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment4 = this.f8587b;
                        newPaymentBankEmailFragment4.f12745t0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentBankEmailFragment4.f12745t0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    W4 u02 = newPaymentBankEmailFragment4.u0();
                                    StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    u02.f28630A.setText(aVar != null ? aVar.f13052a : null);
                                    newPaymentBankEmailFragment4.u0().f28646z.e();
                                    StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    if (aVar2 != null && (num3 = aVar2.f13059h) != null) {
                                        newPaymentBankEmailFragment4.Y0(num3.intValue());
                                    }
                                    newPaymentBankEmailFragment4.u0().f28631B.setVisibility(0);
                                    newPaymentBankEmailFragment4.Z0();
                                } else {
                                    if (newPaymentBankEmailFragment4.V0().f8588a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentBankEmailFragment4.V0().f8588a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar3 = (StatementsSelectorDialog.a) obj2;
                                        W4 u03 = newPaymentBankEmailFragment4.u0();
                                        if (aVar3 != null && (str = aVar3.f13052a) != null) {
                                            r5 = C0969n.u0(str).toString();
                                        }
                                        u03.f28630A.setText(r5);
                                        if (aVar3 != null && (num2 = aVar3.f13059h) != null) {
                                            newPaymentBankEmailFragment4.Y0(num2.intValue());
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentBankEmailFragment4.f12747v0;
                                        if (bankAccountDomain != null && (num = bankAccountDomain.f10694a) != null) {
                                            newPaymentBankEmailFragment4.Y0(num.intValue());
                                        }
                                    }
                                    newPaymentBankEmailFragment4.Z0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str4 = bankAccountDomain2.i;
                                String str5 = str4 == null ? "" : str4;
                                String str6 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str5, D9.b.D(str6), str6 == null ? "" : str6, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, bankAccountDomain2.f10701h, bankAccountDomain2.f10694a, false, 288));
                            }
                        }
                        break;
                    case 5:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment5 = this.f8587b;
                        PaymentUI paymentUI3 = newPaymentBankEmailFragment5.f12743q0;
                        String str7 = (paymentUI3 == null ? null : paymentUI3).f11337h;
                        if (paymentUI3 == null) {
                            paymentUI3 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI3.f11345q = j.b(hVar, feeType, str7);
                        PaymentUI paymentUI4 = newPaymentBankEmailFragment5.f12743q0;
                        (paymentUI4 != null ? paymentUI4 : null).f11346r = j.a(hVar, feeType, str7);
                        break;
                    case 6:
                        s5.e eVar = (s5.e) obj;
                        String str8 = eVar.f26620d;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment6 = this.f8587b;
                        if (str8 != null) {
                            PaymentUI paymentUI5 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI5 == null) {
                                paymentUI5 = null;
                            }
                            paymentUI5.f11337h = str8.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI6 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI6 == null) {
                            paymentUI6 = null;
                        }
                        String str9 = eVar.f26620d;
                        paymentUI6.i = str9 != null ? K3.a.a(str9) : null;
                        newPaymentBankEmailFragment6.u0().f28635o.setEnabled(true);
                        if (str9 != null) {
                            String C10 = D9.b.C(str9);
                            W4 u04 = newPaymentBankEmailFragment6.u0();
                            PaymentUI paymentUI7 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI7 == null) {
                                paymentUI7 = null;
                            }
                            u04.f28635o.c(C10, paymentUI7.f11332c.toString());
                        }
                        newPaymentBankEmailFragment6.a1();
                        PaymentUI paymentUI8 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI8 == null) {
                            paymentUI8 = null;
                        }
                        String str10 = paymentUI8.f11337h;
                        B5.h value = newPaymentBankEmailFragment6.W0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI9 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI9 == null) {
                                paymentUI9 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI9.f11345q = j.b(value, feeType2, str10);
                            PaymentUI paymentUI10 = newPaymentBankEmailFragment6.f12743q0;
                            (paymentUI10 != null ? paymentUI10 : null).f11346r = j.a(value, feeType2, str10);
                        }
                        break;
                    default:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment7 = this.f8587b;
                        newPaymentBankEmailFragment7.u0().f28637q.setError((String) obj);
                        newPaymentBankEmailFragment7.a1();
                        break;
                }
                return p.f3034a;
            }
        }));
        W4 u02 = u0();
        PaymentUI paymentUI = this.f12743q0;
        String str = (paymentUI == null ? null : paymentUI).i;
        if (str == null) {
            str = "";
        }
        if (paymentUI == null) {
            paymentUI = null;
        }
        String bigDecimal = paymentUI.f11332c.toString();
        CustomTextInputEditText customTextInputEditText = u02.f28635o;
        customTextInputEditText.c(str, bigDecimal);
        u02.f28640t.addTextChangedListener(new c());
        d dVar = new d();
        CustomTextInputEditText customTextInputEditText2 = u02.f28644x;
        customTextInputEditText2.addTextChangedListener(dVar);
        customTextInputEditText2.setOnFocusChangeListener(new b());
        u02.f28633D.addTextChangedListener(new e());
        customTextInputEditText.setEnabled(false);
        customTextInputEditText.addTextChangedListener(new f());
        o.c(u02.f28641u, 500L, new A8.b(this, 21));
        o.c(u02.f28642v, 500L, new A8.b(u02, 22));
        PaymentUI paymentUI2 = this.f12743q0;
        customTextInputEditText.setText((paymentUI2 != null ? paymentUI2 : null).f11332c.toString());
        o.c(u02.f28630A, 500L, new A7.c(12, this, u02));
        final int i11 = 6;
        W0().f8472j1.observe(getViewLifecycleOwner(), new g(new InterfaceC0646l(this) { // from class: c8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankEmailFragment f8587b;

            {
                this.f8587b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Integer num;
                Object obj2;
                Integer num2;
                String str2;
                Integer num3;
                switch (i11) {
                    case 0:
                        String str22 = (String) obj;
                        if (str22 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment = this.f8587b;
                            newPaymentBankEmailFragment.f12749x0 = false;
                            newPaymentBankEmailFragment.u0().f28643w.setErrorWithoutFocus(str22);
                            newPaymentBankEmailFragment.T0();
                            newPaymentBankEmailFragment.W0().f8477p1.postValue(null);
                            break;
                        }
                    case 1:
                        String str3 = (String) obj;
                        if (str3 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment2 = this.f8587b;
                            NavController g10 = U4.b.g(newPaymentBankEmailFragment2);
                            PaymentUI paymentUI3 = newPaymentBankEmailFragment2.f12743q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            g10.j(new c(paymentUI3, newPaymentBankEmailFragment2.V0().f8589b, str3, newPaymentBankEmailFragment2.V0().f8590c));
                            newPaymentBankEmailFragment2.W0().f8479r1.postValue(null);
                            break;
                        }
                    case 2:
                        this.f8587b.X0((String) obj, true);
                        break;
                    case 3:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment3 = this.f8587b;
                        NavController g11 = U4.b.g(newPaymentBankEmailFragment3);
                        PaymentUI paymentUI22 = newPaymentBankEmailFragment3.f12743q0;
                        if (paymentUI22 == null) {
                            paymentUI22 = null;
                        }
                        g11.j(new c(paymentUI22, newPaymentBankEmailFragment3.V0().f8589b, null, newPaymentBankEmailFragment3.V0().f8590c));
                        break;
                    case 4:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment4 = this.f8587b;
                        newPaymentBankEmailFragment4.f12745t0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentBankEmailFragment4.f12745t0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    W4 u022 = newPaymentBankEmailFragment4.u0();
                                    StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    u022.f28630A.setText(aVar != null ? aVar.f13052a : null);
                                    newPaymentBankEmailFragment4.u0().f28646z.e();
                                    StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    if (aVar2 != null && (num3 = aVar2.f13059h) != null) {
                                        newPaymentBankEmailFragment4.Y0(num3.intValue());
                                    }
                                    newPaymentBankEmailFragment4.u0().f28631B.setVisibility(0);
                                    newPaymentBankEmailFragment4.Z0();
                                } else {
                                    if (newPaymentBankEmailFragment4.V0().f8588a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentBankEmailFragment4.V0().f8588a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar3 = (StatementsSelectorDialog.a) obj2;
                                        W4 u03 = newPaymentBankEmailFragment4.u0();
                                        if (aVar3 != null && (str2 = aVar3.f13052a) != null) {
                                            r5 = C0969n.u0(str2).toString();
                                        }
                                        u03.f28630A.setText(r5);
                                        if (aVar3 != null && (num2 = aVar3.f13059h) != null) {
                                            newPaymentBankEmailFragment4.Y0(num2.intValue());
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentBankEmailFragment4.f12747v0;
                                        if (bankAccountDomain != null && (num = bankAccountDomain.f10694a) != null) {
                                            newPaymentBankEmailFragment4.Y0(num.intValue());
                                        }
                                    }
                                    newPaymentBankEmailFragment4.Z0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str4 = bankAccountDomain2.i;
                                String str5 = str4 == null ? "" : str4;
                                String str6 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str5, D9.b.D(str6), str6 == null ? "" : str6, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, bankAccountDomain2.f10701h, bankAccountDomain2.f10694a, false, 288));
                            }
                        }
                        break;
                    case 5:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment5 = this.f8587b;
                        PaymentUI paymentUI32 = newPaymentBankEmailFragment5.f12743q0;
                        String str7 = (paymentUI32 == null ? null : paymentUI32).f11337h;
                        if (paymentUI32 == null) {
                            paymentUI32 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI32.f11345q = j.b(hVar, feeType, str7);
                        PaymentUI paymentUI4 = newPaymentBankEmailFragment5.f12743q0;
                        (paymentUI4 != null ? paymentUI4 : null).f11346r = j.a(hVar, feeType, str7);
                        break;
                    case 6:
                        s5.e eVar = (s5.e) obj;
                        String str8 = eVar.f26620d;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment6 = this.f8587b;
                        if (str8 != null) {
                            PaymentUI paymentUI5 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI5 == null) {
                                paymentUI5 = null;
                            }
                            paymentUI5.f11337h = str8.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI6 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI6 == null) {
                            paymentUI6 = null;
                        }
                        String str9 = eVar.f26620d;
                        paymentUI6.i = str9 != null ? K3.a.a(str9) : null;
                        newPaymentBankEmailFragment6.u0().f28635o.setEnabled(true);
                        if (str9 != null) {
                            String C10 = D9.b.C(str9);
                            W4 u04 = newPaymentBankEmailFragment6.u0();
                            PaymentUI paymentUI7 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI7 == null) {
                                paymentUI7 = null;
                            }
                            u04.f28635o.c(C10, paymentUI7.f11332c.toString());
                        }
                        newPaymentBankEmailFragment6.a1();
                        PaymentUI paymentUI8 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI8 == null) {
                            paymentUI8 = null;
                        }
                        String str10 = paymentUI8.f11337h;
                        B5.h value = newPaymentBankEmailFragment6.W0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI9 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI9 == null) {
                                paymentUI9 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI9.f11345q = j.b(value, feeType2, str10);
                            PaymentUI paymentUI10 = newPaymentBankEmailFragment6.f12743q0;
                            (paymentUI10 != null ? paymentUI10 : null).f11346r = j.a(value, feeType2, str10);
                        }
                        break;
                    default:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment7 = this.f8587b;
                        newPaymentBankEmailFragment7.u0().f28637q.setError((String) obj);
                        newPaymentBankEmailFragment7.a1();
                        break;
                }
                return p.f3034a;
            }
        }));
        W0().f8475m1.observe(getViewLifecycleOwner(), new g(new InterfaceC0646l() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.bank.a
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                c cVar = (c) obj;
                if (cVar != null) {
                    NewPaymentBankEmailFragment newPaymentBankEmailFragment = NewPaymentBankEmailFragment.this;
                    newPaymentBankEmailFragment.u0();
                    PaymentUI paymentUI3 = newPaymentBankEmailFragment.f12743q0;
                    if (paymentUI3 == null) {
                        paymentUI3 = null;
                    }
                    paymentUI3.f11343o = newPaymentBankEmailFragment.U0();
                    PaymentUI paymentUI4 = newPaymentBankEmailFragment.f12743q0;
                    if (paymentUI4 == null) {
                        paymentUI4 = null;
                    }
                    paymentUI4.f11334e = cVar.f303b;
                    newPaymentBankEmailFragment.f12749x0 = true;
                    newPaymentBankEmailFragment.u0().f28643w.setError(null);
                    newPaymentBankEmailFragment.T0();
                    newPaymentBankEmailFragment.f12744r0 = NewPaymentBankEmailFragment.State.f12758b;
                    newPaymentBankEmailFragment.a1();
                    newPaymentBankEmailFragment.W0().f8475m1.postValue(null);
                }
                return p.f3034a;
            }
        }));
        final int i12 = 7;
        W0().f8473k1.observe(getViewLifecycleOwner(), new g(new InterfaceC0646l(this) { // from class: c8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankEmailFragment f8587b;

            {
                this.f8587b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Integer num;
                Object obj2;
                Integer num2;
                String str2;
                Integer num3;
                switch (i12) {
                    case 0:
                        String str22 = (String) obj;
                        if (str22 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment = this.f8587b;
                            newPaymentBankEmailFragment.f12749x0 = false;
                            newPaymentBankEmailFragment.u0().f28643w.setErrorWithoutFocus(str22);
                            newPaymentBankEmailFragment.T0();
                            newPaymentBankEmailFragment.W0().f8477p1.postValue(null);
                            break;
                        }
                    case 1:
                        String str3 = (String) obj;
                        if (str3 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment2 = this.f8587b;
                            NavController g10 = U4.b.g(newPaymentBankEmailFragment2);
                            PaymentUI paymentUI3 = newPaymentBankEmailFragment2.f12743q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            g10.j(new c(paymentUI3, newPaymentBankEmailFragment2.V0().f8589b, str3, newPaymentBankEmailFragment2.V0().f8590c));
                            newPaymentBankEmailFragment2.W0().f8479r1.postValue(null);
                            break;
                        }
                    case 2:
                        this.f8587b.X0((String) obj, true);
                        break;
                    case 3:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment3 = this.f8587b;
                        NavController g11 = U4.b.g(newPaymentBankEmailFragment3);
                        PaymentUI paymentUI22 = newPaymentBankEmailFragment3.f12743q0;
                        if (paymentUI22 == null) {
                            paymentUI22 = null;
                        }
                        g11.j(new c(paymentUI22, newPaymentBankEmailFragment3.V0().f8589b, null, newPaymentBankEmailFragment3.V0().f8590c));
                        break;
                    case 4:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment4 = this.f8587b;
                        newPaymentBankEmailFragment4.f12745t0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentBankEmailFragment4.f12745t0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    W4 u022 = newPaymentBankEmailFragment4.u0();
                                    StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    u022.f28630A.setText(aVar != null ? aVar.f13052a : null);
                                    newPaymentBankEmailFragment4.u0().f28646z.e();
                                    StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    if (aVar2 != null && (num3 = aVar2.f13059h) != null) {
                                        newPaymentBankEmailFragment4.Y0(num3.intValue());
                                    }
                                    newPaymentBankEmailFragment4.u0().f28631B.setVisibility(0);
                                    newPaymentBankEmailFragment4.Z0();
                                } else {
                                    if (newPaymentBankEmailFragment4.V0().f8588a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentBankEmailFragment4.V0().f8588a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar3 = (StatementsSelectorDialog.a) obj2;
                                        W4 u03 = newPaymentBankEmailFragment4.u0();
                                        if (aVar3 != null && (str2 = aVar3.f13052a) != null) {
                                            r5 = C0969n.u0(str2).toString();
                                        }
                                        u03.f28630A.setText(r5);
                                        if (aVar3 != null && (num2 = aVar3.f13059h) != null) {
                                            newPaymentBankEmailFragment4.Y0(num2.intValue());
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentBankEmailFragment4.f12747v0;
                                        if (bankAccountDomain != null && (num = bankAccountDomain.f10694a) != null) {
                                            newPaymentBankEmailFragment4.Y0(num.intValue());
                                        }
                                    }
                                    newPaymentBankEmailFragment4.Z0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str4 = bankAccountDomain2.i;
                                String str5 = str4 == null ? "" : str4;
                                String str6 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str5, D9.b.D(str6), str6 == null ? "" : str6, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, bankAccountDomain2.f10701h, bankAccountDomain2.f10694a, false, 288));
                            }
                        }
                        break;
                    case 5:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment5 = this.f8587b;
                        PaymentUI paymentUI32 = newPaymentBankEmailFragment5.f12743q0;
                        String str7 = (paymentUI32 == null ? null : paymentUI32).f11337h;
                        if (paymentUI32 == null) {
                            paymentUI32 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI32.f11345q = j.b(hVar, feeType, str7);
                        PaymentUI paymentUI4 = newPaymentBankEmailFragment5.f12743q0;
                        (paymentUI4 != null ? paymentUI4 : null).f11346r = j.a(hVar, feeType, str7);
                        break;
                    case 6:
                        s5.e eVar = (s5.e) obj;
                        String str8 = eVar.f26620d;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment6 = this.f8587b;
                        if (str8 != null) {
                            PaymentUI paymentUI5 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI5 == null) {
                                paymentUI5 = null;
                            }
                            paymentUI5.f11337h = str8.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI6 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI6 == null) {
                            paymentUI6 = null;
                        }
                        String str9 = eVar.f26620d;
                        paymentUI6.i = str9 != null ? K3.a.a(str9) : null;
                        newPaymentBankEmailFragment6.u0().f28635o.setEnabled(true);
                        if (str9 != null) {
                            String C10 = D9.b.C(str9);
                            W4 u04 = newPaymentBankEmailFragment6.u0();
                            PaymentUI paymentUI7 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI7 == null) {
                                paymentUI7 = null;
                            }
                            u04.f28635o.c(C10, paymentUI7.f11332c.toString());
                        }
                        newPaymentBankEmailFragment6.a1();
                        PaymentUI paymentUI8 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI8 == null) {
                            paymentUI8 = null;
                        }
                        String str10 = paymentUI8.f11337h;
                        B5.h value = newPaymentBankEmailFragment6.W0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI9 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI9 == null) {
                                paymentUI9 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI9.f11345q = j.b(value, feeType2, str10);
                            PaymentUI paymentUI10 = newPaymentBankEmailFragment6.f12743q0;
                            (paymentUI10 != null ? paymentUI10 : null).f11346r = j.a(value, feeType2, str10);
                        }
                        break;
                    default:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment7 = this.f8587b;
                        newPaymentBankEmailFragment7.u0().f28637q.setError((String) obj);
                        newPaymentBankEmailFragment7.a1();
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i13 = 1;
        W0().f8479r1.observe(getViewLifecycleOwner(), new g(new InterfaceC0646l(this) { // from class: c8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankEmailFragment f8587b;

            {
                this.f8587b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Integer num;
                Object obj2;
                Integer num2;
                String str2;
                Integer num3;
                switch (i13) {
                    case 0:
                        String str22 = (String) obj;
                        if (str22 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment = this.f8587b;
                            newPaymentBankEmailFragment.f12749x0 = false;
                            newPaymentBankEmailFragment.u0().f28643w.setErrorWithoutFocus(str22);
                            newPaymentBankEmailFragment.T0();
                            newPaymentBankEmailFragment.W0().f8477p1.postValue(null);
                            break;
                        }
                    case 1:
                        String str3 = (String) obj;
                        if (str3 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment2 = this.f8587b;
                            NavController g10 = U4.b.g(newPaymentBankEmailFragment2);
                            PaymentUI paymentUI3 = newPaymentBankEmailFragment2.f12743q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            g10.j(new c(paymentUI3, newPaymentBankEmailFragment2.V0().f8589b, str3, newPaymentBankEmailFragment2.V0().f8590c));
                            newPaymentBankEmailFragment2.W0().f8479r1.postValue(null);
                            break;
                        }
                    case 2:
                        this.f8587b.X0((String) obj, true);
                        break;
                    case 3:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment3 = this.f8587b;
                        NavController g11 = U4.b.g(newPaymentBankEmailFragment3);
                        PaymentUI paymentUI22 = newPaymentBankEmailFragment3.f12743q0;
                        if (paymentUI22 == null) {
                            paymentUI22 = null;
                        }
                        g11.j(new c(paymentUI22, newPaymentBankEmailFragment3.V0().f8589b, null, newPaymentBankEmailFragment3.V0().f8590c));
                        break;
                    case 4:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment4 = this.f8587b;
                        newPaymentBankEmailFragment4.f12745t0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentBankEmailFragment4.f12745t0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    W4 u022 = newPaymentBankEmailFragment4.u0();
                                    StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    u022.f28630A.setText(aVar != null ? aVar.f13052a : null);
                                    newPaymentBankEmailFragment4.u0().f28646z.e();
                                    StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    if (aVar2 != null && (num3 = aVar2.f13059h) != null) {
                                        newPaymentBankEmailFragment4.Y0(num3.intValue());
                                    }
                                    newPaymentBankEmailFragment4.u0().f28631B.setVisibility(0);
                                    newPaymentBankEmailFragment4.Z0();
                                } else {
                                    if (newPaymentBankEmailFragment4.V0().f8588a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentBankEmailFragment4.V0().f8588a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar3 = (StatementsSelectorDialog.a) obj2;
                                        W4 u03 = newPaymentBankEmailFragment4.u0();
                                        if (aVar3 != null && (str2 = aVar3.f13052a) != null) {
                                            r5 = C0969n.u0(str2).toString();
                                        }
                                        u03.f28630A.setText(r5);
                                        if (aVar3 != null && (num2 = aVar3.f13059h) != null) {
                                            newPaymentBankEmailFragment4.Y0(num2.intValue());
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentBankEmailFragment4.f12747v0;
                                        if (bankAccountDomain != null && (num = bankAccountDomain.f10694a) != null) {
                                            newPaymentBankEmailFragment4.Y0(num.intValue());
                                        }
                                    }
                                    newPaymentBankEmailFragment4.Z0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str4 = bankAccountDomain2.i;
                                String str5 = str4 == null ? "" : str4;
                                String str6 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str5, D9.b.D(str6), str6 == null ? "" : str6, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, bankAccountDomain2.f10701h, bankAccountDomain2.f10694a, false, 288));
                            }
                        }
                        break;
                    case 5:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment5 = this.f8587b;
                        PaymentUI paymentUI32 = newPaymentBankEmailFragment5.f12743q0;
                        String str7 = (paymentUI32 == null ? null : paymentUI32).f11337h;
                        if (paymentUI32 == null) {
                            paymentUI32 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI32.f11345q = j.b(hVar, feeType, str7);
                        PaymentUI paymentUI4 = newPaymentBankEmailFragment5.f12743q0;
                        (paymentUI4 != null ? paymentUI4 : null).f11346r = j.a(hVar, feeType, str7);
                        break;
                    case 6:
                        s5.e eVar = (s5.e) obj;
                        String str8 = eVar.f26620d;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment6 = this.f8587b;
                        if (str8 != null) {
                            PaymentUI paymentUI5 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI5 == null) {
                                paymentUI5 = null;
                            }
                            paymentUI5.f11337h = str8.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI6 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI6 == null) {
                            paymentUI6 = null;
                        }
                        String str9 = eVar.f26620d;
                        paymentUI6.i = str9 != null ? K3.a.a(str9) : null;
                        newPaymentBankEmailFragment6.u0().f28635o.setEnabled(true);
                        if (str9 != null) {
                            String C10 = D9.b.C(str9);
                            W4 u04 = newPaymentBankEmailFragment6.u0();
                            PaymentUI paymentUI7 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI7 == null) {
                                paymentUI7 = null;
                            }
                            u04.f28635o.c(C10, paymentUI7.f11332c.toString());
                        }
                        newPaymentBankEmailFragment6.a1();
                        PaymentUI paymentUI8 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI8 == null) {
                            paymentUI8 = null;
                        }
                        String str10 = paymentUI8.f11337h;
                        B5.h value = newPaymentBankEmailFragment6.W0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI9 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI9 == null) {
                                paymentUI9 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI9.f11345q = j.b(value, feeType2, str10);
                            PaymentUI paymentUI10 = newPaymentBankEmailFragment6.f12743q0;
                            (paymentUI10 != null ? paymentUI10 : null).f11346r = j.a(value, feeType2, str10);
                        }
                        break;
                    default:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment7 = this.f8587b;
                        newPaymentBankEmailFragment7.u0().f28637q.setError((String) obj);
                        newPaymentBankEmailFragment7.a1();
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i14 = 3;
        W0().f8480s1.observe(getViewLifecycleOwner(), new g(new InterfaceC0646l(this) { // from class: c8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankEmailFragment f8587b;

            {
                this.f8587b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Integer num;
                Object obj2;
                Integer num2;
                String str2;
                Integer num3;
                switch (i14) {
                    case 0:
                        String str22 = (String) obj;
                        if (str22 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment = this.f8587b;
                            newPaymentBankEmailFragment.f12749x0 = false;
                            newPaymentBankEmailFragment.u0().f28643w.setErrorWithoutFocus(str22);
                            newPaymentBankEmailFragment.T0();
                            newPaymentBankEmailFragment.W0().f8477p1.postValue(null);
                            break;
                        }
                    case 1:
                        String str3 = (String) obj;
                        if (str3 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment2 = this.f8587b;
                            NavController g10 = U4.b.g(newPaymentBankEmailFragment2);
                            PaymentUI paymentUI3 = newPaymentBankEmailFragment2.f12743q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            g10.j(new c(paymentUI3, newPaymentBankEmailFragment2.V0().f8589b, str3, newPaymentBankEmailFragment2.V0().f8590c));
                            newPaymentBankEmailFragment2.W0().f8479r1.postValue(null);
                            break;
                        }
                    case 2:
                        this.f8587b.X0((String) obj, true);
                        break;
                    case 3:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment3 = this.f8587b;
                        NavController g11 = U4.b.g(newPaymentBankEmailFragment3);
                        PaymentUI paymentUI22 = newPaymentBankEmailFragment3.f12743q0;
                        if (paymentUI22 == null) {
                            paymentUI22 = null;
                        }
                        g11.j(new c(paymentUI22, newPaymentBankEmailFragment3.V0().f8589b, null, newPaymentBankEmailFragment3.V0().f8590c));
                        break;
                    case 4:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment4 = this.f8587b;
                        newPaymentBankEmailFragment4.f12745t0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentBankEmailFragment4.f12745t0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    W4 u022 = newPaymentBankEmailFragment4.u0();
                                    StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    u022.f28630A.setText(aVar != null ? aVar.f13052a : null);
                                    newPaymentBankEmailFragment4.u0().f28646z.e();
                                    StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    if (aVar2 != null && (num3 = aVar2.f13059h) != null) {
                                        newPaymentBankEmailFragment4.Y0(num3.intValue());
                                    }
                                    newPaymentBankEmailFragment4.u0().f28631B.setVisibility(0);
                                    newPaymentBankEmailFragment4.Z0();
                                } else {
                                    if (newPaymentBankEmailFragment4.V0().f8588a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentBankEmailFragment4.V0().f8588a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar3 = (StatementsSelectorDialog.a) obj2;
                                        W4 u03 = newPaymentBankEmailFragment4.u0();
                                        if (aVar3 != null && (str2 = aVar3.f13052a) != null) {
                                            r5 = C0969n.u0(str2).toString();
                                        }
                                        u03.f28630A.setText(r5);
                                        if (aVar3 != null && (num2 = aVar3.f13059h) != null) {
                                            newPaymentBankEmailFragment4.Y0(num2.intValue());
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentBankEmailFragment4.f12747v0;
                                        if (bankAccountDomain != null && (num = bankAccountDomain.f10694a) != null) {
                                            newPaymentBankEmailFragment4.Y0(num.intValue());
                                        }
                                    }
                                    newPaymentBankEmailFragment4.Z0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str4 = bankAccountDomain2.i;
                                String str5 = str4 == null ? "" : str4;
                                String str6 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str5, D9.b.D(str6), str6 == null ? "" : str6, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, bankAccountDomain2.f10701h, bankAccountDomain2.f10694a, false, 288));
                            }
                        }
                        break;
                    case 5:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment5 = this.f8587b;
                        PaymentUI paymentUI32 = newPaymentBankEmailFragment5.f12743q0;
                        String str7 = (paymentUI32 == null ? null : paymentUI32).f11337h;
                        if (paymentUI32 == null) {
                            paymentUI32 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI32.f11345q = j.b(hVar, feeType, str7);
                        PaymentUI paymentUI4 = newPaymentBankEmailFragment5.f12743q0;
                        (paymentUI4 != null ? paymentUI4 : null).f11346r = j.a(hVar, feeType, str7);
                        break;
                    case 6:
                        s5.e eVar = (s5.e) obj;
                        String str8 = eVar.f26620d;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment6 = this.f8587b;
                        if (str8 != null) {
                            PaymentUI paymentUI5 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI5 == null) {
                                paymentUI5 = null;
                            }
                            paymentUI5.f11337h = str8.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI6 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI6 == null) {
                            paymentUI6 = null;
                        }
                        String str9 = eVar.f26620d;
                        paymentUI6.i = str9 != null ? K3.a.a(str9) : null;
                        newPaymentBankEmailFragment6.u0().f28635o.setEnabled(true);
                        if (str9 != null) {
                            String C10 = D9.b.C(str9);
                            W4 u04 = newPaymentBankEmailFragment6.u0();
                            PaymentUI paymentUI7 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI7 == null) {
                                paymentUI7 = null;
                            }
                            u04.f28635o.c(C10, paymentUI7.f11332c.toString());
                        }
                        newPaymentBankEmailFragment6.a1();
                        PaymentUI paymentUI8 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI8 == null) {
                            paymentUI8 = null;
                        }
                        String str10 = paymentUI8.f11337h;
                        B5.h value = newPaymentBankEmailFragment6.W0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI9 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI9 == null) {
                                paymentUI9 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI9.f11345q = j.b(value, feeType2, str10);
                            PaymentUI paymentUI10 = newPaymentBankEmailFragment6.f12743q0;
                            (paymentUI10 != null ? paymentUI10 : null).f11346r = j.a(value, feeType2, str10);
                        }
                        break;
                    default:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment7 = this.f8587b;
                        newPaymentBankEmailFragment7.u0().f28637q.setError((String) obj);
                        newPaymentBankEmailFragment7.a1();
                        break;
                }
                return p.f3034a;
            }
        }));
        Z0();
        a1();
        W4 u03 = u0();
        int ordinal = this.f12744r0.ordinal();
        Button button = u03.f28642v;
        Button button2 = u03.f28641u;
        CustomTextInputEditText customTextInputEditText3 = u03.f28635o;
        CustomTextInputEditText customTextInputEditText4 = u03.f28633D;
        CustomTextInputEditText customTextInputEditText5 = u03.f28638r;
        CustomTextInputEditText customTextInputEditText6 = u03.f28644x;
        CustomTextInputEditText customTextInputEditText7 = u03.f28630A;
        if (ordinal == 0) {
            customTextInputEditText7.setEnabled(true);
            customTextInputEditText6.setEnabled(false);
            customTextInputEditText5.setEnabled(false);
            customTextInputEditText4.setEnabled(true);
            customTextInputEditText3.setEnabled(false);
            button2.setEnabled(false);
            button.setEnabled(false);
        } else if (ordinal == 1) {
            customTextInputEditText7.setEnabled(false);
            customTextInputEditText6.setEnabled(true);
            customTextInputEditText5.setEnabled(false);
            customTextInputEditText4.setEnabled(false);
            customTextInputEditText3.setEnabled(false);
            button2.setEnabled(true);
            button.setEnabled(true);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            customTextInputEditText7.setEnabled(true);
            customTextInputEditText6.setEnabled(true);
            customTextInputEditText5.setEnabled(false);
            customTextInputEditText4.setEnabled(true);
            customTextInputEditText3.setEnabled(true);
        }
        W0().n1.observe(getViewLifecycleOwner(), new i(new G7.c(this, 1)));
        final int i15 = 2;
        F8.g.a(u0().f28640t, new InterfaceC0646l(this) { // from class: c8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankEmailFragment f8587b;

            {
                this.f8587b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Integer num;
                Object obj2;
                Integer num2;
                String str2;
                Integer num3;
                switch (i15) {
                    case 0:
                        String str22 = (String) obj;
                        if (str22 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment = this.f8587b;
                            newPaymentBankEmailFragment.f12749x0 = false;
                            newPaymentBankEmailFragment.u0().f28643w.setErrorWithoutFocus(str22);
                            newPaymentBankEmailFragment.T0();
                            newPaymentBankEmailFragment.W0().f8477p1.postValue(null);
                            break;
                        }
                    case 1:
                        String str3 = (String) obj;
                        if (str3 == null) {
                            break;
                        } else {
                            NewPaymentBankEmailFragment newPaymentBankEmailFragment2 = this.f8587b;
                            NavController g10 = U4.b.g(newPaymentBankEmailFragment2);
                            PaymentUI paymentUI3 = newPaymentBankEmailFragment2.f12743q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            g10.j(new c(paymentUI3, newPaymentBankEmailFragment2.V0().f8589b, str3, newPaymentBankEmailFragment2.V0().f8590c));
                            newPaymentBankEmailFragment2.W0().f8479r1.postValue(null);
                            break;
                        }
                    case 2:
                        this.f8587b.X0((String) obj, true);
                        break;
                    case 3:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment3 = this.f8587b;
                        NavController g11 = U4.b.g(newPaymentBankEmailFragment3);
                        PaymentUI paymentUI22 = newPaymentBankEmailFragment3.f12743q0;
                        if (paymentUI22 == null) {
                            paymentUI22 = null;
                        }
                        g11.j(new c(paymentUI22, newPaymentBankEmailFragment3.V0().f8589b, null, newPaymentBankEmailFragment3.V0().f8590c));
                        break;
                    case 4:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment4 = this.f8587b;
                        newPaymentBankEmailFragment4.f12745t0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentBankEmailFragment4.f12745t0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    W4 u022 = newPaymentBankEmailFragment4.u0();
                                    StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    u022.f28630A.setText(aVar != null ? aVar.f13052a : null);
                                    newPaymentBankEmailFragment4.u0().f28646z.e();
                                    StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    if (aVar2 != null && (num3 = aVar2.f13059h) != null) {
                                        newPaymentBankEmailFragment4.Y0(num3.intValue());
                                    }
                                    newPaymentBankEmailFragment4.u0().f28631B.setVisibility(0);
                                    newPaymentBankEmailFragment4.Z0();
                                } else {
                                    if (newPaymentBankEmailFragment4.V0().f8588a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentBankEmailFragment4.V0().f8588a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar3 = (StatementsSelectorDialog.a) obj2;
                                        W4 u032 = newPaymentBankEmailFragment4.u0();
                                        if (aVar3 != null && (str2 = aVar3.f13052a) != null) {
                                            r5 = C0969n.u0(str2).toString();
                                        }
                                        u032.f28630A.setText(r5);
                                        if (aVar3 != null && (num2 = aVar3.f13059h) != null) {
                                            newPaymentBankEmailFragment4.Y0(num2.intValue());
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentBankEmailFragment4.f12747v0;
                                        if (bankAccountDomain != null && (num = bankAccountDomain.f10694a) != null) {
                                            newPaymentBankEmailFragment4.Y0(num.intValue());
                                        }
                                    }
                                    newPaymentBankEmailFragment4.Z0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str4 = bankAccountDomain2.i;
                                String str5 = str4 == null ? "" : str4;
                                String str6 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str5, D9.b.D(str6), str6 == null ? "" : str6, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, bankAccountDomain2.f10701h, bankAccountDomain2.f10694a, false, 288));
                            }
                        }
                        break;
                    case 5:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment5 = this.f8587b;
                        PaymentUI paymentUI32 = newPaymentBankEmailFragment5.f12743q0;
                        String str7 = (paymentUI32 == null ? null : paymentUI32).f11337h;
                        if (paymentUI32 == null) {
                            paymentUI32 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI32.f11345q = j.b(hVar, feeType, str7);
                        PaymentUI paymentUI4 = newPaymentBankEmailFragment5.f12743q0;
                        (paymentUI4 != null ? paymentUI4 : null).f11346r = j.a(hVar, feeType, str7);
                        break;
                    case 6:
                        s5.e eVar = (s5.e) obj;
                        String str8 = eVar.f26620d;
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment6 = this.f8587b;
                        if (str8 != null) {
                            PaymentUI paymentUI5 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI5 == null) {
                                paymentUI5 = null;
                            }
                            paymentUI5.f11337h = str8.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI6 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI6 == null) {
                            paymentUI6 = null;
                        }
                        String str9 = eVar.f26620d;
                        paymentUI6.i = str9 != null ? K3.a.a(str9) : null;
                        newPaymentBankEmailFragment6.u0().f28635o.setEnabled(true);
                        if (str9 != null) {
                            String C10 = D9.b.C(str9);
                            W4 u04 = newPaymentBankEmailFragment6.u0();
                            PaymentUI paymentUI7 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI7 == null) {
                                paymentUI7 = null;
                            }
                            u04.f28635o.c(C10, paymentUI7.f11332c.toString());
                        }
                        newPaymentBankEmailFragment6.a1();
                        PaymentUI paymentUI8 = newPaymentBankEmailFragment6.f12743q0;
                        if (paymentUI8 == null) {
                            paymentUI8 = null;
                        }
                        String str10 = paymentUI8.f11337h;
                        B5.h value = newPaymentBankEmailFragment6.W0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI9 = newPaymentBankEmailFragment6.f12743q0;
                            if (paymentUI9 == null) {
                                paymentUI9 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI9.f11345q = j.b(value, feeType2, str10);
                            PaymentUI paymentUI10 = newPaymentBankEmailFragment6.f12743q0;
                            (paymentUI10 != null ? paymentUI10 : null).f11346r = j.a(value, feeType2, str10);
                        }
                        break;
                    default:
                        NewPaymentBankEmailFragment newPaymentBankEmailFragment7 = this.f8587b;
                        newPaymentBankEmailFragment7.u0().f28637q.setError((String) obj);
                        newPaymentBankEmailFragment7.a1();
                        break;
                }
                return p.f3034a;
            }
        });
        u0().f28640t.addTextChangedListener(new a());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12740n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f28641u.setVisibility(0);
        o.b(u0().f28642v);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f28641u);
        u0().f28642v.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentBankEmailFragment newPaymentBankEmailFragment = NewPaymentBankEmailFragment.this;
            newPaymentBankEmailFragment.T0();
            newPaymentBankEmailFragment.a1();
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
            boolean h02 = D9.b.h0(String.valueOf(charSequence));
            NewPaymentBankEmailFragment newPaymentBankEmailFragment = NewPaymentBankEmailFragment.this;
            if (h02) {
                newPaymentBankEmailFragment.u0().f28643w.setError(null);
                RunnableC0615f runnableC0615f = newPaymentBankEmailFragment.f12751z0;
                Handler handler = newPaymentBankEmailFragment.f12750y0;
                if (runnableC0615f != null) {
                    handler.removeCallbacks(runnableC0615f);
                }
                RunnableC0615f runnableC0615f2 = new RunnableC0615f(newPaymentBankEmailFragment, 1);
                newPaymentBankEmailFragment.f12751z0 = runnableC0615f2;
                handler.postDelayed(runnableC0615f2, 1000L);
            } else {
                W4 u02 = newPaymentBankEmailFragment.u0();
                u02.f28643w.setErrorWithoutFocus(newPaymentBankEmailFragment.getString(R.string.invalid_email));
            }
            newPaymentBankEmailFragment.a1();
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
            NewPaymentBankEmailFragment newPaymentBankEmailFragment = NewPaymentBankEmailFragment.this;
            PaymentUI paymentUI = newPaymentBankEmailFragment.f12743q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11336g = String.valueOf(charSequence);
            newPaymentBankEmailFragment.a1();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentBankEmailFragment newPaymentBankEmailFragment = NewPaymentBankEmailFragment.this;
            PaymentUI paymentUI = newPaymentBankEmailFragment.f12743q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            BigDecimal Q4 = C0966k.Q(D9.b.r0(String.valueOf(charSequence)));
            if (Q4 == null) {
                Q4 = BigDecimal.ZERO;
            }
            paymentUI.f11332c = Q4;
            newPaymentBankEmailFragment.a1();
            PaymentUI paymentUI2 = newPaymentBankEmailFragment.f12743q0;
            newPaymentBankEmailFragment.b1((paymentUI2 != null ? paymentUI2 : null).f11332c.floatValue());
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            NewPaymentBankEmailFragment.this.X0(String.valueOf(editable), false);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
