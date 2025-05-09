package com.luminary.business.presentation.ui.fragments.auth.accountinformation;

import F8.o;
import Fa.h;
import G6.b;
import G6.c;
import M6.w;
import android.os.Bundle;
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
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.accountinformation.AccountInformationFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import t6.C2;

/* compiled from: AccountInformationFragment.kt */
/* loaded from: classes2.dex */
public final class AccountInformationFragment extends BaseFragment<C2> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11525n0 = R.layout.fragment_account_information;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11526o0;

    /* renamed from: p0, reason: collision with root package name */
    public String f11527p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f11528q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f11529r0;
    public String s0;

    /* renamed from: t0, reason: collision with root package name */
    public ArrayList<Pair<String, String>> f11530t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f11531u0;

    /* renamed from: v0, reason: collision with root package name */
    public String f11532v0;

    /* renamed from: w0, reason: collision with root package name */
    public final h f11533w0;

    /* compiled from: AccountInformationFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11539a;

        public a(b bVar) {
            this.f11539a = bVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11539a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11539a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.accountinformation.AccountInformationFragment$special$$inlined$viewModel$default$1] */
    public AccountInformationFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.accountinformation.AccountInformationFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11526o0 = E.a(this, kotlin.jvm.internal.h.a(w.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.accountinformation.AccountInformationFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.accountinformation.AccountInformationFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return U4.b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(w.class), null, null, U4.b.l(this));
            }
        });
        this.f11530t0 = new ArrayList<>();
        this.f11533w0 = new h(kotlin.jvm.internal.h.a(c.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.auth.accountinformation.AccountInformationFragment$special$$inlined$navArgs$1
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
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.account_information);
        toolbarStatus.f13266d = getString(R.string.step_of, 6, 6);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.account_information);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void T0() {
        String str = this.f11527p0;
        boolean z10 = !(str == null || str.length() == 0);
        String str2 = this.f11529r0;
        if (str2 == null || str2.length() == 0) {
            z10 = false;
        }
        String str3 = this.f11531u0;
        if (str3 == null || str3.length() == 0) {
            z10 = false;
        }
        if ((u0().f27675w.isChecked() && this.f11530t0.isEmpty()) || (!u0().f27674v.isChecked() && !u0().f27675w.isChecked())) {
            z10 = false;
        }
        if (!u0().f27672t.isChecked() && !u0().f27673u.isChecked()) {
            z10 = false;
        }
        if (!u0().f27677y.isChecked() && !u0().f27676x.isChecked()) {
            z10 = false;
        }
        boolean z11 = String.valueOf(u0().f27664B.getText()).length() != 0 ? z10 : false;
        u0().f27666n.setEnabled(z11);
        u0().f27667o.setEnabled(z11);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = (w) this.f11526o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        w wVar = (w) this.f11526o0.getValue();
        wVar.f2722x1.observe(getViewLifecycleOwner(), new a(new b(this, 1)));
        C2 u02 = u0();
        final int i = 11;
        o.c(u02.f27670r, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
            @Override // ca.InterfaceC0635a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u03 = u0();
        final int i9 = 12;
        o.c(u03.f27671s, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u04 = u0();
        final int i10 = 0;
        o.c(u04.f27669q, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u05 = u0();
        final int i11 = 1;
        o.c(u05.f27663A, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u06 = u0();
        u06.f27668p.setOnTagDeleteListener(new A0.b(this, 8));
        E.b(this, "country", new B6.h(this, 2));
        C2 u07 = u0();
        final int i12 = 2;
        o.c(u07.f27673u, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u08 = u0();
        final int i13 = 3;
        o.c(u08.f27672t, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u09 = u0();
        final int i14 = 4;
        o.c(u09.f27675w, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u010 = u0();
        final int i15 = 5;
        o.c(u010.f27674v, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u011 = u0();
        final int i16 = 6;
        o.c(u011.f27677y, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u012 = u0();
        final int i17 = 7;
        o.c(u012.f27676x, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u013 = u0();
        final int i18 = 8;
        o.c(u013.f27664B, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u014 = u0();
        final int i19 = 9;
        o.c(u014.f27666n, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
        C2 u015 = u0();
        final int i20 = 10;
        o.c(u015.f27667o, 500L, new InterfaceC0635a(this) { // from class: G6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountInformationFragment f1325b;

            {
                this.f1325b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: G6.a.invoke():java.lang.Object");
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11525n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(false);
        s0();
        u0().f27666n.setVisibility(0);
        o.b(u0().f27667o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f27666n);
        u0().f27667o.setVisibility(0);
    }
}
