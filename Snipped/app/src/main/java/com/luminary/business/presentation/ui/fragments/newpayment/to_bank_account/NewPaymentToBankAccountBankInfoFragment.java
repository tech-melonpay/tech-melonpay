package com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account;

import C.v;
import F8.j;
import F8.o;
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
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountBankInfoFragment;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.extensions.FeeType;
import com.luminary.mobile.R;
import java.util.Locale;
import kotlin.jvm.internal.h;
import t6.AbstractC1350h5;

/* compiled from: NewPaymentToBankAccountBankInfoFragment.kt */
/* loaded from: classes2.dex */
public final class NewPaymentToBankAccountBankInfoFragment extends BaseFragment<AbstractC1350h5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12868n0 = R.layout.fragment_new_payment_to_bank_account_bank_info;

    /* renamed from: o0, reason: collision with root package name */
    public final Fa.h f12869o0 = new Fa.h(kotlin.jvm.internal.h.a(h8.d.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountBankInfoFragment$special$$inlined$navArgs$1
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
    public final H1.a f12870p0;

    /* renamed from: q0, reason: collision with root package name */
    public PaymentUI f12871q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f12872r0;
    public String s0;

    /* compiled from: NewPaymentToBankAccountBankInfoFragment.kt */
    public static final class j implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12888a;

        public j(InterfaceC0646l interfaceC0646l) {
            this.f12888a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12888a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12888a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountBankInfoFragment$special$$inlined$viewModel$default$1] */
    public NewPaymentToBankAccountBankInfoFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountBankInfoFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12870p0 = E.a(this, kotlin.jvm.internal.h.a(b8.h.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountBankInfoFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountBankInfoFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(b8.h.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.to_bank_account);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.to_bank_account);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final h8.d T0() {
        return (h8.d) this.f12869o0.getValue();
    }

    public final b8.h U0() {
        return (b8.h) this.f12870p0.getValue();
    }

    public final void V0(String str, boolean z10) {
        AbstractC1350h5 u02 = u0();
        boolean g02 = D9.b.g0(str);
        CustomTextInputLayout customTextInputLayout = u02.f29070t;
        if (g02 || !z10) {
            customTextInputLayout.setError(null);
        } else {
            customTextInputLayout.setErrorWithoutFocus(getString(R.string.invalid_beneficiary));
        }
    }

    public final boolean W0() {
        AbstractC1350h5 u02 = u0();
        PaymentUI paymentUI = this.f12871q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        u02.f29072v.setEnabled(paymentUI.g());
        u0().f29073w.setEnabled(u0().f29072v.isEnabled());
        PaymentUI paymentUI2 = this.f12871q0;
        return (paymentUI2 != null ? paymentUI2 : null).g();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
        this.f12871q0 = T0().f21206a;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i9 = 0;
        U0().f8474l1.observe(getViewLifecycleOwner(), new j(new InterfaceC0646l(this) { // from class: h8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountBankInfoFragment f21200b;

            {
                this.f21200b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = this.f21200b;
                        PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        String str = (paymentUI == null ? null : paymentUI).f11337h;
                        if (paymentUI == null) {
                            paymentUI = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI.f11345q = j.b(hVar, feeType, str);
                        PaymentUI paymentUI2 = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        (paymentUI2 != null ? paymentUI2 : null).f11346r = j.a(hVar, feeType, str);
                        break;
                    case 1:
                        this.f21200b.V0((String) obj, true);
                        break;
                    case 2:
                        s5.e eVar = (s5.e) obj;
                        String str2 = eVar.f26620d;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment2 = this.f21200b;
                        if (str2 != null) {
                            PaymentUI paymentUI3 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            paymentUI3.f11337h = str2.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI4 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI4 == null) {
                            paymentUI4 = null;
                        }
                        paymentUI4.i = K3.a.a(eVar.f26620d);
                        newPaymentToBankAccountBankInfoFragment2.W0();
                        PaymentUI paymentUI5 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI5 == null) {
                            paymentUI5 = null;
                        }
                        String str3 = paymentUI5.f11337h;
                        B5.h value = newPaymentToBankAccountBankInfoFragment2.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI6 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI6 == null) {
                                paymentUI6 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI6.f11345q = j.b(value, feeType2, str3);
                            PaymentUI paymentUI7 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            (paymentUI7 != null ? paymentUI7 : null).f11346r = j.a(value, feeType2, str3);
                        }
                        break;
                    case 3:
                        String str4 = (String) obj;
                        if (str4 != null) {
                            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment3 = this.f21200b;
                            NavController g10 = U4.b.g(newPaymentToBankAccountBankInfoFragment3);
                            PaymentUI paymentUI8 = newPaymentToBankAccountBankInfoFragment3.f12871q0;
                            g10.j(new e(paymentUI8 == null ? null : paymentUI8, newPaymentToBankAccountBankInfoFragment3.T0().f21207b, str4, newPaymentToBankAccountBankInfoFragment3.T0().f21209d, newPaymentToBankAccountBankInfoFragment3.T0().f21208c));
                            newPaymentToBankAccountBankInfoFragment3.U0().f8479r1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment4 = this.f21200b;
                        NavController g11 = U4.b.g(newPaymentToBankAccountBankInfoFragment4);
                        PaymentUI paymentUI9 = newPaymentToBankAccountBankInfoFragment4.f12871q0;
                        if (paymentUI9 == null) {
                            paymentUI9 = null;
                        }
                        g11.j(new e(paymentUI9, newPaymentToBankAccountBankInfoFragment4.T0().f21207b, null, newPaymentToBankAccountBankInfoFragment4.T0().f21209d, newPaymentToBankAccountBankInfoFragment4.T0().f21208c));
                        break;
                    default:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment5 = this.f21200b;
                        b8.h U02 = newPaymentToBankAccountBankInfoFragment5.U0();
                        PaymentUI paymentUI10 = newPaymentToBankAccountBankInfoFragment5.f12871q0;
                        if (paymentUI10 == null) {
                            paymentUI10 = null;
                        }
                        String str5 = paymentUI10.f11352x;
                        if (str5 == null) {
                            str5 = "";
                        }
                        newPaymentToBankAccountBankInfoFragment5.f12872r0 = U02.m(str5);
                        newPaymentToBankAccountBankInfoFragment5.u0().f29059B.setText(newPaymentToBankAccountBankInfoFragment5.f12872r0);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 5;
        U0().f8478q1.observe(getViewLifecycleOwner(), new j(new InterfaceC0646l(this) { // from class: h8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountBankInfoFragment f21200b;

            {
                this.f21200b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = this.f21200b;
                        PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        String str = (paymentUI == null ? null : paymentUI).f11337h;
                        if (paymentUI == null) {
                            paymentUI = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI.f11345q = j.b(hVar, feeType, str);
                        PaymentUI paymentUI2 = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        (paymentUI2 != null ? paymentUI2 : null).f11346r = j.a(hVar, feeType, str);
                        break;
                    case 1:
                        this.f21200b.V0((String) obj, true);
                        break;
                    case 2:
                        s5.e eVar = (s5.e) obj;
                        String str2 = eVar.f26620d;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment2 = this.f21200b;
                        if (str2 != null) {
                            PaymentUI paymentUI3 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            paymentUI3.f11337h = str2.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI4 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI4 == null) {
                            paymentUI4 = null;
                        }
                        paymentUI4.i = K3.a.a(eVar.f26620d);
                        newPaymentToBankAccountBankInfoFragment2.W0();
                        PaymentUI paymentUI5 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI5 == null) {
                            paymentUI5 = null;
                        }
                        String str3 = paymentUI5.f11337h;
                        B5.h value = newPaymentToBankAccountBankInfoFragment2.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI6 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI6 == null) {
                                paymentUI6 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI6.f11345q = j.b(value, feeType2, str3);
                            PaymentUI paymentUI7 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            (paymentUI7 != null ? paymentUI7 : null).f11346r = j.a(value, feeType2, str3);
                        }
                        break;
                    case 3:
                        String str4 = (String) obj;
                        if (str4 != null) {
                            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment3 = this.f21200b;
                            NavController g10 = U4.b.g(newPaymentToBankAccountBankInfoFragment3);
                            PaymentUI paymentUI8 = newPaymentToBankAccountBankInfoFragment3.f12871q0;
                            g10.j(new e(paymentUI8 == null ? null : paymentUI8, newPaymentToBankAccountBankInfoFragment3.T0().f21207b, str4, newPaymentToBankAccountBankInfoFragment3.T0().f21209d, newPaymentToBankAccountBankInfoFragment3.T0().f21208c));
                            newPaymentToBankAccountBankInfoFragment3.U0().f8479r1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment4 = this.f21200b;
                        NavController g11 = U4.b.g(newPaymentToBankAccountBankInfoFragment4);
                        PaymentUI paymentUI9 = newPaymentToBankAccountBankInfoFragment4.f12871q0;
                        if (paymentUI9 == null) {
                            paymentUI9 = null;
                        }
                        g11.j(new e(paymentUI9, newPaymentToBankAccountBankInfoFragment4.T0().f21207b, null, newPaymentToBankAccountBankInfoFragment4.T0().f21209d, newPaymentToBankAccountBankInfoFragment4.T0().f21208c));
                        break;
                    default:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment5 = this.f21200b;
                        b8.h U02 = newPaymentToBankAccountBankInfoFragment5.U0();
                        PaymentUI paymentUI10 = newPaymentToBankAccountBankInfoFragment5.f12871q0;
                        if (paymentUI10 == null) {
                            paymentUI10 = null;
                        }
                        String str5 = paymentUI10.f11352x;
                        if (str5 == null) {
                            str5 = "";
                        }
                        newPaymentToBankAccountBankInfoFragment5.f12872r0 = U02.m(str5);
                        newPaymentToBankAccountBankInfoFragment5.u0().f29059B.setText(newPaymentToBankAccountBankInfoFragment5.f12872r0);
                        break;
                }
                return p.f3034a;
            }
        }));
        AbstractC1350h5 u02 = u0();
        u02.f29071u.addTextChangedListener(new a());
        u02.f29064n.addTextChangedListener(new b());
        c cVar = new c(u02);
        CustomTextInputEditText customTextInputEditText = u02.f29063F;
        customTextInputEditText.addTextChangedListener(cVar);
        customTextInputEditText.setOnFocusChangeListener(new h8.c(0, this, u02));
        u02.f29065o.addTextChangedListener(new d());
        u02.f29066p.addTextChangedListener(new e());
        u02.f29061D.addTextChangedListener(new f());
        g gVar = new g();
        CustomTextInputEditText customTextInputEditText2 = u02.f29076z;
        customTextInputEditText2.addTextChangedListener(gVar);
        customTextInputEditText2.setOnFocusChangeListener(new X2.a(this, 5));
        u02.f29067q.addTextChangedListener(new h());
        i iVar = new i();
        CustomTextInputEditText customTextInputEditText3 = u02.f29069s;
        customTextInputEditText3.addTextChangedListener(iVar);
        customTextInputEditText3.setOnFocusChangeListener(new h8.c(1, this, u02));
        o.c(u02.f29074x, 500L, new A7.c(16, this, u02));
        final int i11 = 1;
        o.c(u02.f29072v, 500L, new InterfaceC0635a(this) { // from class: h8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountBankInfoFragment f21202b;

            {
                this.f21202b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        NavController g10 = U4.b.g(this.f21202b);
                        g10.i(R.id.action_newPaymentToBankAccountBankInfoFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    default:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = this.f21202b;
                        if (newPaymentToBankAccountBankInfoFragment.W0()) {
                            b8.h U02 = newPaymentToBankAccountBankInfoFragment.U0();
                            PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
                            String str = (paymentUI == null ? null : paymentUI).f11334e;
                            if (paymentUI == null) {
                                paymentUI = null;
                            }
                            E6.c cVar2 = new E6.c(U02, "TO_BANK_ACCOUNT", str, null, paymentUI.f11338j, 3);
                            U02.f8484w1 = cVar2;
                            cVar2.invoke();
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(u02.f29073w, 500L, new g8.g(u02, 2));
        final int i12 = 0;
        o.c(u02.f29059B, 500L, new InterfaceC0635a(this) { // from class: h8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountBankInfoFragment f21202b;

            {
                this.f21202b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        NavController g10 = U4.b.g(this.f21202b);
                        g10.i(R.id.action_newPaymentToBankAccountBankInfoFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    default:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = this.f21202b;
                        if (newPaymentToBankAccountBankInfoFragment.W0()) {
                            b8.h U02 = newPaymentToBankAccountBankInfoFragment.U0();
                            PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
                            String str = (paymentUI == null ? null : paymentUI).f11334e;
                            if (paymentUI == null) {
                                paymentUI = null;
                            }
                            E6.c cVar2 = new E6.c(U02, "TO_BANK_ACCOUNT", str, null, paymentUI.f11338j, 3);
                            U02.f8484w1 = cVar2;
                            cVar2.invoke();
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1350h5 u03 = u0();
        PaymentUI paymentUI = this.f12871q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        u03.f29071u.setText(paymentUI.f11334e);
        PaymentUI paymentUI2 = this.f12871q0;
        if (paymentUI2 == null) {
            paymentUI2 = null;
        }
        String str = paymentUI2.f11339k;
        if (str != null && str.length() != 0) {
            AbstractC1350h5 u04 = u0();
            PaymentUI paymentUI3 = this.f12871q0;
            if (paymentUI3 == null) {
                paymentUI3 = null;
            }
            u04.f29063F.setText(paymentUI3.f11339k);
        }
        PaymentUI paymentUI4 = this.f12871q0;
        if (paymentUI4 == null) {
            paymentUI4 = null;
        }
        String str2 = paymentUI4.f11338j;
        if (str2 != null && str2.length() != 0) {
            AbstractC1350h5 u05 = u0();
            PaymentUI paymentUI5 = this.f12871q0;
            if (paymentUI5 == null) {
                paymentUI5 = null;
            }
            u05.f29064n.setText(paymentUI5.f11338j);
        }
        PaymentUI paymentUI6 = this.f12871q0;
        if (paymentUI6 == null) {
            paymentUI6 = null;
        }
        String str3 = paymentUI6.f11329A;
        if (str3 != null && str3.length() != 0) {
            AbstractC1350h5 u06 = u0();
            PaymentUI paymentUI7 = this.f12871q0;
            if (paymentUI7 == null) {
                paymentUI7 = null;
            }
            u06.f29069s.setText(paymentUI7.f11329A);
        }
        PaymentUI paymentUI8 = this.f12871q0;
        if (paymentUI8 == null) {
            paymentUI8 = null;
        }
        String str4 = paymentUI8.f11351w;
        if (str4 != null && str4.length() != 0) {
            AbstractC1350h5 u07 = u0();
            PaymentUI paymentUI9 = this.f12871q0;
            if (paymentUI9 == null) {
                paymentUI9 = null;
            }
            u07.f29076z.setText(paymentUI9.f11351w);
        }
        AbstractC1350h5 u08 = u0();
        PaymentUI paymentUI10 = this.f12871q0;
        if (paymentUI10 == null) {
            paymentUI10 = null;
        }
        u08.f29067q.setText(paymentUI10.f11354z);
        AbstractC1350h5 u09 = u0();
        PaymentUI paymentUI11 = this.f12871q0;
        if (paymentUI11 == null) {
            paymentUI11 = null;
        }
        u09.f29061D.setText(paymentUI11.f11350v);
        AbstractC1350h5 u010 = u0();
        PaymentUI paymentUI12 = this.f12871q0;
        if (paymentUI12 == null) {
            paymentUI12 = null;
        }
        u010.f29065o.setText(paymentUI12.f11348t);
        AbstractC1350h5 u011 = u0();
        PaymentUI paymentUI13 = this.f12871q0;
        if (paymentUI13 == null) {
            paymentUI13 = null;
        }
        u011.f29066p.setText(paymentUI13.f11349u);
        AbstractC1350h5 u012 = u0();
        PaymentUI paymentUI14 = this.f12871q0;
        if (paymentUI14 == null) {
            paymentUI14 = null;
        }
        Boolean bool = paymentUI14.f11353y;
        u012.f29074x.setChecked(bool != null ? bool.booleanValue() : false);
        if (u0().f29074x.isChecked()) {
            u0().f29058A.setVisibility(0);
        }
        PaymentUI paymentUI15 = this.f12871q0;
        this.s0 = (paymentUI15 != null ? paymentUI15 : null).f11352x;
        b8.h U02 = U0();
        U02.f8478q1.postValue(U02.f8456T0.f());
        E.b(this, "country", new B6.h(this, 19));
        final int i13 = 2;
        U0().f8472j1.observe(getViewLifecycleOwner(), new j(new InterfaceC0646l(this) { // from class: h8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountBankInfoFragment f21200b;

            {
                this.f21200b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = this.f21200b;
                        PaymentUI paymentUI16 = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        String str5 = (paymentUI16 == null ? null : paymentUI16).f11337h;
                        if (paymentUI16 == null) {
                            paymentUI16 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI16.f11345q = j.b(hVar, feeType, str5);
                        PaymentUI paymentUI22 = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        (paymentUI22 != null ? paymentUI22 : null).f11346r = j.a(hVar, feeType, str5);
                        break;
                    case 1:
                        this.f21200b.V0((String) obj, true);
                        break;
                    case 2:
                        s5.e eVar = (s5.e) obj;
                        String str22 = eVar.f26620d;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment2 = this.f21200b;
                        if (str22 != null) {
                            PaymentUI paymentUI32 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI32 == null) {
                                paymentUI32 = null;
                            }
                            paymentUI32.f11337h = str22.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI42 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI42 == null) {
                            paymentUI42 = null;
                        }
                        paymentUI42.i = K3.a.a(eVar.f26620d);
                        newPaymentToBankAccountBankInfoFragment2.W0();
                        PaymentUI paymentUI52 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI52 == null) {
                            paymentUI52 = null;
                        }
                        String str32 = paymentUI52.f11337h;
                        B5.h value = newPaymentToBankAccountBankInfoFragment2.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI62 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI62 == null) {
                                paymentUI62 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI62.f11345q = j.b(value, feeType2, str32);
                            PaymentUI paymentUI72 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            (paymentUI72 != null ? paymentUI72 : null).f11346r = j.a(value, feeType2, str32);
                        }
                        break;
                    case 3:
                        String str42 = (String) obj;
                        if (str42 != null) {
                            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment3 = this.f21200b;
                            NavController g10 = U4.b.g(newPaymentToBankAccountBankInfoFragment3);
                            PaymentUI paymentUI82 = newPaymentToBankAccountBankInfoFragment3.f12871q0;
                            g10.j(new e(paymentUI82 == null ? null : paymentUI82, newPaymentToBankAccountBankInfoFragment3.T0().f21207b, str42, newPaymentToBankAccountBankInfoFragment3.T0().f21209d, newPaymentToBankAccountBankInfoFragment3.T0().f21208c));
                            newPaymentToBankAccountBankInfoFragment3.U0().f8479r1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment4 = this.f21200b;
                        NavController g11 = U4.b.g(newPaymentToBankAccountBankInfoFragment4);
                        PaymentUI paymentUI92 = newPaymentToBankAccountBankInfoFragment4.f12871q0;
                        if (paymentUI92 == null) {
                            paymentUI92 = null;
                        }
                        g11.j(new e(paymentUI92, newPaymentToBankAccountBankInfoFragment4.T0().f21207b, null, newPaymentToBankAccountBankInfoFragment4.T0().f21209d, newPaymentToBankAccountBankInfoFragment4.T0().f21208c));
                        break;
                    default:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment5 = this.f21200b;
                        b8.h U022 = newPaymentToBankAccountBankInfoFragment5.U0();
                        PaymentUI paymentUI102 = newPaymentToBankAccountBankInfoFragment5.f12871q0;
                        if (paymentUI102 == null) {
                            paymentUI102 = null;
                        }
                        String str52 = paymentUI102.f11352x;
                        if (str52 == null) {
                            str52 = "";
                        }
                        newPaymentToBankAccountBankInfoFragment5.f12872r0 = U022.m(str52);
                        newPaymentToBankAccountBankInfoFragment5.u0().f29059B.setText(newPaymentToBankAccountBankInfoFragment5.f12872r0);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i14 = 3;
        U0().f8479r1.observe(getViewLifecycleOwner(), new j(new InterfaceC0646l(this) { // from class: h8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountBankInfoFragment f21200b;

            {
                this.f21200b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = this.f21200b;
                        PaymentUI paymentUI16 = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        String str5 = (paymentUI16 == null ? null : paymentUI16).f11337h;
                        if (paymentUI16 == null) {
                            paymentUI16 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI16.f11345q = j.b(hVar, feeType, str5);
                        PaymentUI paymentUI22 = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        (paymentUI22 != null ? paymentUI22 : null).f11346r = j.a(hVar, feeType, str5);
                        break;
                    case 1:
                        this.f21200b.V0((String) obj, true);
                        break;
                    case 2:
                        s5.e eVar = (s5.e) obj;
                        String str22 = eVar.f26620d;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment2 = this.f21200b;
                        if (str22 != null) {
                            PaymentUI paymentUI32 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI32 == null) {
                                paymentUI32 = null;
                            }
                            paymentUI32.f11337h = str22.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI42 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI42 == null) {
                            paymentUI42 = null;
                        }
                        paymentUI42.i = K3.a.a(eVar.f26620d);
                        newPaymentToBankAccountBankInfoFragment2.W0();
                        PaymentUI paymentUI52 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI52 == null) {
                            paymentUI52 = null;
                        }
                        String str32 = paymentUI52.f11337h;
                        B5.h value = newPaymentToBankAccountBankInfoFragment2.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI62 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI62 == null) {
                                paymentUI62 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI62.f11345q = j.b(value, feeType2, str32);
                            PaymentUI paymentUI72 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            (paymentUI72 != null ? paymentUI72 : null).f11346r = j.a(value, feeType2, str32);
                        }
                        break;
                    case 3:
                        String str42 = (String) obj;
                        if (str42 != null) {
                            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment3 = this.f21200b;
                            NavController g10 = U4.b.g(newPaymentToBankAccountBankInfoFragment3);
                            PaymentUI paymentUI82 = newPaymentToBankAccountBankInfoFragment3.f12871q0;
                            g10.j(new e(paymentUI82 == null ? null : paymentUI82, newPaymentToBankAccountBankInfoFragment3.T0().f21207b, str42, newPaymentToBankAccountBankInfoFragment3.T0().f21209d, newPaymentToBankAccountBankInfoFragment3.T0().f21208c));
                            newPaymentToBankAccountBankInfoFragment3.U0().f8479r1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment4 = this.f21200b;
                        NavController g11 = U4.b.g(newPaymentToBankAccountBankInfoFragment4);
                        PaymentUI paymentUI92 = newPaymentToBankAccountBankInfoFragment4.f12871q0;
                        if (paymentUI92 == null) {
                            paymentUI92 = null;
                        }
                        g11.j(new e(paymentUI92, newPaymentToBankAccountBankInfoFragment4.T0().f21207b, null, newPaymentToBankAccountBankInfoFragment4.T0().f21209d, newPaymentToBankAccountBankInfoFragment4.T0().f21208c));
                        break;
                    default:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment5 = this.f21200b;
                        b8.h U022 = newPaymentToBankAccountBankInfoFragment5.U0();
                        PaymentUI paymentUI102 = newPaymentToBankAccountBankInfoFragment5.f12871q0;
                        if (paymentUI102 == null) {
                            paymentUI102 = null;
                        }
                        String str52 = paymentUI102.f11352x;
                        if (str52 == null) {
                            str52 = "";
                        }
                        newPaymentToBankAccountBankInfoFragment5.f12872r0 = U022.m(str52);
                        newPaymentToBankAccountBankInfoFragment5.u0().f29059B.setText(newPaymentToBankAccountBankInfoFragment5.f12872r0);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i15 = 4;
        U0().f8480s1.observe(getViewLifecycleOwner(), new j(new InterfaceC0646l(this) { // from class: h8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountBankInfoFragment f21200b;

            {
                this.f21200b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = this.f21200b;
                        PaymentUI paymentUI16 = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        String str5 = (paymentUI16 == null ? null : paymentUI16).f11337h;
                        if (paymentUI16 == null) {
                            paymentUI16 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI16.f11345q = j.b(hVar, feeType, str5);
                        PaymentUI paymentUI22 = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        (paymentUI22 != null ? paymentUI22 : null).f11346r = j.a(hVar, feeType, str5);
                        break;
                    case 1:
                        this.f21200b.V0((String) obj, true);
                        break;
                    case 2:
                        s5.e eVar = (s5.e) obj;
                        String str22 = eVar.f26620d;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment2 = this.f21200b;
                        if (str22 != null) {
                            PaymentUI paymentUI32 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI32 == null) {
                                paymentUI32 = null;
                            }
                            paymentUI32.f11337h = str22.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI42 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI42 == null) {
                            paymentUI42 = null;
                        }
                        paymentUI42.i = K3.a.a(eVar.f26620d);
                        newPaymentToBankAccountBankInfoFragment2.W0();
                        PaymentUI paymentUI52 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI52 == null) {
                            paymentUI52 = null;
                        }
                        String str32 = paymentUI52.f11337h;
                        B5.h value = newPaymentToBankAccountBankInfoFragment2.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI62 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI62 == null) {
                                paymentUI62 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI62.f11345q = j.b(value, feeType2, str32);
                            PaymentUI paymentUI72 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            (paymentUI72 != null ? paymentUI72 : null).f11346r = j.a(value, feeType2, str32);
                        }
                        break;
                    case 3:
                        String str42 = (String) obj;
                        if (str42 != null) {
                            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment3 = this.f21200b;
                            NavController g10 = U4.b.g(newPaymentToBankAccountBankInfoFragment3);
                            PaymentUI paymentUI82 = newPaymentToBankAccountBankInfoFragment3.f12871q0;
                            g10.j(new e(paymentUI82 == null ? null : paymentUI82, newPaymentToBankAccountBankInfoFragment3.T0().f21207b, str42, newPaymentToBankAccountBankInfoFragment3.T0().f21209d, newPaymentToBankAccountBankInfoFragment3.T0().f21208c));
                            newPaymentToBankAccountBankInfoFragment3.U0().f8479r1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment4 = this.f21200b;
                        NavController g11 = U4.b.g(newPaymentToBankAccountBankInfoFragment4);
                        PaymentUI paymentUI92 = newPaymentToBankAccountBankInfoFragment4.f12871q0;
                        if (paymentUI92 == null) {
                            paymentUI92 = null;
                        }
                        g11.j(new e(paymentUI92, newPaymentToBankAccountBankInfoFragment4.T0().f21207b, null, newPaymentToBankAccountBankInfoFragment4.T0().f21209d, newPaymentToBankAccountBankInfoFragment4.T0().f21208c));
                        break;
                    default:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment5 = this.f21200b;
                        b8.h U022 = newPaymentToBankAccountBankInfoFragment5.U0();
                        PaymentUI paymentUI102 = newPaymentToBankAccountBankInfoFragment5.f12871q0;
                        if (paymentUI102 == null) {
                            paymentUI102 = null;
                        }
                        String str52 = paymentUI102.f11352x;
                        if (str52 == null) {
                            str52 = "";
                        }
                        newPaymentToBankAccountBankInfoFragment5.f12872r0 = U022.m(str52);
                        newPaymentToBankAccountBankInfoFragment5.u0().f29059B.setText(newPaymentToBankAccountBankInfoFragment5.f12872r0);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i16 = 1;
        F8.g.a(u0().f29071u, new InterfaceC0646l(this) { // from class: h8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountBankInfoFragment f21200b;

            {
                this.f21200b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = this.f21200b;
                        PaymentUI paymentUI16 = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        String str5 = (paymentUI16 == null ? null : paymentUI16).f11337h;
                        if (paymentUI16 == null) {
                            paymentUI16 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI16.f11345q = j.b(hVar, feeType, str5);
                        PaymentUI paymentUI22 = newPaymentToBankAccountBankInfoFragment.f12871q0;
                        (paymentUI22 != null ? paymentUI22 : null).f11346r = j.a(hVar, feeType, str5);
                        break;
                    case 1:
                        this.f21200b.V0((String) obj, true);
                        break;
                    case 2:
                        s5.e eVar = (s5.e) obj;
                        String str22 = eVar.f26620d;
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment2 = this.f21200b;
                        if (str22 != null) {
                            PaymentUI paymentUI32 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI32 == null) {
                                paymentUI32 = null;
                            }
                            paymentUI32.f11337h = str22.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI42 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI42 == null) {
                            paymentUI42 = null;
                        }
                        paymentUI42.i = K3.a.a(eVar.f26620d);
                        newPaymentToBankAccountBankInfoFragment2.W0();
                        PaymentUI paymentUI52 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                        if (paymentUI52 == null) {
                            paymentUI52 = null;
                        }
                        String str32 = paymentUI52.f11337h;
                        B5.h value = newPaymentToBankAccountBankInfoFragment2.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI62 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            if (paymentUI62 == null) {
                                paymentUI62 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI62.f11345q = j.b(value, feeType2, str32);
                            PaymentUI paymentUI72 = newPaymentToBankAccountBankInfoFragment2.f12871q0;
                            (paymentUI72 != null ? paymentUI72 : null).f11346r = j.a(value, feeType2, str32);
                        }
                        break;
                    case 3:
                        String str42 = (String) obj;
                        if (str42 != null) {
                            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment3 = this.f21200b;
                            NavController g10 = U4.b.g(newPaymentToBankAccountBankInfoFragment3);
                            PaymentUI paymentUI82 = newPaymentToBankAccountBankInfoFragment3.f12871q0;
                            g10.j(new e(paymentUI82 == null ? null : paymentUI82, newPaymentToBankAccountBankInfoFragment3.T0().f21207b, str42, newPaymentToBankAccountBankInfoFragment3.T0().f21209d, newPaymentToBankAccountBankInfoFragment3.T0().f21208c));
                            newPaymentToBankAccountBankInfoFragment3.U0().f8479r1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment4 = this.f21200b;
                        NavController g11 = U4.b.g(newPaymentToBankAccountBankInfoFragment4);
                        PaymentUI paymentUI92 = newPaymentToBankAccountBankInfoFragment4.f12871q0;
                        if (paymentUI92 == null) {
                            paymentUI92 = null;
                        }
                        g11.j(new e(paymentUI92, newPaymentToBankAccountBankInfoFragment4.T0().f21207b, null, newPaymentToBankAccountBankInfoFragment4.T0().f21209d, newPaymentToBankAccountBankInfoFragment4.T0().f21208c));
                        break;
                    default:
                        NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment5 = this.f21200b;
                        b8.h U022 = newPaymentToBankAccountBankInfoFragment5.U0();
                        PaymentUI paymentUI102 = newPaymentToBankAccountBankInfoFragment5.f12871q0;
                        if (paymentUI102 == null) {
                            paymentUI102 = null;
                        }
                        String str52 = paymentUI102.f11352x;
                        if (str52 == null) {
                            str52 = "";
                        }
                        newPaymentToBankAccountBankInfoFragment5.f12872r0 = U022.m(str52);
                        newPaymentToBankAccountBankInfoFragment5.u0().f29059B.setText(newPaymentToBankAccountBankInfoFragment5.f12872r0);
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12868n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        u0().f29072v.setVisibility(0);
        t0(true);
        s0();
        o.b(u0().f29073w);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        o.b(u0().f29072v);
        u0().f29073w.setVisibility(0);
        p0(true);
        B0();
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = NewPaymentToBankAccountBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11334e = String.valueOf(charSequence);
            newPaymentToBankAccountBankInfoFragment.V0(String.valueOf(charSequence), false);
            newPaymentToBankAccountBankInfoFragment.W0();
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
            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = NewPaymentToBankAccountBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11338j = String.valueOf(charSequence);
            newPaymentToBankAccountBankInfoFragment.W0();
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

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1350h5 f12881b;

        public c(AbstractC1350h5 abstractC1350h5) {
            this.f12881b = abstractC1350h5;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = NewPaymentToBankAccountBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11339k = String.valueOf(charSequence);
            newPaymentToBankAccountBankInfoFragment.W0();
            if (s3.b.w("^[A-Z]{4}[A-Z]{2}[A-Z0-9]{2}([A-Z0-9]{3})?$", String.valueOf(charSequence))) {
                this.f12881b.f29062E.setError(null);
            }
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
            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = NewPaymentToBankAccountBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11348t = String.valueOf(charSequence);
            newPaymentToBankAccountBankInfoFragment.W0();
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
            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = NewPaymentToBankAccountBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11349u = String.valueOf(charSequence);
            newPaymentToBankAccountBankInfoFragment.W0();
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
            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = NewPaymentToBankAccountBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11350v = String.valueOf(charSequence);
            newPaymentToBankAccountBankInfoFragment.W0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = NewPaymentToBankAccountBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11351w = String.valueOf(charSequence);
            newPaymentToBankAccountBankInfoFragment.W0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = NewPaymentToBankAccountBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11354z = String.valueOf(charSequence);
            newPaymentToBankAccountBankInfoFragment.W0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class i implements TextWatcher {
        public i() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = NewPaymentToBankAccountBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentToBankAccountBankInfoFragment.f12871q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11329A = String.valueOf(charSequence);
            newPaymentToBankAccountBankInfoFragment.W0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
