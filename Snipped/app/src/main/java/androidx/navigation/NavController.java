package androidx.navigation;

import O9.p;
import P9.q;
import P9.s;
import U0.k;
import U0.m;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.W;
import androidx.lifecycle.r;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.c;
import c.AbstractC0618i;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ja.l;
import ja.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: NavController.kt */
/* loaded from: classes.dex */
public class NavController {

    /* renamed from: A, reason: collision with root package name */
    public final LinkedHashMap f7150A;

    /* renamed from: B, reason: collision with root package name */
    public int f7151B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f7152C;

    /* renamed from: D, reason: collision with root package name */
    public final O9.f f7153D;

    /* renamed from: E, reason: collision with root package name */
    public final MutableSharedFlow<NavBackStackEntry> f7154E;

    /* renamed from: F, reason: collision with root package name */
    public final SharedFlow f7155F;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7156a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f7157b;

    /* renamed from: c, reason: collision with root package name */
    public d f7158c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f7159d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable[] f7160e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7161f;

    /* renamed from: g, reason: collision with root package name */
    public final P9.h<NavBackStackEntry> f7162g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableStateFlow<List<NavBackStackEntry>> f7163h;
    public final StateFlow<List<NavBackStackEntry>> i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableStateFlow<List<NavBackStackEntry>> f7164j;

    /* renamed from: k, reason: collision with root package name */
    public final StateFlow<List<NavBackStackEntry>> f7165k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f7166l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f7167m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f7168n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f7169o;

    /* renamed from: p, reason: collision with root package name */
    public r f7170p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.navigation.b f7171q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f7172r;

    /* renamed from: s, reason: collision with root package name */
    public Lifecycle.State f7173s;

    /* renamed from: t, reason: collision with root package name */
    public final U0.h f7174t;

    /* renamed from: u, reason: collision with root package name */
    public final b f7175u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f7176v;

    /* renamed from: w, reason: collision with root package name */
    public final j f7177w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f7178x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC0646l<? super NavBackStackEntry, p> f7179y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0646l<? super NavBackStackEntry, p> f7180z;

    /* compiled from: NavController.kt */
    public final class NavControllerNavigatorState extends m {

        /* renamed from: g, reason: collision with root package name */
        public final Navigator<? extends c> f7181g;

        public NavControllerNavigatorState(Navigator<? extends c> navigator) {
            this.f7181g = navigator;
        }

        @Override // U0.m
        public final NavBackStackEntry a(c cVar, Bundle bundle) {
            NavController navController = NavController.this;
            return NavBackStackEntry.a.a(navController.f7156a, cVar, bundle, navController.g(), navController.f7171q);
        }

