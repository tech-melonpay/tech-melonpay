package com.luminary.business.presentation.ui.fragments.newcard;

import O9.p;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.Typed3EpoxyController;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.mobile.R;
import java.util.List;
import s6.C1223l;

/* compiled from: NewCardListController.kt */
/* loaded from: classes2.dex */
public final class NewCardListController extends Typed3EpoxyController<List<? extends Integer>, List<? extends BankAccountDomain>, Integer> {
    private final Context context;
    private final InterfaceC0646l<String, p> onClick;
    private final TabLayout.d tabChangeListener;

    /* JADX WARN: Multi-variable type inference failed */
    public NewCardListController(Context context, InterfaceC0646l<? super String, p> interfaceC0646l, TabLayout.d dVar) {
        this.context = context;
        this.onClick = interfaceC0646l;
        this.tabChangeListener = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$11$lambda$10$lambda$9(BankAccountDomain bankAccountDomain, NewCardListController newCardListController, View view) {
        String str;
        InterfaceC0646l<String, p> interfaceC0646l;
        Integer num = bankAccountDomain.f10702j;
        if (num == null || num.intValue() != 1 || (str = bankAccountDomain.f10700g) == null || (interfaceC0646l = newCardListController.onClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$2$lambda$1$lambda$0(NewCardListController newCardListController, int i, C1223l c1223l, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i9) {
        TabLayout tabLayout = (TabLayout) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.tab_home);
        tabLayout.a(newCardListController.tabChangeListener);
        TabLayout.g h9 = tabLayout.h(i);
        if (h9 != null) {
            h9.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$6$lambda$5$lambda$4(NewCardListController newCardListController, int i, View view) {
        InterfaceC0646l<String, p> interfaceC0646l = newCardListController.onClick;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(String.valueOf(i));
        }
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Integer> list, List<? extends BankAccountDomain> list2, Integer num) {
        buildModels((List<Integer>) list, (List<BankAccountDomain>) list2, num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels(java.util.List<java.lang.Integer> r17, java.util.List<com.luminary.business.domain.entity.account.BankAccountDomain> r18, int r19) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.newcard.NewCardListController.buildModels(java.util.List, java.util.List, int):void");
    }
}
