package q;

import android.app.KeyguardManager;
import android.content.Context;

/* compiled from: KeyguardUtils.java */
/* loaded from: classes.dex */
public final class p {
    public static KeyguardManager a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
