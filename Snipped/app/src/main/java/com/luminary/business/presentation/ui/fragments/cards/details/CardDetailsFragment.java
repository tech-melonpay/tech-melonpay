package com.luminary.business.presentation.ui.fragments.cards.details;

import F8.i;
import F8.o;
import Fa.h;
import O9.p;
import P9.m;
import U4.b;
import W6.k;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.viewpager2.widget.ViewPager2;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment;
import com.luminary.business.presentation.ui.fragments.cards.details.card.CardFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.f;
import t6.S2;

/* compiled from: CardDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class CardDetailsFragment extends BaseFragment<S2> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11786n0 = R.layout.fragment_card_details;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11787o0;

    /* renamed from: p0, reason: collision with root package name */
    public final h f11788p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f11789q0;

    /* renamed from: r0, reason: collision with root package name */
    public W6.a f11790r0;
    public int s0;

    /* compiled from: FragmentExt.kt */
    public static final class a implements InterfaceC0646l<CardsDomain, p> {
        public a() {
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(CardsDomain cardsDomain) {
            Boolean bool;
            Boolean bool2;
            CardsDomain cardsDomain2 = cardsDomain;
            if (cardsDomain2 != null) {
                CardDetailsFragment cardDetailsFragment = CardDetailsFragment.this;
                D5.b bVar = cardsDomain2.f10735m;
                if (bVar != null && (bool2 = bVar.f918a) != null) {
                    boolean booleanValue = bool2.booleanValue();
                    S2 u02 = cardDetailsFragment.u0();
                    Iterator it = m.q(u02.f28468E, u02.f28464A, u02.f28483x).iterator();
                    while (it.hasNext()) {
                        CardDetailsFragment.V0((View) it.next(), booleanValue);
                    }
                }
                if (bVar != null && (bool = bVar.f920c) != null) {
                    boolean booleanValue2 = bool.booleanValue();
                    S2 u03 = cardDetailsFragment.u0();
                    Iterator it2 = m.q(u03.f28470G, u03.f28485z, u03.f28484y).iterator();
                    while (it2.hasNext()) {
                        CardDetailsFragment.V0((View) it2.next(), booleanValue2);
                    }
                }
            }
            return p.f3034a;
        }
    }

    /* compiled from: FragmentExt.kt */
    public static final class b implements InterfaceC0646l<z5.c, p> {
        public b() {
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(z5.c cVar) {
            z5.c cVar2 = cVar;
            if (cVar2 != null) {
                CardDetailsFragment cardDetailsFragment = CardDetailsFragment.this;
                if (cardDetailsFragment.s0 == 0) {
                    CardDetailsFragment.T0(cardDetailsFragment, cVar2.f31290e, cVar2.f31289d);
                } else {
                    CardDetailsFragment.T0(cardDetailsFragment, cVar2.f31299o, cVar2.f31298n);
                }
            }
            return p.f3034a;
        }
    }

    /* compiled from: CardDetailsFragment.kt */
    public static final class c implements TabLayout.d {
        public c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            int i = gVar != null ? gVar.f9855d : 0;
            CardDetailsFragment cardDetailsFragment = CardDetailsFragment.this;
            cardDetailsFragment.s0 = i;
            Integer valueOf = gVar != null ? Integer.valueOf(gVar.f9855d) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                z5.c value = cardDetailsFragment.X0().f3865c1.getValue();
                z5.b bVar = value != null ? value.f31289d : null;
                z5.c value2 = cardDetailsFragment.X0().f3865c1.getValue();
                CardDetailsFragment.T0(cardDetailsFragment, value2 != null ? value2.f31290e : null, bVar);
                return;
            }
            if (valueOf != null && valueOf.intValue() == 1) {
                z5.c value3 = cardDetailsFragment.X0().f3865c1.getValue();
                z5.b bVar2 = value3 != null ? value3.f31298n : null;
                z5.c value4 = cardDetailsFragment.X0().f3865c1.getValue();
                CardDetailsFragment.T0(cardDetailsFragment, value4 != null ? value4.f31299o : null, bVar2);
            }
        }
    }

    /* compiled from: CardDetailsFragment.kt */
    public static final class d extends ViewPager2.e {
        public d() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void onPageSelected(int i) {
            super.onPageSelected(i);
            CardDetailsFragment cardDetailsFragment = CardDetailsFragment.this;
            cardDetailsFragment.f11789q0 = i;
            W6.a aVar = cardDetailsFragment.f11790r0;
            if (aVar == null) {
                aVar = null;
            }
            for (Map.Entry entry : aVar.f3829n.entrySet()) {
                ((CardFragment) aVar.j(((Number) entry.getKey()).intValue())).f11804h0 = true;
                ((CardFragment) aVar.j(((Number) entry.getKey()).intValue())).p0();
            }
            cardDetailsFragment.U0(cardDetailsFragment.X0().m(cardDetailsFragment.f11789q0));
            W6.m X02 = cardDetailsFragment.X0();
            int i9 = cardDetailsFragment.f11789q0;
            List<CardsDomain> value = X02.f3863a1.getValue();
            CardsDomain cardsDomain = value != null ? value.get(i9) : null;
            Integer num = cardsDomain != null ? cardsDomain.f10724a : null;
            String valueOf = String.valueOf(X02.f3856T0.h());
            if (num != null) {
                X02.l();
                X02.f3862Z0.a(new k(X02, 3), new t5.d(valueOf, num.toString()));
                X02.f3861Y0.a(new k(X02, 4), new Pair(valueOf, num));
            }
        }
    }

    /* compiled from: CardDetailsFragment.kt */
    public static final class e implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11801a;

        public e(InterfaceC0646l interfaceC0646l) {
            this.f11801a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11801a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11801a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment$special$$inlined$viewModel$default$1] */
    public CardDetailsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11787o0 = E.a(this, kotlin.jvm.internal.h.a(W6.m.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(W6.m.class), null, null, b.l(this));
            }
        });
        this.f11788p0 = new h(kotlin.jvm.internal.h.a(W6.d.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment$special$$inlined$navArgs$1
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
        kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<K5.a>() { // from class: com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [K5.a, java.lang.Object] */
            @Override // ca.InterfaceC0635a
            public final K5.a invoke() {
                return b.l(this).a(null, null, kotlin.jvm.internal.h.a(K5.a.class));
            }
        });
    }

    public static final void T0(CardDetailsFragment cardDetailsFragment, z5.b bVar, z5.b bVar2) {
        cardDetailsFragment.getClass();
        Double d10 = bVar != null ? bVar.f31283a : null;
        Double d11 = bVar != null ? bVar.f31284b : null;
        Double d12 = bVar2 != null ? bVar2.f31283a : null;
        Double d13 = bVar2 != null ? bVar2.f31284b : null;
        if (d12 == null || d13 == null || d10 == null || d11 == null) {
            return;
        }
        double doubleValue = d12.doubleValue();
        double doubleValue2 = d13.doubleValue();
        double doubleValue3 = d10.doubleValue();
        double doubleValue4 = d11.doubleValue();
        S2 u02 = cardDetailsFragment.u0();
        int i = doubleValue > 0.0d ? (int) (((doubleValue - doubleValue2) / doubleValue) * 100) : 0;
        u02.f28485z.setProgress(i);
        u02.f28470G.setText(i + "%");
        int i9 = doubleValue3 > 0.0d ? (int) (((doubleValue3 - doubleValue4) / doubleValue3) * 100) : 0;
        u02.f28464A.setProgress(i9);
        u02.f28468E.setText(i9 + "%");
    }

    public static void V0(View view, boolean z10) {
        view.setEnabled(z10);
        if (z10) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(0.5f);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        VaultDomain vaultDomain = W0().f3834a;
        toolbarStatus.f13263a = vaultDomain != null ? vaultDomain.f10781d : null;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 18;
        Boolean bool = Boolean.TRUE;
        toolbarStatus.f13281t = bool;
        toolbarStatus.f13270h = new A8.e(Integer.valueOf(R.drawable.ic_white_card), null, bool, false, Integer.valueOf(R.drawable.bg_main_color_900), null, null, new W6.c(this, 2), 104);
        toolbarStatus.i = new A8.e(Integer.valueOf(R.drawable.ic_add_16), null, bool, false, Integer.valueOf(R.drawable.bg_main_color_900), null, null, new W6.c(this, 3), 104);
        toolbarStatus.f13282u = new J7.b(this, 3);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        VaultDomain vaultDomain = W0().f3834a;
        toolbarStatus.f13263a = vaultDomain != null ? vaultDomain.f10781d : null;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    public final void U0(CardsDomain cardsDomain) {
        if (cardsDomain != null) {
            String str = cardsDomain.i;
            if (f.b(str != null ? str.toLowerCase(Locale.ROOT) : null, "closed")) {
                V0(u0().f28477r, false);
                V0(u0().f28481v, false);
                V0(u0().f28479t, false);
                V0(u0().f28478s, false);
                V0(u0().f28480u, false);
                V0(u0().f28466C, false);
                V0(u0().f28465B, false);
                u0().f28469F.setText(getString(R.string.freeze));
                u0().f28474o.setVisibility(4);
                u0().f28473n.setVisibility(0);
                return;
            }
        }
        o.b(u0().f28473n);
        V0(u0().f28481v, true);
        V0(u0().f28479t, true);
        V0(u0().f28481v, true);
        V0(u0().f28480u, true);
        V0(u0().f28478s, true);
        V0(u0().f28477r, !(cardsDomain != null && F8.c.a(cardsDomain)));
        V0(u0().f28466C, !(cardsDomain != null && F8.c.a(cardsDomain)));
        V0(u0().f28465B, true);
        if (cardsDomain == null || !F8.c.a(cardsDomain)) {
            u0().f28469F.setText(getString(R.string.freeze));
            u0().f28474o.setVisibility(4);
        } else {
            u0().f28469F.setText(getString(R.string.unfreeze));
            u0().f28474o.setVisibility(0);
        }
    }

    public final W6.d W0() {
        return (W6.d) this.f11788p0.getValue();
    }

    public final W6.m X0() {
        return (W6.m) this.f11787o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = X0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        VaultDomain vaultDomain;
        super.onViewCreated(view, bundle);
        final int i = 0;
        X0().f3863a1.observe(getViewLifecycleOwner(), new e(new InterfaceC0646l(this) { // from class: W6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDetailsFragment f3831b;

            {
                this.f3831b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i) {
                    case 0:
                        List list = (List) obj;
                        CardDetailsFragment cardDetailsFragment = this.f3831b;
                        cardDetailsFragment.u0().f28471H.setVisibility(0);
                        List list2 = list;
                        if (!list2.isEmpty()) {
                            cardDetailsFragment.u0().f28471H.setDisplayedChild(1);
                            if (list.size() == 1) {
                                cardDetailsFragment.u0().f28482w.setVisibility(4);
                            } else {
                                cardDetailsFragment.u0().f28482w.setVisibility(0);
                            }
                        } else {
                            cardDetailsFragment.u0().f28471H.setDisplayedChild(0);
                        }
                        cardDetailsFragment.f11790r0 = new a(cardDetailsFragment, new ArrayList(list2));
                        S2 u02 = cardDetailsFragment.u0();
                        a aVar = cardDetailsFragment.f11790r0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        u02.f28472I.setAdapter(aVar);
                        S2 u03 = cardDetailsFragment.u0();
                        S2 u04 = cardDetailsFragment.u0();
                        DotsIndicator dotsIndicator = u03.f28482w;
                        dotsIndicator.getClass();
                        new R8.c().d(dotsIndicator, u04.f28472I);
                        cardDetailsFragment.u0().f28472I.setCurrentItem(cardDetailsFragment.f11789q0);
                        break;
                    default:
                        CardsDomain cardsDomain = (CardsDomain) obj;
                        if (cardsDomain != null) {
                            CardDetailsFragment cardDetailsFragment2 = this.f3831b;
                            List<CardsDomain> value = cardDetailsFragment2.X0().f3863a1.getValue();
                            if (value != null) {
                                Iterator<T> it = value.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (kotlin.jvm.internal.f.b(((CardsDomain) obj2).f10724a, cardsDomain.f10724a)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                CardsDomain cardsDomain2 = (CardsDomain) obj2;
                                if (cardsDomain2 != null) {
                                    String str = cardsDomain.i;
                                    cardsDomain2.i = str;
                                    if (str != null) {
                                        a aVar2 = cardDetailsFragment2.f11790r0;
                                        if (aVar2 == null) {
                                            aVar2 = null;
                                        }
                                        int i9 = cardDetailsFragment2.f11789q0;
                                        aVar2.f3828m.get(i9).i = str;
                                        ((CardFragment) aVar2.j(i9)).f11805i0 = str;
                                        ((CardFragment) aVar2.j(i9)).o0();
                                    }
                                }
                            }
                            cardDetailsFragment2.U0(cardsDomain);
                            cardDetailsFragment2.X0().f3864b1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                }
                return p.f3034a;
            }
        }));
        final int i9 = 1;
        X0().f3864b1.observe(getViewLifecycleOwner(), new e(new InterfaceC0646l(this) { // from class: W6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDetailsFragment f3831b;

            {
                this.f3831b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i9) {
                    case 0:
                        List list = (List) obj;
                        CardDetailsFragment cardDetailsFragment = this.f3831b;
                        cardDetailsFragment.u0().f28471H.setVisibility(0);
                        List list2 = list;
                        if (!list2.isEmpty()) {
                            cardDetailsFragment.u0().f28471H.setDisplayedChild(1);
                            if (list.size() == 1) {
                                cardDetailsFragment.u0().f28482w.setVisibility(4);
                            } else {
                                cardDetailsFragment.u0().f28482w.setVisibility(0);
                            }
                        } else {
                            cardDetailsFragment.u0().f28471H.setDisplayedChild(0);
                        }
                        cardDetailsFragment.f11790r0 = new a(cardDetailsFragment, new ArrayList(list2));
                        S2 u02 = cardDetailsFragment.u0();
                        a aVar = cardDetailsFragment.f11790r0;
                        if (aVar == null) {
                            aVar = null;
                        }
                        u02.f28472I.setAdapter(aVar);
                        S2 u03 = cardDetailsFragment.u0();
                        S2 u04 = cardDetailsFragment.u0();
                        DotsIndicator dotsIndicator = u03.f28482w;
                        dotsIndicator.getClass();
                        new R8.c().d(dotsIndicator, u04.f28472I);
                        cardDetailsFragment.u0().f28472I.setCurrentItem(cardDetailsFragment.f11789q0);
                        break;
                    default:
                        CardsDomain cardsDomain = (CardsDomain) obj;
                        if (cardsDomain != null) {
                            CardDetailsFragment cardDetailsFragment2 = this.f3831b;
                            List<CardsDomain> value = cardDetailsFragment2.X0().f3863a1.getValue();
                            if (value != null) {
                                Iterator<T> it = value.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (kotlin.jvm.internal.f.b(((CardsDomain) obj2).f10724a, cardsDomain.f10724a)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                CardsDomain cardsDomain2 = (CardsDomain) obj2;
                                if (cardsDomain2 != null) {
                                    String str = cardsDomain.i;
                                    cardsDomain2.i = str;
                                    if (str != null) {
                                        a aVar2 = cardDetailsFragment2.f11790r0;
                                        if (aVar2 == null) {
                                            aVar2 = null;
                                        }
                                        int i92 = cardDetailsFragment2.f11789q0;
                                        aVar2.f3828m.get(i92).i = str;
                                        ((CardFragment) aVar2.j(i92)).f11805i0 = str;
                                        ((CardFragment) aVar2.j(i92)).o0();
                                    }
                                }
                            }
                            cardDetailsFragment2.U0(cardsDomain);
                            cardDetailsFragment2.X0().f3864b1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                }
                return p.f3034a;
            }
        }));
        E.b(this, "edit", new B6.h(this, 14));
        X0().f3866d1.observe(getViewLifecycleOwner(), new i(new a()));
        X0().f3865c1.observe(getViewLifecycleOwner(), new i(new b()));
        u0().f28472I.f8014c.f8046b.add(new d());
        u0().f28474o.setTint(R.color.white);
        u0().f28472I.setOffscreenPageLimit(3);
        W6.d W02 = W0();
        if (W02 != null && (vaultDomain = W02.f3834a) != null) {
            W6.m X02 = X0();
            G7.f fVar = new G7.f(X02, vaultDomain.f10778a, Boolean.FALSE, 1);
            X02.f418J0 = fVar;
            fVar.invoke();
        }
        o.c(u0().f28474o, 500L, new W6.c(this, 8));
        o.c(u0().f28481v, 500L, new W6.c(this, 9));
        o.c(u0().f28476q, 500L, new W6.c(this, 10));
        o.c(u0().f28480u, 500L, new W6.c(this, 11));
        U0(null);
        o.c(u0().f28478s, 500L, new W6.c(this, 12));
        o.c(u0().f28477r, 500L, new W6.c(this, 0));
        o.c(u0().f28479t, 500L, new W6.c(this, 1));
        o.c(u0().f28475p, 500L, new W6.c(this, 6));
        u0().f28485z.setProgressTintList(ColorStateList.valueOf(-16777216));
        u0().f28464A.setProgressTintList(ColorStateList.valueOf(-16777216));
        o.c(u0().f28466C, 500L, new W6.c(this, 7));
        u0().f28465B.a(new c());
        u0().f28467D.setText(D9.b.B0(requireContext().getString(R.string.change_name)));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11786n0;
    }
}
