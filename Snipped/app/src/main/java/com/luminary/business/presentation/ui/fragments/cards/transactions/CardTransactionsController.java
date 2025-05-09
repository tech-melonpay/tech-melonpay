package com.luminary.business.presentation.ui.fragments.cards.transactions;

import C.v;
import D9.b;
import O9.p;
import P9.s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import com.luminary.business.presentation.ui.fragments.cards.transactions.a;
import com.luminary.mobile.R;
import java.util.Date;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CardTransactionsController.kt */
/* loaded from: classes2.dex */
public final class CardTransactionsController extends TypedEpoxyController<List<? extends a>> {
    private final Context context;
    private final InterfaceC0646l<String, p> onTransactionClick;
    private List<? extends a> stickyHeaders = EmptyList.f23104a;

    /* JADX WARN: Multi-variable type inference failed */
    public CardTransactionsController(Context context, InterfaceC0646l<? super String, p> interfaceC0646l) {
        this.context = context;
        this.onTransactionClick = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$6$lambda$5$lambda$4(a aVar, CardTransactionsController cardTransactionsController, View view) {
        InterfaceC0646l<String, p> interfaceC0646l;
        String str = ((a.C0117a) aVar).f11863a.f10752a;
        if (str == null || (interfaceC0646l = cardTransactionsController.onTransactionClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    private final String setStatusText(CardTransactionDomain cardTransactionDomain) {
        String str = cardTransactionDomain.f10765o;
        Date date = cardTransactionDomain.f10766p;
        return v.p(str, " • ", date != null ? b.F0(date, "HH:mm, dd MMM") : null);
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public boolean isStickyHeader(int i) {
        if (i == 0) {
            return false;
        }
        return s.M(i - 1, this.stickyHeaders) instanceof a.b;
    }

    public final void setDataForHeader(List<? extends a> list) {
        this.stickyHeaders = list == null ? EmptyList.f23104a : list;
        setData(list);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03df  */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels(java.util.List<? extends com.luminary.business.presentation.ui.fragments.cards.transactions.a> r30) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.cards.transactions.CardTransactionsController.buildModels(java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$6$lambda$2$lambda$1(View view) {
    }
}
