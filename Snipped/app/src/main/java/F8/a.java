package F8;

import P9.s;
import android.text.SpannedString;
import com.luminary.business.presentation.entity.account.AccountDetailsUI;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import ka.C0967l;
import ka.C0969n;
import w5.C1572a;

/* compiled from: AccountUIExt.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final SpannedString a(AccountDetailsUI accountDetailsUI) {
        String G8;
        String str;
        Integer num;
        String str2 = C0969n.Y(b(accountDetailsUI), "-", false) ? "-" : "";
        String b9 = b(accountDetailsUI);
        C1572a Q4 = ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).Q(accountDetailsUI.f11171h);
        int intValue = (Q4 == null || (num = Q4.f30832g) == null) ? 2 : num.intValue();
        BigDecimal bigDecimal = accountDetailsUI.f11168e;
        List r02 = C0969n.r0(String.valueOf(bigDecimal != null ? bigDecimal.setScale(intValue, RoundingMode.HALF_DOWN) : null), new String[]{"."});
        if (r02.size() == 1) {
            G8 = C0967l.W(intValue, "0");
        } else {
            String str3 = (String) s.R(r02);
            String str4 = str3 != null ? str3 : "";
            if (str4.length() != 0) {
                G8 = D9.b.G(intValue, str4);
            } else {
                if (Q4 == null) {
                    str = ".00";
                    return D9.b.v0(str2, b9, str, accountDetailsUI.f11171h, 30, 20, false, true, false, 256);
                }
                G8 = C0967l.W(intValue, "0");
            }
        }
        str = s3.b.j(".", G8);
        return D9.b.v0(str2, b9, str, accountDetailsUI.f11171h, 30, 20, false, true, false, 256);
    }

    public static final String b(AccountDetailsUI accountDetailsUI) {
        String bigDecimal;
        BigDecimal bigDecimal2 = accountDetailsUI.f11168e;
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
}
