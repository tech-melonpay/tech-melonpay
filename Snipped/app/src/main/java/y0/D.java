package y0;

import android.view.ViewConfiguration;

/* compiled from: ViewConfigurationCompat.java */
/* loaded from: classes.dex */
public final class D {
    public static int a(ViewConfiguration viewConfiguration, int i, int i9, int i10) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i9, i10);
    }

    public static int b(ViewConfiguration viewConfiguration, int i, int i9, int i10) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i9, i10);
    }
}
