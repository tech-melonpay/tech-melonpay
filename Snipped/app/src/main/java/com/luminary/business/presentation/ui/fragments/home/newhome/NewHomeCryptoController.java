package com.luminary.business.presentation.ui.fragments.home.newhome;

import O9.p;
import P9.s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.ui.fragments.home.newhome.a;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: NewHomeCryptoController.kt */
/* loaded from: classes2.dex */
public final class NewHomeCryptoController extends Typed2EpoxyController<List<? extends CryptoAccountDomain>, List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a>> {
    private final Context context;
    private final InterfaceC0635a<Object> newAccountClick;
    private final InterfaceC0646l<Long, p> onAccountClick;
    private final InterfaceC0646l<String, p> onAccountRefreshClick;
    private final InterfaceC0635a<Object> onOpenTransactionsAll;
    private final InterfaceC0646l<String, p> onTransactionClick;
    private List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a> stickyHeaders = EmptyList.f23104a;

    /* compiled from: NewHomeCryptoController.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12241a;

        static {
            int[] iArr = new int[CryptoAccountDomain.WalletStatus.values().length];
            try {
                CryptoAccountDomain.WalletStatus.a aVar = CryptoAccountDomain.WalletStatus.f10978a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CryptoAccountDomain.WalletStatus.a aVar2 = CryptoAccountDomain.WalletStatus.f10978a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CryptoAccountDomain.WalletStatus.a aVar3 = CryptoAccountDomain.WalletStatus.f10978a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CryptoAccountDomain.WalletStatus.a aVar4 = CryptoAccountDomain.WalletStatus.f10978a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CryptoAccountDomain.WalletStatus.a aVar5 = CryptoAccountDomain.WalletStatus.f10978a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f12241a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewHomeCryptoController(Context context, InterfaceC0646l<? super Long, p> interfaceC0646l, InterfaceC0646l<? super String, p> interfaceC0646l2, InterfaceC0646l<? super String, p> interfaceC0646l3, InterfaceC0635a<? extends Object> interfaceC0635a, InterfaceC0635a<? extends Object> interfaceC0635a2) {
        this.context = context;
        this.onAccountClick = interfaceC0646l;
        this.onAccountRefreshClick = interfaceC0646l2;
        this.onTransactionClick = interfaceC0646l3;
        this.onOpenTransactionsAll = interfaceC0635a;
        this.newAccountClick = interfaceC0635a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$14$lambda$10$lambda$9(NewHomeCryptoController newHomeCryptoController, View view) {
        InterfaceC0635a<Object> interfaceC0635a = newHomeCryptoController.onOpenTransactionsAll;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$14$lambda$13$lambda$12(com.luminary.business.presentation.ui.fragments.home.newhome.a aVar, NewHomeCryptoController newHomeCryptoController, View view) {
        Integer num = ((a.C0129a) aVar).f12263a.f11017a;
        if (num != null) {
            int intValue = num.intValue();
            InterfaceC0646l<String, p> interfaceC0646l = newHomeCryptoController.onTransactionClick;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(String.valueOf(intValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$7$lambda$4$lambda$1(CryptoAccountDomain cryptoAccountDomain, NewHomeCryptoController newHomeCryptoController, View view) {
        String l10;
        InterfaceC0646l<String, p> interfaceC0646l;
        Long l11 = cryptoAccountDomain.f10963a;
        if (l11 == null || (l10 = l11.toString()) == null || (interfaceC0646l = newHomeCryptoController.onAccountRefreshClick) == null) {
            return;
        }
        interfaceC0646l.invoke(l10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$7$lambda$4$lambda$3(CryptoAccountDomain cryptoAccountDomain, NewHomeCryptoController newHomeCryptoController, View view) {
        Long l10 = cryptoAccountDomain.f10963a;
        if (l10 != null) {
            long longValue = l10.longValue();
            InterfaceC0646l<Long, p> interfaceC0646l = newHomeCryptoController.onAccountClick;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(Long.valueOf(longValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$7$lambda$5(NewHomeCryptoController newHomeCryptoController, View view) {
        InterfaceC0635a<Object> interfaceC0635a = newHomeCryptoController.newAccountClick;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends CryptoAccountDomain> list, List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a> list2) {
        buildModels2((List<CryptoAccountDomain>) list, list2);
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

    public final String getStatusText(CryptoAccountDomain.WalletStatus walletStatus) {
        int i = walletStatus == null ? -1 : a.f12241a[walletStatus.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : this.context.getString(R.string.deleted) : this.context.getString(R.string.rejected) : this.context.getString(R.string.active) : this.context.getString(R.string.action_required) : this.context.getString(R.string.under_review);
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public boolean isStickyHeader(int i) {
        if (i == 0) {
            return false;
        }
        return s.M(i - 1, this.stickyHeaders) instanceof a.b;
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void setData(List<? extends CryptoAccountDomain> list, List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a> list2) {
        setData2((List<CryptoAccountDomain>) list, list2);
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
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03f2  */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.airbnb.epoxy.ModelCollector, com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeCryptoController, java.lang.Object] */
    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels2(java.util.List<com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain> r23, java.util.List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a> r24) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeCryptoController.buildModels2(java.util.List, java.util.List):void");
    }

    /* renamed from: setData, reason: avoid collision after fix types in other method */
    public void setData2(List<CryptoAccountDomain> list, List<? extends com.luminary.business.presentation.ui.fragments.home.newhome.a> list2) {
        this.stickyHeaders = list2 == null ? EmptyList.f23104a : list2;
        super.setData((NewHomeCryptoController) list, (List<CryptoAccountDomain>) list2);
    }
}
