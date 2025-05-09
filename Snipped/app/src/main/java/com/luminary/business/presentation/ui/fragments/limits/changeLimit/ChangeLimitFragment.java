package com.luminary.business.presentation.ui.fragments.limits.changeLimit;

import F8.i;
import F8.o;
import Fa.h;
import H7.b;
import H7.e;
import O9.p;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.limits.changeLimit.ChangeLimitFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import t6.AbstractC1308c3;

/* compiled from: ChangeLimitFragment.kt */
/* loaded from: classes2.dex */
public final class ChangeLimitFragment extends BaseFragment<AbstractC1308c3> {

    /* renamed from: n0, reason: collision with root package name */
    public final h f12349n0 = new h(kotlin.jvm.internal.h.a(b.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.limits.changeLimit.ChangeLimitFragment$special$$inlined$navArgs$1
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

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12350o0;

    /* compiled from: FragmentExt.kt */
    public static final class a implements InterfaceC0646l<p, p> {
        public a() {
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(p pVar) {
            U4.b.g(ChangeLimitFragment.this).m(R.id.cardLimitsFragment, false);
            return p.f3034a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.limits.changeLimit.ChangeLimitFragment$special$$inlined$viewModel$default$1] */
    public ChangeLimitFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.limits.changeLimit.ChangeLimitFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12350o0 = E.a(this, kotlin.jvm.internal.h.a(e.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.limits.changeLimit.ChangeLimitFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.limits.changeLimit.ChangeLimitFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return U4.b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(e.class), null, null, U4.b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(T0().f1552a);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(T0().f1552a);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    public final b T0() {
        return (b) this.f12349n0.getValue();
    }

    public final e U0() {
        return (e) this.f12350o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC1308c3 u02 = u0();
        u02.f28861n.setCurrency(D9.b.C(T0().f1554c));
        if (T0().f1553b != 0.0f) {
            AbstractC1308c3 u03 = u0();
            u03.f28861n.setText(D9.b.c(String.valueOf(T0().f1553b)));
        }
        AbstractC1308c3 u04 = u0();
        final int i = 0;
        o.c(u04.f28862o, 500L, new InterfaceC0635a(this) { // from class: H7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangeLimitFragment f1551b;

            {
                this.f1551b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ChangeLimitFragment changeLimitFragment = this.f1551b;
                        double parseDouble = Double.parseDouble(D9.b.r0(String.valueOf(changeLimitFragment.u0().f28861n.getText())));
                        int i9 = changeLimitFragment.T0().f1552a;
                        if (i9 == R.string.daily_online_purchases) {
                            changeLimitFragment.U0().m(changeLimitFragment.T0().f1555d, new z5.d(null, Double.valueOf(parseDouble), null, null, 262141));
                        } else if (i9 == R.string.monthly_online_purchases) {
                            changeLimitFragment.U0().m(changeLimitFragment.T0().f1555d, new z5.d(null, null, null, Double.valueOf(parseDouble), 262079));
                        } else if (i9 == R.string.daily_contactless_payments) {
                            changeLimitFragment.U0().m(changeLimitFragment.T0().f1555d, new z5.d(Double.valueOf(parseDouble), null, null, null, 262142));
                        } else if (i9 == R.string.monthly_contactless_payments) {
                            changeLimitFragment.U0().m(changeLimitFragment.T0().f1555d, new z5.d(null, null, Double.valueOf(parseDouble), null, 262111));
                        }
                        break;
                    default:
                        this.f1551b.u0().f28862o.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1308c3 u05 = u0();
        final int i9 = 1;
        o.c(u05.f28863p, 500L, new InterfaceC0635a(this) { // from class: H7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangeLimitFragment f1551b;

            {
                this.f1551b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        ChangeLimitFragment changeLimitFragment = this.f1551b;
                        double parseDouble = Double.parseDouble(D9.b.r0(String.valueOf(changeLimitFragment.u0().f28861n.getText())));
                        int i92 = changeLimitFragment.T0().f1552a;
                        if (i92 == R.string.daily_online_purchases) {
                            changeLimitFragment.U0().m(changeLimitFragment.T0().f1555d, new z5.d(null, Double.valueOf(parseDouble), null, null, 262141));
                        } else if (i92 == R.string.monthly_online_purchases) {
                            changeLimitFragment.U0().m(changeLimitFragment.T0().f1555d, new z5.d(null, null, null, Double.valueOf(parseDouble), 262079));
                        } else if (i92 == R.string.daily_contactless_payments) {
                            changeLimitFragment.U0().m(changeLimitFragment.T0().f1555d, new z5.d(Double.valueOf(parseDouble), null, null, null, 262142));
                        } else if (i92 == R.string.monthly_contactless_payments) {
                            changeLimitFragment.U0().m(changeLimitFragment.T0().f1555d, new z5.d(null, null, Double.valueOf(parseDouble), null, 262111));
                        }
                        break;
                    default:
                        this.f1551b.u0().f28862o.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        e U02 = U0();
        U02.f1566W0.observe(getViewLifecycleOwner(), new i(new a()));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return R.layout.fragment_change_limit;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        u0().f28862o.setVisibility(0);
        o.b(u0().f28863p);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        o.b(u0().f28862o);
        u0().f28863p.setVisibility(0);
    }
}
