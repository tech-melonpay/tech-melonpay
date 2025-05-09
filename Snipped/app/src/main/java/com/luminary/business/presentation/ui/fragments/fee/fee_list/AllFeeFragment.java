package com.luminary.business.presentation.ui.fragments.fee.fee_list;

import C.v;
import F8.o;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.os.Parcelable;
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
import com.luminary.business.domain.entity.account.FeeDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.fee.fee_list.AllFeeFragment;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.StickyHeaderLinearLayoutManager;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import f7.ViewOnScrollChangeListenerC0749c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0969n;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import t6.K2;
import y6.C1616b;
import z7.C1650b;

/* compiled from: AllFeeFragment.kt */
/* loaded from: classes2.dex */
public final class AllFeeFragment extends BaseFragment<K2> {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f12229t0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f12230n0 = R.layout.fragment_all_transactions;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12231o0;

    /* renamed from: p0, reason: collision with root package name */
    public AllFeeController f12232p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f12233q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f12234r0;
    public final boolean s0;

    /* compiled from: AllFeeFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12239a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f12239a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12239a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12239a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.fee.fee_list.AllFeeFragment$special$$inlined$viewModel$default$1] */
    public AllFeeFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.fee.fee_list.AllFeeFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12231o0 = E.a(this, h.a(C1650b.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.fee.fee_list.AllFeeFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.fee.fee_list.AllFeeFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C1650b.class), null, null, b.l(this));
            }
        });
        this.f12233q0 = "";
        this.f12234r0 = "";
        this.s0 = true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.outstanding_fees);
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
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13263a = getString(R.string.outstanding_fees);
        return toolbarStatus;
    }

    public final C1650b T0() {
        return (C1650b) this.f12231o0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final void U0(List<FeeDomain> list) {
        ?? r32;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((FeeDomain) it.next()).f10740d = getString(R.string.monthly_fee);
            }
        }
        u0().f28067q.setRefreshing(false);
        V0();
        if (this.f12233q0.length() == 0) {
            r32 = list;
        } else if (list != null) {
            r32 = new ArrayList();
            for (Object obj : list) {
                FeeDomain feeDomain = (FeeDomain) obj;
                String str = feeDomain.f10737a;
                if (str != null) {
                    Locale locale = Locale.ROOT;
                    if (C0969n.Y(str.toLowerCase(locale), this.f12233q0.toLowerCase(locale), false)) {
                        r32.add(obj);
                    }
                }
                String valueOf = String.valueOf(feeDomain.f10739c);
                Locale locale2 = Locale.ROOT;
                if (!C0969n.Y(valueOf.toLowerCase(locale2), this.f12233q0.toLowerCase(locale2), false)) {
                    String str2 = feeDomain.f10740d;
                    if (str2 != null && C0969n.Y(str2.toLowerCase(locale2), this.f12233q0.toLowerCase(locale2), false)) {
                    }
                }
                r32.add(obj);
            }
        } else {
            r32 = 0;
        }
        AllFeeController allFeeController = this.f12232p0;
        (allFeeController != null ? allFeeController : null).setData(r32);
        List<FeeDomain> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            o.b(u0().f28064n);
            o.b(u0().f28068r);
            return;
        }
        u0().f28064n.setVisibility(0);
        if (this.s0) {
            u0().f28068r.setVisibility(0);
        } else {
            o.b(u0().f28068r);
        }
    }

    public final void V0() {
        u0().f28065o.setText((this.f12233q0.length() <= 0 && this.f12234r0.length() <= 0) ? getString(R.string.you_do_not_have_any_transactions_yet) : getString(R.string.nothing_is_found));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, B6.a
    public final void m0() {
        this.f12233q0 = "";
        this.f12234r0 = "";
        L0();
        o0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        M0(R.id.navigation_payments);
        U0(T0().f31338V0.getValue());
        if (this.f12233q0.length() > 0) {
            I0(this.f12233q0);
        } else if (this.f12234r0.length() > 0) {
            I0(this.f12234r0);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        this.f12232p0 = new AllFeeController(requireContext(), new InterfaceC0646l(this) { // from class: z7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllFeeFragment f31335b;

            {
                this.f31335b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        Serializable serializable = (FeeDomain) obj;
                        NavController g10 = U4.b.g(this.f31335b);
                        Bundle g11 = v.g(g10);
                        if (Parcelable.class.isAssignableFrom(FeeDomain.class)) {
                            g11.putParcelable("fee", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(FeeDomain.class)) {
                                throw new UnsupportedOperationException(FeeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g11.putSerializable("fee", serializable);
                        }
                        g10.i(R.id.action_allFeeFragment_to_feeDetailsFragment, g11);
                        return p.f3034a;
                    case 1:
                        this.f31335b.getClass();
                        return p.f3034a;
                    default:
                        this.f31335b.U0((List) obj);
                        return p.f3034a;
                }
            }
        });
        u0().f28065o.setText(getString(R.string.you_do_not_have_any_saved_beneficiaries_yet));
        if (getView() != null) {
            U0(null);
            BuildersKt__Builders_commonKt.launch$default(C0552s.a(getViewLifecycleOwner()), Dispatchers.getMain(), null, new AllFeeFragment$onViewCreated$2(this, null), 2, null);
        }
        final int i9 = 1;
        T0().f426S0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: z7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllFeeFragment f31335b;

            {
                this.f31335b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        Serializable serializable = (FeeDomain) obj;
                        NavController g10 = U4.b.g(this.f31335b);
                        Bundle g11 = v.g(g10);
                        if (Parcelable.class.isAssignableFrom(FeeDomain.class)) {
                            g11.putParcelable("fee", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(FeeDomain.class)) {
                                throw new UnsupportedOperationException(FeeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g11.putSerializable("fee", serializable);
                        }
                        g10.i(R.id.action_allFeeFragment_to_feeDetailsFragment, g11);
                        return p.f3034a;
                    case 1:
                        this.f31335b.getClass();
                        return p.f3034a;
                    default:
                        this.f31335b.U0((List) obj);
                        return p.f3034a;
                }
            }
        }));
        u0().f28066p.setLayoutManager(new StickyHeaderLinearLayoutManager(requireContext()));
        K2 u02 = u0();
        AllFeeController allFeeController = this.f12232p0;
        u02.f28066p.setAdapter((allFeeController != null ? allFeeController : null).getAdapter());
        u0().f28067q.setColorSchemeResources(R.color.main_color);
        u0().f28067q.setOnRefreshListener(new C1616b(this));
        final int i10 = 2;
        T0().f31338V0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: z7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllFeeFragment f31335b;

            {
                this.f31335b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        Serializable serializable = (FeeDomain) obj;
                        NavController g10 = U4.b.g(this.f31335b);
                        Bundle g11 = v.g(g10);
                        if (Parcelable.class.isAssignableFrom(FeeDomain.class)) {
                            g11.putParcelable("fee", (Parcelable) serializable);
                        } else {
                            if (!Serializable.class.isAssignableFrom(FeeDomain.class)) {
                                throw new UnsupportedOperationException(FeeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            g11.putSerializable("fee", serializable);
                        }
                        g10.i(R.id.action_allFeeFragment_to_feeDetailsFragment, g11);
                        return p.f3034a;
                    case 1:
                        this.f31335b.getClass();
                        return p.f3034a;
                    default:
                        this.f31335b.U0((List) obj);
                        return p.f3034a;
                }
            }
        }));
        u0().f28066p.setOnScrollChangeListener(new ViewOnScrollChangeListenerC0749c(2));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12230n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean x0() {
        return false;
    }
}
