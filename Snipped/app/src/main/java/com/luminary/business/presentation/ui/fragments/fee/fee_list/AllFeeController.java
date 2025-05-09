package com.luminary.business.presentation.ui.fragments.fee.fee_list;

import B7.c;
import D9.b;
import O9.p;
import P9.m;
import android.content.Context;
import android.text.SpannedString;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.business.domain.entity.account.FeeDomain;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import s6.C1230t;
import s6.p0;

/* compiled from: AllFeeController.kt */
/* loaded from: classes2.dex */
public final class AllFeeController extends TypedEpoxyController<List<? extends FeeDomain>> {
    private final Context context;
    private final InterfaceC0646l<FeeDomain, p> onFeeClick;

    /* JADX WARN: Multi-variable type inference failed */
    public AllFeeController(Context context, InterfaceC0646l<? super FeeDomain, p> interfaceC0646l) {
        this.context = context;
        this.onFeeClick = interfaceC0646l;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends FeeDomain> list) {
        buildModels2((List<FeeDomain>) list);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(List<FeeDomain> list) {
        C1230t c1230t = new C1230t();
        c1230t.a();
        add(c1230t);
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i9 = i + 1;
                if (i < 0) {
                    m.t();
                    throw null;
                }
                FeeDomain feeDomain = (FeeDomain) obj;
                Double d10 = feeDomain.f10739c;
                double abs = Math.abs(d10 != null ? d10.doubleValue() : 0.0d);
                String plainString = new BigDecimal(String.valueOf(abs)).toPlainString();
                String v10 = plainString != null ? b.v(plainString) : null;
                String plainString2 = new BigDecimal(String.valueOf(abs)).toPlainString();
                String str = feeDomain.f10738b;
                SpannedString v02 = b.v0("-", v10, plainString2 != null ? b.u(plainString2, str) : null, feeDomain.f10738b, 15, 10, false, true, false, 256);
                p0 p0Var = new p0();
                p0Var.e("fee_" + System.currentTimeMillis());
                p0Var.i(feeDomain.f10740d);
                p0Var.k(feeDomain.f10740d);
                p0Var.d(v02);
                p0Var.o(new SpannedString(""));
                p0Var.b(str != null ? b.M(this.context, str) : null);
                Date date = feeDomain.f10744h;
                p0Var.c(date != null ? b.F0(date, "HH:mm, EEE dd MMM") : null);
                p0Var.p(Integer.valueOf(R.drawable.ic_percent));
                p0Var.j(new c(3));
                p0Var.h(Boolean.valueOf(i == list.size() - 1));
                p0Var.a(Integer.valueOf(i == 0 ? R.drawable.cell_bg_transaction_top : i == list.size() - 1 ? R.drawable.cell_bg_transaction_bottom : R.drawable.cell_bg_middle));
                add(p0Var);
                i = i9;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2$lambda$1(View view) {
    }
}
