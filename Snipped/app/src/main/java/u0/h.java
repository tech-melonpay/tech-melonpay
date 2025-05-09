package U0;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentNavigator;
import b1.C0582b;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC0550p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3603b;

    public /* synthetic */ h(Object obj, int i) {
        this.f3602a = i;
        this.f3603b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        switch (this.f3602a) {
            case 0:
                Lifecycle.State a10 = event.a();
                NavController navController = (NavController) this.f3603b;
                navController.f7173s = a10;
                if (navController.f7158c != null) {
                    Iterator it = new ArrayList(navController.f7162g).iterator();
                    while (it.hasNext()) {
                        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
                        navBackStackEntry.getClass();
                        navBackStackEntry.f7135d = event.a();
                        navBackStackEntry.c();
                    }
                    break;
                }
                break;
            case 1:
                if (event == Lifecycle.Event.ON_DESTROY) {
                    Fragment fragment = (Fragment) rVar;
                    FragmentNavigator fragmentNavigator = (FragmentNavigator) this.f3603b;
                    Object obj = null;
                    for (Object obj2 : fragmentNavigator.b().f3630f.getValue()) {
                        if (kotlin.jvm.internal.f.b(((NavBackStackEntry) obj2).f7137f, fragment.getTag())) {
                            obj = obj2;
                        }
                    }
                    NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                    if (navBackStackEntry2 != null) {
                        if (FragmentNavigator.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry2 + " due to fragment " + rVar + " lifecycle reaching DESTROYED");
                        }
                        fragmentNavigator.b().b(navBackStackEntry2);
                        break;
                    }
                }
                break;
            default:
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                C0582b c0582b = (C0582b) this.f3603b;
                if (event == event2) {
                    c0582b.f8284f = true;
                    break;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    c0582b.f8284f = false;
                    break;
                }
                break;
        }
    }
}
