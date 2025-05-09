package q;

import android.os.Build;

/* compiled from: AuthenticatorUtils.java */
/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127c {
    public static boolean a(int i) {
        return (i & 32768) != 0;
    }

    public static boolean b(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i != 32783) {
            return i == 33023 || i == 0;
        }
        int i9 = Build.VERSION.SDK_INT;
        return i9 < 28 || i9 > 29;
    }
}
