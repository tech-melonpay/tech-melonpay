package com.luminary.business.presentation.ui.fragments.newpayment.swift;

import F8.o;
import Fa.h;
import O9.p;
import P9.s;
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
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.extensions.FeeType;
import com.luminary.mobile.R;
import g8.g;
import g8.i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0966k;
import ka.C0969n;
import ka.C0970o;
import kotlin.jvm.internal.f;
import t6.AbstractC1334f5;

/* compiled from: NewPaymentSwiftFragment.kt */
/* loaded from: classes2.dex */
public final class NewPaymentSwiftFragment extends BaseFragment<AbstractC1334f5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12851n0 = R.layout.fragment_new_payment_swift;

    /* renamed from: o0, reason: collision with root package name */
    public final h f12852o0 = new h(kotlin.jvm.internal.h.a(i.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftFragment$special$$inlined$navArgs$1
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
    public final H1.a f12853p0;

    /* renamed from: q0, reason: collision with root package name */
    public PaymentUI f12854q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f12855r0;
    public final ArrayList s0;

    /* renamed from: t0, reason: collision with root package name */
    public Integer f12856t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f12857u0;

    /* renamed from: v0, reason: collision with root package name */
    public BankAccountDomain f12858v0;

    /* compiled from: NewPaymentSwiftFragment.kt */
    public static final class c implements TabLayout.d {
        public c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            PaymentUI paymentUI = NewPaymentSwiftFragment.this.f12854q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11342n = gVar != null ? Integer.valueOf(gVar.f9855d) : null;
        }
    }

    /* compiled from: NewPaymentSwiftFragment.kt */
    public static final class d implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12867a;

        public d(InterfaceC0646l interfaceC0646l) {
            this.f12867a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12867a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12867a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftFragment$special$$inlined$viewModel$default$1] */
    public NewPaymentSwiftFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12853p0 = E.a(this, kotlin.jvm.internal.h.a(b8.h.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(b8.h.class), null, null, b.l(this));
            }
        });
        this.f12855r0 = "eur";
        this.s0 = new ArrayList();
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

    public final i T0() {
        return (i) this.f12852o0.getValue();
    }

    public final b8.h U0() {
        return (b8.h) this.f12853p0.getValue();
    }

    public final void V0(String str) {
        BankAccountDomain bankAccountDomain;
        String c2;
        Integer num;
        String str2;
        Integer g10;
        Object obj;
        List<BankAccountDomain> value = U0().f8469g1.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (f.b(((BankAccountDomain) obj).i, str)) {
                        break;
                    }
                }
            }
            bankAccountDomain = (BankAccountDomain) obj;
        } else {
            bankAccountDomain = null;
        }
        this.f12858v0 = bankAccountDomain;
        if (bankAccountDomain != null && (g10 = F8.b.g(bankAccountDomain, requireContext())) != null) {
            u0().f29005v.setImageResource(g10.intValue());
        }
        u0().f29005v.setVisibility(0);
        u0().f29004u.setText(C0969n.u0(String.valueOf(u0().f29004u.getText())).toString());
        u0().f29003t.e();
        u0().f28998o.setEnabled(true);
        BankAccountDomain bankAccountDomain2 = this.f12858v0;
        this.f12855r0 = String.valueOf(bankAccountDomain2 != null ? bankAccountDomain2.f10701h : null);
        BankAccountDomain bankAccountDomain3 = this.f12858v0;
        if (bankAccountDomain3 != null) {
            AbstractC1334f5 u02 = u0();
            String a10 = K3.a.a(bankAccountDomain3.f10701h);
            PaymentUI paymentUI = this.f12854q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            if (f.b(paymentUI.f11332c, BigDecimal.ZERO)) {
                str2 = null;
            } else {
                PaymentUI paymentUI2 = this.f12854q0;
                if (paymentUI2 == null) {
                    paymentUI2 = null;
                }
                str2 = paymentUI2.f11332c.toString();
            }
            u02.f28998o.c(a10, str2);
        }
        BankAccountDomain bankAccountDomain4 = this.f12858v0;
        if (bankAccountDomain4 != null && (num = bankAccountDomain4.f10694a) != null) {
            this.f12856t0 = Integer.valueOf(num.intValue());
            PaymentUI paymentUI3 = this.f12854q0;
            if (paymentUI3 == null) {
                paymentUI3 = null;
            }
            paymentUI3.f11340l = C0969n.u0(str).toString();
            X0();
        }
        PaymentUI paymentUI4 = this.f12854q0;
        if (paymentUI4 == null) {
            paymentUI4 = null;
        }
        paymentUI4.i = K3.a.a(this.f12855r0);
        PaymentUI paymentUI5 = this.f12854q0;
        (paymentUI5 != null ? paymentUI5 : null).f11337h = this.f12855r0;
        u0().f29000q.setVisibility(0);
        u0().f28999p.setVisibility(0);
        AbstractC1334f5 u03 = u0();
        BankAccountDomain bankAccountDomain5 = this.f12858v0;
        String str3 = "";
        u03.f28999p.setText(getString(R.string.available_balance_value, bankAccountDomain5 != null ? F8.b.b(bankAccountDomain5) : ""));
        AbstractC1334f5 u04 = u0();
        BankAccountDomain bankAccountDomain6 = this.f12858v0;
        if (bankAccountDomain6 != null && (c2 = F8.b.c(bankAccountDomain6)) != null) {
            str3 = c2;
        }
        u04.f29000q.setText(str3);
    }

    public final void W0() {
        if (this.f12857u0) {
            return;
        }
        this.f12857u0 = true;
        PaymentUI paymentUI = T0().f20831a;
        if (paymentUI != null) {
            AbstractC1334f5 u02 = u0();
            u02.f29006w.setText(paymentUI.f11336g);
            String str = paymentUI.i;
            if (str == null) {
                str = "";
            }
            PaymentUI paymentUI2 = this.f12854q0;
            String str2 = null;
            if (paymentUI2 == null) {
                paymentUI2 = null;
            }
            if (!f.b(paymentUI2.f11332c, BigDecimal.ZERO)) {
                PaymentUI paymentUI3 = this.f12854q0;
                str2 = (paymentUI3 != null ? paymentUI3 : null).f11332c.toString();
            }
            u02.f28998o.c(str, str2);
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
            t6.f5 r0 = (t6.AbstractC1334f5) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12854q0
            r2 = 0
            if (r1 != 0) goto Lc
            r1 = r2
        Lc:
            boolean r1 = r1.f()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L27
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12854q0
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
            android.widget.Button r0 = r0.f29001r
            r0.setEnabled(r1)
            F0.f r0 = r5.u0()
            t6.f5 r0 = (t6.AbstractC1334f5) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12854q0
            if (r1 != 0) goto L38
            r1 = r2
        L38:
            boolean r1 = r1.f()
            if (r1 == 0) goto L51
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12854q0
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
            android.widget.Button r0 = r0.f29002s
            r0.setEnabled(r1)
            com.luminary.business.presentation.entity.payment.PaymentUI r0 = r5.f12854q0
            if (r0 != 0) goto L5c
            goto L5d
        L5c:
            r2 = r0
        L5d:
            boolean r0 = r2.f()
            if (r0 == 0) goto L68
            java.lang.Integer r0 = r5.f12856t0
            if (r0 == 0) goto L68
            r3 = r4
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.newpayment.swift.NewPaymentSwiftFragment.X0():boolean");
    }

    public final boolean Y0(float f10) {
        BigDecimal bigDecimal;
        BankAccountDomain bankAccountDomain = this.f12858v0;
        if (((bankAccountDomain == null || (bigDecimal = bankAccountDomain.f10698e) == null) ? 0.0f : bigDecimal.floatValue()) < f10) {
            u0().f28997n.setErrorWithoutFocus(getString(R.string.you_do_not_have_enough_money));
            return false;
        }
        u0().f28997n.setError(null);
        return true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentUI paymentUI = new PaymentUI(PaymentType.f11150d, BigDecimal.ZERO, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217696);
        this.f12854q0 = paymentUI;
        paymentUI.f11342n = 0;
        this.f11471m0 = U0();
        PaymentUI paymentUI2 = T0().f20831a;
        if (paymentUI2 != null) {
            PaymentUI paymentUI3 = this.f12854q0;
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
        PaymentUI paymentUI = this.f12854q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        Integer num = paymentUI.f11342n;
        if (num != null) {
            int intValue = num.intValue();
            AbstractC1334f5 u02 = u0();
            u02.f29007x.k(u0().f29007x.h(intValue), true);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        c cVar = new c();
        U0().n(0);
        final int i = 0;
        U0().f8474l1.observe(getViewLifecycleOwner(), new d(new InterfaceC0646l(this) { // from class: g8.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentSwiftFragment f20826b;

            {
                this.f20826b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                Object obj2;
                String str3;
                String str4;
                switch (i) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentSwiftFragment newPaymentSwiftFragment = this.f20826b;
                        PaymentUI paymentUI = newPaymentSwiftFragment.f12854q0;
                        String str5 = (paymentUI == null ? null : paymentUI).f11337h;
                        if (paymentUI == null) {
                            paymentUI = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI.f11345q = F8.j.b(hVar, feeType, str5);
                        PaymentUI paymentUI2 = newPaymentSwiftFragment.f12854q0;
                        (paymentUI2 != null ? paymentUI2 : null).f11346r = F8.j.a(hVar, feeType, str5);
                        break;
                    case 1:
                        NewPaymentSwiftFragment newPaymentSwiftFragment2 = this.f20826b;
                        newPaymentSwiftFragment2.s0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentSwiftFragment2.s0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    newPaymentSwiftFragment2.u0().f29004u.setText(C0969n.u0(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a).toString());
                                    newPaymentSwiftFragment2.u0().f29003t.e();
                                    newPaymentSwiftFragment2.V0(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a);
                                    newPaymentSwiftFragment2.u0().f29005v.setVisibility(0);
                                    newPaymentSwiftFragment2.W0();
                                } else {
                                    if (newPaymentSwiftFragment2.T0().f20831a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            str2 = null;
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (kotlin.jvm.internal.f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentSwiftFragment2.T0().f20831a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) obj2;
                                        AbstractC1334f5 u02 = newPaymentSwiftFragment2.u0();
                                        if (aVar != null && (str3 = aVar.f13052a) != null) {
                                            str2 = C0969n.u0(str3).toString();
                                        }
                                        u02.f29004u.setText(str2);
                                        if (aVar != null) {
                                            newPaymentSwiftFragment2.V0(aVar.f13052a);
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentSwiftFragment2.f12858v0;
                                        if (bankAccountDomain != null && (str = bankAccountDomain.i) != null) {
                                            newPaymentSwiftFragment2.V0(str);
                                        }
                                    }
                                    newPaymentSwiftFragment2.W0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str6 = bankAccountDomain2.i;
                                String str7 = str6 == null ? "" : str6;
                                String str8 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str7, D9.b.D(str8), str8 == null ? "" : str8, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, null, null, false, 480));
                            }
                        }
                        break;
                    default:
                        s5.e eVar = (s5.e) obj;
                        String str9 = eVar.f26620d;
                        NewPaymentSwiftFragment newPaymentSwiftFragment3 = this.f20826b;
                        if (str9 != null) {
                            PaymentUI paymentUI3 = newPaymentSwiftFragment3.f12854q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            paymentUI3.f11337h = str9.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI4 = newPaymentSwiftFragment3.f12854q0;
                        if (paymentUI4 == null) {
                            paymentUI4 = null;
                        }
                        String str10 = eVar.f26620d;
                        paymentUI4.i = K3.a.a(str10);
                        newPaymentSwiftFragment3.u0().f28998o.setEnabled(true);
                        String a10 = K3.a.a(str10);
                        AbstractC1334f5 u03 = newPaymentSwiftFragment3.u0();
                        PaymentUI paymentUI5 = newPaymentSwiftFragment3.f12854q0;
                        if (paymentUI5 == null) {
                            paymentUI5 = null;
                        }
                        if (kotlin.jvm.internal.f.b(paymentUI5.f11332c, BigDecimal.ZERO)) {
                            str4 = null;
                        } else {
                            PaymentUI paymentUI6 = newPaymentSwiftFragment3.f12854q0;
                            if (paymentUI6 == null) {
                                paymentUI6 = null;
                            }
                            str4 = paymentUI6.f11332c.toString();
                        }
                        u03.f28998o.c(a10, str4);
                        newPaymentSwiftFragment3.X0();
                        PaymentUI paymentUI7 = newPaymentSwiftFragment3.f12854q0;
                        if (paymentUI7 == null) {
                            paymentUI7 = null;
                        }
                        String str11 = paymentUI7.f11337h;
                        B5.h value = newPaymentSwiftFragment3.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI8 = newPaymentSwiftFragment3.f12854q0;
                            if (paymentUI8 == null) {
                                paymentUI8 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI8.f11345q = F8.j.b(value, feeType2, str11);
                            PaymentUI paymentUI9 = newPaymentSwiftFragment3.f12854q0;
                            (paymentUI9 != null ? paymentUI9 : null).f11346r = F8.j.a(value, feeType2, str11);
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        AbstractC1334f5 u02 = u0();
        u02.f29005v.setImageResource(0);
        u02.f29006w.addTextChangedListener(new a());
        CustomTextInputEditText customTextInputEditText = u02.f28998o;
        customTextInputEditText.setEnabled(false);
        customTextInputEditText.addTextChangedListener(new b());
        o.c(u02.f29001r, 500L, new g(this, 0));
        o.c(u02.f29002s, 500L, new g(u02, 1));
        PaymentUI paymentUI = this.f12854q0;
        String str = (paymentUI == null ? null : paymentUI).i;
        if (str == null) {
            str = "";
        }
        if (paymentUI == null) {
            paymentUI = null;
        }
        customTextInputEditText.c(str, paymentUI.f11332c.toString());
        o.c(u02.f29004u, 500L, new A7.c(14, this, u02));
        u02.f29007x.a(cVar);
        final int i9 = 1;
        U0().f8469g1.observe(getViewLifecycleOwner(), new d(new InterfaceC0646l(this) { // from class: g8.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentSwiftFragment f20826b;

            {
                this.f20826b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str2;
                String str22;
                Object obj2;
                String str3;
                String str4;
                switch (i9) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentSwiftFragment newPaymentSwiftFragment = this.f20826b;
                        PaymentUI paymentUI2 = newPaymentSwiftFragment.f12854q0;
                        String str5 = (paymentUI2 == null ? null : paymentUI2).f11337h;
                        if (paymentUI2 == null) {
                            paymentUI2 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI2.f11345q = F8.j.b(hVar, feeType, str5);
                        PaymentUI paymentUI22 = newPaymentSwiftFragment.f12854q0;
                        (paymentUI22 != null ? paymentUI22 : null).f11346r = F8.j.a(hVar, feeType, str5);
                        break;
                    case 1:
                        NewPaymentSwiftFragment newPaymentSwiftFragment2 = this.f20826b;
                        newPaymentSwiftFragment2.s0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentSwiftFragment2.s0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    newPaymentSwiftFragment2.u0().f29004u.setText(C0969n.u0(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a).toString());
                                    newPaymentSwiftFragment2.u0().f29003t.e();
                                    newPaymentSwiftFragment2.V0(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a);
                                    newPaymentSwiftFragment2.u0().f29005v.setVisibility(0);
                                    newPaymentSwiftFragment2.W0();
                                } else {
                                    if (newPaymentSwiftFragment2.T0().f20831a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            str22 = null;
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (kotlin.jvm.internal.f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentSwiftFragment2.T0().f20831a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) obj2;
                                        AbstractC1334f5 u022 = newPaymentSwiftFragment2.u0();
                                        if (aVar != null && (str3 = aVar.f13052a) != null) {
                                            str22 = C0969n.u0(str3).toString();
                                        }
                                        u022.f29004u.setText(str22);
                                        if (aVar != null) {
                                            newPaymentSwiftFragment2.V0(aVar.f13052a);
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentSwiftFragment2.f12858v0;
                                        if (bankAccountDomain != null && (str2 = bankAccountDomain.i) != null) {
                                            newPaymentSwiftFragment2.V0(str2);
                                        }
                                    }
                                    newPaymentSwiftFragment2.W0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str6 = bankAccountDomain2.i;
                                String str7 = str6 == null ? "" : str6;
                                String str8 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str7, D9.b.D(str8), str8 == null ? "" : str8, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, null, null, false, 480));
                            }
                        }
                        break;
                    default:
                        s5.e eVar = (s5.e) obj;
                        String str9 = eVar.f26620d;
                        NewPaymentSwiftFragment newPaymentSwiftFragment3 = this.f20826b;
                        if (str9 != null) {
                            PaymentUI paymentUI3 = newPaymentSwiftFragment3.f12854q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            paymentUI3.f11337h = str9.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI4 = newPaymentSwiftFragment3.f12854q0;
                        if (paymentUI4 == null) {
                            paymentUI4 = null;
                        }
                        String str10 = eVar.f26620d;
                        paymentUI4.i = K3.a.a(str10);
                        newPaymentSwiftFragment3.u0().f28998o.setEnabled(true);
                        String a10 = K3.a.a(str10);
                        AbstractC1334f5 u03 = newPaymentSwiftFragment3.u0();
                        PaymentUI paymentUI5 = newPaymentSwiftFragment3.f12854q0;
                        if (paymentUI5 == null) {
                            paymentUI5 = null;
                        }
                        if (kotlin.jvm.internal.f.b(paymentUI5.f11332c, BigDecimal.ZERO)) {
                            str4 = null;
                        } else {
                            PaymentUI paymentUI6 = newPaymentSwiftFragment3.f12854q0;
                            if (paymentUI6 == null) {
                                paymentUI6 = null;
                            }
                            str4 = paymentUI6.f11332c.toString();
                        }
                        u03.f28998o.c(a10, str4);
                        newPaymentSwiftFragment3.X0();
                        PaymentUI paymentUI7 = newPaymentSwiftFragment3.f12854q0;
                        if (paymentUI7 == null) {
                            paymentUI7 = null;
                        }
                        String str11 = paymentUI7.f11337h;
                        B5.h value = newPaymentSwiftFragment3.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI8 = newPaymentSwiftFragment3.f12854q0;
                            if (paymentUI8 == null) {
                                paymentUI8 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI8.f11345q = F8.j.b(value, feeType2, str11);
                            PaymentUI paymentUI9 = newPaymentSwiftFragment3.f12854q0;
                            (paymentUI9 != null ? paymentUI9 : null).f11346r = F8.j.a(value, feeType2, str11);
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 2;
        U0().f8472j1.observe(getViewLifecycleOwner(), new d(new InterfaceC0646l(this) { // from class: g8.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentSwiftFragment f20826b;

            {
                this.f20826b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str2;
                String str22;
                Object obj2;
                String str3;
                String str4;
                switch (i10) {
                    case 0:
                        B5.h hVar = (B5.h) obj;
                        NewPaymentSwiftFragment newPaymentSwiftFragment = this.f20826b;
                        PaymentUI paymentUI2 = newPaymentSwiftFragment.f12854q0;
                        String str5 = (paymentUI2 == null ? null : paymentUI2).f11337h;
                        if (paymentUI2 == null) {
                            paymentUI2 = null;
                        }
                        FeeType feeType = FeeType.f13318c;
                        paymentUI2.f11345q = F8.j.b(hVar, feeType, str5);
                        PaymentUI paymentUI22 = newPaymentSwiftFragment.f12854q0;
                        (paymentUI22 != null ? paymentUI22 : null).f11346r = F8.j.a(hVar, feeType, str5);
                        break;
                    case 1:
                        NewPaymentSwiftFragment newPaymentSwiftFragment2 = this.f20826b;
                        newPaymentSwiftFragment2.s0.clear();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            if (((BankAccountDomain) obj3).i != null) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList2 = newPaymentSwiftFragment2.s0;
                            if (!hasNext) {
                                if (arrayList2.size() == 1) {
                                    newPaymentSwiftFragment2.u0().f29004u.setText(C0969n.u0(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a).toString());
                                    newPaymentSwiftFragment2.u0().f29003t.e();
                                    newPaymentSwiftFragment2.V0(((StatementsSelectorDialog.a) s.J(arrayList2)).f13052a);
                                    newPaymentSwiftFragment2.u0().f29005v.setVisibility(0);
                                    newPaymentSwiftFragment2.W0();
                                } else {
                                    if (newPaymentSwiftFragment2.T0().f20831a != null) {
                                        Iterator it2 = arrayList2.iterator();
                                        while (true) {
                                            str22 = null;
                                            if (it2.hasNext()) {
                                                obj2 = it2.next();
                                                if (kotlin.jvm.internal.f.b(((StatementsSelectorDialog.a) obj2).f13054c, newPaymentSwiftFragment2.T0().f20831a.f11337h)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        StatementsSelectorDialog.a aVar = (StatementsSelectorDialog.a) obj2;
                                        AbstractC1334f5 u022 = newPaymentSwiftFragment2.u0();
                                        if (aVar != null && (str3 = aVar.f13052a) != null) {
                                            str22 = C0969n.u0(str3).toString();
                                        }
                                        u022.f29004u.setText(str22);
                                        if (aVar != null) {
                                            newPaymentSwiftFragment2.V0(aVar.f13052a);
                                        }
                                    } else {
                                        BankAccountDomain bankAccountDomain = newPaymentSwiftFragment2.f12858v0;
                                        if (bankAccountDomain != null && (str2 = bankAccountDomain.i) != null) {
                                            newPaymentSwiftFragment2.V0(str2);
                                        }
                                    }
                                    newPaymentSwiftFragment2.W0();
                                }
                                break;
                            } else {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) it.next();
                                String str6 = bankAccountDomain2.i;
                                String str7 = str6 == null ? "" : str6;
                                String str8 = bankAccountDomain2.f10701h;
                                arrayList2.add(new StatementsSelectorDialog.a(str7, D9.b.D(str8), str8 == null ? "" : str8, F8.b.b(bankAccountDomain2), F8.b.c(bankAccountDomain2), null, null, null, false, 480));
                            }
                        }
                        break;
                    default:
                        s5.e eVar = (s5.e) obj;
                        String str9 = eVar.f26620d;
                        NewPaymentSwiftFragment newPaymentSwiftFragment3 = this.f20826b;
                        if (str9 != null) {
                            PaymentUI paymentUI3 = newPaymentSwiftFragment3.f12854q0;
                            if (paymentUI3 == null) {
                                paymentUI3 = null;
                            }
                            paymentUI3.f11337h = str9.toUpperCase(Locale.ROOT);
                        }
                        PaymentUI paymentUI4 = newPaymentSwiftFragment3.f12854q0;
                        if (paymentUI4 == null) {
                            paymentUI4 = null;
                        }
                        String str10 = eVar.f26620d;
                        paymentUI4.i = K3.a.a(str10);
                        newPaymentSwiftFragment3.u0().f28998o.setEnabled(true);
                        String a10 = K3.a.a(str10);
                        AbstractC1334f5 u03 = newPaymentSwiftFragment3.u0();
                        PaymentUI paymentUI5 = newPaymentSwiftFragment3.f12854q0;
                        if (paymentUI5 == null) {
                            paymentUI5 = null;
                        }
                        if (kotlin.jvm.internal.f.b(paymentUI5.f11332c, BigDecimal.ZERO)) {
                            str4 = null;
                        } else {
                            PaymentUI paymentUI6 = newPaymentSwiftFragment3.f12854q0;
                            if (paymentUI6 == null) {
                                paymentUI6 = null;
                            }
                            str4 = paymentUI6.f11332c.toString();
                        }
                        u03.f28998o.c(a10, str4);
                        newPaymentSwiftFragment3.X0();
                        PaymentUI paymentUI7 = newPaymentSwiftFragment3.f12854q0;
                        if (paymentUI7 == null) {
                            paymentUI7 = null;
                        }
                        String str11 = paymentUI7.f11337h;
                        B5.h value = newPaymentSwiftFragment3.U0().f8474l1.getValue();
                        if (value != null) {
                            PaymentUI paymentUI8 = newPaymentSwiftFragment3.f12854q0;
                            if (paymentUI8 == null) {
                                paymentUI8 = null;
                            }
                            FeeType feeType2 = FeeType.f13318c;
                            paymentUI8.f11345q = F8.j.b(value, feeType2, str11);
                            PaymentUI paymentUI9 = newPaymentSwiftFragment3.f12854q0;
                            (paymentUI9 != null ? paymentUI9 : null).f11346r = F8.j.a(value, feeType2, str11);
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i11 = 0;
        E.b(this, "ACCOUNT", new InterfaceC0650p(this) { // from class: g8.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentSwiftFragment f20830b;

            {
                this.f20830b = this;
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
                            NewPaymentSwiftFragment newPaymentSwiftFragment = this.f20830b;
                            List<BankAccountDomain> value = newPaymentSwiftFragment.U0().f8469g1.getValue();
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
                                    newPaymentSwiftFragment.u0().f28998o.setEnabled(true);
                                    String str4 = bankAccountDomain.f10701h;
                                    if (str4 != null) {
                                        newPaymentSwiftFragment.f12855r0 = str4;
                                        AbstractC1334f5 u03 = newPaymentSwiftFragment.u0();
                                        String a10 = K3.a.a(str4);
                                        PaymentUI paymentUI2 = newPaymentSwiftFragment.f12854q0;
                                        if (paymentUI2 == null) {
                                            paymentUI2 = null;
                                        }
                                        if (kotlin.jvm.internal.f.b(paymentUI2.f11332c, BigDecimal.ZERO)) {
                                            str3 = null;
                                        } else {
                                            PaymentUI paymentUI3 = newPaymentSwiftFragment.f12854q0;
                                            if (paymentUI3 == null) {
                                                paymentUI3 = null;
                                            }
                                            str3 = paymentUI3.f11332c.toString();
                                        }
                                        u03.f28998o.c(a10, str3);
                                        PaymentUI paymentUI4 = newPaymentSwiftFragment.f12854q0;
                                        if (paymentUI4 == null) {
                                            paymentUI4 = null;
                                        }
                                        paymentUI4.f11337h = str4;
                                    }
                                    String str5 = bankAccountDomain.i;
                                    if (str5 != null) {
                                        PaymentUI paymentUI5 = newPaymentSwiftFragment.f12854q0;
                                        if (paymentUI5 == null) {
                                            paymentUI5 = null;
                                        }
                                        paymentUI5.f11340l = C0969n.u0(str5).toString();
                                    }
                                    AbstractC1334f5 u04 = newPaymentSwiftFragment.u0();
                                    if (str5 != null) {
                                        if (str5.length() > 32) {
                                            str5 = C0970o.z0(32, str5).concat("...");
                                        }
                                        str2 = str5;
                                    }
                                    u04.f29004u.setText(str2);
                                    Integer g10 = F8.b.g(bankAccountDomain, newPaymentSwiftFragment.requireContext());
                                    if (g10 != null) {
                                        newPaymentSwiftFragment.u0().f29005v.setImageResource(g10.intValue());
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        NewPaymentSwiftFragment newPaymentSwiftFragment2 = this.f20830b;
                        newPaymentSwiftFragment2.u0().f29005v.setImageResource(0);
                        newPaymentSwiftFragment2.u0().f28998o.setEnabled(false);
                        break;
                }
                return p.f3034a;
            }
        });
        final int i12 = 1;
        E.b(this, "EMPTY_BACK", new InterfaceC0650p(this) { // from class: g8.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentSwiftFragment f20830b;

            {
                this.f20830b = this;
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
                            NewPaymentSwiftFragment newPaymentSwiftFragment = this.f20830b;
                            List<BankAccountDomain> value = newPaymentSwiftFragment.U0().f8469g1.getValue();
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
                                    newPaymentSwiftFragment.u0().f28998o.setEnabled(true);
                                    String str4 = bankAccountDomain.f10701h;
                                    if (str4 != null) {
                                        newPaymentSwiftFragment.f12855r0 = str4;
                                        AbstractC1334f5 u03 = newPaymentSwiftFragment.u0();
                                        String a10 = K3.a.a(str4);
                                        PaymentUI paymentUI2 = newPaymentSwiftFragment.f12854q0;
                                        if (paymentUI2 == null) {
                                            paymentUI2 = null;
                                        }
                                        if (kotlin.jvm.internal.f.b(paymentUI2.f11332c, BigDecimal.ZERO)) {
                                            str3 = null;
                                        } else {
                                            PaymentUI paymentUI3 = newPaymentSwiftFragment.f12854q0;
                                            if (paymentUI3 == null) {
                                                paymentUI3 = null;
                                            }
                                            str3 = paymentUI3.f11332c.toString();
                                        }
                                        u03.f28998o.c(a10, str3);
                                        PaymentUI paymentUI4 = newPaymentSwiftFragment.f12854q0;
                                        if (paymentUI4 == null) {
                                            paymentUI4 = null;
                                        }
                                        paymentUI4.f11337h = str4;
                                    }
                                    String str5 = bankAccountDomain.i;
                                    if (str5 != null) {
                                        PaymentUI paymentUI5 = newPaymentSwiftFragment.f12854q0;
                                        if (paymentUI5 == null) {
                                            paymentUI5 = null;
                                        }
                                        paymentUI5.f11340l = C0969n.u0(str5).toString();
                                    }
                                    AbstractC1334f5 u04 = newPaymentSwiftFragment.u0();
                                    if (str5 != null) {
                                        if (str5.length() > 32) {
                                            str5 = C0970o.z0(32, str5).concat("...");
                                        }
                                        str2 = str5;
                                    }
                                    u04.f29004u.setText(str2);
                                    Integer g10 = F8.b.g(bankAccountDomain, newPaymentSwiftFragment.requireContext());
                                    if (g10 != null) {
                                        newPaymentSwiftFragment.u0().f29005v.setImageResource(g10.intValue());
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        NewPaymentSwiftFragment newPaymentSwiftFragment2 = this.f20830b;
                        newPaymentSwiftFragment2.u0().f29005v.setImageResource(0);
                        newPaymentSwiftFragment2.u0().f28998o.setEnabled(false);
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12851n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        u0().f29001r.setVisibility(0);
        t0(true);
        s0();
        o.b(u0().f29002s);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        o.b(u0().f29001r);
        u0().f29002s.setVisibility(0);
        p0(true);
        B0();
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentSwiftFragment newPaymentSwiftFragment = NewPaymentSwiftFragment.this;
            PaymentUI paymentUI = newPaymentSwiftFragment.f12854q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11336g = String.valueOf(charSequence);
            newPaymentSwiftFragment.X0();
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
            NewPaymentSwiftFragment newPaymentSwiftFragment = NewPaymentSwiftFragment.this;
            PaymentUI paymentUI = newPaymentSwiftFragment.f12854q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            BigDecimal Q4 = C0966k.Q(D9.b.r0(String.valueOf(newPaymentSwiftFragment.u0().f28998o.getText())));
            if (Q4 == null) {
                Q4 = BigDecimal.ZERO;
            }
            paymentUI.f11332c = Q4;
            newPaymentSwiftFragment.X0();
            PaymentUI paymentUI2 = newPaymentSwiftFragment.f12854q0;
            newPaymentSwiftFragment.Y0((paymentUI2 != null ? paymentUI2 : null).f11332c.floatValue());
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
