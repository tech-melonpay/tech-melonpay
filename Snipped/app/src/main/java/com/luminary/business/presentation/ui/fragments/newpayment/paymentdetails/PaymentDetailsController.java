package com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails;

import android.content.Context;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.mobile.R;
import java.util.Map;
import s6.C1210E;
import s6.U;

/* compiled from: PaymentDetailsController.kt */
/* loaded from: classes2.dex */
public final class PaymentDetailsController extends TypedEpoxyController<Map<String, ? extends String>> {
    private final Context context;

    public PaymentDetailsController(Context context) {
        this.context = context;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(Map<String, ? extends String> map) {
        buildModels2((Map<String, String>) map);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(Map<String, String> map) {
        U u6 = new U();
        u6.b();
        u6.a(this.context.getString(R.string.outgoing_payment));
        add(u6);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C1210E c1210e = new C1210E();
                c1210e.a(entry.getKey());
                c1210e.b(entry.getKey());
                c1210e.c(entry.getValue());
                add(c1210e);
            }
        }
    }
}
