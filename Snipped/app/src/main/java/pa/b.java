package Pa;

import C.v;
import com.bumptech.glide.load.Key;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Html5Entities.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f3173a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3174b;

    static {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName(Key.STRING_CHARSET_NAME)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        hashMap.put("NewLine", "\n");
                        f3173a = hashMap;
                        f3174b = Pattern.compile("^&#[Xx]?");
                        return;
                    }
                    if (readLine.length() != 0) {
                        int indexOf = readLine.indexOf("=");
                        hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                    }
                } finally {
                }
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e10);
        }
    }

    public static String a(String str) {
        Matcher matcher = f3174b.matcher(str);
        if (!matcher.find()) {
            String str2 = f3173a.get(v.j(1, 1, str));
            return str2 != null ? str2 : str;
        }
        try {
            int parseInt = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), matcher.end() == 2 ? 10 : 16);
            return parseInt == 0 ? "�" : new String(Character.toChars(parseInt));
        } catch (IllegalArgumentException unused) {
            return "�";
        }
    }
}
