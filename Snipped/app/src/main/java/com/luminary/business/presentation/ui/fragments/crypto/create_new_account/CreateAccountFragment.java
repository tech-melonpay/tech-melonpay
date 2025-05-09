package com.luminary.business.presentation.ui.fragments.crypto.create_new_account;

import F8.o;
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
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.List;
import k7.C0948a;
import k7.C0949b;
import k7.e;
import ka.C0969n;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.AbstractC1420q3;
import w5.C1572a;

/* compiled from: CreateAccountFragment.kt */
/* loaded from: classes2.dex */
public final class CreateAccountFragment extends BaseFragment<AbstractC1420q3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11989n0 = R.layout.fragment_create_account;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11990o0;

    /* renamed from: p0, reason: collision with root package name */
    public C1572a f11991p0;

    /* renamed from: q0, reason: collision with root package name */
    public final ArrayList f11992q0;

    /* compiled from: CreateAccountFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11997a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f11997a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11997a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11997a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.create_new_account.CreateAccountFragment$special$$inlined$viewModel$default$1] */
    public CreateAccountFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.create_new_account.CreateAccountFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11990o0 = E.a(this, h.a(e.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.create_new_account.CreateAccountFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.create_new_account.CreateAccountFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(e.class), null, null, b.l(this));
            }
        });
        this.f11992q0 = new ArrayList();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.add_new_cryptowallet);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.add_new_cryptowallet);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final ArrayList<String> T0() {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        C1572a c1572a = this.f11991p0;
        if (c1572a != null && (arrayList = c1572a.f30829d) != null) {
            for (String str : arrayList) {
                List<CryptoAccountDomain> value = U0().f23041Y0.getValue();
                if (value != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : value) {
                        CryptoAccountDomain cryptoAccountDomain = (CryptoAccountDomain) obj;
                        String str2 = cryptoAccountDomain.f10969g;
                        C1572a c1572a2 = this.f11991p0;
                        if (f.b(str2, c1572a2 != null ? c1572a2.f30827b : null) && f.b(str, cryptoAccountDomain.f10968f)) {
                            arrayList3.add(obj);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        arrayList2.add(str);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final e U0() {
        return (e) this.f11990o0.getValue();
    }

    public final void V0() {
        u0().f29509n.setEnabled(C0969n.u0(String.valueOf(u0().f29511p.getText())).toString().length() > 0 && String.valueOf(u0().f29513r.getText()).length() > 0);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        V0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer z10;
        super.onViewCreated(view, bundle);
        U0().f426S0.observe(getViewLifecycleOwner(), new a(new C0948a(this, 0)));
        U0().f23042Z0.observe(getViewLifecycleOwner(), new a(new C0948a(this, 1)));
        o.c(u0().f29511p, 500L, new C0949b(this, 0));
        o.c(u0().f29513r, 500L, new C0949b(this, 1));
        o.c(u0().f29509n, 500L, new C0949b(this, 2));
        o.c(u0().f29510o, 500L, new C0949b(this, 3));
        U0().f23040X0.observe(getViewLifecycleOwner(), new a(new Z3.a(14)));
        C1572a c1572a = this.f11991p0;
        if (c1572a == null || (str = c1572a.f30827b) == null || (z10 = D9.b.z(str)) == null) {
            return;
        }
        u0().f29512q.setImageResource(z10.intValue());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11989n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        u0().f29509n.setVisibility(0);
        o.b(u0().f29510o);
        t0(true);
        s0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        o.b(u0().f29509n);
        u0().f29510o.setVisibility(0);
        p0(true);
        B0();
    }
}
