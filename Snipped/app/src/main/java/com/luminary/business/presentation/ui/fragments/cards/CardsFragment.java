package com.luminary.business.presentation.ui.fragments.cards;

import A8.e;
import C.v;
import F8.i;
import F8.o;
import O9.p;
import T6.c;
import T6.g;
import U4.b;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import t6.AbstractC1292a3;

/* compiled from: CardsFragment.kt */
/* loaded from: classes2.dex */
public final class CardsFragment extends BaseFragment<AbstractC1292a3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11762n0 = R.layout.fragment_cards;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f11763o0 = true;

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f11764p0;

    /* renamed from: q0, reason: collision with root package name */
    public CardsController f11765q0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CardsFragment.kt */
    public static final class CardsTab {

        /* renamed from: a, reason: collision with root package name */
        public static final CardsTab f11770a;

        /* renamed from: b, reason: collision with root package name */
        public static final CardsTab f11771b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ CardsTab[] f11772c;

        static {
            CardsTab cardsTab = new CardsTab("Virtual", 0);
            f11770a = cardsTab;
            CardsTab cardsTab2 = new CardsTab("Physical", 1);
            f11771b = cardsTab2;
            f11772c = new CardsTab[]{cardsTab, cardsTab2};
        }

        public CardsTab() {
            throw null;
        }

        public static CardsTab valueOf(String str) {
            return (CardsTab) Enum.valueOf(CardsTab.class, str);
        }

        public static CardsTab[] values() {
            return (CardsTab[]) f11772c.clone();
        }
    }

    /* compiled from: FragmentExt.kt */
    public static final class a implements InterfaceC0646l<List<? extends VaultDomain>, p> {
        public a() {
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(List<? extends VaultDomain> list) {
            List<? extends VaultDomain> list2 = list;
            CardsFragment cardsFragment = CardsFragment.this;
            cardsFragment.u0().f28793q.setRefreshing(false);
            AbstractC1292a3 u02 = cardsFragment.u0();
            boolean isEmpty = list2.isEmpty();
            o.i(u02.f28791o, isEmpty);
            o.i(u02.f28790n, isEmpty);
            cardsFragment.L0();
            CardsController cardsController = cardsFragment.f11765q0;
            if (cardsController == null) {
                cardsController = null;
            }
            cardsController.setData(list2);
            CardsController cardsController2 = cardsFragment.f11765q0;
            u02.f28792p.setAdapter((cardsController2 != null ? cardsController2 : null).getAdapter());
            return p.f3034a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.luminary.business.presentation.ui.fragments.cards.CardsFragment$special$$inlined$viewModel$default$1] */
    public CardsFragment() {
        CardsTab cardsTab = CardsTab.f11770a;
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.cards.CardsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11764p0 = E.a(this, h.a(g.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.cards.CardsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.cards.CardsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(g.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13267e = false;
        toolbarStatus.f13263a = getString(R.string.card_vault);
        toolbarStatus.f13265c = 28;
        toolbarStatus.f13281t = Boolean.FALSE;
        List<VaultDomain> value = T0().f3575V0.getValue();
        if (value != null && !value.isEmpty()) {
            toolbarStatus.f13269g = new e(Integer.valueOf(R.drawable.ic_white_card), null, Boolean.TRUE, false, Integer.valueOf(R.drawable.bg_main_color_900), null, null, new c(this, 0), 104);
        }
        toolbarStatus.i = new e(Integer.valueOf(R.drawable.ic_create_vault), null, Boolean.TRUE, false, Integer.valueOf(R.drawable.bg_main_color_900), null, null, new c(this, 1), 104);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13267e = false;
        toolbarStatus.f13263a = getString(R.string.card_vault);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final g T0() {
        return (g) this.f11764p0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC1292a3 u02 = u0();
        o.c(u02.f28790n, 500L, new c(this, 2));
        final int i = 0;
        final int i9 = 1;
        this.f11765q0 = new CardsController(requireContext(), new InterfaceC0646l(this) { // from class: T6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsFragment f3559b;

            {
                this.f3559b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                Object obj3;
                int i10 = i;
                int intValue = ((Integer) obj).intValue();
                switch (i10) {
                    case 0:
                        CardsFragment cardsFragment = this.f3559b;
                        List<VaultDomain> value = cardsFragment.T0().f3575V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (((VaultDomain) obj2).f10778a == intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            Serializable serializable = (VaultDomain) obj2;
                            if (serializable != null) {
                                NavController g10 = U4.b.g(cardsFragment);
                                Bundle g11 = v.g(g10);
                                if (Parcelable.class.isAssignableFrom(VaultDomain.class)) {
                                    g11.putParcelable("vault", (Parcelable) serializable);
                                } else {
                                    if (!Serializable.class.isAssignableFrom(VaultDomain.class)) {
                                        throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                    }
                                    g11.putSerializable("vault", serializable);
                                }
                                g10.i(R.id.action_cardsFragment_to_cardDetailsFragment, g11);
                            }
                        }
                        return p.f3034a;
                    default:
                        CardsFragment cardsFragment2 = this.f3559b;
                        List<VaultDomain> value2 = cardsFragment2.T0().f3575V0.getValue();
                        if (value2 != null) {
                            Iterator<T> it2 = value2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    if (((VaultDomain) obj3).f10778a == intValue) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            VaultDomain vaultDomain = (VaultDomain) obj3;
                            if (vaultDomain != null) {
                                U4.b.g(cardsFragment2).j(new d(vaultDomain));
                            }
                        }
                        return p.f3034a;
                }
            }
        }, new InterfaceC0646l(this) { // from class: T6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardsFragment f3559b;

            {
                this.f3559b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                Object obj3;
                int i10 = i9;
                int intValue = ((Integer) obj).intValue();
                switch (i10) {
                    case 0:
                        CardsFragment cardsFragment = this.f3559b;
                        List<VaultDomain> value = cardsFragment.T0().f3575V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (((VaultDomain) obj2).f10778a == intValue) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            Serializable serializable = (VaultDomain) obj2;
                            if (serializable != null) {
                                NavController g10 = U4.b.g(cardsFragment);
                                Bundle g11 = v.g(g10);
                                if (Parcelable.class.isAssignableFrom(VaultDomain.class)) {
                                    g11.putParcelable("vault", (Parcelable) serializable);
                                } else {
                                    if (!Serializable.class.isAssignableFrom(VaultDomain.class)) {
                                        throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                    }
                                    g11.putSerializable("vault", serializable);
                                }
                                g10.i(R.id.action_cardsFragment_to_cardDetailsFragment, g11);
                            }
                        }
                        return p.f3034a;
                    default:
                        CardsFragment cardsFragment2 = this.f3559b;
                        List<VaultDomain> value2 = cardsFragment2.T0().f3575V0.getValue();
                        if (value2 != null) {
                            Iterator<T> it2 = value2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    if (((VaultDomain) obj3).f10778a == intValue) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            VaultDomain vaultDomain = (VaultDomain) obj3;
                            if (vaultDomain != null) {
                                U4.b.g(cardsFragment2).j(new d(vaultDomain));
                            }
                        }
                        return p.f3034a;
                }
            }
        });
        T0().f3575V0.observe(getViewLifecycleOwner(), new i(new a()));
        g T02 = T0();
        A8.b bVar = new A8.b(T02, 12);
        T02.f418J0 = bVar;
        bVar.invoke();
        AbstractC1292a3 u03 = u0();
        u03.f28793q.setOnRefreshListener(new A0.b(this, 17));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11762n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean x0() {
        return this.f11763o0;
    }
}
