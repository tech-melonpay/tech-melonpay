package com.luminary.business.presentation.ui.fragments.crypto.verify;

import F8.o;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.verify.VerifyAddressFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.ArrayList;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import s7.C1237a;
import s7.C1240d;
import t6.x6;
import w5.C1572a;

/* compiled from: VerifyAddressFragment.kt */
/* loaded from: classes2.dex */
public final class VerifyAddressFragment extends BaseFragment<x6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12161n0 = R.layout.fragment_verify_address;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12162o0;

    /* renamed from: p0, reason: collision with root package name */
    public C1572a f12163p0;

    /* renamed from: q0, reason: collision with root package name */
    public final ArrayList f12164q0;

    /* compiled from: VerifyAddressFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12169a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f12169a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12169a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12169a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.verify.VerifyAddressFragment$special$$inlined$viewModel$default$1] */
    public VerifyAddressFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.verify.VerifyAddressFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12162o0 = E.a(this, h.a(C1240d.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.verify.VerifyAddressFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.verify.VerifyAddressFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C1240d.class), null, null, b.l(this));
            }
        });
        new Handler(Looper.getMainLooper());
        this.f12164q0 = new ArrayList();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.verify_address);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 28;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.verify_address);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final C1240d T0() {
        return (C1240d) this.f12162o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        T0().f426S0.observe(getViewLifecycleOwner(), new a(new C1237a(this, 0)));
        C1240d T02 = T0();
        T02.f27056X0.observe(getViewLifecycleOwner(), new a(new C1237a(this, 1)));
        x6 u02 = u0();
        final int i = 0;
        o.c(u02.f29799r, 500L, new InterfaceC0635a(this) { // from class: s7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyAddressFragment f27049b;

            {
                this.f27049b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                ArrayList<String> arrayList;
                switch (i) {
                    case 0:
                        VerifyAddressFragment verifyAddressFragment = this.f27049b;
                        verifyAddressFragment.getClass();
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(verifyAddressFragment.requireContext(), StatementsSelectorDialog.DialogType.f13046d);
                        statementsSelectorDialog.f13040u = new C1237a(verifyAddressFragment, 4);
                        statementsSelectorDialog.show();
                        StatementsSelectorDialog.l(statementsSelectorDialog, verifyAddressFragment.f12164q0);
                        statementsSelectorDialog.m(verifyAddressFragment.getString(R.string.hub_crypto));
                        break;
                    case 1:
                        VerifyAddressFragment verifyAddressFragment2 = this.f27049b;
                        verifyAddressFragment2.getClass();
                        SelectorDialog selectorDialog = new SelectorDialog(verifyAddressFragment2.requireContext());
                        selectorDialog.f13206v = new C1237a(verifyAddressFragment2, 3);
                        selectorDialog.show();
                        selectorDialog.l();
                        C1572a c1572a = verifyAddressFragment2.f12163p0;
                        if (c1572a == null || (arrayList = c1572a.f30829d) == null) {
                            arrayList = new ArrayList<>();
                        }
                        selectorDialog.m(arrayList, false);
                        selectorDialog.n(verifyAddressFragment2.getString(R.string.network));
                        break;
                    case 2:
                        VerifyAddressFragment verifyAddressFragment3 = this.f27049b;
                        C1240d T03 = verifyAddressFragment3.T0();
                        String valueOf = String.valueOf(verifyAddressFragment3.u0().f29795n.getText());
                        String valueOf2 = String.valueOf(verifyAddressFragment3.u0().f29799r.getText());
                        String valueOf3 = String.valueOf(verifyAddressFragment3.u0().f29796o.getText());
                        String valueOf4 = String.valueOf(verifyAddressFragment3.u0().f29800s.getText());
                        T03.getClass();
                        E6.c cVar = new E6.c(T03, valueOf, valueOf2, valueOf3, valueOf4, 6);
                        T03.f419K0 = cVar;
                        cVar.invoke();
                        break;
                    default:
                        this.f27049b.u0().f29797p.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        x6 u03 = u0();
        final int i9 = 1;
        o.c(u03.f29800s, 500L, new InterfaceC0635a(this) { // from class: s7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyAddressFragment f27049b;

            {
                this.f27049b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                ArrayList<String> arrayList;
                switch (i9) {
                    case 0:
                        VerifyAddressFragment verifyAddressFragment = this.f27049b;
                        verifyAddressFragment.getClass();
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(verifyAddressFragment.requireContext(), StatementsSelectorDialog.DialogType.f13046d);
                        statementsSelectorDialog.f13040u = new C1237a(verifyAddressFragment, 4);
                        statementsSelectorDialog.show();
                        StatementsSelectorDialog.l(statementsSelectorDialog, verifyAddressFragment.f12164q0);
                        statementsSelectorDialog.m(verifyAddressFragment.getString(R.string.hub_crypto));
                        break;
                    case 1:
                        VerifyAddressFragment verifyAddressFragment2 = this.f27049b;
                        verifyAddressFragment2.getClass();
                        SelectorDialog selectorDialog = new SelectorDialog(verifyAddressFragment2.requireContext());
                        selectorDialog.f13206v = new C1237a(verifyAddressFragment2, 3);
                        selectorDialog.show();
                        selectorDialog.l();
                        C1572a c1572a = verifyAddressFragment2.f12163p0;
                        if (c1572a == null || (arrayList = c1572a.f30829d) == null) {
                            arrayList = new ArrayList<>();
                        }
                        selectorDialog.m(arrayList, false);
                        selectorDialog.n(verifyAddressFragment2.getString(R.string.network));
                        break;
                    case 2:
                        VerifyAddressFragment verifyAddressFragment3 = this.f27049b;
                        C1240d T03 = verifyAddressFragment3.T0();
                        String valueOf = String.valueOf(verifyAddressFragment3.u0().f29795n.getText());
                        String valueOf2 = String.valueOf(verifyAddressFragment3.u0().f29799r.getText());
                        String valueOf3 = String.valueOf(verifyAddressFragment3.u0().f29796o.getText());
                        String valueOf4 = String.valueOf(verifyAddressFragment3.u0().f29800s.getText());
                        T03.getClass();
                        E6.c cVar = new E6.c(T03, valueOf, valueOf2, valueOf3, valueOf4, 6);
                        T03.f419K0 = cVar;
                        cVar.invoke();
                        break;
                    default:
                        this.f27049b.u0().f29797p.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        x6 u04 = u0();
        final int i10 = 2;
        o.c(u04.f29797p, 500L, new InterfaceC0635a(this) { // from class: s7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyAddressFragment f27049b;

            {
                this.f27049b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                ArrayList<String> arrayList;
                switch (i10) {
                    case 0:
                        VerifyAddressFragment verifyAddressFragment = this.f27049b;
                        verifyAddressFragment.getClass();
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(verifyAddressFragment.requireContext(), StatementsSelectorDialog.DialogType.f13046d);
                        statementsSelectorDialog.f13040u = new C1237a(verifyAddressFragment, 4);
                        statementsSelectorDialog.show();
                        StatementsSelectorDialog.l(statementsSelectorDialog, verifyAddressFragment.f12164q0);
                        statementsSelectorDialog.m(verifyAddressFragment.getString(R.string.hub_crypto));
                        break;
                    case 1:
                        VerifyAddressFragment verifyAddressFragment2 = this.f27049b;
                        verifyAddressFragment2.getClass();
                        SelectorDialog selectorDialog = new SelectorDialog(verifyAddressFragment2.requireContext());
                        selectorDialog.f13206v = new C1237a(verifyAddressFragment2, 3);
                        selectorDialog.show();
                        selectorDialog.l();
                        C1572a c1572a = verifyAddressFragment2.f12163p0;
                        if (c1572a == null || (arrayList = c1572a.f30829d) == null) {
                            arrayList = new ArrayList<>();
                        }
                        selectorDialog.m(arrayList, false);
                        selectorDialog.n(verifyAddressFragment2.getString(R.string.network));
                        break;
                    case 2:
                        VerifyAddressFragment verifyAddressFragment3 = this.f27049b;
                        C1240d T03 = verifyAddressFragment3.T0();
                        String valueOf = String.valueOf(verifyAddressFragment3.u0().f29795n.getText());
                        String valueOf2 = String.valueOf(verifyAddressFragment3.u0().f29799r.getText());
                        String valueOf3 = String.valueOf(verifyAddressFragment3.u0().f29796o.getText());
                        String valueOf4 = String.valueOf(verifyAddressFragment3.u0().f29800s.getText());
                        T03.getClass();
                        E6.c cVar = new E6.c(T03, valueOf, valueOf2, valueOf3, valueOf4, 6);
                        T03.f419K0 = cVar;
                        cVar.invoke();
                        break;
                    default:
                        this.f27049b.u0().f29797p.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        x6 u05 = u0();
        final int i11 = 3;
        o.c(u05.f29798q, 500L, new InterfaceC0635a(this) { // from class: s7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyAddressFragment f27049b;

            {
                this.f27049b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                ArrayList<String> arrayList;
                switch (i11) {
                    case 0:
                        VerifyAddressFragment verifyAddressFragment = this.f27049b;
                        verifyAddressFragment.getClass();
                        StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(verifyAddressFragment.requireContext(), StatementsSelectorDialog.DialogType.f13046d);
                        statementsSelectorDialog.f13040u = new C1237a(verifyAddressFragment, 4);
                        statementsSelectorDialog.show();
                        StatementsSelectorDialog.l(statementsSelectorDialog, verifyAddressFragment.f12164q0);
                        statementsSelectorDialog.m(verifyAddressFragment.getString(R.string.hub_crypto));
                        break;
                    case 1:
                        VerifyAddressFragment verifyAddressFragment2 = this.f27049b;
                        verifyAddressFragment2.getClass();
                        SelectorDialog selectorDialog = new SelectorDialog(verifyAddressFragment2.requireContext());
                        selectorDialog.f13206v = new C1237a(verifyAddressFragment2, 3);
                        selectorDialog.show();
                        selectorDialog.l();
                        C1572a c1572a = verifyAddressFragment2.f12163p0;
                        if (c1572a == null || (arrayList = c1572a.f30829d) == null) {
                            arrayList = new ArrayList<>();
                        }
                        selectorDialog.m(arrayList, false);
                        selectorDialog.n(verifyAddressFragment2.getString(R.string.network));
                        break;
                    case 2:
                        VerifyAddressFragment verifyAddressFragment3 = this.f27049b;
                        C1240d T03 = verifyAddressFragment3.T0();
                        String valueOf = String.valueOf(verifyAddressFragment3.u0().f29795n.getText());
                        String valueOf2 = String.valueOf(verifyAddressFragment3.u0().f29799r.getText());
                        String valueOf3 = String.valueOf(verifyAddressFragment3.u0().f29796o.getText());
                        String valueOf4 = String.valueOf(verifyAddressFragment3.u0().f29800s.getText());
                        T03.getClass();
                        E6.c cVar = new E6.c(T03, valueOf, valueOf2, valueOf3, valueOf4, 6);
                        T03.f419K0 = cVar;
                        cVar.invoke();
                        break;
                    default:
                        this.f27049b.u0().f29797p.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        T0().f27055W0.observe(getViewLifecycleOwner(), new a(new C1237a(this, 2)));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12161n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        u0().f29797p.setVisibility(0);
        o.b(u0().f29798q);
        t0(true);
        s0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        o.b(u0().f29797p);
        u0().f29798q.setVisibility(0);
        p0(true);
        B0();
    }
}
