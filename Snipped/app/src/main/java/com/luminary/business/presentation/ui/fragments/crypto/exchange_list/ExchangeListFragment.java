package com.luminary.business.presentation.ui.fragments.crypto.exchange_list;

import A8.e;
import C.v;
import F8.o;
import J5.a;
import K5.a;
import O9.f;
import O9.p;
import U4.b;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListController;
import com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import ka.C0969n;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h;
import q7.g;
import q7.n;
import t6.R3;

/* compiled from: ExchangeListFragment.kt */
/* loaded from: classes2.dex */
public final class ExchangeListFragment extends BaseFragment<R3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12106n0 = R.layout.fragment_exchanges;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12107o0;

    /* renamed from: p0, reason: collision with root package name */
    public g f12108p0;

    /* renamed from: q0, reason: collision with root package name */
    public final f f12109q0;

    /* renamed from: r0, reason: collision with root package name */
    public final HashMap<ExchangesTab, String> f12110r0;
    public final HashMap<ExchangesTab, Boolean> s0;

    /* renamed from: t0, reason: collision with root package name */
    public final boolean f12111t0;

    /* renamed from: u0, reason: collision with root package name */
    public ExchangeListController f12112u0;

    /* renamed from: v0, reason: collision with root package name */
    public ExchangesTab f12113v0;

    /* renamed from: w0, reason: collision with root package name */
    public Timer f12114w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f12115x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f12116y0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExchangeListFragment.kt */
    public static final class ExchangesTab {

        /* renamed from: a, reason: collision with root package name */
        public static final ExchangesTab f12122a;

        /* renamed from: b, reason: collision with root package name */
        public static final ExchangesTab f12123b;

        /* renamed from: c, reason: collision with root package name */
        public static final ExchangesTab f12124c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ExchangesTab[] f12125d;

        static {
            ExchangesTab exchangesTab = new ExchangesTab("NEW", 0);
            f12122a = exchangesTab;
            ExchangesTab exchangesTab2 = new ExchangesTab("ACTION_REQUIRED", 1);
            f12123b = exchangesTab2;
            ExchangesTab exchangesTab3 = new ExchangesTab("HISTORY", 2);
            f12124c = exchangesTab3;
            f12125d = new ExchangesTab[]{exchangesTab, exchangesTab2, exchangesTab3};
        }

        public ExchangesTab() {
            throw null;
        }

        public static ExchangesTab valueOf(String str) {
            return (ExchangesTab) Enum.valueOf(ExchangesTab.class, str);
        }

        public static ExchangesTab[] values() {
            return (ExchangesTab[]) f12125d.clone();
        }
    }

    /* compiled from: ExchangeListFragment.kt */
    public static final class a extends RecyclerView.s {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            super.onScrolled(recyclerView, i, i9);
            ExchangeListFragment exchangeListFragment = ExchangeListFragment.this;
            ExchangesTab exchangesTab = exchangeListFragment.f12113v0;
            ExchangesTab exchangesTab2 = ExchangesTab.f12124c;
            if (exchangesTab != exchangesTab2 || recyclerView.canScrollVertically(1) || exchangeListFragment.f12116y0) {
                return;
            }
            exchangeListFragment.f12116y0 = true;
            exchangeListFragment.T0().i0(exchangeListFragment.f12110r0.get(exchangesTab2));
        }
    }

    /* compiled from: ExchangeListFragment.kt */
    public static final class b implements TabLayout.d {
        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            ExchangeListFragment exchangeListFragment = ExchangeListFragment.this;
            if (exchangeListFragment.getView() != null) {
                Integer valueOf = gVar != null ? Integer.valueOf(gVar.f9855d) : null;
                if (valueOf != null && valueOf.intValue() == 0) {
                    ExchangesTab exchangesTab = ExchangesTab.f12122a;
                    exchangeListFragment.f12113v0 = exchangesTab;
                    Boolean bool = exchangeListFragment.s0.get(exchangesTab);
                    exchangeListFragment.f11467i0 = bool != null ? bool.booleanValue() : false;
                    exchangeListFragment.L0();
                    exchangeListFragment.U0(exchangeListFragment.T0().f25923Y0.getValue(), null, null);
                } else if (valueOf != null && valueOf.intValue() == 1) {
                    ExchangesTab exchangesTab2 = ExchangesTab.f12123b;
                    exchangeListFragment.f12113v0 = exchangesTab2;
                    Boolean bool2 = exchangeListFragment.s0.get(exchangesTab2);
                    exchangeListFragment.f11467i0 = bool2 != null ? bool2.booleanValue() : false;
                    exchangeListFragment.L0();
                    exchangeListFragment.U0(null, exchangeListFragment.T0().h0(), null);
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    ExchangesTab exchangesTab3 = ExchangesTab.f12124c;
                    exchangeListFragment.f12113v0 = exchangesTab3;
                    Boolean bool3 = exchangeListFragment.s0.get(exchangesTab3);
                    exchangeListFragment.f11467i0 = bool3 != null ? bool3.booleanValue() : false;
                    exchangeListFragment.L0();
                    exchangeListFragment.U0(null, null, exchangeListFragment.T0().f25924Z0.getValue());
                }
                ExchangeListController exchangeListController = exchangeListFragment.f12112u0;
                exchangeListFragment.W0((exchangeListController != null ? exchangeListController : null).getActionTab(), exchangeListFragment.T0().h0());
                exchangeListFragment.V0();
                if (exchangeListFragment.f11467i0) {
                    ((MainActivity) exchangeListFragment.requireActivity()).u(exchangeListFragment.f12110r0.get(exchangeListFragment.f12113v0));
                } else {
                    ((MainActivity) exchangeListFragment.requireActivity()).s();
                }
            }
        }
    }

    /* compiled from: ExchangeListFragment.kt */
    public static final class c implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12128a;

        public c(InterfaceC0646l interfaceC0646l) {
            this.f12128a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12128a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12128a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListFragment$special$$inlined$viewModel$default$1] */
    public ExchangeListFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12107o0 = E.a(this, h.a(n.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(n.class), null, null, b.l(this));
            }
        });
        this.f12109q0 = kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<K5.a>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [K5.a, java.lang.Object] */
            @Override // ca.InterfaceC0635a
            public final a invoke() {
                return b.l(this).a(null, null, h.a(a.class));
            }
        });
        ExchangesTab exchangesTab = ExchangesTab.f12122a;
        Pair pair = new Pair(exchangesTab, "");
        ExchangesTab exchangesTab2 = ExchangesTab.f12123b;
        Pair pair2 = new Pair(exchangesTab2, "");
        ExchangesTab exchangesTab3 = ExchangesTab.f12124c;
        this.f12110r0 = kotlin.collections.a.r(pair, pair2, new Pair(exchangesTab3, ""));
        Boolean bool = Boolean.FALSE;
        this.s0 = kotlin.collections.a.r(new Pair(exchangesTab, bool), new Pair(exchangesTab2, bool), new Pair(exchangesTab3, bool));
        this.f12111t0 = true;
        this.f12113v0 = exchangesTab;
        new Handler(Looper.getMainLooper());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.exchange);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 28;
        toolbarStatus.f13270h = new e(Integer.valueOf(R.drawable.ic_rates), null, null, false, null, null, null, new q7.f(this, 1), 124);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        String string;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        int ordinal = this.f12113v0.ordinal();
        if (ordinal == 0) {
            string = getString(R.string.new_exchange);
        } else if (ordinal == 1) {
            string = getString(R.string.action_required);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string = getString(R.string.history);
        }
        toolbarStatus.f13263a = string;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final n T0() {
        return (n) this.f12107o0.getValue();
    }

    public final void U0(List list, ArrayList arrayList, List list2) {
        int ordinal = this.f12113v0.ordinal();
        if (ordinal == 0) {
            List<CryptoAccountDomain> value = T0().f25923Y0.getValue();
            if (value == null || value.isEmpty()) {
                u0().f28410n.setVisibility(0);
            } else {
                o.b(u0().f28410n);
            }
        } else if (ordinal == 1) {
            ArrayList h02 = T0().h0();
            if (h02 == null || h02.isEmpty()) {
                u0().f28410n.setVisibility(0);
            } else {
                o.b(u0().f28410n);
            }
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            List<CryptoExchangeDomain> value2 = T0().f25924Z0.getValue();
            if (value2 == null || value2.isEmpty()) {
                u0().f28410n.setVisibility(0);
            } else {
                o.b(u0().f28410n);
            }
        }
        String str = this.f12110r0.get(this.f12113v0);
        int ordinal2 = this.f12113v0.ordinal();
        if (ordinal2 == 0) {
            String str2 = str;
            if (str2 != null && str2.length() != 0) {
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        CryptoAccountDomain cryptoAccountDomain = (CryptoAccountDomain) obj;
                        String str3 = cryptoAccountDomain.f10969g;
                        if (str3 != null) {
                            Locale locale = Locale.ROOT;
                            if (C0969n.Y(str3.toLowerCase(locale), str.toLowerCase(locale), false)) {
                                arrayList2.add(obj);
                            }
                        }
                        String str4 = cryptoAccountDomain.f10968f;
                        if (str4 != null) {
                            Locale locale2 = Locale.ROOT;
                            if (C0969n.Y(str4.toLowerCase(locale2), str.toLowerCase(locale2), false)) {
                                arrayList2.add(obj);
                            }
                        }
                        Double d10 = cryptoAccountDomain.f10977p;
                        if (C0969n.Y(String.valueOf(d10 != null ? new BigDecimal(String.valueOf(d10.doubleValue())) : null), str.toLowerCase(Locale.ROOT), false)) {
                            arrayList2.add(obj);
                        }
                    }
                    list = arrayList2;
                } else {
                    list = null;
                }
            }
            ExchangeListController exchangeListController = this.f12112u0;
            if (exchangeListController == null) {
                exchangeListController = null;
            }
            exchangeListController.setData(list, null, null, Integer.valueOf(this.f12113v0.ordinal()));
            return;
        }
        if (ordinal2 != 1) {
            if (ordinal2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ExchangeListController exchangeListController2 = this.f12112u0;
            if (exchangeListController2 == null) {
                exchangeListController2 = null;
            }
            exchangeListController2.setData(null, null, H8.a.a(this, list2), Integer.valueOf(this.f12113v0.ordinal()));
            return;
        }
        String str5 = str;
        if (str5 != null && str5.length() != 0) {
            if (arrayList != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) obj2;
                    String str6 = cryptoExchangeDomain.i;
                    if (str6 != null) {
                        Locale locale3 = Locale.ROOT;
                        if (C0969n.Y(str6.toLowerCase(locale3), str.toLowerCase(locale3), false)) {
                            arrayList3.add(obj2);
                        }
                    }
                    String str7 = cryptoExchangeDomain.f11027l;
                    if (str7 != null) {
                        Locale locale4 = Locale.ROOT;
                        if (C0969n.Y(str7.toLowerCase(locale4), str.toLowerCase(locale4), false)) {
                            arrayList3.add(obj2);
                        }
                    }
                    Double d11 = cryptoExchangeDomain.f11029n;
                    if (!C0969n.Y(String.valueOf(d11 != null ? new BigDecimal(String.valueOf(d11.doubleValue())) : null), str5, false)) {
                        Double d12 = cryptoExchangeDomain.f11030o;
                        if (C0969n.Y(String.valueOf(d12 != null ? new BigDecimal(String.valueOf(d12.doubleValue())) : null), str5, false)) {
                        }
                    }
                    arrayList3.add(obj2);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
        }
        ExchangeListController exchangeListController3 = this.f12112u0;
        if (exchangeListController3 == null) {
            exchangeListController3 = null;
        }
        exchangeListController3.setData(null, arrayList, null, Integer.valueOf(this.f12113v0.ordinal()));
    }

    public final void V0() {
        String str;
        R3 u02 = u0();
        String str2 = this.f12110r0.get(this.f12113v0);
        if (str2 == null || str2.length() == 0) {
            int ordinal = this.f12113v0.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                str = "";
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = getString(R.string.you_do_not_have_any_transactions_yet);
            }
        } else {
            str = getString(R.string.nothing_is_found);
        }
        u02.f28411o.setText(str);
    }

    public final void W0(TabLayout.g gVar, ArrayList arrayList) {
        TabLayout.i iVar;
        TabLayout.i iVar2;
        TabLayout.i iVar3;
        if (arrayList == null || arrayList.isEmpty()) {
            if (gVar == null || (iVar = gVar.f9859h) == null) {
                return;
            }
            o.b(iVar);
            return;
        }
        if (gVar != null && (iVar3 = gVar.f9859h) != null) {
            iVar3.setVisibility(0);
        }
        TextView textView = (TextView) ((gVar == null || (iVar2 = gVar.f9859h) == null) ? null : iVar2.getChildAt(1));
        if (gVar != null) {
            gVar.b(getString(R.string.action_required));
        }
        if (textView != null) {
            o.h(textView, R.color.red_error_timer);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12108p0 = new g(v.y(arguments, g.class, "actionRequired") ? arguments.getBoolean("actionRequired") : false);
        }
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Timer timer = this.f12114w0;
        if (timer == null) {
            timer = null;
        }
        timer.cancel();
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        V0();
        this.f12114w0 = new Timer();
        final int i = 0;
        T0().f426S0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: q7.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeListFragment f25898b;

            {
                this.f25898b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i9;
                String str;
                String str2;
                switch (i) {
                    case 0:
                        this.f25898b.getClass();
                        return p.f3034a;
                    case 1:
                        List list = (List) obj;
                        ExchangeListFragment exchangeListFragment = this.f25898b;
                        if (exchangeListFragment.f12113v0 == ExchangeListFragment.ExchangesTab.f12122a) {
                            exchangeListFragment.U0(list, null, null);
                        }
                        return p.f3034a;
                    case 2:
                        ExchangeListFragment exchangeListFragment2 = this.f25898b;
                        MainActivity mainActivity = (MainActivity) exchangeListFragment2.requireActivity();
                        List<CryptoExchangeDomain> value = exchangeListFragment2.T0().f25924Z0.getValue();
                        if (value != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i9 = arrayList.size();
                        } else {
                            i9 = 0;
                        }
                        mainActivity.G(i9, false);
                        if (!exchangeListFragment2.f12115x0) {
                            n T02 = exchangeListFragment2.T0();
                            j jVar = new j(T02, 0);
                            T02.f418J0 = jVar;
                            jVar.invoke();
                            exchangeListFragment2.f12115x0 = true;
                        }
                        ExchangeListController exchangeListController = exchangeListFragment2.f12112u0;
                        if (exchangeListController == null) {
                            exchangeListController = null;
                        }
                        exchangeListFragment2.W0(exchangeListController.getActionTab(), exchangeListFragment2.T0().h0());
                        int ordinal = exchangeListFragment2.f12113v0.ordinal();
                        if (ordinal == 1) {
                            exchangeListFragment2.U0(null, exchangeListFragment2.T0().h0(), null);
                        } else if (ordinal == 2) {
                            exchangeListFragment2.U0(null, null, exchangeListFragment2.T0().f25924Z0.getValue());
                        }
                        return p.f3034a;
                    case 3:
                        this.f25898b.u0().f28413q.setRefreshing(false);
                        return p.f3034a;
                    case 4:
                        int intValue = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment3 = this.f25898b;
                        List<CryptoExchangeDomain> value2 = exchangeListFragment3.T0().f25924Z0.getValue();
                        Serializable serializable = null;
                        if (value2 != null) {
                            Iterator<T> it = value2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    Integer num = ((CryptoExchangeDomain) next).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                        serializable = next;
                                    }
                                }
                            }
                            serializable = (CryptoExchangeDomain) serializable;
                        }
                        if (serializable != null) {
                            NavController g10 = U4.b.g(exchangeListFragment3);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_exchangeListFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 5:
                        int intValue2 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment4 = this.f25898b;
                        List<CryptoAccountDomain> value3 = exchangeListFragment4.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain = null;
                        if (value3 != null) {
                            Iterator<T> it2 = value3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    Long l10 = ((CryptoAccountDomain) next2).f10963a;
                                    if (l10 != null && ((int) l10.longValue()) == intValue2) {
                                        cryptoAccountDomain = next2;
                                    }
                                }
                            }
                            cryptoAccountDomain = cryptoAccountDomain;
                        }
                        NavController g12 = U4.b.g(exchangeListFragment4);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10969g) == null) {
                            str = "";
                        }
                        g12.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType, str, ""));
                        return p.f3034a;
                    case 6:
                        int intValue3 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment5 = this.f25898b;
                        List<CryptoAccountDomain> value4 = exchangeListFragment5.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain2 = null;
                        if (value4 != null) {
                            Iterator<T> it3 = value4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    Long l11 = ((CryptoAccountDomain) next3).f10963a;
                                    if (l11 != null && ((int) l11.longValue()) == intValue3) {
                                        cryptoAccountDomain2 = next3;
                                    }
                                }
                            }
                            cryptoAccountDomain2 = cryptoAccountDomain2;
                        }
                        NavController g13 = U4.b.g(exchangeListFragment5);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        if (cryptoAccountDomain2 == null || (str2 = cryptoAccountDomain2.f10969g) == null) {
                            str2 = "";
                        }
                        g13.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType2, "", str2));
                        return p.f3034a;
                    case 7:
                        final int intValue4 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment6 = this.f25898b;
                        final n T03 = exchangeListFragment6.T0();
                        final String str3 = exchangeListFragment6.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T03.getClass();
                        final int i10 = 0;
                        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        final n nVar = T03;
                                        nVar.l();
                                        v5.g gVar = new v5.g(intValue4, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str4 = str3;
                                        final int i11 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str5 = str4;
                                                n nVar2 = nVar;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i11) {
                                                    case 0:
                                                        nVar2.k();
                                                        k kVar = new k(nVar2, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar2.i0(str5);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar2.k();
                                                        k kVar2 = new k(nVar2, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar2.i0(str5);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar);
                                        break;
                                    default:
                                        final n nVar2 = T03;
                                        nVar2.l();
                                        v5.g gVar2 = new v5.g(intValue4, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str3;
                                        final int i12 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i12) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T03.N0 = interfaceC0635a;
                        interfaceC0635a.invoke();
                        return p.f3034a;
                    default:
                        final int intValue5 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment7 = this.f25898b;
                        final n T04 = exchangeListFragment7.T0();
                        final String str4 = exchangeListFragment7.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T04.getClass();
                        final int i11 = 1;
                        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        final n nVar = T04;
                                        nVar.l();
                                        v5.g gVar = new v5.g(intValue5, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str4;
                                        final int i112 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i112) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar);
                                        break;
                                    default:
                                        final n nVar2 = T04;
                                        nVar2.l();
                                        v5.g gVar2 = new v5.g(intValue5, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str4;
                                        final int i12 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i12) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T04.f421M0 = interfaceC0635a2;
                        interfaceC0635a2.invoke();
                        return p.f3034a;
                }
            }
        }));
        final int i9 = 3;
        T0().f25925a1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: q7.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeListFragment f25898b;

            {
                this.f25898b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                String str;
                String str2;
                switch (i9) {
                    case 0:
                        this.f25898b.getClass();
                        return p.f3034a;
                    case 1:
                        List list = (List) obj;
                        ExchangeListFragment exchangeListFragment = this.f25898b;
                        if (exchangeListFragment.f12113v0 == ExchangeListFragment.ExchangesTab.f12122a) {
                            exchangeListFragment.U0(list, null, null);
                        }
                        return p.f3034a;
                    case 2:
                        ExchangeListFragment exchangeListFragment2 = this.f25898b;
                        MainActivity mainActivity = (MainActivity) exchangeListFragment2.requireActivity();
                        List<CryptoExchangeDomain> value = exchangeListFragment2.T0().f25924Z0.getValue();
                        if (value != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, false);
                        if (!exchangeListFragment2.f12115x0) {
                            n T02 = exchangeListFragment2.T0();
                            j jVar = new j(T02, 0);
                            T02.f418J0 = jVar;
                            jVar.invoke();
                            exchangeListFragment2.f12115x0 = true;
                        }
                        ExchangeListController exchangeListController = exchangeListFragment2.f12112u0;
                        if (exchangeListController == null) {
                            exchangeListController = null;
                        }
                        exchangeListFragment2.W0(exchangeListController.getActionTab(), exchangeListFragment2.T0().h0());
                        int ordinal = exchangeListFragment2.f12113v0.ordinal();
                        if (ordinal == 1) {
                            exchangeListFragment2.U0(null, exchangeListFragment2.T0().h0(), null);
                        } else if (ordinal == 2) {
                            exchangeListFragment2.U0(null, null, exchangeListFragment2.T0().f25924Z0.getValue());
                        }
                        return p.f3034a;
                    case 3:
                        this.f25898b.u0().f28413q.setRefreshing(false);
                        return p.f3034a;
                    case 4:
                        int intValue = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment3 = this.f25898b;
                        List<CryptoExchangeDomain> value2 = exchangeListFragment3.T0().f25924Z0.getValue();
                        Serializable serializable = null;
                        if (value2 != null) {
                            Iterator<T> it = value2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    Integer num = ((CryptoExchangeDomain) next).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                        serializable = next;
                                    }
                                }
                            }
                            serializable = (CryptoExchangeDomain) serializable;
                        }
                        if (serializable != null) {
                            NavController g10 = U4.b.g(exchangeListFragment3);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_exchangeListFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 5:
                        int intValue2 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment4 = this.f25898b;
                        List<CryptoAccountDomain> value3 = exchangeListFragment4.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain = null;
                        if (value3 != null) {
                            Iterator<T> it2 = value3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    Long l10 = ((CryptoAccountDomain) next2).f10963a;
                                    if (l10 != null && ((int) l10.longValue()) == intValue2) {
                                        cryptoAccountDomain = next2;
                                    }
                                }
                            }
                            cryptoAccountDomain = cryptoAccountDomain;
                        }
                        NavController g12 = U4.b.g(exchangeListFragment4);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10969g) == null) {
                            str = "";
                        }
                        g12.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType, str, ""));
                        return p.f3034a;
                    case 6:
                        int intValue3 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment5 = this.f25898b;
                        List<CryptoAccountDomain> value4 = exchangeListFragment5.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain2 = null;
                        if (value4 != null) {
                            Iterator<T> it3 = value4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    Long l11 = ((CryptoAccountDomain) next3).f10963a;
                                    if (l11 != null && ((int) l11.longValue()) == intValue3) {
                                        cryptoAccountDomain2 = next3;
                                    }
                                }
                            }
                            cryptoAccountDomain2 = cryptoAccountDomain2;
                        }
                        NavController g13 = U4.b.g(exchangeListFragment5);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        if (cryptoAccountDomain2 == null || (str2 = cryptoAccountDomain2.f10969g) == null) {
                            str2 = "";
                        }
                        g13.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType2, "", str2));
                        return p.f3034a;
                    case 7:
                        final int intValue4 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment6 = this.f25898b;
                        final n T03 = exchangeListFragment6.T0();
                        final String str3 = exchangeListFragment6.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T03.getClass();
                        final int i10 = 0;
                        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        final n nVar = T03;
                                        nVar.l();
                                        v5.g gVar = new v5.g(intValue4, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str3;
                                        final int i112 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i112) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar);
                                        break;
                                    default:
                                        final n nVar2 = T03;
                                        nVar2.l();
                                        v5.g gVar2 = new v5.g(intValue4, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str3;
                                        final int i12 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i12) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T03.N0 = interfaceC0635a;
                        interfaceC0635a.invoke();
                        return p.f3034a;
                    default:
                        final int intValue5 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment7 = this.f25898b;
                        final n T04 = exchangeListFragment7.T0();
                        final String str4 = exchangeListFragment7.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T04.getClass();
                        final int i11 = 1;
                        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        final n nVar = T04;
                                        nVar.l();
                                        v5.g gVar = new v5.g(intValue5, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str4;
                                        final int i112 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i112) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar);
                                        break;
                                    default:
                                        final n nVar2 = T04;
                                        nVar2.l();
                                        v5.g gVar2 = new v5.g(intValue5, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str4;
                                        final int i12 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i12) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T04.f421M0 = interfaceC0635a2;
                        interfaceC0635a2.invoke();
                        return p.f3034a;
                }
            }
        }));
        g gVar = this.f12108p0;
        if (gVar != null && gVar.f25901a) {
            this.f12113v0 = ExchangesTab.f12123b;
        }
        b bVar = new b();
        Context requireContext = requireContext();
        final int i10 = 4;
        InterfaceC0646l interfaceC0646l = new InterfaceC0646l(this) { // from class: q7.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeListFragment f25898b;

            {
                this.f25898b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                String str;
                String str2;
                switch (i10) {
                    case 0:
                        this.f25898b.getClass();
                        return p.f3034a;
                    case 1:
                        List list = (List) obj;
                        ExchangeListFragment exchangeListFragment = this.f25898b;
                        if (exchangeListFragment.f12113v0 == ExchangeListFragment.ExchangesTab.f12122a) {
                            exchangeListFragment.U0(list, null, null);
                        }
                        return p.f3034a;
                    case 2:
                        ExchangeListFragment exchangeListFragment2 = this.f25898b;
                        MainActivity mainActivity = (MainActivity) exchangeListFragment2.requireActivity();
                        List<CryptoExchangeDomain> value = exchangeListFragment2.T0().f25924Z0.getValue();
                        if (value != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, false);
                        if (!exchangeListFragment2.f12115x0) {
                            n T02 = exchangeListFragment2.T0();
                            j jVar = new j(T02, 0);
                            T02.f418J0 = jVar;
                            jVar.invoke();
                            exchangeListFragment2.f12115x0 = true;
                        }
                        ExchangeListController exchangeListController = exchangeListFragment2.f12112u0;
                        if (exchangeListController == null) {
                            exchangeListController = null;
                        }
                        exchangeListFragment2.W0(exchangeListController.getActionTab(), exchangeListFragment2.T0().h0());
                        int ordinal = exchangeListFragment2.f12113v0.ordinal();
                        if (ordinal == 1) {
                            exchangeListFragment2.U0(null, exchangeListFragment2.T0().h0(), null);
                        } else if (ordinal == 2) {
                            exchangeListFragment2.U0(null, null, exchangeListFragment2.T0().f25924Z0.getValue());
                        }
                        return p.f3034a;
                    case 3:
                        this.f25898b.u0().f28413q.setRefreshing(false);
                        return p.f3034a;
                    case 4:
                        int intValue = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment3 = this.f25898b;
                        List<CryptoExchangeDomain> value2 = exchangeListFragment3.T0().f25924Z0.getValue();
                        Serializable serializable = null;
                        if (value2 != null) {
                            Iterator<T> it = value2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    Integer num = ((CryptoExchangeDomain) next).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                        serializable = next;
                                    }
                                }
                            }
                            serializable = (CryptoExchangeDomain) serializable;
                        }
                        if (serializable != null) {
                            NavController g10 = U4.b.g(exchangeListFragment3);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_exchangeListFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 5:
                        int intValue2 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment4 = this.f25898b;
                        List<CryptoAccountDomain> value3 = exchangeListFragment4.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain = null;
                        if (value3 != null) {
                            Iterator<T> it2 = value3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    Long l10 = ((CryptoAccountDomain) next2).f10963a;
                                    if (l10 != null && ((int) l10.longValue()) == intValue2) {
                                        cryptoAccountDomain = next2;
                                    }
                                }
                            }
                            cryptoAccountDomain = cryptoAccountDomain;
                        }
                        NavController g12 = U4.b.g(exchangeListFragment4);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10969g) == null) {
                            str = "";
                        }
                        g12.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType, str, ""));
                        return p.f3034a;
                    case 6:
                        int intValue3 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment5 = this.f25898b;
                        List<CryptoAccountDomain> value4 = exchangeListFragment5.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain2 = null;
                        if (value4 != null) {
                            Iterator<T> it3 = value4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    Long l11 = ((CryptoAccountDomain) next3).f10963a;
                                    if (l11 != null && ((int) l11.longValue()) == intValue3) {
                                        cryptoAccountDomain2 = next3;
                                    }
                                }
                            }
                            cryptoAccountDomain2 = cryptoAccountDomain2;
                        }
                        NavController g13 = U4.b.g(exchangeListFragment5);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        if (cryptoAccountDomain2 == null || (str2 = cryptoAccountDomain2.f10969g) == null) {
                            str2 = "";
                        }
                        g13.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType2, "", str2));
                        return p.f3034a;
                    case 7:
                        final int intValue4 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment6 = this.f25898b;
                        final n T03 = exchangeListFragment6.T0();
                        final String str3 = exchangeListFragment6.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T03.getClass();
                        final int i102 = 0;
                        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i102) {
                                    case 0:
                                        final n nVar = T03;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue4, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str3;
                                        final int i112 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i112) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T03;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue4, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str3;
                                        final int i12 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i12) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T03.N0 = interfaceC0635a;
                        interfaceC0635a.invoke();
                        return p.f3034a;
                    default:
                        final int intValue5 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment7 = this.f25898b;
                        final n T04 = exchangeListFragment7.T0();
                        final String str4 = exchangeListFragment7.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T04.getClass();
                        final int i11 = 1;
                        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        final n nVar = T04;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue5, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str4;
                                        final int i112 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i112) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T04;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue5, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str4;
                                        final int i12 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar = (J5.a) obj3;
                                                switch (i12) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar).f2145a);
                                                        } else {
                                                            if (!(aVar instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T04.f421M0 = interfaceC0635a2;
                        interfaceC0635a2.invoke();
                        return p.f3034a;
                }
            }
        };
        Z3.a aVar = new Z3.a(19);
        final int i11 = 5;
        InterfaceC0646l interfaceC0646l2 = new InterfaceC0646l(this) { // from class: q7.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeListFragment f25898b;

            {
                this.f25898b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                String str;
                String str2;
                switch (i11) {
                    case 0:
                        this.f25898b.getClass();
                        return p.f3034a;
                    case 1:
                        List list = (List) obj;
                        ExchangeListFragment exchangeListFragment = this.f25898b;
                        if (exchangeListFragment.f12113v0 == ExchangeListFragment.ExchangesTab.f12122a) {
                            exchangeListFragment.U0(list, null, null);
                        }
                        return p.f3034a;
                    case 2:
                        ExchangeListFragment exchangeListFragment2 = this.f25898b;
                        MainActivity mainActivity = (MainActivity) exchangeListFragment2.requireActivity();
                        List<CryptoExchangeDomain> value = exchangeListFragment2.T0().f25924Z0.getValue();
                        if (value != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, false);
                        if (!exchangeListFragment2.f12115x0) {
                            n T02 = exchangeListFragment2.T0();
                            j jVar = new j(T02, 0);
                            T02.f418J0 = jVar;
                            jVar.invoke();
                            exchangeListFragment2.f12115x0 = true;
                        }
                        ExchangeListController exchangeListController = exchangeListFragment2.f12112u0;
                        if (exchangeListController == null) {
                            exchangeListController = null;
                        }
                        exchangeListFragment2.W0(exchangeListController.getActionTab(), exchangeListFragment2.T0().h0());
                        int ordinal = exchangeListFragment2.f12113v0.ordinal();
                        if (ordinal == 1) {
                            exchangeListFragment2.U0(null, exchangeListFragment2.T0().h0(), null);
                        } else if (ordinal == 2) {
                            exchangeListFragment2.U0(null, null, exchangeListFragment2.T0().f25924Z0.getValue());
                        }
                        return p.f3034a;
                    case 3:
                        this.f25898b.u0().f28413q.setRefreshing(false);
                        return p.f3034a;
                    case 4:
                        int intValue = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment3 = this.f25898b;
                        List<CryptoExchangeDomain> value2 = exchangeListFragment3.T0().f25924Z0.getValue();
                        Serializable serializable = null;
                        if (value2 != null) {
                            Iterator<T> it = value2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    Integer num = ((CryptoExchangeDomain) next).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                        serializable = next;
                                    }
                                }
                            }
                            serializable = (CryptoExchangeDomain) serializable;
                        }
                        if (serializable != null) {
                            NavController g10 = U4.b.g(exchangeListFragment3);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_exchangeListFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 5:
                        int intValue2 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment4 = this.f25898b;
                        List<CryptoAccountDomain> value3 = exchangeListFragment4.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain = null;
                        if (value3 != null) {
                            Iterator<T> it2 = value3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    Long l10 = ((CryptoAccountDomain) next2).f10963a;
                                    if (l10 != null && ((int) l10.longValue()) == intValue2) {
                                        cryptoAccountDomain = next2;
                                    }
                                }
                            }
                            cryptoAccountDomain = cryptoAccountDomain;
                        }
                        NavController g12 = U4.b.g(exchangeListFragment4);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10969g) == null) {
                            str = "";
                        }
                        g12.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType, str, ""));
                        return p.f3034a;
                    case 6:
                        int intValue3 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment5 = this.f25898b;
                        List<CryptoAccountDomain> value4 = exchangeListFragment5.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain2 = null;
                        if (value4 != null) {
                            Iterator<T> it3 = value4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    Long l11 = ((CryptoAccountDomain) next3).f10963a;
                                    if (l11 != null && ((int) l11.longValue()) == intValue3) {
                                        cryptoAccountDomain2 = next3;
                                    }
                                }
                            }
                            cryptoAccountDomain2 = cryptoAccountDomain2;
                        }
                        NavController g13 = U4.b.g(exchangeListFragment5);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        if (cryptoAccountDomain2 == null || (str2 = cryptoAccountDomain2.f10969g) == null) {
                            str2 = "";
                        }
                        g13.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType2, "", str2));
                        return p.f3034a;
                    case 7:
                        final int intValue4 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment6 = this.f25898b;
                        final n T03 = exchangeListFragment6.T0();
                        final String str3 = exchangeListFragment6.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T03.getClass();
                        final int i102 = 0;
                        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i102) {
                                    case 0:
                                        final n nVar = T03;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue4, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str3;
                                        final int i112 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i112) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T03;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue4, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str3;
                                        final int i12 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i12) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T03.N0 = interfaceC0635a;
                        interfaceC0635a.invoke();
                        return p.f3034a;
                    default:
                        final int intValue5 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment7 = this.f25898b;
                        final n T04 = exchangeListFragment7.T0();
                        final String str4 = exchangeListFragment7.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T04.getClass();
                        final int i112 = 1;
                        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i112) {
                                    case 0:
                                        final n nVar = T04;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue5, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str4;
                                        final int i1122 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i1122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T04;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue5, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str4;
                                        final int i12 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i12) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T04.f421M0 = interfaceC0635a2;
                        interfaceC0635a2.invoke();
                        return p.f3034a;
                }
            }
        };
        final int i12 = 6;
        InterfaceC0646l interfaceC0646l3 = new InterfaceC0646l(this) { // from class: q7.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeListFragment f25898b;

            {
                this.f25898b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                String str;
                String str2;
                switch (i12) {
                    case 0:
                        this.f25898b.getClass();
                        return p.f3034a;
                    case 1:
                        List list = (List) obj;
                        ExchangeListFragment exchangeListFragment = this.f25898b;
                        if (exchangeListFragment.f12113v0 == ExchangeListFragment.ExchangesTab.f12122a) {
                            exchangeListFragment.U0(list, null, null);
                        }
                        return p.f3034a;
                    case 2:
                        ExchangeListFragment exchangeListFragment2 = this.f25898b;
                        MainActivity mainActivity = (MainActivity) exchangeListFragment2.requireActivity();
                        List<CryptoExchangeDomain> value = exchangeListFragment2.T0().f25924Z0.getValue();
                        if (value != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, false);
                        if (!exchangeListFragment2.f12115x0) {
                            n T02 = exchangeListFragment2.T0();
                            j jVar = new j(T02, 0);
                            T02.f418J0 = jVar;
                            jVar.invoke();
                            exchangeListFragment2.f12115x0 = true;
                        }
                        ExchangeListController exchangeListController = exchangeListFragment2.f12112u0;
                        if (exchangeListController == null) {
                            exchangeListController = null;
                        }
                        exchangeListFragment2.W0(exchangeListController.getActionTab(), exchangeListFragment2.T0().h0());
                        int ordinal = exchangeListFragment2.f12113v0.ordinal();
                        if (ordinal == 1) {
                            exchangeListFragment2.U0(null, exchangeListFragment2.T0().h0(), null);
                        } else if (ordinal == 2) {
                            exchangeListFragment2.U0(null, null, exchangeListFragment2.T0().f25924Z0.getValue());
                        }
                        return p.f3034a;
                    case 3:
                        this.f25898b.u0().f28413q.setRefreshing(false);
                        return p.f3034a;
                    case 4:
                        int intValue = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment3 = this.f25898b;
                        List<CryptoExchangeDomain> value2 = exchangeListFragment3.T0().f25924Z0.getValue();
                        Serializable serializable = null;
                        if (value2 != null) {
                            Iterator<T> it = value2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    Integer num = ((CryptoExchangeDomain) next).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                        serializable = next;
                                    }
                                }
                            }
                            serializable = (CryptoExchangeDomain) serializable;
                        }
                        if (serializable != null) {
                            NavController g10 = U4.b.g(exchangeListFragment3);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_exchangeListFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 5:
                        int intValue2 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment4 = this.f25898b;
                        List<CryptoAccountDomain> value3 = exchangeListFragment4.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain = null;
                        if (value3 != null) {
                            Iterator<T> it2 = value3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    Long l10 = ((CryptoAccountDomain) next2).f10963a;
                                    if (l10 != null && ((int) l10.longValue()) == intValue2) {
                                        cryptoAccountDomain = next2;
                                    }
                                }
                            }
                            cryptoAccountDomain = cryptoAccountDomain;
                        }
                        NavController g12 = U4.b.g(exchangeListFragment4);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10969g) == null) {
                            str = "";
                        }
                        g12.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType, str, ""));
                        return p.f3034a;
                    case 6:
                        int intValue3 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment5 = this.f25898b;
                        List<CryptoAccountDomain> value4 = exchangeListFragment5.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain2 = null;
                        if (value4 != null) {
                            Iterator<T> it3 = value4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    Long l11 = ((CryptoAccountDomain) next3).f10963a;
                                    if (l11 != null && ((int) l11.longValue()) == intValue3) {
                                        cryptoAccountDomain2 = next3;
                                    }
                                }
                            }
                            cryptoAccountDomain2 = cryptoAccountDomain2;
                        }
                        NavController g13 = U4.b.g(exchangeListFragment5);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        if (cryptoAccountDomain2 == null || (str2 = cryptoAccountDomain2.f10969g) == null) {
                            str2 = "";
                        }
                        g13.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType2, "", str2));
                        return p.f3034a;
                    case 7:
                        final int intValue4 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment6 = this.f25898b;
                        final n T03 = exchangeListFragment6.T0();
                        final String str3 = exchangeListFragment6.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T03.getClass();
                        final int i102 = 0;
                        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i102) {
                                    case 0:
                                        final n nVar = T03;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue4, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str3;
                                        final int i1122 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i1122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T03;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue4, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str3;
                                        final int i122 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T03.N0 = interfaceC0635a;
                        interfaceC0635a.invoke();
                        return p.f3034a;
                    default:
                        final int intValue5 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment7 = this.f25898b;
                        final n T04 = exchangeListFragment7.T0();
                        final String str4 = exchangeListFragment7.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T04.getClass();
                        final int i112 = 1;
                        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i112) {
                                    case 0:
                                        final n nVar = T04;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue5, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str4;
                                        final int i1122 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i1122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T04;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue5, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str4;
                                        final int i122 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T04.f421M0 = interfaceC0635a2;
                        interfaceC0635a2.invoke();
                        return p.f3034a;
                }
            }
        };
        final int i13 = 7;
        InterfaceC0646l interfaceC0646l4 = new InterfaceC0646l(this) { // from class: q7.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeListFragment f25898b;

            {
                this.f25898b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                String str;
                String str2;
                switch (i13) {
                    case 0:
                        this.f25898b.getClass();
                        return p.f3034a;
                    case 1:
                        List list = (List) obj;
                        ExchangeListFragment exchangeListFragment = this.f25898b;
                        if (exchangeListFragment.f12113v0 == ExchangeListFragment.ExchangesTab.f12122a) {
                            exchangeListFragment.U0(list, null, null);
                        }
                        return p.f3034a;
                    case 2:
                        ExchangeListFragment exchangeListFragment2 = this.f25898b;
                        MainActivity mainActivity = (MainActivity) exchangeListFragment2.requireActivity();
                        List<CryptoExchangeDomain> value = exchangeListFragment2.T0().f25924Z0.getValue();
                        if (value != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, false);
                        if (!exchangeListFragment2.f12115x0) {
                            n T02 = exchangeListFragment2.T0();
                            j jVar = new j(T02, 0);
                            T02.f418J0 = jVar;
                            jVar.invoke();
                            exchangeListFragment2.f12115x0 = true;
                        }
                        ExchangeListController exchangeListController = exchangeListFragment2.f12112u0;
                        if (exchangeListController == null) {
                            exchangeListController = null;
                        }
                        exchangeListFragment2.W0(exchangeListController.getActionTab(), exchangeListFragment2.T0().h0());
                        int ordinal = exchangeListFragment2.f12113v0.ordinal();
                        if (ordinal == 1) {
                            exchangeListFragment2.U0(null, exchangeListFragment2.T0().h0(), null);
                        } else if (ordinal == 2) {
                            exchangeListFragment2.U0(null, null, exchangeListFragment2.T0().f25924Z0.getValue());
                        }
                        return p.f3034a;
                    case 3:
                        this.f25898b.u0().f28413q.setRefreshing(false);
                        return p.f3034a;
                    case 4:
                        int intValue = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment3 = this.f25898b;
                        List<CryptoExchangeDomain> value2 = exchangeListFragment3.T0().f25924Z0.getValue();
                        Serializable serializable = null;
                        if (value2 != null) {
                            Iterator<T> it = value2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    Integer num = ((CryptoExchangeDomain) next).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                        serializable = next;
                                    }
                                }
                            }
                            serializable = (CryptoExchangeDomain) serializable;
                        }
                        if (serializable != null) {
                            NavController g10 = U4.b.g(exchangeListFragment3);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_exchangeListFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 5:
                        int intValue2 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment4 = this.f25898b;
                        List<CryptoAccountDomain> value3 = exchangeListFragment4.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain = null;
                        if (value3 != null) {
                            Iterator<T> it2 = value3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    Long l10 = ((CryptoAccountDomain) next2).f10963a;
                                    if (l10 != null && ((int) l10.longValue()) == intValue2) {
                                        cryptoAccountDomain = next2;
                                    }
                                }
                            }
                            cryptoAccountDomain = cryptoAccountDomain;
                        }
                        NavController g12 = U4.b.g(exchangeListFragment4);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10969g) == null) {
                            str = "";
                        }
                        g12.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType, str, ""));
                        return p.f3034a;
                    case 6:
                        int intValue3 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment5 = this.f25898b;
                        List<CryptoAccountDomain> value4 = exchangeListFragment5.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain2 = null;
                        if (value4 != null) {
                            Iterator<T> it3 = value4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    Long l11 = ((CryptoAccountDomain) next3).f10963a;
                                    if (l11 != null && ((int) l11.longValue()) == intValue3) {
                                        cryptoAccountDomain2 = next3;
                                    }
                                }
                            }
                            cryptoAccountDomain2 = cryptoAccountDomain2;
                        }
                        NavController g13 = U4.b.g(exchangeListFragment5);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        if (cryptoAccountDomain2 == null || (str2 = cryptoAccountDomain2.f10969g) == null) {
                            str2 = "";
                        }
                        g13.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType2, "", str2));
                        return p.f3034a;
                    case 7:
                        final int intValue4 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment6 = this.f25898b;
                        final n T03 = exchangeListFragment6.T0();
                        final String str3 = exchangeListFragment6.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T03.getClass();
                        final int i102 = 0;
                        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i102) {
                                    case 0:
                                        final n nVar = T03;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue4, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str3;
                                        final int i1122 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i1122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T03;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue4, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str3;
                                        final int i122 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T03.N0 = interfaceC0635a;
                        interfaceC0635a.invoke();
                        return p.f3034a;
                    default:
                        final int intValue5 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment7 = this.f25898b;
                        final n T04 = exchangeListFragment7.T0();
                        final String str4 = exchangeListFragment7.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T04.getClass();
                        final int i112 = 1;
                        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i112) {
                                    case 0:
                                        final n nVar = T04;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue5, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str4;
                                        final int i1122 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i1122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T04;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue5, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str4;
                                        final int i122 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T04.f421M0 = interfaceC0635a2;
                        interfaceC0635a2.invoke();
                        return p.f3034a;
                }
            }
        };
        final int i14 = 8;
        this.f12112u0 = new ExchangeListController(requireContext, interfaceC0646l, aVar, interfaceC0646l2, interfaceC0646l3, interfaceC0646l4, new InterfaceC0646l(this) { // from class: q7.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeListFragment f25898b;

            {
                this.f25898b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                String str;
                String str2;
                switch (i14) {
                    case 0:
                        this.f25898b.getClass();
                        return p.f3034a;
                    case 1:
                        List list = (List) obj;
                        ExchangeListFragment exchangeListFragment = this.f25898b;
                        if (exchangeListFragment.f12113v0 == ExchangeListFragment.ExchangesTab.f12122a) {
                            exchangeListFragment.U0(list, null, null);
                        }
                        return p.f3034a;
                    case 2:
                        ExchangeListFragment exchangeListFragment2 = this.f25898b;
                        MainActivity mainActivity = (MainActivity) exchangeListFragment2.requireActivity();
                        List<CryptoExchangeDomain> value = exchangeListFragment2.T0().f25924Z0.getValue();
                        if (value != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, false);
                        if (!exchangeListFragment2.f12115x0) {
                            n T02 = exchangeListFragment2.T0();
                            j jVar = new j(T02, 0);
                            T02.f418J0 = jVar;
                            jVar.invoke();
                            exchangeListFragment2.f12115x0 = true;
                        }
                        ExchangeListController exchangeListController = exchangeListFragment2.f12112u0;
                        if (exchangeListController == null) {
                            exchangeListController = null;
                        }
                        exchangeListFragment2.W0(exchangeListController.getActionTab(), exchangeListFragment2.T0().h0());
                        int ordinal = exchangeListFragment2.f12113v0.ordinal();
                        if (ordinal == 1) {
                            exchangeListFragment2.U0(null, exchangeListFragment2.T0().h0(), null);
                        } else if (ordinal == 2) {
                            exchangeListFragment2.U0(null, null, exchangeListFragment2.T0().f25924Z0.getValue());
                        }
                        return p.f3034a;
                    case 3:
                        this.f25898b.u0().f28413q.setRefreshing(false);
                        return p.f3034a;
                    case 4:
                        int intValue = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment3 = this.f25898b;
                        List<CryptoExchangeDomain> value2 = exchangeListFragment3.T0().f25924Z0.getValue();
                        Serializable serializable = null;
                        if (value2 != null) {
                            Iterator<T> it = value2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    Integer num = ((CryptoExchangeDomain) next).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                        serializable = next;
                                    }
                                }
                            }
                            serializable = (CryptoExchangeDomain) serializable;
                        }
                        if (serializable != null) {
                            NavController g10 = U4.b.g(exchangeListFragment3);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_exchangeListFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 5:
                        int intValue2 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment4 = this.f25898b;
                        List<CryptoAccountDomain> value3 = exchangeListFragment4.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain = null;
                        if (value3 != null) {
                            Iterator<T> it2 = value3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    Long l10 = ((CryptoAccountDomain) next2).f10963a;
                                    if (l10 != null && ((int) l10.longValue()) == intValue2) {
                                        cryptoAccountDomain = next2;
                                    }
                                }
                            }
                            cryptoAccountDomain = cryptoAccountDomain;
                        }
                        NavController g12 = U4.b.g(exchangeListFragment4);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10969g) == null) {
                            str = "";
                        }
                        g12.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType, str, ""));
                        return p.f3034a;
                    case 6:
                        int intValue3 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment5 = this.f25898b;
                        List<CryptoAccountDomain> value4 = exchangeListFragment5.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain2 = null;
                        if (value4 != null) {
                            Iterator<T> it3 = value4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    Long l11 = ((CryptoAccountDomain) next3).f10963a;
                                    if (l11 != null && ((int) l11.longValue()) == intValue3) {
                                        cryptoAccountDomain2 = next3;
                                    }
                                }
                            }
                            cryptoAccountDomain2 = cryptoAccountDomain2;
                        }
                        NavController g13 = U4.b.g(exchangeListFragment5);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        if (cryptoAccountDomain2 == null || (str2 = cryptoAccountDomain2.f10969g) == null) {
                            str2 = "";
                        }
                        g13.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType2, "", str2));
                        return p.f3034a;
                    case 7:
                        final int intValue4 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment6 = this.f25898b;
                        final n T03 = exchangeListFragment6.T0();
                        final String str3 = exchangeListFragment6.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T03.getClass();
                        final int i102 = 0;
                        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i102) {
                                    case 0:
                                        final n nVar = T03;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue4, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str3;
                                        final int i1122 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i1122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T03;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue4, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str3;
                                        final int i122 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T03.N0 = interfaceC0635a;
                        interfaceC0635a.invoke();
                        return p.f3034a;
                    default:
                        final int intValue5 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment7 = this.f25898b;
                        final n T04 = exchangeListFragment7.T0();
                        final String str4 = exchangeListFragment7.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T04.getClass();
                        final int i112 = 1;
                        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i112) {
                                    case 0:
                                        final n nVar = T04;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue5, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str4;
                                        final int i1122 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i1122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T04;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue5, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str4;
                                        final int i122 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T04.f421M0 = interfaceC0635a2;
                        interfaceC0635a2.invoke();
                        return p.f3034a;
                }
            }
        }, bVar, new q7.f(this, 0));
        u0().f28413q.setOnRefreshListener(new com.sumsub.sns.geo.presentation.d(this, 17));
        R3 u02 = u0();
        ExchangeListController exchangeListController = this.f12112u0;
        if (exchangeListController == null) {
            exchangeListController = null;
        }
        u02.f28412p.setAdapter(exchangeListController.getAdapter());
        u0().f28412p.addOnScrollListener(new a());
        ExchangeListController exchangeListController2 = this.f12112u0;
        if (exchangeListController2 == null) {
            exchangeListController2 = null;
        }
        exchangeListController2.setData(null, null, null, Integer.valueOf(this.f12113v0.ordinal()));
        final int i15 = 1;
        T0().f25923Y0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: q7.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeListFragment f25898b;

            {
                this.f25898b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                String str;
                String str2;
                switch (i15) {
                    case 0:
                        this.f25898b.getClass();
                        return p.f3034a;
                    case 1:
                        List list = (List) obj;
                        ExchangeListFragment exchangeListFragment = this.f25898b;
                        if (exchangeListFragment.f12113v0 == ExchangeListFragment.ExchangesTab.f12122a) {
                            exchangeListFragment.U0(list, null, null);
                        }
                        return p.f3034a;
                    case 2:
                        ExchangeListFragment exchangeListFragment2 = this.f25898b;
                        MainActivity mainActivity = (MainActivity) exchangeListFragment2.requireActivity();
                        List<CryptoExchangeDomain> value = exchangeListFragment2.T0().f25924Z0.getValue();
                        if (value != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, false);
                        if (!exchangeListFragment2.f12115x0) {
                            n T02 = exchangeListFragment2.T0();
                            j jVar = new j(T02, 0);
                            T02.f418J0 = jVar;
                            jVar.invoke();
                            exchangeListFragment2.f12115x0 = true;
                        }
                        ExchangeListController exchangeListController3 = exchangeListFragment2.f12112u0;
                        if (exchangeListController3 == null) {
                            exchangeListController3 = null;
                        }
                        exchangeListFragment2.W0(exchangeListController3.getActionTab(), exchangeListFragment2.T0().h0());
                        int ordinal = exchangeListFragment2.f12113v0.ordinal();
                        if (ordinal == 1) {
                            exchangeListFragment2.U0(null, exchangeListFragment2.T0().h0(), null);
                        } else if (ordinal == 2) {
                            exchangeListFragment2.U0(null, null, exchangeListFragment2.T0().f25924Z0.getValue());
                        }
                        return p.f3034a;
                    case 3:
                        this.f25898b.u0().f28413q.setRefreshing(false);
                        return p.f3034a;
                    case 4:
                        int intValue = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment3 = this.f25898b;
                        List<CryptoExchangeDomain> value2 = exchangeListFragment3.T0().f25924Z0.getValue();
                        Serializable serializable = null;
                        if (value2 != null) {
                            Iterator<T> it = value2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    Integer num = ((CryptoExchangeDomain) next).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                        serializable = next;
                                    }
                                }
                            }
                            serializable = (CryptoExchangeDomain) serializable;
                        }
                        if (serializable != null) {
                            NavController g10 = U4.b.g(exchangeListFragment3);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_exchangeListFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 5:
                        int intValue2 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment4 = this.f25898b;
                        List<CryptoAccountDomain> value3 = exchangeListFragment4.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain = null;
                        if (value3 != null) {
                            Iterator<T> it2 = value3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    Long l10 = ((CryptoAccountDomain) next2).f10963a;
                                    if (l10 != null && ((int) l10.longValue()) == intValue2) {
                                        cryptoAccountDomain = next2;
                                    }
                                }
                            }
                            cryptoAccountDomain = cryptoAccountDomain;
                        }
                        NavController g12 = U4.b.g(exchangeListFragment4);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10969g) == null) {
                            str = "";
                        }
                        g12.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType, str, ""));
                        return p.f3034a;
                    case 6:
                        int intValue3 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment5 = this.f25898b;
                        List<CryptoAccountDomain> value4 = exchangeListFragment5.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain2 = null;
                        if (value4 != null) {
                            Iterator<T> it3 = value4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    Long l11 = ((CryptoAccountDomain) next3).f10963a;
                                    if (l11 != null && ((int) l11.longValue()) == intValue3) {
                                        cryptoAccountDomain2 = next3;
                                    }
                                }
                            }
                            cryptoAccountDomain2 = cryptoAccountDomain2;
                        }
                        NavController g13 = U4.b.g(exchangeListFragment5);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        if (cryptoAccountDomain2 == null || (str2 = cryptoAccountDomain2.f10969g) == null) {
                            str2 = "";
                        }
                        g13.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType2, "", str2));
                        return p.f3034a;
                    case 7:
                        final int intValue4 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment6 = this.f25898b;
                        final n T03 = exchangeListFragment6.T0();
                        final String str3 = exchangeListFragment6.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T03.getClass();
                        final int i102 = 0;
                        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i102) {
                                    case 0:
                                        final n nVar = T03;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue4, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str3;
                                        final int i1122 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i1122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T03;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue4, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str3;
                                        final int i122 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T03.N0 = interfaceC0635a;
                        interfaceC0635a.invoke();
                        return p.f3034a;
                    default:
                        final int intValue5 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment7 = this.f25898b;
                        final n T04 = exchangeListFragment7.T0();
                        final String str4 = exchangeListFragment7.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T04.getClass();
                        final int i112 = 1;
                        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i112) {
                                    case 0:
                                        final n nVar = T04;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue5, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str4;
                                        final int i1122 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i1122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T04;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue5, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str4;
                                        final int i122 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T04.f421M0 = interfaceC0635a2;
                        interfaceC0635a2.invoke();
                        return p.f3034a;
                }
            }
        }));
        final int i16 = 2;
        T0().f25924Z0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: q7.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeListFragment f25898b;

            {
                this.f25898b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                int i92;
                String str;
                String str2;
                switch (i16) {
                    case 0:
                        this.f25898b.getClass();
                        return p.f3034a;
                    case 1:
                        List list = (List) obj;
                        ExchangeListFragment exchangeListFragment = this.f25898b;
                        if (exchangeListFragment.f12113v0 == ExchangeListFragment.ExchangesTab.f12122a) {
                            exchangeListFragment.U0(list, null, null);
                        }
                        return p.f3034a;
                    case 2:
                        ExchangeListFragment exchangeListFragment2 = this.f25898b;
                        MainActivity mainActivity = (MainActivity) exchangeListFragment2.requireActivity();
                        List<CryptoExchangeDomain> value = exchangeListFragment2.T0().f25924Z0.getValue();
                        if (value != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : value) {
                                if (((CryptoExchangeDomain) obj2).d()) {
                                    arrayList.add(obj2);
                                }
                            }
                            i92 = arrayList.size();
                        } else {
                            i92 = 0;
                        }
                        mainActivity.G(i92, false);
                        if (!exchangeListFragment2.f12115x0) {
                            n T02 = exchangeListFragment2.T0();
                            j jVar = new j(T02, 0);
                            T02.f418J0 = jVar;
                            jVar.invoke();
                            exchangeListFragment2.f12115x0 = true;
                        }
                        ExchangeListController exchangeListController3 = exchangeListFragment2.f12112u0;
                        if (exchangeListController3 == null) {
                            exchangeListController3 = null;
                        }
                        exchangeListFragment2.W0(exchangeListController3.getActionTab(), exchangeListFragment2.T0().h0());
                        int ordinal = exchangeListFragment2.f12113v0.ordinal();
                        if (ordinal == 1) {
                            exchangeListFragment2.U0(null, exchangeListFragment2.T0().h0(), null);
                        } else if (ordinal == 2) {
                            exchangeListFragment2.U0(null, null, exchangeListFragment2.T0().f25924Z0.getValue());
                        }
                        return p.f3034a;
                    case 3:
                        this.f25898b.u0().f28413q.setRefreshing(false);
                        return p.f3034a;
                    case 4:
                        int intValue = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment3 = this.f25898b;
                        List<CryptoExchangeDomain> value2 = exchangeListFragment3.T0().f25924Z0.getValue();
                        Serializable serializable = null;
                        if (value2 != null) {
                            Iterator<T> it = value2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    Integer num = ((CryptoExchangeDomain) next).f11017a;
                                    if (num != null && num.intValue() == intValue) {
                                        serializable = next;
                                    }
                                }
                            }
                            serializable = (CryptoExchangeDomain) serializable;
                        }
                        if (serializable != null) {
                            NavController g10 = U4.b.g(exchangeListFragment3);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_exchangeListFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 5:
                        int intValue2 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment4 = this.f25898b;
                        List<CryptoAccountDomain> value3 = exchangeListFragment4.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain = null;
                        if (value3 != null) {
                            Iterator<T> it2 = value3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    Long l10 = ((CryptoAccountDomain) next2).f10963a;
                                    if (l10 != null && ((int) l10.longValue()) == intValue2) {
                                        cryptoAccountDomain = next2;
                                    }
                                }
                            }
                            cryptoAccountDomain = cryptoAccountDomain;
                        }
                        NavController g12 = U4.b.g(exchangeListFragment4);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        if (cryptoAccountDomain == null || (str = cryptoAccountDomain.f10969g) == null) {
                            str = "";
                        }
                        g12.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType, str, ""));
                        return p.f3034a;
                    case 6:
                        int intValue3 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment5 = this.f25898b;
                        List<CryptoAccountDomain> value4 = exchangeListFragment5.T0().f25923Y0.getValue();
                        CryptoAccountDomain cryptoAccountDomain2 = null;
                        if (value4 != null) {
                            Iterator<T> it3 = value4.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    Long l11 = ((CryptoAccountDomain) next3).f10963a;
                                    if (l11 != null && ((int) l11.longValue()) == intValue3) {
                                        cryptoAccountDomain2 = next3;
                                    }
                                }
                            }
                            cryptoAccountDomain2 = cryptoAccountDomain2;
                        }
                        NavController g13 = U4.b.g(exchangeListFragment5);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        if (cryptoAccountDomain2 == null || (str2 = cryptoAccountDomain2.f10969g) == null) {
                            str2 = "";
                        }
                        g13.j(i.a(false, cryptoExchangeFragment$Companion$DirectionType2, "", str2));
                        return p.f3034a;
                    case 7:
                        final int intValue4 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment6 = this.f25898b;
                        final n T03 = exchangeListFragment6.T0();
                        final String str3 = exchangeListFragment6.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T03.getClass();
                        final int i102 = 0;
                        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i102) {
                                    case 0:
                                        final n nVar = T03;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue4, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str3;
                                        final int i1122 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i1122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T03;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue4, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str3;
                                        final int i122 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T03.N0 = interfaceC0635a;
                        interfaceC0635a.invoke();
                        return p.f3034a;
                    default:
                        final int intValue5 = ((Integer) obj).intValue();
                        ExchangeListFragment exchangeListFragment7 = this.f25898b;
                        final n T04 = exchangeListFragment7.T0();
                        final String str4 = exchangeListFragment7.f12110r0.get(ExchangeListFragment.ExchangesTab.f12123b);
                        T04.getClass();
                        final int i112 = 1;
                        InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: q7.l
                            @Override // ca.InterfaceC0635a
                            public final Object invoke() {
                                switch (i112) {
                                    case 0:
                                        final n nVar = T04;
                                        nVar.l();
                                        v5.g gVar2 = new v5.g(intValue5, nVar.f25918T0.h(), "REFUND_REQUESTED", null, null);
                                        final String str42 = str4;
                                        final int i1122 = 1;
                                        nVar.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str42;
                                                n nVar22 = nVar;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i1122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar2);
                                        break;
                                    default:
                                        final n nVar2 = T04;
                                        nVar2.l();
                                        v5.g gVar22 = new v5.g(intValue5, nVar2.f25918T0.h(), "READY", null, null);
                                        final String str5 = str4;
                                        final int i122 = 0;
                                        nVar2.f25921W0.a(new InterfaceC0646l() { // from class: q7.m
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // ca.InterfaceC0646l
                                            public final Object invoke(Object obj3) {
                                                String str52 = str5;
                                                n nVar22 = nVar2;
                                                J5.a aVar2 = (J5.a) obj3;
                                                switch (i122) {
                                                    case 0:
                                                        nVar22.k();
                                                        k kVar = new k(nVar22, 1);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                    default:
                                                        nVar22.k();
                                                        k kVar2 = new k(nVar22, 3);
                                                        if (aVar2 instanceof a.C0026a) {
                                                            kVar2.invoke(((a.C0026a) aVar2).f2145a);
                                                        } else {
                                                            if (!(aVar2 instanceof a.b)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            nVar22.i0(str52);
                                                            p pVar2 = p.f3034a;
                                                        }
                                                        return p.f3034a;
                                                }
                                            }
                                        }, gVar22);
                                        break;
                                }
                                return p.f3034a;
                            }
                        };
                        T04.f421M0 = interfaceC0635a2;
                        interfaceC0635a2.invoke();
                        return p.f3034a;
                }
            }
        }));
        ExchangeListController exchangeListController3 = this.f12112u0;
        W0((exchangeListController3 != null ? exchangeListController3 : null).getActionTab(), T0().h0());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12106n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean x0() {
        return this.f12111t0;
    }
}
