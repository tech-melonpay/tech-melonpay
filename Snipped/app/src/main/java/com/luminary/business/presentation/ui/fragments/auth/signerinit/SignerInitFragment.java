package com.luminary.business.presentation.ui.fragments.auth.signerinit;

import C.v;
import F8.o;
import O9.p;
import Q6.c;
import U4.b;
import android.os.Bundle;
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
import com.luminary.business.presentation.ui.fragments.auth.signerinit.SignerInitFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.V5;

/* compiled from: SignerInitFragment.kt */
/* loaded from: classes2.dex */
public final class SignerInitFragment extends BaseFragment<V5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11723n0 = R.layout.fragment_signer_init;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11724o0;

    /* renamed from: p0, reason: collision with root package name */
    public String f11725p0;

    /* compiled from: SignerInitFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11730a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f11730a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11730a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11730a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.signerinit.SignerInitFragment$special$$inlined$viewModel$default$1] */
    public SignerInitFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.signerinit.SignerInitFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11724o0 = E.a(this, h.a(c.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.signerinit.SignerInitFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.signerinit.SignerInitFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(c.class), null, null, b.l(this));
            }
        });
        this.f11725p0 = "";
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.activate_account);
        toolbarStatus.f13266d = getString(R.string.copy_activation_code_and_paste_on_next_page);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H1.a aVar = this.f11724o0;
        final int i = 0;
        ((c) aVar.getValue()).f426S0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: Q6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignerInitFragment f3189b;

            {
                this.f3189b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        this.f3189b.getClass();
                        break;
                    case 1:
                        String str = (String) obj;
                        SignerInitFragment signerInitFragment = this.f3189b;
                        signerInitFragment.f11725p0 = str;
                        signerInitFragment.u0().f28602q.setText(str);
                        break;
                    default:
                        v.w(U4.b.g(this.f3189b), R.id.action_global_homeFragment);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i9 = 1;
        ((c) aVar.getValue()).f3193U0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: Q6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignerInitFragment f3189b;

            {
                this.f3189b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        this.f3189b.getClass();
                        break;
                    case 1:
                        String str = (String) obj;
                        SignerInitFragment signerInitFragment = this.f3189b;
                        signerInitFragment.f11725p0 = str;
                        signerInitFragment.u0().f28602q.setText(str);
                        break;
                    default:
                        v.w(U4.b.g(this.f3189b), R.id.action_global_homeFragment);
                        break;
                }
                return p.f3034a;
            }
        }));
        c cVar = (c) aVar.getValue();
        final int i10 = 2;
        cVar.f3194V0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: Q6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignerInitFragment f3189b;

            {
                this.f3189b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        this.f3189b.getClass();
                        break;
                    case 1:
                        String str = (String) obj;
                        SignerInitFragment signerInitFragment = this.f3189b;
                        signerInitFragment.f11725p0 = str;
                        signerInitFragment.u0().f28602q.setText(str);
                        break;
                    default:
                        v.w(U4.b.g(this.f3189b), R.id.action_global_homeFragment);
                        break;
                }
                return p.f3034a;
            }
        }));
        u0().f28602q.setEnabled(false);
        u0().f28599n.setEnabled(false);
        u0().f28600o.setEnabled(false);
        V5 u02 = u0();
        final int i11 = 0;
        o.c(u02.f28601p, 500L, new InterfaceC0635a(this) { // from class: Q6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignerInitFragment f3191b;

            {
                this.f3191b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        SignerInitFragment signerInitFragment = this.f3191b;
                        signerInitFragment.r0(signerInitFragment.f11725p0);
                        signerInitFragment.u0().f28599n.setEnabled(true);
                        signerInitFragment.u0().f28600o.setEnabled(true);
                        signerInitFragment.u0().f28601p.setText(R.string.copied);
                        break;
                    default:
                        this.f3191b.u0().f28599n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        V5 u03 = u0();
        final int i12 = 1;
        o.c(u03.f28600o, 500L, new InterfaceC0635a(this) { // from class: Q6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignerInitFragment f3191b;

            {
                this.f3191b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        SignerInitFragment signerInitFragment = this.f3191b;
                        signerInitFragment.r0(signerInitFragment.f11725p0);
                        signerInitFragment.u0().f28599n.setEnabled(true);
                        signerInitFragment.u0().f28600o.setEnabled(true);
                        signerInitFragment.u0().f28601p.setText(R.string.copied);
                        break;
                    default:
                        this.f3191b.u0().f28599n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11723n0;
    }
}
