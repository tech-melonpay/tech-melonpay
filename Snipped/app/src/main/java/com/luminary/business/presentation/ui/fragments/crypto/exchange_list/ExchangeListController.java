package com.luminary.business.presentation.ui.fragments.crypto.exchange_list;

import F8.o;
import O9.f;
import O9.p;
import P9.s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.Typed4EpoxyController;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.ui.fragments.home.newhome.a;
import com.luminary.business.presentation.ui.views.ButtonSmall;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.collections.EmptyList;
import s6.C1232v;
import s6.C1234x;

/* compiled from: ExchangeListController.kt */
/* loaded from: classes2.dex */
public final class ExchangeListController extends Typed4EpoxyController<List<? extends CryptoAccountDomain>, List<? extends CryptoExchangeDomain>, List<? extends a>, Integer> {
    private final InterfaceC0646l<Integer, p> actionRequiredClick;
    private TabLayout.g actionTab;
    private final InterfaceC0646l<Integer, p> confirm;
    private final Context context;
    private final InterfaceC0646l<Integer, p> onClick;
    private final InterfaceC0646l<Integer, p> onLeftClick;
    private final InterfaceC0646l<Integer, p> onRightClick;
    private final InterfaceC0646l<Integer, p> refund;
    private final TabLayout.d tabChangeListener;
    private final InterfaceC0635a<Object> unFreezeCLick;
    private final f cryptoPrefsManager$delegate = org.koin.java.a.a(K5.a.class);
    private List<? extends a> stickyHeaders = EmptyList.f23104a;

