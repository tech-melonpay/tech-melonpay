package com.luminary.business.presentation.ui.fragments.newpayment.signer;

import Fa.h;
import U4.b;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.payment.SignerUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import com.sumsub.sns.internal.core.data.model.p;
import f8.C0752a;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import t6.AbstractC1383l6;
import t8.j;

/* compiled from: SignerFragment.kt */
/* loaded from: classes2.dex */
public final class SignerFragment extends BaseFragment<AbstractC1383l6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12817n0 = R.layout.fragment_timer;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12818o0;

    /* renamed from: p0, reason: collision with root package name */
    public final h f12819p0;

    /* renamed from: q0, reason: collision with root package name */
    public SignerUI f12820q0;

    /* renamed from: r0, reason: collision with root package name */
    public CountDownTimer f12821r0;
    public double s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Timer f12822t0;

    /* compiled from: Timer.kt */
    public static final class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            SignerFragment signerFragment = SignerFragment.this;
            j jVar = (j) signerFragment.f12818o0.getValue();
            SignerUI signerUI = signerFragment.f12820q0;
            if (signerUI == null) {
                signerUI = null;
            }
            A7.c cVar = new A7.c(23, jVar, String.valueOf(signerUI.f11356a));
            jVar.f418J0 = cVar;
            cVar.invoke();
        }
    }

    /* compiled from: SignerFragment.kt */
    public static final class b extends CountDownTimer {
        public b(long j10) {
            super(j10, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            Bundle b9 = t0.c.b(new Pair("signer_status", "PSI_REJECTED"));
            SignerFragment signerFragment = SignerFragment.this;
            signerFragment.getParentFragmentManager().f0("signer", b9);
            signerFragment.requireActivity().getOnBackPressedDispatcher().d();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            SignerFragment signerFragment = SignerFragment.this;
            AbstractC1383l6 u02 = signerFragment.u0();
            signerFragment.getClass();
            long j11 = j10 / 1000;
            long j12 = 60;
            long j13 = (j11 % 3600) / j12;
            long j14 = j11 % j12;
            u02.f29266p.setText(j13 + p.f15541a + (j14 < 10 ? androidx.camera.core.impl.j.a("0", j14) : String.valueOf(j14)));
            signerFragment.u0().f29264n.setCurrentProgress(signerFragment.s0 - ((double) j11));
        }
    }

    /* compiled from: SignerFragment.kt */
    public static final class c implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12830a;

        public c(C7.a aVar) {
            this.f12830a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12830a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12830a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newpayment.signer.SignerFragment$special$$inlined$viewModel$default$1] */
    public SignerFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.signer.SignerFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12818o0 = E.a(this, kotlin.jvm.internal.h.a(j.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.signer.SignerFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.signer.SignerFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(j.class), null, null, b.l(this));
            }
        });
        this.f12819p0 = new h(kotlin.jvm.internal.h.a(C0752a.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.signer.SignerFragment$special$$inlined$navArgs$1
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
        new ArrayList();
        this.f12822t0 = new Timer();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.approve_payment);
        toolbarStatus.f13267e = true;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.approve_payment);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SignerUI signerUI = ((C0752a) this.f12819p0.getValue()).f20716a;
        this.f12820q0 = signerUI;
        if (signerUI == null) {
            signerUI = null;
        }
        this.s0 = signerUI.f11359d != null ? r3.intValue() : 0.0d;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        CountDownTimer countDownTimer = this.f12821r0;
        if (countDownTimer == null) {
            countDownTimer = null;
        }
        countDownTimer.cancel();
        this.f12822t0.cancel();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC1383l6 u02 = u0();
        SignerUI signerUI = this.f12820q0;
        if (signerUI == null) {
            signerUI = null;
        }
        u02.f29264n.setMaxProgress(signerUI.f11359d != null ? r8.intValue() : 0);
        u0().f29264n.setProgressTextAdapter(new androidx.camera.core.impl.utils.a());
        ((j) this.f12818o0.getValue()).f29964a1.observe(getViewLifecycleOwner(), new c(new C7.a(this, 20)));
        AbstractC1383l6 u03 = u0();
        SignerUI signerUI2 = this.f12820q0;
        u03.f29265o.setText((signerUI2 != null ? signerUI2 : null).f11358c);
        this.f12821r0 = new b((((C0752a) this.f12819p0.getValue()).f20716a.f11359d != null ? r7.intValue() : 0) * 1000).start();
        this.f12822t0.schedule(new a(), 0L, 10000L);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12817n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
    }
}
