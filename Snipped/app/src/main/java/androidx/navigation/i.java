package androidx.navigation;

import android.view.View;
import ja.l;

/* compiled from: Navigation.kt */
/* loaded from: classes.dex */
public final class i {
    public static final NavController a(View view) {
        NavController navController = (NavController) kotlin.sequences.a.h(kotlin.sequences.a.j(l.d(Navigation$findViewNavController$1.f7249l, view), Navigation$findViewNavController$2.f7250l));
        if (navController != null) {
            return navController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
