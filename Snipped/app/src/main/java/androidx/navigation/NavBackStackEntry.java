package androidx.navigation;

import U0.l;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.C0553t;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.r;
import androidx.navigation.NavBackStackEntry;
import b1.C0582b;
import b1.C0583c;
import b1.InterfaceC0584d;
import ca.InterfaceC0635a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

/* compiled from: NavBackStackEntry.kt */
/* loaded from: classes.dex */
public final class NavBackStackEntry implements r, X, InterfaceC0543i, InterfaceC0584d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7132a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.navigation.c f7133b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f7134c;

    /* renamed from: d, reason: collision with root package name */
    public Lifecycle.State f7135d;

    /* renamed from: e, reason: collision with root package name */
    public final l f7136e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7137f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f7138g;

    /* renamed from: h, reason: collision with root package name */
    public final C0553t f7139h = new C0553t(this);
    public final C0583c i = new C0583c(this);

    /* renamed from: j, reason: collision with root package name */
    public boolean f7140j;

    /* renamed from: k, reason: collision with root package name */
    public Lifecycle.State f7141k;

    /* renamed from: l, reason: collision with root package name */
    public final L f7142l;

    /* compiled from: NavBackStackEntry.kt */
    public static final class a {
        public static NavBackStackEntry a(Context context, androidx.navigation.c cVar, Bundle bundle, Lifecycle.State state, androidx.navigation.b bVar) {
            return new NavBackStackEntry(context, cVar, bundle, state, bVar, UUID.randomUUID().toString(), null);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    public static final class b extends AbstractC0535a {
        @Override // androidx.lifecycle.AbstractC0535a
        public final <T extends Q> T create(String str, Class<T> cls, G g10) {
            return new c(g10);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    public static final class c extends Q {

        /* renamed from: k, reason: collision with root package name */
        public final G f7143k;

        public c(G g10) {
            this.f7143k = g10;
        }
    }

    public NavBackStackEntry(Context context, androidx.navigation.c cVar, Bundle bundle, Lifecycle.State state, l lVar, String str, Bundle bundle2) {
        this.f7132a = context;
        this.f7133b = cVar;
        this.f7134c = bundle;
        this.f7135d = state;
        this.f7136e = lVar;
        this.f7137f = str;
        this.f7138g = bundle2;
        O9.f a10 = kotlin.a.a(new InterfaceC0635a<L>() { // from class: androidx.navigation.NavBackStackEntry$defaultFactory$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final L invoke() {
                NavBackStackEntry navBackStackEntry = NavBackStackEntry.this;
                Context context2 = navBackStackEntry.f7132a;
                Context applicationContext = context2 != null ? context2.getApplicationContext() : null;
                return new L(applicationContext instanceof Application ? (Application) applicationContext : null, navBackStackEntry, navBackStackEntry.a());
            }
        });
        new InterfaceC0635a<G>() { // from class: androidx.navigation.NavBackStackEntry$savedStateHandle$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final G invoke() {
                NavBackStackEntry navBackStackEntry = NavBackStackEntry.this;
                if (!navBackStackEntry.f7140j) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
                }
                if (navBackStackEntry.f7139h.f7098d == Lifecycle.State.f6975a) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
                }
                R0.e eVar = new R0.e(navBackStackEntry.getViewModelStore(), new NavBackStackEntry.b(navBackStackEntry, null), navBackStackEntry.getDefaultViewModelCreationExtras());
                kotlin.jvm.internal.b a11 = kotlin.jvm.internal.h.a(NavBackStackEntry.c.class);
                String b9 = a11.b();
                if (b9 != null) {
                    return ((NavBackStackEntry.c) eVar.a(a11, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b9))).f7143k;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
            }
        };
        this.f7141k = Lifecycle.State.f6976b;
        this.f7142l = (L) a10.getValue();
    }

    public final Bundle a() {
        Bundle bundle = this.f7134c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b(Lifecycle.State state) {
        this.f7141k = state;
        c();
    }

    public final void c() {
        if (!this.f7140j) {
            C0583c c0583c = this.i;
            c0583c.a();
            this.f7140j = true;
            if (this.f7136e != null) {
                J.b(this);
            }
            c0583c.b(this.f7138g);
        }
        int ordinal = this.f7135d.ordinal();
        int ordinal2 = this.f7141k.ordinal();
        C0553t c0553t = this.f7139h;
        if (ordinal < ordinal2) {
            c0553t.h(this.f7135d);
        } else {
            c0553t.h(this.f7141k);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof NavBackStackEntry)) {
            return false;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (!kotlin.jvm.internal.f.b(this.f7137f, navBackStackEntry.f7137f) || !kotlin.jvm.internal.f.b(this.f7133b, navBackStackEntry.f7133b) || !kotlin.jvm.internal.f.b(this.f7139h, navBackStackEntry.f7139h) || !kotlin.jvm.internal.f.b(this.i.f8286b, navBackStackEntry.i.f8286b)) {
            return false;
        }
        Bundle bundle = this.f7134c;
        Bundle bundle2 = navBackStackEntry.f7134c;
        if (!kotlin.jvm.internal.f.b(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (!kotlin.jvm.internal.f.b(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.InterfaceC0543i
    public final R0.a getDefaultViewModelCreationExtras() {
        R0.c cVar = new R0.c(0);
        Context context = this.f7132a;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            cVar.b(S.f7046d, application);
        }
        cVar.b(J.f6965a, this);
        cVar.b(J.f6966b, this);
        Bundle a10 = a();
        if (a10 != null) {
            cVar.b(J.f6967c, a10);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.InterfaceC0543i
    public final T getDefaultViewModelProviderFactory() {
        return this.f7142l;
    }

    @Override // androidx.lifecycle.r
    public final Lifecycle getLifecycle() {
        return this.f7139h;
    }

    @Override // b1.InterfaceC0584d
    public final C0582b getSavedStateRegistry() {
        return this.i.f8286b;
    }

    @Override // androidx.lifecycle.X
    public final W getViewModelStore() {
        if (!this.f7140j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (this.f7139h.f7098d == Lifecycle.State.f6975a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        l lVar = this.f7136e;
        if (lVar != null) {
            return lVar.g(this.f7137f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f7133b.hashCode() + (this.f7137f.hashCode() * 31);
        Bundle bundle = this.f7134c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.i.f8286b.hashCode() + ((this.f7139h.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(NavBackStackEntry.class.getSimpleName());
        sb2.append("(" + this.f7137f + ')');
        sb2.append(" destination=");
        sb2.append(this.f7133b);
        return sb2.toString();
    }
}
