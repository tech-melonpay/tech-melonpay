package com.luminary.business.presentation.ui.fragments.cards.rename_card;

import F8.i;
import F8.o;
import Fa.h;
import O9.p;
import U4.b;
import Y6.e;
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
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.rename_card.RenameCardFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import ka.C0969n;
import kotlin.jvm.internal.f;
import t5.g;
import t6.A5;

/* compiled from: RenameCardFragment.kt */
/* loaded from: classes2.dex */
public final class RenameCardFragment extends BaseFragment<A5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11812n0 = R.layout.fragment_rename_card;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11813o0;

    /* renamed from: p0, reason: collision with root package name */
    public final h f11814p0;

    /* compiled from: FragmentExt.kt */
    public static final class b implements InterfaceC0646l<VaultDomain, p> {
        public b() {
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(VaultDomain vaultDomain) {
            VaultDomain vaultDomain2 = vaultDomain;
            RenameCardFragment renameCardFragment = RenameCardFragment.this;
            VaultDomain vaultDomain3 = renameCardFragment.T0().f4106b;
            if (vaultDomain3 != null) {
                vaultDomain3.f10781d = vaultDomain2.f10781d;
            }
            renameCardFragment.getParentFragmentManager().f0("edit", t0.c.a());
            U4.b.g(renameCardFragment).l();
            return p.f3034a;
        }
    }

    /* compiled from: FragmentExt.kt */
    public static final class c implements InterfaceC0646l<p, p> {
        public c() {
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(p pVar) {
            U4.b.g(RenameCardFragment.this).l();
            return p.f3034a;
        }
    }

    /* compiled from: RenameCardFragment.kt */
    public static final class d implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11823a;

        public d(C7.a aVar) {
            this.f11823a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11823a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11823a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.cards.rename_card.RenameCardFragment$special$$inlined$viewModel$default$1] */
    public RenameCardFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.cards.rename_card.RenameCardFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11813o0 = E.a(this, kotlin.jvm.internal.h.a(e.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.cards.rename_card.RenameCardFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.cards.rename_card.RenameCardFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(e.class), null, null, b.l(this));
            }
        });
        this.f11814p0 = new h(kotlin.jvm.internal.h.a(Y6.b.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.cards.rename_card.RenameCardFragment$special$$inlined$navArgs$1
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
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = D9.b.B0(getString(R.string.change_name));
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final Y6.b T0() {
        return (Y6.b) this.f11814p0.getValue();
    }

    public final e U0() {
        return (e) this.f11813o0.getValue();
    }

    public final void V0() {
        boolean z10;
        Editable text = u0().f27626p.getText();
        if (text == null || C0969n.i0(text)) {
            u0().f27627q.setErrorWithoutFocus(getString(R.string.empty_card_name));
        } else {
            int length = String.valueOf(u0().f27626p.getText()).length();
            Y6.b T02 = T0();
            if (length <= ((T02 != null ? T02.f4105a : null) != null ? 20 : 18)) {
                u0().f27627q.setError(null);
                z10 = true;
                u0().f27624n.setEnabled(!(C0969n.i0(String.valueOf(u0().f27626p.getText())) ^ true) && z10);
                u0().f27625o.setEnabled(u0().f27624n.isEnabled());
            }
            u0().f27627q.setErrorWithoutFocus(getString(R.string.too_many_characters));
        }
        z10 = false;
        u0().f27624n.setEnabled(!(C0969n.i0(String.valueOf(u0().f27626p.getText())) ^ true) && z10);
        u0().f27625o.setEnabled(u0().f27624n.isEnabled());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        U0().f426S0.observe(getViewLifecycleOwner(), new d(new C7.a(this, 14)));
        t0(false);
        final int i = 0;
        o.c(u0().f27624n, 500L, new InterfaceC0635a(this) { // from class: Y6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RenameCardFragment f4104b;

            {
                this.f4104b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                VaultDomain vaultDomain;
                CardsDomain cardsDomain;
                Integer num;
                switch (i) {
                    case 0:
                        RenameCardFragment renameCardFragment = this.f4104b;
                        b T02 = renameCardFragment.T0();
                        if (T02 != null && (cardsDomain = T02.f4105a) != null && (num = cardsDomain.f10724a) != null) {
                            final int intValue = num.intValue();
                            final e U02 = renameCardFragment.U0();
                            final String valueOf = String.valueOf(renameCardFragment.u0().f27626p.getText());
                            U02.getClass();
                            final int i9 = 0;
                            InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: Y6.c
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i9) {
                                        case 0:
                                            e eVar = U02;
                                            eVar.l();
                                            t5.f fVar = new t5.f(eVar.f4113T0.h(), intValue, valueOf);
                                            eVar.f4114U0.a(new d(eVar, 1), fVar);
                                            break;
                                        default:
                                            e eVar2 = U02;
                                            eVar2.l();
                                            g gVar = new g(eVar2.f4113T0.h(), intValue, valueOf);
                                            eVar2.f4115V0.a(new d(eVar2, 0), gVar);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            U02.f418J0 = interfaceC0635a;
                            interfaceC0635a.invoke();
                        }
                        b T03 = renameCardFragment.T0();
                        if (T03 != null && (vaultDomain = T03.f4106b) != null) {
                            final e U03 = renameCardFragment.U0();
                            final String valueOf2 = String.valueOf(renameCardFragment.u0().f27626p.getText());
                            U03.getClass();
                            final int i10 = vaultDomain.f10778a;
                            final int i11 = 1;
                            InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: Y6.c
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            e eVar = U03;
                                            eVar.l();
                                            t5.f fVar = new t5.f(eVar.f4113T0.h(), i10, valueOf2);
                                            eVar.f4114U0.a(new d(eVar, 1), fVar);
                                            break;
                                        default:
                                            e eVar2 = U03;
                                            eVar2.l();
                                            g gVar = new g(eVar2.f4113T0.h(), i10, valueOf2);
                                            eVar2.f4115V0.a(new d(eVar2, 0), gVar);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            U03.f419K0 = interfaceC0635a2;
                            interfaceC0635a2.invoke();
                        }
                        break;
                    default:
                        this.f4104b.u0().f27624n.performClick();
                        break;
                }
                return p.f3034a;
            }
        });
        Y6.b T02 = T0();
        if ((T02 != null ? T02.f4105a : null) != null) {
            u0().f27627q.setHint(getString(R.string.card_name));
            A5 u02 = u0();
            CardsDomain cardsDomain = T0().f4105a;
            u02.f27626p.setText(cardsDomain != null ? cardsDomain.f10727d : null);
        } else {
            u0().f27627q.setHint(getString(R.string.vault_name));
            A5 u03 = u0();
            VaultDomain vaultDomain = T0().f4106b;
            u03.f27626p.setText(vaultDomain != null ? vaultDomain.f10781d : null);
        }
        final int i9 = 1;
        o.c(u0().f27625o, 500L, new InterfaceC0635a(this) { // from class: Y6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RenameCardFragment f4104b;

            {
                this.f4104b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                VaultDomain vaultDomain2;
                CardsDomain cardsDomain2;
                Integer num;
                switch (i9) {
                    case 0:
                        RenameCardFragment renameCardFragment = this.f4104b;
                        b T022 = renameCardFragment.T0();
                        if (T022 != null && (cardsDomain2 = T022.f4105a) != null && (num = cardsDomain2.f10724a) != null) {
                            final int intValue = num.intValue();
                            final e U02 = renameCardFragment.U0();
                            final String valueOf = String.valueOf(renameCardFragment.u0().f27626p.getText());
                            U02.getClass();
                            final int i92 = 0;
                            InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: Y6.c
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i92) {
                                        case 0:
                                            e eVar = U02;
                                            eVar.l();
                                            t5.f fVar = new t5.f(eVar.f4113T0.h(), intValue, valueOf);
                                            eVar.f4114U0.a(new d(eVar, 1), fVar);
                                            break;
                                        default:
                                            e eVar2 = U02;
                                            eVar2.l();
                                            g gVar = new g(eVar2.f4113T0.h(), intValue, valueOf);
                                            eVar2.f4115V0.a(new d(eVar2, 0), gVar);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            U02.f418J0 = interfaceC0635a;
                            interfaceC0635a.invoke();
                        }
                        b T03 = renameCardFragment.T0();
                        if (T03 != null && (vaultDomain2 = T03.f4106b) != null) {
                            final e U03 = renameCardFragment.U0();
                            final String valueOf2 = String.valueOf(renameCardFragment.u0().f27626p.getText());
                            U03.getClass();
                            final int i10 = vaultDomain2.f10778a;
                            final int i11 = 1;
                            InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: Y6.c
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            e eVar = U03;
                                            eVar.l();
                                            t5.f fVar = new t5.f(eVar.f4113T0.h(), i10, valueOf2);
                                            eVar.f4114U0.a(new d(eVar, 1), fVar);
                                            break;
                                        default:
                                            e eVar2 = U03;
                                            eVar2.l();
                                            g gVar = new g(eVar2.f4113T0.h(), i10, valueOf2);
                                            eVar2.f4115V0.a(new d(eVar2, 0), gVar);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            U03.f419K0 = interfaceC0635a2;
                            interfaceC0635a2.invoke();
                        }
                        break;
                    default:
                        this.f4104b.u0().f27624n.performClick();
                        break;
                }
                return p.f3034a;
            }
        });
        u0().f27626p.addTextChangedListener(new a());
        U0().f4117X0.observe(getViewLifecycleOwner(), new i(new b()));
        U0().f4116W0.observe(getViewLifecycleOwner(), new i(new c()));
        V0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11812n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        u0().f27624n.setVisibility(0);
        o.b(u0().f27625o);
        t0(true);
        s0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        o.b(u0().f27624n);
        u0().f27625o.setVisibility(0);
        p0(true);
        B0();
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RenameCardFragment.this.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
