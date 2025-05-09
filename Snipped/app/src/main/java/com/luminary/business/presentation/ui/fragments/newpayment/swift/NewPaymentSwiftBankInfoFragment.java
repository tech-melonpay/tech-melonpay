package com.luminary.business.presentation.ui.fragments.newpayment.swift;

import C.v;
import F8.o;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftBankInfoFragment;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.extensions.FeeType;
import com.luminary.mobile.R;
import java.util.Locale;
import kotlin.jvm.internal.h;
import t6.AbstractC1318d5;

/* compiled from: NewPaymentSwiftBankInfoFragment.kt */
/* loaded from: classes2.dex */
public final class NewPaymentSwiftBankInfoFragment extends BaseFragment<AbstractC1318d5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12831n0 = R.layout.fragment_new_payment_swift_bank_info;

    /* renamed from: o0, reason: collision with root package name */
    public final Fa.h f12832o0 = new Fa.h(kotlin.jvm.internal.h.a(g8.d.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftBankInfoFragment$special$$inlined$navArgs$1
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
    public final H1.a f12833p0;

    /* renamed from: q0, reason: collision with root package name */
    public PaymentUI f12834q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f12835r0;
    public String s0;

    /* compiled from: NewPaymentSwiftBankInfoFragment.kt */
    public static final class j implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12850a;

        public j(InterfaceC0646l interfaceC0646l) {
            this.f12850a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12850a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12850a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftBankInfoFragment$special$$inlined$viewModel$default$1] */
    public NewPaymentSwiftBankInfoFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftBankInfoFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12833p0 = E.a(this, kotlin.jvm.internal.h.a(b8.h.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftBankInfoFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftBankInfoFragment$special$$inlined$viewModel$default$2
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
        toolbarStatus.f13263a = getString(R.string.international);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.international);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final b8.h T0() {
        return (b8.h) this.f12833p0.getValue();
    }

    public final void U0(String str, boolean z10) {
        AbstractC1318d5 u02 = u0();
        boolean g02 = D9.b.g0(str);
        CustomTextInputLayout customTextInputLayout = u02.f28935s;
        if (g02 || !z10) {
            customTextInputLayout.setError(null);
        } else {
            customTextInputLayout.setErrorWithoutFocus(getString(R.string.invalid_beneficiary));
        }
    }

    public final boolean V0() {
        AbstractC1318d5 u02 = u0();
        PaymentUI paymentUI = this.f12834q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        u02.f28937u.setEnabled(paymentUI.g());
        AbstractC1318d5 u03 = u0();
        PaymentUI paymentUI2 = this.f12834q0;
        if (paymentUI2 == null) {
            paymentUI2 = null;
        }
        u03.f28938v.setEnabled(paymentUI2.g());
        PaymentUI paymentUI3 = this.f12834q0;
        return (paymentUI3 != null ? paymentUI3 : null).g();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
        this.f12834q0 = ((g8.d) this.f12832o0.getValue()).f20817a;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i9 = 0;
        T0().f8474l1.observe(getViewLifecycleOwner(), new j(new InterfaceC0646l(this) { // from class: g8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentSwiftBankInfoFragment f20812b;

            {
                this.f20812b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = this.f20812b;
                        PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
                        String str = (paymentUI == null ? null : paymentUI).f11337h;
                        if (paymentUI == null) {
                            paymentUI = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI.f11345q = F8.j.b(hVar, feeType, str);
                        PaymentUI paymentUI2 = newPaymentSwiftBankInfoFragment.f12834q0;
                        (paymentUI2 != null ? paymentUI2 : null).f11346r = F8.j.a(hVar, feeType, str);
                        break;
                    case 1:
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment2 = this.f20812b;
                        b8.h T02 = newPaymentSwiftBankInfoFragment2.T0();
                        PaymentUI paymentUI3 = newPaymentSwiftBankInfoFragment2.f12834q0;
                        if (paymentUI3 == null) {
                            paymentUI3 = null;
                        }
                        String str2 = paymentUI3.f11352x;
                        if (str2 == null) {
                            str2 = "";
                        }
                        newPaymentSwiftBankInfoFragment2.f12835r0 = T02.m(str2);
                        newPaymentSwiftBankInfoFragment2.u0().f28942z.setText(newPaymentSwiftBankInfoFragment2.f12835r0);
                        break;
                    case 2:
                        s5.e eVar = (s5.e) obj;
                        String str3 = eVar.f26620d;
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment3 = this.f20812b;
                        if (str3 != null) {
                            PaymentUI paymentUI4 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            if (paymentUI4 == null) {
                                paymentUI4 = null;
                            }
                            paymentUI4.f11337h = str3.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI5 = newPaymentSwiftBankInfoFragment3.f12834q0;
                        if (paymentUI5 == null) {
                            paymentUI5 = null;
                        }
                        paymentUI5.i = K3.a.a(eVar.f26620d);
                        newPaymentSwiftBankInfoFragment3.V0();
                        PaymentUI paymentUI6 = newPaymentSwiftBankInfoFragment3.f12834q0;
                        if (paymentUI6 == null) {
                            paymentUI6 = null;
                        }
                        String str4 = paymentUI6.f11337h;
                        B5.h value = newPaymentSwiftBankInfoFragment3.T0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI7 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            if (paymentUI7 == null) {
                                paymentUI7 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI7.f11345q = F8.j.b(value, feeType2, str4);
                            PaymentUI paymentUI8 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            (paymentUI8 != null ? paymentUI8 : null).f11346r = F8.j.a(value, feeType2, str4);
                        }
                        break;
                    default:
                        this.f20812b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 1;
        T0().f8478q1.observe(getViewLifecycleOwner(), new j(new InterfaceC0646l(this) { // from class: g8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentSwiftBankInfoFragment f20812b;

            {
                this.f20812b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = this.f20812b;
                        PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
                        String str = (paymentUI == null ? null : paymentUI).f11337h;
                        if (paymentUI == null) {
                            paymentUI = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI.f11345q = F8.j.b(hVar, feeType, str);
                        PaymentUI paymentUI2 = newPaymentSwiftBankInfoFragment.f12834q0;
                        (paymentUI2 != null ? paymentUI2 : null).f11346r = F8.j.a(hVar, feeType, str);
                        break;
                    case 1:
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment2 = this.f20812b;
                        b8.h T02 = newPaymentSwiftBankInfoFragment2.T0();
                        PaymentUI paymentUI3 = newPaymentSwiftBankInfoFragment2.f12834q0;
                        if (paymentUI3 == null) {
                            paymentUI3 = null;
                        }
                        String str2 = paymentUI3.f11352x;
                        if (str2 == null) {
                            str2 = "";
                        }
                        newPaymentSwiftBankInfoFragment2.f12835r0 = T02.m(str2);
                        newPaymentSwiftBankInfoFragment2.u0().f28942z.setText(newPaymentSwiftBankInfoFragment2.f12835r0);
                        break;
                    case 2:
                        s5.e eVar = (s5.e) obj;
                        String str3 = eVar.f26620d;
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment3 = this.f20812b;
                        if (str3 != null) {
                            PaymentUI paymentUI4 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            if (paymentUI4 == null) {
                                paymentUI4 = null;
                            }
                            paymentUI4.f11337h = str3.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI5 = newPaymentSwiftBankInfoFragment3.f12834q0;
                        if (paymentUI5 == null) {
                            paymentUI5 = null;
                        }
                        paymentUI5.i = K3.a.a(eVar.f26620d);
                        newPaymentSwiftBankInfoFragment3.V0();
                        PaymentUI paymentUI6 = newPaymentSwiftBankInfoFragment3.f12834q0;
                        if (paymentUI6 == null) {
                            paymentUI6 = null;
                        }
                        String str4 = paymentUI6.f11337h;
                        B5.h value = newPaymentSwiftBankInfoFragment3.T0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI7 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            if (paymentUI7 == null) {
                                paymentUI7 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI7.f11345q = F8.j.b(value, feeType2, str4);
                            PaymentUI paymentUI8 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            (paymentUI8 != null ? paymentUI8 : null).f11346r = F8.j.a(value, feeType2, str4);
                        }
                        break;
                    default:
                        this.f20812b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        }));
        final AbstractC1318d5 u02 = u0();
        u02.f28936t.addTextChangedListener(new a());
        u02.f28930n.addTextChangedListener(new b());
        u02.f28929B.addTextChangedListener(new c());
        u02.f28931o.addTextChangedListener(new d());
        u02.f28932p.addTextChangedListener(new e());
        u02.f28928A.addTextChangedListener(new f());
        u02.f28940x.addTextChangedListener(new g());
        u02.f28933q.addTextChangedListener(new h());
        u02.f28934r.addTextChangedListener(new i());
        final int i11 = 0;
        o.c(u02.f28939w, 500L, new InterfaceC0635a() { // from class: g8.b
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        AbstractC1318d5 abstractC1318d5 = u02;
                        boolean isChecked = abstractC1318d5.f28939w.isChecked();
                        ConstraintLayout constraintLayout = abstractC1318d5.f28941y;
                        if (isChecked) {
                            constraintLayout.setVisibility(0);
                        } else {
                            o.b(constraintLayout);
                        }
                        break;
                    default:
                        u02.f28937u.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i12 = 0;
        o.c(u02.f28937u, 500L, new InterfaceC0635a(this) { // from class: g8.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentSwiftBankInfoFragment f20816b;

            {
                this.f20816b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = this.f20816b;
                        if (newPaymentSwiftBankInfoFragment.V0()) {
                            NavController g10 = U4.b.g(newPaymentSwiftBankInfoFragment);
                            PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
                            if (paymentUI == null) {
                                paymentUI = null;
                            }
                            Fa.h hVar = newPaymentSwiftBankInfoFragment.f12832o0;
                            g10.j(new e(paymentUI, ((d) hVar.getValue()).f20818b, ((d) hVar.getValue()).f20819c));
                        }
                        break;
                    default:
                        NavController g11 = U4.b.g(this.f20816b);
                        g11.i(R.id.action_newPaymentSwiftBankInfoFragment_to_countrySelectFragment, v.h(g11, "isCountryCode", false, "fieldName", ""));
                        break;
                }
                return p.f3034a;
            }
        });
        final int i13 = 1;
        o.c(u02.f28938v, 500L, new InterfaceC0635a() { // from class: g8.b
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        AbstractC1318d5 abstractC1318d5 = u02;
                        boolean isChecked = abstractC1318d5.f28939w.isChecked();
                        ConstraintLayout constraintLayout = abstractC1318d5.f28941y;
                        if (isChecked) {
                            constraintLayout.setVisibility(0);
                        } else {
                            o.b(constraintLayout);
                        }
                        break;
                    default:
                        u02.f28937u.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i14 = 1;
        o.c(u02.f28942z, 500L, new InterfaceC0635a(this) { // from class: g8.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentSwiftBankInfoFragment f20816b;

            {
                this.f20816b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = this.f20816b;
                        if (newPaymentSwiftBankInfoFragment.V0()) {
                            NavController g10 = U4.b.g(newPaymentSwiftBankInfoFragment);
                            PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
                            if (paymentUI == null) {
                                paymentUI = null;
                            }
                            Fa.h hVar = newPaymentSwiftBankInfoFragment.f12832o0;
                            g10.j(new e(paymentUI, ((d) hVar.getValue()).f20818b, ((d) hVar.getValue()).f20819c));
                        }
                        break;
                    default:
                        NavController g11 = U4.b.g(this.f20816b);
                        g11.i(R.id.action_newPaymentSwiftBankInfoFragment_to_countrySelectFragment, v.h(g11, "isCountryCode", false, "fieldName", ""));
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1318d5 u03 = u0();
        PaymentUI paymentUI = this.f12834q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        u03.f28936t.setText(paymentUI.f11334e);
        AbstractC1318d5 u04 = u0();
        PaymentUI paymentUI2 = this.f12834q0;
        if (paymentUI2 == null) {
            paymentUI2 = null;
        }
        u04.f28929B.setText(paymentUI2.f11339k);
        PaymentUI paymentUI3 = this.f12834q0;
        if (paymentUI3 == null) {
            paymentUI3 = null;
        }
        String str = paymentUI3.f11338j;
        if (str != null && str.length() != 0) {
            AbstractC1318d5 u05 = u0();
            PaymentUI paymentUI4 = this.f12834q0;
            if (paymentUI4 == null) {
                paymentUI4 = null;
            }
            u05.f28930n.setText(paymentUI4.f11338j);
        }
        AbstractC1318d5 u06 = u0();
        PaymentUI paymentUI5 = this.f12834q0;
        if (paymentUI5 == null) {
            paymentUI5 = null;
        }
        u06.f28934r.setText(paymentUI5.f11329A);
        AbstractC1318d5 u07 = u0();
        PaymentUI paymentUI6 = this.f12834q0;
        if (paymentUI6 == null) {
            paymentUI6 = null;
        }
        u07.f28933q.setText(paymentUI6.f11354z);
        AbstractC1318d5 u08 = u0();
        PaymentUI paymentUI7 = this.f12834q0;
        if (paymentUI7 == null) {
            paymentUI7 = null;
        }
        u08.f28928A.setText(paymentUI7.f11350v);
        AbstractC1318d5 u09 = u0();
        PaymentUI paymentUI8 = this.f12834q0;
        if (paymentUI8 == null) {
            paymentUI8 = null;
        }
        u09.f28940x.setText(paymentUI8.f11351w);
        AbstractC1318d5 u010 = u0();
        PaymentUI paymentUI9 = this.f12834q0;
        if (paymentUI9 == null) {
            paymentUI9 = null;
        }
        u010.f28931o.setText(paymentUI9.f11348t);
        AbstractC1318d5 u011 = u0();
        PaymentUI paymentUI10 = this.f12834q0;
        if (paymentUI10 == null) {
            paymentUI10 = null;
        }
        u011.f28932p.setText(paymentUI10.f11349u);
        AbstractC1318d5 u012 = u0();
        PaymentUI paymentUI11 = this.f12834q0;
        if (paymentUI11 == null) {
            paymentUI11 = null;
        }
        Boolean bool = paymentUI11.f11353y;
        u012.f28939w.setChecked(bool != null ? bool.booleanValue() : false);
        if (u0().f28939w.isChecked()) {
            u0().f28941y.setVisibility(0);
        }
        PaymentUI paymentUI12 = this.f12834q0;
        this.s0 = (paymentUI12 != null ? paymentUI12 : null).f11352x;
        b8.h T02 = T0();
        T02.f8478q1.postValue(T02.f8456T0.f());
        E.b(this, "country", new B6.h(this, 18));
        final int i15 = 2;
        T0().f8472j1.observe(getViewLifecycleOwner(), new j(new InterfaceC0646l(this) { // from class: g8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentSwiftBankInfoFragment f20812b;

            {
                this.f20812b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = this.f20812b;
                        PaymentUI paymentUI13 = newPaymentSwiftBankInfoFragment.f12834q0;
                        String str2 = (paymentUI13 == null ? null : paymentUI13).f11337h;
                        if (paymentUI13 == null) {
                            paymentUI13 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI13.f11345q = F8.j.b(hVar, feeType, str2);
                        PaymentUI paymentUI22 = newPaymentSwiftBankInfoFragment.f12834q0;
                        (paymentUI22 != null ? paymentUI22 : null).f11346r = F8.j.a(hVar, feeType, str2);
                        break;
                    case 1:
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment2 = this.f20812b;
                        b8.h T022 = newPaymentSwiftBankInfoFragment2.T0();
                        PaymentUI paymentUI32 = newPaymentSwiftBankInfoFragment2.f12834q0;
                        if (paymentUI32 == null) {
                            paymentUI32 = null;
                        }
                        String str22 = paymentUI32.f11352x;
                        if (str22 == null) {
                            str22 = "";
                        }
                        newPaymentSwiftBankInfoFragment2.f12835r0 = T022.m(str22);
                        newPaymentSwiftBankInfoFragment2.u0().f28942z.setText(newPaymentSwiftBankInfoFragment2.f12835r0);
                        break;
                    case 2:
                        s5.e eVar = (s5.e) obj;
                        String str3 = eVar.f26620d;
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment3 = this.f20812b;
                        if (str3 != null) {
                            PaymentUI paymentUI42 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            if (paymentUI42 == null) {
                                paymentUI42 = null;
                            }
                            paymentUI42.f11337h = str3.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI52 = newPaymentSwiftBankInfoFragment3.f12834q0;
                        if (paymentUI52 == null) {
                            paymentUI52 = null;
                        }
                        paymentUI52.i = K3.a.a(eVar.f26620d);
                        newPaymentSwiftBankInfoFragment3.V0();
                        PaymentUI paymentUI62 = newPaymentSwiftBankInfoFragment3.f12834q0;
                        if (paymentUI62 == null) {
                            paymentUI62 = null;
                        }
                        String str4 = paymentUI62.f11337h;
                        B5.h value = newPaymentSwiftBankInfoFragment3.T0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI72 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            if (paymentUI72 == null) {
                                paymentUI72 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI72.f11345q = F8.j.b(value, feeType2, str4);
                            PaymentUI paymentUI82 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            (paymentUI82 != null ? paymentUI82 : null).f11346r = F8.j.a(value, feeType2, str4);
                        }
                        break;
                    default:
                        this.f20812b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i16 = 3;
        F8.g.a(u0().f28936t, new InterfaceC0646l(this) { // from class: g8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentSwiftBankInfoFragment f20812b;

            {
                this.f20812b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = this.f20812b;
                        PaymentUI paymentUI13 = newPaymentSwiftBankInfoFragment.f12834q0;
                        String str2 = (paymentUI13 == null ? null : paymentUI13).f11337h;
                        if (paymentUI13 == null) {
                            paymentUI13 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI13.f11345q = F8.j.b(hVar, feeType, str2);
                        PaymentUI paymentUI22 = newPaymentSwiftBankInfoFragment.f12834q0;
                        (paymentUI22 != null ? paymentUI22 : null).f11346r = F8.j.a(hVar, feeType, str2);
                        break;
                    case 1:
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment2 = this.f20812b;
                        b8.h T022 = newPaymentSwiftBankInfoFragment2.T0();
                        PaymentUI paymentUI32 = newPaymentSwiftBankInfoFragment2.f12834q0;
                        if (paymentUI32 == null) {
                            paymentUI32 = null;
                        }
                        String str22 = paymentUI32.f11352x;
                        if (str22 == null) {
                            str22 = "";
                        }
                        newPaymentSwiftBankInfoFragment2.f12835r0 = T022.m(str22);
                        newPaymentSwiftBankInfoFragment2.u0().f28942z.setText(newPaymentSwiftBankInfoFragment2.f12835r0);
                        break;
                    case 2:
                        s5.e eVar = (s5.e) obj;
                        String str3 = eVar.f26620d;
                        NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment3 = this.f20812b;
                        if (str3 != null) {
                            PaymentUI paymentUI42 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            if (paymentUI42 == null) {
                                paymentUI42 = null;
                            }
                            paymentUI42.f11337h = str3.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI52 = newPaymentSwiftBankInfoFragment3.f12834q0;
                        if (paymentUI52 == null) {
                            paymentUI52 = null;
                        }
                        paymentUI52.i = K3.a.a(eVar.f26620d);
                        newPaymentSwiftBankInfoFragment3.V0();
                        PaymentUI paymentUI62 = newPaymentSwiftBankInfoFragment3.f12834q0;
                        if (paymentUI62 == null) {
                            paymentUI62 = null;
                        }
                        String str4 = paymentUI62.f11337h;
                        B5.h value = newPaymentSwiftBankInfoFragment3.T0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI72 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            if (paymentUI72 == null) {
                                paymentUI72 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI72.f11345q = F8.j.b(value, feeType2, str4);
                            PaymentUI paymentUI82 = newPaymentSwiftBankInfoFragment3.f12834q0;
                            (paymentUI82 != null ? paymentUI82 : null).f11346r = F8.j.a(value, feeType2, str4);
                        }
                        break;
                    default:
                        this.f20812b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12831n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        u0().f28937u.setVisibility(0);
        t0(true);
        s0();
        o.b(u0().f28938v);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        o.b(u0().f28937u);
        u0().f28938v.setVisibility(0);
        p0(true);
        B0();
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = NewPaymentSwiftBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11334e = String.valueOf(charSequence);
            newPaymentSwiftBankInfoFragment.U0(String.valueOf(charSequence), false);
            newPaymentSwiftBankInfoFragment.V0();
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
            NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = NewPaymentSwiftBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11338j = String.valueOf(charSequence);
            newPaymentSwiftBankInfoFragment.V0();
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
            NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = NewPaymentSwiftBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11339k = String.valueOf(charSequence);
            newPaymentSwiftBankInfoFragment.V0();
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
            NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = NewPaymentSwiftBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11348t = String.valueOf(charSequence);
            newPaymentSwiftBankInfoFragment.V0();
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
            NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = NewPaymentSwiftBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11349u = String.valueOf(charSequence);
            newPaymentSwiftBankInfoFragment.V0();
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
            NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = NewPaymentSwiftBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11350v = String.valueOf(charSequence);
            newPaymentSwiftBankInfoFragment.V0();
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
            NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = NewPaymentSwiftBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11351w = String.valueOf(charSequence);
            newPaymentSwiftBankInfoFragment.V0();
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
            NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = NewPaymentSwiftBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11354z = String.valueOf(charSequence);
            newPaymentSwiftBankInfoFragment.V0();
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
            NewPaymentSwiftBankInfoFragment newPaymentSwiftBankInfoFragment = NewPaymentSwiftBankInfoFragment.this;
            PaymentUI paymentUI = newPaymentSwiftBankInfoFragment.f12834q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11329A = String.valueOf(charSequence);
            newPaymentSwiftBankInfoFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
