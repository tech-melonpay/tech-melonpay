package com.luminary.business.presentation.ui.fragments.edit_account;

import D7.e;
import F8.g;
import F8.o;
import Fa.h;
import J8.c;
import O9.p;
import U4.b;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.account.AccountDetailsUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.edit_account.EditAccountFragment;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.Map;
import ka.C0969n;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import t6.O3;
import u7.C1522a;
import v7.C1548b;

/* compiled from: EditAccountFragment.kt */
/* loaded from: classes2.dex */
public final class EditAccountFragment extends BaseFragment<O3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12201n0 = R.layout.fragment_edit_account;

    /* renamed from: o0, reason: collision with root package name */
    public final h f12202o0 = new h(kotlin.jvm.internal.h.a(C1548b.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.edit_account.EditAccountFragment$special$$inlined$navArgs$1
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
    public final H1.a f12203p0;

    /* compiled from: EditAccountFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12210a;

        public b(C1522a c1522a) {
            this.f12210a = c1522a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12210a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12210a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.edit_account.EditAccountFragment$special$$inlined$viewModel$default$1] */
    public EditAccountFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.edit_account.EditAccountFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12203p0 = E.a(this, kotlin.jvm.internal.h.a(v7.d.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.edit_account.EditAccountFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.edit_account.EditAccountFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(v7.d.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.rename_account);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.rename_account);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = (v7.d) this.f12203p0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        AccountDetailsUI accountDetailsUI = ((C1548b) this.f12202o0.getValue()).f30661a;
        u0().f28268n.setText(F8.a.a(accountDetailsUI));
        u0().f28276v.setText(accountDetailsUI.i);
        u0().f28274t.setText(accountDetailsUI.i);
        Context requireContext = requireContext();
        String str2 = null;
        String str3 = accountDetailsUI.f11171h;
        Integer M8 = str3 != null ? D9.b.M(requireContext, str3) : null;
        if (M8 != null) {
            u0().f28271q.setImageResource(M8.intValue());
        }
        Map<String, AccountDetailsUI.ProviderRequisiteUI> map = accountDetailsUI.f11169f;
        if (map != null) {
            str = null;
            for (Map.Entry<String, AccountDetailsUI.ProviderRequisiteUI> entry : map.entrySet()) {
                String str4 = entry.getValue().f11178c;
                if (str4 != null && str4.length() != 0) {
                    str2 = entry.getValue().f11178c;
                }
                String str5 = entry.getValue().f11179d;
                if (str5 != null && str5.length() != 0) {
                    str = entry.getValue().f11179d;
                }
            }
        } else {
            str = null;
        }
        if (str2 == null || str2.length() == 0) {
            o.b(u0().f28272r);
            o.b(u0().f28277w);
        } else {
            u0().f28272r.setText(D9.b.B0(getString(R.string.sort_code)));
            u0().f28277w.setText(str2);
        }
        if (str == null || str.length() == 0) {
            o.b(u0().f28273s);
            o.b(u0().f28278x);
        } else {
            u0().f28273s.setText(D9.b.B0(getString(R.string.account_number)));
            u0().f28278x.setText(str);
        }
        u0().f28276v.addTextChangedListener(new a());
        O3 u02 = u0();
        g.a(u02.f28276v, new c(16, u02, this));
        final int i = 0;
        o.c(u0().f28269o, 500L, new InterfaceC0635a(this) { // from class: v7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditAccountFragment f30660b;

            {
                this.f30660b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EditAccountFragment editAccountFragment = this.f30660b;
                        d dVar = (d) editAccountFragment.f12203p0.getValue();
                        e eVar = new e(String.valueOf(((C1548b) editAccountFragment.f12202o0.getValue()).f30661a.f11164a), C0969n.u0(String.valueOf(editAccountFragment.u0().f28276v.getText())).toString(), 9, dVar);
                        dVar.f418J0 = eVar;
                        eVar.invoke();
                        break;
                    default:
                        this.f30660b.u0().f28269o.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i9 = 1;
        o.c(u0().f28270p, 500L, new InterfaceC0635a(this) { // from class: v7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditAccountFragment f30660b;

            {
                this.f30660b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        EditAccountFragment editAccountFragment = this.f30660b;
                        d dVar = (d) editAccountFragment.f12203p0.getValue();
                        e eVar = new e(String.valueOf(((C1548b) editAccountFragment.f12202o0.getValue()).f30661a.f11164a), C0969n.u0(String.valueOf(editAccountFragment.u0().f28276v.getText())).toString(), 9, dVar);
                        dVar.f418J0 = eVar;
                        eVar.invoke();
                        break;
                    default:
                        this.f30660b.u0().f28269o.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        ((v7.d) this.f12203p0.getValue()).f30666V0.observe(getViewLifecycleOwner(), new b(new C1522a(this, 1)));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12201n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        CustomTextInputEditText customTextInputEditText = u0().f28276v;
        if (customTextInputEditText.isFocused()) {
            customTextInputEditText.clearFocus();
        }
        t0(false);
        s0();
        u0().f28269o.setVisibility(0);
        o.b(u0().f28270p);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f28269o);
        u0().f28270p.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            String valueOf = String.valueOf(charSequence);
            O3 u02 = EditAccountFragment.this.u0();
            if (((Boolean) D9.b.i0(valueOf).f23089a).booleanValue()) {
                u02.f28275u.setError(null);
            }
            boolean booleanValue = ((Boolean) D9.b.i0(valueOf).f23089a).booleanValue();
            Button button = u02.f28269o;
            button.setEnabled(booleanValue);
            u02.f28270p.setEnabled(button.isEnabled());
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
