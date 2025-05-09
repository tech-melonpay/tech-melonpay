package j0;

import android.app.LocaleManager;
import android.os.LocaleList;

/* compiled from: LocaleManagerCompat.java */
/* loaded from: classes.dex */
public final class j {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
