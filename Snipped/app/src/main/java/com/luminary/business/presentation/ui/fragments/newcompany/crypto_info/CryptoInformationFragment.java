package com.luminary.business.presentation.ui.fragments.newcompany.crypto_info;

import C.v;
import F8.o;
import Fa.h;
import O9.p;
import P9.n;
import U4.b;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioButton;
import androidx.camera.core.impl.utils.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.crypto_info.CryptoInformationFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.tagview.TagView;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0966k;
import ka.C0969n;
import kotlin.Pair;
import kotlin.jvm.internal.f;
import t6.AbstractC1478y4;
import w5.C1572a;
import z8.C1652b;

/* compiled from: CryptoInformationFragment.kt */
/* loaded from: classes2.dex */
public final class CryptoInformationFragment extends BaseFragment<AbstractC1478y4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12577n0 = R.layout.fragment_new_company_crypto_info;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12578o0;

    /* renamed from: p0, reason: collision with root package name */
    public final h f12579p0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList<Pair<String, String>> f12580q0;

    /* renamed from: r0, reason: collision with root package name */
    public ArrayList<Pair<String, String>> f12581r0;
    public final ArrayList s0;

    /* renamed from: t0, reason: collision with root package name */
    public ArrayList<String> f12582t0;

    /* compiled from: CryptoInformationFragment.kt */
    public static final class e implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12592a;

        public e(InterfaceC0646l interfaceC0646l) {
            this.f12592a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12592a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12592a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.crypto_info.CryptoInformationFragment$special$$inlined$viewModel$default$1] */
    public CryptoInformationFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.crypto_info.CryptoInformationFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12578o0 = E.a(this, kotlin.jvm.internal.h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.crypto_info.CryptoInformationFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.crypto_info.CryptoInformationFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(NewCompanyViewModel.class), null, null, b.l(this));
            }
        });
        this.f12579p0 = new h(kotlin.jvm.internal.h.a(T7.e.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.crypto_info.CryptoInformationFragment$special$$inlined$navArgs$1
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
        this.f12580q0 = new ArrayList<>();
        this.f12581r0 = new ArrayList<>();
        this.s0 = new ArrayList();
        this.f12582t0 = new ArrayList<>();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.use_cryptocurrencies);
        toolbarStatus.f13266d = getString(R.string.step_of, 10, 14);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.use_cryptocurrencies);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void T0(boolean z10) {
        u0().f29858o.setEnabled(z10);
        u0().f29859p.setEnabled(z10);
    }

    public final NewCompanyViewModel U0() {
        return (NewCompanyViewModel) this.f12578o0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V0(TagView tagView, ArrayList<Pair<String, String>> arrayList) {
        tagView.f13240a.clear();
        tagView.removeAllViews();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C1652b((String) ((Pair) it.next()).f23089a));
        }
        if (!arrayList2.isEmpty()) {
            tagView.setVisibility(0);
        }
        tagView.a(arrayList2);
    }

    public final void W0(TagView tagView, ArrayList<String> arrayList) {
        tagView.f13240a.clear();
        tagView.removeAllViews();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C1652b((String) it.next()));
        }
        if (!arrayList2.isEmpty()) {
            tagView.setVisibility(0);
        }
        tagView.a(arrayList2);
    }

    public final boolean X0() {
        u0();
        T0(false);
        if (u0().f29855A.isChecked()) {
            T0(true);
            return true;
        }
        CompanyDetailsUI companyDetailsUI = U0().f12446k1;
        if (companyDetailsUI == null) {
            companyDetailsUI = null;
        }
        CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
        if ((companyUI != null ? companyUI.f11251r0 : null) == null) {
            T0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI2 = U0().f12446k1;
        if (companyDetailsUI2 == null) {
            companyDetailsUI2 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI2.f11192a;
        if ((companyUI2 != null ? companyUI2.f11249q0 : null) == null) {
            T0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI3 = U0().f12446k1;
        if (companyDetailsUI3 == null) {
            companyDetailsUI3 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI3 = companyDetailsUI3.f11192a;
        if ((companyUI3 != null ? companyUI3.s0 : null) == null) {
            T0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI4 = U0().f12446k1;
        if (companyDetailsUI4 == null) {
            companyDetailsUI4 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI4 = companyDetailsUI4.f11192a;
        if ((companyUI4 != null ? companyUI4.f11254t0 : null) == null) {
            T0(false);
            return false;
        }
        if (!u0().f29856B.isChecked() && !u0().f29855A.isChecked()) {
            T0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI5 = U0().f12446k1;
        if (companyDetailsUI5 == null) {
            companyDetailsUI5 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI5 = companyDetailsUI5.f11192a;
        List<String> list = companyUI5 != null ? companyUI5.f11256u0 : null;
        if (list == null || list.isEmpty()) {
            T0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI6 = U0().f12446k1;
        if (companyDetailsUI6 == null) {
            companyDetailsUI6 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI6 = companyDetailsUI6.f11192a;
        List<String> list2 = companyUI6 != null ? companyUI6.f11258v0 : null;
        if (list2 == null || list2.isEmpty()) {
            T0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI7 = U0().f12446k1;
        if (companyDetailsUI7 == null) {
            companyDetailsUI7 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI7 = companyDetailsUI7.f11192a;
        List<String> list3 = companyUI7 != null ? companyUI7.f11260w0 : null;
        if (list3 == null || list3.isEmpty()) {
            T0(false);
            return false;
        }
        T0(true);
        return true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public final void onViewCreated(View view, Bundle bundle) {
        List<String> list;
        super.onViewCreated(view, bundle);
        U0().f12446k1 = ((T7.e) this.f12579p0.getValue()).f3585a;
        u0().f29869z.setCurrency("€");
        u0().f29857n.setCurrency("€");
        U0().f12454t1.observe(getViewLifecycleOwner(), new e(new T7.a(this, 0)));
        U0().f12453s1.observe(getViewLifecycleOwner(), new e(new T7.a(this, 2)));
        AbstractC1478y4 u02 = u0();
        CompanyDetailsUI companyDetailsUI = U0().f12446k1;
        if (companyDetailsUI == null) {
            companyDetailsUI = null;
        }
        CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
        Long l10 = companyUI != null ? companyUI.f11251r0 : null;
        CustomTextInputEditText customTextInputEditText = u02.f29869z;
        if (l10 != null) {
            CompanyDetailsUI companyDetailsUI2 = U0().f12446k1;
            if (companyDetailsUI2 == null) {
                companyDetailsUI2 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI2.f11192a;
            customTextInputEditText.setText(String.valueOf(companyUI2 != null ? companyUI2.f11251r0 : null));
        }
        CompanyDetailsUI companyDetailsUI3 = U0().f12446k1;
        if (companyDetailsUI3 == null) {
            companyDetailsUI3 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI3 = companyDetailsUI3.f11192a;
        Long l11 = companyUI3 != null ? companyUI3.f11249q0 : null;
        CustomTextInputEditText customTextInputEditText2 = u02.f29857n;
        if (l11 != null) {
            CompanyDetailsUI companyDetailsUI4 = U0().f12446k1;
            if (companyDetailsUI4 == null) {
                companyDetailsUI4 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI4 = companyDetailsUI4.f11192a;
            customTextInputEditText2.setText(String.valueOf(companyUI4 != null ? companyUI4.f11249q0 : null));
        }
        CompanyDetailsUI companyDetailsUI5 = U0().f12446k1;
        if (companyDetailsUI5 == null) {
            companyDetailsUI5 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI5 = companyDetailsUI5.f11192a;
        BigDecimal bigDecimal = companyUI5 != null ? companyUI5.s0 : null;
        CustomTextInputEditText customTextInputEditText3 = u02.f29865v;
        if (bigDecimal != null) {
            CompanyDetailsUI companyDetailsUI6 = U0().f12446k1;
            if (companyDetailsUI6 == null) {
                companyDetailsUI6 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI6 = companyDetailsUI6.f11192a;
            customTextInputEditText3.setText(String.valueOf(companyUI6 != null ? companyUI6.s0 : null));
        }
        CompanyDetailsUI companyDetailsUI7 = U0().f12446k1;
        if (companyDetailsUI7 == null) {
            companyDetailsUI7 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI7 = companyDetailsUI7.f11192a;
        BigDecimal bigDecimal2 = companyUI7 != null ? companyUI7.f11254t0 : null;
        CustomTextInputEditText customTextInputEditText4 = u02.f29866w;
        if (bigDecimal2 != null) {
            CompanyDetailsUI companyDetailsUI8 = U0().f12446k1;
            if (companyDetailsUI8 == null) {
                companyDetailsUI8 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI8 = companyDetailsUI8.f11192a;
            customTextInputEditText4.setText(String.valueOf(companyUI8 != null ? companyUI8.f11254t0 : null));
        }
        if (this.f12582t0.isEmpty()) {
            u0().f29861r.setText("");
            CompanyDetailsUI companyDetailsUI9 = U0().f12446k1;
            if (companyDetailsUI9 == null) {
                companyDetailsUI9 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI9 = companyDetailsUI9.f11192a;
            if (companyUI9 != null && (list = companyUI9.f11260w0) != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.f12582t0.add((String) it.next());
                }
            }
        }
        W0(u02.f29862s, this.f12582t0);
        CompanyDetailsUI companyDetailsUI10 = U0().f12446k1;
        if (companyDetailsUI10 == null) {
            companyDetailsUI10 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI10 = companyDetailsUI10.f11192a;
        RadioButton radioButton = u02.f29855A;
        RadioButton radioButton2 = u02.f29856B;
        ConstraintLayout constraintLayout = u02.f29860q;
        if (companyUI10 == null || !f.b(companyUI10.f11247p0, Boolean.TRUE)) {
            CompanyDetailsUI companyDetailsUI11 = U0().f12446k1;
            CompanyDetailsUI.CompanyUI companyUI11 = (companyDetailsUI11 != null ? companyDetailsUI11 : null).f11192a;
            if (companyUI11 == null || !f.b(companyUI11.f11247p0, Boolean.FALSE)) {
                o.b(constraintLayout);
            } else {
                radioButton.setChecked(true);
                o.b(constraintLayout);
            }
        } else {
            radioButton2.setChecked(true);
            constraintLayout.setVisibility(0);
        }
        customTextInputEditText2.addTextChangedListener(new a());
        customTextInputEditText.addTextChangedListener(new b());
        customTextInputEditText3.addTextChangedListener(new c());
        customTextInputEditText4.addTextChangedListener(new d());
        o.c(u02.f29858o, 500L, new T7.b(this, u02));
        o.c(u02.f29859p, 500L, new A8.b(u02, 13));
        final int i = 1;
        o.c(u02.f29867x, 500L, new InterfaceC0635a(this) { // from class: T7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoInformationFragment f3584b;

            {
                this.f3584b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CryptoInformationFragment cryptoInformationFragment = this.f3584b;
                        cryptoInformationFragment.s0.clear();
                        List<C1572a> value = cryptoInformationFragment.U0().f12458x1.getValue();
                        ArrayList arrayList = cryptoInformationFragment.s0;
                        if (value != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : value) {
                                if (((C1572a) obj).f30827b != null) {
                                    arrayList2.add(obj);
                                }
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                C1572a c1572a = (C1572a) it2.next();
                                String str = c1572a.f30827b;
                                String str2 = str == null ? "" : str;
                                String str3 = c1572a.f30830e;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                arrayList.add(new StatementsSelectorDialog.a(str2, str3, str == null ? "" : str, "", "", null, null, null, false, 480));
                            }
                        }
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(cryptoInformationFragment.requireContext(), StatementsSelectorDialog.DialogType.f13046d);
                        statementsSelectorDialog.f13041v = new a(cryptoInformationFragment, 1);
                        statementsSelectorDialog.show();
                        StatementsSelectorDialog.l(statementsSelectorDialog, arrayList);
                        statementsSelectorDialog.m(cryptoInformationFragment.getString(R.string.hub_crypto));
                        break;
                    case 1:
                        NavController g10 = U4.b.g(this.f3584b);
                        g10.i(R.id.action_cryptoInformationFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", "outgoing_payment"));
                        break;
                    default:
                        NavController g11 = U4.b.g(this.f3584b);
                        g11.i(R.id.action_cryptoInformationFragment_to_countrySelectFragment, v.h(g11, "isCountryCode", false, "fieldName", "incoming_payment"));
                        break;
                }
                return p.f3034a;
            }
        });
        final int i9 = 2;
        o.c(u02.f29863t, 500L, new InterfaceC0635a(this) { // from class: T7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoInformationFragment f3584b;

            {
                this.f3584b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        CryptoInformationFragment cryptoInformationFragment = this.f3584b;
                        cryptoInformationFragment.s0.clear();
                        List<C1572a> value = cryptoInformationFragment.U0().f12458x1.getValue();
                        ArrayList arrayList = cryptoInformationFragment.s0;
                        if (value != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : value) {
                                if (((C1572a) obj).f30827b != null) {
                                    arrayList2.add(obj);
                                }
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                C1572a c1572a = (C1572a) it2.next();
                                String str = c1572a.f30827b;
                                String str2 = str == null ? "" : str;
                                String str3 = c1572a.f30830e;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                arrayList.add(new StatementsSelectorDialog.a(str2, str3, str == null ? "" : str, "", "", null, null, null, false, 480));
                            }
                        }
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(cryptoInformationFragment.requireContext(), StatementsSelectorDialog.DialogType.f13046d);
                        statementsSelectorDialog.f13041v = new a(cryptoInformationFragment, 1);
                        statementsSelectorDialog.show();
                        StatementsSelectorDialog.l(statementsSelectorDialog, arrayList);
                        statementsSelectorDialog.m(cryptoInformationFragment.getString(R.string.hub_crypto));
                        break;
                    case 1:
                        NavController g10 = U4.b.g(this.f3584b);
                        g10.i(R.id.action_cryptoInformationFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", "outgoing_payment"));
                        break;
                    default:
                        NavController g11 = U4.b.g(this.f3584b);
                        g11.i(R.id.action_cryptoInformationFragment_to_countrySelectFragment, v.h(g11, "isCountryCode", false, "fieldName", "incoming_payment"));
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(radioButton2, 500L, new T7.b(u02, this, 2));
        o.c(radioButton, 500L, new T7.b(u02, this, 0));
        E.b(this, "country", new R7.e(1, this, u02));
        final int i10 = 0;
        u0().f29868y.setOnTagDeleteListener(new TagView.e(this) { // from class: T7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoInformationFragment f3582b;

            {
                this.f3582b = this;
            }

            @Override // com.luminary.business.presentation.ui.views.tagview.TagView.e
            public final void d(int i11) {
                switch (i10) {
                    case 0:
                        CryptoInformationFragment cryptoInformationFragment = this.f3582b;
                        cryptoInformationFragment.f12580q0.remove(i11);
                        cryptoInformationFragment.u0().f29868y.c(i11);
                        cryptoInformationFragment.u0().f29867x.setText("");
                        CompanyDetailsUI companyDetailsUI12 = cryptoInformationFragment.U0().f12446k1;
                        if (companyDetailsUI12 == null) {
                            companyDetailsUI12 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI12 = companyDetailsUI12.f11192a;
                        if (companyUI12 != null) {
                            ArrayList<Pair<String, String>> arrayList = cryptoInformationFragment.f12580q0;
                            ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
                            Iterator<Pair<String, String>> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(it2.next().f23090b);
                            }
                            companyUI12.f11258v0 = arrayList2;
                        }
                        if (cryptoInformationFragment.f12580q0.isEmpty()) {
                            o.b(cryptoInformationFragment.u0().f29868y);
                        }
                        cryptoInformationFragment.X0();
                        break;
                    case 1:
                        CryptoInformationFragment cryptoInformationFragment2 = this.f3582b;
                        cryptoInformationFragment2.f12581r0.remove(i11);
                        cryptoInformationFragment2.u0().f29864u.c(i11);
                        cryptoInformationFragment2.u0().f29863t.setText("");
                        CompanyDetailsUI companyDetailsUI13 = cryptoInformationFragment2.U0().f12446k1;
                        if (companyDetailsUI13 == null) {
                            companyDetailsUI13 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI13 = companyDetailsUI13.f11192a;
                        if (companyUI13 != null) {
                            ArrayList<Pair<String, String>> arrayList3 = cryptoInformationFragment2.f12581r0;
                            ArrayList arrayList4 = new ArrayList(n.u(arrayList3, 10));
                            Iterator<Pair<String, String>> it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(it3.next().f23090b);
                            }
                            companyUI13.f11256u0 = arrayList4;
                        }
                        if (cryptoInformationFragment2.f12581r0.isEmpty()) {
                            o.b(cryptoInformationFragment2.u0().f29864u);
                        }
                        cryptoInformationFragment2.X0();
                        break;
                    default:
                        CryptoInformationFragment cryptoInformationFragment3 = this.f3582b;
                        cryptoInformationFragment3.f12582t0.remove(i11);
                        cryptoInformationFragment3.u0().f29862s.c(i11);
                        cryptoInformationFragment3.u0().f29861r.setText("");
                        CompanyDetailsUI companyDetailsUI14 = cryptoInformationFragment3.U0().f12446k1;
                        if (companyDetailsUI14 == null) {
                            companyDetailsUI14 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI14 = companyDetailsUI14.f11192a;
                        if (companyUI14 != null) {
                            companyUI14.f11260w0 = cryptoInformationFragment3.f12582t0;
                        }
                        if (cryptoInformationFragment3.f12582t0.isEmpty()) {
                            o.b(cryptoInformationFragment3.u0().f29862s);
                        }
                        cryptoInformationFragment3.X0();
                        break;
                }
            }
        });
        final int i11 = 1;
        u0().f29864u.setOnTagDeleteListener(new TagView.e(this) { // from class: T7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoInformationFragment f3582b;

            {
                this.f3582b = this;
            }

            @Override // com.luminary.business.presentation.ui.views.tagview.TagView.e
            public final void d(int i112) {
                switch (i11) {
                    case 0:
                        CryptoInformationFragment cryptoInformationFragment = this.f3582b;
                        cryptoInformationFragment.f12580q0.remove(i112);
                        cryptoInformationFragment.u0().f29868y.c(i112);
                        cryptoInformationFragment.u0().f29867x.setText("");
                        CompanyDetailsUI companyDetailsUI12 = cryptoInformationFragment.U0().f12446k1;
                        if (companyDetailsUI12 == null) {
                            companyDetailsUI12 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI12 = companyDetailsUI12.f11192a;
                        if (companyUI12 != null) {
                            ArrayList<Pair<String, String>> arrayList = cryptoInformationFragment.f12580q0;
                            ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
                            Iterator<Pair<String, String>> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(it2.next().f23090b);
                            }
                            companyUI12.f11258v0 = arrayList2;
                        }
                        if (cryptoInformationFragment.f12580q0.isEmpty()) {
                            o.b(cryptoInformationFragment.u0().f29868y);
                        }
                        cryptoInformationFragment.X0();
                        break;
                    case 1:
                        CryptoInformationFragment cryptoInformationFragment2 = this.f3582b;
                        cryptoInformationFragment2.f12581r0.remove(i112);
                        cryptoInformationFragment2.u0().f29864u.c(i112);
                        cryptoInformationFragment2.u0().f29863t.setText("");
                        CompanyDetailsUI companyDetailsUI13 = cryptoInformationFragment2.U0().f12446k1;
                        if (companyDetailsUI13 == null) {
                            companyDetailsUI13 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI13 = companyDetailsUI13.f11192a;
                        if (companyUI13 != null) {
                            ArrayList<Pair<String, String>> arrayList3 = cryptoInformationFragment2.f12581r0;
                            ArrayList arrayList4 = new ArrayList(n.u(arrayList3, 10));
                            Iterator<Pair<String, String>> it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(it3.next().f23090b);
                            }
                            companyUI13.f11256u0 = arrayList4;
                        }
                        if (cryptoInformationFragment2.f12581r0.isEmpty()) {
                            o.b(cryptoInformationFragment2.u0().f29864u);
                        }
                        cryptoInformationFragment2.X0();
                        break;
                    default:
                        CryptoInformationFragment cryptoInformationFragment3 = this.f3582b;
                        cryptoInformationFragment3.f12582t0.remove(i112);
                        cryptoInformationFragment3.u0().f29862s.c(i112);
                        cryptoInformationFragment3.u0().f29861r.setText("");
                        CompanyDetailsUI companyDetailsUI14 = cryptoInformationFragment3.U0().f12446k1;
                        if (companyDetailsUI14 == null) {
                            companyDetailsUI14 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI14 = companyDetailsUI14.f11192a;
                        if (companyUI14 != null) {
                            companyUI14.f11260w0 = cryptoInformationFragment3.f12582t0;
                        }
                        if (cryptoInformationFragment3.f12582t0.isEmpty()) {
                            o.b(cryptoInformationFragment3.u0().f29862s);
                        }
                        cryptoInformationFragment3.X0();
                        break;
                }
            }
        });
        final int i12 = 2;
        u0().f29862s.setOnTagDeleteListener(new TagView.e(this) { // from class: T7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoInformationFragment f3582b;

            {
                this.f3582b = this;
            }

            @Override // com.luminary.business.presentation.ui.views.tagview.TagView.e
            public final void d(int i112) {
                switch (i12) {
                    case 0:
                        CryptoInformationFragment cryptoInformationFragment = this.f3582b;
                        cryptoInformationFragment.f12580q0.remove(i112);
                        cryptoInformationFragment.u0().f29868y.c(i112);
                        cryptoInformationFragment.u0().f29867x.setText("");
                        CompanyDetailsUI companyDetailsUI12 = cryptoInformationFragment.U0().f12446k1;
                        if (companyDetailsUI12 == null) {
                            companyDetailsUI12 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI12 = companyDetailsUI12.f11192a;
                        if (companyUI12 != null) {
                            ArrayList<Pair<String, String>> arrayList = cryptoInformationFragment.f12580q0;
                            ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
                            Iterator<Pair<String, String>> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(it2.next().f23090b);
                            }
                            companyUI12.f11258v0 = arrayList2;
                        }
                        if (cryptoInformationFragment.f12580q0.isEmpty()) {
                            o.b(cryptoInformationFragment.u0().f29868y);
                        }
                        cryptoInformationFragment.X0();
                        break;
                    case 1:
                        CryptoInformationFragment cryptoInformationFragment2 = this.f3582b;
                        cryptoInformationFragment2.f12581r0.remove(i112);
                        cryptoInformationFragment2.u0().f29864u.c(i112);
                        cryptoInformationFragment2.u0().f29863t.setText("");
                        CompanyDetailsUI companyDetailsUI13 = cryptoInformationFragment2.U0().f12446k1;
                        if (companyDetailsUI13 == null) {
                            companyDetailsUI13 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI13 = companyDetailsUI13.f11192a;
                        if (companyUI13 != null) {
                            ArrayList<Pair<String, String>> arrayList3 = cryptoInformationFragment2.f12581r0;
                            ArrayList arrayList4 = new ArrayList(n.u(arrayList3, 10));
                            Iterator<Pair<String, String>> it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(it3.next().f23090b);
                            }
                            companyUI13.f11256u0 = arrayList4;
                        }
                        if (cryptoInformationFragment2.f12581r0.isEmpty()) {
                            o.b(cryptoInformationFragment2.u0().f29864u);
                        }
                        cryptoInformationFragment2.X0();
                        break;
                    default:
                        CryptoInformationFragment cryptoInformationFragment3 = this.f3582b;
                        cryptoInformationFragment3.f12582t0.remove(i112);
                        cryptoInformationFragment3.u0().f29862s.c(i112);
                        cryptoInformationFragment3.u0().f29861r.setText("");
                        CompanyDetailsUI companyDetailsUI14 = cryptoInformationFragment3.U0().f12446k1;
                        if (companyDetailsUI14 == null) {
                            companyDetailsUI14 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI14 = companyDetailsUI14.f11192a;
                        if (companyUI14 != null) {
                            companyUI14.f11260w0 = cryptoInformationFragment3.f12582t0;
                        }
                        if (cryptoInformationFragment3.f12582t0.isEmpty()) {
                            o.b(cryptoInformationFragment3.u0().f29862s);
                        }
                        cryptoInformationFragment3.X0();
                        break;
                }
            }
        });
        final int i13 = 0;
        o.c(u0().f29861r, 500L, new InterfaceC0635a(this) { // from class: T7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoInformationFragment f3584b;

            {
                this.f3584b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        CryptoInformationFragment cryptoInformationFragment = this.f3584b;
                        cryptoInformationFragment.s0.clear();
                        List<C1572a> value = cryptoInformationFragment.U0().f12458x1.getValue();
                        ArrayList arrayList = cryptoInformationFragment.s0;
                        if (value != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : value) {
                                if (((C1572a) obj).f30827b != null) {
                                    arrayList2.add(obj);
                                }
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                C1572a c1572a = (C1572a) it2.next();
                                String str = c1572a.f30827b;
                                String str2 = str == null ? "" : str;
                                String str3 = c1572a.f30830e;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                arrayList.add(new StatementsSelectorDialog.a(str2, str3, str == null ? "" : str, "", "", null, null, null, false, 480));
                            }
                        }
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(cryptoInformationFragment.requireContext(), StatementsSelectorDialog.DialogType.f13046d);
                        statementsSelectorDialog.f13041v = new a(cryptoInformationFragment, 1);
                        statementsSelectorDialog.show();
                        StatementsSelectorDialog.l(statementsSelectorDialog, arrayList);
                        statementsSelectorDialog.m(cryptoInformationFragment.getString(R.string.hub_crypto));
                        break;
                    case 1:
                        NavController g10 = U4.b.g(this.f3584b);
                        g10.i(R.id.action_cryptoInformationFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", "outgoing_payment"));
                        break;
                    default:
                        NavController g11 = U4.b.g(this.f3584b);
                        g11.i(R.id.action_cryptoInformationFragment_to_countrySelectFragment, v.h(g11, "isCountryCode", false, "fieldName", "incoming_payment"));
                        break;
                }
                return p.f3034a;
            }
        });
        NewCompanyViewModel U02 = U0();
        O7.c cVar = new O7.c(U02, 0);
        U02.f12426F1 = cVar;
        cVar.invoke();
        U0().h0();
        X0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12577n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f29858o.setVisibility(0);
        o.b(u0().f29859p);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f29858o);
        u0().f29859p.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            CryptoInformationFragment cryptoInformationFragment = CryptoInformationFragment.this;
            CompanyDetailsUI companyDetailsUI = cryptoInformationFragment.U0().f12446k1;
            if (companyDetailsUI == null) {
                companyDetailsUI = null;
            }
            CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
            if (companyUI != null) {
                companyUI.f11249q0 = C0966k.T(D9.b.r0(String.valueOf(charSequence)));
            }
            cryptoInformationFragment.X0();
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
            CryptoInformationFragment cryptoInformationFragment = CryptoInformationFragment.this;
            CompanyDetailsUI companyDetailsUI = cryptoInformationFragment.U0().f12446k1;
            if (companyDetailsUI == null) {
                companyDetailsUI = null;
            }
            CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
            if (companyUI != null) {
                companyUI.f11251r0 = C0966k.T(D9.b.r0(String.valueOf(charSequence)));
            }
            cryptoInformationFragment.X0();
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
            CharSequence u02 = charSequence != null ? C0969n.u0(charSequence) : null;
            CryptoInformationFragment cryptoInformationFragment = CryptoInformationFragment.this;
            if (u02 == null || u02.length() == 0) {
                CompanyDetailsUI companyDetailsUI = cryptoInformationFragment.U0().f12446k1;
                if (companyDetailsUI == null) {
                    companyDetailsUI = null;
                }
                CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                if (companyUI != null) {
                    companyUI.s0 = null;
                }
            } else {
                CompanyDetailsUI companyDetailsUI2 = cryptoInformationFragment.U0().f12446k1;
                CompanyDetailsUI.CompanyUI companyUI2 = (companyDetailsUI2 != null ? companyDetailsUI2 : null).f11192a;
                if (companyUI2 != null) {
                    companyUI2.s0 = new BigDecimal(charSequence.toString());
                }
            }
            cryptoInformationFragment.X0();
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
            CharSequence u02 = charSequence != null ? C0969n.u0(charSequence) : null;
            CryptoInformationFragment cryptoInformationFragment = CryptoInformationFragment.this;
            if (u02 == null || u02.length() == 0) {
                CompanyDetailsUI companyDetailsUI = cryptoInformationFragment.U0().f12446k1;
                if (companyDetailsUI == null) {
                    companyDetailsUI = null;
                }
                CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                if (companyUI != null) {
                    companyUI.f11254t0 = null;
                }
            } else {
                CompanyDetailsUI companyDetailsUI2 = cryptoInformationFragment.U0().f12446k1;
                CompanyDetailsUI.CompanyUI companyUI2 = (companyDetailsUI2 != null ? companyDetailsUI2 : null).f11192a;
                if (companyUI2 != null) {
                    companyUI2.f11254t0 = new BigDecimal(charSequence.toString());
                }
            }
            cryptoInformationFragment.X0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
