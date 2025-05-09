package com.hbb20;

import android.content.Context;
import android.util.Log;
import com.hbb20.CountryCodePicker;
import com.luminary.mobile.R;
import com.sumsub.sns.internal.core.data.model.p;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.bouncycastle.tls.CipherSuite;
import org.jmrtd.PassportService;

/* compiled from: CCPCountry.java */
/* loaded from: classes.dex */
public final class a implements Comparable<a> {

    /* renamed from: f, reason: collision with root package name */
    public static CountryCodePicker.Language f10615f;

    /* renamed from: g, reason: collision with root package name */
    public static String f10616g;

    /* renamed from: h, reason: collision with root package name */
    public static String f10617h;
    public static String i;

    /* renamed from: j, reason: collision with root package name */
    public static ArrayList f10618j;

    /* renamed from: a, reason: collision with root package name */
    public String f10619a;

    /* renamed from: b, reason: collision with root package name */
    public String f10620b;

    /* renamed from: c, reason: collision with root package name */
    public String f10621c;

    /* renamed from: d, reason: collision with root package name */
    public String f10622d;

    /* renamed from: e, reason: collision with root package name */
    public int f10623e;

    public a() {
        this.f10623e = -99;
    }

    public static boolean a(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            try {
                return str2.toLowerCase(Locale.ROOT).contains(str3);
            } catch (Exception unused) {
                Log.w("CCPCountry", str + p.f15541a + str2 + " failed to execute toLowerCase(Locale.ROOT).contains(query) for query:" + str3);
            }
        }
        return false;
    }

    public static a c(Context context, CountryCodePicker.Language language, ArrayList arrayList, int i9) {
        return d(context, language, arrayList, i9 + "");
    }

    public static a d(Context context, CountryCodePicker.Language language, ArrayList arrayList, String str) {
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.f10620b.equals(str)) {
                    return aVar;
                }
            }
        }
        for (a aVar2 : k(context, language)) {
            if (aVar2.f10620b.equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    public static a e(String str) {
        Iterator it = j().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f10620b.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public static a f(String str) {
        Iterator it = j().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f10619a.equalsIgnoreCase(str)) {
                return aVar;
            }
        }
        return null;
    }

    public static a g(Context context, CountryCodePicker.Language language, String str) {
        for (a aVar : k(context, language)) {
            if (aVar.f10619a.equalsIgnoreCase(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String h(a aVar) {
        String lowerCase = aVar.f10619a.toLowerCase();
        lowerCase.getClass();
        char c2 = 65535;
        switch (lowerCase.hashCode()) {
            case 3107:
                if (lowerCase.equals("ad")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3108:
                if (lowerCase.equals("ae")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3109:
                if (lowerCase.equals("af")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3110:
                if (lowerCase.equals("ag")) {
                    c2 = 3;
                    break;
                }
                break;
            case 3112:
                if (lowerCase.equals("ai")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3115:
                if (lowerCase.equals("al")) {
                    c2 = 5;
                    break;
                }
                break;
            case 3116:
                if (lowerCase.equals("am")) {
                    c2 = 6;
                    break;
                }
                break;
            case 3118:
                if (lowerCase.equals("ao")) {
                    c2 = 7;
                    break;
                }
                break;
            case 3120:
                if (lowerCase.equals("aq")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 3121:
                if (lowerCase.equals("ar")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 3122:
                if (lowerCase.equals("as")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 3123:
                if (lowerCase.equals("at")) {
                    c2 = 11;
                    break;
                }
                break;
            case 3124:
                if (lowerCase.equals("au")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 3126:
                if (lowerCase.equals("aw")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 3127:
                if (lowerCase.equals("ax")) {
                    c2 = 14;
                    break;
                }
                break;
            case 3129:
                if (lowerCase.equals("az")) {
                    c2 = 15;
                    break;
                }
                break;
            case 3135:
                if (lowerCase.equals("ba")) {
                    c2 = 16;
                    break;
                }
                break;
            case 3136:
                if (lowerCase.equals("bb")) {
                    c2 = 17;
                    break;
                }
                break;
            case 3138:
                if (lowerCase.equals("bd")) {
                    c2 = 18;
                    break;
                }
                break;
            case 3139:
                if (lowerCase.equals("be")) {
                    c2 = 19;
                    break;
                }
                break;
            case 3140:
                if (lowerCase.equals("bf")) {
                    c2 = 20;
                    break;
                }
                break;
            case 3141:
                if (lowerCase.equals("bg")) {
                    c2 = 21;
                    break;
                }
                break;
            case 3142:
                if (lowerCase.equals("bh")) {
                    c2 = 22;
                    break;
                }
                break;
            case 3143:
                if (lowerCase.equals("bi")) {
                    c2 = 23;
                    break;
                }
                break;
            case 3144:
                if (lowerCase.equals("bj")) {
                    c2 = 24;
                    break;
                }
                break;
            case 3146:
                if (lowerCase.equals("bl")) {
                    c2 = 25;
                    break;
                }
                break;
            case 3147:
                if (lowerCase.equals("bm")) {
                    c2 = 26;
                    break;
                }
                break;
            case 3148:
                if (lowerCase.equals("bn")) {
                    c2 = 27;
                    break;
                }
                break;
            case 3149:
                if (lowerCase.equals("bo")) {
                    c2 = 28;
                    break;
                }
                break;
            case 3151:
                if (lowerCase.equals("bq")) {
                    c2 = 29;
                    break;
                }
                break;
            case 3152:
                if (lowerCase.equals("br")) {
                    c2 = 30;
                    break;
                }
                break;
            case 3153:
                if (lowerCase.equals("bs")) {
                    c2 = 31;
                    break;
                }
                break;
            case 3154:
                if (lowerCase.equals("bt")) {
                    c2 = ' ';
                    break;
                }
                break;
            case 3156:
                if (lowerCase.equals("bv")) {
                    c2 = '!';
                    break;
                }
                break;
            case 3157:
                if (lowerCase.equals("bw")) {
                    c2 = '\"';
                    break;
                }
                break;
            case 3159:
                if (lowerCase.equals("by")) {
                    c2 = '#';
                    break;
                }
                break;
            case 3160:
                if (lowerCase.equals("bz")) {
                    c2 = '$';
                    break;
                }
                break;
            case 3166:
                if (lowerCase.equals("ca")) {
                    c2 = '%';
                    break;
                }
                break;
            case 3168:
                if (lowerCase.equals("cc")) {
                    c2 = '&';
                    break;
                }
                break;
            case 3169:
                if (lowerCase.equals("cd")) {
                    c2 = '\'';
                    break;
                }
                break;
            case 3171:
                if (lowerCase.equals("cf")) {
                    c2 = '(';
                    break;
                }
                break;
            case 3172:
                if (lowerCase.equals("cg")) {
                    c2 = ')';
                    break;
                }
                break;
            case 3173:
                if (lowerCase.equals("ch")) {
                    c2 = '*';
                    break;
                }
                break;
            case 3174:
                if (lowerCase.equals("ci")) {
                    c2 = '+';
                    break;
                }
                break;
            case 3176:
                if (lowerCase.equals("ck")) {
                    c2 = ',';
                    break;
                }
                break;
            case 3177:
                if (lowerCase.equals("cl")) {
                    c2 = '-';
                    break;
                }
                break;
            case 3178:
                if (lowerCase.equals("cm")) {
                    c2 = '.';
                    break;
                }
                break;
            case 3179:
                if (lowerCase.equals("cn")) {
                    c2 = '/';
                    break;
                }
                break;
            case 3180:
                if (lowerCase.equals("co")) {
                    c2 = '0';
                    break;
                }
                break;
            case 3183:
                if (lowerCase.equals("cr")) {
                    c2 = '1';
                    break;
                }
                break;
            case 3186:
                if (lowerCase.equals("cu")) {
                    c2 = '2';
                    break;
                }
                break;
            case 3187:
                if (lowerCase.equals("cv")) {
                    c2 = '3';
                    break;
                }
                break;
            case 3188:
                if (lowerCase.equals("cw")) {
                    c2 = '4';
                    break;
                }
                break;
            case 3189:
                if (lowerCase.equals("cx")) {
                    c2 = '5';
                    break;
                }
                break;
            case 3190:
                if (lowerCase.equals("cy")) {
                    c2 = '6';
                    break;
                }
                break;
            case 3191:
                if (lowerCase.equals("cz")) {
                    c2 = '7';
                    break;
                }
                break;
            case 3201:
                if (lowerCase.equals("de")) {
                    c2 = '8';
                    break;
                }
                break;
            case 3206:
                if (lowerCase.equals("dj")) {
                    c2 = '9';
                    break;
                }
                break;
            case 3207:
                if (lowerCase.equals("dk")) {
                    c2 = ':';
                    break;
                }
                break;
            case 3209:
                if (lowerCase.equals("dm")) {
                    c2 = ';';
                    break;
                }
                break;
            case 3211:
                if (lowerCase.equals("do")) {
                    c2 = '<';
                    break;
                }
                break;
            case 3222:
                if (lowerCase.equals("dz")) {
                    c2 = '=';
                    break;
                }
                break;
            case 3230:
                if (lowerCase.equals("ec")) {
                    c2 = '>';
                    break;
                }
                break;
            case 3232:
                if (lowerCase.equals("ee")) {
                    c2 = '?';
                    break;
                }
                break;
            case 3234:
                if (lowerCase.equals("eg")) {
                    c2 = '@';
                    break;
                }
                break;
            case 3235:
                if (lowerCase.equals("eh")) {
                    c2 = 'A';
                    break;
                }
                break;
            case 3245:
                if (lowerCase.equals("er")) {
                    c2 = 'B';
                    break;
                }
                break;
            case 3246:
                if (lowerCase.equals("es")) {
                    c2 = 'C';
                    break;
                }
                break;
            case 3247:
                if (lowerCase.equals("et")) {
                    c2 = 'D';
                    break;
                }
                break;
            case 3267:
                if (lowerCase.equals("fi")) {
                    c2 = 'E';
                    break;
                }
                break;
            case 3268:
                if (lowerCase.equals("fj")) {
                    c2 = 'F';
                    break;
                }
                break;
            case 3269:
                if (lowerCase.equals("fk")) {
                    c2 = 'G';
                    break;
                }
                break;
            case 3271:
                if (lowerCase.equals("fm")) {
                    c2 = 'H';
                    break;
                }
                break;
            case 3273:
                if (lowerCase.equals("fo")) {
                    c2 = 'I';
                    break;
                }
                break;
            case 3276:
                if (lowerCase.equals("fr")) {
                    c2 = 'J';
                    break;
                }
                break;
            case 3290:
                if (lowerCase.equals("ga")) {
                    c2 = 'K';
                    break;
                }
                break;
            case 3291:
                if (lowerCase.equals("gb")) {
                    c2 = Matrix.MATRIX_TYPE_RANDOM_LT;
                    break;
                }
                break;
            case 3293:
                if (lowerCase.equals("gd")) {
                    c2 = 'M';
                    break;
                }
                break;
            case 3294:
                if (lowerCase.equals("ge")) {
                    c2 = 'N';
                    break;
                }
                break;
            case 3295:
                if (lowerCase.equals("gf")) {
                    c2 = 'O';
                    break;
                }
                break;
            case 3296:
                if (lowerCase.equals("gg")) {
                    c2 = 'P';
                    break;
                }
                break;
            case 3297:
                if (lowerCase.equals("gh")) {
                    c2 = 'Q';
                    break;
                }
                break;
            case 3298:
                if (lowerCase.equals("gi")) {
                    c2 = Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                    break;
                }
                break;
            case 3301:
                if (lowerCase.equals("gl")) {
                    c2 = 'S';
                    break;
                }
                break;
            case 3302:
                if (lowerCase.equals("gm")) {
                    c2 = 'T';
                    break;
                }
                break;
            case 3303:
                if (lowerCase.equals("gn")) {
                    c2 = Matrix.MATRIX_TYPE_RANDOM_UT;
                    break;
                }
                break;
            case 3305:
                if (lowerCase.equals("gp")) {
                    c2 = 'V';
                    break;
                }
                break;
            case 3306:
                if (lowerCase.equals("gq")) {
                    c2 = 'W';
                    break;
                }
                break;
            case 3307:
                if (lowerCase.equals("gr")) {
                    c2 = 'X';
                    break;
                }
                break;
            case 3308:
                if (lowerCase.equals("gs")) {
                    c2 = 'Y';
                    break;
                }
                break;
            case 3309:
                if (lowerCase.equals("gt")) {
                    c2 = Matrix.MATRIX_TYPE_ZERO;
                    break;
                }
                break;
            case 3310:
                if (lowerCase.equals("gu")) {
                    c2 = '[';
                    break;
                }
                break;
            case 3312:
                if (lowerCase.equals("gw")) {
                    c2 = '\\';
                    break;
                }
                break;
            case 3314:
                if (lowerCase.equals("gy")) {
                    c2 = ']';
                    break;
                }
                break;
            case 3331:
                if (lowerCase.equals("hk")) {
                    c2 = '^';
                    break;
                }
                break;
            case 3333:
                if (lowerCase.equals("hm")) {
                    c2 = '_';
                    break;
                }
                break;
            case 3334:
                if (lowerCase.equals("hn")) {
                    c2 = '`';
                    break;
                }
                break;
            case 3338:
                if (lowerCase.equals("hr")) {
                    c2 = 'a';
                    break;
                }
                break;
            case 3340:
                if (lowerCase.equals("ht")) {
                    c2 = 'b';
                    break;
                }
                break;
            case 3341:
                if (lowerCase.equals("hu")) {
                    c2 = 'c';
                    break;
                }
                break;
            case 3355:
                if (lowerCase.equals("id")) {
                    c2 = 'd';
                    break;
                }
                break;
            case 3356:
                if (lowerCase.equals("ie")) {
                    c2 = 'e';
                    break;
                }
                break;
            case 3363:
                if (lowerCase.equals("il")) {
                    c2 = 'f';
                    break;
                }
                break;
            case 3364:
                if (lowerCase.equals("im")) {
                    c2 = 'g';
                    break;
                }
                break;
            case 3365:
                if (lowerCase.equals("in")) {
                    c2 = 'h';
                    break;
                }
                break;
            case 3366:
                if (lowerCase.equals("io")) {
                    c2 = 'i';
                    break;
                }
                break;
            case 3368:
                if (lowerCase.equals("iq")) {
                    c2 = 'j';
                    break;
                }
                break;
            case 3369:
                if (lowerCase.equals("ir")) {
                    c2 = 'k';
                    break;
                }
                break;
            case 3370:
                if (lowerCase.equals("is")) {
                    c2 = 'l';
                    break;
                }
                break;
            case 3371:
                if (lowerCase.equals("it")) {
                    c2 = 'm';
                    break;
                }
                break;
            case 3387:
                if (lowerCase.equals("je")) {
                    c2 = 'n';
                    break;
                }
                break;
            case 3395:
                if (lowerCase.equals("jm")) {
                    c2 = 'o';
                    break;
                }
                break;
            case 3397:
                if (lowerCase.equals("jo")) {
                    c2 = 'p';
                    break;
                }
                break;
            case 3398:
                if (lowerCase.equals("jp")) {
                    c2 = 'q';
                    break;
                }
                break;
            case 3418:
                if (lowerCase.equals("ke")) {
                    c2 = 'r';
                    break;
                }
                break;
            case 3420:
                if (lowerCase.equals("kg")) {
                    c2 = 's';
                    break;
                }
                break;
            case 3421:
                if (lowerCase.equals("kh")) {
                    c2 = 't';
                    break;
                }
                break;
            case 3422:
                if (lowerCase.equals("ki")) {
                    c2 = 'u';
                    break;
                }
                break;
            case 3426:
                if (lowerCase.equals("km")) {
                    c2 = 'v';
                    break;
                }
                break;
            case 3427:
                if (lowerCase.equals("kn")) {
                    c2 = 'w';
                    break;
                }
                break;
            case 3429:
                if (lowerCase.equals("kp")) {
                    c2 = 'x';
                    break;
                }
                break;
            case 3431:
                if (lowerCase.equals("kr")) {
                    c2 = 'y';
                    break;
                }
                break;
            case 3436:
                if (lowerCase.equals("kw")) {
                    c2 = 'z';
                    break;
                }
                break;
            case 3438:
                if (lowerCase.equals("ky")) {
                    c2 = '{';
                    break;
                }
                break;
            case 3439:
                if (lowerCase.equals("kz")) {
                    c2 = '|';
                    break;
                }
                break;
            case 3445:
                if (lowerCase.equals("la")) {
                    c2 = '}';
                    break;
                }
                break;
            case 3446:
                if (lowerCase.equals("lb")) {
                    c2 = '~';
                    break;
                }
                break;
            case 3447:
                if (lowerCase.equals("lc")) {
                    c2 = 127;
                    break;
                }
                break;
            case 3453:
                if (lowerCase.equals("li")) {
                    c2 = 128;
                    break;
                }
                break;
            case 3455:
                if (lowerCase.equals("lk")) {
                    c2 = 129;
                    break;
                }
                break;
            case 3462:
                if (lowerCase.equals("lr")) {
                    c2 = 130;
                    break;
                }
                break;
            case 3463:
                if (lowerCase.equals("ls")) {
                    c2 = 131;
                    break;
                }
                break;
            case 3464:
                if (lowerCase.equals("lt")) {
                    c2 = 132;
                    break;
                }
                break;
            case 3465:
                if (lowerCase.equals("lu")) {
                    c2 = 133;
                    break;
                }
                break;
            case 3466:
                if (lowerCase.equals("lv")) {
                    c2 = 134;
                    break;
                }
                break;
            case 3469:
                if (lowerCase.equals("ly")) {
                    c2 = 135;
                    break;
                }
                break;
            case 3476:
                if (lowerCase.equals("ma")) {
                    c2 = 136;
                    break;
                }
                break;
            case 3478:
                if (lowerCase.equals("mc")) {
                    c2 = 137;
                    break;
                }
                break;
            case 3479:
                if (lowerCase.equals("md")) {
                    c2 = 138;
                    break;
                }
                break;
            case 3480:
                if (lowerCase.equals("me")) {
                    c2 = 139;
                    break;
                }
                break;
            case 3481:
                if (lowerCase.equals("mf")) {
                    c2 = 140;
                    break;
                }
                break;
            case 3482:
                if (lowerCase.equals("mg")) {
                    c2 = 141;
                    break;
                }
                break;
            case 3483:
                if (lowerCase.equals("mh")) {
                    c2 = 142;
                    break;
                }
                break;
            case 3486:
                if (lowerCase.equals("mk")) {
                    c2 = 143;
                    break;
                }
                break;
            case 3487:
                if (lowerCase.equals("ml")) {
                    c2 = 144;
                    break;
                }
                break;
            case 3488:
                if (lowerCase.equals("mm")) {
                    c2 = 145;
                    break;
                }
                break;
            case 3489:
                if (lowerCase.equals("mn")) {
                    c2 = 146;
                    break;
                }
                break;
            case 3490:
                if (lowerCase.equals("mo")) {
                    c2 = 147;
                    break;
                }
                break;
            case 3491:
                if (lowerCase.equals("mp")) {
                    c2 = 148;
                    break;
                }
                break;
            case 3492:
                if (lowerCase.equals("mq")) {
                    c2 = 149;
                    break;
                }
                break;
            case 3493:
                if (lowerCase.equals("mr")) {
                    c2 = 150;
                    break;
                }
                break;
            case 3494:
                if (lowerCase.equals("ms")) {
                    c2 = 151;
                    break;
                }
                break;
            case 3495:
                if (lowerCase.equals("mt")) {
                    c2 = 152;
                    break;
                }
                break;
            case 3496:
                if (lowerCase.equals("mu")) {
                    c2 = 153;
                    break;
                }
                break;
            case 3497:
                if (lowerCase.equals("mv")) {
                    c2 = 154;
                    break;
                }
                break;
            case 3498:
                if (lowerCase.equals("mw")) {
                    c2 = 155;
                    break;
                }
                break;
            case 3499:
                if (lowerCase.equals("mx")) {
                    c2 = 156;
                    break;
                }
                break;
            case 3500:
                if (lowerCase.equals("my")) {
                    c2 = 157;
                    break;
                }
                break;
            case 3501:
                if (lowerCase.equals("mz")) {
                    c2 = 158;
                    break;
                }
                break;
            case 3507:
                if (lowerCase.equals("na")) {
                    c2 = 159;
                    break;
                }
                break;
            case 3509:
                if (lowerCase.equals("nc")) {
                    c2 = 160;
                    break;
                }
                break;
            case 3511:
                if (lowerCase.equals("ne")) {
                    c2 = 161;
                    break;
                }
                break;
            case 3512:
                if (lowerCase.equals("nf")) {
                    c2 = 162;
                    break;
                }
                break;
            case 3513:
                if (lowerCase.equals("ng")) {
                    c2 = 163;
                    break;
                }
                break;
            case 3515:
                if (lowerCase.equals("ni")) {
                    c2 = 164;
                    break;
                }
                break;
            case 3518:
                if (lowerCase.equals("nl")) {
                    c2 = 165;
                    break;
                }
                break;
            case 3521:
                if (lowerCase.equals("no")) {
                    c2 = 166;
                    break;
                }
                break;
            case 3522:
                if (lowerCase.equals("np")) {
                    c2 = 167;
                    break;
                }
                break;
            case 3524:
                if (lowerCase.equals("nr")) {
                    c2 = 168;
                    break;
                }
                break;
            case 3527:
                if (lowerCase.equals("nu")) {
                    c2 = 169;
                    break;
                }
                break;
            case 3532:
                if (lowerCase.equals("nz")) {
                    c2 = 170;
                    break;
                }
                break;
            case 3550:
                if (lowerCase.equals("om")) {
                    c2 = 171;
                    break;
                }
                break;
            case 3569:
                if (lowerCase.equals("pa")) {
                    c2 = 172;
                    break;
                }
                break;
            case 3573:
                if (lowerCase.equals("pe")) {
                    c2 = 173;
                    break;
                }
                break;
            case 3574:
                if (lowerCase.equals("pf")) {
                    c2 = 174;
                    break;
                }
                break;
            case 3575:
                if (lowerCase.equals("pg")) {
                    c2 = 175;
                    break;
                }
                break;
            case 3576:
                if (lowerCase.equals("ph")) {
                    c2 = 176;
                    break;
                }
                break;
            case 3579:
                if (lowerCase.equals("pk")) {
                    c2 = 177;
                    break;
                }
                break;
            case 3580:
                if (lowerCase.equals("pl")) {
                    c2 = 178;
                    break;
                }
                break;
            case 3581:
                if (lowerCase.equals("pm")) {
                    c2 = 179;
                    break;
                }
                break;
            case 3582:
                if (lowerCase.equals("pn")) {
                    c2 = 180;
                    break;
                }
                break;
            case 3586:
                if (lowerCase.equals("pr")) {
                    c2 = 181;
                    break;
                }
                break;
            case 3587:
                if (lowerCase.equals("ps")) {
                    c2 = 182;
                    break;
                }
                break;
            case 3588:
                if (lowerCase.equals("pt")) {
                    c2 = 183;
                    break;
                }
                break;
            case 3591:
                if (lowerCase.equals("pw")) {
                    c2 = 184;
                    break;
                }
                break;
            case 3593:
                if (lowerCase.equals("py")) {
                    c2 = 185;
                    break;
                }
                break;
            case 3600:
                if (lowerCase.equals("qa")) {
                    c2 = 186;
                    break;
                }
                break;
            case 3635:
                if (lowerCase.equals("re")) {
                    c2 = 187;
                    break;
                }
                break;
            case 3645:
                if (lowerCase.equals("ro")) {
                    c2 = 188;
                    break;
                }
                break;
            case 3649:
                if (lowerCase.equals("rs")) {
                    c2 = 189;
                    break;
                }
                break;
            case 3651:
                if (lowerCase.equals("ru")) {
                    c2 = 190;
                    break;
                }
                break;
            case 3653:
                if (lowerCase.equals("rw")) {
                    c2 = 191;
                    break;
                }
                break;
            case 3662:
                if (lowerCase.equals("sa")) {
                    c2 = 192;
                    break;
                }
                break;
            case 3663:
                if (lowerCase.equals("sb")) {
                    c2 = 193;
                    break;
                }
                break;
            case 3664:
                if (lowerCase.equals("sc")) {
                    c2 = 194;
                    break;
                }
                break;
            case 3665:
                if (lowerCase.equals("sd")) {
                    c2 = 195;
                    break;
                }
                break;
            case 3666:
                if (lowerCase.equals("se")) {
                    c2 = 196;
                    break;
                }
                break;
            case 3668:
                if (lowerCase.equals("sg")) {
                    c2 = 197;
                    break;
                }
                break;
            case 3669:
                if (lowerCase.equals("sh")) {
                    c2 = 198;
                    break;
                }
                break;
            case 3670:
                if (lowerCase.equals("si")) {
                    c2 = 199;
                    break;
                }
                break;
            case 3671:
                if (lowerCase.equals("sj")) {
                    c2 = 200;
                    break;
                }
                break;
            case 3672:
                if (lowerCase.equals("sk")) {
                    c2 = 201;
                    break;
                }
                break;
            case 3673:
                if (lowerCase.equals("sl")) {
                    c2 = 202;
                    break;
                }
                break;
            case 3674:
                if (lowerCase.equals("sm")) {
                    c2 = 203;
                    break;
                }
                break;
            case 3675:
                if (lowerCase.equals("sn")) {
                    c2 = 204;
                    break;
                }
                break;
            case 3676:
                if (lowerCase.equals("so")) {
                    c2 = 205;
                    break;
                }
                break;
            case 3679:
                if (lowerCase.equals("sr")) {
                    c2 = 206;
                    break;
                }
                break;
            case 3680:
                if (lowerCase.equals("ss")) {
                    c2 = 207;
                    break;
                }
                break;
            case 3681:
                if (lowerCase.equals("st")) {
                    c2 = 208;
                    break;
                }
                break;
            case 3683:
                if (lowerCase.equals("sv")) {
                    c2 = 209;
                    break;
                }
                break;
            case 3685:
                if (lowerCase.equals("sx")) {
                    c2 = 210;
                    break;
                }
                break;
            case 3686:
                if (lowerCase.equals("sy")) {
                    c2 = 211;
                    break;
                }
                break;
            case 3687:
                if (lowerCase.equals("sz")) {
                    c2 = 212;
                    break;
                }
                break;
            case 3695:
                if (lowerCase.equals("tc")) {
                    c2 = 213;
                    break;
                }
                break;
            case 3696:
                if (lowerCase.equals("td")) {
                    c2 = 214;
                    break;
                }
                break;
            case 3698:
                if (lowerCase.equals("tf")) {
                    c2 = 215;
                    break;
                }
                break;
            case 3699:
                if (lowerCase.equals("tg")) {
                    c2 = 216;
                    break;
                }
                break;
            case 3700:
                if (lowerCase.equals("th")) {
                    c2 = 217;
                    break;
                }
                break;
            case 3702:
                if (lowerCase.equals("tj")) {
                    c2 = 218;
                    break;
                }
                break;
            case 3703:
                if (lowerCase.equals("tk")) {
                    c2 = 219;
                    break;
                }
                break;
            case 3704:
                if (lowerCase.equals("tl")) {
                    c2 = 220;
                    break;
                }
                break;
            case 3705:
                if (lowerCase.equals("tm")) {
                    c2 = 221;
                    break;
                }
                break;
            case 3706:
                if (lowerCase.equals("tn")) {
                    c2 = 222;
                    break;
                }
                break;
            case 3707:
                if (lowerCase.equals("to")) {
                    c2 = 223;
                    break;
                }
                break;
            case 3710:
                if (lowerCase.equals("tr")) {
                    c2 = 224;
                    break;
                }
                break;
            case 3712:
                if (lowerCase.equals("tt")) {
                    c2 = 225;
                    break;
                }
                break;
            case 3714:
                if (lowerCase.equals("tv")) {
                    c2 = 226;
                    break;
                }
                break;
            case 3715:
                if (lowerCase.equals("tw")) {
                    c2 = 227;
                    break;
                }
                break;
            case 3718:
                if (lowerCase.equals("tz")) {
                    c2 = 228;
                    break;
                }
                break;
            case 3724:
                if (lowerCase.equals("ua")) {
                    c2 = 229;
                    break;
                }
                break;
            case 3730:
                if (lowerCase.equals("ug")) {
                    c2 = 230;
                    break;
                }
                break;
            case 3736:
                if (lowerCase.equals("um")) {
                    c2 = 231;
                    break;
                }
                break;
            case 3742:
                if (lowerCase.equals("us")) {
                    c2 = 232;
                    break;
                }
                break;
            case 3748:
                if (lowerCase.equals("uy")) {
                    c2 = 233;
                    break;
                }
                break;
            case 3749:
                if (lowerCase.equals("uz")) {
                    c2 = 234;
                    break;
                }
                break;
            case 3755:
                if (lowerCase.equals("va")) {
                    c2 = 235;
                    break;
                }
                break;
            case 3757:
                if (lowerCase.equals("vc")) {
                    c2 = 236;
                    break;
                }
                break;
            case 3759:
                if (lowerCase.equals("ve")) {
                    c2 = 237;
                    break;
                }
                break;
            case 3761:
                if (lowerCase.equals("vg")) {
                    c2 = 238;
                    break;
                }
                break;
            case 3763:
                if (lowerCase.equals("vi")) {
                    c2 = 239;
                    break;
                }
                break;
            case 3768:
                if (lowerCase.equals("vn")) {
                    c2 = 240;
                    break;
                }
                break;
            case 3775:
                if (lowerCase.equals("vu")) {
                    c2 = 241;
                    break;
                }
                break;
            case 3791:
                if (lowerCase.equals("wf")) {
                    c2 = 242;
                    break;
                }
                break;
            case 3804:
                if (lowerCase.equals("ws")) {
                    c2 = 243;
                    break;
                }
                break;
            case 3827:
                if (lowerCase.equals("xk")) {
                    c2 = 244;
                    break;
                }
                break;
            case 3852:
                if (lowerCase.equals("ye")) {
                    c2 = 245;
                    break;
                }
                break;
            case 3867:
                if (lowerCase.equals("yt")) {
                    c2 = 246;
                    break;
                }
                break;
            case 3879:
                if (lowerCase.equals("za")) {
                    c2 = 247;
                    break;
                }
                break;
            case 3891:
                if (lowerCase.equals("zm")) {
                    c2 = 248;
                    break;
                }
                break;
            case 3901:
                if (lowerCase.equals("zw")) {
                    c2 = 249;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return "🇦🇩";
            case 1:
                return "🇦🇪";
            case 2:
                return "🇦🇫";
            case 3:
                return "🇦🇬";
            case 4:
                return "🇦🇮";
            case 5:
                return "🇦🇱";
            case 6:
                return "🇦🇲";
            case 7:
                return "🇦🇴";
            case '\b':
                return "🇦🇶";
            case '\t':
                return "🇦🇷";
            case '\n':
                return "🇦🇸";
            case 11:
                return "🇦🇹";
            case '\f':
                return "🇦🇺";
            case '\r':
                return "🇦🇼";
            case 14:
                return "🇦🇽";
            case 15:
                return "🇦🇿";
            case 16:
                return "🇧🇦";
            case 17:
                return "🇧🇧";
            case 18:
                return "🇧🇩";
            case 19:
                return "🇧🇪";
            case 20:
                return "🇧🇫";
            case 21:
                return "🇧🇬";
            case 22:
                return "🇧🇭";
            case 23:
                return "🇧🇮";
            case 24:
                return "🇧🇯";
            case 25:
                return "🇧🇱";
            case 26:
                return "🇧🇲";
            case 27:
                return "🇧🇳";
            case 28:
                return "🇧🇴";
            case 29:
                return "🇧🇶";
            case 30:
                return "🇧🇷";
            case 31:
                return "🇧🇸";
            case ' ':
                return "🇧🇹";
            case '!':
                return "🇧🇻";
            case '\"':
                return "🇧🇼";
            case '#':
                return "🇧🇾";
            case '$':
                return "🇧🇿";
            case '%':
                return "🇨🇦";
            case '&':
                return "🇨🇨";
            case '\'':
                return "🇨🇩";
            case '(':
                return "🇨🇫";
            case ')':
                return "🇨🇬";
            case '*':
                return "🇨🇭";
            case '+':
                return "🇨🇮";
            case ',':
                return "🇨🇰";
            case '-':
                return "🇨🇱";
            case '.':
                return "🇨🇲";
            case '/':
                return "🇨🇳";
            case '0':
                return "🇨🇴";
            case '1':
                return "🇨🇷";
            case '2':
                return "🇨🇺";
            case '3':
                return "🇨🇻";
            case '4':
                return "🇨🇼";
            case '5':
                return "🇨🇽";
            case '6':
                return "🇨🇾";
            case '7':
                return "🇨🇿";
            case '8':
                return "🇩🇪";
            case '9':
                return "🇩🇯";
            case ':':
                return "🇩🇰";
            case ';':
                return "🇩🇲";
            case '<':
                return "🇩🇴";
            case '=':
                return "🇩🇿";
            case '>':
                return "🇪🇨";
            case '?':
                return "🇪🇪";
            case '@':
                return "🇪🇬";
            case 'A':
                return "🇪🇭";
            case 'B':
                return "🇪🇷";
            case 'C':
                return "🇪🇸";
            case 'D':
                return "🇪🇹";
            case 'E':
                return "🇫🇮";
            case 'F':
                return "🇫🇯";
            case 'G':
                return "🇫🇰";
            case 'H':
                return "🇫🇲";
            case 'I':
                return "🇫🇴";
            case 'J':
                return "🇫🇷";
            case 'K':
                return "🇬🇦";
            case 'L':
                return "🇬🇧";
            case 'M':
                return "🇬🇩";
            case 'N':
                return "🇬🇪";
            case 'O':
                return "🇬🇫";
            case 'P':
                return "🇬🇬";
            case 'Q':
                return "🇬🇭";
            case 'R':
                return "🇬🇮";
            case 'S':
                return "🇬🇱";
            case 'T':
                return "🇬🇲";
            case 'U':
                return "🇬🇳";
            case 'V':
                return "🇬🇵";
            case 'W':
                return "🇬🇶";
            case 'X':
                return "🇬🇷";
            case 'Y':
                return "🇬🇸";
            case 'Z':
                return "🇬🇹";
            case '[':
                return "🇬🇺";
            case '\\':
                return "🇬🇼";
            case ']':
                return "🇬🇾";
            case '^':
                return "🇭🇰";
            case '_':
                return "🇭🇲";
            case '`':
                return "🇭🇳";
            case 'a':
                return "🇭🇷";
            case 'b':
                return "🇭🇹";
            case 'c':
                return "🇭🇺";
            case 'd':
                return "🇮🇩";
            case 'e':
                return "🇮🇪";
            case 'f':
                return "🇮🇱";
            case 'g':
                return "🇮🇲";
            case 'h':
                return "🇮🇳";
            case 'i':
                return "🇮🇴";
            case 'j':
                return "🇮🇶";
            case 'k':
                return "🇮🇷";
            case 'l':
                return "🇮🇸";
            case 'm':
                return "🇮🇹";
            case 'n':
                return "🇯🇪";
            case 'o':
                return "🇯🇲";
            case 'p':
                return "🇯🇴";
            case 'q':
                return "🇯🇵";
            case 'r':
                return "🇰🇪";
            case 's':
                return "🇰🇬";
            case 't':
                return "🇰🇭";
            case 'u':
                return "🇰🇮";
            case 'v':
                return "🇰🇲";
            case 'w':
                return "🇰🇳";
            case 'x':
                return "🇰🇵";
            case 'y':
                return "🇰🇷";
            case 'z':
                return "🇰🇼";
            case '{':
                return "🇰🇾";
            case '|':
                return "🇰🇿";
            case '}':
                return "🇱🇦";
            case '~':
                return "🇱🇧";
            case 127:
                return "🇱🇨";
            case 128:
                return "🇱🇮";
            case 129:
                return "🇱🇰";
            case 130:
                return "🇱🇷";
            case 131:
                return "🇱🇸";
            case 132:
                return "🇱🇹";
            case 133:
                return "🇱🇺";
            case 134:
                return "🇱🇻";
            case 135:
                return "🇱🇾";
            case 136:
                return "🇲🇦";
            case 137:
                return "🇲🇨";
            case 138:
                return "🇲🇩";
            case 139:
                return "🇲🇪";
            case 140:
                return "🇲🇫";
            case 141:
                return "🇲🇬";
            case 142:
                return "🇲🇭";
            case 143:
                return "🇲🇰";
            case 144:
                return "🇲🇱";
            case 145:
                return "🇲🇲";
            case 146:
                return "🇲🇳";
            case 147:
                return "🇲🇴";
            case 148:
                return "🇲🇵";
            case 149:
                return "🇲🇶";
            case 150:
                return "🇲🇷";
            case 151:
                return "🇲🇸";
            case 152:
                return "🇲🇹";
            case 153:
                return "🇲🇺";
            case 154:
                return "🇲🇻";
            case 155:
                return "🇲🇼";
            case 156:
                return "🇲🇽";
            case 157:
                return "🇲🇾";
            case 158:
                return "🇲🇿";
            case 159:
                return "🇳🇦";
            case 160:
                return "🇳🇨";
            case 161:
                return "🇳🇪";
            case 162:
                return "🇳🇫";
            case 163:
                return "🇳🇬";
            case 164:
                return "🇳🇮";
            case 165:
                return "🇳🇱";
            case 166:
                return "🇳🇴";
            case 167:
                return "🇳🇵";
            case 168:
                return "🇳🇷";
            case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                return "🇳🇺";
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                return "🇳🇿";
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                return "🇴🇲";
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                return "🇵🇦";
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                return "🇵🇪";
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                return "🇵🇫";
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                return "🇵🇬";
            case CipherSuite.TLS_PSK_WITH_NULL_SHA256 /* 176 */:
                return "🇵🇭";
            case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
                return "🇵🇰";
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
                return "🇵🇱";
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                return "🇵🇲";
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 /* 180 */:
                return "🇵🇳";
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
                return "🇵🇷";
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
                return "🇵🇸";
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
                return "🇵🇹";
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
                return "🇵🇼";
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
                return "🇵🇾";
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                return "🇶🇦";
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                return "🇷🇪";
            case 188:
                return "🇷🇴";
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                return "🇷🇸";
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                return "🇷🇺";
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
                return "🇷🇼";
            case 192:
                return "🇸🇦";
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
                return "🇸🇧";
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                return "🇸🇨";
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                return "🇸🇩";
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                return "🇸🇪";
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                return "🇸🇬";
            case 198:
                return "🇸🇭";
            case 199:
                return "🇸🇮";
            case 200:
                return "🇸🇯";
            case 201:
                return "🇸🇰";
            case 202:
                return "🇸🇱";
            case 203:
                return "🇸🇲";
            case 204:
                return "🇸🇳";
            case 205:
                return "🇸🇴";
            case 206:
                return "🇸🇷";
            case 207:
                return "🇸🇸";
            case 208:
                return "🇸🇹";
            case 209:
                return "🇸🇻";
            case 210:
                return "🇸🇽";
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                return "🇸🇾";
            case 212:
                return "🇸🇿";
            case 213:
                return "🇹🇨";
            case 214:
                return "🇹🇩";
            case 215:
                return "🇹🇫";
            case 216:
                return "🇹🇬";
            case 217:
                return "🇹🇭";
            case 218:
                return "🇹🇯";
            case 219:
                return "🇹🇰";
            case 220:
                return "🇹🇱";
            case 221:
                return "🇹🇲";
            case 222:
                return "🇹🇳";
            case PassportService.DEFAULT_MAX_BLOCKSIZE /* 223 */:
                return "🇹🇴";
            case BERTags.FLAGS /* 224 */:
                return "🇹🇷";
            case 225:
                return "🇹🇹";
            case 226:
                return "🇹🇻";
            case 227:
                return "🇹🇼";
            case 228:
                return "🇹🇿";
            case 229:
                return "🇺🇦";
            case 230:
                return "🇺🇬";
            case 231:
                return "🇺🇲";
            case 232:
                return "🇺🇸";
            case 233:
                return "🇺🇾";
            case 234:
                return "🇺🇿";
            case 235:
                return "🇻🇦";
            case 236:
                return "🇻🇨";
            case 237:
                return "🇻🇪";
            case 238:
                return "🇻🇬";
            case 239:
                return "🇻🇮";
            case 240:
                return "🇻🇳";
            case 241:
                return "🇻🇺";
            case 242:
                return "🇼🇫";
            case 243:
                return "🇼🇸";
            case 244:
                return "🇽🇰";
            case 245:
                return "🇾🇪";
            case 246:
                return "🇾🇹";
            case 247:
                return "🇿🇦";
            case 248:
                return "🇿🇲";
            case 249:
                return "🇿🇼";
            default:
                return " ";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int i(a aVar) {
        String lowerCase = aVar.f10619a.toLowerCase();
        lowerCase.getClass();
        char c2 = 65535;
        switch (lowerCase.hashCode()) {
            case 3107:
                if (lowerCase.equals("ad")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3108:
                if (lowerCase.equals("ae")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3109:
                if (lowerCase.equals("af")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3110:
                if (lowerCase.equals("ag")) {
                    c2 = 3;
                    break;
                }
                break;
            case 3112:
                if (lowerCase.equals("ai")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3115:
                if (lowerCase.equals("al")) {
                    c2 = 5;
                    break;
                }
                break;
            case 3116:
                if (lowerCase.equals("am")) {
                    c2 = 6;
                    break;
                }
                break;
            case 3118:
                if (lowerCase.equals("ao")) {
                    c2 = 7;
                    break;
                }
                break;
            case 3120:
                if (lowerCase.equals("aq")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 3121:
                if (lowerCase.equals("ar")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 3122:
                if (lowerCase.equals("as")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 3123:
                if (lowerCase.equals("at")) {
                    c2 = 11;
                    break;
                }
                break;
            case 3124:
                if (lowerCase.equals("au")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 3126:
                if (lowerCase.equals("aw")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 3127:
                if (lowerCase.equals("ax")) {
                    c2 = 14;
                    break;
                }
                break;
            case 3129:
                if (lowerCase.equals("az")) {
                    c2 = 15;
                    break;
                }
                break;
            case 3135:
                if (lowerCase.equals("ba")) {
                    c2 = 16;
                    break;
                }
                break;
            case 3136:
                if (lowerCase.equals("bb")) {
                    c2 = 17;
                    break;
                }
                break;
            case 3138:
                if (lowerCase.equals("bd")) {
                    c2 = 18;
                    break;
                }
                break;
            case 3139:
                if (lowerCase.equals("be")) {
                    c2 = 19;
                    break;
                }
                break;
            case 3140:
                if (lowerCase.equals("bf")) {
                    c2 = 20;
                    break;
                }
                break;
            case 3141:
                if (lowerCase.equals("bg")) {
                    c2 = 21;
                    break;
                }
                break;
            case 3142:
                if (lowerCase.equals("bh")) {
                    c2 = 22;
                    break;
                }
                break;
            case 3143:
                if (lowerCase.equals("bi")) {
                    c2 = 23;
                    break;
                }
                break;
            case 3144:
                if (lowerCase.equals("bj")) {
                    c2 = 24;
                    break;
                }
                break;
            case 3146:
                if (lowerCase.equals("bl")) {
                    c2 = 25;
                    break;
                }
                break;
            case 3147:
                if (lowerCase.equals("bm")) {
                    c2 = 26;
                    break;
                }
                break;
            case 3148:
                if (lowerCase.equals("bn")) {
                    c2 = 27;
                    break;
                }
                break;
            case 3149:
                if (lowerCase.equals("bo")) {
                    c2 = 28;
                    break;
                }
                break;
            case 3152:
                if (lowerCase.equals("br")) {
                    c2 = 29;
                    break;
                }
                break;
            case 3153:
                if (lowerCase.equals("bs")) {
                    c2 = 30;
                    break;
                }
                break;
            case 3154:
                if (lowerCase.equals("bt")) {
                    c2 = 31;
                    break;
                }
                break;
            case 3157:
                if (lowerCase.equals("bw")) {
                    c2 = ' ';
                    break;
                }
                break;
            case 3159:
                if (lowerCase.equals("by")) {
                    c2 = '!';
                    break;
                }
                break;
            case 3160:
                if (lowerCase.equals("bz")) {
                    c2 = '\"';
                    break;
                }
                break;
            case 3166:
                if (lowerCase.equals("ca")) {
                    c2 = '#';
                    break;
                }
                break;
            case 3168:
                if (lowerCase.equals("cc")) {
                    c2 = '$';
                    break;
                }
                break;
            case 3169:
                if (lowerCase.equals("cd")) {
                    c2 = '%';
                    break;
                }
                break;
            case 3171:
                if (lowerCase.equals("cf")) {
                    c2 = '&';
                    break;
                }
                break;
            case 3172:
                if (lowerCase.equals("cg")) {
                    c2 = '\'';
                    break;
                }
                break;
            case 3173:
                if (lowerCase.equals("ch")) {
                    c2 = '(';
                    break;
                }
                break;
            case 3174:
                if (lowerCase.equals("ci")) {
                    c2 = ')';
                    break;
                }
                break;
            case 3176:
                if (lowerCase.equals("ck")) {
                    c2 = '*';
                    break;
                }
                break;
            case 3177:
                if (lowerCase.equals("cl")) {
                    c2 = '+';
                    break;
                }
                break;
            case 3178:
                if (lowerCase.equals("cm")) {
                    c2 = ',';
                    break;
                }
                break;
            case 3179:
                if (lowerCase.equals("cn")) {
                    c2 = '-';
                    break;
                }
                break;
            case 3180:
                if (lowerCase.equals("co")) {
                    c2 = '.';
                    break;
                }
                break;
            case 3183:
                if (lowerCase.equals("cr")) {
                    c2 = '/';
                    break;
                }
                break;
            case 3186:
                if (lowerCase.equals("cu")) {
                    c2 = '0';
                    break;
                }
                break;
            case 3187:
                if (lowerCase.equals("cv")) {
                    c2 = '1';
                    break;
                }
                break;
            case 3188:
                if (lowerCase.equals("cw")) {
                    c2 = '2';
                    break;
                }
                break;
            case 3189:
                if (lowerCase.equals("cx")) {
                    c2 = '3';
                    break;
                }
                break;
            case 3190:
                if (lowerCase.equals("cy")) {
                    c2 = '4';
                    break;
                }
                break;
            case 3191:
                if (lowerCase.equals("cz")) {
                    c2 = '5';
                    break;
                }
                break;
            case 3201:
                if (lowerCase.equals("de")) {
                    c2 = '6';
                    break;
                }
                break;
            case 3206:
                if (lowerCase.equals("dj")) {
                    c2 = '7';
                    break;
                }
                break;
            case 3207:
                if (lowerCase.equals("dk")) {
                    c2 = '8';
                    break;
                }
                break;
            case 3209:
                if (lowerCase.equals("dm")) {
                    c2 = '9';
                    break;
                }
                break;
            case 3211:
                if (lowerCase.equals("do")) {
                    c2 = ':';
                    break;
                }
                break;
            case 3222:
                if (lowerCase.equals("dz")) {
                    c2 = ';';
                    break;
                }
                break;
            case 3230:
                if (lowerCase.equals("ec")) {
                    c2 = '<';
                    break;
                }
                break;
            case 3232:
                if (lowerCase.equals("ee")) {
                    c2 = '=';
                    break;
                }
                break;
            case 3234:
                if (lowerCase.equals("eg")) {
                    c2 = '>';
                    break;
                }
                break;
            case 3245:
                if (lowerCase.equals("er")) {
                    c2 = '?';
                    break;
                }
                break;
            case 3246:
                if (lowerCase.equals("es")) {
                    c2 = '@';
                    break;
                }
                break;
            case 3247:
                if (lowerCase.equals("et")) {
                    c2 = 'A';
                    break;
                }
                break;
            case 3267:
                if (lowerCase.equals("fi")) {
                    c2 = 'B';
                    break;
                }
                break;
            case 3268:
                if (lowerCase.equals("fj")) {
                    c2 = 'C';
                    break;
                }
                break;
            case 3269:
                if (lowerCase.equals("fk")) {
                    c2 = 'D';
                    break;
                }
                break;
            case 3271:
                if (lowerCase.equals("fm")) {
                    c2 = 'E';
                    break;
                }
                break;
            case 3273:
                if (lowerCase.equals("fo")) {
                    c2 = 'F';
                    break;
                }
                break;
            case 3276:
                if (lowerCase.equals("fr")) {
                    c2 = 'G';
                    break;
                }
                break;
            case 3290:
                if (lowerCase.equals("ga")) {
                    c2 = 'H';
                    break;
                }
                break;
            case 3291:
                if (lowerCase.equals("gb")) {
                    c2 = 'I';
                    break;
                }
                break;
            case 3293:
                if (lowerCase.equals("gd")) {
                    c2 = 'J';
                    break;
                }
                break;
            case 3294:
                if (lowerCase.equals("ge")) {
                    c2 = 'K';
                    break;
                }
                break;
            case 3295:
                if (lowerCase.equals("gf")) {
                    c2 = Matrix.MATRIX_TYPE_RANDOM_LT;
                    break;
                }
                break;
            case 3296:
                if (lowerCase.equals("gg")) {
                    c2 = 'M';
                    break;
                }
                break;
            case 3297:
                if (lowerCase.equals("gh")) {
                    c2 = 'N';
                    break;
                }
                break;
            case 3298:
                if (lowerCase.equals("gi")) {
                    c2 = 'O';
                    break;
                }
                break;
            case 3301:
                if (lowerCase.equals("gl")) {
                    c2 = 'P';
                    break;
                }
                break;
            case 3302:
                if (lowerCase.equals("gm")) {
                    c2 = 'Q';
                    break;
                }
                break;
            case 3303:
                if (lowerCase.equals("gn")) {
                    c2 = Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                    break;
                }
                break;
            case 3305:
                if (lowerCase.equals("gp")) {
                    c2 = 'S';
                    break;
                }
                break;
            case 3306:
                if (lowerCase.equals("gq")) {
                    c2 = 'T';
                    break;
                }
                break;
            case 3307:
                if (lowerCase.equals("gr")) {
                    c2 = Matrix.MATRIX_TYPE_RANDOM_UT;
                    break;
                }
                break;
            case 3309:
                if (lowerCase.equals("gt")) {
                    c2 = 'V';
                    break;
                }
                break;
            case 3310:
                if (lowerCase.equals("gu")) {
                    c2 = 'W';
                    break;
                }
                break;
            case 3312:
                if (lowerCase.equals("gw")) {
                    c2 = 'X';
                    break;
                }
                break;
            case 3314:
                if (lowerCase.equals("gy")) {
                    c2 = 'Y';
                    break;
                }
                break;
            case 3331:
                if (lowerCase.equals("hk")) {
                    c2 = Matrix.MATRIX_TYPE_ZERO;
                    break;
                }
                break;
            case 3334:
                if (lowerCase.equals("hn")) {
                    c2 = '[';
                    break;
                }
                break;
            case 3338:
                if (lowerCase.equals("hr")) {
                    c2 = '\\';
                    break;
                }
                break;
            case 3340:
                if (lowerCase.equals("ht")) {
                    c2 = ']';
                    break;
                }
                break;
            case 3341:
                if (lowerCase.equals("hu")) {
                    c2 = '^';
                    break;
                }
                break;
            case 3355:
                if (lowerCase.equals("id")) {
                    c2 = '_';
                    break;
                }
                break;
            case 3356:
                if (lowerCase.equals("ie")) {
                    c2 = '`';
                    break;
                }
                break;
            case 3363:
                if (lowerCase.equals("il")) {
                    c2 = 'a';
                    break;
                }
                break;
            case 3364:
                if (lowerCase.equals("im")) {
                    c2 = 'b';
                    break;
                }
                break;
            case 3365:
                if (lowerCase.equals("in")) {
                    c2 = 'c';
                    break;
                }
                break;
            case 3366:
                if (lowerCase.equals("io")) {
                    c2 = 'd';
                    break;
                }
                break;
            case 3368:
                if (lowerCase.equals("iq")) {
                    c2 = 'e';
                    break;
                }
                break;
            case 3369:
                if (lowerCase.equals("ir")) {
                    c2 = 'f';
                    break;
                }
                break;
            case 3370:
                if (lowerCase.equals("is")) {
                    c2 = 'g';
                    break;
                }
                break;
            case 3371:
                if (lowerCase.equals("it")) {
                    c2 = 'h';
                    break;
                }
                break;
            case 3387:
                if (lowerCase.equals("je")) {
                    c2 = 'i';
                    break;
                }
                break;
            case 3395:
                if (lowerCase.equals("jm")) {
                    c2 = 'j';
                    break;
                }
                break;
            case 3397:
                if (lowerCase.equals("jo")) {
                    c2 = 'k';
                    break;
                }
                break;
            case 3398:
                if (lowerCase.equals("jp")) {
                    c2 = 'l';
                    break;
                }
                break;
            case 3418:
                if (lowerCase.equals("ke")) {
                    c2 = 'm';
                    break;
                }
                break;
            case 3420:
                if (lowerCase.equals("kg")) {
                    c2 = 'n';
                    break;
                }
                break;
            case 3421:
                if (lowerCase.equals("kh")) {
                    c2 = 'o';
                    break;
                }
                break;
            case 3422:
                if (lowerCase.equals("ki")) {
                    c2 = 'p';
                    break;
                }
                break;
            case 3426:
                if (lowerCase.equals("km")) {
                    c2 = 'q';
                    break;
                }
                break;
            case 3427:
                if (lowerCase.equals("kn")) {
                    c2 = 'r';
                    break;
                }
                break;
            case 3429:
                if (lowerCase.equals("kp")) {
                    c2 = 's';
                    break;
                }
                break;
            case 3431:
                if (lowerCase.equals("kr")) {
                    c2 = 't';
                    break;
                }
                break;
            case 3436:
                if (lowerCase.equals("kw")) {
                    c2 = 'u';
                    break;
                }
                break;
            case 3438:
                if (lowerCase.equals("ky")) {
                    c2 = 'v';
                    break;
                }
                break;
            case 3439:
                if (lowerCase.equals("kz")) {
                    c2 = 'w';
                    break;
                }
                break;
            case 3445:
                if (lowerCase.equals("la")) {
                    c2 = 'x';
                    break;
                }
                break;
            case 3446:
                if (lowerCase.equals("lb")) {
                    c2 = 'y';
                    break;
                }
                break;
            case 3447:
                if (lowerCase.equals("lc")) {
                    c2 = 'z';
                    break;
                }
                break;
            case 3453:
                if (lowerCase.equals("li")) {
                    c2 = '{';
                    break;
                }
                break;
            case 3455:
                if (lowerCase.equals("lk")) {
                    c2 = '|';
                    break;
                }
                break;
            case 3462:
                if (lowerCase.equals("lr")) {
                    c2 = '}';
                    break;
                }
                break;
            case 3463:
                if (lowerCase.equals("ls")) {
                    c2 = '~';
                    break;
                }
                break;
            case 3464:
                if (lowerCase.equals("lt")) {
                    c2 = 127;
                    break;
                }
                break;
            case 3465:
                if (lowerCase.equals("lu")) {
                    c2 = 128;
                    break;
                }
                break;
            case 3466:
                if (lowerCase.equals("lv")) {
                    c2 = 129;
                    break;
                }
                break;
            case 3469:
                if (lowerCase.equals("ly")) {
                    c2 = 130;
                    break;
                }
                break;
            case 3476:
                if (lowerCase.equals("ma")) {
                    c2 = 131;
                    break;
                }
                break;
            case 3478:
                if (lowerCase.equals("mc")) {
                    c2 = 132;
                    break;
                }
                break;
            case 3479:
                if (lowerCase.equals("md")) {
                    c2 = 133;
                    break;
                }
                break;
            case 3480:
                if (lowerCase.equals("me")) {
                    c2 = 134;
                    break;
                }
                break;
            case 3481:
                if (lowerCase.equals("mf")) {
                    c2 = 135;
                    break;
                }
                break;
            case 3482:
                if (lowerCase.equals("mg")) {
                    c2 = 136;
                    break;
                }
                break;
            case 3483:
                if (lowerCase.equals("mh")) {
                    c2 = 137;
                    break;
                }
                break;
            case 3486:
                if (lowerCase.equals("mk")) {
                    c2 = 138;
                    break;
                }
                break;
            case 3487:
                if (lowerCase.equals("ml")) {
                    c2 = 139;
                    break;
                }
                break;
            case 3488:
                if (lowerCase.equals("mm")) {
                    c2 = 140;
                    break;
                }
                break;
            case 3489:
                if (lowerCase.equals("mn")) {
                    c2 = 141;
                    break;
                }
                break;
            case 3490:
                if (lowerCase.equals("mo")) {
                    c2 = 142;
                    break;
                }
                break;
            case 3491:
                if (lowerCase.equals("mp")) {
                    c2 = 143;
                    break;
                }
                break;
            case 3492:
                if (lowerCase.equals("mq")) {
                    c2 = 144;
                    break;
                }
                break;
            case 3493:
                if (lowerCase.equals("mr")) {
                    c2 = 145;
                    break;
                }
                break;
            case 3494:
                if (lowerCase.equals("ms")) {
                    c2 = 146;
                    break;
                }
                break;
            case 3495:
                if (lowerCase.equals("mt")) {
                    c2 = 147;
                    break;
                }
                break;
            case 3496:
                if (lowerCase.equals("mu")) {
                    c2 = 148;
                    break;
                }
                break;
            case 3497:
                if (lowerCase.equals("mv")) {
                    c2 = 149;
                    break;
                }
                break;
            case 3498:
                if (lowerCase.equals("mw")) {
                    c2 = 150;
                    break;
                }
                break;
            case 3499:
                if (lowerCase.equals("mx")) {
                    c2 = 151;
                    break;
                }
                break;
            case 3500:
                if (lowerCase.equals("my")) {
                    c2 = 152;
                    break;
                }
                break;
            case 3501:
                if (lowerCase.equals("mz")) {
                    c2 = 153;
                    break;
                }
                break;
            case 3507:
                if (lowerCase.equals("na")) {
                    c2 = 154;
                    break;
                }
                break;
            case 3509:
                if (lowerCase.equals("nc")) {
                    c2 = 155;
                    break;
                }
                break;
            case 3511:
                if (lowerCase.equals("ne")) {
                    c2 = 156;
                    break;
                }
                break;
            case 3512:
                if (lowerCase.equals("nf")) {
                    c2 = 157;
                    break;
                }
                break;
            case 3513:
                if (lowerCase.equals("ng")) {
                    c2 = 158;
                    break;
                }
                break;
            case 3515:
                if (lowerCase.equals("ni")) {
                    c2 = 159;
                    break;
                }
                break;
            case 3518:
                if (lowerCase.equals("nl")) {
                    c2 = 160;
                    break;
                }
                break;
            case 3521:
                if (lowerCase.equals("no")) {
                    c2 = 161;
                    break;
                }
                break;
            case 3522:
                if (lowerCase.equals("np")) {
                    c2 = 162;
                    break;
                }
                break;
            case 3524:
                if (lowerCase.equals("nr")) {
                    c2 = 163;
                    break;
                }
                break;
            case 3527:
                if (lowerCase.equals("nu")) {
                    c2 = 164;
                    break;
                }
                break;
            case 3532:
                if (lowerCase.equals("nz")) {
                    c2 = 165;
                    break;
                }
                break;
            case 3550:
                if (lowerCase.equals("om")) {
                    c2 = 166;
                    break;
                }
                break;
            case 3569:
                if (lowerCase.equals("pa")) {
                    c2 = 167;
                    break;
                }
                break;
            case 3573:
                if (lowerCase.equals("pe")) {
                    c2 = 168;
                    break;
                }
                break;
            case 3574:
                if (lowerCase.equals("pf")) {
                    c2 = 169;
                    break;
                }
                break;
            case 3575:
                if (lowerCase.equals("pg")) {
                    c2 = 170;
                    break;
                }
                break;
            case 3576:
                if (lowerCase.equals("ph")) {
                    c2 = 171;
                    break;
                }
                break;
            case 3579:
                if (lowerCase.equals("pk")) {
                    c2 = 172;
                    break;
                }
                break;
            case 3580:
                if (lowerCase.equals("pl")) {
                    c2 = 173;
                    break;
                }
                break;
            case 3581:
                if (lowerCase.equals("pm")) {
                    c2 = 174;
                    break;
                }
                break;
            case 3582:
                if (lowerCase.equals("pn")) {
                    c2 = 175;
                    break;
                }
                break;
            case 3586:
                if (lowerCase.equals("pr")) {
                    c2 = 176;
                    break;
                }
                break;
            case 3587:
                if (lowerCase.equals("ps")) {
                    c2 = 177;
                    break;
                }
                break;
            case 3588:
                if (lowerCase.equals("pt")) {
                    c2 = 178;
                    break;
                }
                break;
            case 3591:
                if (lowerCase.equals("pw")) {
                    c2 = 179;
                    break;
                }
                break;
            case 3593:
                if (lowerCase.equals("py")) {
                    c2 = 180;
                    break;
                }
                break;
            case 3600:
                if (lowerCase.equals("qa")) {
                    c2 = 181;
                    break;
                }
                break;
            case 3635:
                if (lowerCase.equals("re")) {
                    c2 = 182;
                    break;
                }
                break;
            case 3645:
                if (lowerCase.equals("ro")) {
                    c2 = 183;
                    break;
                }
                break;
            case 3649:
                if (lowerCase.equals("rs")) {
                    c2 = 184;
                    break;
                }
                break;
            case 3651:
                if (lowerCase.equals("ru")) {
                    c2 = 185;
                    break;
                }
                break;
            case 3653:
                if (lowerCase.equals("rw")) {
                    c2 = 186;
                    break;
                }
                break;
            case 3662:
                if (lowerCase.equals("sa")) {
                    c2 = 187;
                    break;
                }
                break;
            case 3663:
                if (lowerCase.equals("sb")) {
                    c2 = 188;
                    break;
                }
                break;
            case 3664:
                if (lowerCase.equals("sc")) {
                    c2 = 189;
                    break;
                }
                break;
            case 3665:
                if (lowerCase.equals("sd")) {
                    c2 = 190;
                    break;
                }
                break;
            case 3666:
                if (lowerCase.equals("se")) {
                    c2 = 191;
                    break;
                }
                break;
            case 3668:
                if (lowerCase.equals("sg")) {
                    c2 = 192;
                    break;
                }
                break;
            case 3669:
                if (lowerCase.equals("sh")) {
                    c2 = 193;
                    break;
                }
                break;
            case 3670:
                if (lowerCase.equals("si")) {
                    c2 = 194;
                    break;
                }
                break;
            case 3672:
                if (lowerCase.equals("sk")) {
                    c2 = 195;
                    break;
                }
                break;
            case 3673:
                if (lowerCase.equals("sl")) {
                    c2 = 196;
                    break;
                }
                break;
            case 3674:
                if (lowerCase.equals("sm")) {
                    c2 = 197;
                    break;
                }
                break;
            case 3675:
                if (lowerCase.equals("sn")) {
                    c2 = 198;
                    break;
                }
                break;
            case 3676:
                if (lowerCase.equals("so")) {
                    c2 = 199;
                    break;
                }
                break;
            case 3679:
                if (lowerCase.equals("sr")) {
                    c2 = 200;
                    break;
                }
                break;
            case 3680:
                if (lowerCase.equals("ss")) {
                    c2 = 201;
                    break;
                }
                break;
            case 3681:
                if (lowerCase.equals("st")) {
                    c2 = 202;
                    break;
                }
                break;
            case 3683:
                if (lowerCase.equals("sv")) {
                    c2 = 203;
                    break;
                }
                break;
            case 3685:
                if (lowerCase.equals("sx")) {
                    c2 = 204;
                    break;
                }
                break;
            case 3686:
                if (lowerCase.equals("sy")) {
                    c2 = 205;
                    break;
                }
                break;
            case 3687:
                if (lowerCase.equals("sz")) {
                    c2 = 206;
                    break;
                }
                break;
            case 3695:
                if (lowerCase.equals("tc")) {
                    c2 = 207;
                    break;
                }
                break;
            case 3696:
                if (lowerCase.equals("td")) {
                    c2 = 208;
                    break;
                }
                break;
            case 3699:
                if (lowerCase.equals("tg")) {
                    c2 = 209;
                    break;
                }
                break;
            case 3700:
                if (lowerCase.equals("th")) {
                    c2 = 210;
                    break;
                }
                break;
            case 3702:
                if (lowerCase.equals("tj")) {
                    c2 = 211;
                    break;
                }
                break;
            case 3703:
                if (lowerCase.equals("tk")) {
                    c2 = 212;
                    break;
                }
                break;
            case 3704:
                if (lowerCase.equals("tl")) {
                    c2 = 213;
                    break;
                }
                break;
            case 3705:
                if (lowerCase.equals("tm")) {
                    c2 = 214;
                    break;
                }
                break;
            case 3706:
                if (lowerCase.equals("tn")) {
                    c2 = 215;
                    break;
                }
                break;
            case 3707:
                if (lowerCase.equals("to")) {
                    c2 = 216;
                    break;
                }
                break;
            case 3710:
                if (lowerCase.equals("tr")) {
                    c2 = 217;
                    break;
                }
                break;
            case 3712:
                if (lowerCase.equals("tt")) {
                    c2 = 218;
                    break;
                }
                break;
            case 3714:
                if (lowerCase.equals("tv")) {
                    c2 = 219;
                    break;
                }
                break;
            case 3715:
                if (lowerCase.equals("tw")) {
                    c2 = 220;
                    break;
                }
                break;
            case 3718:
                if (lowerCase.equals("tz")) {
                    c2 = 221;
                    break;
                }
                break;
            case 3724:
                if (lowerCase.equals("ua")) {
                    c2 = 222;
                    break;
                }
                break;
            case 3730:
                if (lowerCase.equals("ug")) {
                    c2 = 223;
                    break;
                }
                break;
            case 3742:
                if (lowerCase.equals("us")) {
                    c2 = 224;
                    break;
                }
                break;
            case 3748:
                if (lowerCase.equals("uy")) {
                    c2 = 225;
                    break;
                }
                break;
            case 3749:
                if (lowerCase.equals("uz")) {
                    c2 = 226;
                    break;
                }
                break;
            case 3755:
                if (lowerCase.equals("va")) {
                    c2 = 227;
                    break;
                }
                break;
            case 3757:
                if (lowerCase.equals("vc")) {
                    c2 = 228;
                    break;
                }
                break;
            case 3759:
                if (lowerCase.equals("ve")) {
                    c2 = 229;
                    break;
                }
                break;
            case 3761:
                if (lowerCase.equals("vg")) {
                    c2 = 230;
                    break;
                }
                break;
            case 3763:
                if (lowerCase.equals("vi")) {
                    c2 = 231;
                    break;
                }
                break;
            case 3768:
                if (lowerCase.equals("vn")) {
                    c2 = 232;
                    break;
                }
                break;
            case 3775:
                if (lowerCase.equals("vu")) {
                    c2 = 233;
                    break;
                }
                break;
            case 3791:
                if (lowerCase.equals("wf")) {
                    c2 = 234;
                    break;
                }
                break;
            case 3804:
                if (lowerCase.equals("ws")) {
                    c2 = 235;
                    break;
                }
                break;
            case 3827:
                if (lowerCase.equals("xk")) {
                    c2 = 236;
                    break;
                }
                break;
            case 3852:
                if (lowerCase.equals("ye")) {
                    c2 = 237;
                    break;
                }
                break;
            case 3867:
                if (lowerCase.equals("yt")) {
                    c2 = 238;
                    break;
                }
                break;
            case 3879:
                if (lowerCase.equals("za")) {
                    c2 = 239;
                    break;
                }
                break;
            case 3891:
                if (lowerCase.equals("zm")) {
                    c2 = 240;
                    break;
                }
                break;
            case 3901:
                if (lowerCase.equals("zw")) {
                    c2 = 241;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return R.drawable.flag_andorra;
            case 1:
                return R.drawable.flag_uae;
            case 2:
                return R.drawable.flag_afghanistan;
            case 3:
                return R.drawable.flag_antigua_and_barbuda;
            case 4:
                return R.drawable.flag_anguilla;
            case 5:
                return R.drawable.flag_albania;
            case 6:
                return R.drawable.flag_armenia;
            case 7:
                return R.drawable.flag_angola;
            case '\b':
                return R.drawable.flag_antarctica;
            case '\t':
                return R.drawable.flag_argentina;
            case '\n':
                return R.drawable.flag_american_samoa;
            case 11:
                return R.drawable.flag_austria;
            case '\f':
                return R.drawable.flag_australia;
            case '\r':
                return R.drawable.flag_aruba;
            case 14:
                return R.drawable.flag_aland;
            case 15:
                return R.drawable.flag_azerbaijan;
            case 16:
                return R.drawable.flag_bosnia;
            case 17:
                return R.drawable.flag_barbados;
            case 18:
                return R.drawable.flag_bangladesh;
            case 19:
                return R.drawable.flag_belgium;
            case 20:
                return R.drawable.flag_burkina_faso;
            case 21:
                return R.drawable.flag_bulgaria;
            case 22:
                return R.drawable.flag_bahrain;
            case 23:
                return R.drawable.flag_burundi;
            case 24:
                return R.drawable.flag_benin;
            case 25:
                return R.drawable.flag_saint_barthelemy;
            case 26:
                return R.drawable.flag_bermuda;
            case 27:
                return R.drawable.flag_brunei;
            case 28:
                return R.drawable.flag_bolivia;
            case 29:
                return R.drawable.flag_brazil;
            case 30:
                return R.drawable.flag_bahamas;
            case 31:
                return R.drawable.flag_bhutan;
            case ' ':
                return R.drawable.flag_botswana;
            case '!':
                return R.drawable.flag_belarus;
            case '\"':
                return R.drawable.flag_belize;
            case '#':
                return R.drawable.flag_canada;
            case '$':
                return R.drawable.flag_cocos;
            case '%':
                return R.drawable.flag_democratic_republic_of_the_congo;
            case '&':
                return R.drawable.flag_central_african_republic;
            case '\'':
                return R.drawable.flag_republic_of_the_congo;
            case '(':
                return R.drawable.flag_switzerland;
            case ')':
                return R.drawable.flag_cote_divoire;
            case '*':
                return R.drawable.flag_cook_islands;
            case '+':
                return R.drawable.flag_chile;
            case ',':
                return R.drawable.flag_cameroon;
            case '-':
                return R.drawable.flag_china;
            case '.':
                return R.drawable.flag_colombia;
            case '/':
                return R.drawable.flag_costa_rica;
            case '0':
                return R.drawable.flag_cuba;
            case '1':
                return R.drawable.flag_cape_verde;
            case '2':
                return R.drawable.flag_curacao;
            case '3':
                return R.drawable.flag_christmas_island;
            case '4':
                return R.drawable.flag_cyprus;
            case '5':
                return R.drawable.flag_czech_republic;
            case '6':
                return R.drawable.flag_germany;
            case '7':
                return R.drawable.flag_djibouti;
            case '8':
                return R.drawable.flag_denmark;
            case '9':
                return R.drawable.flag_dominica;
            case ':':
                return R.drawable.flag_dominican_republic;
            case ';':
                return R.drawable.flag_algeria;
            case '<':
                return R.drawable.flag_ecuador;
            case '=':
                return R.drawable.flag_estonia;
            case '>':
                return R.drawable.flag_egypt;
            case '?':
                return R.drawable.flag_eritrea;
            case '@':
                return R.drawable.flag_spain;
            case 'A':
                return R.drawable.flag_ethiopia;
            case 'B':
                return R.drawable.flag_finland;
            case 'C':
                return R.drawable.flag_fiji;
            case 'D':
                return R.drawable.flag_falkland_islands;
            case 'E':
                return R.drawable.flag_micronesia;
            case 'F':
                return R.drawable.flag_faroe_islands;
            case 'G':
                return R.drawable.flag_france;
            case 'H':
                return R.drawable.flag_gabon;
            case 'I':
                return R.drawable.flag_united_kingdom;
            case 'J':
                return R.drawable.flag_grenada;
            case 'K':
                return R.drawable.flag_georgia;
            case 'L':
                return R.drawable.flag_guyane;
            case 'M':
                return R.drawable.flag_guernsey;
            case 'N':
                return R.drawable.flag_ghana;
            case 'O':
                return R.drawable.flag_gibraltar;
            case 'P':
                return R.drawable.flag_greenland;
            case 'Q':
                return R.drawable.flag_gambia;
            case 'R':
                return R.drawable.flag_guinea;
            case 'S':
                return R.drawable.flag_guadeloupe;
            case 'T':
                return R.drawable.flag_equatorial_guinea;
            case 'U':
                return R.drawable.flag_greece;
            case 'V':
                return R.drawable.flag_guatemala;
            case 'W':
                return R.drawable.flag_guam;
            case 'X':
                return R.drawable.flag_guinea_bissau;
            case 'Y':
                return R.drawable.flag_guyana;
            case 'Z':
                return R.drawable.flag_hong_kong;
            case '[':
                return R.drawable.flag_honduras;
            case '\\':
                return R.drawable.flag_croatia;
            case ']':
                return R.drawable.flag_haiti;
            case '^':
                return R.drawable.flag_hungary;
            case '_':
                return R.drawable.flag_indonesia;
            case '`':
                return R.drawable.flag_ireland;
            case 'a':
                return R.drawable.flag_israel;
            case 'b':
                return R.drawable.flag_isleof_man;
            case 'c':
                return R.drawable.flag_india;
            case 'd':
                return R.drawable.flag_british_indian_ocean_territory;
            case 'e':
                return R.drawable.flag_iraq_new;
            case 'f':
                return R.drawable.flag_iran;
            case 'g':
                return R.drawable.flag_iceland;
            case 'h':
                return R.drawable.flag_italy;
            case 'i':
                return R.drawable.flag_jersey;
            case 'j':
                return R.drawable.flag_jamaica;
            case 'k':
                return R.drawable.flag_jordan;
            case 'l':
                return R.drawable.flag_japan;
            case 'm':
                return R.drawable.flag_kenya;
            case 'n':
                return R.drawable.flag_kyrgyzstan;
            case 'o':
                return R.drawable.flag_cambodia;
            case 'p':
                return R.drawable.flag_kiribati;
            case 'q':
                return R.drawable.flag_comoros;
            case 'r':
                return R.drawable.flag_saint_kitts_and_nevis;
            case 's':
                return R.drawable.flag_north_korea;
            case 't':
                return R.drawable.flag_south_korea;
            case 'u':
                return R.drawable.flag_kuwait;
            case 'v':
                return R.drawable.flag_cayman_islands;
            case 'w':
                return R.drawable.flag_kazakhstan;
            case 'x':
                return R.drawable.flag_laos;
            case 'y':
                return R.drawable.flag_lebanon;
            case 'z':
                return R.drawable.flag_saint_lucia;
            case '{':
                return R.drawable.flag_liechtenstein;
            case '|':
                return R.drawable.flag_sri_lanka;
            case '}':
                return R.drawable.flag_liberia;
            case '~':
                return R.drawable.flag_lesotho;
            case 127:
                return R.drawable.flag_lithuania;
            case 128:
                return R.drawable.flag_luxembourg;
            case 129:
                return R.drawable.flag_latvia;
            case 130:
                return R.drawable.flag_libya;
            case 131:
                return R.drawable.flag_morocco;
            case 132:
                return R.drawable.flag_monaco;
            case 133:
                return R.drawable.flag_moldova;
            case 134:
                return R.drawable.flag_of_montenegro;
            case 135:
                return R.drawable.flag_saint_martin;
            case 136:
                return R.drawable.flag_madagascar;
            case 137:
                return R.drawable.flag_marshall_islands;
            case 138:
                return R.drawable.flag_macedonia;
            case 139:
                return R.drawable.flag_mali;
            case 140:
                return R.drawable.flag_myanmar;
            case 141:
                return R.drawable.flag_mongolia;
            case 142:
                return R.drawable.flag_macao;
            case 143:
                return R.drawable.flag_northern_mariana_islands;
            case 144:
                return R.drawable.flag_martinique;
            case 145:
                return R.drawable.flag_mauritania;
            case 146:
                return R.drawable.flag_montserrat;
            case 147:
                return R.drawable.flag_malta;
            case 148:
                return R.drawable.flag_mauritius;
            case 149:
                return R.drawable.flag_maldives;
            case 150:
                return R.drawable.flag_malawi;
            case 151:
                return R.drawable.flag_mexico;
            case 152:
                return R.drawable.flag_malaysia;
            case 153:
                return R.drawable.flag_mozambique;
            case 154:
                return R.drawable.flag_namibia;
            case 155:
                return R.drawable.flag_new_caledonia;
            case 156:
                return R.drawable.flag_niger;
            case 157:
                return R.drawable.flag_norfolk_island;
            case 158:
                return R.drawable.flag_nigeria;
            case 159:
                return R.drawable.flag_nicaragua;
            case 160:
                return R.drawable.flag_netherlands;
            case 161:
                return R.drawable.flag_norway;
            case 162:
                return R.drawable.flag_nepal;
            case 163:
                return R.drawable.flag_nauru;
            case 164:
                return R.drawable.flag_niue;
            case 165:
                return R.drawable.flag_new_zealand;
            case 166:
                return R.drawable.flag_oman;
            case 167:
                return R.drawable.flag_panama;
            case 168:
                return R.drawable.flag_peru;
            case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                return R.drawable.flag_french_polynesia;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                return R.drawable.flag_papua_new_guinea;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                return R.drawable.flag_philippines;
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                return R.drawable.flag_pakistan;
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                return R.drawable.flag_poland;
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                return R.drawable.flag_saint_pierre;
            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                return R.drawable.flag_pitcairn_islands;
            case CipherSuite.TLS_PSK_WITH_NULL_SHA256 /* 176 */:
                return R.drawable.flag_puerto_rico;
            case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
                return R.drawable.flag_palestine;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
                return R.drawable.flag_portugal;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                return R.drawable.flag_palau;
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 /* 180 */:
                return R.drawable.flag_paraguay;
            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
                return R.drawable.flag_qatar;
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
                return R.drawable.flag_martinique;
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
                return R.drawable.flag_romania;
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256 /* 184 */:
                return R.drawable.flag_serbia;
            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
                return R.drawable.flag_russian_federation;
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                return R.drawable.flag_rwanda;
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                return R.drawable.flag_saudi_arabia;
            case 188:
                return R.drawable.flag_soloman_islands;
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                return R.drawable.flag_seychelles;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 190 */:
                return R.drawable.flag_sudan;
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
                return R.drawable.flag_sweden;
            case 192:
                return R.drawable.flag_singapore;
            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 193 */:
                return R.drawable.flag_saint_helena;
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                return R.drawable.flag_slovenia;
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
                return R.drawable.flag_slovakia;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
                return R.drawable.flag_sierra_leone;
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
                return R.drawable.flag_san_marino;
            case 198:
                return R.drawable.flag_senegal;
            case 199:
                return R.drawable.flag_somalia;
            case 200:
                return R.drawable.flag_suriname;
            case 201:
                return R.drawable.flag_south_sudan;
            case 202:
                return R.drawable.flag_sao_tome_and_principe;
            case 203:
                return R.drawable.flag_el_salvador;
            case 204:
                return R.drawable.flag_sint_maarten;
            case 205:
                return R.drawable.flag_syria;
            case 206:
                return R.drawable.flag_swaziland;
            case 207:
                return R.drawable.flag_turks_and_caicos_islands;
            case 208:
                return R.drawable.flag_chad;
            case 209:
                return R.drawable.flag_togo;
            case 210:
                return R.drawable.flag_thailand;
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                return R.drawable.flag_tajikistan;
            case 212:
                return R.drawable.flag_tokelau;
            case 213:
                return R.drawable.flag_timor_leste;
            case 214:
                return R.drawable.flag_turkmenistan;
            case 215:
                return R.drawable.flag_tunisia;
            case 216:
                return R.drawable.flag_tonga;
            case 217:
                return R.drawable.flag_turkey;
            case 218:
                return R.drawable.flag_trinidad_and_tobago;
            case 219:
                return R.drawable.flag_tuvalu;
            case 220:
                return R.drawable.flag_taiwan;
            case 221:
                return R.drawable.flag_tanzania;
            case 222:
                return R.drawable.flag_ukraine;
            case PassportService.DEFAULT_MAX_BLOCKSIZE /* 223 */:
                return R.drawable.flag_uganda;
            case BERTags.FLAGS /* 224 */:
                return R.drawable.flag_united_states_of_america;
            case 225:
                return R.drawable.flag_uruguay;
            case 226:
                return R.drawable.flag_uzbekistan;
            case 227:
                return R.drawable.flag_vatican_city;
            case 228:
                return R.drawable.flag_saint_vicent_and_the_grenadines;
            case 229:
                return R.drawable.flag_venezuela;
            case 230:
                return R.drawable.flag_british_virgin_islands;
            case 231:
                return R.drawable.flag_us_virgin_islands;
            case 232:
                return R.drawable.flag_vietnam;
            case 233:
                return R.drawable.flag_vanuatu;
            case 234:
                return R.drawable.flag_wallis_and_futuna;
            case 235:
                return R.drawable.flag_samoa;
            case 236:
                return R.drawable.flag_kosovo;
            case 237:
                return R.drawable.flag_yemen;
            case 238:
                return R.drawable.flag_martinique;
            case 239:
                return R.drawable.flag_south_africa;
            case 240:
                return R.drawable.flag_zambia;
            case 241:
                return R.drawable.flag_zimbabwe;
            default:
                return R.drawable.flag_transparent;
        }
    }

    public static ArrayList j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("ad", "376", "Andorra"));
        arrayList.add(new a("ae", "971", "United Arab Emirates (UAE)"));
        arrayList.add(new a("af", "93", "Afghanistan"));
        arrayList.add(new a("ag", "1", "Antigua and Barbuda"));
        arrayList.add(new a("ai", "1", "Anguilla"));
        arrayList.add(new a("al", "355", "Albania"));
        arrayList.add(new a("am", "374", "Armenia"));
        arrayList.add(new a("ao", "244", "Angola"));
        arrayList.add(new a("aq", "672", "Antarctica"));
        arrayList.add(new a("ar", "54", "Argentina"));
        arrayList.add(new a("as", "1", "American Samoa"));
        arrayList.add(new a("at", "43", "Austria"));
        arrayList.add(new a("au", "61", "Australia"));
        arrayList.add(new a("aw", "297", "Aruba"));
        arrayList.add(new a("ax", "358", "Åland Islands"));
        arrayList.add(new a("az", "994", "Azerbaijan"));
        arrayList.add(new a("ba", "387", "Bosnia And Herzegovina"));
        arrayList.add(new a("bb", "1", "Barbados"));
        arrayList.add(new a("bd", "880", "Bangladesh"));
        arrayList.add(new a("be", "32", "Belgium"));
        arrayList.add(new a("bf", "226", "Burkina Faso"));
        arrayList.add(new a("bg", "359", "Bulgaria"));
        arrayList.add(new a("bh", "973", "Bahrain"));
        arrayList.add(new a("bi", "257", "Burundi"));
        arrayList.add(new a("bj", "229", "Benin"));
        arrayList.add(new a("bl", "590", "Saint Barthélemy"));
        arrayList.add(new a("bm", "1", "Bermuda"));
        arrayList.add(new a("bn", "673", "Brunei Darussalam"));
        arrayList.add(new a("bo", "591", "Bolivia, Plurinational State Of"));
        arrayList.add(new a("br", "55", "Brazil"));
        arrayList.add(new a("bs", "1", "Bahamas"));
        arrayList.add(new a("bt", "975", "Bhutan"));
        arrayList.add(new a("bw", "267", "Botswana"));
        arrayList.add(new a("by", "375", "Belarus"));
        arrayList.add(new a("bz", "501", "Belize"));
        arrayList.add(new a("ca", "1", "Canada"));
        arrayList.add(new a("cc", "61", "Cocos (keeling) Islands"));
        arrayList.add(new a("cd", "243", "Congo, The Democratic Republic Of The"));
        arrayList.add(new a("cf", "236", "Central African Republic"));
        arrayList.add(new a("cg", "242", "Congo"));
        arrayList.add(new a("ch", "41", "Switzerland"));
        arrayList.add(new a("ci", "225", "Côte D'ivoire"));
        arrayList.add(new a("ck", "682", "Cook Islands"));
        arrayList.add(new a("cl", "56", "Chile"));
        arrayList.add(new a("cm", "237", "Cameroon"));
        arrayList.add(new a("cn", "86", "China"));
        arrayList.add(new a("co", "57", "Colombia"));
        arrayList.add(new a("cr", "506", "Costa Rica"));
        arrayList.add(new a("cu", "53", "Cuba"));
        arrayList.add(new a("cv", "238", "Cape Verde"));
        arrayList.add(new a("cw", "599", "Curaçao"));
        arrayList.add(new a("cx", "61", "Christmas Island"));
        arrayList.add(new a("cy", "357", "Cyprus"));
        arrayList.add(new a("cz", "420", "Czech Republic"));
        arrayList.add(new a("de", "49", "Germany"));
        arrayList.add(new a("dj", "253", "Djibouti"));
        arrayList.add(new a("dk", "45", "Denmark"));
        arrayList.add(new a("dm", "1", "Dominica"));
        arrayList.add(new a("do", "1", "Dominican Republic"));
        arrayList.add(new a("dz", "213", "Algeria"));
        arrayList.add(new a("ec", "593", "Ecuador"));
        arrayList.add(new a("ee", "372", "Estonia"));
        arrayList.add(new a("eg", "20", "Egypt"));
        arrayList.add(new a("er", "291", "Eritrea"));
        arrayList.add(new a("es", "34", "Spain"));
        arrayList.add(new a("et", "251", "Ethiopia"));
        arrayList.add(new a("fi", "358", "Finland"));
        arrayList.add(new a("fj", "679", "Fiji"));
        arrayList.add(new a("fk", "500", "Falkland Islands (malvinas)"));
        arrayList.add(new a("fm", "691", "Micronesia, Federated States Of"));
        arrayList.add(new a("fo", "298", "Faroe Islands"));
        arrayList.add(new a("fr", "33", "France"));
        arrayList.add(new a("ga", "241", "Gabon"));
        arrayList.add(new a("gb", "44", "United Kingdom"));
        arrayList.add(new a("gd", "1", "Grenada"));
        arrayList.add(new a("ge", "995", "Georgia"));
        arrayList.add(new a("gf", "594", "French Guyana"));
        arrayList.add(new a("gh", "233", "Ghana"));
        arrayList.add(new a("gi", "350", "Gibraltar"));
        arrayList.add(new a("gl", "299", "Greenland"));
        arrayList.add(new a("gm", "220", "Gambia"));
        arrayList.add(new a("gn", "224", "Guinea"));
        arrayList.add(new a("gp", "450", "Guadeloupe"));
        arrayList.add(new a("gq", "240", "Equatorial Guinea"));
        arrayList.add(new a("gr", "30", "Greece"));
        arrayList.add(new a("gt", "502", "Guatemala"));
        arrayList.add(new a("gu", "1", "Guam"));
        arrayList.add(new a("gw", "245", "Guinea-bissau"));
        arrayList.add(new a("gy", "592", "Guyana"));
        arrayList.add(new a("hk", "852", "Hong Kong"));
        arrayList.add(new a("hn", "504", "Honduras"));
        arrayList.add(new a("hr", "385", "Croatia"));
        arrayList.add(new a("ht", "509", "Haiti"));
        arrayList.add(new a("hu", "36", "Hungary"));
        arrayList.add(new a("id", "62", "Indonesia"));
        arrayList.add(new a("ie", "353", "Ireland"));
        arrayList.add(new a("il", "972", "Israel"));
        arrayList.add(new a("im", "44", "Isle Of Man"));
        arrayList.add(new a("is", "354", "Iceland"));
        arrayList.add(new a("in", "91", "India"));
        arrayList.add(new a("io", "246", "British Indian Ocean Territory"));
        arrayList.add(new a("iq", "964", "Iraq"));
        arrayList.add(new a("ir", "98", "Iran, Islamic Republic Of"));
        arrayList.add(new a("it", "39", "Italy"));
        arrayList.add(new a("je", "44", "Jersey "));
        arrayList.add(new a("jm", "1", "Jamaica"));
        arrayList.add(new a("jo", "962", "Jordan"));
        arrayList.add(new a("jp", "81", "Japan"));
        arrayList.add(new a("ke", "254", "Kenya"));
        arrayList.add(new a("kg", "996", "Kyrgyzstan"));
        arrayList.add(new a("kh", "855", "Cambodia"));
        arrayList.add(new a("ki", "686", "Kiribati"));
        arrayList.add(new a("km", "269", "Comoros"));
        arrayList.add(new a("kn", "1", "Saint Kitts and Nevis"));
        arrayList.add(new a("kp", "850", "North Korea"));
        arrayList.add(new a("kr", "82", "South Korea"));
        arrayList.add(new a("kw", "965", "Kuwait"));
        arrayList.add(new a("ky", "1", "Cayman Islands"));
        arrayList.add(new a("kz", "7", "Kazakhstan"));
        arrayList.add(new a("la", "856", "Lao People's Democratic Republic"));
        arrayList.add(new a("lb", "961", "Lebanon"));
        arrayList.add(new a("lc", "1", "Saint Lucia"));
        arrayList.add(new a("li", "423", "Liechtenstein"));
        arrayList.add(new a("lk", "94", "Sri Lanka"));
        arrayList.add(new a("lr", "231", "Liberia"));
        arrayList.add(new a("ls", "266", "Lesotho"));
        arrayList.add(new a("lt", "370", "Lithuania"));
        arrayList.add(new a("lu", "352", "Luxembourg"));
        arrayList.add(new a("lv", "371", "Latvia"));
        arrayList.add(new a("ly", "218", "Libya"));
        arrayList.add(new a("ma", "212", "Morocco"));
        arrayList.add(new a("mc", "377", "Monaco"));
        arrayList.add(new a("md", "373", "Moldova, Republic Of"));
        arrayList.add(new a("me", "382", "Montenegro"));
        arrayList.add(new a("mf", "590", "Saint Martin"));
        arrayList.add(new a("mg", "261", "Madagascar"));
        arrayList.add(new a("mh", "692", "Marshall Islands"));
        arrayList.add(new a("mk", "389", "Macedonia (FYROM)"));
        arrayList.add(new a("ml", "223", "Mali"));
        arrayList.add(new a("mm", "95", "Myanmar"));
        arrayList.add(new a("mn", "976", "Mongolia"));
        arrayList.add(new a("mo", "853", "Macau"));
        arrayList.add(new a("mp", "1", "Northern Mariana Islands"));
        arrayList.add(new a("mq", "596", "Martinique"));
        arrayList.add(new a("mr", "222", "Mauritania"));
        arrayList.add(new a("ms", "1", "Montserrat"));
        arrayList.add(new a("mt", "356", "Malta"));
        arrayList.add(new a("mu", "230", "Mauritius"));
        arrayList.add(new a("mv", "960", "Maldives"));
        arrayList.add(new a("mw", "265", "Malawi"));
        arrayList.add(new a("mx", "52", "Mexico"));
        arrayList.add(new a("my", "60", "Malaysia"));
        arrayList.add(new a("mz", "258", "Mozambique"));
        arrayList.add(new a("na", "264", "Namibia"));
        arrayList.add(new a("nc", "687", "New Caledonia"));
        arrayList.add(new a("ne", "227", "Niger"));
        arrayList.add(new a("nf", "672", "Norfolk Islands"));
        arrayList.add(new a("ng", "234", "Nigeria"));
        arrayList.add(new a("ni", "505", "Nicaragua"));
        arrayList.add(new a("nl", "31", "Netherlands"));
        arrayList.add(new a("no", "47", "Norway"));
        arrayList.add(new a("np", "977", "Nepal"));
        arrayList.add(new a("nr", "674", "Nauru"));
        arrayList.add(new a("nu", "683", "Niue"));
        arrayList.add(new a("nz", "64", "New Zealand"));
        arrayList.add(new a("om", "968", "Oman"));
        arrayList.add(new a("pa", "507", "Panama"));
        arrayList.add(new a("pe", "51", "Peru"));
        arrayList.add(new a("pf", "689", "French Polynesia"));
        arrayList.add(new a("pg", "675", "Papua New Guinea"));
        arrayList.add(new a("ph", "63", "Philippines"));
        arrayList.add(new a("pk", "92", "Pakistan"));
        arrayList.add(new a("pl", "48", "Poland"));
        arrayList.add(new a("pm", "508", "Saint Pierre And Miquelon"));
        arrayList.add(new a("pn", "870", "Pitcairn Islands"));
        arrayList.add(new a("pr", "1", "Puerto Rico"));
        arrayList.add(new a("ps", "970", "Palestine"));
        arrayList.add(new a("pt", "351", "Portugal"));
        arrayList.add(new a("pw", "680", "Palau"));
        arrayList.add(new a("py", "595", "Paraguay"));
        arrayList.add(new a("qa", "974", "Qatar"));
        arrayList.add(new a("re", "262", "Réunion"));
        arrayList.add(new a("ro", "40", "Romania"));
        arrayList.add(new a("rs", "381", "Serbia"));
        arrayList.add(new a("ru", "7", "Russian Federation"));
        arrayList.add(new a("rw", "250", "Rwanda"));
        arrayList.add(new a("sa", "966", "Saudi Arabia"));
        arrayList.add(new a("sb", "677", "Solomon Islands"));
        arrayList.add(new a("sc", "248", "Seychelles"));
        arrayList.add(new a("sd", "249", "Sudan"));
        arrayList.add(new a("se", "46", "Sweden"));
        arrayList.add(new a("sg", "65", "Singapore"));
        arrayList.add(new a("sh", "290", "Saint Helena, Ascension And Tristan Da Cunha"));
        arrayList.add(new a("si", "386", "Slovenia"));
        arrayList.add(new a("sk", "421", "Slovakia"));
        arrayList.add(new a("sl", "232", "Sierra Leone"));
        arrayList.add(new a("sm", "378", "San Marino"));
        arrayList.add(new a("sn", "221", "Senegal"));
        arrayList.add(new a("so", "252", "Somalia"));
        arrayList.add(new a("sr", "597", "Suriname"));
        arrayList.add(new a("ss", "211", "South Sudan"));
        arrayList.add(new a("st", "239", "Sao Tome And Principe"));
        arrayList.add(new a("sv", "503", "El Salvador"));
        arrayList.add(new a("sx", "1", "Sint Maarten"));
        arrayList.add(new a("sy", "963", "Syrian Arab Republic"));
        arrayList.add(new a("sz", "268", "Swaziland"));
        arrayList.add(new a("tc", "1", "Turks and Caicos Islands"));
        arrayList.add(new a("td", "235", "Chad"));
        arrayList.add(new a("tg", "228", "Togo"));
        arrayList.add(new a("th", "66", "Thailand"));
        arrayList.add(new a("tj", "992", "Tajikistan"));
        arrayList.add(new a("tk", "690", "Tokelau"));
        arrayList.add(new a("tl", "670", "Timor-leste"));
        arrayList.add(new a("tm", "993", "Turkmenistan"));
        arrayList.add(new a("tn", "216", "Tunisia"));
        arrayList.add(new a("to", "676", "Tonga"));
        arrayList.add(new a("tr", "90", "Turkey"));
        arrayList.add(new a("tt", "1", "Trinidad &amp; Tobago"));
        arrayList.add(new a("tv", "688", "Tuvalu"));
        arrayList.add(new a("tw", "886", "Taiwan"));
        arrayList.add(new a("tz", "255", "Tanzania, United Republic Of"));
        arrayList.add(new a("ua", "380", "Ukraine"));
        arrayList.add(new a("ug", "256", "Uganda"));
        arrayList.add(new a("us", "1", "United States"));
        arrayList.add(new a("uy", "598", "Uruguay"));
        arrayList.add(new a("uz", "998", "Uzbekistan"));
        arrayList.add(new a("va", "379", "Holy See (vatican City State)"));
        arrayList.add(new a("vc", "1", "Saint Vincent &amp; The Grenadines"));
        arrayList.add(new a("ve", "58", "Venezuela, Bolivarian Republic Of"));
        arrayList.add(new a("vg", "1", "British Virgin Islands"));
        arrayList.add(new a("vi", "1", "US Virgin Islands"));
        arrayList.add(new a("vn", "84", "Vietnam"));
        arrayList.add(new a("vu", "678", "Vanuatu"));
        arrayList.add(new a("wf", "681", "Wallis And Futuna"));
        arrayList.add(new a("ws", "685", "Samoa"));
        arrayList.add(new a("xk", "383", "Kosovo"));
        arrayList.add(new a("ye", "967", "Yemen"));
        arrayList.add(new a("yt", "262", "Mayotte"));
        arrayList.add(new a("za", "27", "South Africa"));
        arrayList.add(new a("zm", "260", "Zambia"));
        arrayList.add(new a("zw", "263", "Zimbabwe"));
        return arrayList;
    }

    public static ArrayList k(Context context, CountryCodePicker.Language language) {
        ArrayList arrayList;
        CountryCodePicker.Language language2 = f10615f;
        if (language2 == null || language != language2 || (arrayList = f10618j) == null || arrayList.size() == 0) {
            m(context, language);
        }
        return f10618j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(android.content.Context r8, com.hbb20.CountryCodePicker.Language r9) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hbb20.a.m(android.content.Context, com.hbb20.CountryCodePicker$Language):void");
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        return Collator.getInstance().compare(this.f10621c, aVar.f10621c);
    }

    public final boolean l(String str) {
        String lowerCase = str.toLowerCase();
        return a("Name", this.f10621c, lowerCase) || a("NameCode", this.f10619a, lowerCase) || a("PhoneCode", this.f10620b, lowerCase) || a("EnglishName", this.f10622d, lowerCase);
    }

    public final void n() {
        try {
            Log.d("Class Country", "Country->" + this.f10619a + p.f15541a + this.f10620b + p.f15541a + this.f10621c);
        } catch (NullPointerException unused) {
            Log.d("Class Country", "Null");
        }
    }

    public a(String str, String str2, String str3) {
        this.f10623e = -99;
        this.f10619a = str.toUpperCase(Locale.US);
        this.f10620b = str2;
        this.f10621c = str3;
        this.f10623e = -99;
    }
}
