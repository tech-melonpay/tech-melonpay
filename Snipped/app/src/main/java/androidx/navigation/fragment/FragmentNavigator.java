package androidx.navigation.fragment;

import O9.p;
import P9.k;
import P9.q;
import P9.s;
import R0.a;
import R0.e;
import U0.h;
import U0.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.C0527a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.p;
import androidx.fragment.app.FragmentManager.r;
import androidx.fragment.app.FragmentManager.s;
import androidx.lifecycle.A;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.InterfaceC0551q;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Q;
import androidx.lifecycle.W;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.g;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ja.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;

/* compiled from: FragmentNavigator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$b;", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@Navigator.b("fragment")
/* loaded from: classes.dex */
public class FragmentNavigator extends Navigator<b> {

    /* renamed from: c, reason: collision with root package name */
    public final Context f7287c;

    /* renamed from: d, reason: collision with root package name */
    public final FragmentManager f7288d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7289e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f7290f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7291g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final h f7292h = new h(this, 1);
    public final InterfaceC0646l<NavBackStackEntry, InterfaceC0550p> i = new FragmentNavigator$fragmentViewObserver$1(this);

    /* compiled from: FragmentNavigator.kt */
    public static final class a extends Q {

        /* renamed from: k, reason: collision with root package name */
        public WeakReference<InterfaceC0635a<p>> f7293k;

        @Override // androidx.lifecycle.Q
        public final void onCleared() {
            super.onCleared();
            WeakReference<InterfaceC0635a<p>> weakReference = this.f7293k;
            if (weakReference == null) {
                weakReference = null;
            }
            InterfaceC0635a<p> interfaceC0635a = weakReference.get();
            if (interfaceC0635a != null) {
                interfaceC0635a.invoke();
            }
        }
    }

    /* compiled from: FragmentNavigator.kt */
    public static class b extends androidx.navigation.c {

        /* renamed from: l, reason: collision with root package name */
        public String f7302l;

        public b() {
            throw null;
        }

        @Override // androidx.navigation.c
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            return super.equals(obj) && f.b(this.f7302l, ((b) obj).f7302l);
        }

