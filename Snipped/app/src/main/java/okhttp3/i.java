package okhttp3;

import C.v;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MediaType.kt */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f24542d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f24543e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f24544a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24545b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f24546c;

    /* compiled from: MediaType.kt */
    public static final class a {
        public static i a(String str) {
            Matcher matcher = i.f24542d.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(v.o("No subtype found for: \"", str, '\"').toString());
            }
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            matcher.group(2).toLowerCase(locale);
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = i.f24543e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"').toString());
                }
                String group2 = matcher2.group(1);
                if (group2 == null) {
                    end = matcher2.end();
                } else {
                    String group3 = matcher2.group(2);
                    if (group3 == null) {
                        group3 = matcher2.group(3);
                    } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                        group3 = v.j(1, 1, group3);
                    }
                    arrayList.add(group2);
                    arrayList.add(group3);
                    end = matcher2.end();
                }
            }
            return new i(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
        }

        public static i b(String str) {
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public i(String str, String str2, String[] strArr) {
        this.f24544a = str;
        this.f24545b = str2;
        this.f24546c = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset a(java.nio.charset.Charset r7) {
        /*
            r6 = this;
            java.lang.String[] r0 = r6.f24546c
            int r1 = r0.length
            int r1 = r1 + (-1)
            r2 = 0
            r3 = 2
            int r1 = U4.b.m(r2, r1, r3)
            if (r1 < 0) goto L21
        Ld:
            r3 = r0[r2]
            java.lang.String r4 = "charset"
            r5 = 1
            boolean r3 = ka.C0967l.U(r3, r4, r5)
            if (r3 == 0) goto L1c
            int r2 = r2 + r5
            r0 = r0[r2]
            goto L22
        L1c:
            if (r2 == r1) goto L21
            int r2 = r2 + 2
            goto Ld
        L21:
            r0 = 0
        L22:
            if (r0 != 0) goto L25
            return r7
        L25:
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L29
        L29:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.i.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i) && kotlin.jvm.internal.f.b(((i) obj).f24544a, this.f24544a);
    }

    public final int hashCode() {
        return this.f24544a.hashCode();
    }

    public final String toString() {
        return this.f24544a;
    }
}
