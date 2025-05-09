package y9;

import android.content.Context;
import com.bumptech.glide.load.Key;
import io.sentry.InterfaceC0859q;
import java.nio.charset.Charset;
import u9.o;

/* compiled from: RootChecker.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f31161g = Charset.forName(Key.STRING_CHARSET_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final Context f31162a;

    /* renamed from: b, reason: collision with root package name */
    public final o f31163b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0859q f31164c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f31165d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f31166e;

    /* renamed from: f, reason: collision with root package name */
    public final Runtime f31167f;

    public c(Context context, InterfaceC0859q interfaceC0859q, o oVar) {
        Runtime runtime = Runtime.getRuntime();
        this.f31162a = context;
        this.f31163b = oVar;
        D9.b.t0(interfaceC0859q, "The Logger is required.");
        this.f31164c = interfaceC0859q;
        this.f31165d = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.f31166e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        D9.b.t0(runtime, "The Runtime is required.");
        this.f31167f = runtime;
    }
}
