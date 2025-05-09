package com.luminary.business.presentation.ui.fragments.newcard.successorder;

import A8.b;
import C.v;
import F8.o;
import N7.a;
import android.os.Bundle;
import android.view.View;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import t6.AbstractC1398n5;

/* compiled from: OrderSuccessFragment.kt */
/* loaded from: classes2.dex */
public final class OrderSuccessFragment extends BaseFragment<AbstractC1398n5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12419n0 = R.layout.fragment_order_success;

    /* renamed from: o0, reason: collision with root package name */
    public a f12420o0;

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
            if (!v.y(arguments, a.class, "cardType")) {
                throw new IllegalArgumentException("Required argument \"cardType\" is missing and does not have an android:defaultValue");
            }
            this.f12420o0 = new a(arguments.getInt("cardType"));
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        a aVar = this.f12420o0;
        if (aVar != null) {
            u0().f29344o.setImageResource(aVar.f2851a == 0 ? R.drawable.img_card_virtual_luminary : R.drawable.img_card_physical_black_luminary);
            u0().f29345p.setText(getString(R.string.your_card_order_was_successful));
        }
        o.c(u0().f29343n, 500L, new b(this, 6));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12419n0;
    }
}
