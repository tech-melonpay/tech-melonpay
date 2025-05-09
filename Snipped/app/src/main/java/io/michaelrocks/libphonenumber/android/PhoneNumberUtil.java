package io.michaelrocks.libphonenumber.android;

import C.N;
import android.content.Context;
import androidx.camera.core.n;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.internal.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import s3.b;
import z1.g;

/* loaded from: classes2.dex */
public final class PhoneNumberUtil {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f21543h = Logger.getLogger(PhoneNumberUtil.class.getName());
    public static final Map<Integer, String> i;

    /* renamed from: j, reason: collision with root package name */
    public static final Map<Character, Character> f21544j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map<Character, Character> f21545k;

    /* renamed from: l, reason: collision with root package name */
    public static final Map<Character, Character> f21546l;

    /* renamed from: m, reason: collision with root package name */
    public static final Map<Character, Character> f21547m;

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f21548n;

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f21549o;

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f21550p;

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f21551q;

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f21552r;

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f21553s;

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f21554t;

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f21555u;

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f21556v;

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f21557w;

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f21558x;

    /* renamed from: a, reason: collision with root package name */
    public final g f21559a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Integer, List<String>> f21560b;

    /* renamed from: c, reason: collision with root package name */
    public final N f21561c = new N(5, (byte) 0);

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f21562d = new HashSet(35);

