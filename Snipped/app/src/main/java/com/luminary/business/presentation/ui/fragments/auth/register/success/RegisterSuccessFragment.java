package com.luminary.business.presentation.ui.fragments.auth.register.success;

import A8.b;
import F8.o;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.n;
import com.bumptech.glide.Glide;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.register.success.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import ka.C0969n;
import t6.AbstractC1479y5;

/* compiled from: RegisterSuccessFragment.kt */
/* loaded from: classes2.dex */
public final class RegisterSuccessFragment extends BaseFragment<AbstractC1479y5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11695n0 = R.layout.fragment_register_success;

    /* renamed from: o0, reason: collision with root package name */
    public a f11696o0;

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = false;
        toolbarStatus.f13263a = getString(R.string.registration_successful);
        toolbarStatus.f13266d = "\n";
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.registration_successful);
        toolbarStatus.f13267e = false;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11696o0 = a.C0116a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RegisterSuccessUI registerSuccessUI;
        String str;
        super.onViewCreated(view, bundle);
        a aVar = this.f11696o0;
        if (aVar != null && (registerSuccessUI = aVar.f11697a) != null) {
            AbstractC1479y5 u02 = u0();
            u02.f29873q.setText(registerSuccessUI.f11360a + " " + registerSuccessUI.f11361b);
            a aVar2 = this.f11696o0;
            u02.f29872p.setText(aVar2 != null ? aVar2.f11698b : null);
            a aVar3 = this.f11696o0;
            String n02 = (aVar3 == null || (str = aVar3.f11699c) == null) ? null : C0969n.n0(str, "+");
            a aVar4 = this.f11696o0;
            u02.f29874r.setText(n.a("+", n02, aVar4 != null ? aVar4.f11700d : null));
        }
        Glide.with(requireContext()).load("file:///android_asset/ok.gif").into(u0().f29871o);
        o.c(u0().f29870n, 500L, new b(this, 7));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11695n0;
    }
}
