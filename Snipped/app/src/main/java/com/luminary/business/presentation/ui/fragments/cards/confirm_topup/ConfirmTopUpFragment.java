package com.luminary.business.presentation.ui.fragments.cards.confirm_topup;

import F8.o;
import Fa.h;
import U4.b;
import V6.e;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cards.TopUpCommissionDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import t6.AbstractC1388m3;

/* compiled from: ConfirmTopUpFragment.kt */
/* loaded from: classes2.dex */
public final class ConfirmTopUpFragment extends BaseFragment<AbstractC1388m3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11777n0 = R.layout.fragment_confirm_topup;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11778o0;

    /* renamed from: p0, reason: collision with root package name */
    public final h f11779p0;

    /* compiled from: ConfirmTopUpFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11785a;

        public a(C7.a aVar) {
            this.f11785a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11785a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11785a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.cards.confirm_topup.ConfirmTopUpFragment$special$$inlined$viewModel$default$1] */
    public ConfirmTopUpFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.cards.confirm_topup.ConfirmTopUpFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11778o0 = E.a(this, kotlin.jvm.internal.h.a(e.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.cards.confirm_topup.ConfirmTopUpFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.cards.confirm_topup.ConfirmTopUpFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(e.class), null, null, b.l(this));
            }
        });
        this.f11779p0 = new h(kotlin.jvm.internal.h.a(V6.b.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.cards.confirm_topup.ConfirmTopUpFragment$special$$inlined$navArgs$1
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
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.confirm_payment);
        toolbarStatus.f13265c = 28;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.confirm_payment);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final V6.b T0() {
        return (V6.b) this.f11779p0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = (e) this.f11778o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Integer M8;
        super.onViewCreated(view, bundle);
        AbstractC1388m3 u02 = u0();
        VaultDomain vaultDomain = T0().f3730b;
        if (vaultDomain != null && (str2 = vaultDomain.f10782e) != null && (M8 = D9.b.M(requireContext(), str2)) != null) {
            u02.f29313q.setImageResource(M8.intValue());
        }
        String v10 = D9.b.v(new BigDecimal(T0().f3734f).toPlainString());
        String plainString = new BigDecimal(T0().f3734f).toPlainString();
        VaultDomain vaultDomain2 = T0().f3730b;
        String u6 = D9.b.u(plainString, vaultDomain2 != null ? vaultDomain2.f10782e : null);
        VaultDomain vaultDomain3 = T0().f3730b;
        u02.f29310n.setText(D9.b.v0("", v10, u6, vaultDomain3 != null ? vaultDomain3.f10782e : null, 28, 20, false, false, false, 384));
        BankAccountDomain bankAccountDomain = T0().f3731c;
        TextView textView = u02.f29319w;
        TextView textView2 = u02.f29318v;
        TextView textView3 = u02.f29317u;
        TextView textView4 = u02.f29316t;
        if (bankAccountDomain != null) {
            TopUpCommissionDomain topUpCommissionDomain = T0().f3733e;
            textView4.setText(topUpCommissionDomain != null ? topUpCommissionDomain.f10777c : null);
            textView3.setText(bankAccountDomain.i);
            VaultDomain vaultDomain4 = T0().f3730b;
            textView2.setText(vaultDomain4 != null ? vaultDomain4.f10781d : null);
            TopUpCommissionDomain topUpCommissionDomain2 = T0().f3733e;
            String plainString2 = topUpCommissionDomain2 != null ? new BigDecimal(String.valueOf(topUpCommissionDomain2.f10775a)).toPlainString() : null;
            TopUpCommissionDomain topUpCommissionDomain3 = T0().f3733e;
            String str3 = topUpCommissionDomain3 != null ? topUpCommissionDomain3.f10776b : null;
            if (plainString2 != null) {
                TopUpCommissionDomain topUpCommissionDomain4 = T0().f3733e;
                str = D9.b.I(plainString2, topUpCommissionDomain4 != null ? topUpCommissionDomain4.f10776b : null);
            } else {
                str = null;
            }
            textView.setText(D9.b.o(str3, str));
        }
        VaultDomain vaultDomain5 = T0().f3732d;
        if (vaultDomain5 != null) {
            textView4.setText(getString(R.string.instant).toUpperCase(Locale.ROOT));
            textView3.setText(vaultDomain5.f10781d);
            VaultDomain vaultDomain6 = T0().f3730b;
            textView2.setText(vaultDomain6 != null ? vaultDomain6.f10781d : null);
            o.b(textView);
            o.b(u02.f29314r);
        }
        ((e) this.f11778o0.getValue()).f3746W0.observe(getViewLifecycleOwner(), new a(new C7.a(this, 12)));
        o.c(u0().f29311o, 500L, new V6.a(this, 0));
        o.c(u0().f29312p, 500L, new V6.a(this, 1));
        AbstractC1388m3 u03 = u0();
        VaultDomain vaultDomain7 = T0().f3730b;
        u03.f29315s.setText(D9.b.U(vaultDomain7 != null ? vaultDomain7.f10781d : null));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11777n0;
    }
}
