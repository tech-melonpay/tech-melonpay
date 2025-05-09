package W0;

import P9.D;
import P9.s;
import U0.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.Navigator;
import androidx.navigation.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: DialogFragmentNavigator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LW0/b;", "Landroidx/navigation/Navigator;", "LW0/b$a;", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@Navigator.b("dialog")
/* loaded from: classes.dex */
public final class b extends Navigator<a> {

    /* renamed from: c, reason: collision with root package name */
    public final Context f3775c;

    /* renamed from: d, reason: collision with root package name */
    public final FragmentManager f3776d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f3777e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final C0046b f3778f = new C0046b();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f3779g = new LinkedHashMap();

    /* compiled from: DialogFragmentNavigator.kt */
    public static class a extends androidx.navigation.c implements U0.c {

        /* renamed from: l, reason: collision with root package name */
        public String f3780l;

        public a() {
            throw null;
        }

        @Override // androidx.navigation.c
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            return super.equals(obj) && kotlin.jvm.internal.f.b(this.f3780l, ((a) obj).f3780l);
        }

        @Override // androidx.navigation.c
        public final void g(Context context, AttributeSet attributeSet) {
            super.g(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, f.f3790a);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f3780l = string;
            }
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.c
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f3780l;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    /* compiled from: DialogFragmentNavigator.kt */
    /* renamed from: W0.b$b, reason: collision with other inner class name */
    public static final class C0046b implements InterfaceC0550p {