    /* JADX WARN: Multi-variable type inference failed */
    public ExchangeListController(Context context, InterfaceC0646l<? super Integer, p> interfaceC0646l, InterfaceC0646l<? super Integer, p> interfaceC0646l2, InterfaceC0646l<? super Integer, p> interfaceC0646l3, InterfaceC0646l<? super Integer, p> interfaceC0646l4, InterfaceC0646l<? super Integer, p> interfaceC0646l5, InterfaceC0646l<? super Integer, p> interfaceC0646l6, TabLayout.d dVar, InterfaceC0635a<? extends Object> interfaceC0635a) {
        this.context = context;
        this.onClick = interfaceC0646l;
        this.actionRequiredClick = interfaceC0646l2;
        this.onRightClick = interfaceC0646l3;
        this.onLeftClick = interfaceC0646l4;
        this.confirm = interfaceC0646l5;
        this.refund = interfaceC0646l6;
        this.tabChangeListener = dVar;
        this.unFreezeCLick = interfaceC0635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$1$lambda$0(ExchangeListController exchangeListController, int i, C1234x c1234x, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i9) {
        TabLayout.i iVar;
        TabLayout tabLayout = (TabLayout) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.tab_exchanges);
        tabLayout.a(exchangeListController.tabChangeListener);
        exchangeListController.actionTab = tabLayout.h(1);
        TabLayout.g h9 = tabLayout.h(1);
        if (h9 != null && (iVar = h9.f9859h) != null) {
            o.b(iVar);
        }
        TabLayout.g h10 = tabLayout.h(i);
        if (h10 != null) {
            h10.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$15$lambda$14$lambda$11(boolean z10, CryptoExchangeDomain cryptoExchangeDomain, ExchangeListController exchangeListController, View view) {
        Integer num;
        if (!z10 || (num = cryptoExchangeDomain.f11017a) == null) {
            return;
        }
        int intValue = num.intValue();
        InterfaceC0646l<Integer, p> interfaceC0646l = exchangeListController.confirm;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Integer.valueOf(intValue));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$15$lambda$14$lambda$13(boolean z10, CryptoExchangeDomain cryptoExchangeDomain, ExchangeListController exchangeListController, View view) {
        Integer num;
        if (!z10 || (num = cryptoExchangeDomain.f11017a) == null) {
            return;
        }
        int intValue = num.intValue();
        InterfaceC0646l<Integer, p> interfaceC0646l = exchangeListController.refund;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Integer.valueOf(intValue));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$21$lambda$20$lambda$19(a aVar, ExchangeListController exchangeListController, View view) {
        Integer num = ((a.C0129a) aVar).f12263a.f11017a;
        if (num != null) {
            int intValue = num.intValue();
            InterfaceC0646l<Integer, p> interfaceC0646l = exchangeListController.onClick;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(Integer.valueOf(intValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$9$lambda$8$lambda$3(boolean z10, CryptoAccountDomain cryptoAccountDomain, ExchangeListController exchangeListController, View view) {
        Long l10;
        if (z10 || (l10 = cryptoAccountDomain.f10963a) == null) {
            return;
        }
        long longValue = l10.longValue();
        InterfaceC0646l<Integer, p> interfaceC0646l = exchangeListController.onLeftClick;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Integer.valueOf((int) longValue));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$9$lambda$8$lambda$5(boolean z10, boolean z11, CryptoAccountDomain cryptoAccountDomain, ExchangeListController exchangeListController, View view) {
        Long l10;
        if (!z10 || z11 || (l10 = cryptoAccountDomain.f10963a) == null) {
            return;
        }
        long longValue = l10.longValue();
        InterfaceC0646l<Integer, p> interfaceC0646l = exchangeListController.onRightClick;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Integer.valueOf((int) longValue));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$9$lambda$8$lambda$6(ExchangeListController exchangeListController, View view) {
        InterfaceC0635a<Object> interfaceC0635a = exchangeListController.unFreezeCLick;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$9$lambda$8$lambda$7(boolean z10, boolean z11, C1232v c1232v, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ButtonSmall buttonSmall = (ButtonSmall) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.left_btn);
        ButtonSmall buttonSmall2 = (ButtonSmall) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.right_btn);
        ButtonSmall buttonSmall3 = (ButtonSmall) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.btnUnfreeze);
        buttonSmall.setTint(R.color.main_button_text_color);
        buttonSmall2.setTint(R.color.sl_text_black_button);
        if (z10) {
            o.b(buttonSmall2);
            o.b(buttonSmall);
            buttonSmall3.setVisibility(0);
        } else {
            o.b(buttonSmall3);
            buttonSmall.setVisibility(0);
            if (z11) {
                buttonSmall2.setVisibility(0);
            } else {
                o.b(buttonSmall2);
            }
        }
    }

    private final K5.a getCryptoPrefsManager() {
        return (K5.a) this.cryptoPrefsManager$delegate.getValue();
    }

    @Override // com.airbnb.epoxy.Typed4EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends CryptoAccountDomain> list, List<? extends CryptoExchangeDomain> list2, List<? extends a> list3, Integer num) {
        buildModels((List<CryptoAccountDomain>) list, (List<CryptoExchangeDomain>) list2, list3, num.intValue());
    }

    public final TabLayout.g getActionTab() {
        return this.actionTab;
    }

    public final int getIconForExchange(a.C0129a c0129a) {
        CryptoExchangeDomain cryptoExchangeDomain = c0129a.f12263a;
        if (cryptoExchangeDomain.f() || cryptoExchangeDomain.d()) {
            return R.drawable.ic_progress;
        }
        if (cryptoExchangeDomain.e()) {
            return R.drawable.ic_close;
        }
        CryptoExchangeDomain.MovementType movementType = cryptoExchangeDomain.f11023g;
        if (movementType == null) {
            return R.drawable.ic_exchange;
        }
        if (movementType == CryptoExchangeDomain.MovementType.f11062c) {
            return R.drawable.ic_transaction_out;
        }
        if (movementType == CryptoExchangeDomain.MovementType.f11061b) {
            return R.drawable.ic_transaction_income;
        }
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public boolean isStickyHeader(int i) {
        if (i == 0) {
            return false;
        }
        return s.M(i - 1, this.stickyHeaders) instanceof a.b;
    }

    public final void setActionTab(TabLayout.g gVar) {
        this.actionTab = gVar;
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void setupStickyHeaderView(View view) {
        View findViewById;
        if (!(view instanceof ViewGroup) || (findViewById = view.findViewById(R.id.constraint_layout)) == null) {
            return;
        }
        findViewById.setBackgroundResource(R.drawable.cell_bg_full_16);
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void teardownStickyHeaderView(View view) {
        View findViewById;
        if (!(view instanceof ViewGroup) || (findViewById = view.findViewById(R.id.constraint_layout)) == null) {
            return;
        }
        findViewById.setBackgroundResource(R.drawable.cell_bg_transaction_top);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0252  */
    /* JADX WARN: Type inference failed for: r3v6, types: [q7.c] */
    /* JADX WARN: Type inference failed for: r4v7, types: [q7.d] */
    /* JADX WARN: Type inference failed for: r4v8, types: [q7.d] */
    /* JADX WARN: Type inference failed for: r8v5, types: [q7.a] */
    /* JADX WARN: Type inference failed for: r8v6, types: [q7.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels(java.util.List<com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain> r23, java.util.List<com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain> r24, java.util.List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a> r25, int r26) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListController.buildModels(java.util.List, java.util.List, java.util.List, int):void");
    }
}
