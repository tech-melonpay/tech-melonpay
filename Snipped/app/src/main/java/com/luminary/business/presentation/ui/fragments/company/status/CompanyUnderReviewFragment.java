package com.luminary.business.presentation.ui.fragments.company.status;

import Fa.h;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.Fragment;
import c7.C0628b;
import ca.InterfaceC0635a;
import com.bumptech.glide.Glide;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import t6.AbstractC1356i3;

/* compiled from: CompanyUnderReviewFragment.kt */
/* loaded from: classes2.dex */
public final class CompanyUnderReviewFragment extends BaseFragment<AbstractC1356i3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11907n0 = R.layout.fragment_company_under_review;

    /* renamed from: o0, reason: collision with root package name */
    public final h f11908o0 = new h(kotlin.jvm.internal.h.a(C0628b.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.company.status.CompanyUnderReviewFragment$special$$inlined$navArgs$1
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

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.company_under_review);
        toolbarStatus.f13266d = getString(R.string.we_are_reviewing_the_information_you_have_submitted);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC1356i3 u02 = u0();
        h hVar = this.f11908o0;
        u02.f29102p.setText(((C0628b) hVar.getValue()).f8583a);
        u02.f29101o.setText(((C0628b) hVar.getValue()).f8584b);
        u02.f29103q.setText(((C0628b) hVar.getValue()).f8585c);
        Glide.with(requireContext()).load("file:///android_asset/clock.gif").into(u0().f29100n);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11907n0;
    }
}
