package t0;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* compiled from: BuildCompat.kt */
/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1274a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27394a = 0;

    /* compiled from: BuildCompat.kt */
    /* renamed from: t0.a$a, reason: collision with other inner class name */
    public static final class C0472a {
        public static void a(int i) {
            SdkExtensions.getExtensionVersion(i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C0472a.a(30);
        }
        if (i >= 30) {
            C0472a.a(31);
        }
        if (i >= 30) {
            C0472a.a(33);
        }
        if (i >= 30) {
            C0472a.a(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if (kotlin.jvm.internal.f.b("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || (i >= 30 && a("S", Build.VERSION.CODENAME));
    }

    public static final boolean c() {
        int i = Build.VERSION.SDK_INT;
        return i >= 35 || (i >= 34 && a("VanillaIceCream", Build.VERSION.CODENAME));
    }
}
