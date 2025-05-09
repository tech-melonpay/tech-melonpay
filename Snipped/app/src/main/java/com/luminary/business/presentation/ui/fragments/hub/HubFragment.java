package com.luminary.business.presentation.ui.fragments.hub;

import C.v;
import K5.a;
import O9.f;
import P9.m;
import U4.b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import ca.InterfaceC0635a;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.h;
import t6.AbstractC1293a4;

/* compiled from: HubFragment.kt */
/* loaded from: classes2.dex */
public final class HubFragment extends BaseFragment<AbstractC1293a4> {

    /* renamed from: p0, reason: collision with root package name */
    public HubController f12270p0;

    /* renamed from: r0, reason: collision with root package name */
    public int f12272r0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f12268n0 = R.layout.fragment_hub;

    /* renamed from: o0, reason: collision with root package name */
    public final boolean f12269o0 = true;

    /* renamed from: q0, reason: collision with root package name */
    public final f f12271q0 = kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<K5.a>() { // from class: com.luminary.business.presentation.ui.fragments.hub.HubFragment$special$$inlined$inject$default$1
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [K5.a, java.lang.Object] */
        @Override // ca.InterfaceC0635a
        public final a invoke() {
            return b.l(this).a(null, null, h.a(a.class));
        }
    });
    public final List<Apps> s0 = T0();

    /* compiled from: HubFragment.kt */
    public static final class Apps {

        /* renamed from: a, reason: collision with root package name */
        public final int f12274a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12275b;

        /* renamed from: d, reason: collision with root package name */
        public final AppsType f12277d;

        /* renamed from: c, reason: collision with root package name */
        public final int f12276c = -1;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f12278e = false;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HubFragment.kt */
        public static final class AppsType {

            /* renamed from: a, reason: collision with root package name */
            public static final AppsType f12279a;

            /* renamed from: b, reason: collision with root package name */
            public static final AppsType f12280b;

            /* renamed from: c, reason: collision with root package name */
            public static final AppsType f12281c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ AppsType[] f12282d;

            static {
                AppsType appsType = new AppsType("FINANCE", 0);
                f12279a = appsType;
                AppsType appsType2 = new AppsType("BUSINESS_TOOLS", 1);
                f12280b = appsType2;
                AppsType appsType3 = new AppsType("SETTINGS", 2);
                f12281c = appsType3;
                f12282d = new AppsType[]{appsType, appsType2, appsType3};
            }

            public AppsType() {
                throw null;
            }

            public static AppsType valueOf(String str) {
                return (AppsType) Enum.valueOf(AppsType.class, str);
            }

            public static AppsType[] values() {
                return (AppsType[]) f12282d.clone();
            }
        }

        public Apps(int i, int i9, AppsType appsType) {
            this.f12274a = i;
            this.f12275b = i9;
            this.f12277d = appsType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Apps)) {
                return false;
            }
            Apps apps = (Apps) obj;
            return this.f12274a == apps.f12274a && this.f12275b == apps.f12275b && this.f12276c == apps.f12276c && this.f12277d == apps.f12277d && this.f12278e == apps.f12278e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12278e) + ((this.f12277d.hashCode() + v.b(this.f12276c, v.b(this.f12275b, Integer.hashCode(this.f12274a) * 31, 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Apps(name=");
            sb2.append(this.f12274a);
            sb2.append(", image=");
            sb2.append(this.f12275b);
            sb2.append(", imageB=");
            sb2.append(this.f12276c);
            sb2.append(", type=");
            sb2.append(this.f12277d);
            sb2.append(", isSmall=");
            return com.google.android.gms.measurement.internal.a.k(sb2, this.f12278e, ")");
        }
    }

    /* compiled from: HubFragment.kt */
    public static final class a implements TabLayout.d {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
        @Override // com.google.android.material.tabs.TabLayout.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.google.android.material.tabs.TabLayout.g r6) {
            /*
                r5 = this;
                com.luminary.business.presentation.ui.fragments.hub.HubFragment r0 = com.luminary.business.presentation.ui.fragments.hub.HubFragment.this
                android.view.View r1 = r0.getView()
                if (r1 != 0) goto L9
                return
            L9:
                r1 = 0
                if (r6 == 0) goto Lf
                int r2 = r6.f9855d
                goto L10
            Lf:
                r2 = r1
            L10:
                r0.f12272r0 = r2
                java.util.List r2 = r0.T0()
                if (r6 == 0) goto L1a
                int r1 = r6.f9855d
            L1a:
                r6 = 1
                if (r1 == r6) goto L6a
                r6 = 2
                if (r1 == r6) goto L48
                r6 = 3
                if (r1 == r6) goto L24
                goto L8c
            L24:
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r1 = r2.iterator()
            L2f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L46
                java.lang.Object r2 = r1.next()
                r3 = r2
                com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps r3 = (com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps) r3
                com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r3 = r3.f12277d
                com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r4 = com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps.AppsType.f12281c
                if (r3 != r4) goto L2f
                r6.add(r2)
                goto L2f
            L46:
                r2 = r6
                goto L8c
            L48:
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r1 = r2.iterator()
            L53:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L46
                java.lang.Object r2 = r1.next()
                r3 = r2
                com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps r3 = (com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps) r3
                com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r3 = r3.f12277d
                com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r4 = com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps.AppsType.f12280b
                if (r3 != r4) goto L53
                r6.add(r2)
                goto L53
            L6a:
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r1 = r2.iterator()
            L75:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L46
                java.lang.Object r2 = r1.next()
                r3 = r2
                com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps r3 = (com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps) r3
                com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r3 = r3.f12277d
                com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r4 = com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps.AppsType.f12279a
                if (r3 != r4) goto L75
                r6.add(r2)
                goto L75
            L8c:
                com.luminary.business.presentation.ui.fragments.hub.HubController r6 = r0.f12270p0
                if (r6 != 0) goto L91
                r6 = 0
            L91:
                int r1 = r0.f12272r0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r6.setData(r2, r1)
                F0.f r6 = r0.u0()
                t6.a4 r6 = (t6.AbstractC1293a4) r6
                B2.d r1 = new B2.d
                r2 = 4
                r1.<init>(r0, r2)
                r2 = 200(0xc8, double:9.9E-322)
                com.airbnb.epoxy.EpoxyRecyclerView r6 = r6.f28794n
                r6.postDelayed(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.hub.HubFragment.a.a(com.google.android.material.tabs.TabLayout$g):void");
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        return false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = false;
        toolbarStatus.f13263a = getString(((K5.a) this.f12271q0.getValue()).E() ? R.string.crypto_hub : R.string.fiat_hub);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 28;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = false;
        toolbarStatus.f13263a = getString(((K5.a) this.f12271q0.getValue()).E() ? R.string.crypto_hub : R.string.fiat_hub);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final List<Apps> T0() {
        if (((K5.a) this.f12271q0.getValue()).E()) {
            Apps.AppsType appsType = Apps.AppsType.f12281c;
            return m.q(new Apps(R.string.hub_rates, R.drawable.ic_hub_rates, appsType), new Apps(R.string.hub_support, R.drawable.ic_hub_support, appsType), new Apps(R.string.hub_settings, R.drawable.ic_hub_profile, appsType), new Apps(R.string.hub_fiat, R.drawable.ic_hub_fiat, appsType));
        }
        Apps apps = new Apps(R.string.hub_exchange, R.drawable.ic_hub_exchange, Apps.AppsType.f12279a);
        Apps.AppsType appsType2 = Apps.AppsType.f12280b;
        Apps apps2 = new Apps(R.string.hub_statements, R.drawable.ic_hub_statements, appsType2);
        Apps apps3 = new Apps(R.string.hub_invoices, R.drawable.ic_hub_invoices, appsType2);
        Apps.AppsType appsType3 = Apps.AppsType.f12281c;
        return m.q(apps, apps2, apps3, new Apps(R.string.hub_support, R.drawable.ic_hub_support, appsType3), new Apps(R.string.hub_settings, R.drawable.ic_hub_profile, appsType3), new Apps(R.string.hub_crypto, R.drawable.ic_hub_crypto, appsType2));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() {
        /*
            r5 = this;
            super.onResume()
            r0 = 2131363018(0x7f0a04ca, float:1.8345833E38)
            r5.M0(r0)
            java.util.List r0 = r5.T0()
            int r1 = r5.f12272r0
            r2 = 1
            if (r1 == r2) goto L5f
            r2 = 2
            if (r1 == r2) goto L3d
            r2 = 3
            if (r1 == r2) goto L19
            goto L81
        L19:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps r3 = (com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps) r3
            com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r3 = r3.f12277d
            com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r4 = com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps.AppsType.f12281c
            if (r3 != r4) goto L24
            r1.add(r2)
            goto L24
        L3b:
            r0 = r1
            goto L81
        L3d:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L48:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps r3 = (com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps) r3
            com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r3 = r3.f12277d
            com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r4 = com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps.AppsType.f12280b
            if (r3 != r4) goto L48
            r1.add(r2)
            goto L48
        L5f:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L6a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps r3 = (com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps) r3
            com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r3 = r3.f12277d
            com.luminary.business.presentation.ui.fragments.hub.HubFragment$Apps$AppsType r4 = com.luminary.business.presentation.ui.fragments.hub.HubFragment.Apps.AppsType.f12279a
            if (r3 != r4) goto L6a
            r1.add(r2)
            goto L6a
        L81:
            com.luminary.business.presentation.ui.fragments.hub.HubController r1 = r5.f12270p0
            if (r1 != 0) goto L86
            r1 = 0
        L86:
            int r2 = r5.f12272r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setData(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.hub.HubFragment.onResume():void");
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        HubController hubController = new HubController(requireContext(), new a(), new C7.a(this, 0));
        this.f12270p0 = hubController;
        hubController.setSpanCount(2);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), getResources().getInteger(R.integer.hub_span_count));
        HubController hubController2 = this.f12270p0;
        if (hubController2 == null) {
            hubController2 = null;
        }
        gridLayoutManager.f7419g = hubController2.getSpanSizeLookup();
        u0().f28794n.setLayoutManager(gridLayoutManager);
        AbstractC1293a4 u02 = u0();
        HubController hubController3 = this.f12270p0;
        if (hubController3 == null) {
            hubController3 = null;
        }
        u02.f28794n.setAdapter(hubController3.getAdapter());
        List<Apps> T02 = T0();
        HubController hubController4 = this.f12270p0;
        (hubController4 != null ? hubController4 : null).setData(T02, Integer.valueOf(this.f12272r0));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12268n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean x0() {
        return this.f12269o0;
    }
}
