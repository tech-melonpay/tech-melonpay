package W0;

import P9.s;
import U0.m;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentNavigator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;

/* compiled from: FragmentNavigator.kt */
/* loaded from: classes.dex */
public final class d implements FragmentManager.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f3786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentNavigator f3787b;

    public d(NavController.NavControllerNavigatorState navControllerNavigatorState, FragmentNavigator fragmentNavigator) {
        this.f3786a = navControllerNavigatorState;
        this.f3787b = fragmentNavigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.n
    public final void a(Fragment fragment, boolean z10) {
        Object obj;
        Object obj2;
        m mVar = this.f3786a;
        ArrayList U = s.U(mVar.f3629e.getValue(), mVar.f3630f.getValue());
        ListIterator listIterator = U.listIterator(U.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            } else {
                obj2 = listIterator.previous();
                if (kotlin.jvm.internal.f.b(((NavBackStackEntry) obj2).f7137f, fragment.getTag())) {
                    break;
                }
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
        FragmentNavigator fragmentNavigator = this.f3787b;
        boolean z11 = z10 && fragmentNavigator.f7291g.isEmpty() && fragment.isRemoving();
        Iterator it = fragmentNavigator.f7291g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.f.b(((Pair) next).f23089a, fragment.getTag())) {
                obj = next;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            fragmentNavigator.f7291g.remove(pair);
        }
        if (!z11 && FragmentNavigator.n()) {
            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + navBackStackEntry);
        }
        boolean z12 = pair != null && ((Boolean) pair.f23090b).booleanValue();
        if (!z10 && !z12 && navBackStackEntry == null) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.k("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (navBackStackEntry != null) {
            fragmentNavigator.l(fragment, navBackStackEntry, mVar);
            if (z11) {
                if (FragmentNavigator.n()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + navBackStackEntry + " via system back");
                }
                mVar.e(navBackStackEntry, false);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void b(Fragment fragment, boolean z10) {
        NavBackStackEntry navBackStackEntry;
        if (z10) {
            m mVar = this.f3786a;
            List<NavBackStackEntry> value = mVar.f3629e.getValue();
            ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    navBackStackEntry = null;
                    break;
                } else {
                    navBackStackEntry = listIterator.previous();
                    if (kotlin.jvm.internal.f.b(navBackStackEntry.f7137f, fragment.getTag())) {
                        break;
                    }
                }
            }
            NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
            this.f3787b.getClass();
            if (FragmentNavigator.n()) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + navBackStackEntry2);
            }
            if (navBackStackEntry2 != null) {
                mVar.f(navBackStackEntry2);
            }
        }
    }
}
