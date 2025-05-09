package defpackage;

import com.bumptech.glide.load.Key;
import com.google.gson.g;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import ka.C0969n;

/* compiled from: TokenFunction.kt */
/* loaded from: classes.dex */
public final class c {
    public static final Long a(String str) {
        List r02 = C0969n.r0(str, new String[]{"."});
        try {
            Charset forName = Charset.forName(Key.STRING_CHARSET_NAME);
            return Long.valueOf(((b) new g().b(b.class, new String(Base64.getUrlDecoder().decode(((String) r02.get(1)).getBytes(forName)), forName))).a());
        } catch (Exception unused) {
            return null;
        }
    }

    public static final long b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        if (str == null) {
            return 0L;
        }
        Date parse = simpleDateFormat.parse(str);
        return (parse != null ? parse.getTime() : 0L) / 1000;
    }
}
