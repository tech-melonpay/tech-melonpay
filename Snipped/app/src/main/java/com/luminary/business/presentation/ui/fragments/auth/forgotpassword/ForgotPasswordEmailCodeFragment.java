package com.luminary.business.presentation.ui.fragments.auth.forgotpassword;

import F8.o;
import H6.i;
import I5.n;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordEmailCodeFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import t6.X3;

/* compiled from: ForgotPasswordEmailCodeFragment.kt */
/* loaded from: classes2.dex */
public final class ForgotPasswordEmailCodeFragment extends BaseFragment<X3> {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f11540t0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f11541n0 = R.layout.fragment_forgot_password_email_code;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11542o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f11543p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f11544q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Handler f11545r0;
    public final com.luminary.business.presentation.ui.fragments.auth.forgotpassword.a s0;

    /* compiled from: ForgotPasswordEmailCodeFragment.kt */
    public static final class c implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11552a;

        public c(InterfaceC0646l interfaceC0646l) {
            this.f11552a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11552a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11552a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordEmailCodeFragment$special$$inlined$viewModel$default$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.luminary.business.presentation.ui.fragments.auth.forgotpassword.a] */
    public ForgotPasswordEmailCodeFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordEmailCodeFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11542o0 = E.a(this, h.a(i.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordEmailCodeFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordEmailCodeFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(i.class), null, null, b.l(this));
            }
        });
        this.f11545r0 = new Handler(Looper.getMainLooper());
        this.s0 = new InterfaceC0635a() { // from class: com.luminary.business.presentation.ui.fragments.auth.forgotpassword.a
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment = ForgotPasswordEmailCodeFragment.this;
                if (forgotPasswordEmailCodeFragment.getView() != null) {
                    BuildersKt__Builders_commonKt.launch$default(C0552s.a(forgotPasswordEmailCodeFragment.getViewLifecycleOwner()), Dispatchers.getMain(), null, new ForgotPasswordEmailCodeFragment$showResendTimer$1(forgotPasswordEmailCodeFragment, null), 2, null);
                }
                return p.f3034a;
            }
        };
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.forgot_password);
        toolbarStatus.f13266d = "\n";
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        this.f11545r0.removeCallbacks(new H6.c(0, this.s0));
        super.onPause();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getView() == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(C0552s.a(getViewLifecycleOwner()), Dispatchers.getMain(), null, new ForgotPasswordEmailCodeFragment$showResendTimer$1(this, null), 2, null);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        u0().f28667r.setEnabled(false);
        u0().f28663n.setEnabled(false);
        u0().f28664o.setEnabled(false);
        H1.a aVar = this.f11542o0;
        final int i = 0;
        ((i) aVar.getValue()).f1545Y0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: H6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgotPasswordEmailCodeFragment f1522b;

            {
                this.f1522b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment = this.f1522b;
                        String valueOf = String.valueOf(forgotPasswordEmailCodeFragment.u0().f28665p.getText());
                        NavController g10 = U4.b.g(forgotPasswordEmailCodeFragment);
                        g10.getClass();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("newPassword", (String) obj);
                        bundle2.putString("email", valueOf);
                        g10.i(R.id.action_forgotPasswordEmailCodeFragment_to_forgotPasswordFragment, bundle2);
                        break;
                    default:
                        this.f1522b.f11543p0 = true;
                        break;
                }
                return p.f3034a;
            }
        }));
        i iVar = (i) aVar.getValue();
        final int i9 = 1;
        iVar.f1547a1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: H6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgotPasswordEmailCodeFragment f1522b;

            {
                this.f1522b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment = this.f1522b;
                        String valueOf = String.valueOf(forgotPasswordEmailCodeFragment.u0().f28665p.getText());
                        NavController g10 = U4.b.g(forgotPasswordEmailCodeFragment);
                        g10.getClass();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("newPassword", (String) obj);
                        bundle2.putString("email", valueOf);
                        g10.i(R.id.action_forgotPasswordEmailCodeFragment_to_forgotPasswordFragment, bundle2);
                        break;
                    default:
                        this.f1522b.f11543p0 = true;
                        break;
                }
                return p.f3034a;
            }
        }));
        X3 u02 = u0();
        u02.f28665p.addTextChangedListener(new a());
        X3 u03 = u0();
        u03.f28666q.addTextChangedListener(new b());
        X3 u04 = u0();
        final int i10 = 0;
        o.c(u04.f28667r, 500L, new InterfaceC0635a(this) { // from class: H6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgotPasswordEmailCodeFragment f1524b;

            {
                this.f1524b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment = this.f1524b;
                        final String valueOf = String.valueOf(forgotPasswordEmailCodeFragment.u0().f28665p.getText());
                        if (D9.b.h0(valueOf)) {
                            final i iVar2 = (i) forgotPasswordEmailCodeFragment.f11542o0.getValue();
                            final int i11 = 0;
                            InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: H6.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            i iVar3 = iVar2;
                                            iVar3.l();
                                            n nVar = new n(valueOf);
                                            iVar3.f1541U0.a(new g(iVar3, 3), nVar);
                                            break;
                                        default:
                                            i iVar4 = iVar2;
                                            iVar4.l();
                                            iVar4.f1542V0.a(new g(iVar4, 2), valueOf);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            iVar2.f418J0 = interfaceC0635a;
                            interfaceC0635a.invoke();
                        }
                        break;
                    case 1:
                        ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment2 = this.f1524b;
                        final String valueOf2 = String.valueOf(forgotPasswordEmailCodeFragment2.u0().f28666q.getText());
                        if (valueOf2.length() == 5) {
                            final i iVar3 = (i) forgotPasswordEmailCodeFragment2.f11542o0.getValue();
                            final int i12 = 1;
                            InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: H6.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            i iVar32 = iVar3;
                                            iVar32.l();
                                            n nVar = new n(valueOf2);
                                            iVar32.f1541U0.a(new g(iVar32, 3), nVar);
                                            break;
                                        default:
                                            i iVar4 = iVar3;
                                            iVar4.l();
                                            iVar4.f1542V0.a(new g(iVar4, 2), valueOf2);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            iVar3.f419K0 = interfaceC0635a2;
                            interfaceC0635a2.invoke();
                        }
                        break;
                    default:
                        this.f1524b.u0().f28663n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        X3 u05 = u0();
        final int i11 = 1;
        o.c(u05.f28663n, 500L, new InterfaceC0635a(this) { // from class: H6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgotPasswordEmailCodeFragment f1524b;

            {
                this.f1524b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment = this.f1524b;
                        final String valueOf = String.valueOf(forgotPasswordEmailCodeFragment.u0().f28665p.getText());
                        if (D9.b.h0(valueOf)) {
                            final i iVar2 = (i) forgotPasswordEmailCodeFragment.f11542o0.getValue();
                            final int i112 = 0;
                            InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: H6.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i112) {
                                        case 0:
                                            i iVar32 = iVar2;
                                            iVar32.l();
                                            n nVar = new n(valueOf);
                                            iVar32.f1541U0.a(new g(iVar32, 3), nVar);
                                            break;
                                        default:
                                            i iVar4 = iVar2;
                                            iVar4.l();
                                            iVar4.f1542V0.a(new g(iVar4, 2), valueOf);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            iVar2.f418J0 = interfaceC0635a;
                            interfaceC0635a.invoke();
                        }
                        break;
                    case 1:
                        ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment2 = this.f1524b;
                        final String valueOf2 = String.valueOf(forgotPasswordEmailCodeFragment2.u0().f28666q.getText());
                        if (valueOf2.length() == 5) {
                            final i iVar3 = (i) forgotPasswordEmailCodeFragment2.f11542o0.getValue();
                            final int i12 = 1;
                            InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: H6.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            i iVar32 = iVar3;
                                            iVar32.l();
                                            n nVar = new n(valueOf2);
                                            iVar32.f1541U0.a(new g(iVar32, 3), nVar);
                                            break;
                                        default:
                                            i iVar4 = iVar3;
                                            iVar4.l();
                                            iVar4.f1542V0.a(new g(iVar4, 2), valueOf2);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            iVar3.f419K0 = interfaceC0635a2;
                            interfaceC0635a2.invoke();
                        }
                        break;
                    default:
                        this.f1524b.u0().f28663n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        X3 u06 = u0();
        final int i12 = 2;
        o.c(u06.f28664o, 500L, new InterfaceC0635a(this) { // from class: H6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForgotPasswordEmailCodeFragment f1524b;

            {
                this.f1524b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment = this.f1524b;
                        final String valueOf = String.valueOf(forgotPasswordEmailCodeFragment.u0().f28665p.getText());
                        if (D9.b.h0(valueOf)) {
                            final i iVar2 = (i) forgotPasswordEmailCodeFragment.f11542o0.getValue();
                            final int i112 = 0;
                            InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: H6.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i112) {
                                        case 0:
                                            i iVar32 = iVar2;
                                            iVar32.l();
                                            n nVar = new n(valueOf);
                                            iVar32.f1541U0.a(new g(iVar32, 3), nVar);
                                            break;
                                        default:
                                            i iVar4 = iVar2;
                                            iVar4.l();
                                            iVar4.f1542V0.a(new g(iVar4, 2), valueOf);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            iVar2.f418J0 = interfaceC0635a;
                            interfaceC0635a.invoke();
                        }
                        break;
                    case 1:
                        ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment2 = this.f1524b;
                        final String valueOf2 = String.valueOf(forgotPasswordEmailCodeFragment2.u0().f28666q.getText());
                        if (valueOf2.length() == 5) {
                            final i iVar3 = (i) forgotPasswordEmailCodeFragment2.f11542o0.getValue();
                            final int i122 = 1;
                            InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: H6.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i122) {
                                        case 0:
                                            i iVar32 = iVar3;
                                            iVar32.l();
                                            n nVar = new n(valueOf2);
                                            iVar32.f1541U0.a(new g(iVar32, 3), nVar);
                                            break;
                                        default:
                                            i iVar4 = iVar3;
                                            iVar4.l();
                                            iVar4.f1542V0.a(new g(iVar4, 2), valueOf2);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            iVar3.f419K0 = interfaceC0635a2;
                            interfaceC0635a2.invoke();
                        }
                        break;
                    default:
                        this.f1524b.u0().f28663n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11541n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f28663n.setVisibility(0);
        o.b(u0().f28664o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f28663n);
        u0().f28664o.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment = ForgotPasswordEmailCodeFragment.this;
            forgotPasswordEmailCodeFragment.f11543p0 = false;
            forgotPasswordEmailCodeFragment.u0().f28667r.setEnabled(D9.b.h0(String.valueOf(charSequence)));
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
            ForgotPasswordEmailCodeFragment forgotPasswordEmailCodeFragment = ForgotPasswordEmailCodeFragment.this;
            boolean z10 = false;
            forgotPasswordEmailCodeFragment.u0().f28663n.setEnabled(charSequence != null && charSequence.length() == 5 && forgotPasswordEmailCodeFragment.f11543p0);
            X3 u02 = forgotPasswordEmailCodeFragment.u0();
            if (charSequence != null && charSequence.length() == 5 && forgotPasswordEmailCodeFragment.f11543p0) {
                z10 = true;
            }
            u02.f28664o.setEnabled(z10);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
