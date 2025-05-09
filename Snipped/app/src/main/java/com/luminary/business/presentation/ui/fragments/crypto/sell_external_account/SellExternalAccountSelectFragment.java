package com.luminary.business.presentation.ui.fragments.crypto.sell_external_account;

import C.v;
import F8.o;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import c.RunnableC0615f;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import com.luminary.business.domain.entity.templates.CheckRequisitesDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.SavedPaymentsController;
import com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.SellExternalAccountSelectFragment;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.h;
import r7.C1157e;
import r7.C1159g;
import t6.M5;

/* compiled from: SellExternalAccountSelectFragment.kt */
/* loaded from: classes2.dex */
public final class SellExternalAccountSelectFragment extends BaseFragment<M5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12133n0 = R.layout.fragment_sell_external_account_select;

    /* renamed from: o0, reason: collision with root package name */
    public C1157e f12134o0;

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f12135p0;

    /* renamed from: q0, reason: collision with root package name */
    public CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain f12136q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f12137r0;
    public SavedPaymentsController s0;

    /* renamed from: t0, reason: collision with root package name */
    public String f12138t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f12139u0;

    /* compiled from: SellExternalAccountSelectFragment.kt */
    public static final class h implements TabLayout.d {
        public h() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            int i = gVar != null ? gVar.f9855d : 0;
            SellExternalAccountSelectFragment sellExternalAccountSelectFragment = SellExternalAccountSelectFragment.this;
            sellExternalAccountSelectFragment.f12137r0 = i;
            sellExternalAccountSelectFragment.u0().f28191G.setDisplayedChild(gVar != null ? gVar.f9855d : 0);
            if (sellExternalAccountSelectFragment.f12137r0 != 0) {
                sellExternalAccountSelectFragment.u0().f28200v.setVisibility(0);
            } else {
                o.b(sellExternalAccountSelectFragment.u0().f28200v);
                o.b(sellExternalAccountSelectFragment.u0().f28201w);
            }
        }
    }

    /* compiled from: SellExternalAccountSelectFragment.kt */
    public static final class i implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12152a;

        public i(InterfaceC0646l interfaceC0646l) {
            this.f12152a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12152a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12152a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.SellExternalAccountSelectFragment$special$$inlined$viewModel$default$1] */
    public SellExternalAccountSelectFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.SellExternalAccountSelectFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12135p0 = E.a(this, kotlin.jvm.internal.h.a(C1159g.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.SellExternalAccountSelectFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.SellExternalAccountSelectFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C1159g.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        String str;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        C1157e c1157e = this.f12134o0;
        if (c1157e == null || (str = c1157e.f26317a) == null) {
            str = "";
        }
        toolbarStatus.f13263a = getString(R.string.name_account_details, str);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        String str;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        C1157e c1157e = this.f12134o0;
        if (c1157e == null || (str = c1157e.f26317a) == null) {
            str = "";
        }
        toolbarStatus.f13263a = getString(R.string.name_account_details, str);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final C1159g T0() {
        return (C1159g) this.f12135p0.getValue();
    }

    public final void U0(String str, boolean z10) {
        M5 u02 = u0();
        boolean g02 = D9.b.g0(str);
        CustomTextInputLayout customTextInputLayout = u02.f28198t;
        if (g02 || !z10) {
            customTextInputLayout.setError(null);
        } else {
            customTextInputLayout.setErrorWithoutFocus(getString(R.string.invalid_beneficiary));
        }
    }

    public final void V0() {
        String str;
        C1157e c1157e = this.f12134o0;
        boolean z10 = false;
        boolean z11 = !kotlin.jvm.internal.f.b(c1157e != null ? c1157e.f26317a : null, "AED") ? !D9.b.g0(String.valueOf(u0().f28199u.getText())) || String.valueOf(u0().f28186B.getText()).length() <= 0 || String.valueOf(u0().f28189E.getText()).length() <= 0 || String.valueOf(u0().f28197s.getText()).length() <= 0 || String.valueOf(u0().f28195q.getText()).length() <= 0 : !D9.b.g0(String.valueOf(u0().f28199u.getText())) || String.valueOf(u0().f28186B.getText()).length() <= 0 || String.valueOf(u0().f28189E.getText()).length() <= 0;
        M5 u02 = u0();
        if (z11 && (str = this.f12139u0) != null && str.length() != 0) {
            z10 = true;
        }
        u02.f28200v.setEnabled(z10);
        u0().f28201w.setEnabled(z11);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!v.y(arguments, C1157e.class, FirebaseAnalytics.Param.CURRENCY)) {
                throw new IllegalArgumentException("Required argument \"currency\" is missing and does not have an android:defaultValue");
            }
            String string = arguments.getString(FirebaseAnalytics.Param.CURRENCY);
            if (string == null) {
                throw new IllegalArgumentException("Argument \"currency\" is marked as non-null but was passed a null value.");
            }
            this.f12134o0 = new C1157e(string);
        }
        this.f12136q0 = new CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain("CORPORATE", 4087);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        final int i9 = 0;
        T0().f26323W0.observe(getViewLifecycleOwner(), new i(new InterfaceC0646l(this) { // from class: r7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SellExternalAccountSelectFragment f26314b;

            {
                this.f26314b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        List list = (List) obj;
                        SavedPaymentsController savedPaymentsController = this.f26314b.s0;
                        if (savedPaymentsController == null) {
                            savedPaymentsController = null;
                        }
                        savedPaymentsController.setData(list);
                        break;
                    case 1:
                        H5.b bVar = (H5.b) obj;
                        SellExternalAccountSelectFragment sellExternalAccountSelectFragment = this.f26314b;
                        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10999c = bVar.f1500e;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10998b = bVar.i;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11001e = bVar.f1504j;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11007l = bVar.f1511q;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11004h = bVar.f1506l;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10997a = bVar.f1505k;
                        if (externalAccountRequisitesDomain == null) {
                            externalAccountRequisitesDomain = null;
                        }
                        sellExternalAccountSelectFragment.getParentFragmentManager().f0("payment", t0.c.b(new Pair("requisites", externalAccountRequisitesDomain), new Pair("show_template", Boolean.FALSE)));
                        sellExternalAccountSelectFragment.requireActivity().getOnBackPressedDispatcher().d();
                        break;
                    case 2:
                        CheckRequisitesDomain checkRequisitesDomain = (CheckRequisitesDomain) obj;
                        if (checkRequisitesDomain != null) {
                            boolean b9 = kotlin.jvm.internal.f.b(checkRequisitesDomain.f11136e, Boolean.FALSE);
                            SellExternalAccountSelectFragment sellExternalAccountSelectFragment2 = this.f26314b;
                            if (b9) {
                                sellExternalAccountSelectFragment2.getClass();
                                sellExternalAccountSelectFragment2.u0().f28203y.setErrorWithoutFocus(sellExternalAccountSelectFragment2.getString(R.string.we_can_not_accept_payments, sellExternalAccountSelectFragment2.f12138t0));
                            } else {
                                sellExternalAccountSelectFragment2.u0().f28203y.setError(null);
                                sellExternalAccountSelectFragment2.u0().f28202x.setVisibility(0);
                            }
                            sellExternalAccountSelectFragment2.V0();
                            sellExternalAccountSelectFragment2.T0().f26324X0.postValue(null);
                            break;
                        } else {
                            break;
                        }
                    default:
                        this.f26314b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        }));
        u0().f28203y.postDelayed(new RunnableC0615f(this, 15), 500L);
        C1157e c1157e = this.f12134o0;
        if (c1157e == null || (str = c1157e.f26317a) == null) {
            str = "";
        }
        final int i10 = 1;
        this.s0 = new SavedPaymentsController(str, requireContext(), new InterfaceC0646l(this) { // from class: r7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SellExternalAccountSelectFragment f26314b;

            {
                this.f26314b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        List list = (List) obj;
                        SavedPaymentsController savedPaymentsController = this.f26314b.s0;
                        if (savedPaymentsController == null) {
                            savedPaymentsController = null;
                        }
                        savedPaymentsController.setData(list);
                        break;
                    case 1:
                        H5.b bVar = (H5.b) obj;
                        SellExternalAccountSelectFragment sellExternalAccountSelectFragment = this.f26314b;
                        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10999c = bVar.f1500e;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10998b = bVar.i;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11001e = bVar.f1504j;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11007l = bVar.f1511q;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11004h = bVar.f1506l;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10997a = bVar.f1505k;
                        if (externalAccountRequisitesDomain == null) {
                            externalAccountRequisitesDomain = null;
                        }
                        sellExternalAccountSelectFragment.getParentFragmentManager().f0("payment", t0.c.b(new Pair("requisites", externalAccountRequisitesDomain), new Pair("show_template", Boolean.FALSE)));
                        sellExternalAccountSelectFragment.requireActivity().getOnBackPressedDispatcher().d();
                        break;
                    case 2:
                        CheckRequisitesDomain checkRequisitesDomain = (CheckRequisitesDomain) obj;
                        if (checkRequisitesDomain != null) {
                            boolean b9 = kotlin.jvm.internal.f.b(checkRequisitesDomain.f11136e, Boolean.FALSE);
                            SellExternalAccountSelectFragment sellExternalAccountSelectFragment2 = this.f26314b;
                            if (b9) {
                                sellExternalAccountSelectFragment2.getClass();
                                sellExternalAccountSelectFragment2.u0().f28203y.setErrorWithoutFocus(sellExternalAccountSelectFragment2.getString(R.string.we_can_not_accept_payments, sellExternalAccountSelectFragment2.f12138t0));
                            } else {
                                sellExternalAccountSelectFragment2.u0().f28203y.setError(null);
                                sellExternalAccountSelectFragment2.u0().f28202x.setVisibility(0);
                            }
                            sellExternalAccountSelectFragment2.V0();
                            sellExternalAccountSelectFragment2.T0().f26324X0.postValue(null);
                            break;
                        } else {
                            break;
                        }
                    default:
                        this.f26314b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        });
        M5 u02 = u0();
        SavedPaymentsController savedPaymentsController = this.s0;
        if (savedPaymentsController == null) {
            savedPaymentsController = null;
        }
        u02.f28185A.setAdapter(savedPaymentsController.getAdapter());
        SavedPaymentsController savedPaymentsController2 = this.s0;
        if (savedPaymentsController2 == null) {
            savedPaymentsController2 = null;
        }
        savedPaymentsController2.setData(null);
        C1157e c1157e2 = this.f12134o0;
        if (c1157e2 != null) {
            C1159g T02 = T0();
            A7.c cVar = new A7.c(22, T02, c1157e2.f26317a);
            T02.f418J0 = cVar;
            cVar.invoke();
        }
        h hVar = new h();
        u0().f28191G.setDisplayedChild(0);
        C1157e c1157e3 = this.f12134o0;
        String str2 = c1157e3 != null ? c1157e3.f26317a : null;
        if (kotlin.jvm.internal.f.b(str2, "EUR")) {
            o.b(u0().f28187C);
            o.b(u0().f28192n);
        } else if (kotlin.jvm.internal.f.b(str2, "GBP")) {
            o.b(u0().f28187C);
            o.b(u0().f28192n);
            o.b(u0().f28196r);
            o.b(u0().f28194p);
        }
        M5 u03 = u0();
        u03.f28199u.addTextChangedListener(new a());
        u03.f28186B.addTextChangedListener(new b());
        u03.f28189E.addTextChangedListener(new c());
        u03.f28197s.addTextChangedListener(new d());
        u03.f28195q.addTextChangedListener(new e());
        u03.f28188D.addTextChangedListener(new f());
        u03.f28193o.addTextChangedListener(new g());
        final int i11 = 0;
        o.c(u03.f28204z, 500L, new InterfaceC0635a(this) { // from class: r7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SellExternalAccountSelectFragment f26316b;

            {
                this.f26316b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        NavController g10 = U4.b.g(this.f26316b);
                        g10.i(R.id.action_sellExternalAccountSelectFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    default:
                        SellExternalAccountSelectFragment sellExternalAccountSelectFragment = this.f26316b;
                        if (sellExternalAccountSelectFragment.f12137r0 != 0) {
                            CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
                            if (externalAccountRequisitesDomain == null) {
                                externalAccountRequisitesDomain = null;
                            }
                            sellExternalAccountSelectFragment.getParentFragmentManager().f0("payment", t0.c.b(new Pair("requisites", externalAccountRequisitesDomain), new Pair("show_template", Boolean.TRUE)));
                            sellExternalAccountSelectFragment.requireActivity().getOnBackPressedDispatcher().d();
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        final int i12 = 2;
        T0().f26324X0.observe(getViewLifecycleOwner(), new i(new InterfaceC0646l(this) { // from class: r7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SellExternalAccountSelectFragment f26314b;

            {
                this.f26314b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        SavedPaymentsController savedPaymentsController3 = this.f26314b.s0;
                        if (savedPaymentsController3 == null) {
                            savedPaymentsController3 = null;
                        }
                        savedPaymentsController3.setData(list);
                        break;
                    case 1:
                        H5.b bVar = (H5.b) obj;
                        SellExternalAccountSelectFragment sellExternalAccountSelectFragment = this.f26314b;
                        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10999c = bVar.f1500e;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10998b = bVar.i;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11001e = bVar.f1504j;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11007l = bVar.f1511q;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11004h = bVar.f1506l;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10997a = bVar.f1505k;
                        if (externalAccountRequisitesDomain == null) {
                            externalAccountRequisitesDomain = null;
                        }
                        sellExternalAccountSelectFragment.getParentFragmentManager().f0("payment", t0.c.b(new Pair("requisites", externalAccountRequisitesDomain), new Pair("show_template", Boolean.FALSE)));
                        sellExternalAccountSelectFragment.requireActivity().getOnBackPressedDispatcher().d();
                        break;
                    case 2:
                        CheckRequisitesDomain checkRequisitesDomain = (CheckRequisitesDomain) obj;
                        if (checkRequisitesDomain != null) {
                            boolean b9 = kotlin.jvm.internal.f.b(checkRequisitesDomain.f11136e, Boolean.FALSE);
                            SellExternalAccountSelectFragment sellExternalAccountSelectFragment2 = this.f26314b;
                            if (b9) {
                                sellExternalAccountSelectFragment2.getClass();
                                sellExternalAccountSelectFragment2.u0().f28203y.setErrorWithoutFocus(sellExternalAccountSelectFragment2.getString(R.string.we_can_not_accept_payments, sellExternalAccountSelectFragment2.f12138t0));
                            } else {
                                sellExternalAccountSelectFragment2.u0().f28203y.setError(null);
                                sellExternalAccountSelectFragment2.u0().f28202x.setVisibility(0);
                            }
                            sellExternalAccountSelectFragment2.V0();
                            sellExternalAccountSelectFragment2.T0().f26324X0.postValue(null);
                            break;
                        } else {
                            break;
                        }
                    default:
                        this.f26314b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        }));
        E.b(this, "country", new B6.h(this, 27));
        final int i13 = 1;
        o.c(u03.f28200v, 500L, new InterfaceC0635a(this) { // from class: r7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SellExternalAccountSelectFragment f26316b;

            {
                this.f26316b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        NavController g10 = U4.b.g(this.f26316b);
                        g10.i(R.id.action_sellExternalAccountSelectFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    default:
                        SellExternalAccountSelectFragment sellExternalAccountSelectFragment = this.f26316b;
                        if (sellExternalAccountSelectFragment.f12137r0 != 0) {
                            CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
                            if (externalAccountRequisitesDomain == null) {
                                externalAccountRequisitesDomain = null;
                            }
                            sellExternalAccountSelectFragment.getParentFragmentManager().f0("payment", t0.c.b(new Pair("requisites", externalAccountRequisitesDomain), new Pair("show_template", Boolean.TRUE)));
                            sellExternalAccountSelectFragment.requireActivity().getOnBackPressedDispatcher().d();
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(u03.f28201w, 500L, new g8.g(u03, 17));
        u03.f28190F.a(hVar);
        final int i14 = 3;
        F8.g.a(u0().f28199u, new InterfaceC0646l(this) { // from class: r7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SellExternalAccountSelectFragment f26314b;

            {
                this.f26314b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        List list = (List) obj;
                        SavedPaymentsController savedPaymentsController3 = this.f26314b.s0;
                        if (savedPaymentsController3 == null) {
                            savedPaymentsController3 = null;
                        }
                        savedPaymentsController3.setData(list);
                        break;
                    case 1:
                        H5.b bVar = (H5.b) obj;
                        SellExternalAccountSelectFragment sellExternalAccountSelectFragment = this.f26314b;
                        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10999c = bVar.f1500e;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10998b = bVar.i;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11001e = bVar.f1504j;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11007l = bVar.f1511q;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f11004h = bVar.f1506l;
                        (externalAccountRequisitesDomain == null ? null : externalAccountRequisitesDomain).f10997a = bVar.f1505k;
                        if (externalAccountRequisitesDomain == null) {
                            externalAccountRequisitesDomain = null;
                        }
                        sellExternalAccountSelectFragment.getParentFragmentManager().f0("payment", t0.c.b(new Pair("requisites", externalAccountRequisitesDomain), new Pair("show_template", Boolean.FALSE)));
                        sellExternalAccountSelectFragment.requireActivity().getOnBackPressedDispatcher().d();
                        break;
                    case 2:
                        CheckRequisitesDomain checkRequisitesDomain = (CheckRequisitesDomain) obj;
                        if (checkRequisitesDomain != null) {
                            boolean b9 = kotlin.jvm.internal.f.b(checkRequisitesDomain.f11136e, Boolean.FALSE);
                            SellExternalAccountSelectFragment sellExternalAccountSelectFragment2 = this.f26314b;
                            if (b9) {
                                sellExternalAccountSelectFragment2.getClass();
                                sellExternalAccountSelectFragment2.u0().f28203y.setErrorWithoutFocus(sellExternalAccountSelectFragment2.getString(R.string.we_can_not_accept_payments, sellExternalAccountSelectFragment2.f12138t0));
                            } else {
                                sellExternalAccountSelectFragment2.u0().f28203y.setError(null);
                                sellExternalAccountSelectFragment2.u0().f28202x.setVisibility(0);
                            }
                            sellExternalAccountSelectFragment2.V0();
                            sellExternalAccountSelectFragment2.T0().f26324X0.postValue(null);
                            break;
                        } else {
                            break;
                        }
                    default:
                        this.f26314b.U0((String) obj, true);
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12133n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        if (this.f12137r0 != 0) {
            u0().f28200v.setVisibility(0);
        }
        o.b(u0().f28201w);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f28200v);
        u0().f28201w.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SellExternalAccountSelectFragment sellExternalAccountSelectFragment = SellExternalAccountSelectFragment.this;
            CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
            if (externalAccountRequisitesDomain == null) {
                externalAccountRequisitesDomain = null;
            }
            externalAccountRequisitesDomain.f10999c = String.valueOf(charSequence);
            sellExternalAccountSelectFragment.U0(String.valueOf(charSequence), false);
            sellExternalAccountSelectFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SellExternalAccountSelectFragment sellExternalAccountSelectFragment = SellExternalAccountSelectFragment.this;
            CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
            if (externalAccountRequisitesDomain == null) {
                externalAccountRequisitesDomain = null;
            }
            externalAccountRequisitesDomain.f10998b = String.valueOf(charSequence);
            sellExternalAccountSelectFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SellExternalAccountSelectFragment sellExternalAccountSelectFragment = SellExternalAccountSelectFragment.this;
            CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
            if (externalAccountRequisitesDomain == null) {
                externalAccountRequisitesDomain = null;
            }
            externalAccountRequisitesDomain.f11001e = String.valueOf(charSequence);
            sellExternalAccountSelectFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SellExternalAccountSelectFragment sellExternalAccountSelectFragment = SellExternalAccountSelectFragment.this;
            CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
            if (externalAccountRequisitesDomain == null) {
                externalAccountRequisitesDomain = null;
            }
            externalAccountRequisitesDomain.f11002f = String.valueOf(charSequence);
            sellExternalAccountSelectFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SellExternalAccountSelectFragment sellExternalAccountSelectFragment = SellExternalAccountSelectFragment.this;
            CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
            if (externalAccountRequisitesDomain == null) {
                externalAccountRequisitesDomain = null;
            }
            externalAccountRequisitesDomain.i = String.valueOf(charSequence);
            sellExternalAccountSelectFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SellExternalAccountSelectFragment sellExternalAccountSelectFragment = SellExternalAccountSelectFragment.this;
            CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
            if (externalAccountRequisitesDomain == null) {
                externalAccountRequisitesDomain = null;
            }
            externalAccountRequisitesDomain.f11004h = String.valueOf(charSequence);
            sellExternalAccountSelectFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            SellExternalAccountSelectFragment sellExternalAccountSelectFragment = SellExternalAccountSelectFragment.this;
            CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = sellExternalAccountSelectFragment.f12136q0;
            if (externalAccountRequisitesDomain == null) {
                externalAccountRequisitesDomain = null;
            }
            externalAccountRequisitesDomain.f10997a = String.valueOf(charSequence);
            sellExternalAccountSelectFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
