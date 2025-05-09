package com.luminary.business.presentation.ui.fragments.newcard;

import C.v;
import K7.c;
import O9.p;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.business.presentation.ui.fragments.newcard.NewCardListFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.AbstractC1436s4;

/* compiled from: NewCardListFragment.kt */
/* loaded from: classes2.dex */
public final class NewCardListFragment extends BaseFragment<AbstractC1436s4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12383n0 = R.layout.fragment_new_card_list;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12384o0;

    /* renamed from: p0, reason: collision with root package name */
    public CardsFragment.CardsTab f12385p0;

    /* renamed from: q0, reason: collision with root package name */
    public State f12386q0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewCardListFragment.kt */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f12391a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f12392b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ State[] f12393c;

        static {
            State state = new State("TYPE", 0);
            f12391a = state;
            State state2 = new State("ACCOUNT", 1);
            f12392b = state2;
            f12393c = new State[]{state, state2};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f12393c.clone();
        }
    }

    /* compiled from: NewCardListFragment.kt */
    public static final class a implements TabLayout.d {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            NewCardListFragment newCardListFragment = NewCardListFragment.this;
            if (newCardListFragment.getView() == null) {
                return;
            }
            newCardListFragment.V0(gVar != null ? gVar.f9855d : 0);
            newCardListFragment.L0();
        }
    }

    /* compiled from: NewCardListFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12395a;

        public b(com.luminary.business.presentation.ui.fragments.newcard.a aVar) {
            this.f12395a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12395a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12395a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcard.NewCardListFragment$special$$inlined$viewModel$default$1] */
    public NewCardListFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcard.NewCardListFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12384o0 = E.a(this, h.a(K7.d.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcard.NewCardListFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcard.NewCardListFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return U4.b.n((X) r02.invoke(), h.a(K7.d.class), null, null, U4.b.l(this));
            }
        });
        this.f12385p0 = CardsFragment.CardsTab.f11771b;
        this.f12386q0 = State.f12391a;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        if (this.f12386q0 != State.f12392b) {
            return true;
        }
        U0(State.f12391a);
        return false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        String string = T0().f2273c1 == 0 ? getString(R.string.physical_card) : getString(R.string.virtual_card);
        int ordinal = this.f12386q0.ordinal();
        if (ordinal == 0) {
            toolbarStatus.f13263a = getString(R.string.new_card);
            toolbarStatus.f13265c = 28;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            toolbarStatus.f13263a = string;
            toolbarStatus.f13265c = 18;
        }
        return toolbarStatus;
    }

    public final K7.d T0() {
        return (K7.d) this.f12384o0.getValue();
    }

    public final void U0(State state) {
        this.f12386q0 = state;
        L0();
        int ordinal = this.f12386q0.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            K7.d T02 = T0();
            T02.l();
            String valueOf = String.valueOf(T02.f2267W0.h());
            T02.f2264T0.a(new c(T02, 0), valueOf);
        }
    }

    public final void V0(int i) {
        CardsFragment.CardsTab cardsTab = i != 0 ? i != 1 ? CardsFragment.CardsTab.f11771b : CardsFragment.CardsTab.f11770a : CardsFragment.CardsTab.f11771b;
        this.f12385p0 = cardsTab;
        if (cardsTab == CardsFragment.CardsTab.f11771b) {
            u0().f29586o.setBackgroundResource(R.drawable.card_phisical_vertical);
        } else {
            u0().f29586o.setBackgroundResource(R.drawable.card_virtual_vertical);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !v.y(arguments, K7.b.class, "accountPreSelected")) {
            return;
        }
        arguments.getString("accountPreSelected");
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int ordinal = this.f12386q0.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            T0().f2269Y0.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.luminary.business.presentation.ui.fragments.newcard.a] */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        u0().f29587p.a(new a());
        V0(0);
        T0().f2269Y0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l() { // from class: com.luminary.business.presentation.ui.fragments.newcard.a
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                NewCardListFragment.State state = NewCardListFragment.this.f12386q0;
                NewCardListFragment.State state2 = NewCardListFragment.State.f12391a;
                return p.f3034a;
            }
        }));
        AbstractC1436s4 u02 = u0();
        u02.f29585n.setOnClickListener(new View.OnClickListener() { // from class: com.luminary.business.presentation.ui.fragments.newcard.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i;
                String str;
                String str2;
                String str3;
                String str4;
                NewCardListFragment newCardListFragment = NewCardListFragment.this;
                int ordinal = newCardListFragment.f12385p0.ordinal();
                if (ordinal == 0) {
                    i = 1;
                } else {
                    if (ordinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 0;
                }
                String valueOf = String.valueOf(i);
                if (newCardListFragment.f12386q0 == NewCardListFragment.State.f12391a) {
                    newCardListFragment.T0().f2273c1 = Integer.parseInt(valueOf);
                    newCardListFragment.U0(NewCardListFragment.State.f12392b);
                    return;
                }
                List<BankAccountDomain> value = newCardListFragment.T0().f2269Y0.getValue();
                BankAccountDomain bankAccountDomain = null;
                if (value != null) {
                    Iterator<T> it = value.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (f.b(((BankAccountDomain) next).f10700g, valueOf)) {
                            bankAccountDomain = next;
                            break;
                        }
                    }
                    bankAccountDomain = bankAccountDomain;
                }
                String str5 = "GBP";
                String str6 = "";
                if (newCardListFragment.T0().f2273c1 == 0) {
                    NavController g10 = U4.b.g(newCardListFragment);
                    if (bankAccountDomain != null && (str4 = bankAccountDomain.i) != null) {
                        str6 = str4;
                    }
                    if (bankAccountDomain != null && (str3 = bankAccountDomain.f10701h) != null) {
                        str5 = str3;
                    }
                    g10.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("accountNumber", valueOf);
                    bundle2.putInt("cardType", 1);
                    bundle2.putString("accountName", str6);
                    bundle2.putString(FirebaseAnalytics.Param.CURRENCY, str5);
                    g10.i(R.id.action_newCardListFragment_to_confirmOrderFragment, bundle2);
                    return;
                }
                NavController g11 = U4.b.g(newCardListFragment);
                if (bankAccountDomain != null && (str2 = bankAccountDomain.i) != null) {
                    str6 = str2;
                }
                if (bankAccountDomain != null && (str = bankAccountDomain.f10701h) != null) {
                    str5 = str;
                }
                g11.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putString("accountNumber", valueOf);
                bundle3.putInt("cardType", 0);
                bundle3.putString("accountName", str6);
                bundle3.putString(FirebaseAnalytics.Param.CURRENCY, str5);
                g11.i(R.id.action_newCardListFragment_to_confirmOrderFragment, bundle3);
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12383n0;
    }
}
