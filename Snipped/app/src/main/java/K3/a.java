package K3;

import P9.n;
import P9.s;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: StringExt.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f2255a;

    static {
        Set<Currency> availableCurrencies = Currency.getAvailableCurrencies();
        ArrayList arrayList = new ArrayList(n.u(availableCurrencies, 10));
        Iterator<T> it = availableCurrencies.iterator();
        while (it.hasNext()) {
            arrayList.add(((Currency) it.next()).getCurrencyCode());
        }
        f2255a = s.g0(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(String str) {
        String str2;
        Locale locale = Locale.US;
        if (str == null || str.length() == 0) {
            return "";
        }
        Locale locale2 = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale2);
        switch (lowerCase.hashCode()) {
            case 98246:
                if (lowerCase.equals("cad")) {
                    str2 = "CA$";
                    return str2;
                }
                try {
                    return Currency.getInstance(str.toUpperCase(locale2)).getSymbol(locale);
                } catch (IllegalArgumentException unused) {
                    return "";
                }
            case 98465:
                if (lowerCase.equals("chf")) {
                    str2 = "₣";
                    return str2;
                }
                return Currency.getInstance(str.toUpperCase(locale2)).getSymbol(locale);
            case 98670:
                if (lowerCase.equals("cny")) {
                    str2 = "¥";
                    return str2;
                }
                return Currency.getInstance(str.toUpperCase(locale2)).getSymbol(locale);
            case 100802:
                if (lowerCase.equals("eur")) {
                    str2 = "€";
                    return str2;
                }
                return Currency.getInstance(str.toUpperCase(locale2)).getSymbol(locale);
            case 102133:
                if (lowerCase.equals("gbp")) {
                    str2 = "£";
                    return str2;
                }
                return Currency.getInstance(str.toUpperCase(locale2)).getSymbol(locale);
            case 116102:
                if (lowerCase.equals("usd")) {
                    str2 = "$";
                    return str2;
                }
                return Currency.getInstance(str.toUpperCase(locale2)).getSymbol(locale);
            default:
                return Currency.getInstance(str.toUpperCase(locale2)).getSymbol(locale);
        }
    }

    public static final boolean b(String str) {
        if (str.length() == 1) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(String str) {
        if (str == null) {
            return false;
        }
        return f2255a.contains(str.toUpperCase(Locale.ROOT));
    }
}
