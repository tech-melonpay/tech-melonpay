package t0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f27401b = new g(new i(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final h f27402a;

    /* compiled from: LocaleListCompat.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f27403a = 0;

        static {
            new Locale("en", "XA");
            new Locale("ar", "XB");
        }
    }

    public g(i iVar) {
        this.f27402a = iVar;
    }

    public static g a(String str) {
        if (str == null || str.isEmpty()) {
            return f27401b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i9 = a.f27403a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new g(new i(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (this.f27402a.equals(((g) obj).f27402a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27402a.hashCode();
    }

    public final String toString() {
        return this.f27402a.toString();
    }
}
