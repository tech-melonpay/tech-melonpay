package androidx.navigation;

import android.os.Build;
import android.view.View;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.mobile.R;
import j0.C0872a;
import ja.l;

/* compiled from: Activity.kt */
/* loaded from: classes.dex */
public final class a {
    public static final NavController a(MainActivity mainActivity) {
        View findViewById;
        if (Build.VERSION.SDK_INT >= 28) {
            findViewById = C0872a.a(mainActivity);
        } else {
            findViewById = mainActivity.findViewById(R.id.nav_host_fragment);
            if (findViewById == null) {
                throw new IllegalArgumentException("ID does not reference a View inside this Activity");
            }
        }
        NavController navController = (NavController) kotlin.sequences.a.h(kotlin.sequences.a.j(l.d(Navigation$findViewNavController$1.f7249l, findViewById), Navigation$findViewNavController$2.f7250l));
        if (navController != null) {
            return navController;
        }
        throw new IllegalStateException("Activity " + mainActivity + " does not have a NavController set on 2131363006");
    }
}
