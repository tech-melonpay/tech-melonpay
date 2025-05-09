package A7;

import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.account.FeeDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Locale;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109a;

    public /* synthetic */ d(int i) {
        this.f109a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f109a) {
            case 0:
                return R9.a.a(((FeeDomain) obj2).f10744h, ((FeeDomain) obj).f10744h);
            case 1:
                Integer num = ((BankAccountDomain) obj2).f10702j;
                boolean z10 = false;
                Boolean valueOf = Boolean.valueOf(num != null && num.intValue() == 1);
                Integer num2 = ((BankAccountDomain) obj).f10702j;
                if (num2 != null && num2.intValue() == 1) {
                    z10 = true;
                }
                return R9.a.a(valueOf, Boolean.valueOf(z10));
            case 2:
                return R9.a.a(((CryptoAccountDomain) obj2).f10977p, ((CryptoAccountDomain) obj).f10977p);
            case 3:
                return R9.a.a(((F5.b) obj).f1191d, ((F5.b) obj2).f1191d);
            case 4:
                BigDecimal bigDecimal = ((F5.b) obj).f1195h;
                if (bigDecimal == null) {
                    bigDecimal = BigDecimal.ZERO;
                }
                BigDecimal abs = bigDecimal.abs();
                BigDecimal bigDecimal2 = ((F5.b) obj2).f1195h;
                if (bigDecimal2 == null) {
                    bigDecimal2 = BigDecimal.ZERO;
                }
                return R9.a.a(abs, bigDecimal2.abs());
            case 5:
                return R9.a.a(((F5.b) obj2).f1191d, ((F5.b) obj).f1191d);
            case 6:
                BigDecimal bigDecimal3 = ((F5.b) obj2).f1195h;
                if (bigDecimal3 == null) {
                    bigDecimal3 = BigDecimal.ZERO;
                }
                BigDecimal abs2 = bigDecimal3.abs();
                BigDecimal bigDecimal4 = ((F5.b) obj).f1195h;
                if (bigDecimal4 == null) {
                    bigDecimal4 = BigDecimal.ZERO;
                }
                return R9.a.a(abs2, bigDecimal4.abs());
            case 7:
                return R9.a.a(((BankAccountDomain) obj2).f10698e, ((BankAccountDomain) obj).f10698e);
            case 8:
                return R9.a.a(((A5.b) obj2).f89j, ((A5.b) obj).f89j);
            case 9:
                String str = ((H5.b) obj).f1500e;
                String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
                String str2 = ((H5.b) obj2).f1500e;
                return R9.a.a(lowerCase, str2 != null ? str2.toLowerCase(Locale.ROOT) : null);
            case 10:
                String str3 = ((H5.b) obj2).f1500e;
                String lowerCase2 = str3 != null ? str3.toLowerCase(Locale.ROOT) : null;
                String str4 = ((H5.b) obj).f1500e;
                return R9.a.a(lowerCase2, str4 != null ? str4.toLowerCase(Locale.ROOT) : null);
            case 11:
                return R9.a.a(((C5.a) obj2).f665b, ((C5.a) obj).f665b);
            case 12:
                return R9.a.a(((C5.a) obj2).i, ((C5.a) obj).i);
            case 13:
                CryptowalletDomain.WalletStatus walletStatus = ((CryptowalletDomain) obj).f11076e;
                CryptowalletDomain.WalletStatus walletStatus2 = CryptowalletDomain.WalletStatus.f11092g;
                return R9.a.a(Boolean.valueOf(walletStatus == walletStatus2), Boolean.valueOf(((CryptowalletDomain) obj2).f11076e == walletStatus2));
            case 14:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            default:
                return R9.a.a(((FeeDomain) obj2).f10744h, ((FeeDomain) obj).f10744h);
        }
    }
}
