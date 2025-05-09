package com.luminary.business.presentation.ui.fragments.newpayment.bank;

import F8.g;
import F8.j;
import F8.o;
import Fa.h;
import O9.p;
import U4.b;
import android.content.Context;
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
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankFragment;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.extensions.FeeType;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0966k;
import kotlin.jvm.internal.f;
import t6.U4;

/* compiled from: NewPaymentBankFragment.kt */
/* loaded from: classes2.dex */
public final class NewPaymentBankFragment extends BaseFragment<U4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12767n0 = R.layout.fragment_new_payment_bank;

    /* renamed from: o0, reason: collision with root package name */
    public final h f12768o0 = new h(kotlin.jvm.internal.h.a(c8.e.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankFragment$special$$inlined$navArgs$1
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
    public final H1.a f12769p0;

    /* renamed from: q0, reason: collision with root package name */
    public PaymentUI f12770q0;

    /* compiled from: NewPaymentBankFragment.kt */
    public static final class e implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12781a;

        public e(InterfaceC0646l interfaceC0646l) {
            this.f12781a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12781a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12781a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankFragment$special$$inlined$viewModel$default$1] */
    public NewPaymentBankFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12769p0 = E.a(this, kotlin.jvm.internal.h.a(b8.h.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(b8.h.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.bank_app_account_lowercase);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.bank_app_account_lowercase);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final b8.h T0() {
        return (b8.h) this.f12769p0.getValue();
    }

    public final void U0(String str, boolean z10) {
        U4 u02 = u0();
        boolean g02 = D9.b.g0(str);
        CustomTextInputLayout customTextInputLayout = u02.f28572q;
        if (g02 || !z10) {
            customTextInputLayout.setError(null);
        } else {
            customTextInputLayout.setErrorWithoutFocus(getString(R.string.invalid_beneficiary));
        }
    }

    public final void V0() {
        U4 u02 = u0();
        PaymentUI paymentUI = this.f12770q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        u02.f28574s.setEnabled(paymentUI.e());
        U4 u03 = u0();
        PaymentUI paymentUI2 = this.f12770q0;
        u03.f28575t.setEnabled((paymentUI2 != null ? paymentUI2 : null).e());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12770q0 = new PaymentUI(PaymentType.f11147a, BigDecimal.ZERO, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217696);
        PaymentUI paymentUI = ((c8.e) this.f12768o0.getValue()).f8598a;
        if (paymentUI != null) {
            PaymentUI paymentUI2 = this.f12770q0;
            (paymentUI2 == null ? null : paymentUI2).f11332c = paymentUI.f11332c;
            if (paymentUI2 == null) {
                paymentUI2 = null;
            }
            paymentUI2.f11331b = paymentUI.f11331b;
        }
        PaymentUI paymentUI3 = this.f12770q0;
        (paymentUI3 != null ? paymentUI3 : null).f11342n = 0;
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        T0().n(0);
        final int i = 0;
        T0().f8474l1.observe(getViewLifecycleOwner(), new e(new InterfaceC0646l(this) { // from class: c8.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankFragment f8597b;

            {
                this.f8597b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                B5.h value;
                switch (i) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankFragment newPaymentBankFragment = this.f8597b;
                        PaymentUI paymentUI = newPaymentBankFragment.f12770q0;
                        if (paymentUI == null) {
                            paymentUI = null;
                        }
                        String str = paymentUI.f11337h;
                        if (str != null) {
                            newPaymentBankFragment.u0().f28578w.setVisibility(0);
                            U4 u02 = newPaymentBankFragment.u0();
                            FeeType feeType = FeeType.f13318c;
                            u02.f28578w.setText(newPaymentBankFragment.getString(R.string.fee_value, j.a(hVar, feeType, str)));
                            PaymentUI paymentUI2 = newPaymentBankFragment.f12770q0;
                            if (paymentUI2 == null) {
                                paymentUI2 = null;
                            }
                            paymentUI2.f11345q = j.b(hVar, feeType, str);
                            PaymentUI paymentUI3 = newPaymentBankFragment.f12770q0;
                            (paymentUI3 != null ? paymentUI3 : null).f11346r = j.a(hVar, feeType, str);
                        }
                        break;
                    case 1:
                        s5.e eVar = (s5.e) obj;
                        String str2 = eVar.f26620d;
                        NewPaymentBankFragment newPaymentBankFragment2 = this.f8597b;
                        if (str2 != null) {
                            PaymentUI paymentUI4 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI4 == null) {
                                paymentUI4 = null;
                            }
                            paymentUI4.f11337h = str2.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI5 = newPaymentBankFragment2.f12770q0;
                        if (paymentUI5 == null) {
                            paymentUI5 = null;
                        }
                        String str3 = eVar.f26620d;
                        paymentUI5.i = str3 != null ? K3.a.a(str3) : null;
                        newPaymentBankFragment2.u0().f28569n.setEnabled(true);
                        if (str3 != null) {
                            String a10 = K3.a.a(str3);
                            U4 u03 = newPaymentBankFragment2.u0();
                            PaymentUI paymentUI6 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI6 == null) {
                                paymentUI6 = null;
                            }
                            u03.f28569n.c(a10, paymentUI6.f11332c.toString());
                        }
                        newPaymentBankFragment2.V0();
                        PaymentUI paymentUI7 = newPaymentBankFragment2.f12770q0;
                        if (paymentUI7 == null) {
                            paymentUI7 = null;
                        }
                        String str4 = paymentUI7.f11337h;
                        if (str4 != null && (value = newPaymentBankFragment2.T0().f8474l1.getValue()) != null) {
                            newPaymentBankFragment2.u0().f28578w.setVisibility(0);
                            U4 u04 = newPaymentBankFragment2.u0();
                            FeeType feeType2 = FeeType.f13318c;
                            u04.f28578w.setText(newPaymentBankFragment2.getString(R.string.fee_value, j.a(value, feeType2, str4)));
                            PaymentUI paymentUI8 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI8 == null) {
                                paymentUI8 = null;
                            }
                            paymentUI8.f11345q = j.b(value, feeType2, str4);
                            PaymentUI paymentUI9 = newPaymentBankFragment2.f12770q0;
                            (paymentUI9 != null ? paymentUI9 : null).f11346r = j.a(value, feeType2, str4);
                        }
                        break;
                    case 2:
                        NewPaymentBankFragment newPaymentBankFragment3 = this.f8597b;
                        newPaymentBankFragment3.u0().f28570o.setError((String) obj);
                        newPaymentBankFragment3.V0();
                        break;
                    default:
                        this.f8597b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        }));
        U4 u02 = u0();
        u02.f28571p.addTextChangedListener(new b(u02, this));
        u02.f28577v.addTextChangedListener(new c());
        CustomTextInputEditText customTextInputEditText = u02.f28569n;
        customTextInputEditText.setEnabled(false);
        customTextInputEditText.addTextChangedListener(new d());
        o.c(u02.f28574s, 500L, new A8.b(this, 23));
        o.c(u02.f28575t, 500L, new A8.b(u02, 24));
        PaymentUI paymentUI = this.f12770q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        customTextInputEditText.setText(paymentUI.f11332c.toString());
        final int i9 = 1;
        T0().f8472j1.observe(getViewLifecycleOwner(), new e(new InterfaceC0646l(this) { // from class: c8.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankFragment f8597b;

            {
                this.f8597b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                B5.h value;
                switch (i9) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankFragment newPaymentBankFragment = this.f8597b;
                        PaymentUI paymentUI2 = newPaymentBankFragment.f12770q0;
                        if (paymentUI2 == null) {
                            paymentUI2 = null;
                        }
                        String str = paymentUI2.f11337h;
                        if (str != null) {
                            newPaymentBankFragment.u0().f28578w.setVisibility(0);
                            U4 u022 = newPaymentBankFragment.u0();
                            FeeType feeType = FeeType.f13318c;
                            u022.f28578w.setText(newPaymentBankFragment.getString(R.string.fee_value, j.a(hVar, feeType, str)));
                            PaymentUI paymentUI22 = newPaymentBankFragment.f12770q0;
                            if (paymentUI22 == null) {
                                paymentUI22 = null;
                            }
                            paymentUI22.f11345q = j.b(hVar, feeType, str);
                            PaymentUI paymentUI3 = newPaymentBankFragment.f12770q0;
                            (paymentUI3 != null ? paymentUI3 : null).f11346r = j.a(hVar, feeType, str);
                        }
                        break;
                    case 1:
                        s5.e eVar = (s5.e) obj;
                        String str2 = eVar.f26620d;
                        NewPaymentBankFragment newPaymentBankFragment2 = this.f8597b;
                        if (str2 != null) {
                            PaymentUI paymentUI4 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI4 == null) {
                                paymentUI4 = null;
                            }
                            paymentUI4.f11337h = str2.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI5 = newPaymentBankFragment2.f12770q0;
                        if (paymentUI5 == null) {
                            paymentUI5 = null;
                        }
                        String str3 = eVar.f26620d;
                        paymentUI5.i = str3 != null ? K3.a.a(str3) : null;
                        newPaymentBankFragment2.u0().f28569n.setEnabled(true);
                        if (str3 != null) {
                            String a10 = K3.a.a(str3);
                            U4 u03 = newPaymentBankFragment2.u0();
                            PaymentUI paymentUI6 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI6 == null) {
                                paymentUI6 = null;
                            }
                            u03.f28569n.c(a10, paymentUI6.f11332c.toString());
                        }
                        newPaymentBankFragment2.V0();
                        PaymentUI paymentUI7 = newPaymentBankFragment2.f12770q0;
                        if (paymentUI7 == null) {
                            paymentUI7 = null;
                        }
                        String str4 = paymentUI7.f11337h;
                        if (str4 != null && (value = newPaymentBankFragment2.T0().f8474l1.getValue()) != null) {
                            newPaymentBankFragment2.u0().f28578w.setVisibility(0);
                            U4 u04 = newPaymentBankFragment2.u0();
                            FeeType feeType2 = FeeType.f13318c;
                            u04.f28578w.setText(newPaymentBankFragment2.getString(R.string.fee_value, j.a(value, feeType2, str4)));
                            PaymentUI paymentUI8 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI8 == null) {
                                paymentUI8 = null;
                            }
                            paymentUI8.f11345q = j.b(value, feeType2, str4);
                            PaymentUI paymentUI9 = newPaymentBankFragment2.f12770q0;
                            (paymentUI9 != null ? paymentUI9 : null).f11346r = j.a(value, feeType2, str4);
                        }
                        break;
                    case 2:
                        NewPaymentBankFragment newPaymentBankFragment3 = this.f8597b;
                        newPaymentBankFragment3.u0().f28570o.setError((String) obj);
                        newPaymentBankFragment3.V0();
                        break;
                    default:
                        this.f8597b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 2;
        T0().f8473k1.observe(getViewLifecycleOwner(), new e(new InterfaceC0646l(this) { // from class: c8.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankFragment f8597b;

            {
                this.f8597b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                B5.h value;
                switch (i10) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankFragment newPaymentBankFragment = this.f8597b;
                        PaymentUI paymentUI2 = newPaymentBankFragment.f12770q0;
                        if (paymentUI2 == null) {
                            paymentUI2 = null;
                        }
                        String str = paymentUI2.f11337h;
                        if (str != null) {
                            newPaymentBankFragment.u0().f28578w.setVisibility(0);
                            U4 u022 = newPaymentBankFragment.u0();
                            FeeType feeType = FeeType.f13318c;
                            u022.f28578w.setText(newPaymentBankFragment.getString(R.string.fee_value, j.a(hVar, feeType, str)));
                            PaymentUI paymentUI22 = newPaymentBankFragment.f12770q0;
                            if (paymentUI22 == null) {
                                paymentUI22 = null;
                            }
                            paymentUI22.f11345q = j.b(hVar, feeType, str);
                            PaymentUI paymentUI3 = newPaymentBankFragment.f12770q0;
                            (paymentUI3 != null ? paymentUI3 : null).f11346r = j.a(hVar, feeType, str);
                        }
                        break;
                    case 1:
                        s5.e eVar = (s5.e) obj;
                        String str2 = eVar.f26620d;
                        NewPaymentBankFragment newPaymentBankFragment2 = this.f8597b;
                        if (str2 != null) {
                            PaymentUI paymentUI4 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI4 == null) {
                                paymentUI4 = null;
                            }
                            paymentUI4.f11337h = str2.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI5 = newPaymentBankFragment2.f12770q0;
                        if (paymentUI5 == null) {
                            paymentUI5 = null;
                        }
                        String str3 = eVar.f26620d;
                        paymentUI5.i = str3 != null ? K3.a.a(str3) : null;
                        newPaymentBankFragment2.u0().f28569n.setEnabled(true);
                        if (str3 != null) {
                            String a10 = K3.a.a(str3);
                            U4 u03 = newPaymentBankFragment2.u0();
                            PaymentUI paymentUI6 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI6 == null) {
                                paymentUI6 = null;
                            }
                            u03.f28569n.c(a10, paymentUI6.f11332c.toString());
                        }
                        newPaymentBankFragment2.V0();
                        PaymentUI paymentUI7 = newPaymentBankFragment2.f12770q0;
                        if (paymentUI7 == null) {
                            paymentUI7 = null;
                        }
                        String str4 = paymentUI7.f11337h;
                        if (str4 != null && (value = newPaymentBankFragment2.T0().f8474l1.getValue()) != null) {
                            newPaymentBankFragment2.u0().f28578w.setVisibility(0);
                            U4 u04 = newPaymentBankFragment2.u0();
                            FeeType feeType2 = FeeType.f13318c;
                            u04.f28578w.setText(newPaymentBankFragment2.getString(R.string.fee_value, j.a(value, feeType2, str4)));
                            PaymentUI paymentUI8 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI8 == null) {
                                paymentUI8 = null;
                            }
                            paymentUI8.f11345q = j.b(value, feeType2, str4);
                            PaymentUI paymentUI9 = newPaymentBankFragment2.f12770q0;
                            (paymentUI9 != null ? paymentUI9 : null).f11346r = j.a(value, feeType2, str4);
                        }
                        break;
                    case 2:
                        NewPaymentBankFragment newPaymentBankFragment3 = this.f8597b;
                        newPaymentBankFragment3.u0().f28570o.setError((String) obj);
                        newPaymentBankFragment3.V0();
                        break;
                    default:
                        this.f8597b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        }));
        U4 u03 = u0();
        u03.f28576u.setOnScrollChangeListener(new M6.j(this, 2));
        PaymentUI paymentUI2 = ((c8.e) this.f12768o0.getValue()).f8598a;
        if (paymentUI2 != null) {
            U4 u04 = u0();
            u04.f28571p.setText(paymentUI2.f11343o);
            u04.f28577v.setText(paymentUI2.f11336g);
            String str = paymentUI2.i;
            CustomTextInputEditText customTextInputEditText2 = u04.f28569n;
            if (str != null) {
                customTextInputEditText2.setCurrency(str);
            }
            customTextInputEditText2.setText(paymentUI2.f11332c.toString());
        }
        U4 u05 = u0();
        u05.f28573r.addTextChangedListener(new a());
        U4 u06 = u0();
        final int i11 = 3;
        g.a(u06.f28573r, new InterfaceC0646l(this) { // from class: c8.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentBankFragment f8597b;

            {
                this.f8597b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                B5.h value;
                switch (i11) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentBankFragment newPaymentBankFragment = this.f8597b;
                        PaymentUI paymentUI22 = newPaymentBankFragment.f12770q0;
                        if (paymentUI22 == null) {
                            paymentUI22 = null;
                        }
                        String str2 = paymentUI22.f11337h;
                        if (str2 != null) {
                            newPaymentBankFragment.u0().f28578w.setVisibility(0);
                            U4 u022 = newPaymentBankFragment.u0();
                            FeeType feeType = FeeType.f13318c;
                            u022.f28578w.setText(newPaymentBankFragment.getString(R.string.fee_value, j.a(hVar, feeType, str2)));
                            PaymentUI paymentUI222 = newPaymentBankFragment.f12770q0;
                            if (paymentUI222 == null) {
                                paymentUI222 = null;
                            }
                            paymentUI222.f11345q = j.b(hVar, feeType, str2);
                            PaymentUI paymentUI3 = newPaymentBankFragment.f12770q0;
                            (paymentUI3 != null ? paymentUI3 : null).f11346r = j.a(hVar, feeType, str2);
                        }
                        break;
                    case 1:
                        s5.e eVar = (s5.e) obj;
                        String str22 = eVar.f26620d;
                        NewPaymentBankFragment newPaymentBankFragment2 = this.f8597b;
                        if (str22 != null) {
                            PaymentUI paymentUI4 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI4 == null) {
                                paymentUI4 = null;
                            }
                            paymentUI4.f11337h = str22.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI5 = newPaymentBankFragment2.f12770q0;
                        if (paymentUI5 == null) {
                            paymentUI5 = null;
                        }
                        String str3 = eVar.f26620d;
                        paymentUI5.i = str3 != null ? K3.a.a(str3) : null;
                        newPaymentBankFragment2.u0().f28569n.setEnabled(true);
                        if (str3 != null) {
                            String a10 = K3.a.a(str3);
                            U4 u032 = newPaymentBankFragment2.u0();
                            PaymentUI paymentUI6 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI6 == null) {
                                paymentUI6 = null;
                            }
                            u032.f28569n.c(a10, paymentUI6.f11332c.toString());
                        }
                        newPaymentBankFragment2.V0();
                        PaymentUI paymentUI7 = newPaymentBankFragment2.f12770q0;
                        if (paymentUI7 == null) {
                            paymentUI7 = null;
                        }
                        String str4 = paymentUI7.f11337h;
                        if (str4 != null && (value = newPaymentBankFragment2.T0().f8474l1.getValue()) != null) {
                            newPaymentBankFragment2.u0().f28578w.setVisibility(0);
                            U4 u042 = newPaymentBankFragment2.u0();
                            FeeType feeType2 = FeeType.f13318c;
                            u042.f28578w.setText(newPaymentBankFragment2.getString(R.string.fee_value, j.a(value, feeType2, str4)));
                            PaymentUI paymentUI8 = newPaymentBankFragment2.f12770q0;
                            if (paymentUI8 == null) {
                                paymentUI8 = null;
                            }
                            paymentUI8.f11345q = j.b(value, feeType2, str4);
                            PaymentUI paymentUI9 = newPaymentBankFragment2.f12770q0;
                            (paymentUI9 != null ? paymentUI9 : null).f11346r = j.a(value, feeType2, str4);
                        }
                        break;
                    case 2:
                        NewPaymentBankFragment newPaymentBankFragment3 = this.f8597b;
                        newPaymentBankFragment3.u0().f28570o.setError((String) obj);
                        newPaymentBankFragment3.V0();
                        break;
                    default:
                        this.f8597b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12767n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f28574s.setVisibility(0);
        o.b(u0().f28575t);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f28574s);
        u0().f28575t.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            String valueOf = String.valueOf(charSequence);
            NewPaymentBankFragment newPaymentBankFragment = NewPaymentBankFragment.this;
            newPaymentBankFragment.U0(valueOf, false);
            newPaymentBankFragment.V0();
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

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ U4 f12777a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NewPaymentBankFragment f12778b;

        public b(U4 u42, NewPaymentBankFragment newPaymentBankFragment) {
            this.f12777a = u42;
            this.f12778b = newPaymentBankFragment;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            U4 u42 = this.f12777a;
            Object obj = null;
            u42.f28570o.setError(null);
            NewPaymentBankFragment newPaymentBankFragment = this.f12778b;
            PaymentUI paymentUI = newPaymentBankFragment.f12770q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11343o = String.valueOf(charSequence);
            u42.f28569n.setEnabled(false);
            PaymentUI paymentUI2 = newPaymentBankFragment.f12770q0;
            if (paymentUI2 == null) {
                paymentUI2 = null;
            }
            String str = paymentUI2.f11343o;
            if (str == null || str.length() != 11) {
                u42.f28570o.setError(newPaymentBankFragment.getString(R.string.invalid_bank_app_id));
            } else {
                b8.h T02 = newPaymentBankFragment.T0();
                String valueOf = String.valueOf(charSequence);
                Context requireContext = newPaymentBankFragment.requireContext();
                List<BankAccountDomain> value = T02.f8469g1.getValue();
                if (value != null) {
                    Iterator<T> it = value.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (f.b(((BankAccountDomain) next).f10700g, valueOf)) {
                            obj = next;
                            break;
                        }
                    }
                    obj = (BankAccountDomain) obj;
                }
                if (obj != null) {
                    T02.f8473k1.postValue(requireContext.getString(R.string.you_cannot_pay_to_your_own_account_use_transfer));
                } else {
                    A7.c cVar = new A7.c(11, T02, valueOf);
                    T02.f418J0 = cVar;
                    cVar.invoke();
                }
            }
            newPaymentBankFragment.V0();
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
            NewPaymentBankFragment newPaymentBankFragment = NewPaymentBankFragment.this;
            PaymentUI paymentUI = newPaymentBankFragment.f12770q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11336g = String.valueOf(charSequence);
            newPaymentBankFragment.V0();
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
            NewPaymentBankFragment newPaymentBankFragment = NewPaymentBankFragment.this;
            PaymentUI paymentUI = newPaymentBankFragment.f12770q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            BigDecimal Q4 = C0966k.Q(D9.b.r0(String.valueOf(charSequence)));
            if (Q4 == null) {
                Q4 = BigDecimal.ZERO;
            }
            paymentUI.f11332c = Q4;
            newPaymentBankFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
