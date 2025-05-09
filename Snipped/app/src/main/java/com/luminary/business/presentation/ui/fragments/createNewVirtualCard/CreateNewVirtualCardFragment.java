package com.luminary.business.presentation.ui.fragments.createNewVirtualCard;

import F8.i;
import F8.o;
import Fa.h;
import U4.b;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.cards.CardCreateType;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.InfoView;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import e7.C0721a;
import e7.C0722b;
import e7.C0723c;
import e7.C0725e;
import e7.C0726f;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import t6.A3;

/* compiled from: CreateNewVirtualCardFragment.kt */
/* loaded from: classes2.dex */
public final class CreateNewVirtualCardFragment extends BaseFragment<A3> {

    /* renamed from: n0, reason: collision with root package name */
    public final H1.a f11916n0;

    /* renamed from: o0, reason: collision with root package name */
    public final h f11917o0;

    /* renamed from: p0, reason: collision with root package name */
    public CardCreateType f11918p0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.luminary.business.presentation.ui.fragments.createNewVirtualCard.CreateNewVirtualCardFragment$special$$inlined$viewModel$default$1] */
    public CreateNewVirtualCardFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.createNewVirtualCard.CreateNewVirtualCardFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11916n0 = E.a(this, kotlin.jvm.internal.h.a(C0726f.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.createNewVirtualCard.CreateNewVirtualCardFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.createNewVirtualCard.CreateNewVirtualCardFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(C0726f.class), null, null, b.l(this));
            }
        });
        this.f11917o0 = new h(kotlin.jvm.internal.h.a(C0723c.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.createNewVirtualCard.CreateNewVirtualCardFragment$special$$inlined$navArgs$1
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
        this.f11918p0 = CardCreateType.f10750b;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.create_virtual_card);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 28;
        return toolbarStatus;
    }

    public final C0723c T0() {
        return (C0723c) this.f11917o0.getValue();
    }

    public final C0726f U0() {
        return (C0726f) this.f11916n0.getValue();
    }

    public final void V0(String str) {
        u0().f27610s.setText(f.b(str, "Ads") ? getString(R.string.virtual_ads) : f.b(str, "Expenses") ? getString(R.string.virtual) : getString(R.string.virtual));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11918p0 = CardCreateType.valueOf(T0().f20541a);
        C0726f U02 = U0();
        U02.f20556Z0.observe(getViewLifecycleOwner(), new i(new C0722b(this, 0)));
        U02.f20560d1.observe(getViewLifecycleOwner(), new i(new C0722b(this, 1)));
        U02.f20561e1.observe(getViewLifecycleOwner(), new i(new C0722b(this, 2)));
        A3 u02 = u0();
        int ordinal = this.f11918p0.ordinal();
        CustomTextInputLayout customTextInputLayout = u02.f27611t;
        InfoView infoView = u02.f27609r;
        if (ordinal == 0) {
            infoView.setVisibility(0);
            infoView.setInfoText(T0().f20545e);
            o.b(customTextInputLayout);
            V0(T0().f20546f);
        } else if (ordinal == 1) {
            C0726f U03 = U0();
            int h9 = U03.f20550T0.h();
            U03.l();
            U03.f20551U0.a(new C0725e(U03, 0), String.valueOf(h9));
            o.b(infoView);
            customTextInputLayout.setVisibility(0);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C0726f U04 = U0();
            int h10 = U04.f20550T0.h();
            U04.l();
            U04.f20551U0.a(new C0725e(U04, 0), String.valueOf(h10));
            VaultDomain vaultDomain = T0().f20547g;
            if (vaultDomain != null) {
                U0().f20554X0 = vaultDomain;
                Integer num = vaultDomain.f10793q;
                if (num != null) {
                    U0().m(num.intValue());
                }
                String str = vaultDomain.f10781d;
                if (str != null) {
                    u02.f27612u.setText(str);
                }
            }
            customTextInputLayout.setVisibility(0);
        }
        A3 u03 = u0();
        o.c(u03.f27605n, 500L, new C0721a(u03, this));
        o.c(u03.f27606o, 500L, new A8.b(u03, 28));
        o.c(u03.f27612u, 500L, new C0721a(this, u03));
        String str2 = U0().f20557a1;
        u0().f27605n.setEnabled(str2.length() > 0 && str2.length() <= 20);
        u0().f27606o.setEnabled(u0().f27605n.isEnabled());
        u0().f27608q.addTextChangedListener(new a());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return R.layout.fragment_create_new_virtual_card;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f27605n.setVisibility(0);
        o.b(u0().f27606o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f27605n);
        u0().f27606o.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            CreateNewVirtualCardFragment createNewVirtualCardFragment = CreateNewVirtualCardFragment.this;
            createNewVirtualCardFragment.U0().f20557a1 = String.valueOf(charSequence);
            if (charSequence == null || C0969n.i0(charSequence)) {
                createNewVirtualCardFragment.u0().f27607p.setErrorWithoutFocus(createNewVirtualCardFragment.getString(R.string.empty_card_name));
            } else if (charSequence.toString().length() > 20) {
                createNewVirtualCardFragment.u0().f27607p.setErrorWithoutFocus(createNewVirtualCardFragment.getString(R.string.too_many_characters));
            } else {
                createNewVirtualCardFragment.u0().f27607p.setError(null);
            }
            if (createNewVirtualCardFragment.f11918p0 != CardCreateType.f10749a) {
                createNewVirtualCardFragment.U0().h0();
                return;
            }
            createNewVirtualCardFragment.u0().f27605n.setEnabled((C0969n.i0(String.valueOf(charSequence)) ^ true) && String.valueOf(charSequence).length() <= 20);
            createNewVirtualCardFragment.u0().f27606o.setEnabled((C0969n.i0(String.valueOf(charSequence)) ^ true) && String.valueOf(charSequence).length() <= 20);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
