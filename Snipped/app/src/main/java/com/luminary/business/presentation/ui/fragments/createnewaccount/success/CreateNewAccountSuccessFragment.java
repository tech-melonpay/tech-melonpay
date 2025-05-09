package com.luminary.business.presentation.ui.fragments.createnewaccount.success;

import A8.b;
import F8.o;
import Fa.h;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.Fragment;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import g7.C0770a;
import kotlin.jvm.internal.f;
import t6.AbstractC1463w3;

/* compiled from: CreateNewAccountSuccessFragment.kt */
/* loaded from: classes2.dex */
public final class CreateNewAccountSuccessFragment extends BaseFragment<AbstractC1463w3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11936n0 = R.layout.fragment_create_new_account_success;

    /* renamed from: o0, reason: collision with root package name */
    public final h f11937o0 = new h(kotlin.jvm.internal.h.a(C0770a.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.createnewaccount.success.CreateNewAccountSuccessFragment$special$$inlined$navArgs$1
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
        ToolbarStatus.a.a();
        return ToolbarStatus.gone;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC1463w3 u02 = u0();
        String str = ((C0770a) this.f11937o0.getValue()).f20810a;
        boolean b9 = f.b(str, "gbp");
        TextView textView = u02.f29739p;
        ImageView imageView = u02.f29738o;
        if (b9) {
            imageView.setImageResource(R.drawable.img_pounds);
            textView.setText(getString(R.string.your_gbp_account_is_ready));
        } else if (f.b(str, "eur")) {
            imageView.setImageResource(R.drawable.img_euro);
            textView.setText(getString(R.string.your_eur_account_is_ready));
        }
        o.c(u02.f29737n, 500L, new b(this, 29));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11936n0;
    }
}
