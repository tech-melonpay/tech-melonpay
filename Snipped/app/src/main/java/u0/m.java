package U0;

import O9.p;
import P9.D;
import P9.s;
import P9.z;
import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: NavigatorState.kt */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f3625a = new ReentrantLock(true);

    /* renamed from: b, reason: collision with root package name */
    public final MutableStateFlow<List<NavBackStackEntry>> f3626b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableStateFlow<Set<NavBackStackEntry>> f3627c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3628d;

    /* renamed from: e, reason: collision with root package name */
    public final StateFlow<List<NavBackStackEntry>> f3629e;

    /* renamed from: f, reason: collision with root package name */
    public final StateFlow<Set<NavBackStackEntry>> f3630f;

    public m() {
        MutableStateFlow<List<NavBackStackEntry>> MutableStateFlow = StateFlowKt.MutableStateFlow(EmptyList.f23104a);
        this.f3626b = MutableStateFlow;
        MutableStateFlow<Set<NavBackStackEntry>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(EmptySet.f23106a);
        this.f3627c = MutableStateFlow2;
        this.f3629e = FlowKt.asStateFlow(MutableStateFlow);
        this.f3630f = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public abstract NavBackStackEntry a(androidx.navigation.c cVar, Bundle bundle);

    public void b(NavBackStackEntry navBackStackEntry) {
        MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow = this.f3627c;
        Set<NavBackStackEntry> value = mutableStateFlow.getValue();
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.n(value.size()));
        boolean z10 = false;
        for (Object obj : value) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.f.b(obj, navBackStackEntry)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj);
            }
        }
        mutableStateFlow.setValue(linkedHashSet);
    }

    public final void c(NavBackStackEntry navBackStackEntry) {
        int i;
        ReentrantLock reentrantLock = this.f3625a;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList(this.f3629e.getValue());
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                } else if (kotlin.jvm.internal.f.b(((NavBackStackEntry) listIterator.previous()).f7137f, navBackStackEntry.f7137f)) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            arrayList.set(i, navBackStackEntry);
            this.f3626b.setValue(arrayList);
            p pVar = p.f3034a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void d(NavBackStackEntry navBackStackEntry, boolean z10) {
        ReentrantLock reentrantLock = this.f3625a;
        reentrantLock.lock();
        try {
            MutableStateFlow<List<NavBackStackEntry>> mutableStateFlow = this.f3626b;
            List<NavBackStackEntry> value = mutableStateFlow.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (!(!kotlin.jvm.internal.f.b((NavBackStackEntry) obj, navBackStackEntry))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            mutableStateFlow.setValue(arrayList);
            p pVar = p.f3034a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void e(NavBackStackEntry navBackStackEntry, boolean z10) {
        NavBackStackEntry navBackStackEntry2;
        MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow = this.f3627c;
        Set<NavBackStackEntry> value = mutableStateFlow.getValue();
        boolean z11 = value instanceof Collection;
        StateFlow<List<NavBackStackEntry>> stateFlow = this.f3629e;
        if (!z11 || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == navBackStackEntry) {
                    List<NavBackStackEntry> value2 = stateFlow.getValue();
                    if ((value2 instanceof Collection) && value2.isEmpty()) {
                        return;
                    }
                    Iterator<T> it2 = value2.iterator();
                    while (it2.hasNext()) {
                        if (((NavBackStackEntry) it2.next()) == navBackStackEntry) {
                        }
                    }
                    return;
                }
            }
        }
        mutableStateFlow.setValue(D.o(mutableStateFlow.getValue(), navBackStackEntry));
        List<NavBackStackEntry> value3 = stateFlow.getValue();
        ListIterator<NavBackStackEntry> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry2 = null;
                break;
            }
            navBackStackEntry2 = listIterator.previous();
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!kotlin.jvm.internal.f.b(navBackStackEntry3, navBackStackEntry) && stateFlow.getValue().lastIndexOf(navBackStackEntry3) < stateFlow.getValue().lastIndexOf(navBackStackEntry)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry4 = navBackStackEntry2;
        if (navBackStackEntry4 != null) {
            mutableStateFlow.setValue(D.o(mutableStateFlow.getValue(), navBackStackEntry4));
        }
        d(navBackStackEntry, z10);
    }

    public void f(NavBackStackEntry navBackStackEntry) {
        MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow = this.f3627c;
        mutableStateFlow.setValue(D.o(mutableStateFlow.getValue(), navBackStackEntry));
    }

    public void g(NavBackStackEntry navBackStackEntry) {
        ReentrantLock reentrantLock = this.f3625a;
        reentrantLock.lock();
        try {
            MutableStateFlow<List<NavBackStackEntry>> mutableStateFlow = this.f3626b;
            mutableStateFlow.setValue(s.T(navBackStackEntry, mutableStateFlow.getValue()));
            p pVar = p.f3034a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void h(NavBackStackEntry navBackStackEntry) {
        MutableStateFlow<Set<NavBackStackEntry>> mutableStateFlow = this.f3627c;
        Set<NavBackStackEntry> value = mutableStateFlow.getValue();
        boolean z10 = value instanceof Collection;
        StateFlow<List<NavBackStackEntry>> stateFlow = this.f3629e;
        if (!z10 || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == navBackStackEntry) {
                    List<NavBackStackEntry> value2 = stateFlow.getValue();
                    if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                        Iterator<T> it2 = value2.iterator();
                        while (it2.hasNext()) {
                            if (((NavBackStackEntry) it2.next()) == navBackStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) s.R(stateFlow.getValue());
        if (navBackStackEntry2 != null) {
            mutableStateFlow.setValue(D.o(mutableStateFlow.getValue(), navBackStackEntry2));
        }
        mutableStateFlow.setValue(D.o(mutableStateFlow.getValue(), navBackStackEntry));
        g(navBackStackEntry);
    }
}
