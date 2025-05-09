package com.luminary.business.presentation.ui.fragments.auth.login.inreview;

import A7.c;
import F8.o;
import Fa.h;
import J6.g;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.login.inreview.InReviewFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import s5.i;
import t6.AbstractC1335f6;
import z6.C1648c;

/* compiled from: InReviewFragment.kt */
/* loaded from: classes2.dex */
public final class InReviewFragment extends BaseFragment<AbstractC1335f6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11613n0 = R.layout.fragment_sumsub_inreview;

    /* renamed from: o0, reason: collision with root package name */
    public final h f11614o0 = new h(kotlin.jvm.internal.h.a(L6.b.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.inreview.InReviewFragment$special$$inlined$navArgs$1
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
    public final H1.a f11615p0;

    /* renamed from: q0, reason: collision with root package name */
    public final H1.a f11616q0;

    /* renamed from: r0, reason: collision with root package name */
    public final b f11617r0;

    /* compiled from: InReviewFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11627a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f11627a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11627a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11627a.invoke(obj);
        }
    }

    /* compiled from: Runnable.kt */
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InReviewFragment inReviewFragment = InReviewFragment.this;
            g T02 = inReviewFragment.T0();
            h hVar = inReviewFragment.f11614o0;
            T02.j0(((L6.b) hVar.getValue()).f2495a, ((L6.b) hVar.getValue()).f2496b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.auth.login.inreview.InReviewFragment$special$$inlined$viewModel$default$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.luminary.business.presentation.ui.fragments.auth.login.inreview.InReviewFragment$special$$inlined$viewModel$default$4] */
    public InReviewFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.inreview.InReviewFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11615p0 = E.a(this, kotlin.jvm.internal.h.a(C1648c.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.inreview.InReviewFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.inreview.InReviewFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(C1648c.class), null, null, b.l(this));
            }
        });
        final ?? r03 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.inreview.InReviewFragment$special$$inlined$viewModel$default$4
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11616q0 = E.a(this, kotlin.jvm.internal.h.a(g.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.inreview.InReviewFragment$special$$inlined$viewModel$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r03.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.inreview.InReviewFragment$special$$inlined$viewModel$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r03.invoke(), kotlin.jvm.internal.h.a(g.class), null, null, b.l(this));
            }
        });
        this.f11617r0 = new b();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.a();
        ToolbarStatus toolbarStatus = ToolbarStatus.gone;
        toolbarStatus.f13268f = true;
        return toolbarStatus;
    }

    public final g T0() {
        return (g) this.f11616q0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u0().f29009o.setZOrderOnTop(true);
        u0().f29009o.start();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        u0();
        AbstractC1335f6 u02 = u0();
        o.c(u02.f29008n, 500L, new c(4, view, this));
        final int i = 0;
        ((C1648c) this.f11615p0.getValue()).f31333W0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: L6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InReviewFragment f2494b;

            {
                this.f2494b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        if (((i) obj).f26634a != null) {
                            this.f2494b.getClass();
                        }
                        return p.f3034a;
                    case 1:
                        Parcelable parcelable = (RegisterSuccessUI) obj;
                        if (parcelable != null) {
                            InReviewFragment inReviewFragment = this.f2494b;
                            inReviewFragment.T0().f2187Z0.postValue(null);
                            NavController g10 = U4.b.g(inReviewFragment);
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            if (Parcelable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                bundle2.putParcelable("userData", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                    throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                bundle2.putSerializable("userData", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_inReviewFragment_to_userBlockedFragment, bundle2);
                        }
                        return p.f3034a;
                    case 2:
                        InReviewFragment inReviewFragment2 = this.f2494b;
                        View view2 = inReviewFragment2.getView();
                        if (view2 != null) {
                            view2.postDelayed(inReviewFragment2.f11617r0, 10000L);
                        }
                        return p.f3034a;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            InReviewFragment inReviewFragment3 = this.f2494b;
                            inReviewFragment3.T0().f2188a1.postValue(null);
                            int intValue = ((Number) pair.f23090b).intValue();
                            if (intValue == 2) {
                                View view3 = inReviewFragment3.getView();
                                if (view3 != null) {
                                    view3.postDelayed(inReviewFragment3.f11617r0, 10000L);
                                }
                            } else if (intValue == 3) {
                                inReviewFragment3.T0();
                            } else if (intValue == 4) {
                                inReviewFragment3.T0();
                            } else if (intValue == 5) {
                                C1648c c1648c = (C1648c) inReviewFragment3.f11615p0.getValue();
                                g8.g gVar = new g8.g(c1648c, 27);
                                c1648c.f418J0 = gVar;
                                gVar.invoke();
                            }
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i9 = 1;
        T0().f2187Z0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: L6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InReviewFragment f2494b;

            {
                this.f2494b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        if (((i) obj).f26634a != null) {
                            this.f2494b.getClass();
                        }
                        return p.f3034a;
                    case 1:
                        Parcelable parcelable = (RegisterSuccessUI) obj;
                        if (parcelable != null) {
                            InReviewFragment inReviewFragment = this.f2494b;
                            inReviewFragment.T0().f2187Z0.postValue(null);
                            NavController g10 = U4.b.g(inReviewFragment);
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            if (Parcelable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                bundle2.putParcelable("userData", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                    throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                bundle2.putSerializable("userData", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_inReviewFragment_to_userBlockedFragment, bundle2);
                        }
                        return p.f3034a;
                    case 2:
                        InReviewFragment inReviewFragment2 = this.f2494b;
                        View view2 = inReviewFragment2.getView();
                        if (view2 != null) {
                            view2.postDelayed(inReviewFragment2.f11617r0, 10000L);
                        }
                        return p.f3034a;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            InReviewFragment inReviewFragment3 = this.f2494b;
                            inReviewFragment3.T0().f2188a1.postValue(null);
                            int intValue = ((Number) pair.f23090b).intValue();
                            if (intValue == 2) {
                                View view3 = inReviewFragment3.getView();
                                if (view3 != null) {
                                    view3.postDelayed(inReviewFragment3.f11617r0, 10000L);
                                }
                            } else if (intValue == 3) {
                                inReviewFragment3.T0();
                            } else if (intValue == 4) {
                                inReviewFragment3.T0();
                            } else if (intValue == 5) {
                                C1648c c1648c = (C1648c) inReviewFragment3.f11615p0.getValue();
                                g8.g gVar = new g8.g(c1648c, 27);
                                c1648c.f418J0 = gVar;
                                gVar.invoke();
                            }
                        }
                        return p.f3034a;
                }
            }
        }));
        g T02 = T0();
        final int i10 = 2;
        T02.f2190c1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: L6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InReviewFragment f2494b;

            {
                this.f2494b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        if (((i) obj).f26634a != null) {
                            this.f2494b.getClass();
                        }
                        return p.f3034a;
                    case 1:
                        Parcelable parcelable = (RegisterSuccessUI) obj;
                        if (parcelable != null) {
                            InReviewFragment inReviewFragment = this.f2494b;
                            inReviewFragment.T0().f2187Z0.postValue(null);
                            NavController g10 = U4.b.g(inReviewFragment);
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            if (Parcelable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                bundle2.putParcelable("userData", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                    throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                bundle2.putSerializable("userData", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_inReviewFragment_to_userBlockedFragment, bundle2);
                        }
                        return p.f3034a;
                    case 2:
                        InReviewFragment inReviewFragment2 = this.f2494b;
                        View view2 = inReviewFragment2.getView();
                        if (view2 != null) {
                            view2.postDelayed(inReviewFragment2.f11617r0, 10000L);
                        }
                        return p.f3034a;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            InReviewFragment inReviewFragment3 = this.f2494b;
                            inReviewFragment3.T0().f2188a1.postValue(null);
                            int intValue = ((Number) pair.f23090b).intValue();
                            if (intValue == 2) {
                                View view3 = inReviewFragment3.getView();
                                if (view3 != null) {
                                    view3.postDelayed(inReviewFragment3.f11617r0, 10000L);
                                }
                            } else if (intValue == 3) {
                                inReviewFragment3.T0();
                            } else if (intValue == 4) {
                                inReviewFragment3.T0();
                            } else if (intValue == 5) {
                                C1648c c1648c = (C1648c) inReviewFragment3.f11615p0.getValue();
                                g8.g gVar = new g8.g(c1648c, 27);
                                c1648c.f418J0 = gVar;
                                gVar.invoke();
                            }
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i11 = 3;
        T0().f2188a1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: L6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InReviewFragment f2494b;

            {
                this.f2494b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        if (((i) obj).f26634a != null) {
                            this.f2494b.getClass();
                        }
                        return p.f3034a;
                    case 1:
                        Parcelable parcelable = (RegisterSuccessUI) obj;
                        if (parcelable != null) {
                            InReviewFragment inReviewFragment = this.f2494b;
                            inReviewFragment.T0().f2187Z0.postValue(null);
                            NavController g10 = U4.b.g(inReviewFragment);
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            if (Parcelable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                bundle2.putParcelable("userData", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                    throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                bundle2.putSerializable("userData", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_inReviewFragment_to_userBlockedFragment, bundle2);
                        }
                        return p.f3034a;
                    case 2:
                        InReviewFragment inReviewFragment2 = this.f2494b;
                        View view2 = inReviewFragment2.getView();
                        if (view2 != null) {
                            view2.postDelayed(inReviewFragment2.f11617r0, 10000L);
                        }
                        return p.f3034a;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            InReviewFragment inReviewFragment3 = this.f2494b;
                            inReviewFragment3.T0().f2188a1.postValue(null);
                            int intValue = ((Number) pair.f23090b).intValue();
                            if (intValue == 2) {
                                View view3 = inReviewFragment3.getView();
                                if (view3 != null) {
                                    view3.postDelayed(inReviewFragment3.f11617r0, 10000L);
                                }
                            } else if (intValue == 3) {
                                inReviewFragment3.T0();
                            } else if (intValue == 4) {
                                inReviewFragment3.T0();
                            } else if (intValue == 5) {
                                C1648c c1648c = (C1648c) inReviewFragment3.f11615p0.getValue();
                                g8.g gVar = new g8.g(c1648c, 27);
                                c1648c.f418J0 = gVar;
                                gVar.invoke();
                            }
                        }
                        return p.f3034a;
                }
            }
        }));
        view.post(this.f11617r0);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11613n0;
    }
}
