package androidx.navigation;

import android.os.Bundle;
import androidx.camera.core.n;
import androidx.navigation.Navigator;
import androidx.navigation.c;
import ca.InterfaceC0646l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: NavGraphNavigator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/e;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/d;", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@Navigator.b("navigation")
/* loaded from: classes.dex */
public class e extends Navigator<d> {

    /* renamed from: c, reason: collision with root package name */
    public final j f7283c;

    public e(j jVar) {
        this.f7283c = jVar;
    }

    @Override // androidx.navigation.Navigator
    public final d a() {
        return new d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, android.os.Bundle] */
    @Override // androidx.navigation.Navigator
    public final void d(List list, g gVar) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            d dVar = (d) navBackStackEntry.f7133b;
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f23179a = navBackStackEntry.a();
            int i = dVar.f7277m;
            String str2 = dVar.f7279o;
            if (i == 0 && str2 == null) {
                StringBuilder sb2 = new StringBuilder("no start destination defined via app:startDestination for ");
                int i9 = dVar.f7267h;
                if (i9 != 0) {
                    str = dVar.f7262c;
                    if (str == null) {
                        str = String.valueOf(i9);
                    }
                } else {
                    str = "the root navigation";
                }
                sb2.append(str);
                throw new IllegalStateException(sb2.toString().toString());
            }
            c i10 = str2 != null ? dVar.i(str2, false) : dVar.f7276l.c(i);
            if (i10 == null) {
                if (dVar.f7278n == null) {
                    String str3 = dVar.f7279o;
                    if (str3 == null) {
                        str3 = String.valueOf(dVar.f7277m);
                    }
                    dVar.f7278n = str3;
                }
                throw new IllegalArgumentException(n.a("navigation destination ", dVar.f7278n, " is not a direct child of this NavGraph"));
            }
            if (str2 != null) {
                if (!kotlin.jvm.internal.f.b(str2, i10.i)) {
                    c.b f10 = i10.f(str2);
                    Bundle bundle = f10 != null ? f10.f7270b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        ?? bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) ref$ObjectRef.f23179a;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        ref$ObjectRef.f23179a = bundle2;
                    }
                }
                LinkedHashMap linkedHashMap = i10.f7266g;
                if (!kotlin.collections.a.w(linkedHashMap).isEmpty()) {
                    ArrayList q10 = Ja.a.q(kotlin.collections.a.w(linkedHashMap), new InterfaceC0646l<String, Boolean>() { // from class: androidx.navigation.NavGraphNavigator$navigate$missingRequiredArgs$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // ca.InterfaceC0646l
                        public final Boolean invoke(String str4) {
                            String str5 = str4;
                            Bundle bundle4 = ref$ObjectRef.f23179a;
                            boolean z10 = true;
                            if (bundle4 != null && bundle4.containsKey(str5)) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                    });
                    if (!q10.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + i10 + ". Missing required arguments [" + q10 + ']').toString());
                    }
                } else {
                    continue;
                }
            }
            this.f7283c.b(i10.f7260a).d(Collections.singletonList(b().a(i10, i10.a((Bundle) ref$ObjectRef.f23179a))), gVar);
        }
    }
}
