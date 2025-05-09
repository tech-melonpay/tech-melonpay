package l0;

import android.content.pm.PackageInfo;
import android.view.Menu;
import android.view.ViewConfiguration;

/* compiled from: PackageInfoCompat.java */
/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975a {
    public static long a(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static void b(Menu menu) {
        menu.setGroupDividerEnabled(true);
    }

    public static boolean c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