        @Override // U0.m
        public final void b(NavBackStackEntry navBackStackEntry) {
            androidx.navigation.b bVar;
            W w2;
            NavController navController = NavController.this;
            boolean b9 = kotlin.jvm.internal.f.b(navController.f7150A.get(navBackStackEntry), Boolean.TRUE);
            super.b(navBackStackEntry);
            navController.f7150A.remove(navBackStackEntry);
            P9.h<NavBackStackEntry> hVar = navController.f7162g;
            boolean contains = hVar.contains(navBackStackEntry);
            MutableStateFlow<List<NavBackStackEntry>> mutableStateFlow = navController.f7164j;
            if (contains) {
                if (this.f3628d) {
                    return;
                }
                navController.v();
                navController.f7163h.tryEmit(new ArrayList(hVar));
                mutableStateFlow.tryEmit(navController.r());
                return;
            }
            navController.u(navBackStackEntry);
            if (navBackStackEntry.f7139h.f7098d.a(Lifecycle.State.f6977c)) {
                navBackStackEntry.b(Lifecycle.State.f6975a);
            }
            boolean z10 = hVar instanceof Collection;
            String str = navBackStackEntry.f7137f;
            if (!z10 || !hVar.isEmpty()) {
                Iterator<NavBackStackEntry> it = hVar.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.f.b(it.next().f7137f, str)) {
                        break;
                    }
                }
            }
            if (!b9 && (bVar = navController.f7171q) != null && (w2 = (W) bVar.f7258k.remove(str)) != null) {
                w2.a();
            }
            navController.v();
            mutableStateFlow.tryEmit(navController.r());
        }

        @Override // U0.m
        public final void d(final NavBackStackEntry navBackStackEntry, final boolean z10) {
            NavController navController = NavController.this;
            Navigator b9 = navController.f7177w.b(navBackStackEntry.f7133b.f7260a);
            navController.f7150A.put(navBackStackEntry, Boolean.valueOf(z10));
            if (!kotlin.jvm.internal.f.b(b9, this.f7181g)) {
                ((NavControllerNavigatorState) navController.f7178x.get(b9)).d(navBackStackEntry, z10);
                return;
            }
            InterfaceC0646l<? super NavBackStackEntry, p> interfaceC0646l = navController.f7180z;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(navBackStackEntry);
                super.d(navBackStackEntry, z10);
                return;
            }
            InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a<p>() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$pop$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // ca.InterfaceC0635a
                public final p invoke() {
                    super/*U0.m*/.d(navBackStackEntry, z10);
                    return p.f3034a;
                }
            };
            P9.h<NavBackStackEntry> hVar = navController.f7162g;
            int indexOf = hVar.indexOf(navBackStackEntry);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + navBackStackEntry + " as it was not found on the current back stack");
                return;
            }
            int i = indexOf + 1;
            if (i != hVar.f3157c) {
                navController.n(hVar.get(i).f7133b.f7267h, true, false);
            }
            NavController.q(navController, navBackStackEntry);
            interfaceC0635a.invoke();
            navController.w();
            navController.b();
        }

        @Override // U0.m
        public final void e(NavBackStackEntry navBackStackEntry, boolean z10) {
            super.e(navBackStackEntry, z10);
        }

        @Override // U0.m
        public final void f(NavBackStackEntry navBackStackEntry) {
            super.f(navBackStackEntry);
            if (!NavController.this.f7162g.contains(navBackStackEntry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            navBackStackEntry.b(Lifecycle.State.f6978d);
        }

        @Override // U0.m
        public final void g(NavBackStackEntry navBackStackEntry) {
            NavController navController = NavController.this;
            Navigator b9 = navController.f7177w.b(navBackStackEntry.f7133b.f7260a);
            if (!kotlin.jvm.internal.f.b(b9, this.f7181g)) {
                Object obj = navController.f7178x.get(b9);
                if (obj == null) {
                    throw new IllegalStateException(androidx.camera.core.impl.utils.a.n(new StringBuilder("NavigatorBackStack for "), navBackStackEntry.f7133b.f7260a, " should already be created").toString());
                }
                ((NavControllerNavigatorState) obj).g(navBackStackEntry);
                return;
            }
            InterfaceC0646l<? super NavBackStackEntry, p> interfaceC0646l = navController.f7179y;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(navBackStackEntry);
                super.g(navBackStackEntry);
            } else {
                Log.i("NavController", "Ignoring add of destination " + navBackStackEntry.f7133b + " outside of the call to navigate(). ");
            }
        }

        public final void j(NavBackStackEntry navBackStackEntry) {
            super.g(navBackStackEntry);
        }
    }

    /* compiled from: NavController.kt */
    public interface a {
        void a();
    }

    /* compiled from: NavController.kt */
    public static final class b extends AbstractC0618i {
        public b() {
            super(false);
        }

        @Override // c.AbstractC0618i
        public final void b() {
            NavController.this.l();
        }
    }

    public NavController(Context context) {
        Object obj;
        this.f7156a = context;
        Iterator it = l.d(new InterfaceC0646l<Context, Context>() { // from class: androidx.navigation.NavController$activity$1
            @Override // ca.InterfaceC0646l
            public final Context invoke(Context context2) {
                Context context3 = context2;
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            }
        }, context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f7157b = (Activity) obj;
        this.f7162g = new P9.h<>();
        EmptyList emptyList = EmptyList.f23104a;
        MutableStateFlow<List<NavBackStackEntry>> MutableStateFlow = StateFlowKt.MutableStateFlow(emptyList);
        this.f7163h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<NavBackStackEntry>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(emptyList);
        this.f7164j = MutableStateFlow2;
        this.f7165k = FlowKt.asStateFlow(MutableStateFlow2);
        this.f7166l = new LinkedHashMap();
        this.f7167m = new LinkedHashMap();
        this.f7168n = new LinkedHashMap();
        this.f7169o = new LinkedHashMap();
        this.f7172r = new CopyOnWriteArrayList<>();
        this.f7173s = Lifecycle.State.f6976b;
        this.f7174t = new U0.h(this, 0);
        this.f7175u = new b();
        this.f7176v = true;
        j jVar = new j();
        this.f7177w = jVar;
        this.f7178x = new LinkedHashMap();
        this.f7150A = new LinkedHashMap();
        jVar.a(new e(jVar));
        jVar.a(new ActivityNavigator(this.f7156a));
        this.f7152C = new ArrayList();
        this.f7153D = kotlin.a.a(new InterfaceC0635a<f>() { // from class: androidx.navigation.NavController$navInflater$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final f invoke() {
                NavController navController = NavController.this;
                navController.getClass();
                return new f(navController.f7156a, navController.f7177w);
            }
        });
        MutableSharedFlow<NavBackStackEntry> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f7154E = MutableSharedFlow$default;
        this.f7155F = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public static c e(int i, c cVar, c cVar2, boolean z10) {
        if (cVar.f7267h == i && (cVar2 == null || (kotlin.jvm.internal.f.b(cVar, cVar2) && kotlin.jvm.internal.f.b(cVar.f7261b, cVar2.f7261b)))) {
            return cVar;
        }
        d dVar = cVar instanceof d ? (d) cVar : cVar.f7261b;
        return dVar.k(i, dVar, cVar2, z10);
    }

    public static /* synthetic */ void q(NavController navController, NavBackStackEntry navBackStackEntry) {
        navController.p(navBackStackEntry, false, new P9.h<>());
    }

    public final void a(c cVar, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        NavBackStackEntry navBackStackEntry2;
        NavBackStackEntry navBackStackEntry3;
        c cVar2 = navBackStackEntry.f7133b;
        boolean z10 = cVar2 instanceof U0.c;
        P9.h<NavBackStackEntry> hVar = this.f7162g;
        if (!z10) {
            while (!hVar.isEmpty() && (hVar.k().f7133b instanceof U0.c) && n(hVar.k().f7133b.f7267h, true, false)) {
            }
        }
        P9.h hVar2 = new P9.h();
        boolean z11 = cVar instanceof d;
        Context context = this.f7156a;
        NavBackStackEntry navBackStackEntry4 = null;
        if (z11) {
            c cVar3 = cVar2;
            do {
                cVar3 = cVar3.f7261b;
                if (cVar3 != null) {
                    ListIterator<NavBackStackEntry> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntry3 = null;
                            break;
                        } else {
                            navBackStackEntry3 = listIterator.previous();
                            if (kotlin.jvm.internal.f.b(navBackStackEntry3.f7133b, cVar3)) {
                                break;
                            }
                        }
                    }
                    NavBackStackEntry navBackStackEntry5 = navBackStackEntry3;
                    if (navBackStackEntry5 == null) {
                        navBackStackEntry5 = NavBackStackEntry.a.a(context, cVar3, bundle, g(), this.f7171q);
                    }
                    hVar2.addFirst(navBackStackEntry5);
                    if ((!hVar.isEmpty()) && hVar.k().f7133b == cVar3) {
                        q(this, hVar.k());
                    }
                }
                if (cVar3 == null) {
                    break;
                }
            } while (cVar3 != cVar);
        }
        c cVar4 = hVar2.isEmpty() ? cVar2 : ((NavBackStackEntry) hVar2.g()).f7133b;
        while (cVar4 != null && d(cVar4.f7267h, cVar4) != cVar4) {
            cVar4 = cVar4.f7261b;
            if (cVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator<NavBackStackEntry> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        navBackStackEntry2 = null;
                        break;
                    } else {
                        navBackStackEntry2 = listIterator2.previous();
                        if (kotlin.jvm.internal.f.b(navBackStackEntry2.f7133b, cVar4)) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntry6 = navBackStackEntry2;
                if (navBackStackEntry6 == null) {
                    navBackStackEntry6 = NavBackStackEntry.a.a(context, cVar4, cVar4.a(bundle2), g(), this.f7171q);
                }
                hVar2.addFirst(navBackStackEntry6);
            }
        }
        if (!hVar2.isEmpty()) {
            cVar2 = ((NavBackStackEntry) hVar2.g()).f7133b;
        }
        while (!hVar.isEmpty() && (hVar.k().f7133b instanceof d)) {
            if (((d) hVar.k().f7133b).f7276l.c(cVar2.f7267h) != null) {
                break;
            } else {
                q(this, hVar.k());
            }
        }
        NavBackStackEntry h9 = hVar.h();
        if (h9 == null) {
            h9 = (NavBackStackEntry) hVar2.h();
        }
        if (!kotlin.jvm.internal.f.b(h9 != null ? h9.f7133b : null, this.f7158c)) {
            ListIterator<NavBackStackEntry> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                NavBackStackEntry previous = listIterator3.previous();
                if (kotlin.jvm.internal.f.b(previous.f7133b, this.f7158c)) {
                    navBackStackEntry4 = previous;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry7 = navBackStackEntry4;
            if (navBackStackEntry7 == null) {
                d dVar = this.f7158c;
                navBackStackEntry7 = NavBackStackEntry.a.a(context, dVar, dVar.a(bundle), g(), this.f7171q);
            }
            hVar2.addFirst(navBackStackEntry7);
        }
        Iterator<E> it = hVar2.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry8 = (NavBackStackEntry) it.next();
            Object obj = this.f7178x.get(this.f7177w.b(navBackStackEntry8.f7133b.f7260a));
            if (obj == null) {
                throw new IllegalStateException(androidx.camera.core.impl.utils.a.n(new StringBuilder("NavigatorBackStack for "), cVar.f7260a, " should already be created").toString());
            }
            ((NavControllerNavigatorState) obj).j(navBackStackEntry8);
        }
        hVar.addAll(hVar2);
        hVar.addLast(navBackStackEntry);
        Iterator it2 = s.T(navBackStackEntry, hVar2).iterator();
        while (it2.hasNext()) {
            NavBackStackEntry navBackStackEntry9 = (NavBackStackEntry) it2.next();
            d dVar2 = navBackStackEntry9.f7133b.f7261b;
            if (dVar2 != null) {
                h(navBackStackEntry9, f(dVar2.f7267h));
            }
        }
    }

    public final boolean b() {
        P9.h<NavBackStackEntry> hVar;
        while (true) {
            hVar = this.f7162g;
            if (hVar.isEmpty() || !(hVar.k().f7133b instanceof d)) {
                break;
            }
            q(this, hVar.k());
        }
        NavBackStackEntry m2 = hVar.m();
        ArrayList arrayList = this.f7152C;
        if (m2 != null) {
            arrayList.add(m2);
        }
        this.f7151B++;
        v();
        int i = this.f7151B - 1;
        this.f7151B = i;
        if (i == 0) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
                Iterator<a> it2 = this.f7172r.iterator();
                while (it2.hasNext()) {
                    a next = it2.next();
                    c cVar = navBackStackEntry.f7133b;
                    navBackStackEntry.a();
                    next.a();
                }
                this.f7154E.tryEmit(navBackStackEntry);
            }
            this.f7163h.tryEmit(new ArrayList(hVar));
            this.f7164j.tryEmit(r());
        }
        return m2 != null;
    }

    public final boolean c(ArrayList arrayList, c cVar, boolean z10, final boolean z11) {
        String str;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final P9.h hVar = new P9.h();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Navigator navigator = (Navigator) it.next();
            final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            NavBackStackEntry k3 = this.f7162g.k();
            this.f7180z = new InterfaceC0646l<NavBackStackEntry, p>() { // from class: androidx.navigation.NavController$executePopOperations$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // ca.InterfaceC0646l
                public final p invoke(NavBackStackEntry navBackStackEntry) {
                    Ref$BooleanRef.this.f23175a = true;
                    ref$BooleanRef.f23175a = true;
                    boolean z12 = z11;
                    P9.h<NavBackStackEntryState> hVar2 = hVar;
                    this.p(navBackStackEntry, z12, hVar2);
                    return p.f3034a;
                }
            };
            navigator.i(k3, z11);
            this.f7180z = null;
            if (!ref$BooleanRef2.f23175a) {
                break;
            }
        }
        if (z11) {
            LinkedHashMap linkedHashMap = this.f7168n;
            if (!z10) {
                n.a aVar = new n.a(new n(l.d(new InterfaceC0646l<c, c>() { // from class: androidx.navigation.NavController$executePopOperations$2
                    @Override // ca.InterfaceC0646l
                    public final c invoke(c cVar2) {
                        c cVar3 = cVar2;
                        d dVar = cVar3.f7261b;
                        if (dVar == null || dVar.f7277m != cVar3.f7267h) {
                            return null;
                        }
                        return dVar;
                    }
                }, cVar), new InterfaceC0646l<c, Boolean>() { // from class: androidx.navigation.NavController$executePopOperations$3
                    {
                        super(1);
                    }

                    @Override // ca.InterfaceC0646l
                    public final Boolean invoke(c cVar2) {
                        return Boolean.valueOf(!NavController.this.f7168n.containsKey(Integer.valueOf(cVar2.f7267h)));
                    }
                }));
                while (aVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((c) aVar.next()).f7267h);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) hVar.h();
                    linkedHashMap.put(valueOf, navBackStackEntryState != null ? navBackStackEntryState.f7146a : null);
                }
            }
            if (!hVar.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) hVar.g();
                n.a aVar2 = new n.a(new n(l.d(new InterfaceC0646l<c, c>() { // from class: androidx.navigation.NavController$executePopOperations$5
                    @Override // ca.InterfaceC0646l
                    public final c invoke(c cVar2) {
                        c cVar3 = cVar2;
                        d dVar = cVar3.f7261b;
                        if (dVar == null || dVar.f7277m != cVar3.f7267h) {
                            return null;
                        }
                        return dVar;
                    }
                }, d(navBackStackEntryState2.f7147b, null)), new InterfaceC0646l<c, Boolean>() { // from class: androidx.navigation.NavController$executePopOperations$6
                    {
                        super(1);
                    }

                    @Override // ca.InterfaceC0646l
                    public final Boolean invoke(c cVar2) {
                        return Boolean.valueOf(!NavController.this.f7168n.containsKey(Integer.valueOf(cVar2.f7267h)));
                    }
                }));
                while (true) {
                    boolean hasNext = aVar2.hasNext();
                    str = navBackStackEntryState2.f7146a;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((c) aVar2.next()).f7267h), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.f7169o.put(str, hVar);
                }
            }
        }
        w();
        return ref$BooleanRef.f23175a;
    }

    public final c d(int i, c cVar) {
        c cVar2;
        d dVar = this.f7158c;
        if (dVar == null) {
            return null;
        }
        if (dVar.f7267h == i) {
            if (cVar == null) {
                return dVar;
            }
            if (kotlin.jvm.internal.f.b(dVar, cVar) && cVar.f7261b == null) {
                return this.f7158c;
            }
        }
        NavBackStackEntry m2 = this.f7162g.m();
        if (m2 == null || (cVar2 = m2.f7133b) == null) {
            cVar2 = this.f7158c;
        }
        return e(i, cVar2, cVar, false);
    }

    public final NavBackStackEntry f(int i) {
        NavBackStackEntry navBackStackEntry;
        P9.h<NavBackStackEntry> hVar = this.f7162g;
        ListIterator<NavBackStackEntry> listIterator = hVar.listIterator(hVar.a());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            if (navBackStackEntry.f7133b.f7267h == i) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        NavBackStackEntry m2 = hVar.m();
        l10.append(m2 != null ? m2.f7133b : null);
        throw new IllegalArgumentException(l10.toString().toString());
    }

    public final Lifecycle.State g() {
        return this.f7170p == null ? Lifecycle.State.f6977c : this.f7173s;
    }

    public final void h(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.f7166l.put(navBackStackEntry, navBackStackEntry2);
        LinkedHashMap linkedHashMap = this.f7167m;
        if (linkedHashMap.get(navBackStackEntry2) == null) {
            linkedHashMap.put(navBackStackEntry2, new AtomicInteger(0));
        }
        ((AtomicInteger) linkedHashMap.get(navBackStackEntry2)).incrementAndGet();
    }

    public final void i(int i, Bundle bundle) {
        int i9;
        g gVar;
        Bundle bundle2;
        P9.h<NavBackStackEntry> hVar = this.f7162g;
        c cVar = hVar.isEmpty() ? this.f7158c : hVar.k().f7133b;
        if (cVar == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        U0.d c2 = cVar.c(i);
        if (c2 != null) {
            gVar = c2.f3593b;
            Bundle bundle3 = c2.f3594c;
            i9 = c2.f3592a;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            } else {
                bundle2 = null;
            }
        } else {
            i9 = i;
            gVar = null;
            bundle2 = null;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i9 == 0 && gVar != null) {
            gVar.getClass();
            gVar.getClass();
            int i10 = gVar.f7315c;
            if (i10 != -1) {
                boolean z10 = gVar.f7316d;
                if (i10 != -1) {
                    m(i10, z10);
                    return;
                }
                return;
            }
        }
        if (i9 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        c d10 = d(i9, null);
        if (d10 != null) {
            k(d10, bundle2, gVar);
            return;
        }
        int i11 = c.f7259k;
        Context context = this.f7156a;
        String a10 = c.a.a(context, i9);
        if (c2 == null) {
            throw new IllegalArgumentException("Navigation action/destination " + a10 + " cannot be found from the current destination " + cVar);
        }
        StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Navigation destination ", a10, " referenced from action ");
        m2.append(c.a.a(context, i));
        m2.append(" cannot be found from the current destination ");
        m2.append(cVar);
        throw new IllegalArgumentException(m2.toString().toString());
    }

    public final void j(U0.i iVar) {
        i(iVar.b(), iVar.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
    
        if (kotlin.jvm.internal.f.b(r15, r7) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        r6 = new P9.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        if (P9.m.p(r12) < r14) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
    
        r7 = (androidx.navigation.NavBackStackEntry) P9.q.B(r12);
        u(r7);
        r13 = new androidx.navigation.NavBackStackEntry(r7.f7132a, r7.f7133b, r7.f7133b.a(r29), r7.f7135d, r7.f7136e, r7.f7137f, r7.f7138g);
        r13.f7135d = r7.f7135d;
        r13.b(r7.f7141k);
        r6.addFirst(r13);
        r14 = r14;
        r9 = r9;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0156, code lost:
    
        r26 = r3;
        r25 = r9;
        r3 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0162, code lost:
    
        if (r3.hasNext() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0164, code lost:
    
        r5 = (androidx.navigation.NavBackStackEntry) r3.next();
        r7 = r5.f7133b.f7261b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        if (r7 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0170, code lost:
    
        h(r5, f(r7.f7267h));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0179, code lost:
    
        r12.addLast(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
    
        r3 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0185, code lost:
    
        if (r3.hasNext() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0187, code lost:
    
        r5 = (androidx.navigation.NavBackStackEntry) r3.next();
        r11.b(r5.f7133b.f7260a).f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0100, code lost:
    
        if (r28.f7267h == r6.f7267h) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d8 A[LOOP:1: B:19:0x01d2->B:21:0x01d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(final androidx.navigation.c r28, android.os.Bundle r29, androidx.navigation.g r30) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.k(androidx.navigation.c, android.os.Bundle, androidx.navigation.g):void");
    }

    public final boolean l() {
        P9.h<NavBackStackEntry> hVar = this.f7162g;
        if (hVar.isEmpty()) {
            return false;
        }
        NavBackStackEntry m2 = hVar.m();
        return m((m2 != null ? m2.f7133b : null).f7267h, true);
    }

    public final boolean m(int i, boolean z10) {
        return n(i, z10, false) && b();
    }

    public final boolean n(int i, boolean z10, boolean z11) {
        c cVar;
        P9.h<NavBackStackEntry> hVar = this.f7162g;
        if (hVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = s.W(hVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = ((NavBackStackEntry) it.next()).f7133b;
            Navigator b9 = this.f7177w.b(cVar.f7260a);
            if (z10 || cVar.f7267h != i) {
                arrayList.add(b9);
            }
            if (cVar.f7267h == i) {
                break;
            }
        }
        if (cVar != null) {
            return c(arrayList, cVar, z10, z11);
        }
        int i9 = c.f7259k;
        Log.i("NavController", "Ignoring popBackStack to destination " + c.a.a(this.f7156a, i) + " as it was not found on the current back stack");
        return false;
    }

    public final boolean o(String str, boolean z10, boolean z11) {
        NavBackStackEntry navBackStackEntry;
        P9.h<NavBackStackEntry> hVar = this.f7162g;
        if (hVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator<NavBackStackEntry> listIterator = hVar.listIterator(hVar.a());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
            c cVar = navBackStackEntry2.f7133b;
            Bundle a10 = navBackStackEntry2.a();
            boolean z12 = true;
            if (!kotlin.jvm.internal.f.b(cVar.i, str)) {
                c.b f10 = cVar.f(str);
                if (kotlin.jvm.internal.f.b(cVar, f10 != null ? f10.f7269a : null)) {
                    if (a10 != null) {
                        Bundle bundle = f10.f7270b;
                        if (bundle != null) {
                            for (String str2 : bundle.keySet()) {
                                if (a10.containsKey(str2)) {
                                    U0.g gVar = (U0.g) f10.f7269a.f7266g.get(str2);
                                    k<Object> kVar = gVar != null ? gVar.f3597a : null;
                                    Object a11 = kVar != null ? kVar.a(str2, bundle) : null;
                                    Object a12 = kVar != null ? kVar.a(str2, a10) : null;
                                    if (kVar == null || kVar.g(a11, a12)) {
                                    }
                                }
                            }
                        }
                    } else {
                        f10.getClass();
                    }
                }
                z12 = false;
                break;
            }
            if (z10 || !z12) {
                arrayList.add(this.f7177w.b(navBackStackEntry2.f7133b.f7260a));
            }
            if (z12) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        c cVar2 = navBackStackEntry3 != null ? navBackStackEntry3.f7133b : null;
        if (cVar2 != null) {
            return c(arrayList, cVar2, z10, z11);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    public final void p(NavBackStackEntry navBackStackEntry, boolean z10, P9.h<NavBackStackEntryState> hVar) {
        androidx.navigation.b bVar;
        W w2;
        StateFlow<Set<NavBackStackEntry>> stateFlow;
        Set<NavBackStackEntry> value;
        P9.h<NavBackStackEntry> hVar2 = this.f7162g;
        NavBackStackEntry k3 = hVar2.k();
        if (!kotlin.jvm.internal.f.b(k3, navBackStackEntry)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.f7133b + ", which is not the top of the back stack (" + k3.f7133b + ')').toString());
        }
        q.B(hVar2);
        NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.f7178x.get(this.f7177w.b(k3.f7133b.f7260a));
        boolean z11 = true;
        if ((navControllerNavigatorState == null || (stateFlow = navControllerNavigatorState.f3630f) == null || (value = stateFlow.getValue()) == null || !value.contains(k3)) && !this.f7167m.containsKey(k3)) {
            z11 = false;
        }
        Lifecycle.State state = k3.f7139h.f7098d;
        Lifecycle.State state2 = Lifecycle.State.f6977c;
        if (state.a(state2)) {
            if (z10) {
                k3.b(state2);
                hVar.addFirst(new NavBackStackEntryState(k3));
            }
            if (z11) {
                k3.b(state2);
            } else {
                k3.b(Lifecycle.State.f6975a);
                u(k3);
            }
        }
        if (z10 || z11 || (bVar = this.f7171q) == null || (w2 = (W) bVar.f7258k.remove(k3.f7137f)) == null) {
            return;
        }
        w2.a();
    }

    public final ArrayList r() {
        Lifecycle.State state;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7178x.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            state = Lifecycle.State.f6978d;
            if (!hasNext) {
                break;
            }
            Set<NavBackStackEntry> value = ((NavControllerNavigatorState) it.next()).f3630f.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.f7141k.a(state)) {
                    arrayList2.add(obj);
                }
            }
            q.x(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<NavBackStackEntry> it2 = this.f7162g.iterator();
        while (it2.hasNext()) {
            NavBackStackEntry next = it2.next();
            NavBackStackEntry navBackStackEntry2 = next;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.f7141k.a(state)) {
                arrayList3.add(next);
            }
        }
        q.x(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((NavBackStackEntry) next2).f7133b instanceof d)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean s(int i, final Bundle bundle, g gVar) {
        c cVar;
        NavBackStackEntry navBackStackEntry;
        c cVar2;
        Bundle bundle2;
        LinkedHashMap linkedHashMap = this.f7168n;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        final String str = (String) linkedHashMap.get(Integer.valueOf(i));
        q.y(linkedHashMap.values(), new InterfaceC0646l<String, Boolean>() { // from class: androidx.navigation.NavController$restoreStateInternal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final Boolean invoke(String str2) {
                return Boolean.valueOf(kotlin.jvm.internal.f.b(str2, str));
            }
        }, true);
        LinkedHashMap linkedHashMap2 = this.f7169o;
        kotlin.jvm.internal.j.b(linkedHashMap2);
        P9.h hVar = (P9.h) linkedHashMap2.remove(str);
        final ArrayList arrayList = new ArrayList();
        NavBackStackEntry m2 = this.f7162g.m();
        if ((m2 == null || (cVar = m2.f7133b) == null) && (cVar = this.f7158c) == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        if (hVar != null) {
            Iterator<E> it = hVar.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                c e10 = e(navBackStackEntryState.f7147b, cVar, null, true);
                Context context = this.f7156a;
                if (e10 == null) {
                    int i9 = c.f7259k;
                    throw new IllegalStateException(("Restore State failed: destination " + c.a.a(context, navBackStackEntryState.f7147b) + " cannot be found from the current destination " + cVar).toString());
                }
                Lifecycle.State g10 = g();
                androidx.navigation.b bVar = this.f7171q;
                Bundle bundle3 = navBackStackEntryState.f7148c;
                if (bundle3 != null) {
                    bundle3.setClassLoader(context.getClassLoader());
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new NavBackStackEntry(context, e10, bundle2, g10, bVar, navBackStackEntryState.f7146a, navBackStackEntryState.f7149d));
                cVar = e10;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((NavBackStackEntry) next).f7133b instanceof d)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it3.next();
            List list = (List) s.R(arrayList2);
            if (kotlin.jvm.internal.f.b((list == null || (navBackStackEntry = (NavBackStackEntry) s.Q(list)) == null || (cVar2 = navBackStackEntry.f7133b) == null) ? null : cVar2.f7260a, navBackStackEntry2.f7133b.f7260a)) {
                list.add(navBackStackEntry2);
            } else {
                arrayList2.add(P9.m.r(navBackStackEntry2));
            }
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            Navigator b9 = this.f7177w.b(((NavBackStackEntry) s.J(list2)).f7133b.f7260a);
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            this.f7179y = new InterfaceC0646l<NavBackStackEntry, p>() { // from class: androidx.navigation.NavController$executeRestoreState$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // ca.InterfaceC0646l
                public final p invoke(NavBackStackEntry navBackStackEntry3) {
                    List<NavBackStackEntry> list3;
                    NavBackStackEntry navBackStackEntry4 = navBackStackEntry3;
                    Ref$BooleanRef.this.f23175a = true;
                    List<NavBackStackEntry> list4 = arrayList;
                    int indexOf = list4.indexOf(navBackStackEntry4);
                    if (indexOf != -1) {
                        Ref$IntRef ref$IntRef2 = ref$IntRef;
                        int i10 = indexOf + 1;
                        list3 = list4.subList(ref$IntRef2.f23177a, i10);
                        ref$IntRef2.f23177a = i10;
                    } else {
                        list3 = EmptyList.f23104a;
                    }
                    this.a(navBackStackEntry4.f7133b, bundle, navBackStackEntry4, list3);
                    return p.f3034a;
                }
            };
            b9.d(list2, gVar);
            this.f7179y = null;
        }
        return ref$BooleanRef.f23175a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(androidx.navigation.d r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.t(androidx.navigation.d, android.os.Bundle):void");
    }

    public final void u(NavBackStackEntry navBackStackEntry) {
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.f7166l.remove(navBackStackEntry);
        if (navBackStackEntry2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f7167m;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(navBackStackEntry2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.f7178x.get(this.f7177w.b(navBackStackEntry2.f7133b.f7260a));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.b(navBackStackEntry2);
            }
            linkedHashMap.remove(navBackStackEntry2);
        }
    }

    public final void v() {
        AtomicInteger atomicInteger;
        StateFlow<Set<NavBackStackEntry>> stateFlow;
        Set<NavBackStackEntry> value;
        ArrayList arrayList = new ArrayList(this.f7162g);
        if (arrayList.isEmpty()) {
            return;
        }
        c cVar = ((NavBackStackEntry) s.Q(arrayList)).f7133b;
        ArrayList arrayList2 = new ArrayList();
        if (cVar instanceof U0.c) {
            Iterator it = s.W(arrayList).iterator();
            while (it.hasNext()) {
                c cVar2 = ((NavBackStackEntry) it.next()).f7133b;
                arrayList2.add(cVar2);
                if (!(cVar2 instanceof U0.c) && !(cVar2 instanceof d)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (NavBackStackEntry navBackStackEntry : s.W(arrayList)) {
            Lifecycle.State state = navBackStackEntry.f7141k;
            c cVar3 = navBackStackEntry.f7133b;
            Lifecycle.State state2 = Lifecycle.State.f6979e;
            Lifecycle.State state3 = Lifecycle.State.f6978d;
            if (cVar != null && cVar3.f7267h == cVar.f7267h) {
                if (state != state2) {
                    NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.f7178x.get(this.f7177w.b(cVar3.f7260a));
                    if (kotlin.jvm.internal.f.b((navControllerNavigatorState == null || (stateFlow = navControllerNavigatorState.f3630f) == null || (value = stateFlow.getValue()) == null) ? null : Boolean.valueOf(value.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f7167m.get(navBackStackEntry)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(navBackStackEntry, state3);
                    } else {
                        hashMap.put(navBackStackEntry, state2);
                    }
                }
                c cVar4 = (c) s.L(arrayList2);
                if (cVar4 != null && cVar4.f7267h == cVar3.f7267h) {
                    q.A(arrayList2);
                }
                cVar = cVar.f7261b;
            } else if ((!arrayList2.isEmpty()) && cVar3.f7267h == ((c) s.J(arrayList2)).f7267h) {
                c cVar5 = (c) q.A(arrayList2);
                if (state == state2) {
                    navBackStackEntry.b(state3);
                } else if (state != state3) {
                    hashMap.put(navBackStackEntry, state3);
                }
                d dVar = cVar5.f7261b;
                if (dVar != null && !arrayList2.contains(dVar)) {
                    arrayList2.add(dVar);
                }
            } else {
                navBackStackEntry.b(Lifecycle.State.f6977c);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it2.next();
            Lifecycle.State state4 = (Lifecycle.State) hashMap.get(navBackStackEntry2);
            if (state4 != null) {
                navBackStackEntry2.b(state4);
            } else {
                navBackStackEntry2.c();
            }
        }
    }

    public final void w() {
        boolean z10 = false;
        if (this.f7176v) {
            P9.h<NavBackStackEntry> hVar = this.f7162g;
            if (!(hVar instanceof Collection) || !hVar.isEmpty()) {
                Iterator<NavBackStackEntry> it = hVar.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if ((!(it.next().f7133b instanceof d)) && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
                if (i > 1) {
                    z10 = true;
                }
            }
        }
        this.f7175u.e(z10);
    }
}
