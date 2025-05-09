package com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list;

import D9.b;
import O9.p;
import P9.m;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListController;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import s6.r;
import s6.s0;

/* compiled from: CryptoListController.kt */
/* loaded from: classes2.dex */
public final class CryptoListController extends Typed2EpoxyController<List<? extends CryptowalletDomain>, List<? extends CryptowalletDomain>> {
    private final InterfaceC0646l<Integer, p> actionRequiredClick;
    private final Context context;
    private final InterfaceC0646l<Integer, p> onClick;

    /* compiled from: CryptoListController.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12062a;

        static {
            int[] iArr = new int[CryptowalletDomain.WalletStatus.values().length];
            try {
                CryptowalletDomain.WalletStatus.a aVar = CryptowalletDomain.WalletStatus.f11086a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CryptowalletDomain.WalletStatus.a aVar2 = CryptowalletDomain.WalletStatus.f11086a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12062a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoListController(Context context, InterfaceC0646l<? super Integer, p> interfaceC0646l, InterfaceC0646l<? super Integer, p> interfaceC0646l2) {
        this.context = context;
        this.onClick = interfaceC0646l;
        this.actionRequiredClick = interfaceC0646l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$11$lambda$10$lambda$9$lambda$8(CryptowalletDomain cryptowalletDomain, CryptoListController cryptoListController, View view) {
        Long l10 = cryptowalletDomain.f11072a;
        if (l10 != null) {
            int longValue = (int) l10.longValue();
            InterfaceC0646l<Integer, p> interfaceC0646l = cryptoListController.actionRequiredClick;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(Integer.valueOf(longValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$3$lambda$2$lambda$1(CryptowalletDomain cryptowalletDomain, CryptoListController cryptoListController, View view) {
        Long l10 = cryptowalletDomain.f11072a;
        if (l10 != null) {
            int longValue = (int) l10.longValue();
            InterfaceC0646l<Integer, p> interfaceC0646l = cryptoListController.onClick;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(Integer.valueOf(longValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildModels$lambda$5(CryptowalletDomain.WalletStatus walletStatus, CryptowalletDomain.WalletStatus walletStatus2) {
        return walletStatus.name().compareTo(walletStatus2.name());
    }

    private final String getBlockedText(String str) {
        return this.context.getString(R.string.your_wallet_is_temporarily_frozen, str);
    }

    private final String getStatusText(CryptowalletDomain.WalletStatus walletStatus) {
        int i = walletStatus == null ? -1 : a.f12062a[walletStatus.ordinal()];
        return i != 1 ? i != 2 ? "" : this.context.getString(R.string.action_required) : this.context.getString(R.string.under_review);
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends CryptowalletDomain> list, List<? extends CryptowalletDomain> list2) {
        buildModels2((List<CryptowalletDomain>) list, (List<CryptowalletDomain>) list2);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(List<CryptowalletDomain> list, List<CryptowalletDomain> list2) {
        Integer z10;
        Integer z11;
        LinkedHashMap linkedHashMap = null;
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i9 = i + 1;
                if (i < 0) {
                    m.t();
                    throw null;
                }
                final CryptowalletDomain cryptowalletDomain = (CryptowalletDomain) obj;
                r rVar = new r();
                boolean z12 = cryptowalletDomain.f11076e == CryptowalletDomain.WalletStatus.f11092g;
                rVar.b("company_" + cryptowalletDomain.f11072a + System.currentTimeMillis());
                String str = cryptowalletDomain.f11077f;
                String str2 = cryptowalletDomain.f11078g;
                String G02 = b.G0(str2, str);
                rVar.onMutation();
                rVar.f26985a = G02;
                Integer valueOf = Integer.valueOf((str2 == null || (z11 = b.z(str2)) == null) ? 0 : z11.intValue());
                rVar.onMutation();
                rVar.f26989e = valueOf;
                Integer valueOf2 = Integer.valueOf(R.drawable.cell_bg_full_16);
                rVar.onMutation();
                rVar.f26987c = valueOf2;
                Boolean valueOf3 = Boolean.valueOf(z12);
                rVar.onMutation();
                rVar.f26991g = valueOf3;
                if (str2 == null) {
                    str2 = "";
                }
                rVar.a(getBlockedText(str2));
                rVar.onMutation();
                rVar.f26986b = cryptowalletDomain.f11074c;
                Boolean valueOf4 = Boolean.valueOf(!z12);
                rVar.onMutation();
                rVar.f26988d = valueOf4;
                final int i10 = 0;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: n7.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                CryptoListController.buildModels$lambda$3$lambda$2$lambda$1(cryptowalletDomain, this, view);
                                break;
                            default:
                                CryptoListController.buildModels$lambda$11$lambda$10$lambda$9$lambda$8(cryptowalletDomain, this, view);
                                break;
                        }
                    }
                };
                rVar.onMutation();
                rVar.f26990f = onClickListener;
                add(rVar);
                i = i9;
            }
        }
        if (list2 != null) {
            linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list2) {
                CryptowalletDomain.WalletStatus walletStatus = ((CryptowalletDomain) obj2).f11076e;
                Object obj3 = linkedHashMap.get(walletStatus);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(walletStatus, obj3);
                }
                ((List) obj3).add(obj2);
            }
        }
        if (linkedHashMap != null) {
            TreeMap treeMap = new TreeMap(new B9.a(3));
            treeMap.putAll(linkedHashMap);
            for (Map.Entry entry : treeMap.entrySet()) {
                s0 s0Var = new s0();
                s0Var.b("company_" + ((CryptowalletDomain.WalletStatus) entry.getKey()).name() + System.currentTimeMillis());
                s0Var.c(getStatusText((CryptowalletDomain.WalletStatus) entry.getKey()));
                s0Var.a(Boolean.valueOf(entry.getKey() == CryptowalletDomain.WalletStatus.f11088c));
                add(s0Var);
                for (final CryptowalletDomain cryptowalletDomain2 : (Iterable) entry.getValue()) {
                    r rVar2 = new r();
                    rVar2.b("company_" + cryptowalletDomain2.f11072a + System.currentTimeMillis());
                    String str3 = cryptowalletDomain2.f11077f;
                    String str4 = cryptowalletDomain2.f11078g;
                    String G03 = b.G0(str4, str3);
                    rVar2.onMutation();
                    rVar2.f26985a = G03;
                    Integer valueOf5 = Integer.valueOf((str4 == null || (z10 = b.z(str4)) == null) ? 0 : z10.intValue());
                    rVar2.onMutation();
                    rVar2.f26989e = valueOf5;
                    Object key = entry.getKey();
                    CryptowalletDomain.WalletStatus walletStatus2 = CryptowalletDomain.WalletStatus.f11087b;
                    Integer valueOf6 = Integer.valueOf(key == walletStatus2 ? R.drawable.cell_bg_under_review_16 : R.drawable.cell_bg_full_16);
                    rVar2.onMutation();
                    rVar2.f26987c = valueOf6;
                    Boolean bool = Boolean.FALSE;
                    rVar2.onMutation();
                    rVar2.f26991g = bool;
                    rVar2.onMutation();
                    rVar2.f26986b = cryptowalletDomain2.f11074c;
                    Boolean valueOf7 = Boolean.valueOf(entry.getKey() != walletStatus2);
                    rVar2.onMutation();
                    rVar2.f26988d = valueOf7;
                    final int i11 = 1;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: n7.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    CryptoListController.buildModels$lambda$3$lambda$2$lambda$1(cryptowalletDomain2, this, view);
                                    break;
                                default:
                                    CryptoListController.buildModels$lambda$11$lambda$10$lambda$9$lambda$8(cryptowalletDomain2, this, view);
                                    break;
                            }
                        }
                    };
                    rVar2.onMutation();
                    rVar2.f26990f = onClickListener2;
                    add(rVar2);
                }
            }
        }
    }
}
