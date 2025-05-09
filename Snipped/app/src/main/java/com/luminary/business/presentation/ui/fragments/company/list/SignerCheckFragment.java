package com.luminary.business.presentation.ui.fragments.company.list;

import U4.b;
import Z6.e;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import androidx.camera.core.impl.j;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import b7.C0606e;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import com.sumsub.sns.internal.core.data.model.p;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.X5;
import u5.d;

/* compiled from: SignerCheckFragment.kt */
/* loaded from: classes2.dex */
public final class SignerCheckFragment extends BaseFragment<X5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11890n0 = R.layout.fragment_signer_list;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11891o0;

    /* renamed from: p0, reason: collision with root package name */
    public final int f11892p0;

    /* renamed from: q0, reason: collision with root package name */
    public CountDownTimer f11893q0;

    /* renamed from: r0, reason: collision with root package name */
    public double f11894r0;
    public final Timer s0;

    /* compiled from: Timer.kt */
    public static final class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            Integer num;
            SignerCheckFragment signerCheckFragment = SignerCheckFragment.this;
            C0606e c0606e = (C0606e) signerCheckFragment.f11891o0.getValue();
            d u6 = ((C0606e) signerCheckFragment.f11891o0.getValue()).f8376U0.u();
            e eVar = new e(c0606e, (u6 == null || (num = u6.f30237a) == null) ? 0 : num.intValue(), 2);
            c0606e.f420L0 = eVar;
            eVar.invoke();
        }
    }

    /* compiled from: SignerCheckFragment.kt */
    public static final class b extends CountDownTimer {
        public b(long j10) {
            super(j10, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            SignerCheckFragment.this.requireActivity().getOnBackPressedDispatcher().d();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            SignerCheckFragment signerCheckFragment = SignerCheckFragment.this;
            X5 u02 = signerCheckFragment.u0();
            signerCheckFragment.getClass();
            long j11 = j10 / 1000;
            long j12 = 60;
            long j13 = (j11 % 3600) / j12;
            long j14 = j11 % j12;
            u02.f28671o.setText(j13 + p.f15541a + (j14 < 10 ? j.a("0", j14) : String.valueOf(j14)));
            signerCheckFragment.u0().f28670n.setCurrentProgress(signerCheckFragment.f11894r0 - ((double) j11));
        }
    }

    /* compiled from: SignerCheckFragment.kt */
    public static final class c implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11901a;

        public c(InterfaceC0646l interfaceC0646l) {
            this.f11901a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11901a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11901a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.company.list.SignerCheckFragment$special$$inlined$viewModel$default$1] */
    public SignerCheckFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.company.list.SignerCheckFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11891o0 = E.a(this, h.a(C0606e.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.company.list.SignerCheckFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.company.list.SignerCheckFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C0606e.class), null, null, b.l(this));
            }
        });
        this.f11892p0 = 600;
        this.s0 = new Timer();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.activate_account);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.activate_account);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11894r0 = this.f11892p0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        CountDownTimer countDownTimer = this.f11893q0;
        if (countDownTimer == null) {
            countDownTimer = null;
        }
        countDownTimer.cancel();
        this.s0.cancel();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        X5 u02 = u0();
        int i = this.f11892p0;
        u02.f28670n.setMaxProgress(i);
        u0().f28670n.setProgressTextAdapter(new androidx.camera.core.impl.utils.a());
        H1.a aVar = this.f11891o0;
        ((C0606e) aVar.getValue()).f8383b1.observe(getViewLifecycleOwner(), new c(new Z3.a(9)));
        ((C0606e) aVar.getValue()).f8382a1.observe(getViewLifecycleOwner(), new c(new C7.a(this, 18)));
        this.f11893q0 = new b(i * 1000).start();
        this.s0.scheduleAtFixedRate(new a(), 0L, 10000L);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11890n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
    }
}
