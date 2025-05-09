package com.luminary.business.presentation.ui.fragments.crypto.all_exchanges;

import O9.p;
import P9.s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.ui.fragments.home.newhome.a;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AllExchangesController.kt */
/* loaded from: classes2.dex */
public final class AllExchangesController extends TypedEpoxyController<List<? extends a>> {
    private final Context context;
    private final InterfaceC0646l<Integer, p> onExchangeClick;
    private List<? extends a> stickyHeaders = EmptyList.f23104a;

    /* JADX WARN: Multi-variable type inference failed */
    public AllExchangesController(Context context, InterfaceC0646l<? super Integer, p> interfaceC0646l) {
        this.context = context;
        this.onExchangeClick = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$6$lambda$5$lambda$4(a aVar, AllExchangesController allExchangesController, View view) {
        Integer num = ((a.C0129a) aVar).f12263a.f11017a;
        if (num != null) {
            int intValue = num.intValue();
            InterfaceC0646l<Integer, p> interfaceC0646l = allExchangesController.onExchangeClick;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(Integer.valueOf(intValue));
            }
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

    /* JADX WARN: Removed duplicated region for block: B:67:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0229 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c  */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels(java.util.List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a> r23) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.crypto.all_exchanges.AllExchangesController.buildModels(java.util.List):void");
    }
}
