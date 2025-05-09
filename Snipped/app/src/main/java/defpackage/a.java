package defpackage;

import D9.b;
import P9.s;
import android.text.SpannedString;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import java.math.BigDecimal;
import ka.C0969n;

/* compiled from: CryptoAccountDomainExt.kt */
/* loaded from: classes.dex */
public final class a {
    public static final SpannedString a(CryptoAccountDomain cryptoAccountDomain, int i, int i9) {
        String d10;
        String plainString;
        K5.a aVar = (K5.a) org.koin.java.a.a(K5.a.class).getValue();
        String str = cryptoAccountDomain.f10969g;
        if (str == null) {
            str = "";
        }
        String b9 = cryptoAccountDomain.b(aVar.Q(str));
        Double d11 = cryptoAccountDomain.f10977p;
        if (d11 == null || (plainString = new BigDecimal(String.valueOf(d11.doubleValue())).toPlainString()) == null) {
            d10 = CryptoAccountDomain.d("0");
        } else {
            String str2 = (String) s.L(C0969n.r0(plainString, new String[]{"."}));
            String p10 = b.p(str2 != null ? str2 : "");
            d10 = p10.length() == 0 ? CryptoAccountDomain.d("0") : CryptoAccountDomain.d(p10);
        }
        return b.v0("", d10, b9, cryptoAccountDomain.f10969g, i, i9, false, false, false, 384);
    }
}
