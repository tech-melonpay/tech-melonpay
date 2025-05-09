package com.luminary.business.presentation.ui.fragments.newcompany.submit;

import F8.o;
import Fa.h;
import O9.p;
import Y7.b;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.camera.core.n;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.bumptech.glide.Glide;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.submit.SubmitCompanyFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import t6.I4;

/* compiled from: SubmitCompanyFragment.kt */
/* loaded from: classes2.dex */
public final class SubmitCompanyFragment extends BaseFragment<I4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12670n0 = R.layout.fragment_new_company_submit;

    /* renamed from: o0, reason: collision with root package name */
    public final h f12671o0 = new h(kotlin.jvm.internal.h.a(b.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.submit.SubmitCompanyFragment$special$$inlined$navArgs$1
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

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f12672p0;

    /* renamed from: q0, reason: collision with root package name */
    public SubmitStatus f12673q0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubmitCompanyFragment.kt */
    public static final class SubmitStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final SubmitStatus f12679a;

        /* renamed from: b, reason: collision with root package name */
        public static final SubmitStatus f12680b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ SubmitStatus[] f12681c;

        static {
            SubmitStatus submitStatus = new SubmitStatus("Added", 0);
            f12679a = submitStatus;
            SubmitStatus submitStatus2 = new SubmitStatus("InReview", 1);
            f12680b = submitStatus2;
            f12681c = new SubmitStatus[]{submitStatus, submitStatus2};
        }

        public SubmitStatus() {
            throw null;
        }

        public static SubmitStatus valueOf(String str) {
            return (SubmitStatus) Enum.valueOf(SubmitStatus.class, str);
        }

        public static SubmitStatus[] values() {
            return (SubmitStatus[]) f12681c.clone();
        }
    }

    /* compiled from: SubmitCompanyFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12682a;

        public a(C7.a aVar) {
            this.f12682a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12682a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12682a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.newcompany.submit.SubmitCompanyFragment$special$$inlined$viewModel$default$1] */
    public SubmitCompanyFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.submit.SubmitCompanyFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12672p0 = E.a(this, kotlin.jvm.internal.h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.submit.SubmitCompanyFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.submit.SubmitCompanyFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return U4.b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(NewCompanyViewModel.class), null, null, U4.b.l(this));
            }
        });
        this.f12673q0 = SubmitStatus.f12679a;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = false;
        if (this.f12673q0 == SubmitStatus.f12680b) {
            toolbarStatus.f13263a = getString(R.string.company_added);
            toolbarStatus.f13266d = "\n";
            toolbarStatus.f13265c = 18;
        } else {
            toolbarStatus.f13263a = getString(R.string.thank_you);
            toolbarStatus.f13266d = "\n";
            toolbarStatus.f13265c = 18;
        }
        return toolbarStatus;
    }

    public final void T0() {
        int ordinal = this.f12673q0.ordinal();
        if (ordinal == 0) {
            u0().f28008o.setVisibility(0);
            o.b(u0().f28007n);
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            o.b(u0().f28008o);
            u0().f28007n.setVisibility(0);
        }
        L0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = (NewCompanyViewModel) this.f12672p0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        Glide.with(requireContext()).load("file:///android_asset/clock.gif").into(u0().f28009p);
        b bVar = (b) this.f12671o0.getValue();
        I4 u02 = u0();
        CompanyDetailsUI.CompanyUI companyUI = bVar.f4120a.f11192a;
        u02.f28011r.setText(companyUI != null ? companyUI.f11263z : null);
        CompanyDetailsUI companyDetailsUI = bVar.f4120a;
        CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI.f11192a;
        if (companyUI2 == null || (str = companyUI2.f11222c) == null) {
            str = "";
        }
        u02.f28010q.setText(str);
        CompanyDetailsUI.CompanyUI companyUI3 = companyDetailsUI.f11192a;
        u02.f28012s.setText(n.a("+", companyUI3 != null ? companyUI3.f11226e : null, companyUI3 != null ? companyUI3.f11227f : null));
        ((NewCompanyViewModel) this.f12672p0.getValue()).n1.observe(getViewLifecycleOwner(), new a(new C7.a(this, 15)));
        final int i = 0;
        o.c(u0().f28007n, 500L, new InterfaceC0635a(this) { // from class: Y7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubmitCompanyFragment f4119b;

            {
                this.f4119b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                Integer num;
                switch (i) {
                    case 0:
                        U4.b.g(this.f4119b).m(R.id.companiesListFragment, false);
                        break;
                    default:
                        SubmitCompanyFragment submitCompanyFragment = this.f4119b;
                        CompanyDetailsUI.CompanyUI companyUI4 = ((b) submitCompanyFragment.f12671o0.getValue()).f4120a.f11192a;
                        if (companyUI4 != null && (num = companyUI4.f11218a) != null) {
                            int intValue = num.intValue();
                            NewCompanyViewModel newCompanyViewModel = (NewCompanyViewModel) submitCompanyFragment.f12672p0.getValue();
                            O7.b bVar2 = new O7.b(newCompanyViewModel, String.valueOf(intValue), 4);
                            newCompanyViewModel.f12460z1 = bVar2;
                            bVar2.invoke();
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        final int i9 = 1;
        o.c(u0().f28008o, 500L, new InterfaceC0635a(this) { // from class: Y7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubmitCompanyFragment f4119b;

            {
                this.f4119b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                Integer num;
                switch (i9) {
                    case 0:
                        U4.b.g(this.f4119b).m(R.id.companiesListFragment, false);
                        break;
                    default:
                        SubmitCompanyFragment submitCompanyFragment = this.f4119b;
                        CompanyDetailsUI.CompanyUI companyUI4 = ((b) submitCompanyFragment.f12671o0.getValue()).f4120a.f11192a;
                        if (companyUI4 != null && (num = companyUI4.f11218a) != null) {
                            int intValue = num.intValue();
                            NewCompanyViewModel newCompanyViewModel = (NewCompanyViewModel) submitCompanyFragment.f12672p0.getValue();
                            O7.b bVar2 = new O7.b(newCompanyViewModel, String.valueOf(intValue), 4);
                            newCompanyViewModel.f12460z1 = bVar2;
                            bVar2.invoke();
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12670n0;
    }
}
