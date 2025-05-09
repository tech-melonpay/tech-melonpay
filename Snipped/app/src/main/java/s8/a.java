package S8;

import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonemetadata$NumberFormat;
import io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: AsYouTypeFormatter.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: t, reason: collision with root package name */
    public static final Phonemetadata$PhoneMetadata f3410t;

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f3411u;

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f3412v;

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f3413w;
    public final PhoneNumberUtil i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3422j;

    /* renamed from: k, reason: collision with root package name */
    public final Phonemetadata$PhoneMetadata f3423k;

    /* renamed from: l, reason: collision with root package name */
    public Phonemetadata$PhoneMetadata f3424l;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f3414a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public String f3415b = "";

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f3416c = new StringBuilder();

    /* renamed from: d, reason: collision with root package name */
    public final StringBuilder f3417d = new StringBuilder();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3418e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3419f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3420g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3421h = false;

    /* renamed from: m, reason: collision with root package name */
    public int f3425m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final StringBuilder f3426n = new StringBuilder();

    /* renamed from: o, reason: collision with root package name */
    public boolean f3427o = false;

    /* renamed from: p, reason: collision with root package name */
    public String f3428p = "";

    /* renamed from: q, reason: collision with root package name */
    public final StringBuilder f3429q = new StringBuilder();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f3430r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final io.michaelrocks.libphonenumber.android.internal.a f3431s = new io.michaelrocks.libphonenumber.android.internal.a(64);

    static {
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = new Phonemetadata$PhoneMetadata();
        phonemetadata$PhoneMetadata.f21607K = "NA";
        f3410t = phonemetadata$PhoneMetadata;
        f3411u = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)+");
        f3412v = Pattern.compile("[- ]");
        f3413w = Pattern.compile("\u2008");
    }

    public a(PhoneNumberUtil phoneNumberUtil, String str) {
        this.i = phoneNumberUtil;
        this.f3422j = str;
        Phonemetadata$PhoneMetadata g10 = g(str);
        this.f3424l = g10;
        this.f3423k = g10;
    }

    public final String a(String str) {
        StringBuilder sb2 = this.f3426n;
        int length = sb2.length();
        if (!this.f3427o || length <= 0 || sb2.charAt(length - 1) == ' ') {
            return ((Object) sb2) + str;
        }
        return new String(sb2) + ' ' + str;
    }

    public final String b() {
        StringBuilder sb2 = this.f3429q;
        if (sb2.length() < 3) {
            return a(sb2.toString());
        }
        String sb3 = sb2.toString();
        for (Phonemetadata$NumberFormat phonemetadata$NumberFormat : (this.f3420g && this.f3428p.length() == 0 && this.f3424l.X.size() > 0) ? this.f3424l.X : this.f3424l.W) {
            if (this.f3428p.length() > 0) {
                String str = phonemetadata$NumberFormat.f21593e;
                if ((str.length() == 0 || PhoneNumberUtil.f21558x.matcher(str).matches()) && !phonemetadata$NumberFormat.f21594f && !phonemetadata$NumberFormat.f21595g) {
                }
            }
            if (this.f3428p.length() == 0 && !this.f3420g) {
                String str2 = phonemetadata$NumberFormat.f21593e;
                if (str2.length() != 0 && !PhoneNumberUtil.f21558x.matcher(str2).matches() && !phonemetadata$NumberFormat.f21594f) {
                }
            }
            if (f3411u.matcher(phonemetadata$NumberFormat.f21590b).matches()) {
                this.f3430r.add(phonemetadata$NumberFormat);
            }
        }
        l(sb3);
        String e10 = e();
        return e10.length() > 0 ? e10 : k() ? h() : this.f3416c.toString();
    }

    public final boolean c() {
        StringBuilder sb2;
        PhoneNumberUtil phoneNumberUtil;
        int b9;
        StringBuilder sb3 = this.f3429q;
        if (sb3.length() == 0 || (b9 = (phoneNumberUtil = this.i).b(sb3, (sb2 = new StringBuilder()))) == 0) {
            return false;
        }
        sb3.setLength(0);
        sb3.append((CharSequence) sb2);
        String i = phoneNumberUtil.i(b9);
        if ("001".equals(i)) {
            this.f3424l = phoneNumberUtil.d(b9);
        } else if (!i.equals(this.f3422j)) {
            this.f3424l = g(i);
        }
        String num = Integer.toString(b9);
        StringBuilder sb4 = this.f3426n;
        sb4.append(num);
        sb4.append(' ');
        this.f3428p = "";
        return true;
    }

    public final boolean d() {
        Pattern a10 = this.f3431s.a("\\+|" + this.f3424l.f21607K);
        StringBuilder sb2 = this.f3417d;
        Matcher matcher = a10.matcher(sb2);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f3420g = true;
        int end = matcher.end();
        StringBuilder sb3 = this.f3429q;
        sb3.setLength(0);
        sb3.append(sb2.substring(end));
        StringBuilder sb4 = this.f3426n;
        sb4.setLength(0);
        sb4.append(sb2.substring(0, end));
        if (sb2.charAt(0) != '+') {
            sb4.append(' ');
        }
        return true;
    }

    public final String e() {
        Iterator it = this.f3430r.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            Matcher matcher = this.f3431s.a(phonemetadata$NumberFormat.f21589a).matcher(this.f3429q);
            if (matcher.matches()) {
                this.f3427o = f3412v.matcher(phonemetadata$NumberFormat.f21593e).find();
                String a10 = a(matcher.replaceAll(phonemetadata$NumberFormat.f21590b));
                if (PhoneNumberUtil.q(a10, PhoneNumberUtil.f21544j).contentEquals(this.f3417d)) {
                    return a10;
                }
            }
        }
        return "";
    }

    public final void f() {
        this.f3416c.setLength(0);
        this.f3417d.setLength(0);
        this.f3414a.setLength(0);
        this.f3425m = 0;
        this.f3415b = "";
        this.f3426n.setLength(0);
        this.f3428p = "";
        this.f3429q.setLength(0);
        this.f3418e = true;
        this.f3419f = false;
        this.f3420g = false;
        this.f3421h = false;
        this.f3430r.clear();
        this.f3427o = false;
        if (this.f3424l.equals(this.f3423k)) {
            return;
        }
        this.f3424l = g(this.f3422j);
    }

    public final Phonemetadata$PhoneMetadata g(String str) {
        int i;
        PhoneNumberUtil phoneNumberUtil = this.i;
        if (phoneNumberUtil.l(str)) {
            Phonemetadata$PhoneMetadata e10 = phoneNumberUtil.e(str);
            if (e10 == null) {
                throw new IllegalArgumentException(s3.b.j("Invalid region code: ", str));
            }
            i = e10.f21606J;
        } else {
            Level level = Level.WARNING;
            StringBuilder sb2 = new StringBuilder("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            PhoneNumberUtil.f21543h.log(level, androidx.camera.core.impl.utils.a.n(sb2, str, ") provided."));
            i = 0;
        }
        Phonemetadata$PhoneMetadata e11 = phoneNumberUtil.e(phoneNumberUtil.i(i));
        return e11 != null ? e11 : f3410t;
    }

    public final String h() {
        StringBuilder sb2 = this.f3429q;
        int length = sb2.length();
        if (length <= 0) {
            return this.f3426n.toString();
        }
        String str = "";
        for (int i = 0; i < length; i++) {
            str = j(sb2.charAt(i));
        }
        return this.f3418e ? a(str) : this.f3416c.toString();
    }

    public final String i(char c2) {
        StringBuilder sb2 = this.f3416c;
        sb2.append(c2);
        boolean isDigit = Character.isDigit(c2);
        StringBuilder sb3 = this.f3417d;
        StringBuilder sb4 = this.f3429q;
        if (!isDigit && (sb2.length() != 1 || !PhoneNumberUtil.f21548n.matcher(Character.toString(c2)).matches())) {
            this.f3418e = false;
            this.f3419f = true;
        } else if (c2 == '+') {
            sb3.append(c2);
        } else {
            c2 = Character.forDigit(Character.digit(c2, 10), 10);
            sb3.append(c2);
            sb4.append(c2);
        }
        boolean z10 = this.f3418e;
        StringBuilder sb5 = this.f3426n;
        if (!z10) {
            if (this.f3419f) {
                return sb2.toString();
            }
            if (!d()) {
                if (this.f3428p.length() > 0) {
                    sb4.insert(0, this.f3428p);
                    sb5.setLength(sb5.lastIndexOf(this.f3428p));
                }
                if (!this.f3428p.equals(m())) {
                    sb5.append(' ');
                    this.f3418e = true;
                    this.f3421h = false;
                    this.f3430r.clear();
                    this.f3425m = 0;
                    this.f3414a.setLength(0);
                    this.f3415b = "";
                    return b();
                }
            } else if (c()) {
                this.f3418e = true;
                this.f3421h = false;
                this.f3430r.clear();
                this.f3425m = 0;
                this.f3414a.setLength(0);
                this.f3415b = "";
                return b();
            }
            return sb2.toString();
        }
        int length = sb3.length();
        if (length == 0 || length == 1 || length == 2) {
            return sb2.toString();
        }
        if (length == 3) {
            if (!d()) {
                this.f3428p = m();
                return b();
            }
            this.f3421h = true;
        }
        if (this.f3421h) {
            if (c()) {
                this.f3421h = false;
            }
            return ((Object) sb5) + sb4.toString();
        }
        if (this.f3430r.size() <= 0) {
            return b();
        }
        String j10 = j(c2);
        String e10 = e();
        if (e10.length() > 0) {
            return e10;
        }
        l(sb4.toString());
        return k() ? h() : this.f3418e ? a(j10) : sb2.toString();
    }

    public final String j(char c2) {
        StringBuilder sb2 = this.f3414a;
        Matcher matcher = f3413w.matcher(sb2);
        if (!matcher.find(this.f3425m)) {
            if (this.f3430r.size() == 1) {
                this.f3418e = false;
            }
            this.f3415b = "";
            return this.f3416c.toString();
        }
        String replaceFirst = matcher.replaceFirst(Character.toString(c2));
        sb2.replace(0, replaceFirst.length(), replaceFirst);
        int start = matcher.start();
        this.f3425m = start;
        return sb2.substring(0, start + 1);
    }

    public final boolean k() {
        Iterator it = this.f3430r.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            String str = phonemetadata$NumberFormat.f21589a;
            if (this.f3415b.equals(str)) {
                return false;
            }
            String str2 = phonemetadata$NumberFormat.f21589a;
            StringBuilder sb2 = this.f3414a;
            sb2.setLength(0);
            String str3 = phonemetadata$NumberFormat.f21590b;
            Matcher matcher = this.f3431s.a(str2).matcher("999999999999999");
            matcher.find();
            String group = matcher.group();
            String replaceAll = group.length() < this.f3429q.length() ? "" : group.replaceAll(str2, str3).replaceAll("9", "\u2008");
            if (replaceAll.length() > 0) {
                sb2.append(replaceAll);
                this.f3415b = str;
                this.f3427o = f3412v.matcher(phonemetadata$NumberFormat.f21593e).find();
                this.f3425m = 0;
                return true;
            }
            it.remove();
        }
        this.f3418e = false;
        return false;
    }

    public final void l(String str) {
        int length = str.length() - 3;
        Iterator it = this.f3430r.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            if (phonemetadata$NumberFormat.f21591c.size() != 0) {
                if (!this.f3431s.a((String) phonemetadata$NumberFormat.f21591c.get(Math.min(length, phonemetadata$NumberFormat.f21591c.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    public final String m() {
        int i = this.f3424l.f21606J;
        StringBuilder sb2 = this.f3426n;
        int i9 = 1;
        StringBuilder sb3 = this.f3429q;
        if (i != 1 || sb3.charAt(0) != '1' || sb3.charAt(1) == '0' || sb3.charAt(1) == '1') {
            Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = this.f3424l;
            if (phonemetadata$PhoneMetadata.R) {
                Matcher matcher = this.f3431s.a(phonemetadata$PhoneMetadata.S).matcher(sb3);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.f3420g = true;
                    i9 = matcher.end();
                    sb2.append(sb3.substring(0, i9));
                }
            }
            i9 = 0;
        } else {
            sb2.append('1');
            sb2.append(' ');
            this.f3420g = true;
        }
        String substring = sb3.substring(0, i9);
        sb3.delete(0, i9);
        return substring;
    }
}
