package com.luminary.business.presentation.ui.fragments.tfa;

import F8.o;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.tfa.TfaFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import g8.g;
import kotlin.Pair;
import kotlin.jvm.internal.h;
import s8.CountDownTimerC1242b;
import s8.d;
import t6.AbstractC1367j6;

/* compiled from: TfaFragment.kt */
/* loaded from: classes2.dex */
public final class TfaFragment extends BaseFragment<AbstractC1367j6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f13117n0 = R.layout.fragment_tfa_check;

    /* renamed from: o0, reason: collision with root package name */
    public final int f13118o0 = 6;

    /* renamed from: p0, reason: collision with root package name */
    public CountDownTimer f13119p0;

    /* renamed from: q0, reason: collision with root package name */
    public final H1.a f13120q0;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.tfa.TfaFragment$special$$inlined$viewModel$default$1] */
    public TfaFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.tfa.TfaFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f13120q0 = E.a(this, h.a(d.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.tfa.TfaFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.tfa.TfaFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(d.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.confirmation_code_sent_to_your_email);
        toolbarStatus.f13266d = "\n";
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void T0(boolean z10) {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.b(u0().f29159q);
        bVar.e(R.id.resendButton).f6337d.f6407x = z10 ? 0.0f : 1.0f;
        ConstraintLayout constraintLayout = u0().f29159q;
        bVar.a(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = (d) this.f13120q0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        CountDownTimer countDownTimer = this.f13119p0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        u0().f29158p.setLength(this.f13118o0);
        AbstractC1367j6 u02 = u0();
        u02.f29158p.addTextChangedListener(new a());
        u0().f29160r.setEnabled(false);
        this.f13119p0 = new CountDownTimerC1242b(this).start();
        AbstractC1367j6 u03 = u0();
        final int i = 0;
        o.c(u03.f29156n, 500L, new InterfaceC0635a(this) { // from class: s8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TfaFragment f27058b;

            {
                this.f27058b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Pair pair = new Pair("SUCCESS", Boolean.TRUE);
                        TfaFragment tfaFragment = this.f27058b;
                        tfaFragment.getParentFragmentManager().f0("TFA", t0.c.b(pair, new Pair("CODE", String.valueOf(tfaFragment.u0().f29158p.getText()))));
                        tfaFragment.requireActivity().getOnBackPressedDispatcher().d();
                        break;
                    default:
                        TfaFragment tfaFragment2 = this.f27058b;
                        tfaFragment2.u0().f29160r.setEnabled(false);
                        tfaFragment2.f13119p0 = new CountDownTimerC1242b(tfaFragment2).start();
                        d dVar = (d) tfaFragment2.f13120q0.getValue();
                        g gVar = new g(dVar, 21);
                        dVar.f418J0 = gVar;
                        gVar.invoke();
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(u03.f29157o, 500L, new g(u03, 20));
        final int i9 = 1;
        o.c(u03.f29160r, 500L, new InterfaceC0635a(this) { // from class: s8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TfaFragment f27058b;

            {
                this.f27058b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        Pair pair = new Pair("SUCCESS", Boolean.TRUE);
                        TfaFragment tfaFragment = this.f27058b;
                        tfaFragment.getParentFragmentManager().f0("TFA", t0.c.b(pair, new Pair("CODE", String.valueOf(tfaFragment.u0().f29158p.getText()))));
                        tfaFragment.requireActivity().getOnBackPressedDispatcher().d();
                        break;
                    default:
                        TfaFragment tfaFragment2 = this.f27058b;
                        tfaFragment2.u0().f29160r.setEnabled(false);
                        tfaFragment2.f13119p0 = new CountDownTimerC1242b(tfaFragment2).start();
                        d dVar = (d) tfaFragment2.f13120q0.getValue();
                        g gVar = new g(dVar, 21);
                        dVar.f418J0 = gVar;
                        gVar.invoke();
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f13117n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f29156n.setVisibility(0);
        o.b(u0().f29157o);
        T0(false);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f29156n);
        u0().f29157o.setVisibility(0);
        T0(true);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            TfaFragment tfaFragment = TfaFragment.this;
            tfaFragment.u0().f29156n.setEnabled(charSequence != null && charSequence.length() == tfaFragment.f13118o0);
            tfaFragment.u0().f29157o.setEnabled(charSequence != null && charSequence.length() == tfaFragment.f13118o0);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
