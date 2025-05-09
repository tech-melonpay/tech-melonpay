package com.google.i18n.phonenumbers;

import B1.f;
import C.N;
import C.v;
import androidx.camera.core.n;
import com.google.i18n.phonenumbers.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import pa.C1124b;
import s3.b;
import u3.C1518a;
import v3.C1543a;
import w3.C1566a;
import z1.g;

/* loaded from: classes.dex */
public final class PhoneNumberUtil {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f10420h = Logger.getLogger(PhoneNumberUtil.class.getName());
    public static final Map<Integer, String> i;

    /* renamed from: j, reason: collision with root package name */
    public static final Map<Character, Character> f10421j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map<Character, Character> f10422k;

    /* renamed from: l, reason: collision with root package name */
    public static final Map<Character, Character> f10423l;

    /* renamed from: m, reason: collision with root package name */
    public static final Map<Character, Character> f10424m;

    /* renamed from: n, reason: collision with root package name */
    public static PhoneNumberUtil f10425n;

    /* renamed from: a, reason: collision with root package name */
    public final f f10426a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Integer, List<String>> f10427b;

    /* renamed from: c, reason: collision with root package name */
    public final N f10428c = new N(24, (byte) 0);

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f10429d = new HashSet(35);

    /* renamed from: e, reason: collision with root package name */
    public final a f10430e = new a();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f10431f = new HashSet(320);

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f10432g = new HashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PhoneNumberType {

        /* renamed from: a, reason: collision with root package name */
        public static final PhoneNumberType f10433a;

        /* renamed from: b, reason: collision with root package name */
        public static final PhoneNumberType f10434b;

        /* renamed from: c, reason: collision with root package name */
        public static final PhoneNumberType f10435c;

        /* renamed from: d, reason: collision with root package name */
        public static final PhoneNumberType f10436d;

        /* renamed from: e, reason: collision with root package name */
        public static final PhoneNumberType f10437e;

        /* renamed from: f, reason: collision with root package name */
        public static final PhoneNumberType f10438f;

        /* renamed from: g, reason: collision with root package name */
        public static final PhoneNumberType f10439g;

        /* renamed from: h, reason: collision with root package name */
        public static final PhoneNumberType f10440h;
        public static final PhoneNumberType i;

        /* renamed from: j, reason: collision with root package name */
        public static final PhoneNumberType f10441j;

        /* renamed from: k, reason: collision with root package name */
        public static final PhoneNumberType f10442k;

        /* renamed from: l, reason: collision with root package name */
        public static final PhoneNumberType f10443l;

        /* renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ PhoneNumberType[] f10444m;

        static {
            PhoneNumberType phoneNumberType = new PhoneNumberType("FIXED_LINE", 0);
            f10433a = phoneNumberType;
            PhoneNumberType phoneNumberType2 = new PhoneNumberType("MOBILE", 1);
            f10434b = phoneNumberType2;
            PhoneNumberType phoneNumberType3 = new PhoneNumberType("FIXED_LINE_OR_MOBILE", 2);
            f10435c = phoneNumberType3;
            PhoneNumberType phoneNumberType4 = new PhoneNumberType("TOLL_FREE", 3);
            f10436d = phoneNumberType4;
            PhoneNumberType phoneNumberType5 = new PhoneNumberType("PREMIUM_RATE", 4);
            f10437e = phoneNumberType5;
            PhoneNumberType phoneNumberType6 = new PhoneNumberType("SHARED_COST", 5);
            f10438f = phoneNumberType6;
            PhoneNumberType phoneNumberType7 = new PhoneNumberType("VOIP", 6);
            f10439g = phoneNumberType7;
            PhoneNumberType phoneNumberType8 = new PhoneNumberType("PERSONAL_NUMBER", 7);
            f10440h = phoneNumberType8;
            PhoneNumberType phoneNumberType9 = new PhoneNumberType("PAGER", 8);
            i = phoneNumberType9;
            PhoneNumberType phoneNumberType10 = new PhoneNumberType("UAN", 9);
            f10441j = phoneNumberType10;
            PhoneNumberType phoneNumberType11 = new PhoneNumberType("VOICEMAIL", 10);
            f10442k = phoneNumberType11;
            PhoneNumberType phoneNumberType12 = new PhoneNumberType("UNKNOWN", 11);
            f10443l = phoneNumberType12;
            f10444m = new PhoneNumberType[]{phoneNumberType, phoneNumberType2, phoneNumberType3, phoneNumberType4, phoneNumberType5, phoneNumberType6, phoneNumberType7, phoneNumberType8, phoneNumberType9, phoneNumberType10, phoneNumberType11, phoneNumberType12};
        }

        public PhoneNumberType() {
            throw null;
        }

        public static PhoneNumberType valueOf(String str) {
            return (PhoneNumberType) Enum.valueOf(PhoneNumberType.class, str);
        }

        public static PhoneNumberType[] values() {
            return (PhoneNumberType[]) f10444m.clone();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        i = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        Collections.unmodifiableSet(hashSet3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        b.q('A', hashMap3, '2', 'B', '2');
        b.q('C', hashMap3, '2', 'D', '3');
        b.q('E', hashMap3, '3', 'F', '3');
        b.q('G', hashMap3, '4', 'H', '4');
        b.q('I', hashMap3, '4', 'J', '5');
        b.q('K', hashMap3, '5', Matrix.MATRIX_TYPE_RANDOM_LT, '5');
        b.q('M', hashMap3, '6', 'N', '6');
        b.q('O', hashMap3, '6', 'P', '7');
        b.q('Q', hashMap3, '7', Matrix.MATRIX_TYPE_RANDOM_REGULAR, '7');
        b.q('S', hashMap3, '7', 'T', '8');
        b.q(Matrix.MATRIX_TYPE_RANDOM_UT, hashMap3, '8', 'V', '8');
        b.q('W', hashMap3, '9', 'X', '9');
        b.q('Y', hashMap3, '9', Matrix.MATRIX_TYPE_ZERO, '9');
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        f10422k = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        f10423l = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        f10421j = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            hashMap6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            hashMap6.put(ch, ch);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put(b.h('.', hashMap6, b.h(' ', hashMap6, b.h(' ', hashMap6, b.h(' ', hashMap6, b.h('/', hashMap6, b.h('/', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, '-', (char) 65293), (char) 8208), (char) 8209), (char) 8210), (char) 8211), (char) 8212), (char) 8213), (char) 8722), '/'), (char) 65295), ' '), (char) 12288), (char) 8288), '.'), (char) 65294), '.');
        f10424m = Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb2 = new StringBuilder();
        Map<Character, Character> map = f10422k;
        sb2.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb2.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb3 = sb2.toString();
        Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        Pattern.compile("(\\p{Nd})");
        Pattern.compile("[+＋\\p{Nd}]");
        Pattern.compile("[\\\\/] *x");
        Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String a10 = n.a("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", sb3, "\\p{Nd}]*");
        String a11 = a(true);
        a(false);
        Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String n10 = v.n(sb3, "\\p{Nd}");
        Pattern.compile("^(" + b.l("[", n10, "]+((\\-)*[", n10, "])*") + "\\.)*" + b.l("[", sb3, "]+((\\-)*[", n10, "])*") + "\\.?$");
        StringBuilder sb4 = new StringBuilder("(?:");
        sb4.append(a11);
        sb4.append(")$");
        Pattern.compile(sb4.toString(), 66);
        Pattern.compile(a10 + "(?:" + a11 + ")?", 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        f10425n = null;
    }

    public PhoneNumberUtil(f fVar, HashMap hashMap) {
        this.f10426a = fVar;
        this.f10427b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f10432g.add(entry.getKey());
            } else {
                this.f10431f.addAll(list);
            }
        }
        if (this.f10431f.remove("001")) {
            f10420h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f10429d.addAll((Collection) hashMap.get(1));
    }

    public static String a(boolean z10) {
        String str = ";ext=" + b(20);
        String str2 = "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + b(20) + "#?";
        String str3 = "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + b(9) + "#?";
        String str4 = "[- ]+" + b(6) + "#";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("|");
        sb2.append(str2);
        sb2.append("|");
        sb2.append(str3);
        String n10 = androidx.camera.core.impl.utils.a.n(sb2, "|", str4);
        if (!z10) {
            return n10;
        }
        return n10 + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + b(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + b(9) + "#?");
    }

    public static String b(int i9) {
        return b.i("(\\p{Nd}{1,", i9, "})");
    }

    public static synchronized PhoneNumberUtil d() {
        PhoneNumberUtil phoneNumberUtil;
        synchronized (PhoneNumberUtil.class) {
            if (f10425n == null) {
                C1518a c1518a = C1518a.f30157d;
                C1543a c1543a = c1518a.f30159b;
                if (c1543a == null) {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
                PhoneNumberUtil phoneNumberUtil2 = new PhoneNumberUtil(new f(c1518a.f30160c, c1543a, c1518a.f30158a), C1124b.A());
                synchronized (PhoneNumberUtil.class) {
                    f10425n = phoneNumberUtil2;
                }
            }
            phoneNumberUtil = f10425n;
        }
        return phoneNumberUtil;
    }

    public static String g(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        StringBuilder sb2 = new StringBuilder();
        phonenumber$PhoneNumber.getClass();
        sb2.append(phonenumber$PhoneNumber.f10507c);
        return sb2.toString();
    }

    public static void k(int i9, StringBuilder sb2) {
        sb2.insert(0, i9).insert(0, '+');
    }

    public final String c(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        if (phonenumber$PhoneNumber.f10507c == 0) {
            String str = phonenumber$PhoneNumber.f10510f;
            if (str.length() > 0 || !phonenumber$PhoneNumber.f10505a) {
                return str;
            }
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.setLength(0);
        int i9 = phonenumber$PhoneNumber.f10506b;
        sb2.append(g(phonenumber$PhoneNumber));
        k(i9, sb2);
        return sb2.toString();
    }

    public final Phonemetadata$PhoneMetadata e(String str) {
        if (str == null || !this.f10431f.contains(str)) {
            return null;
        }
        f fVar = this.f10426a;
        fVar.getClass();
        if (!(!str.equals("001"))) {
            throw new IllegalArgumentException(str.concat(" region code is a non-geo entity"));
        }
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = (Phonemetadata$PhoneMetadata) ((C1566a) ((g) fVar.f230c).b(((m3.b) fVar.f229b).b(str))).f30818b.f30819a.get(str);
        String concat = "Missing metadata for region code ".concat(str);
        if (phonemetadata$PhoneMetadata != null) {
            return phonemetadata$PhoneMetadata;
        }
        throw new MissingMetadataException(concat);
    }

    public final Phonemetadata$PhoneMetadata f(int i9, String str) {
        if (!"001".equals(str)) {
            return e(str);
        }
        if (!this.f10432g.contains(Integer.valueOf(i9))) {
            return null;
        }
        f fVar = this.f10426a;
        fVar.getClass();
        List list = (List) C1124b.A().get(Integer.valueOf(i9));
        if (list != null && !list.contains("001")) {
            throw new IllegalArgumentException(i9 + " calling code belongs to a geo entity");
        }
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = (Phonemetadata$PhoneMetadata) ((C1566a) ((g) fVar.f230c).b(((m3.b) fVar.f229b).b(Integer.valueOf(i9)))).f30817a.f30819a.get(Integer.valueOf(i9));
        String g10 = com.google.android.gms.measurement.internal.a.g(i9, "Missing metadata for country code ");
        if (phonemetadata$PhoneMetadata != null) {
            return phonemetadata$PhoneMetadata;
        }
        throw new MissingMetadataException(g10);
    }

    public final PhoneNumberType h(String str, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        boolean i9 = i(str, phonemetadata$PhoneMetadata.f10473b);
        PhoneNumberType phoneNumberType = PhoneNumberType.f10443l;
        if (!i9) {
            return phoneNumberType;
        }
        if (i(str, phonemetadata$PhoneMetadata.f10481j)) {
            return PhoneNumberType.f10437e;
        }
        if (i(str, phonemetadata$PhoneMetadata.f10480h)) {
            return PhoneNumberType.f10436d;
        }
        if (i(str, phonemetadata$PhoneMetadata.f10483l)) {
            return PhoneNumberType.f10438f;
        }
        if (i(str, phonemetadata$PhoneMetadata.f10487p)) {
            return PhoneNumberType.f10439g;
        }
        if (i(str, phonemetadata$PhoneMetadata.f10485n)) {
            return PhoneNumberType.f10440h;
        }
        if (i(str, phonemetadata$PhoneMetadata.f10489r)) {
            return PhoneNumberType.i;
        }
        if (i(str, phonemetadata$PhoneMetadata.f10491t)) {
            return PhoneNumberType.f10441j;
        }
        if (i(str, phonemetadata$PhoneMetadata.f10495x)) {
            return PhoneNumberType.f10442k;
        }
        if (!i(str, phonemetadata$PhoneMetadata.f10476d)) {
            return (phonemetadata$PhoneMetadata.V || !i(str, phonemetadata$PhoneMetadata.f10478f)) ? phoneNumberType : PhoneNumberType.f10434b;
        }
        boolean z10 = phonemetadata$PhoneMetadata.V;
        PhoneNumberType phoneNumberType2 = PhoneNumberType.f10435c;
        return z10 ? phoneNumberType2 : i(str, phonemetadata$PhoneMetadata.f10478f) ? phoneNumberType2 : PhoneNumberType.f10433a;
    }

    public final boolean i(String str, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        int length = str.length();
        ArrayList arrayList = phonemetadata$PhoneNumberDesc.f10501c;
        if (arrayList.size() > 0 && !arrayList.contains(Integer.valueOf(length))) {
            return false;
        }
        N n10 = this.f10428c;
        n10.getClass();
        String str2 = phonemetadata$PhoneNumberDesc.f10500b;
        if (str2.length() == 0) {
            return false;
        }
        Matcher matcher = ((a) n10.f535b).a(str2).matcher(str);
        if (matcher.lookingAt()) {
            return matcher.matches();
        }
        return false;
    }

    public final boolean j(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        int i9 = phonenumber$PhoneNumber.f10506b;
        List<String> list = this.f10427b.get(Integer.valueOf(i9));
        PhoneNumberType phoneNumberType = PhoneNumberType.f10443l;
        String str = null;
        if (list != null) {
            if (list.size() != 1) {
                String g10 = g(phonenumber$PhoneNumber);
                for (String str2 : list) {
                    Phonemetadata$PhoneMetadata e10 = e(str2);
                    if (!e10.f10470Z) {
                        if (h(g10, e10) != phoneNumberType) {
                            str = str2;
                            break;
                        }
                    } else {
                        if (this.f10430e.a(e10.f10472a0).matcher(g10).lookingAt()) {
                            str = str2;
                            break;
                        }
                    }
                }
            } else {
                str = list.get(0);
            }
        } else {
            f10420h.log(Level.INFO, b.i("Missing/invalid country_code (", i9, ")"));
        }
        int i10 = phonenumber$PhoneNumber.f10506b;
        Phonemetadata$PhoneMetadata f10 = f(i10, str);
        if (f10 == null) {
            return false;
        }
        if (!"001".equals(str)) {
            Phonemetadata$PhoneMetadata e11 = e(str);
            if (e11 == null) {
                throw new IllegalArgumentException(b.j("Invalid region code: ", str));
            }
            if (i10 != e11.f10462J) {
                return false;
            }
        }
        return h(g(phonenumber$PhoneNumber), f10) != phoneNumberType;
    }
}
