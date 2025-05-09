package com.luminary.business.presentation.ui.fragments.newcompany.positionincompany;

import F8.o;
import P9.s;
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
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.positionincompany.PositionInCompanyFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.positionincompany.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import ka.C0969n;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t0.c;
import t6.C4;

/* compiled from: PositionInCompanyFragment.kt */
/* loaded from: classes2.dex */
public final class PositionInCompanyFragment extends BaseFragment<C4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12620n0 = R.layout.fragment_new_company_posistion_in_company;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12621o0;

    /* renamed from: p0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.newcompany.positionincompany.a f12622p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f12623q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f12624r0;
    public String s0;

    /* compiled from: PositionInCompanyFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12630a;

        public b(V7.a aVar) {
            this.f12630a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12630a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12630a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.positionincompany.PositionInCompanyFragment$special$$inlined$viewModel$default$1] */
    public PositionInCompanyFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.positionincompany.PositionInCompanyFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12621o0 = E.a(this, h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.positionincompany.PositionInCompanyFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.positionincompany.PositionInCompanyFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(NewCompanyViewModel.class), null, null, b.l(this));
            }
        });
        this.s0 = "";
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        getParentFragmentManager().f0("position_in_company", c.b(new Pair("company_id", this.s0)));
        return !(this instanceof CardsFragment);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.position_in_company);
        toolbarStatus.f13266d = getString(R.string.step_of, 4, 14);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.position_in_company);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final NewCompanyViewModel T0() {
        return (NewCompanyViewModel) this.f12621o0.getValue();
    }

    public final void U0() {
        boolean z10;
        String str;
        String str2;
        CreateCompanyUI createCompanyUI = T0().f12445j1;
        if (createCompanyUI == null) {
            createCompanyUI = null;
        }
        List<String> list = createCompanyUI.f11287v;
        if (list != null && !list.isEmpty() && (str = createCompanyUI.f11267a) != null && str.length() != 0) {
            String str3 = createCompanyUI.f11267a;
            if (f.b(str3 != null ? str3.toLowerCase(Locale.ROOT) : null, "Representative".toLowerCase(Locale.ROOT)) || ((str2 = createCompanyUI.f11286u) != null && str2.length() != 0)) {
                z10 = true;
                u0().f27685p.setEnabled(z10);
                u0().f27686q.setEnabled(z10);
            }
        }
        z10 = false;
        u0().f27685p.setEnabled(z10);
        u0().f27686q.setEnabled(z10);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12622p0 = a.C0135a.a(arguments);
        }
        com.luminary.business.presentation.ui.fragments.newcompany.positionincompany.a aVar = this.f12622p0;
        this.f12624r0 = aVar != null ? aVar.f12632b : false;
        if (aVar == null || (str = aVar.f12633c) == null) {
            str = "";
        }
        this.s0 = str;
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CreateCompanyUI createCompanyUI;
        super.onViewCreated(view, bundle);
        com.luminary.business.presentation.ui.fragments.newcompany.positionincompany.a aVar = this.f12622p0;
        if (aVar != null && (createCompanyUI = aVar.f12631a) != null) {
            T0().f12445j1 = createCompanyUI;
        }
        CreateCompanyUI createCompanyUI2 = T0().f12445j1;
        if (createCompanyUI2 == null) {
            createCompanyUI2 = null;
        }
        if (createCompanyUI2.f11287v == null) {
            u0().f27688s.setText("Director");
            CreateCompanyUI createCompanyUI3 = T0().f12445j1;
            if (createCompanyUI3 == null) {
                createCompanyUI3 = null;
            }
            createCompanyUI3.f11287v = Collections.singletonList("Director");
        } else {
            C4 u02 = u0();
            CreateCompanyUI createCompanyUI4 = T0().f12445j1;
            if (createCompanyUI4 == null) {
                createCompanyUI4 = null;
            }
            List<String> list = createCompanyUI4.f11287v;
            u02.f27688s.setText(list != null ? s.P(list, ", ", null, null, null, 62) : null);
        }
        C4 u03 = u0();
        CreateCompanyUI createCompanyUI5 = T0().f12445j1;
        if (createCompanyUI5 == null) {
            createCompanyUI5 = null;
        }
        u03.f27684o.setText(createCompanyUI5.f11267a);
        C4 u04 = u0();
        CreateCompanyUI createCompanyUI6 = T0().f12445j1;
        if (createCompanyUI6 == null) {
            createCompanyUI6 = null;
        }
        u04.f27691v.setText(createCompanyUI6.f11286u);
        u0().f27687r.setHint(getString(R.string.my_positions));
        u0().f27683n.setHint(getString(R.string.my_beneficiary_type));
        E.b(this, "additional_information", new B6.h(this, 13));
        T0().n1.observe(getViewLifecycleOwner(), new b(new V7.a(this, 0)));
        if (this.f12624r0 && this.s0.length() > 0) {
            String str = this.s0;
            NewCompanyViewModel T02 = T0();
            O7.b bVar = new O7.b(T02, str, 2);
            T02.f12421A1 = bVar;
            bVar.invoke();
        }
        final int i = 0;
        o.c(u0().f27688s, 500L, new InterfaceC0635a(this) { // from class: V7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PositionInCompanyFragment f3750b;

            {
                this.f3750b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
            @Override // ca.InterfaceC0635a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instructions count: 460
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: V7.b.invoke():java.lang.Object");
            }
        });
        final int i9 = 1;
        o.c(u0().f27684o, 500L, new InterfaceC0635a(this) { // from class: V7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PositionInCompanyFragment f3750b;

            {
                this.f3750b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 460
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: V7.b.invoke():java.lang.Object");
            }
        });
        u0().f27691v.addTextChangedListener(new a());
        final int i10 = 2;
        o.c(u0().f27685p, 500L, new InterfaceC0635a(this) { // from class: V7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PositionInCompanyFragment f3750b;

            {
                this.f3750b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 460
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: V7.b.invoke():java.lang.Object");
            }
        });
        final int i11 = 3;
        o.c(u0().f27686q, 500L, new InterfaceC0635a(this) { // from class: V7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PositionInCompanyFragment f3750b;

            {
                this.f3750b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 460
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: V7.b.invoke():java.lang.Object");
            }
        });
        CreateCompanyUI createCompanyUI7 = T0().f12445j1;
        if (createCompanyUI7 == null) {
            createCompanyUI7 = null;
        }
        String str2 = createCompanyUI7.f11267a;
        if (!f.b(str2 != null ? str2.toLowerCase(Locale.ROOT) : null, "ubo")) {
            CreateCompanyUI createCompanyUI8 = T0().f12445j1;
            if (createCompanyUI8 == null) {
                createCompanyUI8 = null;
            }
            String str3 = createCompanyUI8.f11267a;
            if (!f.b(str3 != null ? str3.toLowerCase(Locale.ROOT) : null, "shareholder")) {
                o.b(u0().f27690u);
                o.b(u0().f27689t);
                U0();
            }
        }
        u0().f27690u.setVisibility(0);
        u0().f27689t.setVisibility(0);
        U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12620n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f27685p.setVisibility(0);
        o.b(u0().f27686q);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f27685p);
        u0().f27686q.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            CharSequence u02 = charSequence != null ? C0969n.u0(charSequence) : null;
            if (u02 == null || u02.length() == 0) {
                return;
            }
            float parseFloat = Float.parseFloat(D9.b.r0(charSequence.toString()));
            if (parseFloat < 0.0f || parseFloat > 100.0f) {
                parseFloat = 25.0f;
            }
            PositionInCompanyFragment positionInCompanyFragment = PositionInCompanyFragment.this;
            CreateCompanyUI createCompanyUI = positionInCompanyFragment.T0().f12445j1;
            (createCompanyUI != null ? createCompanyUI : null).f11286u = String.format(Locale.UK, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(parseFloat)}, 1));
            positionInCompanyFragment.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
