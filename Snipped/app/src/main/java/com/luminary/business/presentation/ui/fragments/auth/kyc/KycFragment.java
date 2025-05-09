package com.luminary.business.presentation.ui.fragments.auth.kyc;

import F8.o;
import Fa.h;
import I5.k;
import I6.c;
import I6.e;
import J5.b;
import M6.l;
import M6.w;
import O9.f;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.kyc.KycFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.business.presentation.utils.kyc.KycStatus;
import com.luminary.mobile.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.d;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import s5.i;
import t6.AbstractC1341g4;

/* compiled from: KycFragment.kt */
/* loaded from: classes2.dex */
public final class KycFragment extends BaseFragment<AbstractC1341g4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11576n0 = R.layout.fragment_kyc;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11577o0;

    /* renamed from: p0, reason: collision with root package name */
    public final f f11578p0;

    /* renamed from: q0, reason: collision with root package name */
    public final h f11579q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f11580r0;

    /* compiled from: KycFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11588a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f11588a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11588a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11588a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.kyc.KycFragment$special$$inlined$viewModel$default$1] */
    public KycFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.kyc.KycFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11577o0 = E.a(this, kotlin.jvm.internal.h.a(w.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.kyc.KycFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.kyc.KycFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(w.class), null, null, b.l(this));
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23085a;
        kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<I8.a>() { // from class: com.luminary.business.presentation.ui.fragments.auth.kyc.KycFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [I8.a, java.lang.Object] */
            @Override // ca.InterfaceC0635a
            public final I8.a invoke() {
                return b.l(this).a(null, null, kotlin.jvm.internal.h.a(I8.a.class));
            }
        });
        this.f11578p0 = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<I8.b>() { // from class: com.luminary.business.presentation.ui.fragments.auth.kyc.KycFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [I8.b, java.lang.Object] */
            @Override // ca.InterfaceC0635a
            public final I8.b invoke() {
                return b.l(this).a(null, null, kotlin.jvm.internal.h.a(I8.b.class));
            }
        });
        this.f11579q0 = new h(kotlin.jvm.internal.h.a(I6.d.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.auth.kyc.KycFragment$special$$inlined$navArgs$1
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
                throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", fragment, " has null arguments"));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.kyc);
        toolbarStatus.f13266d = getString(R.string.step_of, 5, 6);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13267e = true;
        return toolbarStatus;
    }

    public final void T0() {
        u0().f1148d.postDelayed(new c(this, 0), 5000L);
        this.f11580r0++;
    }

    public final w U0() {
        return (w) this.f11577o0.getValue();
    }

    public final void V0() {
        NavController g10 = b.g(this);
        h hVar = this.f11579q0;
        g10.j(new e(((I6.d) hVar.getValue()).f1890d, ((I6.d) hVar.getValue()).f1887a, ((I6.d) hVar.getValue()).f1888b, ((I6.d) hVar.getValue()).f1889c));
        u0().f29027n.setEnabled(true);
    }

    public final void W0() {
        u0().f29027n.setEnabled(false);
        BottomDialogType.a aVar = BottomDialogType.f13289k;
        requireContext();
        aVar.getClass();
        BottomDialogType d10 = BottomDialogType.a.d();
        d10.f13300f = Integer.valueOf(R.drawable.ic_prepare_id);
        d10.f13295a = getString(R.string.prepare_your_id);
        d10.f13297c = getString(R.string.continue_btn);
        d10.f13298d = Integer.valueOf(R.drawable.button_bg);
        d10.f13301g = null;
        w0().c(d10, new I6.b(this, 2), null);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        U0().f2712m1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: I6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycFragment f1882b;

            {
                this.f1882b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [com.luminary.business.presentation.ui.fragments.auth.kyc.a] */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        String str = ((i) obj).f26634a;
                        if (str != null) {
                            final KycFragment kycFragment = this.f1882b;
                            ((MainActivity) kycFragment.requireActivity()).f11418z = true;
                            ((I8.b) kycFragment.f11578p0.getValue()).a(kycFragment.requireActivity(), str, new InterfaceC0646l() { // from class: com.luminary.business.presentation.ui.fragments.auth.kyc.a
                                @Override // ca.InterfaceC0646l
                                public final Object invoke(Object obj2) {
                                    int ordinal = ((KycStatus) obj2).ordinal();
                                    KycFragment kycFragment2 = KycFragment.this;
                                    if (ordinal == 0) {
                                        AbstractC1341g4 u02 = kycFragment2.u0();
                                        u02.f29027n.postDelayed(new c(kycFragment2, 1), 500L);
                                    } else if (ordinal == 1) {
                                        BaseFragment.P0(kycFragment2, "Something wrong");
                                        kycFragment2.f11580r0 = 0;
                                        kycFragment2.u0().f29027n.setEnabled(true);
                                        if (kycFragment2.getView() != null) {
                                            ((MainActivity) kycFragment2.requireActivity()).f11418z = false;
                                            BuildersKt__Builders_commonKt.launch$default(C0552s.a(kycFragment2.getViewLifecycleOwner()), Dispatchers.getMain(), null, new KycFragment$initilizeSumSub$1$2(kycFragment2, null), 2, null);
                                        }
                                    }
                                    return p.f3034a;
                                }
                            });
                        }
                        break;
                    case 1:
                        KycFragment kycFragment2 = this.f1882b;
                        new b.c(kycFragment2.getString(R.string.error));
                        kycFragment2.u0().f29027n.setEnabled(true);
                        break;
                    case 2:
                        boolean b9 = kotlin.jvm.internal.f.b(((k) obj).f1822e0, "APPLICANT_CREATED");
                        KycFragment kycFragment3 = this.f1882b;
                        if (b9) {
                            w U02 = kycFragment3.U0();
                            l lVar = new l(U02, 0);
                            U02.f423P0 = lVar;
                            lVar.invoke();
                        } else if (kycFragment3.f11580r0 > 11) {
                            kycFragment3.u0().f29027n.setEnabled(false);
                            BottomDialogType.f13289k.getClass();
                            BottomDialogType c2 = BottomDialogType.a.c();
                            c2.f13295a = kycFragment3.getString(R.string.something_went_wrong);
                            c2.f13297c = kycFragment3.getString(R.string.contact_support);
                            c2.f13299e = kycFragment3.getString(R.string.back);
                            c2.f13298d = Integer.valueOf(R.drawable.button_bg);
                            c2.f13301g = BottomDialogType.Type.ERROR;
                            kycFragment3.w0().c(c2, new b(kycFragment3, 1), null);
                        } else {
                            kycFragment3.T0();
                        }
                        break;
                    default:
                        this.f1882b.V0();
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i9 = 1;
        U0().f2719u1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: I6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycFragment f1882b;

            {
                this.f1882b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [com.luminary.business.presentation.ui.fragments.auth.kyc.a] */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        String str = ((i) obj).f26634a;
                        if (str != null) {
                            final KycFragment kycFragment = this.f1882b;
                            ((MainActivity) kycFragment.requireActivity()).f11418z = true;
                            ((I8.b) kycFragment.f11578p0.getValue()).a(kycFragment.requireActivity(), str, new InterfaceC0646l() { // from class: com.luminary.business.presentation.ui.fragments.auth.kyc.a
                                @Override // ca.InterfaceC0646l
                                public final Object invoke(Object obj2) {
                                    int ordinal = ((KycStatus) obj2).ordinal();
                                    KycFragment kycFragment2 = KycFragment.this;
                                    if (ordinal == 0) {
                                        AbstractC1341g4 u02 = kycFragment2.u0();
                                        u02.f29027n.postDelayed(new c(kycFragment2, 1), 500L);
                                    } else if (ordinal == 1) {
                                        BaseFragment.P0(kycFragment2, "Something wrong");
                                        kycFragment2.f11580r0 = 0;
                                        kycFragment2.u0().f29027n.setEnabled(true);
                                        if (kycFragment2.getView() != null) {
                                            ((MainActivity) kycFragment2.requireActivity()).f11418z = false;
                                            BuildersKt__Builders_commonKt.launch$default(C0552s.a(kycFragment2.getViewLifecycleOwner()), Dispatchers.getMain(), null, new KycFragment$initilizeSumSub$1$2(kycFragment2, null), 2, null);
                                        }
                                    }
                                    return p.f3034a;
                                }
                            });
                        }
                        break;
                    case 1:
                        KycFragment kycFragment2 = this.f1882b;
                        new b.c(kycFragment2.getString(R.string.error));
                        kycFragment2.u0().f29027n.setEnabled(true);
                        break;
                    case 2:
                        boolean b9 = kotlin.jvm.internal.f.b(((k) obj).f1822e0, "APPLICANT_CREATED");
                        KycFragment kycFragment3 = this.f1882b;
                        if (b9) {
                            w U02 = kycFragment3.U0();
                            l lVar = new l(U02, 0);
                            U02.f423P0 = lVar;
                            lVar.invoke();
                        } else if (kycFragment3.f11580r0 > 11) {
                            kycFragment3.u0().f29027n.setEnabled(false);
                            BottomDialogType.f13289k.getClass();
                            BottomDialogType c2 = BottomDialogType.a.c();
                            c2.f13295a = kycFragment3.getString(R.string.something_went_wrong);
                            c2.f13297c = kycFragment3.getString(R.string.contact_support);
                            c2.f13299e = kycFragment3.getString(R.string.back);
                            c2.f13298d = Integer.valueOf(R.drawable.button_bg);
                            c2.f13301g = BottomDialogType.Type.ERROR;
                            kycFragment3.w0().c(c2, new b(kycFragment3, 1), null);
                        } else {
                            kycFragment3.T0();
                        }
                        break;
                    default:
                        this.f1882b.V0();
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 2;
        U0().f2713o1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: I6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycFragment f1882b;

            {
                this.f1882b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [com.luminary.business.presentation.ui.fragments.auth.kyc.a] */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        String str = ((i) obj).f26634a;
                        if (str != null) {
                            final KycFragment kycFragment = this.f1882b;
                            ((MainActivity) kycFragment.requireActivity()).f11418z = true;
                            ((I8.b) kycFragment.f11578p0.getValue()).a(kycFragment.requireActivity(), str, new InterfaceC0646l() { // from class: com.luminary.business.presentation.ui.fragments.auth.kyc.a
                                @Override // ca.InterfaceC0646l
                                public final Object invoke(Object obj2) {
                                    int ordinal = ((KycStatus) obj2).ordinal();
                                    KycFragment kycFragment2 = KycFragment.this;
                                    if (ordinal == 0) {
                                        AbstractC1341g4 u02 = kycFragment2.u0();
                                        u02.f29027n.postDelayed(new c(kycFragment2, 1), 500L);
                                    } else if (ordinal == 1) {
                                        BaseFragment.P0(kycFragment2, "Something wrong");
                                        kycFragment2.f11580r0 = 0;
                                        kycFragment2.u0().f29027n.setEnabled(true);
                                        if (kycFragment2.getView() != null) {
                                            ((MainActivity) kycFragment2.requireActivity()).f11418z = false;
                                            BuildersKt__Builders_commonKt.launch$default(C0552s.a(kycFragment2.getViewLifecycleOwner()), Dispatchers.getMain(), null, new KycFragment$initilizeSumSub$1$2(kycFragment2, null), 2, null);
                                        }
                                    }
                                    return p.f3034a;
                                }
                            });
                        }
                        break;
                    case 1:
                        KycFragment kycFragment2 = this.f1882b;
                        new b.c(kycFragment2.getString(R.string.error));
                        kycFragment2.u0().f29027n.setEnabled(true);
                        break;
                    case 2:
                        boolean b9 = kotlin.jvm.internal.f.b(((k) obj).f1822e0, "APPLICANT_CREATED");
                        KycFragment kycFragment3 = this.f1882b;
                        if (b9) {
                            w U02 = kycFragment3.U0();
                            l lVar = new l(U02, 0);
                            U02.f423P0 = lVar;
                            lVar.invoke();
                        } else if (kycFragment3.f11580r0 > 11) {
                            kycFragment3.u0().f29027n.setEnabled(false);
                            BottomDialogType.f13289k.getClass();
                            BottomDialogType c2 = BottomDialogType.a.c();
                            c2.f13295a = kycFragment3.getString(R.string.something_went_wrong);
                            c2.f13297c = kycFragment3.getString(R.string.contact_support);
                            c2.f13299e = kycFragment3.getString(R.string.back);
                            c2.f13298d = Integer.valueOf(R.drawable.button_bg);
                            c2.f13301g = BottomDialogType.Type.ERROR;
                            kycFragment3.w0().c(c2, new b(kycFragment3, 1), null);
                        } else {
                            kycFragment3.T0();
                        }
                        break;
                    default:
                        this.f1882b.V0();
                        break;
                }
                return p.f3034a;
            }
        }));
        w U02 = U0();
        final int i11 = 3;
        U02.f2716r1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: I6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycFragment f1882b;

            {
                this.f1882b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [com.luminary.business.presentation.ui.fragments.auth.kyc.a] */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        String str = ((i) obj).f26634a;
                        if (str != null) {
                            final KycFragment kycFragment = this.f1882b;
                            ((MainActivity) kycFragment.requireActivity()).f11418z = true;
                            ((I8.b) kycFragment.f11578p0.getValue()).a(kycFragment.requireActivity(), str, new InterfaceC0646l() { // from class: com.luminary.business.presentation.ui.fragments.auth.kyc.a
                                @Override // ca.InterfaceC0646l
                                public final Object invoke(Object obj2) {
                                    int ordinal = ((KycStatus) obj2).ordinal();
                                    KycFragment kycFragment2 = KycFragment.this;
                                    if (ordinal == 0) {
                                        AbstractC1341g4 u02 = kycFragment2.u0();
                                        u02.f29027n.postDelayed(new c(kycFragment2, 1), 500L);
                                    } else if (ordinal == 1) {
                                        BaseFragment.P0(kycFragment2, "Something wrong");
                                        kycFragment2.f11580r0 = 0;
                                        kycFragment2.u0().f29027n.setEnabled(true);
                                        if (kycFragment2.getView() != null) {
                                            ((MainActivity) kycFragment2.requireActivity()).f11418z = false;
                                            BuildersKt__Builders_commonKt.launch$default(C0552s.a(kycFragment2.getViewLifecycleOwner()), Dispatchers.getMain(), null, new KycFragment$initilizeSumSub$1$2(kycFragment2, null), 2, null);
                                        }
                                    }
                                    return p.f3034a;
                                }
                            });
                        }
                        break;
                    case 1:
                        KycFragment kycFragment2 = this.f1882b;
                        new b.c(kycFragment2.getString(R.string.error));
                        kycFragment2.u0().f29027n.setEnabled(true);
                        break;
                    case 2:
                        boolean b9 = kotlin.jvm.internal.f.b(((k) obj).f1822e0, "APPLICANT_CREATED");
                        KycFragment kycFragment3 = this.f1882b;
                        if (b9) {
                            w U022 = kycFragment3.U0();
                            l lVar = new l(U022, 0);
                            U022.f423P0 = lVar;
                            lVar.invoke();
                        } else if (kycFragment3.f11580r0 > 11) {
                            kycFragment3.u0().f29027n.setEnabled(false);
                            BottomDialogType.f13289k.getClass();
                            BottomDialogType c2 = BottomDialogType.a.c();
                            c2.f13295a = kycFragment3.getString(R.string.something_went_wrong);
                            c2.f13297c = kycFragment3.getString(R.string.contact_support);
                            c2.f13299e = kycFragment3.getString(R.string.back);
                            c2.f13298d = Integer.valueOf(R.drawable.button_bg);
                            c2.f13301g = BottomDialogType.Type.ERROR;
                            kycFragment3.w0().c(c2, new b(kycFragment3, 1), null);
                        } else {
                            kycFragment3.T0();
                        }
                        break;
                    default:
                        this.f1882b.V0();
                        break;
                }
                return p.f3034a;
            }
        }));
        AbstractC1341g4 u02 = u0();
        o.c(u02.f29027n, 500L, new I6.b(this, 0));
        W0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11576n0;
    }
}
