package W0;

import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C0540f;
import androidx.lifecycle.C0546l;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentNavigator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0550p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3785c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f3783a = i;
        this.f3784b = obj;
        this.f3785c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        switch (this.f3783a) {
            case 0:
                Lifecycle.Event event2 = Lifecycle.Event.ON_RESUME;
                FragmentNavigator fragmentNavigator = (FragmentNavigator) this.f3784b;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f3785c;
                if (event == event2 && fragmentNavigator.b().f3629e.getValue().contains(navBackStackEntry)) {
                    if (FragmentNavigator.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + rVar + " view lifecycle reaching RESUMED");
                    }
                    fragmentNavigator.b().b(navBackStackEntry);
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    fragmentNavigator.getClass();
                    if (FragmentNavigator.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + rVar + " view lifecycle reaching DESTROYED");
                    }
                    fragmentNavigator.b().b(navBackStackEntry);
                    return;
                }
                return;
            case 1:
                Lifecycle.State b9 = rVar.getLifecycle().b();
                Lifecycle.State state = Lifecycle.State.f6975a;
                C0546l c0546l = (C0546l) this.f3784b;
                if (b9 == state) {
                    Job.DefaultImpls.cancel$default((Job) this.f3785c, (CancellationException) null, 1, (Object) null);
                    c0546l.a();
                    return;
                }
                int compareTo = rVar.getLifecycle().b().compareTo(c0546l.f7089b);
                C0540f c0540f = c0546l.f7090c;
                if (compareTo < 0) {
                    c0540f.f7082a = true;
                    return;
                } else {
                    if (c0540f.f7082a) {
                        if (!(!c0540f.f7083b)) {
                            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                        }
                        c0540f.f7082a = false;
                        c0540f.b();
                        return;
                    }
                    return;
                }
            default:
                ComponentActivity.addObserverForBackInvoker$lambda$7((androidx.activity.a) this.f3784b, (ComponentActivity) this.f3785c, rVar, event);
                return;
        }
    }
}
