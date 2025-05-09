package com.luminary.business.presentation.ui.fragments.auth.register.country;

import A8.e;
import Fa.h;
import M6.w;
import O9.p;
import P9.s;
import U4.b;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectController;
import com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import t0.c;
import t6.AbstractC1404o3;
import u5.f;

/* compiled from: CountrySelectFragment.kt */
/* loaded from: classes2.dex */
public final class CountrySelectFragment extends BaseFragment<AbstractC1404o3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11683n0 = R.layout.fragment_country;

    /* renamed from: o0, reason: collision with root package name */
    public CountrySelectController f11684o0;

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f11685p0;

    /* renamed from: q0, reason: collision with root package name */
    public final h f11686q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f11687r0;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return R9.a.a(((f) t3).f30275b, ((f) t10).f30275b);
        }
    }

    /* compiled from: CountrySelectFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11693a;

        public b(N6.a aVar) {
            this.f11693a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11693a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11693a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectFragment$special$$inlined$viewModel$default$1] */
    public CountrySelectFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11685p0 = E.a(this, kotlin.jvm.internal.h.a(w.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(w.class), null, null, b.l(this));
            }
        });
        this.f11686q0 = new h(kotlin.jvm.internal.h.a(N6.b.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectFragment$special$$inlined$navArgs$1
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
        this.f11687r0 = "";
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.country);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 28;
        toolbarStatus.i = new e(Integer.valueOf(R.drawable.ic_search), null, null, false, null, null, null, new A8.b(this, 5), 124);
        toolbarStatus.f13273l = new c();
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.country);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f11687r0.length() > 0) {
            I0(this.f11687r0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [N6.a] */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H1.a aVar = this.f11685p0;
        w wVar = (w) aVar.getValue();
        h hVar = this.f11686q0;
        wVar.m(((N6.b) hVar.getValue()).f2849a);
        final int i = 0;
        this.f11684o0 = new CountrySelectController(requireContext(), ((N6.b) hVar.getValue()).f2849a, new InterfaceC0646l(this) { // from class: N6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountrySelectFragment f2848b;

            {
                this.f2848b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        f fVar = (f) obj;
                        CountrySelectFragment countrySelectFragment = this.f2848b;
                        countrySelectFragment.getParentFragmentManager().f0("country", c.b(new Pair("selected_country", ((b) countrySelectFragment.f11686q0.getValue()).f2849a ? fVar.f30280g : fVar.f30275b), new Pair("selected_country_code", fVar.f30279f), new Pair("field", ((b) countrySelectFragment.f11686q0.getValue()).f2850b)));
                        countrySelectFragment.requireActivity().getOnBackPressedDispatcher().d();
                        break;
                    default:
                        List list = (List) obj;
                        CountrySelectController countrySelectController = this.f2848b.f11684o0;
                        if (countrySelectController == null) {
                            countrySelectController = null;
                        }
                        countrySelectController.setData(s.X(list, new CountrySelectFragment.a()));
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1404o3 u02 = u0();
        CountrySelectController countrySelectController = this.f11684o0;
        if (countrySelectController == null) {
            countrySelectController = null;
        }
        u02.f29426n.setAdapter(countrySelectController.getAdapter());
        final int i9 = 1;
        ((w) aVar.getValue()).f2714p1.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: N6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountrySelectFragment f2848b;

            {
                this.f2848b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        f fVar = (f) obj;
                        CountrySelectFragment countrySelectFragment = this.f2848b;
                        countrySelectFragment.getParentFragmentManager().f0("country", c.b(new Pair("selected_country", ((b) countrySelectFragment.f11686q0.getValue()).f2849a ? fVar.f30280g : fVar.f30275b), new Pair("selected_country_code", fVar.f30279f), new Pair("field", ((b) countrySelectFragment.f11686q0.getValue()).f2850b)));
                        countrySelectFragment.requireActivity().getOnBackPressedDispatcher().d();
                        break;
                    default:
                        List list = (List) obj;
                        CountrySelectController countrySelectController2 = this.f2848b.f11684o0;
                        if (countrySelectController2 == null) {
                            countrySelectController2 = null;
                        }
                        countrySelectController2.setData(s.X(list, new CountrySelectFragment.a()));
                        break;
                }
                return p.f3034a;
            }
        }));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11683n0;
    }

    /* compiled from: CountrySelectFragment.kt */
    public static final class c implements A8.d {

        /* compiled from: Comparisons.kt */
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return R9.a.a(((f) t3).f30275b, ((f) t10).f30275b);
            }
        }

        public c() {
        }

        @Override // A8.d
        public final void b() {
            ActivityC0533g activity;
            CountrySelectFragment countrySelectFragment = CountrySelectFragment.this;
            View view = countrySelectFragment.getView();
            if (view == null || (activity = countrySelectFragment.getActivity()) == null) {
                return;
            }
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        
            if (r8 == null) goto L17;
         */
        @Override // A8.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(java.lang.String r8) {
            /*
                r7 = this;
                com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectFragment r0 = com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectFragment.this
                r0.f11687r0 = r8
                com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectController r1 = r0.f11684o0
                if (r1 != 0) goto L9
                r1 = 0
            L9:
                H1.a r0 = r0.f11685p0
                java.lang.Object r0 = r0.getValue()
                M6.w r0 = (M6.w) r0
                androidx.lifecycle.z<java.util.List<u5.f>> r0 = r0.f2714p1
                java.lang.Object r0 = r0.getValue()
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L57
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            L26:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L4c
                java.lang.Object r3 = r0.next()
                r4 = r3
                u5.f r4 = (u5.f) r4
                java.lang.String r4 = r4.f30275b
                if (r4 == 0) goto L26
                java.util.Locale r5 = java.util.Locale.ROOT
                java.lang.String r4 = r4.toLowerCase(r5)
                java.lang.String r5 = r8.toLowerCase(r5)
                r6 = 0
                boolean r4 = ka.C0969n.Y(r4, r5, r6)
                if (r4 == 0) goto L26
                r2.add(r3)
                goto L26
            L4c:
                com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectFragment$c$a r8 = new com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectFragment$c$a
                r8.<init>()
                java.util.List r8 = P9.s.X(r2, r8)
                if (r8 != 0) goto L5c
            L57:
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
            L5c:
                r1.setData(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectFragment.c.c(java.lang.String):void");
        }

        @Override // A8.d
        public final void a() {
        }
    }
}
