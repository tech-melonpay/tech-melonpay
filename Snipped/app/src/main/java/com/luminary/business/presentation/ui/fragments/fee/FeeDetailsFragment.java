package com.luminary.business.presentation.ui.fragments.fee;

import D9.b;
import Fa.h;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.Fragment;
import ca.InterfaceC0635a;
import com.luminary.business.domain.entity.account.FeeDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.Date;
import t6.T3;
import y7.C1619a;

/* compiled from: FeeDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class FeeDetailsFragment extends BaseFragment<T3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12226n0 = R.layout.fragment_fee_details;

    /* renamed from: o0, reason: collision with root package name */
    public final h f12227o0 = new h(kotlin.jvm.internal.h.a(C1619a.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.fee.FeeDetailsFragment$special$$inlined$navArgs$1
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
        toolbarStatus.f13276o = null;
        toolbarStatus.f13263a = getString(R.string.outstanding_fee);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13263a = getString(R.string.outstanding_fee);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Date date;
        Double d10;
        String plainString;
        String str3;
        Double d11;
        super.onViewCreated(view, bundle);
        FeeDomain feeDomain = ((C1619a) this.f12227o0.getValue()).f31122a;
        String str4 = null;
        String plainString2 = (feeDomain == null || (d11 = feeDomain.f10739c) == null) ? null : new BigDecimal(String.valueOf(d11.doubleValue())).toPlainString();
        T3 u02 = u0();
        String v10 = plainString2 != null ? b.v(plainString2) : null;
        if (plainString2 != null) {
            str = b.u(plainString2, feeDomain != null ? feeDomain.f10738b : null);
        } else {
            str = null;
        }
        u02.f28505n.setText(b.v0("-", v10, str, feeDomain != null ? feeDomain.f10738b : null, 30, 18, false, true, false, 256));
        T3 u03 = u0();
        String str5 = "";
        if (feeDomain == null || (str2 = feeDomain.f10740d) == null) {
            str2 = "";
        }
        u03.f28509r.setText(str2);
        u0().f28508q.setImageResource(R.drawable.ic_percent);
        u0().f28510s.setText(getString(R.string.outstanding_fee_details));
        T3 u04 = u0();
        if (feeDomain != null && (str3 = feeDomain.f10740d) != null) {
            str5 = str3;
        }
        u04.f28507p.setText(str5);
        u0().f28512u.setText(b.o(feeDomain != null ? feeDomain.f10738b : null, (feeDomain == null || (d10 = feeDomain.f10739c) == null || (plainString = new BigDecimal(String.valueOf(d10.doubleValue())).toPlainString()) == null) ? null : b.I(plainString, feeDomain.f10738b)));
        T3 u05 = u0();
        if (feeDomain != null && (date = feeDomain.f10744h) != null) {
            str4 = b.F0(date, "HH:mm, EEE dd MMM");
        }
        u05.f28514w.setText(str4);
        u0().f28506o.setText(getString(R.string.type));
        u0().f28511t.setText(getString(R.string.amount));
        u0().f28513v.setText(getString(R.string.time_and_date));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12226n0;
    }
}
