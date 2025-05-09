package com.luminary.business.presentation.ui.fragments.support;

import O9.f;
import U4.b;
import android.os.Bundle;
import android.view.View;
import ca.InterfaceC0635a;
import com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.support.SupportController;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import g8.g;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.jvm.internal.h;
import t6.AbstractC1351h6;

/* compiled from: SupportFragment.kt */
/* loaded from: classes2.dex */
public final class SupportFragment extends BaseFragment<AbstractC1351h6> {

    /* renamed from: o0, reason: collision with root package name */
    public SupportController f13113o0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f13112n0 = R.layout.fragment_support;

    /* renamed from: p0, reason: collision with root package name */
    public final f f13114p0 = a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<K5.a>() { // from class: com.luminary.business.presentation.ui.fragments.support.SupportFragment$special$$inlined$inject$default$1
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [K5.a, java.lang.Object] */
        @Override // ca.InterfaceC0635a
        public final K5.a invoke() {
            return b.l(this).a(null, null, h.a(K5.a.class));
        }
    });

    /* renamed from: q0, reason: collision with root package name */
    public final List<SupportController.a> f13115q0 = Collections.singletonList(new SupportController.a(new g(this, 18)));

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.hub_support);
        toolbarStatus.f13265c = 28;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = false;
        toolbarStatus.f13263a = getString(R.string.hub_support);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f13113o0 = new SupportController(requireContext());
        u0().f29077n.setLayoutManager(new StickyHeaderLinearLayoutManager(requireContext(), 0, false, 6, null));
        AbstractC1351h6 u02 = u0();
        SupportController supportController = this.f13113o0;
        if (supportController == null) {
            supportController = null;
        }
        u02.f29077n.setAdapter(supportController.getAdapter());
        SupportController supportController2 = this.f13113o0;
        SupportController supportController3 = supportController2 != null ? supportController2 : null;
        List<SupportController.a> list = this.f13115q0;
        supportController3.setData(list, Integer.valueOf(list.size()));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f13112n0;
    }
}
