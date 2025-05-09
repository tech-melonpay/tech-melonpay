package com.luminary.business.presentation.ui.fragments.newcard.confirmorder;

import A7.c;
import A8.e;
import F8.o;
import M6.j;
import O9.p;
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
import com.luminary.business.presentation.ui.fragments.newcard.confirmorder.ConfirmOrderFragment;
import com.luminary.business.presentation.ui.fragments.newcard.confirmorder.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.AbstractC1372k3;

/* compiled from: ConfirmOrderFragment.kt */
/* loaded from: classes2.dex */
public final class ConfirmOrderFragment extends BaseFragment<AbstractC1372k3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12406n0 = R.layout.fragment_confirm_order;

    /* renamed from: o0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.newcard.confirmorder.a f12407o0;

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f12408p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f12409q0;

    /* compiled from: ConfirmOrderFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12414a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f12414a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12414a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12414a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcard.confirmorder.ConfirmOrderFragment$special$$inlined$viewModel$default$1] */
    public ConfirmOrderFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcard.confirmorder.ConfirmOrderFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12408p0 = E.a(this, h.a(K7.d.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcard.confirmorder.ConfirmOrderFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcard.confirmorder.ConfirmOrderFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(K7.d.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.confirm_order);
        toolbarStatus.f13265c = 28;
        toolbarStatus.i = new e(Integer.valueOf(R.drawable.ic_close), null, null, false, null, null, null, new M7.b(this, 1), 124);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12407o0 = a.C0132a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        H1.a aVar = this.f12408p0;
        final int i9 = 0;
        ((K7.d) aVar.getValue()).f426S0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: M7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmOrderFragment f2726b;

            {
                this.f2726b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        this.f2726b.getClass();
                        break;
                    default:
                        ConfirmOrderFragment confirmOrderFragment = this.f2726b;
                        com.luminary.business.presentation.ui.fragments.newcard.confirmorder.a aVar2 = confirmOrderFragment.f12407o0;
                        if (aVar2 != null) {
                            BottomDialogType.a aVar3 = BottomDialogType.f13289k;
                            confirmOrderFragment.requireContext();
                            aVar3.getClass();
                            BottomDialogType d10 = BottomDialogType.a.d();
                            d10.f13297c = confirmOrderFragment.getString(R.string.done);
                            if (aVar2.f12416b == 0) {
                                d10.f13295a = confirmOrderFragment.getString(R.string.your_debit_card_is_on_its_way);
                                d10.f13301g = null;
                            } else {
                                d10.f13295a = confirmOrderFragment.getString(R.string.your_virtual_card_is_active);
                                d10.f13301g = BottomDialogType.Type.CARD;
                            }
                            confirmOrderFragment.w0().c(d10, new b(confirmOrderFragment, 2), null);
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        com.luminary.business.presentation.ui.fragments.newcard.confirmorder.a aVar2 = this.f12407o0;
        if (aVar2 != null) {
            u0().f29188q.setText(getString(R.string.cosmos_black));
            u0().f29185n.setText(aVar2.f12417c);
            AbstractC1372k3 u02 = u0();
            int i10 = aVar2.f12416b;
            u02.f29191t.setText(i10 == 0 ? getString(R.string.virtual) : getString(R.string.physical));
            if (i10 == 0) {
                requireContext();
                i = R.drawable.img_card_physical_black_luminary;
            } else {
                requireContext();
                i = R.drawable.img_card_virtual_luminary;
            }
            if (i10 == 0) {
                o.b(u0().f29188q);
                o.b(u0().f29189r);
            } else {
                u0().f29188q.setVisibility(0);
                u0().f29189r.setVisibility(0);
            }
            u0().f29190s.setImageResource(i);
            o.c(u0().f29186o, 500L, new c(6, this, aVar2));
            o.c(u0().f29187p, 500L, new M7.b(this, 0));
        }
        final int i11 = 1;
        ((K7.d) aVar.getValue()).f2271a1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: M7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmOrderFragment f2726b;

            {
                this.f2726b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        this.f2726b.getClass();
                        break;
                    default:
                        ConfirmOrderFragment confirmOrderFragment = this.f2726b;
                        com.luminary.business.presentation.ui.fragments.newcard.confirmorder.a aVar22 = confirmOrderFragment.f12407o0;
                        if (aVar22 != null) {
                            BottomDialogType.a aVar3 = BottomDialogType.f13289k;
                            confirmOrderFragment.requireContext();
                            aVar3.getClass();
                            BottomDialogType d10 = BottomDialogType.a.d();
                            d10.f13297c = confirmOrderFragment.getString(R.string.done);
                            if (aVar22.f12416b == 0) {
                                d10.f13295a = confirmOrderFragment.getString(R.string.your_debit_card_is_on_its_way);
                                d10.f13301g = null;
                            } else {
                                d10.f13295a = confirmOrderFragment.getString(R.string.your_virtual_card_is_active);
                                d10.f13301g = BottomDialogType.Type.CARD;
                            }
                            confirmOrderFragment.w0().c(d10, new b(confirmOrderFragment, 2), null);
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        u0().f29192u.setOnScrollChangeListener(new j(this, 1));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12406n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f29186o.setVisibility(0);
        o.b(u0().f29187p);
        this.f12409q0 = false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        u0().f29186o.setVisibility(4);
        u0().f29187p.setVisibility(0);
        this.f12409q0 = true;
    }
}
