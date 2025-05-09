package com.luminary.business.presentation.ui.fragments.transfer;

import D9.b;
import G0.c;
import O9.p;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.ui.fragments.transfer.TransferController;
import com.luminary.mobile.R;
import java.util.Locale;
import s6.C1207B;
import s6.C1236z;
import s6.r0;
import w6.C1573a;

/* compiled from: TransferController.kt */
/* loaded from: classes2.dex */
public final class TransferController extends TypedEpoxyController<C1573a> {
    private final Context context;
    private final InterfaceC0646l<String, p> onAccountClick;
    private final c.InterfaceC0016c onAmountChange;
    private final c.InterfaceC0016c onReferenceChange;

    /* JADX WARN: Multi-variable type inference failed */
    public TransferController(Context context, InterfaceC0646l<? super String, p> interfaceC0646l, c.InterfaceC0016c interfaceC0016c, c.InterfaceC0016c interfaceC0016c2) {
        this.context = context;
        this.onAccountClick = interfaceC0646l;
        this.onReferenceChange = interfaceC0016c;
        this.onAmountChange = interfaceC0016c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$4$lambda$3$lambda$2(BankAccountDomain bankAccountDomain, TransferController transferController, View view) {
        InterfaceC0646l<String, p> interfaceC0646l;
        String str = bankAccountDomain.f10700g;
        if (str == null || (interfaceC0646l = transferController.onAccountClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$9$lambda$8$lambda$7(BankAccountDomain bankAccountDomain, TransferController transferController, View view) {
        InterfaceC0646l<String, p> interfaceC0646l;
        String str = bankAccountDomain.f10700g;
        if (str == null || (interfaceC0646l = transferController.onAccountClick) == null) {
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

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(C1573a c1573a) {
        String str;
        BankAccountDomain bankAccountDomain;
        final BankAccountDomain bankAccountDomain2;
        final BankAccountDomain bankAccountDomain3;
        C1236z c1236z = new C1236z();
        c1236z.a("from_header");
        String string = this.context.getString(R.string.from_account);
        c1236z.onMutation();
        c1236z.f27041a = string;
        Boolean bool = Boolean.FALSE;
        c1236z.onMutation();
        c1236z.f27042b = bool;
        c1236z.onMutation();
        c1236z.f27043c = bool;
        c1236z.onMutation();
        c1236z.f27044d = 8;
        add(c1236z);
        if (c1573a != null && (bankAccountDomain3 = c1573a.f30837a) != null) {
            String str2 = bankAccountDomain3.f10701h;
            Integer icon = icon(str2);
            r0 r0Var = new r0();
            r0Var.a("pay_" + bankAccountDomain3.f10700g);
            r0Var.onMutation();
            r0Var.f26993a = icon;
            r0Var.onMutation();
            r0Var.f26994b = bankAccountDomain3.i;
            String D2 = b.D(str2);
            r0Var.onMutation();
            r0Var.f26995c = D2;
            String b9 = F8.b.b(bankAccountDomain3);
            r0Var.onMutation();
            r0Var.f26996d = b9;
            String c2 = F8.b.c(bankAccountDomain3);
            r0Var.onMutation();
            r0Var.f26997e = c2;
            final int i = 0;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: u8.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            TransferController.buildModels$lambda$4$lambda$3$lambda$2(bankAccountDomain3, this, view);
                            break;
                        default:
                            TransferController.buildModels$lambda$9$lambda$8$lambda$7(bankAccountDomain3, this, view);
                            break;
                    }
                }
            };
            r0Var.onMutation();
            r0Var.f26998f = onClickListener;
            add(r0Var);
        }
        C1236z c1236z2 = new C1236z();
        c1236z2.a("to_header");
        String string2 = this.context.getString(R.string.to_account);
        c1236z2.onMutation();
        c1236z2.f27041a = string2;
        c1236z2.onMutation();
        c1236z2.f27042b = bool;
        c1236z2.onMutation();
        c1236z2.f27043c = bool;
        c1236z2.onMutation();
        c1236z2.f27044d = 8;
        c1236z2.b();
        add(c1236z2);
        if (c1573a != null && (bankAccountDomain2 = c1573a.f30838b) != null) {
            String str3 = bankAccountDomain2.f10701h;
            Integer icon2 = icon(str3);
            r0 r0Var2 = new r0();
            r0Var2.a("pay_" + bankAccountDomain2.f10700g);
            r0Var2.onMutation();
            r0Var2.f26993a = icon2;
            r0Var2.onMutation();
            r0Var2.f26994b = bankAccountDomain2.i;
            String D10 = b.D(str3);
            r0Var2.onMutation();
            r0Var2.f26995c = D10;
            String b10 = F8.b.b(bankAccountDomain2);
            r0Var2.onMutation();
            r0Var2.f26996d = b10;
            String c10 = F8.b.c(bankAccountDomain2);
            r0Var2.onMutation();
            r0Var2.f26997e = c10;
            final int i9 = 1;
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: u8.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            TransferController.buildModels$lambda$4$lambda$3$lambda$2(bankAccountDomain2, this, view);
                            break;
                        default:
                            TransferController.buildModels$lambda$9$lambda$8$lambda$7(bankAccountDomain2, this, view);
                            break;
                    }
                }
            };
            r0Var2.onMutation();
            r0Var2.f26998f = onClickListener2;
            add(r0Var2);
        }
        C1207B c1207b = new C1207B();
        c1207b.e();
        c1207b.d(this.context.getString(R.string.amount));
        c1207b.a((c1573a == null || (bankAccountDomain = c1573a.f30837a) == null) ? "" : K3.a.a(bankAccountDomain.f10701h));
        c1207b.f();
        c1207b.c(c1573a != null ? c1573a.f30842f : null);
        if (c1573a == null || (str = c1573a.f30840d) == null) {
            str = "0.00";
        }
        c1207b.h(str);
        c1207b.g();
        c1207b.b(this.onAmountChange);
        add(c1207b);
    }
}
