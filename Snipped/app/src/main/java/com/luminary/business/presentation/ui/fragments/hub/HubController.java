package com.luminary.business.presentation.ui.fragments.hub;

import C.v;
import O9.f;
import O9.p;
import P9.m;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.ui.fragments.hub.HubFragment;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.koin.java.a;
import s6.C1206A;

/* compiled from: HubController.kt */
/* loaded from: classes2.dex */
public final class HubController extends Typed2EpoxyController<List<? extends HubFragment.Apps>, Integer> {
    private final InterfaceC0646l<Integer, p> callbackWithId;
    private final Context context;
    private final f cryptoPrefsManager$delegate = a.a(K5.a.class);
    private final TabLayout.d tabChangeListener;

    /* JADX WARN: Multi-variable type inference failed */
    public HubController(Context context, TabLayout.d dVar, InterfaceC0646l<? super Integer, p> interfaceC0646l) {
        this.context = context;
        this.tabChangeListener = dVar;
        this.callbackWithId = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2$lambda$0(HubController hubController, HubFragment.Apps apps, View view) {
        InterfaceC0646l<Integer, p> interfaceC0646l = hubController.callbackWithId;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Integer.valueOf(apps.f12274a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$3$lambda$2$lambda$1(int i, int i9, int i10) {
        return i / 2;
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends HubFragment.Apps> list, Integer num) {
        buildModels2((List<HubFragment.Apps>) list, num);
    }

    public final K5.a getCryptoPrefsManager() {
        return (K5.a) this.cryptoPrefsManager$delegate.getValue();
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(List<HubFragment.Apps> list, Integer num) {
        int i;
        int i9 = 1;
        if (list != null) {
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    m.t();
                    throw null;
                }
                HubFragment.Apps apps = (HubFragment.Apps) obj;
                C1206A c1206a = new C1206A();
                c1206a.c(new Number[]{Integer.valueOf(apps.f12274a)});
                c1206a.b(Integer.valueOf(apps.f12275b));
                int intValue = getCryptoPrefsManager().X().intValue();
                int i12 = apps.f12274a;
                c1206a.g(Boolean.valueOf(intValue > 0 && R.string.hub_crypto == i12));
                c1206a.e(this.context.getString(i12));
                int ordinal = apps.f12277d.ordinal();
                if (ordinal == 0) {
                    i = R.drawable.hub_finance_bg;
                } else if (ordinal == 1) {
                    i = R.drawable.hub_business_tools_bg;
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.drawable.hub_settings_bg;
                }
                c1206a.a(Integer.valueOf(i));
                c1206a.d(Boolean.valueOf(apps.f12278e));
                c1206a.f(new B7.f(i9, this, apps));
                c1206a.h(new v());
                add(c1206a);
                i10 = i11;
            }
        }
    }
}
