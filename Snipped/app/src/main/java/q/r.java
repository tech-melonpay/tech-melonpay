package q;

import android.content.pm.PackageManager;

/* compiled from: PackageUtils.java */
/* loaded from: classes.dex */
public final class r {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }

    public static boolean b(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
    }
}
