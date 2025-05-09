package com.luminary.business.presentation.ui.fragments.status;

import C.v;
import F8.o;
import android.os.Bundle;
import android.view.View;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import g8.g;
import org.bouncycastle.i18n.MessageBundle;
import q8.C1139a;
import t6.AbstractC1319d6;

/* compiled from: StatusFragment.kt */
/* loaded from: classes2.dex */
public final class StatusFragment extends BaseFragment<AbstractC1319d6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f13106n0 = R.layout.fragment_status;

    /* renamed from: o0, reason: collision with root package name */
    public C1139a f13107o0;

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.a();
        return ToolbarStatus.gone;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!v.y(arguments, C1139a.class, MessageBundle.TITLE_ENTRY)) {
                throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
            }
            String string = arguments.getString(MessageBundle.TITLE_ENTRY);
            if (string == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
            }
            this.f13107o0 = new C1139a(string);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        C1139a c1139a = this.f13107o0;
        if (c1139a != null && (str = c1139a.f25929a) != null) {
            u0().f28945p.setText(str);
        }
        o.c(u0().f28943n, 500L, new g(this, 16));
        u0().f28944o.setImageResource(requireContext().getResources().getBoolean(R.bool.isLuminary) ? R.drawable.img_transfer_success_luminary : R.drawable.img_transfer_success);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f13106n0;
    }
}
