package D9;

import C.v;
import E9.g;
import E9.h;
import I5.k;
import P9.m;
import P9.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.TypedValue;
import android.view.View;
import androidx.room.RoomDatabase;
import ca.InterfaceC0650p;
import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.mobile.R;
import io.sentry.DataCategory;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.clientreport.DiscardReason;
import io.sentry.g0;
import ja.i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k0.C0913a;
import ka.C0962g;
import ka.C0967l;
import ka.C0969n;
import ka.C0970o;
import kotlin.Pair;
import kotlin.text.Regex;
import pa.C1124b;
import u9.t;
import w5.C1572a;

/* compiled from: ClasspathPropertiesLoader.java */
/* loaded from: classes2.dex */
public final class b implements t, C9.e, g, h, H3.a {

    /* renamed from: a, reason: collision with root package name */
    public static b f982a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String A(String str) {
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case 96448:
                    if (lowerCase.equals("aed")) {
                        return "United Arab Emirates Dirham";
                    }
                    break;
                case 98246:
                    if (lowerCase.equals("cad")) {
                        return "Canadian Dollar";
                    }
                    break;
                case 98465:
                    if (lowerCase.equals("chf")) {
                        return "Swiss Franc";
                    }
                    break;
                case 98670:
                    if (lowerCase.equals("cny")) {
                        return "Chinese Yuan";
                    }
                    break;
                case 100802:
                    if (lowerCase.equals("eur")) {
                        return "Euro";
                    }
                    break;
                case 102133:
                    if (lowerCase.equals("gbp")) {
                        return "British Pound";
                    }
                    break;
                case 103361:
                    if (lowerCase.equals("hkd")) {
                        return "Hong Kong Dollar";
                    }
                    break;
                case 110164:
                    if (lowerCase.equals("omr")) {
                        return "Omani Rial";
                    }
                    break;
                case 116102:
                    if (lowerCase.equals("usd")) {
                        return "Dollar";
                    }
                    break;
            }
        }
        return "";
    }

    public static final SpannedString A0(TransactionUI transactionUI) {
        if (a0(transactionUI)) {
            String str = transactionUI.f11384o;
            return new SpannedString(str != null ? l(str) : null);
        }
        String str2 = transactionUI.f11375e;
        if (kotlin.jvm.internal.f.b(str2, "fx_order")) {
            BigDecimal bigDecimal = transactionUI.f11369D;
            return bigDecimal == null ? new SpannedString("") : v0("+", v(bigDecimal.toPlainString()), u(bigDecimal.toPlainString(), transactionUI.f11367B), transactionUI.f11367B, 10, 7, true, true, false, 256);
        }
        if (!kotlin.jvm.internal.f.b(str2, "fx_execution") && !kotlin.jvm.internal.f.b(str2, "exchange")) {
            return new SpannedString("");
        }
        BigDecimal bigDecimal2 = transactionUI.f11368C;
        return bigDecimal2 == null ? new SpannedString("") : v0("-", v(bigDecimal2.toPlainString()), u(bigDecimal2.toPlainString(), transactionUI.f11366A), transactionUI.f11366A, 10, 7, true, true, false, 256);
    }

    public static final Integer B(TransactionUI transactionUI, Context context) {
        String str = transactionUI.f11378h;
        if (K3.a.c(str)) {
            if (str != null) {
                return M(context, str);
            }
            return null;
        }
        if (!Z(str) || str == null) {
            return null;
        }
        return z(str);
    }

    public static final String B0(String str) {
        return s.P(C0969n.r0(str, new String[]{" "}), " ", null, null, new B8.a(0), 30);
    }

    public static final String C(String str) {
        String a10 = K3.a.a(str);
        return a10.length() == 0 ? str.toUpperCase(Locale.ROOT) : a10;
    }

    public static final String C0(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String D(String str) {
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case 96448:
                    if (lowerCase.equals("aed")) {
                        return v.n(str, " • UAE Dirham");
                    }
                    break;
                case 98246:
                    if (lowerCase.equals("cad")) {
                        return v.n(str, " • Canadian Dollar");
                    }
                    break;
                case 98465:
                    if (lowerCase.equals("chf")) {
                        return v.n(str, " • Swiss Franc");
                    }
                    break;
                case 98670:
                    if (lowerCase.equals("cny")) {
                        return v.n(str, " • Chinese Yuan");
                    }
                    break;
                case 100802:
                    if (lowerCase.equals("eur")) {
                        return v.n(str, " • Euro");
                    }
                    break;
                case 102133:
                    if (lowerCase.equals("gbp")) {
                        return v.n(str, " • British Pound");
                    }
                    break;
                case 103361:
                    if (lowerCase.equals("hkd")) {
                        return v.n(str, " • Hong Kong Dollar");
                    }
                    break;
                case 110164:
                    if (lowerCase.equals("omr")) {
                        return v.n(str, " • Omani Rial");
                    }
                    break;
                case 116102:
                    if (lowerCase.equals("usd")) {
                        return v.n(str, " • Dollar");
                    }
                    break;
            }
        }
        return "";
    }

    public static final int D0(String str, float f10) {
        int C10 = U4.b.C(255 * f10);
        int i = C10 <= 255 ? C10 : 255;
        if (i < 1) {
            i = 1;
        }
        return n0.a.h(Color.parseColor(str), i);
    }

    public static final Integer E(C5.b bVar) {
        float floatValue;
        Float f10 = null;
        String str = bVar.f678f;
        if (str == null) {
            return null;
        }
        String str2 = bVar.f679g;
        if (str2 != null) {
            try {
                if (C0962g.f23079a.b(str2)) {
                    f10 = Float.valueOf(Float.parseFloat(str2));
                }
            } catch (NumberFormatException unused) {
            }
            if (f10 != null) {
                floatValue = f10.floatValue();
                return Integer.valueOf(D0(str, floatValue));
            }
        }
        floatValue = 1.0f;
        return Integer.valueOf(D0(str, floatValue));
    }

    public static final Date E0(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static final float F(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final String F0(Date date, String str) {
        if (date == null) {
            return "";
        }
        Calendar.getInstance().setTime(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(date);
    }

    public static final String G(int i, String str) {
        return str.length() >= i ? str.substring(0, i) : v.n(str, C0967l.W(i - str.length(), "0"));
    }

    public static final String G0(String str, String str2) {
        return v.p(str, " • ", str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r5.equals("matic") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r5.equals("usdt") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r5.equals("usdc") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r5.equals("xtz") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r5.equals("xrp") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r5.equals("trx") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r5.equals("sol") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r5.equals("eth") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        if (r5.equals("dai") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
    
        if (r5.equals("btc") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (r5.equals("ada") == false) goto L59;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String H(com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain r3, boolean r4, w5.C1572a r5) {
        /*
            if (r4 == 0) goto L5
            java.lang.String r0 = r3.f11027l
            goto L7
        L5:
            java.lang.String r0 = r3.f11028m
        L7:
            java.lang.String r1 = t(r3, r4)
            java.lang.String r3 = r3.a(r4, r5)
            java.lang.String r3 = C.v.n(r1, r3)
            java.lang.String r4 = K3.a.a(r0)
            int r5 = r4.length()
            java.lang.String r1 = ""
            if (r5 != 0) goto L29
            if (r0 == 0) goto L28
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r4 = r0.toUpperCase(r4)
            goto L29
        L28:
            r4 = r1
        L29:
            boolean r5 = K3.a.c(r0)
            java.lang.String r2 = " "
            if (r5 == 0) goto L41
            boolean r5 = K3.a.b(r4)
            if (r5 == 0) goto L3c
            java.lang.String r3 = C.v.n(r4, r3)
            goto L40
        L3c:
            java.lang.String r3 = C.v.p(r3, r2, r4)
        L40:
            return r3
        L41:
            if (r0 == 0) goto L4a
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r5 = r0.toLowerCase(r5)
            goto L4b
        L4a:
            r5 = 0
        L4b:
            if (r5 == 0) goto Lbf
            int r0 = r5.hashCode()
            switch(r0) {
                case 96414: goto Lb1;
                case 97873: goto La8;
                case 99212: goto L9f;
                case 100761: goto L96;
                case 114064: goto L8d;
                case 115130: goto L84;
                case 118966: goto L7b;
                case 119038: goto L72;
                case 3599261: goto L69;
                case 3599278: goto L60;
                case 103668346: goto L56;
                default: goto L54;
            }
        L54:
            goto Lbf
        L56:
            java.lang.String r0 = "matic"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lbf
        L60:
            java.lang.String r0 = "usdt"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lbf
        L69:
            java.lang.String r0 = "usdc"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lbf
        L72:
            java.lang.String r0 = "xtz"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lbf
        L7b:
            java.lang.String r0 = "xrp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lbf
        L84:
            java.lang.String r0 = "trx"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lbf
        L8d:
            java.lang.String r0 = "sol"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lbf
        L96:
            java.lang.String r0 = "eth"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lbf
        L9f:
            java.lang.String r0 = "dai"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lbf
        La8:
            java.lang.String r0 = "btc"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lbf
        Lb1:
            java.lang.String r0 = "ada"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto Lba
            goto Lbf
        Lba:
            java.lang.String r3 = C.v.p(r3, r2, r4)
            return r3
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.b.H(com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain, boolean, w5.a):java.lang.String");
    }

    public static long H0() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    public static final String I(String str, String str2) {
        return v.n(v(str), u(str, str2));
    }

    public static final int I0(TransactionUI transactionUI) {
        String str = transactionUI.f11384o;
        if (str != null && C0969n.Y(str.toLowerCase(Locale.ROOT), "in_progress", false)) {
            return R.drawable.ic_progress;
        }
        String str2 = transactionUI.f11375e;
        return kotlin.jvm.internal.f.b(str2, "commission") ? R.drawable.ic_percent : (kotlin.jvm.internal.f.b(str2, "fx_order") || kotlin.jvm.internal.f.b(str2, "fx_execution") || kotlin.jvm.internal.f.b(str2, "exchange")) ? R.drawable.ic_exchange : transactionUI.f11388s ? R.drawable.ic_transaction_income : R.drawable.ic_transaction_out;
    }

    public static final String J(String str, String str2) {
        return v.n(K3.a.a(str2), c(v(str)));
    }

    public static final String K(k kVar) {
        return kVar.i + " " + kVar.f1830j;
    }

    public static final int L(CardTransactionDomain cardTransactionDomain) {
        String str = cardTransactionDomain.f10756e;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase == null) {
            return R.drawable.ic_card_wallet;
        }
        switch (lowerCase.hashCode()) {
            case -1385570183:
                if (!lowerCase.equals("authorization")) {
                    return R.drawable.ic_card_wallet;
                }
                break;
            case -1199938726:
                lowerCase.equals("accountadjustment");
                return R.drawable.ic_card_wallet;
            case 101254:
                return !lowerCase.equals("fee") ? R.drawable.ic_card_wallet : R.drawable.ic_card_fee;
            case 2141246174:
                if (!lowerCase.equals("transaction")) {
                    return R.drawable.ic_card_wallet;
                }
                break;
            default:
                return R.drawable.ic_card_wallet;
        }
        return R.drawable.ic_card_payment;
    }

    public static final Integer M(Context context, String str) {
        Resources resources;
        String lowerCase = C0970o.z0(2, str).toLowerCase(Locale.ROOT);
        if (kotlin.jvm.internal.f.b(lowerCase, "eu")) {
            return Integer.valueOf(R.drawable.ic_euro);
        }
        if (context == null || (resources = context.getResources()) == null) {
            return null;
        }
        return Integer.valueOf(resources.getIdentifier("ic_".concat(lowerCase), "drawable", context.getPackageName()));
    }

    public static final Integer N(TransactionUI transactionUI, Context context) {
        String str = transactionUI.f11378h;
        if (K3.a.c(str)) {
            if (str != null) {
                return M(context, str);
            }
            return null;
        }
        if (!Z(str) || str == null) {
            return null;
        }
        return z(str);
    }

    public static final String O(A5.b bVar, Context context) {
        String str = bVar.f87g;
        return str != null ? v.p(context.getString(R.string.loan), " • ", str) : "";
    }

    public static final String P(F5.b bVar) {
        return c0(bVar) ? bVar.f1197k : bVar.f1204r;
    }

    public static final String Q(CardTransactionDomain cardTransactionDomain, Context context) {
        String str = cardTransactionDomain.f10756e;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase == null) {
            return "";
        }
        int hashCode = lowerCase.hashCode();
        String str2 = cardTransactionDomain.f10763m;
        switch (hashCode) {
            case -1385570183:
                if (!lowerCase.equals("authorization") || str2 == null) {
                    return "";
                }
                break;
            case -1199938726:
                return !lowerCase.equals("accountadjustment") ? "" : context.getString(R.string.account_top_up);
            case 101254:
                return !lowerCase.equals("fee") ? "" : context.getString(R.string.fx_fee);
            case 2141246174:
                if (!lowerCase.equals("transaction") || str2 == null) {
                    return "";
                }
                break;
            default:
                return "";
        }
        return str2;
    }

    public static final String R(TransactionUI transactionUI, Context context) {
        String str;
        String str2 = transactionUI.f11375e;
        transactionUI.f11379j = kotlin.jvm.internal.f.b(str2, "commission") ? context.getString(R.string.commission) : transactionUI.f11379j;
        if (!kotlin.jvm.internal.f.b(str2, "fx_order") && !kotlin.jvm.internal.f.b(str2, "fx_execution") && !kotlin.jvm.internal.f.b(str2, "exchange")) {
            return transactionUI.f11388s ? transactionUI.f11376f : transactionUI.f11379j;
        }
        String str3 = transactionUI.f11366A;
        return (str3 == null || str3.length() == 0 || (str = transactionUI.f11367B) == null || str.length() == 0) ? context.getString(R.string.value_exchange, transactionUI.f11378h) : v.p(str3, " to ", str);
    }

    public static final String S(TransactionUI transactionUI, Context context) {
        String R = R(transactionUI, context);
        return R == null ? "" : R;
    }

    public static final float T(int i) {
        return i * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final String U(String str) {
        String obj;
        if (str != null) {
            try {
                obj = C0969n.u0(str).toString();
            } catch (Exception unused) {
            }
        } else {
            obj = null;
        }
        if (obj != null && obj.length() != 0) {
            List d10 = new Regex("\\s+").d(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : d10) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() < 2) {
                return C0970o.z0(2, obj).toUpperCase(Locale.ROOT);
            }
            String valueOf = String.valueOf(((String) arrayList.get(0)).charAt(0));
            Locale locale = Locale.ROOT;
            return valueOf.toUpperCase(locale) + String.valueOf(((String) arrayList.get(1)).charAt(0)).toUpperCase(locale);
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007b A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int V(A5.b r1) {
        /*
            java.lang.String r1 = r1.f88h
            if (r1 == 0) goto L99
            int r0 = r1.hashCode()
            switch(r0) {
                case -1917251496: goto L8c;
                case -1548812293: goto L7f;
                case -1309235419: goto L72;
                case -1263365596: goto L65;
                case -824862329: goto L62;
                case 3417674: goto L5f;
                case 72116155: goto L56;
                case 349338504: goto L49;
                case 568196142: goto L40;
                case 647890911: goto L31;
                case 708151384: goto L2e;
                case 805281635: goto L24;
                case 1124814361: goto L21;
                case 1194212435: goto L1e;
                case 1882592001: goto L14;
                case 1994519518: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L99
        Ld:
            java.lang.String r0 = "in_underwriting"
        Lf:
            r1.equals(r0)
            goto L99
        L14:
            java.lang.String r0 = "offer_rejected"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L7b
            goto L99
        L1e:
            java.lang.String r0 = "customer_to_link_open_banking"
            goto Lf
        L21:
            java.lang.String r0 = "talking_to_customer"
            goto Lf
        L24:
            java.lang.String r0 = "conditional_offer"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L95
            goto L99
        L2e:
            java.lang.String r0 = "awaiting_underwriter"
            goto Lf
        L31:
            java.lang.String r0 = "deferred"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3b
            goto L99
        L3b:
            r1 = 2132017566(0x7f14019e, float:1.9673414E38)
            goto L9c
        L40:
            java.lang.String r0 = "declined"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L7b
            goto L99
        L49:
            java.lang.String r0 = "action_required"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L52
            goto L99
        L52:
            r1 = 2132017202(0x7f140032, float:1.9672676E38)
            goto L9c
        L56:
            java.lang.String r0 = "offer_revoked"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L7b
            goto L99
        L5f:
            java.lang.String r0 = "open"
            goto Lf
        L62:
            java.lang.String r0 = "unknown_status"
            goto Lf
        L65:
            java.lang.String r0 = "funded"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            goto L99
        L6e:
            r1 = 2132017697(0x7f140221, float:1.967368E38)
            goto L9c
        L72:
            java.lang.String r0 = "expired"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L7b
            goto L99
        L7b:
            r1 = 2132017560(0x7f140198, float:1.9673402E38)
            goto L9c
        L7f:
            java.lang.String r0 = "offered"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L88
            goto L99
        L88:
            r1 = 2132017248(0x7f140060, float:1.967277E38)
            goto L9c
        L8c:
            java.lang.String r0 = "conditional_offer_criteria_met"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L95
            goto L99
        L95:
            r1 = 2132018150(0x7f1403e6, float:1.9674599E38)
            goto L9c
        L99:
            r1 = 2132017748(0x7f140254, float:1.9673783E38)
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.b.V(A5.b):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int W(A5.b r1) {
        /*
            java.lang.String r1 = r1.f88h
            if (r1 == 0) goto L65
            int r0 = r1.hashCode()
            switch(r0) {
                case -1917251496: goto L58;
                case -1548812293: goto L4f;
                case -1309235419: goto L42;
                case -1263365596: goto L39;
                case 72116155: goto L30;
                case 568196142: goto L27;
                case 647890911: goto L1e;
                case 805281635: goto L15;
                case 1882592001: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L65
        Lc:
            java.lang.String r0 = "offer_rejected"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4b
            goto L65
        L15:
            java.lang.String r0 = "conditional_offer"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L61
            goto L65
        L1e:
            java.lang.String r0 = "deferred"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4b
            goto L65
        L27:
            java.lang.String r0 = "declined"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4b
            goto L65
        L30:
            java.lang.String r0 = "offer_revoked"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4b
            goto L65
        L39:
            java.lang.String r0 = "funded"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L61
            goto L65
        L42:
            java.lang.String r0 = "expired"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4b
            goto L65
        L4b:
            r1 = 2131231753(0x7f080409, float:1.8079596E38)
            goto L68
        L4f:
            java.lang.String r0 = "offered"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L61
            goto L65
        L58:
            java.lang.String r0 = "conditional_offer_criteria_met"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L61
            goto L65
        L61:
            r1 = 2131231751(0x7f080407, float:1.8079592E38)
            goto L68
        L65:
            r1 = 2131231755(0x7f08040b, float:1.80796E38)
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.b.W(A5.b):int");
    }

    public static final Integer X(C5.b bVar) {
        float floatValue;
        Float f10 = null;
        String str = bVar.f676d;
        if (str == null) {
            return null;
        }
        String str2 = bVar.f677e;
        if (str2 != null) {
            try {
                if (C0962g.f23079a.b(str2)) {
                    f10 = Float.valueOf(Float.parseFloat(str2));
                }
            } catch (NumberFormatException unused) {
            }
            if (f10 != null) {
                floatValue = f10.floatValue();
                return Integer.valueOf(D0(str, floatValue));
            }
        }
        floatValue = 1.0f;
        return Integer.valueOf(D0(str, floatValue));
    }

    public static boolean Y(int i) {
        return i != 0 && n0.a.d(i) > 0.5d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean Z(String str) {
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case 96414:
                    if (lowerCase.equals("ada")) {
                        return true;
                    }
                    break;
                case 97873:
                    if (lowerCase.equals("btc")) {
                        return true;
                    }
                    break;
                case 99212:
                    if (lowerCase.equals("dai")) {
                        return true;
                    }
                    break;
                case 100761:
                    if (lowerCase.equals("eth")) {
                        return true;
                    }
                    break;
                case 114064:
                    if (lowerCase.equals("sol")) {
                        return true;
                    }
                    break;
                case 115130:
                    if (lowerCase.equals("trx")) {
                        return true;
                    }
                    break;
                case 118966:
                    if (lowerCase.equals("xrp")) {
                        return true;
                    }
                    break;
                case 119038:
                    if (lowerCase.equals("xtz")) {
                        return true;
                    }
                    break;
                case 3599261:
                    if (lowerCase.equals("usdc")) {
                        return true;
                    }
                    break;
                case 3599278:
                    if (lowerCase.equals("usdt")) {
                        return true;
                    }
                    break;
                case 103668346:
                    if (lowerCase.equals("matic")) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public static final boolean a0(TransactionUI transactionUI) {
        String str = transactionUI.f11384o;
        return (str != null && C0969n.Y(str.toLowerCase(Locale.ROOT), "unsigned", false)) || (str != null && C0969n.Y(str.toLowerCase(Locale.ROOT), "rejected", false)) || (str != null && C0969n.Y(str.toLowerCase(Locale.ROOT), "cancelled", false));
    }

    public static final String b(String str, String str2) {
        return str.length() == 0 ? str2 : v.p(str, "\n", str2);
    }

    public static final boolean b0(TransactionUI transactionUI) {
        Integer num = transactionUI.f11372b;
        return num != null && num.intValue() == 6;
    }

    public static final String c(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            return String.format(Locale.US, "%,.2f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(str))}, 1));
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public static final boolean c0(F5.b bVar) {
        return !kotlin.jvm.internal.f.b(bVar.f1193f, "DEBIT");
    }

    public static final String d(A5.b bVar) {
        Integer num = bVar.f86f;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("£ #,###");
        return decimalFormat.format(Integer.valueOf(intValue));
    }

    public static final boolean d0(String str) {
        return !new Regex("^[A-Za-z\\-]+( [A-Za-z\\-]+)*$").f23200a.matcher(str).find();
    }

    public static final boolean e0(Date date) {
        int i = Calendar.getInstance().get(3);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return i == calendar.get(3);
    }

    public static final SpannedString f(TransactionUI transactionUI) {
        String plainString;
        String plainString2;
        String plainString3;
        String plainString4;
        String plainString5;
        String plainString6;
        String plainString7;
        String plainString8;
        String str = transactionUI.f11375e;
        boolean b9 = kotlin.jvm.internal.f.b(str, "fx_order");
        BigDecimal bigDecimal = transactionUI.f11383n;
        String str2 = null;
        String str3 = transactionUI.f11378h;
        if (b9) {
            String v10 = (bigDecimal == null || (plainString8 = bigDecimal.toPlainString()) == null) ? null : v(plainString8);
            if (bigDecimal != null && (plainString7 = bigDecimal.toPlainString()) != null) {
                str2 = u(plainString7, str3);
            }
            return v0("-", v10, str2, transactionUI.f11378h, 15, 10, true, true, false, 256);
        }
        if (kotlin.jvm.internal.f.b(str, "fx_execution") || kotlin.jvm.internal.f.b(str, "exchange")) {
            String v11 = (bigDecimal == null || (plainString2 = bigDecimal.toPlainString()) == null) ? null : v(plainString2);
            if (bigDecimal != null && (plainString = bigDecimal.toPlainString()) != null) {
                str2 = u(plainString, str3);
            }
            return v0("+", v11, str2, transactionUI.f11378h, 15, 10, true, true, false, 256);
        }
        if (transactionUI.f11388s) {
            String v12 = (bigDecimal == null || (plainString6 = bigDecimal.toPlainString()) == null) ? null : v(plainString6);
            if (bigDecimal != null && (plainString5 = bigDecimal.toPlainString()) != null) {
                str2 = u(plainString5, str3);
            }
            return v0("+", v12, str2, transactionUI.f11378h, 15, 10, true, true, false, 256);
        }
        String v13 = (bigDecimal == null || (plainString4 = bigDecimal.toPlainString()) == null) ? null : v(plainString4);
        if (bigDecimal != null && (plainString3 = bigDecimal.toPlainString()) != null) {
            str2 = u(plainString3, str3);
        }
        return v0("-", v13, str2, transactionUI.f11378h, 15, 10, true, true, false, 256);
    }

    public static final boolean f0(Date date) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static final boolean g0(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            int type = Character.getType(str.charAt(i));
            if (type == 28 || type == 19) {
                return false;
            }
        }
        return (C0969n.i0(str) ^ true) && s3.b.w("^[\\p{L}\\p{N}!\\p{M}\"#$%&'()*+,\\-/.:;<=>?@\\[\\\\\\]^_`{|}~ ]*$", str);
    }

    public static HashMap h(Calendar calendar) {
        HashMap hashMap = new HashMap();
        hashMap.put("year", Integer.valueOf(calendar.get(1)));
        hashMap.put("month", Integer.valueOf(calendar.get(2)));
        hashMap.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        hashMap.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        hashMap.put("minute", Integer.valueOf(calendar.get(12)));
        hashMap.put("second", Integer.valueOf(calendar.get(13)));
        return hashMap;
    }

    public static final boolean h0(String str) {
        return Pattern.compile("[a-zA-Z0-9+._%\\-]{1,256}@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+").matcher(str).matches();
    }

    public static final Pair i0(String str) {
        return C0969n.i0(str) ? new Pair(Boolean.FALSE, Integer.valueOf(R.string.empty_card_name)) : str.length() > 18 ? new Pair(Boolean.FALSE, Integer.valueOf(R.string.too_many_characters)) : new Pair(Boolean.TRUE, null);
    }

    public static final void j(View view) {
        i a10 = ja.k.a((InterfaceC0650p) androidx.core.view.a.a(view).f3161b);
        while (a10.hasNext()) {
            View view2 = (View) a10.next();
            D0.b bVar = (D0.b) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (bVar == null) {
                bVar = new D0.b();
                view2.setTag(R.id.pooling_container_listener_holder_tag, bVar);
            }
            ArrayList<D0.a> arrayList = bVar.f857a;
            for (int p10 = m.p(arrayList); -1 < p10; p10--) {
                arrayList.get(p10).a();
            }
        }
    }

    public static final String j0(Context context, String str) {
        String j10 = str.length() < 8 ? s3.b.j("", context.getString(R.string.password_must_have_at_least_8_characters)) : "";
        if (!s3.b.w("^(?=.*[0-9]).{4,}$", C0969n.u0(str).toString())) {
            j10 = b(j10, context.getString(R.string.password_must_have_one_digit));
        }
        if (!s3.b.w("^(?=.*[A-Z])(?=\\S+$).{4,}", C0969n.u0(str).toString())) {
            j10 = b(j10, context.getString(R.string.password_must_have_one_upper_character));
        }
        return !s3.b.w("^(?=.*[a-z])(?=\\S+$).{4,}", C0969n.u0(str).toString()) ? b(j10, context.getString(R.string.password_must_have_one_lower_character)) : j10;
    }

    public static final String k(String str) {
        if (str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    public static final Pair k0(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        if (!s3.b.w("^.{8,36}$", str)) {
            arrayList.add(context.getString(R.string.password_must_be_8_36_characters));
        }
        if (!s3.b.w("^(?=.*[0-9]).*$", C0969n.u0(str).toString())) {
            arrayList.add(context.getString(R.string.password_must_have_one_digit));
        }
        if (!s3.b.w("^(?=.*[A-Z])(?=\\S+$).{4,}", C0969n.u0(str).toString())) {
            arrayList.add(context.getString(R.string.password_must_have_one_upper_character));
        }
        if (!s3.b.w("^(?=.*[a-z])(?=\\S+$).{4,}", C0969n.u0(str).toString())) {
            arrayList.add(context.getString(R.string.password_must_have_one_lower_character));
        }
        if (!s3.b.w("^[A-Za-z0-9!\"#;:?&*()+=/\\]\\[\\\\,.{}]+", str)) {
            arrayList.add(context.getString(R.string.password_contains_unsupported_characters));
        }
        return arrayList.isEmpty() ^ true ? new Pair(Boolean.FALSE, s.P(arrayList, "\n", null, null, null, 62)) : new Pair(Boolean.TRUE, null);
    }

    public static final String l(String str) {
        if (str.length() == 0) {
            return "";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        char charAt = lowerCase.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return lowerCase;
        }
        return Character.toUpperCase(charAt) + lowerCase.substring(1);
    }

    public static boolean l0(boolean z10, Double d10) {
        return d10 == null ? z10 : !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.doubleValue() <= 1.0d;
    }

    public static int m(int i, int i9) {
        return n0.a.h(i, (Color.alpha(i) * i9) / 255);
    }

    public static final boolean m0(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, 1);
        return f0(calendar.getTime());
    }

    public static boolean n(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        for (File file2 : listFiles) {
            if (!n(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static int n0(int i, float f10, int i9) {
        return n0.a.f(n0.a.h(i9, Math.round(Color.alpha(i9) * f10)), i);
    }

    public static final String o(String str, String str2) {
        if (!K3.a.c(str)) {
            return v.p(str2, " ", str);
        }
        String a10 = K3.a.a(str);
        if (a10.length() == 0) {
            if (str == null) {
                str = "";
            }
            a10 = str;
        }
        return K3.a.b(a10) ? v.n(a10, str2) : v.p(str2, " ", a10);
    }

    public static void o0(Class cls, Object obj, InterfaceC0859q interfaceC0859q) {
        interfaceC0859q.h(SentryLevel.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    public static final String p(String str) {
        boolean Y = C0969n.Y(str, "-", false);
        String n02 = C0969n.n0(str, "-");
        int length = n02.length();
        if (length <= 3) {
            return Y ? "-".concat(n02) : n02;
        }
        StringBuilder sb2 = new StringBuilder();
        int i = length % 3;
        if (i > 0) {
            sb2.append(n02.substring(0, i));
            if (length > 3) {
                sb2.append(',');
            }
        }
        while (i < length) {
            int i9 = i + 3;
            sb2.append(n02.substring(i, i9));
            if (i9 < length - 1) {
                sb2.append(',');
            }
            i = i9;
        }
        if (!Y) {
            return sb2.toString();
        }
        return "-" + ((Object) sb2);
    }

    public static final boolean p0(String str) {
        return (kotlin.jvm.internal.f.b(str, "GET") || kotlin.jvm.internal.f.b(str, "HEAD")) ? false : true;
    }

    public static final SpannedString q(CryptoExchangeDomain cryptoExchangeDomain, boolean z10, String str, int i, int i9, boolean z11) {
        O9.f a10 = org.koin.java.a.a(K5.a.class);
        String t3 = t(cryptoExchangeDomain, z10);
        String str2 = z10 ? cryptoExchangeDomain.f11027l : cryptoExchangeDomain.f11028m;
        return v0(str, t3, cryptoExchangeDomain.a(z10, ((K5.a) a10.getValue()).Q(str2 == null ? "" : str2)), str2, i, i9, true, false, z11, 128);
    }

    public static final String q0(String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        return sb3.startsWith("0") ? q0(C0969n.n0(sb3, "0")) : sb3;
    }

    public static long r(int i, long j10) {
        long j11 = i;
        C1124b.m(j11 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j10) / j11;
    }

    public static final String r0(String str) {
        return C0969n.u0(new Regex("[a-zA-Z$€£₣¥,% ]").c(str, "")).toString();
    }

    public static final String s(k kVar) {
        String concat;
        String str = kVar.f1836m;
        String str2 = "";
        if (str != null) {
            String str3 = kVar.f1834l;
            if (str3 == null || str3.length() == 0) {
                concat = str.concat("\n");
            } else {
                concat = str + " " + str3 + "\n";
            }
            str2 = s3.b.j("", concat);
        }
        String str4 = kVar.f1837n;
        if (str4 != null) {
            str2 = ((Object) str2) + str4 + "\n";
        }
        String str5 = kVar.f1840q;
        if (str5 != null) {
            str2 = ((Object) str2) + str5 + "\n";
        }
        String str6 = kVar.f1835l0;
        if (str6 != null) {
            str2 = ((Object) str2) + str6 + "\n";
        }
        return C0970o.x0(str2);
    }

    public static String s0(File file) {
        if (!file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
            }
            while (true) {
                String readLine2 = bufferedReader.readLine();
                if (readLine2 == null) {
                    bufferedReader.close();
                    return sb2.toString();
                }
                sb2.append("\n");
                sb2.append(readLine2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final String t(CryptoExchangeDomain cryptoExchangeDomain, boolean z10) {
        Double d10 = z10 ? cryptoExchangeDomain.f11029n : cryptoExchangeDomain.f11030o;
        if (d10 == null) {
            return "";
        }
        String plainString = new BigDecimal(String.valueOf(d10.doubleValue())).toPlainString();
        if (plainString == null) {
            return "0";
        }
        String str = (String) s.L(C0969n.r0(plainString, new String[]{"."}));
        String p10 = p(str != null ? str : "");
        return p10.length() == 0 ? "0" : p10;
    }

    public static void t0(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final String u(String str, String str2) {
        Integer num;
        C1572a Q4 = ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).Q(str2);
        int intValue = (Q4 == null || (num = Q4.f30832g) == null) ? 2 : num.intValue();
        List r02 = C0969n.r0(str, new String[]{"."});
        if (r02.size() == 1) {
            return s3.b.j(".", C0967l.W(intValue, "0"));
        }
        String str3 = (String) s.R(r02);
        if (str3 == null) {
            str3 = "";
        }
        return str3.length() == 0 ? Q4 == null ? ".00" : s3.b.j(".", C0967l.W(intValue, "0")) : s3.b.j(".", G(intValue, str3));
    }

    public static final Date u0(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, RoomDatabase.MAX_BIND_PARAMETER_CNT);
        return calendar.getTime();
    }

    public static final String v(String str) {
        return str.length() == 0 ? "0" : p((String) C0969n.r0(str, new String[]{"."}).get(0));
    }

    public static SpannedString v0(String str, String str2, String str3, String str4, int i, int i9, boolean z10, boolean z11, boolean z12, int i10) {
        String str5 = str2;
        boolean z13 = (i10 & 128) != 0 ? true : z11;
        boolean z14 = (i10 & 256) != 0 ? false : z12;
        O9.f a10 = org.koin.java.a.a(K5.a.class);
        SpannableString spannableString = new SpannableString(str);
        if (str.length() == 0) {
            spannableString = new SpannableString("");
        } else {
            spannableString.setSpan(new AbsoluteSizeSpan(U4.b.C(i * Resources.getSystem().getDisplayMetrics().density)), 0, str.length(), 18);
        }
        if (str.length() != 0) {
            String X = str5 != null ? C0967l.X(str5, "-", "", false) : null;
            str5 = X != null ? C0967l.X(X, "+", "", false) : null;
        }
        SpannableString spannableString2 = new SpannableString(str5);
        if (str5 == null || str5.length() == 0) {
            spannableString2 = new SpannableString("");
        } else {
            spannableString2.setSpan(new AbsoluteSizeSpan(U4.b.C(i * Resources.getSystem().getDisplayMetrics().density)), 0, str5.length(), 18);
        }
        SpannableString spannableString3 = new SpannableString(str3);
        C1572a Q4 = ((K5.a) a10.getValue()).Q(str4);
        if (str3 == null || str3.length() == 0) {
            spannableString3 = new SpannableString("");
        } else {
            spannableString3.setSpan(new AbsoluteSizeSpan(U4.b.C((kotlin.jvm.internal.f.b(Q4 != null ? Q4.f30831f : null, "Upper") ? i : i9) * Resources.getSystem().getDisplayMetrics().density)), 0, str3.length(), 18);
        }
        String a11 = K3.a.a(str4);
        if (a11.length() == 0) {
            a11 = str4 != null ? str4.toUpperCase(Locale.ROOT) : "";
        }
        boolean b9 = K3.a.b(a11);
        SpannableString spannableString4 = new SpannableString(b9 ? a11 : " ".concat(a11));
        if (spannableString4.length() > 0) {
            spannableString4.setSpan(new AbsoluteSizeSpan(U4.b.C((z14 ? i9 : i) * Resources.getSystem().getDisplayMetrics().density)), 0, spannableString4.length(), 18);
        } else {
            spannableString4 = new SpannableString(a11);
        }
        return K3.a.c(str4) ? z13 ? b9 ? (SpannedString) TextUtils.concat(spannableString, spannableString4, spannableString2, spannableString3) : (SpannedString) TextUtils.concat(spannableString, spannableString2, spannableString3, spannableString4) : (SpannedString) TextUtils.concat(spannableString2, spannableString3) : z10 ? (SpannedString) TextUtils.concat(spannableString, spannableString2, spannableString3, spannableString4) : (SpannedString) TextUtils.concat(spannableString, spannableString2, spannableString3);
    }

    public static final String w(k kVar) {
        Long l10 = kVar.f1841r;
        return F0(new Date((l10 != null ? l10.longValue() : 0L) * 1000), "dd MMM yyyy");
    }

    public static final Date w0(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static int x(int i, View view) {
        Context context = view.getContext();
        TypedValue c2 = P2.b.c(view.getContext(), i, view.getClass().getCanonicalName());
        int i9 = c2.resourceId;
        return i9 != 0 ? C0913a.getColor(context, i9) : c2.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (kotlin.jvm.internal.f.b(r1 != null ? r1.toLowerCase(java.util.Locale.ROOT) : null, "fx_execution") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean x0(com.luminary.business.presentation.entity.transaction.TransactionUI r5) {
        /*
            r0 = 0
            java.lang.String r1 = r5.f11375e
            if (r1 == 0) goto Lc
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r1.toLowerCase(r2)
            goto Ld
        Lc:
            r2 = r0
        Ld:
            java.lang.String r3 = "commission"
            boolean r2 = kotlin.jvm.internal.f.b(r2, r3)
            java.lang.String r3 = "fx_execution"
            java.lang.String r4 = "fx_order"
            if (r2 != 0) goto L37
            if (r1 == 0) goto L22
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r1.toLowerCase(r2)
            goto L23
        L22:
            r2 = r0
        L23:
            boolean r2 = kotlin.jvm.internal.f.b(r2, r4)
            if (r2 != 0) goto L37
            if (r1 == 0) goto L31
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
        L31:
            boolean r0 = kotlin.jvm.internal.f.b(r0, r3)
            if (r0 == 0) goto L59
        L37:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r1.toLowerCase(r0)
            boolean r2 = kotlin.jvm.internal.f.b(r2, r4)
            if (r2 != 0) goto L4d
            java.lang.String r0 = r1.toLowerCase(r0)
            boolean r0 = kotlin.jvm.internal.f.b(r0, r3)
            if (r0 == 0) goto L5b
        L4d:
            java.lang.Integer r0 = r5.f11370E
            if (r0 == 0) goto L5b
            java.math.BigDecimal r0 = r5.f11368C
            if (r0 == 0) goto L5b
            java.math.BigDecimal r5 = r5.f11369D
            if (r5 == 0) goto L5b
        L59:
            r5 = 1
            goto L5c
        L5b:
            r5 = 0
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.b.x0(com.luminary.business.presentation.entity.transaction.TransactionUI):boolean");
    }

    public static int y(Context context, int i, int i9) {
        Integer num;
        TypedValue a10 = P2.b.a(context, i);
        if (a10 != null) {
            int i10 = a10.resourceId;
            num = Integer.valueOf(i10 != 0 ? C0913a.getColor(context, i10) : a10.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i9;
    }

    public static final boolean y0(TransactionUI transactionUI) {
        return a0(transactionUI) || !b0(transactionUI);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Integer z(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        switch (lowerCase.hashCode()) {
            case 96414:
                if (lowerCase.equals("ada")) {
                    return Integer.valueOf(R.drawable.ic_ada);
                }
                return null;
            case 97873:
                if (lowerCase.equals("btc")) {
                    return Integer.valueOf(R.drawable.ic_btc);
                }
                return null;
            case 99212:
                if (lowerCase.equals("dai")) {
                    return Integer.valueOf(R.drawable.ic_dai);
                }
                return null;
            case 100761:
                if (lowerCase.equals("eth")) {
                    return Integer.valueOf(R.drawable.ic_eth);
                }
                return null;
            case 114064:
                if (lowerCase.equals("sol")) {
                    return Integer.valueOf(R.drawable.ic_sol);
                }
                return null;
            case 115130:
                if (lowerCase.equals("trx")) {
                    return Integer.valueOf(R.drawable.ic_tron);
                }
                return null;
            case 118966:
                if (lowerCase.equals("xrp")) {
                    return Integer.valueOf(R.drawable.ic_xrp);
                }
                return null;
            case 119038:
                if (lowerCase.equals("xtz")) {
                    return Integer.valueOf(R.drawable.ic_tezos);
                }
                return null;
            case 3599261:
                if (lowerCase.equals("usdc")) {
                    return Integer.valueOf(R.drawable.ic_usdc);
                }
                return null;
            case 3599278:
                if (lowerCase.equals("usdt")) {
                    return Integer.valueOf(R.drawable.ic_usdt);
                }
                return null;
            case 103668346:
                if (lowerCase.equals("matic")) {
                    return Integer.valueOf(R.drawable.ic_matic);
                }
                return null;
            default:
                return null;
        }
    }

    public static long z0(int i, long j10) {
        long j11 = i;
        C1124b.m(j11 > 0, "bytesPerFrame must be greater than 0.");
        return j10 / j11;
    }

    @Override // C9.e
    public B1.f g(B1.f fVar) {
        return fVar;
    }

    @Override // C9.e
    public void a(DiscardReason discardReason, DataCategory dataCategory) {
    }

    @Override // C9.e
    public void e(DiscardReason discardReason, B1.f fVar) {
    }

    @Override // C9.e
    public void i(DiscardReason discardReason, g0 g0Var) {
    }
}
