package com.luminary.business.presentation.ui.fragments.limits;

import C.v;
import F8.i;
import F8.o;
import Fa.h;
import G7.d;
import G7.g;
import H1.a;
import O9.p;
import P9.s;
import U4.b;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.limits.CardLimitsFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import ka.C0967l;
import ka.C0969n;
import ka.C0970o;
import t6.U2;
import z5.C1645a;
import z5.c;

/* compiled from: CardLimitsFragment.kt */
/* loaded from: classes2.dex */
public final class CardLimitsFragment extends BaseFragment<U2> {

    /* renamed from: n0, reason: collision with root package name */
    public final a f12342n0;

    /* renamed from: o0, reason: collision with root package name */
    public final h f12343o0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.luminary.business.presentation.ui.fragments.limits.CardLimitsFragment$special$$inlined$viewModel$default$1] */
    public CardLimitsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.limits.CardLimitsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12342n0 = E.a(this, kotlin.jvm.internal.h.a(g.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.limits.CardLimitsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.limits.CardLimitsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(g.class), null, null, b.l(this));
            }
        });
        this.f12343o0 = new h(kotlin.jvm.internal.h.a(d.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.limits.CardLimitsFragment$special$$inlined$navArgs$1
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

    public static int T0(Double d10, Double d11) {
        if (d10 == null || d11 == null || d10.doubleValue() <= 0.0d) {
            return 0;
        }
        return (int) (((d10.doubleValue() - d11.doubleValue()) / d10.doubleValue()) * 100);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.limits);
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
        toolbarStatus.f13263a = getString(R.string.limits);
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    public final d U0() {
        return (d) this.f12343o0.getValue();
    }

    public final g V0() {
        return (g) this.f12342n0.getValue();
    }

    public final void W0(int i, Double d10) {
        String str;
        c value = V0().f1357W0.getValue();
        if (value == null || (str = value.f31286a) == null || d10 == null) {
            return;
        }
        double doubleValue = d10.doubleValue();
        NavController g10 = b.g(this);
        int i9 = U0().f1343a;
        g10.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("titleRes", i);
        bundle.putFloat("limit", (float) doubleValue);
        bundle.putString(FirebaseAnalytics.Param.CURRENCY, str);
        bundle.putInt("cardId", i9);
        g10.i(R.id.actionToChangeLimitFragment, bundle);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = V0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        super.onViewCreated(view, bundle);
        g V02 = V0();
        A7.c cVar = new A7.c(3, V02, Integer.valueOf(U0().f1343a));
        V02.f419K0 = cVar;
        cVar.invoke();
        final U2 u02 = u0();
        final int i = 0;
        o.c(u02.f28556p, 500L, new InterfaceC0635a(this) { // from class: G7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitsFragment f1337b;

            {
                this.f1337b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                z5.b bVar;
                z5.b bVar2;
                z5.b bVar3;
                z5.b bVar4;
                switch (i) {
                    case 0:
                        CardLimitsFragment cardLimitsFragment = this.f1337b;
                        z5.c value = cardLimitsFragment.V0().f1357W0.getValue();
                        cardLimitsFragment.W0(R.string.daily_online_purchases, (value == null || (bVar = value.f31289d) == null) ? null : bVar.f31283a);
                        break;
                    case 1:
                        CardLimitsFragment cardLimitsFragment2 = this.f1337b;
                        z5.c value2 = cardLimitsFragment2.V0().f1357W0.getValue();
                        cardLimitsFragment2.W0(R.string.monthly_online_purchases, (value2 == null || (bVar2 = value2.f31298n) == null) ? null : bVar2.f31283a);
                        break;
                    case 2:
                        CardLimitsFragment cardLimitsFragment3 = this.f1337b;
                        z5.c value3 = cardLimitsFragment3.V0().f1357W0.getValue();
                        cardLimitsFragment3.W0(R.string.daily_contactless_payments, (value3 == null || (bVar3 = value3.f31290e) == null) ? null : bVar3.f31283a);
                        break;
                    default:
                        CardLimitsFragment cardLimitsFragment4 = this.f1337b;
                        z5.c value4 = cardLimitsFragment4.V0().f1357W0.getValue();
                        cardLimitsFragment4.W0(R.string.monthly_contactless_payments, (value4 == null || (bVar4 = value4.f31299o) == null) ? null : bVar4.f31283a);
                        break;
                }
                return p.f3034a;
            }
        });
        final int i9 = 1;
        o.c(u02.f28559s, 500L, new InterfaceC0635a(this) { // from class: G7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitsFragment f1337b;

            {
                this.f1337b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                z5.b bVar;
                z5.b bVar2;
                z5.b bVar3;
                z5.b bVar4;
                switch (i9) {
                    case 0:
                        CardLimitsFragment cardLimitsFragment = this.f1337b;
                        z5.c value = cardLimitsFragment.V0().f1357W0.getValue();
                        cardLimitsFragment.W0(R.string.daily_online_purchases, (value == null || (bVar = value.f31289d) == null) ? null : bVar.f31283a);
                        break;
                    case 1:
                        CardLimitsFragment cardLimitsFragment2 = this.f1337b;
                        z5.c value2 = cardLimitsFragment2.V0().f1357W0.getValue();
                        cardLimitsFragment2.W0(R.string.monthly_online_purchases, (value2 == null || (bVar2 = value2.f31298n) == null) ? null : bVar2.f31283a);
                        break;
                    case 2:
                        CardLimitsFragment cardLimitsFragment3 = this.f1337b;
                        z5.c value3 = cardLimitsFragment3.V0().f1357W0.getValue();
                        cardLimitsFragment3.W0(R.string.daily_contactless_payments, (value3 == null || (bVar3 = value3.f31290e) == null) ? null : bVar3.f31283a);
                        break;
                    default:
                        CardLimitsFragment cardLimitsFragment4 = this.f1337b;
                        z5.c value4 = cardLimitsFragment4.V0().f1357W0.getValue();
                        cardLimitsFragment4.W0(R.string.monthly_contactless_payments, (value4 == null || (bVar4 = value4.f31299o) == null) ? null : bVar4.f31283a);
                        break;
                }
                return p.f3034a;
            }
        });
        final int i10 = 2;
        o.c(u02.f28564x, 500L, new InterfaceC0635a(this) { // from class: G7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitsFragment f1337b;

            {
                this.f1337b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                z5.b bVar;
                z5.b bVar2;
                z5.b bVar3;
                z5.b bVar4;
                switch (i10) {
                    case 0:
                        CardLimitsFragment cardLimitsFragment = this.f1337b;
                        z5.c value = cardLimitsFragment.V0().f1357W0.getValue();
                        cardLimitsFragment.W0(R.string.daily_online_purchases, (value == null || (bVar = value.f31289d) == null) ? null : bVar.f31283a);
                        break;
                    case 1:
                        CardLimitsFragment cardLimitsFragment2 = this.f1337b;
                        z5.c value2 = cardLimitsFragment2.V0().f1357W0.getValue();
                        cardLimitsFragment2.W0(R.string.monthly_online_purchases, (value2 == null || (bVar2 = value2.f31298n) == null) ? null : bVar2.f31283a);
                        break;
                    case 2:
                        CardLimitsFragment cardLimitsFragment3 = this.f1337b;
                        z5.c value3 = cardLimitsFragment3.V0().f1357W0.getValue();
                        cardLimitsFragment3.W0(R.string.daily_contactless_payments, (value3 == null || (bVar3 = value3.f31290e) == null) ? null : bVar3.f31283a);
                        break;
                    default:
                        CardLimitsFragment cardLimitsFragment4 = this.f1337b;
                        z5.c value4 = cardLimitsFragment4.V0().f1357W0.getValue();
                        cardLimitsFragment4.W0(R.string.monthly_contactless_payments, (value4 == null || (bVar4 = value4.f31299o) == null) ? null : bVar4.f31283a);
                        break;
                }
                return p.f3034a;
            }
        });
        final int i11 = 3;
        o.c(u02.f28546A, 500L, new InterfaceC0635a(this) { // from class: G7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitsFragment f1337b;

            {
                this.f1337b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                z5.b bVar;
                z5.b bVar2;
                z5.b bVar3;
                z5.b bVar4;
                switch (i11) {
                    case 0:
                        CardLimitsFragment cardLimitsFragment = this.f1337b;
                        z5.c value = cardLimitsFragment.V0().f1357W0.getValue();
                        cardLimitsFragment.W0(R.string.daily_online_purchases, (value == null || (bVar = value.f31289d) == null) ? null : bVar.f31283a);
                        break;
                    case 1:
                        CardLimitsFragment cardLimitsFragment2 = this.f1337b;
                        z5.c value2 = cardLimitsFragment2.V0().f1357W0.getValue();
                        cardLimitsFragment2.W0(R.string.monthly_online_purchases, (value2 == null || (bVar2 = value2.f31298n) == null) ? null : bVar2.f31283a);
                        break;
                    case 2:
                        CardLimitsFragment cardLimitsFragment3 = this.f1337b;
                        z5.c value3 = cardLimitsFragment3.V0().f1357W0.getValue();
                        cardLimitsFragment3.W0(R.string.daily_contactless_payments, (value3 == null || (bVar3 = value3.f31290e) == null) ? null : bVar3.f31283a);
                        break;
                    default:
                        CardLimitsFragment cardLimitsFragment4 = this.f1337b;
                        z5.c value4 = cardLimitsFragment4.V0().f1357W0.getValue();
                        cardLimitsFragment4.W0(R.string.monthly_contactless_payments, (value4 == null || (bVar4 = value4.f31299o) == null) ? null : bVar4.f31283a);
                        break;
                }
                return p.f3034a;
            }
        });
        final int i12 = 0;
        u02.f28555o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: G7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitsFragment f1339b;

            {
                this.f1339b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                switch (i12) {
                    case 0:
                        CardLimitsFragment cardLimitsFragment = this.f1339b;
                        g V03 = cardLimitsFragment.V0();
                        f fVar = new f(V03, cardLimitsFragment.U0().f1343a, new C1645a(null, Boolean.valueOf(z10), 11), 0);
                        V03.f418J0 = fVar;
                        fVar.invoke();
                        U2 u22 = u02;
                        u22.f28556p.setEnabled(z10);
                        u22.f28559s.setEnabled(z10);
                        break;
                    default:
                        CardLimitsFragment cardLimitsFragment2 = this.f1339b;
                        g V04 = cardLimitsFragment2.V0();
                        f fVar2 = new f(V04, cardLimitsFragment2.U0().f1343a, new C1645a(Boolean.valueOf(z10), null, 13), 0);
                        V04.f418J0 = fVar2;
                        fVar2.invoke();
                        U2 u23 = u02;
                        u23.f28564x.setEnabled(z10);
                        u23.f28546A.setEnabled(z10);
                        break;
                }
            }
        });
        final int i13 = 1;
        u02.f28549D.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: G7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitsFragment f1339b;

            {
                this.f1339b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                switch (i13) {
                    case 0:
                        CardLimitsFragment cardLimitsFragment = this.f1339b;
                        g V03 = cardLimitsFragment.V0();
                        f fVar = new f(V03, cardLimitsFragment.U0().f1343a, new C1645a(null, Boolean.valueOf(z10), 11), 0);
                        V03.f418J0 = fVar;
                        fVar.invoke();
                        U2 u22 = u02;
                        u22.f28556p.setEnabled(z10);
                        u22.f28559s.setEnabled(z10);
                        break;
                    default:
                        CardLimitsFragment cardLimitsFragment2 = this.f1339b;
                        g V04 = cardLimitsFragment2.V0();
                        f fVar2 = new f(V04, cardLimitsFragment2.U0().f1343a, new C1645a(Boolean.valueOf(z10), null, 13), 0);
                        V04.f418J0 = fVar2;
                        fVar2.invoke();
                        U2 u23 = u02;
                        u23.f28564x.setEnabled(z10);
                        u23.f28546A.setEnabled(z10);
                        break;
                }
            }
        });
        U2 u03 = u0();
        u0().f28550E.setProgressTintList(ColorStateList.valueOf(requireContext().getColor(R.color.green_progress)));
        u0().f28551F.setProgressTintList(ColorStateList.valueOf(requireContext().getColor(R.color.green_progress)));
        u0().f28552G.setProgressTintList(ColorStateList.valueOf(requireContext().getColor(R.color.green_progress)));
        u0().f28553H.setProgressTintList(ColorStateList.valueOf(requireContext().getColor(R.color.green_progress)));
        u03.f28562v.setText(U0().f1345c);
        String str3 = U0().f1344b;
        int i14 = 0;
        int f02 = C0969n.f0(str3, '*', 0, false, 6);
        if (f02 != -1) {
            String W = C0967l.W(f02, "*");
            String substring = str3.substring(f02);
            int length = substring.length();
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    str = substring;
                    break;
                } else {
                    if (substring.charAt(i15) != '*') {
                        str = substring.substring(0, i15);
                        break;
                    }
                    i15++;
                }
            }
            String P4 = s.P(C0970o.v0(3, W + str), " ", null, null, null, 62);
            int length2 = substring.length();
            while (true) {
                if (i14 >= length2) {
                    str2 = "";
                    break;
                } else {
                    if (substring.charAt(i14) != '*') {
                        str2 = substring.substring(i14);
                        break;
                    }
                    i14++;
                }
            }
            str3 = v.p(P4, " ", str2);
        }
        u03.f28554n.setText(str3);
        U0().getClass();
        u03.f28555o.setChecked(U0().f1346d);
        u03.f28549D.setChecked(U0().f1347e);
        V0().f1357W0.observe(getViewLifecycleOwner(), new i(new G7.c(this, 0)));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return R.layout.fragment_card_limits;
    }
}
