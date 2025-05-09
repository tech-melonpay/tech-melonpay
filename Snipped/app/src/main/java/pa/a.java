package Pa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Escaping.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f3169a = Pattern.compile("[\\\\&]");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3170b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3171c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0039a f3172d;

    /* compiled from: Escaping.java */
    /* renamed from: Pa.a$a, reason: collision with other inner class name */
    public static class C0039a {
        public final void a(StringBuilder sb2, String str) {
            if (str.charAt(0) == '\\') {
                sb2.append((CharSequence) str, 1, str.length());
            } else {
                sb2.append(b.a(str));
            }
        }
    }

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f3171c = Pattern.compile("[ \t\r\n]+");
        f3172d = new C0039a();
    }

    public static String a(String str) {
        if (!f3169a.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f3170b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int i = 0;
        do {
            sb2.append((CharSequence) str, i, matcher.start());
            f3172d.a(sb2, matcher.group());
            i = matcher.end();
        } while (matcher.find());
        if (i != str.length()) {
            sb2.append((CharSequence) str, i, str.length());
        }
        return sb2.toString();
    }
}