    /* renamed from: e, reason: collision with root package name */
    public final a f21563e = new a(100);

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f21564f = new HashSet(320);

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f21565g = new HashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PhoneNumberFormat {

        /* renamed from: a, reason: collision with root package name */
        public static final PhoneNumberFormat f21566a;

        /* renamed from: b, reason: collision with root package name */
        public static final PhoneNumberFormat f21567b;

        /* renamed from: c, reason: collision with root package name */
        public static final PhoneNumberFormat f21568c;

        /* renamed from: d, reason: collision with root package name */
        public static final PhoneNumberFormat f21569d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ PhoneNumberFormat[] f21570e;

        static {
            PhoneNumberFormat phoneNumberFormat = new PhoneNumberFormat("E164", 0);
            f21566a = phoneNumberFormat;
            PhoneNumberFormat phoneNumberFormat2 = new PhoneNumberFormat("INTERNATIONAL", 1);
            f21567b = phoneNumberFormat2;
            PhoneNumberFormat phoneNumberFormat3 = new PhoneNumberFormat("NATIONAL", 2);
            f21568c = phoneNumberFormat3;
            PhoneNumberFormat phoneNumberFormat4 = new PhoneNumberFormat("RFC3966", 3);
            f21569d = phoneNumberFormat4;
            f21570e = new PhoneNumberFormat[]{phoneNumberFormat, phoneNumberFormat2, phoneNumberFormat3, phoneNumberFormat4};
        }

        public PhoneNumberFormat() {
            throw null;
        }

        public static PhoneNumberFormat valueOf(String str) {
            return (PhoneNumberFormat) Enum.valueOf(PhoneNumberFormat.class, str);
        }

        public static PhoneNumberFormat[] values() {
            return (PhoneNumberFormat[]) f21570e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PhoneNumberType {

        /* renamed from: a, reason: collision with root package name */
        public static final PhoneNumberType f21571a;

        /* renamed from: b, reason: collision with root package name */
        public static final PhoneNumberType f21572b;

        /* renamed from: c, reason: collision with root package name */
        public static final PhoneNumberType f21573c;

        /* renamed from: d, reason: collision with root package name */
        public static final PhoneNumberType f21574d;

        /* renamed from: e, reason: collision with root package name */
        public static final PhoneNumberType f21575e;

        /* renamed from: f, reason: collision with root package name */
        public static final PhoneNumberType f21576f;

        /* renamed from: g, reason: collision with root package name */
        public static final PhoneNumberType f21577g;

        /* renamed from: h, reason: collision with root package name */
        public static final PhoneNumberType f21578h;
        public static final PhoneNumberType i;

        /* renamed from: j, reason: collision with root package name */
        public static final PhoneNumberType f21579j;

        /* renamed from: k, reason: collision with root package name */
        public static final PhoneNumberType f21580k;

        /* renamed from: l, reason: collision with root package name */
        public static final PhoneNumberType f21581l;

        /* renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ PhoneNumberType[] f21582m;

        static {
            PhoneNumberType phoneNumberType = new PhoneNumberType("FIXED_LINE", 0);
            f21571a = phoneNumberType;
            PhoneNumberType phoneNumberType2 = new PhoneNumberType("MOBILE", 1);
            f21572b = phoneNumberType2;
            PhoneNumberType phoneNumberType3 = new PhoneNumberType("FIXED_LINE_OR_MOBILE", 2);
            f21573c = phoneNumberType3;
            PhoneNumberType phoneNumberType4 = new PhoneNumberType("TOLL_FREE", 3);
            f21574d = phoneNumberType4;
            PhoneNumberType phoneNumberType5 = new PhoneNumberType("PREMIUM_RATE", 4);
            f21575e = phoneNumberType5;
            PhoneNumberType phoneNumberType6 = new PhoneNumberType("SHARED_COST", 5);
            f21576f = phoneNumberType6;
            PhoneNumberType phoneNumberType7 = new PhoneNumberType("VOIP", 6);
            f21577g = phoneNumberType7;
            PhoneNumberType phoneNumberType8 = new PhoneNumberType("PERSONAL_NUMBER", 7);
            f21578h = phoneNumberType8;
            PhoneNumberType phoneNumberType9 = new PhoneNumberType("PAGER", 8);
            i = phoneNumberType9;
            PhoneNumberType phoneNumberType10 = new PhoneNumberType("UAN", 9);
            f21579j = phoneNumberType10;
            PhoneNumberType phoneNumberType11 = new PhoneNumberType("VOICEMAIL", 10);
            f21580k = phoneNumberType11;
            PhoneNumberType phoneNumberType12 = new PhoneNumberType("UNKNOWN", 11);
            f21581l = phoneNumberType12;
            f21582m = new PhoneNumberType[]{phoneNumberType, phoneNumberType2, phoneNumberType3, phoneNumberType4, phoneNumberType5, phoneNumberType6, phoneNumberType7, phoneNumberType8, phoneNumberType9, phoneNumberType10, phoneNumberType11, phoneNumberType12};
        }

        public PhoneNumberType() {
            throw null;
        }

        public static PhoneNumberType valueOf(String str) {
            return (PhoneNumberType) Enum.valueOf(PhoneNumberType.class, str);
        }

        public static PhoneNumberType[] values() {
            return (PhoneNumberType[]) f21582m.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ValidationResult {

        /* renamed from: a, reason: collision with root package name */
        public static final ValidationResult f21583a;

        /* renamed from: b, reason: collision with root package name */
        public static final ValidationResult f21584b;

        /* renamed from: c, reason: collision with root package name */
        public static final ValidationResult f21585c;

        /* renamed from: d, reason: collision with root package name */
        public static final ValidationResult f21586d;

        /* renamed from: e, reason: collision with root package name */
        public static final ValidationResult f21587e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ValidationResult[] f21588f;

        static {
            ValidationResult validationResult = new ValidationResult("IS_POSSIBLE", 0);
            f21583a = validationResult;
            ValidationResult validationResult2 = new ValidationResult("IS_POSSIBLE_LOCAL_ONLY", 1);
            f21584b = validationResult2;
            ValidationResult validationResult3 = new ValidationResult("INVALID_COUNTRY_CODE", 2);
            ValidationResult validationResult4 = new ValidationResult("TOO_SHORT", 3);
            f21585c = validationResult4;
            ValidationResult validationResult5 = new ValidationResult("INVALID_LENGTH", 4);
            f21586d = validationResult5;
            ValidationResult validationResult6 = new ValidationResult("TOO_LONG", 5);
            f21587e = validationResult6;
            f21588f = new ValidationResult[]{validationResult, validationResult2, validationResult3, validationResult4, validationResult5, validationResult6};
        }

        public ValidationResult() {
            throw null;
        }

        public static ValidationResult valueOf(String str) {
            return (ValidationResult) Enum.valueOf(ValidationResult.class, str);
        }

        public static ValidationResult[] values() {
            return (ValidationResult[]) f21588f.clone();
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
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
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
        f21545k = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        f21546l = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        f21544j = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            hashMap6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            hashMap6.put(ch, ch);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put(b.h('.', hashMap6, b.h(' ', hashMap6, b.h(' ', hashMap6, b.h(' ', hashMap6, b.h('/', hashMap6, b.h('/', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, b.h('-', hashMap6, '-', (char) 65293), (char) 8208), (char) 8209), (char) 8210), (char) 8211), (char) 8212), (char) 8213), (char) 8722), '/'), (char) 65295), ' '), (char) 12288), (char) 8288), '.'), (char) 65294), '.');
        f21547m = Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb2 = new StringBuilder();
        Map<Character, Character> map = f21545k;
        sb2.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb2.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb3 = sb2.toString();
        f21548n = Pattern.compile("[+＋]+");
        f21549o = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        f21550p = Pattern.compile("(\\p{Nd})");
        f21551q = Pattern.compile("[+＋\\p{Nd}]");
        f21552r = Pattern.compile("[\\\\/] *x");
        f21553s = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f21554t = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String a10 = n.a("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", sb3, "\\p{Nd}]*");
        f21555u = Pattern.compile("(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[,;xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)$", 66);
        f21556v = Pattern.compile(a10 + "(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[,;xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)?", 66);
        Pattern.compile("(\\D+)");
        f21557w = Pattern.compile("(\\$\\d)");
        f21558x = Pattern.compile("\\(?\\$1\\)?");
    }

    public PhoneNumberUtil(g gVar, HashMap hashMap) {
        this.f21559a = gVar;
        this.f21560b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f21565g.add((Integer) entry.getKey());
            } else {
                this.f21564f.addAll(list);
            }
        }
        if (this.f21564f.remove("001")) {
            f21543h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f21562d.addAll((Collection) hashMap.get(1));
    }

    public static PhoneNumberUtil a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context could not be null.");
        }
        N n10 = new N(context.getAssets(), 4);
        g gVar = new g();
        gVar.f31254c = new ConcurrentHashMap();
        gVar.f31255d = new ConcurrentHashMap();
        gVar.f31252a = "/io/michaelrocks/libphonenumber/android/data/PhoneNumberMetadataProto";
        gVar.f31253b = new S8.b(n10);
        return new PhoneNumberUtil(gVar, Ja.a.l());
    }

    public static String f(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        int i9;
        StringBuilder sb2 = new StringBuilder();
        if (phonenumber$PhoneNumber.f21655f && (i9 = phonenumber$PhoneNumber.f21657h) > 0) {
            char[] cArr = new char[i9];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(phonenumber$PhoneNumber.f21651b);
        return sb2.toString();
    }

    public static Phonemetadata$PhoneNumberDesc g(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberType phoneNumberType) {
        switch (phoneNumberType.ordinal()) {
            case 0:
            case 2:
                return phonemetadata$PhoneMetadata.f21621d;
            case 1:
                return phonemetadata$PhoneMetadata.f21623f;
            case 3:
                return phonemetadata$PhoneMetadata.f21625h;
            case 4:
                return phonemetadata$PhoneMetadata.f21626j;
            case 5:
                return phonemetadata$PhoneMetadata.f21628l;
            case 6:
                return phonemetadata$PhoneMetadata.f21632p;
            case 7:
                return phonemetadata$PhoneMetadata.f21630n;
            case 8:
                return phonemetadata$PhoneMetadata.f21634r;
            case 9:
                return phonemetadata$PhoneMetadata.f21636t;
            case 10:
                return phonemetadata$PhoneMetadata.f21640x;
            default:
                return phonemetadata$PhoneMetadata.f21617b;
        }
    }

    public static void o(StringBuilder sb2) {
        if (f21554t.matcher(sb2).matches()) {
            sb2.replace(0, sb2.length(), q(sb2, f21546l));
        } else {
            sb2.replace(0, sb2.length(), p(sb2));
        }
    }

    public static String p(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            int digit = Character.digit(charSequence.charAt(i9), 10);
            if (digit != -1) {
                sb2.append(digit);
            }
        }
        return sb2.toString();
    }

    public static String q(CharSequence charSequence, Map map) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i9))));
            if (ch != null) {
                sb2.append(ch);
            }
        }
        return sb2.toString();
    }

    public static void s(int i9, PhoneNumberFormat phoneNumberFormat, StringBuilder sb2) {
        int ordinal = phoneNumberFormat.ordinal();
        if (ordinal == 0) {
            sb2.insert(0, i9).insert(0, '+');
        } else if (ordinal == 1) {
            sb2.insert(0, " ").insert(0, i9).insert(0, '+');
        } else {
            if (ordinal != 3) {
                return;
            }
            sb2.insert(0, "-").insert(0, i9).insert(0, '+').insert(0, "tel:");
        }
    }

    public static ValidationResult t(StringBuilder sb2, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberType phoneNumberType) {
        Phonemetadata$PhoneNumberDesc g10 = g(phonemetadata$PhoneMetadata, phoneNumberType);
        ArrayList arrayList = g10.f21646c.isEmpty() ? phonemetadata$PhoneMetadata.f21617b.f21646c : g10.f21646c;
        ArrayList arrayList2 = g10.f21647d;
        if (phoneNumberType == PhoneNumberType.f21573c) {
            Phonemetadata$PhoneNumberDesc g11 = g(phonemetadata$PhoneMetadata, PhoneNumberType.f21571a);
            boolean z10 = (g11.f21646c.size() == 1 && ((Integer) g11.f21646c.get(0)).intValue() == -1) ? false : true;
            PhoneNumberType phoneNumberType2 = PhoneNumberType.f21572b;
            if (!z10) {
                return t(sb2, phonemetadata$PhoneMetadata, phoneNumberType2);
            }
            Phonemetadata$PhoneNumberDesc g12 = g(phonemetadata$PhoneMetadata, phoneNumberType2);
            if (g12.f21646c.size() != 1 || ((Integer) g12.f21646c.get(0)).intValue() != -1) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList arrayList4 = g12.f21646c;
                if (arrayList4.size() == 0) {
                    arrayList4 = phonemetadata$PhoneMetadata.f21617b.f21646c;
                }
                arrayList3.addAll(arrayList4);
                Collections.sort(arrayList3);
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList5 = g12.f21647d;
                if (isEmpty) {
                    arrayList2 = arrayList5;
                } else {
                    ArrayList arrayList6 = new ArrayList(arrayList2);
                    arrayList6.addAll(arrayList5);
                    Collections.sort(arrayList6);
                    arrayList2 = arrayList6;
                }
                arrayList = arrayList3;
            }
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        ValidationResult validationResult = ValidationResult.f21586d;
        if (intValue == -1) {
            return validationResult;
        }
        int length = sb2.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return ValidationResult.f21584b;
        }
        int intValue2 = ((Integer) arrayList.get(0)).intValue();
        ValidationResult validationResult2 = ValidationResult.f21583a;
        return intValue2 == length ? validationResult2 : intValue2 > length ? ValidationResult.f21585c : ((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length ? ValidationResult.f21587e : arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length)) ? validationResult2 : validationResult;
    }

    public final int b(StringBuilder sb2, StringBuilder sb3) {
        if (sb2.length() != 0 && sb2.charAt(0) != '0') {
            int length = sb2.length();
            for (int i9 = 1; i9 <= 3 && i9 <= length; i9++) {
                int parseInt = Integer.parseInt(sb2.substring(0, i9));
                if (this.f21560b.containsKey(Integer.valueOf(parseInt))) {
                    sb3.append(sb2.substring(i9));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    public final String c(Phonenumber$PhoneNumber phonenumber$PhoneNumber, PhoneNumberFormat phoneNumberFormat) {
        a aVar;
        Phonemetadata$NumberFormat phonemetadata$NumberFormat;
        long j10 = phonenumber$PhoneNumber.f21651b;
        StringBuilder sb2 = new StringBuilder(20);
        sb2.setLength(0);
        int i9 = phonenumber$PhoneNumber.f21650a;
        String f10 = f(phonenumber$PhoneNumber);
        PhoneNumberFormat phoneNumberFormat2 = PhoneNumberFormat.f21566a;
        if (phoneNumberFormat == phoneNumberFormat2) {
            sb2.append(f10);
            s(i9, phoneNumberFormat2, sb2);
        } else {
            if (this.f21560b.containsKey(Integer.valueOf(i9))) {
                String i10 = i(i9);
                Phonemetadata$PhoneMetadata d10 = "001".equals(i10) ? d(i9) : e(i10);
                int size = d10.X.size();
                PhoneNumberFormat phoneNumberFormat3 = PhoneNumberFormat.f21568c;
                Iterator it = ((size == 0 || phoneNumberFormat == phoneNumberFormat3) ? d10.W : d10.X).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    aVar = this.f21563e;
                    if (!hasNext) {
                        phonemetadata$NumberFormat = null;
                        break;
                    }
                    phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
                    int size2 = phonemetadata$NumberFormat.f21591c.size();
                    if (size2 != 0) {
                        if (!aVar.a((String) phonemetadata$NumberFormat.f21591c.get(size2 - 1)).matcher(f10).lookingAt()) {
                            continue;
                        }
                    }
                    if (aVar.a(phonemetadata$NumberFormat.f21589a).matcher(f10).matches()) {
                        break;
                    }
                }
                PhoneNumberFormat phoneNumberFormat4 = PhoneNumberFormat.f21569d;
                if (phonemetadata$NumberFormat != null) {
                    String str = phonemetadata$NumberFormat.f21590b;
                    Matcher matcher = aVar.a(phonemetadata$NumberFormat.f21589a).matcher(f10);
                    String str2 = phonemetadata$NumberFormat.f21593e;
                    f10 = (phoneNumberFormat != phoneNumberFormat3 || str2 == null || str2.length() <= 0) ? matcher.replaceAll(str) : matcher.replaceAll(f21557w.matcher(str).replaceFirst(str2));
                    if (phoneNumberFormat == phoneNumberFormat4) {
                        Matcher matcher2 = f21549o.matcher(f10);
                        if (matcher2.lookingAt()) {
                            f10 = matcher2.replaceFirst("");
                        }
                        f10 = matcher2.reset(f10).replaceAll("-");
                    }
                }
                sb2.append(f10);
                if (phonenumber$PhoneNumber.f21652c && phonenumber$PhoneNumber.f21653d.length() > 0) {
                    if (phoneNumberFormat == phoneNumberFormat4) {
                        sb2.append(";ext=");
                        sb2.append(phonenumber$PhoneNumber.f21653d);
                    } else if (d10.f21612P) {
                        sb2.append(d10.f21613Q);
                        sb2.append(phonenumber$PhoneNumber.f21653d);
                    } else {
                        sb2.append(" ext. ");
                        sb2.append(phonenumber$PhoneNumber.f21653d);
                    }
                }
                s(i9, phoneNumberFormat, sb2);
            } else {
                sb2.append(f10);
            }
        }
        return sb2.toString();
    }

    public final Phonemetadata$PhoneMetadata d(int i9) {
        if (!this.f21560b.containsKey(Integer.valueOf(i9))) {
            return null;
        }
        g gVar = this.f21559a;
        gVar.getClass();
        List list = (List) Ja.a.l().get(Integer.valueOf(i9));
        if (list.size() != 1 || !"001".equals(list.get(0))) {
            return null;
        }
        return ((S8.b) gVar.f31253b).a(Integer.valueOf(i9), (ConcurrentHashMap) gVar.f31255d, (String) gVar.f31252a);
    }

    public final Phonemetadata$PhoneMetadata e(String str) {
        if (!l(str)) {
            return null;
        }
        g gVar = this.f21559a;
        return ((S8.b) gVar.f31253b).a(str, (ConcurrentHashMap) gVar.f31254c, (String) gVar.f31252a);
    }

    public final PhoneNumberType h(String str, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        boolean j10 = j(str, phonemetadata$PhoneMetadata.f21617b);
        PhoneNumberType phoneNumberType = PhoneNumberType.f21581l;
        if (!j10) {
            return phoneNumberType;
        }
        if (j(str, phonemetadata$PhoneMetadata.f21626j)) {
            return PhoneNumberType.f21575e;
        }
        if (j(str, phonemetadata$PhoneMetadata.f21625h)) {
            return PhoneNumberType.f21574d;
        }
        if (j(str, phonemetadata$PhoneMetadata.f21628l)) {
            return PhoneNumberType.f21576f;
        }
        if (j(str, phonemetadata$PhoneMetadata.f21632p)) {
            return PhoneNumberType.f21577g;
        }
        if (j(str, phonemetadata$PhoneMetadata.f21630n)) {
            return PhoneNumberType.f21578h;
        }
        if (j(str, phonemetadata$PhoneMetadata.f21634r)) {
            return PhoneNumberType.i;
        }
        if (j(str, phonemetadata$PhoneMetadata.f21636t)) {
            return PhoneNumberType.f21579j;
        }
        if (j(str, phonemetadata$PhoneMetadata.f21640x)) {
            return PhoneNumberType.f21580k;
        }
        if (!j(str, phonemetadata$PhoneMetadata.f21621d)) {
            return (phonemetadata$PhoneMetadata.V || !j(str, phonemetadata$PhoneMetadata.f21623f)) ? phoneNumberType : PhoneNumberType.f21572b;
        }
        boolean z10 = phonemetadata$PhoneMetadata.V;
        PhoneNumberType phoneNumberType2 = PhoneNumberType.f21573c;
        return z10 ? phoneNumberType2 : j(str, phonemetadata$PhoneMetadata.f21623f) ? phoneNumberType2 : PhoneNumberType.f21571a;
    }

    public final String i(int i9) {
        List<String> list = this.f21560b.get(Integer.valueOf(i9));
        return list == null ? "ZZ" : list.get(0);
    }

    public final boolean j(String str, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        int length = str.length();
        ArrayList arrayList = phonemetadata$PhoneNumberDesc.f21646c;
        if (arrayList.size() <= 0 || arrayList.contains(Integer.valueOf(length))) {
            return this.f21561c.l(str, phonemetadata$PhoneNumberDesc);
        }
        return false;
    }

    public final boolean k(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        int i9 = phonenumber$PhoneNumber.f21650a;
        List<String> list = this.f21560b.get(Integer.valueOf(i9));
        PhoneNumberType phoneNumberType = PhoneNumberType.f21581l;
        String str = null;
        if (list != null) {
            if (list.size() != 1) {
                String f10 = f(phonenumber$PhoneNumber);
                for (String str2 : list) {
                    Phonemetadata$PhoneMetadata e10 = e(str2);
                    if (!e10.f21614Z) {
                        if (h(f10, e10) != phoneNumberType) {
                            str = str2;
                            break;
                        }
                    } else {
                        if (this.f21563e.a(e10.f21616a0).matcher(f10).lookingAt()) {
                            str = str2;
                            break;
                        }
                    }
                }
            } else {
                str = list.get(0);
            }
        } else {
            f21543h.log(Level.INFO, b.i("Missing/invalid country_code (", i9, ")"));
        }
        int i10 = phonenumber$PhoneNumber.f21650a;
        Phonemetadata$PhoneMetadata d10 = "001".equals(str) ? d(i10) : e(str);
        if (d10 == null) {
            return false;
        }
        if (!"001".equals(str)) {
            Phonemetadata$PhoneMetadata e11 = e(str);
            if (e11 == null) {
                throw new IllegalArgumentException(b.j("Invalid region code: ", str));
            }
            if (i10 != e11.f21606J) {
                return false;
            }
        }
        return h(f(phonenumber$PhoneNumber), d10) != phoneNumberType;
    }

    public final boolean l(String str) {
        return str != null && this.f21564f.contains(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(java.lang.CharSequence r7, io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata r8, java.lang.StringBuilder r9, io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber r10) {
        /*
            r6 = this;
            int r0 = r7.length()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            if (r8 == 0) goto L12
            java.lang.String r7 = r8.f21607K
            goto L14
        L12:
            java.lang.String r7 = "NonMatch"
        L14:
            int r2 = r0.length()
            io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber$CountryCodeSource r3 = io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber.CountryCodeSource.f21662c
            if (r2 != 0) goto L1e
        L1c:
            r7 = r3
            goto L75
        L1e:
            java.util.regex.Pattern r2 = io.michaelrocks.libphonenumber.android.PhoneNumberUtil.f21548n
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r4 = r2.lookingAt()
            if (r4 == 0) goto L37
            int r7 = r2.end()
            r0.delete(r1, r7)
            o(r0)
            io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber$CountryCodeSource r7 = io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber.CountryCodeSource.f21660a
            goto L75
        L37:
            io.michaelrocks.libphonenumber.android.internal.a r2 = r6.f21563e
            java.util.regex.Pattern r7 = r2.a(r7)
            o(r0)
            java.util.regex.Matcher r7 = r7.matcher(r0)
            boolean r2 = r7.lookingAt()
            if (r2 == 0) goto L1c
            int r7 = r7.end()
            java.lang.String r2 = r0.substring(r7)
            java.util.regex.Pattern r4 = io.michaelrocks.libphonenumber.android.PhoneNumberUtil.f21550p
            java.util.regex.Matcher r2 = r4.matcher(r2)
            boolean r4 = r2.find()
            if (r4 == 0) goto L70
            r4 = 1
            java.lang.String r2 = r2.group(r4)
            java.lang.String r2 = p(r2)
            java.lang.String r4 = "0"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L70
            goto L1c
        L70:
            r0.delete(r1, r7)
            io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber$CountryCodeSource r7 = io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber.CountryCodeSource.f21661b
        L75:
            if (r7 == r3) goto L9b
            int r7 = r0.length()
            r8 = 2
            if (r7 <= r8) goto L91
            int r7 = r6.b(r0, r9)
            if (r7 == 0) goto L87
            r10.f21650a = r7
            return r7
        L87:
            io.michaelrocks.libphonenumber.android.NumberParseException r7 = new io.michaelrocks.libphonenumber.android.NumberParseException
            io.michaelrocks.libphonenumber.android.NumberParseException$ErrorType r8 = io.michaelrocks.libphonenumber.android.NumberParseException.ErrorType.f21537a
            java.lang.String r9 = "Country calling code supplied was not recognised."
            r7.<init>(r8, r9)
            throw r7
        L91:
            io.michaelrocks.libphonenumber.android.NumberParseException r7 = new io.michaelrocks.libphonenumber.android.NumberParseException
            io.michaelrocks.libphonenumber.android.NumberParseException$ErrorType r8 = io.michaelrocks.libphonenumber.android.NumberParseException.ErrorType.f21539c
            java.lang.String r9 = "Phone number had an IDD, but after this was not long enough to be a viable phone number."
            r7.<init>(r8, r9)
            throw r7
        L9b:
            if (r8 == 0) goto Lde
            int r7 = r8.f21606J
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r3 = r0.toString()
            boolean r4 = r3.startsWith(r2)
            if (r4 == 0) goto Lde
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2.length()
            java.lang.String r2 = r3.substring(r2)
            r4.<init>(r2)
            io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneNumberDesc r2 = r8.f21617b
            r3 = 0
            r6.n(r4, r8, r3)
            C.N r3 = r6.f21561c
            boolean r5 = r3.l(r0, r2)
            if (r5 != 0) goto Lce
            boolean r2 = r3.l(r4, r2)
            if (r2 != 0) goto Ld8
        Lce:
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil$PhoneNumberType r2 = io.michaelrocks.libphonenumber.android.PhoneNumberUtil.PhoneNumberType.f21581l
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil$ValidationResult r8 = t(r0, r8, r2)
            io.michaelrocks.libphonenumber.android.PhoneNumberUtil$ValidationResult r0 = io.michaelrocks.libphonenumber.android.PhoneNumberUtil.ValidationResult.f21587e
            if (r8 != r0) goto Lde
        Ld8:
            r9.append(r4)
            r10.f21650a = r7
            return r7
        Lde:
            r10.f21650a = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.michaelrocks.libphonenumber.android.PhoneNumberUtil.m(java.lang.CharSequence, io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata, java.lang.StringBuilder, io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber):int");
    }

    public final void n(StringBuilder sb2, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb3) {
        int length = sb2.length();
        String str = phonemetadata$PhoneMetadata.S;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.f21563e.a(str).matcher(sb2);
        if (matcher.lookingAt()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc = phonemetadata$PhoneMetadata.f21617b;
            N n10 = this.f21561c;
            boolean l10 = n10.l(sb2, phonemetadata$PhoneNumberDesc);
            int groupCount = matcher.groupCount();
            String str2 = phonemetadata$PhoneMetadata.U;
            if (str2 == null || str2.length() == 0 || matcher.group(groupCount) == null) {
                if (!l10 || n10.l(sb2.substring(matcher.end()), phonemetadata$PhoneNumberDesc)) {
                    if (sb3 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb3.append(matcher.group(1));
                    }
                    sb2.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb4 = new StringBuilder(sb2);
            sb4.replace(0, length, matcher.replaceFirst(str2));
            if (!l10 || n10.l(sb4.toString(), phonemetadata$PhoneNumberDesc)) {
                if (sb3 != null && groupCount > 1) {
                    sb3.append(matcher.group(1));
                }
                sb2.replace(0, sb2.length(), sb4.toString());
            }
        }
    }

    public final Phonenumber$PhoneNumber r(String str, String str2) {
        CharSequence charSequence;
        int i9;
        Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
        NumberParseException.ErrorType errorType = NumberParseException.ErrorType.f21538b;
        if (str == null) {
            throw new NumberParseException(errorType, "The phone number supplied was null.");
        }
        int length = str.length();
        NumberParseException.ErrorType errorType2 = NumberParseException.ErrorType.f21541e;
        if (length > 250) {
            throw new NumberParseException(errorType2, "The string supplied was too long to parse.");
        }
        StringBuilder sb2 = new StringBuilder();
        String str3 = str.toString();
        int indexOf = str3.indexOf(";phone-context=");
        String str4 = "";
        if (indexOf >= 0) {
            int i10 = indexOf + 15;
            if (i10 < str3.length() - 1 && str3.charAt(i10) == '+') {
                int indexOf2 = str3.indexOf(59, i10);
                if (indexOf2 > 0) {
                    sb2.append(str3.substring(i10, indexOf2));
                } else {
                    sb2.append(str3.substring(i10));
                }
            }
            int indexOf3 = str3.indexOf("tel:");
            sb2.append(str3.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
        } else {
            Matcher matcher = f21551q.matcher(str3);
            if (matcher.find()) {
                charSequence = str3.subSequence(matcher.start(), str3.length());
                Matcher matcher2 = f21553s.matcher(charSequence);
                if (matcher2.find()) {
                    charSequence = charSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = f21552r.matcher(charSequence);
                if (matcher3.find()) {
                    charSequence = charSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequence = "";
            }
            sb2.append(charSequence);
        }
        int indexOf4 = sb2.indexOf(";isub=");
        if (indexOf4 > 0) {
            sb2.delete(indexOf4, sb2.length());
        }
        if (sb2.length() >= 2) {
            Pattern pattern = f21556v;
            if (pattern.matcher(sb2).matches()) {
                NumberParseException.ErrorType errorType3 = NumberParseException.ErrorType.f21537a;
                boolean l10 = l(str2);
                Pattern pattern2 = f21548n;
                if (!l10 && (sb2.length() == 0 || !pattern2.matcher(sb2).lookingAt())) {
                    throw new NumberParseException(errorType3, "Missing or invalid default region.");
                }
                Matcher matcher4 = f21555u.matcher(sb2);
                if (matcher4.find()) {
                    String substring = sb2.substring(0, matcher4.start());
                    if (substring.length() >= 2 && pattern.matcher(substring).matches()) {
                        int groupCount = matcher4.groupCount();
                        int i11 = 1;
                        while (true) {
                            if (i11 > groupCount) {
                                break;
                            }
                            if (matcher4.group(i11) != null) {
                                str4 = matcher4.group(i11);
                                sb2.delete(matcher4.start(), sb2.length());
                                break;
                            }
                            i11++;
                        }
                    }
                }
                if (str4.length() > 0) {
                    phonenumber$PhoneNumber.f21652c = true;
                    phonenumber$PhoneNumber.f21653d = str4;
                }
                Phonemetadata$PhoneMetadata e10 = e(str2);
                StringBuilder sb3 = new StringBuilder();
                try {
                    i9 = m(sb2, e10, sb3, phonenumber$PhoneNumber);
                } catch (NumberParseException e11) {
                    Matcher matcher5 = pattern2.matcher(sb2);
                    NumberParseException.ErrorType errorType4 = e11.f21535a;
                    if (errorType4 != errorType3 || !matcher5.lookingAt()) {
                        throw new NumberParseException(errorType4, e11.getMessage());
                    }
                    int m2 = m(sb2.substring(matcher5.end()), e10, sb3, phonenumber$PhoneNumber);
                    if (m2 == 0) {
                        throw new NumberParseException(errorType3, "Could not interpret numbers after plus-sign.");
                    }
                    i9 = m2;
                }
                if (i9 != 0) {
                    String i12 = i(i9);
                    if (!i12.equals(str2)) {
                        e10 = "001".equals(i12) ? d(i9) : e(i12);
                    }
                } else {
                    o(sb2);
                    sb3.append((CharSequence) sb2);
                    if (str2 != null) {
                        phonenumber$PhoneNumber.f21650a = e10.f21606J;
                    }
                }
                int length2 = sb3.length();
                NumberParseException.ErrorType errorType5 = NumberParseException.ErrorType.f21540d;
                if (length2 < 2) {
                    throw new NumberParseException(errorType5, "The string supplied is too short to be a phone number.");
                }
                if (e10 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder sb5 = new StringBuilder(sb3);
                    n(sb5, e10, sb4);
                    ValidationResult t3 = t(sb5, e10, PhoneNumberType.f21581l);
                    if (t3 != ValidationResult.f21585c && t3 != ValidationResult.f21584b && t3 != ValidationResult.f21586d) {
                        sb3 = sb5;
                    }
                }
                int length3 = sb3.length();
                if (length3 < 2) {
                    throw new NumberParseException(errorType5, "The string supplied is too short to be a phone number.");
                }
                if (length3 > 17) {
                    throw new NumberParseException(errorType2, "The string supplied is too long to be a phone number.");
                }
                if (sb3.length() > 1 && sb3.charAt(0) == '0') {
                    phonenumber$PhoneNumber.f21654e = true;
                    phonenumber$PhoneNumber.f21655f = true;
                    int i13 = 1;
                    while (i13 < sb3.length() - 1 && sb3.charAt(i13) == '0') {
                        i13++;
                    }
                    if (i13 != 1) {
                        phonenumber$PhoneNumber.f21656g = true;
                        phonenumber$PhoneNumber.f21657h = i13;
                    }
                }
                phonenumber$PhoneNumber.f21651b = Long.parseLong(sb3.toString());
                return phonenumber$PhoneNumber;
            }
        }
        throw new NumberParseException(errorType, "The string supplied did not seem to be a phone number.");
    }
}
