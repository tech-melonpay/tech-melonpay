package t8;

import O9.p;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.business.presentation.ui.fragments.transactions.TransactionDetailsFragment;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionDetailsFragment f29937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransactionUI f29938c;

    public /* synthetic */ c(TransactionDetailsFragment transactionDetailsFragment, TransactionUI transactionUI, int i) {
        this.f29936a = i;
        this.f29937b = transactionDetailsFragment;
        this.f29938c = transactionUI;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Integer num;
        TransactionUI transactionUI = this.f29938c;
        TransactionDetailsFragment transactionDetailsFragment = this.f29937b;
        switch (this.f29936a) {
            case 0:
                File file = new File(transactionDetailsFragment.requireContext().getFilesDir().getAbsolutePath(), "Statements");
                if (!file.exists()) {
                    file.mkdirs();
                }
                boolean b9 = kotlin.jvm.internal.f.b(transactionUI.f11375e, "fx_order");
                String str = transactionUI.f11375e;
                if ((b9 || kotlin.jvm.internal.f.b(str, "fx_execution")) && (num = transactionUI.f11370E) != null) {
                    j U02 = transactionDetailsFragment.U0();
                    String absolutePath = file.getAbsolutePath();
                    String num2 = num.toString();
                    U02.getClass();
                    i iVar = new i(U02, absolutePath, num2, 2);
                    U02.f423P0 = iVar;
                    iVar.invoke();
                } else if (kotlin.jvm.internal.f.b(str, "to_bank_account") || kotlin.jvm.internal.f.b(str, "internal")) {
                    j U03 = transactionDetailsFragment.U0();
                    String absolutePath2 = file.getAbsolutePath();
                    String str2 = transactionUI.f11371a;
                    String str3 = str2 != null ? str2 : "";
                    U03.getClass();
                    i iVar2 = new i(U03, absolutePath2, str3, 1);
                    U03.f421M0 = iVar2;
                    iVar2.invoke();
                }
                break;
            default:
                NavController g10 = U4.b.g(transactionDetailsFragment);
                CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12050a;
                String str4 = transactionUI.f11366A;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = transactionUI.f11367B;
                g10.j(new f(str4, str5 != null ? str5 : ""));
                break;
        }
        return p.f3034a;
    }
}
