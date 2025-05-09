package com.luminary.business.presentation.ui.fragments.newcompany.businessactivity;

import F8.o;
import Fa.h;
import O9.p;
import P9.n;
import R7.g;
import U4.b;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.company.BankAccountOutside;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.BusinessActivityFragment;
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
import t6.M2;
import z8.C1652b;

/* compiled from: BusinessActivityFragment.kt */
/* loaded from: classes2.dex */
public final class BusinessActivityFragment extends BaseFragment<M2> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12530n0 = R.layout.fragment_business_activity;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12531o0;

    /* renamed from: p0, reason: collision with root package name */
    public final h f12532p0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList<Pair<String, String>> f12533q0;

    /* renamed from: r0, reason: collision with root package name */
    public ArrayList<Pair<String, String>> f12534r0;
    public final ArrayList s0;

    /* renamed from: t0, reason: collision with root package name */
    public ArrayList<String> f12535t0;

    /* compiled from: BusinessActivityFragment.kt */
    public static final class e implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12545a;

        public e(InterfaceC0646l interfaceC0646l) {
            this.f12545a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12545a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12545a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.BusinessActivityFragment$special$$inlined$viewModel$default$1] */
    public BusinessActivityFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.BusinessActivityFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12531o0 = E.a(this, kotlin.jvm.internal.h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.BusinessActivityFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.BusinessActivityFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(NewCompanyViewModel.class), null, null, b.l(this));
            }
        });
        this.f12532p0 = new h(kotlin.jvm.internal.h.a(g.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.businessactivity.BusinessActivityFragment$special$$inlined$navArgs$1
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
        this.f12533q0 = new ArrayList<>();
        this.f12534r0 = new ArrayList<>();
        this.s0 = new ArrayList();
        this.f12535t0 = new ArrayList<>();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.business_activity);
        toolbarStatus.f13266d = getString(R.string.step_of, 9, 14);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.business_activity);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @SuppressLint({"SetTextI18n"})
    public final void T0() {
        ArrayList<BankAccountOutside> arrayList;
        u0().f28157o.removeAllViews();
        CompanyDetailsUI companyDetailsUI = V0().f12446k1;
        if (companyDetailsUI == null) {
            companyDetailsUI = null;
        }
        CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
        if (companyUI == null || (arrayList = companyUI.f11241m0) == null) {
            return;
        }
        for (BankAccountOutside bankAccountOutside : arrayList) {
            View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.cell_bank_acoount, (ViewGroup) null);
            ((CustomTextInputEditText) inflate.findViewById(R.id.accountInputView)).setText(bankAccountOutside.f11188a + ", " + bankAccountOutside.f11190c);
            u0().f28157o.addView(inflate);
        }
    }

    public final void U0(boolean z10) {
        u0().f28158p.setEnabled(z10);
        u0().f28159q.setEnabled(z10);
    }

    public final NewCompanyViewModel V0() {
        return (NewCompanyViewModel) this.f12531o0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W0(TagView tagView, ArrayList<Pair<String, String>> arrayList) {
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

    public final void X0(TagView tagView, ArrayList<String> arrayList) {
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

    public final boolean Y0() {
        u0();
        U0(false);
        CompanyDetailsUI companyDetailsUI = V0().f12446k1;
        if (companyDetailsUI == null) {
            companyDetailsUI = null;
        }
        CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
        if ((companyUI != null ? companyUI.f11223c0 : null) == null) {
            U0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI2 = V0().f12446k1;
        if (companyDetailsUI2 == null) {
            companyDetailsUI2 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI2.f11192a;
        if ((companyUI2 != null ? companyUI2.f11204E : null) == null) {
            U0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI3 = V0().f12446k1;
        if (companyDetailsUI3 == null) {
            companyDetailsUI3 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI3 = companyDetailsUI3.f11192a;
        if ((companyUI3 != null ? companyUI3.f11225d0 : null) == null) {
            U0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI4 = V0().f12446k1;
        if (companyDetailsUI4 == null) {
            companyDetailsUI4 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI4 = companyDetailsUI4.f11192a;
        if ((companyUI4 != null ? companyUI4.f11228f0 : null) == null) {
            U0(false);
            return false;
        }
        if (!u0().f28155C.isChecked() && !u0().f28154B.isChecked()) {
            U0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI5 = V0().f12446k1;
        if (companyDetailsUI5 == null) {
            companyDetailsUI5 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI5 = companyDetailsUI5.f11192a;
        List<String> list = companyUI5 != null ? companyUI5.f11237k0 : null;
        if (list == null || list.isEmpty()) {
            U0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI6 = V0().f12446k1;
        if (companyDetailsUI6 == null) {
            companyDetailsUI6 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI6 = companyDetailsUI6.f11192a;
        List<String> list2 = companyUI6 != null ? companyUI6.f11235j0 : null;
        if (list2 == null || list2.isEmpty()) {
            U0(false);
            return false;
        }
        CompanyDetailsUI companyDetailsUI7 = V0().f12446k1;
        if (companyDetailsUI7 == null) {
            companyDetailsUI7 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI7 = companyDetailsUI7.f11192a;
        List<String> list3 = companyUI7 != null ? companyUI7.f11239l0 : null;
        if (list3 == null || list3.isEmpty()) {
            U0(false);
            return false;
        }
        U0(true);
        return true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = V0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<String> list;
        super.onViewCreated(view, bundle);
        V0().f12446k1 = ((g) this.f12532p0.getValue()).f3308a;
        u0().f28153A.setCurrency("€");
        u0().f28156n.setCurrency("€");
        E.b(this, "NEW_BANK_OUTSIDE", new B6.h(this, 10));
        V0().f12453s1.observe(getViewLifecycleOwner(), new e(new R7.d(this, 1)));
        V0().f12454t1.observe(getViewLifecycleOwner(), new e(new R7.d(this, 2)));
        final M2 u02 = u0();
        CompanyDetailsUI companyDetailsUI = V0().f12446k1;
        if (companyDetailsUI == null) {
            companyDetailsUI = null;
        }
        CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
        Integer num = companyUI != null ? companyUI.f11204E : null;
        CustomTextInputEditText customTextInputEditText = u02.f28153A;
        if (num != null) {
            CompanyDetailsUI companyDetailsUI2 = V0().f12446k1;
            if (companyDetailsUI2 == null) {
                companyDetailsUI2 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI2.f11192a;
            customTextInputEditText.setText(String.valueOf(companyUI2 != null ? companyUI2.f11204E : null));
        }
        CompanyDetailsUI companyDetailsUI3 = V0().f12446k1;
        if (companyDetailsUI3 == null) {
            companyDetailsUI3 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI3 = companyDetailsUI3.f11192a;
        Long l10 = companyUI3 != null ? companyUI3.f11223c0 : null;
        CustomTextInputEditText customTextInputEditText2 = u02.f28156n;
        if (l10 != null) {
            CompanyDetailsUI companyDetailsUI4 = V0().f12446k1;
            if (companyDetailsUI4 == null) {
                companyDetailsUI4 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI4 = companyDetailsUI4.f11192a;
            customTextInputEditText2.setText(String.valueOf(companyUI4 != null ? companyUI4.f11223c0 : null));
        }
        CompanyDetailsUI companyDetailsUI5 = V0().f12446k1;
        if (companyDetailsUI5 == null) {
            companyDetailsUI5 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI5 = companyDetailsUI5.f11192a;
        BigDecimal bigDecimal = companyUI5 != null ? companyUI5.f11225d0 : null;
        CustomTextInputEditText customTextInputEditText3 = u02.f28165w;
        if (bigDecimal != null) {
            CompanyDetailsUI companyDetailsUI6 = V0().f12446k1;
            if (companyDetailsUI6 == null) {
                companyDetailsUI6 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI6 = companyDetailsUI6.f11192a;
            customTextInputEditText3.setText(String.valueOf(companyUI6 != null ? companyUI6.f11225d0 : null));
        }
        CompanyDetailsUI companyDetailsUI7 = V0().f12446k1;
        if (companyDetailsUI7 == null) {
            companyDetailsUI7 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI7 = companyDetailsUI7.f11192a;
        BigDecimal bigDecimal2 = companyUI7 != null ? companyUI7.f11228f0 : null;
        CustomTextInputEditText customTextInputEditText4 = u02.f28166x;
        if (bigDecimal2 != null) {
            CompanyDetailsUI companyDetailsUI8 = V0().f12446k1;
            if (companyDetailsUI8 == null) {
                companyDetailsUI8 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI8 = companyDetailsUI8.f11192a;
            customTextInputEditText4.setText(String.valueOf(companyUI8 != null ? companyUI8.f11228f0 : null));
        }
        CompanyDetailsUI companyDetailsUI9 = V0().f12446k1;
        if (companyDetailsUI9 == null) {
            companyDetailsUI9 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI9 = companyDetailsUI9.f11192a;
        RadioButton radioButton = u02.f28155C;
        if (companyUI9 != null && f.b(companyUI9.f11232h0, Boolean.TRUE)) {
            radioButton.setChecked(true);
        }
        CompanyDetailsUI companyDetailsUI10 = V0().f12446k1;
        if (companyDetailsUI10 == null) {
            companyDetailsUI10 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI10 = companyDetailsUI10.f11192a;
        RadioButton radioButton2 = u02.f28154B;
        if (companyUI10 != null && f.b(companyUI10.f11232h0, Boolean.FALSE)) {
            radioButton2.setChecked(true);
        }
        if (this.f12535t0.isEmpty()) {
            u0().f28160r.setText("");
            CompanyDetailsUI companyDetailsUI11 = V0().f12446k1;
            CompanyDetailsUI.CompanyUI companyUI11 = (companyDetailsUI11 != null ? companyDetailsUI11 : null).f11192a;
            if (companyUI11 != null && (list = companyUI11.f11239l0) != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.f12535t0.add((String) it.next());
                }
            }
        }
        X0(u02.f28161s, this.f12535t0);
        customTextInputEditText2.addTextChangedListener(new a());
        customTextInputEditText.addTextChangedListener(new b());
        customTextInputEditText3.addTextChangedListener(new c());
        customTextInputEditText4.addTextChangedListener(new d());
        final int i = 3;
        o.c(u02.f28164v, 500L, new InterfaceC0635a(this) { // from class: R7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BusinessActivityFragment f3297b;

            {
                this.f3297b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
            /* JADX WARN: Type inference failed for: r7v1, types: [O7.g] */
            @Override // ca.InterfaceC0635a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instructions count: 512
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: R7.b.invoke():java.lang.Object");
            }
        });
        final int i9 = 4;
        o.c(u02.f28158p, 500L, new InterfaceC0635a(this) { // from class: R7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BusinessActivityFragment f3297b;

            {
                this.f3297b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 512
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: R7.b.invoke():java.lang.Object");
            }
        });
        o.c(u02.f28159q, 500L, new A8.b(u02, 10));
        final int i10 = 0;
        o.c(u02.f28167y, 500L, new InterfaceC0635a(this) { // from class: R7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BusinessActivityFragment f3297b;

            {
                this.f3297b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 512
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: R7.b.invoke():java.lang.Object");
            }
        });
        final int i11 = 1;
        o.c(u02.f28162t, 500L, new InterfaceC0635a(this) { // from class: R7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BusinessActivityFragment f3297b;

            {
                this.f3297b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 512
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: R7.b.invoke():java.lang.Object");
            }
        });
        final int i12 = 0;
        o.c(radioButton, 500L, new InterfaceC0635a() { // from class: R7.c
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        u02.f28155C.setChecked(true);
                        CompanyDetailsUI companyDetailsUI12 = this.V0().f12446k1;
                        if (companyDetailsUI12 == null) {
                            companyDetailsUI12 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI12 = companyDetailsUI12.f11192a;
                        if (companyUI12 != null) {
                            companyUI12.f11232h0 = Boolean.TRUE;
                        }
                        break;
                    default:
                        u02.f28154B.setChecked(true);
                        CompanyDetailsUI companyDetailsUI13 = this.V0().f12446k1;
                        if (companyDetailsUI13 == null) {
                            companyDetailsUI13 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI13 = companyDetailsUI13.f11192a;
                        if (companyUI13 != null) {
                            companyUI13.f11232h0 = Boolean.FALSE;
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        final int i13 = 1;
        o.c(radioButton2, 500L, new InterfaceC0635a() { // from class: R7.c
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        u02.f28155C.setChecked(true);
                        CompanyDetailsUI companyDetailsUI12 = this.V0().f12446k1;
                        if (companyDetailsUI12 == null) {
                            companyDetailsUI12 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI12 = companyDetailsUI12.f11192a;
                        if (companyUI12 != null) {
                            companyUI12.f11232h0 = Boolean.TRUE;
                        }
                        break;
                    default:
                        u02.f28154B.setChecked(true);
                        CompanyDetailsUI companyDetailsUI13 = this.V0().f12446k1;
                        if (companyDetailsUI13 == null) {
                            companyDetailsUI13 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI13 = companyDetailsUI13.f11192a;
                        if (companyUI13 != null) {
                            companyUI13.f11232h0 = Boolean.FALSE;
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        final int i14 = 0;
        E.b(this, "country", new R7.e(0, this, u02));
        u0().f28168z.setOnTagDeleteListener(new TagView.e(this) { // from class: R7.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BusinessActivityFragment f3307b;

            {
                this.f3307b = this;
            }

            @Override // com.luminary.business.presentation.ui.views.tagview.TagView.e
            public final void d(int i15) {
                switch (i14) {
                    case 0:
                        BusinessActivityFragment businessActivityFragment = this.f3307b;
                        businessActivityFragment.f12533q0.remove(i15);
                        businessActivityFragment.u0().f28168z.c(i15);
                        businessActivityFragment.u0().f28167y.setText("");
                        if (businessActivityFragment.f12533q0.isEmpty()) {
                            o.b(businessActivityFragment.u0().f28168z);
                        }
                        CompanyDetailsUI companyDetailsUI12 = businessActivityFragment.V0().f12446k1;
                        if (companyDetailsUI12 == null) {
                            companyDetailsUI12 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI12 = companyDetailsUI12.f11192a;
                        if (companyUI12 != null) {
                            ArrayList<Pair<String, String>> arrayList = businessActivityFragment.f12533q0;
                            ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
                            Iterator<Pair<String, String>> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(it2.next().f23090b);
                            }
                            companyUI12.f11237k0 = arrayList2;
                        }
                        businessActivityFragment.Y0();
                        break;
                    case 1:
                        BusinessActivityFragment businessActivityFragment2 = this.f3307b;
                        businessActivityFragment2.f12534r0.remove(i15);
                        businessActivityFragment2.u0().f28163u.c(i15);
                        businessActivityFragment2.u0().f28162t.setText("");
                        if (businessActivityFragment2.f12534r0.isEmpty()) {
                            o.b(businessActivityFragment2.u0().f28163u);
                        }
                        CompanyDetailsUI companyDetailsUI13 = businessActivityFragment2.V0().f12446k1;
                        if (companyDetailsUI13 == null) {
                            companyDetailsUI13 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI13 = companyDetailsUI13.f11192a;
                        if (companyUI13 != null) {
                            ArrayList<Pair<String, String>> arrayList3 = businessActivityFragment2.f12534r0;
                            ArrayList arrayList4 = new ArrayList(n.u(arrayList3, 10));
                            Iterator<Pair<String, String>> it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(it3.next().f23090b);
                            }
                            companyUI13.f11235j0 = arrayList4;
                        }
                        businessActivityFragment2.Y0();
                        break;
                    default:
                        BusinessActivityFragment businessActivityFragment3 = this.f3307b;
                        businessActivityFragment3.f12535t0.remove(i15);
                        businessActivityFragment3.u0().f28161s.c(i15);
                        businessActivityFragment3.u0().f28160r.setText("");
                        if (businessActivityFragment3.f12535t0.isEmpty()) {
                            o.b(businessActivityFragment3.u0().f28161s);
                        }
                        CompanyDetailsUI companyDetailsUI14 = businessActivityFragment3.V0().f12446k1;
                        if (companyDetailsUI14 == null) {
                            companyDetailsUI14 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI14 = companyDetailsUI14.f11192a;
                        if (companyUI14 != null) {
                            companyUI14.f11239l0 = businessActivityFragment3.f12535t0;
                        }
                        businessActivityFragment3.Y0();
                        break;
                }
            }
        });
        final int i15 = 1;
        u0().f28163u.setOnTagDeleteListener(new TagView.e(this) { // from class: R7.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BusinessActivityFragment f3307b;

            {
                this.f3307b = this;
            }

            @Override // com.luminary.business.presentation.ui.views.tagview.TagView.e
            public final void d(int i152) {
                switch (i15) {
                    case 0:
                        BusinessActivityFragment businessActivityFragment = this.f3307b;
                        businessActivityFragment.f12533q0.remove(i152);
                        businessActivityFragment.u0().f28168z.c(i152);
                        businessActivityFragment.u0().f28167y.setText("");
                        if (businessActivityFragment.f12533q0.isEmpty()) {
                            o.b(businessActivityFragment.u0().f28168z);
                        }
                        CompanyDetailsUI companyDetailsUI12 = businessActivityFragment.V0().f12446k1;
                        if (companyDetailsUI12 == null) {
                            companyDetailsUI12 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI12 = companyDetailsUI12.f11192a;
                        if (companyUI12 != null) {
                            ArrayList<Pair<String, String>> arrayList = businessActivityFragment.f12533q0;
                            ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
                            Iterator<Pair<String, String>> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(it2.next().f23090b);
                            }
                            companyUI12.f11237k0 = arrayList2;
                        }
                        businessActivityFragment.Y0();
                        break;
                    case 1:
                        BusinessActivityFragment businessActivityFragment2 = this.f3307b;
                        businessActivityFragment2.f12534r0.remove(i152);
                        businessActivityFragment2.u0().f28163u.c(i152);
                        businessActivityFragment2.u0().f28162t.setText("");
                        if (businessActivityFragment2.f12534r0.isEmpty()) {
                            o.b(businessActivityFragment2.u0().f28163u);
                        }
                        CompanyDetailsUI companyDetailsUI13 = businessActivityFragment2.V0().f12446k1;
                        if (companyDetailsUI13 == null) {
                            companyDetailsUI13 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI13 = companyDetailsUI13.f11192a;
                        if (companyUI13 != null) {
                            ArrayList<Pair<String, String>> arrayList3 = businessActivityFragment2.f12534r0;
                            ArrayList arrayList4 = new ArrayList(n.u(arrayList3, 10));
                            Iterator<Pair<String, String>> it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(it3.next().f23090b);
                            }
                            companyUI13.f11235j0 = arrayList4;
                        }
                        businessActivityFragment2.Y0();
                        break;
                    default:
                        BusinessActivityFragment businessActivityFragment3 = this.f3307b;
                        businessActivityFragment3.f12535t0.remove(i152);
                        businessActivityFragment3.u0().f28161s.c(i152);
                        businessActivityFragment3.u0().f28160r.setText("");
                        if (businessActivityFragment3.f12535t0.isEmpty()) {
                            o.b(businessActivityFragment3.u0().f28161s);
                        }
                        CompanyDetailsUI companyDetailsUI14 = businessActivityFragment3.V0().f12446k1;
                        if (companyDetailsUI14 == null) {
                            companyDetailsUI14 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI14 = companyDetailsUI14.f11192a;
                        if (companyUI14 != null) {
                            companyUI14.f11239l0 = businessActivityFragment3.f12535t0;
                        }
                        businessActivityFragment3.Y0();
                        break;
                }
            }
        });
        final int i16 = 2;
        u0().f28161s.setOnTagDeleteListener(new TagView.e(this) { // from class: R7.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BusinessActivityFragment f3307b;

            {
                this.f3307b = this;
            }

            @Override // com.luminary.business.presentation.ui.views.tagview.TagView.e
            public final void d(int i152) {
                switch (i16) {
                    case 0:
                        BusinessActivityFragment businessActivityFragment = this.f3307b;
                        businessActivityFragment.f12533q0.remove(i152);
                        businessActivityFragment.u0().f28168z.c(i152);
                        businessActivityFragment.u0().f28167y.setText("");
                        if (businessActivityFragment.f12533q0.isEmpty()) {
                            o.b(businessActivityFragment.u0().f28168z);
                        }
                        CompanyDetailsUI companyDetailsUI12 = businessActivityFragment.V0().f12446k1;
                        if (companyDetailsUI12 == null) {
                            companyDetailsUI12 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI12 = companyDetailsUI12.f11192a;
                        if (companyUI12 != null) {
                            ArrayList<Pair<String, String>> arrayList = businessActivityFragment.f12533q0;
                            ArrayList arrayList2 = new ArrayList(n.u(arrayList, 10));
                            Iterator<Pair<String, String>> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(it2.next().f23090b);
                            }
                            companyUI12.f11237k0 = arrayList2;
                        }
                        businessActivityFragment.Y0();
                        break;
                    case 1:
                        BusinessActivityFragment businessActivityFragment2 = this.f3307b;
                        businessActivityFragment2.f12534r0.remove(i152);
                        businessActivityFragment2.u0().f28163u.c(i152);
                        businessActivityFragment2.u0().f28162t.setText("");
                        if (businessActivityFragment2.f12534r0.isEmpty()) {
                            o.b(businessActivityFragment2.u0().f28163u);
                        }
                        CompanyDetailsUI companyDetailsUI13 = businessActivityFragment2.V0().f12446k1;
                        if (companyDetailsUI13 == null) {
                            companyDetailsUI13 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI13 = companyDetailsUI13.f11192a;
                        if (companyUI13 != null) {
                            ArrayList<Pair<String, String>> arrayList3 = businessActivityFragment2.f12534r0;
                            ArrayList arrayList4 = new ArrayList(n.u(arrayList3, 10));
                            Iterator<Pair<String, String>> it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(it3.next().f23090b);
                            }
                            companyUI13.f11235j0 = arrayList4;
                        }
                        businessActivityFragment2.Y0();
                        break;
                    default:
                        BusinessActivityFragment businessActivityFragment3 = this.f3307b;
                        businessActivityFragment3.f12535t0.remove(i152);
                        businessActivityFragment3.u0().f28161s.c(i152);
                        businessActivityFragment3.u0().f28160r.setText("");
                        if (businessActivityFragment3.f12535t0.isEmpty()) {
                            o.b(businessActivityFragment3.u0().f28161s);
                        }
                        CompanyDetailsUI companyDetailsUI14 = businessActivityFragment3.V0().f12446k1;
                        if (companyDetailsUI14 == null) {
                            companyDetailsUI14 = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI14 = companyDetailsUI14.f11192a;
                        if (companyUI14 != null) {
                            companyUI14.f11239l0 = businessActivityFragment3.f12535t0;
                        }
                        businessActivityFragment3.Y0();
                        break;
                }
            }
        });
        o.c(u0().f28160r, 500L, new InterfaceC0635a(this) { // from class: R7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BusinessActivityFragment f3297b;

            {
                this.f3297b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 512
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: R7.b.invoke():java.lang.Object");
            }
        });
        NewCompanyViewModel V02 = V0();
        O7.c cVar = new O7.c(V02, 0);
        V02.f12426F1 = cVar;
        cVar.invoke();
        V0().h0();
        Y0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12530n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f28158p.setVisibility(0);
        o.b(u0().f28159q);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f28158p);
        u0().f28159q.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            BusinessActivityFragment businessActivityFragment = BusinessActivityFragment.this;
            CompanyDetailsUI companyDetailsUI = businessActivityFragment.V0().f12446k1;
            if (companyDetailsUI == null) {
                companyDetailsUI = null;
            }
            CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
            if (companyUI != null) {
                companyUI.f11223c0 = C0966k.T(D9.b.r0(String.valueOf(charSequence)));
            }
            businessActivityFragment.Y0();
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
            BusinessActivityFragment businessActivityFragment = BusinessActivityFragment.this;
            CompanyDetailsUI companyDetailsUI = businessActivityFragment.V0().f12446k1;
            if (companyDetailsUI == null) {
                companyDetailsUI = null;
            }
            CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
            if (companyUI != null) {
                companyUI.f11204E = C0966k.S(D9.b.r0(String.valueOf(charSequence)));
            }
            businessActivityFragment.Y0();
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
            BusinessActivityFragment businessActivityFragment = BusinessActivityFragment.this;
            if (u02 == null || u02.length() == 0) {
                CompanyDetailsUI companyDetailsUI = businessActivityFragment.V0().f12446k1;
                if (companyDetailsUI == null) {
                    companyDetailsUI = null;
                }
                CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                if (companyUI != null) {
                    companyUI.f11225d0 = null;
                }
            } else {
                CompanyDetailsUI companyDetailsUI2 = businessActivityFragment.V0().f12446k1;
                CompanyDetailsUI.CompanyUI companyUI2 = (companyDetailsUI2 != null ? companyDetailsUI2 : null).f11192a;
                if (companyUI2 != null) {
                    companyUI2.f11225d0 = new BigDecimal(charSequence.toString());
                }
            }
            businessActivityFragment.Y0();
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
            BusinessActivityFragment businessActivityFragment = BusinessActivityFragment.this;
            if (u02 == null || u02.length() == 0) {
                CompanyDetailsUI companyDetailsUI = businessActivityFragment.V0().f12446k1;
                if (companyDetailsUI == null) {
                    companyDetailsUI = null;
                }
                CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                if (companyUI != null) {
                    companyUI.f11228f0 = null;
                }
            } else {
                CompanyDetailsUI companyDetailsUI2 = businessActivityFragment.V0().f12446k1;
                CompanyDetailsUI.CompanyUI companyUI2 = (companyDetailsUI2 != null ? companyDetailsUI2 : null).f11192a;
                if (companyUI2 != null) {
                    companyUI2.f11228f0 = new BigDecimal(charSequence.toString());
                }
            }
            businessActivityFragment.Y0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
