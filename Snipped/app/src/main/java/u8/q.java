package U8;

import U8.i;
import f9.C0753a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: RegistryImpl.java */
/* loaded from: classes2.dex */
public final class q implements i.a {

    /* renamed from: a, reason: collision with root package name */
    public final List<i> f3705a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3706b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f3707c = new HashSet(3);

    public q(ArrayList arrayList) {
        this.f3705a = arrayList;
        this.f3706b = new ArrayList(arrayList.size());
    }

    public static i b(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (cls.isAssignableFrom(iVar.getClass())) {
                return iVar;
            }
        }
        return null;
    }

    public final void a(i iVar) {
        ArrayList arrayList = this.f3706b;
        if (arrayList.contains(iVar)) {
            return;
        }
        HashSet hashSet = this.f3707c;
        if (hashSet.contains(iVar)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
        }
        hashSet.add(iVar);
        iVar.configure(this);
        hashSet.remove(iVar);
        if (arrayList.contains(iVar)) {
            return;
        }
        if (V8.o.class.isAssignableFrom(iVar.getClass())) {
            arrayList.add(0, iVar);
        } else {
            arrayList.add(iVar);
        }
    }

    public final void c(C0753a.C0400a c0400a) {
        i b9 = b(V8.o.class, this.f3706b);
        if (b9 == null) {
            List<i> list = this.f3705a;
            i b10 = b(V8.o.class, list);
            if (b10 == null) {
                throw new IllegalStateException("Requested plugin is not added: " + V8.o.class.getName() + ", plugins: " + list);
            }
            a(b10);
            b9 = b10;
        }
        c0400a.a(b9);
    }
}
