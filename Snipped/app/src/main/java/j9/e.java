package J9;

import C.v;
import com.bumptech.glide.load.Key;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: StringUtils.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2209a = Charset.forName(Key.STRING_CHARSET_NAME);

    public static String a(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(substring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    public static String b(String str) {
        return (str != null && str.startsWith("\"") && str.endsWith("\"")) ? v.j(1, 1, str) : str;
    }
}
