package F8;

import C.v;
import P9.s;
import android.content.Context;
import android.text.SpannedString;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Locale;
import ka.C0967l;
import ka.C0969n;
import w5.C1572a;

/* compiled from: BankAccountDomainExt.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final SpannedString a(BankAccountDomain bankAccountDomain, int i, int i9) {
        return D9.b.v0(C0969n.Y(b(bankAccountDomain), "-", false) ? "-" : "", b(bankAccountDomain), c(bankAccountDomain), bankAccountDomain.f10701h, i, i9, false, true, false, 256);
    }

    public static final String b(BankAccountDomain bankAccountDomain) {
        String bigDecimal;
        BigDecimal bigDecimal2 = bankAccountDomain.f10698e;
        if (bigDecimal2 == null || (bigDecimal = bigDecimal2.toString()) == null) {
            return "0";
        }
        String str = (String) s.L(C0969n.r0(bigDecimal, new String[]{"."}));
        if (str == null) {
            str = "";
        }
        String p10 = D9.b.p(str);
        return p10.length() == 0 ? "0" : p10;
    }

    public static final String c(BankAccountDomain bankAccountDomain) {
        BigDecimal scale;
        String bigDecimal;
        Integer num;
        C1572a Q4 = ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).Q(bankAccountDomain.f10701h);
        int intValue = (Q4 == null || (num = Q4.f30832g) == null) ? 2 : num.intValue();
        BigDecimal bigDecimal2 = bankAccountDomain.f10698e;
        if (bigDecimal2 == null || (scale = bigDecimal2.setScale(intValue, RoundingMode.HALF_DOWN)) == null || (bigDecimal = scale.toString()) == null) {
            return ".00";
        }
        List r02 = C0969n.r0(bigDecimal, new String[]{"."});
        if (r02.size() == 1) {
            return s3.b.j(".", C0967l.W(intValue, "0"));
        }
        String str = (String) s.R(r02);
        if (str == null) {
            str = "";
        }
        return str.length() == 0 ? Q4 == null ? ".00" : s3.b.j(".", C0967l.W(intValue, "0")) : s3.b.j(".", D9.b.G(intValue, str));
    }

    public static final String d(BankAccountDomain bankAccountDomain) {
        return K3.a.a(bankAccountDomain.f10701h);
    }

    public static final String e(BankAccountDomain bankAccountDomain) {
        String str = bankAccountDomain.f10701h;
        String a10 = K3.a.a(str);
        if (a10.length() == 0) {
            return str != null ? str.toUpperCase(Locale.ROOT) : "";
        }
        return a10;
    }

    public static final String f(BankAccountDomain bankAccountDomain) {
        String str = bankAccountDomain.f10701h;
        String a10 = K3.a.a(str);
        if (a10.length() == 0) {
            a10 = str != null ? str.toUpperCase(Locale.ROOT) : "";
        }
        if (K3.a.b(a10)) {
            String p10 = v.p(a10, b(bankAccountDomain), c(bankAccountDomain));
            return C0969n.Y(p10, "-", false) ? "-".concat(C0967l.X(p10, "-", "", false)) : p10;
        }
        String str2 = b(bankAccountDomain) + c(bankAccountDomain) + " " + a10;
        return C0969n.Y(str2, "-", false) ? "-".concat(C0967l.X(str2, "-", "", false)) : str2;
    }

    public static final Integer g(BankAccountDomain bankAccountDomain, Context context) {
        String str = bankAccountDomain.f10701h;
        if (str != null) {
            return D9.b.M(context, str);
        }
        return null;
    }
}
