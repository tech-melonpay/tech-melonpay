package androidx.navigation;

import C.v;
import O9.p;
import P9.s;
import U0.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.j;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.C0969n;

/* compiled from: NavDestination.kt */
/* loaded from: classes.dex */
public class c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f7259k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f7260a;

    /* renamed from: b, reason: collision with root package name */
    public d f7261b;

    /* renamed from: c, reason: collision with root package name */
    public String f7262c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f7263d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7264e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.collection.h<U0.d> f7265f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f7266g;

    /* renamed from: h, reason: collision with root package name */
    public int f7267h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public O9.f<NavDeepLink> f7268j;

    /* compiled from: NavDestination.kt */
    public static final class a {
        public static String a(Context context, int i) {
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                return context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i);
            }
        }
    }

    /* compiled from: NavDestination.kt */
    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final c f7269a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f7270b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7271c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7272d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f7273e;

        /* renamed from: f, reason: collision with root package name */
        public final int f7274f;

        public b(c cVar, Bundle bundle, boolean z10, int i, boolean z11, int i9) {
            this.f7269a = cVar;
            this.f7270b = bundle;
            this.f7271c = z10;
            this.f7272d = i;
            this.f7273e = z11;
            this.f7274f = i9;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            boolean z10 = bVar.f7271c;
            boolean z11 = this.f7271c;
            if (z11 && !z10) {
                return 1;
            }
            if (!z11 && z10) {
                return -1;
            }
            int i = this.f7272d - bVar.f7272d;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = bVar.f7270b;
            Bundle bundle2 = this.f7270b;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size() - bundle.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z12 = bVar.f7273e;
            boolean z13 = this.f7273e;
            if (z13 && !z12) {
                return 1;
            }
            if (z13 || !z12) {
                return this.f7274f - bVar.f7274f;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public c(Navigator<? extends c> navigator) {
        LinkedHashMap linkedHashMap = j.f7330b;
        this.f7260a = j.a.a(navigator.getClass());
        this.f7264e = new ArrayList();
        this.f7265f = new androidx.collection.h<>(0);
        this.f7266g = new LinkedHashMap();
    }

    public final Bundle a(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f7266g;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            U0.g gVar = (U0.g) entry.getValue();
            if (gVar.f3599c && (obj = gVar.f3601e) != null) {
                gVar.f3597a.e(bundle2, str, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                U0.g gVar2 = (U0.g) entry2.getValue();
                if (!gVar2.f3600d) {
                    boolean z10 = gVar2.f3598b;
                    k<Object> kVar = gVar2.f3597a;
                    if (z10 || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                        try {
                            kVar.a(str2, bundle2);
                        } catch (ClassCastException unused) {
                        }
                    }
                    StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Wrong argument type for '", str2, "' in argument bundle. ");
                    m2.append(kVar.b());
                    m2.append(" expected.");
                    throw new IllegalArgumentException(m2.toString().toString());
                }
            }
        }
        return bundle2;
    }

    public final U0.d c(int i) {
        androidx.collection.h<U0.d> hVar = this.f7265f;
        U0.d c2 = hVar.f() == 0 ? null : hVar.c(i);
        if (c2 != null) {
            return c2;
        }
        d dVar = this.f7261b;
        if (dVar != null) {
            return dVar.c(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.navigation.c.b e(Fa.h r18) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.c.e(Fa.h):androidx.navigation.c$b");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lb3
            boolean r2 = r9 instanceof androidx.navigation.c
            if (r2 != 0) goto Ld
            goto Lb3
        Ld:
            java.util.ArrayList r2 = r8.f7264e
            androidx.navigation.c r9 = (androidx.navigation.c) r9
            java.util.ArrayList r3 = r9.f7264e
            boolean r2 = kotlin.jvm.internal.f.b(r2, r3)
            androidx.collection.h<U0.d> r3 = r8.f7265f
            int r4 = r3.f()
            androidx.collection.h<U0.d> r5 = r9.f7265f
            int r6 = r5.f()
            if (r4 != r6) goto L55
            androidx.collection.i r4 = new androidx.collection.i
            r4.<init>(r3)
            ja.h r4 = ja.l.b(r4)
            ja.a r4 = (ja.C0911a) r4
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r3.c(r6)
            java.lang.Object r6 = r5.c(r6)
            boolean r6 = kotlin.jvm.internal.f.b(r7, r6)
            if (r6 != 0) goto L34
            goto L55
        L53:
            r3 = r0
            goto L56
        L55:
            r3 = r1
        L56:
            java.util.LinkedHashMap r4 = r8.f7266g
            int r5 = r4.size()
            java.util.LinkedHashMap r6 = r9.f7266g
            int r7 = r6.size()
            if (r5 != r7) goto L99
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L6e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L97
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            boolean r7 = r6.containsKey(r7)
            if (r7 == 0) goto L99
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r7 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.f.b(r7, r5)
            if (r5 == 0) goto L99
            goto L6e
        L97:
            r4 = r0
            goto L9a
        L99:
            r4 = r1
        L9a:
            int r5 = r8.f7267h
            int r6 = r9.f7267h
            if (r5 != r6) goto Lb1
            java.lang.String r5 = r8.i
            java.lang.String r9 = r9.i
            boolean r9 = kotlin.jvm.internal.f.b(r5, r9)
            if (r9 == 0) goto Lb1
            if (r2 == 0) goto Lb1
            if (r3 == 0) goto Lb1
            if (r4 == 0) goto Lb1
            goto Lb2
        Lb1:
            r0 = r1
        Lb2:
            return r0
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.c.equals(java.lang.Object):boolean");
    }

    public final b f(String str) {
        NavDeepLink value;
        int size;
        O9.f<NavDeepLink> fVar = this.f7268j;
        if (fVar == null || (value = fVar.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse(str != null ? "android-app://androidx.navigation/".concat(str) : "");
        Bundle c2 = value.c(parse, this.f7266g);
        if (c2 == null) {
            return null;
        }
        String str2 = value.f7216a;
        if (str2 == null) {
            size = 0;
        } else {
            List<String> pathSegments = parse.getPathSegments();
            List<String> pathSegments2 = Uri.parse(str2).getPathSegments();
            Set f02 = s.f0(pathSegments);
            if (!(pathSegments2 instanceof Collection)) {
                pathSegments2 = s.c0(pathSegments2);
            }
            f02.retainAll(pathSegments2);
            size = f02.size();
        }
        return new b(this, c2, value.f7230p, size, false, -1);
    }

    public void g(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, V0.a.f3718e);
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.f7267h = 0;
            this.f7262c = null;
        } else {
            if (!(!C0969n.i0(string))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            final String concat = "android-app://androidx.navigation/".concat(string);
            final NavDeepLink navDeepLink = new NavDeepLink(concat, null, null);
            ArrayList q10 = Ja.a.q(this.f7266g, new InterfaceC0646l<String, Boolean>() { // from class: androidx.navigation.NavDestination$route$missingRequiredArguments$1
                {
                    super(1);
                }

                @Override // ca.InterfaceC0646l
                public final Boolean invoke(String str) {
                    return Boolean.valueOf(!NavDeepLink.this.b().contains(str));
                }
            });
            if (!q10.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + string + "\" for destination " + this + ". Following required arguments are missing: " + q10).toString());
            }
            this.f7268j = kotlin.a.a(new InterfaceC0635a<NavDeepLink>() { // from class: androidx.navigation.NavDestination$route$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // ca.InterfaceC0635a
                public final NavDeepLink invoke() {
                    return new NavDeepLink(concat, null, null);
                }
            });
            this.f7267h = concat.hashCode();
            this.f7262c = null;
        }
        this.i = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.f7267h = resourceId;
            this.f7262c = null;
            this.f7262c = a.a(context, resourceId);
        }
        this.f7263d = obtainAttributes.getText(0);
        p pVar = p.f3034a;
        obtainAttributes.recycle();
    }

    public int hashCode() {
        Set<String> keySet;
        int i = this.f7267h * 31;
        String str = this.i;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        Iterator it = this.f7264e.iterator();
        while (it.hasNext()) {
            NavDeepLink navDeepLink = (NavDeepLink) it.next();
            int i9 = hashCode * 31;
            String str2 = navDeepLink.f7216a;
            int hashCode2 = (i9 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = navDeepLink.f7217b;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = navDeepLink.f7218c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        int i10 = 0;
        while (true) {
            androidx.collection.h<U0.d> hVar = this.f7265f;
            if (i10 >= hVar.f()) {
                break;
            }
            int i11 = i10 + 1;
            U0.d g10 = hVar.g(i10);
            int i12 = ((hashCode * 31) + g10.f3592a) * 31;
            g gVar = g10.f3593b;
            hashCode = i12 + (gVar != null ? gVar.hashCode() : 0);
            Bundle bundle = g10.f3594c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                Iterator<T> it2 = keySet.iterator();
                while (it2.hasNext()) {
                    int i13 = hashCode * 31;
                    Object obj = g10.f3594c.get((String) it2.next());
                    hashCode = i13 + (obj != null ? obj.hashCode() : 0);
                }
            }
            i10 = i11;
        }
        LinkedHashMap linkedHashMap = this.f7266g;
        for (String str5 : linkedHashMap.keySet()) {
            int c2 = v.c(hashCode * 31, 31, str5);
            Object obj2 = linkedHashMap.get(str5);
            hashCode = c2 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f7262c;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f7267h));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.i;
        if (str2 != null && !C0969n.i0(str2)) {
            sb2.append(" route=");
            sb2.append(this.i);
        }
        if (this.f7263d != null) {
            sb2.append(" label=");
            sb2.append(this.f7263d);
        }
        return sb2.toString();
    }
}
