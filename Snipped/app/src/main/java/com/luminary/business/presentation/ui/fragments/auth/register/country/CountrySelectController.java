package com.luminary.business.presentation.ui.fragments.auth.register.country;

import O9.p;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import s6.C1227p;
import u5.f;

/* compiled from: CountrySelectController.kt */
/* loaded from: classes2.dex */
public final class CountrySelectController extends TypedEpoxyController<List<? extends f>> {
    private final boolean isCountryCode;
    private final InterfaceC0646l<f, p> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public CountrySelectController(Context context, boolean z10, InterfaceC0646l<? super f, p> interfaceC0646l) {
        this.isCountryCode = z10;
        this.onClick = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2$lambda$1$lambda$0(CountrySelectController countrySelectController, f fVar, View view) {
        countrySelectController.onClick.invoke(fVar);
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends f> list) {
        buildModels2((List<f>) list);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(List<f> list) {
        if (list != null) {
            boolean z10 = this.isCountryCode;
            for (f fVar : list) {
                C1227p c1227p = new C1227p();
                c1227p.c("country_" + fVar.f30279f + System.currentTimeMillis());
                c1227p.b(fVar.f30275b);
                c1227p.a(fVar.f30279f);
                c1227p.d(Boolean.valueOf(z10));
                c1227p.f("+" + fVar.f30280g);
                c1227p.e(new B7.f(6, this, fVar));
                add(c1227p);
            }
        }
    }
}
