package ka;

import com.bumptech.glide.load.Key;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* compiled from: Charsets.kt */
/* renamed from: ka.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0956a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0956a f23053a = new C0956a();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f23054b = Charset.forName(Key.STRING_CHARSET_NAME);

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f23055c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Charset f23056d;

    static {
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("US-ASCII");
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
    }
}
