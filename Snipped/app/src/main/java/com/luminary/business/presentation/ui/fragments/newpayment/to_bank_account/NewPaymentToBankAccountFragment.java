package com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account;

import F8.i;
import F8.j;
import F8.o;
import Fa.h;
import O9.p;
import P9.s;
import U4.b;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.extensions.FeeType;
import com.luminary.mobile.R;
import g8.g;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0966k;
import ka.C0969n;
import ka.C0970o;
import kotlin.jvm.internal.f;
import t6.AbstractC1366j5;

/* compiled from: NewPaymentToBankAccountFragment.kt */
/* loaded from: classes2.dex */
public final class NewPaymentToBankAccountFragment extends BaseFragment<AbstractC1366j5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12889n0 = R.layout.fragment_new_payment_to_bank_account;

    /* renamed from: o0, reason: collision with root package name */
    public final h f12890o0 = new h(kotlin.jvm.internal.h.a(h8.h.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountFragment$special$$inlined$navArgs$1
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
    public final H1.a f12891p0;

    /* renamed from: q0, reason: collision with root package name */
    public PaymentUI f12892q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f12893r0;
    public final ArrayList s0;

    /* renamed from: t0, reason: collision with root package name */
    public Integer f12894t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f12895u0;

    /* renamed from: v0, reason: collision with root package name */
    public BankAccountDomain f12896v0;

    /* compiled from: NewPaymentToBankAccountFragment.kt */
    public static final class c implements TabLayout.d {
        public c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            PaymentUI paymentUI = NewPaymentToBankAccountFragment.this.f12892q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11342n = gVar != null ? Integer.valueOf(gVar.f9855d) : null;
        }
    }

    /* compiled from: NewPaymentToBankAccountFragment.kt */
    public static final class d implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12905a;

        public d(InterfaceC0646l interfaceC0646l) {
            this.f12905a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12905a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12905a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountFragment$special$$inlined$viewModel$default$1] */
    public NewPaymentToBankAccountFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12891p0 = E.a(this, kotlin.jvm.internal.h.a(b8.h.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(b8.h.class), null, null, b.l(this));
            }
        });
        this.f12893r0 = "eur";
        this.s0 = new ArrayList();
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

    public final h8.h T0() {
        return (h8.h) this.f12890o0.getValue();
    }

    public final b8.h U0() {
        return (b8.h) this.f12891p0.getValue();
    }

    public final void V0(int i) {
        BankAccountDomain bankAccountDomain;
        Integer num;
        String str;
        Integer g10;
        Object obj;
        List<BankAccountDomain> value = U0().f8469g1.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer num2 = ((BankAccountDomain) obj).f10694a;
                if (num2 != null && num2.intValue() == i) {
                    break;
                }
            }
            bankAccountDomain = (BankAccountDomain) obj;
        } else {
            bankAccountDomain = null;
        }
        this.f12896v0 = bankAccountDomain;
        if (bankAccountDomain != null && (g10 = F8.b.g(bankAccountDomain, requireContext())) != null) {
            u0().f29153w.setImageResource(g10.intValue());
        }
        u0().f29153w.setVisibility(0);
        u0().f29152v.setText(C0969n.u0(String.valueOf(u0().f29152v.getText())).toString());
        u0().f29151u.e();
        u0().f29145o.setEnabled(true);
        BankAccountDomain bankAccountDomain2 = this.f12896v0;
        this.f12893r0 = String.valueOf(bankAccountDomain2 != null ? bankAccountDomain2.f10701h : null);
        BankAccountDomain bankAccountDomain3 = this.f12896v0;
        if (bankAccountDomain3 != null) {
            AbstractC1366j5 u02 = u0();
            String e10 = F8.b.e(bankAccountDomain3);
            PaymentUI paymentUI = this.f12892q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            if (f.b(paymentUI.f11332c, BigDecimal.ZERO)) {
                str = null;
            } else {
                PaymentUI paymentUI2 = this.f12892q0;
                if (paymentUI2 == null) {
                    paymentUI2 = null;
                }
                str = paymentUI2.f11332c.toString();
            }
            u02.f29145o.c(e10, str);
        }
        BankAccountDomain bankAccountDomain4 = this.f12896v0;
        if (bankAccountDomain4 != null && (num = bankAccountDomain4.f10694a) != null) {
            int intValue = num.intValue();
            this.f12894t0 = Integer.valueOf(intValue);
            PaymentUI paymentUI3 = this.f12892q0;
            PaymentUI paymentUI4 = paymentUI3 == null ? null : paymentUI3;
            BankAccountDomain bankAccountDomain5 = this.f12896v0;
            paymentUI4.f11340l = bankAccountDomain5 != null ? bankAccountDomain5.i : null;
            if (paymentUI3 == null) {
                paymentUI3 = null;
            }
            paymentUI3.f11330a = String.valueOf(intValue);
            X0();
        }
        PaymentUI paymentUI5 = this.f12892q0;
        if (paymentUI5 == null) {
            paymentUI5 = null;
        }
        paymentUI5.i = K3.a.a(this.f12893r0);
        PaymentUI paymentUI6 = this.f12892q0;
        if (paymentUI6 == null) {
            paymentUI6 = null;
        }
        paymentUI6.f11337h = this.f12893r0;
        u0().f29146p.setVisibility(0);
        AbstractC1366j5 u03 = u0();
        String string = getString(R.string.available_balance_value, "");
        BankAccountDomain bankAccountDomain6 = this.f12896v0;
        u03.f29146p.setText(TextUtils.concat(string, bankAccountDomain6 != null ? F8.b.a(bankAccountDomain6, 13, 9) : ""));
        b8.h U02 = U0();
        PaymentUI paymentUI7 = this.f12892q0;
        if (paymentUI7 == null) {
            paymentUI7 = null;
        }
        String obj2 = paymentUI7.f11331b.toString();
        PaymentUI paymentUI8 = this.f12892q0;
        D7.d dVar = new D7.d(U02, obj2, (paymentUI8 == null ? null : paymentUI8).f11332c, (paymentUI8 != null ? paymentUI8 : null).f11337h);
        U02.f419K0 = dVar;
        dVar.invoke();
    }

    public final void W0() {
        if (this.f12895u0) {
            return;
        }
        this.f12895u0 = true;
        PaymentUI paymentUI = T0().f21219a;
        if (paymentUI != null) {
            AbstractC1366j5 u02 = u0();
            u02.f29154x.setText(paymentUI.f11336g);
            String C10 = D9.b.C(paymentUI.f11337h);
            PaymentUI paymentUI2 = this.f12892q0;
            String str = null;
            if (paymentUI2 == null) {
                paymentUI2 = null;
            }
            if (!f.b(paymentUI2.f11332c, BigDecimal.ZERO)) {
                PaymentUI paymentUI3 = this.f12892q0;
                str = (paymentUI3 != null ? paymentUI3 : null).f11332c.toString();
            }
            u02.f29145o.c(C10, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean X0() {
        /*
            r5 = this;
            F0.f r0 = r5.u0()
            t6.j5 r0 = (t6.AbstractC1366j5) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12892q0
            r2 = 0
            if (r1 != 0) goto Lc
            r1 = r2
        Lc:
            boolean r1 = r1.f()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L27
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12892q0
            if (r1 != 0) goto L19
            r1 = r2
        L19:
            java.math.BigDecimal r1 = r1.f11332c
            float r1 = r1.floatValue()
            boolean r1 = r5.Y0(r1)
            if (r1 == 0) goto L27
            r1 = r4
            goto L28
        L27:
            r1 = r3
        L28:
            android.widget.Button r0 = r0.f29147q
            r0.setEnabled(r1)
            F0.f r0 = r5.u0()
            t6.j5 r0 = (t6.AbstractC1366j5) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12892q0
            if (r1 != 0) goto L38
            r1 = r2
        L38:
            boolean r1 = r1.f()
            if (r1 == 0) goto L51
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12892q0
            if (r1 != 0) goto L43
            r1 = r2
        L43:
            java.math.BigDecimal r1 = r1.f11332c
            float r1 = r1.floatValue()
            boolean r1 = r5.Y0(r1)
            if (r1 == 0) goto L51
            r1 = r4
            goto L52
        L51:
            r1 = r3
        L52:
            android.widget.Button r0 = r0.f29148r
            r0.setEnabled(r1)
            com.luminary.business.presentation.entity.payment.PaymentUI r0 = r5.f12892q0
            if (r0 != 0) goto L5c
            goto L5d
        L5c:
            r2 = r0
        L5d:
            boolean r0 = r2.f()
            if (r0 == 0) goto L68
            java.lang.Integer r0 = r5.f12894t0
            if (r0 == 0) goto L68
            r3 = r4
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountFragment.X0():boolean");
    }

    public final boolean Y0(float f10) {
        BigDecimal bigDecimal;
        BankAccountDomain bankAccountDomain = this.f12896v0;
        float floatValue = (bankAccountDomain == null || (bigDecimal = bankAccountDomain.f10698e) == null) ? 0.0f : bigDecimal.floatValue();
        PaymentUI paymentUI = this.f12892q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        if (floatValue < f10 + paymentUI.f11345q) {
            u0().f29144n.setErrorWithoutFocus(getString(R.string.you_do_not_have_enough_money));
            return false;
        }
        u0().f29144n.setError(null);
        return true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentUI paymentUI = new PaymentUI(PaymentType.f11151e, BigDecimal.ZERO, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217696);
        this.f12892q0 = paymentUI;
        paymentUI.f11342n = 0;
        this.f11471m0 = U0();
        PaymentUI paymentUI2 = T0().f21219a;
        if (paymentUI2 != null) {
            PaymentUI paymentUI3 = this.f12892q0;
            (paymentUI3 == null ? null : paymentUI3).f11332c = paymentUI2.f11332c;
            (paymentUI3 == null ? null : paymentUI3).f11348t = paymentUI2.f11348t;
            (paymentUI3 == null ? null : paymentUI3).f11349u = paymentUI2.f11349u;
            (paymentUI3 == null ? null : paymentUI3).f11329A = paymentUI2.f11329A;
            (paymentUI3 == null ? null : paymentUI3).f11354z = paymentUI2.f11354z;
            (paymentUI3 == null ? null : paymentUI3).f11351w = paymentUI2.f11351w;
            (paymentUI3 == null ? null : paymentUI3).f11352x = paymentUI2.f11352x;
            (paymentUI3 == null ? null : paymentUI3).f11350v = paymentUI2.f11350v;
            (paymentUI3 == null ? null : paymentUI3).f11353y = paymentUI2.f11353y;
            (paymentUI3 == null ? null : paymentUI3).f11334e = paymentUI2.f11334e;
            (paymentUI3 == null ? null : paymentUI3).f11338j = paymentUI2.f11338j;
            if (paymentUI3 == null) {
                paymentUI3 = null;
            }
            paymentUI3.f11339k = paymentUI2.f11339k;
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        PaymentUI paymentUI = this.f12892q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        Integer num = paymentUI.f11342n;
        if (num != null) {
            int intValue = num.intValue();
            AbstractC1366j5 u02 = u0();
            u02.f29155y.k(u0().f29155y.h(intValue), true);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        c cVar = new c();
        U0().n(0);
        final int i = 0;
        U0().f8474l1.observe(getViewLifecycleOwner(), new d(new InterfaceC0646l(this) { // from class: h8.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountFragment f21216b;

            {
                this.f21216b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Integer num;
                String str;
                Object obj2;
                Integer num2;
                String str2;
                Integer num3;
                String str3;
                switch (i) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentToBankAccountFragment newPaymentToBankAccountFragment = this.f21216b;
                        PaymentUI paymentUI = newPaymentToBankAccountFragment.f12892q0;
                        String str4 = (paymentUI == null ? null : paymentUI).f11337h;
                        if (paymentUI == null) {
                            paymentUI = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI.f11345q = j.b(hVar, feeType, str4);
                        PaymentUI paymentUI2 = newPaymentToBankAccountFragment.f12892q0;
                        (paymentUI2 != null ? paymentUI2 : null).f11346r = j.a(hVar, feeType, str4);
                        break;
                    case 1:
                        NewPaymentToBankAccountFragment newPaymentToBankAccountFragment2 = this.f21216b;
                        newPaymentToBankAccountFragment2.s0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentToBankAccountFragment2.s0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    newPaymentToBankAccountFragment2.u0().f29152v.setText(C0969n.u0(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a).toString());
                                    newPaymentToBankAccountFragment2.u0().f29151u.e();
                                    StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    if (aVar != null && (num3 = aVar.f13059h) != null) {
                                        newPaymentToBankAccountFragment2.V0(num3.intValue());
                                    }
                                    newPaymentToBankAccountFragment2.u0().f29153w.setVisibility(0);
                                    newPaymentToBankAccountFragment2.W0();
                                } else {
                                    if (newPaymentToBankAccountFragment2.T0().f21219a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            str = null;
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (kotlin.jvm.internal.f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentToBankAccountFragment2.T0().f21219a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) obj2;
                                        AbstractC1366j5 u02 = newPaymentToBankAccountFragment2.u0();
                                        if (aVar2 != null && (str2 = aVar2.f13052a) != null) {
                                            str = C0969n.u0(str2).toString();
                                        }
                                        u02.f29152v.setText(str);
                                        if (aVar2 != null && (num2 = aVar2.f13059h) != null) {
                                            newPaymentToBankAccountFragment2.V0(num2.intValue());
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentToBankAccountFragment2.f12896v0;
                                        if (bankAccountDomain != null && (num = bankAccountDomain.f10694a) != null) {
                                            newPaymentToBankAccountFragment2.V0(num.intValue());
                                        }
                                    }
                                    newPaymentToBankAccountFragment2.W0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str5 = bankAccountDomain2.i;
                                String str6 = str5 == null ? "" : str5;
                                String str7 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str6, D9.b.D(str7), str7 == null ? "" : str7, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, bankAccountDomain2.f10701h, bankAccountDomain2.f10694a, false, 288));
                            }
                        }
                        break;
                    default:
                        s5.e eVar = (s5.e) obj;
                        String str8 = eVar.f26620d;
                        NewPaymentToBankAccountFragment newPaymentToBankAccountFragment3 = this.f21216b;
                        if (str8 != null) {
                            PaymentUI paymentUI3 = newPaymentToBankAccountFragment3.f12892q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            paymentUI3.f11337h = str8.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI4 = newPaymentToBankAccountFragment3.f12892q0;
                        if (paymentUI4 == null) {
                            paymentUI4 = null;
                        }
                        String str9 = eVar.f26620d;
                        paymentUI4.i = K3.a.a(str9);
                        newPaymentToBankAccountFragment3.u0().f29145o.setEnabled(true);
                        if (str9 != null) {
                            String C10 = D9.b.C(str9);
                            AbstractC1366j5 u03 = newPaymentToBankAccountFragment3.u0();
                            PaymentUI paymentUI5 = newPaymentToBankAccountFragment3.f12892q0;
                            if (paymentUI5 == null) {
                                paymentUI5 = null;
                            }
                            if (kotlin.jvm.internal.f.b(paymentUI5.f11332c, BigDecimal.ZERO)) {
                                str3 = null;
                            } else {
                                PaymentUI paymentUI6 = newPaymentToBankAccountFragment3.f12892q0;
                                if (paymentUI6 == null) {
                                    paymentUI6 = null;
                                }
                                str3 = paymentUI6.f11332c.toString();
                            }
                            u03.f29145o.c(C10, str3);
                        }
                        newPaymentToBankAccountFragment3.X0();
                        PaymentUI paymentUI7 = newPaymentToBankAccountFragment3.f12892q0;
                        if (paymentUI7 == null) {
                            paymentUI7 = null;
                        }
                        String str10 = paymentUI7.f11337h;
                        B5.h value = newPaymentToBankAccountFragment3.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI8 = newPaymentToBankAccountFragment3.f12892q0;
                            if (paymentUI8 == null) {
                                paymentUI8 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI8.f11345q = j.b(value, feeType2, str10);
                            PaymentUI paymentUI9 = newPaymentToBankAccountFragment3.f12892q0;
                            (paymentUI9 != null ? paymentUI9 : null).f11346r = j.a(value, feeType2, str10);
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        AbstractC1366j5 u02 = u0();
        u02.f29153w.setImageResource(0);
        u02.f29154x.addTextChangedListener(new a());
        CustomTextInputEditText customTextInputEditText = u02.f29145o;
        customTextInputEditText.setEnabled(false);
        customTextInputEditText.addTextChangedListener(new b());
        o.c(u02.f29147q, 500L, new g(this, 3));
        o.c(u02.f29148r, 500L, new g(u02, 4));
        PaymentUI paymentUI = this.f12892q0;
        String str = (paymentUI == null ? null : paymentUI).i;
        if (str == null) {
            str = "";
        }
        if (paymentUI == null) {
            paymentUI = null;
        }
        customTextInputEditText.c(str, paymentUI.f11332c.toString());
        o.c(u02.f29152v, 500L, new A7.c(17, this, u02));
        u02.f29155y.a(cVar);
        final int i9 = 1;
        U0().f8469g1.observe(getViewLifecycleOwner(), new d(new InterfaceC0646l(this) { // from class: h8.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountFragment f21216b;

            {
                this.f21216b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Integer num;
                String str2;
                Object obj2;
                Integer num2;
                String str22;
                Integer num3;
                String str3;
                switch (i9) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentToBankAccountFragment newPaymentToBankAccountFragment = this.f21216b;
                        PaymentUI paymentUI2 = newPaymentToBankAccountFragment.f12892q0;
                        String str4 = (paymentUI2 == null ? null : paymentUI2).f11337h;
                        if (paymentUI2 == null) {
                            paymentUI2 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI2.f11345q = j.b(hVar, feeType, str4);
                        PaymentUI paymentUI22 = newPaymentToBankAccountFragment.f12892q0;
                        (paymentUI22 != null ? paymentUI22 : null).f11346r = j.a(hVar, feeType, str4);
                        break;
                    case 1:
                        NewPaymentToBankAccountFragment newPaymentToBankAccountFragment2 = this.f21216b;
                        newPaymentToBankAccountFragment2.s0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentToBankAccountFragment2.s0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    newPaymentToBankAccountFragment2.u0().f29152v.setText(C0969n.u0(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a).toString());
                                    newPaymentToBankAccountFragment2.u0().f29151u.e();
                                    StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    if (aVar != null && (num3 = aVar.f13059h) != null) {
                                        newPaymentToBankAccountFragment2.V0(num3.intValue());
                                    }
                                    newPaymentToBankAccountFragment2.u0().f29153w.setVisibility(0);
                                    newPaymentToBankAccountFragment2.W0();
                                } else {
                                    if (newPaymentToBankAccountFragment2.T0().f21219a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            str2 = null;
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (kotlin.jvm.internal.f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentToBankAccountFragment2.T0().f21219a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) obj2;
                                        AbstractC1366j5 u022 = newPaymentToBankAccountFragment2.u0();
                                        if (aVar2 != null && (str22 = aVar2.f13052a) != null) {
                                            str2 = C0969n.u0(str22).toString();
                                        }
                                        u022.f29152v.setText(str2);
                                        if (aVar2 != null && (num2 = aVar2.f13059h) != null) {
                                            newPaymentToBankAccountFragment2.V0(num2.intValue());
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentToBankAccountFragment2.f12896v0;
                                        if (bankAccountDomain != null && (num = bankAccountDomain.f10694a) != null) {
                                            newPaymentToBankAccountFragment2.V0(num.intValue());
                                        }
                                    }
                                    newPaymentToBankAccountFragment2.W0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str5 = bankAccountDomain2.i;
                                String str6 = str5 == null ? "" : str5;
                                String str7 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str6, D9.b.D(str7), str7 == null ? "" : str7, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, bankAccountDomain2.f10701h, bankAccountDomain2.f10694a, false, 288));
                            }
                        }
                        break;
                    default:
                        s5.e eVar = (s5.e) obj;
                        String str8 = eVar.f26620d;
                        NewPaymentToBankAccountFragment newPaymentToBankAccountFragment3 = this.f21216b;
                        if (str8 != null) {
                            PaymentUI paymentUI3 = newPaymentToBankAccountFragment3.f12892q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            paymentUI3.f11337h = str8.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI4 = newPaymentToBankAccountFragment3.f12892q0;
                        if (paymentUI4 == null) {
                            paymentUI4 = null;
                        }
                        String str9 = eVar.f26620d;
                        paymentUI4.i = K3.a.a(str9);
                        newPaymentToBankAccountFragment3.u0().f29145o.setEnabled(true);
                        if (str9 != null) {
                            String C10 = D9.b.C(str9);
                            AbstractC1366j5 u03 = newPaymentToBankAccountFragment3.u0();
                            PaymentUI paymentUI5 = newPaymentToBankAccountFragment3.f12892q0;
                            if (paymentUI5 == null) {
                                paymentUI5 = null;
                            }
                            if (kotlin.jvm.internal.f.b(paymentUI5.f11332c, BigDecimal.ZERO)) {
                                str3 = null;
                            } else {
                                PaymentUI paymentUI6 = newPaymentToBankAccountFragment3.f12892q0;
                                if (paymentUI6 == null) {
                                    paymentUI6 = null;
                                }
                                str3 = paymentUI6.f11332c.toString();
                            }
                            u03.f29145o.c(C10, str3);
                        }
                        newPaymentToBankAccountFragment3.X0();
                        PaymentUI paymentUI7 = newPaymentToBankAccountFragment3.f12892q0;
                        if (paymentUI7 == null) {
                            paymentUI7 = null;
                        }
                        String str10 = paymentUI7.f11337h;
                        B5.h value = newPaymentToBankAccountFragment3.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI8 = newPaymentToBankAccountFragment3.f12892q0;
                            if (paymentUI8 == null) {
                                paymentUI8 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI8.f11345q = j.b(value, feeType2, str10);
                            PaymentUI paymentUI9 = newPaymentToBankAccountFragment3.f12892q0;
                            (paymentUI9 != null ? paymentUI9 : null).f11346r = j.a(value, feeType2, str10);
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 2;
        U0().f8472j1.observe(getViewLifecycleOwner(), new d(new InterfaceC0646l(this) { // from class: h8.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountFragment f21216b;

            {
                this.f21216b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Integer num;
                String str2;
                Object obj2;
                Integer num2;
                String str22;
                Integer num3;
                String str3;
                switch (i10) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentToBankAccountFragment newPaymentToBankAccountFragment = this.f21216b;
                        PaymentUI paymentUI2 = newPaymentToBankAccountFragment.f12892q0;
                        String str4 = (paymentUI2 == null ? null : paymentUI2).f11337h;
                        if (paymentUI2 == null) {
                            paymentUI2 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI2.f11345q = j.b(hVar, feeType, str4);
                        PaymentUI paymentUI22 = newPaymentToBankAccountFragment.f12892q0;
                        (paymentUI22 != null ? paymentUI22 : null).f11346r = j.a(hVar, feeType, str4);
                        break;
                    case 1:
                        NewPaymentToBankAccountFragment newPaymentToBankAccountFragment2 = this.f21216b;
                        newPaymentToBankAccountFragment2.s0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentToBankAccountFragment2.s0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    newPaymentToBankAccountFragment2.u0().f29152v.setText(C0969n.u0(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a).toString());
                                    newPaymentToBankAccountFragment2.u0().f29151u.e();
                                    StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) s.L(arrayList2);
                                    if (aVar != null && (num3 = aVar.f13059h) != null) {
                                        newPaymentToBankAccountFragment2.V0(num3.intValue());
                                    }
                                    newPaymentToBankAccountFragment2.u0().f29153w.setVisibility(0);
                                    newPaymentToBankAccountFragment2.W0();
                                } else {
                                    if (newPaymentToBankAccountFragment2.T0().f21219a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            str2 = null;
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (kotlin.jvm.internal.f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentToBankAccountFragment2.T0().f21219a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar2 = (StatementsSelectorDialog.a) obj2;
                                        AbstractC1366j5 u022 = newPaymentToBankAccountFragment2.u0();
                                        if (aVar2 != null && (str22 = aVar2.f13052a) != null) {
                                            str2 = C0969n.u0(str22).toString();
                                        }
                                        u022.f29152v.setText(str2);
                                        if (aVar2 != null && (num2 = aVar2.f13059h) != null) {
                                            newPaymentToBankAccountFragment2.V0(num2.intValue());
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentToBankAccountFragment2.f12896v0;
                                        if (bankAccountDomain != null && (num = bankAccountDomain.f10694a) != null) {
                                            newPaymentToBankAccountFragment2.V0(num.intValue());
                                        }
                                    }
                                    newPaymentToBankAccountFragment2.W0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str5 = bankAccountDomain2.i;
                                String str6 = str5 == null ? "" : str5;
                                String str7 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str6, D9.b.D(str7), str7 == null ? "" : str7, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, bankAccountDomain2.f10701h, bankAccountDomain2.f10694a, false, 288));
                            }
                        }
                        break;
                    default:
                        s5.e eVar = (s5.e) obj;
                        String str8 = eVar.f26620d;
                        NewPaymentToBankAccountFragment newPaymentToBankAccountFragment3 = this.f21216b;
                        if (str8 != null) {
                            PaymentUI paymentUI3 = newPaymentToBankAccountFragment3.f12892q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            paymentUI3.f11337h = str8.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI4 = newPaymentToBankAccountFragment3.f12892q0;
                        if (paymentUI4 == null) {
                            paymentUI4 = null;
                        }
                        String str9 = eVar.f26620d;
                        paymentUI4.i = K3.a.a(str9);
                        newPaymentToBankAccountFragment3.u0().f29145o.setEnabled(true);
                        if (str9 != null) {
                            String C10 = D9.b.C(str9);
                            AbstractC1366j5 u03 = newPaymentToBankAccountFragment3.u0();
                            PaymentUI paymentUI5 = newPaymentToBankAccountFragment3.f12892q0;
                            if (paymentUI5 == null) {
                                paymentUI5 = null;
                            }
                            if (kotlin.jvm.internal.f.b(paymentUI5.f11332c, BigDecimal.ZERO)) {
                                str3 = null;
                            } else {
                                PaymentUI paymentUI6 = newPaymentToBankAccountFragment3.f12892q0;
                                if (paymentUI6 == null) {
                                    paymentUI6 = null;
                                }
                                str3 = paymentUI6.f11332c.toString();
                            }
                            u03.f29145o.c(C10, str3);
                        }
                        newPaymentToBankAccountFragment3.X0();
                        PaymentUI paymentUI7 = newPaymentToBankAccountFragment3.f12892q0;
                        if (paymentUI7 == null) {
                            paymentUI7 = null;
                        }
                        String str10 = paymentUI7.f11337h;
                        B5.h value = newPaymentToBankAccountFragment3.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI8 = newPaymentToBankAccountFragment3.f12892q0;
                            if (paymentUI8 == null) {
                                paymentUI8 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI8.f11345q = j.b(value, feeType2, str10);
                            PaymentUI paymentUI9 = newPaymentToBankAccountFragment3.f12892q0;
                            (paymentUI9 != null ? paymentUI9 : null).f11346r = j.a(value, feeType2, str10);
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i11 = 0;
        E.b(this, "ACCOUNT", new InterfaceC0650p(this) { // from class: h8.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountFragment f21218b;

            {
                this.f21218b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                String str2;
                Object obj3;
                String str3;
                Bundle bundle2 = (Bundle) obj2;
                switch (i11) {
                    case 0:
                        String string = bundle2.getString("ACCOUNT");
                        if (string != null) {
                            NewPaymentToBankAccountFragment newPaymentToBankAccountFragment = this.f21218b;
                            List<BankAccountDomain> value = newPaymentToBankAccountFragment.U0().f8469g1.getValue();
                            if (value != null) {
                                Iterator<T> it = value.iterator();
                                while (true) {
                                    str2 = null;
                                    if (it.hasNext()) {
                                        obj3 = it.next();
                                        if (kotlin.jvm.internal.f.b(((BankAccountDomain) obj3).f10700g, string)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                BankAccountDomain bankAccountDomain = (BankAccountDomain) obj3;
                                if (bankAccountDomain != null) {
                                    newPaymentToBankAccountFragment.u0().f29145o.setEnabled(true);
                                    String str4 = bankAccountDomain.f10701h;
                                    if (str4 != null) {
                                        newPaymentToBankAccountFragment.f12893r0 = str4;
                                        AbstractC1366j5 u03 = newPaymentToBankAccountFragment.u0();
                                        String a10 = K3.a.a(str4);
                                        PaymentUI paymentUI2 = newPaymentToBankAccountFragment.f12892q0;
                                        if (paymentUI2 == null) {
                                            paymentUI2 = null;
                                        }
                                        if (kotlin.jvm.internal.f.b(paymentUI2.f11332c, BigDecimal.ZERO)) {
                                            str3 = null;
                                        } else {
                                            PaymentUI paymentUI3 = newPaymentToBankAccountFragment.f12892q0;
                                            if (paymentUI3 == null) {
                                                paymentUI3 = null;
                                            }
                                            str3 = paymentUI3.f11332c.toString();
                                        }
                                        u03.f29145o.c(a10, str3);
                                        PaymentUI paymentUI4 = newPaymentToBankAccountFragment.f12892q0;
                                        if (paymentUI4 == null) {
                                            paymentUI4 = null;
                                        }
                                        paymentUI4.f11337h = str4;
                                    }
                                    String str5 = bankAccountDomain.i;
                                    if (str5 != null) {
                                        PaymentUI paymentUI5 = newPaymentToBankAccountFragment.f12892q0;
                                        if (paymentUI5 == null) {
                                            paymentUI5 = null;
                                        }
                                        paymentUI5.f11340l = C0969n.u0(str5).toString();
                                    }
                                    PaymentUI paymentUI6 = newPaymentToBankAccountFragment.f12892q0;
                                    if (paymentUI6 == null) {
                                        paymentUI6 = null;
                                    }
                                    paymentUI6.f11330a = String.valueOf(bankAccountDomain.f10694a);
                                    AbstractC1366j5 u04 = newPaymentToBankAccountFragment.u0();
                                    if (str5 != null) {
                                        if (str5.length() > 32) {
                                            str5 = C0970o.z0(32, str5).concat("...");
                                        }
                                        str2 = str5;
                                    }
                                    u04.f29152v.setText(str2);
                                    Integer g10 = F8.b.g(bankAccountDomain, newPaymentToBankAccountFragment.requireContext());
                                    if (g10 != null) {
                                        newPaymentToBankAccountFragment.u0().f29153w.setImageResource(g10.intValue());
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        NewPaymentToBankAccountFragment newPaymentToBankAccountFragment2 = this.f21218b;
                        newPaymentToBankAccountFragment2.u0().f29153w.setImageResource(0);
                        newPaymentToBankAccountFragment2.u0().f29145o.setEnabled(false);
                        break;
                }
                return p.f3034a;
            }
        });
        final int i12 = 1;
        E.b(this, "EMPTY_BACK", new InterfaceC0650p(this) { // from class: h8.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentToBankAccountFragment f21218b;

            {
                this.f21218b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                String str2;
                Object obj3;
                String str3;
                Bundle bundle2 = (Bundle) obj2;
                switch (i12) {
                    case 0:
                        String string = bundle2.getString("ACCOUNT");
                        if (string != null) {
                            NewPaymentToBankAccountFragment newPaymentToBankAccountFragment = this.f21218b;
                            List<BankAccountDomain> value = newPaymentToBankAccountFragment.U0().f8469g1.getValue();
                            if (value != null) {
                                Iterator<T> it = value.iterator();
                                while (true) {
                                    str2 = null;
                                    if (it.hasNext()) {
                                        obj3 = it.next();
                                        if (kotlin.jvm.internal.f.b(((BankAccountDomain) obj3).f10700g, string)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                BankAccountDomain bankAccountDomain = (BankAccountDomain) obj3;
                                if (bankAccountDomain != null) {
                                    newPaymentToBankAccountFragment.u0().f29145o.setEnabled(true);
                                    String str4 = bankAccountDomain.f10701h;
                                    if (str4 != null) {
                                        newPaymentToBankAccountFragment.f12893r0 = str4;
                                        AbstractC1366j5 u03 = newPaymentToBankAccountFragment.u0();
                                        String a10 = K3.a.a(str4);
                                        PaymentUI paymentUI2 = newPaymentToBankAccountFragment.f12892q0;
                                        if (paymentUI2 == null) {
                                            paymentUI2 = null;
                                        }
                                        if (kotlin.jvm.internal.f.b(paymentUI2.f11332c, BigDecimal.ZERO)) {
                                            str3 = null;
                                        } else {
                                            PaymentUI paymentUI3 = newPaymentToBankAccountFragment.f12892q0;
                                            if (paymentUI3 == null) {
                                                paymentUI3 = null;
                                            }
                                            str3 = paymentUI3.f11332c.toString();
                                        }
                                        u03.f29145o.c(a10, str3);
                                        PaymentUI paymentUI4 = newPaymentToBankAccountFragment.f12892q0;
                                        if (paymentUI4 == null) {
                                            paymentUI4 = null;
                                        }
                                        paymentUI4.f11337h = str4;
                                    }
                                    String str5 = bankAccountDomain.i;
                                    if (str5 != null) {
                                        PaymentUI paymentUI5 = newPaymentToBankAccountFragment.f12892q0;
                                        if (paymentUI5 == null) {
                                            paymentUI5 = null;
                                        }
                                        paymentUI5.f11340l = C0969n.u0(str5).toString();
                                    }
                                    PaymentUI paymentUI6 = newPaymentToBankAccountFragment.f12892q0;
                                    if (paymentUI6 == null) {
                                        paymentUI6 = null;
                                    }
                                    paymentUI6.f11330a = String.valueOf(bankAccountDomain.f10694a);
                                    AbstractC1366j5 u04 = newPaymentToBankAccountFragment.u0();
                                    if (str5 != null) {
                                        if (str5.length() > 32) {
                                            str5 = C0970o.z0(32, str5).concat("...");
                                        }
                                        str2 = str5;
                                    }
                                    u04.f29152v.setText(str2);
                                    Integer g10 = F8.b.g(bankAccountDomain, newPaymentToBankAccountFragment.requireContext());
                                    if (g10 != null) {
                                        newPaymentToBankAccountFragment.u0().f29153w.setImageResource(g10.intValue());
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        NewPaymentToBankAccountFragment newPaymentToBankAccountFragment2 = this.f21218b;
                        newPaymentToBankAccountFragment2.u0().f29153w.setImageResource(0);
                        newPaymentToBankAccountFragment2.u0().f29145o.setEnabled(false);
                        break;
                }
                return p.f3034a;
            }
        });
        U0().n1.observe(getViewLifecycleOwner(), new i(new G7.c(this, 2)));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12889n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        u0().f29147q.setVisibility(0);
        t0(true);
        s0();
        o.b(u0().f29148r);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        o.b(u0().f29147q);
        u0().f29148r.setVisibility(0);
        p0(true);
        B0();
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentToBankAccountFragment newPaymentToBankAccountFragment = NewPaymentToBankAccountFragment.this;
            PaymentUI paymentUI = newPaymentToBankAccountFragment.f12892q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11336g = String.valueOf(charSequence);
            newPaymentToBankAccountFragment.X0();
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
            NewPaymentToBankAccountFragment newPaymentToBankAccountFragment = NewPaymentToBankAccountFragment.this;
            PaymentUI paymentUI = newPaymentToBankAccountFragment.f12892q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            BigDecimal Q4 = C0966k.Q(D9.b.r0(String.valueOf(newPaymentToBankAccountFragment.u0().f29145o.getText())));
            if (Q4 == null) {
                Q4 = BigDecimal.ZERO;
            }
            paymentUI.f11332c = Q4;
            newPaymentToBankAccountFragment.X0();
            PaymentUI paymentUI2 = newPaymentToBankAccountFragment.f12892q0;
            newPaymentToBankAccountFragment.Y0((paymentUI2 != null ? paymentUI2 : null).f11332c.floatValue());
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
