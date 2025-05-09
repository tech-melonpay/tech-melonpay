package com.luminary.business.presentation.ui.fragments.auth.forgotpassword;

import F8.o;
import H6.i;
import H6.j;
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
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.C5;

/* compiled from: ResetPasswordFragment.kt */
/* loaded from: classes2.dex */
public final class ResetPasswordFragment extends BaseFragment<C5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11565n0 = R.layout.fragment_reset_password;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11566o0;

    /* compiled from: ResetPasswordFragment.kt */
    public static final class d implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11574a;

        public d(C7.a aVar) {
            this.f11574a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11574a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11574a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ResetPasswordFragment$special$$inlined$viewModel$default$1] */
    public ResetPasswordFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ResetPasswordFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11566o0 = E.a(this, h.a(i.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ResetPasswordFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ResetPasswordFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(i.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.change_password);
        return toolbarStatus;
    }

    public final void T0(String str, String str2, String str3) {
        boolean z10 = false;
        u0().f27692n.setEnabled(str.length() > 0 && str2.length() > 0 && str3.length() > 0);
        C5 u02 = u0();
        if (str.length() > 0 && str2.length() > 0 && str3.length() > 0) {
            z10 = true;
        }
        u02.f27693o.setEnabled(z10);
    }

    public final void U0() {
        u0().f27695q.setError(null);
        u0().f27696r.setError(null);
        u0().f27698t.setError(null);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        T0(String.valueOf(u0().f27694p.getText()), String.valueOf(u0().f27697s.getText()), String.valueOf(u0().f27699u.getText()));
        i iVar = (i) this.f11566o0.getValue();
        iVar.f1546Z0.observe(getViewLifecycleOwner(), new d(new C7.a(this, 4)));
        C5 u02 = u0();
        o.c(u02.f27692n, 500L, new j(this, 0));
        C5 u03 = u0();
        o.c(u03.f27693o, 500L, new j(this, 1));
        C5 u04 = u0();
        u04.f27694p.addTextChangedListener(new a());
        C5 u05 = u0();
        u05.f27697s.addTextChangedListener(new b());
        C5 u06 = u0();
        u06.f27699u.addTextChangedListener(new c());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11565n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f27692n.setVisibility(0);
        o.b(u0().f27693o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f27692n);
        u0().f27693o.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            ResetPasswordFragment resetPasswordFragment = ResetPasswordFragment.this;
            resetPasswordFragment.T0(String.valueOf(resetPasswordFragment.u0().f27694p.getText()), String.valueOf(resetPasswordFragment.u0().f27697s.getText()), String.valueOf(resetPasswordFragment.u0().f27699u.getText()));
            resetPasswordFragment.U0();
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
            ResetPasswordFragment resetPasswordFragment = ResetPasswordFragment.this;
            resetPasswordFragment.T0(String.valueOf(resetPasswordFragment.u0().f27694p.getText()), String.valueOf(resetPasswordFragment.u0().f27697s.getText()), String.valueOf(resetPasswordFragment.u0().f27699u.getText()));
            resetPasswordFragment.U0();
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
            ResetPasswordFragment resetPasswordFragment = ResetPasswordFragment.this;
            resetPasswordFragment.T0(String.valueOf(resetPasswordFragment.u0().f27694p.getText()), String.valueOf(resetPasswordFragment.u0().f27697s.getText()), String.valueOf(resetPasswordFragment.u0().f27699u.getText()));
            resetPasswordFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
