package q;

import android.content.pm.PackageManager;

/* compiled from: PackageUtils.java */
/* loaded from: classes.dex */
public final class q {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
