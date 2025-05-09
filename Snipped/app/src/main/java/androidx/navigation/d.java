package androidx.navigation;

import O9.p;
import P9.s;
import P9.v;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.c;
import da.InterfaceC0701a;
import ja.C0911a;
import ja.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ka.C0967l;
import ka.C0969n;

/* compiled from: NavGraph.kt */
/* loaded from: classes.dex */
public final class d extends c implements Iterable<c>, InterfaceC0701a {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f7275p = 0;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.collection.h<c> f7276l;

    /* renamed from: m, reason: collision with root package name */
    public int f7277m;

    /* renamed from: n, reason: collision with root package name */
    public String f7278n;

    /* renamed from: o, reason: collision with root package name */
    public String f7279o;

    /* compiled from: NavGraph.kt */
    public static final class a implements Iterator<c>, InterfaceC0701a {

        /* renamed from: a, reason: collision with root package name */
        public int f7280a = -1;

        /* renamed from: b, reason: collision with root package name */
        public boolean f7281b;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f7280a + 1 < d.this.f7276l.f();
        }

        @Override // java.util.Iterator
        public final c next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f7281b = true;
            androidx.collection.h<c> hVar = d.this.f7276l;
            int i = this.f7280a + 1;
            this.f7280a = i;
            return hVar.g(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f7281b) {
                throw new IllegalStateException("You must call next() before you can remove an element".toString());
            }
            androidx.collection.h<c> hVar = d.this.f7276l;
            hVar.g(this.f7280a).f7261b = null;
            int i = this.f7280a;
            Object[] objArr = hVar.f5901c;
            Object obj = objArr[i];
            Object obj2 = androidx.collection.e.f5898b;
            if (obj != obj2) {
                objArr[i] = obj2;
                hVar.f5899a = true;
            }
            this.f7280a = i - 1;
            this.f7281b = false;
        }
    }

    public d(Navigator<? extends d> navigator) {
        super(navigator);
        this.f7276l = new androidx.collection.h<>(0);
    }

    @Override // androidx.navigation.c
    public final c.b e(Fa.h hVar) {
        return m(hVar, false, this);
    }

    @Override // androidx.navigation.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        if (super.equals(obj)) {
            androidx.collection.h<c> hVar = this.f7276l;
            int f10 = hVar.f();
            d dVar = (d) obj;
            androidx.collection.h<c> hVar2 = dVar.f7276l;
            if (f10 == hVar2.f() && this.f7277m == dVar.f7277m) {
                for (c cVar : l.b(new v(hVar, 1))) {
                    if (!kotlin.jvm.internal.f.b(cVar, hVar2.c(cVar.f7267h))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.navigation.c
    public final void g(Context context, AttributeSet attributeSet) {
        String valueOf;
        super.g(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, V0.a.f3717d);
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId == this.f7267h) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        if (this.f7279o != null) {
            this.f7277m = 0;
            this.f7279o = null;
        }
        this.f7277m = resourceId;
        this.f7278n = null;
        if (resourceId <= 16777215) {
            valueOf = String.valueOf(resourceId);
        } else {
            try {
                valueOf = context.getResources().getResourceName(resourceId);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(resourceId);
            }
        }
        this.f7278n = valueOf;
        p pVar = p.f3034a;
        obtainAttributes.recycle();
    }

    public final void h(c cVar) {
        int i = cVar.f7267h;
        String str = cVar.i;
        if (i == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (this.i != null && !(!kotlin.jvm.internal.f.b(str, r2))) {
            throw new IllegalArgumentException(("Destination " + cVar + " cannot have the same route as graph " + this).toString());
        }
        if (i == this.f7267h) {
            throw new IllegalArgumentException(("Destination " + cVar + " cannot have the same id as graph " + this).toString());
        }
        androidx.collection.h<c> hVar = this.f7276l;
        c c2 = hVar.c(i);
        if (c2 == cVar) {
            return;
        }
        if (cVar.f7261b != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        if (c2 != null) {
            c2.f7261b = null;
        }
        cVar.f7261b = this;
        hVar.e(cVar.f7267h, cVar);
    }

    @Override // androidx.navigation.c
    public final int hashCode() {
        int i = this.f7277m;
        androidx.collection.h<c> hVar = this.f7276l;
        int f10 = hVar.f();
        for (int i9 = 0; i9 < f10; i9++) {
            i = (((i * 31) + hVar.d(i9)) * 31) + hVar.g(i9).hashCode();
        }
        return i;
    }

    public final c i(String str, boolean z10) {
        Object obj;
        d dVar;
        Iterator it = ((C0911a) l.b(new v(this.f7276l, 1))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            c cVar = (c) obj;
            if (C0967l.U(cVar.i, str, false) || cVar.f(str) != null) {
                break;
            }
        }
        c cVar2 = (c) obj;
        if (cVar2 != null) {
            return cVar2;
        }
        if (!z10 || (dVar = this.f7261b) == null || str == null || C0969n.i0(str)) {
            return null;
        }
        return dVar.i(str, true);
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        return new a();
    }

    public final c k(int i, c cVar, c cVar2, boolean z10) {
        androidx.collection.h<c> hVar = this.f7276l;
        c c2 = hVar.c(i);
        if (cVar2 != null) {
            if (kotlin.jvm.internal.f.b(c2, cVar2) && kotlin.jvm.internal.f.b(c2.f7261b, cVar2.f7261b)) {
                return c2;
            }
            c2 = null;
        } else if (c2 != null) {
            return c2;
        }
        if (z10) {
            Iterator it = ((C0911a) l.b(new v(hVar, 1))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    c2 = null;
                    break;
                }
                c cVar3 = (c) it.next();
                c2 = (!(cVar3 instanceof d) || kotlin.jvm.internal.f.b(cVar3, cVar)) ? null : ((d) cVar3).k(i, this, cVar2, true);
                if (c2 != null) {
                    break;
                }
            }
        }
        if (c2 != null) {
            return c2;
        }
        d dVar = this.f7261b;
        if (dVar == null || kotlin.jvm.internal.f.b(dVar, cVar)) {
            return null;
        }
        return this.f7261b.k(i, this, cVar2, z10);
    }

    public final c.b m(Fa.h hVar, boolean z10, c cVar) {
        c.b bVar;
        c.b e10 = super.e(hVar);
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        while (true) {
            if (!aVar.hasNext()) {
                break;
            }
            c cVar2 = (c) aVar.next();
            bVar = kotlin.jvm.internal.f.b(cVar2, cVar) ? null : cVar2.e(hVar);
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        c.b bVar2 = (c.b) s.S(arrayList);
        d dVar = this.f7261b;
        if (dVar != null && z10 && !kotlin.jvm.internal.f.b(dVar, cVar)) {
            bVar = dVar.m(hVar, true, this);
        }
        return (c.b) s.S(P9.l.o(new c.b[]{e10, bVar2, bVar}));
    }

    @Override // androidx.navigation.c
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        String str = this.f7279o;
        c i = (str == null || C0969n.i0(str)) ? null : i(str, true);
        if (i == null) {
            i = k(this.f7277m, this, null, false);
        }
        sb2.append(" startDestination=");
        if (i == null) {
            String str2 = this.f7279o;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = this.f7278n;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f7277m));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(i.toString());
            sb2.append("}");
        }
        return sb2.toString();
    }
}
