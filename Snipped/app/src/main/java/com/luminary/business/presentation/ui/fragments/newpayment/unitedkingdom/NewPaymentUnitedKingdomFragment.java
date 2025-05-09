package com.luminary.business.presentation.ui.fragments.newpayment.unitedkingdom;

import F8.o;
import Fa.h;
import O9.p;
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
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.unitedkingdom.NewPaymentUnitedKingdomFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import f7.ViewOnScrollChangeListenerC0749c;
import i8.C0831a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0966k;
import ka.C0967l;
import ka.C0969n;
import t6.AbstractC1382l5;

/* compiled from: NewPaymentUnitedKingdomFragment.kt */
/* loaded from: classes2.dex */
public final class NewPaymentUnitedKingdomFragment extends BaseFragment<AbstractC1382l5> {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f12906u0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f12907n0 = R.layout.fragment_new_payment_uk;

    /* renamed from: o0, reason: collision with root package name */
    public final h f12908o0 = new h(kotlin.jvm.internal.h.a(i8.c.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.unitedkingdom.NewPaymentUnitedKingdomFragment$special$$inlined$navArgs$1
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
    public final H1.a f12909p0;

    /* renamed from: q0, reason: collision with root package name */
    public PaymentUI f12910q0;

    /* renamed from: r0, reason: collision with root package name */
    public final ArrayList f12911r0;
    public boolean s0;

    /* renamed from: t0, reason: collision with root package name */
    public BankAccountDomain f12912t0;

    /* compiled from: NewPaymentUnitedKingdomFragment.kt */
    public static final class f implements TabLayout.d {
        public f() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            PaymentUI paymentUI = NewPaymentUnitedKingdomFragment.this.f12910q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11342n = gVar != null ? Integer.valueOf(gVar.f9855d) : null;
        }
    }

    /* compiled from: NewPaymentUnitedKingdomFragment.kt */
    public static final class g implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12924a;

        public g(InterfaceC0646l interfaceC0646l) {
            this.f12924a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12924a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12924a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.newpayment.unitedkingdom.NewPaymentUnitedKingdomFragment$special$$inlined$viewModel$default$1] */
    public NewPaymentUnitedKingdomFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.unitedkingdom.NewPaymentUnitedKingdomFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12909p0 = E.a(this, kotlin.jvm.internal.h.a(b8.h.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.unitedkingdom.NewPaymentUnitedKingdomFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.unitedkingdom.NewPaymentUnitedKingdomFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(b8.h.class), null, null, b.l(this));
            }
        });
        this.f12911r0 = new ArrayList();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.uk);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.uk);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void T0(String str, boolean z10) {
        AbstractC1382l5 u02 = u0();
        boolean g02 = D9.b.g0(str);
        CustomTextInputLayout customTextInputLayout = u02.f29257t;
        if (g02 || !z10) {
            customTextInputLayout.setError(null);
        } else {
            customTextInputLayout.setErrorWithoutFocus(getString(R.string.invalid_beneficiary));
        }
    }

    public final void U0(String str) {
        BankAccountDomain bankAccountDomain;
        Object obj;
        List<BankAccountDomain> value = ((b8.h) this.f12909p0.getValue()).f8470h1.getValue();
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
        this.f12912t0 = bankAccountDomain;
        if (bankAccountDomain == null || bankAccountDomain.f10694a == null) {
            return;
        }
        PaymentUI paymentUI = this.f12910q0;
        (paymentUI != null ? paymentUI : null).f11340l = C0969n.u0(str).toString();
        u0().f29256s.setVisibility(0);
        u0().f29255r.setVisibility(0);
        AbstractC1382l5 u02 = u0();
        BankAccountDomain bankAccountDomain2 = this.f12912t0;
        u02.f29255r.setText(getString(R.string.available_balance_value, bankAccountDomain2 != null ? F8.b.b(bankAccountDomain2) : ""));
        u0().f29256s.setText(F8.b.c(this.f12912t0));
        W0();
    }

    public final void V0() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        PaymentUI paymentUI = ((i8.c) this.f12908o0.getValue()).f21507a;
        if (paymentUI != null) {
            AbstractC1382l5 u02 = u0();
            u02.f29258u.setText(paymentUI.f11334e);
            u02.f29249D.setText(paymentUI.f11333d);
            u02.f29252o.setText(paymentUI.f11338j);
            u02.f29247B.setText(paymentUI.f11336g);
            String str = paymentUI.i;
            if (str == null) {
                str = "";
            }
            u02.f29254q.c(str, paymentUI.b());
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
            t6.l5 r0 = (t6.AbstractC1382l5) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12910q0
            r2 = 0
            if (r1 != 0) goto Lc
            r1 = r2
        Lc:
            boolean r1 = r1.e()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L27
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12910q0
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
            android.widget.Button r0 = r0.f29259v
            r0.setEnabled(r1)
            F0.f r0 = r5.u0()
            t6.l5 r0 = (t6.AbstractC1382l5) r0
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12910q0
            if (r1 != 0) goto L38
            r1 = r2
        L38:
            boolean r1 = r1.e()
            if (r1 == 0) goto L51
            com.luminary.business.presentation.entity.payment.PaymentUI r1 = r5.f12910q0
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
            android.widget.Button r0 = r0.f29260w
            r0.setEnabled(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.newpayment.unitedkingdom.NewPaymentUnitedKingdomFragment.W0():void");
    }

    public final boolean X0(float f10) {
        BigDecimal bigDecimal;
        BankAccountDomain bankAccountDomain = this.f12912t0;
        if (((bankAccountDomain == null || (bigDecimal = bankAccountDomain.f10698e) == null) ? 0.0f : bigDecimal.floatValue()) < f10) {
            u0().f29253p.setErrorWithoutFocus(getString(R.string.you_do_not_have_enough_money));
            return false;
        }
        u0().f29253p.setError(null);
        return true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12910q0 = new PaymentUI(PaymentType.f11148b, BigDecimal.ZERO, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217696);
        PaymentUI paymentUI = ((i8.c) this.f12908o0.getValue()).f21507a;
        if (paymentUI != null) {
            PaymentUI paymentUI2 = this.f12910q0;
            (paymentUI2 == null ? null : paymentUI2).f11332c = paymentUI.f11332c;
            (paymentUI2 == null ? null : paymentUI2).f11335f = paymentUI.f11335f;
            (paymentUI2 == null ? null : paymentUI2).f11333d = paymentUI.f11333d;
            if (paymentUI2 == null) {
                paymentUI2 = null;
            }
            paymentUI2.f11334e = paymentUI.f11334e;
        }
        PaymentUI paymentUI3 = this.f12910q0;
        (paymentUI3 != null ? paymentUI3 : null).f11342n = 0;
        this.f11471m0 = (b8.h) this.f12909p0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        PaymentUI paymentUI = this.f12910q0;
        if (paymentUI == null) {
            paymentUI = null;
        }
        Integer num = paymentUI.f11342n;
        if (num != null) {
            int intValue = num.intValue();
            AbstractC1382l5 u02 = u0();
            u02.f29250E.k(u0().f29250E.h(intValue), true);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        f fVar = new f();
        H1.a aVar = this.f12909p0;
        ((b8.h) aVar.getValue()).f8474l1.observe(getViewLifecycleOwner(), new g(new C0831a(this, 0)));
        ((b8.h) aVar.getValue()).f8470h1.observe(getViewLifecycleOwner(), new g(new C0831a(this, 1)));
        ((b8.h) aVar.getValue()).n(0);
        AbstractC1382l5 u02 = u0();
        u02.f29258u.addTextChangedListener(new a());
        u02.f29249D.addTextChangedListener(new b());
        u02.f29252o.addTextChangedListener(new c());
        u02.f29247B.addTextChangedListener(new d());
        e eVar = new e();
        CustomTextInputEditText customTextInputEditText = u02.f29254q;
        customTextInputEditText.addTextChangedListener(eVar);
        final int i = 0;
        o.c(u02.f29259v, 500L, new InterfaceC0635a(this) { // from class: i8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentUnitedKingdomFragment f21506b;

            {
                this.f21506b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment = this.f21506b;
                        NavController g10 = U4.b.g(newPaymentUnitedKingdomFragment);
                        PaymentUI paymentUI = newPaymentUnitedKingdomFragment.f12910q0;
                        if (paymentUI == null) {
                            paymentUI = null;
                        }
                        h hVar = newPaymentUnitedKingdomFragment.f12908o0;
                        g10.j(new d(paymentUI, ((c) hVar.getValue()).f21508b, ((c) hVar.getValue()).f21509c));
                        break;
                    default:
                        NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment2 = this.f21506b;
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(newPaymentUnitedKingdomFragment2.requireContext(), StatementsSelectorDialog.DialogType.f13044b);
                        statementsSelectorDialog.f13040u = new C0831a(newPaymentUnitedKingdomFragment2, 2);
                        statementsSelectorDialog.show();
                        StatementsSelectorDialog.l(statementsSelectorDialog, newPaymentUnitedKingdomFragment2.f12911r0);
                        statementsSelectorDialog.m(newPaymentUnitedKingdomFragment2.getString(R.string.from_account));
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(u02.f29260w, 500L, new g8.g(u02, 6));
        final int i9 = 1;
        o.c(u02.f29262y, 500L, new InterfaceC0635a(this) { // from class: i8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPaymentUnitedKingdomFragment f21506b;

            {
                this.f21506b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment = this.f21506b;
                        NavController g10 = U4.b.g(newPaymentUnitedKingdomFragment);
                        PaymentUI paymentUI = newPaymentUnitedKingdomFragment.f12910q0;
                        if (paymentUI == null) {
                            paymentUI = null;
                        }
                        h hVar = newPaymentUnitedKingdomFragment.f12908o0;
                        g10.j(new d(paymentUI, ((c) hVar.getValue()).f21508b, ((c) hVar.getValue()).f21509c));
                        break;
                    default:
                        NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment2 = this.f21506b;
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(newPaymentUnitedKingdomFragment2.requireContext(), StatementsSelectorDialog.DialogType.f13044b);
                        statementsSelectorDialog.f13040u = new C0831a(newPaymentUnitedKingdomFragment2, 2);
                        statementsSelectorDialog.show();
                        StatementsSelectorDialog.l(statementsSelectorDialog, newPaymentUnitedKingdomFragment2.f12911r0);
                        statementsSelectorDialog.m(newPaymentUnitedKingdomFragment2.getString(R.string.from_account));
                        break;
                }
                return p.f3034a;
            }
        });
        PaymentUI paymentUI = this.f12910q0;
        String str = (paymentUI == null ? null : paymentUI).i;
        if (str == null) {
            str = "";
        }
        if (paymentUI == null) {
            paymentUI = null;
        }
        customTextInputEditText.c(str, paymentUI.f11332c.toString());
        u02.f29250E.a(fVar);
        u0().f29246A.setOnScrollChangeListener(new ViewOnScrollChangeListenerC0749c(1));
        F8.g.a(u0().f29258u, new C0831a(this, 3));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12907n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f29259v.setVisibility(0);
        o.b(u0().f29260w);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        o.b(u0().f29259v);
        p0(true);
        B0();
        u0().f29260w.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment = NewPaymentUnitedKingdomFragment.this;
            PaymentUI paymentUI = newPaymentUnitedKingdomFragment.f12910q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11334e = String.valueOf(charSequence);
            newPaymentUnitedKingdomFragment.W0();
            newPaymentUnitedKingdomFragment.T0(String.valueOf(charSequence), false);
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
            NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment = NewPaymentUnitedKingdomFragment.this;
            PaymentUI paymentUI = newPaymentUnitedKingdomFragment.f12910q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11333d = String.valueOf(charSequence);
            newPaymentUnitedKingdomFragment.W0();
            String X = C0967l.X(String.valueOf(newPaymentUnitedKingdomFragment.u0().f29249D.getText()), "-", "", false);
            if (TextUtils.isDigitsOnly(X) && X.length() == 6) {
                newPaymentUnitedKingdomFragment.u0().f29248C.setError(null);
                return;
            }
            newPaymentUnitedKingdomFragment.u0().f29248C.setErrorWithoutFocus(newPaymentUnitedKingdomFragment.getString(R.string.invalid_sort_code));
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
            NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment = NewPaymentUnitedKingdomFragment.this;
            PaymentUI paymentUI = newPaymentUnitedKingdomFragment.f12910q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11335f = String.valueOf(charSequence);
            newPaymentUnitedKingdomFragment.W0();
            String valueOf = String.valueOf(newPaymentUnitedKingdomFragment.u0().f29252o.getText());
            if (TextUtils.isDigitsOnly(valueOf) && valueOf.length() == 8) {
                newPaymentUnitedKingdomFragment.u0().f29251n.setError(null);
                return;
            }
            newPaymentUnitedKingdomFragment.u0().f29251n.setErrorWithoutFocus(newPaymentUnitedKingdomFragment.getString(R.string.invalid_account_number));
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
            NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment = NewPaymentUnitedKingdomFragment.this;
            PaymentUI paymentUI = newPaymentUnitedKingdomFragment.f12910q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            paymentUI.f11336g = String.valueOf(charSequence);
            newPaymentUnitedKingdomFragment.W0();
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
            NewPaymentUnitedKingdomFragment newPaymentUnitedKingdomFragment = NewPaymentUnitedKingdomFragment.this;
            PaymentUI paymentUI = newPaymentUnitedKingdomFragment.f12910q0;
            if (paymentUI == null) {
                paymentUI = null;
            }
            BigDecimal Q4 = C0966k.Q(D9.b.r0(String.valueOf(charSequence)));
            if (Q4 == null) {
                Q4 = BigDecimal.ZERO;
            }
            paymentUI.f11332c = Q4;
            newPaymentUnitedKingdomFragment.W0();
            PaymentUI paymentUI2 = newPaymentUnitedKingdomFragment.f12910q0;
            newPaymentUnitedKingdomFragment.X0((paymentUI2 != null ? paymentUI2 : null).f11332c.floatValue());
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
