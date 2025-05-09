package com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details;

import C.v;
import F8.o;
import O9.f;
import O9.p;
import P9.m;
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
import androidx.lifecycle.C0552s;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
import c.RunnableC0615f;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import ka.C0969n;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.d;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import l7.h;
import t6.C3;

/* compiled from: CryptoAccountDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class CryptoAccountDetailsFragment extends BaseFragment<C3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11998n0 = R.layout.fragment_crypto_account_details;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11999o0;

    /* renamed from: p0, reason: collision with root package name */
    public CryptoAccountDetailsController f12000p0;

    /* renamed from: q0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a f12001q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f12002r0;
    public String s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f12003t0;

    /* renamed from: u0, reason: collision with root package name */
    public Timer f12004u0;

    /* renamed from: v0, reason: collision with root package name */
    public final f f12005v0;

    /* compiled from: CryptoAccountDetailsFragment.kt */
    public static final class a extends RecyclerView.s {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            CryptoAccountDomain cryptoAccountDomain;
            Long l10;
            super.onScrolled(recyclerView, i, i9);
            CryptoAccountDetailsFragment cryptoAccountDetailsFragment = CryptoAccountDetailsFragment.this;
            if (cryptoAccountDetailsFragment.f12002r0 != 1 || recyclerView.canScrollVertically(1) || cryptoAccountDetailsFragment.f12003t0 || cryptoAccountDetailsFragment.T0().f23580X0) {
                return;
            }
            cryptoAccountDetailsFragment.f12003t0 = true;
            com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar = cryptoAccountDetailsFragment.f12001q0;
            if (aVar == null || (cryptoAccountDomain = aVar.f12016a) == null || (l10 = cryptoAccountDomain.f10963a) == null) {
                return;
            }
            long longValue = l10.longValue();
            h T02 = cryptoAccountDetailsFragment.T0();
            G7.f fVar = new G7.f(T02, (int) longValue, cryptoAccountDetailsFragment.s0, 3);
            T02.f418J0 = fVar;
            fVar.invoke();
        }
    }

    /* compiled from: CryptoAccountDetailsFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12012a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f12012a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12012a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12012a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsFragment$special$$inlined$viewModel$default$1] */
    public CryptoAccountDetailsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11999o0 = E.a(this, kotlin.jvm.internal.h.a(h.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(h.class), null, null, b.l(this));
            }
        });
        this.s0 = "";
        SortDialog.Status status = SortDialog.Status.f13217a;
        SortDialog.Direction direction = SortDialog.Direction.f13213a;
        new Handler(Looper.getMainLooper());
        this.f12005v0 = kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<K5.a>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsFragment$special$$inlined$inject$default$1
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

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void D0(Date date, Date date2) {
        L0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void E0(SortDialog.Status status, SortDialog.Direction direction) {
        L0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        CryptoAccountDomain cryptoAccountDomain;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.wallet_details);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 18;
        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar = this.f12001q0;
        toolbarStatus.f13280s = ((aVar == null || (cryptoAccountDomain = aVar.f12016a) == null) ? null : cryptoAccountDomain.f10967e) == CryptoAccountDomain.WalletStatus.f10985h ? Integer.valueOf(R.drawable.ic_warning) : null;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        CryptoAccountDomain cryptoAccountDomain;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        int i = this.f12002r0;
        toolbarStatus.f13263a = i != 0 ? i != 1 ? i != 2 ? getString(R.string.empty) : getString(R.string.cards) : getString(R.string.transactions) : getString(R.string.summary);
        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar = this.f12001q0;
        toolbarStatus.f13280s = ((aVar == null || (cryptoAccountDomain = aVar.f12016a) == null) ? null : cryptoAccountDomain.f10967e) == CryptoAccountDomain.WalletStatus.f10985h ? Integer.valueOf(R.drawable.ic_warning) : null;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    public final h T0() {
        return (h) this.f11999o0.getValue();
    }

    public final void U0(CryptoAccountDomain cryptoAccountDomain, List<CryptoExchangeDomain> list) {
        if (this.s0.length() != 0) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) obj;
                    String str = cryptoExchangeDomain.f11028m;
                    if (str != null) {
                        Locale locale = Locale.ROOT;
                        if (C0969n.Y(str.toLowerCase(locale), this.s0.toLowerCase(locale), false)) {
                            arrayList.add(obj);
                        }
                    }
                    String str2 = cryptoExchangeDomain.f11027l;
                    if (str2 != null) {
                        Locale locale2 = Locale.ROOT;
                        if (C0969n.Y(str2.toLowerCase(locale2), this.s0.toLowerCase(locale2), false)) {
                            arrayList.add(obj);
                        }
                    }
                }
                list = arrayList;
            } else {
                list = null;
            }
        }
        CryptoAccountDetailsController cryptoAccountDetailsController = this.f12000p0;
        (cryptoAccountDetailsController != null ? cryptoAccountDetailsController : null).setData(cryptoAccountDomain, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) H8.a.a(this, list), Integer.valueOf(this.f12002r0));
    }

    public final void V0(TabLayout.g gVar) {
        TabLayout.i iVar;
        CryptoAccountDomain cryptoAccountDomain;
        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar = this.f12001q0;
        View view = null;
        if (((aVar == null || (cryptoAccountDomain = aVar.f12016a) == null) ? null : cryptoAccountDomain.f10967e) == CryptoAccountDomain.WalletStatus.f10985h) {
            if (gVar != null && (iVar = gVar.f9859h) != null) {
                view = iVar.getChildAt(1);
            }
            TextView textView = (TextView) view;
            if (textView != null) {
                o.h(textView, R.color.red);
            }
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, B6.a
    public final void m0() {
        SortDialog.Status status = SortDialog.Status.f13217a;
        this.s0 = "";
        L0();
        o0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12001q0 = a.C0121a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Timer timer = this.f12004u0;
        if (timer == null) {
            timer = null;
        }
        timer.cancel();
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.s0.length() > 0) {
            I0(this.s0);
        }
        C3 u02 = u0();
        u02.f27682q.postDelayed(new RunnableC0615f(this, 11), 100L);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CryptoAccountDomain cryptoAccountDomain;
        Long l10;
        super.onViewCreated(view, bundle);
        this.f12004u0 = new Timer();
        TabLayout.d dVar = new TabLayout.d() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsFragment$onViewCreated$tabChangeListener$1
            @Override // com.google.android.material.tabs.TabLayout.c
            public final void a(TabLayout.g gVar) {
                CryptoAccountDetailsFragment cryptoAccountDetailsFragment = CryptoAccountDetailsFragment.this;
                if (cryptoAccountDetailsFragment.getView() == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(C0552s.a(cryptoAccountDetailsFragment.getViewLifecycleOwner()), Dispatchers.getMain(), null, new CryptoAccountDetailsFragment$onViewCreated$tabChangeListener$1$onTabSelected$1(cryptoAccountDetailsFragment, gVar, null), 2, null);
            }
        };
        Context requireContext = requireContext();
        final int i = 0;
        InterfaceC0635a interfaceC0635a = new InterfaceC0635a(this) { // from class: l7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAccountDetailsFragment f23565b;

            {
                this.f23565b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                String str;
                CryptoAccountDomain cryptoAccountDomain2;
                String str2;
                CryptoAccountDomain cryptoAccountDomain3;
                switch (i) {
                    case 0:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment = this.f23565b;
                        NavController g10 = U4.b.g(cryptoAccountDetailsFragment);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar = cryptoAccountDetailsFragment.f12001q0;
                        if (aVar == null || (cryptoAccountDomain2 = aVar.f12016a) == null || (str = cryptoAccountDomain2.f10969g) == null) {
                            str = "";
                        }
                        g10.j(g.a(cryptoExchangeFragment$Companion$DirectionType, "", str));
                        return p.f3034a;
                    case 1:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment2 = this.f23565b;
                        NavController g11 = U4.b.g(cryptoAccountDetailsFragment2);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar2 = cryptoAccountDetailsFragment2.f12001q0;
                        if (aVar2 == null || (cryptoAccountDomain3 = aVar2.f12016a) == null || (str2 = cryptoAccountDomain3.f10969g) == null) {
                            str2 = "";
                        }
                        g11.j(g.a(cryptoExchangeFragment$Companion$DirectionType2, str2, ""));
                        return p.f3034a;
                    case 2:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment3 = this.f23565b;
                        NavController g12 = U4.b.g(cryptoAccountDetailsFragment3);
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar3 = cryptoAccountDetailsFragment3.f12001q0;
                        Serializable serializable = aVar3 != null ? aVar3.f12016a : null;
                        Bundle g13 = v.g(g12);
                        if (Parcelable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                            g13.putParcelable("account", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g13.putSerializable("account", serializable);
                        }
                        g12.i(R.id.action_walletDetailsFragment_to_depositCryptoFragment, g13);
                        return p.f3034a;
                    case 3:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment4 = this.f23565b;
                        NavController g14 = U4.b.g(cryptoAccountDetailsFragment4);
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar4 = cryptoAccountDetailsFragment4.f12001q0;
                        g14.j(new f(aVar4 != null ? aVar4.f12016a : null));
                        return p.f3034a;
                    default:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment5 = this.f23565b;
                        G5.a l11 = ((K5.a) cryptoAccountDetailsFragment5.f12005v0.getValue()).l();
                        String str3 = l11 != null ? l11.f1320a : null;
                        if (str3 == null || str3.length() == 0) {
                            BaseFragment.q0(cryptoAccountDetailsFragment5, m.n(cryptoAccountDetailsFragment5.getString(R.string.support_email_app_name)));
                        } else {
                            G5.a l12 = ((K5.a) cryptoAccountDetailsFragment5.f12005v0.getValue()).l();
                            BaseFragment.q0(cryptoAccountDetailsFragment5, m.n(l12 != null ? l12.f1320a : null));
                        }
                        return p.f3034a;
                }
            }
        };
        final int i9 = 1;
        InterfaceC0635a interfaceC0635a2 = new InterfaceC0635a(this) { // from class: l7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAccountDetailsFragment f23565b;

            {
                this.f23565b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                String str;
                CryptoAccountDomain cryptoAccountDomain2;
                String str2;
                CryptoAccountDomain cryptoAccountDomain3;
                switch (i9) {
                    case 0:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment = this.f23565b;
                        NavController g10 = U4.b.g(cryptoAccountDetailsFragment);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar = cryptoAccountDetailsFragment.f12001q0;
                        if (aVar == null || (cryptoAccountDomain2 = aVar.f12016a) == null || (str = cryptoAccountDomain2.f10969g) == null) {
                            str = "";
                        }
                        g10.j(g.a(cryptoExchangeFragment$Companion$DirectionType, "", str));
                        return p.f3034a;
                    case 1:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment2 = this.f23565b;
                        NavController g11 = U4.b.g(cryptoAccountDetailsFragment2);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar2 = cryptoAccountDetailsFragment2.f12001q0;
                        if (aVar2 == null || (cryptoAccountDomain3 = aVar2.f12016a) == null || (str2 = cryptoAccountDomain3.f10969g) == null) {
                            str2 = "";
                        }
                        g11.j(g.a(cryptoExchangeFragment$Companion$DirectionType2, str2, ""));
                        return p.f3034a;
                    case 2:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment3 = this.f23565b;
                        NavController g12 = U4.b.g(cryptoAccountDetailsFragment3);
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar3 = cryptoAccountDetailsFragment3.f12001q0;
                        Serializable serializable = aVar3 != null ? aVar3.f12016a : null;
                        Bundle g13 = v.g(g12);
                        if (Parcelable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                            g13.putParcelable("account", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g13.putSerializable("account", serializable);
                        }
                        g12.i(R.id.action_walletDetailsFragment_to_depositCryptoFragment, g13);
                        return p.f3034a;
                    case 3:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment4 = this.f23565b;
                        NavController g14 = U4.b.g(cryptoAccountDetailsFragment4);
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar4 = cryptoAccountDetailsFragment4.f12001q0;
                        g14.j(new f(aVar4 != null ? aVar4.f12016a : null));
                        return p.f3034a;
                    default:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment5 = this.f23565b;
                        G5.a l11 = ((K5.a) cryptoAccountDetailsFragment5.f12005v0.getValue()).l();
                        String str3 = l11 != null ? l11.f1320a : null;
                        if (str3 == null || str3.length() == 0) {
                            BaseFragment.q0(cryptoAccountDetailsFragment5, m.n(cryptoAccountDetailsFragment5.getString(R.string.support_email_app_name)));
                        } else {
                            G5.a l12 = ((K5.a) cryptoAccountDetailsFragment5.f12005v0.getValue()).l();
                            BaseFragment.q0(cryptoAccountDetailsFragment5, m.n(l12 != null ? l12.f1320a : null));
                        }
                        return p.f3034a;
                }
            }
        };
        final int i10 = 2;
        InterfaceC0635a interfaceC0635a3 = new InterfaceC0635a(this) { // from class: l7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAccountDetailsFragment f23565b;

            {
                this.f23565b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                String str;
                CryptoAccountDomain cryptoAccountDomain2;
                String str2;
                CryptoAccountDomain cryptoAccountDomain3;
                switch (i10) {
                    case 0:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment = this.f23565b;
                        NavController g10 = U4.b.g(cryptoAccountDetailsFragment);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar = cryptoAccountDetailsFragment.f12001q0;
                        if (aVar == null || (cryptoAccountDomain2 = aVar.f12016a) == null || (str = cryptoAccountDomain2.f10969g) == null) {
                            str = "";
                        }
                        g10.j(g.a(cryptoExchangeFragment$Companion$DirectionType, "", str));
                        return p.f3034a;
                    case 1:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment2 = this.f23565b;
                        NavController g11 = U4.b.g(cryptoAccountDetailsFragment2);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar2 = cryptoAccountDetailsFragment2.f12001q0;
                        if (aVar2 == null || (cryptoAccountDomain3 = aVar2.f12016a) == null || (str2 = cryptoAccountDomain3.f10969g) == null) {
                            str2 = "";
                        }
                        g11.j(g.a(cryptoExchangeFragment$Companion$DirectionType2, str2, ""));
                        return p.f3034a;
                    case 2:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment3 = this.f23565b;
                        NavController g12 = U4.b.g(cryptoAccountDetailsFragment3);
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar3 = cryptoAccountDetailsFragment3.f12001q0;
                        Serializable serializable = aVar3 != null ? aVar3.f12016a : null;
                        Bundle g13 = v.g(g12);
                        if (Parcelable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                            g13.putParcelable("account", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g13.putSerializable("account", serializable);
                        }
                        g12.i(R.id.action_walletDetailsFragment_to_depositCryptoFragment, g13);
                        return p.f3034a;
                    case 3:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment4 = this.f23565b;
                        NavController g14 = U4.b.g(cryptoAccountDetailsFragment4);
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar4 = cryptoAccountDetailsFragment4.f12001q0;
                        g14.j(new f(aVar4 != null ? aVar4.f12016a : null));
                        return p.f3034a;
                    default:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment5 = this.f23565b;
                        G5.a l11 = ((K5.a) cryptoAccountDetailsFragment5.f12005v0.getValue()).l();
                        String str3 = l11 != null ? l11.f1320a : null;
                        if (str3 == null || str3.length() == 0) {
                            BaseFragment.q0(cryptoAccountDetailsFragment5, m.n(cryptoAccountDetailsFragment5.getString(R.string.support_email_app_name)));
                        } else {
                            G5.a l12 = ((K5.a) cryptoAccountDetailsFragment5.f12005v0.getValue()).l();
                            BaseFragment.q0(cryptoAccountDetailsFragment5, m.n(l12 != null ? l12.f1320a : null));
                        }
                        return p.f3034a;
                }
            }
        };
        final int i11 = 3;
        InterfaceC0635a interfaceC0635a4 = new InterfaceC0635a(this) { // from class: l7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAccountDetailsFragment f23565b;

            {
                this.f23565b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                String str;
                CryptoAccountDomain cryptoAccountDomain2;
                String str2;
                CryptoAccountDomain cryptoAccountDomain3;
                switch (i11) {
                    case 0:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment = this.f23565b;
                        NavController g10 = U4.b.g(cryptoAccountDetailsFragment);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar = cryptoAccountDetailsFragment.f12001q0;
                        if (aVar == null || (cryptoAccountDomain2 = aVar.f12016a) == null || (str = cryptoAccountDomain2.f10969g) == null) {
                            str = "";
                        }
                        g10.j(g.a(cryptoExchangeFragment$Companion$DirectionType, "", str));
                        return p.f3034a;
                    case 1:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment2 = this.f23565b;
                        NavController g11 = U4.b.g(cryptoAccountDetailsFragment2);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar2 = cryptoAccountDetailsFragment2.f12001q0;
                        if (aVar2 == null || (cryptoAccountDomain3 = aVar2.f12016a) == null || (str2 = cryptoAccountDomain3.f10969g) == null) {
                            str2 = "";
                        }
                        g11.j(g.a(cryptoExchangeFragment$Companion$DirectionType2, str2, ""));
                        return p.f3034a;
                    case 2:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment3 = this.f23565b;
                        NavController g12 = U4.b.g(cryptoAccountDetailsFragment3);
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar3 = cryptoAccountDetailsFragment3.f12001q0;
                        Serializable serializable = aVar3 != null ? aVar3.f12016a : null;
                        Bundle g13 = v.g(g12);
                        if (Parcelable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                            g13.putParcelable("account", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g13.putSerializable("account", serializable);
                        }
                        g12.i(R.id.action_walletDetailsFragment_to_depositCryptoFragment, g13);
                        return p.f3034a;
                    case 3:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment4 = this.f23565b;
                        NavController g14 = U4.b.g(cryptoAccountDetailsFragment4);
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar4 = cryptoAccountDetailsFragment4.f12001q0;
                        g14.j(new f(aVar4 != null ? aVar4.f12016a : null));
                        return p.f3034a;
                    default:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment5 = this.f23565b;
                        G5.a l11 = ((K5.a) cryptoAccountDetailsFragment5.f12005v0.getValue()).l();
                        String str3 = l11 != null ? l11.f1320a : null;
                        if (str3 == null || str3.length() == 0) {
                            BaseFragment.q0(cryptoAccountDetailsFragment5, m.n(cryptoAccountDetailsFragment5.getString(R.string.support_email_app_name)));
                        } else {
                            G5.a l12 = ((K5.a) cryptoAccountDetailsFragment5.f12005v0.getValue()).l();
                            BaseFragment.q0(cryptoAccountDetailsFragment5, m.n(l12 != null ? l12.f1320a : null));
                        }
                        return p.f3034a;
                }
            }
        };
        final int i12 = 0;
        InterfaceC0646l interfaceC0646l = new InterfaceC0646l(this) { // from class: l7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAccountDetailsFragment f23567b;

            {
                this.f23567b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        int intValue = ((Integer) obj).intValue();
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment = this.f23567b;
                        List<CryptoExchangeDomain> value = cryptoAccountDetailsFragment.T0().f23578V0.getValue();
                        Serializable serializable = null;
                        if (value != null) {
                            Iterator<T> it = value.iterator();
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
                            NavController g10 = U4.b.g(cryptoAccountDetailsFragment);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_cryptoAccountDetailsFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 1:
                        this.f23567b.getClass();
                        return p.f3034a;
                    default:
                        List<CryptoExchangeDomain> list = (List) obj;
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment2 = this.f23567b;
                        if (cryptoAccountDetailsFragment2.f12002r0 == 1) {
                            cryptoAccountDetailsFragment2.U0(null, list);
                        }
                        return p.f3034a;
                }
            }
        };
        final int i13 = 4;
        this.f12000p0 = new CryptoAccountDetailsController(requireContext, dVar, interfaceC0635a, interfaceC0635a2, interfaceC0635a3, interfaceC0635a4, interfaceC0646l, new InterfaceC0635a(this) { // from class: l7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAccountDetailsFragment f23565b;

            {
                this.f23565b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                String str;
                CryptoAccountDomain cryptoAccountDomain2;
                String str2;
                CryptoAccountDomain cryptoAccountDomain3;
                switch (i13) {
                    case 0:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment = this.f23565b;
                        NavController g10 = U4.b.g(cryptoAccountDetailsFragment);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12051b;
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar = cryptoAccountDetailsFragment.f12001q0;
                        if (aVar == null || (cryptoAccountDomain2 = aVar.f12016a) == null || (str = cryptoAccountDomain2.f10969g) == null) {
                            str = "";
                        }
                        g10.j(g.a(cryptoExchangeFragment$Companion$DirectionType, "", str));
                        return p.f3034a;
                    case 1:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment2 = this.f23565b;
                        NavController g11 = U4.b.g(cryptoAccountDetailsFragment2);
                        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType2 = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar2 = cryptoAccountDetailsFragment2.f12001q0;
                        if (aVar2 == null || (cryptoAccountDomain3 = aVar2.f12016a) == null || (str2 = cryptoAccountDomain3.f10969g) == null) {
                            str2 = "";
                        }
                        g11.j(g.a(cryptoExchangeFragment$Companion$DirectionType2, str2, ""));
                        return p.f3034a;
                    case 2:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment3 = this.f23565b;
                        NavController g12 = U4.b.g(cryptoAccountDetailsFragment3);
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar3 = cryptoAccountDetailsFragment3.f12001q0;
                        Serializable serializable = aVar3 != null ? aVar3.f12016a : null;
                        Bundle g13 = v.g(g12);
                        if (Parcelable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                            g13.putParcelable("account", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g13.putSerializable("account", serializable);
                        }
                        g12.i(R.id.action_walletDetailsFragment_to_depositCryptoFragment, g13);
                        return p.f3034a;
                    case 3:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment4 = this.f23565b;
                        NavController g14 = U4.b.g(cryptoAccountDetailsFragment4);
                        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar4 = cryptoAccountDetailsFragment4.f12001q0;
                        g14.j(new f(aVar4 != null ? aVar4.f12016a : null));
                        return p.f3034a;
                    default:
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment5 = this.f23565b;
                        G5.a l11 = ((K5.a) cryptoAccountDetailsFragment5.f12005v0.getValue()).l();
                        String str3 = l11 != null ? l11.f1320a : null;
                        if (str3 == null || str3.length() == 0) {
                            BaseFragment.q0(cryptoAccountDetailsFragment5, m.n(cryptoAccountDetailsFragment5.getString(R.string.support_email_app_name)));
                        } else {
                            G5.a l12 = ((K5.a) cryptoAccountDetailsFragment5.f12005v0.getValue()).l();
                            BaseFragment.q0(cryptoAccountDetailsFragment5, m.n(l12 != null ? l12.f1320a : null));
                        }
                        return p.f3034a;
                }
            }
        });
        u0().f27681p.setLayoutManager(new StickyHeaderLinearLayoutManager(requireContext()));
        C3 u02 = u0();
        CryptoAccountDetailsController cryptoAccountDetailsController = this.f12000p0;
        if (cryptoAccountDetailsController == null) {
            cryptoAccountDetailsController = null;
        }
        u02.f27681p.setAdapter(cryptoAccountDetailsController.getAdapter());
        u0().f27681p.addOnScrollListener(new a());
        u0().f27682q.setColorSchemeResources(R.color.main_color);
        u0().f27682q.setOnRefreshListener(new com.sumsub.sns.geo.presentation.d(this, 13));
        final int i14 = 1;
        T0().f426S0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: l7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAccountDetailsFragment f23567b;

            {
                this.f23567b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        int intValue = ((Integer) obj).intValue();
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment = this.f23567b;
                        List<CryptoExchangeDomain> value = cryptoAccountDetailsFragment.T0().f23578V0.getValue();
                        Serializable serializable = null;
                        if (value != null) {
                            Iterator<T> it = value.iterator();
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
                            NavController g10 = U4.b.g(cryptoAccountDetailsFragment);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_cryptoAccountDetailsFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 1:
                        this.f23567b.getClass();
                        return p.f3034a;
                    default:
                        List<CryptoExchangeDomain> list = (List) obj;
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment2 = this.f23567b;
                        if (cryptoAccountDetailsFragment2.f12002r0 == 1) {
                            cryptoAccountDetailsFragment2.U0(null, list);
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i15 = 2;
        T0().f23578V0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: l7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAccountDetailsFragment f23567b;

            {
                this.f23567b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        int intValue = ((Integer) obj).intValue();
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment = this.f23567b;
                        List<CryptoExchangeDomain> value = cryptoAccountDetailsFragment.T0().f23578V0.getValue();
                        Serializable serializable = null;
                        if (value != null) {
                            Iterator<T> it = value.iterator();
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
                            NavController g10 = U4.b.g(cryptoAccountDetailsFragment);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                g11.putParcelable("exchange", (Parcelable) serializable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
                                    throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("exchange", serializable);
                            }
                            g10.i(R.id.action_cryptoAccountDetailsFragment_to_exchangeDetailsFragment, g11);
                        }
                        return p.f3034a;
                    case 1:
                        this.f23567b.getClass();
                        return p.f3034a;
                    default:
                        List<CryptoExchangeDomain> list = (List) obj;
                        CryptoAccountDetailsFragment cryptoAccountDetailsFragment2 = this.f23567b;
                        if (cryptoAccountDetailsFragment2.f12002r0 == 1) {
                            cryptoAccountDetailsFragment2.U0(null, list);
                        }
                        return p.f3034a;
                }
            }
        }));
        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar = this.f12001q0;
        U0(aVar != null ? aVar.f12016a : null, null);
        com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a aVar2 = this.f12001q0;
        if (aVar2 == null || (cryptoAccountDomain = aVar2.f12016a) == null || (l10 = cryptoAccountDomain.f10963a) == null) {
            return;
        }
        long longValue = l10.longValue();
        h T02 = T0();
        G7.f fVar = new G7.f(T02, (int) longValue, this.s0, 3);
        T02.f418J0 = fVar;
        fVar.invoke();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11998n0;
    }
}
