package com.luminary.business.presentation.ui.fragments.auth.forgotpassword;

import F8.o;
import Fa.h;
import H6.e;
import H6.i;
import U4.b;
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
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import t6.V3;

/* compiled from: ForgotPasswordFragment.kt */
/* loaded from: classes2.dex */
public final class ForgotPasswordFragment extends BaseFragment<V3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11554n0 = R.layout.fragment_forgot_password;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11555o0;

    /* renamed from: p0, reason: collision with root package name */
    public final h f11556p0;

    /* compiled from: ForgotPasswordFragment.kt */
    public static final class c implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11564a;

        public c(C7.a aVar) {
            this.f11564a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11564a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11564a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordFragment$special$$inlined$viewModel$default$1] */
    public ForgotPasswordFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11555o0 = E.a(this, kotlin.jvm.internal.h.a(i.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(i.class), null, null, b.l(this));
            }
        });
        this.f11556p0 = new h(kotlin.jvm.internal.h.a(e.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordFragment$special$$inlined$navArgs$1
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
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13263a = getString(R.string.forgot_password);
        toolbarStatus.f13266d = getString(R.string.please_enter_new_password);
        return toolbarStatus;
    }

    public final void T0() {
        boolean z10 = D9.b.j0(requireContext(), String.valueOf(u0().f28593p.getText())).length() == 0 && f.b(String.valueOf(u0().f28593p.getText()), String.valueOf(u0().f28596s.getText()));
        u0().f28591n.setEnabled(z10);
        u0().f28592o.setEnabled(z10);
    }

    public final void U0() {
        u0().f28594q.setError(null);
        u0().f28595r.setError(null);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = (i) this.f11555o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        i iVar = (i) this.f11555o0.getValue();
        iVar.f1546Z0.observe(getViewLifecycleOwner(), new c(new C7.a(this, 3)));
        V3 u02 = u0();
        o.c(u02.f28591n, 500L, new H6.d(this, 0));
        V3 u03 = u0();
        o.c(u03.f28592o, 500L, new H6.d(this, 1));
        V3 u04 = u0();
        u04.f28593p.addTextChangedListener(new a());
        V3 u05 = u0();
        u05.f28596s.addTextChangedListener(new b());
        T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11554n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f28591n.setVisibility(0);
        o.b(u0().f28592o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f28591n);
        u0().f28592o.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            ForgotPasswordFragment forgotPasswordFragment = ForgotPasswordFragment.this;
            forgotPasswordFragment.U0();
            forgotPasswordFragment.T0();
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
            ForgotPasswordFragment forgotPasswordFragment = ForgotPasswordFragment.this;
            forgotPasswordFragment.U0();
            forgotPasswordFragment.T0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
