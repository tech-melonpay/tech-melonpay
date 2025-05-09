package com.luminary.business.presentation.ui.fragments.crypto.sell_external_account;

import C.v;
import H5.b;
import O9.p;
import P9.m;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.business.domain.entity.transaction.PaymentType;
import java.util.List;
import kotlin.jvm.internal.f;
import s6.V;

/* compiled from: SavedPaymentsController.kt */
/* loaded from: classes2.dex */
public final class SavedPaymentsController extends TypedEpoxyController<List<? extends b>> {
    private final Context context;
    private final String currency;
    private final InterfaceC0646l<b, p> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedPaymentsController(String str, Context context, InterfaceC0646l<? super b, p> interfaceC0646l) {
        this.currency = str;
        this.context = context;
        this.onClick = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2$lambda$1(b bVar, SavedPaymentsController savedPaymentsController, View view) {
        Long l10 = bVar.f1496a;
        if (l10 == null || l10.toString() == null) {
            return;
        }
        savedPaymentsController.onClick.invoke(bVar);
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends b> list) {
        buildModels2((List<b>) list);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(List<b> list) {
        String p10;
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i9 = i + 1;
                if (i < 0) {
                    m.t();
                    throw null;
                }
                b bVar = (b) obj;
                boolean b9 = f.b(bVar.f1503h, "GBP");
                String str = bVar.i;
                String str2 = bVar.f1504j;
                if (b9) {
                    String str3 = bVar.f1505k;
                    String str4 = bVar.f1506l;
                    p10 = ((str4 == null || str4.length() == 0) && (str3 == null || str3.length() == 0)) ? v.p(str2, "  ", str) : v.p(str4, "  ", str3);
                } else {
                    p10 = v.p(str2, "  ", str);
                }
                V v10 = new V();
                v10.a("payment_template_" + bVar.f1496a);
                v10.onMutation();
                String str5 = bVar.f1500e;
                v10.f26733a = str5;
                String U = D9.b.U(str5);
                v10.onMutation();
                v10.f26735c = U;
                Integer M8 = D9.b.M(this.context, this.currency);
                v10.onMutation();
                v10.f26736d = M8;
                v10.onMutation();
                v10.f26734b = p10;
                B7.f fVar = new B7.f(28, bVar, this);
                v10.onMutation();
                v10.f26737e = fVar;
                boolean z10 = true;
                Boolean valueOf = Boolean.valueOf(i == 0);
                v10.onMutation();
                v10.f26738f = valueOf;
                if (bVar.f1502g != PaymentType.f11147a) {
                    z10 = false;
                }
                Boolean valueOf2 = Boolean.valueOf(z10);
                v10.onMutation();
                v10.f26739g = valueOf2;
                add(v10);
                i = i9;
            }
        }
    }
}
