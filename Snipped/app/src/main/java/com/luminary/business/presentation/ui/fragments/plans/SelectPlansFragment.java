package com.luminary.business.presentation.ui.fragments.plans;

import O9.p;
import P9.n;
import P9.s;
import U4.b;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.Carousel;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.List;
import k8.C0953b;
import k8.C0954c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import s6.Y;
import s6.Z;
import t6.I5;

/* compiled from: SelectPlansFragment.kt */
/* loaded from: classes2.dex */
public final class SelectPlansFragment extends BaseFragment<I5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12963n0 = R.layout.fragment_select_plans;

    /* renamed from: o0, reason: collision with root package name */
    public int f12964o0 = -1;

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f12965p0;

    /* renamed from: q0, reason: collision with root package name */
    public C0954c f12966q0;

    /* compiled from: SelectPlansFragment.kt */
    public final class a extends B {

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC0646l<Integer, p> f12971f;

        public a(C0954c c0954c) {
            this.f12971f = c0954c;
        }

        @Override // androidx.recyclerview.widget.B, androidx.recyclerview.widget.M
        public final View d(RecyclerView.n nVar) {
            View d10 = super.d(nVar);
            if (d10 != null) {
                int position = nVar.getPosition(d10);
                InterfaceC0646l<Integer, p> interfaceC0646l = this.f12971f;
                SelectPlansFragment selectPlansFragment = SelectPlansFragment.this;
                if (position == 0) {
                    interfaceC0646l.invoke(1);
                    selectPlansFragment.f12964o0 = 1;
                } else if (position != selectPlansFragment.f12964o0) {
                    interfaceC0646l.invoke(Integer.valueOf(position));
                    selectPlansFragment.f12964o0 = position;
                }
            }
            return d10;
        }
    }

    /* compiled from: SelectPlansFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12973a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f12973a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12973a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12973a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.plans.SelectPlansFragment$special$$inlined$viewModel$default$1] */
    public SelectPlansFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.plans.SelectPlansFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12965p0 = E.a(this, h.a(C0953b.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.plans.SelectPlansFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.plans.SelectPlansFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C0953b.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 28;
        toolbarStatus.f13263a = getString(R.string.my_plan);
        toolbarStatus.f13268f = true;
        return toolbarStatus;
    }

    public final ArrayList T0(List list) {
        ArrayList arrayList;
        String str;
        List<C5.a> X = s.X(s.X(list, new A7.d(11)), new A7.d(12));
        ArrayList arrayList2 = new ArrayList(n.u(X, 10));
        for (C5.a aVar : X) {
            List<C5.b> list2 = aVar.f668e;
            Integer num = aVar.f664a;
            if (list2 != null) {
                List<C5.b> list3 = list2;
                arrayList = new ArrayList(n.u(list3, 10));
                for (C5.b bVar : list3) {
                    Z z10 = new Z();
                    z10.a("plan_basic_" + num + "_" + bVar.f673a);
                    z10.onMutation();
                    z10.f26762a = bVar.f673a;
                    Integer X10 = D9.b.X(bVar);
                    z10.onMutation();
                    z10.f26763b = X10;
                    z10.onMutation();
                    z10.f26764c = bVar.f674b;
                    Integer E8 = D9.b.E(bVar);
                    z10.onMutation();
                    z10.f26765d = E8;
                    arrayList.add(z10);
                }
            } else {
                arrayList = null;
            }
            Y y10 = new Y();
            y10.a("plan_basic_" + num);
            C5.b bVar2 = aVar.f666c;
            Integer valueOf = (bVar2 == null || (str = bVar2.f675c) == null) ? null : Integer.valueOf(D9.b.D0(str, 1.0f));
            y10.onMutation();
            y10.f26750a = valueOf;
            String str2 = bVar2 != null ? bVar2.f673a : null;
            y10.onMutation();
            y10.f26751b = str2;
            Integer X11 = bVar2 != null ? D9.b.X(bVar2) : null;
            y10.onMutation();
            y10.f26752c = X11;
            String str3 = bVar2 != null ? bVar2.f674b : null;
            y10.onMutation();
            y10.f26753d = str3;
            Integer E10 = bVar2 != null ? D9.b.E(bVar2) : null;
            y10.onMutation();
            y10.f26754e = E10;
            C5.b bVar3 = aVar.f667d;
            String str4 = bVar3 != null ? bVar3.f673a : null;
            y10.onMutation();
            y10.f26755f = str4;
            Integer X12 = bVar3 != null ? D9.b.X(bVar3) : null;
            y10.onMutation();
            y10.f26756g = X12;
            String str5 = bVar3 != null ? bVar3.f674b : null;
            y10.onMutation();
            y10.f26757h = str5;
            Integer E11 = bVar3 != null ? D9.b.E(bVar3) : null;
            y10.onMutation();
            y10.i = E11;
            C6.a aVar2 = arrayList != null ? new C6.a(arrayList) : null;
            y10.onMutation();
            y10.f26758j = aVar2;
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = aVar.i;
            Boolean valueOf2 = Boolean.valueOf(f.b(bool2, bool));
            y10.onMutation();
            y10.f26760l = valueOf2;
            Context requireContext = requireContext();
            String string = f.b(bool2, bool) ? requireContext.getString(R.string.current_plan) : requireContext.getString(R.string.activate_plan, bVar2 != null ? bVar2.f673a : null);
            y10.onMutation();
            y10.f26759k = string;
            B7.f fVar = new B7.f(24, aVar, this);
            y10.onMutation();
            y10.f26761m = fVar;
            arrayList2.add(y10);
        }
        return arrayList2;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H1.a aVar = this.f12965p0;
        ((C0953b) aVar.getValue()).f23048W0.observe(getViewLifecycleOwner(), new b(new C0954c(this, 0)));
        C0953b c0953b = (C0953b) aVar.getValue();
        c0953b.f23049X0.observe(getViewLifecycleOwner(), new b(new C0954c(this, 1)));
        this.f12966q0 = new C0954c(this, 2);
        a aVar2 = new a(new C0954c(this, 3));
        Carousel carousel = u0().f28013n;
        carousel.setSaveEnabled(true);
        carousel.setLayoutManager(new LinearLayoutManager(carousel.getContext(), 0, false));
        carousel.setModels(T0(EmptyList.f23104a));
        carousel.setOnFlingListener(null);
        aVar2.a(carousel);
        carousel.setPaddingDp(16);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12963n0;
    }
}
