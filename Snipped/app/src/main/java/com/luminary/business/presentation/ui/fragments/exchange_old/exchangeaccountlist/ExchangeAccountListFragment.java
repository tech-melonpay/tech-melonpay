package com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist;

import F8.o;
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
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.ExchangeAccountListController;
import com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.ExchangeAccountListFragment;
import com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t0.c;
import t6.E5;
import w7.C1574a;
import w7.C1575b;
import x7.C1592a;

/* compiled from: ExchangeAccountListFragment.kt */
/* loaded from: classes2.dex */
public final class ExchangeAccountListFragment extends BaseFragment<E5> {

    /* renamed from: o0, reason: collision with root package name */
    public ExchangeAccountListController f12212o0;

    /* renamed from: p0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a f12213p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f12214q0;
    public final H1.a s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f12216t0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f12211n0 = R.layout.fragment_select_account_small;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f12215r0 = true;

    /* compiled from: ExchangeAccountListFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12221a;

        public a(C1592a c1592a) {
            this.f12221a = c1592a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12221a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12221a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.ExchangeAccountListFragment$special$$inlined$viewModel$default$1] */
    public ExchangeAccountListFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.ExchangeAccountListFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.s0 = E.a(this, h.a(C1575b.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.ExchangeAccountListFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.ExchangeAccountListFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C1575b.class), null, null, b.l(this));
            }
        });
        this.f12216t0 = R.string.exchange_from;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        if (this.f12215r0) {
            com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a aVar = this.f12213p0;
            if (!f.b(aVar != null ? aVar.f12224c : null, getString(R.string.exchange))) {
                getParentFragmentManager().f0("EMPTY_BACK", c.a());
            }
        }
        return !(this instanceof CardsFragment);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        String string;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a aVar = this.f12213p0;
        if (aVar == null || (string = aVar.f12224c) == null) {
            string = getString(R.string.exchange);
        }
        toolbarStatus.f13263a = string;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a a10 = a.C0128a.a(arguments);
            this.f12213p0 = a10;
            this.f12214q0 = a10.f12223b;
            int i9 = a10.f12222a;
            String str = a10.f12224c;
            if (i9 == 1) {
                f.b(str, getString(R.string.exchange));
                i = R.string.recipient_gets;
            } else {
                f.b(str, getString(R.string.exchange));
                i = R.string.from_account;
            }
            this.f12216t0 = i;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [x7.a] */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String str;
        String str2;
        String str3;
        super.onViewCreated(view, bundle);
        com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a aVar = this.f12213p0;
        if (f.b(aVar != null ? aVar.f12224c : null, getString(R.string.exchange))) {
            E5 u02 = u0();
            com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a aVar2 = this.f12213p0;
            if (((aVar2 == null || (str3 = aVar2.f12225d) == null) ? null : str3.toUpperCase(Locale.ROOT)) != null) {
                com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a aVar3 = this.f12213p0;
                String upperCase = (aVar3 == null || (str2 = aVar3.f12225d) == null) ? null : str2.toUpperCase(Locale.ROOT);
                com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a aVar4 = this.f12213p0;
                string = getString(R.string.you_dont_have_any_accounts_you_can_open, upperCase, (aVar4 == null || (str = aVar4.f12225d) == null) ? null : str.toUpperCase(Locale.ROOT));
            } else {
                string = getString(R.string.you_dont_have_any_accounts_you_can_open_null);
            }
            u02.f27823o.setText(string);
        } else {
            u0().f27823o.setText(getString(R.string.you_dont_have_any_additional_accounts_you_can_open));
        }
        final int i = 0;
        this.f12212o0 = new ExchangeAccountListController(requireContext(), new InterfaceC0646l(this) { // from class: x7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeAccountListFragment f30945b;

            {
                this.f30945b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                String str4;
                ArrayList arrayList;
                switch (i) {
                    case 0:
                        String str5 = (String) obj;
                        ExchangeAccountListFragment exchangeAccountListFragment = this.f30945b;
                        List<BankAccountDomain> value = ((C1575b) exchangeAccountListFragment.s0.getValue()).f30848W0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (f.b(((BankAccountDomain) obj2).f10700g, str5)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            BankAccountDomain bankAccountDomain = (BankAccountDomain) obj2;
                            if (bankAccountDomain != null && (str4 = bankAccountDomain.f10700g) != null) {
                                exchangeAccountListFragment.f12215r0 = false;
                                exchangeAccountListFragment.requireActivity().onBackPressed();
                                exchangeAccountListFragment.getParentFragmentManager().f0("ACCOUNT", c.b(new Pair("ACCOUNT", str4)));
                            }
                        }
                        break;
                    default:
                        List list = (List) obj;
                        ExchangeAccountListFragment exchangeAccountListFragment2 = this.f30945b;
                        com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a aVar5 = exchangeAccountListFragment2.f12213p0;
                        if ((aVar5 != null ? aVar5.f12225d : null) != null) {
                            String upperCase2 = (aVar5 != null ? aVar5.f12225d : null).toUpperCase(Locale.ROOT);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) obj3;
                                Integer num = bankAccountDomain2.f10702j;
                                if (num != null && num.intValue() == 1) {
                                    if (!f.b(bankAccountDomain2.f10700g, exchangeAccountListFragment2.f12214q0)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                            }
                            arrayList = new ArrayList();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                BankAccountDomain bankAccountDomain3 = (BankAccountDomain) next;
                                com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a aVar6 = exchangeAccountListFragment2.f12213p0;
                                if (f.b(aVar6 != null ? aVar6.f12224c : null, exchangeAccountListFragment2.getString(R.string.exchange))) {
                                    String str6 = bankAccountDomain3.f10701h;
                                    if (!f.b(str6 != null ? str6.toUpperCase(Locale.ROOT) : null, upperCase2)) {
                                        arrayList.add(next);
                                    }
                                } else {
                                    String str7 = bankAccountDomain3.f10701h;
                                    if (f.b(str7 != null ? str7.toUpperCase(Locale.ROOT) : null, upperCase2)) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj4 : list) {
                                if (!f.b(((BankAccountDomain) obj4).f10700g, exchangeAccountListFragment2.f12214q0)) {
                                    arrayList3.add(obj4);
                                }
                            }
                            arrayList = arrayList3;
                        }
                        ExchangeAccountListController exchangeAccountListController = exchangeAccountListFragment2.f12212o0;
                        (exchangeAccountListController != null ? exchangeAccountListController : null).setData(exchangeAccountListFragment2.getString(exchangeAccountListFragment2.f12216t0), arrayList);
                        if (arrayList.isEmpty()) {
                            exchangeAccountListFragment2.u0().f27822n.setVisibility(0);
                        } else {
                            o.b(exchangeAccountListFragment2.u0().f27822n);
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        E5 u03 = u0();
        ExchangeAccountListController exchangeAccountListController = this.f12212o0;
        u03.f27824p.setAdapter((exchangeAccountListController != null ? exchangeAccountListController : null).getAdapter());
        H1.a aVar5 = this.s0;
        C1575b c1575b = (C1575b) aVar5.getValue();
        c1575b.l();
        c1575b.f30846U0.a(new C1574a(c1575b, 1), String.valueOf(c1575b.f30847V0.h()));
        final int i9 = 1;
        ((C1575b) aVar5.getValue()).f30848W0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: x7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeAccountListFragment f30945b;

            {
                this.f30945b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                String str4;
                ArrayList arrayList;
                switch (i9) {
                    case 0:
                        String str5 = (String) obj;
                        ExchangeAccountListFragment exchangeAccountListFragment = this.f30945b;
                        List<BankAccountDomain> value = ((C1575b) exchangeAccountListFragment.s0.getValue()).f30848W0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (f.b(((BankAccountDomain) obj2).f10700g, str5)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            BankAccountDomain bankAccountDomain = (BankAccountDomain) obj2;
                            if (bankAccountDomain != null && (str4 = bankAccountDomain.f10700g) != null) {
                                exchangeAccountListFragment.f12215r0 = false;
                                exchangeAccountListFragment.requireActivity().onBackPressed();
                                exchangeAccountListFragment.getParentFragmentManager().f0("ACCOUNT", c.b(new Pair("ACCOUNT", str4)));
                            }
                        }
                        break;
                    default:
                        List list = (List) obj;
                        ExchangeAccountListFragment exchangeAccountListFragment2 = this.f30945b;
                        com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a aVar52 = exchangeAccountListFragment2.f12213p0;
                        if ((aVar52 != null ? aVar52.f12225d : null) != null) {
                            String upperCase2 = (aVar52 != null ? aVar52.f12225d : null).toUpperCase(Locale.ROOT);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list) {
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) obj3;
                                Integer num = bankAccountDomain2.f10702j;
                                if (num != null && num.intValue() == 1) {
                                    if (!f.b(bankAccountDomain2.f10700g, exchangeAccountListFragment2.f12214q0)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                            }
                            arrayList = new ArrayList();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                BankAccountDomain bankAccountDomain3 = (BankAccountDomain) next;
                                com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.a aVar6 = exchangeAccountListFragment2.f12213p0;
                                if (f.b(aVar6 != null ? aVar6.f12224c : null, exchangeAccountListFragment2.getString(R.string.exchange))) {
                                    String str6 = bankAccountDomain3.f10701h;
                                    if (!f.b(str6 != null ? str6.toUpperCase(Locale.ROOT) : null, upperCase2)) {
                                        arrayList.add(next);
                                    }
                                } else {
                                    String str7 = bankAccountDomain3.f10701h;
                                    if (f.b(str7 != null ? str7.toUpperCase(Locale.ROOT) : null, upperCase2)) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj4 : list) {
                                if (!f.b(((BankAccountDomain) obj4).f10700g, exchangeAccountListFragment2.f12214q0)) {
                                    arrayList3.add(obj4);
                                }
                            }
                            arrayList = arrayList3;
                        }
                        ExchangeAccountListController exchangeAccountListController2 = exchangeAccountListFragment2.f12212o0;
                        (exchangeAccountListController2 != null ? exchangeAccountListController2 : null).setData(exchangeAccountListFragment2.getString(exchangeAccountListFragment2.f12216t0), arrayList);
                        if (arrayList.isEmpty()) {
                            exchangeAccountListFragment2.u0().f27822n.setVisibility(0);
                        } else {
                            o.b(exchangeAccountListFragment2.u0().f27822n);
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12211n0;
    }
}
