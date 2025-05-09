package va;

import C.v;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.C0969n;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Cookie.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f30677j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f30678k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f30679l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f30680m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f30681a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30682b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30683c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30684d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30685e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30686f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30687g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30688h;
    public final boolean i;

    /* compiled from: Cookie.kt */
    public static final class a {
        public static int a(String str, int i, int i9, boolean z10) {
            while (i < i9) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z10)) {
                    return i;
                }
                i++;
            }
            return i9;
        }

        public static long b(int i, String str) {
            int a10 = a(str, 0, i, false);
            Matcher matcher = d.f30680m.matcher(str);
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            while (a10 < i) {
                int a11 = a(str, a10 + 1, i, true);
                matcher.region(a10, a11);
                if (i10 == -1 && matcher.usePattern(d.f30680m).matches()) {
                    i10 = Integer.parseInt(matcher.group(1));
                    i13 = Integer.parseInt(matcher.group(2));
                    i14 = Integer.parseInt(matcher.group(3));
                } else if (i11 == -1 && matcher.usePattern(d.f30679l).matches()) {
                    i11 = Integer.parseInt(matcher.group(1));
                } else {
                    if (i12 == -1) {
                        Pattern pattern = d.f30678k;
                        if (matcher.usePattern(pattern).matches()) {
                            i12 = C0969n.g0(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                        }
                    }
                    if (i9 == -1 && matcher.usePattern(d.f30677j).matches()) {
                        i9 = Integer.parseInt(matcher.group(1));
                    }
                }
                a10 = a(str, a11 + 1, i, false);
            }
            if (70 <= i9 && i9 < 100) {
                i9 += 1900;
            }
            if (i9 >= 0 && i9 < 70) {
                i9 += 2000;
            }
            if (i9 < 1601) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i12 == -1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (1 > i11 || i11 >= 32) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i10 < 0 || i10 >= 24) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i13 < 0 || i13 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i14 < 0 || i14 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(wa.b.f30876e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i9);
            gregorianCalendar.set(2, i12 - 1);
            gregorianCalendar.set(5, i11);
            gregorianCalendar.set(11, i10);
            gregorianCalendar.set(12, i13);
            gregorianCalendar.set(13, i14);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public d(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f30681a = str;
        this.f30682b = str2;
        this.f30683c = j10;
        this.f30684d = str3;
        this.f30685e = str4;
        this.f30686f = z10;
        this.f30687g = z11;
        this.f30688h = z12;
        this.i = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (kotlin.jvm.internal.f.b(dVar.f30681a, this.f30681a) && kotlin.jvm.internal.f.b(dVar.f30682b, this.f30682b) && dVar.f30683c == this.f30683c && kotlin.jvm.internal.f.b(dVar.f30684d, this.f30684d) && kotlin.jvm.internal.f.b(dVar.f30685e, this.f30685e) && dVar.f30686f == this.f30686f && dVar.f30687g == this.f30687g && dVar.f30688h == this.f30688h && dVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Boolean.hashCode(this.i) + v.d(v.d(v.d(v.c(v.c(v.e(this.f30683c, v.c(v.c(527, 31, this.f30681a), 31, this.f30682b), 31), 31, this.f30684d), 31, this.f30685e), 31, this.f30686f), 31, this.f30687g), 31, this.f30688h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30681a);
        sb2.append('=');
        sb2.append(this.f30682b);
        if (this.f30688h) {
            long j10 = this.f30683c;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(Aa.c.f145a.get().format(new Date(j10)));
            }
        }
        if (!this.i) {
            sb2.append("; domain=");
            sb2.append(this.f30684d);
        }
        sb2.append("; path=");
        sb2.append(this.f30685e);
        if (this.f30686f) {
            sb2.append("; secure");
        }
        if (this.f30687g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }
}
