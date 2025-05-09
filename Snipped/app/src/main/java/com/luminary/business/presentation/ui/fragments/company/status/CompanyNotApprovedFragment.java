package com.luminary.business.presentation.ui.fragments.company.status;

import B6.g;
import D9.b;
import F8.o;
import Fa.h;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.Fragment;
import c7.C0627a;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import t6.AbstractC1340g3;

/* compiled from: CompanyNotApprovedFragment.kt */
/* loaded from: classes2.dex */
public final class CompanyNotApprovedFragment extends BaseFragment<AbstractC1340g3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11904n0 = R.layout.fragment_company_not_approved;

    /* renamed from: o0, reason: collision with root package name */
    public final h f11905o0 = new h(kotlin.jvm.internal.h.a(C0627a.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.company.status.CompanyNotApprovedFragment$special$$inlined$navArgs$1
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
        toolbarStatus.f13263a = getString(R.string.company_not_approved);
        toolbarStatus.f13266d = getString(R.string.please_contact_customer_support_or_delete_this_application);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC1340g3 u02 = u0();
        h hVar = this.f11905o0;
        u02.f29024q.setText(((C0627a) hVar.getValue()).f8580a);
        u02.f29026s.setText(b.U(((C0627a) hVar.getValue()).f8580a));
        u02.f29023p.setText(((C0627a) hVar.getValue()).f8581b);
        u02.f29025r.setText(((C0627a) hVar.getValue()).f8582c);
        AbstractC1340g3 u03 = u0();
        o.c(u03.f29021n, 500L, new A8.b(this, 20));
        AbstractC1340g3 u04 = u0();
        o.c(u04.f29022o, 500L, new g(9));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11904n0;
    }
}
