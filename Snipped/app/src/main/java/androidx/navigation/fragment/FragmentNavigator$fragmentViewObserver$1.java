package androidx.navigation.fragment;

import W0.c;
import androidx.lifecycle.InterfaceC0550p;
import androidx.navigation.NavBackStackEntry;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* compiled from: FragmentNavigator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "entry", "Landroidx/lifecycle/p;", "invoke", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/lifecycle/p;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FragmentNavigator$fragmentViewObserver$1 extends Lambda implements InterfaceC0646l<NavBackStackEntry, InterfaceC0550p> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FragmentNavigator f7304l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigator$fragmentViewObserver$1(FragmentNavigator fragmentNavigator) {
        super(1);
        this.f7304l = fragmentNavigator;
    }

    @Override // ca.InterfaceC0646l
    public final InterfaceC0550p invoke(NavBackStackEntry navBackStackEntry) {
        return new c(0, this.f7304l, navBackStackEntry);
    }
}
