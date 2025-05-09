package com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments;

import C.v;
import F8.o;
import Fa.h;
import O9.p;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.OutgoingPaymentsFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import t6.AbstractC1414p5;

/* compiled from: OutgoingPaymentsFragment.kt */
/* loaded from: classes2.dex */
public final class OutgoingPaymentsFragment extends BaseFragment<AbstractC1414p5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12593n0 = R.layout.fragment_outgoing_payments;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12594o0;

    /* renamed from: p0, reason: collision with root package name */
    public final h f12595p0;

    /* renamed from: q0, reason: collision with root package name */
    public State f12596q0;

    /* renamed from: r0, reason: collision with root package name */
    public CreateCompanyUI.ContractorUI f12597r0;
    public CreateCompanyUI.ContractorUI s0;

    /* renamed from: t0, reason: collision with root package name */
    public CreateCompanyUI.ContractorUI f12598t0;

    /* renamed from: u0, reason: collision with root package name */
    public CreateCompanyUI.ContractorUI f12599u0;

    /* renamed from: v0, reason: collision with root package name */
    public CreateCompanyUI.ContractorUI f12600v0;

    /* renamed from: w0, reason: collision with root package name */
    public CreateCompanyUI.ContractorUI f12601w0;

    /* renamed from: x0, reason: collision with root package name */
    public androidx.appcompat.app.b f12602x0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OutgoingPaymentsFragment.kt */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f12608a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f12609b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ State[] f12610c;

        static {
            State state = new State("INCOMING", 0);
            f12608a = state;
            State state2 = new State("OUTGOING", 1);
            f12609b = state2;
            f12610c = new State[]{state, state2};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f12610c.clone();
        }
    }

    /* compiled from: OutgoingPaymentsFragment.kt */
    public static final class g implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12617a;

        public g(InterfaceC0646l interfaceC0646l) {
            this.f12617a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12617a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12617a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.OutgoingPaymentsFragment$special$$inlined$viewModel$default$1] */
    public OutgoingPaymentsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.OutgoingPaymentsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12594o0 = E.a(this, kotlin.jvm.internal.h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.OutgoingPaymentsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.OutgoingPaymentsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return U4.b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(NewCompanyViewModel.class), null, null, U4.b.l(this));
            }
        });
        this.f12595p0 = new h(kotlin.jvm.internal.h.a(U7.c.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.OutgoingPaymentsFragment$special$$inlined$navArgs$1
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
        this.f12596q0 = State.f12609b;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        if (this.f12596q0 != State.f12608a) {
            return !(this instanceof CardsFragment);
        }
        this.f12596q0 = State.f12609b;
        L0();
        U0();
        return false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        String string;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        if (this.f12596q0 == State.f12608a) {
            toolbarStatus.f13266d = getString(R.string.step_of, 12, 14);
            string = getString(R.string.incoming_payments);
        } else {
            toolbarStatus.f13266d = getString(R.string.step_of, 11, 14);
            string = getString(R.string.outgoing_payments);
        }
        toolbarStatus.f13263a = string;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = this.f12596q0 == State.f12608a ? getString(R.string.incoming_payments) : getString(R.string.outgoing_payments);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final NewCompanyViewModel T0() {
        return (NewCompanyViewModel) this.f12594o0.getValue();
    }

    public final void U0() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Map<Integer, CreateCompanyUI.ContractorUI> map;
        Map<Integer, CreateCompanyUI.ContractorUI> map2;
        Map<Integer, CreateCompanyUI.ContractorUI> map3;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        Map<Integer, CreateCompanyUI.ContractorUI> map4;
        Map<Integer, CreateCompanyUI.ContractorUI> map5;
        Map<Integer, CreateCompanyUI.ContractorUI> map6;
        CompanyDetailsUI companyDetailsUI = T0().f12446k1;
        CreateCompanyUI.ContractorUI contractorUI = null;
        if (companyDetailsUI == null) {
            companyDetailsUI = null;
        }
        CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
        if ((companyUI != null ? companyUI.f11243n0 : null) == null) {
            CompanyDetailsUI companyDetailsUI2 = T0().f12446k1;
            if (companyDetailsUI2 == null) {
                companyDetailsUI2 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI2.f11192a;
            if (companyUI2 != null) {
                companyUI2.f11243n0 = new HashMap();
            }
        }
        CompanyDetailsUI companyDetailsUI3 = T0().f12446k1;
        if (companyDetailsUI3 == null) {
            companyDetailsUI3 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI3 = companyDetailsUI3.f11192a;
        if ((companyUI3 != null ? companyUI3.f11245o0 : null) == null) {
            CompanyDetailsUI companyDetailsUI4 = T0().f12446k1;
            if (companyDetailsUI4 == null) {
                companyDetailsUI4 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI4 = companyDetailsUI4.f11192a;
            if (companyUI4 != null) {
                companyUI4.f11245o0 = new HashMap();
            }
        }
        String str19 = "";
        if (this.f12596q0 == State.f12609b) {
            CompanyDetailsUI companyDetailsUI5 = T0().f12446k1;
            if (companyDetailsUI5 == null) {
                companyDetailsUI5 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI5 = companyDetailsUI5.f11192a;
            this.f12599u0 = (companyUI5 == null || (map6 = companyUI5.f11245o0) == null) ? null : map6.get(1);
            CompanyDetailsUI companyDetailsUI6 = T0().f12446k1;
            if (companyDetailsUI6 == null) {
                companyDetailsUI6 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI6 = companyDetailsUI6.f11192a;
            this.f12600v0 = (companyUI6 == null || (map5 = companyUI6.f11245o0) == null) ? null : map5.get(2);
            CompanyDetailsUI companyDetailsUI7 = T0().f12446k1;
            if (companyDetailsUI7 == null) {
                companyDetailsUI7 = null;
            }
            CompanyDetailsUI.CompanyUI companyUI7 = companyDetailsUI7.f11192a;
            if (companyUI7 != null && (map4 = companyUI7.f11245o0) != null) {
                contractorUI = map4.get(3);
            }
            this.f12601w0 = contractorUI;
            AbstractC1414p5 u02 = u0();
            CreateCompanyUI.ContractorUI contractorUI2 = this.f12599u0;
            if (contractorUI2 == null || (str10 = contractorUI2.f11292a) == null) {
                str10 = "";
            }
            u02.f29469p.setText(str10);
            AbstractC1414p5 u03 = u0();
            CreateCompanyUI.ContractorUI contractorUI3 = this.f12599u0;
            if (contractorUI3 == null || (str11 = contractorUI3.f11294c) == null) {
                str11 = "";
            }
            u03.f29475v.setText(str11);
            AbstractC1414p5 u04 = u0();
            NewCompanyViewModel T02 = T0();
            CreateCompanyUI.ContractorUI contractorUI4 = this.f12599u0;
            if (contractorUI4 == null || (str12 = contractorUI4.f11293b) == null) {
                str12 = "";
            }
            u04.f29472s.setText(T02.i0(str12));
            AbstractC1414p5 u05 = u0();
            CreateCompanyUI.ContractorUI contractorUI5 = this.f12600v0;
            if (contractorUI5 == null || (str13 = contractorUI5.f11292a) == null) {
                str13 = "";
            }
            u05.f29470q.setText(str13);
            AbstractC1414p5 u06 = u0();
            CreateCompanyUI.ContractorUI contractorUI6 = this.f12600v0;
            if (contractorUI6 == null || (str14 = contractorUI6.f11294c) == null) {
                str14 = "";
            }
            u06.f29476w.setText(str14);
            AbstractC1414p5 u07 = u0();
            NewCompanyViewModel T03 = T0();
            CreateCompanyUI.ContractorUI contractorUI7 = this.f12600v0;
            if (contractorUI7 == null || (str15 = contractorUI7.f11293b) == null) {
                str15 = "";
            }
            u07.f29473t.setText(T03.i0(str15));
            AbstractC1414p5 u08 = u0();
            CreateCompanyUI.ContractorUI contractorUI8 = this.f12601w0;
            if (contractorUI8 == null || (str16 = contractorUI8.f11292a) == null) {
                str16 = "";
            }
            u08.f29471r.setText(str16);
            AbstractC1414p5 u09 = u0();
            CreateCompanyUI.ContractorUI contractorUI9 = this.f12601w0;
            if (contractorUI9 == null || (str17 = contractorUI9.f11294c) == null) {
                str17 = "";
            }
            u09.f29477x.setText(str17);
            AbstractC1414p5 u010 = u0();
            NewCompanyViewModel T04 = T0();
            CreateCompanyUI.ContractorUI contractorUI10 = this.f12601w0;
            if (contractorUI10 != null && (str18 = contractorUI10.f11293b) != null) {
                str19 = str18;
            }
            u010.f29474u.setText(T04.i0(str19));
            return;
        }
        CompanyDetailsUI companyDetailsUI8 = T0().f12446k1;
        if (companyDetailsUI8 == null) {
            companyDetailsUI8 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI8 = companyDetailsUI8.f11192a;
        this.f12597r0 = (companyUI8 == null || (map3 = companyUI8.f11243n0) == null) ? null : map3.get(1);
        CompanyDetailsUI companyDetailsUI9 = T0().f12446k1;
        if (companyDetailsUI9 == null) {
            companyDetailsUI9 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI9 = companyDetailsUI9.f11192a;
        this.s0 = (companyUI9 == null || (map2 = companyUI9.f11243n0) == null) ? null : map2.get(2);
        CompanyDetailsUI companyDetailsUI10 = T0().f12446k1;
        if (companyDetailsUI10 == null) {
            companyDetailsUI10 = null;
        }
        CompanyDetailsUI.CompanyUI companyUI10 = companyDetailsUI10.f11192a;
        if (companyUI10 != null && (map = companyUI10.f11243n0) != null) {
            contractorUI = map.get(3);
        }
        this.f12598t0 = contractorUI;
        AbstractC1414p5 u011 = u0();
        CreateCompanyUI.ContractorUI contractorUI11 = this.f12597r0;
        if (contractorUI11 == null || (str = contractorUI11.f11292a) == null) {
            str = "";
        }
        u011.f29469p.setText(str);
        AbstractC1414p5 u012 = u0();
        CreateCompanyUI.ContractorUI contractorUI12 = this.f12597r0;
        if (contractorUI12 == null || (str2 = contractorUI12.f11294c) == null) {
            str2 = "";
        }
        u012.f29475v.setText(str2);
        AbstractC1414p5 u013 = u0();
        NewCompanyViewModel T05 = T0();
        CreateCompanyUI.ContractorUI contractorUI13 = this.f12597r0;
        if (contractorUI13 == null || (str3 = contractorUI13.f11293b) == null) {
            str3 = "";
        }
        u013.f29472s.setText(T05.i0(str3));
        AbstractC1414p5 u014 = u0();
        CreateCompanyUI.ContractorUI contractorUI14 = this.s0;
        if (contractorUI14 == null || (str4 = contractorUI14.f11292a) == null) {
            str4 = "";
        }
        u014.f29470q.setText(str4);
        AbstractC1414p5 u015 = u0();
        CreateCompanyUI.ContractorUI contractorUI15 = this.s0;
        if (contractorUI15 == null || (str5 = contractorUI15.f11294c) == null) {
            str5 = "";
        }
        u015.f29476w.setText(str5);
        AbstractC1414p5 u016 = u0();
        NewCompanyViewModel T06 = T0();
        CreateCompanyUI.ContractorUI contractorUI16 = this.s0;
        if (contractorUI16 == null || (str6 = contractorUI16.f11293b) == null) {
            str6 = "";
        }
        u016.f29473t.setText(T06.i0(str6));
        AbstractC1414p5 u017 = u0();
        CreateCompanyUI.ContractorUI contractorUI17 = this.f12598t0;
        if (contractorUI17 == null || (str7 = contractorUI17.f11292a) == null) {
            str7 = "";
        }
        u017.f29471r.setText(str7);
        AbstractC1414p5 u018 = u0();
        CreateCompanyUI.ContractorUI contractorUI18 = this.f12598t0;
        if (contractorUI18 == null || (str8 = contractorUI18.f11294c) == null) {
            str8 = "";
        }
        u018.f29477x.setText(str8);
        AbstractC1414p5 u019 = u0();
        NewCompanyViewModel T07 = T0();
        CreateCompanyUI.ContractorUI contractorUI19 = this.f12598t0;
        if (contractorUI19 != null && (str9 = contractorUI19.f11293b) != null) {
            str19 = str9;
        }
        u019.f29474u.setText(T07.i0(str19));
    }

    public final void V0(String str, String str2) {
        Window window;
        View inflate = getLayoutInflater().inflate(R.layout.dialog_rates, (ViewGroup) null);
        this.f12602x0 = new b.a(requireContext()).setView(inflate).create();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.close);
        TextView textView = (TextView) inflate.findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tvDescription);
        textView.setText(str);
        textView2.setText(str2);
        o.c(imageView, 500L, new U7.b(this, 10));
        androidx.appcompat.app.b bVar = this.f12602x0;
        if (bVar != null && (window = bVar.getWindow()) != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        androidx.appcompat.app.b bVar2 = this.f12602x0;
        if (bVar2 != null) {
            bVar2.show();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r4.length() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        if (r4.length() != 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean W0() {
        /*
            r5 = this;
            com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.OutgoingPaymentsFragment$State r0 = r5.f12596q0
            com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.OutgoingPaymentsFragment$State r1 = com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.OutgoingPaymentsFragment.State.f12608a
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L3e
            com.luminary.business.presentation.entity.company.CreateCompanyUI$ContractorUI r0 = r5.f12597r0
            if (r0 == 0) goto L70
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.f11292a
            goto L13
        L12:
            r0 = r4
        L13:
            if (r0 == 0) goto L70
            int r0 = r0.length()
            if (r0 != 0) goto L1c
            goto L70
        L1c:
            com.luminary.business.presentation.entity.company.CreateCompanyUI$ContractorUI r0 = r5.f12597r0
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.f11294c
            goto L24
        L23:
            r0 = r4
        L24:
            if (r0 == 0) goto L70
            int r0 = r0.length()
            if (r0 != 0) goto L2d
            goto L70
        L2d:
            com.luminary.business.presentation.entity.company.CreateCompanyUI$ContractorUI r0 = r5.f12597r0
            if (r0 == 0) goto L33
            java.lang.String r4 = r0.f11293b
        L33:
            if (r4 == 0) goto L70
            int r0 = r4.length()
            if (r0 != 0) goto L3c
            goto L70
        L3c:
            r2 = r3
            goto L70
        L3e:
            com.luminary.business.presentation.entity.company.CreateCompanyUI$ContractorUI r0 = r5.f12599u0
            if (r0 == 0) goto L70
            if (r0 == 0) goto L47
            java.lang.String r0 = r0.f11292a
            goto L48
        L47:
            r0 = r4
        L48:
            if (r0 == 0) goto L70
            int r0 = r0.length()
            if (r0 != 0) goto L51
            goto L70
        L51:
            com.luminary.business.presentation.entity.company.CreateCompanyUI$ContractorUI r0 = r5.f12599u0
            if (r0 == 0) goto L58
            java.lang.String r0 = r0.f11294c
            goto L59
        L58:
            r0 = r4
        L59:
            if (r0 == 0) goto L70
            int r0 = r0.length()
            if (r0 != 0) goto L62
            goto L70
        L62:
            com.luminary.business.presentation.entity.company.CreateCompanyUI$ContractorUI r0 = r5.f12599u0
            if (r0 == 0) goto L68
            java.lang.String r4 = r0.f11293b
        L68:
            if (r4 == 0) goto L70
            int r0 = r4.length()
            if (r0 != 0) goto L3c
        L70:
            F0.f r0 = r5.u0()
            t6.p5 r0 = (t6.AbstractC1414p5) r0
            android.widget.Button r0 = r0.f29467n
            r0.setEnabled(r2)
            F0.f r0 = r5.u0()
            t6.p5 r0 = (t6.AbstractC1414p5) r0
            android.widget.Button r0 = r0.f29468o
            r0.setEnabled(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.OutgoingPaymentsFragment.W0():boolean");
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        androidx.appcompat.app.b bVar = this.f12602x0;
        if (bVar != null) {
            if (bVar != null) {
                bVar.dismiss();
            }
            this.f12602x0 = null;
        }
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        T0().f12446k1 = ((U7.c) this.f12595p0.getValue()).f3674a;
        U0();
        T0().h0();
        final int i = 0;
        T0().f12453s1.observe(getViewLifecycleOwner(), new g(new InterfaceC0646l(this) { // from class: U7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OutgoingPaymentsFragment f3671b;

            {
                this.f3671b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        this.f3671b.U0();
                        return p.f3034a;
                    default:
                        OutgoingPaymentsFragment outgoingPaymentsFragment = this.f3671b;
                        NavController g10 = U4.b.g(outgoingPaymentsFragment);
                        Parcelable parcelable = outgoingPaymentsFragment.T0().f12446k1;
                        if (parcelable == null) {
                            parcelable = null;
                        }
                        Bundle g11 = v.g(g10);
                        if (Parcelable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                            g11.putParcelable("companyDetails", parcelable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                                throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g11.putSerializable("companyDetails", (Serializable) parcelable);
                        }
                        g10.i(R.id.action_outgoingPaymentsFragment_to_uploadDocumentsFragment, g11);
                        return p.f3034a;
                }
            }
        }));
        NewCompanyViewModel T02 = T0();
        final int i9 = 1;
        T02.f12455u1.observe(getViewLifecycleOwner(), new g(new InterfaceC0646l(this) { // from class: U7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OutgoingPaymentsFragment f3671b;

            {
                this.f3671b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        this.f3671b.U0();
                        return p.f3034a;
                    default:
                        OutgoingPaymentsFragment outgoingPaymentsFragment = this.f3671b;
                        NavController g10 = U4.b.g(outgoingPaymentsFragment);
                        Parcelable parcelable = outgoingPaymentsFragment.T0().f12446k1;
                        if (parcelable == null) {
                            parcelable = null;
                        }
                        Bundle g11 = v.g(g10);
                        if (Parcelable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                            g11.putParcelable("companyDetails", parcelable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                                throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g11.putSerializable("companyDetails", (Serializable) parcelable);
                        }
                        g10.i(R.id.action_outgoingPaymentsFragment_to_uploadDocumentsFragment, g11);
                        return p.f3034a;
                }
            }
        }));
        AbstractC1414p5 u02 = u0();
        o.c(u02.f29472s, 500L, new U7.b(this, 1));
        o.c(u02.f29473t, 500L, new U7.b(this, 2));
        o.c(u02.f29474u, 500L, new U7.b(this, 3));
        u02.f29469p.addTextChangedListener(new a());
        u02.f29475v.addTextChangedListener(new b());
        u02.f29470q.addTextChangedListener(new c());
        u02.f29476w.addTextChangedListener(new d());
        u02.f29471r.addTextChangedListener(new e());
        u02.f29477x.addTextChangedListener(new f());
        o.c(u02.f29478y, 500L, new U7.b(this, 4));
        o.c(u02.f29457A, 500L, new U7.b(this, 5));
        o.c(u02.f29459C, 500L, new U7.b(this, 6));
        o.c(u02.f29461E, 500L, new U7.b(this, 7));
        o.c(u02.f29463G, 500L, new U7.b(this, 8));
        o.c(u02.f29465I, 500L, new U7.b(this, 9));
        o.c(u02.f29479z, 500L, new U7.b(this, 11));
        o.c(u02.f29458B, 500L, new U7.b(this, 12));
        o.c(u02.f29460D, 500L, new U7.b(this, 13));
        o.c(u02.f29462F, 500L, new U7.b(this, 14));
        o.c(u02.f29464H, 500L, new U7.b(this, 15));
        o.c(u02.f29466J, 500L, new U7.b(this, 16));
        E.b(this, "country", new InterfaceC0650p() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.a
            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                Map<Integer, CreateCompanyUI.ContractorUI> map;
                Map<Integer, CreateCompanyUI.ContractorUI> map2;
                Map<Integer, CreateCompanyUI.ContractorUI> map3;
                Map<Integer, CreateCompanyUI.ContractorUI> map4;
                Map<Integer, CreateCompanyUI.ContractorUI> map5;
                Map<Integer, CreateCompanyUI.ContractorUI> map6;
                Bundle bundle2 = (Bundle) obj2;
                if (!f.b((String) obj, "country")) {
                    return p.f3034a;
                }
                String string = bundle2.getString("field");
                String string2 = bundle2.getString("selected_country");
                String string3 = bundle2.getString("selected_country_code");
                OutgoingPaymentsFragment outgoingPaymentsFragment = OutgoingPaymentsFragment.this;
                CompanyDetailsUI companyDetailsUI = outgoingPaymentsFragment.T0().f12446k1;
                if (companyDetailsUI == null) {
                    companyDetailsUI = null;
                }
                CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                if ((companyUI != null ? companyUI.f11243n0 : null) == null) {
                    CompanyDetailsUI companyDetailsUI2 = outgoingPaymentsFragment.T0().f12446k1;
                    if (companyDetailsUI2 == null) {
                        companyDetailsUI2 = null;
                    }
                    CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI2.f11192a;
                    if (companyUI2 != null) {
                        companyUI2.f11243n0 = new HashMap();
                    }
                }
                CompanyDetailsUI companyDetailsUI3 = outgoingPaymentsFragment.T0().f12446k1;
                if (companyDetailsUI3 == null) {
                    companyDetailsUI3 = null;
                }
                CompanyDetailsUI.CompanyUI companyUI3 = companyDetailsUI3.f11192a;
                if ((companyUI3 != null ? companyUI3.f11245o0 : null) == null) {
                    CompanyDetailsUI companyDetailsUI4 = outgoingPaymentsFragment.T0().f12446k1;
                    if (companyDetailsUI4 == null) {
                        companyDetailsUI4 = null;
                    }
                    CompanyDetailsUI.CompanyUI companyUI4 = companyDetailsUI4.f11192a;
                    if (companyUI4 != null) {
                        companyUI4.f11245o0 = new HashMap();
                    }
                }
                if (f.b(string, outgoingPaymentsFragment.f12596q0.name() + "1")) {
                    if (outgoingPaymentsFragment.f12596q0 == OutgoingPaymentsFragment.State.f12608a) {
                        CreateCompanyUI.ContractorUI contractorUI = outgoingPaymentsFragment.f12597r0;
                        if (contractorUI == null) {
                            outgoingPaymentsFragment.f12597r0 = new CreateCompanyUI.ContractorUI(null, string3, null, null);
                        } else {
                            contractorUI.f11293b = String.valueOf(string3);
                        }
                        CompanyDetailsUI companyDetailsUI5 = outgoingPaymentsFragment.T0().f12446k1;
                        CompanyDetailsUI.CompanyUI companyUI5 = (companyDetailsUI5 != null ? companyDetailsUI5 : null).f11192a;
                        if (companyUI5 != null && (map6 = companyUI5.f11243n0) != null) {
                            map6.put(1, outgoingPaymentsFragment.f12597r0);
                        }
                    } else {
                        CreateCompanyUI.ContractorUI contractorUI2 = outgoingPaymentsFragment.f12599u0;
                        if (contractorUI2 == null) {
                            outgoingPaymentsFragment.f12599u0 = new CreateCompanyUI.ContractorUI(null, string3, null, null);
                        } else {
                            contractorUI2.f11293b = String.valueOf(string3);
                        }
                        CompanyDetailsUI companyDetailsUI6 = outgoingPaymentsFragment.T0().f12446k1;
                        CompanyDetailsUI.CompanyUI companyUI6 = (companyDetailsUI6 != null ? companyDetailsUI6 : null).f11192a;
                        if (companyUI6 != null && (map5 = companyUI6.f11245o0) != null) {
                            map5.put(1, outgoingPaymentsFragment.f12599u0);
                        }
                    }
                    outgoingPaymentsFragment.u0().f29472s.setText(string2);
                    outgoingPaymentsFragment.W0();
                } else {
                    if (f.b(string, outgoingPaymentsFragment.f12596q0.name() + "2")) {
                        if (outgoingPaymentsFragment.f12596q0 == OutgoingPaymentsFragment.State.f12608a) {
                            CreateCompanyUI.ContractorUI contractorUI3 = outgoingPaymentsFragment.s0;
                            if (contractorUI3 == null) {
                                outgoingPaymentsFragment.s0 = new CreateCompanyUI.ContractorUI(null, string3, null, null);
                            } else {
                                contractorUI3.f11293b = String.valueOf(string3);
                            }
                            CompanyDetailsUI companyDetailsUI7 = outgoingPaymentsFragment.T0().f12446k1;
                            CompanyDetailsUI.CompanyUI companyUI7 = (companyDetailsUI7 != null ? companyDetailsUI7 : null).f11192a;
                            if (companyUI7 != null && (map4 = companyUI7.f11243n0) != null) {
                                map4.put(2, outgoingPaymentsFragment.s0);
                            }
                        } else {
                            CreateCompanyUI.ContractorUI contractorUI4 = outgoingPaymentsFragment.f12600v0;
                            if (contractorUI4 == null) {
                                outgoingPaymentsFragment.f12600v0 = new CreateCompanyUI.ContractorUI(null, string3, null, null);
                            } else {
                                contractorUI4.f11293b = String.valueOf(string3);
                            }
                            CompanyDetailsUI companyDetailsUI8 = outgoingPaymentsFragment.T0().f12446k1;
                            CompanyDetailsUI.CompanyUI companyUI8 = (companyDetailsUI8 != null ? companyDetailsUI8 : null).f11192a;
                            if (companyUI8 != null && (map3 = companyUI8.f11245o0) != null) {
                                map3.put(2, outgoingPaymentsFragment.f12600v0);
                            }
                        }
                        outgoingPaymentsFragment.u0().f29473t.setText(string2);
                    } else {
                        if (f.b(string, outgoingPaymentsFragment.f12596q0.name() + "3")) {
                            if (outgoingPaymentsFragment.f12596q0 == OutgoingPaymentsFragment.State.f12608a) {
                                CreateCompanyUI.ContractorUI contractorUI5 = outgoingPaymentsFragment.f12598t0;
                                if (contractorUI5 == null) {
                                    outgoingPaymentsFragment.f12598t0 = new CreateCompanyUI.ContractorUI(null, string3, null, null);
                                } else {
                                    contractorUI5.f11293b = String.valueOf(string3);
                                }
                                CompanyDetailsUI companyDetailsUI9 = outgoingPaymentsFragment.T0().f12446k1;
                                CompanyDetailsUI.CompanyUI companyUI9 = (companyDetailsUI9 != null ? companyDetailsUI9 : null).f11192a;
                                if (companyUI9 != null && (map2 = companyUI9.f11243n0) != null) {
                                    map2.put(3, outgoingPaymentsFragment.f12598t0);
                                }
                            } else {
                                CreateCompanyUI.ContractorUI contractorUI6 = outgoingPaymentsFragment.f12601w0;
                                if (contractorUI6 == null) {
                                    outgoingPaymentsFragment.f12601w0 = new CreateCompanyUI.ContractorUI(null, string3, null, null);
                                } else {
                                    contractorUI6.f11293b = String.valueOf(string3);
                                }
                                CompanyDetailsUI companyDetailsUI10 = outgoingPaymentsFragment.T0().f12446k1;
                                CompanyDetailsUI.CompanyUI companyUI10 = (companyDetailsUI10 != null ? companyDetailsUI10 : null).f11192a;
                                if (companyUI10 != null && (map = companyUI10.f11245o0) != null) {
                                    map.put(3, outgoingPaymentsFragment.f12601w0);
                                }
                            }
                            outgoingPaymentsFragment.u0().f29474u.setText(string2);
                        }
                    }
                }
                outgoingPaymentsFragment.W0();
                return p.f3034a;
            }
        });
        AbstractC1414p5 u03 = u0();
        o.c(u03.f29467n, 500L, new InterfaceC0635a() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.b
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                OutgoingPaymentsFragment outgoingPaymentsFragment = OutgoingPaymentsFragment.this;
                if (outgoingPaymentsFragment.W0()) {
                    int ordinal = outgoingPaymentsFragment.f12596q0.ordinal();
                    if (ordinal == 0) {
                        NewCompanyViewModel T03 = outgoingPaymentsFragment.T0();
                        CompanyDetailsUI companyDetailsUI = outgoingPaymentsFragment.T0().f12446k1;
                        if (companyDetailsUI == null) {
                            companyDetailsUI = null;
                        }
                        CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                        O7.b bVar = new O7.b(T03, String.valueOf(companyUI != null ? companyUI.f11218a : null), 0);
                        T03.f12422B1 = bVar;
                        bVar.invoke();
                    } else {
                        if (ordinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        outgoingPaymentsFragment.u0().f29469p.requestFocus();
                        outgoingPaymentsFragment.f12596q0 = OutgoingPaymentsFragment.State.f12608a;
                        outgoingPaymentsFragment.U0();
                        outgoingPaymentsFragment.L0();
                    }
                }
                return p.f3034a;
            }
        });
        AbstractC1414p5 u04 = u0();
        o.c(u04.f29468o, 500L, new U7.b(this, 0));
        W0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12593n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f29467n.setVisibility(0);
        o.b(u0().f29468o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f29467n);
        u0().f29468o.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            OutgoingPaymentsFragment outgoingPaymentsFragment = OutgoingPaymentsFragment.this;
            if (outgoingPaymentsFragment.f12596q0 == State.f12608a) {
                CreateCompanyUI.ContractorUI contractorUI = outgoingPaymentsFragment.f12597r0;
                if (contractorUI == null) {
                    outgoingPaymentsFragment.f12597r0 = new CreateCompanyUI.ContractorUI(String.valueOf(charSequence), null, null, null);
                } else if (contractorUI != null) {
                    contractorUI.f11292a = String.valueOf(charSequence);
                }
            } else {
                CreateCompanyUI.ContractorUI contractorUI2 = outgoingPaymentsFragment.f12599u0;
                if (contractorUI2 == null) {
                    outgoingPaymentsFragment.f12599u0 = new CreateCompanyUI.ContractorUI(String.valueOf(charSequence), null, null, null);
                } else if (contractorUI2 != null) {
                    contractorUI2.f11292a = String.valueOf(charSequence);
                }
            }
            outgoingPaymentsFragment.W0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            OutgoingPaymentsFragment outgoingPaymentsFragment = OutgoingPaymentsFragment.this;
            if (outgoingPaymentsFragment.f12596q0 == State.f12608a) {
                CreateCompanyUI.ContractorUI contractorUI = outgoingPaymentsFragment.f12597r0;
                if (contractorUI == null) {
                    outgoingPaymentsFragment.f12597r0 = new CreateCompanyUI.ContractorUI(null, null, String.valueOf(charSequence), null);
                } else if (contractorUI != null) {
                    contractorUI.f11294c = String.valueOf(charSequence);
                }
            } else {
                CreateCompanyUI.ContractorUI contractorUI2 = outgoingPaymentsFragment.f12599u0;
                if (contractorUI2 == null) {
                    outgoingPaymentsFragment.f12599u0 = new CreateCompanyUI.ContractorUI(null, null, String.valueOf(charSequence), null);
                } else if (contractorUI2 != null) {
                    contractorUI2.f11294c = String.valueOf(charSequence);
                }
            }
            outgoingPaymentsFragment.W0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            OutgoingPaymentsFragment outgoingPaymentsFragment = OutgoingPaymentsFragment.this;
            if (outgoingPaymentsFragment.f12596q0 == State.f12608a) {
                CreateCompanyUI.ContractorUI contractorUI = outgoingPaymentsFragment.s0;
                if (contractorUI == null) {
                    outgoingPaymentsFragment.s0 = new CreateCompanyUI.ContractorUI(String.valueOf(charSequence), null, null, null);
                    return;
                } else {
                    if (contractorUI != null) {
                        contractorUI.f11292a = String.valueOf(charSequence);
                        return;
                    }
                    return;
                }
            }
            CreateCompanyUI.ContractorUI contractorUI2 = outgoingPaymentsFragment.f12600v0;
            if (contractorUI2 == null) {
                outgoingPaymentsFragment.f12600v0 = new CreateCompanyUI.ContractorUI(String.valueOf(charSequence), null, null, null);
            } else if (contractorUI2 != null) {
                contractorUI2.f11292a = String.valueOf(charSequence);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            OutgoingPaymentsFragment outgoingPaymentsFragment = OutgoingPaymentsFragment.this;
            if (outgoingPaymentsFragment.f12596q0 == State.f12608a) {
                CreateCompanyUI.ContractorUI contractorUI = outgoingPaymentsFragment.s0;
                if (contractorUI == null) {
                    outgoingPaymentsFragment.s0 = new CreateCompanyUI.ContractorUI(null, null, String.valueOf(charSequence), null);
                    return;
                } else {
                    if (contractorUI != null) {
                        contractorUI.f11294c = String.valueOf(charSequence);
                        return;
                    }
                    return;
                }
            }
            CreateCompanyUI.ContractorUI contractorUI2 = outgoingPaymentsFragment.f12600v0;
            if (contractorUI2 == null) {
                outgoingPaymentsFragment.f12600v0 = new CreateCompanyUI.ContractorUI(null, null, String.valueOf(charSequence), null);
            } else if (contractorUI2 != null) {
                contractorUI2.f11294c = String.valueOf(charSequence);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            OutgoingPaymentsFragment outgoingPaymentsFragment = OutgoingPaymentsFragment.this;
            if (outgoingPaymentsFragment.f12596q0 == State.f12608a) {
                CreateCompanyUI.ContractorUI contractorUI = outgoingPaymentsFragment.f12598t0;
                if (contractorUI == null) {
                    outgoingPaymentsFragment.f12598t0 = new CreateCompanyUI.ContractorUI(String.valueOf(charSequence), null, null, null);
                    return;
                } else {
                    if (contractorUI != null) {
                        contractorUI.f11292a = String.valueOf(charSequence);
                        return;
                    }
                    return;
                }
            }
            CreateCompanyUI.ContractorUI contractorUI2 = outgoingPaymentsFragment.f12601w0;
            if (contractorUI2 == null) {
                outgoingPaymentsFragment.f12601w0 = new CreateCompanyUI.ContractorUI(String.valueOf(charSequence), null, null, null);
            } else if (contractorUI2 != null) {
                contractorUI2.f11292a = String.valueOf(charSequence);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            OutgoingPaymentsFragment outgoingPaymentsFragment = OutgoingPaymentsFragment.this;
            if (outgoingPaymentsFragment.f12596q0 == State.f12608a) {
                CreateCompanyUI.ContractorUI contractorUI = outgoingPaymentsFragment.f12598t0;
                if (contractorUI == null) {
                    outgoingPaymentsFragment.f12598t0 = new CreateCompanyUI.ContractorUI(null, null, String.valueOf(charSequence), null);
                    return;
                } else {
                    if (contractorUI != null) {
                        contractorUI.f11294c = String.valueOf(charSequence);
                        return;
                    }
                    return;
                }
            }
            CreateCompanyUI.ContractorUI contractorUI2 = outgoingPaymentsFragment.f12601w0;
            if (contractorUI2 == null) {
                outgoingPaymentsFragment.f12601w0 = new CreateCompanyUI.ContractorUI(null, null, String.valueOf(charSequence), null);
            } else if (contractorUI2 != null) {
                contractorUI2.f11294c = String.valueOf(charSequence);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
