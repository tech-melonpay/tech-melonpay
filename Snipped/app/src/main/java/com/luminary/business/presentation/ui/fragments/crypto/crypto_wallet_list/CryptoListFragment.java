package com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list;

import D7.e;
import F8.i;
import F8.o;
import O9.p;
import P9.n;
import P9.s;
import U4.b;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.C0558y;
import androidx.lifecycle.C0559z;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0969n;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import n7.k;
import t6.I3;

/* compiled from: CryptoListFragment.kt */
/* loaded from: classes2.dex */
public final class CryptoListFragment extends BaseFragment<I3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12063n0 = R.layout.fragment_crypto_list;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12064o0;

    /* renamed from: p0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.a f12065p0;

    /* renamed from: q0, reason: collision with root package name */
    public final HashMap<Integer, Boolean> f12066q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f12067r0;
    public final HashMap<Integer, String> s0;

    /* renamed from: t0, reason: collision with root package name */
    public CryptoListController f12068t0;

    /* renamed from: u0, reason: collision with root package name */
    public final HashMap<Integer, String> f12069u0;

    /* renamed from: v0, reason: collision with root package name */
    public final HashMap<Integer, String> f12070v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f12071w0;

    /* renamed from: x0, reason: collision with root package name */
    public String f12072x0;

    /* renamed from: y0, reason: collision with root package name */
    public String f12073y0;

    /* renamed from: z0, reason: collision with root package name */
    public List<CryptowalletDomain> f12074z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoListFragment.kt */
    public static final class DIRECTION {

        /* renamed from: a, reason: collision with root package name */
        public static final DIRECTION f12079a;

        /* renamed from: b, reason: collision with root package name */
        public static final DIRECTION f12080b;

        /* renamed from: c, reason: collision with root package name */
        public static final DIRECTION f12081c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ DIRECTION[] f12082d;

        static {
            DIRECTION direction = new DIRECTION("DEPOSIT", 0);
            f12079a = direction;
            DIRECTION direction2 = new DIRECTION("WITHDRAW", 1);
            f12080b = direction2;
            DIRECTION direction3 = new DIRECTION("NONE", 2);
            f12081c = direction3;
            f12082d = new DIRECTION[]{direction, direction2, direction3};
        }

        public DIRECTION() {
            throw null;
        }

        public static DIRECTION valueOf(String str) {
            return (DIRECTION) Enum.valueOf(DIRECTION.class, str);
        }

        public static DIRECTION[] values() {
            return (DIRECTION[]) f12082d.clone();
        }
    }

    /* compiled from: FragmentExt.kt */
    public static final class a implements InterfaceC0646l<Pair<? extends List<? extends CryptowalletDomain>, ? extends List<? extends CryptoAccountDomain>>, p> {
        public a() {
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(Pair<? extends List<? extends CryptowalletDomain>, ? extends List<? extends CryptoAccountDomain>> pair) {
            List list;
            Object obj;
            List list2;
            Iterator it;
            CryptoListFragment cryptoListFragment;
            ArrayList arrayList;
            Pair<? extends List<? extends CryptowalletDomain>, ? extends List<? extends CryptoAccountDomain>> pair2 = pair;
            A a10 = pair2.f23089a;
            List list3 = (List) pair2.f23090b;
            List list4 = (List) a10;
            CryptoListFragment cryptoListFragment2 = CryptoListFragment.this;
            cryptoListFragment2.V0();
            List list5 = list4;
            if (list5 != null && !list5.isEmpty() && (list = list3) != null && !list.isEmpty()) {
                List list6 = list4;
                ArrayList arrayList2 = new ArrayList(n.u(list6, 10));
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    CryptowalletDomain cryptowalletDomain = (CryptowalletDomain) it2.next();
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        CryptoAccountDomain cryptoAccountDomain = (CryptoAccountDomain) obj;
                        if (f.b(cryptoAccountDomain.f10969g, cryptowalletDomain.f11078g) && f.b(cryptoAccountDomain.f10968f, cryptowalletDomain.f11077f)) {
                            break;
                        }
                    }
                    CryptoAccountDomain cryptoAccountDomain2 = (CryptoAccountDomain) obj;
                    if ((cryptoAccountDomain2 != null ? cryptoAccountDomain2.f10967e : null) == CryptoAccountDomain.WalletStatus.f10985h) {
                        list2 = list3;
                        it = it2;
                        cryptoListFragment = cryptoListFragment2;
                        cryptowalletDomain = new CryptowalletDomain(cryptowalletDomain.f11072a, cryptowalletDomain.f11073b, cryptowalletDomain.f11074c, cryptowalletDomain.f11075d, CryptowalletDomain.WalletStatus.f11092g, cryptowalletDomain.f11077f, cryptowalletDomain.f11078g, cryptowalletDomain.f11079h, cryptowalletDomain.i, cryptowalletDomain.f11080j, cryptowalletDomain.f11081k, cryptowalletDomain.f11082l, cryptowalletDomain.f11083m, cryptowalletDomain.f11084n, cryptowalletDomain.f11085o);
                        arrayList = arrayList2;
                    } else {
                        list2 = list3;
                        it = it2;
                        cryptoListFragment = cryptoListFragment2;
                        arrayList = arrayList2;
                    }
                    arrayList.add(cryptowalletDomain);
                    arrayList2 = arrayList;
                    it2 = it;
                    cryptoListFragment2 = cryptoListFragment;
                    list3 = list2;
                }
                CryptoListFragment cryptoListFragment3 = cryptoListFragment2;
                List<CryptowalletDomain> X = s.X(arrayList2, new A7.d(13));
                cryptoListFragment3.f12074z0 = X;
                CryptoListFragment.T0(cryptoListFragment3, X);
            }
            return p.f3034a;
        }
    }

    /* compiled from: CryptoListFragment.kt */
    public static final class c implements TabLayout.d {
        public c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            CryptoListFragment cryptoListFragment = CryptoListFragment.this;
            if (cryptoListFragment.getView() != null) {
                int i = gVar != null ? gVar.f9855d : 0;
                cryptoListFragment.f12071w0 = i;
                Boolean bool = cryptoListFragment.f12066q0.get(Integer.valueOf(i));
                cryptoListFragment.f11467i0 = bool != null ? bool.booleanValue() : false;
                cryptoListFragment.V0();
                int i9 = cryptoListFragment.f12071w0;
                if (i9 == 0) {
                    cryptoListFragment.u0().f28006x.setDisplayedChild(0);
                    CryptoListFragment.T0(cryptoListFragment, cryptoListFragment.f12074z0);
                    o.b(cryptoListFragment.u0().f27998p);
                    o.b(cryptoListFragment.u0().f27997o);
                } else if (i9 == 1) {
                    cryptoListFragment.u0().f28006x.setDisplayedChild(0);
                    CryptoListFragment.T0(cryptoListFragment, cryptoListFragment.U0().f24281Y0.getValue());
                    o.b(cryptoListFragment.u0().f27998p);
                    o.b(cryptoListFragment.u0().f27997o);
                } else if (i9 == 2) {
                    o.b(cryptoListFragment.u0().f28000r);
                    cryptoListFragment.u0().f28006x.setDisplayedChild(1);
                    cryptoListFragment.u0().f27997o.setVisibility(0);
                }
                cryptoListFragment.L0();
                if (cryptoListFragment.f11467i0) {
                    ((MainActivity) cryptoListFragment.requireActivity()).u(cryptoListFragment.s0.get(Integer.valueOf(cryptoListFragment.f12071w0)));
                } else {
                    ((MainActivity) cryptoListFragment.requireActivity()).s();
                }
            }
        }
    }

    /* compiled from: CryptoListFragment.kt */
    public static final class d implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12086a;

        public d(InterfaceC0646l interfaceC0646l) {
            this.f12086a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12086a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12086a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment$special$$inlined$viewModel$default$1] */
    public CryptoListFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12064o0 = E.a(this, h.a(k.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(k.class), null, null, b.l(this));
            }
        });
        Boolean bool = Boolean.FALSE;
        this.f12066q0 = kotlin.collections.a.r(new Pair(0, bool), new Pair(1, bool));
        this.f12067r0 = true;
        this.s0 = new HashMap<>();
        this.f12069u0 = new HashMap<>();
        this.f12070v0 = new HashMap<>();
        this.f12074z0 = EmptyList.f23104a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.ArrayList] */
    public static final void T0(CryptoListFragment cryptoListFragment, List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        T t3;
        T t10;
        I3 u02 = cryptoListFragment.u0();
        HashMap<Integer, String> hashMap = cryptoListFragment.s0;
        String str = hashMap.get(Integer.valueOf(cryptoListFragment.f12071w0));
        u02.f28001s.setText((str == null || str.length() == 0) ? cryptoListFragment.getString(R.string.you_do_not_have_any_approved_crypto_addresses) : cryptoListFragment.getString(R.string.nothing_is_found));
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        String str2 = hashMap.get(Integer.valueOf(cryptoListFragment.f12071w0));
        T t11 = list;
        if (str2 != null) {
            t11 = list;
            if (str2.length() != 0) {
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list) {
                        CryptowalletDomain cryptowalletDomain = (CryptowalletDomain) obj;
                        String str3 = cryptowalletDomain.f11078g;
                        if (str3 != null) {
                            Locale locale = Locale.ROOT;
                            String lowerCase = str3.toLowerCase(locale);
                            String str4 = hashMap.get(Integer.valueOf(cryptoListFragment.f12071w0));
                            if (C0969n.Y(lowerCase, str4 != null ? str4.toLowerCase(locale) : "", false)) {
                                arrayList3.add(obj);
                            }
                        }
                        String str5 = cryptowalletDomain.f11074c;
                        if (str5 != null) {
                            Locale locale2 = Locale.ROOT;
                            String lowerCase2 = str5.toLowerCase(locale2);
                            String str6 = hashMap.get(Integer.valueOf(cryptoListFragment.f12071w0));
                            if (C0969n.Y(lowerCase2, str6 != null ? str6.toLowerCase(locale2) : "", false)) {
                                arrayList3.add(obj);
                            }
                        }
                        String str7 = cryptowalletDomain.f11077f;
                        if (str7 != null) {
                            Locale locale3 = Locale.ROOT;
                            String lowerCase3 = str7.toLowerCase(locale3);
                            String str8 = hashMap.get(Integer.valueOf(cryptoListFragment.f12071w0));
                            if (C0969n.Y(lowerCase3, str8 != null ? str8.toLowerCase(locale3) : "", false)) {
                                arrayList3.add(obj);
                            }
                        }
                    }
                    t11 = arrayList3;
                } else {
                    t11 = 0;
                }
            }
        }
        ref$ObjectRef.f23179a = t11;
        HashMap<Integer, String> hashMap2 = cryptoListFragment.f12069u0;
        if (hashMap2.get(Integer.valueOf(cryptoListFragment.f12071w0)) != null) {
            List list2 = (List) ref$ObjectRef.f23179a;
            if (list2 != null) {
                t10 = new ArrayList();
                for (Object obj2 : list2) {
                    if (f.b(((CryptowalletDomain) obj2).f11078g, hashMap2.get(Integer.valueOf(cryptoListFragment.f12071w0)))) {
                        t10.add(obj2);
                    }
                }
            } else {
                t10 = 0;
            }
            ref$ObjectRef.f23179a = t10;
        }
        HashMap<Integer, String> hashMap3 = cryptoListFragment.f12070v0;
        if (hashMap3.get(Integer.valueOf(cryptoListFragment.f12071w0)) != null) {
            List list3 = (List) ref$ObjectRef.f23179a;
            if (list3 != null) {
                t3 = new ArrayList();
                for (Object obj3 : list3) {
                    if (f.b(((CryptowalletDomain) obj3).f11077f, hashMap3.get(Integer.valueOf(cryptoListFragment.f12071w0)))) {
                        t3.add(obj3);
                    }
                }
            } else {
                t3 = 0;
            }
            ref$ObjectRef.f23179a = t3;
        }
        int i = cryptoListFragment.f12071w0;
        if (i == 0) {
            List list4 = (List) ref$ObjectRef.f23179a;
            if (list4 != null) {
                arrayList2 = new ArrayList();
                for (Object obj4 : list4) {
                    CryptowalletDomain.WalletStatus walletStatus = ((CryptowalletDomain) obj4).f11076e;
                    if (walletStatus == CryptowalletDomain.WalletStatus.f11089d || walletStatus == CryptowalletDomain.WalletStatus.f11092g) {
                        arrayList2.add(obj4);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (arrayList2 == null || arrayList2.isEmpty()) {
                cryptoListFragment.u0().f28000r.setVisibility(0);
            } else {
                o.b(cryptoListFragment.u0().f28000r);
            }
            CryptoListController cryptoListController = cryptoListFragment.f12068t0;
            if (cryptoListController == null) {
                cryptoListController = null;
            }
            cryptoListController.setData(arrayList2, null);
            return;
        }
        if (i == 1) {
            List list5 = (List) ref$ObjectRef.f23179a;
            if (list5 != null) {
                arrayList = new ArrayList();
                for (Object obj5 : list5) {
                    CryptowalletDomain.WalletStatus walletStatus2 = ((CryptowalletDomain) obj5).f11076e;
                    if (walletStatus2 == CryptowalletDomain.WalletStatus.f11088c || walletStatus2 == CryptowalletDomain.WalletStatus.f11087b) {
                        arrayList.add(obj5);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                cryptoListFragment.u0().f28000r.setVisibility(0);
            } else {
                o.b(cryptoListFragment.u0().f28000r);
            }
            CryptoListController cryptoListController2 = cryptoListFragment.f12068t0;
            if (cryptoListController2 == null) {
                cryptoListController2 = null;
            }
            cryptoListController2.setData(null, arrayList);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.a aVar = this.f12065p0;
        if ((aVar != null ? aVar.f12088b : null) == DIRECTION.f12081c) {
            toolbarStatus.f13267e = false;
            toolbarStatus.f13263a = getString(R.string.deposit);
            toolbarStatus.f13276o = getString(R.string.withdraw);
            if (this.f12067r0) {
                toolbarStatus.f13272k = Integer.valueOf(R.color.black);
                toolbarStatus.f13277p = Integer.valueOf(R.color.middle_gray);
            } else {
                toolbarStatus.f13272k = Integer.valueOf(R.color.middle_gray);
                toolbarStatus.f13277p = Integer.valueOf(R.color.black);
            }
            toolbarStatus.f13274m = new n7.c(this, 0);
            toolbarStatus.f13275n = new n7.c(this, 1);
            toolbarStatus.f13265c = 28;
        } else {
            toolbarStatus.f13267e = true;
            toolbarStatus.f13263a = getString(R.string.saved_addresses);
            toolbarStatus.f13276o = null;
            toolbarStatus.f13272k = Integer.valueOf(R.color.black);
            toolbarStatus.f13265c = 18;
        }
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.a aVar = this.f12065p0;
        if ((aVar != null ? aVar.f12088b : null) == DIRECTION.f12081c) {
            toolbarStatus.f13267e = false;
            toolbarStatus.f13263a = getString(R.string.deposit);
            toolbarStatus.f13276o = getString(R.string.withdraw);
            if (this.f12067r0) {
                toolbarStatus.f13272k = Integer.valueOf(R.color.black);
                toolbarStatus.f13277p = Integer.valueOf(R.color.middle_gray);
            } else {
                toolbarStatus.f13272k = Integer.valueOf(R.color.middle_gray);
                toolbarStatus.f13277p = Integer.valueOf(R.color.black);
            }
            toolbarStatus.f13274m = new n7.c(this, 2);
            toolbarStatus.f13275n = new n7.c(this, 3);
            toolbarStatus.f13265c = 18;
        } else {
            toolbarStatus.f13267e = true;
            toolbarStatus.f13272k = Integer.valueOf(R.color.black);
            toolbarStatus.f13263a = getString(R.string.saved_addresses);
            toolbarStatus.f13276o = null;
            toolbarStatus.f13265c = 18;
        }
        return toolbarStatus;
    }

    public final k U0() {
        return (k) this.f12064o0.getValue();
    }

    public final void V0() {
        ArrayList arrayList;
        ArrayList arrayList2;
        TabLayout.i iVar;
        TabLayout.i iVar2;
        TabLayout.i iVar3;
        List<CryptowalletDomain> value = U0().f24281Y0.getValue();
        View view = null;
        if (value != null) {
            arrayList = new ArrayList();
            for (Object obj : value) {
                if (((CryptowalletDomain) obj).f11076e == CryptowalletDomain.WalletStatus.f11088c) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (value != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : value) {
                if (((CryptowalletDomain) obj2).f11076e == CryptowalletDomain.WalletStatus.f11087b) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        TabLayout.g h9 = u0().f28005w.h(1);
        if ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) {
            if (h9 == null || (iVar = h9.f9859h) == null) {
                return;
            }
            o.b(iVar);
            return;
        }
        if (h9 != null && (iVar3 = h9.f9859h) != null) {
            iVar3.setVisibility(0);
        }
        if (h9 != null && (iVar2 = h9.f9859h) != null) {
            view = iVar2.getChildAt(1);
        }
        TextView textView = (TextView) view;
        if (arrayList == null || arrayList.isEmpty()) {
            if (h9 != null) {
                h9.b(getString(R.string.under_review));
            }
            if (textView != null) {
                o.h(textView, R.color.middle_gray);
                return;
            }
            return;
        }
        if (h9 != null) {
            h9.b(getString(R.string.action_required));
        }
        if (textView != null) {
            o.h(textView, R.color.red_error_timer);
        }
    }

    public final void W0() {
        Editable text;
        u0().f27997o.setEnabled((this.f12073y0 == null || this.f12072x0 == null || (text = u0().f27996n.getText()) == null || text.length() == 0) ? false : true);
        u0().f27998p.setEnabled(u0().f27997o.isEnabled());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12065p0 = a.C0123a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer z10;
        CryptoAccountDomain cryptoAccountDomain;
        String str2;
        CryptoAccountDomain cryptoAccountDomain2;
        com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.a aVar = this.f12065p0;
        this.f11466h0 = (aVar != null ? aVar.f12088b : null) == DIRECTION.f12081c;
        super.onViewCreated(view, bundle);
        com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.a aVar2 = this.f12065p0;
        if ((aVar2 != null ? aVar2.f12088b : null) == DIRECTION.f12079a) {
            this.f12067r0 = true;
        }
        if ((aVar2 != null ? aVar2.f12088b : null) == DIRECTION.f12080b) {
            this.f12067r0 = false;
        }
        U0().f426S0.observe(getViewLifecycleOwner(), new d(new n7.b(this, 0)));
        U0().f24284b1.observe(getViewLifecycleOwner(), new d(new n7.b(this, 3)));
        c cVar = new c();
        this.f12068t0 = new CryptoListController(requireContext(), new n7.b(this, 4), new n7.b(this, 5));
        u0().f28005w.a(cVar);
        I3 u02 = u0();
        CryptoListController cryptoListController = this.f12068t0;
        if (cryptoListController == null) {
            cryptoListController = null;
        }
        u02.f28002t.setAdapter(cryptoListController.getAdapter());
        CryptoListController cryptoListController2 = this.f12068t0;
        if (cryptoListController2 == null) {
            cryptoListController2 = null;
        }
        cryptoListController2.setData(null, null);
        k U02 = U0();
        com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.a aVar3 = this.f12065p0;
        String str3 = "";
        if (aVar3 == null || (cryptoAccountDomain2 = aVar3.f12087a) == null || (str = cryptoAccountDomain2.f10969g) == null) {
            str = "";
        }
        if (aVar3 != null && (cryptoAccountDomain = aVar3.f12087a) != null && (str2 = cryptoAccountDomain.f10968f) != null) {
            str3 = str2;
        }
        e eVar = new e(str, str3, 6, U02);
        U02.f418J0 = eVar;
        eVar.invoke();
        o.c(u0().f27999q, 500L, new n7.d(this, 1));
        o.c(u0().f28004v, 500L, new n7.d(this, 2));
        o.c(u0().f27997o, 500L, new n7.d(this, 3));
        o.c(u0().f27998p, 500L, new n7.d(this, 4));
        u0().f27996n.addTextChangedListener(new b());
        W0();
        u0().f28005w.k(u0().f28005w.h(this.f12071w0), true);
        String str4 = this.f12072x0;
        if (str4 != null && str4.length() != 0 && (z10 = D9.b.z(this.f12072x0)) != null) {
            u0().f28003u.setImageResource(z10.intValue());
        }
        C0559z<List<CryptowalletDomain>> c0559z = U0().f24281Y0;
        C0559z<List<CryptoAccountDomain>> c0559z2 = U0().f24282Z0;
        C0558y c0558y = new C0558y();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        c0558y.a(c0559z, new i(new F8.h(ref$ObjectRef, c0558y, ref$ObjectRef2, 0)));
        c0558y.a(c0559z2, new i(new F8.h(ref$ObjectRef2, c0558y, ref$ObjectRef, 1)));
        c0558y.observe(getViewLifecycleOwner(), new i(new a()));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12063n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        if (this.f12071w0 == 2) {
            u0().f27997o.setVisibility(0);
        }
        o.b(u0().f27998p);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f27997o);
        if (this.f12071w0 == 2) {
            u0().f27998p.setVisibility(0);
        }
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            CryptoListFragment.this.W0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