        @Override // androidx.navigation.c
        public final void g(Context context, AttributeSet attributeSet) {
            super.g(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, W0.f.f3791b);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f7302l = string;
            }
            p pVar = p.f3034a;
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.c
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f7302l;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.c
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f7302l;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            return sb2.toString();
        }
    }

    /* compiled from: FragmentNavigator.kt */
    public static final class c implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f7303a;

        public c(InterfaceC0646l interfaceC0646l) {
            this.f7303a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f7303a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f7303a.invoke(obj);
        }
    }

    public FragmentNavigator(Context context, FragmentManager fragmentManager, int i) {
        this.f7287c = context;
        this.f7288d = fragmentManager;
        this.f7289e = i;
    }

    public static void k(FragmentNavigator fragmentNavigator, final String str, boolean z10, int i) {
        if ((i & 2) != 0) {
            z10 = false;
        }
        boolean z11 = (i & 4) != 0;
        ArrayList arrayList = fragmentNavigator.f7291g;
        if (z11) {
            q.z(arrayList, new InterfaceC0646l<Pair<? extends String, ? extends Boolean>, Boolean>() { // from class: androidx.navigation.fragment.FragmentNavigator$addPendingOps$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // ca.InterfaceC0646l
                public final Boolean invoke(Pair<? extends String, ? extends Boolean> pair) {
                    return Boolean.valueOf(f.b(pair.f23089a, str));
                }
            });
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z10)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // androidx.navigation.Navigator
    public final b a() {
        return new b(this);
    }

    @Override // androidx.navigation.Navigator
    public final void d(List list, g gVar) {
        FragmentManager fragmentManager = this.f7288d;
        if (fragmentManager.R()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            boolean isEmpty = b().f3629e.getValue().isEmpty();
            if (gVar == null || isEmpty || !gVar.f7314b || !this.f7290f.remove(navBackStackEntry.f7137f)) {
                C0527a m2 = m(navBackStackEntry, gVar);
                if (!isEmpty) {
                    NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) s.R(b().f3629e.getValue());
                    if (navBackStackEntry2 != null) {
                        k(this, navBackStackEntry2.f7137f, false, 6);
                    }
                    String str = navBackStackEntry.f7137f;
                    k(this, str, false, 6);
                    m2.c(str);
                }
                m2.h();
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + navBackStackEntry);
                }
                b().h(navBackStackEntry);
            } else {
                fragmentManager.z(fragmentManager.new r(navBackStackEntry.f7137f), false);
                b().h(navBackStackEntry);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    public final void e(final NavController.NavControllerNavigatorState navControllerNavigatorState) {
        super.e(navControllerNavigatorState);
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        androidx.fragment.app.r rVar = new androidx.fragment.app.r() { // from class: androidx.navigation.fragment.a
            @Override // androidx.fragment.app.r
            public final void a(final Fragment fragment) {
                NavBackStackEntry navBackStackEntry;
                m mVar = navControllerNavigatorState;
                List<NavBackStackEntry> value = mVar.f3629e.getValue();
                ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        navBackStackEntry = null;
                        break;
                    } else {
                        navBackStackEntry = listIterator.previous();
                        if (f.b(navBackStackEntry.f7137f, fragment.getTag())) {
                            break;
                        }
                    }
                }
                final NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                final FragmentNavigator fragmentNavigator = this;
                fragmentNavigator.getClass();
                if (FragmentNavigator.n()) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + navBackStackEntry2 + " to FragmentManager " + fragmentNavigator.f7288d);
                }
                if (navBackStackEntry2 != null) {
                    fragment.getViewLifecycleOwnerLiveData().observe(fragment, new FragmentNavigator.c(new InterfaceC0646l<androidx.lifecycle.r, p>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachObservers$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // ca.InterfaceC0646l
                        public final p invoke(androidx.lifecycle.r rVar2) {
                            androidx.lifecycle.r rVar3 = rVar2;
                            FragmentNavigator fragmentNavigator2 = FragmentNavigator.this;
                            ArrayList arrayList = fragmentNavigator2.f7291g;
                            boolean z10 = arrayList instanceof Collection;
                            boolean z11 = false;
                            Fragment fragment2 = fragment;
                            if (!z10 || !arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (f.b(((Pair) it.next()).f23089a, fragment2.getTag())) {
                                        z11 = true;
                                        break;
                                    }
                                }
                            }
                            if (rVar3 != null && !z11) {
                                Lifecycle lifecycle = fragment2.getViewLifecycleOwner().getLifecycle();
                                if (lifecycle.b().a(Lifecycle.State.f6977c)) {
                                    lifecycle.a((InterfaceC0551q) ((FragmentNavigator$fragmentViewObserver$1) fragmentNavigator2.i).invoke(navBackStackEntry2));
                                }
                            }
                            return p.f3034a;
                        }
                    }));
                    fragment.getLifecycle().a(fragmentNavigator.f7292h);
                    fragmentNavigator.l(fragment, navBackStackEntry2, mVar);
                }
            }
        };
        FragmentManager fragmentManager = this.f7288d;
        fragmentManager.f6748q.add(rVar);
        fragmentManager.f6746o.add(new W0.d(navControllerNavigatorState, this));
    }

    @Override // androidx.navigation.Navigator
    public final void f(NavBackStackEntry navBackStackEntry) {
        FragmentManager fragmentManager = this.f7288d;
        if (fragmentManager.R()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C0527a m2 = m(navBackStackEntry, null);
        List<NavBackStackEntry> value = b().f3629e.getValue();
        if (value.size() > 1) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) s.M(P9.m.p(value) - 1, value);
            if (navBackStackEntry2 != null) {
                k(this, navBackStackEntry2.f7137f, false, 6);
            }
            String str = navBackStackEntry.f7137f;
            k(this, str, true, 4);
            fragmentManager.z(fragmentManager.new p(str, -1, 1), false);
            k(this, str, false, 2);
            m2.c(str);
        }
        m2.h();
        b().c(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f7290f;
            linkedHashSet.clear();
            q.x(linkedHashSet, stringArrayList);
        }
    }

    @Override // androidx.navigation.Navigator
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f7290f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return t0.c.b(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // androidx.navigation.Navigator
    public final void i(NavBackStackEntry navBackStackEntry, boolean z10) {
        FragmentManager fragmentManager = this.f7288d;
        if (fragmentManager.R()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<NavBackStackEntry> value = b().f3629e.getValue();
        int indexOf = value.indexOf(navBackStackEntry);
        List<NavBackStackEntry> subList = value.subList(indexOf, value.size());
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) s.J(value);
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) s.M(indexOf - 1, value);
        if (navBackStackEntry3 != null) {
            k(this, navBackStackEntry3.f7137f, false, 6);
        }
        List<NavBackStackEntry> list = subList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) obj;
            if (!kotlin.sequences.a.f(new o(new k(this.f7291g, 1), new InterfaceC0646l<Pair<? extends String, ? extends Boolean>, String>() { // from class: androidx.navigation.fragment.FragmentNavigator$popBackStack$1$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // ca.InterfaceC0646l
                public final String invoke(Pair<? extends String, ? extends Boolean> pair) {
                    return (String) pair.f23089a;
                }
            }), navBackStackEntry4.f7137f)) {
                if (!f.b(navBackStackEntry4.f7137f, navBackStackEntry2.f7137f)) {
                }
            }
            arrayList.add(obj);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k(this, ((NavBackStackEntry) it.next()).f7137f, true, 4);
        }
        if (z10) {
            for (NavBackStackEntry navBackStackEntry5 : s.W(list)) {
                if (f.b(navBackStackEntry5, navBackStackEntry2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + navBackStackEntry5);
                } else {
                    fragmentManager.z(fragmentManager.new s(navBackStackEntry5.f7137f), false);
                    this.f7290f.add(navBackStackEntry5.f7137f);
                }
            }
        } else {
            fragmentManager.z(fragmentManager.new p(navBackStackEntry.f7137f, -1, 1), false);
        }
        if (n()) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + navBackStackEntry + " with savedState " + z10);
        }
        b().e(navBackStackEntry, z10);
    }

    public final void l(final Fragment fragment, final NavBackStackEntry navBackStackEntry, final m mVar) {
        W viewModelStore = fragment.getViewModelStore();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FragmentNavigator$attachClearViewModel$viewModel$1$1 fragmentNavigator$attachClearViewModel$viewModel$1$1 = new InterfaceC0646l<R0.a, a>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachClearViewModel$viewModel$1$1
            @Override // ca.InterfaceC0646l
            public final FragmentNavigator.a invoke(R0.a aVar) {
                return new FragmentNavigator.a();
            }
        };
        kotlin.jvm.internal.b a10 = kotlin.jvm.internal.h.a(a.class);
        if (!(!linkedHashMap.containsKey(a10))) {
            throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + a10.b() + '.').toString());
        }
        linkedHashMap.put(a10, new R0.d(a10, fragmentNavigator$attachClearViewModel$viewModel$1$1));
        R0.d[] dVarArr = (R0.d[]) linkedHashMap.values().toArray(new R0.d[0]);
        e eVar = new e(viewModelStore, new R0.b((R0.d[]) Arrays.copyOf(dVarArr, dVarArr.length)), a.C0040a.f3236b);
        kotlin.jvm.internal.b a11 = kotlin.jvm.internal.h.a(a.class);
        String b9 = a11.b();
        if (b9 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        ((a) eVar.a(a11, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b9))).f7293k = new WeakReference<>(new InterfaceC0635a<O9.p>(navBackStackEntry, mVar, this, fragment) { // from class: androidx.navigation.fragment.FragmentNavigator$attachClearViewModel$1

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ m f7295l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ FragmentNavigator f7296m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Fragment f7297n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f7295l = mVar;
                this.f7296m = this;
                this.f7297n = fragment;
            }

            @Override // ca.InterfaceC0635a
            public final O9.p invoke() {
                m mVar2 = this.f7295l;
                for (NavBackStackEntry navBackStackEntry2 : mVar2.f3630f.getValue()) {
                    this.f7296m.getClass();
                    if (FragmentNavigator.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry2 + " due to fragment " + this.f7297n + " viewmodel being cleared");
                    }
                    mVar2.b(navBackStackEntry2);
                }
                return O9.p.f3034a;
            }
        });
    }

    public final C0527a m(NavBackStackEntry navBackStackEntry, g gVar) {
        b bVar = (b) navBackStackEntry.f7133b;
        Bundle a10 = navBackStackEntry.a();
        String str = bVar.f7302l;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set".toString());
        }
        char charAt = str.charAt(0);
        Context context = this.f7287c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        FragmentManager fragmentManager = this.f7288d;
        androidx.fragment.app.k L7 = fragmentManager.L();
        context.getClassLoader();
        Fragment a11 = L7.a(str);
        a11.setArguments(a10);
        C0527a c0527a = new C0527a(fragmentManager);
        int i = gVar != null ? gVar.f7318f : -1;
        int i9 = gVar != null ? gVar.f7319g : -1;
        int i10 = gVar != null ? gVar.f7320h : -1;
        int i11 = gVar != null ? gVar.i : -1;
        if (i != -1 || i9 != -1 || i10 != -1 || i11 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i9 == -1) {
                i9 = 0;
            }
            if (i10 == -1) {
                i10 = 0;
            }
            int i12 = i11 != -1 ? i11 : 0;
            c0527a.f6920b = i;
            c0527a.f6921c = i9;
            c0527a.f6922d = i10;
            c0527a.f6923e = i12;
        }
        c0527a.e(this.f7289e, a11, navBackStackEntry.f7137f);
        c0527a.n(a11);
        c0527a.f6933p = true;
        return c0527a;
    }
}
