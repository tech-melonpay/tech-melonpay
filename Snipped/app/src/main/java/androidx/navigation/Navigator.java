package androidx.navigation;

import O9.p;
import P9.k;
import U0.m;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.Navigator;
import androidx.navigation.c;
import ca.InterfaceC0646l;
import ja.e;
import ja.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;

/* compiled from: Navigator.kt */
/* loaded from: classes.dex */
public abstract class Navigator<D extends c> {

    /* renamed from: a, reason: collision with root package name */
    public m f7251a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7252b;

    /* compiled from: Navigator.kt */
    public interface a {
    }

    /* compiled from: Navigator.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    public abstract D a();

    public final m b() {
        m mVar = this.f7251a;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public void d(List list, final g gVar) {
        e.a aVar = new e.a(new ja.e(new o(new k(list, 1), new InterfaceC0646l<NavBackStackEntry, NavBackStackEntry>() { // from class: androidx.navigation.Navigator$navigate$1

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Navigator.a f7255n = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final NavBackStackEntry invoke(NavBackStackEntry navBackStackEntry) {
                NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                c cVar = navBackStackEntry2.f7133b;
                if (!(cVar instanceof c)) {
                    cVar = null;
                }
                if (cVar == null) {
                    return null;
                }
                Bundle a10 = navBackStackEntry2.a();
                g gVar2 = gVar;
                Navigator.a aVar2 = this.f7255n;
                Navigator<c> navigator = Navigator.this;
                c c2 = navigator.c(cVar, a10, gVar2, aVar2);
                if (c2 == null) {
                    navBackStackEntry2 = null;
                } else if (!kotlin.jvm.internal.f.b(c2, cVar)) {
                    navBackStackEntry2 = navigator.b().a(c2, c2.a(navBackStackEntry2.a()));
                }
                return navBackStackEntry2;
            }
        }), false, new Z3.a(13)));
        while (aVar.hasNext()) {
            b().g((NavBackStackEntry) aVar.next());
        }
    }

    public void e(NavController.NavControllerNavigatorState navControllerNavigatorState) {
        this.f7251a = navControllerNavigatorState;
        this.f7252b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(NavBackStackEntry navBackStackEntry) {
        c cVar = navBackStackEntry.f7133b;
        if (!(cVar instanceof c)) {
            cVar = null;
        }
        if (cVar == null) {
            return;
        }
        c(cVar, null, Ja.a.r(new InterfaceC0646l<h, p>() { // from class: androidx.navigation.Navigator$onLaunchSingleTop$1
            @Override // ca.InterfaceC0646l
            public final p invoke(h hVar) {
                hVar.f7326b = true;
                return p.f3034a;
            }
        }), null);
        b().c(navBackStackEntry);
    }

    public Bundle h() {
        return null;
    }

    public void i(NavBackStackEntry navBackStackEntry, boolean z10) {
        List<NavBackStackEntry> value = b().f3629e.getValue();
        if (!value.contains(navBackStackEntry)) {
            throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + value).toString());
        }
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        NavBackStackEntry navBackStackEntry2 = null;
        while (j()) {
            navBackStackEntry2 = listIterator.previous();
            if (kotlin.jvm.internal.f.b(navBackStackEntry2, navBackStackEntry)) {
                break;
            }
        }
        if (navBackStackEntry2 != null) {
            b().d(navBackStackEntry2, z10);
        }
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public c c(D d10, Bundle bundle, g gVar, a aVar) {
        return d10;
    }
}
