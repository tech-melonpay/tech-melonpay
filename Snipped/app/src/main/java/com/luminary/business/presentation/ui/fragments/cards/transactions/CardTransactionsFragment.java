package com.luminary.business.presentation.ui.fragments.cards.transactions;

import F8.o;
import Fa.h;
import O9.p;
import P9.m;
import P9.q;
import U4.b;
import Z6.e;
import a7.C0517b;
import a7.C0519d;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.transactions.CardTransactionsFragment;
import com.luminary.business.presentation.ui.fragments.cards.transactions.a;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import t6.K2;

/* compiled from: CardTransactionsFragment.kt */
/* loaded from: classes2.dex */
public final class CardTransactionsFragment extends BaseFragment<K2> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11848n0 = R.layout.fragment_all_transactions;

    /* renamed from: o0, reason: collision with root package name */
    public final h f11849o0 = new h(kotlin.jvm.internal.h.a(C0517b.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.cards.transactions.CardTransactionsFragment$special$$inlined$navArgs$1
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
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", fragment, " has null arguments"));
        }
    });

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f11850p0;

    /* renamed from: q0, reason: collision with root package name */
    public CardTransactionsController f11851q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f11852r0;
    public String s0;

    /* renamed from: t0, reason: collision with root package name */
    public final boolean f11853t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f11854u0;

    /* compiled from: CardTransactionsFragment.kt */
    public static final class a extends RecyclerView.s {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            super.onScrolled(recyclerView, i, i9);
            if (recyclerView.canScrollVertically(1)) {
                return;
            }
            CardTransactionsFragment cardTransactionsFragment = CardTransactionsFragment.this;
            if (cardTransactionsFragment.f11854u0) {
                return;
            }
            cardTransactionsFragment.f11854u0 = true;
            C0519d T02 = cardTransactionsFragment.T0();
            e eVar = new e(T02, ((C0517b) cardTransactionsFragment.f11849o0.getValue()).f4463a.f10778a, 1);
            T02.f418J0 = eVar;
            eVar.invoke();
        }
    }

    /* compiled from: CardTransactionsFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11861a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f11861a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11861a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11861a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.cards.transactions.CardTransactionsFragment$special$$inlined$viewModel$default$1] */
    public CardTransactionsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.cards.transactions.CardTransactionsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11850p0 = E.a(this, kotlin.jvm.internal.h.a(C0519d.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.cards.transactions.CardTransactionsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.cards.transactions.CardTransactionsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(C0519d.class), null, null, b.l(this));
            }
        });
        this.f11852r0 = "";
        this.s0 = "";
        SortDialog.Status status = SortDialog.Status.f13217a;
        SortDialog.Direction direction = SortDialog.Direction.f13213a;
        this.f11853t0 = true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void D0(Date date, Date date2) {
        L0();
        C0519d T02 = T0();
        T02.f4470X0 = 1;
        T02.f4469W0.clear();
        C0519d T03 = T0();
        e eVar = new e(T03, ((C0517b) this.f11849o0.getValue()).f4463a.f10778a, 1);
        T03.f418J0 = eVar;
        eVar.invoke();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void E0(SortDialog.Status status, SortDialog.Direction direction) {
        L0();
        C0519d T02 = T0();
        T02.f4470X0 = 1;
        T02.f4469W0.clear();
        C0519d T03 = T0();
        e eVar = new e(T03, ((C0517b) this.f11849o0.getValue()).f4463a.f10778a, 1);
        T03.f418J0 = eVar;
        eVar.invoke();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.transactions);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13263a = getString(R.string.transactions);
        return toolbarStatus;
    }

    public final C0519d T0() {
        return (C0519d) this.f11850p0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U0(List<CardTransactionDomain> list) {
        List<? extends com.luminary.business.presentation.ui.fragments.cards.transactions.a> list2;
        Pair pair;
        u0().f28067q.setRefreshing(false);
        V0();
        CardTransactionsController cardTransactionsController = this.f11851q0;
        if (cardTransactionsController == null) {
            cardTransactionsController = null;
        }
        Context requireContext = requireContext();
        List<CardTransactionDomain> list3 = list;
        if (list3 == null || list3.isEmpty()) {
            list2 = EmptyList.f23104a;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Calendar calendar = Calendar.getInstance();
            for (CardTransactionDomain cardTransactionDomain : list) {
                Calendar calendar2 = Calendar.getInstance();
                Date date = cardTransactionDomain.f10766p;
                calendar2.setTimeInMillis(date != null ? date.getTime() : 0L);
                if (DateUtils.isToday(calendar2.getTimeInMillis())) {
                    pair = new Pair(-4, new a.b(requireContext.getString(R.string.today)));
                } else if (D9.b.m0(calendar2.getTime())) {
                    pair = new Pair(-3, new a.b(requireContext.getString(R.string.yesterday)));
                } else if (calendar2.get(3) == calendar.get(3)) {
                    pair = new Pair(-2, new a.b(requireContext.getString(R.string.this_week)));
                } else if (calendar2.get(3) == calendar.get(3) - 1) {
                    pair = new Pair(-1, new a.b(requireContext.getString(R.string.last_week)));
                } else {
                    int i = calendar.get(1) - calendar2.get(1);
                    pair = new Pair(Integer.valueOf(((i * 100) + 12) - calendar2.get(2)), new a.b(new SimpleDateFormat(i < 1 ? "LLLL" : "LLLL yyyy", Locale.US).format(calendar2.getTime())));
                }
                int intValue = ((Number) pair.f23089a).intValue();
                a.b bVar = (a.b) pair.f23090b;
                Integer valueOf = Integer.valueOf(intValue);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = m.r(bVar);
                    linkedHashMap.put(valueOf, obj);
                }
                ((List) obj).add(new a.C0117a(cardTransactionDomain));
            }
            list2 = new ArrayList<>();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                q.x(list2, (Iterable) ((Map.Entry) it.next()).getValue());
            }
        }
        cardTransactionsController.setDataForHeader(list2);
        if (list3 != null && !list3.isEmpty()) {
            o.b(u0().f28064n);
            o.b(u0().f28068r);
            return;
        }
        u0().f28064n.setVisibility(0);
        if (this.f11853t0) {
            u0().f28068r.setVisibility(0);
        } else {
            o.b(u0().f28068r);
        }
    }

    public final void V0() {
        u0().f28065o.setText((this.f11852r0.length() <= 0 && this.s0.length() <= 0) ? getString(R.string.you_do_not_have_any_transactions_yet) : getString(R.string.nothing_is_found));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, B6.a
    public final void m0() {
        SortDialog.Status status = SortDialog.Status.f13217a;
        this.f11852r0 = "";
        this.s0 = "";
        L0();
        o0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        U0(T0().f4468V0.getValue());
        if (this.f11852r0.length() > 0) {
            I0(this.f11852r0);
        } else if (this.s0.length() > 0) {
            I0(this.s0);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        this.f11851q0 = new CardTransactionsController(requireContext(), new InterfaceC0646l(this) { // from class: a7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardTransactionsFragment f4462b;

            {
                this.f4462b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i) {
                    case 0:
                        String str = (String) obj;
                        CardTransactionsFragment cardTransactionsFragment = this.f4462b;
                        List<CardTransactionDomain> value = cardTransactionsFragment.T0().f4468V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (f.b(((CardTransactionDomain) obj2).f10752a, str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CardTransactionDomain cardTransactionDomain = (CardTransactionDomain) obj2;
                            if (cardTransactionDomain != null) {
                                U4.b.g(cardTransactionsFragment).j(new C0518c(((C0517b) cardTransactionsFragment.f11849o0.getValue()).f4463a, cardTransactionDomain));
                            }
                        }
                        break;
                    case 1:
                        this.f4462b.f11854u0 = false;
                        break;
                    default:
                        CardTransactionsFragment cardTransactionsFragment2 = this.f4462b;
                        cardTransactionsFragment2.f11854u0 = false;
                        cardTransactionsFragment2.U0((List) obj);
                        break;
                }
                return p.f3034a;
            }
        });
        u0().f28065o.setText(getString(R.string.you_do_not_have_any_transactions_yet));
        if (getView() != null) {
            U0(null);
            BuildersKt__Builders_commonKt.launch$default(C0552s.a(getViewLifecycleOwner()), Dispatchers.getMain(), null, new CardTransactionsFragment$onViewCreated$2(this, null), 2, null);
        }
        final int i9 = 1;
        T0().f426S0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: a7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardTransactionsFragment f4462b;

            {
                this.f4462b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i9) {
                    case 0:
                        String str = (String) obj;
                        CardTransactionsFragment cardTransactionsFragment = this.f4462b;
                        List<CardTransactionDomain> value = cardTransactionsFragment.T0().f4468V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (f.b(((CardTransactionDomain) obj2).f10752a, str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CardTransactionDomain cardTransactionDomain = (CardTransactionDomain) obj2;
                            if (cardTransactionDomain != null) {
                                U4.b.g(cardTransactionsFragment).j(new C0518c(((C0517b) cardTransactionsFragment.f11849o0.getValue()).f4463a, cardTransactionDomain));
                            }
                        }
                        break;
                    case 1:
                        this.f4462b.f11854u0 = false;
                        break;
                    default:
                        CardTransactionsFragment cardTransactionsFragment2 = this.f4462b;
                        cardTransactionsFragment2.f11854u0 = false;
                        cardTransactionsFragment2.U0((List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
        u0().f28066p.setLayoutManager(new StickyHeaderLinearLayoutManager(requireContext()));
        K2 u02 = u0();
        CardTransactionsController cardTransactionsController = this.f11851q0;
        u02.f28066p.setAdapter((cardTransactionsController != null ? cardTransactionsController : null).getAdapter());
        u0().f28066p.addOnScrollListener(new a());
        u0().f28067q.setColorSchemeResources(R.color.main_color);
        u0().f28067q.setOnRefreshListener(new A0.b(this, 19));
        final int i10 = 2;
        T0().f4468V0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: a7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardTransactionsFragment f4462b;

            {
                this.f4462b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i10) {
                    case 0:
                        String str = (String) obj;
                        CardTransactionsFragment cardTransactionsFragment = this.f4462b;
                        List<CardTransactionDomain> value = cardTransactionsFragment.T0().f4468V0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (f.b(((CardTransactionDomain) obj2).f10752a, str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CardTransactionDomain cardTransactionDomain = (CardTransactionDomain) obj2;
                            if (cardTransactionDomain != null) {
                                U4.b.g(cardTransactionsFragment).j(new C0518c(((C0517b) cardTransactionsFragment.f11849o0.getValue()).f4463a, cardTransactionDomain));
                            }
                        }
                        break;
                    case 1:
                        this.f4462b.f11854u0 = false;
                        break;
                    default:
                        CardTransactionsFragment cardTransactionsFragment2 = this.f4462b;
                        cardTransactionsFragment2.f11854u0 = false;
                        cardTransactionsFragment2.U0((List) obj);
                        break;
                }
                return p.f3034a;
            }
        }));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11848n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean x0() {
        return false;
    }
}