        /* compiled from: DialogFragmentNavigator.kt */
        /* renamed from: W0.b$b$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3782a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f3782a = iArr;
            }
        }

        public C0046b() {
        }

        @Override // androidx.lifecycle.InterfaceC0550p
        public final void d(r rVar, Lifecycle.Event event) {
            int i;
            int i9 = a.f3782a[event.ordinal()];
            b bVar = b.this;
            if (i9 == 1) {
                DialogInterfaceOnCancelListenerC0530d dialogInterfaceOnCancelListenerC0530d = (DialogInterfaceOnCancelListenerC0530d) rVar;
                List<NavBackStackEntry> value = bVar.b().f3629e.getValue();
                if (!(value instanceof Collection) || !value.isEmpty()) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.f.b(((NavBackStackEntry) it.next()).f7137f, dialogInterfaceOnCancelListenerC0530d.getTag())) {
                            return;
                        }
                    }
                }
                dialogInterfaceOnCancelListenerC0530d.dismiss();
                return;
            }
            Object obj = null;
            if (i9 == 2) {
                DialogInterfaceOnCancelListenerC0530d dialogInterfaceOnCancelListenerC0530d2 = (DialogInterfaceOnCancelListenerC0530d) rVar;
                for (Object obj2 : bVar.b().f3630f.getValue()) {
                    if (kotlin.jvm.internal.f.b(((NavBackStackEntry) obj2).f7137f, dialogInterfaceOnCancelListenerC0530d2.getTag())) {
                        obj = obj2;
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (navBackStackEntry != null) {
                    bVar.b().b(navBackStackEntry);
                    return;
                }
                return;
            }
            if (i9 != 3) {
                if (i9 != 4) {
                    return;
                }
                DialogInterfaceOnCancelListenerC0530d dialogInterfaceOnCancelListenerC0530d3 = (DialogInterfaceOnCancelListenerC0530d) rVar;
                for (Object obj3 : bVar.b().f3630f.getValue()) {
                    if (kotlin.jvm.internal.f.b(((NavBackStackEntry) obj3).f7137f, dialogInterfaceOnCancelListenerC0530d3.getTag())) {
                        obj = obj3;
                    }
                }
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
                if (navBackStackEntry2 != null) {
                    bVar.b().b(navBackStackEntry2);
                }
                dialogInterfaceOnCancelListenerC0530d3.getLifecycle().c(this);
                return;
            }
            DialogInterfaceOnCancelListenerC0530d dialogInterfaceOnCancelListenerC0530d4 = (DialogInterfaceOnCancelListenerC0530d) rVar;
            if (dialogInterfaceOnCancelListenerC0530d4.requireDialog().isShowing()) {
                return;
            }
            List<NavBackStackEntry> value2 = bVar.b().f3629e.getValue();
            ListIterator<NavBackStackEntry> listIterator = value2.listIterator(value2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (kotlin.jvm.internal.f.b(listIterator.previous().f7137f, dialogInterfaceOnCancelListenerC0530d4.getTag())) {
                        i = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) s.M(i, value2);
            if (!kotlin.jvm.internal.f.b(s.R(value2), navBackStackEntry3)) {
                Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC0530d4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            if (navBackStackEntry3 != null) {
                bVar.l(i, navBackStackEntry3, false);
            }
        }
    }

    public b(Context context, FragmentManager fragmentManager) {
        this.f3775c = context;
        this.f3776d = fragmentManager;
    }

    @Override // androidx.navigation.Navigator
    public final a a() {
        return new a(this);
    }

    @Override // androidx.navigation.Navigator
    public final void d(List list, g gVar) {
        FragmentManager fragmentManager = this.f3776d;
        if (fragmentManager.R()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            k(navBackStackEntry).show(fragmentManager, navBackStackEntry.f7137f);
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) s.R(b().f3629e.getValue());
            boolean E8 = s.E(b().f3630f.getValue(), navBackStackEntry2);
            b().h(navBackStackEntry);
            if (navBackStackEntry2 != null && !E8) {
                b().b(navBackStackEntry2);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    public final void e(NavController.NavControllerNavigatorState navControllerNavigatorState) {
        Lifecycle lifecycle;
        super.e(navControllerNavigatorState);
        Iterator<NavBackStackEntry> it = navControllerNavigatorState.f3629e.getValue().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            FragmentManager fragmentManager = this.f3776d;
            if (!hasNext) {
                fragmentManager.f6748q.add(new androidx.fragment.app.r() { // from class: W0.a
                    @Override // androidx.fragment.app.r
                    public final void a(Fragment fragment) {
                        b bVar = b.this;
                        LinkedHashSet linkedHashSet = bVar.f3777e;
                        String tag = fragment.getTag();
                        j.a(linkedHashSet);
                        if (linkedHashSet.remove(tag)) {
                            fragment.getLifecycle().a(bVar.f3778f);
                        }
                        LinkedHashMap linkedHashMap = bVar.f3779g;
                        String tag2 = fragment.getTag();
                        j.b(linkedHashMap);
                        linkedHashMap.remove(tag2);
                    }
                });
                return;
            }
            NavBackStackEntry next = it.next();
            DialogInterfaceOnCancelListenerC0530d dialogInterfaceOnCancelListenerC0530d = (DialogInterfaceOnCancelListenerC0530d) fragmentManager.G(next.f7137f);
            if (dialogInterfaceOnCancelListenerC0530d == null || (lifecycle = dialogInterfaceOnCancelListenerC0530d.getLifecycle()) == null) {
                this.f3777e.add(next.f7137f);
            } else {
                lifecycle.a(this.f3778f);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    public final void f(NavBackStackEntry navBackStackEntry) {
        FragmentManager fragmentManager = this.f3776d;
        if (fragmentManager.R()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        LinkedHashMap linkedHashMap = this.f3779g;
        String str = navBackStackEntry.f7137f;
        DialogInterfaceOnCancelListenerC0530d dialogInterfaceOnCancelListenerC0530d = (DialogInterfaceOnCancelListenerC0530d) linkedHashMap.get(str);
        if (dialogInterfaceOnCancelListenerC0530d == null) {
            Fragment G8 = fragmentManager.G(str);
            dialogInterfaceOnCancelListenerC0530d = G8 instanceof DialogInterfaceOnCancelListenerC0530d ? (DialogInterfaceOnCancelListenerC0530d) G8 : null;
        }
        if (dialogInterfaceOnCancelListenerC0530d != null) {
            dialogInterfaceOnCancelListenerC0530d.getLifecycle().c(this.f3778f);
            dialogInterfaceOnCancelListenerC0530d.dismiss();
        }
        k(navBackStackEntry).show(fragmentManager, str);
        m b9 = b();
        List<NavBackStackEntry> value = b9.f3629e.getValue();
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry previous = listIterator.previous();
            if (kotlin.jvm.internal.f.b(previous.f7137f, str)) {
                MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow = b9.f3627c;
                mutableStateFlow.setValue(D.o(D.o(mutableStateFlow.getValue(), previous), navBackStackEntry));
                b9.c(navBackStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // androidx.navigation.Navigator
    public final void i(NavBackStackEntry navBackStackEntry, boolean z10) {
        FragmentManager fragmentManager = this.f3776d;
        if (fragmentManager.R()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<NavBackStackEntry> value = b().f3629e.getValue();
        int indexOf = value.indexOf(navBackStackEntry);
        Iterator it = s.W(value.subList(indexOf, value.size())).iterator();
        while (it.hasNext()) {
            Fragment G8 = fragmentManager.G(((NavBackStackEntry) it.next()).f7137f);
            if (G8 != null) {
                ((DialogInterfaceOnCancelListenerC0530d) G8).dismiss();
            }
        }
        l(indexOf, navBackStackEntry, z10);
    }

    public final DialogInterfaceOnCancelListenerC0530d k(NavBackStackEntry navBackStackEntry) {
        a aVar = (a) navBackStackEntry.f7133b;
        String str = aVar.f3780l;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set".toString());
        }
        char charAt = str.charAt(0);
        Context context = this.f3775c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        k L7 = this.f3776d.L();
        context.getClassLoader();
        Fragment a10 = L7.a(str);
        if (DialogInterfaceOnCancelListenerC0530d.class.isAssignableFrom(a10.getClass())) {
            DialogInterfaceOnCancelListenerC0530d dialogInterfaceOnCancelListenerC0530d = (DialogInterfaceOnCancelListenerC0530d) a10;
            dialogInterfaceOnCancelListenerC0530d.setArguments(navBackStackEntry.a());
            dialogInterfaceOnCancelListenerC0530d.getLifecycle().a(this.f3778f);
            this.f3779g.put(navBackStackEntry.f7137f, dialogInterfaceOnCancelListenerC0530d);
            return dialogInterfaceOnCancelListenerC0530d;
        }
        StringBuilder sb2 = new StringBuilder("Dialog destination ");
        String str2 = aVar.f3780l;
        if (str2 != null) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.n(sb2, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set".toString());
    }

    public final void l(int i, NavBackStackEntry navBackStackEntry, boolean z10) {
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) s.M(i - 1, b().f3629e.getValue());
        boolean E8 = s.E(b().f3630f.getValue(), navBackStackEntry2);
        b().e(navBackStackEntry, z10);
        if (navBackStackEntry2 == null || E8) {
            return;
        }
        b().b(navBackStackEntry2);
    }
}
