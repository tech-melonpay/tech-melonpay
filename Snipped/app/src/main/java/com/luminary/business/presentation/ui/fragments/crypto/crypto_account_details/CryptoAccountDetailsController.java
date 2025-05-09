package com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details;

import F8.o;
import O9.p;
import P9.s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.Typed3EpoxyController;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.ui.fragments.home.newhome.a;
import com.luminary.business.presentation.ui.views.ButtonSmall;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.collections.EmptyList;
import s6.C1214c;
import s6.C1228q;

/* compiled from: CryptoAccountDetailsController.kt */
/* loaded from: classes2.dex */
public final class CryptoAccountDetailsController extends Typed3EpoxyController<CryptoAccountDomain, List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>, Integer> {
    private final Context context;
    private final InterfaceC0635a<Object> onDepositClick;
    private final InterfaceC0646l<Integer, p> onExchangeClick;
    private final InterfaceC0635a<Object> onLeftClick;
    private final InterfaceC0635a<Object> onRightClick;
    private final InterfaceC0635a<Object> onUnfreezeClick;
    private final InterfaceC0635a<Object> onWithdrawClick;
    private List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a> stickyHeaders = EmptyList.f23104a;
    private TabLayout.g summaryTab;
    private final TabLayout.d tabChangeListener;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoAccountDetailsController(Context context, TabLayout.d dVar, InterfaceC0635a<? extends Object> interfaceC0635a, InterfaceC0635a<? extends Object> interfaceC0635a2, InterfaceC0635a<? extends Object> interfaceC0635a3, InterfaceC0635a<? extends Object> interfaceC0635a4, InterfaceC0646l<? super Integer, p> interfaceC0646l, InterfaceC0635a<? extends Object> interfaceC0635a5) {
        this.context = context;
        this.tabChangeListener = dVar;
        this.onLeftClick = interfaceC0635a;
        this.onRightClick = interfaceC0635a2;
        this.onDepositClick = interfaceC0635a3;
        this.onWithdrawClick = interfaceC0635a4;
        this.onExchangeClick = interfaceC0646l;
        this.onUnfreezeClick = interfaceC0635a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$10$lambda$9$lambda$3(CryptoAccountDomain cryptoAccountDomain, C1214c c1214c, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ButtonSmall buttonSmall = (ButtonSmall) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.right_btn);
        ButtonSmall buttonSmall2 = (ButtonSmall) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.left_btn);
        ButtonSmall buttonSmall3 = (ButtonSmall) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.withdraw);
        ButtonSmall buttonSmall4 = (ButtonSmall) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.deposit);
        ButtonSmall buttonSmall5 = (ButtonSmall) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.unfreeze_btn);
        TextView textView = (TextView) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.tvFreeze);
        buttonSmall2.setTint(R.color.main_button_text_color);
        if (cryptoAccountDomain.f10967e == CryptoAccountDomain.WalletStatus.f10985h) {
            o.b(buttonSmall4);
            o.b(buttonSmall);
            o.b(buttonSmall2);
            o.b(buttonSmall3);
            buttonSmall5.setVisibility(0);
            textView.setVisibility(0);
            return;
        }
        o.b(buttonSmall5);
        o.b(textView);
        buttonSmall4.setVisibility(0);
        buttonSmall2.setVisibility(0);
        Double d10 = cryptoAccountDomain.f10977p;
        if ((d10 != null ? d10.doubleValue() : 0.0d) > 0.0d) {
            buttonSmall3.setVisibility(0);
            buttonSmall.setVisibility(0);
        } else {
            o.b(buttonSmall3);
            o.b(buttonSmall);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$10$lambda$9$lambda$4(CryptoAccountDetailsController cryptoAccountDetailsController, View view) {
        InterfaceC0635a<Object> interfaceC0635a = cryptoAccountDetailsController.onUnfreezeClick;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$10$lambda$9$lambda$5(CryptoAccountDetailsController cryptoAccountDetailsController, View view) {
        InterfaceC0635a<Object> interfaceC0635a = cryptoAccountDetailsController.onLeftClick;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$10$lambda$9$lambda$6(boolean z10, CryptoAccountDetailsController cryptoAccountDetailsController, View view) {
        InterfaceC0635a<Object> interfaceC0635a;
        if (!z10 || (interfaceC0635a = cryptoAccountDetailsController.onRightClick) == null) {
            return;
        }
        interfaceC0635a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$10$lambda$9$lambda$7(CryptoAccountDetailsController cryptoAccountDetailsController, View view) {
        InterfaceC0635a<Object> interfaceC0635a = cryptoAccountDetailsController.onDepositClick;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$10$lambda$9$lambda$8(boolean z10, CryptoAccountDetailsController cryptoAccountDetailsController, View view) {
        InterfaceC0635a<Object> interfaceC0635a;
        if (!z10 || (interfaceC0635a = cryptoAccountDetailsController.onWithdrawClick) == null) {
            return;
        }
        interfaceC0635a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$16$lambda$15$lambda$14(com.luminary.business.presentation.ui.fragments.home.newhome.a aVar, CryptoAccountDetailsController cryptoAccountDetailsController, View view) {
        Integer num = ((a.C0129a) aVar).f12263a.f11017a;
        if (num != null) {
            int intValue = num.intValue();
            InterfaceC0646l<Integer, p> interfaceC0646l = cryptoAccountDetailsController.onExchangeClick;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(Integer.valueOf(intValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$2$lambda$1$lambda$0(CryptoAccountDetailsController cryptoAccountDetailsController, int i, C1228q c1228q, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i9) {
        TabLayout tabLayout = (TabLayout) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.tab_accounts);
        tabLayout.a(cryptoAccountDetailsController.tabChangeListener);
        cryptoAccountDetailsController.summaryTab = tabLayout.h(0);
        TabLayout.g h9 = tabLayout.h(i);
        if (h9 != null) {
            h9.a();
        }
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

    public final TabLayout.g getSummaryTab() {
        return this.summaryTab;
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public boolean isStickyHeader(int i) {
        if (i == 0) {
            return false;
        }
        return s.M(i - 1, this.stickyHeaders) instanceof a.b;
    }

    public final void setSummaryTab(TabLayout.g gVar) {
        this.summaryTab = gVar;
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
    /* JADX WARN: Removed duplicated region for block: B:77:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02be  */
    /* JADX WARN: Type inference failed for: r1v17, types: [l7.a] */
    /* JADX WARN: Type inference failed for: r1v18, types: [l7.a] */
    /* JADX WARN: Type inference failed for: r1v19, types: [l7.b] */
    /* JADX WARN: Type inference failed for: r1v20, types: [l7.a] */
    /* JADX WARN: Type inference failed for: r1v21, types: [l7.b] */
    @Override // com.airbnb.epoxy.Typed3EpoxyController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels(com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain r21, java.util.List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a> r22, java.lang.Integer r23) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsController.buildModels(com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain, java.util.List, java.lang.Integer):void");
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public void setData(CryptoAccountDomain cryptoAccountDomain, List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a> list, Integer num) {
        this.stickyHeaders = list == null ? EmptyList.f23104a : list;
        super.setData((CryptoAccountDetailsController) cryptoAccountDomain, (CryptoAccountDomain) list, (List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>) num);
    }
}
