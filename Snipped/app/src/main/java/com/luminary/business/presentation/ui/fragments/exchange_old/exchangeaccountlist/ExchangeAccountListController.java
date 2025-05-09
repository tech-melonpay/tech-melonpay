package com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist;

import D9.b;
import O9.p;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.mobile.R;
import java.util.List;
import java.util.Locale;
import s6.C1236z;
import s6.r0;
import y8.ViewOnClickListenerC1624e;

/* compiled from: ExchangeAccountListController.kt */
/* loaded from: classes2.dex */
public final class ExchangeAccountListController extends Typed2EpoxyController<String, List<? extends BankAccountDomain>> {
    private final Context context;
    private final InterfaceC0646l<String, p> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public ExchangeAccountListController(Context context, InterfaceC0646l<? super String, p> interfaceC0646l) {
        this.context = context;
        this.onClick = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$4$lambda$3$lambda$2(BankAccountDomain bankAccountDomain, ExchangeAccountListController exchangeAccountListController, View view) {
        InterfaceC0646l<String, p> interfaceC0646l;
        String str = bankAccountDomain.f10700g;
        if (str == null || (interfaceC0646l = exchangeAccountListController.onClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    private final Integer icon(String str) {
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase == null) {
            return null;
        }
        switch (lowerCase.hashCode()) {
            case 96448:
                if (lowerCase.equals("aed")) {
                    return Integer.valueOf(R.drawable.ic_ae);
                }
                return null;
            case 98246:
                if (lowerCase.equals("cad")) {
                    return Integer.valueOf(R.drawable.ic_ca);
                }
                return null;
            case 98465:
                if (lowerCase.equals("chf")) {
                    return Integer.valueOf(R.drawable.ic_ch);
                }
                return null;
            case 98670:
                if (lowerCase.equals("cny")) {
                    return Integer.valueOf(R.drawable.ic_cn);
                }
                return null;
            case 100802:
                if (lowerCase.equals("eur")) {
                    return Integer.valueOf(R.drawable.ic_euro);
                }
                return null;
            case 102133:
                if (lowerCase.equals("gbp")) {
                    return Integer.valueOf(R.drawable.ic_gb);
                }
                return null;
            case 110164:
                if (lowerCase.equals("omr")) {
                    return Integer.valueOf(R.drawable.ic_om);
                }
                return null;
            case 116102:
                if (lowerCase.equals("usd")) {
                    return Integer.valueOf(R.drawable.ic_us);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(String str, List<? extends BankAccountDomain> list) {
        buildModels2(str, (List<BankAccountDomain>) list);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(String str, List<BankAccountDomain> list) {
        C1236z c1236z = new C1236z();
        c1236z.a("header");
        c1236z.onMutation();
        c1236z.f27041a = str;
        Boolean bool = Boolean.FALSE;
        c1236z.onMutation();
        c1236z.f27042b = bool;
        c1236z.onMutation();
        c1236z.f27043c = bool;
        c1236z.onMutation();
        c1236z.f27044d = 4;
        add(c1236z);
        if (list != null) {
            for (BankAccountDomain bankAccountDomain : list) {
                Integer icon = icon(bankAccountDomain.f10701h);
                r0 r0Var = new r0();
                r0Var.a("pay_" + bankAccountDomain.f10700g);
                r0Var.onMutation();
                r0Var.f26993a = icon;
                r0Var.onMutation();
                r0Var.f26994b = bankAccountDomain.i;
                String D2 = b.D(bankAccountDomain.f10701h);
                r0Var.onMutation();
                r0Var.f26995c = D2;
                String b9 = F8.b.b(bankAccountDomain);
                r0Var.onMutation();
                r0Var.f26996d = b9;
                String c2 = F8.b.c(bankAccountDomain);
                r0Var.onMutation();
                r0Var.f26997e = c2;
                ViewOnClickListenerC1624e viewOnClickListenerC1624e = new ViewOnClickListenerC1624e(1, bankAccountDomain, this);
                r0Var.onMutation();
                r0Var.f26998f = viewOnClickListenerC1624e;
                add(r0Var);
            }
        }
    }
}
